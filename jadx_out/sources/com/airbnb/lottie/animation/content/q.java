package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1034a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f1035b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final x0 f1036c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f1037d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1038e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1039f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1040g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1041h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f1042i;

    /* renamed from: j, reason: collision with root package name */
    private d f1043j;

    public q(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.f1036c = x0Var;
        this.f1037d = bVar;
        this.f1038e = mVar.c();
        this.f1039f = mVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = mVar.b().a();
        this.f1040g = a5;
        bVar.i(a5);
        a5.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = mVar.d().a();
        this.f1041h = a6;
        bVar.i(a6);
        a6.a(this);
        com.airbnb.lottie.animation.keyframe.p b5 = mVar.e().b();
        this.f1042i = b5;
        b5.a(bVar);
        b5.b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f1036c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        this.f1043j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (this.f1042i.c(t5, jVar)) {
            return;
        }
        if (t5 == c1.f1161u) {
            this.f1040g.o(jVar);
        } else if (t5 == c1.f1162v) {
            this.f1041h.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
        for (int i6 = 0; i6 < this.f1043j.j().size(); i6++) {
            c cVar = this.f1043j.j().get(i6);
            if (cVar instanceof k) {
                com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f1043j.f(rectF, matrix, z4);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        if (this.f1043j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f1043j = new d(this.f1036c, this.f1037d, "Repeater", this.f1039f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1038e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        Path path = this.f1043j.getPath();
        this.f1035b.reset();
        float floatValue = this.f1040g.h().floatValue();
        float floatValue2 = this.f1041h.h().floatValue();
        for (int i5 = ((int) floatValue) - 1; i5 >= 0; i5--) {
            this.f1034a.set(this.f1042i.g(i5 + floatValue2));
            this.f1035b.addPath(path, this.f1034a);
        }
        return this.f1035b;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        float floatValue = this.f1040g.h().floatValue();
        float floatValue2 = this.f1041h.h().floatValue();
        float floatValue3 = this.f1042i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f1042i.e().h().floatValue() / 100.0f;
        for (int i6 = ((int) floatValue) - 1; i6 >= 0; i6--) {
            this.f1034a.set(matrix);
            float f5 = i6;
            this.f1034a.preConcat(this.f1042i.g(f5 + floatValue2));
            this.f1043j.h(canvas, this.f1034a, (int) (i5 * com.airbnb.lottie.utils.k.k(floatValue3, floatValue4, f5 / floatValue)));
        }
    }
}
