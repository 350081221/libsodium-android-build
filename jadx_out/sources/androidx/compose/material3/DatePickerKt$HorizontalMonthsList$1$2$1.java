package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/LazyListScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatePickerKt$HorizontalMonthsList$1$2$1 extends kotlin.jvm.internal.n0 implements v3.l<LazyListScope, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n68#2,6:2269\n74#2:2303\n78#2:2308\n78#3,11:2275\n91#3:2307\n456#4,8:2286\n464#4,3:2300\n467#4,3:2304\n3737#5,6:2294\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n*L\n1669#1:2269,6\n1669#1:2303\n1669#1:2308\n1669#1:2275,11\n1669#1:2307\n1669#1:2286,8\n1669#1:2300,3\n1669#1:2304,3\n1669#1:2294,6\n*E\n"})
    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
        final /* synthetic */ CalendarModel $calendarModel;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ DatePickerFormatter $dateFormatter;
        final /* synthetic */ CalendarMonth $firstMonth;
        final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
        final /* synthetic */ SelectableDates $selectableDates;
        final /* synthetic */ Long $selectedDateMillis;
        final /* synthetic */ CalendarDate $today;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CalendarModel calendarModel, CalendarMonth calendarMonth, v3.l<? super Long, r2> lVar, CalendarDate calendarDate, Long l5, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
            super(4);
            this.$calendarModel = calendarModel;
            this.$firstMonth = calendarMonth;
            this.$onDateSelectionChange = lVar;
            this.$today = calendarDate;
            this.$selectedDateMillis = l5;
            this.$dateFormatter = datePickerFormatter;
            this.$selectableDates = selectableDates;
            this.$colors = datePickerColors;
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
                ComposerKt.traceEventStart(1137566309, i7, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1664)");
            }
            CalendarMonth plusMonths = this.$calendarModel.plusMonths(this.$firstMonth, i5);
            Modifier fillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
            v3.l<Long, r2> lVar = this.$onDateSelectionChange;
            CalendarDate calendarDate = this.$today;
            Long l5 = this.$selectedDateMillis;
            DatePickerFormatter datePickerFormatter = this.$dateFormatter;
            SelectableDates selectableDates = this.$selectableDates;
            DatePickerColors datePickerColors = this.$colors;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            DatePickerKt.Month(plusMonths, lVar, calendarDate.getUtcTimeMillis(), l5, null, null, datePickerFormatter, selectableDates, datePickerColors, composer, 221184);
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
    public DatePickerKt$HorizontalMonthsList$1$2$1(kotlin.ranges.l lVar, CalendarModel calendarModel, CalendarMonth calendarMonth, v3.l<? super Long, r2> lVar2, CalendarDate calendarDate, Long l5, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(1);
        this.$yearRange = lVar;
        this.$calendarModel = calendarModel;
        this.$firstMonth = calendarMonth;
        this.$onDateSelectionChange = lVar2;
        this.$today = calendarDate;
        this.$selectedDateMillis = l5;
        this.$dateFormatter = datePickerFormatter;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LazyListScope lazyListScope) {
        LazyListScope.items$default(lazyListScope, DatePickerKt.numberOfMonthsInRange(this.$yearRange), null, null, ComposableLambdaKt.composableLambdaInstance(1137566309, true, new AnonymousClass1(this.$calendarModel, this.$firstMonth, this.$onDateSelectionChange, this.$today, this.$selectedDateMillis, this.$dateFormatter, this.$selectableDates, this.$colors)), 6, null);
    }
}
