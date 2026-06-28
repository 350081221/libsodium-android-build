package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "", "isCanFocusSet", "Lkotlin/r2;", "reset", "canFocusValue", "Ljava/lang/Boolean;", b.f22420d, "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
/* loaded from: classes.dex */
final class CanFocusChecker implements FocusProperties {

    @l
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();

    @m
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written".toString());
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z4) {
        canFocusValue = Boolean.valueOf(z4);
    }
}
