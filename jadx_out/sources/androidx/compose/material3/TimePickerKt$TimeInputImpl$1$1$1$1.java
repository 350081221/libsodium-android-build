package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$TimeInputImpl$1$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<KeyEvent, Boolean> {
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1$1$1(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$state = timePickerState;
        this.$hourValue$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m2488invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r6.getText().length() == 2) goto L15;
     */
    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean m2488invokeZmokQxo(@p4.l android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r6 = androidx.compose.ui.input.key.KeyEvent_androidKt.m4738getUtf16CodePointZmokQxo(r6)
            r0 = 48
            r1 = 1
            r2 = 0
            if (r0 > r6) goto L10
            r0 = 58
            if (r6 >= r0) goto L10
            r6 = r1
            goto L11
        L10:
            r6 = r2
        L11:
            if (r6 == 0) goto L35
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r6 = r5.$hourValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r6 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$5(r6)
            long r3 = r6.m5783getSelectiond9O1mEE()
            int r6 = androidx.compose.ui.text.TextRange.m5545getStartimpl(r3)
            r0 = 2
            if (r6 != r0) goto L35
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> r6 = r5.$hourValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r6 = androidx.compose.material3.TimePickerKt.access$TimeInputImpl$lambda$5(r6)
            java.lang.String r6 = r6.getText()
            int r6 = r6.length()
            if (r6 != r0) goto L35
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 == 0) goto L43
            androidx.compose.material3.TimePickerState r6 = r5.$state
            androidx.compose.material3.Selection$Companion r0 = androidx.compose.material3.Selection.Companion
            int r0 = r0.m2177getMinuteJiIwxys()
            r6.m2503setSelectioniHAOin8$material3_release(r0)
        L43:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1.m2488invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
    }
}
