package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k1;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a^\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u00072-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*`\b\u0000\u0010\u0019\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010¨\u0006\u001a"}, d2 = {"T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/EmittedSource;", "addDisposableSource", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "liveData", "(Lkotlin/coroutines/g;JLv3/p;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", m0.a.Z, "(Ljava/time/Duration;Lkotlin/coroutines/g;Lv3/p;)Landroidx/lifecycle/LiveData;", "DEFAULT_TIMEOUT", "J", "Block", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @m
    public static final <T> Object addDisposableSource(@l MediatorLiveData<T> mediatorLiveData, @l LiveData<T> liveData, @l kotlin.coroutines.d<? super EmittedSource> dVar) {
        return kotlinx.coroutines.i.h(k1.e().E0(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), dVar);
    }

    @l
    @RequiresApi(26)
    @u3.i
    public static final <T> LiveData<T> liveData(@l Duration timeout, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(timeout, "timeout");
        l0.p(block, "block");
        return liveData$default(timeout, (kotlin.coroutines.g) null, block, 2, (Object) null);
    }

    @l
    @u3.i
    public static final <T> LiveData<T> liveData(@l kotlin.coroutines.g context, long j5, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        return new CoroutineLiveData(context, j5, block);
    }

    @l
    @u3.i
    public static final <T> LiveData<T> liveData(@l kotlin.coroutines.g context, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    @l
    @u3.i
    public static final <T> LiveData<T> liveData(@l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(block, "block");
        return liveData$default((kotlin.coroutines.g) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(kotlin.coroutines.g gVar, long j5, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            j5 = 5000;
        }
        return liveData(gVar, j5, pVar);
    }

    @l
    @RequiresApi(26)
    @u3.i
    public static final <T> LiveData<T> liveData(@l Duration timeout, @l kotlin.coroutines.g context, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(timeout, "timeout");
        l0.p(context, "context");
        l0.p(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, kotlin.coroutines.g gVar, p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        return liveData(duration, gVar, pVar);
    }
}
