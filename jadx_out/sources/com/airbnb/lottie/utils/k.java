package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.model.content.o;
import java.util.List;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f1767a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d5, double d6, double d7) {
        return Math.max(d6, Math.min(d7, d5));
    }

    public static float c(float f5, float f6, float f7) {
        return Math.max(f6, Math.min(f7, f5));
    }

    public static int d(int i5, int i6, int i7) {
        return Math.max(i6, Math.min(i7, i5));
    }

    public static boolean e(float f5, float f6, float f7) {
        return f5 >= f6 && f5 <= f7;
    }

    private static int f(int i5, int i6) {
        boolean z4;
        int i7 = i5 / i6;
        if ((i5 ^ i6) >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i8 = i5 % i6;
        if (!z4 && i8 != 0) {
            return i7 - 1;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(float f5, float f6) {
        return h((int) f5, (int) f6);
    }

    private static int h(int i5, int i6) {
        return i5 - (i6 * f(i5, i6));
    }

    public static void i(o oVar, Path path) {
        path.reset();
        PointF b5 = oVar.b();
        path.moveTo(b5.x, b5.y);
        f1767a.set(b5.x, b5.y);
        for (int i5 = 0; i5 < oVar.a().size(); i5++) {
            com.airbnb.lottie.model.a aVar = oVar.a().get(i5);
            PointF a5 = aVar.a();
            PointF b6 = aVar.b();
            PointF c5 = aVar.c();
            PointF pointF = f1767a;
            if (a5.equals(pointF) && b6.equals(c5)) {
                path.lineTo(c5.x, c5.y);
            } else {
                path.cubicTo(a5.x, a5.y, b6.x, b6.y, c5.x, c5.y);
            }
            pointF.set(c5.x, c5.y);
        }
        if (oVar.d()) {
            path.close();
        }
    }

    public static double j(double d5, double d6, @FloatRange(from = 0.0d, to = 1.0d) double d7) {
        return d5 + (d7 * (d6 - d5));
    }

    public static float k(float f5, float f6, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        return f5 + (f7 * (f6 - f5));
    }

    public static int l(int i5, int i6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (int) (i5 + (f5 * (i6 - i5)));
    }

    public static void m(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (eVar.c(kVar.getName(), i5)) {
            list.add(eVar2.a(kVar.getName()).j(kVar));
        }
    }
}
