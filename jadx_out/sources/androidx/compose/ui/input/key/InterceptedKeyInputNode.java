package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "onInterceptKeyBeforeSoftKeyboard-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onInterceptKeyBeforeSoftKeyboard", "onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo", "onPreInterceptKeyBeforeSoftKeyboard", "Lkotlin/Function1;", "onEvent", "Lv3/l;", "getOnEvent", "()Lv3/l;", "setOnEvent", "(Lv3/l;)V", "onPreEvent", "getOnPreEvent", "setOnPreEvent", "<init>", "(Lv3/l;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {

    @m
    private l<? super KeyEvent, Boolean> onEvent;

    @m
    private l<? super KeyEvent, Boolean> onPreEvent;

    public InterceptedKeyInputNode(@m l<? super KeyEvent, Boolean> lVar, @m l<? super KeyEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @m
    public final l<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @m
    public final l<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo4423onInterceptKeyBeforeSoftKeyboardZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        l<? super KeyEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m4719boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo4424onPreInterceptKeyBeforeSoftKeyboardZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        l<? super KeyEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m4719boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@m l<? super KeyEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(@m l<? super KeyEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
