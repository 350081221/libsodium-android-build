package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@Stable
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0083\bJ\u0006\u0010\b\u001a\u00020\u0007J\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "", "onFound", "findFocusTarget", "Lkotlin/r2;", "requestFocus", "focus$ui_release", "()Z", "focus", "captureFocus", "freeFocus", "saveFocusedChild", "restoreFocusedChild", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,252:1\n237#1:256\n238#1,4:258\n242#1:269\n243#1,5:299\n248#1:345\n249#1:350\n1208#2:253\n1187#2,2:254\n1208#2:274\n1187#2,2:275\n1208#2:408\n1187#2,2:409\n1#3:257\n1#3:351\n1#3:406\n460#4,7:262\n48#4:284\n467#4,4:346\n460#4,11:352\n460#4,11:363\n460#4,11:374\n460#4,11:385\n460#4,7:396\n48#4:418\n467#4,4:474\n90#5:270\n90#5:403\n276#6:271\n133#6,2:272\n135#6,7:277\n142#6,9:285\n385#6,5:294\n390#6:304\n395#6,2:306\n397#6,17:311\n414#6,8:331\n151#6,6:339\n276#6:404\n133#6:405\n134#6:407\n135#6,7:411\n142#6,9:419\n385#6,6:428\n395#6,2:435\n397#6,17:440\n414#6,8:460\n151#6,6:468\n261#7:305\n261#7:434\n234#8,3:308\n237#8,3:328\n234#8,3:437\n237#8,3:457\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n71#1:256\n71#1:258,4\n71#1:269\n71#1:299,5\n71#1:345\n71#1:350\n55#1:253\n55#1:254,2\n71#1:274\n71#1:275,2\n242#1:408\n242#1:409,2\n71#1:257\n242#1:406\n71#1:262,7\n71#1:284\n71#1:346,4\n100#1:352,11\n124#1:363,11\n145#1:374,11\n165#1:385,11\n241#1:396,7\n242#1:418\n241#1:474,4\n71#1:270\n242#1:403\n71#1:271\n71#1:272,2\n71#1:277,7\n71#1:285,9\n71#1:294,5\n71#1:304\n71#1:306,2\n71#1:311,17\n71#1:331,8\n71#1:339,6\n242#1:404\n242#1:405\n242#1:407\n242#1:411,7\n242#1:419,9\n242#1:428,6\n242#1:435,2\n242#1:440,17\n242#1:460,8\n242#1:468,6\n71#1:305\n242#1:434\n71#1:308,3\n71#1:328,3\n242#1:437,3\n242#1:457,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;

    @l
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final FocusRequester Default = new FocusRequester();

    @l
    private static final FocusRequester Cancel = new FocusRequester();

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", "Default", "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        @StabilityInferred(parameters = 1)
        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ExperimentalComposeUiApi
        /* loaded from: classes.dex */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;

            @l
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            @l
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @l
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }

        @l
        @ExperimentalComposeUiApi
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @l
        @ExperimentalComposeUiApi
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        @l
        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }
    }

    @ExperimentalComposeUiApi
    private final boolean findFocusTarget(v3.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Companion companion = Companion;
        if (this != companion.getDefault()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this != companion.getCancel()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (this.focusRequesterNodes.isNotEmpty()) {
                    MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
                    int size = mutableVector.getSize();
                    if (size <= 0) {
                        return false;
                    }
                    FocusRequesterModifierNode[] content = mutableVector.getContent();
                    int i5 = 0;
                    boolean z8 = false;
                    do {
                        FocusRequesterModifierNode focusRequesterModifierNode = content[i5];
                        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
                        if (focusRequesterModifierNode.getNode().isAttached()) {
                            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
                            if (child$ui_release == null) {
                                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
                            } else {
                                mutableVector2.add(child$ui_release);
                            }
                            while (true) {
                                if (!mutableVector2.isNotEmpty()) {
                                    break;
                                }
                                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, node);
                                } else {
                                    while (true) {
                                        if (node == null) {
                                            break;
                                        }
                                        if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            MutableVector mutableVector3 = null;
                                            while (node != null) {
                                                if (node instanceof FocusTargetNode) {
                                                    if (lVar.invoke((FocusTargetNode) node).booleanValue()) {
                                                        z8 = true;
                                                        break;
                                                    }
                                                } else {
                                                    if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6 && (node instanceof DelegatingNode)) {
                                                        int i6 = 0;
                                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                            if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (z7) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    node = delegate$ui_release;
                                                                } else {
                                                                    if (mutableVector3 == null) {
                                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                                    }
                                                                    if (node != null) {
                                                                        mutableVector3.add(node);
                                                                        node = null;
                                                                    }
                                                                    mutableVector3.add(delegate$ui_release);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                }
                                                node = DelegatableNodeKt.access$pop(mutableVector3);
                                            }
                                        } else {
                                            node = node.getChild$ui_release();
                                        }
                                    }
                                }
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                    } while (i5 < size);
                    return z8;
                }
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i5 = 0;
                while (!FocusRequesterModifierNodeKt.captureFocus(content[i5])) {
                    i5++;
                    if (i5 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0064, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean focus$ui_release() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.focus$ui_release():boolean");
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i5 = 0;
                while (!FocusRequesterModifierNodeKt.freeFocus(content[i5])) {
                    i5++;
                    if (i5 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    @l
    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        focus$ui_release();
    }

    @ExperimentalComposeUiApi
    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i5 = 0;
            boolean z4 = false;
            do {
                if (!FocusRequesterModifierNodeKt.restoreFocusedChild(content[i5]) && !z4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                i5++;
            } while (i5 < size);
            return z4;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    @ExperimentalComposeUiApi
    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.isNotEmpty()) {
            MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierNode[] content = mutableVector.getContent();
                int i5 = 0;
                while (!FocusRequesterModifierNodeKt.saveFocusedChild(content[i5])) {
                    i5++;
                    if (i5 >= size) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
