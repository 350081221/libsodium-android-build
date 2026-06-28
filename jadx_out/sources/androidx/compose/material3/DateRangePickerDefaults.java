package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0087\u0001\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "", "selectedStartDateMillis", "selectedEndDateMillis", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/ui/Modifier;", "modifier", "", "startDateText", "endDateText", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", "DateRangePickerHeadline-0YIUgSQ", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerHeadline", "DateRangePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerTitle", "DateRangePickerHeadline-v84Udv0", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1099:1\n109#2:1100\n121#2:1101\n111#2:1102\n113#2:1103\n81#2:1104\n97#2:1105\n81#2:1106\n97#2:1107\n1116#3,6:1108\n154#4:1114\n91#5,2:1115\n93#5:1145\n97#5:1150\n78#6,11:1117\n91#6:1149\n456#7,8:1128\n464#7,3:1142\n467#7,3:1146\n3737#8,6:1136\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n343#1:1100\n348#1:1101\n374#1:1102\n375#1:1103\n443#1:1104\n444#1:1105\n453#1:1106\n454#1:1107\n462#1:1108,6\n467#1:1114\n461#1:1115,2\n461#1:1145\n461#1:1150\n461#1:1117,11\n461#1:1149\n461#1:1128,8\n461#1:1142,3\n461#1:1146,3\n461#1:1136,6\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateRangePickerHeadline-0YIUgSQ, reason: not valid java name */
    public final void m1819DateRangePickerHeadline0YIUgSQ(Long l5, Long l6, int i5, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Composer composer, int i6, int i7) {
        int i8;
        Composer composer2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean changedInstance;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-820363420);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i8 = i18 | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(l6)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i8 |= i17;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changed(i5)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i8 |= i16;
        }
        if ((i6 & 3072) == 0) {
            if ((i6 & 4096) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i8 |= i15;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i8 |= i14;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i8 |= i13;
        }
        if ((1572864 & i6) == 0) {
            if (startRestartGroup.changed(str2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i8 |= i12;
        }
        if ((12582912 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i8 |= i11;
        }
        if ((100663296 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i8 |= i10;
        }
        if ((805306368 & i6) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i8 |= i9;
        }
        int i19 = i8;
        if ((306783379 & i19) == 306783378 && (i7 & 1) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-820363420, i19, i7, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:425)");
            }
            Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(startRestartGroup, 0);
            String formatDate$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l5, defaultLocale, false, 4, null);
            String formatDate$default2 = DatePickerFormatter.formatDate$default(datePickerFormatter, l6, defaultLocale, false, 4, null);
            String formatDate = datePickerFormatter.formatDate(l5, defaultLocale, true);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-1212631660);
            String str3 = "";
            if (formatDate == null) {
                DisplayMode.Companion companion = DisplayMode.Companion;
                if (DisplayMode.m1844equalsimpl0(i5, companion.m1849getPickerjFl4v0())) {
                    composer2.startReplaceableGroup(-1212631439);
                    Strings.Companion companion2 = Strings.Companion;
                    String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_no_selection_description), composer2, 0);
                    composer2.endReplaceableGroup();
                    formatDate = m2294getStringNWtq28;
                } else if (DisplayMode.m1844equalsimpl0(i5, companion.m1848getInputjFl4v0())) {
                    composer2.startReplaceableGroup(-1212631354);
                    Strings.Companion companion3 = Strings.Companion;
                    formatDate = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_no_input_description), composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1063135767);
                    composer2.endReplaceableGroup();
                    formatDate = "";
                }
            }
            composer2.endReplaceableGroup();
            String formatDate2 = datePickerFormatter.formatDate(l6, defaultLocale, true);
            composer2.startReplaceableGroup(-1212631233);
            if (formatDate2 == null) {
                DisplayMode.Companion companion4 = DisplayMode.Companion;
                if (DisplayMode.m1844equalsimpl0(i5, companion4.m1849getPickerjFl4v0())) {
                    composer2.startReplaceableGroup(-1212631014);
                    Strings.Companion companion5 = Strings.Companion;
                    str3 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_no_selection_description), composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (DisplayMode.m1844equalsimpl0(i5, companion4.m1848getInputjFl4v0())) {
                    composer2.startReplaceableGroup(-1212630929);
                    Strings.Companion companion6 = Strings.Companion;
                    str3 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_no_input_description), composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1063148942);
                    composer2.endReplaceableGroup();
                }
            } else {
                str3 = formatDate2;
            }
            composer2.endReplaceableGroup();
            String str4 = str + ": " + formatDate;
            String str5 = str2 + ": " + str3;
            composer2.startReplaceableGroup(-1212630615);
            boolean changed = composer2.changed(str4) | composer2.changed(str5);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerDefaults$DateRangePickerHeadline$4$1(str4, str5);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (v3.l) rememberedValue);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical m462spacedBy0680j_4 = Arrangement.INSTANCE.m462spacedBy0680j_4(Dp.m6044constructorimpl(4));
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m462spacedBy0680j_4, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion7.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(clearAndSetSemantics);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer2);
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion7.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion7.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (formatDate$default != null) {
                composer2.startReplaceableGroup(1922100124);
                TextKt.m2452Text4IGK_g(formatDate$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1922100193);
                pVar.invoke(composer2, Integer.valueOf((i19 >> 21) & 14));
                composer2.endReplaceableGroup();
            }
            pVar3.invoke(composer2, Integer.valueOf((i19 >> 27) & 14));
            if (formatDate$default2 != null) {
                composer2.startReplaceableGroup(1922100319);
                TextKt.m2452Text4IGK_g(formatDate$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1922100386);
                pVar2.invoke(composer2, Integer.valueOf((i19 >> 24) & 14));
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$6(this, l5, l6, i5, datePickerFormatter, modifier, str, str2, pVar, pVar2, pVar3, i6, i7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DateRangePickerHeadline-v84Udv0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1821DateRangePickerHeadlinev84Udv0(@p4.m java.lang.Long r22, @p4.m java.lang.Long r23, int r24, @p4.l androidx.compose.material3.DatePickerFormatter r25, @p4.m androidx.compose.ui.Modifier r26, @p4.m androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.m1821DateRangePickerHeadlinev84Udv0(java.lang.Long, java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DateRangePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1822DateRangePickerTitlehOD91z4(int r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.m1822DateRangePickerTitlehOD91z4(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
