package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TimePickerKt$TimePickerTextField$2$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i5, FocusRequester focusRequester, kotlin.coroutines.d<? super TimePickerKt$TimePickerTextField$2$1> dVar) {
        super(2, dVar);
        this.$state = timePickerState;
        this.$selection = i5;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new TimePickerKt$TimePickerTextField$2$1(this.$state, this.$selection, this.$focusRequester, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((TimePickerKt$TimePickerTextField$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            if (Selection.m2172equalsimpl0(this.$state.m2500getSelectionJiIwxys$material3_release(), this.$selection)) {
                this.$focusRequester.requestFocus();
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
