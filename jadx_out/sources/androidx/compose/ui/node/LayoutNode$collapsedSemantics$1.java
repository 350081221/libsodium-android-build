package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1477:1\n76#2:1478\n741#3,18:1479\n759#3,3:1541\n385#4,5:1497\n390#4:1503\n395#4,2:1505\n397#4,8:1510\n405#4,9:1521\n414#4,8:1533\n1#5:1502\n261#6:1504\n234#7,3:1507\n237#7,3:1530\n1208#8:1518\n1187#8,2:1519\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n*L\n422#1:1478\n422#1:1479,18\n422#1:1541,3\n422#1:1497,5\n422#1:1503\n422#1:1505,2\n422#1:1510,8\n422#1:1521,9\n422#1:1533,8\n422#1:1504\n422#1:1507,3\n422#1:1530,3\n422#1:1518\n422#1:1519,2\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNode$collapsedSemantics$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ k1.h<SemanticsConfiguration> $config;
    final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$collapsedSemantics$1(LayoutNode layoutNode, k1.h<SemanticsConfiguration> hVar) {
        super(0);
        this.this$0 = layoutNode;
        this.$config = hVar;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.semantics.SemanticsConfiguration, T] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NodeChain nodes$ui_release = this.this$0.getNodes$ui_release();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(8);
        k1.h<SemanticsConfiguration> hVar = this.$config;
        if ((nodes$ui_release.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
                            if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                ?? semanticsConfiguration = new SemanticsConfiguration();
                                hVar.element = semanticsConfiguration;
                                semanticsConfiguration.setClearingSemantics(true);
                            }
                            if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                hVar.element.setMergingSemanticsOfDescendants(true);
                            }
                            semanticsModifierNode.applySemantics(hVar.element);
                        } else if (((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i5 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i5 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }
}
