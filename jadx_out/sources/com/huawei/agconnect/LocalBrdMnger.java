package com.huawei.agconnect;

import a1.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public class LocalBrdMnger {
    private static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final Object M_LOCK = new Object();
    private static LocalBrdMnger mInstance;
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ReceiverRecord {
        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.receiver + " filter=" + this.filter + i.f138d;
        }
    }

    private LocalBrdMnger(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: com.huawei.agconnect.LocalBrdMnger.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    LocalBrdMnger.this.executePendingBroadcasts();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executePendingBroadcasts() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new BroadcastRecord[size];
                this.mPendingBroadcasts.toArray(broadcastRecordArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i5 = 0; i5 < size; i5++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i5];
                for (int i6 = 0; i6 < broadcastRecord.receivers.size(); i6++) {
                    broadcastRecord.receivers.get(i6).receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                }
            }
        }
    }

    public static LocalBrdMnger getInstance(Context context) {
        LocalBrdMnger localBrdMnger;
        synchronized (M_LOCK) {
            if (mInstance == null) {
                mInstance = new LocalBrdMnger(context.getApplicationContext());
            }
            localBrdMnger = mInstance;
        }
        return localBrdMnger;
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList<IntentFilter> arrayList = this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i5 = 0; i5 < intentFilter.countActions(); i5++) {
                String action = intentFilter.getAction(i5);
                ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public boolean sendBroadcast(Intent intent) {
        boolean z4;
        String str;
        String str2;
        int i5;
        ArrayList arrayList;
        Uri uri;
        boolean z5;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(intent.getAction());
            boolean z6 = false;
            if (arrayList2 != null) {
                ArrayList arrayList3 = null;
                int i6 = 0;
                while (i6 < arrayList2.size()) {
                    ReceiverRecord receiverRecord = arrayList2.get(i6);
                    if (receiverRecord.broadcasting) {
                        i5 = i6;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        uri = data;
                        arrayList = arrayList3;
                        z5 = z6;
                    } else {
                        str = action;
                        String str3 = resolveTypeIfNeeded;
                        str2 = resolveTypeIfNeeded;
                        i5 = i6;
                        Uri uri2 = data;
                        arrayList = arrayList3;
                        uri = data;
                        z5 = z6;
                        if (receiverRecord.filter.match(action, str3, scheme, uri2, categories, "LocalBroadcastManager") >= 0) {
                            arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList3.add(receiverRecord);
                            receiverRecord.broadcasting = true;
                            i6 = i5 + 1;
                            z6 = z5;
                            action = str;
                            resolveTypeIfNeeded = str2;
                            data = uri;
                        }
                    }
                    arrayList3 = arrayList;
                    i6 = i5 + 1;
                    z6 = z5;
                    action = str;
                    resolveTypeIfNeeded = str2;
                    data = uri;
                }
                ?? r11 = arrayList3;
                z4 = z6;
                if (r11 != 0) {
                    for (?? r9 = z4; r9 < r11.size(); r9++) {
                        ((ReceiverRecord) r11.get(r9)).broadcasting = z4;
                    }
                    this.mPendingBroadcasts.add(new BroadcastRecord(intent, r11));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z4 = false;
            }
            return z4;
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<IntentFilter> remove = this.mReceivers.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int i5 = 0; i5 < remove.size(); i5++) {
                IntentFilter intentFilter = remove.get(i5);
                for (int i6 = 0; i6 < intentFilter.countActions(); i6++) {
                    String action = intentFilter.getAction(i6);
                    ArrayList<ReceiverRecord> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            if (arrayList.get(i7).receiver == broadcastReceiver) {
                                arrayList.remove(i7);
                                i7--;
                            }
                            i7++;
                        }
                        if (arrayList.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }
}
