package androidx.compose.ui.node;

import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0011\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0086\u0002J&\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u0006R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "", "start", "end", "elSize", "Lkotlin/r2;", "quickSort", "partition", "i", "j", "swapDiagonal", bi.ay, "b", "", "compareDiagonal", "index", "get", "oldStart", "oldEnd", "newStart", "newEnd", "pushRange", "x", "y", "size", "pushDiagonal", "pop", "isNotEmpty", "sortDiagonals", "", "stack", "[I", "lastIndex", "I", "getSize", "()I", "initialCapacity", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
/* loaded from: classes.dex */
final class IntStack {
    private int lastIndex;

    @l
    private int[] stack;

    public IntStack(int i5) {
        this.stack = new int[i5];
    }

    private final boolean compareDiagonal(int i5, int i6) {
        int[] iArr = this.stack;
        int i7 = iArr[i5];
        int i8 = iArr[i6];
        if (i7 < i8) {
            return true;
        }
        if (i7 == i8 && iArr[i5 + 1] <= iArr[i6 + 1]) {
            return true;
        }
        return false;
    }

    private final int partition(int i5, int i6, int i7) {
        int i8 = i5 - i7;
        while (i5 < i6) {
            if (compareDiagonal(i5, i6)) {
                i8 += i7;
                swapDiagonal(i8, i5);
            }
            i5 += i7;
        }
        int i9 = i8 + i7;
        swapDiagonal(i9, i6);
        return i9;
    }

    private final void quickSort(int i5, int i6, int i7) {
        if (i5 < i6) {
            int partition = partition(i5, i6, i7);
            quickSort(i5, partition - i7, i7);
            quickSort(partition + i7, i6, i7);
        }
    }

    private final void swapDiagonal(int i5, int i6) {
        int[] iArr = this.stack;
        MyersDiffKt.access$swap(iArr, i5, i6);
        MyersDiffKt.access$swap(iArr, i5 + 1, i6 + 1);
        MyersDiffKt.access$swap(iArr, i5 + 2, i6 + 2);
    }

    public final int get(int i5) {
        return this.stack[i5];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i5 = this.lastIndex - 1;
        this.lastIndex = i5;
        return iArr[i5];
    }

    public final void pushDiagonal(int i5, int i6, int i7) {
        int i8 = this.lastIndex;
        int i9 = i8 + 3;
        int[] iArr = this.stack;
        if (i9 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i8 + 0] = i5 + i7;
        iArr2[i8 + 1] = i6 + i7;
        iArr2[i8 + 2] = i7;
        this.lastIndex = i9;
    }

    public final void pushRange(int i5, int i6, int i7, int i8) {
        int i9 = this.lastIndex;
        int i10 = i9 + 4;
        int[] iArr = this.stack;
        if (i10 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i9 + 0] = i5;
        iArr2[i9 + 1] = i6;
        iArr2[i9 + 2] = i7;
        iArr2[i9 + 3] = i8;
        this.lastIndex = i10;
    }

    public final void sortDiagonals() {
        boolean z4;
        int i5 = this.lastIndex;
        if (i5 % 3 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 > 3) {
                quickSort(0, i5 - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Array size not a multiple of 3".toString());
    }
}
