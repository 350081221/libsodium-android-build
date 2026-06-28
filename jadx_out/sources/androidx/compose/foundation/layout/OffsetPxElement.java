package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0016R(\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", "toString", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/u;", TypedValues.CycleType.S_WAVE_OFFSET, "Lv3/l;", "getOffset", "()Lv3/l;", "rtlAware", "Z", "getRtlAware", "()Z", "inspectorInfo", "getInspectorInfo", "<init>", "(Lv3/l;ZLv3/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;

    @l
    private final v3.l<Density, IntOffset> offset;
    private final boolean rtlAware;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(@l v3.l<? super Density, IntOffset> lVar, boolean z4, @l v3.l<? super InspectorInfo, r2> lVar2) {
        this.offset = lVar;
        this.rtlAware = z4;
        this.inspectorInfo = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement == null) {
            return false;
        }
        if (l0.g(this.offset, offsetPxElement.offset) && this.rtlAware == offsetPxElement.rtlAware) {
            return true;
        }
        return false;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @l
    public final v3.l<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @l
    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l OffsetPxNode offsetPxNode) {
        offsetPxNode.setOffset(this.offset);
        offsetPxNode.setRtlAware(this.rtlAware);
    }
}
