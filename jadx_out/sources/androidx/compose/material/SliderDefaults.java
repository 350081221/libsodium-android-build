package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "()V", "DisabledActiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledTickAlpha", "InactiveTrackAlpha", "TickAlpha", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;

    @l
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @l
    @Composable
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1429colorsq0g_0yA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @m Composer composer, int i5, int i6, int i7) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        composer.startReplaceableGroup(436017687);
        if ((i7 & 1) != 0) {
            j15 = MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU();
        } else {
            j15 = j5;
        }
        if ((i7 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j16 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j16 = j6;
        }
        if ((i7 & 4) != 0) {
            j17 = MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU();
        } else {
            j17 = j7;
        }
        if ((i7 & 8) != 0) {
            j18 = Color.m3733copywmQWz5c$default(j17, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j8;
        }
        if ((i7 & 16) != 0) {
            j19 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j9;
        }
        if ((i7 & 32) != 0) {
            j20 = Color.m3733copywmQWz5c$default(j19, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j20 = j10;
        }
        if ((i7 & 64) != 0) {
            j21 = Color.m3733copywmQWz5c$default(ColorsKt.m1293contentColorForek8zF_U(j17, composer, (i5 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j11;
        }
        if ((i7 & 128) != 0) {
            j22 = Color.m3733copywmQWz5c$default(j17, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j12;
        }
        if ((i7 & 256) != 0) {
            j23 = Color.m3733copywmQWz5c$default(j21, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j13;
        }
        if ((i7 & 512) != 0) {
            j24 = Color.m3733copywmQWz5c$default(j20, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j24 = j14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, i5, i6, "androidx.compose.material.SliderDefaults.colors (Slider.kt:498)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
