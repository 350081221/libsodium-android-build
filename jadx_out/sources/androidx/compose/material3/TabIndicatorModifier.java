package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/TabIndicatorOffsetNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "component1", "", "component2", "", "component3", "tabPositionsState", "selectedTabIndex", "followContentSize", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/runtime/State;", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "I", "getSelectedTabIndex", "()I", "Z", "getFollowContentSize", "()Z", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final boolean followContentSize;
    private final int selectedTabIndex;

    @p4.l
    private final State<List<TabPosition>> tabPositionsState;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(@p4.l State<? extends List<TabPosition>> state, int i5, boolean z4) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i5;
        this.followContentSize = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i6 & 2) != 0) {
            i5 = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i6 & 4) != 0) {
            z4 = tabIndicatorModifier.followContentSize;
        }
        return tabIndicatorModifier.copy(state, i5, z4);
    }

    @p4.l
    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    public final int component2() {
        return this.selectedTabIndex;
    }

    public final boolean component3() {
        return this.followContentSize;
    }

    @p4.l
    public final TabIndicatorModifier copy(@p4.l State<? extends List<TabPosition>> state, int i5, boolean z4) {
        return new TabIndicatorModifier(state, i5, z4);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return kotlin.jvm.internal.l0.g(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @p4.l
    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.tabPositionsState.hashCode() * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.followContentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
    }

    @p4.l
    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.setTabPositionsState(this.tabPositionsState);
        tabIndicatorOffsetNode.setSelectedTabIndex(this.selectedTabIndex);
        tabIndicatorOffsetNode.setFollowContentSize(this.followContentSize);
    }
}
