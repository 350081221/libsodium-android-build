package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\bl\u0010mJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u0004*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J5\u0010\u001a\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\b\b\u0002\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010$\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010'\u001a\u00020\u0000H\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010-\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u00109\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u00100\"\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010?\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00100R\u0014\u0010E\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u00100R\u0011\u0010I\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010U\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0017\u0010Z\u001a\u00020X8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010TR\u0011\u0010\\\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\b[\u0010PR\u0017\u0010^\u001a\u00020X8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010TR\u0014\u0010`\u001a\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010PR\u0014\u0010b\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u00100R\u0011\u0010d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bc\u00108R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010eR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00000\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010eR\u0011\u0010i\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bi\u00100R\u0013\u0010k\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bj\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedConfig", "Lkotlin/r2;", "mergeConfig", "Landroidx/compose/ui/node/LayoutNode;", "", "list", "fillOneLayerOfSemanticsWrappers", "", "includeReplacedSemantics", "includeFakeNodes", "", "getChildren", "findOneLayerOfMergingSemanticsNodes", "unmergedChildren", "emitFakeNodes", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/u;", "properties", "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lv3/l;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "unmergedChildren$ui_release", "(Z)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "copyWithMergingEnabled$ui_release", "()Landroidx/compose/ui/semantics/SemanticsNode;", "copyWithMergingEnabled", "Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "mergingEnabled", "Z", "getMergingEnabled", "()Z", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "isFake", "isFake$ui_release", "setFake$ui_release", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "id", "I", "getId", "()I", "isMergingSemanticsOfDescendants", "isUnmergedLeafNode$ui_release", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "getBoundsInParent$ui_release", "boundsInParent", "isTransparent$ui_release", "isTransparent", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "isRoot", "getParent", "parent", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,475:1\n1#2:476\n76#3:477\n76#3:491\n76#3:502\n33#4,6:478\n33#4,6:496\n460#5,7:484\n467#5,4:492\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n185#1:477\n267#1:491\n381#1:502\n227#1:478,6\n360#1:496,6\n262#1:484,7\n262#1:492,4\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;

    @m
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;

    @l
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;

    @l
    private final Modifier.Node outerSemanticsNode;

    @l
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@l Modifier.Node node, boolean z4, @l LayoutNode layoutNode, @l SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z4;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        Role role;
        String str;
        Object D2;
        role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m5380fakeSemanticsNodeypyhhiA(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list2 != null) {
                D2 = e0.D2(list2);
                str = (String) D2;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m5380fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m5380fakeSemanticsNodeypyhhiA(Role role, v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        int contentDescriptionFakeNodeId;
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        lVar.invoke(semanticsConfiguration);
        SemanticsNode$fakeSemanticsNode$fakeNode$1 semanticsNode$fakeSemanticsNode$fakeNode$1 = new SemanticsNode$fakeSemanticsNode$fakeNode$1(lVar);
        if (role != null) {
            contentDescriptionFakeNodeId = SemanticsNodeKt.roleFakeNodeId(this);
        } else {
            contentDescriptionFakeNodeId = SemanticsNodeKt.contentDescriptionFakeNodeId(this);
        }
        SemanticsNode semanticsNode = new SemanticsNode(semanticsNode$fakeSemanticsNode$fakeNode$1, false, new LayoutNode(true, contentDescriptionFakeNodeId), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode2 = content[i5];
                if (layoutNode2.isAttached()) {
                    if (layoutNode2.getNodes$ui_release().m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(8))) {
                        list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        fillOneLayerOfSemanticsWrappers(layoutNode2, list);
                    }
                }
                i5++;
            } while (i5 < size);
        }
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i5 = 0; i5 < size; i5++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i5);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (!this.unmergedConfig.isClearingSemantics()) {
            List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
            int size = unmergedChildren$ui_release$default.size();
            for (int i5 = 0; i5 < size; i5++) {
                SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i5);
                if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                    semanticsNode.mergeConfig(semanticsConfiguration);
                }
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z4);
    }

    @l
    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    @m
    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m5101requireCoordinator64DMado(outerMergingSemantics, NodeKind.m5204constructorimpl(8));
    }

    public final int getAlignmentLinePosition(@l AlignmentLine alignmentLine) {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    @l
    public final Rect getBoundsInParent$ui_release() {
        LayoutCoordinates coordinates;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (coordinates = findCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return LayoutCoordinates.localBoundingBoxOf$default(DelegatableNodeKt.m5101requireCoordinator64DMado(parent.outerSemanticsNode, NodeKind.m5204constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return Rect.Companion.getZero();
    }

    @l
    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    @l
    public final Rect getBoundsInWindow() {
        Rect boundsInWindow;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInWindow = LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    @l
    public final List<SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    @l
    public final SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @l
    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @l
    public final Modifier.Node getOuterSemanticsNode$ui_release() {
        return this.outerSemanticsNode;
    }

    @m
    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNode, this.mergingEnabled);
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m5381getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m5382getPositionInWindowF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    @l
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    @m
    public final RootForTest getRoot() {
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5383getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return findCoordinatorToGetBounds$ui_release != null ? findCoordinatorToGetBounds$ui_release.mo5005getSizeYbymL2g() : IntSize.Companion.m6219getZeroYbymL2g();
    }

    @l
    public final Rect getTouchBoundsInRoot() {
        DelegatableNode delegatableNode;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            delegatableNode = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (delegatableNode == null) {
                delegatableNode = this.outerSemanticsNode;
            }
        } else {
            delegatableNode = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(delegatableNode.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    @l
    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.isFake && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$isUnmergedLeafNode$1.INSTANCE) == null;
    }

    public final void setFake$ui_release(boolean z4) {
        this.isFake = z4;
    }

    @l
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z4) {
        List<SemanticsNode> E;
        if (this.isFake) {
            E = w.E();
            return E;
        }
        ArrayList arrayList = new ArrayList();
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList);
        if (z4) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean z4, boolean z5) {
        List<SemanticsNode> E;
        if (!z4 && this.unmergedConfig.isClearingSemantics()) {
            E = w.E();
            return E;
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        }
        return unmergedChildren$ui_release(z5);
    }
}
