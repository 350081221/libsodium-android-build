package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nJ\u0012\u0010\u0010\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "create", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "Lkotlin/r2;", "onActive", "onInactive", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/RoomDatabase;", "", "liveDataSet", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class InvalidationLiveDataContainer {

    @p4.l
    private final RoomDatabase database;

    @p4.l
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(@p4.l RoomDatabase database) {
        l0.p(database, "database");
        this.database = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        l0.o(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = newSetFromMap;
    }

    @p4.l
    public final <T> LiveData<T> create(@p4.l String[] tableNames, boolean z4, @p4.l Callable<T> computeFunction) {
        l0.p(tableNames, "tableNames");
        l0.p(computeFunction, "computeFunction");
        return new RoomTrackingLiveData(this.database, this, z4, computeFunction, tableNames);
    }

    @p4.l
    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(@p4.l LiveData<?> liveData) {
        l0.p(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(@p4.l LiveData<?> liveData) {
        l0.p(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }
}
