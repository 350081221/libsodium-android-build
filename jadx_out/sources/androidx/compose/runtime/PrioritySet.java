package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.y;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "", b.f22420d, "Lkotlin/r2;", "add", "", "isEmpty", "isNotEmpty", "peek", "takeMax", "validateHeap", "", "list", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n4178#2,5:3746\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3690#1:3746,5\n*E\n"})
/* loaded from: classes.dex */
public final class PrioritySet {
    public static final int $stable = 8;

    @l
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PrioritySet(@l List<Integer> list) {
        this.list = list;
    }

    public final void add(int i5) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() != i5) {
                if (this.list.get(r0.size() - 1).intValue() == i5) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i5));
        while (size > 0) {
            int i6 = ((size + 1) >>> 1) - 1;
            int intValue = this.list.get(i6).intValue();
            if (i5 <= intValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(intValue));
            size = i6;
        }
        this.list.set(size, Integer.valueOf(i5));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        Object y22;
        y22 = e0.y2(this.list);
        return ((Number) y22).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int takeMax() {
        boolean z4;
        Object m32;
        int intValue;
        if (this.list.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int intValue2 = this.list.get(0).intValue();
            while ((!this.list.isEmpty()) && this.list.get(0).intValue() == intValue2) {
                List<Integer> list = this.list;
                m32 = e0.m3(list);
                list.set(0, m32);
                List<Integer> list2 = this.list;
                list2.remove(list2.size() - 1);
                int size = this.list.size();
                int size2 = this.list.size() >>> 1;
                int i5 = 0;
                while (i5 < size2) {
                    int intValue3 = this.list.get(i5).intValue();
                    int i6 = (i5 + 1) * 2;
                    int i7 = i6 - 1;
                    int intValue4 = this.list.get(i7).intValue();
                    if (i6 < size && (intValue = this.list.get(i6).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.list.set(i5, Integer.valueOf(intValue));
                            this.list.set(i6, Integer.valueOf(intValue3));
                            i5 = i6;
                        }
                    } else if (intValue4 > intValue3) {
                        this.list.set(i5, Integer.valueOf(intValue4));
                        this.list.set(i7, Integer.valueOf(intValue3));
                        i5 = i7;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.composeRuntimeError("Set is empty".toString());
        throw new y();
    }

    public final void validateHeap() {
        boolean z4;
        int size = this.list.size();
        int i5 = size / 2;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 + 1;
            int i8 = i7 * 2;
            boolean z5 = true;
            if (this.list.get(i6).intValue() >= this.list.get(i8 - 1).intValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i8 < size && this.list.get(i6).intValue() < this.list.get(i8).intValue()) {
                    z5 = false;
                }
                if (z5) {
                    i6 = i7;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public /* synthetic */ PrioritySet(List list, int i5, w wVar) {
        this((i5 & 1) != 0 ? new ArrayList() : list);
    }
}
