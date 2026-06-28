package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {733, 734}, m = "settle", n = {"this", "targetValue"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class TimePickerState$settle$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$settle$1(TimePickerState timePickerState, kotlin.coroutines.d<? super TimePickerState$settle$1> dVar) {
        super(dVar);
        this.this$0 = timePickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.settle(this);
    }
}
