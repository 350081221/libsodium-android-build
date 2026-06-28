package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Lkotlin/r2;", "apply", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "Lkotlin/u;", "focusOrderReceiver", "Lv3/l;", "getFocusOrderReceiver", "()Lv3/l;", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;

    @l
    private final v3.l<FocusOrder, r2> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(@l v3.l<? super FocusOrder, r2> lVar) {
        this.focusOrderReceiver = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(@l FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    @l
    public final v3.l<FocusOrder, r2> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
