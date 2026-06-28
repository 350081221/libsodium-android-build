package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

@f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
/* loaded from: classes.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ l<Offset, r2> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
        final /* synthetic */ g $currentContext;
        final /* synthetic */ l<Offset, r2> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(g gVar, PointerEventPass pointerEventPass, l<? super Offset, r2> lVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentContext = gVar;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
        /* JADX WARN: Type inference failed for: r10v15, types: [T, androidx.compose.ui.geometry.Offset] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0048 -> B:5:0x004e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.L$1
                kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                java.lang.Object r3 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.e1.n(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L4e
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                kotlin.e1.n(r10)
                java.lang.Object r10 = r9.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                kotlin.jvm.internal.k1$h r1 = new kotlin.jvm.internal.k1$h
                r1.<init>()
                r3 = r10
                r10 = r9
            L31:
                kotlin.coroutines.g r4 = r10.$currentContext
                boolean r4 = kotlinx.coroutines.p2.C(r4)
                if (r4 == 0) goto Lb3
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r10.$pointerEventPass
                r10.L$0 = r3
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r4 = r3.awaitPointerEvent(r4, r10)
                if (r4 != r0) goto L48
                return r0
            L48:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L4e:
                androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                int r5 = r10.m4814getType7fucELk()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r7 = r6.m4827getMove7fucELk()
                boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r5, r7)
                if (r7 == 0) goto L62
                r7 = r2
                goto L6a
            L62:
                int r7 = r6.m4825getEnter7fucELk()
                boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r5, r7)
            L6a:
                if (r7 == 0) goto L6e
                r5 = r2
                goto L76
            L6e:
                int r6 = r6.m4826getExit7fucELk()
                boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r5, r6)
            L76:
                if (r5 == 0) goto Lad
                java.util.List r10 = r10.getChanges()
                java.lang.Object r10 = kotlin.collections.u.y2(r10)
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                long r5 = r10.m4872getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m3482boximpl(r5)
                long r5 = r10.m3503unboximpl()
                T r7 = r3.element
                boolean r5 = androidx.compose.ui.geometry.Offset.m3489equalsimpl(r5, r7)
                if (r5 != 0) goto L97
                goto L98
            L97:
                r10 = 0
            L98:
                if (r10 == 0) goto Lad
                v3.l<androidx.compose.ui.geometry.Offset, kotlin.r2> r5 = r0.$onMove
                long r6 = r10.m3503unboximpl()
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m3482boximpl(r6)
                r3.element = r10
                androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m3482boximpl(r6)
                r5.invoke(r10)
            Lad:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L31
            Lb3:
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, r2> lVar, d<? super PointerMoveDetectorKt$detectMoves$2> dVar) {
        super(2, dVar);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
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
            g context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
