package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.g2;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0002X\u0082\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/b;", "T", "Lkotlinx/coroutines/internal/l0;", "", "decision", "d", "affected", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "Lkotlin/r2;", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "b", bi.ay, "()Lkotlinx/coroutines/internal/b;", "atomicOp", "Lkotlinx/atomicfu/AtomicRef;", "_consensus", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
@r1({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes4.dex */
public abstract class b<T> extends l0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20311a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");

    @u3.w
    @p4.m
    private volatile Object _consensus = a.f20306a;

    private final Object d(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20311a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f20306a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.l0
    @p4.l
    public b<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.l0
    @p4.m
    public final Object b(@p4.m Object obj) {
        Object obj2 = f20311a.get(this);
        if (obj2 == a.f20306a) {
            obj2 = d(e(obj));
        }
        c(obj, obj2);
        return obj2;
    }

    public abstract void c(T t5, @p4.m Object obj);

    @p4.m
    public abstract Object e(T t5);
}
