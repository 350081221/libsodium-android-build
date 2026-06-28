package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.m;
import v3.l;
import v3.p;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004JV\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u000426\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00010\nH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Interval", "", "", "index", "getKey", "getContentType", "T", "globalIndex", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "localIntervalIndex", "content", "block", "withInterval", "(ILv3/p;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "getItemCount", "()I", "itemCount", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyLayoutIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,85:1\n60#1,3:86\n60#1,3:89\n*S KotlinDebug\n*F\n+ 1 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n40#1:86,3\n48#1:89,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001R1\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "index", "getKey", "()Lv3/l;", DatabaseFileArchive.COLUMN_KEY, "getType", "type", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public interface Interval {
        @m
        default l<Integer, Object> getKey() {
            return null;
        }

        @p4.l
        default l<Integer, Object> getType() {
            return LazyLayoutIntervalContent$Interval$type$1.INSTANCE;
        }
    }

    @m
    public final Object getContentType(int i5) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i5);
        return interval.getValue().getType().invoke(Integer.valueOf(i5 - interval.getStartIndex()));
    }

    @p4.l
    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    @p4.l
    public final Object getKey(int i5) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i5);
        int startIndex = i5 - interval.getStartIndex();
        l<Integer, Object> key = interval.getValue().getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) {
            return Lazy_androidKt.getDefaultLazyLayoutKey(i5);
        }
        return invoke;
    }

    public final <T> T withInterval(int i5, @p4.l p<? super Integer, ? super Interval, ? extends T> pVar) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i5);
        return pVar.invoke(Integer.valueOf(i5 - interval.getStartIndex()), interval.getValue());
    }
}
