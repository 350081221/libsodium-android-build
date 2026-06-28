package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1099:1\n1116#2,6:1100\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1\n*L\n834#1:1100,6\n*E\n"})
/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ List<CustomAccessibilityAction> $customAccessibilityAction;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ CalendarMonth $month;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(DatePickerFormatter datePickerFormatter, CalendarMonth calendarMonth, List<CustomAccessibilityAction> list, DatePickerColors datePickerColors) {
        super(2);
        this.$dateFormatter = datePickerFormatter;
        this.$month = calendarMonth;
        this.$customAccessibilityAction = list;
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
            ComposerKt.traceEventStart(1622100276, i5, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:825)");
        }
        String formatMonthYear = this.$dateFormatter.formatMonthYear(Long.valueOf(this.$month.getStartUtcTimeMillis()), ActualAndroid_androidKt.defaultLocale(composer, 0));
        if (formatMonthYear == null) {
            formatMonthYear = "-";
        }
        String str = formatMonthYear;
        Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, AnonymousClass1.INSTANCE, 7, null);
        composer.startReplaceableGroup(413139989);
        boolean changedInstance = composer.changedInstance(this.$customAccessibilityAction);
        List<CustomAccessibilityAction> list = this.$customAccessibilityAction;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$2$1(list);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextKt.m2452Text4IGK_g(str, SemanticsModifierKt.semantics$default(m235clickableXHw0xAI$default, false, (v3.l) rememberedValue, 1, null), this.$colors.m1795getSubheadContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131064);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
