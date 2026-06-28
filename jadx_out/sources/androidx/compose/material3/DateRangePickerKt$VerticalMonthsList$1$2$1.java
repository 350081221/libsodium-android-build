package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.r;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/LazyListScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1 extends kotlin.jvm.internal.n0 implements v3.l<LazyListScope, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ List<CustomAccessibilityAction> $customAccessibilityAction;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n74#2,6:1100\n80#2:1134\n84#2:1145\n78#3,11:1106\n91#3:1144\n456#4,8:1117\n464#4,3:1131\n467#4,3:1141\n3737#5,6:1125\n1116#6,6:1135\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1\n*L\n818#1:1100,6\n818#1:1134\n818#1:1145\n818#1:1106,11\n818#1:1144\n818#1:1117,8\n818#1:1131,3\n818#1:1141,3\n818#1:1125,6\n844#1:1135,6\n*E\n"})
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
        final /* synthetic */ CalendarModel $calendarModel;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ List<CustomAccessibilityAction> $customAccessibilityAction;
        final /* synthetic */ DatePickerFormatter $dateFormatter;
        final /* synthetic */ CalendarMonth $firstMonth;
        final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
        final /* synthetic */ SelectableDates $selectableDates;
        final /* synthetic */ Long $selectedEndDateMillis;
        final /* synthetic */ Long $selectedStartDateMillis;
        final /* synthetic */ CalendarDate $today;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CalendarModel calendarModel, CalendarMonth calendarMonth, Long l5, Long l6, v3.l<? super Long, r2> lVar, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List<CustomAccessibilityAction> list) {
            super(4);
            this.$calendarModel = calendarModel;
            this.$firstMonth = calendarMonth;
            this.$selectedStartDateMillis = l5;
            this.$selectedEndDateMillis = l6;
            this.$onDateSelectionChange = lVar;
            this.$today = calendarDate;
            this.$dateFormatter = datePickerFormatter;
            this.$selectableDates = selectableDates;
            this.$colors = datePickerColors;
            this.$customAccessibilityAction = list;
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l LazyItemScope lazyItemScope, int i5, @p4.m Composer composer, int i6) {
            int i7;
            SelectedRangeInfo selectedRangeInfo;
            if ((i6 & 6) == 0) {
                i7 = i6 | (composer.changed(lazyItemScope) ? 4 : 2);
            } else {
                i7 = i6;
            }
            if ((i6 & 48) == 0) {
                i7 |= composer.changed(i5) ? 32 : 16;
            }
            if ((i7 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1413501381, i7, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:812)");
            }
            CalendarMonth plusMonths = this.$calendarModel.plusMonths(this.$firstMonth, i5);
            Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
            Long l5 = this.$selectedStartDateMillis;
            Long l6 = this.$selectedEndDateMillis;
            v3.l<Long, r2> lVar = this.$onDateSelectionChange;
            CalendarDate calendarDate = this.$today;
            DatePickerFormatter datePickerFormatter = this.$dateFormatter;
            SelectableDates selectableDates = this.$selectableDates;
            DatePickerColors datePickerColors = this.$colors;
            List<CustomAccessibilityAction> list = this.$customAccessibilityAction;
            CalendarModel calendarModel = this.$calendarModel;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillParentMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(composer, 1622100276, true, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(datePickerFormatter, plusMonths, list, datePickerColors)), composer, 48);
            composer.startReplaceableGroup(-1455463505);
            if (l5 == null || l6 == null) {
                selectedRangeInfo = null;
            } else {
                composer.startReplaceableGroup(-1455463352);
                boolean changed = composer.changed(l5) | composer.changed(l6);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = SelectedRangeInfo.Companion.calculateRangeInfo(plusMonths, calendarModel.getCanonicalDate(l5.longValue()), calendarModel.getCanonicalDate(l6.longValue()));
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                selectedRangeInfo = (SelectedRangeInfo) rememberedValue;
            }
            composer.endReplaceableGroup();
            DatePickerKt.Month(plusMonths, lVar, calendarDate.getUtcTimeMillis(), l5, l6, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$VerticalMonthsList$1$2$1(kotlin.ranges.l lVar, CalendarModel calendarModel, CalendarMonth calendarMonth, Long l5, Long l6, v3.l<? super Long, r2> lVar2, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List<CustomAccessibilityAction> list) {
        super(1);
        this.$yearRange = lVar;
        this.$calendarModel = calendarModel;
        this.$firstMonth = calendarMonth;
        this.$selectedStartDateMillis = l5;
        this.$selectedEndDateMillis = l6;
        this.$onDateSelectionChange = lVar2;
        this.$today = calendarDate;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
        this.$customAccessibilityAction = list;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LazyListScope lazyListScope) {
        LazyListScope.items$default(lazyListScope, DatePickerKt.numberOfMonthsInRange(this.$yearRange), null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new AnonymousClass1(this.$calendarModel, this.$firstMonth, this.$selectedStartDateMillis, this.$selectedEndDateMillis, this.$onDateSelectionChange, this.$today, this.$dateFormatter, this.$selectableDates, this.$colors, this.$customAccessibilityAction)), 6, null);
    }
}
