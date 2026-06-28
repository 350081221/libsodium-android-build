package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class s implements n, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f1050b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1051c;

    /* renamed from: d, reason: collision with root package name */
    private final x0 f1052d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.m f1053e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private List<t> f1054f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1055g;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1049a = new Path();

    /* renamed from: h, reason: collision with root package name */
    private final b f1056h = new b();

    public s(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.r rVar) {
        this.f1050b = rVar.b();
        this.f1051c = rVar.d();
        this.f1052d = x0Var;
        com.airbnb.lottie.animation.keyframe.m a5 = rVar.c().a();
        this.f1053e = a5;
        bVar.i(a5);
        a5.a(this);
    }

    private void g() {
        this.f1055g = false;
        this.f1052d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < list.size(); i5++) {
            c cVar = list.get(i5);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f1056h.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof t) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((t) cVar);
            }
        }
        this.f1053e.r(arrayList);
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t5 == c1.P) {
            this.f1053e.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1050b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f1055g && !this.f1053e.k()) {
            return this.f1049a;
        }
        this.f1049a.reset();
        if (this.f1051c) {
            this.f1055g = true;
            return this.f1049a;
        }
        Path h5 = this.f1053e.h();
        if (h5 == null) {
            return this.f1049a;
        }
        this.f1049a.set(h5);
        this.f1049a.setFillType(Path.FillType.EVEN_ODD);
        this.f1056h.b(this.f1049a);
        this.f1055g = true;
        return this.f1049a;
    }
}
