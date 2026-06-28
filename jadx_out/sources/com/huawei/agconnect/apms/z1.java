package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public class z1 {
    static {
        Collections.unmodifiableList(Arrays.asList("CN", "DE", "SG", "RU", GrsBaseInfo.CountryCodeSource.UNKNOWN));
    }

    public static v1.a abc(Context context, String str, String str2) {
        return b2.abc(context, new c2(str, str2, ""));
    }
}
