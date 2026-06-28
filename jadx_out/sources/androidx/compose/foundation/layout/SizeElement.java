package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BP\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SizeNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "Z", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "<init>", "(FFFFZLv3/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f5, float f6, float f7, float f8, boolean z4, v3.l lVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f5, (i5 & 2) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, (i5 & 4) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f7, (i5 & 8) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f8, z4, lVar, null);
    }

    public /* synthetic */ SizeElement(float f5, float f6, float f7, float f8, boolean z4, v3.l lVar, w wVar) {
        this(f5, f6, f7, f8, z4, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (Dp.m6049equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m6049equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m6049equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m6049equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m6050hashCodeimpl(this.minWidth) * 31) + Dp.m6050hashCodeimpl(this.minHeight)) * 31) + Dp.m6050hashCodeimpl(this.maxWidth)) * 31) + Dp.m6050hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l SizeNode sizeNode) {
        sizeNode.m618setMinWidth0680j_4(this.minWidth);
        sizeNode.m617setMinHeight0680j_4(this.minHeight);
        sizeNode.m616setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m615setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f5, float f6, float f7, float f8, boolean z4, v3.l<? super InspectorInfo, r2> lVar) {
        this.minWidth = f5;
        this.minHeight = f6;
        this.maxWidth = f7;
        this.maxHeight = f8;
        this.enforceIncoming = z4;
        this.inspectorInfo = lVar;
    }
}
