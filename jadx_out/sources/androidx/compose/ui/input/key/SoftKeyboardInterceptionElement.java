package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "component1", "component2", "onKeyEvent", "onPreKeyEvent", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Lv3/l;", "getOnKeyEvent", "()Lv3/l;", "getOnPreKeyEvent", "<init>", "(Lv3/l;Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {

    @m
    private final l<KeyEvent, Boolean> onKeyEvent;

    @m
    private final l<KeyEvent, Boolean> onPreKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@m l<? super KeyEvent, Boolean> lVar, @m l<? super KeyEvent, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreKeyEvent = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, l lVar, l lVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i5 & 2) != 0) {
            lVar2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(lVar, lVar2);
    }

    @m
    public final l<KeyEvent, Boolean> component1() {
        return this.onKeyEvent;
    }

    @m
    public final l<KeyEvent, Boolean> component2() {
        return this.onPreKeyEvent;
    }

    @p4.l
    public final SoftKeyboardInterceptionElement copy(@m l<? super KeyEvent, Boolean> lVar, @m l<? super KeyEvent, Boolean> lVar2) {
        return new SoftKeyboardInterceptionElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return l0.g(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && l0.g(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
    }

    @m
    public final l<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @m
    public final l<KeyEvent, Boolean> getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        if (lVar != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", lVar);
        }
        l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        if (lVar2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", lVar2);
        }
    }

    @p4.l
    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
