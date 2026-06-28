package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2268:1\n67#2:2269\n1116#3,6:2270\n1116#3,6:2313\n74#4,6:2276\n80#4:2310\n84#4:2323\n78#5,11:2282\n91#5:2322\n456#6,8:2293\n464#6,3:2307\n467#6,3:2319\n3737#7,6:2301\n92#8:2311\n58#8:2312\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n*L\n1548#1:2269\n1549#1:2270,6\n1561#1:2313,6\n1549#1:2276,6\n1549#1:2310\n1549#1:2323\n1549#1:2282,11\n1549#1:2322\n1549#1:2293,8\n1549#1:2307,3\n1549#1:2319,3\n1549#1:2301,6\n1556#1:2311\n1556#1:2312\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$1$4$2 extends kotlin.jvm.internal.n0 implements v3.q<AnimatedVisibilityScope, Composer, Integer, r2> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ CalendarMonth $displayedMonth;
    final /* synthetic */ long $displayedMonthMillis;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2(long j5, MutableState<Boolean> mutableState, s0 s0Var, LazyListState lazyListState, kotlin.ranges.l lVar, CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors) {
        super(3);
        this.$displayedMonthMillis = j5;
        this.$yearPickerVisible$delegate = mutableState;
        this.$coroutineScope = s0Var;
        this.$monthsListState = lazyListState;
        this.$yearRange = lVar;
        this.$displayedMonth = calendarMonth;
        this.$selectableDates = selectableDates;
        this.$calendarModel = calendarModel;
        this.$colors = datePickerColors;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l AnimatedVisibilityScope animatedVisibilityScope, @p4.m Composer composer, int i5) {
        DatePickerColors datePickerColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193716082, i5, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1547)");
        }
        Strings.Companion companion = Strings.Companion;
        String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_year_picker_pane_title), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        composer.startReplaceableGroup(1247395025);
        boolean changed = composer.changed(m2294getStringNWtq28);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DatePickerKt$DatePickerContent$1$4$2$1$1(m2294getStringNWtq28);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion2, false, (v3.l) rememberedValue, 1, null);
        long j5 = this.$displayedMonthMillis;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        s0 s0Var = this.$coroutineScope;
        LazyListState lazyListState = this.$monthsListState;
        kotlin.ranges.l lVar = this.$yearRange;
        CalendarMonth calendarMonth = this.$displayedMonth;
        SelectableDates selectableDates = this.$selectableDates;
        CalendarModel calendarModel = this.$calendarModel;
        DatePickerColors datePickerColors2 = this.$colors;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(SizeKt.m591requiredHeight3ABfNKs(companion2, Dp.m6044constructorimpl(Dp.m6044constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7) - DividerDefaults.INSTANCE.m1850getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
        composer.startReplaceableGroup(-1036317591);
        boolean changed2 = composer.changed(mutableState) | composer.changedInstance(s0Var) | composer.changed(lazyListState) | composer.changedInstance(lVar) | composer.changed(calendarMonth);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            datePickerColors = datePickerColors2;
            rememberedValue2 = new DatePickerKt$DatePickerContent$1$4$2$2$1$1(s0Var, mutableState, lazyListState, lVar, calendarMonth);
            composer.updateRememberedValue(rememberedValue2);
        } else {
            datePickerColors = datePickerColors2;
        }
        composer.endReplaceableGroup();
        DatePickerKt.YearPicker(m555paddingVpY3zN4$default, j5, (v3.l) rememberedValue2, selectableDates, calendarModel, lVar, datePickerColors, composer, 6);
        DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, datePickerColors.m1788getDividerColor0d7_KjU(), composer, 0, 3);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
