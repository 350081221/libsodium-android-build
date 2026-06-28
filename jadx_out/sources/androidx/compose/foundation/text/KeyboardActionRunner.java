package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Lkotlin/r2;", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    @m
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(@m SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo852defaultKeyboardActionKlQnJC8(int i5) {
        boolean m5709equalsimpl0;
        boolean m5709equalsimpl02;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5724getNexteUduSuo())) {
            getFocusManager().mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3423getNextdhqQ8s());
            return;
        }
        if (ImeAction.m5709equalsimpl0(i5, companion.m5726getPreviouseUduSuo())) {
            getFocusManager().mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3424getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m5709equalsimpl0(i5, companion.m5722getDoneeUduSuo())) {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
                return;
            }
            return;
        }
        boolean z4 = true;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5723getGoeUduSuo())) {
            m5709equalsimpl0 = true;
        } else {
            m5709equalsimpl0 = ImeAction.m5709equalsimpl0(i5, companion.m5727getSearcheUduSuo());
        }
        if (m5709equalsimpl0) {
            m5709equalsimpl02 = true;
        } else {
            m5709equalsimpl02 = ImeAction.m5709equalsimpl0(i5, companion.m5728getSendeUduSuo());
        }
        if (!m5709equalsimpl02) {
            z4 = ImeAction.m5709equalsimpl0(i5, companion.m5721getDefaulteUduSuo());
        }
        if (!z4) {
            ImeAction.m5709equalsimpl0(i5, companion.m5725getNoneeUduSuo());
        }
    }

    @l
    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        l0.S("focusManager");
        return null;
    }

    @l
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        l0.S("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m853runActionKlQnJC8(int i5) {
        boolean m5709equalsimpl0;
        v3.l<KeyboardActionScope, r2> lVar;
        ImeAction.Companion companion = ImeAction.Companion;
        r2 r2Var = null;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5722getDoneeUduSuo())) {
            lVar = getKeyboardActions().getOnDone();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5723getGoeUduSuo())) {
            lVar = getKeyboardActions().getOnGo();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5724getNexteUduSuo())) {
            lVar = getKeyboardActions().getOnNext();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5726getPreviouseUduSuo())) {
            lVar = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5727getSearcheUduSuo())) {
            lVar = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5728getSendeUduSuo())) {
            lVar = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m5709equalsimpl0(i5, companion.m5721getDefaulteUduSuo())) {
                m5709equalsimpl0 = true;
            } else {
                m5709equalsimpl0 = ImeAction.m5709equalsimpl0(i5, companion.m5725getNoneeUduSuo());
            }
            if (m5709equalsimpl0) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            r2Var = r2.f19517a;
        }
        if (r2Var == null) {
            mo852defaultKeyboardActionKlQnJC8(i5);
        }
    }

    public final void setFocusManager(@l FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(@l KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }
}
