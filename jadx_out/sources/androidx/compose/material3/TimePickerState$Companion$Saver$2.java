package androidx.compose.material3;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material3/TimePickerState;", t0.b.f22420d, "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerState$Companion$Saver$2 extends kotlin.jvm.internal.n0 implements v3.l<List, TimePickerState> {
    public static final TimePickerState$Companion$Saver$2 INSTANCE = new TimePickerState$Companion$Saver$2();

    TimePickerState$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ TimePickerState invoke(List list) {
        return invoke2((List<? extends Object>) list);
    }

    @p4.m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final TimePickerState invoke2(@p4.l List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj2).intValue();
        Object obj3 = list.get(2);
        kotlin.jvm.internal.l0.n(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        return new TimePickerState(intValue, intValue2, ((Boolean) obj3).booleanValue());
    }
}
