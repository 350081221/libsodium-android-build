package androidx.compose.material3;

@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/TimePickerState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$rememberTimePickerState$1$1 extends kotlin.jvm.internal.n0 implements v3.a<TimePickerState> {
    final /* synthetic */ int $initialHour;
    final /* synthetic */ int $initialMinute;
    final /* synthetic */ boolean $is24Hour;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$rememberTimePickerState$1$1(int i5, int i6, boolean z4) {
        super(0);
        this.$initialHour = i5;
        this.$initialMinute = i6;
        this.$is24Hour = z4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final TimePickerState invoke() {
        return new TimePickerState(this.$initialHour, this.$initialMinute, this.$is24Hour);
    }
}
