package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0004J$\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\nH\u0084\b¢\u0006\u0004\b\f\u0010\rR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "Lkotlin/r2;", "remove", "", "hasNext", "advance", "T", "Lkotlin/Function0;", "block", "modify", "(Lv3/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "modification", "I", "getModification", "()I", "setModification", "(I)V", "current", "Ljava/util/Map$Entry;", "getCurrent", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "next", "getNext", "setNext", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {

    @m
    private Map.Entry<? extends K, ? extends V> current;

    @l
    private final Iterator<Map.Entry<K, V>> iterator;

    @l
    private final SnapshotStateMap<K, V> map;
    private int modification;

    @m
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(@l SnapshotStateMap<K, V> snapshotStateMap, @l Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void advance() {
        Map.Entry<K, V> entry;
        this.current = this.next;
        if (this.iterator.hasNext()) {
            entry = this.iterator.next();
        } else {
            entry = null;
        }
        this.next = entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m
    public final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    @l
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @l
    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    protected final int getModification() {
        return this.modification;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m
    public final Map.Entry<K, V> getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    protected final <T> T modify(@l v3.a<? extends T> aVar) {
        if (getMap().getModification$runtime_release() == this.modification) {
            T invoke = aVar.invoke();
            this.modification = getMap().getModification$runtime_release();
            return invoke;
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                r2 r2Var = r2.f19517a;
                this.modification = getMap().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    protected final void setCurrent(@m Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final void setModification(int i5) {
        this.modification = i5;
    }

    protected final void setNext(@m Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}
