package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 A2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J=\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J:\u0010-\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,R \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R.\u00107\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lkotlin/r2;", "ensureLookaheadDelegateCreated", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "Landroidx/compose/ui/node/TailModifierNode;", "tail", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "getTail$annotations", "()V", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,246:1\n286#2,2:247\n197#3:249\n460#4,11:250\n460#4,11:261\n222#4,11:274\n179#5,2:272\n181#5,2:285\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n119#1:247,2\n121#1:249\n121#1:250,11\n172#1:261,11\n208#1:274,11\n205#1:272,2\n205#1:285,2\n*E\n"})
/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Paint innerBoundsPaint;

    @m
    private LookaheadDelegate lookaheadDelegate;

    @l
    private final TailModifierNode tail;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "calculateAlignmentLine", "Lkotlin/r2;", "placeChildren", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "<init>", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,246:1\n221#2,2:247\n223#2:261\n197#3:249\n460#4,11:250\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:247,2\n74#1:261\n76#1:249\n76#1:250,11\n*E\n"})
    /* loaded from: classes.dex */
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@l AlignmentLine alignmentLine) {
            int i5;
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = Integer.MIN_VALUE;
            }
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(i5));
            return i5;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicWidth(i5);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @l
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4998measureBRTryo0(long j5) {
            LookaheadDelegate.m5152access$setMeasurementConstraintsBRTryo0(this, j5);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i5].getLookaheadPassDelegate$ui_release();
                    l0.m(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i5++;
                } while (i5 < size);
            }
            LookaheadDelegate.access$set_measureResult(this, getLayoutNode().getMeasurePolicy().mo30measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j5));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicWidth(i5);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            l0.m(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo3613setColor8_81llA(Color.Companion.m3768getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4001getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(@l LayoutNode layoutNode) {
        super(layoutNode);
        LookaheadDelegateImpl lookaheadDelegateImpl;
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            lookaheadDelegateImpl = new LookaheadDelegateImpl();
        } else {
            lookaheadDelegateImpl = null;
        }
        this.lookaheadDelegate = lookaheadDelegateImpl;
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@l AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @m
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[EDGE_INSN: B:22:0x0094->B:28:0x0094 BREAK  A[LOOP:0: B:10:0x0058->B:21:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5122hitTestChildYqVAtuI(@p4.l androidx.compose.ui.node.NodeCoordinator.HitTestSource r19, long r20, @p4.l androidx.compose.ui.node.HitTestResult r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r20
            androidx.compose.ui.node.LayoutNode r1 = r18.getLayoutNode()
            r10 = r19
            boolean r1 = r10.shouldHitTestChildren(r1)
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L3a
            boolean r1 = r0.m5198withinLayerBoundsk4lQ0M(r8)
            if (r1 == 0) goto L1c
            r13 = r24
            r1 = r11
            goto L3d
        L1c:
            if (r23 == 0) goto L3a
            long r1 = r18.m5189getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m5186distanceInMinimumTouchTargettz77jQw(r8, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L34
            r1 = r11
            goto L35
        L34:
            r1 = r12
        L35:
            if (r1 == 0) goto L3a
            r1 = r11
            r13 = r12
            goto L3d
        L3a:
            r13 = r24
            r1 = r12
        L3d:
            if (r1 == 0) goto L99
            int r14 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r22)
            androidx.compose.ui.node.LayoutNode r1 = r18.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L94
            int r2 = r2 - r11
            java.lang.Object[] r15 = r1.getContent()
            r16 = r2
        L58:
            r1 = r15[r16]
            r17 = r1
            androidx.compose.ui.node.LayoutNode r17 = (androidx.compose.ui.node.LayoutNode) r17
            boolean r1 = r17.isPlaced()
            if (r1 == 0) goto L8d
            r1 = r19
            r2 = r17
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r13
            r1.mo5199childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r22.hasHit()
            if (r1 != 0) goto L7a
        L78:
            r1 = r11
            goto L89
        L7a:
            androidx.compose.ui.node.NodeCoordinator r1 = r17.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L88
            r22.acceptHits()
            goto L78
        L88:
            r1 = r12
        L89:
            if (r1 != 0) goto L8d
            r1 = r11
            goto L8e
        L8d:
            r1 = r12
        L8e:
            if (r1 != 0) goto L94
            int r16 = r16 + (-1)
            if (r16 >= 0) goto L58
        L94:
            r1 = r22
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r1, r14)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.mo5122hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i5) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i5) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @l
    /* renamed from: measure-BRTryo0 */
    public Placeable mo4998measureBRTryo0(long j5) {
        m5048setMeasurementConstraintsBRTryo0(j5);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                content[i5].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i5++;
            } while (i5 < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo30measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j5));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i5) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i5) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@l Canvas canvas) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode = content[i5];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i5++;
            } while (i5 < size);
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        super.mo4999placeAtf8xVGno(j5, f5, lVar);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(@m LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @l
    public TailModifierNode getTail() {
        return this.tail;
    }
}
