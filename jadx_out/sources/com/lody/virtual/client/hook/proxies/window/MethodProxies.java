package com.lody.virtual.client.hook.proxies.window;

import android.os.IInterface;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.proxies.window.session.WindowSessionPatch;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static abstract class BasePatchSession extends MethodProxy {
        BasePatchSession() {
        }

        private Object proxySession(IInterface iInterface) {
            return new WindowSessionPatch(iInterface).getInvocationStub().getProxyInterface();
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Object invoke = method.invoke(obj, objArr);
            if (invoke instanceof IInterface) {
                return proxySession((IInterface) invoke);
            }
            return invoke;
        }
    }

    /* loaded from: classes3.dex */
    static class OpenSession extends BasePatchSession {
        OpenSession() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "openSession";
        }
    }

    /* loaded from: classes3.dex */
    static class OverridePendingAppTransition extends BasePatchSession {
        OverridePendingAppTransition() {
        }

        @Override // com.lody.virtual.client.hook.proxies.window.MethodProxies.BasePatchSession, com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[0] instanceof String) {
                objArr[0] = MethodProxy.getHostPkg();
            }
            return super.call(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "overridePendingAppTransition";
        }
    }

    /* loaded from: classes3.dex */
    static class OverridePendingAppTransitionInPlace extends MethodProxy {
        OverridePendingAppTransitionInPlace() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr[0] instanceof String) {
                objArr[0] = MethodProxy.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "overridePendingAppTransitionInPlace";
        }
    }

    /* loaded from: classes3.dex */
    static class SetAppStartingWindow extends BasePatchSession {
        SetAppStartingWindow() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setAppStartingWindow";
        }
    }

    MethodProxies() {
    }
}
