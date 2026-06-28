package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.analytics.pro.bi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i extends a {

    /* renamed from: d, reason: collision with root package name */
    private String f10191d;

    /* renamed from: e, reason: collision with root package name */
    private String f10192e;

    public i(Context context, com.ss.android.socialbase.downloader.g.a aVar, String str, String str2, String str3) {
        super(context, aVar, str);
        this.f10191d = str2;
        this.f10192e = str3;
    }

    @Override // com.ss.android.socialbase.appdownloader.a.e
    public Intent b() {
        String str;
        String c5 = this.f10188b.c(bi.aE);
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("ak"), c5);
        String a6 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("am"), c5);
        String a7 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c(y0.a.f22653u), c5);
        String str2 = null;
        if (!TextUtils.isEmpty(a7) && a7.split(",").length == 2) {
            String[] split = a7.split(",");
            String a8 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("al"), c5);
            String a9 = com.ss.android.socialbase.appdownloader.f.c.a(this.f10188b.c("ao"), c5);
            if (!TextUtils.isEmpty(a9) && a9.split(",").length == 2) {
                String[] split2 = a9.split(",");
                JSONObject d5 = this.f10188b.d("download_dir");
                if (d5 != null) {
                    String optString = d5.optString("dir_name");
                    if (!TextUtils.isEmpty(optString) && optString.contains("%s")) {
                        try {
                            str = String.format(optString, this.f10192e);
                        } catch (Throwable unused) {
                            str = this.f10192e;
                        }
                    } else {
                        str = this.f10192e;
                    }
                    str2 = str;
                    if (str2.length() > 255) {
                        str2 = a8.substring(str2.length() - 255);
                    }
                }
                Intent intent = new Intent(a5);
                intent.putExtra(split2[0], split2[1]);
                intent.putExtra(a6, this.f10191d);
                intent.putExtra(a8, str2);
                intent.putExtra(split[0], Integer.parseInt(split[1]));
                intent.addFlags(268468224);
                return intent;
            }
        }
        return null;
    }
}
