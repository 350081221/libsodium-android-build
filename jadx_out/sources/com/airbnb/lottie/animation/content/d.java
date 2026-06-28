package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements e, n, a.b, com.airbnb.lottie.model.f {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f931a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f932b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f933c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f934d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f935e;

    /* renamed from: f, reason: collision with root package name */
    private final String f936f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f937g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f938h;

    /* renamed from: i, reason: collision with root package name */
    private final x0 f939i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private List<n> f940j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.p f941k;

    public d(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.q qVar, com.airbnb.lottie.k kVar) {
        this(x0Var, bVar, qVar.c(), qVar.d(), g(x0Var, kVar, bVar, qVar.b()), i(qVar.b()));
    }

    private static List<c> g(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            c a5 = list.get(i5).a(x0Var, kVar, bVar);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        return arrayList;
    }

    @Nullable
    static com.airbnb.lottie.model.animatable.l i(List<com.airbnb.lottie.model.content.c> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i5);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean m() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f938h.size(); i6++) {
            if ((this.f938h.get(i6) instanceof e) && (i5 = i5 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f939i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f938h.size());
        arrayList.addAll(list);
        for (int size = this.f938h.size() - 1; size >= 0; size--) {
            c cVar = this.f938h.get(size);
            cVar.b(arrayList, this.f938h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f941k;
        if (pVar != null) {
            pVar.c(t5, jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        if (!eVar.h(getName(), i5) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            eVar2 = eVar2.a(getName());
            if (eVar.c(getName(), i5)) {
                list.add(eVar2.j(this));
            }
        }
        if (eVar.i(getName(), i5)) {
            int e5 = i5 + eVar.e(getName(), i5);
            for (int i6 = 0; i6 < this.f938h.size(); i6++) {
                c cVar = this.f938h.get(i6);
                if (cVar instanceof com.airbnb.lottie.model.f) {
                    ((com.airbnb.lottie.model.f) cVar).e(eVar, e5, list, eVar2);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f933c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f941k;
        if (pVar != null) {
            this.f933c.preConcat(pVar.f());
        }
        this.f935e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f938h.size() - 1; size >= 0; size--) {
            c cVar = this.f938h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f935e, this.f933c, z4);
                rectF.union(this.f935e);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f936f;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f933c.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.f941k;
        if (pVar != null) {
            this.f933c.set(pVar.f());
        }
        this.f934d.reset();
        if (this.f937g) {
            return this.f934d;
        }
        for (int size = this.f938h.size() - 1; size >= 0; size--) {
            c cVar = this.f938h.get(size);
            if (cVar instanceof n) {
                this.f934d.addPath(((n) cVar).getPath(), this.f933c);
            }
        }
        return this.f934d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        boolean z4;
        int intValue;
        if (this.f937g) {
            return;
        }
        this.f933c.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.f941k;
        if (pVar != null) {
            this.f933c.preConcat(pVar.f());
            if (this.f941k.h() == null) {
                intValue = 100;
            } else {
                intValue = this.f941k.h().h().intValue();
            }
            i5 = (int) ((((intValue / 100.0f) * i5) / 255.0f) * 255.0f);
        }
        if (this.f939i.p0() && m() && i5 != 255) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f932b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f932b, this.f933c, true);
            this.f931a.setAlpha(i5);
            com.airbnb.lottie.utils.l.n(canvas, this.f932b, this.f931a);
        }
        if (z4) {
            i5 = 255;
        }
        for (int size = this.f938h.size() - 1; size >= 0; size--) {
            c cVar = this.f938h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).h(canvas, this.f933c, i5);
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    public List<c> j() {
        return this.f938h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n> k() {
        if (this.f940j == null) {
            this.f940j = new ArrayList();
            for (int i5 = 0; i5 < this.f938h.size(); i5++) {
                c cVar = this.f938h.get(i5);
                if (cVar instanceof n) {
                    this.f940j.add((n) cVar);
                }
            }
        }
        return this.f940j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix l() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.f941k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f933c.reset();
        return this.f933c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, String str, boolean z4, List<c> list, @Nullable com.airbnb.lottie.model.animatable.l lVar) {
        this.f931a = new com.airbnb.lottie.animation.a();
        this.f932b = new RectF();
        this.f933c = new Matrix();
        this.f934d = new Path();
        this.f935e = new RectF();
        this.f936f = str;
        this.f939i = x0Var;
        this.f937g = z4;
        this.f938h = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p b5 = lVar.b();
            this.f941k = b5;
            b5.a(bVar);
            this.f941k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }
}
