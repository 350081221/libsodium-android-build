package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "update-XHw0xAI", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V", "update", "Landroidx/compose/foundation/ClickableSemanticsNode;", "clickableSemanticsNode", "Landroidx/compose/foundation/ClickableSemanticsNode;", "getClickableSemanticsNode", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "Landroidx/compose/foundation/ClickablePointerInputNode;", "clickablePointerInputNode", "Landroidx/compose/foundation/ClickablePointerInputNode;", "getClickablePointerInputNode", "()Landroidx/compose/foundation/ClickablePointerInputNode;", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableNode extends AbstractClickableNode {

    @p4.l
    private final ClickablePointerInputNode clickablePointerInputNode;

    @p4.l
    private final ClickableSemanticsNode clickableSemanticsNode;

    private ClickableNode(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a<r2> aVar) {
        super(mutableInteractionSource, z4, str, role, aVar, null);
        this.clickableSemanticsNode = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z4, str, role, aVar, null, null, null));
        this.clickablePointerInputNode = (ClickablePointerInputNode) delegate(new ClickablePointerInputNode(z4, mutableInteractionSource, aVar, getInteractionData()));
    }

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, boolean z4, String str, Role role, v3.a aVar, w wVar) {
        this(mutableInteractionSource, z4, str, role, aVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @p4.l
    public ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    /* renamed from: update-XHw0xAI, reason: not valid java name */
    public final void m244updateXHw0xAI(@p4.l MutableInteractionSource mutableInteractionSource, boolean z4, @p4.m String str, @p4.m Role role, @p4.l v3.a<r2> aVar) {
        m172updateCommonXHw0xAI(mutableInteractionSource, z4, str, role, aVar);
        getClickableSemanticsNode().m247updateUMe6uN4(z4, str, role, aVar, null, null);
        getClickablePointerInputNode().update(z4, mutableInteractionSource, aVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @p4.l
    public ClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }
}
