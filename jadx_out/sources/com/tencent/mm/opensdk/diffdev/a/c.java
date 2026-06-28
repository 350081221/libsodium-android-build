package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;

/* loaded from: classes3.dex */
class c extends AsyncTask<Void, Void, a> {

    /* renamed from: a, reason: collision with root package name */
    private String f11265a;

    /* renamed from: b, reason: collision with root package name */
    private String f11266b;

    /* renamed from: c, reason: collision with root package name */
    private OAuthListener f11267c;

    /* renamed from: d, reason: collision with root package name */
    private int f11268d;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public OAuthErrCode f11269a;

        /* renamed from: b, reason: collision with root package name */
        public String f11270b;

        /* renamed from: c, reason: collision with root package name */
        public int f11271c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f11265a = str;
        this.f11267c = oAuthListener;
        this.f11266b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.diffdev.a.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f11267c.onAuthFinish(aVar2.f11269a, aVar2.f11270b);
    }
}
