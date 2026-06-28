package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.protocol.HTTP;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.a;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class TileDownloader {
    private boolean compatibilitySocketFactorySet;

    @Deprecated
    public long computeExpirationTime(String str, String str2, long j5) {
        Long i02 = a.a().i0();
        if (i02 != null) {
            return j5 + i02.longValue();
        }
        long g02 = a.a().g0();
        Long httpCacheControlDuration = getHttpCacheControlDuration(str2);
        if (httpCacheControlDuration != null) {
            return j5 + (httpCacheControlDuration.longValue() * 1000) + g02;
        }
        Long httpExpiresTime = getHttpExpiresTime(str);
        if (httpExpiresTime != null) {
            return httpExpiresTime.longValue() + g02;
        }
        return j5 + 604800000 + g02;
    }

    public Drawable downloadTile(long j5, IFilesystemCache iFilesystemCache, OnlineTileSourceBase onlineTileSourceBase) throws CantContinueException {
        return downloadTile(j5, 0, onlineTileSourceBase.getTileURLString(j5), iFilesystemCache, onlineTileSourceBase);
    }

    @Deprecated
    public Long getHttpCacheControlDuration(String str) {
        if (str != null && str.length() > 0) {
            try {
                for (String str2 : str.split(", ")) {
                    if (str2.indexOf("max-age=") == 0) {
                        return Long.valueOf(str2.substring(8));
                    }
                }
                return null;
            } catch (Exception e5) {
                if (a.a().m0()) {
                    Log.d(IMapView.LOGTAG, "Unable to parse cache control tag for tile, server returned " + str, e5);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public Long getHttpExpiresTime(String str) {
        if (str != null && str.length() > 0) {
            try {
                return Long.valueOf(a.a().p().parse(str).getTime());
            } catch (Exception e5) {
                if (a.a().m0()) {
                    Log.d(IMapView.LOGTAG, "Unable to parse expiration tag for tile, server returned " + str, e5);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    /* loaded from: classes4.dex */
    private static class CompatibilitySocketFactory extends SSLSocketFactory {
        SSLSocketFactory sslSocketFactory;

        CompatibilitySocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
        }

        private SSLSocket upgradeTlsAndRemoveSsl(SSLSocket sSLSocket) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (Arrays.binarySearch(supportedProtocols, "TLSv1.2") >= 0) {
                enabledProtocols = new String[]{"TLSv1.2"};
            } else {
                int binarySearch = Arrays.binarySearch(enabledProtocols, "SSLv3");
                if (binarySearch >= 0) {
                    int length = enabledProtocols.length - 1;
                    String[] strArr = new String[length];
                    System.arraycopy(enabledProtocols, 0, strArr, 0, binarySearch);
                    if (length > binarySearch) {
                        System.arraycopy(enabledProtocols, binarySearch + 1, strArr, binarySearch, length - binarySearch);
                    }
                    enabledProtocols = strArr;
                }
            }
            sSLSocket.setEnabledProtocols(enabledProtocols);
            return sSLSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket() throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket());
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.sslSocketFactory.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.sslSocketFactory.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(socket2, str, i5, z4));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i5) throws IOException, UnknownHostException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(str, i5));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i5, InetAddress inetAddress, int i6) throws IOException, UnknownHostException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(str, i5, inetAddress, i6));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(inetAddress, i5));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i6) throws IOException {
            return upgradeTlsAndRemoveSsl((SSLSocket) this.sslSocketFactory.createSocket(inetAddress, i5, inetAddress2, i6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [org.osmdroid.tileprovider.modules.IFilesystemCache] */
    /* JADX WARN: Type inference failed for: r25v0, types: [org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.StringBuilder] */
    public Drawable downloadTile(long j5, int i5, String str, IFilesystemCache iFilesystemCache, OnlineTileSourceBase onlineTileSourceBase) throws CantContinueException {
        Throwable th;
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        HttpURLConnection httpURLConnection;
        ByteArrayInputStream byteArrayInputStream3;
        a.C0650a c0650a;
        Closeable closeable;
        Closeable closeable2;
        ByteArrayInputStream byteArrayInputStream4;
        IOException iOException;
        InputStream inputStream2;
        ByteArrayInputStream byteArrayInputStream5;
        ByteArrayInputStream byteArrayInputStream6;
        UnknownHostException unknownHostException;
        InputStream inputStream3;
        ByteArrayInputStream byteArrayInputStream7;
        ByteArrayInputStream byteArrayInputStream8;
        FileNotFoundException fileNotFoundException;
        InputStream inputStream4;
        ByteArrayInputStream byteArrayInputStream9;
        ByteArrayInputStream byteArrayInputStream10;
        Throwable th2;
        Closeable closeable3;
        Closeable closeable4;
        ?? r12;
        InputStream inputStream5;
        ByteArrayInputStream byteArrayInputStream11;
        InputStream inputStream6;
        ByteArrayInputStream byteArrayInputStream12;
        InputStream inputStream7;
        ByteArrayInputStream byteArrayInputStream13;
        InputStream inputStream8;
        ByteArrayInputStream byteArrayInputStream14;
        ByteArrayInputStream byteArrayInputStream15;
        ByteArrayInputStream byteArrayInputStream16;
        ByteArrayInputStream byteArrayInputStream17;
        ByteArrayInputStream byteArrayInputStream18;
        ByteArrayInputStream byteArrayInputStream19;
        InputStream inputStream9;
        ByteArrayInputStream byteArrayInputStream20;
        InputStream inputStream10;
        ByteArrayInputStream byteArrayInputStream21;
        InputStream inputStream11;
        ByteArrayInputStream byteArrayInputStream22;
        InputStream inputStream12;
        InputStream inputStream13;
        ?? r22;
        ?? r32;
        ?? r13 = i5;
        ?? r23 = str;
        ?? r33 = "https://";
        Object obj = null;
        if (r13 > 3) {
            return null;
        }
        String s5 = onlineTileSourceBase.getTileSourcePolicy().j() ? org.osmdroid.config.a.a().s() : null;
        if (s5 == null) {
            s5 = org.osmdroid.config.a.a().w();
        }
        if (!onlineTileSourceBase.getTileSourcePolicy().d(s5)) {
            Log.e(IMapView.LOGTAG, "Please configure a relevant user agent; current value is: " + s5);
            return null;
        }
        try {
            try {
                if (org.osmdroid.config.a.a().M()) {
                    Log.d(IMapView.LOGTAG, "Downloading Maptile from url: " + r23);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (org.osmdroid.config.a.a().E() != null) {
                        httpURLConnection = (HttpURLConnection) new URL(r23).openConnection(org.osmdroid.config.a.a().E());
                    } else {
                        httpURLConnection = (HttpURLConnection) new URL(r23).openConnection();
                    }
                    try {
                        httpURLConnection.setUseCaches(true);
                        httpURLConnection.setRequestProperty(org.osmdroid.config.a.a().r(), s5);
                        for (Map.Entry<String, String> entry : org.osmdroid.config.a.a().n().entrySet()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() != 200) {
                            int responseCode = httpURLConnection.getResponseCode();
                            if ((responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308) && org.osmdroid.config.a.a().T()) {
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (headerField != null) {
                                    if (headerField.startsWith("/")) {
                                        URL url = new URL(r23);
                                        int port = url.getPort();
                                        boolean startsWith = str.toLowerCase().startsWith("https://");
                                        if (port == -1) {
                                            port = str.toLowerCase().startsWith("http://") ? 80 : 443;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(startsWith ? r33 : "http");
                                        sb.append(url.getHost());
                                        sb.append(":");
                                        sb.append(port);
                                        sb.append(headerField);
                                        headerField = sb.toString();
                                    }
                                    Log.i(IMapView.LOGTAG, "Http redirect for MapTile: " + MapTileIndex.toString(j5) + " HTTP response: " + httpURLConnection.getResponseMessage() + " to url " + headerField);
                                    Drawable downloadTile = downloadTile(j5, r13 + 1, headerField, iFilesystemCache, onlineTileSourceBase);
                                    StreamUtils.closeStream(null);
                                    StreamUtils.closeStream(null);
                                    StreamUtils.closeStream(null);
                                    StreamUtils.closeStream(null);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused) {
                                    }
                                    return downloadTile;
                                }
                            } else {
                                Log.w(IMapView.LOGTAG, "Problem downloading MapTile: " + MapTileIndex.toString(j5) + " HTTP response: " + httpURLConnection.getResponseMessage());
                                if (org.osmdroid.config.a.a().m0()) {
                                    Log.d(IMapView.LOGTAG, r23);
                                }
                                Counters.tileDownloadErrors++;
                                StreamUtils.closeStream(httpURLConnection.getErrorStream());
                                StreamUtils.closeStream(null);
                                StreamUtils.closeStream(null);
                                StreamUtils.closeStream(null);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused2) {
                                }
                                return null;
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField(HTTP.CONTENT_TYPE);
                        if (org.osmdroid.config.a.a().m0()) {
                            Log.d(IMapView.LOGTAG, r23 + " success, mime is " + headerField2);
                        }
                        if (headerField2 != null && !headerField2.toLowerCase().contains("image")) {
                            Log.w(IMapView.LOGTAG, r23 + " success, however the mime type does not appear to be an image " + headerField2);
                        }
                        inputStream13 = httpURLConnection.getInputStream();
                        try {
                            r22 = new ByteArrayOutputStream();
                        } catch (FileNotFoundException e5) {
                            fileNotFoundException = e5;
                            byteArrayInputStream14 = null;
                            inputStream8 = inputStream13;
                            byteArrayInputStream18 = byteArrayInputStream14;
                            inputStream12 = inputStream8;
                            byteArrayInputStream22 = byteArrayInputStream14;
                            byteArrayInputStream3 = byteArrayInputStream18;
                            inputStream4 = inputStream12;
                            byteArrayInputStream9 = byteArrayInputStream22;
                            byteArrayInputStream10 = byteArrayInputStream18;
                            Counters.tileDownloadErrors++;
                            Log.w(IMapView.LOGTAG, "Tile not found: " + MapTileIndex.toString(j5) + " : " + fileNotFoundException);
                            r13 = inputStream4;
                            r23 = byteArrayInputStream9;
                            r33 = byteArrayInputStream10;
                            StreamUtils.closeStream(r13);
                            StreamUtils.closeStream(r33);
                            StreamUtils.closeStream(byteArrayInputStream3);
                            StreamUtils.closeStream(r23);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                            return null;
                        } catch (UnknownHostException e6) {
                            unknownHostException = e6;
                            byteArrayInputStream13 = null;
                            inputStream7 = inputStream13;
                            byteArrayInputStream17 = byteArrayInputStream13;
                            inputStream11 = inputStream7;
                            byteArrayInputStream21 = byteArrayInputStream13;
                            byteArrayInputStream3 = byteArrayInputStream17;
                            inputStream3 = inputStream11;
                            byteArrayInputStream7 = byteArrayInputStream21;
                            byteArrayInputStream8 = byteArrayInputStream17;
                            Log.w(IMapView.LOGTAG, "UnknownHostException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + unknownHostException);
                            Counters.tileDownloadErrors = Counters.tileDownloadErrors + 1;
                            r13 = inputStream3;
                            r23 = byteArrayInputStream7;
                            r33 = byteArrayInputStream8;
                            StreamUtils.closeStream(r13);
                            StreamUtils.closeStream(r33);
                            StreamUtils.closeStream(byteArrayInputStream3);
                            StreamUtils.closeStream(r23);
                            httpURLConnection.disconnect();
                            return null;
                        } catch (IOException e7) {
                            iOException = e7;
                            byteArrayInputStream12 = null;
                            inputStream6 = inputStream13;
                            byteArrayInputStream16 = byteArrayInputStream12;
                            inputStream10 = inputStream6;
                            byteArrayInputStream20 = byteArrayInputStream12;
                            byteArrayInputStream3 = byteArrayInputStream16;
                            inputStream2 = inputStream10;
                            byteArrayInputStream5 = byteArrayInputStream20;
                            byteArrayInputStream6 = byteArrayInputStream16;
                            Counters.tileDownloadErrors++;
                            Log.w(IMapView.LOGTAG, "IOException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + iOException);
                            r13 = inputStream2;
                            r23 = byteArrayInputStream5;
                            r33 = byteArrayInputStream6;
                            StreamUtils.closeStream(r13);
                            StreamUtils.closeStream(r33);
                            StreamUtils.closeStream(byteArrayInputStream3);
                            StreamUtils.closeStream(r23);
                            httpURLConnection.disconnect();
                            return null;
                        } catch (a.C0650a e8) {
                            e = e8;
                            r22 = 0;
                            r32 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayInputStream11 = null;
                            inputStream5 = inputStream13;
                            byteArrayInputStream15 = byteArrayInputStream11;
                            inputStream9 = inputStream5;
                            byteArrayInputStream19 = byteArrayInputStream11;
                            byteArrayInputStream3 = byteArrayInputStream15;
                            inputStream = inputStream9;
                            byteArrayInputStream = byteArrayInputStream19;
                            byteArrayInputStream2 = byteArrayInputStream15;
                            Counters.tileDownloadErrors++;
                            Log.e(IMapView.LOGTAG, "Error downloading MapTile: " + MapTileIndex.toString(j5), th);
                            r13 = inputStream;
                            r23 = byteArrayInputStream;
                            r33 = byteArrayInputStream2;
                            StreamUtils.closeStream(r13);
                            StreamUtils.closeStream(r33);
                            StreamUtils.closeStream(byteArrayInputStream3);
                            StreamUtils.closeStream(r23);
                            httpURLConnection.disconnect();
                            return null;
                        }
                    } catch (FileNotFoundException e9) {
                        fileNotFoundException = e9;
                        inputStream8 = null;
                        byteArrayInputStream14 = null;
                    } catch (UnknownHostException e10) {
                        unknownHostException = e10;
                        inputStream7 = null;
                        byteArrayInputStream13 = null;
                    } catch (IOException e11) {
                        iOException = e11;
                        inputStream6 = null;
                        byteArrayInputStream12 = null;
                    } catch (a.C0650a e12) {
                        c0650a = e12;
                        closeable = null;
                        closeable2 = null;
                        byteArrayInputStream4 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream5 = null;
                        byteArrayInputStream11 = null;
                    }
                    try {
                        r32 = new BufferedOutputStream(r22, 8192);
                        try {
                            long f5 = onlineTileSourceBase.getTileSourcePolicy().f(httpURLConnection, System.currentTimeMillis());
                            StreamUtils.copy(inputStream13, r32);
                            r32.flush();
                            byteArrayInputStream3 = new ByteArrayInputStream(r22.toByteArray());
                            if (iFilesystemCache != 0) {
                                try {
                                    byteArrayInputStream4 = byteArrayInputStream3;
                                } catch (FileNotFoundException e13) {
                                    e = e13;
                                    fileNotFoundException = e;
                                    inputStream4 = inputStream13;
                                    byteArrayInputStream9 = r22;
                                    byteArrayInputStream10 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.w(IMapView.LOGTAG, "Tile not found: " + MapTileIndex.toString(j5) + " : " + fileNotFoundException);
                                    r13 = inputStream4;
                                    r23 = byteArrayInputStream9;
                                    r33 = byteArrayInputStream10;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (UnknownHostException e14) {
                                    e = e14;
                                    unknownHostException = e;
                                    inputStream3 = inputStream13;
                                    byteArrayInputStream7 = r22;
                                    byteArrayInputStream8 = r32;
                                    Log.w(IMapView.LOGTAG, "UnknownHostException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + unknownHostException);
                                    Counters.tileDownloadErrors = Counters.tileDownloadErrors + 1;
                                    r13 = inputStream3;
                                    r23 = byteArrayInputStream7;
                                    r33 = byteArrayInputStream8;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (IOException e15) {
                                    e = e15;
                                    iOException = e;
                                    inputStream2 = inputStream13;
                                    byteArrayInputStream5 = r22;
                                    byteArrayInputStream6 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.w(IMapView.LOGTAG, "IOException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + iOException);
                                    r13 = inputStream2;
                                    r23 = byteArrayInputStream5;
                                    r33 = byteArrayInputStream6;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (a.C0650a e16) {
                                    e = e16;
                                    byteArrayInputStream4 = byteArrayInputStream3;
                                    obj = inputStream13;
                                    c0650a = e;
                                    closeable = r22;
                                    closeable2 = r32;
                                    try {
                                        Counters.countOOM++;
                                        Log.w(IMapView.LOGTAG, "LowMemoryException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + c0650a);
                                        throw new CantContinueException(c0650a);
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        byteArrayInputStream3 = byteArrayInputStream4;
                                        r12 = obj;
                                        closeable4 = closeable;
                                        closeable3 = closeable2;
                                        StreamUtils.closeStream(r12);
                                        StreamUtils.closeStream(closeable3);
                                        StreamUtils.closeStream(byteArrayInputStream3);
                                        StreamUtils.closeStream(closeable4);
                                        try {
                                            httpURLConnection.disconnect();
                                            throw th2;
                                        } catch (Exception unused4) {
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    inputStream = inputStream13;
                                    byteArrayInputStream = r22;
                                    byteArrayInputStream2 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.e(IMapView.LOGTAG, "Error downloading MapTile: " + MapTileIndex.toString(j5), th);
                                    r13 = inputStream;
                                    r23 = byteArrayInputStream;
                                    r33 = byteArrayInputStream2;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                }
                                try {
                                    iFilesystemCache.saveFile(onlineTileSourceBase, j5, byteArrayInputStream4, Long.valueOf(f5));
                                    byteArrayInputStream4.reset();
                                } catch (FileNotFoundException e17) {
                                    e = e17;
                                    byteArrayInputStream3 = byteArrayInputStream4;
                                    fileNotFoundException = e;
                                    inputStream4 = inputStream13;
                                    byteArrayInputStream9 = r22;
                                    byteArrayInputStream10 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.w(IMapView.LOGTAG, "Tile not found: " + MapTileIndex.toString(j5) + " : " + fileNotFoundException);
                                    r13 = inputStream4;
                                    r23 = byteArrayInputStream9;
                                    r33 = byteArrayInputStream10;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (UnknownHostException e18) {
                                    e = e18;
                                    byteArrayInputStream3 = byteArrayInputStream4;
                                    unknownHostException = e;
                                    inputStream3 = inputStream13;
                                    byteArrayInputStream7 = r22;
                                    byteArrayInputStream8 = r32;
                                    Log.w(IMapView.LOGTAG, "UnknownHostException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + unknownHostException);
                                    Counters.tileDownloadErrors = Counters.tileDownloadErrors + 1;
                                    r13 = inputStream3;
                                    r23 = byteArrayInputStream7;
                                    r33 = byteArrayInputStream8;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (IOException e19) {
                                    e = e19;
                                    byteArrayInputStream3 = byteArrayInputStream4;
                                    iOException = e;
                                    inputStream2 = inputStream13;
                                    byteArrayInputStream5 = r22;
                                    byteArrayInputStream6 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.w(IMapView.LOGTAG, "IOException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + iOException);
                                    r13 = inputStream2;
                                    r23 = byteArrayInputStream5;
                                    r33 = byteArrayInputStream6;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (a.C0650a e20) {
                                    e = e20;
                                    obj = inputStream13;
                                    c0650a = e;
                                    closeable = r22;
                                    closeable2 = r32;
                                    Counters.countOOM++;
                                    Log.w(IMapView.LOGTAG, "LowMemoryException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + c0650a);
                                    throw new CantContinueException(c0650a);
                                } catch (Throwable th7) {
                                    th = th7;
                                    byteArrayInputStream3 = byteArrayInputStream4;
                                    inputStream = inputStream13;
                                    byteArrayInputStream = r22;
                                    byteArrayInputStream2 = r32;
                                    Counters.tileDownloadErrors++;
                                    Log.e(IMapView.LOGTAG, "Error downloading MapTile: " + MapTileIndex.toString(j5), th);
                                    r13 = inputStream;
                                    r23 = byteArrayInputStream;
                                    r33 = byteArrayInputStream2;
                                    StreamUtils.closeStream(r13);
                                    StreamUtils.closeStream(r33);
                                    StreamUtils.closeStream(byteArrayInputStream3);
                                    StreamUtils.closeStream(r23);
                                    httpURLConnection.disconnect();
                                    return null;
                                }
                            } else {
                                byteArrayInputStream4 = byteArrayInputStream3;
                            }
                            Drawable drawable = onlineTileSourceBase.getDrawable(byteArrayInputStream4);
                            StreamUtils.closeStream(inputStream13);
                            StreamUtils.closeStream(r32);
                            StreamUtils.closeStream(byteArrayInputStream4);
                            StreamUtils.closeStream(r22);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused5) {
                            }
                            return drawable;
                        } catch (FileNotFoundException e21) {
                            fileNotFoundException = e21;
                            byteArrayInputStream3 = null;
                            inputStream4 = inputStream13;
                            byteArrayInputStream9 = r22;
                            byteArrayInputStream10 = r32;
                        } catch (UnknownHostException e22) {
                            unknownHostException = e22;
                            byteArrayInputStream3 = null;
                            inputStream3 = inputStream13;
                            byteArrayInputStream7 = r22;
                            byteArrayInputStream8 = r32;
                        } catch (IOException e23) {
                            iOException = e23;
                            byteArrayInputStream3 = null;
                            inputStream2 = inputStream13;
                            byteArrayInputStream5 = r22;
                            byteArrayInputStream6 = r32;
                        } catch (a.C0650a e24) {
                            e = e24;
                            byteArrayInputStream4 = null;
                        } catch (Throwable th8) {
                            th = th8;
                            byteArrayInputStream3 = null;
                            inputStream = inputStream13;
                            byteArrayInputStream = r22;
                            byteArrayInputStream2 = r32;
                        }
                    } catch (FileNotFoundException e25) {
                        fileNotFoundException = e25;
                        byteArrayInputStream18 = null;
                        inputStream12 = inputStream13;
                        byteArrayInputStream22 = r22;
                        byteArrayInputStream3 = byteArrayInputStream18;
                        inputStream4 = inputStream12;
                        byteArrayInputStream9 = byteArrayInputStream22;
                        byteArrayInputStream10 = byteArrayInputStream18;
                        Counters.tileDownloadErrors++;
                        Log.w(IMapView.LOGTAG, "Tile not found: " + MapTileIndex.toString(j5) + " : " + fileNotFoundException);
                        r13 = inputStream4;
                        r23 = byteArrayInputStream9;
                        r33 = byteArrayInputStream10;
                        StreamUtils.closeStream(r13);
                        StreamUtils.closeStream(r33);
                        StreamUtils.closeStream(byteArrayInputStream3);
                        StreamUtils.closeStream(r23);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (UnknownHostException e26) {
                        unknownHostException = e26;
                        byteArrayInputStream17 = null;
                        inputStream11 = inputStream13;
                        byteArrayInputStream21 = r22;
                        byteArrayInputStream3 = byteArrayInputStream17;
                        inputStream3 = inputStream11;
                        byteArrayInputStream7 = byteArrayInputStream21;
                        byteArrayInputStream8 = byteArrayInputStream17;
                        Log.w(IMapView.LOGTAG, "UnknownHostException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + unknownHostException);
                        Counters.tileDownloadErrors = Counters.tileDownloadErrors + 1;
                        r13 = inputStream3;
                        r23 = byteArrayInputStream7;
                        r33 = byteArrayInputStream8;
                        StreamUtils.closeStream(r13);
                        StreamUtils.closeStream(r33);
                        StreamUtils.closeStream(byteArrayInputStream3);
                        StreamUtils.closeStream(r23);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (IOException e27) {
                        iOException = e27;
                        byteArrayInputStream16 = null;
                        inputStream10 = inputStream13;
                        byteArrayInputStream20 = r22;
                        byteArrayInputStream3 = byteArrayInputStream16;
                        inputStream2 = inputStream10;
                        byteArrayInputStream5 = byteArrayInputStream20;
                        byteArrayInputStream6 = byteArrayInputStream16;
                        Counters.tileDownloadErrors++;
                        Log.w(IMapView.LOGTAG, "IOException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + iOException);
                        r13 = inputStream2;
                        r23 = byteArrayInputStream5;
                        r33 = byteArrayInputStream6;
                        StreamUtils.closeStream(r13);
                        StreamUtils.closeStream(r33);
                        StreamUtils.closeStream(byteArrayInputStream3);
                        StreamUtils.closeStream(r23);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (a.C0650a e28) {
                        e = e28;
                        r32 = 0;
                        r22 = r22;
                        byteArrayInputStream4 = r32;
                        obj = inputStream13;
                        c0650a = e;
                        closeable = r22;
                        closeable2 = r32;
                        Counters.countOOM++;
                        Log.w(IMapView.LOGTAG, "LowMemoryException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + c0650a);
                        throw new CantContinueException(c0650a);
                    } catch (Throwable th9) {
                        th = th9;
                        byteArrayInputStream15 = null;
                        inputStream9 = inputStream13;
                        byteArrayInputStream19 = r22;
                        byteArrayInputStream3 = byteArrayInputStream15;
                        inputStream = inputStream9;
                        byteArrayInputStream = byteArrayInputStream19;
                        byteArrayInputStream2 = byteArrayInputStream15;
                        Counters.tileDownloadErrors++;
                        Log.e(IMapView.LOGTAG, "Error downloading MapTile: " + MapTileIndex.toString(j5), th);
                        r13 = inputStream;
                        r23 = byteArrayInputStream;
                        r33 = byteArrayInputStream2;
                        StreamUtils.closeStream(r13);
                        StreamUtils.closeStream(r33);
                        StreamUtils.closeStream(byteArrayInputStream3);
                        StreamUtils.closeStream(r23);
                        httpURLConnection.disconnect();
                        return null;
                    }
                } else {
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    StreamUtils.closeStream(null);
                    try {
                        throw null;
                    } catch (Exception unused6) {
                        return null;
                    }
                }
            } catch (Throwable th10) {
                th2 = th10;
                r12 = r13;
                closeable4 = r23;
                closeable3 = r33;
                StreamUtils.closeStream(r12);
                StreamUtils.closeStream(closeable3);
                StreamUtils.closeStream(byteArrayInputStream3);
                StreamUtils.closeStream(closeable4);
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (FileNotFoundException e29) {
            fileNotFoundException = e29;
            inputStream4 = null;
            byteArrayInputStream9 = null;
            byteArrayInputStream10 = null;
            httpURLConnection = null;
            byteArrayInputStream3 = null;
        } catch (UnknownHostException e30) {
            unknownHostException = e30;
            inputStream3 = null;
            byteArrayInputStream7 = null;
            byteArrayInputStream8 = null;
            httpURLConnection = null;
            byteArrayInputStream3 = null;
        } catch (IOException e31) {
            iOException = e31;
            inputStream2 = null;
            byteArrayInputStream5 = null;
            byteArrayInputStream6 = null;
            httpURLConnection = null;
            byteArrayInputStream3 = null;
        } catch (a.C0650a e32) {
            c0650a = e32;
            closeable = null;
            closeable2 = null;
            byteArrayInputStream4 = null;
            httpURLConnection = null;
        } catch (Throwable th11) {
            th = th11;
            inputStream = null;
            byteArrayInputStream = null;
            byteArrayInputStream2 = null;
            httpURLConnection = null;
            byteArrayInputStream3 = null;
        }
    }
}
