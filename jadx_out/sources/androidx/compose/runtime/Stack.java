package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.i0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", b.f22420d, "", "push", "(Ljava/lang/Object;)Z", "pop", "()Ljava/lang/Object;", "peek", "", "index", "(I)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "Lkotlin/r2;", "clear", "", "toArray", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "Ljava/util/ArrayList;", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Stack<T> {
    public static final int $stable = 8;

    @l
    private final ArrayList<T> backing = new ArrayList<>();

    public final void clear() {
        this.backing.clear();
    }

    public final int getSize() {
        return this.backing.size();
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return this.backing.get(getSize() - 1);
    }

    public final T pop() {
        return this.backing.remove(getSize() - 1);
    }

    public final boolean push(T t5) {
        return this.backing.add(t5);
    }

    @l
    public final T[] toArray() {
        int size = this.backing.size();
        T[] tArr = (T[]) new Object[size];
        for (int i5 = 0; i5 < size; i5++) {
            tArr[i5] = this.backing.get(i5);
        }
        return tArr;
    }

    public final T peek(int i5) {
        return this.backing.get(i5);
    }
}
