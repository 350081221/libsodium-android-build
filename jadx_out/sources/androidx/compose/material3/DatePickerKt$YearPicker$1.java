package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
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
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n74#2:2269\n487#3,4:2270\n491#3,2:2278\n495#3:2284\n25#4:2274\n1116#5,3:2275\n1119#5,3:2281\n1116#5,6:2287\n487#6:2280\n87#7:2285\n85#7:2286\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n2011#1:2269\n2013#1:2270,4\n2013#1:2278,2\n2013#1:2284\n2013#1:2274\n2013#1:2275,3\n2013#1:2281,3\n2028#1:2287,6\n2013#1:2280\n2014#1:2285\n2015#1:2286\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt$YearPicker$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Integer, r2> $onYearSelected;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00631 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
            public static final C00631 INSTANCE = new C00631();

            C00631() {
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
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$2, reason: invalid class name */
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
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(C00631.INSTANCE, AnonymousClass2.INSTANCE, false, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPicker$1(CalendarModel calendarModel, long j5, kotlin.ranges.l lVar, DatePickerColors datePickerColors, Modifier modifier, v3.l<? super Integer, r2> lVar2, SelectableDates selectableDates) {
        super(2);
        this.$calendarModel = calendarModel;
        this.$displayedMonthMillis = j5;
        this.$yearRange = lVar;
        this.$colors = datePickerColors;
        this.$modifier = modifier;
        this.$onYearSelected = lVar2;
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
        float f5;
        LazyGridState lazyGridState;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1301915789, i5, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1997)");
        }
        CalendarModel calendarModel = this.$calendarModel;
        int year = calendarModel.getMonth(calendarModel.getToday()).getYear();
        int year2 = this.$calendarModel.getMonth(this.$displayedMonthMillis).getYear();
        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - this.$yearRange.e()) - 3), 0, composer, 0, 2);
        long m1718applyTonalElevationRFCenO8 = ColorSchemeKt.m1718applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), this.$colors.m1777getContainerColor0d7_KjU(), ((Dp) composer.consume(SurfaceKt.getLocalAbsoluteTonalElevation())).m6058unboximpl(), composer, 0);
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
        String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_scroll_to_earlier_years), composer, 0);
        String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_scroll_to_later_years), composer, 0);
        GridCells.Fixed fixed = new GridCells.Fixed(3);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m201backgroundbw27NRU$default(this.$modifier, m1718applyTonalElevationRFCenO8, null, 2, null), false, AnonymousClass1.INSTANCE, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
        f5 = DatePickerKt.YearsVerticalPadding;
        Arrangement.HorizontalOrVertical m462spacedBy0680j_4 = arrangement.m462spacedBy0680j_4(f5);
        composer.startReplaceableGroup(-969328877);
        boolean changedInstance = composer.changedInstance(this.$yearRange) | composer.changed(rememberLazyGridState) | composer.changedInstance(coroutineScope) | composer.changed(m2294getStringNWtq28) | composer.changed(m2294getStringNWtq282) | composer.changed(year2) | composer.changed(year) | composer.changed(this.$onYearSelected) | composer.changed(this.$selectableDates) | composer.changed(this.$colors);
        kotlin.ranges.l lVar = this.$yearRange;
        v3.l<Integer, r2> lVar2 = this.$onYearSelected;
        SelectableDates selectableDates = this.$selectableDates;
        DatePickerColors datePickerColors = this.$colors;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            lazyGridState = rememberLazyGridState;
            rememberedValue2 = new DatePickerKt$YearPicker$1$2$1(lVar, rememberLazyGridState, coroutineScope, m2294getStringNWtq28, m2294getStringNWtq282, year2, year, lVar2, selectableDates, datePickerColors);
            composer.updateRememberedValue(rememberedValue2);
        } else {
            lazyGridState = rememberLazyGridState;
        }
        composer.endReplaceableGroup();
        LazyGridDslKt.LazyVerticalGrid(fixed, semantics$default, lazyGridState, null, false, m462spacedBy0680j_4, spaceEvenly, null, false, (v3.l) rememberedValue2, composer, 1769472, 408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
