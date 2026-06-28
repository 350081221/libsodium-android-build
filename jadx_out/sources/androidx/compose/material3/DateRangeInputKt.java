package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0014\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "selectedStartDateMillis", "selectedEndDateMillis", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "startDateMillis", "endDateMillis", "Lkotlin/r2;", "onDatesSelectionChange", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangeInputContent", "(Ljava/lang/Long;Ljava/lang/Long;Lv3/p;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "TextFieldSpacing", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n1116#2,6:122\n1116#2,6:132\n1116#2,6:173\n1116#2,6:180\n101#3:128\n103#3:129\n99#3:130\n123#3:131\n111#3:172\n113#3:179\n88#4,5:138\n93#4:171\n97#4:190\n78#5,11:143\n91#5:189\n456#6,8:154\n464#6,3:168\n467#6,3:186\n3737#7,6:162\n154#8:191\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n44#1:122,6\n51#1:132,6\n85#1:173,6\n107#1:180,6\n47#1:128\n48#1:129\n49#1:130\n50#1:131\n73#1:172\n95#1:179\n68#1:138,5\n68#1:171\n68#1:190\n68#1:143,11\n68#1:189\n68#1:154,8\n68#1:168,3\n68#1:186,3\n68#1:162,6\n120#1:191\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m6044constructorimpl(8);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangeInputContent(@p4.m Long l5, @p4.m Long l6, @p4.l v3.p<? super Long, ? super Long, r2> pVar, @p4.l CalendarModel calendarModel, @p4.l kotlin.ranges.l lVar, @p4.l DatePickerFormatter datePickerFormatter, @p4.l SelectableDates selectableDates, @p4.l DatePickerColors datePickerColors, @p4.m Composer composer, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7;
        Composer composer2;
        int i8;
        int i9;
        boolean changedInstance;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-607499086);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i6 = i15 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(l6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i6 |= i14;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i6 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i6 |= i12;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        if ((196608 & i5) == 0) {
            if ((i5 & 262144) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((i5 & 12582912) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i6 |= i8;
        }
        if ((i6 & 4793491) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607499086, i6, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:40)");
            }
            Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1694771901);
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat = (DateInputFormat) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Strings.Companion companion = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            String m2294getStringNWtq283 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            String m2294getStringNWtq284 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_input_invalid_range_input), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1694772328);
            boolean changed2 = startRestartGroup.changed(dateInputFormat);
            if ((i6 & 458752) != 131072 && ((262144 & i6) == 0 || !startRestartGroup.changed(datePickerFormatter))) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z8 = changed2 | z4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DateInputValidator(lVar, selectableDates, dateInputFormat, datePickerFormatter, m2294getStringNWtq28, m2294getStringNWtq282, m2294getStringNWtq283, m2294getStringNWtq284, null, null, 768, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DateInputValidator dateInputValidator = (DateInputValidator) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            dateInputValidator.setCurrentStartDateMillis$material3_release(l5);
            dateInputValidator.setCurrentEndDateMillis$material3_release(l6);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier padding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            Arrangement.HorizontalOrVertical m462spacedBy0680j_4 = Arrangement.INSTANCE.m462spacedBy0680j_4(TextFieldSpacing);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m462spacedBy0680j_4, Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m2294getStringNWtq285 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_start_headline), startRestartGroup, 0);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            InputIdentifier.Companion companion4 = InputIdentifier.Companion;
            int m1948getStartDateInputJ2x2o4M = companion4.m1948getStartDateInputJ2x2o4M();
            startRestartGroup.startReplaceableGroup(1849029901);
            int i16 = i6 & 896;
            if (i16 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i17 = i6 & 112;
            if (i17 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z5 | z6;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateRangeInputKt$DateRangeInputContent$2$1$1(pVar, l6);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            int i18 = i6 & 7168;
            int i19 = (i6 >> 21) & 14;
            int i20 = i6;
            boolean z10 = false;
            DateInputKt.m1773DateInputTextFieldtQNruF0(weight$default, l5, (v3.l) rememberedValue3, calendarModel, ComposableLambdaKt.composableLambda(startRestartGroup, 801434508, true, new DateRangeInputKt$DateRangeInputContent$2$2(m2294getStringNWtq285, upperCase)), ComposableLambdaKt.composableLambda(startRestartGroup, 665407211, true, new DateRangeInputKt$DateRangeInputContent$2$3(upperCase)), m1948getStartDateInputJ2x2o4M, dateInputValidator, dateInputFormat, defaultLocale, datePickerColors, startRestartGroup, ((i6 << 3) & 112) | 1794048 | i18, i19);
            String m2294getStringNWtq286 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_end_headline), startRestartGroup, 0);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion2, 0.5f, false, 2, null);
            int m1946getEndDateInputJ2x2o4M = companion4.m1946getEndDateInputJ2x2o4M();
            startRestartGroup.startReplaceableGroup(1849030941);
            if (i16 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i20 & 14) == 4) {
                z10 = true;
            }
            boolean z11 = z7 | z10;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z11 && rememberedValue4 != Composer.Companion.getEmpty()) {
                i7 = i17;
            } else {
                i7 = i17;
                rememberedValue4 = new DateRangeInputKt$DateRangeInputContent$2$4$1(pVar, l5);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            DateInputKt.m1773DateInputTextFieldtQNruF0(weight$default2, l6, (v3.l) rememberedValue4, calendarModel, ComposableLambdaKt.composableLambda(startRestartGroup, 911487285, true, new DateRangeInputKt$DateRangeInputContent$2$5(m2294getStringNWtq286, upperCase)), ComposableLambdaKt.composableLambda(startRestartGroup, -961726252, true, new DateRangeInputKt$DateRangeInputContent$2$6(upperCase)), m1946getEndDateInputJ2x2o4M, dateInputValidator, dateInputFormat, defaultLocale, datePickerColors, startRestartGroup, i7 | 1794048 | i18, i19);
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
            endRestartGroup.updateScope(new DateRangeInputKt$DateRangeInputContent$3(l5, l6, pVar, calendarModel, lVar, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }
}
