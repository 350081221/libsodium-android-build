package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRequesterNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/focus/FocusRequester;", "component1", "focusRequester", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n735#2,2:82\n728#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n57#1:82,2\n59#1:84,2\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {

    @l
    private final FocusRequester focusRequester;

    public FocusRequesterElement(@l FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ FocusRequesterElement copy$default(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            focusRequester = focusRequesterElement.focusRequester;
        }
        return focusRequesterElement.copy(focusRequester);
    }

    @l
    public final FocusRequester component1() {
        return this.focusRequester;
    }

    @l
    public final FocusRequesterElement copy(@l FocusRequester focusRequester) {
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l0.g(this.focusRequester, ((FocusRequesterElement) obj).focusRequester);
    }

    @l
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.focusRequester);
    }

    @l
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public FocusRequesterNode create() {
        return new FocusRequesterNode(this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l FocusRequesterNode focusRequesterNode) {
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().remove(focusRequesterNode);
        focusRequesterNode.setFocusRequester(this.focusRequester);
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui_release().add(focusRequesterNode);
    }
}
