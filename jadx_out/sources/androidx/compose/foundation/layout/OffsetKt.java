package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u001a#\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "absoluteOffset-VpY3zN4", "absoluteOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/u;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n154#2:257\n154#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @l
    public static final Modifier absoluteOffset(@l Modifier modifier, @l v3.l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, false, new OffsetKt$absoluteOffset$2(lVar)));
    }

    @Stable
    @l
    /* renamed from: absoluteOffset-VpY3zN4 */
    public static final Modifier m511absoluteOffsetVpY3zN4(@l Modifier modifier, float f5, float f6) {
        return modifier.then(new OffsetElement(f5, f6, false, new OffsetKt$absoluteOffset$1(f5, f6), null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default */
    public static /* synthetic */ Modifier m512absoluteOffsetVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        return m511absoluteOffsetVpY3zN4(modifier, f5, f6);
    }

    @l
    public static final Modifier offset(@l Modifier modifier, @l v3.l<? super Density, IntOffset> lVar) {
        return modifier.then(new OffsetPxElement(lVar, true, new OffsetKt$offset$2(lVar)));
    }

    @Stable
    @l
    /* renamed from: offset-VpY3zN4 */
    public static final Modifier m513offsetVpY3zN4(@l Modifier modifier, float f5, float f6) {
        return modifier.then(new OffsetElement(f5, f6, true, new OffsetKt$offset$1(f5, f6), null));
    }

    /* renamed from: offset-VpY3zN4$default */
    public static /* synthetic */ Modifier m514offsetVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        return m513offsetVpY3zN4(modifier, f5, f6);
    }
}
