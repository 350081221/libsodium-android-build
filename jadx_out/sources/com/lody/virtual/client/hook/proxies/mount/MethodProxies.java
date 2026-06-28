package com.lody.virtual.client.hook.proxies.mount;

import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.io.File;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static class GetVolumeList extends MethodProxy {
        GetVolumeList() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean beforeCall(Object obj, Method method, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                if (objArr[0] instanceof Integer) {
                    if (BuildCompat.isTiramisu()) {
                        objArr[0] = Integer.valueOf(MethodProxy.getRealUserId());
                    } else {
                        objArr[0] = Integer.valueOf(MethodProxy.getRealUid());
                    }
                }
                MethodParameterUtils.replaceFirstAppPkg(objArr);
                return super.beforeCall(obj, method, objArr);
            }
            return super.beforeCall(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getVolumeList";
        }
    }

    /* loaded from: classes3.dex */
    static class Mkdirs extends MethodProxy {
        Mkdirs() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public boolean beforeCall(Object obj, Method method, Object... objArr) {
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return super.beforeCall(obj, method, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str;
            if (objArr.length == 1) {
                str = (String) objArr[0];
            } else {
                str = (String) objArr[1];
            }
            File file = new File(str);
            if (!file.exists() && !file.mkdirs()) {
                return -1;
            }
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "mkdirs";
        }
    }

    MethodProxies() {
    }
}
