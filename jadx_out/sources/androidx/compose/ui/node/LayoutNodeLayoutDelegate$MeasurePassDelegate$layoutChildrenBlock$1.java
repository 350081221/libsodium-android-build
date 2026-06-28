package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
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
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<AlignmentLinesOwner, r2> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
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
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1(LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = measurePassDelegate;
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
        this.this$0.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
        this.this$0.checkChildrenPlaceOrderForUpdates();
        this.this$0.forEachChildAlignmentLinesOwner(AnonymousClass2.INSTANCE);
    }
}
