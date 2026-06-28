package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f1342a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final LottieAnimationView f1343b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final x0 f1344c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1345d;

    @VisibleForTesting
    l1() {
        this.f1342a = new HashMap();
        this.f1345d = true;
        this.f1343b = null;
        this.f1344c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f1343b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        x0 x0Var = this.f1344c;
        if (x0Var != null) {
            x0Var.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f1345d && this.f1342a.containsKey(str2)) {
            return this.f1342a.get(str2);
        }
        String b5 = b(str, str2);
        if (this.f1345d) {
            this.f1342a.put(str2, b5);
        }
        return b5;
    }

    public void e() {
        this.f1342a.clear();
        d();
    }

    public void f(String str) {
        this.f1342a.remove(str);
        d();
    }

    public void g(boolean z4) {
        this.f1345d = z4;
    }

    public void h(String str, String str2) {
        this.f1342a.put(str, str2);
        d();
    }

    public l1(LottieAnimationView lottieAnimationView) {
        this.f1342a = new HashMap();
        this.f1345d = true;
        this.f1343b = lottieAnimationView;
        this.f1344c = null;
    }

    public l1(x0 x0Var) {
        this.f1342a = new HashMap();
        this.f1345d = true;
        this.f1344c = x0Var;
        this.f1343b = null;
    }
}
