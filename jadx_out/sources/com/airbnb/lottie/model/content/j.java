package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1437a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1438b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1439c;

    /* loaded from: classes2.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i5) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public j(String str, a aVar, boolean z4) {
        this.f1437a = str;
        this.f1438b = aVar;
        this.f1439c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        if (!x0Var.I()) {
            com.airbnb.lottie.utils.f.e("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.l(this);
    }

    public a b() {
        return this.f1438b;
    }

    public String c() {
        return this.f1437a;
    }

    public boolean d() {
        return this.f1439c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f1438b + '}';
    }
}
