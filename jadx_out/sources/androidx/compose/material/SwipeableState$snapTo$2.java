package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.flow.j;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "", "anchors", "Lkotlin/r2;", "emit", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeableState$snapTo$2<T> implements j {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SwipeableState$snapTo$2(T t5, SwipeableState<T> swipeableState) {
        this.$targetValue = t5;
        this.this$0 = swipeableState;
    }

    @Override // kotlinx.coroutines.flow.j
    public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
        return emit((Map) obj, (d<? super r2>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(@p4.l java.util.Map<java.lang.Float, ? extends T> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.material.SwipeableState$snapTo$2 r5 = (androidx.compose.material.SwipeableState$snapTo$2) r5
            kotlin.e1.n(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e1.n(r6)
            T r6 = r4.$targetValue
            java.lang.Float r5 = androidx.compose.material.SwipeableKt.access$getOffset(r5, r6)
            if (r5 == 0) goto L5c
            androidx.compose.material.SwipeableState<T> r6 = r4.this$0
            float r5 = r5.floatValue()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = androidx.compose.material.SwipeableState.access$snapInternalToOffset(r6, r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r5 = r4
        L52:
            androidx.compose.material.SwipeableState<T> r6 = r5.this$0
            T r5 = r5.$targetValue
            androidx.compose.material.SwipeableState.access$setCurrentValue(r6, r5)
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        L5c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$snapTo$2.emit(java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }
}
