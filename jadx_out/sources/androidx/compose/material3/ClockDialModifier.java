package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\f\u0010\f\u001a\u00020\t*\u00020\u000bH\u0016J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/ClockDialModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/material3/TimePickerState;", "component1", "", "component2", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "state", "autoSwitchToMinute", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/material3/TimePickerState;", "Z", "<init>", "(Landroidx/compose/material3/TimePickerState;Z)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final boolean autoSwitchToMinute;

    @p4.l
    private final TimePickerState state;

    public ClockDialModifier(@p4.l TimePickerState timePickerState, boolean z4) {
        this.state = timePickerState;
        this.autoSwitchToMinute = z4;
    }

    private final TimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    public static /* synthetic */ ClockDialModifier copy$default(ClockDialModifier clockDialModifier, TimePickerState timePickerState, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            timePickerState = clockDialModifier.state;
        }
        if ((i5 & 2) != 0) {
            z4 = clockDialModifier.autoSwitchToMinute;
        }
        return clockDialModifier.copy(timePickerState, z4);
    }

    @p4.l
    public final ClockDialModifier copy(@p4.l TimePickerState timePickerState, boolean z4) {
        return new ClockDialModifier(timePickerState, z4);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return kotlin.jvm.internal.l0.g(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
    }

    @p4.l
    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l ClockDialNode clockDialNode) {
        clockDialNode.updateNode(this.state, this.autoSwitchToMinute);
    }
}
