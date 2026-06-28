package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Object> f2779a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f2780b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public byte f2781c = 0;

    /* renamed from: d, reason: collision with root package name */
    public AtomicInteger f2782d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public x f2783e;

    public z(x xVar) {
        this.f2783e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z4 = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f2779a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f2780b;
        threadLocal2.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.f2782d.incrementAndGet();
        try {
            if (this.f2781c == 0) {
                com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(incrementAndGet, value, objArr);
                if (threadLocal2.get() != null) {
                    eVar.a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new j(this.f2783e.a(), method, incrementAndGet, value, eVar.a(), z4).a();
                threadLocal2.set(null);
                Object a5 = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, bArr).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(a5);
                }
            }
            return threadLocal.get();
        } catch (RpcException e5) {
            e5.setOperationType(value);
            throw e5;
        }
    }
}
