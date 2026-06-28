package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.q;
import com.airbnb.lottie.x0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends b {
    private final com.airbnb.lottie.animation.content.d H;
    private final c I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(x0 x0Var, e eVar, c cVar, k kVar) {
        super(x0Var, eVar);
        this.I = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(x0Var, this, new q("__container", eVar.o(), false), kVar);
        this.H = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void I(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        this.H.e(eVar, i5, list, eVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        this.H.f(rectF, this.f1529o, z4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(@NonNull Canvas canvas, Matrix matrix, int i5) {
        this.H.h(canvas, matrix, i5);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public com.airbnb.lottie.model.content.a w() {
        com.airbnb.lottie.model.content.a w4 = super.w();
        if (w4 != null) {
            return w4;
        }
        return this.I.w();
    }

    @Override // com.airbnb.lottie.model.layer.b
    @Nullable
    public com.airbnb.lottie.parser.j y() {
        com.airbnb.lottie.parser.j y4 = super.y();
        if (y4 != null) {
            return y4;
        }
        return this.I.y();
    }
}
