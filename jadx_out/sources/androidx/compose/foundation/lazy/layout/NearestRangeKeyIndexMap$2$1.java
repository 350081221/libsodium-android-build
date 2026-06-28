package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap$2$1 extends n0 implements l<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, r2> {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ MutableObjectIntMap<Object> $map;
    final /* synthetic */ NearestRangeKeyIndexMap this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestRangeKeyIndexMap$2$1(int i5, int i6, MutableObjectIntMap<Object> mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        super(1);
        this.$first = i5;
        this.$last = i6;
        this.$map = mutableObjectIntMap;
        this.this$0 = nearestRangeKeyIndexMap;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
        invoke2(interval);
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r3 == null) goto L7;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(@p4.l androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.getValue()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            v3.l r0 = r0.getKey()
            int r1 = r6.$first
            int r2 = r7.getStartIndex()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r6.$last
            int r3 = r7.getStartIndex()
            int r4 = r7.getSize()
            int r3 = r3 + r4
            int r3 = r3 + (-1)
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 > r2) goto L57
        L27:
            if (r0 == 0) goto L39
            int r3 = r7.getStartIndex()
            int r3 = r1 - r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L3d
        L39:
            java.lang.Object r3 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r1)
        L3d:
            androidx.collection.MutableObjectIntMap<java.lang.Object> r4 = r6.$map
            r4.set(r3, r1)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r6.this$0
            java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeys$p(r4)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r6.this$0
            int r5 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeysStartIndex$p(r5)
            int r5 = r1 - r5
            r4[r5] = r3
            if (r1 == r2) goto L57
            int r1 = r1 + 1
            goto L27
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.invoke2(androidx.compose.foundation.lazy.layout.IntervalList$Interval):void");
    }
}
