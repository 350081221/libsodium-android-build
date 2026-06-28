package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n*L\n1663#1:2269,6\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt$HorizontalMonthsList$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ v3.l<Long, r2> $onDateSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00621 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
            public static final C00621 INSTANCE = new C00621();

            C00621() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @p4.l
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(C00621.INSTANCE, AnonymousClass2.INSTANCE, false, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$HorizontalMonthsList$1(LazyListState lazyListState, kotlin.ranges.l lVar, CalendarModel calendarModel, CalendarMonth calendarMonth, v3.l<? super Long, r2> lVar2, CalendarDate calendarDate, Long l5, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(2);
        this.$lazyListState = lazyListState;
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

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1504086906, i5, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1651)");
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, AnonymousClass1.INSTANCE, 1, null);
        LazyListState lazyListState = this.$lazyListState;
        FlingBehavior rememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, composer, 384, 2);
        composer.startReplaceableGroup(1286688325);
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changedInstance(this.$calendarModel) | composer.changed(this.$firstMonth) | composer.changed(this.$onDateSelectionChange) | composer.changed(this.$today) | composer.changed(this.$selectedDateMillis) | composer.changedInstance(this.$dateFormatter) | composer.changed(this.$selectableDates) | composer.changed(this.$colors);
        kotlin.ranges.l lVar = this.$yearRange;
        CalendarModel calendarModel = this.$calendarModel;
        CalendarMonth calendarMonth = this.$firstMonth;
        v3.l<Long, r2> lVar2 = this.$onDateSelectionChange;
        CalendarDate calendarDate = this.$today;
        Long l5 = this.$selectedDateMillis;
        DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        SelectableDates selectableDates = this.$selectableDates;
        DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DatePickerKt$HorizontalMonthsList$1$2$1(lVar, calendarModel, calendarMonth, lVar2, calendarDate, l5, datePickerFormatter, selectableDates, datePickerColors);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3_release, false, (v3.l) rememberedValue, composer, 0, 188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
