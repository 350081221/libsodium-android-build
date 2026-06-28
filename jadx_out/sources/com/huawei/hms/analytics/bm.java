package com.huawei.hms.analytics;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bm {
    public static final String[] lmn = {"com.huawei.agconnect.abtest.ABTestHAEventCallback", "com.huawei.agconnect.appmessaging.AppMessagingHAEventCallback"};
    public Map<String, Method> klm = new HashMap();
    public Map<String, Object> ikl = new HashMap();

    public final void lmn(String str, String str2, String str3, Bundle bundle) {
        Map<String, Method> map;
        Map<String, Object> map2 = this.ikl;
        if (map2 == null || map2.size() == 0 || (map = this.klm) == null || map.size() == 0) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("$HA_METADATA_TAG", str);
        bundle2.putString("$HA_METADATA_TYPE", str2);
        bundle2.putString("$HA_METADATA_SOURCE", "Event");
        cx.ikl().lmn(new cf(str3, bundle, bundle2, this.ikl, this.klm));
    }

    public final void lmn(String str, String str2, String str3, Bundle bundle, long j5) {
        Map<String, Method> map;
        Map<String, Object> map2 = this.ikl;
        if (map2 == null || map2.size() == 0 || (map = this.klm) == null || map.size() == 0) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("$HA_METADATA_TAG", str);
        bundle2.putString("$HA_METADATA_TYPE", str2);
        bundle2.putString("$HA_METADATA_SOURCE", "StreamEvent");
        bundle2.putString("$HA_METADATA_TIMESTAMP", String.valueOf(j5));
        cx.ikl().lmn(new cf(str3, bundle, bundle2, this.ikl, this.klm));
    }
}
