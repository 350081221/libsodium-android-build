package com.bytedance.pangle;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Keep;
import com.bytedance.pangle.receiver.PluginBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Keep
/* loaded from: classes2.dex */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<PluginBroadcastReceiver, ArrayList<b>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<b>> mActions = new HashMap<>();
    private final ArrayList<a> mPendingBroadcasts = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f4243a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f4244b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f4243a = intent;
            this.f4244b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f4245a;

        /* renamed from: b, reason: collision with root package name */
        final PluginBroadcastReceiver f4246b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4247c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4248d;

        b(IntentFilter intentFilter, PluginBroadcastReceiver pluginBroadcastReceiver) {
            this.f4245a = intentFilter;
            this.f4246b = pluginBroadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f4246b);
            sb.append(" filter=");
            sb.append(this.f4245a);
            if (this.f4248d) {
                sb.append(" DEAD");
            }
            sb.append(a1.i.f138d);
            return sb.toString();
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: com.bytedance.pangle.LocalBroadcastManager.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    final void executePendingBroadcasts() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.mReceivers) {
                size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.mPendingBroadcasts.toArray(aVarArr);
                this.mPendingBroadcasts.clear();
            }
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = aVarArr[i5];
                int size2 = aVar.f4244b.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    b bVar = aVar.f4244b.get(i6);
                    if (!bVar.f4248d) {
                        bVar.f4246b.onReceive(this.mAppContext, aVar.f4243a);
                    }
                }
            }
        }
    }

    public final void registerReceiver(PluginBroadcastReceiver pluginBroadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            b bVar = new b(intentFilter, pluginBroadcastReceiver);
            ArrayList<b> arrayList = this.mReceivers.get(pluginBroadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.mReceivers.put(pluginBroadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i5 = 0; i5 < intentFilter.countActions(); i5++) {
                String action = intentFilter.getAction(i5);
                ArrayList<b> arrayList2 = this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public final boolean sendBroadcast(Intent intent) {
        boolean z4;
        int i5;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        String str3;
        synchronized (this.mReceivers) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Log.v(TAG, "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.mActions.get(intent.getAction());
            if (arrayList3 != null) {
                if (z4) {
                    Log.v(TAG, "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int i6 = 0;
                while (i6 < arrayList3.size()) {
                    b bVar = arrayList3.get(i6);
                    if (z4) {
                        Log.v(TAG, "Matching against filter " + bVar.f4245a);
                    }
                    if (bVar.f4247c) {
                        if (z4) {
                            Log.v(TAG, "  Filter's target already added");
                        }
                        i5 = i6;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i5 = i6;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = bVar.f4245a.match(action, resolveTypeIfNeeded, scheme, data, categories, TAG);
                        if (match >= 0) {
                            if (z4) {
                                Log.v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList;
                            }
                            arrayList4.add(bVar);
                            bVar.f4247c = true;
                            i6 = i5 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z4) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str3 = "unknown reason";
                                        } else {
                                            str3 = "type";
                                        }
                                    } else {
                                        str3 = "data";
                                    }
                                } else {
                                    str3 = "action";
                                }
                            } else {
                                str3 = "category";
                            }
                            Log.v(TAG, "  Filter did not match: ".concat(str3));
                        }
                    }
                    arrayList4 = arrayList;
                    i6 = i5 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                        ((b) arrayList5.get(i7)).f4247c = false;
                    }
                    this.mPendingBroadcasts.add(new a(intent, arrayList5));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public final void unregisterReceiver(PluginBroadcastReceiver pluginBroadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList<b> remove = this.mReceivers.remove(pluginBroadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                b bVar = remove.get(size);
                bVar.f4248d = true;
                for (int i5 = 0; i5 < bVar.f4245a.countActions(); i5++) {
                    String action = bVar.f4245a.getAction(i5);
                    ArrayList<b> arrayList = this.mActions.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            b bVar2 = arrayList.get(size2);
                            if (bVar2.f4246b == pluginBroadcastReceiver) {
                                bVar2.f4248d = true;
                                arrayList.remove(size2);
                            }
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
