package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,748:1\n74#2:749\n154#3:750\n154#3:751\n154#3:752\n154#3:753\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n245#1:749\n278#1:750\n279#1:751\n280#1:752\n281#1:753\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    @l
    public static final WindowInsets WindowInsets(int i5, int i6, int i7, int i8) {
        return new FixedIntInsets(i5, i6, i7, i8);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = 0;
        }
        if ((i9 & 2) != 0) {
            i6 = 0;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return WindowInsets(i5, i6, i7, i8);
    }

    @l
    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m626WindowInsetsa9UjIt4(float f5, float f6, float f7, float f8) {
        return new FixedDpInsets(f5, f6, f7, f8, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m627WindowInsetsa9UjIt4$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
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
        return m626WindowInsetsa9UjIt4(f5, f6, f7, f8);
    }

    @l
    public static final WindowInsets add(@l WindowInsets windowInsets, @l WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    @l
    public static final WindowInsets asInsets(@l PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    @l
    @Composable
    @ReadOnlyComposable
    public static final PaddingValues asPaddingValues(@l WindowInsets windowInsets, @m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i5, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    @l
    public static final WindowInsets exclude(@l WindowInsets windowInsets, @l WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    @l
    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m628onlybOOhFvg(@l WindowInsets windowInsets, int i5) {
        return new LimitInsets(windowInsets, i5, null);
    }

    @l
    public static final WindowInsets union(@l WindowInsets windowInsets, @l WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    @l
    public static final PaddingValues asPaddingValues(@l WindowInsets windowInsets, @l Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }
}
