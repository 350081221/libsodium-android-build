package androidx.compose.runtime.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.sequences.m;
import kotlin.sequences.q;
import p4.l;
import w3.a;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@i0(d1 = {"\u0000-\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\"\u0010\n\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000fH\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"androidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1", "", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "isEmpty", "iterator", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1726#2,3:299\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1\n*L\n240#1:299,3\n*E\n"})
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1$entries$1<Key, Value> implements Set<Map.Entry<? extends Key, ? extends Value>>, a {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArrayMap$asMap$1$entries$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Map.Entry<? extends Key, ? extends Value> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends Key, ? extends Value>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<Map.Entry<Key, Value>> iterator() {
        m b5;
        b5 = q.b(new IdentityArrayMap$asMap$1$entries$1$iterator$1(this.this$0, null));
        return b5.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    public boolean contains(@l Map.Entry<? extends Key, ? extends Value> entry) {
        return this.this$0.get(entry.getKey()) == entry.getValue();
    }
}
