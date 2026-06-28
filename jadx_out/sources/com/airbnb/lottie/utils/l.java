package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.v;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1768a = 1000000000;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f1769b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f1770c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Path> f1771d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<float[]> f1772e = new d();

    /* renamed from: f, reason: collision with root package name */
    private static final float f1773f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* loaded from: classes2.dex */
    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* loaded from: classes2.dex */
    class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes2.dex */
    class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes2.dex */
    class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    private l() {
    }

    public static void a(Path path, float f5, float f6, float f7) {
        com.airbnb.lottie.f.b("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f1769b.get();
        Path path2 = f1770c.get();
        Path path3 = f1771d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f5 == 1.0f && f6 == 0.0f) {
            com.airbnb.lottie.f.c("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f6 - f5) - 1.0f) >= 0.01d) {
            float f8 = f5 * length;
            float f9 = f6 * length;
            float f10 = f7 * length;
            float min = Math.min(f8, f9) + f10;
            float max = Math.max(f8, f9) + f10;
            if (min >= length && max >= length) {
                min = k.g(min, length);
                max = k.g(max, length);
            }
            if (min < 0.0f) {
                min = k.g(min, length);
            }
            if (max < 0.0f) {
                max = k.g(max, length);
            }
            if (min == max) {
                path.reset();
                com.airbnb.lottie.f.c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.airbnb.lottie.f.c("applyTrimPathIfNeeded");
            return;
        }
        com.airbnb.lottie.f.c("applyTrimPathIfNeeded");
    }

    public static void b(Path path, @Nullable v vVar) {
        if (vVar != null && !vVar.k()) {
            a(path, ((com.airbnb.lottie.animation.keyframe.d) vVar.i()).q() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) vVar.e()).q() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) vVar.g()).q() / 360.0f);
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f5 = pointF3.x + pointF.x;
            float f6 = pointF.y + pointF3.y;
            float f7 = pointF2.x;
            float f8 = f7 + pointF4.x;
            float f9 = pointF2.y;
            path.cubicTo(f5, f6, f8, f9 + pointF4.y, f7, f9);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f1772e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f5 = f1773f;
        fArr[2] = f5;
        fArr[3] = f5;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f1772e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    public static int i(float f5, float f6, float f7, float f8) {
        int i5 = f5 != 0.0f ? (int) (527 * f5) : 17;
        if (f6 != 0.0f) {
            i5 = (int) (i5 * 31 * f6);
        }
        if (f7 != 0.0f) {
            i5 = (int) (i5 * 31 * f7);
        }
        return f8 != 0.0f ? (int) (i5 * 31 * f8) : i5;
    }

    public static boolean j(int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i5 < i8) {
            return false;
        }
        if (i5 > i8) {
            return true;
        }
        if (i6 < i9) {
            return false;
        }
        return i6 > i9 || i7 >= i10;
    }

    public static boolean k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return createBitmap;
    }

    public static Bitmap m(Bitmap bitmap, int i5, int i6) {
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i5, i6, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint) {
        o(canvas, rectF, paint, 31);
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint, int i5) {
        com.airbnb.lottie.f.b("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.airbnb.lottie.f.c("Utils#saveLayer");
    }
}
