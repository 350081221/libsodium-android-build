package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "create", "node", "Lkotlin/r2;", "update", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "Lv3/l;", "getExclusion", "()Lv3/l;", "<init>", "(Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {

    @p4.m
    private final v3.l<LayoutCoordinates, Rect> exclusion;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(@p4.m v3.l<? super LayoutCoordinates, Rect> lVar) {
        this.exclusion = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (!(obj instanceof ExcludeFromSystemGestureElement)) {
            return false;
        }
        return l0.g(this.exclusion, ((ExcludeFromSystemGestureElement) obj).exclusion);
    }

    @p4.m
    public final v3.l<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        v3.l<LayoutCoordinates, Rect> lVar = this.exclusion;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("systemGestureExclusion");
        if (this.exclusion != null) {
            inspectorInfo.getProperties().set("exclusion", this.exclusion);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    @SuppressLint({"NewApi"})
    public ExcludeFromSystemGestureNode create() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l ExcludeFromSystemGestureNode excludeFromSystemGestureNode) {
        excludeFromSystemGestureNode.setRect(this.exclusion);
    }
}
