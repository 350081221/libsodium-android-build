package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJ:\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/RadioButtonDefaults;", "", "()V", "defaultRadioButtonColors", "Landroidx/compose/material3/RadioButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRadioButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RadioButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "colors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RadioButtonColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @p4.l
    @Composable
    public final RadioButtonColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1191566130);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1191566130, i5, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:139)");
        }
        RadioButtonColors defaultRadioButtonColors$material3_release = getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultRadioButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final RadioButtonColors m2098colorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-351083046);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-351083046, i5, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:158)");
        }
        RadioButtonColors m2093copyjRlVdoo = getDefaultRadioButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2093copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2093copyjRlVdoo;
    }

    @p4.l
    public final RadioButtonColors getDefaultRadioButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        RadioButtonColors defaultRadioButtonColorsCached$material3_release = colorScheme.getDefaultRadioButtonColorsCached$material3_release();
        if (defaultRadioButtonColorsCached$material3_release == null) {
            RadioButtonTokens radioButtonTokens = RadioButtonTokens.INSTANCE;
            RadioButtonColors radioButtonColors = new RadioButtonColors(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getUnselectedIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, radioButtonTokens.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultRadioButtonColorsCached$material3_release(radioButtonColors);
            return radioButtonColors;
        }
        return defaultRadioButtonColorsCached$material3_release;
    }
}
