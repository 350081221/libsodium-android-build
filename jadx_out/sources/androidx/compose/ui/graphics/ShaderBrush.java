package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", bi.aA, "", "alpha", "Lkotlin/r2;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "internalShader", "Landroid/graphics/Shader;", "createdSize", "J", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@kotlin.jvm.internal.r1({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;

    @p4.m
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo3681applyToPq9zytI(long j5, @p4.l Paint paint, float f5) {
        boolean z4;
        Shader shader = this.internalShader;
        if (shader == null || !Size.m3558equalsimpl0(this.createdSize, j5)) {
            if (Size.m3564isEmptyimpl(j5)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m3570getUnspecifiedNHjbRc();
            } else {
                shader = mo3703createShaderuvyYCjk(j5);
                this.internalShader = shader;
                this.createdSize = j5;
            }
        }
        long mo3607getColor0d7_KjU = paint.mo3607getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m3735equalsimpl0(mo3607getColor0d7_KjU, companion.m3760getBlack0d7_KjU())) {
            paint.mo3613setColor8_81llA(companion.m3760getBlack0d7_KjU());
        }
        if (!kotlin.jvm.internal.l0.g(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            paint.setAlpha(f5);
        }
    }

    @p4.l
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo3703createShaderuvyYCjk(long j5);
}
