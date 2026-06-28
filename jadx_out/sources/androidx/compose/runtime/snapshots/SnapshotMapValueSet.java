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

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n128#2,5:363\n133#2:369\n121#2:370\n134#2,5:372\n86#2,7:377\n139#2,2:384\n125#2:386\n141#2,6:392\n149#2,3:401\n93#2:404\n84#2,2:405\n128#2,5:407\n133#2:413\n121#2:414\n134#2,5:416\n86#2,7:421\n139#2,2:428\n125#2:430\n141#2,6:436\n149#2,3:445\n93#2:448\n82#3:368\n82#3:412\n2283#4:371\n2176#4,2:387\n1714#4:389\n2178#4,2:390\n2180#4,3:398\n2283#4:415\n2176#4,2:431\n1714#4:433\n2178#4,2:434\n2180#4,3:442\n1726#5,3:449\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,5\n250#1:369\n250#1:370\n250#1:372,5\n250#1:377,7\n250#1:384,2\n250#1:386\n250#1:392,6\n250#1:401,3\n250#1:404\n254#1:405,2\n254#1:407,5\n254#1:413\n254#1:414\n254#1:416,5\n254#1:421,7\n254#1:428,2\n254#1:430\n254#1:436,6\n254#1:445,3\n254#1:448\n250#1:368\n254#1:412\n250#1:371\n250#1:387,2\n250#1:389\n250#1:390,2\n250#1:398,3\n254#1:415\n254#1:431,2\n254#1:433\n254#1:434,2\n254#1:442,3\n258#1:449,3\n*E\n"})
/* loaded from: classes.dex */
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    public SnapshotMapValueSet(@l SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapValueSet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().removeValue$runtime_release(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> collection) {
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
                if (X5.contains(next.getValue())) {
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
                if (!X5.contains(next.getValue())) {
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
    public Void add(V v4) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // java.util.Set, java.util.Collection
    @l
    public Void addAll(@l Collection<? extends V> collection) {
        SnapshotStateMapKt.unsupported();
        throw new y();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
