package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u000b"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "skipDeactivatedNodes", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,100:1\n33#2,6:101\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n90#1:101,6\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsOwnerKt {
    @l
    public static final List<SemanticsNode> getAllSemanticsNodes(@l SemanticsOwner semanticsOwner, boolean z4, boolean z5) {
        List<SemanticsNode> S5;
        S5 = e0.S5(getAllSemanticsNodesToMap(semanticsOwner, !z4, z5).values());
        return S5;
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z4, z5);
    }

    @l
    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(@l SemanticsOwner semanticsOwner, boolean z4, boolean z5) {
        SemanticsNode rootSemanticsNode;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z4) {
            rootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        } else {
            rootSemanticsNode = semanticsOwner.getRootSemanticsNode();
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z5, linkedHashMap, rootSemanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z4, z5);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(boolean z4, Map<Integer, SemanticsNode> map, SemanticsNode semanticsNode) {
        if (!z4 || !semanticsNode.getLayoutInfo().isDeactivated()) {
            map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
            List<SemanticsNode> children = semanticsNode.getChildren();
            int size = children.size();
            for (int i5 = 0; i5 < size; i5++) {
                getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z4, map, children.get(i5));
            }
        }
    }
}
