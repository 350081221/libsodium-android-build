package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.utils.l;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends b {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> H;
    private final List<b> I;
    private final RectF J;
    private final RectF K;
    private final Paint L;

    @Nullable
    private Boolean M;

    @Nullable
    private Boolean N;
    private float O;
    private boolean P;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1543a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1543a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1543a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(x0 x0Var, e eVar, List<e> list, k kVar) {
        super(x0Var, eVar);
        int i5;
        b bVar;
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.P = true;
        com.airbnb.lottie.model.animatable.b v4 = eVar.v();
        if (v4 != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = v4.a();
            this.H = a5;
            i(a5);
            this.H.a(this);
        } else {
            this.H = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(kVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b u4 = b.u(this, eVar2, x0Var, kVar);
            if (u4 != null) {
                longSparseArray.put(u4.z().e(), u4);
                if (bVar2 != null) {
                    bVar2.J(u4);
                    bVar2 = null;
                } else {
                    this.I.add(0, u4);
                    int i6 = a.f1543a[eVar2.i().ordinal()];
                    if (i6 == 1 || i6 == 2) {
                        bVar2 = u4;
                    }
                }
            }
            size--;
        }
        for (i5 = 0; i5 < longSparseArray.size(); i5++) {
            b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i5));
            if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.z().k())) != null) {
                bVar3.L(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void I(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        for (int i6 = 0; i6 < this.I.size(); i6++) {
            this.I.get(i6).e(eVar, i5, list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void K(boolean z4) {
        super.K(z4);
        Iterator<b> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().K(z4);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void M(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        com.airbnb.lottie.f.b("CompositionLayer#setProgress");
        this.O = f5;
        super.M(f5);
        if (this.H != null) {
            f5 = ((this.H.h().floatValue() * this.f1531q.c().i()) - this.f1531q.c().r()) / (this.f1530p.R().e() + 0.01f);
        }
        if (this.H == null) {
            f5 -= this.f1531q.s();
        }
        if (this.f1531q.w() != 0.0f && !"__container".equals(this.f1531q.j())) {
            f5 /= this.f1531q.w();
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).M(f5);
        }
        com.airbnb.lottie.f.c("CompositionLayer#setProgress");
    }

    public float P() {
        return this.O;
    }

    public boolean Q() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                b bVar = this.I.get(size);
                if (bVar instanceof g) {
                    if (bVar.A()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).Q()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean R() {
        if (this.M == null) {
            if (B()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).B()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void S(boolean z4) {
        this.P = z4;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.H;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar);
            this.H = qVar;
            qVar.a(this);
            i(this.H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).f(this.J, this.f1529o, true);
            rectF.union(this.J);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        com.airbnb.lottie.f.b("CompositionLayer#draw");
        this.K.set(0.0f, 0.0f, this.f1531q.m(), this.f1531q.l());
        matrix.mapRect(this.K);
        if (this.f1530p.p0() && this.I.size() > 1 && i5 != 255) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.L.setAlpha(i5);
            l.n(canvas, this.K, this.L);
        } else {
            canvas.save();
        }
        if (z4) {
            i5 = 255;
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            if (!this.P && "__container".equals(this.f1531q.j())) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 && !this.K.isEmpty()) {
                z6 = canvas.clipRect(this.K);
            } else {
                z6 = true;
            }
            if (z6) {
                this.I.get(size).h(canvas, matrix, i5);
            }
        }
        canvas.restore();
        com.airbnb.lottie.f.c("CompositionLayer#draw");
    }
}
