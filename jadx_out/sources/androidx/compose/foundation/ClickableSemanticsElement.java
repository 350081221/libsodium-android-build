package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableSemanticsNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "enabled", "Z", "Landroidx/compose/ui/semantics/Role;", "role", "Landroidx/compose/ui/semantics/Role;", "", "onLongClickLabel", "Ljava/lang/String;", "Lkotlin/Function0;", "onLongClick", "Lv3/a;", "onClickLabel", "onClick", "<init>", "(ZLandroidx/compose/ui/semantics/Role;Ljava/lang/String;Lv3/a;Ljava/lang/String;Lv3/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableSemanticsElement extends ModifierNodeElement<ClickableSemanticsNode> {
    private final boolean enabled;

    @p4.l
    private final v3.a<r2> onClick;

    @p4.m
    private final String onClickLabel;

    @p4.m
    private final v3.a<r2> onLongClick;

    @p4.m
    private final String onLongClickLabel;

    @p4.m
    private final Role role;

    private ClickableSemanticsElement(boolean z4, Role role, String str, v3.a<r2> aVar, String str2, v3.a<r2> aVar2) {
        this.enabled = z4;
        this.role = role;
        this.onLongClickLabel = str;
        this.onLongClick = aVar;
        this.onClickLabel = str2;
        this.onClick = aVar2;
    }

    public /* synthetic */ ClickableSemanticsElement(boolean z4, Role role, String str, v3.a aVar, String str2, v3.a aVar2, w wVar) {
        this(z4, role, str, aVar, str2, aVar2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        if (this.enabled == clickableSemanticsElement.enabled && l0.g(this.role, clickableSemanticsElement.role) && l0.g(this.onLongClickLabel, clickableSemanticsElement.onLongClickLabel) && l0.g(this.onLongClick, clickableSemanticsElement.onLongClick) && l0.g(this.onClickLabel, clickableSemanticsElement.onClickLabel) && l0.g(this.onClick, clickableSemanticsElement.onClick)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int i6;
        int i7;
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        Role role = this.role;
        int i8 = 0;
        if (role != null) {
            i5 = role.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (hashCode + i5) * 31;
        String str = this.onLongClickLabel;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        v3.a<r2> aVar = this.onLongClick;
        if (aVar != null) {
            i7 = aVar.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i10 + i7) * 31;
        String str2 = this.onClickLabel;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((i11 + i8) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public ClickableSemanticsNode create() {
        return new ClickableSemanticsNode(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l ClickableSemanticsNode clickableSemanticsNode) {
        clickableSemanticsNode.m247updateUMe6uN4(this.enabled, this.onClickLabel, this.role, this.onClick, this.onLongClickLabel, this.onLongClick);
    }
}
