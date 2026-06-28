package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.content.Intent;
import com.umeng.analytics.pro.bi;

/* loaded from: classes3.dex */
public class l extends a {
    public l(Context context, com.ss.android.socialbase.downloader.g.a aVar, String str) {
        super(context, aVar, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.a.e
    public Intent b() {
        String c5 = this.f10188b.c(bi.aE);
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("ag"), c5);
        String a6 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("ah"), c5);
        String a7 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("ai"), c5);
        String a8 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("aj"), c5);
        Intent intent = new Intent();
        intent.putExtra(a5, this.f10189c);
        intent.putExtra(a6, "*/*");
        intent.putExtra(a7, true);
        intent.setAction(a8);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        return intent;
    }
}
