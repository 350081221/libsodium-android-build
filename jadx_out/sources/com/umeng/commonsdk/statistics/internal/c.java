package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13345e = false;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f13346f = false;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f13347g = false;

    /* renamed from: a, reason: collision with root package name */
    private String f13348a = "10.0.0.172";

    /* renamed from: b, reason: collision with root package name */
    private int f13349b = 80;

    /* renamed from: c, reason: collision with root package name */
    private Context f13350c;

    /* renamed from: d, reason: collision with root package name */
    private b f13351d;

    public c(Context context) {
        this.f13350c = context;
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f13350c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f13350c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f13350c, "oversea_domain_p", "");
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f13350c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (!TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f13248b)) {
            if (com.umeng.commonsdk.statistics.b.f13248b.startsWith("460") || com.umeng.commonsdk.statistics.b.f13248b.startsWith("461")) {
                AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
            }
        }
    }

    private void c() {
        if (!f13347g) {
            ImprintHandler.getImprintService(this.f13350c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.1
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                public void onImprintValueChanged(String str, String str2) {
                    if (FieldManager.b()) {
                        FieldManager.a().a(c.this.f13350c, str2);
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                        UMWorkDispatch.sendEvent(c.this.f13350c, com.umeng.commonsdk.internal.a.f13142w, com.umeng.commonsdk.internal.b.a(c.this.f13350c).a(), null);
                    }
                }
            });
            f13347g = true;
        }
    }

    private void d() {
        if (!f13346f) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
            ImprintHandler.getImprintService(this.f13350c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.2
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
                public boolean onPreProcessImprintKey(String str, String str2) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
                    FieldManager.a().a(c.this.f13350c);
                    UMWorkDispatch.sendEvent(c.this.f13350c, com.umeng.commonsdk.internal.a.f13138s, com.umeng.commonsdk.internal.b.a(c.this.f13350c).a(), null);
                    ImprintHandler.getImprintService(c.this.f13350c).a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                    return true;
                }
            });
            ImprintHandler.getImprintService(this.f13350c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.3
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                public void onImprintValueChanged(String str, String str2) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
                    FieldManager.a().a(c.this.f13350c, str2);
                    UMWorkDispatch.sendEvent(c.this.f13350c, com.umeng.commonsdk.internal.a.f13138s, com.umeng.commonsdk.internal.b.a(c.this.f13350c).a(), null);
                    if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: foregound count timer enabled.");
                        if (!UMWorkDispatch.eventHasExist()) {
                            UMWorkDispatch.sendEventEx(c.this.f13350c, o.a.E, CoreProtocol.getInstance(c.this.f13350c), null, 0L);
                        }
                    }
                    if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                        l.a(c.this.f13350c).b(c.this.f13350c);
                    }
                    ImprintHandler.getImprintService(c.this.f13350c).unregistImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, this);
                }
            });
            f13346f = true;
        }
    }

    public void a(b bVar) {
        this.f13351d = bVar;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f13350c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f13350c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    public byte[] a(byte[] bArr, boolean z4, boolean z5, String str) {
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            b();
        }
        byte[] bArr2 = null;
        int i5 = 0;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i5 >= strArr.length) {
                break;
            }
            String str2 = strArr[i5];
            if (z5) {
                d();
            } else {
                c();
            }
            bArr2 = a(bArr, str2 + File.separator + str);
            if (bArr2 != null) {
                b bVar = this.f13351d;
                if (bVar != null) {
                    bVar.onRequestSucceed(z4);
                }
            } else {
                b bVar2 = this.f13351d;
                if (bVar2 != null) {
                    bVar2.onRequestFailed();
                }
                i5++;
            }
        }
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0167: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:107:0x0173, block:B:106:0x0167 */
    public byte[] a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        try {
            try {
                b bVar = this.f13351d;
                if (bVar != null) {
                    bVar.onRequestStart();
                }
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    boolean z4 = true;
                    if (!f13345e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f13345e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", a.a(this.f13350c).b());
                    httpsURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, a.a(this.f13350c).a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setRequestProperty("SM-IMP", "1");
                    httpsURLConnection.setRequestProperty(HTTP.USER_AGENT, DeviceConfig.getCustomAgt());
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                        httpsURLConnection.connect();
                        b bVar2 = this.f13351d;
                        if (bVar2 != null) {
                            bVar2.onRequestEnd();
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        String headerField = httpsURLConnection.getHeaderField(HTTP.CONTENT_TYPE);
                        if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                            z4 = false;
                        }
                        boolean z5 = AnalyticsConstants.UM_DEBUG;
                        if (responseCode == 200 && z4) {
                            InputStream inputStream = httpsURLConnection.getInputStream();
                            try {
                                byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                                try {
                                    outputStream.close();
                                } catch (Exception e5) {
                                    UMCrashManager.reportCrash(this.f13350c, e5);
                                }
                                try {
                                    httpsURLConnection.getInputStream().close();
                                } catch (IOException unused) {
                                }
                                httpsURLConnection.disconnect();
                                return readStreamToByteArray;
                            } finally {
                                HelperUtils.safeClose(inputStream);
                            }
                        }
                        try {
                            outputStream.close();
                        } catch (Exception e6) {
                            UMCrashManager.reportCrash(this.f13350c, e6);
                        }
                        try {
                            httpsURLConnection.getInputStream().close();
                        } catch (IOException unused2) {
                        }
                        httpsURLConnection.disconnect();
                        return null;
                    } catch (UnknownHostException unused3) {
                        UMLog.aq("A_10200", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e7) {
                                UMCrashManager.reportCrash(this.f13350c, e7);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused4) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (SSLHandshakeException unused5) {
                        UMLog.aq("A_10201", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e8) {
                                UMCrashManager.reportCrash(this.f13350c, e8);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused6) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable unused7) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e9) {
                                UMCrashManager.reportCrash(this.f13350c, e9);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused8) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (UnknownHostException unused9) {
                    outputStream = null;
                } catch (SSLHandshakeException unused10) {
                    outputStream = null;
                } catch (Throwable unused11) {
                    outputStream = null;
                }
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e10) {
                        UMCrashManager.reportCrash(this.f13350c, e10);
                    }
                }
                if (str != 0) {
                    try {
                        str.getInputStream().close();
                    } catch (IOException unused12) {
                    }
                    str.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (UnknownHostException unused13) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused14) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused15) {
            httpsURLConnection = null;
            outputStream = null;
        }
    }
}
