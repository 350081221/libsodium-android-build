package com.lody.virtual.client.env;

import java.util.HashSet;

/* loaded from: classes3.dex */
public class InstallProviderSkip {
    public static HashSet sSkipInstallProviderSet;

    static {
        HashSet hashSet = new HashSet();
        sSkipInstallProviderSet = hashSet;
        hashSet.add("com.netease.party");
        sSkipInstallProviderSet.add("com.netease.race");
        sSkipInstallProviderSet.add("com.netease.tom233");
        sSkipInstallProviderSet.add("com.netease.pes");
        sSkipInstallProviderSet.add("com.netease.vlfcn.jh");
        sSkipInstallProviderSet.add("com.netease.sky");
        sSkipInstallProviderSet.add("com.netease.dwrg");
    }

    public static boolean isSkip(String str) {
        return sSkipInstallProviderSet.contains(str);
    }
}
