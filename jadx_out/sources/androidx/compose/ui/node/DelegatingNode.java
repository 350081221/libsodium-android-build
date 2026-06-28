package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import p4.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0004J$\u0010 \u001a\u00020\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u001cH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0005H\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010%\u001a\u00020\u0005H\u0010¢\u0006\u0004\b$\u0010\"J\u000f\u0010'\u001a\u00020\u0005H\u0010¢\u0006\u0004\b&\u0010\"J\u000f\u0010)\u001a\u00020\u0005H\u0010¢\u0006\u0004\b(\u0010\"J\u000f\u0010+\u001a\u00020\u0005H\u0010¢\u0006\u0004\b*\u0010\"R \u0010,\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\"\u001a\u0004\b.\u0010/R$\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "", "delegateKindSet", "delegateNode", "Lkotlin/r2;", "validateDelegateKindSet", "newKindSet", "", "recalculateOwner", "updateNodeKindSet", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/DelegatableNode;", "T", "delegatableNode", "delegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "delegateUnprotected", "instance", "undelegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)V", "undelegateUnprotected", "delegate", "undelegate", "Lkotlin/Function1;", "block", "forEachImmediateDelegate$ui_release", "(Lv3/l;)V", "forEachImmediateDelegate", "markAsAttached$ui_release", "()V", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "selfKindSet", "I", "getSelfKindSet$ui_release", "()I", "getSelfKindSet$ui_release$annotations", "Landroidx/compose/ui/Modifier$Node;", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,277:1\n234#1,6:278\n234#1,6:290\n234#1,6:296\n234#1,6:302\n234#1,6:308\n234#1,6:314\n72#2:284\n72#2:286\n72#2:288\n55#3:285\n55#3:287\n55#3:289\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:278,6\n243#1:290,6\n254#1:296,6\n262#1:302,6\n268#1:308,6\n274#1:314,6\n106#1:284\n162#1:286\n176#1:288\n106#1:285\n162#1:287\n176#1:289\n*E\n"})
/* loaded from: classes.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;

    @m
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    private final void updateNodeKindSet(int i5, boolean z4) {
        int i6;
        Modifier.Node child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i5);
        if (kindSet$ui_release != i5) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i5);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node node2 = this;
                while (node2 != null) {
                    i5 |= node2.getKindSet$ui_release();
                    node2.setKindSet$ui_release(i5);
                    if (node2 == node) {
                        break;
                    } else {
                        node2 = node2.getParent$ui_release();
                    }
                }
                if (z4 && node2 == node) {
                    i5 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i5);
                }
                if (node2 != null && (child$ui_release = node2.getChild$ui_release()) != null) {
                    i6 = child$ui_release.getAggregateChildKindSet$ui_release();
                } else {
                    i6 = 0;
                }
                int i7 = i5 | i6;
                while (node2 != null) {
                    i7 |= node2.getKindSet$ui_release();
                    node2.setAggregateChildKindSet$ui_release(i7);
                    node2 = node2.getParent$ui_release();
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i5, Modifier.Node node) {
        boolean z4;
        int kindSet$ui_release = getKindSet$ui_release();
        boolean z5 = true;
        if ((i5 & NodeKind.m5204constructorimpl(2)) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if ((NodeKind.m5204constructorimpl(2) & kindSet$ui_release) == 0) {
                z5 = false;
            }
            if (z5 && !(this instanceof LayoutModifierNode)) {
                throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final <T extends DelegatableNode> T delegate(@l T t5) {
        boolean z4;
        boolean z5;
        Modifier.Node node;
        Modifier.Node node2 = t5.getNode();
        boolean z6 = true;
        if (node2 != t5) {
            z4 = true;
        } else {
            z4 = false;
        }
        Modifier.Node node3 = null;
        if (z4) {
            if (t5 instanceof Modifier.Node) {
                node = (Modifier.Node) t5;
            } else {
                node = null;
            }
            if (node != null) {
                node3 = node.getParent$ui_release();
            }
            if (node2 != getNode() || !l0.g(node3, this)) {
                z6 = false;
            }
            if (z6) {
                return t5;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (!node2.isAttached()) {
            node2.setAsDelegateTo$ui_release(getNode());
            int kindSet$ui_release = getKindSet$ui_release();
            int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node2);
            node2.setKindSet$ui_release(calculateNodeKindSetFromIncludingDelegates);
            validateDelegateKindSet(calculateNodeKindSetFromIncludingDelegates, node2);
            node2.setChild$ui_release(this.delegate);
            this.delegate = node2;
            node2.setParent$ui_release(this);
            updateNodeKindSet(getKindSet$ui_release() | calculateNodeKindSetFromIncludingDelegates, false);
            if (isAttached()) {
                if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m5204constructorimpl(2)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if ((kindSet$ui_release & NodeKind.m5204constructorimpl(2)) == 0) {
                        z6 = false;
                    }
                    if (!z6) {
                        NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                        getNode().updateCoordinator$ui_release(null);
                        nodes$ui_release.syncCoordinators();
                        node2.markAsAttached$ui_release();
                        node2.runAttachLifecycle$ui_release();
                        NodeKindKt.autoInvalidateInsertedNode(node2);
                    }
                }
                updateCoordinator$ui_release(getCoordinator$ui_release());
                node2.markAsAttached$ui_release();
                node2.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(node2);
            }
            return t5;
        }
        throw new IllegalStateException("Cannot delegate to an already attached node".toString());
    }

    @l
    @p
    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(@l T t5) {
        return (T) delegate(t5);
    }

    public final void forEachImmediateDelegate$ui_release(@l v3.l<? super Modifier.Node, r2> lVar) {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            lVar.invoke(delegate$ui_release);
        }
    }

    @m
    public final Modifier.Node getDelegate$ui_release() {
        return this.delegate;
    }

    public final int getSelfKindSet$ui_release() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    public final void setDelegate$ui_release(@m Modifier.Node node) {
        this.delegate = node;
    }

    protected final void undelegate(@l DelegatableNode delegatableNode) {
        boolean z4;
        boolean z5;
        boolean z6;
        Modifier.Node node = this.delegate;
        Modifier.Node node2 = null;
        while (true) {
            z4 = true;
            if (node != null) {
                if (node == delegatableNode) {
                    if (node.isAttached()) {
                        NodeKindKt.autoInvalidateRemovedNode(node);
                        node.runDetachLifecycle$ui_release();
                        node.markAsDetached$ui_release();
                    }
                    node.setAsDelegateTo$ui_release(node);
                    node.setAggregateChildKindSet$ui_release(0);
                    if (node2 == null) {
                        this.delegate = node.getChild$ui_release();
                    } else {
                        node2.setChild$ui_release(node.getChild$ui_release());
                    }
                    node.setChild$ui_release(null);
                    node.setParent$ui_release(null);
                    z5 = true;
                } else {
                    node2 = node;
                    node = node.getChild$ui_release();
                }
            } else {
                z5 = false;
                break;
            }
        }
        if (z5) {
            int kindSet$ui_release = getKindSet$ui_release();
            int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
            updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
            if (isAttached()) {
                if ((kindSet$ui_release & NodeKind.m5204constructorimpl(2)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if ((NodeKind.m5204constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                        z4 = false;
                    }
                    if (!z4) {
                        NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                        getNode().updateCoordinator$ui_release(null);
                        nodes$ui_release.syncCoordinators();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    @p
    public final void undelegateUnprotected$ui_release(@l DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(@m NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(nodeCoordinator);
        }
    }
}
