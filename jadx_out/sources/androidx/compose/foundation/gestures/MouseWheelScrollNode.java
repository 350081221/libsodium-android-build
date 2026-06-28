package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/r2;", "onAttach", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "getScrollConfig", "()Landroidx/compose/foundation/gestures/ScrollConfig;", "setScrollConfig", "(Landroidx/compose/foundation/gestures/ScrollConfig;)V", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MouseWheelScrollNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {

    @m
    private ScrollConfig scrollConfig;

    @l
    private final ScrollingLogic scrollingLogic;

    @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", i = {}, l = {669}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", i = {0}, l = {671}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1021:1\n86#2,2:1022\n33#2,6:1024\n88#2:1030\n33#2,6:1031\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n*L\n672#1:1022,2\n672#1:1024,6\n672#1:1030\n688#1:1031,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00111 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MouseWheelScrollNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00111(MouseWheelScrollNode mouseWheelScrollNode, d<? super C00111> dVar) {
                super(2, dVar);
                this.this$0 = mouseWheelScrollNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                C00111 c00111 = new C00111(this.this$0, dVar);
                c00111.L$0 = obj;
                return c00111;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
                return ((C00111) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L20
                    if (r2 != r3) goto L18
                    java.lang.Object r2 = r0.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    kotlin.e1.n(r18)
                    r5 = r18
                    r4 = r0
                    goto L33
                L18:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L20:
                    kotlin.e1.n(r18)
                    java.lang.Object r2 = r0.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    r4 = r0
                L28:
                    r4.L$0 = r2
                    r4.label = r3
                    java.lang.Object r5 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r2, r4)
                    if (r5 != r1) goto L33
                    return r1
                L33:
                    androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                    java.util.List r6 = r5.getChanges()
                    int r7 = r6.size()
                    r8 = 0
                    r9 = r8
                L3f:
                    if (r9 >= r7) goto L53
                    java.lang.Object r10 = r6.get(r9)
                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                    boolean r10 = r10.isConsumed()
                    r10 = r10 ^ r3
                    if (r10 != 0) goto L50
                    r6 = r8
                    goto L54
                L50:
                    int r9 = r9 + 1
                    goto L3f
                L53:
                    r6 = r3
                L54:
                    if (r6 == 0) goto L28
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r6 = r4.this$0
                    androidx.compose.foundation.gestures.ScrollConfig r6 = r6.getScrollConfig()
                    kotlin.jvm.internal.l0.m(r6)
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r7 = r4.this$0
                    long r9 = r2.mo4784getSizeYbymL2g()
                    long r9 = r6.mo310calculateMouseWheelScroll8xgXZGE(r2, r5, r9)
                    androidx.compose.foundation.gestures.ScrollingLogic r6 = androidx.compose.foundation.gestures.MouseWheelScrollNode.access$getScrollingLogic$p(r7)
                    kotlinx.coroutines.s0 r11 = r7.getCoroutineScope()
                    r12 = 0
                    r13 = 0
                    androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r14 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                    r7 = 0
                    r14.<init>(r6, r9, r7)
                    r15 = 3
                    r16 = 0
                    kotlinx.coroutines.i.e(r11, r12, r13, r14, r15, r16)
                    java.util.List r5 = r5.getChanges()
                    int r6 = r5.size()
                L87:
                    if (r8 >= r6) goto L28
                    java.lang.Object r7 = r5.get(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                    r7.consume()
                    int r8 = r8 + 1
                    goto L87
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode.AnonymousClass1.C00111.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
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
                C00111 c00111 = new C00111(MouseWheelScrollNode.this, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00111, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public MouseWheelScrollNode(@l ScrollingLogic scrollingLogic) {
        this.scrollingLogic = scrollingLogic;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1(null)));
    }

    @m
    public final ScrollConfig getScrollConfig() {
        return this.scrollConfig;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    public final void setScrollConfig(@m ScrollConfig scrollConfig) {
        this.scrollConfig = scrollConfig;
    }
}
