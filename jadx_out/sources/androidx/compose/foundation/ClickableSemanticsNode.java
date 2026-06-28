package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0012\u001a\u00020\n*\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "onLongClickLabel", "onLongClick", "update-UMe6uN4", "(ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Ljava/lang/String;Lv3/a;)V", "update", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Z", "Ljava/lang/String;", "Landroidx/compose/ui/semantics/Role;", "Lv3/a;", "getShouldMergeDescendantSemantics", "()Z", "shouldMergeDescendantSemantics", "<init>", "(ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Ljava/lang/String;Lv3/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    private boolean enabled;

    @p4.l
    private v3.a<r2> onClick;

    @p4.m
    private String onClickLabel;

    @p4.m
    private v3.a<r2> onLongClick;

    @p4.m
    private String onLongClickLabel;

    @p4.m
    private Role role;

    private ClickableSemanticsNode(boolean z4, String str, Role role, v3.a<r2> aVar, String str2, v3.a<r2> aVar2) {
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
    }

    public /* synthetic */ ClickableSemanticsNode(boolean z4, String str, Role role, v3.a aVar, String str2, v3.a aVar2, w wVar) {
        this(z4, str, role, aVar, str2, aVar2);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            l0.m(role);
            SemanticsPropertiesKt.m5389setRolekuIjeqM(semanticsPropertyReceiver, role.m5372unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new ClickableSemanticsNode$applySemantics$1(this));
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new ClickableSemanticsNode$applySemantics$2(this));
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    /* renamed from: update-UMe6uN4, reason: not valid java name */
    public final void m247updateUMe6uN4(boolean z4, @p4.m String str, @p4.m Role role, @p4.l v3.a<r2> aVar, @p4.m String str2, @p4.m v3.a<r2> aVar2) {
        this.enabled = z4;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
    }
}
