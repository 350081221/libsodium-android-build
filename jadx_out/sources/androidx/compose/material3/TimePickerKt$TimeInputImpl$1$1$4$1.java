package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$4$1 extends kotlin.jvm.internal.n0 implements v3.l<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$4$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$minuteValue$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m2489invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean m2489invokeZmokQxo(@p4.l android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r3 = androidx.compose.ui.input.key.KeyEvent_androidKt.m4738getUtf16CodePointZmokQxo(r3)
            if (r3 != 0) goto L18
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r3 = r2.$minuteValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r3 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$8(r3)
            long r0 = r3.m5783getSelectiond9O1mEE()
            int r3 = androidx.compose.ui.text.TextRange.m5545getStartimpl(r0)
            if (r3 != 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L26
            androidx.compose.material3.TimePickerState r0 = r2.$state
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.Companion
            int r1 = r1.m2176getHourJiIwxys()
            r0.m2503setSelectioniHAOin8$material3_release(r1)
        L26:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1.m2489invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
    }
}
