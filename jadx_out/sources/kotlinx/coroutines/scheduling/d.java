package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import kotlin.i0;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.n0;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/scheduling/i;", "", "parallelism", "Lkotlinx/coroutines/n0;", "limitedParallelism", "Lkotlin/r2;", "I0", "()V", ILivePush.ClickType.CLOSE, "", "toString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class d extends i {

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    public static final d f20513g = new d();

    private d() {
        super(o.f20537c, o.f20538d, o.f20539e, o.f20535a);
    }

    public final void I0() {
        super.close();
    }

    @Override // kotlinx.coroutines.scheduling.i, kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    @a2
    public n0 limitedParallelism(int i5) {
        u.a(i5);
        if (i5 >= o.f20537c) {
            return this;
        }
        return super.limitedParallelism(i5);
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        return "Dispatchers.Default";
    }
}
