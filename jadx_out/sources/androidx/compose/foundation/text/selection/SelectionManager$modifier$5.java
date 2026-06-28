package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionManager$modifier$5 extends n0 implements l<KeyEvent, Boolean> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$5(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m1028invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m1028invokeZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        boolean z4;
        if (SelectionManager_androidKt.m1033isCopyKeyEventZmokQxo(keyEvent)) {
            this.this$0.copy$foundation_release();
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
