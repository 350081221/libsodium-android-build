package com.lody.virtual.client.hook.proxies.input;

import android.view.inputmethod.EditorInfo;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.helper.utils.ArrayUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static class StartInput extends StartInputOrWindowGainedFocus {
        StartInput() {
        }

        @Override // com.lody.virtual.client.hook.proxies.input.MethodProxies.StartInputOrWindowGainedFocus, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startInput";
        }
    }

    /* loaded from: classes3.dex */
    static class StartInputOrWindowGainedFocus extends MethodProxy {
        StartInputOrWindowGainedFocus() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, EditorInfo.class);
            if (indexOfFirst != -1) {
                ((EditorInfo) objArr[indexOfFirst]).packageName = MethodProxy.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "startInputOrWindowGainedFocus";
        }
    }

    /* loaded from: classes3.dex */
    static class WindowGainedFocus extends StartInputOrWindowGainedFocus {
        WindowGainedFocus() {
        }

        @Override // com.lody.virtual.client.hook.proxies.input.MethodProxies.StartInputOrWindowGainedFocus, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "windowGainedFocus";
        }
    }

    MethodProxies() {
    }
}
