package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f13238a = "10.0.0.172";

    /* renamed from: b, reason: collision with root package name */
    private int f13239b = 80;

    /* renamed from: c, reason: collision with root package name */
    private Context f13240c;

    public c(Context context) {
        this.f13240c = context;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f13240c, "sl_domain_p", "");
        if (TextUtils.isEmpty(imprintProperty)) {
            return;
        }
        a.f13222i = DataHelper.assembleStatelessURL(imprintProperty);
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f13240c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f13240c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.f13221h = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            a.f13224k = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        a.f13222i = a.f13224k;
        if (!TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f13248b)) {
            if (com.umeng.commonsdk.statistics.b.f13248b.startsWith("460") || com.umeng.commonsdk.statistics.b.f13248b.startsWith("461")) {
                a.f13222i = a.f13221h;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0122, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.net.HttpURLConnection, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.c.a(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
