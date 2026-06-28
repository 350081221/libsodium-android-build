package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper;

/* loaded from: classes3.dex */
class bb implements av {
    @Override // com.umeng.analytics.pro.av
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a5 = OpenIdHelper.a();
        bh.a("getOAID", "isSupported", Boolean.valueOf(a5));
        if (!a5) {
            return null;
        }
        return OpenIdHelper.b(context);
    }
}
