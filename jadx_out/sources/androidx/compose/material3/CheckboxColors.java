package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0013\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020!H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b,\u0010%R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b-\u0010%R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b.\u0010%R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b/\u0010%R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b0\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/CheckboxColors;", "copy", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "checkmarkColor", "", "enabled", "boxColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "borderColor$material3_release", "borderColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getCheckedCheckmarkColor-0d7_KjU", "()J", "getUncheckedCheckmarkColor-0d7_KjU", "getCheckedBoxColor-0d7_KjU", "getUncheckedBoxColor-0d7_KjU", "getDisabledCheckedBoxColor-0d7_KjU", "getDisabledUncheckedBoxColor-0d7_KjU", "getDisabledIndeterminateBoxColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getDisabledBorderColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledIndeterminateBorderColor-0d7_KjU", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,597:1\n658#2:598\n646#2:599\n658#2:600\n646#2:601\n658#2:602\n646#2:603\n658#2:604\n646#2:605\n658#2:606\n646#2:607\n658#2:608\n646#2:609\n658#2:610\n646#2:611\n658#2:612\n646#2:613\n658#2:614\n646#2:615\n658#2:616\n646#2:617\n658#2:618\n646#2:619\n658#2:620\n646#2:621\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n457#1:598\n457#1:599\n458#1:600\n458#1:601\n459#1:602\n459#1:603\n460#1:604\n460#1:605\n461#1:606\n461#1:607\n462#1:608\n462#1:609\n463#1:610\n463#1:611\n464#1:612\n464#1:613\n465#1:614\n465#1:615\n466#1:616\n466#1:617\n467#1:618\n467#1:619\n468#1:620\n468#1:621\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
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

    private CheckboxColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.disabledUncheckedBorderColor = j15;
        this.disabledIndeterminateBorderColor = j16;
    }

    public /* synthetic */ CheckboxColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m1628copy2qZNXz8$default(CheckboxColors checkboxColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i5, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        if ((i5 & 1) != 0) {
            j17 = checkboxColors.checkedCheckmarkColor;
        } else {
            j17 = j5;
        }
        if ((i5 & 2) != 0) {
            j18 = checkboxColors.uncheckedCheckmarkColor;
        } else {
            j18 = j6;
        }
        if ((i5 & 4) != 0) {
            j19 = checkboxColors.checkedBoxColor;
        } else {
            j19 = j7;
        }
        if ((i5 & 8) != 0) {
            j20 = checkboxColors.uncheckedBoxColor;
        } else {
            j20 = j8;
        }
        if ((i5 & 16) != 0) {
            j21 = checkboxColors.disabledCheckedBoxColor;
        } else {
            j21 = j9;
        }
        if ((i5 & 32) != 0) {
            j22 = checkboxColors.disabledUncheckedBoxColor;
        } else {
            j22 = j10;
        }
        if ((i5 & 64) != 0) {
            j23 = checkboxColors.disabledIndeterminateBoxColor;
        } else {
            j23 = j11;
        }
        long j29 = j23;
        if ((i5 & 128) != 0) {
            j24 = checkboxColors.checkedBorderColor;
        } else {
            j24 = j12;
        }
        long j30 = j24;
        if ((i5 & 256) != 0) {
            j25 = checkboxColors.uncheckedBorderColor;
        } else {
            j25 = j13;
        }
        long j31 = j25;
        if ((i5 & 512) != 0) {
            j26 = checkboxColors.disabledBorderColor;
        } else {
            j26 = j14;
        }
        long j32 = j26;
        if ((i5 & 1024) != 0) {
            j27 = checkboxColors.disabledUncheckedBorderColor;
        } else {
            j27 = j15;
        }
        long j33 = j27;
        if ((i5 & 2048) != 0) {
            j28 = checkboxColors.disabledIndeterminateBorderColor;
        } else {
            j28 = j16;
        }
        return checkboxColors.m1629copy2qZNXz8(j17, j18, j19, j20, j21, j22, j29, j30, j31, j32, j33, j28);
    }

    @p4.l
    @Composable
    public final State<Color> borderColor$material3_release(boolean z4, @p4.l ToggleableState toggleableState, @p4.m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        int i6;
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i5, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:526)");
        }
        if (z4) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    j5 = this.uncheckedBorderColor;
                } else {
                    throw new kotlin.j0();
                }
            } else {
                j5 = this.checkedBorderColor;
            }
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        j5 = this.disabledUncheckedBorderColor;
                    } else {
                        throw new kotlin.j0();
                    }
                } else {
                    j5 = this.disabledIndeterminateBorderColor;
                }
            } else {
                j5 = this.disabledBorderColor;
            }
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(1209374481);
            if (toggleableState == ToggleableState.Off) {
                i6 = 100;
            } else {
                i6 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(i6, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209374667);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> boxColor$material3_release(boolean z4, @p4.l ToggleableState toggleableState, @p4.m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        int i6;
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i5, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:495)");
        }
        if (z4) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    j5 = this.uncheckedBoxColor;
                } else {
                    throw new kotlin.j0();
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
                        throw new kotlin.j0();
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
            composer.startReplaceableGroup(1143723294);
            if (toggleableState == ToggleableState.Off) {
                i6 = 100;
            } else {
                i6 = 50;
            }
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(i6, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143723480);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> checkmarkColor$material3_release(@p4.l ToggleableState toggleableState, @p4.m Composer composer, int i5) {
        long j5;
        int i6;
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i5, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:476)");
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

    @p4.l
    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final CheckboxColors m1629copy2qZNXz8(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        boolean z4;
        long j17;
        boolean z5;
        long j18;
        boolean z6;
        long j19;
        boolean z7;
        long j20;
        boolean z8;
        long j21;
        boolean z9;
        long j22;
        boolean z10;
        long j23;
        boolean z11;
        long j24;
        boolean z12;
        long j25;
        boolean z13;
        long j26;
        boolean z14;
        long j27;
        long j28;
        Color.Companion companion = Color.Companion;
        boolean z15 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j17 = j5;
        } else {
            j17 = this.checkedCheckmarkColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j18 = j6;
        } else {
            j18 = this.uncheckedCheckmarkColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j19 = j7;
        } else {
            j19 = this.checkedBoxColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j20 = j8;
        } else {
            j20 = this.uncheckedBoxColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j21 = j9;
        } else {
            j21 = this.disabledCheckedBoxColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j22 = j10;
        } else {
            j22 = this.disabledUncheckedBoxColor;
        }
        if (j11 != companion.m3770getUnspecified0d7_KjU()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j23 = j11;
        } else {
            j23 = this.disabledIndeterminateBoxColor;
        }
        if (j12 != companion.m3770getUnspecified0d7_KjU()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j24 = j12;
        } else {
            j24 = this.checkedBorderColor;
        }
        if (j13 != companion.m3770getUnspecified0d7_KjU()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j25 = j13;
        } else {
            j25 = this.uncheckedBorderColor;
        }
        if (j14 != companion.m3770getUnspecified0d7_KjU()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            j26 = j14;
        } else {
            j26 = this.disabledBorderColor;
        }
        if (j15 != companion.m3770getUnspecified0d7_KjU()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            j27 = j15;
        } else {
            j27 = this.disabledUncheckedBorderColor;
        }
        if (j16 == companion.m3770getUnspecified0d7_KjU()) {
            z15 = false;
        }
        if (z15) {
            j28 = j16;
        } else {
            j28 = this.disabledIndeterminateBorderColor;
        }
        return new CheckboxColors(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        if (Color.m3735equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m3735equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m3735equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m3735equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m3735equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m3735equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m3735equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m3735equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m3735equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m3735equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m3735equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m3735equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1630getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1631getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1632getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1633getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1634getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1635getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1636getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1637getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1638getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1639getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1640getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1641getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m3741hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m3741hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m3741hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m3741hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m3741hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledIndeterminateBorderColor);
    }
}
