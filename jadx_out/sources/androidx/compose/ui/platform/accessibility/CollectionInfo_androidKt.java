package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\fH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0014\u001a\u00020\u0007*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Lkotlin/r2;", "setCollectionInfo", "setCollectionItemInfo", "", "hasCollectionInfo", "", "items", "calculateIfHorizontallyStacked", "Landroidx/compose/ui/semantics/CollectionInfo;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "toAccessibilityCollectionItemInfo", "isLazyCollection", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n33#2,6:155\n33#2,6:161\n340#2,11:167\n372#2,7:178\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:155,6\n87#1:161,6\n122#1:167,11\n130#1:178,7\n*E\n"})
/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List E;
        Object y22;
        int G;
        long m3503unboximpl;
        Object y23;
        int G2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            E = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            G2 = w.G(list);
            int i5 = 0;
            while (i5 < G2) {
                i5++;
                SemanticsNode semanticsNode2 = list.get(i5);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                E.add(Offset.m3482boximpl(OffsetKt.Offset(Math.abs(Offset.m3493getXimpl(semanticsNode4.getBoundsInRoot().m3523getCenterF1C5BW0()) - Offset.m3493getXimpl(semanticsNode3.getBoundsInRoot().m3523getCenterF1C5BW0())), Math.abs(Offset.m3494getYimpl(semanticsNode4.getBoundsInRoot().m3523getCenterF1C5BW0()) - Offset.m3494getYimpl(semanticsNode3.getBoundsInRoot().m3523getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        } else {
            E = w.E();
        }
        if (E.size() == 1) {
            y23 = e0.y2(E);
            m3503unboximpl = ((Offset) y23).m3503unboximpl();
        } else if (!E.isEmpty()) {
            y22 = e0.y2(E);
            G = w.G(E);
            if (1 <= G) {
                int i6 = 1;
                while (true) {
                    y22 = Offset.m3482boximpl(Offset.m3498plusMKHz9U(((Offset) y22).m3503unboximpl(), ((Offset) E.get(i6)).m3503unboximpl()));
                    if (i6 == G) {
                        break;
                    }
                    i6++;
                }
            }
            m3503unboximpl = ((Offset) y22).m3503unboximpl();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (Offset.m3484component2impl(m3503unboximpl) < Offset.m3483component1impl(m3503unboximpl)) {
            return true;
        }
        return false;
    }

    public static final boolean hasCollectionInfo(@l SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    public static final void setCollectionInfo(@l SemanticsNode semanticsNode, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int size;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size2 = replacedChildren$ui_release.size();
            for (int i5 = 0; i5 < size2; i5++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i5);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i6 = 1;
        if (!arrayList.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            if (calculateIfHorizontallyStacked) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (calculateIfHorizontallyStacked) {
                i6 = arrayList.size();
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(size, i6, false, 0));
        }
    }

    public static final void setCollectionItemInfo(@l SemanticsNode semanticsNode, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i5;
        int i6;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
            if ((collectionInfo != null && isLazyCollection(collectionInfo)) || !semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i7++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                if (calculateIfHorizontallyStacked) {
                    i5 = 0;
                } else {
                    i5 = i7;
                }
                if (calculateIfHorizontallyStacked) {
                    i6 = i7;
                } else {
                    i6 = 0;
                }
                AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i5, 1, i6, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue());
                if (obtain != null) {
                    accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
                }
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.INSTANCE)).booleanValue());
    }
}
