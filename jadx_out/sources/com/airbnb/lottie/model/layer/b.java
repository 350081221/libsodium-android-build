package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.model.content.o;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.utils.l;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, com.airbnb.lottie.model.f {
    private static final int D = 2;
    private static final int E = 16;
    private static final int F = 1;
    private static final int G = 19;

    @Nullable
    private Paint A;
    float B;

    @Nullable
    BlurMaskFilter C;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1515a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f1516b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1517c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f1518d = new com.airbnb.lottie.animation.a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f1519e = new com.airbnb.lottie.animation.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f, reason: collision with root package name */
    private final Paint f1520f = new com.airbnb.lottie.animation.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g, reason: collision with root package name */
    private final Paint f1521g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f1522h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f1523i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f1524j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f1525k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f1526l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f1527m;

    /* renamed from: n, reason: collision with root package name */
    private final String f1528n;

    /* renamed from: o, reason: collision with root package name */
    final Matrix f1529o;

    /* renamed from: p, reason: collision with root package name */
    final x0 f1530p;

    /* renamed from: q, reason: collision with root package name */
    final e f1531q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.h f1532r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.d f1533s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private b f1534t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    private b f1535u;

    /* renamed from: v, reason: collision with root package name */
    private List<b> f1536v;

    /* renamed from: w, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f1537w;

    /* renamed from: x, reason: collision with root package name */
    final p f1538x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1539y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1540z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1541a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1542b;

        static {
            int[] iArr = new int[i.a.values().length];
            f1542b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1542b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1542b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1542b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f1541a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1541a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1541a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1541a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1541a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1541a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1541a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(x0 x0Var, e eVar) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f1521g = aVar;
        this.f1522h = new com.airbnb.lottie.animation.a(PorterDuff.Mode.CLEAR);
        this.f1523i = new RectF();
        this.f1524j = new RectF();
        this.f1525k = new RectF();
        this.f1526l = new RectF();
        this.f1527m = new RectF();
        this.f1529o = new Matrix();
        this.f1537w = new ArrayList();
        this.f1539y = true;
        this.B = 0.0f;
        this.f1530p = x0Var;
        this.f1531q = eVar;
        this.f1528n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p b5 = eVar.x().b();
        this.f1538x = b5;
        b5.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(eVar.h());
            this.f1532r = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 : this.f1532r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    private void C(RectF rectF, Matrix matrix) {
        this.f1525k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!A()) {
            return;
        }
        int size = this.f1532r.b().size();
        for (int i5 = 0; i5 < size; i5++) {
            com.airbnb.lottie.model.content.i iVar = this.f1532r.b().get(i5);
            Path h5 = this.f1532r.a().get(i5).h();
            if (h5 != null) {
                this.f1515a.set(h5);
                this.f1515a.transform(matrix);
                int i6 = a.f1542b[iVar.a().ordinal()];
                if (i6 != 1 && i6 != 2) {
                    if ((i6 == 3 || i6 == 4) && iVar.d()) {
                        return;
                    }
                    this.f1515a.computeBounds(this.f1527m, false);
                    if (i5 == 0) {
                        this.f1525k.set(this.f1527m);
                    } else {
                        RectF rectF2 = this.f1525k;
                        rectF2.set(Math.min(rectF2.left, this.f1527m.left), Math.min(this.f1525k.top, this.f1527m.top), Math.max(this.f1525k.right, this.f1527m.right), Math.max(this.f1525k.bottom, this.f1527m.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.f1525k)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        if (!B() || this.f1531q.i() == e.b.INVERT) {
            return;
        }
        this.f1526l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f1534t.f(this.f1526l, matrix, true);
        if (!rectF.intersect(this.f1526l)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E() {
        this.f1530p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        N(this.f1533s.q() == 1.0f);
    }

    private void G(float f5) {
        this.f1530p.R().o().e(this.f1531q.j(), f5);
    }

    private void N(boolean z4) {
        if (z4 != this.f1539y) {
            this.f1539y = z4;
            E();
        }
    }

    private void O() {
        boolean z4 = true;
        if (!this.f1531q.f().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f1531q.f());
            this.f1533s = dVar;
            dVar.m();
            this.f1533s.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
                @Override // com.airbnb.lottie.animation.keyframe.a.b
                public final void a() {
                    b.this.F();
                }
            });
            if (this.f1533s.h().floatValue() != 1.0f) {
                z4 = false;
            }
            N(z4);
            i(this.f1533s);
            return;
        }
        N(true);
    }

    private void j(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        this.f1518d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f1515a, this.f1518d);
    }

    private void k(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f1523i, this.f1519e);
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        this.f1518d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f1515a, this.f1518d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f1523i, this.f1518d);
        canvas.drawRect(this.f1523i, this.f1518d);
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        this.f1518d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f1515a, this.f1520f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f1523i, this.f1519e);
        canvas.drawRect(this.f1523i, this.f1518d);
        this.f1520f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        canvas.drawPath(this.f1515a, this.f1520f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        l.n(canvas, this.f1523i, this.f1520f);
        canvas.drawRect(this.f1523i, this.f1518d);
        this.f1520f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        canvas.drawPath(this.f1515a, this.f1520f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.f.b("Layer#saveLayer");
        l.o(canvas, this.f1523i, this.f1519e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.f.c("Layer#saveLayer");
        for (int i5 = 0; i5 < this.f1532r.b().size(); i5++) {
            com.airbnb.lottie.model.content.i iVar = this.f1532r.b().get(i5);
            com.airbnb.lottie.animation.keyframe.a<o, Path> aVar = this.f1532r.a().get(i5);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f1532r.c().get(i5);
            int i6 = a.f1542b[iVar.a().ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            if (iVar.d()) {
                                l(canvas, matrix, aVar, aVar2);
                            } else {
                                j(canvas, matrix, aVar, aVar2);
                            }
                        }
                    } else if (iVar.d()) {
                        m(canvas, matrix, aVar, aVar2);
                    } else {
                        k(canvas, matrix, aVar, aVar2);
                    }
                } else {
                    if (i5 == 0) {
                        this.f1518d.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f1518d.setAlpha(255);
                        canvas.drawRect(this.f1523i, this.f1518d);
                    }
                    if (iVar.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                }
            } else if (q()) {
                this.f1518d.setAlpha(255);
                canvas.drawRect(this.f1523i, this.f1518d);
            }
        }
        com.airbnb.lottie.f.b("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.f.c("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<o, Path> aVar) {
        this.f1515a.set(aVar.h());
        this.f1515a.transform(matrix);
        canvas.drawPath(this.f1515a, this.f1520f);
    }

    private boolean q() {
        if (this.f1532r.a().isEmpty()) {
            return false;
        }
        for (int i5 = 0; i5 < this.f1532r.b().size(); i5++) {
            if (this.f1532r.b().get(i5).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f1536v != null) {
            return;
        }
        if (this.f1535u == null) {
            this.f1536v = Collections.emptyList();
            return;
        }
        this.f1536v = new ArrayList();
        for (b bVar = this.f1535u; bVar != null; bVar = bVar.f1535u) {
            this.f1536v.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.f.b("Layer#clearLayer");
        RectF rectF = this.f1523i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f1522h);
        com.airbnb.lottie.f.c("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static b u(c cVar, e eVar, x0 x0Var, k kVar) {
        switch (a.f1541a[eVar.g().ordinal()]) {
            case 1:
                return new g(x0Var, eVar, cVar, kVar);
            case 2:
                return new c(x0Var, eVar, kVar.p(eVar.n()), kVar);
            case 3:
                return new h(x0Var, eVar);
            case 4:
                return new d(x0Var, eVar);
            case 5:
                return new f(x0Var, eVar);
            case 6:
                return new i(x0Var, eVar);
            default:
                com.airbnb.lottie.utils.f.e("Unknown layer type " + eVar.g());
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f1532r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.f1534t != null;
    }

    public void H(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f1537w.remove(aVar);
    }

    void I(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(@Nullable b bVar) {
        this.f1534t = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z4) {
        if (z4 && this.A == null) {
            this.A = new com.airbnb.lottie.animation.a();
        }
        this.f1540z = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@Nullable b bVar) {
        this.f1535u = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        com.airbnb.lottie.f.b("BaseLayer#setProgress");
        com.airbnb.lottie.f.b("BaseLayer#setProgress.transform");
        this.f1538x.j(f5);
        com.airbnb.lottie.f.c("BaseLayer#setProgress.transform");
        if (this.f1532r != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.mask");
            for (int i5 = 0; i5 < this.f1532r.a().size(); i5++) {
                this.f1532r.a().get(i5).n(f5);
            }
            com.airbnb.lottie.f.c("BaseLayer#setProgress.mask");
        }
        if (this.f1533s != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.inout");
            this.f1533s.n(f5);
            com.airbnb.lottie.f.c("BaseLayer#setProgress.inout");
        }
        if (this.f1534t != null) {
            com.airbnb.lottie.f.b("BaseLayer#setProgress.matte");
            this.f1534t.M(f5);
            com.airbnb.lottie.f.c("BaseLayer#setProgress.matte");
        }
        com.airbnb.lottie.f.b("BaseLayer#setProgress.animations." + this.f1537w.size());
        for (int i6 = 0; i6 < this.f1537w.size(); i6++) {
            this.f1537w.get(i6).n(f5);
        }
        com.airbnb.lottie.f.c("BaseLayer#setProgress.animations." + this.f1537w.size());
        com.airbnb.lottie.f.c("BaseLayer#setProgress");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        E();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.f
    @CallSuper
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        this.f1538x.c(t5, jVar);
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        b bVar = this.f1534t;
        if (bVar != null) {
            com.airbnb.lottie.model.e a5 = eVar2.a(bVar.getName());
            if (eVar.c(this.f1534t.getName(), i5)) {
                list.add(a5.j(this.f1534t));
            }
            if (eVar.i(getName(), i5)) {
                this.f1534t.I(eVar, eVar.e(this.f1534t.getName(), i5) + i5, list, a5);
            }
        }
        if (!eVar.h(getName(), i5)) {
            return;
        }
        if (!"__container".equals(getName())) {
            eVar2 = eVar2.a(getName());
            if (eVar.c(getName(), i5)) {
                list.add(eVar2.j(this));
            }
        }
        if (eVar.i(getName(), i5)) {
            I(eVar, i5 + eVar.e(getName(), i5), list, eVar2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    @CallSuper
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f1523i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f1529o.set(matrix);
        if (z4) {
            List<b> list = this.f1536v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1529o.preConcat(this.f1536v.get(size).f1538x.f());
                }
            } else {
                b bVar = this.f1535u;
                if (bVar != null) {
                    this.f1529o.preConcat(bVar.f1538x.f());
                }
            }
        }
        this.f1529o.preConcat(this.f1538x.f());
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1531q.j();
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        int i6;
        Paint paint;
        Integer h5;
        com.airbnb.lottie.f.b(this.f1528n);
        if (this.f1539y && !this.f1531q.y()) {
            r();
            com.airbnb.lottie.f.b("Layer#parentMatrix");
            this.f1516b.reset();
            this.f1516b.set(matrix);
            for (int size = this.f1536v.size() - 1; size >= 0; size--) {
                this.f1516b.preConcat(this.f1536v.get(size).f1538x.f());
            }
            com.airbnb.lottie.f.c("Layer#parentMatrix");
            com.airbnb.lottie.animation.keyframe.a<?, Integer> h6 = this.f1538x.h();
            if (h6 != null && (h5 = h6.h()) != null) {
                i6 = h5.intValue();
            } else {
                i6 = 100;
            }
            int i7 = (int) ((((i5 / 255.0f) * i6) / 100.0f) * 255.0f);
            if (!B() && !A()) {
                this.f1516b.preConcat(this.f1538x.f());
                com.airbnb.lottie.f.b("Layer#drawLayer");
                t(canvas, this.f1516b, i7);
                com.airbnb.lottie.f.c("Layer#drawLayer");
                G(com.airbnb.lottie.f.c(this.f1528n));
                return;
            }
            com.airbnb.lottie.f.b("Layer#computeBounds");
            f(this.f1523i, this.f1516b, false);
            D(this.f1523i, matrix);
            this.f1516b.preConcat(this.f1538x.f());
            C(this.f1523i, this.f1516b);
            this.f1524j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f1517c);
            if (!this.f1517c.isIdentity()) {
                Matrix matrix2 = this.f1517c;
                matrix2.invert(matrix2);
                this.f1517c.mapRect(this.f1524j);
            }
            if (!this.f1523i.intersect(this.f1524j)) {
                this.f1523i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.f.c("Layer#computeBounds");
            if (this.f1523i.width() >= 1.0f && this.f1523i.height() >= 1.0f) {
                com.airbnb.lottie.f.b("Layer#saveLayer");
                this.f1518d.setAlpha(255);
                l.n(canvas, this.f1523i, this.f1518d);
                com.airbnb.lottie.f.c("Layer#saveLayer");
                s(canvas);
                com.airbnb.lottie.f.b("Layer#drawLayer");
                t(canvas, this.f1516b, i7);
                com.airbnb.lottie.f.c("Layer#drawLayer");
                if (A()) {
                    o(canvas, this.f1516b);
                }
                if (B()) {
                    com.airbnb.lottie.f.b("Layer#drawMatte");
                    com.airbnb.lottie.f.b("Layer#saveLayer");
                    l.o(canvas, this.f1523i, this.f1521g, 19);
                    com.airbnb.lottie.f.c("Layer#saveLayer");
                    s(canvas);
                    this.f1534t.h(canvas, matrix, i7);
                    com.airbnb.lottie.f.b("Layer#restoreLayer");
                    canvas.restore();
                    com.airbnb.lottie.f.c("Layer#restoreLayer");
                    com.airbnb.lottie.f.c("Layer#drawMatte");
                }
                com.airbnb.lottie.f.b("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.f.c("Layer#restoreLayer");
            }
            if (this.f1540z && (paint = this.A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.A.setColor(-251901);
                this.A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f1523i, this.A);
                this.A.setStyle(Paint.Style.FILL);
                this.A.setColor(1357638635);
                canvas.drawRect(this.f1523i, this.A);
            }
            G(com.airbnb.lottie.f.c(this.f1528n));
            return;
        }
        com.airbnb.lottie.f.c(this.f1528n);
    }

    public void i(@Nullable com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f1537w.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i5);

    public com.airbnb.lottie.model.content.h v() {
        return this.f1531q.a();
    }

    @Nullable
    public com.airbnb.lottie.model.content.a w() {
        return this.f1531q.b();
    }

    public BlurMaskFilter x(float f5) {
        if (this.B == f5) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f5 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f5;
        return blurMaskFilter;
    }

    @Nullable
    public com.airbnb.lottie.parser.j y() {
        return this.f1531q.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e z() {
        return this.f1531q;
    }
}
