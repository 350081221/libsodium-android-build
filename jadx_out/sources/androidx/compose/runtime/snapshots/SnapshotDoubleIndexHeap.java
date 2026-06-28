package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import k0.c;
import kotlin.collections.o;
import kotlin.i0;
import p4.l;
import p4.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0007R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006\""}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "", "index", "Lkotlin/r2;", "shiftUp", "shiftDown", bi.ay, "b", "swap", "atLeast", "ensure", "allocateHandle", "handle", "freeHandle", "default", "lowestOrDefault", t0.b.f22420d, "add", "remove", c.f19046j, "validateHandle", "<set-?>", "size", "I", "getSize", "()I", "", "values", "[I", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;

    @l
    private int[] handles;
    private int size;

    @l
    private int[] values = new int[16];

    @l
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i5 = 0;
        while (i5 < 16) {
            int i6 = i5 + 1;
            iArr[i5] = i6;
            i5 = i6;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i5 = length * 2;
            int[] iArr = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr[i6] = i7;
                i6 = i7;
            }
            o.I0(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i8 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i8];
        return i8;
    }

    private final void ensure(int i5) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i5 <= length) {
            return;
        }
        int i6 = length * 2;
        int[] iArr2 = new int[i6];
        int[] iArr3 = new int[i6];
        o.I0(iArr, iArr2, 0, 0, 0, 14, null);
        o.I0(this.index, iArr3, 0, 0, 0, 14, null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int i5) {
        this.handles[i5] = this.firstFreeHandle;
        this.firstFreeHandle = i5;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i5);
    }

    private final void shiftDown(int i5) {
        int i6;
        int[] iArr = this.values;
        int i7 = this.size >> 1;
        while (i5 < i7) {
            int i8 = (i5 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < this.size && (i6 = iArr[i8]) < iArr[i9]) {
                if (i6 < iArr[i5]) {
                    swap(i8, i5);
                    i5 = i8;
                } else {
                    return;
                }
            } else if (iArr[i9] < iArr[i5]) {
                swap(i9, i5);
                i5 = i9;
            } else {
                return;
            }
        }
    }

    private final void shiftUp(int i5) {
        int[] iArr = this.values;
        int i6 = iArr[i5];
        while (i5 > 0) {
            int i7 = ((i5 + 1) >> 1) - 1;
            if (iArr[i7] > i6) {
                swap(i7, i5);
                i5 = i7;
            } else {
                return;
            }
        }
    }

    private final void swap(int i5, int i6) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i7 = iArr[i5];
        iArr[i5] = iArr[i6];
        iArr[i6] = i7;
        int i8 = iArr2[i5];
        iArr2[i5] = iArr2[i6];
        iArr2[i6] = i8;
        iArr3[iArr2[i5]] = i5;
        iArr3[iArr2[i6]] = i6;
    }

    public final int add(int i5) {
        ensure(this.size + 1);
        int i6 = this.size;
        this.size = i6 + 1;
        int allocateHandle = allocateHandle();
        this.values[i6] = i5;
        this.index[i6] = allocateHandle;
        this.handles[allocateHandle] = i6;
        shiftUp(i6);
        return allocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i5) {
        return this.size > 0 ? this.values[0] : i5;
    }

    public final void remove(int i5) {
        int i6 = this.handles[i5];
        swap(i6, this.size - 1);
        this.size--;
        shiftUp(i6);
        shiftDown(i6);
        freeHandle(i5);
    }

    @p
    public final void validate() {
        int i5 = this.size;
        int i6 = 1;
        while (i6 < i5) {
            int i7 = i6 + 1;
            int[] iArr = this.values;
            if (iArr[(i7 >> 1) - 1] <= iArr[i6]) {
                i6 = i7;
            } else {
                throw new IllegalStateException(("Index " + i6 + " is out of place").toString());
            }
        }
    }

    @p
    public final void validateHandle(int i5, int i6) {
        int i7 = this.handles[i5];
        if (this.index[i7] == i5) {
            if (this.values[i7] == i6) {
                return;
            }
            throw new IllegalStateException(("Value for handle " + i5 + " was " + this.values[i7] + " but was supposed to be " + i6).toString());
        }
        throw new IllegalStateException(("Index for handle " + i5 + " is corrupted").toString());
    }
}
