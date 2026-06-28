package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 Jn\u0010\u0013\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNodeImpl;", "Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "update-xpl5gLE", "(Lv3/a;Ljava/lang/String;Lv3/a;Lv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "update", "Lv3/a;", "Landroidx/compose/foundation/ClickableSemanticsNode;", "clickableSemanticsNode", "Landroidx/compose/foundation/ClickableSemanticsNode;", "getClickableSemanticsNode", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "clickablePointerInputNode", "Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "getClickablePointerInputNode", "()Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "<init>", "(Lv3/a;Ljava/lang/String;Lv3/a;Lv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class CombinedClickableNodeImpl extends AbstractClickableNode implements CombinedClickableNode {

    @p4.l
    private final CombinedClickablePointerInputNode clickablePointerInputNode;

    @p4.l
    private final ClickableSemanticsNode clickableSemanticsNode;

    @p4.m
    private v3.a<r2> onLongClick;

    private CombinedClickableNodeImpl(v3.a<r2> aVar, String str, v3.a<r2> aVar2, v3.a<r2> aVar3, MutableInteractionSource mutableInteractionSource, boolean z4, String str2, Role role) {
        super(mutableInteractionSource, z4, str2, role, aVar, null);
        this.onLongClick = aVar2;
        this.clickableSemanticsNode = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z4, str2, role, aVar, str, aVar2, null));
        this.clickablePointerInputNode = (CombinedClickablePointerInputNode) delegate(new CombinedClickablePointerInputNode(z4, mutableInteractionSource, aVar, getInteractionData(), this.onLongClick, aVar3));
    }

    public /* synthetic */ CombinedClickableNodeImpl(v3.a aVar, String str, v3.a aVar2, v3.a aVar3, MutableInteractionSource mutableInteractionSource, boolean z4, String str2, Role role, w wVar) {
        this(aVar, str, aVar2, aVar3, mutableInteractionSource, z4, str2, role);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @p4.l
    public ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    @Override // androidx.compose.foundation.CombinedClickableNode
    /* renamed from: update-xpl5gLE */
    public void mo252updatexpl5gLE(@p4.l v3.a<r2> aVar, @p4.m String str, @p4.m v3.a<r2> aVar2, @p4.m v3.a<r2> aVar3, @p4.l MutableInteractionSource mutableInteractionSource, boolean z4, @p4.m String str2, @p4.m Role role) {
        boolean z5;
        boolean z6 = true;
        if (this.onLongClick == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (aVar2 != null) {
            z6 = false;
        }
        if (z5 != z6) {
            disposeInteractionSource();
        }
        this.onLongClick = aVar2;
        m172updateCommonXHw0xAI(mutableInteractionSource, z4, str2, role, aVar);
        getClickableSemanticsNode().m247updateUMe6uN4(z4, str2, role, aVar, str, aVar2);
        getClickablePointerInputNode().update(z4, mutableInteractionSource, aVar, aVar2, aVar3);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @p4.l
    public CombinedClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }
}
