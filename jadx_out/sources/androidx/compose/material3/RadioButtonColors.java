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
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RadioButtonColors;", "copy", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "radioColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "radioColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getSelectedColor-0d7_KjU", "()J", "getUnselectedColor-0d7_KjU", "getDisabledSelectedColor-0d7_KjU", "getDisabledUnselectedColor-0d7_KjU", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,268:1\n658#2:269\n646#2:270\n658#2:271\n646#2:272\n658#2:273\n646#2:274\n658#2:275\n646#2:276\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n*L\n211#1:269\n211#1:270\n212#1:271\n212#1:272\n213#1:273\n213#1:274\n214#1:275\n214#1:276\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    private RadioButtonColors(long j5, long j6, long j7, long j8) {
        this.selectedColor = j5;
        this.unselectedColor = j6;
        this.disabledSelectedColor = j7;
        this.disabledUnselectedColor = j8;
    }

    public /* synthetic */ RadioButtonColors(long j5, long j6, long j7, long j8, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m2092copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j5, long j6, long j7, long j8, int i5, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i5 & 1) != 0) {
            j9 = radioButtonColors.selectedColor;
        } else {
            j9 = j5;
        }
        if ((i5 & 2) != 0) {
            j10 = radioButtonColors.unselectedColor;
        } else {
            j10 = j6;
        }
        if ((i5 & 4) != 0) {
            j11 = radioButtonColors.disabledSelectedColor;
        } else {
            j11 = j7;
        }
        if ((i5 & 8) != 0) {
            j12 = radioButtonColors.disabledUnselectedColor;
        } else {
            j12 = j8;
        }
        return radioButtonColors.m2093copyjRlVdoo(j9, j10, j11, j12);
    }

    @p4.l
    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m2093copyjRlVdoo(long j5, long j6, long j7, long j8) {
        boolean z4;
        long j9;
        boolean z5;
        long j10;
        boolean z6;
        long j11;
        long j12;
        Color.Companion companion = Color.Companion;
        boolean z7 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j9 = j5;
        } else {
            j9 = this.selectedColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j10 = j6;
        } else {
            j10 = this.unselectedColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j11 = j7;
        } else {
            j11 = this.disabledSelectedColor;
        }
        if (j8 == companion.m3770getUnspecified0d7_KjU()) {
            z7 = false;
        }
        if (z7) {
            j12 = j8;
        } else {
            j12 = this.disabledUnselectedColor;
        }
        return new RadioButtonColors(j9, j10, j11, j12, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        if (Color.m3735equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m3735equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m3735equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m3735equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2094getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2095getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m2096getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m2097getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    public int hashCode() {
        return (((((Color.m3741hashCodeimpl(this.selectedColor) * 31) + Color.m3741hashCodeimpl(this.unselectedColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUnselectedColor);
    }

    @p4.l
    @Composable
    public final State<Color> radioColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1840145292);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i5, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:224)");
        }
        if (z4 && z5) {
            j5 = this.selectedColor;
        } else if (z4 && !z5) {
            j5 = this.unselectedColor;
        } else if (!z4 && z5) {
            j5 = this.disabledSelectedColor;
        } else {
            j5 = this.disabledUnselectedColor;
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(-1943768162);
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1943768057);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
