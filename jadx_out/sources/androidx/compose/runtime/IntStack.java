package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "", b.f22420d, "Lkotlin/r2;", "push", "pop", "default", "peekOr", "peek", "index", "", "isEmpty", "isNotEmpty", "clear", "indexOf", "", "slots", "[I", "tos", "I", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntStack {
    public static final int $stable = 8;

    @l
    private int[] slots = new int[10];
    private int tos;

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final int indexOf(int i5) {
        int i6 = this.tos;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.slots[i7] == i5) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peekOr(int i5) {
        return this.tos > 0 ? peek() : i5;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i5 = this.tos - 1;
        this.tos = i5;
        return iArr[i5];
    }

    public final void push(int i5) {
        int i6 = this.tos;
        int[] iArr = this.slots;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.slots = copyOf;
        }
        int[] iArr2 = this.slots;
        int i7 = this.tos;
        this.tos = i7 + 1;
        iArr2[i7] = i5;
    }

    public final int peek(int i5) {
        return this.slots[i5];
    }
}
