package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "fraction", "F", "getFraction", "()F", "Landroidx/compose/runtime/State;", "widthState", "Landroidx/compose/runtime/State;", "getWidthState", "()Landroidx/compose/runtime/State;", "heightState", "getHeightState", "", "inspectorName", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    private final float fraction;

    @m
    private final State<Integer> heightState;

    @l
    private final String inspectorName;

    @m
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f5, State state, State state2, String str, int i5, w wVar) {
        this(f5, (i5 & 2) != 0 ? null : state, (i5 & 4) != 0 ? null : state2, str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        if (this.fraction == parentSizeElement.fraction) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && l0.g(this.widthState, parentSizeElement.widthState) && l0.g(this.heightState, parentSizeElement.heightState)) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @m
    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    @l
    public final String getInspectorName() {
        return this.inspectorName;
    }

    @m
    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        State<Integer> state = this.widthState;
        int i6 = 0;
        if (state != null) {
            i5 = state.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = i5 * 31;
        State<Integer> state2 = this.heightState;
        if (state2 != null) {
            i6 = state2.hashCode();
        }
        return ((i7 + i6) * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.setValue(Float.valueOf(this.fraction));
    }

    public ParentSizeElement(float f5, @m State<Integer> state, @m State<Integer> state2, @l String str) {
        this.fraction = f5;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public ParentSizeNode create() {
        return new ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l ParentSizeNode parentSizeNode) {
        parentSizeNode.setFraction(this.fraction);
        parentSizeNode.setWidthState(this.widthState);
        parentSizeNode.setHeightState(this.heightState);
    }
}
