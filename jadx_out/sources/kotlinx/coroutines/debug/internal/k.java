package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.bi;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.i0;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/debug/internal/k;", "T", "Ljava/lang/ref/WeakReference;", "", bi.ay, "I", "hash", "ref", "Ljava/lang/ref/ReferenceQueue;", "queue", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class k<T> extends WeakReference<T> {

    /* renamed from: a, reason: collision with root package name */
    @u3.e
    public final int f20009a;

    public k(T t5, @p4.m ReferenceQueue<T> referenceQueue) {
        super(t5, referenceQueue);
        int i5;
        if (t5 != null) {
            i5 = t5.hashCode();
        } else {
            i5 = 0;
        }
        this.f20009a = i5;
    }
}
