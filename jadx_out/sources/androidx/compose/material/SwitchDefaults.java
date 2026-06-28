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
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;

    @l
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @l
    @Composable
    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1466colorsSQMK_m0(long j5, long j6, float f5, long j7, long j8, float f6, long j9, long j10, long j11, long j12, @m Composer composer, int i5, int i6, int i7) {
        long j13;
        long j14;
        float f7;
        long j15;
        long j16;
        float f8;
        float f9;
        long j17;
        long j18;
        long j19;
        long j20;
        int i8;
        long j21;
        long j22;
        composer.startReplaceableGroup(-1032127534);
        if ((i7 & 1) != 0) {
            j13 = MaterialTheme.INSTANCE.getColors(composer, 6).m1278getSecondaryVariant0d7_KjU();
        } else {
            j13 = j5;
        }
        if ((i7 & 2) != 0) {
            j14 = j13;
        } else {
            j14 = j6;
        }
        if ((i7 & 4) != 0) {
            f7 = 0.54f;
        } else {
            f7 = f5;
        }
        if ((i7 & 8) != 0) {
            j15 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j15 = j7;
        }
        if ((i7 & 16) != 0) {
            j16 = MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU();
        } else {
            j16 = j8;
        }
        if ((i7 & 32) != 0) {
            f8 = 0.38f;
        } else {
            f8 = f6;
        }
        if ((i7 & 64) != 0) {
            f9 = f7;
            j17 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(j13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            f9 = f7;
            j17 = j9;
        }
        if ((i7 & 128) != 0) {
            j18 = j13;
            j19 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(j14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j18 = j13;
            j19 = j10;
        }
        if ((i7 & 256) != 0) {
            i8 = 6;
            j20 = j17;
            j21 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j20 = j17;
            i8 = 6;
            j21 = j11;
        }
        if ((i7 & 512) != 0) {
            j22 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, i8), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j22 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i5, i6, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:340)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j18, Color.m3733copywmQWz5c$default(j14, f9, 0.0f, 0.0f, 0.0f, 14, null), j15, Color.m3733copywmQWz5c$default(j16, f8, 0.0f, 0.0f, 0.0f, 14, null), j20, Color.m3733copywmQWz5c$default(j19, f9, 0.0f, 0.0f, 0.0f, 14, null), j21, Color.m3733copywmQWz5c$default(j22, f8, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
