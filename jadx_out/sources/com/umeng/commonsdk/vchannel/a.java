package com.umeng.commonsdk.vchannel;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f13511a = "https://pslog.umeng.com";

    /* renamed from: b, reason: collision with root package name */
    public static String f13512b = "https://pslog.umeng.com/";

    /* renamed from: c, reason: collision with root package name */
    public static String f13513c = "explog";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13514d = "analytics";

    /* renamed from: e, reason: collision with root package name */
    public static final String f13515e = "ekv";

    /* renamed from: f, reason: collision with root package name */
    public static final String f13516f = "id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f13517g = "ts";

    /* renamed from: h, reason: collision with root package name */
    public static final String f13518h = "ds";

    /* renamed from: i, reason: collision with root package name */
    public static final String f13519i = "pn";

    /* renamed from: j, reason: collision with root package name */
    public static String f13520j = "";

    static {
        String str = "SUB" + System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
        f13520j = sb.toString();
    }
}
