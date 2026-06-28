package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.utils.l;
import com.airbnb.lottie.x0;
import com.airbnb.lottie.y0;

/* loaded from: classes2.dex */
public class d extends b {
    private final Paint H;
    private final Rect I;
    private final Rect J;

    @Nullable
    private final y0 K;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> L;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(x0 x0Var, e eVar) {
        super(x0Var, eVar);
        this.H = new com.airbnb.lottie.animation.a(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = x0Var.Y(eVar.n());
    }

    @Nullable
    private Bitmap P() {
        Bitmap h5;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.M;
        if (aVar != null && (h5 = aVar.h()) != null) {
            return h5;
        }
        Bitmap O = this.f1530p.O(this.f1531q.n());
        if (O != null) {
            return O;
        }
        y0 y0Var = this.K;
        if (y0Var != null) {
            return y0Var.b();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.K) {
            if (jVar == null) {
                this.L = null;
                return;
            } else {
                this.L = new q(jVar);
                return;
            }
        }
        if (t5 == c1.N) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        if (this.K != null) {
            float e5 = l.e();
            rectF.set(0.0f, 0.0f, this.K.g() * e5, this.K.e() * e5);
            this.f1529o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@NonNull Canvas canvas, Matrix matrix, int i5) {
        Bitmap P = P();
        if (P != null && !P.isRecycled() && this.K != null) {
            float e5 = l.e();
            this.H.setAlpha(i5);
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.L;
            if (aVar != null) {
                this.H.setColorFilter(aVar.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.I.set(0, 0, P.getWidth(), P.getHeight());
            if (this.f1530p.Z()) {
                this.J.set(0, 0, (int) (this.K.g() * e5), (int) (this.K.e() * e5));
            } else {
                this.J.set(0, 0, (int) (P.getWidth() * e5), (int) (P.getHeight() * e5));
            }
            canvas.drawBitmap(P, this.I, this.J, this.H);
            canvas.restore();
        }
    }
}
