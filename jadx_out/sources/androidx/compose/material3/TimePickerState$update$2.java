package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.e1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", i = {}, l = {689, 691}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TimePickerState$update$2 extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ boolean $fromTap;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ TimePickerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$update$2(TimePickerState timePickerState, float f5, boolean z4, kotlin.coroutines.d<? super TimePickerState$update$2> dVar) {
        super(1, dVar);
        this.this$0 = timePickerState;
        this.$value = f5;
        this.$fromTap = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, dVar);
    }

    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((TimePickerState$update$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        int minute;
        int minute2;
        int minute3;
        float offsetHour;
        int hour;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            if (Selection.m2172equalsimpl0(this.this$0.m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2176getHourJiIwxys())) {
                TimePickerState timePickerState = this.this$0;
                hour = timePickerState.toHour(this.$value);
                timePickerState.setHourAngle$material3_release((hour % 12) * 0.5235988f);
            } else if (this.$fromTap) {
                TimePickerState timePickerState2 = this.this$0;
                minute2 = timePickerState2.toMinute(this.$value);
                minute3 = this.this$0.toMinute(this.$value);
                timePickerState2.setMinuteAngle$material3_release((minute2 - (minute3 % 5)) * 0.10471976f);
            } else {
                TimePickerState timePickerState3 = this.this$0;
                minute = timePickerState3.toMinute(this.$value);
                timePickerState3.setMinuteAngle$material3_release(minute * 0.10471976f);
            }
            if (this.$fromTap) {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release = this.this$0.getCurrentAngle$material3_release();
                Float e5 = kotlin.coroutines.jvm.internal.b.e(this.this$0.getMinuteAngle$material3_release());
                this.label = 1;
                if (currentAngle$material3_release.snapTo(e5, this) == l5) {
                    return l5;
                }
            } else {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release2 = this.this$0.getCurrentAngle$material3_release();
                offsetHour = this.this$0.offsetHour(this.$value);
                Float e6 = kotlin.coroutines.jvm.internal.b.e(offsetHour);
                this.label = 2;
                if (currentAngle$material3_release2.snapTo(e6, this) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
