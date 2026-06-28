package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)JN\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jl\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n377#1:762\n572#1:763\n577#1:764\n582#1:765\n*E\n"})
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @l
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m6044constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m6044constructorimpl(1);
    private static final float LeadingIconSize = Dp.m6044constructorimpl(20);
    private static final float SelectedIconSize = Dp.m6044constructorimpl(18);

    private ChipDefaults() {
    }

    @l
    @Composable
    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1258chipColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(1838505436);
        if ((i6 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j11 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.m3733copywmQWz5c$default(j12, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j14 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.m3733copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.m3733copywmQWz5c$default(j13, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i5, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:405)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @l
    @Composable
    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1259filterChipColorsJ08w3E(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @m Composer composer, int i5, int i6) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        composer.startReplaceableGroup(830140629);
        if ((i6 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j14 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j14 = j5;
        }
        if ((i6 & 2) != 0) {
            j15 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j6;
        }
        if ((i6 & 4) != 0) {
            j16 = Color.m3733copywmQWz5c$default(j15, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j7;
        }
        if ((i6 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j17 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j17 = j8;
        }
        if ((i6 & 16) != 0) {
            j18 = Color.m3733copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j9;
        }
        if ((i6 & 32) != 0) {
            j19 = Color.m3733copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j10;
        }
        if ((i6 & 64) != 0) {
            j20 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j14);
        } else {
            j20 = j11;
        }
        if ((i6 & 128) != 0) {
            j21 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j15);
        } else {
            j21 = j12;
        }
        if ((i6 & 256) != 0) {
            j22 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j16);
        } else {
            j22 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i5, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:485)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1260getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1261getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @l
    @h(name = "getOutlinedBorder")
    @Composable
    public final BorderStroke getOutlinedBorder(@m Composer composer, int i5) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i5, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:549)");
        }
        BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(OutlinedBorderSize, Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m228BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1262getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1263getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @l
    @Composable
    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1264outlinedChipColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-1763922662);
        if ((i6 & 1) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.m3733copywmQWz5c$default(j12, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = j11;
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.m3733copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.m3733copywmQWz5c$default(j13, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i5, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:437)");
        }
        ChipColors m1258chipColors5tl4gsc = m1258chipColors5tl4gsc(j11, j12, j13, j14, j15, j16, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1258chipColors5tl4gsc;
    }

    @l
    @Composable
    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1265outlinedFilterChipColorsJ08w3E(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @m Composer composer, int i5, int i6) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        composer.startReplaceableGroup(346878099);
        if ((i6 & 1) != 0) {
            j14 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j14 = j5;
        }
        if ((i6 & 2) != 0) {
            j15 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j6;
        }
        if ((i6 & 4) != 0) {
            j16 = Color.m3733copywmQWz5c$default(j15, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j16 = j7;
        }
        if ((i6 & 8) != 0) {
            j17 = j14;
        } else {
            j17 = j8;
        }
        if ((i6 & 16) != 0) {
            j18 = Color.m3733copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j9;
        }
        if ((i6 & 32) != 0) {
            j19 = Color.m3733copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j19 = j10;
        }
        if ((i6 & 64) != 0) {
            j20 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j14);
        } else {
            j20 = j11;
        }
        if ((i6 & 128) != 0) {
            j21 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j15);
        } else {
            j21 = j12;
        }
        if ((i6 & 256) != 0) {
            j22 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j16);
        } else {
            j22 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i5, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:532)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
