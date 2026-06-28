package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:481\n154#2:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n50#1:468\n51#1:469\n52#1:470\n53#1:471\n83#1:472\n84#1:473\n156#1:474\n157#1:475\n158#1:476\n159#1:477\n275#1:478\n285#1:479\n286#1:480\n287#1:481\n288#1:482\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    @l
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m546PaddingValues0680j_4(float f5) {
        return new PaddingValuesImpl(f5, f5, f5, f5, null);
    }

    @Stable
    @l
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m547PaddingValuesYgX7TsA(float f5, float f6) {
        return new PaddingValuesImpl(f5, f6, f5, f6, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m548PaddingValuesYgX7TsA$default(float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        return m547PaddingValuesYgX7TsA(f5, f6);
    }

    @Stable
    @l
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m549PaddingValuesa9UjIt4(float f5, float f6, float f7, float f8) {
        return new PaddingValuesImpl(f5, f6, f7, f8, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m550PaddingValuesa9UjIt4$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }

    @Stable
    @l
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m551absolutePaddingqDBjuR0(@l Modifier modifier, float f5, float f6, float f7, float f8) {
        return modifier.then(new PaddingElement(f5, f6, f7, f8, false, new PaddingKt$absolutePadding$1(f5, f6, f7, f8), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m552absolutePaddingqDBjuR0$default(Modifier modifier, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return m551absolutePaddingqDBjuR0(modifier, f5, f6, f7, f8);
    }

    @Stable
    public static final float calculateEndPadding(@l PaddingValues paddingValues, @l LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@l PaddingValues paddingValues, @l LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @l
    public static final Modifier padding(@l Modifier modifier, @l PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    @Stable
    @l
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m553padding3ABfNKs(@l Modifier modifier, float f5) {
        return modifier.then(new PaddingElement(f5, f5, f5, f5, true, new PaddingKt$padding$3(f5), null));
    }

    @Stable
    @l
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m554paddingVpY3zN4(@l Modifier modifier, float f5, float f6) {
        return modifier.then(new PaddingElement(f5, f6, f5, f6, true, new PaddingKt$padding$2(f5, f6), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m555paddingVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        return m554paddingVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m556paddingqDBjuR0(@l Modifier modifier, float f5, float f6, float f7, float f8) {
        return modifier.then(new PaddingElement(f5, f6, f7, f8, true, new PaddingKt$padding$1(f5, f6, f7, f8), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m557paddingqDBjuR0$default(Modifier modifier, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return m556paddingqDBjuR0(modifier, f5, f6, f7, f8);
    }
}
