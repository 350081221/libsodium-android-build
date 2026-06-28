package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRestorerNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "component1", "onRestoreFailed", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/a;", "getOnRestoreFailed", "()Lv3/a;", "<init>", "(Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {

    @m
    private final a<FocusRequester> onRestoreFailed;

    public FocusRestorerElement(@m a<FocusRequester> aVar) {
        this.onRestoreFailed = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = focusRestorerElement.onRestoreFailed;
        }
        return focusRestorerElement.copy(aVar);
    }

    @m
    public final a<FocusRequester> component1() {
        return this.onRestoreFailed;
    }

    @l
    public final FocusRestorerElement copy(@m a<FocusRequester> aVar) {
        return new FocusRestorerElement(aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && l0.g(this.onRestoreFailed, ((FocusRestorerElement) obj).onRestoreFailed);
    }

    @m
    public final a<FocusRequester> getOnRestoreFailed() {
        return this.onRestoreFailed;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        a<FocusRequester> aVar = this.onRestoreFailed;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("onRestoreFailed", this.onRestoreFailed);
    }

    @l
    public String toString() {
        return "FocusRestorerElement(onRestoreFailed=" + this.onRestoreFailed + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setOnRestoreFailed(this.onRestoreFailed);
    }
}
