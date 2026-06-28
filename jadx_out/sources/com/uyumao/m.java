package com.uyumao;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile m f13682a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13683b = e.a().getSharedPreferences("um_social_azx", 0);

    public static m a() {
        if (f13682a == null) {
            synchronized (m.class) {
                if (f13682a == null) {
                    f13682a = new m();
                }
            }
        }
        return f13682a;
    }
}
