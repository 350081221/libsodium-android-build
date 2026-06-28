package com.lody.virtual.client.receiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.BroadcastIntentData;
import com.lody.virtual.remote.ReceiverInfo;
import java.util.HashMap;
import java.util.Map;
import mirror.android.content.BroadcastReceiver;

/* loaded from: classes3.dex */
public class StaticReceiverSystem {
    private static final int BROADCAST_TIME_OUT = 8500;
    private static final String TAG = "StaticReceiverSystem";
    private static final StaticReceiverSystem mSystem = new StaticReceiverSystem();
    private ApplicationInfo mApplicationInfo;
    private final Map<IBinder, BroadcastRecord> mBroadcastRecords = new HashMap();
    private Context mContext;
    private StaticScheduler mScheduler;
    private TimeoutHandler mTimeoutHandler;
    private int mUserId;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class BroadcastRecord {
        BroadcastReceiver.PendingResult pendingResult;
        ActivityInfo receiverInfo;

        BroadcastRecord(ActivityInfo activityInfo, BroadcastReceiver.PendingResult pendingResult) {
            this.receiverInfo = activityInfo;
            this.pendingResult = pendingResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class StaticReceiver extends BroadcastReceiver {
        private ActivityInfo info;

        public StaticReceiver(ActivityInfo activityInfo) {
            this.info = activityInfo;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ((intent.getFlags() & 1073741824) == 0 && !isInitialStickyBroadcast() && VClient.get() != null && VClient.get().getCurrentApplication() != null) {
                if (intent.getAction() != null && intent.getAction().startsWith("_VA_protected_")) {
                    return;
                }
                intent.setExtrasClassLoader(VClient.get().getCurrentApplication().getClassLoader());
                BroadcastIntentData broadcastIntentData = new BroadcastIntentData(intent);
                if (broadcastIntentData.intent == null) {
                    broadcastIntentData.intent = intent;
                    broadcastIntentData.targetPackage = intent.getPackage();
                    intent.setPackage(null);
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                if (goAsync != null && !StaticReceiverSystem.this.handleStaticBroadcast(broadcastIntentData, this.info, goAsync)) {
                    try {
                        goAsync.finish();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class StaticScheduler extends Handler {
        StaticScheduler(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class TimeoutHandler extends Handler {
        TimeoutHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BroadcastRecord broadcastRecord = (BroadcastRecord) StaticReceiverSystem.this.mBroadcastRecords.remove((IBinder) message.obj);
            if (broadcastRecord != null) {
                VLog.w(StaticReceiverSystem.TAG, "Broadcast timeout, cancel to dispatch it.", new Object[0]);
                try {
                    broadcastRecord.pendingResult.finish();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static StaticReceiverSystem get() {
        return mSystem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleStaticBroadcast(BroadcastIntentData broadcastIntentData, ActivityInfo activityInfo, BroadcastReceiver.PendingResult pendingResult) {
        String str = broadcastIntentData.targetPackage;
        if (str != null && !str.equals(activityInfo.packageName)) {
            return false;
        }
        int i5 = broadcastIntentData.userId;
        if (i5 != -1 && i5 != this.mUserId) {
            return false;
        }
        try {
            ComponentName componentName = ComponentUtils.toComponentName(activityInfo);
            BroadcastRecord broadcastRecord = new BroadcastRecord(activityInfo, pendingResult);
            IBinder iBinder = BroadcastReceiver.PendingResult.mToken.get(pendingResult);
            synchronized (this.mBroadcastRecords) {
                this.mBroadcastRecords.put(iBinder, broadcastRecord);
            }
            Message message = new Message();
            message.obj = iBinder;
            this.mTimeoutHandler.sendMessageDelayed(message, 8500L);
            VClient.get().scheduleReceiver(activityInfo.processName, componentName, broadcastIntentData.intent, pendingResult);
            return true;
        } catch (Exception e5) {
            VLog.e(TAG, e5);
            return false;
        }
    }

    public void attach(String str, Context context, ApplicationInfo applicationInfo, int i5) {
        if (this.mApplicationInfo == null) {
            this.mContext = context;
            this.mApplicationInfo = applicationInfo;
            this.mUserId = i5;
            HandlerThread handlerThread = new HandlerThread("BroadcastThread");
            HandlerThread handlerThread2 = new HandlerThread("BroadcastAnrThread");
            handlerThread.start();
            handlerThread2.start();
            this.mScheduler = new StaticScheduler(handlerThread.getLooper());
            this.mTimeoutHandler = new TimeoutHandler(handlerThread2.getLooper());
            for (ReceiverInfo receiverInfo : VPackageManager.get().getReceiverInfos(applicationInfo.packageName, str, i5)) {
                IntentFilter intentFilter = new IntentFilter(ComponentUtils.getComponentAction(receiverInfo.info));
                intentFilter.addCategory("__VA__|_static_receiver_");
                if (Build.VERSION.SDK_INT >= 33) {
                    this.mContext.registerReceiver(new StaticReceiver(receiverInfo.info), intentFilter, null, this.mScheduler, 2);
                } else {
                    this.mContext.registerReceiver(new StaticReceiver(receiverInfo.info), intentFilter, null, this.mScheduler);
                }
                for (IntentFilter intentFilter2 : receiverInfo.filters) {
                    SpecialComponentList.protectIntentFilter(intentFilter2);
                    intentFilter2.addCategory("__VA__|_static_receiver_");
                    if (Build.VERSION.SDK_INT >= 33) {
                        this.mContext.registerReceiver(new StaticReceiver(receiverInfo.info), intentFilter2, null, this.mScheduler, 2);
                    } else {
                        this.mContext.registerReceiver(new StaticReceiver(receiverInfo.info), intentFilter2, null, this.mScheduler);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("attached");
    }

    public boolean broadcastFinish(IBinder iBinder) {
        BroadcastRecord remove;
        synchronized (this.mBroadcastRecords) {
            remove = this.mBroadcastRecords.remove(iBinder);
        }
        if (remove == null) {
            return false;
        }
        this.mTimeoutHandler.removeMessages(0, iBinder);
        try {
            remove.pendingResult.finish();
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }
}
