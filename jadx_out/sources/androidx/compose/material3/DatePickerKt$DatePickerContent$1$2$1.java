package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerContent$1$2$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ LazyListState $monthsListState;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$2$1$1", f = "DatePicker.kt", i = {}, l = {1510}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ LazyListState $monthsListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$monthsListState = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$monthsListState, dVar);
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
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    LazyListState lazyListState = this.$monthsListState;
                    int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                    this.label = 1;
                    if (LazyListState.animateScrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == l5) {
                        return l5;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$2$1(s0 s0Var, LazyListState lazyListState) {
        super(0);
        this.$coroutineScope = s0Var;
        this.$monthsListState = lazyListState;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        kotlinx.coroutines.k.f(this.$coroutineScope, null, null, new AnonymousClass1(this.$monthsListState, null), 3, null);
    }
}
