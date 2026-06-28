package com.lody.virtual.client.hook.proxies.phonesubinfo;

import android.text.TextUtils;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.remote.VDeviceConfig;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static class GetDeviceId extends ReplaceLastPkgMethodProxy {
        public GetDeviceId() {
            super("getDeviceId");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            VDeviceConfig deviceConfig = MethodProxy.getDeviceConfig();
            if (deviceConfig.enable) {
                String str = deviceConfig.deviceId;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            return super.call(obj, method, objArr);
        }
    }

    /* loaded from: classes3.dex */
    static class GetDeviceIdForPhone extends GetDeviceId {
        GetDeviceIdForPhone() {
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getDeviceIdForPhone";
        }
    }

    /* loaded from: classes3.dex */
    static class GetDeviceIdForSubscriber extends GetDeviceId {
        GetDeviceIdForSubscriber() {
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getDeviceIdForSubscriber";
        }
    }

    /* loaded from: classes3.dex */
    static class GetIccSerialNumber extends ReplaceLastPkgMethodProxy {
        public GetIccSerialNumber() {
            super("getIccSerialNumber");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.getDeviceConfig().enable) {
                String str = MethodProxy.getDeviceConfig().iccId;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            try {
                return super.call(obj, method, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    static class GetIccSerialNumberForSubscriber extends GetIccSerialNumber {
        GetIccSerialNumberForSubscriber() {
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getIccSerialNumberForSubscriber";
        }
    }

    /* loaded from: classes3.dex */
    static class GetImeiForSubscriber extends GetDeviceId {
        GetImeiForSubscriber() {
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getImeiForSubscriber";
        }
    }

    MethodProxies() {
    }
}
