package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "T", "", "Lkotlin/r2;", "clear", "", "index", "element", "add", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "forEach", "", "asList", "get", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "onVectorMutated", "Lv3/a;", "getOnVectorMutated", "()Lv3/a;", "getSize", "()I", "size", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,54:1\n460#2,11:55\n523#2:66\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:55,11\n52#1:66\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;

    @l
    private final v3.a<r2> onVectorMutated;

    @l
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(@l MutableVector<T> mutableVector, @l v3.a<r2> aVar) {
        this.vector = mutableVector;
        this.onVectorMutated = aVar;
    }

    public final void add(int i5, T t5) {
        this.vector.add(i5, t5);
        this.onVectorMutated.invoke();
    }

    @l
    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(@l v3.l<? super T, r2> lVar) {
        MutableVector<T> vector = getVector();
        int size = vector.getSize();
        if (size > 0) {
            T[] content = vector.getContent();
            int i5 = 0;
            do {
                lVar.invoke(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final T get(int i5) {
        return this.vector.getContent()[i5];
    }

    @l
    public final v3.a<r2> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    @l
    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i5) {
        T removeAt = this.vector.removeAt(i5);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
