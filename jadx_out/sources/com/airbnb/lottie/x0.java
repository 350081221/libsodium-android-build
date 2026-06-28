package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class x0 extends Drawable implements Drawable.Callback, Animatable {
    public static final int A0 = 2;
    public static final int B0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    private static final boolean f1822w0;

    /* renamed from: x0, reason: collision with root package name */
    private static final Executor f1823x0;

    /* renamed from: y0, reason: collision with root package name */
    private static final float f1824y0 = 50.0f;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f1825z0 = 1;
    private final Matrix A;
    private Bitmap B;
    private Canvas C;
    private Rect D;
    private RectF E;
    private Paint F;
    private Rect G;
    private Rect H;
    private RectF I;
    private RectF J;
    private Matrix K;
    private Matrix L;
    private boolean M;

    @Nullable
    private com.airbnb.lottie.a X;
    private final ValueAnimator.AnimatorUpdateListener Y;
    private final Semaphore Z;

    /* renamed from: a, reason: collision with root package name */
    private k f1826a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.utils.i f1827b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1828c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1829d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1830e;

    /* renamed from: f, reason: collision with root package name */
    private c f1831f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f1832g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.manager.b f1833h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private String f1834i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.d f1835j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.manager.a f1836k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private Map<String, Typeface> f1837l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    String f1838m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    com.airbnb.lottie.c f1839n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    l1 f1840o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1841p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1842q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1843r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.model.layer.c f1844s;

    /* renamed from: s0, reason: collision with root package name */
    private Handler f1845s0;

    /* renamed from: t, reason: collision with root package name */
    private int f1846t;

    /* renamed from: t0, reason: collision with root package name */
    private Runnable f1847t0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1848u;

    /* renamed from: u0, reason: collision with root package name */
    private final Runnable f1849u0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1850v;

    /* renamed from: v0, reason: collision with root package name */
    private float f1851v0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1852w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1853x;

    /* renamed from: y, reason: collision with root package name */
    private j1 f1854y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1855z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class a<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f1856d;

        a(com.airbnb.lottie.value.l lVar) {
            this.f1856d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f1856d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface b {
        void a(k kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    static {
        boolean z4;
        if (Build.VERSION.SDK_INT <= 25) {
            z4 = true;
        } else {
            z4 = false;
        }
        f1822w0 = z4;
        f1823x0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new com.airbnb.lottie.utils.g());
    }

    public x0() {
        com.airbnb.lottie.utils.i iVar = new com.airbnb.lottie.utils.i();
        this.f1827b = iVar;
        this.f1828c = true;
        this.f1829d = false;
        this.f1830e = false;
        this.f1831f = c.NONE;
        this.f1832g = new ArrayList<>();
        this.f1842q = false;
        this.f1843r = true;
        this.f1846t = 255;
        this.f1853x = false;
        this.f1854y = j1.AUTOMATIC;
        this.f1855z = false;
        this.A = new Matrix();
        this.M = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                x0.this.t0(valueAnimator);
            }
        };
        this.Y = animatorUpdateListener;
        this.Z = new Semaphore(1);
        this.f1849u0 = new Runnable() { // from class: com.airbnb.lottie.o0
            @Override // java.lang.Runnable
            public final void run() {
                x0.this.v0();
            }
        };
        this.f1851v0 = -3.4028235E38f;
        iVar.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(int i5, k kVar) {
        k1(i5);
    }

    private void B() {
        k kVar = this.f1826a;
        if (kVar == null) {
            return;
        }
        this.f1855z = this.f1854y.useSoftwareRendering(Build.VERSION.SDK_INT, kVar.t(), kVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(float f5, k kVar) {
        m1(f5);
    }

    private void C(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(String str, k kVar) {
        o1(str);
    }

    private void D(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(String str, String str2, boolean z4, k kVar) {
        p1(str, str2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(int i5, int i6, k kVar) {
        n1(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(float f5, float f6, k kVar) {
        q1(f5, f6);
    }

    private boolean F1() {
        k kVar = this.f1826a;
        if (kVar == null) {
            return false;
        }
        float f5 = this.f1851v0;
        float j5 = this.f1827b.j();
        this.f1851v0 = j5;
        if (Math.abs(j5 - f5) * kVar.d() < 50.0f) {
            return false;
        }
        return true;
    }

    private void G(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        k kVar = this.f1826a;
        if (cVar != null && kVar != null) {
            this.A.reset();
            if (!getBounds().isEmpty()) {
                this.A.preScale(r2.width() / kVar.b().width(), r2.height() / kVar.b().height());
                this.A.preTranslate(r2.left, r2.top);
            }
            cVar.h(canvas, this.A, this.f1846t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(int i5, k kVar) {
        r1(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(String str, k kVar) {
        s1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(float f5, k kVar) {
        t1(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(float f5, k kVar) {
        w1(f5);
    }

    private void K(int i5, int i6) {
        Bitmap bitmap = this.B;
        if (bitmap != null && bitmap.getWidth() >= i5 && this.B.getHeight() >= i6) {
            if (this.B.getWidth() > i5 || this.B.getHeight() > i6) {
                Bitmap createBitmap = Bitmap.createBitmap(this.B, 0, 0, i5, i6);
                this.B = createBitmap;
                this.C.setBitmap(createBitmap);
                this.M = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        this.B = createBitmap2;
        this.C.setBitmap(createBitmap2);
        this.M = true;
    }

    private void L() {
        if (this.C != null) {
            return;
        }
        this.C = new Canvas();
        this.J = new RectF();
        this.K = new Matrix();
        this.L = new Matrix();
        this.D = new Rect();
        this.E = new RectF();
        this.F = new com.airbnb.lottie.animation.a();
        this.G = new Rect();
        this.H = new Rect();
        this.I = new RectF();
    }

    @Nullable
    private Context S() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private void S0(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.f1826a != null && cVar != null) {
            L();
            canvas.getMatrix(this.K);
            canvas.getClipBounds(this.D);
            C(this.D, this.E);
            this.K.mapRect(this.E);
            D(this.E, this.D);
            if (this.f1843r) {
                this.J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                cVar.f(this.J, null, false);
            }
            this.K.mapRect(this.J);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            W0(this.J, width, height);
            if (!m0()) {
                RectF rectF = this.J;
                Rect rect = this.D;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.J.width());
            int ceil2 = (int) Math.ceil(this.J.height());
            if (ceil > 0 && ceil2 > 0) {
                K(ceil, ceil2);
                if (this.M) {
                    this.A.set(this.K);
                    this.A.preScale(width, height);
                    Matrix matrix = this.A;
                    RectF rectF2 = this.J;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.B.eraseColor(0);
                    cVar.h(this.C, this.A, this.f1846t);
                    this.K.invert(this.L);
                    this.L.mapRect(this.I, this.J);
                    D(this.I, this.H);
                }
                this.G.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.B, this.G, this.H, this.F);
            }
        }
    }

    private com.airbnb.lottie.manager.a T() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f1836k == null) {
            com.airbnb.lottie.manager.a aVar = new com.airbnb.lottie.manager.a(getCallback(), this.f1839n);
            this.f1836k = aVar;
            String str = this.f1838m;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f1836k;
    }

    private com.airbnb.lottie.manager.b W() {
        com.airbnb.lottie.manager.b bVar = this.f1833h;
        if (bVar != null && !bVar.c(S())) {
            this.f1833h = null;
        }
        if (this.f1833h == null) {
            this.f1833h = new com.airbnb.lottie.manager.b(getCallback(), this.f1834i, this.f1835j, this.f1826a.j());
        }
        return this.f1833h;
    }

    private void W0(RectF rectF, float f5, float f6) {
        rectF.set(rectF.left * f5, rectF.top * f6, rectF.right * f5, rectF.bottom * f6);
    }

    private boolean m0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (!(((View) callback).getParent() instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) r0).getClipChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(com.airbnb.lottie.model.e eVar, Object obj, com.airbnb.lottie.value.j jVar, k kVar) {
        v(eVar, obj, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(ValueAnimator valueAnimator) {
        if (N()) {
            invalidateSelf();
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        if (cVar != null) {
            cVar.M(this.f1827b.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0() {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        if (cVar == null) {
            return;
        }
        try {
            this.Z.acquire();
            cVar.M(this.f1827b.j());
            if (f1822w0 && this.M) {
                if (this.f1845s0 == null) {
                    this.f1845s0 = new Handler(Looper.getMainLooper());
                    this.f1847t0 = new Runnable() { // from class: com.airbnb.lottie.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            x0.this.u0();
                        }
                    };
                }
                this.f1845s0.post(this.f1847t0);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.Z.release();
            throw th;
        }
        this.Z.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(k kVar) {
        M0();
    }

    private boolean x() {
        return this.f1828c || this.f1829d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(k kVar) {
        U0();
    }

    private void y() {
        k kVar = this.f1826a;
        if (kVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(kVar), kVar.k(), kVar);
        this.f1844s = cVar;
        if (this.f1850v) {
            cVar.K(true);
        }
        this.f1844s.S(this.f1843r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(int i5, k kVar) {
        f1(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(String str, k kVar) {
        l1(str);
    }

    public void A() {
        if (this.f1827b.isRunning()) {
            this.f1827b.cancel();
            if (!isVisible()) {
                this.f1831f = c.NONE;
            }
        }
        this.f1826a = null;
        this.f1844s = null;
        this.f1833h = null;
        this.f1851v0 = -3.4028235E38f;
        this.f1827b.h();
        invalidateSelf();
    }

    public void A1(boolean z4) {
        this.f1830e = z4;
    }

    public void B1(float f5) {
        this.f1827b.C(f5);
    }

    public void C1(Boolean bool) {
        this.f1828c = bool.booleanValue();
    }

    public void D1(l1 l1Var) {
        this.f1840o = l1Var;
    }

    @Deprecated
    public void E() {
    }

    public void E1(boolean z4) {
        this.f1827b.D(z4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void F(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        k kVar = this.f1826a;
        if (cVar != null && kVar != null) {
            boolean N = N();
            if (N) {
                try {
                    this.Z.acquire();
                    if (F1()) {
                        w1(this.f1827b.j());
                    }
                } catch (InterruptedException unused) {
                    if (N) {
                        this.Z.release();
                        if (cVar.P() == this.f1827b.j()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (N) {
                        this.Z.release();
                        if (cVar.P() != this.f1827b.j()) {
                            f1823x0.execute(this.f1849u0);
                        }
                    }
                    throw th;
                }
            }
            if (this.f1855z) {
                canvas.save();
                canvas.concat(matrix);
                S0(canvas, cVar);
                canvas.restore();
            } else {
                cVar.h(canvas, matrix, this.f1846t);
            }
            this.M = false;
            if (N) {
                this.Z.release();
                if (cVar.P() == this.f1827b.j()) {
                    return;
                }
                f1823x0.execute(this.f1849u0);
            }
        }
    }

    @Nullable
    public Bitmap G1(String str, @Nullable Bitmap bitmap) {
        com.airbnb.lottie.manager.b W = W();
        if (W == null) {
            com.airbnb.lottie.utils.f.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap f5 = W.f(str, bitmap);
        invalidateSelf();
        return f5;
    }

    public void H(boolean z4) {
        if (this.f1841p == z4) {
            return;
        }
        this.f1841p = z4;
        if (this.f1826a != null) {
            y();
        }
    }

    public boolean H1() {
        return this.f1837l == null && this.f1840o == null && this.f1826a.c().size() > 0;
    }

    public boolean I() {
        return this.f1841p;
    }

    @MainThread
    public void J() {
        this.f1832g.clear();
        this.f1827b.i();
        if (!isVisible()) {
            this.f1831f = c.NONE;
        }
    }

    @Deprecated
    public void K0(boolean z4) {
        this.f1827b.setRepeatCount(z4 ? -1 : 0);
    }

    public void L0() {
        this.f1832g.clear();
        this.f1827b.q();
        if (!isVisible()) {
            this.f1831f = c.NONE;
        }
    }

    public com.airbnb.lottie.a M() {
        com.airbnb.lottie.a aVar = this.X;
        if (aVar != null) {
            return aVar;
        }
        return f.d();
    }

    @MainThread
    public void M0() {
        float a02;
        if (this.f1844s == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.k0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.w0(kVar);
                }
            });
            return;
        }
        B();
        if (x() || f0() == 0) {
            if (isVisible()) {
                this.f1827b.r();
                this.f1831f = c.NONE;
            } else {
                this.f1831f = c.PLAY;
            }
        }
        if (!x()) {
            if (h0() < 0.0f) {
                a02 = b0();
            } else {
                a02 = a0();
            }
            f1((int) a02);
            this.f1827b.i();
            if (!isVisible()) {
                this.f1831f = c.NONE;
            }
        }
    }

    public boolean N() {
        return M() == com.airbnb.lottie.a.ENABLED;
    }

    public void N0() {
        this.f1827b.removeAllListeners();
    }

    @Nullable
    public Bitmap O(String str) {
        com.airbnb.lottie.manager.b W = W();
        if (W != null) {
            return W.a(str);
        }
        return null;
    }

    public void O0() {
        this.f1827b.removeAllUpdateListeners();
        this.f1827b.addUpdateListener(this.Y);
    }

    public boolean P() {
        return this.f1853x;
    }

    public void P0(Animator.AnimatorListener animatorListener) {
        this.f1827b.removeListener(animatorListener);
    }

    public boolean Q() {
        return this.f1843r;
    }

    @RequiresApi(api = 19)
    public void Q0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1827b.removePauseListener(animatorPauseListener);
    }

    public k R() {
        return this.f1826a;
    }

    public void R0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1827b.removeUpdateListener(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.e> T0(com.airbnb.lottie.model.e eVar) {
        if (this.f1844s == null) {
            com.airbnb.lottie.utils.f.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f1844s.e(eVar, 0, arrayList, new com.airbnb.lottie.model.e(new String[0]));
        return arrayList;
    }

    public int U() {
        return (int) this.f1827b.k();
    }

    @MainThread
    public void U0() {
        float a02;
        if (this.f1844s == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.u0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.x0(kVar);
                }
            });
            return;
        }
        B();
        if (x() || f0() == 0) {
            if (isVisible()) {
                this.f1827b.v();
                this.f1831f = c.NONE;
            } else {
                this.f1831f = c.RESUME;
            }
        }
        if (!x()) {
            if (h0() < 0.0f) {
                a02 = b0();
            } else {
                a02 = a0();
            }
            f1((int) a02);
            this.f1827b.i();
            if (!isVisible()) {
                this.f1831f = c.NONE;
            }
        }
    }

    @Nullable
    @Deprecated
    public Bitmap V(String str) {
        y0 y0Var;
        com.airbnb.lottie.manager.b W = W();
        if (W != null) {
            return W.a(str);
        }
        k kVar = this.f1826a;
        if (kVar == null) {
            y0Var = null;
        } else {
            y0Var = kVar.j().get(str);
        }
        if (y0Var == null) {
            return null;
        }
        return y0Var.b();
    }

    public void V0() {
        this.f1827b.w();
    }

    @Nullable
    public String X() {
        return this.f1834i;
    }

    public void X0(boolean z4) {
        this.f1852w = z4;
    }

    @Nullable
    public y0 Y(String str) {
        k kVar = this.f1826a;
        if (kVar == null) {
            return null;
        }
        return kVar.j().get(str);
    }

    public void Y0(@Nullable com.airbnb.lottie.a aVar) {
        this.X = aVar;
    }

    public boolean Z() {
        return this.f1842q;
    }

    public void Z0(boolean z4) {
        if (z4 != this.f1853x) {
            this.f1853x = z4;
            invalidateSelf();
        }
    }

    public float a0() {
        return this.f1827b.m();
    }

    public void a1(boolean z4) {
        if (z4 != this.f1843r) {
            this.f1843r = z4;
            com.airbnb.lottie.model.layer.c cVar = this.f1844s;
            if (cVar != null) {
                cVar.S(z4);
            }
            invalidateSelf();
        }
    }

    public float b0() {
        return this.f1827b.n();
    }

    public boolean b1(k kVar) {
        if (this.f1826a == kVar) {
            return false;
        }
        this.M = true;
        A();
        this.f1826a = kVar;
        y();
        this.f1827b.x(kVar);
        w1(this.f1827b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f1832g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(kVar);
            }
            it.remove();
        }
        this.f1832g.clear();
        kVar.z(this.f1848u);
        B();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Nullable
    public i1 c0() {
        k kVar = this.f1826a;
        if (kVar != null) {
            return kVar.o();
        }
        return null;
    }

    public void c1(String str) {
        this.f1838m = str;
        com.airbnb.lottie.manager.a T = T();
        if (T != null) {
            T.c(str);
        }
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float d0() {
        return this.f1827b.j();
    }

    public void d1(com.airbnb.lottie.c cVar) {
        this.f1839n = cVar;
        com.airbnb.lottie.manager.a aVar = this.f1836k;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        if (cVar == null) {
            return;
        }
        boolean N = N();
        if (N) {
            try {
                this.Z.acquire();
            } catch (InterruptedException unused) {
                f.c("Drawable#draw");
                if (N) {
                    this.Z.release();
                    if (cVar.P() == this.f1827b.j()) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                f.c("Drawable#draw");
                if (N) {
                    this.Z.release();
                    if (cVar.P() != this.f1827b.j()) {
                        f1823x0.execute(this.f1849u0);
                    }
                }
                throw th;
            }
        }
        f.b("Drawable#draw");
        if (N && F1()) {
            w1(this.f1827b.j());
        }
        if (this.f1830e) {
            try {
                if (this.f1855z) {
                    S0(canvas, cVar);
                } else {
                    G(canvas);
                }
            } catch (Throwable th2) {
                com.airbnb.lottie.utils.f.c("Lottie crashed in draw!", th2);
            }
        } else if (this.f1855z) {
            S0(canvas, cVar);
        } else {
            G(canvas);
        }
        this.M = false;
        f.c("Drawable#draw");
        if (N) {
            this.Z.release();
            if (cVar.P() == this.f1827b.j()) {
                return;
            }
            f1823x0.execute(this.f1849u0);
        }
    }

    public j1 e0() {
        return this.f1855z ? j1.SOFTWARE : j1.HARDWARE;
    }

    public void e1(@Nullable Map<String, Typeface> map) {
        if (map == this.f1837l) {
            return;
        }
        this.f1837l = map;
        invalidateSelf();
    }

    public int f0() {
        return this.f1827b.getRepeatCount();
    }

    public void f1(final int i5) {
        if (this.f1826a == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.l0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.y0(i5, kVar);
                }
            });
        } else {
            this.f1827b.y(i5);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int g0() {
        return this.f1827b.getRepeatMode();
    }

    public void g1(boolean z4) {
        this.f1829d = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1846t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f1826a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f1826a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h0() {
        return this.f1827b.o();
    }

    public void h1(com.airbnb.lottie.d dVar) {
        this.f1835j = dVar;
        com.airbnb.lottie.manager.b bVar = this.f1833h;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    @Nullable
    public l1 i0() {
        return this.f1840o;
    }

    public void i1(@Nullable String str) {
        this.f1834i = str;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.M) {
            return;
        }
        this.M = true;
        if ((!f1822w0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return n0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface j0(com.airbnb.lottie.model.c cVar) {
        Map<String, Typeface> map = this.f1837l;
        if (map != null) {
            String b5 = cVar.b();
            if (map.containsKey(b5)) {
                return map.get(b5);
            }
            String c5 = cVar.c();
            if (map.containsKey(c5)) {
                return map.get(c5);
            }
            String str = cVar.b() + "-" + cVar.d();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.airbnb.lottie.manager.a T = T();
        if (T != null) {
            return T.b(cVar);
        }
        return null;
    }

    public void j1(boolean z4) {
        this.f1842q = z4;
    }

    public boolean k0() {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        return cVar != null && cVar.Q();
    }

    public void k1(final int i5) {
        if (this.f1826a == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.t0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.A0(i5, kVar);
                }
            });
        } else {
            this.f1827b.z(i5 + 0.99f);
        }
    }

    public boolean l0() {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        return cVar != null && cVar.R();
    }

    public void l1(final String str) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.v0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.z0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l5 = kVar.l(str);
        if (l5 != null) {
            k1((int) (l5.f1510b + l5.f1511c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void m1(@FloatRange(from = 0.0d, to = 1.0d) final float f5) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.j0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.B0(f5, kVar2);
                }
            });
        } else {
            this.f1827b.z(com.airbnb.lottie.utils.k.k(kVar.r(), this.f1826a.f(), f5));
        }
    }

    public boolean n0() {
        com.airbnb.lottie.utils.i iVar = this.f1827b;
        if (iVar == null) {
            return false;
        }
        return iVar.isRunning();
    }

    public void n1(final int i5, final int i6) {
        if (this.f1826a == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.m0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.E0(i5, i6, kVar);
                }
            });
        } else {
            this.f1827b.A(i5, i6 + 0.99f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o0() {
        if (isVisible()) {
            return this.f1827b.isRunning();
        }
        c cVar = this.f1831f;
        if (cVar != c.PLAY && cVar != c.RESUME) {
            return false;
        }
        return true;
    }

    public void o1(final String str) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.n0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.C0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l5 = kVar.l(str);
        if (l5 != null) {
            int i5 = (int) l5.f1510b;
            n1(i5, ((int) l5.f1511c) + i5);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean p0() {
        return this.f1852w;
    }

    public void p1(final String str, final String str2, final boolean z4) {
        float f5;
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.w0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.D0(str, str2, z4, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l5 = kVar.l(str);
        if (l5 != null) {
            int i5 = (int) l5.f1510b;
            com.airbnb.lottie.model.h l6 = this.f1826a.l(str2);
            if (l6 != null) {
                float f6 = l6.f1510b;
                if (z4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                n1(i5, (int) (f6 + f5));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean q0() {
        return this.f1827b.getRepeatCount() == -1;
    }

    public void q1(@FloatRange(from = 0.0d, to = 1.0d) final float f5, @FloatRange(from = 0.0d, to = 1.0d) final float f6) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.q0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.F0(f5, f6, kVar2);
                }
            });
        } else {
            n1((int) com.airbnb.lottie.utils.k.k(kVar.r(), this.f1826a.f(), f5), (int) com.airbnb.lottie.utils.k.k(this.f1826a.r(), this.f1826a.f(), f6));
        }
    }

    public boolean r0() {
        return this.f1841p;
    }

    public void r1(final int i5) {
        if (this.f1826a == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.r0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.G0(i5, kVar);
                }
            });
        } else {
            this.f1827b.B(i5);
        }
    }

    public void s(Animator.AnimatorListener animatorListener) {
        this.f1827b.addListener(animatorListener);
    }

    public void s1(final String str) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.H0(str, kVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l5 = kVar.l(str);
        if (l5 != null) {
            r1((int) l5.f1510b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i5) {
        this.f1846t = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        com.airbnb.lottie.utils.f.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean z6 = !isVisible();
        boolean visible = super.setVisible(z4, z5);
        if (z4) {
            c cVar = this.f1831f;
            if (cVar == c.PLAY) {
                M0();
            } else if (cVar == c.RESUME) {
                U0();
            }
        } else if (this.f1827b.isRunning()) {
            L0();
            this.f1831f = c.RESUME;
        } else if (!z6) {
            this.f1831f = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        M0();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        J();
    }

    @RequiresApi(api = 19)
    public void t(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1827b.addPauseListener(animatorPauseListener);
    }

    public void t1(final float f5) {
        k kVar = this.f1826a;
        if (kVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.s0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar2) {
                    x0.this.I0(f5, kVar2);
                }
            });
        } else {
            r1((int) com.airbnb.lottie.utils.k.k(kVar.r(), this.f1826a.f(), f5));
        }
    }

    public void u(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1827b.addUpdateListener(animatorUpdateListener);
    }

    public void u1(boolean z4) {
        if (this.f1850v == z4) {
            return;
        }
        this.f1850v = z4;
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        if (cVar != null) {
            cVar.K(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public <T> void v(final com.airbnb.lottie.model.e eVar, final T t5, @Nullable final com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f1844s;
        if (cVar == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.s0(eVar, t5, jVar, kVar);
                }
            });
            return;
        }
        boolean z4 = true;
        if (eVar == com.airbnb.lottie.model.e.f1503c) {
            cVar.d(t5, jVar);
        } else if (eVar.d() != null) {
            eVar.d().d(t5, jVar);
        } else {
            List<com.airbnb.lottie.model.e> T0 = T0(eVar);
            for (int i5 = 0; i5 < T0.size(); i5++) {
                T0.get(i5).d().d(t5, jVar);
            }
            z4 = true ^ T0.isEmpty();
        }
        if (z4) {
            invalidateSelf();
            if (t5 == c1.E) {
                w1(d0());
            }
        }
    }

    public void v1(boolean z4) {
        this.f1848u = z4;
        k kVar = this.f1826a;
        if (kVar != null) {
            kVar.z(z4);
        }
    }

    public <T> void w(com.airbnb.lottie.model.e eVar, T t5, com.airbnb.lottie.value.l<T> lVar) {
        v(eVar, t5, new a(lVar));
    }

    public void w1(@FloatRange(from = 0.0d, to = 1.0d) final float f5) {
        if (this.f1826a == null) {
            this.f1832g.add(new b() { // from class: com.airbnb.lottie.p0
                @Override // com.airbnb.lottie.x0.b
                public final void a(k kVar) {
                    x0.this.J0(f5, kVar);
                }
            });
            return;
        }
        f.b("Drawable#setProgress");
        this.f1827b.y(this.f1826a.h(f5));
        f.c("Drawable#setProgress");
    }

    public void x1(j1 j1Var) {
        this.f1854y = j1Var;
        B();
    }

    public void y1(int i5) {
        this.f1827b.setRepeatCount(i5);
    }

    public void z() {
        this.f1832g.clear();
        this.f1827b.cancel();
        if (!isVisible()) {
            this.f1831f = c.NONE;
        }
    }

    public void z1(int i5) {
        this.f1827b.setRepeatMode(i5);
    }
}
