package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1116#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @l
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @l
    @Composable
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1253colorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(469524104);
        if ((i6 & 1) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1277getSecondary0d7_KjU();
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = Color.m3733copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i5, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:232)");
        }
        Object[] objArr = {Color.m3724boximpl(j10), Color.m3724boximpl(j11), Color.m3724boximpl(j12), Color.m3724boximpl(j13), Color.m3724boximpl(j14)};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i7 = 0; i7 < 5; i7++) {
            z4 |= composer.changed(objArr[i7]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultCheckboxColors(j12, Color.m3733copywmQWz5c$default(j12, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j10, Color.m3733copywmQWz5c$default(j10, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m3733copywmQWz5c$default(j13, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j14, j10, j11, j13, j14, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
