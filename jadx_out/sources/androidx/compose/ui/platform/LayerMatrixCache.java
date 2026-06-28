package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\u0011\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bRD\u0010\u0011\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "Lkotlin/r2;", "invalidate", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "Lv3/p;", "androidMatrixCache", "Landroid/graphics/Matrix;", "previousAndroidMatrix", "matrixCache", "[F", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "isInverseValid", "<init>", "(Lv3/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;

    @p4.m
    private Matrix androidMatrixCache;

    @p4.l
    private final v3.p<T, Matrix, r2> getMatrix;

    @p4.m
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;
    private boolean isInverseValid = true;

    @p4.m
    private float[] matrixCache;

    @p4.m
    private Matrix previousAndroidMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(@p4.l v3.p<? super T, ? super Matrix, r2> pVar) {
        this.getMatrix = pVar;
    }

    @p4.m
    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m5324calculateInverseMatrixbWbORWo(T t5) {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m3964constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m5322invertToJiSxe2E(m5325calculateMatrixGrdbGEg(t5), fArr);
            this.isInverseDirty = false;
        }
        if (!this.isInverseValid) {
            return null;
        }
        return fArr;
    }

    @p4.l
    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m5325calculateMatrixGrdbGEg(T t5) {
        float[] fArr = this.matrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.Matrix.m3964constructorimpl$default(null, 1, null);
            this.matrixCache = fArr;
        }
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t5, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !kotlin.jvm.internal.l0.g(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m3605setFromtUYjHk(fArr, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
