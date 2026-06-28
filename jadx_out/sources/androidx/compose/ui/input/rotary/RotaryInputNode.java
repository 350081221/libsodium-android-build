package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputNode;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", NotificationCompat.CATEGORY_EVENT, "", "onRotaryScrollEvent", "onPreRotaryScrollEvent", "Lkotlin/Function1;", "onEvent", "Lv3/l;", "getOnEvent", "()Lv3/l;", "setOnEvent", "(Lv3/l;)V", "onPreEvent", "getOnPreEvent", "setOnPreEvent", "<init>", "(Lv3/l;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {

    @m
    private l<? super RotaryScrollEvent, Boolean> onEvent;

    @m
    private l<? super RotaryScrollEvent, Boolean> onPreEvent;

    public RotaryInputNode(@m l<? super RotaryScrollEvent, Boolean> lVar, @m l<? super RotaryScrollEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @m
    public final l<RotaryScrollEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @m
    public final l<RotaryScrollEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(@p4.l RotaryScrollEvent rotaryScrollEvent) {
        l<? super RotaryScrollEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(@p4.l RotaryScrollEvent rotaryScrollEvent) {
        l<? super RotaryScrollEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@m l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(@m l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
