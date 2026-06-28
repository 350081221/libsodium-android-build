package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/d0;", "", "", "b", "", "toString", "", bi.ay, "Ljava/lang/Throwable;", "cause", "()Z", "handled", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f19950b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled");

    @u3.w
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final Throwable f19951a;

    public d0(@p4.l Throwable th, boolean z4) {
        this.f19951a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final boolean a() {
        if (f19950b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return f19950b.compareAndSet(this, 0, 1);
    }

    @p4.l
    public String toString() {
        return x0.a(this) + '[' + this.f19951a + ']';
    }

    public /* synthetic */ d0(Throwable th, boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this(th, (i5 & 2) != 0 ? false : z4);
    }
}
