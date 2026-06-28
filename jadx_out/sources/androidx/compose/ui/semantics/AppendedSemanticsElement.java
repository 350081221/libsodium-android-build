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
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B(\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\f\u0010\t\u001a\u00020\u0006*\u00020\bH\u0016J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u001a\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000eHÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/u;", "component2", "mergeDescendants", "properties", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Z", "getMergeDescendants", "()Z", "Lv3/l;", "getProperties", "()Lv3/l;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "<init>", "(ZLv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final boolean mergeDescendants;

    @l
    private final v3.l<SemanticsPropertyReceiver, r2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z4, @l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        this.mergeDescendants = z4;
        this.properties = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i5 & 2) != 0) {
            lVar = appendedSemanticsElement.properties;
        }
        return appendedSemanticsElement.copy(z4, lVar);
    }

    public final boolean component1() {
        return this.mergeDescendants;
    }

    @l
    public final v3.l<SemanticsPropertyReceiver, r2> component2() {
        return this.properties;
    }

    @l
    public final AppendedSemanticsElement copy(boolean z4, @l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        return new AppendedSemanticsElement(z4, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && l0.g(this.properties, appendedSemanticsElement.properties);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @l
    public final v3.l<SemanticsPropertyReceiver, r2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @l
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @l
    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.mergeDescendants + ", properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setMergeDescendants(this.mergeDescendants);
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
