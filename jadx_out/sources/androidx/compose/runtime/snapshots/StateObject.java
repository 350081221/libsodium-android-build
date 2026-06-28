package androidx.compose.runtime.snapshots;

import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObject;", "", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "Lkotlin/r2;", "prependStateRecord", "previous", "current", "applied", "mergeRecords", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface StateObject {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static StateRecord mergeRecords(@l StateObject stateObject, @l StateRecord stateRecord, @l StateRecord stateRecord2, @l StateRecord stateRecord3) {
            return StateObject.super.mergeRecords(stateRecord, stateRecord2, stateRecord3);
        }
    }

    @l
    StateRecord getFirstStateRecord();

    @m
    default StateRecord mergeRecords(@l StateRecord stateRecord, @l StateRecord stateRecord2, @l StateRecord stateRecord3) {
        return null;
    }

    void prependStateRecord(@l StateRecord stateRecord);
}
