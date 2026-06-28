package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0001H\u0086\b¨\u0006\u0010"}, d2 = {"rotationMatrix", "Landroid/graphics/Matrix;", "degrees", "", "px", "py", "scaleMatrix", "sx", "sy", "translationMatrix", "tx", y0.a.f22651s, "times", "m", "values", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes2.dex */
public final class MatrixKt {
    @p4.l
    public static final Matrix rotationMatrix(float f5, float f6, float f7) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f5, f6, f7);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f5, float f6, float f7, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        return rotationMatrix(f5, f6, f7);
    }

    @p4.l
    public static final Matrix scaleMatrix(float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f6);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 1.0f;
        }
        return scaleMatrix(f5, f6);
    }

    @p4.l
    public static final Matrix times(@p4.l Matrix matrix, @p4.l Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @p4.l
    public static final Matrix translationMatrix(float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f5, f6);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        return translationMatrix(f5, f6);
    }

    @p4.l
    public static final float[] values(@p4.l Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
