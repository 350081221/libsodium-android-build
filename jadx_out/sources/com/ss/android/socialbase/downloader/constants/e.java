package com.ss.android.socialbase.downloader.constants;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f10511a = "";

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f10512b = "";

    /* renamed from: c, reason: collision with root package name */
    public static volatile String f10513c = "";

    /* renamed from: d, reason: collision with root package name */
    public static long f10514d = 512000;

    /* renamed from: e, reason: collision with root package name */
    public static long f10515e = 50;

    /* renamed from: f, reason: collision with root package name */
    public static long f10516f = 5242880;

    /* renamed from: g, reason: collision with root package name */
    public static long f10517g = 31457280;

    /* renamed from: h, reason: collision with root package name */
    public static long f10518h = 10485760;

    /* renamed from: i, reason: collision with root package name */
    public static final JSONObject f10519i = new JSONObject();

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f10511a = str;
    }
}
