package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0002H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/d;", "", "Lkotlin/r2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "release", "", bi.ay, "()I", "availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface d {
    int a();

    boolean b();

    @m
    Object e(@l kotlin.coroutines.d<? super r2> dVar);

    void release();
}
