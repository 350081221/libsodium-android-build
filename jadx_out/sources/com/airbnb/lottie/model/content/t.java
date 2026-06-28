package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.v;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1491a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1492b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1493c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1494d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1495e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1496f;

    /* loaded from: classes2.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i5) {
            if (i5 != 1) {
                if (i5 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i5);
            }
            return SIMULTANEOUSLY;
        }
    }

    public t(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z4) {
        this.f1491a = str;
        this.f1492b = aVar;
        this.f1493c = bVar;
        this.f1494d = bVar2;
        this.f1495e = bVar3;
        this.f1496f = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new v(bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f1494d;
    }

    public String c() {
        return this.f1491a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f1495e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f1493c;
    }

    public a f() {
        return this.f1492b;
    }

    public boolean g() {
        return this.f1496f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f1493c + ", end: " + this.f1494d + ", offset: " + this.f1495e + a1.i.f138d;
    }
}
