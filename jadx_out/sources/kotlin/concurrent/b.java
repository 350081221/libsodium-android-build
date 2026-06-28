package kotlin.concurrent;

import kotlin.i0;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", LogFactory.PRIORITY_KEY, "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@h(name = "ThreadsKt")
@r1({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/ThreadsKt$thread$thread$1", "Ljava/lang/Thread;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.a<r2> f19222a;

        a(v3.a<r2> aVar) {
            this.f19222a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f19222a.invoke();
        }
    }

    @f
    private static final <T> T a(ThreadLocal<T> threadLocal, v3.a<? extends T> aVar) {
        l0.p(threadLocal, "<this>");
        l0.p(aVar, "default");
        T t5 = threadLocal.get();
        if (t5 == null) {
            T invoke = aVar.invoke();
            threadLocal.set(invoke);
            return invoke;
        }
        return t5;
    }

    @l
    public static final Thread b(boolean z4, boolean z5, @m ClassLoader classLoader, @m String str, int i5, @l v3.a<r2> block) {
        l0.p(block, "block");
        a aVar = new a(block);
        if (z5) {
            aVar.setDaemon(true);
        }
        if (i5 > 0) {
            aVar.setPriority(i5);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z4) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z4, boolean z5, ClassLoader classLoader, String str, int i5, v3.a aVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        ClassLoader classLoader2 = (i6 & 4) != 0 ? null : classLoader;
        String str2 = (i6 & 8) != 0 ? null : str;
        if ((i6 & 16) != 0) {
            i5 = -1;
        }
        return b(z6, z7, classLoader2, str2, i5, aVar);
    }
}
