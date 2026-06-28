package com.lody.virtual.client.hook.instruments;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.AppCallback;
import com.lody.virtual.client.core.InvocationStubManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ActivityFixer;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.proxies.am.HCallbackStub;
import com.lody.virtual.client.interfaces.IInjector;
import com.lody.virtual.helper.utils.VLog;
import java.lang.reflect.Field;
import mirror.android.app.ActivityThread;

/* loaded from: classes3.dex */
public class InstrumentationVirtualApp extends InstrumentationProxy implements IInjector {
    private static final String TAG = "InstrumentationVirtualApp";
    private static InstrumentationVirtualApp gDefault;

    public InstrumentationVirtualApp(Instrumentation instrumentation) {
        super(instrumentation);
    }

    private void checkActivityCallback() {
        InvocationStubManager.getInstance().checkEnv(HCallbackStub.class);
        InvocationStubManager.getInstance().checkEnv(InstrumentationVirtualApp.class);
    }

    private boolean checkIsEnvOk(Instrumentation instrumentation) {
        if (instrumentation instanceof InstrumentationVirtualApp) {
            return true;
        }
        Class<?> cls = instrumentation.getClass();
        if (Instrumentation.class.equals(cls)) {
            return false;
        }
        if (TextUtils.equals(VClient.get().getCurrentPackage(), "com.zhiliaoapp.musically") && Build.VERSION.SDK_INT == 26) {
            return false;
        }
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (Instrumentation.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        try {
                            if (field.get(instrumentation) instanceof InstrumentationVirtualApp) {
                                return true;
                            }
                        } catch (IllegalAccessException unused) {
                            return false;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!Instrumentation.class.equals(cls));
        return false;
    }

    private static InstrumentationVirtualApp create() {
        Instrumentation instrumentation = ActivityThread.mInstrumentation.get(VirtualCore.mainThread());
        if (instrumentation instanceof InstrumentationVirtualApp) {
            return (InstrumentationVirtualApp) instrumentation;
        }
        return new InstrumentationVirtualApp(instrumentation);
    }

    private void dynamicResolveConflict() {
        try {
            for (Field field : this.base.getClass().getDeclaredFields()) {
                if (field.getType().isAssignableFrom(Instrumentation.class)) {
                    VLog.e(TAG, "resolve conflict instrumentation: %s->%s", this.base.getClass().getName(), field.getName());
                    field.setAccessible(true);
                    field.set(this.base, this.root);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private AppCallback getAppCallback() {
        return VirtualCore.get().getAppCallback();
    }

    public static InstrumentationVirtualApp getDefault() {
        if (gDefault == null) {
            synchronized (InstrumentationVirtualApp.class) {
                if (gDefault == null) {
                    gDefault = create();
                }
            }
        }
        return gDefault;
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        checkActivityCallback();
        ActivityInfo activityInfo = mirror.android.app.Activity.mActivityInfo.get(activity);
        ContextFixer.fixContext(activity, activityInfo != null ? activityInfo.packageName : null);
        ActivityFixer.fixActivity(activity);
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnCreate(activity);
        super.callActivityOnCreate(activity, bundle);
        appCallback.afterActivityOnCreate(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnDestroy(activity);
        super.callActivityOnDestroy(activity);
        appCallback.afterActivityOnDestroy(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        checkActivityCallback();
        super.callActivityOnPause(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnResume(activity);
        super.callActivityOnResume(activity);
        appCallback.afterActivityOnResume(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        ActivityInfo activityInfo;
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnStart(activity);
        super.callActivityOnStart(activity);
        if (!VirtualCore.getConfig().disableSetScreenOrientation(activity.getPackageName()) && (activityInfo = mirror.android.app.Activity.mActivityInfo.get(activity)) != null && activityInfo.screenOrientation != -1 && activity.getRequestedOrientation() == -1) {
            activity.setRequestedOrientation(activityInfo.screenOrientation);
        }
        appCallback.afterActivityOnStart(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnStop(activity);
        super.callActivityOnStop(activity);
        appCallback.afterActivityOnStop(activity);
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        checkActivityCallback();
        super.callApplicationOnCreate(application);
    }

    public Instrumentation getBaseInstrumentation() {
        return this.base;
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        this.base = ActivityThread.mInstrumentation.get(VirtualCore.mainThread());
        ActivityThread.mInstrumentation.set(VirtualCore.mainThread(), this);
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return !checkIsEnvOk(ActivityThread.mInstrumentation.get(VirtualCore.mainThread()));
    }

    @Override // com.lody.virtual.client.hook.instruments.InstrumentationProxy, android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        checkActivityCallback();
        ActivityInfo activityInfo = mirror.android.app.Activity.mActivityInfo.get(activity);
        ContextFixer.fixContext(activity, activityInfo != null ? activityInfo.packageName : null);
        ActivityFixer.fixActivity(activity);
        AppCallback appCallback = getAppCallback();
        appCallback.beforeActivityOnCreate(activity);
        super.callActivityOnCreate(activity, bundle, persistableBundle);
        appCallback.afterActivityOnCreate(activity);
    }
}
