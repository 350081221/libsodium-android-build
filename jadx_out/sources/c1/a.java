package c1;

import a1.e;
import a1.n;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f692a = "CDT";

    /* renamed from: b, reason: collision with root package name */
    public static final int f693b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f694c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f695d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f696e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f697f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f698g;

    /* renamed from: h, reason: collision with root package name */
    public static ExecutorService f699h = Executors.newFixedThreadPool(16);

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0080a<T, R> {
        R a(T t5);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Pair<Boolean, ?> b(int i5, TimeUnit timeUnit, long j5) {
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f698g;
        if (concurrentHashMap == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Pair<Long, ?> pair = concurrentHashMap.get(Integer.valueOf(i5));
        if (pair == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Long l5 = (Long) pair.first;
        Object obj = pair.second;
        if (l5 != null && SystemClock.elapsedRealtime() - l5.longValue() <= TimeUnit.MILLISECONDS.convert(j5, timeUnit)) {
            return new Pair<>(Boolean.TRUE, obj);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static <T> T c(int i5, long j5, TimeUnit timeUnit, InterfaceC0080a<Object, Boolean> interfaceC0080a, Callable<T> callable, boolean z4, long j6, TimeUnit timeUnit2, y0.a aVar, boolean z5) {
        T call;
        try {
            Pair<Boolean, ?> b5 = b(i5, timeUnit, j5);
            if (((Boolean) b5.first).booleanValue() && interfaceC0080a.a(b5.second).booleanValue()) {
                e.i("getC", i5 + " got " + b5.second);
                return (T) b5.second;
            }
            if (z5 && n.d0()) {
                i0.a.i(aVar, i0.b.f16157l, "ch_get_main", "" + i5);
                e.i("getC", i5 + " skip");
                call = null;
            } else {
                if (z4) {
                    call = f699h.submit(callable).get(j6, timeUnit2);
                } else {
                    call = callable.call();
                }
                e(i5, call);
            }
            e.i("getC", i5 + " new " + call);
            return call;
        } catch (Throwable th) {
            e.c(f692a, "ch_get_e|" + i5, th);
            i0.a.e(aVar, i0.b.f16157l, "ch_get_e|" + i5, th);
            e.i("getC", i5 + " err");
            return null;
        }
    }

    public static synchronized void d() {
        synchronized (a.class) {
            f698g = null;
        }
    }

    public static synchronized void e(int i5, Object obj) {
        synchronized (a.class) {
            if (f698g == null) {
                f698g = new ConcurrentHashMap<>();
            }
            f698g.put(Integer.valueOf(i5), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        }
    }
}
