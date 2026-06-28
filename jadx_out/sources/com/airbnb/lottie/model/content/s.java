package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class s implements com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1479a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.b f1480b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f1481c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f1482d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f1483e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1484f;

    /* renamed from: g, reason: collision with root package name */
    private final b f1485g;

    /* renamed from: h, reason: collision with root package name */
    private final c f1486h;

    /* renamed from: i, reason: collision with root package name */
    private final float f1487i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1488j;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1489a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1490b;

        static {
            int[] iArr = new int[c.values().length];
            f1490b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1490b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1490b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f1489a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1489a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1489a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i5 = a.f1489a[ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i5 = a.f1490b[ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public s(String str, @Nullable com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, b bVar3, c cVar, float f5, boolean z4) {
        this.f1479a = str;
        this.f1480b = bVar;
        this.f1481c = list;
        this.f1482d = aVar;
        this.f1483e = dVar;
        this.f1484f = bVar2;
        this.f1485g = bVar3;
        this.f1486h = cVar;
        this.f1487i = f5;
        this.f1488j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.u(x0Var, bVar, this);
    }

    public b b() {
        return this.f1485g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f1482d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f1480b;
    }

    public c e() {
        return this.f1486h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f1481c;
    }

    public float g() {
        return this.f1487i;
    }

    public String h() {
        return this.f1479a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f1483e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f1484f;
    }

    public boolean k() {
        return this.f1488j;
    }
}
