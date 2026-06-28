package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.q1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.u0;
import kotlin.y;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000b\u001a\u00020\t2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001d\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0096\u0002J\u001c\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u0014\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "addAll", "elements", "", "contains", "", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:411\n84#3,2:367\n128#3,5:369\n133#3:375\n121#3:376\n134#3,5:378\n86#3,7:383\n139#3,2:390\n125#3:392\n141#3,6:398\n149#3,3:407\n93#3:410\n82#4:374\n2283#5:377\n2176#5,2:393\n1714#5:395\n2178#5,2:396\n2180#5,3:404\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:411,3\n210#1:367,2\n210#1:369,5\n210#1:375\n210#1:376\n210#1:378,5\n210#1:383,7\n210#1:390,2\n210#1:392\n210#1:398,6\n210#1:407,3\n210#1:410\n210#1:374\n210#1:377\n210#1:393,2\n210#1:395\n210#1:396,2\n210#1:404,3\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    public SnapshotMapEntrySet(@l SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (u1.I(obj)) {
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

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (u1.I(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> collection) {
        int Y;
        int j5;
        int u4;
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj2;
        boolean z5;
        Collection<? extends Object> collection2 = collection;
        Y = x.Y(collection2, 10);
        j5 = z0.j(Y);
        u4 = u.u(j5, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u4);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            u0 a5 = q1.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a5.getFirst(), a5.getSecond());
        }
        SnapshotStateMap<K, V> map = getMap();
        boolean z6 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder2 = map$runtime_release.builder2();
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            while (true) {
                z4 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (linkedHashMap.containsKey(next.getKey()) && l0.g(linkedHashMap.get(next.getKey()), next.getValue())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    builder2.remove(next.getKey());
                    z6 = true;
                }
            }
            r2 r2Var2 = r2.f19517a;
            PersistentMap<K, V> build2 = builder2.build2();
            if (l0.g(build2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build2);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!z4);
        return z6;
    }

    @l
    public Void add(@l Map.Entry<K, V> entry) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // java.util.Set, java.util.Collection
    @l
    public Void addAll(@l Collection<? extends Map.Entry<K, V>> collection) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    public boolean contains(@l Map.Entry<K, V> entry) {
        return l0.g(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(@l Map.Entry<K, V> entry) {
        return getMap().remove(entry.getKey()) != null;
    }
}
