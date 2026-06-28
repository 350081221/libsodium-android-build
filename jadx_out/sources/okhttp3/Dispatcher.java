package okhttp3;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.c;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\rJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!R*\u0010#\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006>"}, d2 = {"Lokhttp3/Dispatcher;", "", "", c.f19042f, "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "findExistingCallWithHost", "", "promoteAndExecute", "T", "Ljava/util/Deque;", "calls", NotificationCompat.CATEGORY_CALL, "Lkotlin/r2;", "finished", "(Ljava/util/Deque;Ljava/lang/Object;)V", "enqueue$okhttp", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "enqueue", "cancelAll", "executed$okhttp", "(Lokhttp3/internal/connection/RealCall;)V", "executed", "finished$okhttp", "", "Lokhttp3/Call;", "queuedCalls", "runningCalls", "", "queuedCallsCount", "runningCallsCount", "Ljava/util/concurrent/ExecutorService;", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "runningSyncCalls", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Dispatcher {

    @m
    private ExecutorService executorServiceOrNull;

    @m
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;

    @l
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;

    @l
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;

    @l
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (l0.g(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (l0.g(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t5) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t5)) {
                runnable = this.idleCallback;
                r2 r2Var = r2.f19517a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i5;
        boolean z4;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            l0.o(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall asyncCall = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    asyncCall.getCallsPerHost().incrementAndGet();
                    l0.o(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.runningAsyncCalls.add(asyncCall);
                }
            }
            if (runningCallsCount() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            r2 r2Var = r2.f19517a;
        }
        int size = arrayList.size();
        for (i5 = 0; i5 < size; i5++) {
            ((RealCall.AsyncCall) arrayList.get(i5)).executeOn(executorService());
        }
        return z4;
    }

    @l
    @h(name = "-deprecated_executorService")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "executorService", imports = {}))
    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m6496deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(@l RealCall.AsyncCall call) {
        RealCall.AsyncCall findExistingCallWithHost;
        l0.p(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            r2 r2Var = r2.f19517a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(@l RealCall call) {
        l0.p(call, "call");
        this.runningSyncCalls.add(call);
    }

    @l
    @h(name = "executorService")
    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        l0.m(executorService);
        return executorService;
    }

    public final void finished$okhttp(@l RealCall.AsyncCall call) {
        l0.p(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    @m
    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    @l
    public final synchronized List<Call> queuedCalls() {
        int Y;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        Y = x.Y(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    @l
    public final synchronized List<Call> runningCalls() {
        int Y;
        List A4;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        Y = x.Y(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        A4 = e0.A4(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(A4);
        l0.o(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(@m Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i5) {
        boolean z4 = true;
        if (i5 < 1) {
            z4 = false;
        }
        if (z4) {
            synchronized (this) {
                this.maxRequests = i5;
                r2 r2Var = r2.f19517a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i5).toString());
    }

    public final void setMaxRequestsPerHost(int i5) {
        boolean z4 = true;
        if (i5 < 1) {
            z4 = false;
        }
        if (z4) {
            synchronized (this) {
                this.maxRequestsPerHost = i5;
                r2 r2Var = r2.f19517a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i5).toString());
    }

    public final void finished$okhttp(@l RealCall call) {
        l0.p(call, "call");
        finished(this.runningSyncCalls, call);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(@l ExecutorService executorService) {
        this();
        l0.p(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
