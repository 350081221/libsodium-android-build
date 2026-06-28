package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001\u000f\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a$\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "prev", "next", "", "actionForModifiers", "Landroidx/compose/ui/Modifier$Node;", "T", "Landroidx/compose/ui/node/ModifierNodeElement;", "node", "Lkotlin/r2;", "updateUnsafe", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/collection/MutableVector;", "result", "fillVector", "androidx/compose/ui/node/NodeChainKt$SentinelHead$1", "SentinelHead", "Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;", "ActionReplace", "I", "ActionUpdate", "ActionReuse", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,862:1\n1188#2:863\n1#3:864\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n831#1:863\n*E\n"})
/* loaded from: classes.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    @l
    private static final NodeChainKt$SentinelHead$1 SentinelHead;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r02 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            @l
            public String toString() {
                return "<Head>";
            }
        };
        r02.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r02;
    }

    public static final /* synthetic */ MutableVector access$fillVector(Modifier modifier, MutableVector mutableVector) {
        return fillVector(modifier, mutableVector);
    }

    public static final /* synthetic */ NodeChainKt$SentinelHead$1 access$getSentinelHead$p() {
        return SentinelHead;
    }

    public static final /* synthetic */ void access$updateUnsafe(ModifierNodeElement modifierNodeElement, Modifier.Node node) {
        updateUnsafe(modifierNodeElement, node);
    }

    public static final int actionForModifiers(@l Modifier.Element element, @l Modifier.Element element2) {
        if (l0.g(element, element2)) {
            return 2;
        }
        if (!Actual_jvmKt.areObjectsOfSameType(element, element2) && (!(element instanceof ForceUpdateElement) || !Actual_jvmKt.areObjectsOfSameType(((ForceUpdateElement) element).getOriginal(), element2))) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector) {
        int u4;
        u4 = u.u(mutableVector.getSize(), 16);
        MutableVector mutableVector2 = new MutableVector(new Modifier[u4], 0);
        mutableVector2.add(modifier);
        NodeChainKt$fillVector$1 nodeChainKt$fillVector$1 = null;
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (nodeChainKt$fillVector$1 == null) {
                    nodeChainKt$fillVector$1 = new NodeChainKt$fillVector$1(mutableVector);
                }
                modifier2.all(nodeChainKt$fillVector$1);
                nodeChainKt$fillVector$1 = nodeChainKt$fillVector$1;
            }
        }
        return mutableVector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        l0.n(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }
}
