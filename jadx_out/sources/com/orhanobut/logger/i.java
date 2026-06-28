package com.orhanobut.logger;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    static final String f9354a = "NO_TAG";

    @Override // com.orhanobut.logger.h
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        if (str == null) {
            str = f9354a;
        }
        Log.println(i5, str, str2);
    }
}
