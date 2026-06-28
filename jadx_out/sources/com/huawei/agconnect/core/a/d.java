package com.huawei.agconnect.core.a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.Service;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Service> f7811a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, Object> f7812b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<Class<?>, Service> f7813c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<Class<?>, Object> f7814d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<Service> list, Context context) {
        a(list, context);
    }

    private Object a(AGConnectInstance aGConnectInstance, Service service) {
        StringBuilder sb;
        if (service.getInstance() != null) {
            return service.getInstance();
        }
        Class<?> type = service.getType();
        if (type == null) {
            return null;
        }
        try {
            Constructor a5 = a(type, Context.class, AGConnectInstance.class);
            if (a5 != null) {
                return a5.newInstance(aGConnectInstance.getContext(), aGConnectInstance);
            }
            Constructor a6 = a(type, Context.class);
            return a6 != null ? a6.newInstance(aGConnectInstance.getContext()) : type.newInstance();
        } catch (IllegalAccessException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InstantiationException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            sb = new StringBuilder();
            sb.append("Instantiate service exception ");
            sb.append(e.getLocalizedMessage());
            Log.e("AGC_ServiceRepository", sb.toString());
            return null;
        }
    }

    private static Constructor a(Class cls, Class... clsArr) {
        boolean z4 = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i5 = 0; i5 < clsArr.length; i5++) {
                    z4 = parameterTypes[i5] == clsArr[i5];
                }
                if (z4) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private void a(String str, Exception exc) {
        Log.e("AGC_ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        StringBuilder sb = new StringBuilder();
        sb.append("cause message:");
        sb.append(exc.getCause() != null ? exc.getCause().getMessage() : "");
        Log.e("AGC_ServiceRepository", sb.toString());
    }

    public <T> T a(AGConnectInstance aGConnectInstance, Class<?> cls) {
        T t5;
        Service service = this.f7813c.get(cls);
        if (service == null && (service = f7811a.get(cls)) != null) {
            return (T) f7812b.get(cls);
        }
        if (service == null) {
            return null;
        }
        if (service.isSingleton() && (t5 = (T) this.f7814d.get(cls)) != null) {
            return t5;
        }
        T t6 = (T) a(aGConnectInstance, service);
        if (t6 != null && service.isSingleton()) {
            this.f7814d.put(cls, t6);
        }
        return t6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: InvocationTargetException -> 0x007d, InstantiationException -> 0x0081, IllegalAccessException -> 0x0085, TryCatch #2 {IllegalAccessException -> 0x0085, InstantiationException -> 0x0081, InvocationTargetException -> 0x007d, blocks: (B:23:0x0050, B:27:0x0062, B:28:0x0073, B:31:0x006b), top: B:22:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: InvocationTargetException -> 0x007d, InstantiationException -> 0x0081, IllegalAccessException -> 0x0085, TryCatch #2 {IllegalAccessException -> 0x0085, InstantiationException -> 0x0081, InvocationTargetException -> 0x007d, blocks: (B:23:0x0050, B:27:0x0062, B:28:0x0073, B:31:0x006b), top: B:22:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<com.huawei.agconnect.core.Service> r8, android.content.Context r9) {
        /*
            r7 = this;
            java.lang.String r0 = "addService start"
            java.lang.String r1 = "AGC_ServiceRepository"
            android.util.Log.d(r1, r0)
            if (r8 != 0) goto La
            return
        La:
            java.util.Iterator r8 = r8.iterator()
        Le:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r8.next()
            com.huawei.agconnect.core.Service r0 = (com.huawei.agconnect.core.Service) r0
            boolean r2 = r0.isSharedInstance()
            if (r2 == 0) goto L2f
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r2 = com.huawei.agconnect.core.a.d.f7811a
            java.lang.Class r3 = r0.getInterface()
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L38
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r2 = com.huawei.agconnect.core.a.d.f7811a
            goto L31
        L2f:
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r2 = r7.f7813c
        L31:
            java.lang.Class r3 = r0.getInterface()
            r2.put(r3, r0)
        L38:
            boolean r2 = r0.isAutoCreated()
            if (r2 == 0) goto Le
            java.lang.Class r2 = r0.getType()
            if (r2 == 0) goto Le
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = com.huawei.agconnect.core.a.d.f7812b
            java.lang.Class r3 = r0.getInterface()
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto Le
            java.lang.Class r2 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            java.lang.reflect.Constructor r2 = a(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            if (r2 == 0) goto L6b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            r3[r6] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            goto L73
        L6b:
            java.lang.Class r2 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
        L73:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = com.huawei.agconnect.core.a.d.f7812b     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            java.lang.Class r0 = r0.getInterface()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            r3.put(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.InstantiationException -> L81 java.lang.IllegalAccessException -> L85
            goto Le
        L7d:
            r0 = move-exception
            java.lang.String r2 = "TargetException"
            goto L88
        L81:
            r0 = move-exception
            java.lang.String r2 = "InstantiationException"
            goto L88
        L85:
            r0 = move-exception
            java.lang.String r2 = "AccessException"
        L88:
            r7.a(r2, r0)
            goto Le
        L8c:
            java.lang.String r8 = "addService end"
            android.util.Log.d(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.core.a.d.a(java.util.List, android.content.Context):void");
    }
}
