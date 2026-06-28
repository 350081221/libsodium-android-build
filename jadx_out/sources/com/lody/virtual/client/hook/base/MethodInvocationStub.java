package com.lody.virtual.client.hook.base;

import android.text.TextUtils;
import com.lody.virtual.client.hook.annotations.LogInvocation;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.utils.VLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.k0;

/* loaded from: classes3.dex */
public class MethodInvocationStub<T> {
    private static final String TAG = "MethodInvocationStub";
    private T mBaseInterface;
    private MethodProxy mDefaultProxy;
    private Map<String, MethodProxy> mInternalMethodProxies;
    private LogInvocation.Condition mInvocationLoggingCondition;
    private T mProxyInterface;

    /* loaded from: classes3.dex */
    private class HookInvocationHandler implements InvocationHandler {
        private HookInvocationHandler() {
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object invoke(java.lang.Object r18, java.lang.reflect.Method r19, java.lang.Object[] r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 564
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.hook.base.MethodInvocationStub.HookInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    public MethodInvocationStub(T t5, Class<?>... clsArr) {
        this.mInternalMethodProxies = new HashMap();
        this.mInvocationLoggingCondition = LogInvocation.Condition.NEVER;
        this.mBaseInterface = t5;
        if (t5 != null) {
            this.mProxyInterface = (T) Proxy.newProxyInstance(t5.getClass().getClassLoader(), clsArr == null ? MethodParameterUtils.getAllInterface(t5.getClass()) : clsArr, new HookInvocationHandler());
        }
    }

    public static String argToString(Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb = new StringBuilder();
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                for (int i5 = 0; i5 < objArr.length; i5++) {
                    sb.append(objArr[i5]);
                    if (i5 != objArr.length - 1) {
                        sb.append(", ");
                    }
                }
            } else if (obj instanceof byte[]) {
                sb.append(Arrays.toString((byte[]) obj));
            } else if (obj instanceof char[]) {
                sb.append(Arrays.toString((char[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof int[]) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString((long[]) obj));
            }
            return sb.toString();
        }
        return String.valueOf(obj);
    }

    public static String argsToString(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length - 1;
        if (length == -1) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k0.f19768e);
        int i5 = 0;
        while (true) {
            sb.append(argToString(objArr[i5]));
            if (i5 == length) {
                sb.append(k0.f19769f);
                return sb.toString();
            }
            sb.append(", ");
            i5++;
        }
    }

    private void dumpMethodProxies() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("*********************");
        Iterator<MethodProxy> it = this.mInternalMethodProxies.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMethodName());
            sb.append("\n");
        }
        sb.append("*********************");
        VLog.e(TAG, sb.toString());
    }

    public MethodProxy addMethodProxy(MethodProxy methodProxy) {
        if (methodProxy != null && !TextUtils.isEmpty(methodProxy.getMethodName())) {
            if (this.mInternalMethodProxies.containsKey(methodProxy.getMethodName())) {
                VLog.w(TAG, "The Hook(%s, %s) you added has been in existence.", methodProxy.getMethodName(), methodProxy.getClass().getName());
                return methodProxy;
            }
            this.mInternalMethodProxies.put(methodProxy.getMethodName(), methodProxy);
        }
        return methodProxy;
    }

    public void copyMethodProxies(MethodInvocationStub methodInvocationStub) {
        this.mInternalMethodProxies.putAll(methodInvocationStub.getAllHooks());
    }

    public Map<String, MethodProxy> getAllHooks() {
        return this.mInternalMethodProxies;
    }

    public T getBaseInterface() {
        return this.mBaseInterface;
    }

    public LogInvocation.Condition getInvocationLoggingCondition() {
        return this.mInvocationLoggingCondition;
    }

    public int getMethodProxiesCount() {
        return this.mInternalMethodProxies.size();
    }

    public <H extends MethodProxy> H getMethodProxy(String str) {
        H h5 = (H) this.mInternalMethodProxies.get(str);
        if (h5 == null) {
            return (H) this.mDefaultProxy;
        }
        return h5;
    }

    public T getProxyInterface() {
        return this.mProxyInterface;
    }

    public void removeAllMethodProxies() {
        this.mInternalMethodProxies.clear();
    }

    public MethodProxy removeMethodProxy(String str) {
        return this.mInternalMethodProxies.remove(str);
    }

    public void setDefaultMethodProxy(MethodProxy methodProxy) {
        this.mDefaultProxy = methodProxy;
    }

    public void setInvocationLoggingCondition(LogInvocation.Condition condition) {
        this.mInvocationLoggingCondition = condition;
    }

    public void removeMethodProxy(MethodProxy methodProxy) {
        if (methodProxy != null) {
            removeMethodProxy(methodProxy.getMethodName());
        }
    }

    public MethodInvocationStub(T t5) {
        this(t5, null);
    }
}
