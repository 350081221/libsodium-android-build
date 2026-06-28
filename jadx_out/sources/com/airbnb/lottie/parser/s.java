package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1702a = c.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1703a;

        static {
            int[] iArr = new int[c.b.values().length];
            f1703a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1703a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1703a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        cVar.b();
        float o5 = (float) cVar.o();
        float o6 = (float) cVar.o();
        while (cVar.H() != c.b.END_ARRAY) {
            cVar.O();
        }
        cVar.d();
        return new PointF(o5 * f5, o6 * f5);
    }

    private static PointF b(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        float o5 = (float) cVar.o();
        float o6 = (float) cVar.o();
        while (cVar.j()) {
            cVar.O();
        }
        return new PointF(o5 * f5, o6 * f5);
    }

    private static PointF c(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        cVar.c();
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (cVar.j()) {
            int J = cVar.J(f1702a);
            if (J != 0) {
                if (J != 1) {
                    cVar.M();
                    cVar.O();
                } else {
                    f7 = g(cVar);
                }
            } else {
                f6 = g(cVar);
            }
        }
        cVar.h();
        return new PointF(f6 * f5, f7 * f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public static int d(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.b();
        int o5 = (int) (cVar.o() * 255.0d);
        int o6 = (int) (cVar.o() * 255.0d);
        int o7 = (int) (cVar.o() * 255.0d);
        while (cVar.j()) {
            cVar.O();
        }
        cVar.d();
        return Color.argb(255, o5, o6, o7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        int i5 = a.f1703a[cVar.H().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return c(cVar, f5);
                }
                throw new IllegalArgumentException("Unknown point starts with " + cVar.H());
            }
            return a(cVar, f5);
        }
        return b(cVar, f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.H() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f5));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        c.b H = cVar.H();
        int i5 = a.f1703a[H.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                cVar.b();
                float o5 = (float) cVar.o();
                while (cVar.j()) {
                    cVar.O();
                }
                cVar.d();
                return o5;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + H);
        }
        return (float) cVar.o();
    }
}
