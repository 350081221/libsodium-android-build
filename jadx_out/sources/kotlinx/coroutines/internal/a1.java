package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;
import kotlinx.coroutines.n3;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlinx/coroutines/internal/a1;", "T", "Lkotlinx/coroutines/n3;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "updateThreadContext", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/r2;", "restoreThreadContext", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "minusKey", "Lkotlin/coroutines/g$b;", "E", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", bi.ay, "Ljava/lang/Object;", t0.b.f22420d, "Ljava/lang/ThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "threadLocal", "c", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class a1<T> implements n3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f20308a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final ThreadLocal<T> f20309b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final g.c<?> f20310c;

    public a1(T t5, @p4.l ThreadLocal<T> threadLocal) {
        this.f20308a = t5;
        this.f20309b = threadLocal;
        this.f20310c = new b1(threadLocal);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n3.a.a(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        if (!kotlin.jvm.internal.l0.g(getKey(), cVar)) {
            return null;
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.g.b
    @p4.l
    public g.c<?> getKey() {
        return this.f20310c;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return kotlin.jvm.internal.l0.g(getKey(), cVar) ? kotlin.coroutines.i.INSTANCE : this;
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return n3.a.d(this, gVar);
    }

    @Override // kotlinx.coroutines.n3
    public void restoreThreadContext(@p4.l kotlin.coroutines.g gVar, T t5) {
        this.f20309b.set(t5);
    }

    @p4.l
    public String toString() {
        return "ThreadLocal(value=" + this.f20308a + ", threadLocal = " + this.f20309b + ')';
    }

    @Override // kotlinx.coroutines.n3
    public T updateThreadContext(@p4.l kotlin.coroutines.g gVar) {
        T t5 = this.f20309b.get();
        this.f20309b.set(this.f20308a);
        return t5;
    }
}
