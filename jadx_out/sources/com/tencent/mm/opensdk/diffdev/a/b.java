package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a, reason: collision with root package name */
    private String f11253a;

    /* renamed from: b, reason: collision with root package name */
    private String f11254b;

    /* renamed from: c, reason: collision with root package name */
    private String f11255c;

    /* renamed from: d, reason: collision with root package name */
    private String f11256d;

    /* renamed from: e, reason: collision with root package name */
    private String f11257e;

    /* renamed from: f, reason: collision with root package name */
    private OAuthListener f11258f;

    /* renamed from: g, reason: collision with root package name */
    private c f11259g;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public OAuthErrCode f11260a;

        /* renamed from: b, reason: collision with root package name */
        public String f11261b;

        /* renamed from: c, reason: collision with root package name */
        public String f11262c;

        /* renamed from: d, reason: collision with root package name */
        public String f11263d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f11264e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String format;
            a aVar = new a();
            if (bArr != null && bArr.length != 0) {
                try {
                } catch (Exception e5) {
                    format = String.format("parse fail, build String fail, ex = %s", e5.getMessage());
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                    int i5 = jSONObject.getInt("errcode");
                    if (i5 != 0) {
                        Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i5)));
                        aVar.f11260a = OAuthErrCode.WechatAuth_Err_NormalErr;
                        jSONObject.optString("errmsg");
                        return aVar;
                    }
                    String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                    if (string != null && string.length() != 0) {
                        byte[] decode = Base64.decode(string, 0);
                        if (decode != null && decode.length != 0) {
                            aVar.f11260a = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f11264e = decode;
                            aVar.f11261b = jSONObject.getString("uuid");
                            String string2 = jSONObject.getString("appname");
                            aVar.f11262c = string2;
                            Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f11261b, string2, Integer.valueOf(aVar.f11264e.length)));
                            return aVar;
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        aVar.f11260a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    }
                    Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                    aVar.f11260a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                    return aVar;
                } catch (Exception e6) {
                    format = String.format("parse json fail, ex = %s", e6.getMessage());
                    Log.e("MicroMsg.SDK.GetQRCodeResult", format);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f11260a = oAuthErrCode;
                    return aVar;
                }
            }
            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f11260a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f11253a = str;
        this.f11254b = str2;
        this.f11255c = str3;
        this.f11256d = str4;
        this.f11257e = str5;
        this.f11258f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f11259g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String format = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f11253a, this.f11255c, this.f11256d, this.f11254b, this.f11257e);
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a5 = com.tencent.mm.opensdk.channel.a.a.a(format, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", format, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        return a.a(a5);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f11260a;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f11264e.length);
            this.f11258f.onAuthGotQrcode(aVar2.f11263d, aVar2.f11264e);
            c cVar = new c(aVar2.f11261b, this.f11258f);
            this.f11259g = cVar;
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
        this.f11258f.onAuthFinish(aVar2.f11260a, null);
    }
}
