package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0004\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", "T", "", "", "isNotEmpty", "pop", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Lkotlin/r2;", "push", "", "size", "I", "", "currentIndexes", "[I", "", "vectors", "[Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"})
/* loaded from: classes.dex */
public final class NestedVectorStack<T> {
    public static final int $stable = 8;
    private int size;

    @l
    private int[] currentIndexes = new int[16];

    @l
    private MutableVector<T>[] vectors = new MutableVector[16];

    public final boolean isNotEmpty() {
        int i5 = this.size;
        return i5 > 0 && this.currentIndexes[i5 - 1] >= 0;
    }

    public final T pop() {
        boolean z4;
        int i5 = this.size;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i6 = i5 - 1;
            int i7 = this.currentIndexes[i6];
            MutableVector<T> mutableVector = this.vectors[i6];
            l0.m(mutableVector);
            if (i7 > 0) {
                this.currentIndexes[i6] = r3[i6] - 1;
            } else if (i7 == 0) {
                this.vectors[i6] = null;
                this.size--;
            }
            return mutableVector.getContent()[i7];
        }
        throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
    }

    public final void push(@l MutableVector<T> mutableVector) {
        if (mutableVector.isEmpty()) {
            return;
        }
        int i5 = this.size;
        int[] iArr = this.currentIndexes;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.currentIndexes = copyOf;
            MutableVector<T>[] mutableVectorArr = this.vectors;
            Object[] copyOf2 = Arrays.copyOf(mutableVectorArr, mutableVectorArr.length * 2);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.vectors = (MutableVector[]) copyOf2;
        }
        this.currentIndexes[i5] = mutableVector.getSize() - 1;
        this.vectors[i5] = mutableVector;
        this.size++;
    }
}
