package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.l;
import kotlin.ranges.u;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/l;", "", "firstVisibleItem", "Lkotlin/r2;", "update", "slidingWindowSize", "I", "extraItemCount", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lkotlin/ranges/l;", "setValue", "(Lkotlin/ranges/l;)V", b.f22420d, "lastFirstVisibleItem", "<init>", "(III)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<l> {
    public static final int $stable = 0;

    @p4.l
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;

    @p4.l
    private final MutableState value$delegate;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState$Companion;", "", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lkotlin/ranges/l;", "calculateNearestItemsRange", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l calculateNearestItemsRange(int i5, int i6, int i7) {
            l W1;
            int i8 = (i5 / i6) * i6;
            W1 = u.W1(Math.max(i8 - i7, 0), i8 + i6 + i7);
            return W1;
        }
    }

    public LazyLayoutNearestRangeState(int i5, int i6, int i7) {
        this.slidingWindowSize = i6;
        this.extraItemCount = i7;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i5, i6, i7), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i5;
    }

    private void setValue(l lVar) {
        this.value$delegate.setValue(lVar);
    }

    public final void update(int i5) {
        if (i5 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i5;
            setValue(Companion.calculateNearestItemsRange(i5, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @p4.l
    public l getValue() {
        return (l) this.value$delegate.getValue();
    }
}
