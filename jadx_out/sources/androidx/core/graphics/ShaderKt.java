package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lkotlin/r2;", "Lkotlin/u;", "block", "transform", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShaderKt {
    public static final void transform(@p4.l Shader shader, @p4.l v3.l<? super Matrix, r2> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
