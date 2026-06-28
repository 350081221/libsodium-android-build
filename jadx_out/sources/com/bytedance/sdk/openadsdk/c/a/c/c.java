package com.bytedance.sdk.openadsdk.c.a.c;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.LocationProvider;

/* loaded from: classes2.dex */
public class c {
    public static final ValueSet a(LocationProvider locationProvider) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        if (locationProvider == null) {
            return null;
        }
        a5.c(262001, locationProvider.getLatitude());
        a5.c(262002, locationProvider.getLongitude());
        return a5.k();
    }
}
