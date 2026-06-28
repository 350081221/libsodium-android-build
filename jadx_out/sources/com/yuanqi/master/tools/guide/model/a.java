package com.yuanqi.master.tools.guide.model;

import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.yuanqi.master.tools.guide.model.b;
import com.yuanqi.master.tools.guide.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private List<b> f15159a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f15160b = true;

    /* renamed from: c, reason: collision with root package name */
    private int f15161c;

    /* renamed from: d, reason: collision with root package name */
    private int f15162d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f15163e;

    /* renamed from: f, reason: collision with root package name */
    private y2.d f15164f;

    /* renamed from: g, reason: collision with root package name */
    private y2.c f15165g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f15166h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f15167i;

    public static a D() {
        return new a();
    }

    public List<f> A() {
        f fVar;
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f15159a.iterator();
        while (it.hasNext()) {
            c options = it.next().getOptions();
            if (options != null && (fVar = options.f15169b) != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public boolean B() {
        return this.f15162d == 0 && this.f15159a.size() == 0;
    }

    public boolean C() {
        return this.f15160b;
    }

    public a E(@ColorInt int i5) {
        this.f15161c = i5;
        return this;
    }

    public a F(Animation animation) {
        this.f15166h = animation;
        return this;
    }

    public a G(boolean z4) {
        this.f15160b = z4;
        return this;
    }

    public a H(Animation animation) {
        this.f15167i = animation;
        return this;
    }

    public a I(@LayoutRes int i5, int... iArr) {
        this.f15162d = i5;
        this.f15163e = iArr;
        return this;
    }

    public a J(y2.d dVar) {
        this.f15164f = dVar;
        return this;
    }

    public a a(RectF rectF) {
        return d(rectF, b.a.RECTANGLE, 0, null);
    }

    public a b(RectF rectF, b.a aVar) {
        return d(rectF, aVar, 0, null);
    }

    public a c(RectF rectF, b.a aVar, int i5) {
        return d(rectF, aVar, i5, null);
    }

    public a d(RectF rectF, b.a aVar, int i5, f fVar) {
        d dVar = new d(rectF, aVar, i5);
        if (fVar != null) {
            fVar.f15183a = dVar;
            dVar.c(new c.a().e(fVar).a());
        }
        this.f15159a.add(dVar);
        return this;
    }

    public a e(RectF rectF, b.a aVar, f fVar) {
        return d(rectF, aVar, 0, fVar);
    }

    public a f(RectF rectF, f fVar) {
        return d(rectF, b.a.RECTANGLE, 0, fVar);
    }

    public a g(View view) {
        return j(view, b.a.RECTANGLE, 0, 0, null);
    }

    public a h(View view, b.a aVar) {
        return j(view, aVar, 0, 0, null);
    }

    public a i(View view, b.a aVar, int i5) {
        return j(view, aVar, 0, i5, null);
    }

    public a j(View view, b.a aVar, int i5, int i6, @Nullable f fVar) {
        e eVar = new e(view, aVar, i5, i6);
        if (fVar != null) {
            fVar.f15183a = eVar;
            eVar.d(new c.a().e(fVar).a());
        }
        this.f15159a.add(eVar);
        return this;
    }

    public a k(View view, b.a aVar, int i5, f fVar) {
        return j(view, aVar, 0, i5, fVar);
    }

    public a l(View view, b.a aVar, f fVar) {
        return j(view, aVar, 0, 0, fVar);
    }

    public a m(View view, f fVar) {
        return j(view, b.a.RECTANGLE, 0, 0, fVar);
    }

    public a n(RectF rectF, b.a aVar, int i5, c cVar) {
        f fVar;
        d dVar = new d(rectF, aVar, i5);
        if (cVar != null && (fVar = cVar.f15169b) != null) {
            fVar.f15183a = dVar;
        }
        dVar.c(cVar);
        this.f15159a.add(dVar);
        return this;
    }

    public a o(RectF rectF, b.a aVar, c cVar) {
        return n(rectF, aVar, 0, cVar);
    }

    public a p(RectF rectF, c cVar) {
        return n(rectF, b.a.RECTANGLE, 0, cVar);
    }

    public a q(View view, b.a aVar, int i5, int i6, c cVar) {
        f fVar;
        e eVar = new e(view, aVar, i5, i6);
        if (cVar != null && (fVar = cVar.f15169b) != null) {
            fVar.f15183a = eVar;
        }
        eVar.d(cVar);
        this.f15159a.add(eVar);
        return this;
    }

    public a r(View view, b.a aVar, c cVar) {
        return q(view, aVar, 0, 0, cVar);
    }

    public a s(View view, c cVar) {
        return q(view, b.a.RECTANGLE, 0, 0, cVar);
    }

    public int t() {
        return this.f15161c;
    }

    public int[] u() {
        return this.f15163e;
    }

    public Animation v() {
        return this.f15166h;
    }

    public Animation w() {
        return this.f15167i;
    }

    public List<b> x() {
        return this.f15159a;
    }

    public int y() {
        return this.f15162d;
    }

    public y2.d z() {
        return this.f15164f;
    }
}
