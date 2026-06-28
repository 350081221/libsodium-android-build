package com.lody.virtual.client.hook.proxies.mount;

import android.app.usage.StorageStats;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.ParcelableException;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.lody.virtual.client.NativeEngine;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import mirror.RefStaticMethod;
import mirror.android.os.mount.IMountService;
import mirror.android.os.storage.IStorageManager;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class MountServiceStub extends BinderInvocationProxy {
    public MountServiceStub() {
        super(getInterfaceMethod(), "mount");
        try {
            Reflect.on((Class<?>) StorageManager.class).set("sStorageManager", getInvocationStub().getProxyInterface());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static RefStaticMethod<IInterface> getInterfaceMethod() {
        if (BuildCompat.isOreo()) {
            return IStorageManager.Stub.asInterface;
        }
        return IMountService.Stub.asInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StorageStats queryStatsForPackage(String str, int i5) {
        if (VPackageManager.get().getApplicationInfo(str, 0, i5) != null) {
            StorageStats newInstance = mirror.android.app.usage.StorageStats.ctor.newInstance();
            mirror.android.app.usage.StorageStats.cacheBytes.set(newInstance, 0L);
            mirror.android.app.usage.StorageStats.codeBytes.set(newInstance, 0L);
            mirror.android.app.usage.StorageStats.dataBytes.set(newInstance, 0L);
            return newInstance;
        }
        throw new ParcelableException(new PackageManager.NameNotFoundException(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("isQuotaSupported"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isReservedSupported"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getTotalBytes"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getFreeBytes"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCacheBytes"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("getCacheQuotaBytes"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryStatsForUid"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryStatsForUser"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryExternalStatsForUser"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryCratesForPackage"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryCratesForUid"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("queryCratesForUser"));
        addMethodProxy(new StaticMethodProxy("fixupAppDir") { // from class: com.lody.virtual.client.hook.proxies.mount.MountServiceStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                String str = (String) objArr[0];
                if (!TextUtils.isEmpty(str)) {
                    objArr[0] = NativeEngine.reverseRedirectedPath(str);
                }
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new StaticMethodProxy("queryStatsForPackage") { // from class: com.lody.virtual.client.hook.proxies.mount.MountServiceStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                int indexOfFirst = ArrayUtils.indexOfFirst(objArr, String.class);
                int indexOfLast = ArrayUtils.indexOfLast(objArr, Integer.class);
                if (indexOfFirst != -1 && indexOfLast != -1) {
                    return MountServiceStub.this.queryStatsForPackage((String) objArr[indexOfFirst], ((Integer) objArr[indexOfLast]).intValue());
                }
                MethodProxy.replaceLastUserId(objArr);
                return super.call(obj, method, objArr);
            }
        });
    }
}
