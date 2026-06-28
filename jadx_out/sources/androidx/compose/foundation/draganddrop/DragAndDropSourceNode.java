package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b\u0012'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R3\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RC\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/r2;", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/u;", "drawDragDecoration", "Lv3/l;", "getDrawDragDecoration", "()Lv3/l;", "setDrawDragDecoration", "(Lv3/l;)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "", "dragAndDropSourceHandler", "Lv3/p;", "getDragAndDropSourceHandler", "()Lv3/p;", "setDragAndDropSourceHandler", "(Lv3/p;)V", "J", "<init>", "(Lv3/l;Lv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public static final int $stable = 8;

    @l
    private p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> dragAndDropSourceHandler;

    @l
    private v3.l<? super DrawScope, r2> drawDragDecoration;
    private long size = IntSize.Companion.m6219getZeroYbymL2g();

    @f(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1", f = "DragAndDropSource.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
        final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
        private /* synthetic */ Object L$0;
        int label;

        @i0(d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0016\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u0017*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J\u0017\u0010!\u001a\u00020\u0017*\u00020\u0011H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015J\r\u0010%\u001a\u00020$*\u00020#H\u0097\u0001J\u0017\u0010'\u001a\u00020\u001b*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010*\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u0011*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001a\u0010*\u001a\u00020\u0011*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016R\u0014\u00103\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00106\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00178\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b7\u00102R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010B\u001a\u00020@8\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u00105R\u0014\u0010F\u001a\u00020C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceNode$1$1", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "awaitPointerEventScope", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Lkotlin/r2;", "startTransfer", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00081 implements DragAndDropSourceScope, PointerInputScope {
            private final /* synthetic */ PointerInputScope $$delegate_0;
            final /* synthetic */ DragAndDropModifierNode $dragAndDropModifierNode;
            final /* synthetic */ DragAndDropSourceNode this$0;

            C00081(PointerInputScope pointerInputScope, DragAndDropModifierNode dragAndDropModifierNode, DragAndDropSourceNode dragAndDropSourceNode) {
                this.$dragAndDropModifierNode = dragAndDropModifierNode;
                this.this$0 = dragAndDropSourceNode;
                this.$$delegate_0 = pointerInputScope;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            @m
            public <R> Object awaitPointerEventScope(@l p<? super AwaitPointerEventScope, ? super d<? super R>, ? extends Object> pVar, @l d<? super R> dVar) {
                return this.$$delegate_0.awaitPointerEventScope(pVar, dVar);
            }

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.$$delegate_0.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
            public long mo295getExtendedTouchPaddingNHjbRc() {
                return this.$$delegate_0.mo295getExtendedTouchPaddingNHjbRc();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.$$delegate_0.getFontScale();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public boolean getInterceptOutOfBoundsChildEvents() {
                return this.$$delegate_0.getInterceptOutOfBoundsChildEvents();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            /* renamed from: getSize-YbymL2g, reason: not valid java name */
            public long mo296getSizeYbymL2g() {
                return this.$$delegate_0.mo296getSizeYbymL2g();
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            @l
            public ViewConfiguration getViewConfiguration() {
                return this.$$delegate_0.getViewConfiguration();
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
            public int mo297roundToPxR2X_6o(long j5) {
                return this.$$delegate_0.mo297roundToPxR2X_6o(j5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: roundToPx-0680j_4, reason: not valid java name */
            public int mo298roundToPx0680j_4(float f5) {
                return this.$$delegate_0.mo298roundToPx0680j_4(f5);
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputScope
            public void setInterceptOutOfBoundsChildEvents(boolean z4) {
                this.$$delegate_0.setInterceptOutOfBoundsChildEvents(z4);
            }

            @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
            public void startTransfer(@l DragAndDropTransferData dragAndDropTransferData) {
                this.$dragAndDropModifierNode.mo3383drag12SF9DM(dragAndDropTransferData, IntSizeKt.m6224toSizeozmzZPI(mo296getSizeYbymL2g()), this.this$0.getDrawDragDecoration());
            }

            @Override // androidx.compose.ui.unit.FontScaling
            @Stable
            /* renamed from: toDp-GaN1DYA, reason: not valid java name */
            public float mo299toDpGaN1DYA(long j5) {
                return this.$$delegate_0.mo299toDpGaN1DYA(j5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toDp-u2uoSUM, reason: not valid java name */
            public float mo300toDpu2uoSUM(float f5) {
                return this.$$delegate_0.mo300toDpu2uoSUM(f5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toDp-u2uoSUM, reason: not valid java name */
            public float mo301toDpu2uoSUM(int i5) {
                return this.$$delegate_0.mo301toDpu2uoSUM(i5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
            public long mo302toDpSizekrfVVM(long j5) {
                return this.$$delegate_0.mo302toDpSizekrfVVM(j5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toPx--R2X_6o, reason: not valid java name */
            public float mo303toPxR2X_6o(long j5) {
                return this.$$delegate_0.mo303toPxR2X_6o(j5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toPx-0680j_4, reason: not valid java name */
            public float mo304toPx0680j_4(float f5) {
                return this.$$delegate_0.mo304toPx0680j_4(f5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            @l
            public Rect toRect(@l DpRect dpRect) {
                return this.$$delegate_0.toRect(dpRect);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
            public long mo305toSizeXkaWNTQ(long j5) {
                return this.$$delegate_0.mo305toSizeXkaWNTQ(j5);
            }

            @Override // androidx.compose.ui.unit.FontScaling
            @Stable
            /* renamed from: toSp-0xMU5do, reason: not valid java name */
            public long mo306toSp0xMU5do(float f5) {
                return this.$$delegate_0.mo306toSp0xMU5do(f5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
            public long mo307toSpkPz2Gy4(float f5) {
                return this.$$delegate_0.mo307toSpkPz2Gy4(f5);
            }

            @Override // androidx.compose.ui.unit.Density
            @Stable
            /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
            public long mo308toSpkPz2Gy4(int i5) {
                return this.$$delegate_0.mo308toSpkPz2Gy4(i5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragAndDropModifierNode dragAndDropModifierNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$dragAndDropModifierNode = dragAndDropModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dragAndDropModifierNode, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                p<DragAndDropSourceScope, d<? super r2>, Object> dragAndDropSourceHandler = DragAndDropSourceNode.this.getDragAndDropSourceHandler();
                C00081 c00081 = new C00081(pointerInputScope, this.$dragAndDropModifierNode, DragAndDropSourceNode.this);
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(c00081, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public DragAndDropSourceNode(@l v3.l<? super DrawScope, r2> lVar, @l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1((DragAndDropModifierNode) delegate(DragAndDropNodeKt.DragAndDropModifierNode()), null)));
    }

    @l
    public final p<DragAndDropSourceScope, d<? super r2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    @l
    public final v3.l<DrawScope, r2> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo294onRemeasuredozmzZPI(long j5) {
        this.size = j5;
    }

    public final void setDragAndDropSourceHandler(@l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    public final void setDrawDragDecoration(@l v3.l<? super DrawScope, r2> lVar) {
        this.drawDragDecoration = lVar;
    }
}
