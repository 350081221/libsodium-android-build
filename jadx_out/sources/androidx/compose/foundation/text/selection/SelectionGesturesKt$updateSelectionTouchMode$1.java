package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SelectionGesturesKt$updateSelectionTouchMode$1 extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ l<Boolean, r2> $updateTouchMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ l<Boolean, r2> $updateTouchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Boolean, r2> lVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$updateTouchMode = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:5:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.e1.n(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L39
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.e1.n(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                r1 = r7
                r7 = r6
            L27:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r3 = r1.awaitPointerEvent(r3, r7)
                if (r3 != r0) goto L34
                return r0
            L34:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L39:
                androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                v3.l<java.lang.Boolean, kotlin.r2> r4 = r0.$updateTouchMode
                boolean r7 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r7)
                r7 = r7 ^ r2
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
                r4.invoke(r7)
                r7 = r0
                r0 = r1
                r1 = r3
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionGesturesKt$updateSelectionTouchMode$1(l<? super Boolean, r2> lVar, kotlin.coroutines.d<? super SelectionGesturesKt$updateSelectionTouchMode$1> dVar) {
        super(2, dVar);
        this.$updateTouchMode = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        SelectionGesturesKt$updateSelectionTouchMode$1 selectionGesturesKt$updateSelectionTouchMode$1 = new SelectionGesturesKt$updateSelectionTouchMode$1(this.$updateTouchMode, dVar);
        selectionGesturesKt$updateSelectionTouchMode$1.L$0 = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
