package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7838a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f7839b;

    static {
        String[] strArr = {"CN", "DE", "SG", "RU", GrsBaseInfo.CountryCodeSource.UNKNOWN};
        f7838a = strArr;
        f7839b = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public static ak a(Context context, String str, String str2) {
        return am.a(context, new an(str, str2, ""));
    }

    public static ak a(Context context, String str, String str2, String str3) {
        if (str3 != null) {
            List<String> list = f7839b;
            Locale locale = Locale.ENGLISH;
            if (list.contains(str3.toUpperCase(locale))) {
                return am.a(context, new an(str, str2, str3.toUpperCase(locale)));
            }
        }
        Log.e("HiAnalyticsBridge", "RoutePolicy check failed: ".concat(String.valueOf(str3)));
        return null;
    }
}
