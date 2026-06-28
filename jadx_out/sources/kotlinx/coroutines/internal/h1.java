package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/h1;", "Lkotlinx/coroutines/internal/j;", "Ljava/lang/Class;", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", bi.ay, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes4.dex */
final class h1 extends j {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final h1 f20360a = new h1();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final ReentrantReadWriteLock f20361b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final WeakHashMap<Class<? extends Throwable>, v3.l<Throwable, Throwable>> f20362c = new WeakHashMap<>();

    private h1() {
    }

    @Override // kotlinx.coroutines.internal.j
    @p4.l
    public v3.l<Throwable, Throwable> a(@p4.l Class<? extends Throwable> cls) {
        int i5;
        v3.l<Throwable, Throwable> b5;
        ReentrantReadWriteLock reentrantReadWriteLock = f20361b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            v3.l<Throwable, Throwable> lVar = f20362c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i6 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i5 = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i5 = 0;
            }
            for (int i7 = 0; i7 < i5; i7++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, v3.l<Throwable, Throwable>> weakHashMap = f20362c;
                v3.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                b5 = o.b(cls);
                weakHashMap.put(cls, b5);
                while (i6 < i5) {
                    readLock2.lock();
                    i6++;
                }
                writeLock.unlock();
                return b5;
            } finally {
                while (i6 < i5) {
                    readLock2.lock();
                    i6++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
