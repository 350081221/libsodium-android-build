package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a)\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "Lkotlin/r2;", "inset", "radians", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "rotateRad", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(@l DrawTransform drawTransform, float f5, float f6) {
        drawTransform.inset(f5, f6, f5, f6);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        drawTransform.inset(f5, f6, f5, f6);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m4337rotateRad0AR0LA0(@l DrawTransform drawTransform, float f5, long j5) {
        drawTransform.mo4208rotateUv8p0NA(DegreesKt.degrees(f5), j5);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4338rotateRad0AR0LA0$default(DrawTransform drawTransform, float f5, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = drawTransform.mo4206getCenterF1C5BW0();
        }
        drawTransform.mo4208rotateUv8p0NA(DegreesKt.degrees(f5), j5);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m4339scale0AR0LA0(@l DrawTransform drawTransform, float f5, long j5) {
        drawTransform.mo4209scale0AR0LA0(f5, f5, j5);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4340scale0AR0LA0$default(DrawTransform drawTransform, float f5, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = drawTransform.mo4206getCenterF1C5BW0();
        }
        drawTransform.mo4209scale0AR0LA0(f5, f5, j5);
    }

    public static final void inset(@l DrawTransform drawTransform, float f5) {
        drawTransform.inset(f5, f5, f5, f5);
    }
}
