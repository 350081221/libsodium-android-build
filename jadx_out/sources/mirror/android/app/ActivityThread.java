package mirror.android.app;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageManager;
import android.content.pm.ProviderInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.RefStaticInt;
import mirror.RefStaticMethod;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class ActivityThread {
    public static Class<?> TYPE = RefClass.load((Class<?>) ActivityThread.class, "android.app.ActivityThread");
    public static RefStaticObject<Boolean> USE_CACHE;
    public static RefStaticMethod<Object> currentActivityThread;
    public static RefMethod<IBinder> getApplicationThread;
    public static RefMethod<Handler> getHandler;
    public static RefMethod<Object> getLaunchingActivity;
    public static RefMethod<Object> getPackageInfoNoCheck;
    public static RefStaticMethod<IPackageManager> getPackageManager;
    public static RefMethod<String> getProcessName;
    public static RefMethod<Object> installProvider;
    public static RefObject<Map<IBinder, Object>> mActivities;
    public static RefObject<Object> mBoundApplication;
    public static RefObject<Handler> mH;
    public static RefObject<Application> mInitialApplication;
    public static RefObject<android.app.Instrumentation> mInstrumentation;
    public static RefObject<Map<String, WeakReference<?>>> mPackages;
    public static RefObject<Map> mProviderMap;
    public static RefObject<Map<String, WeakReference<?>>> mResourcePackages;

    @MethodParams({IBinder.class, List.class})
    public static RefMethod<Void> performNewIntents;
    public static RefStaticObject<IInterface> sPackageManager;
    public static RefStaticObject<IInterface> sPermissionManager;

    @MethodParams({IBinder.class, String.class, int.class, int.class, Intent.class})
    public static RefMethod<Void> sendActivityResult;

    /* loaded from: classes4.dex */
    public static class ActivityClientRecord {
        public static Class<?> TYPE = RefClass.load((Class<?>) ActivityClientRecord.class, "android.app.ActivityThread$ActivityClientRecord");
        public static RefObject<android.app.Activity> activity;
        public static RefObject<ActivityInfo> activityInfo;
        public static RefObject<Object> compatInfo;
        public static RefObject<Intent> intent;
        public static RefObject<Boolean> isTopResumedActivity;
        public static RefObject<Object> packageInfo;
        public static RefObject<IBinder> token;
    }

    /* loaded from: classes4.dex */
    public static class AppBindData {
        public static Class<?> TYPE = RefClass.load((Class<?>) AppBindData.class, "android.app.ActivityThread$AppBindData");
        public static RefObject<ApplicationInfo> appInfo;
        public static RefObject<Object> info;
        public static RefObject<ComponentName> instrumentationName;
        public static RefObject<String> processName;
        public static RefObject<List<ProviderInfo>> providers;
    }

    /* loaded from: classes4.dex */
    public static class H {
        public static RefStaticInt EXECUTE_TRANSACTION;
        public static RefStaticInt LAUNCH_ACTIVITY;
        public static RefStaticInt SCHEDULE_CRASH;
        public static Class<?> TYPE = RefClass.load((Class<?>) H.class, "android.app.ActivityThread$H");
    }

    /* loaded from: classes4.dex */
    public static class ProviderClientRecord {
        public static Class<?> TYPE = RefClass.load((Class<?>) ProviderClientRecord.class, "android.app.ActivityThread$ProviderClientRecord");

        @MethodReflectParams({"android.app.ActivityThread", "java.lang.String", "android.content.IContentProvider", "android.content.ContentProvider"})
        public static RefConstructor<?> ctor;
        public static RefObject<String> mName;
        public static RefObject<IInterface> mProvider;
    }

    /* loaded from: classes4.dex */
    public static class ProviderClientRecordJB {
        public static Class<?> TYPE = RefClass.load((Class<?>) ProviderClientRecordJB.class, "android.app.ActivityThread$ProviderClientRecord");
        public static RefObject<Object> mHolder;
        public static RefObject<IInterface> mProvider;
    }

    /* loaded from: classes4.dex */
    public static class ProviderKeyJBMR1 {
        public static Class<?> TYPE = RefClass.load((Class<?>) ProviderKeyJBMR1.class, "android.app.ActivityThread$ProviderKey");

        @MethodParams({String.class, int.class})
        public static RefConstructor<?> ctor;
    }

    public static void USE_CACHE(boolean z4) {
        RefStaticObject<Boolean> refStaticObject = USE_CACHE;
        if (refStaticObject != null) {
            refStaticObject.set(Boolean.valueOf(z4));
        }
    }

    public static void handleNewIntent(Object obj, List list) {
        Method declaredMethod;
        try {
            Object call = currentActivityThread.call(new Object[0]);
            if (call != null && (declaredMethod = call.getClass().getDeclaredMethod("handleNewIntent", obj.getClass(), List.class)) != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(call, obj, list);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static Object installProvider(Object obj, Context context, ProviderInfo providerInfo, Object obj2) throws Throwable {
        RefMethod<Object> refMethod = installProvider;
        Boolean bool = Boolean.TRUE;
        return refMethod.callWithException(obj, context, obj2, providerInfo, Boolean.FALSE, bool, bool);
    }
}
