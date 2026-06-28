package com.lody.virtual.client.hook.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.LocalPackageCache;
import com.lody.virtual.client.hook.annotations.LogInvocation;
import com.lody.virtual.client.ipc.VirtualLocationManager;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.VDeviceConfig;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class MethodProxy {
    private boolean enable = true;
    private LogInvocation.Condition mInvocationLoggingCondition;

    public MethodProxy() {
        this.mInvocationLoggingCondition = LogInvocation.Condition.NEVER;
        LogInvocation logInvocation = (LogInvocation) getClass().getAnnotation(LogInvocation.class);
        if (logInvocation != null) {
            this.mInvocationLoggingCondition = logInvocation.value();
        }
    }

    public static String getAppPkg() {
        return VClient.get().getCurrentPackage();
    }

    public static int getAppUserId() {
        return VUserHandle.getUserId(getVUid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int getBaseVUid() {
        return VClient.get().getBaseVUid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static SettingConfig getConfig() {
        return VirtualCore.getConfig();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static VDeviceConfig getDeviceConfig() {
        return VClient.get().getDeviceConfig();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Context getHostContext() {
        return VirtualCore.get().getContext();
    }

    public static String getHostPkg() {
        return VirtualCore.get().getHostPkg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int getRealUid() {
        return VirtualCore.get().myUid();
    }

    public static int getRealUserId() {
        return VUserHandle.realUserId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int getVUid() {
        return VClient.get().getVUid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isAppProcess() {
        return VirtualCore.get().isVAppProcess();
    }

    public static boolean isFakeLocationEnable() {
        return VirtualLocationManager.get().getMode(VUserHandle.myUserId(), VClient.get().getCurrentPackage()) != 0;
    }

    public static boolean isHostIntent(Intent intent) {
        if (VirtualCore.getConfig().isHostIntent(intent)) {
            return true;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            return isOutsidePackage(component.getPackageName());
        }
        return false;
    }

    public static boolean isInsidePackage(String str) {
        return VirtualCore.get().isAppInstalled(str);
    }

    protected static boolean isMainProcess() {
        return VirtualCore.get().isMainProcess();
    }

    public static boolean isOutsidePackage(String str) {
        return LocalPackageCache.isOutsideVisiblePackage(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isServerProcess() {
        return VirtualCore.get().isServerProcess();
    }

    public static void replaceFirstUserId(Object[] objArr) {
        if (getRealUserId() == 0) {
            return;
        }
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] == 0) {
                objArr[i5] = Integer.valueOf(getRealUserId());
                return;
            }
        }
    }

    public static void replaceLastUserId(Object[] objArr) {
        if (getRealUserId() == 0) {
            return;
        }
        for (int length = objArr.length - 1; length >= 0; length--) {
            if (objArr[length] == 0) {
                objArr[length] = Integer.valueOf(getRealUserId());
                return;
            }
        }
    }

    public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
        return obj2;
    }

    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        return true;
    }

    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
        return method.invoke(obj, objArr);
    }

    public long getIntOrLongValue(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    public LogInvocation.Condition getInvocationLoggingCondition() {
        return this.mInvocationLoggingCondition;
    }

    public abstract String getMethodName();

    /* JADX INFO: Access modifiers changed from: protected */
    public PackageManager getPM() {
        return VirtualCore.getPM();
    }

    public boolean isAppPkg(String str) {
        return VirtualCore.get().isAppInstalled(str);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isHostPkg(String str) {
        SettingConfig config = VirtualCore.getConfig();
        if (!str.equals(getConfig().getMainPackageName()) && !str.equals(config.getExtPackageName())) {
            return false;
        }
        return true;
    }

    public void setEnable(boolean z4) {
        this.enable = z4;
    }

    public void setInvocationloggingCondition(LogInvocation.Condition condition) {
        this.mInvocationLoggingCondition = condition;
    }

    public String toString() {
        return "Method : " + getMethodName();
    }
}
