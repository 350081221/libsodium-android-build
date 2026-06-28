package com.lody.virtual.client.hook.proxies.am;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub;
import com.lody.virtual.client.interfaces.IInjector;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.AvoidRecursive;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.ShadowActivityInfo;
import java.util.List;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.android.app.ActivityClient;
import mirror.android.app.ActivityManagerNative;
import mirror.android.app.ActivityThread;
import mirror.android.app.ClientTransactionHandler;
import mirror.android.app.IActivityManager;
import mirror.android.app.servertransaction.ClientTransaction;
import mirror.android.app.servertransaction.ClientTransactionItem;
import mirror.android.app.servertransaction.LaunchActivityItem;
import mirror.android.app.servertransaction.TopResumedActivityChangeItem;

/* loaded from: classes3.dex */
public class HCallbackStub implements Handler.Callback, IInjector {
    private static final int EXECUTE_TRANSACTION;
    private static final int LAUNCH_ACTIVITY;
    private static final int SCHEDULE_CRASH = ActivityThread.H.SCHEDULE_CRASH.get();
    private static final String TAG;
    private static final HCallbackStub sCallback;
    private final AvoidRecursive mAvoidRecurisve = new AvoidRecursive();
    private Handler.Callback otherCallback;

    static {
        int i5;
        int i6 = -1;
        if (BuildCompat.isPie()) {
            i5 = -1;
        } else {
            i5 = ActivityThread.H.LAUNCH_ACTIVITY.get();
        }
        LAUNCH_ACTIVITY = i5;
        if (BuildCompat.isPie()) {
            i6 = ActivityThread.H.EXECUTE_TRANSACTION.get();
        }
        EXECUTE_TRANSACTION = i6;
        TAG = HCallbackStub.class.getSimpleName();
        sCallback = new HCallbackStub();
    }

    private HCallbackStub() {
    }

    public static HCallbackStub getDefault() {
        return sCallback;
    }

    private static Handler getH() {
        return ActivityThread.mH.get(VirtualCore.mainThread());
    }

    private static Handler.Callback getHCallback() {
        try {
            return mirror.android.os.Handler.mCallback.get(getH());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private IBinder getTokenByClientTransaction(Object obj) {
        IBinder iBinder;
        List<Object> call;
        RefObject<IBinder> refObject = ClientTransaction.mActivityToken;
        if (refObject == null) {
            RefMethod<List<Object>> refMethod = ClientTransaction.getTransactionItems;
            if (refMethod != null && (call = refMethod.call(obj, new Object[0])) != null && !call.isEmpty()) {
                iBinder = ClientTransactionItem.getActivityToken.call(call.get(0), new Object[0]);
            } else {
                iBinder = null;
            }
            if (iBinder == null) {
                Object obj2 = ClientTransaction.mLifecycleStateRequest.get(obj);
                if (obj2 == null) {
                    List<Object> list = ClientTransaction.mActivityCallbacks.get(obj);
                    if (list != null && !list.isEmpty()) {
                        return ClientTransactionItem.getActivityToken.call(list.get(0), new Object[0]);
                    }
                    return iBinder;
                }
                return ClientTransactionItem.getActivityToken.call(obj2, new Object[0]);
            }
            return iBinder;
        }
        return refObject.get(obj);
    }

    private boolean handleExecuteTransaction(Message message) {
        Object obj;
        Object obj2 = message.obj;
        Object call = ClientTransactionHandler.getActivityClient.call(VirtualCore.mainThread(), getTokenByClientTransaction(obj2));
        List<Object> list = ClientTransaction.mActivityCallbacks.get(obj2);
        if (list == null || list.isEmpty() || (obj = list.get(0)) == null) {
            return true;
        }
        if (call == null) {
            if (obj.getClass() != LaunchActivityItem.TYPE) {
                return true;
            }
            return handleLaunchActivity(message, obj);
        }
        if (BuildCompat.isQ() && TopResumedActivityChangeItem.TYPE != null && obj.getClass() == TopResumedActivityChangeItem.TYPE) {
            if (TopResumedActivityChangeItem.mOnTop.get(obj) == ActivityThread.ActivityClientRecord.isTopResumedActivity.get(call)) {
                Log.e(TAG, "Activity top position already set to onTop=" + TopResumedActivityChangeItem.mOnTop.get(obj));
                return false;
            }
        }
        return true;
    }

    private boolean handleLaunchActivity(Message message, Object obj) {
        Intent intent;
        IBinder iBinder;
        RefObject<IInterface> refObject;
        RefMethod<Object> refMethod;
        Object call;
        if (BuildCompat.isPie()) {
            intent = LaunchActivityItem.mIntent.get(obj);
        } else {
            intent = ActivityThread.ActivityClientRecord.intent.get(obj);
        }
        ShadowActivityInfo shadowActivityInfo = new ShadowActivityInfo(intent);
        Intent intent2 = shadowActivityInfo.intent;
        if (intent2 == null) {
            return true;
        }
        if (BuildCompat.isPie()) {
            iBinder = getTokenByClientTransaction(message.obj);
        } else {
            iBinder = ActivityThread.ActivityClientRecord.token.get(obj);
        }
        ActivityInfo activityInfo = shadowActivityInfo.info;
        if (activityInfo == null) {
            return true;
        }
        if (VClient.get().getClientConfig() == null) {
            if (VirtualCore.get().getInstalledAppInfo(activityInfo.packageName, 0) == null) {
                return true;
            }
            VActivityManager.get().processRestarted(activityInfo.packageName, activityInfo.processName, shadowActivityInfo.userId);
            getH().sendMessageAtFrontOfQueue(Message.obtain(message));
            return false;
        }
        VClient.get().bindApplication(activityInfo.packageName, activityInfo.processName);
        VActivityManager.get().onActivityCreate(shadowActivityInfo.virtualToken, iBinder, IActivityManager.getTaskForActivity.call(ActivityManagerNative.getDefault.call(new Object[0]), iBinder, Boolean.FALSE).intValue());
        ComponentUtils.unpackFillIn(intent2, VClient.get().getClassLoader(activityInfo.applicationInfo));
        if (BuildCompat.isPie()) {
            if (BuildCompat.isS() && (refMethod = ActivityThread.getLaunchingActivity) != null && (call = refMethod.call(VirtualCore.mainThread(), iBinder)) != null) {
                Object call2 = ActivityThread.getPackageInfoNoCheck.call(VirtualCore.mainThread(), activityInfo.applicationInfo, ActivityThread.ActivityClientRecord.compatInfo.get(call));
                ActivityThread.ActivityClientRecord.intent.set(call, intent2);
                ActivityThread.ActivityClientRecord.activityInfo.set(call, activityInfo);
                ActivityThread.ActivityClientRecord.packageInfo.set(call, call2);
            }
            if (BuildCompat.isS() && (refObject = LaunchActivityItem.mActivityClientController) != null && refObject.get(obj) != null) {
                ActivityClient.ActivityClientControllerSingleton.mKnownInstance.set(ActivityClient.INTERFACE_SINGLETON.get(), ActivityClientControllerStub.getProxyInterface());
            }
            LaunchActivityItem.mIntent.set(obj, intent2);
            LaunchActivityItem.mInfo.set(obj, activityInfo);
        } else {
            ActivityThread.ActivityClientRecord.intent.set(obj, intent2);
            ActivityThread.ActivityClientRecord.activityInfo.set(obj, activityInfo);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (handleLaunchActivity(r5, r5.obj) == false) goto L8;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            com.lody.virtual.helper.AvoidRecursive r0 = r4.mAvoidRecurisve
            boolean r0 = r0.beginCall()
            r1 = 0
            if (r0 == 0) goto L75
            int r0 = com.lody.virtual.client.hook.proxies.am.HCallbackStub.LAUNCH_ACTIVITY     // Catch: java.lang.Throwable -> L6e
            int r2 = r5.what     // Catch: java.lang.Throwable -> L6e
            r3 = 1
            if (r0 != r2) goto L1e
            java.lang.Object r0 = r5.obj     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r4.handleLaunchActivity(r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L49
        L18:
            com.lody.virtual.helper.AvoidRecursive r5 = r4.mAvoidRecurisve
            r5.finishCall()
            return r3
        L1e:
            boolean r0 = com.lody.virtual.helper.compat.BuildCompat.isPie()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L31
            int r0 = com.lody.virtual.client.hook.proxies.am.HCallbackStub.EXECUTE_TRANSACTION     // Catch: java.lang.Throwable -> L6e
            int r2 = r5.what     // Catch: java.lang.Throwable -> L6e
            if (r0 != r2) goto L31
            boolean r0 = r4.handleExecuteTransaction(r5)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L49
            goto L18
        L31:
            int r0 = com.lody.virtual.client.hook.proxies.am.HCallbackStub.SCHEDULE_CRASH     // Catch: java.lang.Throwable -> L6e
            int r2 = r5.what     // Catch: java.lang.Throwable -> L6e
            if (r0 != r2) goto L49
            java.lang.Object r5 = r5.obj     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L6e
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6e
        L43:
            com.lody.virtual.helper.AvoidRecursive r5 = r4.mAvoidRecurisve
            r5.finishCall()
            return r1
        L49:
            android.os.Handler$Callback r0 = r4.otherCallback     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L68
            com.lody.virtual.client.VClient r0 = com.lody.virtual.client.VClient.get()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.getCurrentPackage()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = com.lody.virtual.oem.apps.VAppFix.isNeedCallVAppHCallback(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L5c
            goto L43
        L5c:
            android.os.Handler$Callback r0 = r4.otherCallback     // Catch: java.lang.Throwable -> L6e
            boolean r5 = r0.handleMessage(r5)     // Catch: java.lang.Throwable -> L6e
            com.lody.virtual.helper.AvoidRecursive r0 = r4.mAvoidRecurisve
            r0.finishCall()
            return r5
        L68:
            com.lody.virtual.helper.AvoidRecursive r5 = r4.mAvoidRecurisve
            r5.finishCall()
            goto L75
        L6e:
            r5 = move-exception
            com.lody.virtual.helper.AvoidRecursive r0 = r4.mAvoidRecurisve
            r0.finishCall()
            throw r5
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.hook.proxies.am.HCallbackStub.handleMessage(android.os.Message):boolean");
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public void inject() {
        this.otherCallback = getHCallback();
        mirror.android.os.Handler.mCallback.set(getH(), this);
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        boolean z4;
        Handler.Callback hCallback = getHCallback();
        if (hCallback != this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (hCallback != null && z4) {
            VLog.d(TAG, "HCallback has bad, other callback = " + hCallback, new Object[0]);
        }
        return z4;
    }
}
