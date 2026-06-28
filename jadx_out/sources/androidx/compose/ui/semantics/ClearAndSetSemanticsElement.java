package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016J\u001a\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\fHÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\fHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/u;", "component1", "properties", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/l;", "getProperties", "()Lv3/l;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;

    @l
    private final v3.l<SemanticsPropertyReceiver, r2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        this.properties = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = clearAndSetSemanticsElement.properties;
        }
        return clearAndSetSemanticsElement.copy(lVar);
    }

    @l
    public final v3.l<SemanticsPropertyReceiver, r2> component1() {
        return this.properties;
    }

    @l
    public final ClearAndSetSemanticsElement copy(@l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        return new ClearAndSetSemanticsElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && l0.g(this.properties, ((ClearAndSetSemanticsElement) obj).properties);
    }

    @l
    public final v3.l<SemanticsPropertyReceiver, r2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @l
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clearAndSetSemantics");
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @l
    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
