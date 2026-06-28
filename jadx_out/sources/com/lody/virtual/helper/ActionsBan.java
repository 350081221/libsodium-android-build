package com.lody.virtual.helper;

import java.util.HashSet;

/* loaded from: classes3.dex */
public class ActionsBan {
    public static HashSet sActionsBan;

    static {
        HashSet hashSet = new HashSet();
        sActionsBan = hashSet;
        hashSet.add("com.vivo.hotfixcollect");
    }

    public static boolean isBanAction(String str) {
        return sActionsBan.contains(str);
    }
}
