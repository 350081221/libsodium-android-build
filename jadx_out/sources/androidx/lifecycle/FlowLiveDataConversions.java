package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.RoomTrackingLiveData;
import java.time.Duration;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "asFlow", "Ljava/time/Duration;", m0.a.Z, "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "FlowLiveDataConversions")
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {
    @l
    public static final <T> kotlinx.coroutines.flow.i<T> asFlow(@l LiveData<T> liveData) {
        l0.p(liveData, "<this>");
        return k.W(k.s(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    @l
    @u3.i
    public static final <T> LiveData<T> asLiveData(@l kotlinx.coroutines.flow.i<? extends T> iVar) {
        l0.p(iVar, "<this>");
        return asLiveData$default(iVar, (kotlin.coroutines.g) null, 0L, 3, (Object) null);
    }

    @l
    @u3.i
    public static final <T> LiveData<T> asLiveData(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l kotlin.coroutines.g context) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        return asLiveData$default(iVar, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @u3.i
    public static final <T> LiveData<T> asLiveData(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l kotlin.coroutines.g context, long j5) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        RoomTrackingLiveData roomTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j5, new FlowLiveDataConversions$asLiveData$1(iVar, null));
        if (iVar instanceof t0) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomTrackingLiveData.setValue(((t0) iVar).getValue());
            } else {
                roomTrackingLiveData.postValue(((t0) iVar).getValue());
            }
        }
        return roomTrackingLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.g gVar, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            j5 = 5000;
        }
        return asLiveData(iVar, gVar, j5);
    }

    public static /* synthetic */ LiveData asLiveData$default(kotlinx.coroutines.flow.i iVar, Duration duration, kotlin.coroutines.g gVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        return asLiveData(iVar, duration, gVar);
    }

    @l
    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l Duration timeout, @l kotlin.coroutines.g context) {
        l0.p(iVar, "<this>");
        l0.p(timeout, "timeout");
        l0.p(context, "context");
        return asLiveData(iVar, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
