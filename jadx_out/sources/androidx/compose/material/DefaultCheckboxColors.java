package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "checkmarkColor", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "enabled", "boxColor", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderColor", "checkedCheckmarkColor", "J", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DefaultCheckboxColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.checkedCheckmarkColor = j5;
        this.uncheckedCheckmarkColor = j6;
        this.checkedBoxColor = j7;
        this.uncheckedBoxColor = j8;
        this.disabledCheckedBoxColor = j9;
        this.disabledUncheckedBoxColor = j10;
        this.disabledIndeterminateBoxColor = j11;
        this.checkedBorderColor = j12;
        this.uncheckedBorderColor = j13;
        this.disabledBorderColor = j14;
        this.disabledIndeterminateBorderColor = j15;
    }

    public /* synthetic */ DefaultCheckboxColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15);
    }

    @Override // androidx.compose.material.CheckboxColors
    @l
    @Composable
    public State<Color> borderColor(boolean z4, @l ToggleableState toggleableState, @m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        int i6;
        composer.startReplaceableGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i5, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z4) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    j5 = this.uncheckedBorderColor;
                } else {
                    throw new j0();
                }
            } else {
                j5 = this.checkedBorderColor;
            }
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new j0();
                    }
                } else {
                    j5 = this.disabledIndeterminateBorderColor;
                }
            }
            j5 = this.disabledBorderColor;
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(-796405227);
            if (toggleableState == ToggleableState.Off) {
                i6 = 100;
            } else {
                i6 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(i6, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @l
    @Composable
    public State<Color> boxColor(boolean z4, @l ToggleableState toggleableState, @m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        int i6;
        composer.startReplaceableGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i5, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z4) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    j5 = this.uncheckedBoxColor;
                } else {
                    throw new j0();
                }
            } else {
                j5 = this.checkedBoxColor;
            }
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        j5 = this.disabledUncheckedBoxColor;
                    } else {
                        throw new j0();
                    }
                } else {
                    j5 = this.disabledIndeterminateBoxColor;
                }
            } else {
                j5 = this.disabledCheckedBoxColor;
            }
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(-2010643468);
            if (toggleableState == ToggleableState.Off) {
                i6 = 100;
            } else {
                i6 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(i6, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @l
    @Composable
    public State<Color> checkmarkColor(@l ToggleableState toggleableState, @m Composer composer, int i5) {
        long j5;
        int i6;
        composer.startReplaceableGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i5, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        if (toggleableState == toggleableState2) {
            j5 = this.uncheckedCheckmarkColor;
        } else {
            j5 = this.checkedCheckmarkColor;
        }
        long j6 = j5;
        if (toggleableState == toggleableState2) {
            i6 = 100;
        } else {
            i6 = 50;
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(i6, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }
}
