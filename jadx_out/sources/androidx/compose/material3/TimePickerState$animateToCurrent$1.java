package androidx.compose.material3;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {703, TypedValues.TransitionType.TYPE_AUTO_TRANSITION}, m = "animateToCurrent$material3_release", n = {"this", "end"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
public final class TimePickerState$animateToCurrent$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$animateToCurrent$1(TimePickerState timePickerState, kotlin.coroutines.d<? super TimePickerState$animateToCurrent$1> dVar) {
        super(dVar);
        this.this$0 = timePickerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToCurrent$material3_release(this);
    }
}
