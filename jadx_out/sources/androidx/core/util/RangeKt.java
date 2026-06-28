package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.ranges.g;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f\u001a(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¨\u0006\u000e"}, d2 = {"", "T", "that", "Landroid/util/Range;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", t0.b.f22420d, "plus", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "and", "Lkotlin/ranges/g;", "toClosedRange", "toRange", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class RangeKt {
    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(@l Range<T> range, @l Range<T> range2) {
        return range.intersect(range2);
    }

    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(@l Range<T> range, @l T t5) {
        return range.extend((Range<T>) t5);
    }

    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(@l T t5, @l T t6) {
        return new Range<>(t5, t6);
    }

    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> kotlin.ranges.g<T> toClosedRange(@l final Range<T> range) {
        return (kotlin.ranges.g<T>) new kotlin.ranges.g<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // kotlin.ranges.g
            public boolean contains(@l Comparable comparable) {
                return g.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.g
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.g
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // kotlin.ranges.g
            public boolean isEmpty() {
                return g.a.b(this);
            }
        };
    }

    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(@l kotlin.ranges.g<T> gVar) {
        return new Range<>(gVar.getStart(), gVar.getEndInclusive());
    }

    @l
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(@l Range<T> range, @l Range<T> range2) {
        return range.extend(range2);
    }
}
