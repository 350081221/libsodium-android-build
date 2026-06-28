package com.lody.virtual.client.hook.proxies.content;

import android.content.pm.ProviderInfo;
import android.database.IContentObserver;
import android.net.Uri;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.ipc.VContentManager;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.Keep;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;

@Keep
/* loaded from: classes3.dex */
public class MethodProxies {
    private static boolean isAppUri(Uri uri) {
        ProviderInfo resolveContentProvider = VPackageManager.get().resolveContentProvider(uri.getAuthority(), 0, VUserHandle.myUserId());
        if (resolveContentProvider == null || !resolveContentProvider.enabled) {
            return false;
        }
        return true;
    }

    public static Object notifyChange(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr.length >= 6) {
            objArr[5] = 22;
        }
        boolean z4 = true;
        IContentObserver iContentObserver = (IContentObserver) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        Object obj2 = objArr[3];
        if (obj2 instanceof Integer) {
            if ((((Integer) obj2).intValue() & 1) == 0) {
                z4 = false;
            }
        } else {
            z4 = ((Boolean) obj2).booleanValue();
        }
        if (BuildCompat.isR()) {
            MethodProxy.replaceLastUserId(objArr);
            for (Uri uri : (Uri[]) objArr[0]) {
                if (isAppUri(uri)) {
                    VContentManager.get().notifyChange(uri, iContentObserver, booleanValue, z4, VUserHandle.myUserId());
                } else {
                    method.invoke(obj, objArr);
                }
            }
            return 0;
        }
        Uri uri2 = (Uri) objArr[0];
        if (isAppUri(uri2)) {
            VContentManager.get().notifyChange(uri2, iContentObserver, booleanValue, z4, VUserHandle.myUserId());
            return 0;
        }
        MethodProxy.replaceLastUserId(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object registerContentObserver(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr.length >= 5) {
            objArr[4] = 22;
        }
        Uri uri = (Uri) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        IContentObserver iContentObserver = (IContentObserver) objArr[2];
        if (isAppUri(uri)) {
            VContentManager.get().registerContentObserver(uri, booleanValue, iContentObserver, VUserHandle.myUserId());
            return 0;
        }
        MethodProxy.replaceFirstUserId(objArr);
        return method.invoke(obj, objArr);
    }

    public static Object unregisterContentObserver(Object obj, Method method, Object[] objArr) throws Throwable {
        VContentManager.get().unregisterContentObserver((IContentObserver) objArr[0]);
        return method.invoke(obj, objArr);
    }
}
