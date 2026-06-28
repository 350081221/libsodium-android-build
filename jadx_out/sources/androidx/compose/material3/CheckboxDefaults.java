package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJN\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "()V", "defaultCheckboxColors", "Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCheckboxColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @p4.l
    @Composable
    public final CheckboxColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-9530498);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i5, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:188)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCheckboxColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m1642colors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-89536160);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i5, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:213)");
        }
        CheckboxColors defaultCheckboxColors$material3_release = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        CheckboxColors m1629copy2qZNXz8 = defaultCheckboxColors$material3_release.m1629copy2qZNXz8(j13, companion.m3769getTransparent0d7_KjU(), j11, companion.m3769getTransparent0d7_KjU(), j14, companion.m3769getTransparent0d7_KjU(), j16, j11, j12, j14, j15, j16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1629copy2qZNXz8;
    }

    @p4.l
    public final CheckboxColors getDefaultCheckboxColors$material3_release(@p4.l ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached$material3_release = colorScheme.getDefaultCheckboxColorsCached$material3_release();
        if (defaultCheckboxColorsCached$material3_release == null) {
            CheckboxTokens checkboxTokens = CheckboxTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedIconColor());
            Color.Companion companion = Color.Companion;
            CheckboxColors checkboxColors = new CheckboxColors(fromToken, companion.m3769getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedOutlineColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, checkboxTokens.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultCheckboxColorsCached$material3_release(checkboxColors);
            return checkboxColors;
        }
        return defaultCheckboxColorsCached$material3_release;
    }
}
