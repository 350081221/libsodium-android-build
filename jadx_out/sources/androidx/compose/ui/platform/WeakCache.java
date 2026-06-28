package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "Lkotlin/r2;", "clearWeakReferences", "element", "push", "(Ljava/lang/Object;)V", "pop", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "values", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", "size", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;

    @p4.l
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);

    @p4.l
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    @p4.m
    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            T t5 = this.values.removeAt(r0.getSize() - 1).get();
            if (t5 != null) {
                return t5;
            }
        }
        return null;
    }

    public final void push(T t5) {
        clearWeakReferences();
        this.values.add(new WeakReference(t5, this.referenceQueue));
    }
}
