package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi29;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lkotlin/r2;", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "calculateMatrixToWindow", "Landroid/graphics/Matrix;", "tmpMatrix", "Landroid/graphics/Matrix;", "", "tmpPosition", "[I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {

    @p4.l
    private final Matrix tmpMatrix = new Matrix();

    @p4.l
    private final int[] tmpPosition = new int[2];

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    @DoNotInline
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo5298calculateMatrixToWindowEL8BTi8(@p4.l View view, @p4.l float[] fArr) {
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i5 = iArr[0];
        int i6 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate(iArr2[0] - i5, iArr2[1] - i6);
        AndroidMatrixConversions_androidKt.m3605setFromtUYjHk(fArr, this.tmpMatrix);
    }
}
