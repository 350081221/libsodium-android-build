package com.lody.virtual.client.hook.instruments;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.lody.virtual.helper.MultiAvoidRecursive;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class InstrumentationProxy extends Instrumentation {
    private MultiAvoidRecursive avoidRecursive = new MultiAvoidRecursive(20);
    protected Instrumentation base;
    protected Instrumentation root;

    public InstrumentationProxy(Instrumentation instrumentation) {
        this.base = instrumentation;
        this.root = instrumentation;
    }

    private static Method findDeclaredMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.base.addMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        try {
            if (this.avoidRecursive.beginCall(4)) {
                this.base.callActivityOnCreate(activity, bundle);
            } else {
                this.root.callActivityOnCreate(activity, bundle);
            }
        } finally {
            this.avoidRecursive.finishCall(4);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(6)) {
                this.base.callActivityOnDestroy(activity);
            } else {
                this.root.callActivityOnDestroy(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(6);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        try {
            if (this.avoidRecursive.beginCall(11)) {
                this.base.callActivityOnNewIntent(activity, intent);
            } else {
                this.root.callActivityOnNewIntent(activity, intent);
            }
        } finally {
            this.avoidRecursive.finishCall(11);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(18)) {
                this.base.callActivityOnPause(activity);
            } else {
                this.root.callActivityOnPause(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(18);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(30)
    public void callActivityOnPictureInPictureRequested(Activity activity) {
        this.base.callActivityOnPictureInPictureRequested(activity);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        try {
            if (this.avoidRecursive.beginCall(9)) {
                this.base.callActivityOnPostCreate(activity, bundle);
            } else {
                this.root.callActivityOnPostCreate(activity, bundle);
            }
        } finally {
            this.avoidRecursive.finishCall(9);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(13)) {
                this.base.callActivityOnRestart(activity);
            } else {
                this.root.callActivityOnRestart(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(13);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        try {
            if (this.avoidRecursive.beginCall(7)) {
                this.base.callActivityOnRestoreInstanceState(activity, bundle);
            } else {
                this.root.callActivityOnRestoreInstanceState(activity, bundle);
            }
        } finally {
            this.avoidRecursive.finishCall(7);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(14)) {
                this.base.callActivityOnResume(activity);
            } else {
                this.root.callActivityOnResume(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(14);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        try {
            if (this.avoidRecursive.beginCall(16)) {
                this.base.callActivityOnSaveInstanceState(activity, bundle);
            } else {
                this.root.callActivityOnSaveInstanceState(activity, bundle);
            }
        } finally {
            this.avoidRecursive.finishCall(16);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(12)) {
                this.base.callActivityOnStart(activity);
            } else {
                this.root.callActivityOnStart(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(12);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(15)) {
                this.base.callActivityOnStop(activity);
            } else {
                this.root.callActivityOnStop(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(15);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        try {
            if (this.avoidRecursive.beginCall(19)) {
                this.base.callActivityOnUserLeaving(activity);
            } else {
                this.root.callActivityOnUserLeaving(activity);
            }
        } finally {
            this.avoidRecursive.finishCall(19);
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        try {
            if (this.avoidRecursive.beginCall(1)) {
                this.base.callApplicationOnCreate(application);
            } else {
                this.root.callApplicationOnCreate(application);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i5) {
        return this.base.checkMonitorHit(activityMonitor, i5);
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        this.base.endPerformanceSnapshot();
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i5, Bundle bundle) throws Throwable {
        int i6;
        Instrumentation.ActivityResult activityResult;
        try {
            try {
                try {
                } catch (InvocationTargetException e5) {
                    e = e5;
                    i6 = 20;
                }
                try {
                    if (this.avoidRecursive.beginCall(20)) {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.base, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5), bundle);
                    } else {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5), bundle);
                    }
                    return activityResult;
                } catch (InvocationTargetException e6) {
                    e = e6;
                    i6 = 20;
                    if (e.getCause() == null) {
                        this.avoidRecursive.finishCall(i6);
                        return null;
                    }
                    throw e.getCause();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                this.avoidRecursive.finishCall(20);
                return null;
            }
        } finally {
            this.avoidRecursive.finishCall(20);
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i5, Bundle bundle) {
        this.base.finish(i5, bundle);
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        return this.base.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        return this.base.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        return this.base.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        return this.base.getContext();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        return this.base.getTargetContext();
    }

    @Override // android.app.Instrumentation
    @TargetApi(18)
    public UiAutomation getUiAutomation() {
        return this.base.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i5, int i6) {
        return this.base.invokeContextMenuAction(activity, i5, i6);
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i5, int i6) {
        return this.base.invokeMenuActionSync(activity, i5, i6);
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        return this.base.isProfiling();
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        Activity newActivity;
        try {
            try {
                if (this.avoidRecursive.beginCall(2)) {
                    newActivity = this.base.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                } else {
                    newActivity = this.root.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
                }
            } finally {
                this.avoidRecursive.finishCall(2);
            }
        } catch (Throwable unused) {
            newActivity = this.root.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return newActivity;
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Application newApplication;
        try {
            if (this.avoidRecursive.beginCall(0)) {
                newApplication = this.base.newApplication(classLoader, str, context);
            } else {
                newApplication = this.root.newApplication(classLoader, str, context);
            }
            return newApplication;
        } finally {
            this.avoidRecursive.finishCall(0);
        }
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        this.base.onCreate(bundle);
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        this.base.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        return this.base.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        this.base.onStart();
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.base.removeMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        this.base.runOnMainSync(runnable);
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i5) {
        this.base.sendCharacterSync(i5);
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i5) {
        this.base.sendKeyDownUpSync(i5);
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        this.base.sendKeySync(keyEvent);
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        this.base.sendPointerSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i5, Bundle bundle) {
        this.base.sendStatus(i5, bundle);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        this.base.sendStringSync(str);
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        this.base.sendTrackballEventSync(motionEvent);
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        this.base.setAutomaticPerformanceSnapshots();
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z4) {
        this.base.setInTouchMode(z4);
    }

    @Override // android.app.Instrumentation
    public void start() {
        this.base.start();
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        return this.base.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        this.base.startPerformanceSnapshot();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        this.base.startProfiling();
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        this.base.stopProfiling();
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        this.base.waitForIdle(runnable);
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        this.base.waitForIdleSync();
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        return this.base.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j5) {
        return this.base.waitForMonitorWithTimeout(activityMonitor, j5);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z4) {
        return this.base.addMonitor(intentFilter, activityResult, z4);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z4) {
        return this.base.addMonitor(str, activityResult, z4);
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        try {
            if (this.avoidRecursive.beginCall(5)) {
                this.base.callActivityOnCreate(activity, bundle, persistableBundle);
            } else {
                this.root.callActivityOnCreate(activity, bundle, persistableBundle);
            }
        } finally {
            this.avoidRecursive.finishCall(5);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        try {
            if (this.avoidRecursive.beginCall(10)) {
                this.base.callActivityOnPostCreate(activity, bundle, persistableBundle);
            } else {
                this.root.callActivityOnPostCreate(activity, bundle, persistableBundle);
            }
        } finally {
            this.avoidRecursive.finishCall(10);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        try {
            if (this.avoidRecursive.beginCall(8)) {
                this.base.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
            } else {
                this.root.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
            }
        } finally {
            this.avoidRecursive.finishCall(8);
        }
    }

    @Override // android.app.Instrumentation
    @TargetApi(21)
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        try {
            if (this.avoidRecursive.beginCall(17)) {
                this.base.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
            } else {
                this.root.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
            }
        } finally {
            this.avoidRecursive.finishCall(17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Instrumentation] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            try {
                if (this.avoidRecursive.beginCall(3)) {
                    classLoader = this.base.newActivity(classLoader, str, intent);
                } else {
                    classLoader = this.root.newActivity(classLoader, str, intent);
                }
            } finally {
                this.avoidRecursive.finishCall(3);
            }
        } catch (Throwable unused) {
            classLoader = this.root.newActivity(classLoader, str, intent);
        }
        return classLoader;
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i5, Bundle bundle) throws Throwable {
        int i6;
        Instrumentation.ActivityResult activityResult;
        try {
            try {
                try {
                } catch (InvocationTargetException e5) {
                    e = e5;
                    i6 = 21;
                }
                try {
                    if (this.avoidRecursive.beginCall(21)) {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.base, context, iBinder, iBinder2, str, intent, Integer.valueOf(i5), bundle);
                    } else {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, str, intent, Integer.valueOf(i5), bundle);
                    }
                    return activityResult;
                } catch (InvocationTargetException e6) {
                    e = e6;
                    i6 = 21;
                    if (e.getCause() == null) {
                        this.avoidRecursive.finishCall(i6);
                        return null;
                    }
                    throw e.getCause();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                this.avoidRecursive.finishCall(21);
                return null;
            }
        } finally {
            this.avoidRecursive.finishCall(21);
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i5) throws Throwable {
        try {
            try {
                try {
                    Instrumentation.ActivityResult activityResult = this.avoidRecursive.beginCall(22) ? (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE).invoke(this.base, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i5)) : (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE).invoke(this.root, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i5));
                    this.avoidRecursive.finishCall(22);
                    return activityResult;
                } catch (InvocationTargetException e5) {
                    if (e5.getCause() == null) {
                        this.avoidRecursive.finishCall(22);
                        return null;
                    }
                    throw e5.getCause();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                this.avoidRecursive.finishCall(22);
                return null;
            }
        } catch (Throwable th) {
            this.avoidRecursive.finishCall(22);
            throw th;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i5) throws Throwable {
        try {
            try {
                try {
                    Instrumentation.ActivityResult activityResult = this.avoidRecursive.beginCall(23) ? (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE).invoke(this.base, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5)) : (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5));
                    this.avoidRecursive.finishCall(23);
                    return activityResult;
                } catch (InvocationTargetException e5) {
                    if (e5.getCause() == null) {
                        this.avoidRecursive.finishCall(23);
                        return null;
                    }
                    throw e5.getCause();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                this.avoidRecursive.finishCall(23);
                return null;
            }
        } catch (Throwable th) {
            this.avoidRecursive.finishCall(23);
            throw th;
        }
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i5, Bundle bundle) throws Throwable {
        int i6;
        Instrumentation.ActivityResult activityResult;
        try {
            try {
                try {
                } catch (InvocationTargetException e5) {
                    e = e5;
                    i6 = 24;
                }
                try {
                    if (this.avoidRecursive.beginCall(24)) {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.base, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i5), bundle);
                    } else {
                        activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.root, context, iBinder, iBinder2, fragment, intent, Integer.valueOf(i5), bundle);
                    }
                    return activityResult;
                } catch (InvocationTargetException e6) {
                    e = e6;
                    i6 = 24;
                    if (e.getCause() == null) {
                        this.avoidRecursive.finishCall(i6);
                        return null;
                    }
                    throw e.getCause();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                this.avoidRecursive.finishCall(24);
                return null;
            }
        } finally {
            this.avoidRecursive.finishCall(24);
        }
    }

    @TargetApi(17)
    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i5, Bundle bundle, UserHandle userHandle) throws Throwable {
        int i6;
        Instrumentation.ActivityResult activityResult;
        try {
            try {
                try {
                    try {
                        if (this.avoidRecursive.beginCall(25)) {
                            activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.base, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class, UserHandle.class).invoke(this.base, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5), bundle, userHandle);
                        } else {
                            activityResult = (Instrumentation.ActivityResult) findDeclaredMethod(this.root, "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class, UserHandle.class).invoke(this.root, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i5), bundle, userHandle);
                        }
                        return activityResult;
                    } catch (InvocationTargetException e5) {
                        e = e5;
                        i6 = 25;
                        if (e.getCause() == null) {
                            this.avoidRecursive.finishCall(i6);
                            return null;
                        }
                        throw e.getCause();
                    }
                } finally {
                    this.avoidRecursive.finishCall(25);
                }
            } catch (InvocationTargetException e6) {
                e = e6;
                i6 = 25;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            this.avoidRecursive.finishCall(25);
            return null;
        }
    }
}
