package com.yuanqi.group.utils;

import java.util.HashSet;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static HashSet<String> f14075a;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f14075a = hashSet;
        hashSet.add("com.dingtalk.android");
        f14075a.add("com.alibaba.android.rimet");
        f14075a.add("me.ele");
        f14075a.add("com.tencent.wework");
        f14075a.add("com.ss.android.lark");
    }

    public static boolean a(String str) {
        return f14075a.contains(str);
    }
}
