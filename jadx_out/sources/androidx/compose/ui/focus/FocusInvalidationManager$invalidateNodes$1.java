package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,140:1\n1855#2:141\n1856#2:252\n1855#2:253\n1856#2:364\n1855#2,2:365\n90#3:142\n90#3:254\n282#4:143\n385#4,6:144\n395#4,2:151\n397#4,8:156\n405#4,9:167\n414#4,8:179\n283#4:187\n133#4:188\n134#4,8:190\n142#4,9:199\n385#4,37:208\n151#4,6:245\n284#4:251\n282#4:255\n385#4,6:256\n395#4,2:263\n397#4,8:268\n405#4,9:279\n414#4,8:291\n283#4:299\n133#4:300\n134#4,8:302\n142#4,9:311\n385#4,37:320\n151#4,6:357\n284#4:363\n261#5:150\n261#5:262\n234#6,3:153\n237#6,3:176\n234#6,3:265\n237#6,3:288\n1208#7:164\n1187#7,2:165\n1208#7:276\n1187#7,2:277\n1#8:189\n1#8:301\n1#8:367\n48#9:198\n48#9:310\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n59#1:141\n59#1:252\n72#1:253\n72#1:364\n120#1:365,2\n64#1:142\n86#1:254\n64#1:143\n64#1:144,6\n64#1:151,2\n64#1:156,8\n64#1:167,9\n64#1:179,8\n64#1:187\n64#1:188\n64#1:190,8\n64#1:199,9\n64#1:208,37\n64#1:245,6\n64#1:251\n86#1:255\n86#1:256,6\n86#1:263,2\n86#1:268,8\n86#1:279,9\n86#1:291,8\n86#1:299\n86#1:300\n86#1:302,8\n86#1:311,9\n86#1:320,37\n86#1:357,6\n86#1:363\n64#1:150\n86#1:262\n64#1:153,3\n64#1:176,3\n86#1:265,3\n86#1:288,3\n64#1:164\n64#1:165,2\n86#1:276\n86#1:277,2\n64#1:189\n86#1:301\n64#1:198\n86#1:310\n*E\n"})
/* loaded from: classes.dex */
public final class FocusInvalidationManager$invalidateNodes$1 extends n0 implements a<r2> {
    final /* synthetic */ FocusInvalidationManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInvalidationManager$invalidateNodes$1(FocusInvalidationManager focusInvalidationManager) {
        super(0);
        this.this$0 = focusInvalidationManager;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Set set;
        Set set2;
        Set<FocusEventModifierNode> set3;
        Set set4;
        Set<FocusTargetNode> set5;
        Set set6;
        Set set7;
        Set set8;
        Set set9;
        int i5;
        int i6;
        FocusState focusState;
        int i7;
        int i8;
        Set set10;
        Set set11;
        Set set12;
        Set set13;
        set = this.this$0.focusPropertiesNodes;
        FocusInvalidationManager focusInvalidationManager = this.this$0;
        Iterator it = set.iterator();
        while (true) {
            int i9 = 1024;
            int i10 = 16;
            int i11 = 0;
            int i12 = 1;
            if (it.hasNext()) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
                if (focusPropertiesModifierNode.getNode().isAttached()) {
                    int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
                    Modifier.Node node = focusPropertiesModifierNode.getNode();
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof FocusTargetNode) {
                            set13 = focusInvalidationManager.focusTargetNodes;
                            set13.add((FocusTargetNode) node);
                        } else if (((node.getKindSet$ui_release() & m5204constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                            int i13 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                    if (focusPropertiesModifierNode.getNode().isAttached()) {
                        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                        Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
                        if (child$ui_release == null) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode());
                        } else {
                            mutableVector2.add(child$ui_release);
                        }
                        while (mutableVector2.isNotEmpty()) {
                            Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                            if ((node2.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                            } else {
                                while (true) {
                                    if (node2 == null) {
                                        break;
                                    }
                                    if ((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        MutableVector mutableVector3 = null;
                                        while (node2 != null) {
                                            if (node2 instanceof FocusTargetNode) {
                                                set12 = focusInvalidationManager.focusTargetNodes;
                                                set12.add((FocusTargetNode) node2);
                                            } else if (((node2.getKindSet$ui_release() & m5204constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                                                int i14 = 0;
                                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                                    if ((delegate$ui_release2.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            node2 = delegate$ui_release2;
                                                        } else {
                                                            if (mutableVector3 == null) {
                                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (node2 != null) {
                                                                mutableVector3.add(node2);
                                                                node2 = null;
                                                            }
                                                            mutableVector3.add(delegate$ui_release2);
                                                        }
                                                    }
                                                }
                                                if (i14 == 1) {
                                                }
                                            }
                                            node2 = DelegatableNodeKt.pop(mutableVector3);
                                        }
                                    } else {
                                        node2 = node2.getChild$ui_release();
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                }
            } else {
                set2 = this.this$0.focusPropertiesNodes;
                set2.clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                set3 = this.this$0.focusEventNodes;
                FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                for (FocusEventModifierNode focusEventModifierNode : set3) {
                    if (!focusEventModifierNode.getNode().isAttached()) {
                        focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                        i5 = i11;
                        i6 = i12;
                    } else {
                        int m5204constructorimpl2 = NodeKind.m5204constructorimpl(i9);
                        Modifier.Node node3 = focusEventModifierNode.getNode();
                        int i15 = i11;
                        int i16 = i12;
                        FocusTargetNode focusTargetNode = null;
                        MutableVector mutableVector4 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode != null) {
                                    i15 = i12;
                                }
                                set11 = focusInvalidationManager2.focusTargetNodes;
                                if (set11.contains(focusTargetNode2)) {
                                    linkedHashSet.add(focusTargetNode2);
                                    i16 = i11;
                                }
                                focusTargetNode = focusTargetNode2;
                            } else if (((node3.getKindSet$ui_release() & m5204constructorimpl2) != 0 ? i12 : i11) != 0 && (node3 instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release();
                                int i17 = i11;
                                while (delegate$ui_release3 != null) {
                                    if (((delegate$ui_release3.getKindSet$ui_release() & m5204constructorimpl2) != 0 ? i12 : i11) != 0) {
                                        i17++;
                                        if (i17 == i12) {
                                            node3 = delegate$ui_release3;
                                        } else {
                                            if (mutableVector4 == null) {
                                                mutableVector4 = new MutableVector(new Modifier.Node[i10], i11);
                                            }
                                            if (node3 != null) {
                                                mutableVector4.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector4.add(delegate$ui_release3);
                                        }
                                    }
                                    delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                                    i12 = 1;
                                }
                                int i18 = i12;
                                if (i17 == i18) {
                                    i12 = i18;
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector4);
                            i12 = 1;
                        }
                        if (focusEventModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i10], i11);
                            Modifier.Node child$ui_release2 = focusEventModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release2 == null) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode());
                            } else {
                                mutableVector5.add(child$ui_release2);
                            }
                            while (mutableVector5.isNotEmpty()) {
                                Modifier.Node node4 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                                if ((node4.getAggregateChildKindSet$ui_release() & m5204constructorimpl2) == 0) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, node4);
                                } else {
                                    while (node4 != null) {
                                        if ((node4.getKindSet$ui_release() & m5204constructorimpl2) != 0) {
                                            MutableVector mutableVector6 = null;
                                            while (node4 != null) {
                                                if (node4 instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node4;
                                                    if (focusTargetNode != null) {
                                                        i15 = 1;
                                                    }
                                                    set10 = focusInvalidationManager2.focusTargetNodes;
                                                    if (set10.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        i16 = i11;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if (((node4.getKindSet$ui_release() & m5204constructorimpl2) != 0 ? 1 : i11) != 0 && (node4 instanceof DelegatingNode)) {
                                                    Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release();
                                                    int i19 = i11;
                                                    while (delegate$ui_release4 != null) {
                                                        if (((delegate$ui_release4.getKindSet$ui_release() & m5204constructorimpl2) != 0 ? 1 : i11) != 0) {
                                                            i19++;
                                                            if (i19 == 1) {
                                                                node4 = delegate$ui_release4;
                                                                i8 = 0;
                                                            } else {
                                                                if (mutableVector6 == null) {
                                                                    Modifier.Node[] nodeArr = new Modifier.Node[i10];
                                                                    i8 = 0;
                                                                    mutableVector6 = new MutableVector(nodeArr, 0);
                                                                } else {
                                                                    i8 = 0;
                                                                }
                                                                if (node4 != null) {
                                                                    mutableVector6.add(node4);
                                                                    node4 = null;
                                                                }
                                                                mutableVector6.add(delegate$ui_release4);
                                                            }
                                                        } else {
                                                            i8 = i11;
                                                        }
                                                        delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                                        i11 = i8;
                                                        i10 = 16;
                                                    }
                                                    i7 = i11;
                                                    if (i19 == 1) {
                                                        i11 = i7;
                                                        i10 = 16;
                                                    }
                                                    node4 = DelegatableNodeKt.pop(mutableVector6);
                                                    i11 = i7;
                                                    i10 = 16;
                                                }
                                                i7 = i11;
                                                node4 = DelegatableNodeKt.pop(mutableVector6);
                                                i11 = i7;
                                                i10 = 16;
                                            }
                                        } else {
                                            node4 = node4.getChild$ui_release();
                                            i11 = i11;
                                            i10 = 16;
                                        }
                                    }
                                }
                                i11 = i11;
                                i10 = 16;
                            }
                            i5 = i11;
                            i6 = 1;
                            if (i16 != 0) {
                                if (i15 != 0) {
                                    focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                    focusState = FocusStateImpl.Inactive;
                                }
                                focusEventModifierNode.onFocusEvent(focusState);
                            }
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    }
                    i12 = i6;
                    i9 = 1024;
                    i11 = i5;
                    i10 = 16;
                }
                set4 = this.this$0.focusEventNodes;
                set4.clear();
                set5 = this.this$0.focusTargetNodes;
                for (FocusTargetNode focusTargetNode4 : set5) {
                    if (focusTargetNode4.isAttached()) {
                        FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                        focusTargetNode4.invalidateFocus$ui_release();
                        if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                        }
                    }
                }
                set6 = this.this$0.focusTargetNodes;
                set6.clear();
                linkedHashSet.clear();
                set7 = this.this$0.focusPropertiesNodes;
                if (set7.isEmpty()) {
                    set8 = this.this$0.focusEventNodes;
                    if (set8.isEmpty()) {
                        set9 = this.this$0.focusTargetNodes;
                        if (!set9.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                }
                throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
            }
        }
    }
}
