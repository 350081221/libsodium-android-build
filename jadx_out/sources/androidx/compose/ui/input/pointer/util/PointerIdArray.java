package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rR$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0012\u0010$\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "", "index", "Landroidx/compose/ui/input/pointer/PointerId;", "get-_I2yYro", "(I)J", "get", "pointerId", "", "remove-0FcD4WY", "(J)Z", "remove", "", "pointerIdValue", "removeAt", "isEmpty", b.f22420d, "add", "add-0FcD4WY", "Lkotlin/r2;", "set", "set-DmW0f2w", "(IJ)V", "clear", "contains-0FcD4WY", "contains", "<set-?>", "size", "I", "getSize", "()I", "", "internalArray", "[J", "getLastIndex", "lastIndex", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerIdArray {
    public static final int $stable = 8;

    @l
    private long[] internalArray = new long[2];
    private int size;

    public final boolean add(long j5) {
        if (!contains(j5)) {
            set(this.size, j5);
            return true;
        }
        return false;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m4965add0FcD4WY(long j5) {
        return add(j5);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j5) {
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.internalArray[i6] == j5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m4966contains0FcD4WY(long j5) {
        return contains(j5);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m4967get_I2yYro(int i5) {
        return PointerId.m4852constructorimpl(this.internalArray[i5]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean remove(long j5) {
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (j5 == m4967get_I2yYro(i6)) {
                removeAt(i6);
                return true;
            }
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m4968remove0FcD4WY(long j5) {
        return remove(j5);
    }

    public final boolean removeAt(int i5) {
        int i6 = this.size;
        if (i5 < i6) {
            int i7 = i6 - 1;
            while (i5 < i7) {
                long[] jArr = this.internalArray;
                int i8 = i5 + 1;
                jArr[i5] = jArr[i8];
                i5 = i8;
            }
            this.size--;
            return true;
        }
        return false;
    }

    public final void set(int i5, long j5) {
        long[] jArr = this.internalArray;
        if (i5 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i5 + 1, jArr.length * 2));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.internalArray = copyOf;
        }
        this.internalArray[i5] = j5;
        if (i5 >= this.size) {
            this.size = i5 + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m4969setDmW0f2w(int i5, long j5) {
        set(i5, j5);
    }
}
