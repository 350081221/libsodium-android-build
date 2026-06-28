package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ p<AwaitPointerEventScope, d<? super r2>, Object> $block;
    final /* synthetic */ g $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForEachGestureKt$awaitEachGesture$2(g gVar, p<? super AwaitPointerEventScope, ? super d<? super r2>, ? extends Object> pVar, d<? super ForEachGestureKt$awaitEachGesture$2> dVar) {
        super(2, dVar);
        this.$currentContext = gVar;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, dVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:5:0x003f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r9)     // Catch: java.util.concurrent.CancellationException -> L33
        L28:
            r9 = r1
            goto L3e
        L2a:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r9)     // Catch: java.util.concurrent.CancellationException -> L33
            r9 = r8
            goto L57
        L33:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L70
        L37:
            kotlin.e1.n(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
        L3e:
            r1 = r8
        L3f:
            kotlin.coroutines.g r5 = r1.$currentContext
            boolean r5 = kotlinx.coroutines.p2.C(r5)
            if (r5 == 0) goto L86
            v3.p<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r5 = r1.$block     // Catch: java.util.concurrent.CancellationException -> L6c
            r1.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L6c
            r1.label = r4     // Catch: java.util.concurrent.CancellationException -> L6c
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6c
            if (r5 != r0) goto L54
            return r0
        L54:
            r7 = r1
            r1 = r9
            r9 = r7
        L57:
            r9.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L66
            r9.label = r3     // Catch: java.util.concurrent.CancellationException -> L66
            java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L66
            if (r5 != r0) goto L62
            return r0
        L62:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L3f
        L66:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L70
        L6c:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L70:
            kotlin.coroutines.g r6 = r1.$currentContext
            boolean r6 = kotlinx.coroutines.p2.C(r6)
            if (r6 == 0) goto L85
            r1.L$0 = r5
            r1.label = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r5, r1)
            if (r9 != r0) goto L83
            return r0
        L83:
            r9 = r5
            goto L3f
        L85:
            throw r9
        L86:
            kotlin.r2 r9 = kotlin.r2.f19517a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
