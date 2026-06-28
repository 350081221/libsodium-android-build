package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import java.util.Comparator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/r2;", "dispatchHierarchy", "", "isNotEmpty", "node", "onNodePositioned", "rootNode", "onRootNodePositioned", "dispatch", "Landroidx/compose/runtime/collection/MutableVector;", "layoutNodes", "Landroidx/compose/runtime/collection/MutableVector;", "", "cachedNodes", "[Landroidx/compose/ui/node/LayoutNode;", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,94:1\n1208#2:95\n1187#2,2:96\n728#3,2:98\n728#3,2:100\n523#3:102\n460#3,11:104\n197#4:103\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:95\n26#1:96,2\n32#1:98,2\n38#1:100,2\n57#1:102\n75#1:104,11\n75#1:103\n*E\n"})
/* loaded from: classes.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;

    @m
    private LayoutNode[] cachedNodes;

    @l
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "()V", "MinArraySize", "", "DepthComparator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion$DepthComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "()V", "compare", "", bi.ay, "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        private static final class DepthComparator implements Comparator<LayoutNode> {

            @l
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(@l LayoutNode layoutNode, @l LayoutNode layoutNode2) {
                int t5 = l0.t(layoutNode2.getDepth$ui_release(), layoutNode.getDepth$ui_release());
                return t5 != 0 ? t5 : l0.t(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        int i5 = 0;
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                dispatchHierarchy(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i5 = 0; i5 < size; i5++) {
            layoutNodeArr[i5] = this.layoutNodes.getContent()[i5];
        }
        this.layoutNodes.clear();
        while (true) {
            size--;
            if (-1 < size) {
                LayoutNode layoutNode = layoutNodeArr[size];
                l0.m(layoutNode);
                if (layoutNode.getNeedsOnPositionedDispatch$ui_release()) {
                    dispatchHierarchy(layoutNode);
                }
            } else {
                this.cachedNodes = layoutNodeArr;
                return;
            }
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.isNotEmpty();
    }

    public final void onNodePositioned(@l LayoutNode layoutNode) {
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@l LayoutNode layoutNode) {
        this.layoutNodes.clear();
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }
}
