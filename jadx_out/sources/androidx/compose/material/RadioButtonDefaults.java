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
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1116#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;

    @l
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @l
    @Composable
    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m1418colorsRGew2ao(long j5, long j6, long j7, @m Composer composer, int i5, int i6) {
        long j8;
        long j9;
        long j10;
        composer.startReplaceableGroup(1370708026);
        if ((i6 & 1) != 0) {
            j8 = MaterialTheme.INSTANCE.getColors(composer, 6).m1277getSecondary0d7_KjU();
        } else {
            j8 = j5;
        }
        if ((i6 & 2) != 0) {
            j9 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j9 = j6;
        }
        if ((i6 & 4) != 0) {
            j10 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j10 = j7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, i5, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:166)");
        }
        Color m3724boximpl = Color.m3724boximpl(j8);
        Color m3724boximpl2 = Color.m3724boximpl(j9);
        Color m3724boximpl3 = Color.m3724boximpl(j10);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m3724boximpl) | composer.changed(m3724boximpl2) | composer.changed(m3724boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultRadioButtonColors(j8, j9, j10, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultRadioButtonColors;
    }
}
