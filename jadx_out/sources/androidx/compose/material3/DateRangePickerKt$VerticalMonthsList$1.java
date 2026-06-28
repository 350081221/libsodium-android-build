package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.android.dx.io.Opcodes;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1099:1\n487#2,4:1100\n491#2,2:1108\n495#2:1114\n25#3:1104\n1116#4,3:1105\n1119#4,3:1111\n1116#4,6:1117\n1116#4,6:1123\n487#5:1110\n117#6:1115\n115#6:1116\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n781#1:1100,4\n781#1:1108,2\n781#1:1114\n781#1:1104\n781#1:1105,3\n781#1:1111,3\n787#1:1117,6\n811#1:1123,6\n781#1:1110\n782#1:1115\n783#1:1116\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangePickerKt$VerticalMonthsList$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ v3.p<Long, Long, r2> $onDatesSelectionChange;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ Long $selectedEndDateMillis;
    final /* synthetic */ Long $selectedStartDateMillis;
    final /* synthetic */ CalendarDate $today;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00651 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
            public static final C00651 INSTANCE = new C00651();

            C00651() {
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
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$2, reason: invalid class name */
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
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(C00651.INSTANCE, AnonymousClass2.INSTANCE, false, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$VerticalMonthsList$1(Long l5, Long l6, v3.p<? super Long, ? super Long, r2> pVar, LazyListState lazyListState, kotlin.ranges.l lVar, CalendarModel calendarModel, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, CalendarDate calendarDate, SelectableDates selectableDates) {
        super(2);
        this.$selectedStartDateMillis = l5;
        this.$selectedEndDateMillis = l6;
        this.$onDatesSelectionChange = pVar;
        this.$lazyListState = lazyListState;
        this.$yearRange = lVar;
        this.$calendarModel = calendarModel;
        this.$firstMonth = calendarMonth;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$today = calendarDate;
        this.$selectableDates = selectableDates;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        List customScrollActions;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090773432, i5, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:780)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Strings.Companion companion2 = Strings.Companion;
        String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer, 0);
        String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer, 0);
        composer.startReplaceableGroup(1645720805);
        boolean changed = composer.changed(this.$selectedStartDateMillis) | composer.changed(this.$selectedEndDateMillis) | composer.changed(this.$onDatesSelectionChange);
        Long l5 = this.$selectedStartDateMillis;
        Long l6 = this.$selectedEndDateMillis;
        v3.p<Long, Long, r2> pVar = this.$onDatesSelectionChange;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1(l5, l6, pVar);
            composer.updateRememberedValue(rememberedValue2);
        }
        v3.l lVar = (v3.l) rememberedValue2;
        composer.endReplaceableGroup();
        customScrollActions = DateRangePickerKt.customScrollActions(this.$lazyListState, coroutineScope, m2294getStringNWtq28, m2294getStringNWtq282);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, AnonymousClass1.INSTANCE, 1, null);
        LazyListState lazyListState = this.$lazyListState;
        composer.startReplaceableGroup(1645721776);
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changedInstance(this.$calendarModel) | composer.changed(this.$firstMonth) | composer.changedInstance(this.$dateFormatter) | composer.changedInstance(customScrollActions) | composer.changed(this.$colors) | composer.changed(this.$selectedStartDateMillis) | composer.changed(this.$selectedEndDateMillis) | composer.changed(lVar) | composer.changed(this.$today) | composer.changed(this.$selectableDates);
        kotlin.ranges.l lVar2 = this.$yearRange;
        CalendarModel calendarModel = this.$calendarModel;
        CalendarMonth calendarMonth = this.$firstMonth;
        Long l7 = this.$selectedStartDateMillis;
        Long l8 = this.$selectedEndDateMillis;
        CalendarDate calendarDate = this.$today;
        DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        SelectableDates selectableDates = this.$selectableDates;
        DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new DateRangePickerKt$VerticalMonthsList$1$2$1(lVar2, calendarModel, calendarMonth, l7, l8, lVar, calendarDate, datePickerFormatter, selectableDates, datePickerColors, customScrollActions);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        LazyDslKt.LazyColumn(semantics$default, lazyListState, null, false, null, null, null, false, (v3.l) rememberedValue3, composer, 0, Opcodes.INVOKE_CUSTOM);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
