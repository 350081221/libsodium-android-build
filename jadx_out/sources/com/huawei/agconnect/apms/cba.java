package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class cba extends HttpURLConnection {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public HttpURLConnection abc;
    public fed bcd;
    public i cde;

    /* loaded from: classes3.dex */
    public class abc implements l {
        public final /* synthetic */ fed abc;

        public abc(fed fedVar) {
            this.abc = fedVar;
        }

        @Override // com.huawei.agconnect.apms.l
        public void abc(k kVar) {
            if (!this.abc.ijk()) {
                this.abc.abc(kVar.abc);
            }
            cba.this.abc(kVar.bcd);
        }

        @Override // com.huawei.agconnect.apms.l
        public void bcd(k kVar) {
            if (this.abc.ijk()) {
                return;
            }
            try {
                this.abc.cde(cba.this.abc.getResponseCode());
            } catch (IOException unused) {
                cba.def.warn("failed to get status code");
            }
            long contentLength = cba.this.abc.getContentLength();
            long j5 = kVar.abc;
            this.abc.def(contentLength);
            this.abc.abc(j5);
            cba.this.abc(this.abc);
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements l {
        public final /* synthetic */ fed abc;

        public bcd(fed fedVar) {
            this.abc = fedVar;
        }

        @Override // com.huawei.agconnect.apms.l
        public void abc(k kVar) {
            if (!this.abc.ijk()) {
                this.abc.bcd(kVar.abc);
            }
            cba.this.abc(kVar.bcd);
        }

        @Override // com.huawei.agconnect.apms.l
        public void bcd(k kVar) {
            if (this.abc.ijk()) {
                return;
            }
            try {
                this.abc.cde(cba.this.abc.getResponseCode());
            } catch (IOException unused) {
                cba.def.warn("failed to get status code");
            }
            String requestProperty = cba.this.abc.getRequestProperty("Content-length");
            long j5 = kVar.abc;
            if (requestProperty != null) {
                try {
                    j5 = Long.parseLong(requestProperty);
                } catch (Throwable th) {
                    com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("failed to get content length: "), cba.def);
                }
            }
            this.abc.bcd(j5);
            cba.this.abc(this.abc);
        }
    }

    public cba(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.abc = httpURLConnection;
        bcd();
        if (httpURLConnection.getURL() != null) {
            edc.abc(httpURLConnection.getURL().getHost(), this.bcd);
        }
        String abc2 = q1.abc();
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(HeaderType.X_TRACE_ID))) {
            httpURLConnection.setRequestProperty(HeaderType.X_TRACE_ID, abc2);
        }
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(HeaderType.X_MICROSERVICE_NAME))) {
            httpURLConnection.setRequestProperty(HeaderType.X_MICROSERVICE_NAME, "APMS");
        }
        this.bcd.jih = abc2;
    }

    public final void abc() {
        if (bcd().ijk()) {
            return;
        }
        edc.bcd(bcd(), this.abc);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.abc.addRequestProperty(str, str2);
    }

    public final fed bcd() {
        if (this.bcd == null) {
            fed fedVar = new fed();
            this.bcd = fedVar;
            edc.abc(fedVar, this.abc);
        }
        return this.bcd;
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        bcd().ghi = 3;
        try {
            this.abc.connect();
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        fed fedVar = this.bcd;
        if (fedVar != null && !fedVar.ijk()) {
            abc(this.bcd);
        }
        this.abc.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.abc.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.abc.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        bcd();
        try {
            Object content = this.abc.getContent();
            int contentLength = this.abc.getContentLength();
            if (contentLength >= 0) {
                fed bcd2 = bcd();
                if (!bcd2.ijk()) {
                    bcd2.abc(contentLength);
                    abc(bcd2);
                }
            }
            return content;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        bcd();
        String contentEncoding = this.abc.getContentEncoding();
        abc();
        return contentEncoding;
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        bcd();
        int contentLength = this.abc.getContentLength();
        abc();
        return contentLength;
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        bcd();
        String contentType = this.abc.getContentType();
        abc();
        return contentType;
    }

    @Override // java.net.URLConnection
    public long getDate() {
        bcd();
        abc();
        return this.abc.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.abc.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.abc.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.abc.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        bcd();
        try {
            i iVar = this.cde;
            if (iVar == null || iVar.available() == 0) {
                this.cde = new i(this.abc.getErrorStream(), true);
            }
            return this.cde;
        } catch (Throwable unused) {
            return this.abc.getErrorStream();
        }
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        bcd();
        long expiration = this.abc.getExpiration();
        abc();
        return expiration;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i5) {
        bcd();
        String headerField = this.abc.getHeaderField(i5);
        abc();
        return headerField;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j5) {
        bcd();
        long headerFieldDate = this.abc.getHeaderFieldDate(str, j5);
        abc();
        return headerFieldDate;
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i5) {
        bcd();
        int headerFieldInt = this.abc.getHeaderFieldInt(str, i5);
        abc();
        return headerFieldInt;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i5) {
        bcd();
        String headerFieldKey = this.abc.getHeaderFieldKey(i5);
        abc();
        return headerFieldKey;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        bcd();
        Map<String, List<String>> headerFields = this.abc.getHeaderFields();
        abc();
        return headerFields;
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        bcd();
        long ifModifiedSince = this.abc.getIfModifiedSince();
        abc();
        return ifModifiedSince;
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        fed bcd2 = bcd();
        try {
            i iVar = new i(this.abc.getInputStream());
            edc.bcd(bcd2, this.abc);
            iVar.bcd.abc(new abc(bcd2));
            return iVar;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.abc.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        bcd();
        long lastModified = this.abc.getLastModified();
        abc();
        return lastModified;
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        fed bcd2 = bcd();
        try {
            j jVar = new j(this.abc.getOutputStream());
            String requestProperty = this.abc.getRequestProperty(HTTP.CONTENT_TYPE);
            if (requestProperty == null) {
                requestProperty = "";
            }
            bcd2.efg = requestProperty;
            jVar.cde.abc(new bcd(bcd2));
            return jVar;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.abc.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.abc.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.abc.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.abc.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.abc.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        bcd();
        try {
            int responseCode = this.abc.getResponseCode();
            abc();
            return responseCode;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        bcd();
        try {
            String responseMessage = this.abc.getResponseMessage();
            abc();
            return responseMessage;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.abc.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.abc.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z4) {
        this.abc.setAllowUserInteraction(z4);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i5) {
        this.abc.setChunkedStreamingMode(i5);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i5) {
        this.abc.setConnectTimeout(i5);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z4) {
        this.abc.setDefaultUseCaches(z4);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z4) {
        this.abc.setDoInput(z4);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z4) {
        this.abc.setDoOutput(z4);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i5) {
        this.abc.setFixedLengthStreamingMode(i5);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j5) {
        this.abc.setIfModifiedSince(j5);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z4) {
        this.abc.setInstanceFollowRedirects(z4);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i5) {
        this.abc.setReadTimeout(i5);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        bcd();
        try {
            this.abc.setRequestMethod(str);
        } catch (ProtocolException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.abc.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z4) {
        this.abc.setUseCaches(z4);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.abc.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.abc.usingProxy();
    }

    public void abc(Exception exc) {
        fed bcd2 = bcd();
        edc.abc(bcd2, exc);
        if (bcd2.ijk()) {
            return;
        }
        edc.bcd(bcd2, this.abc);
        gfe bcd3 = bcd2.bcd();
        if (bcd3 != null) {
            yza.abc(new HttpEvent(bcd3));
        }
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        bcd();
        String headerField = this.abc.getHeaderField(str);
        abc();
        return headerField;
    }

    public final void abc(fed fedVar) {
        gfe bcd2 = fedVar.bcd();
        if (bcd2 == null) {
            return;
        }
        if (fedVar.jkl()) {
            yza.abc(new HttpEvent(bcd2, x1.abc()));
        } else {
            yza.abc(new HttpEvent(bcd2));
        }
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        bcd();
        try {
            Object content = this.abc.getContent(clsArr);
            abc();
            return content;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }
}
