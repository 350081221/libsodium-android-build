package androidx.collection;

import java.util.Iterator;
import kotlin.i0;
import kotlin.sequences.q;
import p4.l;
import w3.d;

/* JADX INFO: Add missing generic type declarations: [V] */
@i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1$iterator$1", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/r2;", "remove", "", "", "iterator", "Ljava/util/Iterator;", "current", "I", "collection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements Iterator<V>, d {
    private int current;

    @l
    private final Iterator<Integer> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        Iterator<Integer> a5;
        this.this$0 = mutableScatterMap;
        a5 = q.a(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(mutableScatterMap, null));
        this.iterator = a5;
        this.current = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        int intValue = this.iterator.next().intValue();
        this.current = intValue;
        return (V) this.this$0.values[intValue];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i5 = this.current;
        if (i5 >= 0) {
            this.this$0.removeValueAt(i5);
            this.current = -1;
        }
    }
}
