package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000e\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lkotlin/r2;", "transformMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "transformMatrixToWindow", "Landroid/graphics/Matrix;", "other", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preConcat", "", "x", "y", "preTranslate-3XD1CNM", "([FFF)V", "preTranslate", "calculateMatrixToWindow-EL8BTi8", "calculateMatrixToWindow", "tmpMatrix", "[F", "", "tmpLocation", "[I", "<init>", "([FLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    @p4.l
    private final int[] tmpLocation;

    @p4.l
    private final float[] tmpMatrix;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, kotlin.jvm.internal.w wVar) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m5299preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m3605setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m5296preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m5300preTranslate3XD1CNM(float[] fArr, float f5, float f6) {
        AndroidComposeView_androidKt.m5297preTranslatecG2Xzmc(fArr, f5, f6, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m5301transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m5301transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m5300preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m5300preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m5300preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m5300preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            m5299preConcattUYjHk(fArr, matrix);
        }
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo5298calculateMatrixToWindowEL8BTi8(@p4.l View view, @p4.l float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m3973resetimpl(fArr);
        m5301transformMatrixToWindowEL8BTi8(view, fArr);
    }
}
