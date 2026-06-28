package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.a1;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class e implements a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f1743a = new HashSet();

    @Override // com.airbnb.lottie.a1
    public void a(String str) {
        b(str, null);
    }

    @Override // com.airbnb.lottie.a1
    public void b(String str, Throwable th) {
        Set<String> set = f1743a;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.f.f1282b, str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.a1
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.a1
    public void error(String str, Throwable th) {
        if (com.airbnb.lottie.f.f1281a) {
            Log.d(com.airbnb.lottie.f.f1282b, str, th);
        }
    }

    @Override // com.airbnb.lottie.a1
    public void debug(String str, Throwable th) {
        if (com.airbnb.lottie.f.f1281a) {
            Log.d(com.airbnb.lottie.f.f1282b, str, th);
        }
    }
}
