package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import t0.b;

@i0(d1 = {"\u00002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\u0007*\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\u001a \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0010*\u00020\u0019H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0007*\u00020\u0019H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\"\u001a\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \"\u001a\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010 \"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0082T¢\u0006\f\n\u0004\b#\u0010\u001e\u0012\u0004\b$\u0010 \"\u001c\u0010'\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", b.f22420d, "", "contains-64DMado", "(II)Z", "contains", "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/r2;", "autoInvalidateRemovedNode", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeIncludingDelegates", "selfKindSet", "autoInvalidateNodeSelf", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationOfAssociatedFocusTargets", "specifiesCanFocusProperty", "calculateNodeKindSetFromIncludingDelegates", "Updated", "I", "getUpdated$annotations", "()V", "Inserted", "getInserted$annotations", "Removed", "getRemoved$annotations", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,342:1\n52#1:346\n52#1:348\n52#1:350\n52#1:352\n52#1:354\n52#1:356\n52#1:358\n52#1:360\n52#1:362\n52#1:364\n52#1:367\n52#1:369\n52#1:371\n52#1:373\n52#1:375\n52#1:377\n52#1:379\n52#1:381\n52#1:383\n52#1:385\n52#1:387\n52#1:389\n52#1:391\n52#1:393\n52#1:395\n52#1:397\n52#1:399\n55#1:408\n55#1:411\n55#1:413\n55#1:415\n55#1:417\n55#1:419\n55#1:421\n55#1:423\n84#2:343\n70#2:344\n72#2:345\n74#2:347\n76#2:349\n78#2:351\n80#2:353\n94#2:355\n92#2:357\n86#2:359\n82#2:361\n84#2:363\n70#2:365\n72#2:366\n74#2:368\n76#2:370\n78#2:372\n80#2:374\n82#2:376\n84#2:378\n86#2:380\n88#2:382\n90#2:384\n92#2:386\n94#2:388\n96#2:390\n98#2:392\n101#2:394\n104#2:396\n106#2:398\n72#2:407\n72#2:409\n86#2:410\n74#2:412\n76#2:414\n82#2:416\n90#2:418\n92#2:420\n94#2:422\n90#2:424\n1#3:400\n1#3:427\n234#4,6:401\n234#4,3:458\n237#4,3:478\n234#4,6:495\n276#5:425\n133#5:426\n134#5:428\n135#5,7:432\n142#5,9:440\n385#5,6:449\n395#5,2:456\n397#5,17:461\n414#5,8:481\n151#5,6:489\n1208#6:429\n1187#6,2:430\n48#7:439\n261#8:455\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n113#1:346\n116#1:348\n119#1:350\n122#1:352\n128#1:354\n132#1:356\n136#1:358\n139#1:360\n142#1:362\n148#1:364\n161#1:367\n164#1:369\n167#1:371\n170#1:373\n173#1:375\n176#1:377\n179#1:379\n182#1:381\n185#1:383\n188#1:385\n191#1:387\n194#1:389\n197#1:391\n200#1:393\n203#1:395\n206#1:397\n209#1:399\n257#1:408\n264#1:411\n267#1:413\n270#1:415\n273#1:417\n276#1:419\n285#1:421\n294#1:423\n62#1:343\n111#1:344\n113#1:345\n116#1:347\n119#1:349\n122#1:351\n128#1:353\n132#1:355\n136#1:357\n139#1:359\n142#1:361\n148#1:363\n159#1:365\n161#1:366\n164#1:368\n167#1:370\n170#1:372\n173#1:374\n176#1:376\n179#1:378\n182#1:380\n185#1:382\n188#1:384\n191#1:386\n194#1:388\n197#1:390\n200#1:392\n203#1:394\n206#1:396\n209#1:398\n257#1:407\n260#1:409\n264#1:410\n267#1:412\n270#1:414\n273#1:416\n276#1:418\n285#1:420\n294#1:422\n300#1:424\n300#1:427\n244#1:401,6\n300#1:458,3\n300#1:478,3\n334#1:495,6\n300#1:425\n300#1:426\n300#1:428\n300#1:432,7\n300#1:440,9\n300#1:449,6\n300#1:456,2\n300#1:461,17\n300#1:481,8\n300#1:489,6\n300#1:429\n300#1:430,2\n300#1:439\n300#1:455\n*E\n"})
/* loaded from: classes.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(@l Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 1);
            return;
        }
        throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
    }

    public static final void autoInvalidateNodeIncludingDelegates(@l Modifier.Node node, int i5, int i6) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui_release() & i5, i6);
            int i7 = (~delegatingNode.getSelfKindSet$ui_release()) & i5;
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                autoInvalidateNodeIncludingDelegates(delegate$ui_release, i7, i6);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i5 & node.getKindSet$ui_release(), i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (i6 == 0 && !node.getShouldAutoInvalidate()) {
            return;
        }
        boolean z11 = true;
        if ((NodeKind.m5204constructorimpl(2) & i5) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
            if (i6 == 2) {
                DelegatableNodeKt.m5101requireCoordinator64DMado(node, NodeKind.m5204constructorimpl(2)).onRelease();
            }
        }
        if ((NodeKind.m5204constructorimpl(256) & i5) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if ((NodeKind.m5204constructorimpl(4) & i5) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if ((NodeKind.m5204constructorimpl(8) & i5) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if ((NodeKind.m5204constructorimpl(64) & i5) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if ((NodeKind.m5204constructorimpl(1024) & i5) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (node instanceof FocusTargetNode)) {
            if (i6 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetNode) node);
            }
        }
        if ((NodeKind.m5204constructorimpl(2048) & i5) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                if (i6 == 2) {
                    scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                } else {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
        }
        if ((i5 & NodeKind.m5204constructorimpl(4096)) == 0) {
            z11 = false;
        }
        if (z11 && (node instanceof FocusEventModifierNode)) {
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(@l Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 2);
            return;
        }
        throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
    }

    public static final void autoInvalidateUpdatedNode(@l Modifier.Node node) {
        if (node.isAttached()) {
            autoInvalidateNodeIncludingDelegates(node, -1, 0);
            return;
        }
        throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
    }

    public static final int calculateNodeKindSetFrom(@l Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(131072);
        }
        return node instanceof TraversableNode ? m5204constructorimpl | NodeKind.m5204constructorimpl(262144) : m5204constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@l Modifier.Node node) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
            for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
            }
            return selfKindSet$ui_release;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m5212contains64DMado(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m5213getIncludeSelfInTraversalH91voCI(int i5) {
        return (i5 & NodeKind.m5204constructorimpl(128)) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m5214or64DMado(int i5, int i6) {
        return i5 | i6;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        boolean z4;
        boolean z5;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if (focusPropertiesModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
                                } else {
                                    if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (node instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                i5++;
                                                if (i5 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector2.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector2);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(@l Modifier.Element element) {
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            m5204constructorimpl |= NodeKind.m5204constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) ? m5204constructorimpl | NodeKind.m5204constructorimpl(128) : m5204constructorimpl;
    }
}
