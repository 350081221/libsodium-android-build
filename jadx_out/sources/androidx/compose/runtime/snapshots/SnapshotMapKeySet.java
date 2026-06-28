package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.y;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:407\n84#3,2:363\n128#3,5:365\n133#3:371\n121#3:372\n134#3,5:374\n86#3,7:379\n139#3,2:386\n125#3:388\n141#3,6:394\n149#3,3:403\n93#3:406\n82#4:370\n2283#5:373\n2176#5,2:389\n1714#5:391\n2178#5,2:392\n2180#5,3:400\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:407,3\n234#1:363,2\n234#1:365,5\n234#1:371\n234#1:372\n234#1:374,5\n234#1:379,7\n234#1:386,2\n234#1:388\n234#1:394,6\n234#1:403,3\n234#1:406\n234#1:370\n234#1:373\n234#1:389,2\n234#1:391\n234#1:392,2\n234#1:400,3\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    public SnapshotMapKeySet(@l SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapKeySet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> collection) {
        Set X5;
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        boolean z4;
        Snapshot current;
        Object obj2;
        X5 = e0.X5(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z5 = false;
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
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (true) {
                z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!X5.contains(next.getKey())) {
                    builder2.remove(next.getKey());
                    z5 = true;
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
        return z5;
    }

    @Override // java.util.Set, java.util.Collection
    @l
    public Void add(K k5) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // java.util.Set, java.util.Collection
    @l
    public Void addAll(@l Collection<? extends K> collection) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public StateMapMutableKeysIterator<K, V> iterator() {
        return new StateMapMutableKeysIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
