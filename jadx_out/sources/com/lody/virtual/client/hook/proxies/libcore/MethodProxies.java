package com.lody.virtual.client.hook.proxies.libcore;

import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import mirror.libcore.io.Os;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static class Fstat extends Stat {
        Fstat() {
        }

        @Override // com.lody.virtual.client.hook.proxies.libcore.MethodProxies.Stat, com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (obj2 != null) {
                Reflect on = Reflect.on(obj2);
                if (((Integer) on.get("st_uid")).intValue() == VirtualCore.get().myUid()) {
                    on.set("st_uid", Integer.valueOf(VClient.get().getVUid()));
                }
            }
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.proxies.libcore.MethodProxies.Stat, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "fstat";
        }
    }

    /* loaded from: classes3.dex */
    static class GetUid extends MethodProxy {
        GetUid() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            return Integer.valueOf(NativeEngine.onGetUid(((Integer) obj2).intValue()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getuid";
        }
    }

    /* loaded from: classes3.dex */
    static class Getpwnam extends MethodProxy {
        Getpwnam() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (obj2 != null) {
                Reflect on = Reflect.on(obj2);
                if (((Integer) on.get("pw_uid")).intValue() == VirtualCore.get().myUid()) {
                    on.set("pw_uid", Integer.valueOf(VClient.get().getVUid()));
                }
            }
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getpwnam";
        }
    }

    /* loaded from: classes3.dex */
    static class GetsockoptUcred extends MethodProxy {
        GetsockoptUcred() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (obj2 != null) {
                Reflect on = Reflect.on(obj2);
                if (((Integer) on.get("uid")).intValue() == VirtualCore.get().myUid()) {
                    on.set("uid", Integer.valueOf(MethodProxy.getBaseVUid()));
                }
            }
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getsockoptUcred";
        }
    }

    /* loaded from: classes3.dex */
    static class Lstat extends Stat {
        Lstat() {
        }

        @Override // com.lody.virtual.client.hook.proxies.libcore.MethodProxies.Stat, com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (obj2 != null) {
                Reflect on = Reflect.on(obj2);
                if (((Integer) on.get("st_uid")).intValue() == VirtualCore.get().myUid()) {
                    on.set("st_uid", Integer.valueOf(VClient.get().getVUid()));
                }
            }
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.proxies.libcore.MethodProxies.Stat, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "lstat";
        }
    }

    /* loaded from: classes3.dex */
    static class Stat extends MethodProxy {
        private static Field st_uid;

        static {
            try {
                Field declaredField = Os.TYPE.getMethod("stat", String.class).getReturnType().getDeclaredField("st_uid");
                st_uid = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }

        Stat() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
            if (((Integer) st_uid.get(obj2)).intValue() == VirtualCore.get().myUid()) {
                st_uid.set(obj2, Integer.valueOf(MethodProxy.getBaseVUid()));
            }
            return obj2;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "stat";
        }
    }

    MethodProxies() {
    }
}
