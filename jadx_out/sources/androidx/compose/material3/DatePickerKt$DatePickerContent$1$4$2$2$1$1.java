package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "year", "Lkotlin/r2;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DatePickerKt$DatePickerContent$1$4$2$2$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Integer, r2> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ CalendarMonth $displayedMonth;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ MutableState<Boolean> $yearPickerVisible$delegate;
    final /* synthetic */ kotlin.ranges.l $yearRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1568}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ CalendarMonth $displayedMonth;
        final /* synthetic */ LazyListState $monthsListState;
        final /* synthetic */ int $year;
        final /* synthetic */ kotlin.ranges.l $yearRange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyListState lazyListState, int i5, kotlin.ranges.l lVar, CalendarMonth calendarMonth, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$monthsListState = lazyListState;
            this.$year = i5;
            this.$yearRange = lVar;
            this.$displayedMonth = calendarMonth;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                LazyListState lazyListState = this.$monthsListState;
                int e5 = (((this.$year - this.$yearRange.e()) * 12) + this.$displayedMonth.getMonth()) - 1;
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, e5, 0, this, 2, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2$2$1$1(s0 s0Var, MutableState<Boolean> mutableState, LazyListState lazyListState, kotlin.ranges.l lVar, CalendarMonth calendarMonth) {
        super(1);
        this.$coroutineScope = s0Var;
        this.$yearPickerVisible$delegate = mutableState;
        this.$monthsListState = lazyListState;
        this.$yearRange = lVar;
        this.$displayedMonth = calendarMonth;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
        invoke(num.intValue());
        return r2.f19517a;
    }

    public final void invoke(int i5) {
        boolean DatePickerContent$lambda$8;
        MutableState<Boolean> mutableState = this.$yearPickerVisible$delegate;
        DatePickerContent$lambda$8 = DatePickerKt.DatePickerContent$lambda$8(mutableState);
        DatePickerKt.DatePickerContent$lambda$9(mutableState, !DatePickerContent$lambda$8);
        kotlinx.coroutines.k.f(this.$coroutineScope, null, null, new AnonymousClass1(this.$monthsListState, i5, this.$yearRange, this.$displayedMonth, null), 3, null);
    }
}
