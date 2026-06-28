package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@kotlin.i0(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u001c\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002\u001a\f\u0010 \u001a\u00020\u0003*\u00020\rH\u0002\u001a\f\u0010!\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020#0$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\u0004\u0018\u00010(*\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030*H\u0002\u001a\u0018\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-0,*\u00020.H\u0002\u001a\u000e\u0010/\u001a\u0004\u0018\u00010\f*\u00020\rH\u0002\u001a\f\u00100\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00101\u001a\u00020\u0003*\u00020(2\u0006\u00102\u001a\u00020(H\u0002\u001a\f\u00103\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00104\u001a\u00020\u0003*\u00020\r2\u0006\u00105\u001a\u000206H\u0002\u001a\u0016\u00107\u001a\u0004\u0018\u000108*\u0002092\u0006\u0010%\u001a\u00020&H\u0000\u001a\u0018\u0010:\u001a\u0004\u0018\u00010\f*\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0019\u0010\u0012\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0019\u0010\u0014\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"DefaultFakeNodeBounds", "Landroidx/compose/ui/geometry/Rect;", "<set-?>", "", "DisableContentCapture", "getDisableContentCapture$annotations", "()V", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "infoContentDescriptionOrNull", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getInfoContentDescriptionOrNull", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "isPassword", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isRtl", "isTextField", "isTraversalGroup", "isVisible", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "traversalIndex", "", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsNode;)F", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getTextForTranslation", "hasPaneTitle", "isAncestorOf", "node", "isImportantForAccessibility", "propertiesDeleted", "oldConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsIdToView", "Landroid/view/View;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "toLegacyClassName", "Landroidx/compose/ui/semantics/Role;", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3790:1\n3585#1:3791\n288#2,2:3792\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3599#1:3791\n3771#1:3792,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    @p4.l
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean DisableContentCapture;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!kotlin.jvm.internal.l0.g(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() == null && accessibilityAction2.getAction() != null) {
            return false;
        }
        if (accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        boolean z4;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText()) && !kotlin.jvm.internal.l0.g(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (findClosestParentNode != null) {
            SemanticsConfiguration collapsedSemantics$ui_release = findClosestParentNode.getCollapsedSemantics$ui_release();
            if (collapsedSemantics$ui_release != null) {
                z4 = kotlin.jvm.internal.l0.g(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE);
            } else {
                z4 = false;
            }
            if (!z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i5) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (list.get(i6).getSemanticsNodeId() == i5) {
                return list.get(i6);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, v3.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (lVar.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        int L0;
        int L02;
        int L03;
        int L04;
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            L0 = kotlin.math.d.L0(boundsInRoot.getLeft());
            L02 = kotlin.math.d.L0(boundsInRoot.getTop());
            L03 = kotlin.math.d.L0(boundsInRoot.getRight());
            L04 = kotlin.math.d.L0(boundsInRoot.getBottom());
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(new Region(L0, L02, L03, L04), unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode, new Region());
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2, Region region2) {
        boolean z4;
        int L0;
        int L02;
        int L03;
        int L04;
        int id;
        Rect rect;
        int L05;
        int L06;
        int L07;
        int L08;
        LayoutInfo layoutInfo;
        boolean z5 = false;
        if (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (z4 && !semanticsNode2.isFake$ui_release()) {
                return;
            }
            Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
            L0 = kotlin.math.d.L0(touchBoundsInRoot.getLeft());
            L02 = kotlin.math.d.L0(touchBoundsInRoot.getTop());
            L03 = kotlin.math.d.L0(touchBoundsInRoot.getRight());
            L04 = kotlin.math.d.L0(touchBoundsInRoot.getBottom());
            region2.set(L0, L02, L03, L04);
            if (semanticsNode2.getId() == semanticsNode.getId()) {
                id = -1;
            } else {
                id = semanticsNode2.getId();
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size), region2);
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    region.op(L0, L02, L03, L04, Region.Op.DIFFERENCE);
                    return;
                }
                return;
            }
            if (semanticsNode2.isFake$ui_release()) {
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    z5 = true;
                }
                if (z5) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = DefaultFakeNodeBounds;
                }
                Integer valueOf = Integer.valueOf(id);
                L05 = kotlin.math.d.L0(rect.getLeft());
                L06 = kotlin.math.d.L0(rect.getTop());
                L07 = kotlin.math.d.L0(rect.getRight());
                L08 = kotlin.math.d.L0(rect.getBottom());
                map.put(valueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(L05, L06, L07, L08)));
                return;
            }
            if (id == -1) {
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return DisableContentCapture;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoContentDescriptionOrNull(SemanticsNode semanticsNode) {
        Object D2;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            D2 = kotlin.collections.e0.D2(list);
            return (String) D2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTextForTranslation(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            return ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    private static final float getTraversalIndex(SemanticsNode semanticsNode) {
        return ((Number) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAncestorOf(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        if (!kotlin.jvm.internal.l0.g(parent$ui_release, layoutNode) && !isAncestorOf(layoutNode, parent$ui_release)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() && !semanticsNode.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release()) {
            return false;
        }
        return true;
    }

    private static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    private static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    private static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    private static final boolean isTraversalGroup(SemanticsNode semanticsNode) {
        return ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @p4.m
    public static final View semanticsIdToView(@p4.l AndroidViewsHandler androidViewsHandler, int i5) {
        Object obj;
        boolean z4;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (AndroidViewHolder) entry.getValue();
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z4) {
        DisableContentCapture = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m5292toLegacyClassNameV4PA4sw(int i5) {
        Role.Companion companion = Role.Companion;
        if (Role.m5369equalsimpl0(i5, companion.m5373getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m5369equalsimpl0(i5, companion.m5374getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m5369equalsimpl0(i5, companion.m5377getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m5369equalsimpl0(i5, companion.m5376getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m5369equalsimpl0(i5, companion.m5375getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
