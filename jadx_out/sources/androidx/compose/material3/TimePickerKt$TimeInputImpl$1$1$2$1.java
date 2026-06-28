package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "newValue", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$2$1 extends kotlin.jvm.internal.n0 implements v3.l<TextFieldValue, r2> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<TextFieldValue, r2> {
        final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<TextFieldValue> mutableState) {
            super(1);
            this.$hourValue$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TextFieldValue textFieldValue) {
            this.$hourValue$delegate.setValue(textFieldValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$2$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextFieldValue textFieldValue) {
        TextFieldValue TimeInputImpl$lambda$5;
        int m2176getHourJiIwxys = Selection.Companion.m2176getHourJiIwxys();
        TimePickerState timePickerState = this.$state;
        TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
        TimePickerKt.m2487timeInputOnChangegIWD5Rc(m2176getHourJiIwxys, timePickerState, textFieldValue, TimeInputImpl$lambda$5, this.$state.is24hour() ? 23 : 12, new AnonymousClass1(this.$hourValue$delegate));
    }
}
