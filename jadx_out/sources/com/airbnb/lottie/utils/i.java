package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes2.dex */
public class i extends c implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.k f1762l;

    /* renamed from: d, reason: collision with root package name */
    private float f1754d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1755e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f1756f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f1757g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f1758h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f1759i = 0;

    /* renamed from: j, reason: collision with root package name */
    private float f1760j = -2.14748365E9f;

    /* renamed from: k, reason: collision with root package name */
    private float f1761k = 2.14748365E9f;

    /* renamed from: m, reason: collision with root package name */
    @VisibleForTesting
    protected boolean f1763m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1764n = false;

    private void E() {
        if (this.f1762l == null) {
            return;
        }
        float f5 = this.f1758h;
        if (f5 >= this.f1760j && f5 <= this.f1761k) {
        } else {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f1760j), Float.valueOf(this.f1761k), Float.valueOf(this.f1758h)));
        }
    }

    private float l() {
        com.airbnb.lottie.k kVar = this.f1762l;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f1754d);
    }

    private boolean p() {
        return o() < 0.0f;
    }

    public void A(float f5, float f6) {
        float r5;
        float f7;
        if (f5 <= f6) {
            com.airbnb.lottie.k kVar = this.f1762l;
            if (kVar == null) {
                r5 = -3.4028235E38f;
            } else {
                r5 = kVar.r();
            }
            com.airbnb.lottie.k kVar2 = this.f1762l;
            if (kVar2 == null) {
                f7 = Float.MAX_VALUE;
            } else {
                f7 = kVar2.f();
            }
            float c5 = k.c(f5, r5, f7);
            float c6 = k.c(f6, r5, f7);
            if (c5 != this.f1760j || c6 != this.f1761k) {
                this.f1760j = c5;
                this.f1761k = c6;
                y((int) k.c(this.f1758h, c5, c6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f5), Float.valueOf(f6)));
    }

    public void B(int i5) {
        A(i5, (int) this.f1761k);
    }

    public void C(float f5) {
        this.f1754d = f5;
    }

    public void D(boolean z4) {
        this.f1764n = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.utils.c
    public void a() {
        super.a();
        b(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j5) {
        float n5;
        float m5;
        s();
        if (this.f1762l != null && isRunning()) {
            com.airbnb.lottie.f.b("LottieValueAnimator#doFrame");
            long j6 = this.f1756f;
            long j7 = 0;
            if (j6 != 0) {
                j7 = j5 - j6;
            }
            float l5 = ((float) j7) / l();
            float f5 = this.f1757g;
            if (p()) {
                l5 = -l5;
            }
            float f6 = f5 + l5;
            boolean z4 = !k.e(f6, n(), m());
            float f7 = this.f1757g;
            float c5 = k.c(f6, n(), m());
            this.f1757g = c5;
            if (this.f1764n) {
                c5 = (float) Math.floor(c5);
            }
            this.f1758h = c5;
            this.f1756f = j5;
            if (!this.f1764n || this.f1757g != f7) {
                g();
            }
            if (z4) {
                if (getRepeatCount() != -1 && this.f1759i >= getRepeatCount()) {
                    if (this.f1754d < 0.0f) {
                        m5 = n();
                    } else {
                        m5 = m();
                    }
                    this.f1757g = m5;
                    this.f1758h = m5;
                    t();
                    b(p());
                } else {
                    d();
                    this.f1759i++;
                    if (getRepeatMode() == 2) {
                        this.f1755e = !this.f1755e;
                        w();
                    } else {
                        if (p()) {
                            n5 = m();
                        } else {
                            n5 = n();
                        }
                        this.f1757g = n5;
                        this.f1758h = n5;
                    }
                    this.f1756f = j5;
                }
            }
            E();
            com.airbnb.lottie.f.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getAnimatedFraction() {
        float n5;
        float m5;
        float n6;
        if (this.f1762l == null) {
            return 0.0f;
        }
        if (p()) {
            n5 = m() - this.f1758h;
            m5 = m();
            n6 = n();
        } else {
            n5 = this.f1758h - n();
            m5 = m();
            n6 = n();
        }
        return n5 / (m5 - n6);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.f1762l == null) {
            return 0L;
        }
        return r0.d();
    }

    public void h() {
        this.f1762l = null;
        this.f1760j = -2.14748365E9f;
        this.f1761k = 2.14748365E9f;
    }

    @MainThread
    public void i() {
        t();
        b(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f1763m;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float j() {
        com.airbnb.lottie.k kVar = this.f1762l;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f1758h - kVar.r()) / (this.f1762l.f() - this.f1762l.r());
    }

    public float k() {
        return this.f1758h;
    }

    public float m() {
        com.airbnb.lottie.k kVar = this.f1762l;
        if (kVar == null) {
            return 0.0f;
        }
        float f5 = this.f1761k;
        if (f5 == 2.14748365E9f) {
            return kVar.f();
        }
        return f5;
    }

    public float n() {
        com.airbnb.lottie.k kVar = this.f1762l;
        if (kVar == null) {
            return 0.0f;
        }
        float f5 = this.f1760j;
        if (f5 == -2.14748365E9f) {
            return kVar.r();
        }
        return f5;
    }

    public float o() {
        return this.f1754d;
    }

    @MainThread
    public void q() {
        t();
        c();
    }

    @MainThread
    public void r() {
        float n5;
        this.f1763m = true;
        f(p());
        if (p()) {
            n5 = m();
        } else {
            n5 = n();
        }
        y((int) n5);
        this.f1756f = 0L;
        this.f1759i = 0;
        s();
    }

    protected void s() {
        if (isRunning()) {
            u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i5) {
        super.setRepeatMode(i5);
        if (i5 != 2 && this.f1755e) {
            this.f1755e = false;
            w();
        }
    }

    @MainThread
    protected void t() {
        u(true);
    }

    @MainThread
    protected void u(boolean z4) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z4) {
            this.f1763m = false;
        }
    }

    @MainThread
    public void v() {
        this.f1763m = true;
        s();
        this.f1756f = 0L;
        if (p() && k() == n()) {
            y(m());
        } else if (!p() && k() == m()) {
            y(n());
        }
        e();
    }

    public void w() {
        C(-o());
    }

    public void x(com.airbnb.lottie.k kVar) {
        boolean z4;
        if (this.f1762l == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1762l = kVar;
        if (z4) {
            A(Math.max(this.f1760j, kVar.r()), Math.min(this.f1761k, kVar.f()));
        } else {
            A((int) kVar.r(), (int) kVar.f());
        }
        float f5 = this.f1758h;
        this.f1758h = 0.0f;
        this.f1757g = 0.0f;
        y((int) f5);
        g();
    }

    public void y(float f5) {
        if (this.f1757g == f5) {
            return;
        }
        float c5 = k.c(f5, n(), m());
        this.f1757g = c5;
        if (this.f1764n) {
            c5 = (float) Math.floor(c5);
        }
        this.f1758h = c5;
        this.f1756f = 0L;
        g();
    }

    public void z(float f5) {
        A(this.f1760j, f5);
    }
}
