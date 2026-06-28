package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJî\u0001\u0010#\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"Jî\u0001\u0010)\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "", "expanded", "Lkotlin/Function0;", "Lkotlin/r2;", "onIconClick", "TrailingIcon", "(ZLv3/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material/TextFieldColors;", "textFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-DlUQjxs", "outlinedTextFieldColors", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,740:1\n74#2:741\n74#2:742\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n359#1:741\n462#1:742\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @l
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(boolean z4, @m a<r2> aVar, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1752693020);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i10 = i6 & 2;
        if (i10 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i7 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                aVar = ExposedDropdownMenuDefaults$TrailingIcon$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752693020, i7, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:294)");
            }
            IconButtonKt.IconButton(aVar, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, ExposedDropdownMenuDefaults$TrailingIcon$2.INSTANCE), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -689144648, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z4)), startRestartGroup, ((i7 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        a<r2> aVar2 = aVar;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z4, aVar2, i5, i6));
        }
    }

    @l
    @Composable
    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1342outlinedTextFieldColorsDlUQjxs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, @m Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(1841636861);
        long m3733copywmQWz5c$default = (i8 & 1) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3733copywmQWz5c$default2 = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3769getTransparent0d7_KjU = (i8 & 4) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j7;
        long m1275getPrimary0d7_KjU = (i8 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU() : j8;
        long m1269getError0d7_KjU = (i8 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j9;
        long m3733copywmQWz5c$default3 = (i8 & 32) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3733copywmQWz5c$default4 = (i8 & 64) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m3733copywmQWz5c$default5 = (i8 & 128) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m1269getError0d7_KjU2 = (i8 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j13;
        long m3733copywmQWz5c$default6 = (i8 & 512) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3733copywmQWz5c$default7 = (i8 & 1024) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j27 = (i8 & 2048) != 0 ? m3733copywmQWz5c$default6 : j16;
        long m3733copywmQWz5c$default8 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3733copywmQWz5c$default9 = (i8 & 8192) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m3733copywmQWz5c$default10 = (i8 & 16384) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1269getError0d7_KjU3 = (32768 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j20;
        long m3733copywmQWz5c$default11 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3733copywmQWz5c$default12 = (131072 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m3733copywmQWz5c$default13 = (262144 & i8) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long m1269getError0d7_KjU4 = (524288 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j24;
        long m3733copywmQWz5c$default14 = (1048576 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m3733copywmQWz5c$default15 = (i8 & 2097152) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1841636861, i5, i6, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:490)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m3733copywmQWz5c$default, m3733copywmQWz5c$default2, m1275getPrimary0d7_KjU, m1269getError0d7_KjU, m3733copywmQWz5c$default3, m3733copywmQWz5c$default4, m1269getError0d7_KjU2, m3733copywmQWz5c$default5, m3733copywmQWz5c$default6, m3733copywmQWz5c$default7, j27, m3733copywmQWz5c$default8, m3733copywmQWz5c$default9, m3733copywmQWz5c$default10, m1269getError0d7_KjU3, m3769getTransparent0d7_KjU, m3733copywmQWz5c$default11, m3733copywmQWz5c$default12, m3733copywmQWz5c$default13, m1269getError0d7_KjU4, m3733copywmQWz5c$default14, m3733copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @l
    @Composable
    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1343textFieldColorsDlUQjxs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, @m Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(969536191);
        long m3733copywmQWz5c$default = (i8 & 1) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3733copywmQWz5c$default2 = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3733copywmQWz5c$default3 = (i8 & 4) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1275getPrimary0d7_KjU = (i8 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU() : j8;
        long m1269getError0d7_KjU = (i8 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j9;
        long m3733copywmQWz5c$default4 = (i8 & 32) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3733copywmQWz5c$default5 = (i8 & 64) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m3733copywmQWz5c$default6 = (i8 & 128) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m1269getError0d7_KjU2 = (i8 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j13;
        long m3733copywmQWz5c$default7 = (i8 & 512) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3733copywmQWz5c$default8 = (i8 & 1024) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j27 = (i8 & 2048) != 0 ? m3733copywmQWz5c$default7 : j16;
        long m3733copywmQWz5c$default9 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3733copywmQWz5c$default10 = (i8 & 8192) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m3733copywmQWz5c$default11 = (i8 & 16384) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1269getError0d7_KjU3 = (32768 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j20;
        long m3733copywmQWz5c$default12 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3733copywmQWz5c$default13 = (131072 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m3733copywmQWz5c$default14 = (262144 & i8) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long m1269getError0d7_KjU4 = (524288 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j24;
        long m3733copywmQWz5c$default15 = (1048576 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m3733copywmQWz5c$default16 = (i8 & 2097152) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(969536191, i5, i6, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:390)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m3733copywmQWz5c$default, m3733copywmQWz5c$default2, m1275getPrimary0d7_KjU, m1269getError0d7_KjU, m3733copywmQWz5c$default4, m3733copywmQWz5c$default5, m1269getError0d7_KjU2, m3733copywmQWz5c$default6, m3733copywmQWz5c$default7, m3733copywmQWz5c$default8, j27, m3733copywmQWz5c$default9, m3733copywmQWz5c$default10, m3733copywmQWz5c$default11, m1269getError0d7_KjU3, m3733copywmQWz5c$default3, m3733copywmQWz5c$default12, m3733copywmQWz5c$default13, m3733copywmQWz5c$default14, m1269getError0d7_KjU4, m3733copywmQWz5c$default15, m3733copywmQWz5c$default16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
