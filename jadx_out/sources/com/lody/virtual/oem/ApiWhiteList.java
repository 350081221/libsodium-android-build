package com.lody.virtual.oem;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class ApiWhiteList {
    public static final Set<String> ALLOW_GET_ALL_PKGS_BY_UID;

    static {
        HashSet hashSet = new HashSet(7);
        ALLOW_GET_ALL_PKGS_BY_UID = hashSet;
        hashSet.add("com.huawei.hwid");
    }
}
