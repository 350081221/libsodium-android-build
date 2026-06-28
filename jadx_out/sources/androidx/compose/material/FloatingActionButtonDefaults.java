package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,413:1\n154#2:414\n154#2:415\n154#2:416\n154#2:417\n154#2:418\n154#2:419\n154#2:420\n154#2:421\n83#3,3:422\n1116#4,6:425\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n219#1:414\n220#1:415\n224#1:416\n225#1:417\n243#1:418\n244#1:419\n245#1:420\n246#1:421\n248#1:422,3\n248#1:425,6\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @l
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    @k(level = m.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1357elevationixp7dh8(float f5, float f6, Composer composer, int i5, int i6) {
        float f7;
        float f8;
        composer.startReplaceableGroup(-654132828);
        if ((i6 & 1) != 0) {
            f7 = Dp.m6044constructorimpl(6);
        } else {
            f7 = f5;
        }
        if ((i6 & 2) != 0) {
            f8 = Dp.m6044constructorimpl(12);
        } else {
            f8 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i5, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:220)");
        }
        float f9 = 8;
        FloatingActionButtonElevation m1358elevationxZ9QkE = m1358elevationxZ9QkE(f7, f8, Dp.m6044constructorimpl(f9), Dp.m6044constructorimpl(f9), composer, (i5 & 14) | 3456 | (i5 & 112) | ((i5 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1358elevationxZ9QkE;
    }

    @l
    @Composable
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1358elevationxZ9QkE(float f5, float f6, float f7, float f8, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(380403812);
        if ((i6 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(6);
        }
        float f9 = f5;
        if ((i6 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(12);
        }
        float f10 = f6;
        if ((i6 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(8);
        }
        float f11 = f7;
        if ((i6 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(8);
        }
        float f12 = f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i5, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:246)");
        }
        Object[] objArr = {Dp.m6042boximpl(f9), Dp.m6042boximpl(f10), Dp.m6042boximpl(f11), Dp.m6042boximpl(f12)};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i7 = 0; i7 < 4; i7++) {
            z4 |= composer.changed(objArr[i7]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFloatingActionButtonElevation(f9, f10, f11, f12, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation;
    }
}
