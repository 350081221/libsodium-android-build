package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1781:1\n33#2,6:1782\n33#2,6:1788\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n1107#1:1782,6\n1114#1:1788,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ LookaheadDelegate $lookaheadDelegate;
    final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<AlignmentLinesOwner, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
            invoke2(alignmentLinesOwner);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends n0 implements l<AlignmentLinesOwner, r2> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
            invoke2(alignmentLinesOwner);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AlignmentLinesOwner alignmentLinesOwner) {
            alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LookaheadDelegate lookaheadDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
        this.$lookaheadDelegate = lookaheadDelegate;
        this.this$1 = layoutNodeLayoutDelegate;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.clearPlaceOrder();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass1.INSTANCE);
        LookaheadDelegate lookaheadDelegate = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            boolean isPlacingForAlignment$ui_release = lookaheadDelegate.isPlacingForAlignment$ui_release();
            List<LayoutNode> children$ui_release = this.this$1.layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i5 = 0; i5 < size; i5++) {
                LookaheadDelegate lookaheadDelegate2 = children$ui_release.get(i5).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if (lookaheadDelegate2 != null) {
                    lookaheadDelegate2.setPlacingForAlignment$ui_release(isPlacingForAlignment$ui_release);
                }
            }
        }
        this.$lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
        LookaheadDelegate lookaheadDelegate3 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate3 != null) {
            lookaheadDelegate3.isPlacingForAlignment$ui_release();
            List<LayoutNode> children$ui_release2 = this.this$1.layoutNode.getChildren$ui_release();
            int size2 = children$ui_release2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                LookaheadDelegate lookaheadDelegate4 = children$ui_release2.get(i6).getOuterCoordinator$ui_release().getLookaheadDelegate();
                if (lookaheadDelegate4 != null) {
                    lookaheadDelegate4.setPlacingForAlignment$ui_release(false);
                }
            }
        }
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass4.INSTANCE);
    }
}
