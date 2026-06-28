package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Arrays;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.r;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DatePickerKt$YearPicker$1$2$1 extends kotlin.jvm.internal.n0 implements v3.l<LazyGridScope, r2> {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ int $currentYear;
    final /* synthetic */ int $displayedYear;
    final /* synthetic */ LazyGridState $lazyGridState;
    final /* synthetic */ v3.l<Integer, r2> $onYearSelected;
    final /* synthetic */ String $scrollToEarlierYearsLabel;
    final /* synthetic */ String $scrollToLaterYearsLabel;
    final /* synthetic */ SelectableDates $selectableDates;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n77#3:2281\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1\n*L\n2038#1:2269,6\n2057#1:2275,6\n2059#1:2281\n*E\n"})
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements r<LazyGridItemScope, Integer, Composer, Integer, r2> {
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ s0 $coroutineScope;
        final /* synthetic */ int $currentYear;
        final /* synthetic */ int $displayedYear;
        final /* synthetic */ LazyGridState $lazyGridState;
        final /* synthetic */ v3.l<Integer, r2> $onYearSelected;
        final /* synthetic */ String $scrollToEarlierYearsLabel;
        final /* synthetic */ String $scrollToLaterYearsLabel;
        final /* synthetic */ SelectableDates $selectableDates;
        final /* synthetic */ kotlin.ranges.l $yearRange;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ String $localizedYear;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00641 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
                public static final C00641 INSTANCE = new C00641();

                C00641() {
                    super(1);
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(String str) {
                super(2);
                this.$localizedYear = str;
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
                    ComposerKt.traceEventStart(882189459, i5, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2062)");
                }
                TextKt.m2452Text4IGK_g(this.$localizedYear, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, C00641.INSTANCE), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 130556);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.ranges.l lVar, LazyGridState lazyGridState, s0 s0Var, String str, String str2, int i5, int i6, v3.l<? super Integer, r2> lVar2, SelectableDates selectableDates, DatePickerColors datePickerColors) {
            super(4);
            this.$yearRange = lVar;
            this.$lazyGridState = lazyGridState;
            this.$coroutineScope = s0Var;
            this.$scrollToEarlierYearsLabel = str;
            this.$scrollToLaterYearsLabel = str2;
            this.$displayedYear = i5;
            this.$currentYear = i6;
            this.$onYearSelected = lVar2;
            this.$selectableDates = selectableDates;
            this.$colors = datePickerColors;
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l LazyGridItemScope lazyGridItemScope, int i5, @p4.m Composer composer, int i6) {
            int i7;
            if ((i6 & 48) == 0) {
                i7 = i6 | (composer.changed(i5) ? 32 : 16);
            } else {
                i7 = i6;
            }
            if ((i7 & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040623618, i7, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2029)");
            }
            int e5 = i5 + this.$yearRange.e();
            String localString$default = ActualJvm_jvmKt.toLocalString$default(e5, 0, 0, false, 7, null);
            Modifier.Companion companion = Modifier.Companion;
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Modifier m596requiredSizeVpY3zN4 = SizeKt.m596requiredSizeVpY3zN4(companion, datePickerModalTokens.m2779getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m2778getSelectionYearContainerHeightD9Ej5fM());
            composer.startReplaceableGroup(-1669466775);
            boolean changed = ((i7 & 112) == 32) | composer.changed(this.$lazyGridState) | composer.changedInstance(this.$coroutineScope) | composer.changed(this.$scrollToEarlierYearsLabel) | composer.changed(this.$scrollToLaterYearsLabel);
            LazyGridState lazyGridState = this.$lazyGridState;
            s0 s0Var = this.$coroutineScope;
            String str = this.$scrollToEarlierYearsLabel;
            String str2 = this.$scrollToLaterYearsLabel;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$YearPicker$1$2$1$1$1$1(lazyGridState, i5, s0Var, str, str2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(m596requiredSizeVpY3zN4, false, (v3.l) rememberedValue, 1, null);
            boolean z4 = e5 == this.$displayedYear;
            boolean z5 = e5 == this.$currentYear;
            composer.startReplaceableGroup(-1669465643);
            boolean changed2 = composer.changed(this.$onYearSelected) | composer.changed(e5);
            v3.l<Integer, r2> lVar = this.$onYearSelected;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$YearPicker$1$2$1$1$2$1(lVar, e5);
                composer.updateRememberedValue(rememberedValue2);
            }
            v3.a aVar = (v3.a) rememberedValue2;
            composer.endReplaceableGroup();
            boolean isSelectableYear = this.$selectableDates.isSelectableYear(e5);
            Strings.Companion companion2 = Strings.Companion;
            String format = String.format(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_navigate_to_year_description), composer, 0), Arrays.copyOf(new Object[]{localString$default}, 1));
            kotlin.jvm.internal.l0.o(format, "format(this, *args)");
            DatePickerKt.Year(semantics$default, z4, z5, aVar, isSelectableYear, format, this.$colors, ComposableLambdaKt.composableLambda(composer, 882189459, true, new AnonymousClass3(localString$default)), composer, 12582912);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPicker$1$2$1(kotlin.ranges.l lVar, LazyGridState lazyGridState, s0 s0Var, String str, String str2, int i5, int i6, v3.l<? super Integer, r2> lVar2, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(1);
        this.$yearRange = lVar;
        this.$lazyGridState = lazyGridState;
        this.$coroutineScope = s0Var;
        this.$scrollToEarlierYearsLabel = str;
        this.$scrollToLaterYearsLabel = str2;
        this.$displayedYear = i5;
        this.$currentYear = i6;
        this.$onYearSelected = lVar2;
        this.$selectableDates = selectableDates;
        this.$colors = datePickerColors;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LazyGridScope lazyGridScope) {
        invoke2(lazyGridScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LazyGridScope lazyGridScope) {
        int U1;
        U1 = kotlin.collections.e0.U1(this.$yearRange);
        LazyGridScope.items$default(lazyGridScope, U1, null, null, null, ComposableLambdaKt.composableLambdaInstance(1040623618, true, new AnonymousClass1(this.$yearRange, this.$lazyGridState, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel, this.$displayedYear, this.$currentYear, this.$onYearSelected, this.$selectableDates, this.$colors)), 14, null);
    }
}
