package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.t;
import java.util.List;

/* loaded from: classes2.dex */
public class m extends a<com.airbnb.lottie.model.content.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.o f1105i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f1106j;

    /* renamed from: k, reason: collision with root package name */
    private Path f1107k;

    /* renamed from: l, reason: collision with root package name */
    private Path f1108l;

    /* renamed from: m, reason: collision with root package name */
    private List<t> f1109m;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.o>> list) {
        super(list);
        this.f1105i = new com.airbnb.lottie.model.content.o();
        this.f1106j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.o> aVar, float f5) {
        com.airbnb.lottie.model.content.o oVar;
        Path path;
        com.airbnb.lottie.model.content.o oVar2 = aVar.f1782b;
        com.airbnb.lottie.model.content.o oVar3 = aVar.f1783c;
        com.airbnb.lottie.model.content.o oVar4 = this.f1105i;
        if (oVar3 == null) {
            oVar = oVar2;
        } else {
            oVar = oVar3;
        }
        oVar4.c(oVar2, oVar, f5);
        com.airbnb.lottie.model.content.o oVar5 = this.f1105i;
        List<t> list = this.f1109m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar5 = this.f1109m.get(size).c(oVar5);
            }
        }
        com.airbnb.lottie.utils.k.i(oVar5, this.f1106j);
        if (this.f1073e != null) {
            if (this.f1107k == null) {
                this.f1107k = new Path();
                this.f1108l = new Path();
            }
            com.airbnb.lottie.utils.k.i(oVar2, this.f1107k);
            if (oVar3 != null) {
                com.airbnb.lottie.utils.k.i(oVar3, this.f1108l);
            }
            com.airbnb.lottie.value.j<A> jVar = this.f1073e;
            float f6 = aVar.f1787g;
            float floatValue = aVar.f1788h.floatValue();
            Path path2 = this.f1107k;
            if (oVar3 == null) {
                path = path2;
            } else {
                path = this.f1108l;
            }
            return (Path) jVar.b(f6, floatValue, path2, path, f5, e(), f());
        }
        return this.f1106j;
    }

    public void r(@Nullable List<t> list) {
        this.f1109m = list;
    }
}
