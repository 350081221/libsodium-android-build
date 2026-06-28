package com.lody.virtual.client.ipc;

import android.os.Binder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class LocalProxyUtils {

    /* renamed from: com.lody.virtual.client.ipc.LocalProxyUtils$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements InvocationHandler {
        final /* synthetic */ Object val$base;

        AnonymousClass1(Object obj) {
            this.val$base = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return method.invoke(this.val$base, objArr);
            } catch (Throwable th) {
                try {
                    if (th.getCause() == null) {
                        throw th;
                    }
                    throw th.getCause();
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T genProxy(Class<T> cls, Object obj) {
        return obj;
    }
}
