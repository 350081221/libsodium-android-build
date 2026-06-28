package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class f extends b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(x0 x0Var, e eVar) {
        super(x0Var, eVar);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i5) {
    }
}
