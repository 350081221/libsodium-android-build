package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "getMinWidth-D9Ej5fM", "()F", "minHeight", "getMinHeight-D9Ej5fM", "<init>", "(FFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f5, float f6, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f5, (i5 & 2) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, null);
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f5, float f6, w wVar) {
        this(f5, f6);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!Dp.m6049equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) || !Dp.m6049equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight)) {
            return false;
        }
        return true;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m619getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m620getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Dp.m6050hashCodeimpl(this.minWidth) * 31) + Dp.m6050hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", Dp.m6042boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", Dp.m6042boximpl(this.minHeight));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m624setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m623setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f5, float f6) {
        this.minWidth = f5;
        this.minHeight = f6;
    }
}
