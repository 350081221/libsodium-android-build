package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class h extends b {
    private final RectF H;
    private final Paint I;
    private final float[] J;
    private final Path K;
    private final e L;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> M;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> N;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(x0 x0Var, e eVar) {
        super(x0Var, eVar);
        this.H = new RectF();
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        this.I = aVar;
        this.J = new float[8];
        this.K = new Path();
        this.L = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.K) {
            if (jVar == null) {
                this.M = null;
                return;
            } else {
                this.M = new q(jVar);
                return;
            }
        }
        if (t5 == c1.f1141a) {
            if (jVar == null) {
                this.N = null;
                this.I.setColor(this.L.p());
            } else {
                this.N = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        this.H.set(0.0f, 0.0f, this.L.r(), this.L.q());
        this.f1529o.mapRect(this.H);
        rectF.set(this.H);
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(Canvas canvas, Matrix matrix, int i5) {
        Integer h5;
        int intValue;
        int alpha = Color.alpha(this.L.p());
        if (alpha == 0) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.N;
        if (aVar == null) {
            h5 = null;
        } else {
            h5 = aVar.h();
        }
        if (h5 != null) {
            this.I.setColor(h5.intValue());
        } else {
            this.I.setColor(this.L.p());
        }
        if (this.f1538x.h() == null) {
            intValue = 100;
        } else {
            intValue = this.f1538x.h().h().intValue();
        }
        int i6 = (int) ((i5 / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.I.setAlpha(i6);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar2 = this.M;
        if (aVar2 != null) {
            this.I.setColorFilter(aVar2.h());
        }
        if (i6 > 0) {
            float[] fArr = this.J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.L.r();
            float[] fArr2 = this.J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.L.r();
            this.J[5] = this.L.q();
            float[] fArr3 = this.J;
            fArr3[6] = 0.0f;
            fArr3[7] = this.L.q();
            matrix.mapPoints(this.J);
            this.K.reset();
            Path path = this.K;
            float[] fArr4 = this.J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.K;
            float[] fArr5 = this.J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.K;
            float[] fArr6 = this.J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.K;
            float[] fArr7 = this.J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.K;
            float[] fArr8 = this.J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.K.close();
            canvas.drawPath(this.K, this.I);
        }
    }
}
