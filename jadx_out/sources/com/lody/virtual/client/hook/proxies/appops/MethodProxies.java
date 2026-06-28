package com.lody.virtual.client.hook.proxies.appops;

import android.annotation.TargetApi;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.Keep;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;

@Keep
@TargetApi(19)
/* loaded from: classes3.dex */
public class MethodProxies {
    public static Object checkAudioOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 3);
        return method.invoke(obj, objArr);
    }

    public static Object checkOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 2);
        return method.invoke(obj, objArr);
    }

    public static Object checkOperationRaw(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 2);
        return method.invoke(obj, objArr);
    }

    public static Object checkPackage(Object obj, Method method, Object[] objArr) throws Throwable {
        if (GmsSupport.isGoogleAppOrService((String) objArr[1])) {
            return 0;
        }
        replaceUidAndPackage(objArr, 1);
        return method.invoke(obj, objArr);
    }

    public static Object collectNoteOpCallsForValidation(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.replaceLastAppPkg(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object extractAsyncOps(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[0] = VirtualCore.get().getHostPkg();
        return method.invoke(obj, objArr);
    }

    public static Object finishOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 3);
        return method.invoke(obj, objArr);
    }

    public static Object finishProxyOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        if (BuildCompat.isS()) {
            MethodParameterUtils.fixAttributionSource(objArr);
            return method.invoke(obj, objArr);
        }
        return 0;
    }

    public static Object finishProxyOperationWithState(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.fixAttributionSourceState(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object getHistoricalOps(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 1);
        return method.invoke(obj, objArr);
    }

    public static Object getHistoricalOpsFromDiskRaw(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 1);
        return method.invoke(obj, objArr);
    }

    public static Object getOpsForPackage(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 1);
        return method.invoke(obj, objArr);
    }

    public static Object getPackagesForOps(Object obj, Method method, Object[] objArr) throws Throwable {
        return method.invoke(obj, objArr);
    }

    public static Object getUidOps(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[0] = Integer.valueOf(VirtualCore.get().myUid());
        return method.invoke(obj, objArr);
    }

    public static Object isOperationActive(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 2);
        return method.invoke(obj, objArr);
    }

    public static Object noteOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 2);
        return method.invoke(obj, objArr);
    }

    public static Object noteProxyOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        if (BuildCompat.isS()) {
            MethodParameterUtils.fixAttributionSource(objArr);
            return method.invoke(obj, objArr);
        }
        return 0;
    }

    public static Object noteProxyOperationWithState(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.fixAttributionSourceState(objArr);
        return method.invoke(obj, objArr);
    }

    private static void replaceUidAndPackage(Object[] objArr, int i5) {
        objArr[i5] = VirtualCore.get().getHostPkg();
        int i6 = i5 - 1;
        if (objArr[i6] instanceof Integer) {
            objArr[i6] = Integer.valueOf(VirtualCore.get().myUid());
        }
    }

    public static Object resetAllModes(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[0] = 0;
        objArr[1] = VirtualCore.get().getHostPkg();
        return method.invoke(obj, objArr);
    }

    public static Object resetPackageOpsNoHistory(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object setAudioRestriction(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[2] = Integer.valueOf(VirtualCore.get().myUid());
        return method.invoke(obj, objArr);
    }

    public static Object setMode(Object obj, Method method, Object[] objArr) throws Throwable {
        return null;
    }

    public static Object setUidMode(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[1] = Integer.valueOf(VirtualCore.get().myUid());
        return method.invoke(obj, objArr);
    }

    public static Object startOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        replaceUidAndPackage(objArr, 3);
        return method.invoke(obj, objArr);
    }

    public static Object startProxyOperation(Object obj, Method method, Object[] objArr) throws Throwable {
        if (BuildCompat.isS()) {
            MethodParameterUtils.fixAttributionSource(objArr);
            return method.invoke(obj, objArr);
        }
        return 0;
    }

    public static Object startProxyOperationWithState(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.fixAttributionSourceState(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object startWatchingAsyncNoted(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[0] = VirtualCore.get().getHostPkg();
        return method.invoke(obj, objArr);
    }

    public static Object startWatchingMode(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object startWatchingModeWithFlags(Object obj, Method method, Object[] objArr) throws Throwable {
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object stopWatchingAsyncNoted(Object obj, Method method, Object[] objArr) throws Throwable {
        objArr[0] = VirtualCore.get().getHostPkg();
        return method.invoke(obj, objArr);
    }
}
