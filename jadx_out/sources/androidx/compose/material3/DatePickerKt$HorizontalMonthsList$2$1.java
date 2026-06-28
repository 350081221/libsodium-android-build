package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", i = {}, l = {1689}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatePickerKt$HorizontalMonthsList$2$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ v3.l<Long, r2> $onDisplayedMonthChange;
    final /* synthetic */ kotlin.ranges.l $yearRange;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$HorizontalMonthsList$2$1(LazyListState lazyListState, v3.l<? super Long, r2> lVar, CalendarModel calendarModel, kotlin.ranges.l lVar2, kotlin.coroutines.d<? super DatePickerKt$HorizontalMonthsList$2$1> dVar) {
        super(2, dVar);
        this.$lazyListState = lazyListState;
        this.$onDisplayedMonthChange = lVar;
        this.$calendarModel = calendarModel;
        this.$yearRange = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            LazyListState lazyListState = this.$lazyListState;
            v3.l<Long, r2> lVar = this.$onDisplayedMonthChange;
            CalendarModel calendarModel = this.$calendarModel;
            kotlin.ranges.l lVar2 = this.$yearRange;
            this.label = 1;
            if (DatePickerKt.updateDisplayedMonth(lazyListState, lVar, calendarModel, lVar2, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
