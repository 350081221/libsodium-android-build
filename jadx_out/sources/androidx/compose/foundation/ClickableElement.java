package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "Z", "", "onClickLabel", "Ljava/lang/String;", "Landroidx/compose/ui/semantics/Role;", "role", "Landroidx/compose/ui/semantics/Role;", "Lkotlin/Function0;", "onClick", "Lv3/a;", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;

    @p4.l
    private final MutableInteractionSource interactionSource;

    @p4.l
    private final v3.a<r2> onClick;

    @p4.m
    private final String onClickLabel;

    @p4.m
    private final Role role;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a aVar, int i5, w wVar) {
        this(mutableInteractionSource, z4, str, (i5 & 8) != 0 ? null : role, aVar, null);
    }

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a aVar, w wVar) {
        this(mutableInteractionSource, z4, str, role, aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (l0.g(this.interactionSource, clickableElement.interactionSource) && this.enabled == clickableElement.enabled && l0.g(this.onClickLabel, clickableElement.onClickLabel) && l0.g(this.role, clickableElement.role) && l0.g(this.onClick, clickableElement.onClick)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int hashCode = ((this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int i6 = 0;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i7 = (hashCode + i5) * 31;
        Role role = this.role;
        if (role != null) {
            i6 = Role.m5370hashCodeimpl(role.m5372unboximpl());
        }
        return ((i7 + i6) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
    }

    private ClickableElement(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a<r2> aVar) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l ClickableNode clickableNode) {
        clickableNode.m244updateXHw0xAI(this.interactionSource, this.enabled, this.onClickLabel, this.role, this.onClick);
    }
}
