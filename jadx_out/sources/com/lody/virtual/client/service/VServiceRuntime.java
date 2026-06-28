package com.lody.virtual.client.service;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.SystemClock;
import com.lody.virtual.client.VClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class VServiceRuntime {
    private static final VServiceRuntime sInstance = new VServiceRuntime();
    private final Map<ComponentName, ServiceRecord> mComponentToServiceRecords = new HashMap();
    private RemoteCallbackList<IServiceConnection> mConnectionCallbackList = new RemoteCallbackList<IServiceConnection>() { // from class: com.lody.virtual.client.service.VServiceRuntime.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(final IServiceConnection iServiceConnection) {
            VServiceRuntime.this.mHandler.post(new Runnable() { // from class: com.lody.virtual.client.service.VServiceRuntime.1.1
                @Override // java.lang.Runnable
                public void run() {
                    VServiceRuntime.this.handleConnectionDied(iServiceConnection);
                }
            });
        }
    };
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private Service mShadowService;

    /* loaded from: classes3.dex */
    public enum RebindStatus {
        NotYetBound,
        Rebind,
        NotRebind
    }

    /* loaded from: classes3.dex */
    public static class ServiceBindRecord {
        public IBinder binder;
        public final Set<IBinder> connections = new HashSet();
        public Intent intent;
        public RebindStatus rebindStatus;

        public int getConnectionCount() {
            return this.connections.size();
        }
    }

    /* loaded from: classes3.dex */
    public class ServiceRecord extends Binder {
        public long activeSince;
        public final List<ServiceBindRecord> bindings = new ArrayList();
        public ComponentName component;
        public boolean foreground;
        public long lastActivityTime;
        public ComponentName proxyComponent;
        public Service service;
        public int startId;
        public boolean started;

        public ServiceRecord() {
        }

        public int getClientCount() {
            return this.bindings.size();
        }

        int getConnectionCount() {
            Iterator<ServiceBindRecord> it = this.bindings.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                i5 += it.next().getConnectionCount();
            }
            return i5;
        }

        public IBinder onBind(IServiceConnection iServiceConnection, Intent intent) {
            this.lastActivityTime = SystemClock.uptimeMillis();
            VServiceRuntime.this.mConnectionCallbackList.register(iServiceConnection);
            for (ServiceBindRecord serviceBindRecord : this.bindings) {
                if (serviceBindRecord.intent.filterEquals(intent)) {
                    if (serviceBindRecord.connections.isEmpty() && serviceBindRecord.rebindStatus == RebindStatus.Rebind) {
                        this.service.onRebind(intent);
                    }
                    serviceBindRecord.connections.add(iServiceConnection.asBinder());
                    return serviceBindRecord.binder;
                }
            }
            ServiceBindRecord serviceBindRecord2 = new ServiceBindRecord();
            serviceBindRecord2.intent = intent;
            serviceBindRecord2.connections.add(iServiceConnection.asBinder());
            serviceBindRecord2.binder = this.service.onBind(intent);
            this.bindings.add(serviceBindRecord2);
            return serviceBindRecord2.binder;
        }

        public void onUnbind(IServiceConnection iServiceConnection, Intent intent) {
            for (ServiceBindRecord serviceBindRecord : this.bindings) {
                if (serviceBindRecord.intent.filterEquals(intent)) {
                    if (serviceBindRecord.connections.remove(iServiceConnection.asBinder())) {
                        if (serviceBindRecord.connections.isEmpty()) {
                            RebindStatus rebindStatus = serviceBindRecord.rebindStatus;
                            RebindStatus rebindStatus2 = RebindStatus.NotRebind;
                            if (rebindStatus != rebindStatus2) {
                                if (this.service.onUnbind(intent)) {
                                    rebindStatus2 = RebindStatus.Rebind;
                                }
                                serviceBindRecord.rebindStatus = rebindStatus2;
                            }
                        }
                        stopServiceIfNecessary(-1, false);
                        return;
                    }
                    return;
                }
            }
        }

        public void stopServiceIfNecessary(int i5, boolean z4) {
            if (z4) {
                if (i5 != -1 && i5 != this.startId) {
                    return;
                } else {
                    this.started = false;
                }
            }
            if (this.service != null && !this.started && getConnectionCount() <= 0) {
                this.service.onDestroy();
                this.service = null;
                synchronized (VServiceRuntime.this.mComponentToServiceRecords) {
                    VServiceRuntime.this.mComponentToServiceRecords.remove(this.component);
                    if (VServiceRuntime.this.mComponentToServiceRecords.isEmpty()) {
                        VServiceRuntime.this.mShadowService.stopSelf();
                    }
                }
            }
        }
    }

    private VServiceRuntime() {
    }

    public static VServiceRuntime getInstance() {
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionDied(IServiceConnection iServiceConnection) {
        synchronized (this.mComponentToServiceRecords) {
            Iterator<ServiceRecord> it = this.mComponentToServiceRecords.values().iterator();
            while (it.hasNext()) {
                Iterator<ServiceBindRecord> it2 = it.next().bindings.iterator();
                while (it2.hasNext()) {
                    it2.next().connections.remove(iServiceConnection.asBinder());
                }
            }
            trimService();
        }
    }

    private void trimService() {
        synchronized (this.mComponentToServiceRecords) {
            for (ServiceRecord serviceRecord : this.mComponentToServiceRecords.values()) {
                if (serviceRecord.service != null && !serviceRecord.started && serviceRecord.getClientCount() <= 0 && serviceRecord.getConnectionCount() <= 0) {
                    serviceRecord.service.onDestroy();
                    serviceRecord.service = null;
                    this.mComponentToServiceRecords.remove(serviceRecord.component);
                }
            }
        }
    }

    public ServiceRecord getServiceRecord(ComponentName componentName, boolean z4) {
        ServiceRecord serviceRecord;
        synchronized (this.mComponentToServiceRecords) {
            serviceRecord = this.mComponentToServiceRecords.get(componentName);
            if (serviceRecord == null && z4) {
                serviceRecord = new ServiceRecord();
                serviceRecord.component = componentName;
                serviceRecord.lastActivityTime = SystemClock.uptimeMillis();
                serviceRecord.activeSince = SystemClock.elapsedRealtime();
                this.mComponentToServiceRecords.put(componentName, serviceRecord);
            }
        }
        return serviceRecord;
    }

    public List<ActivityManager.RunningServiceInfo> getServices() {
        ArrayList arrayList = new ArrayList(this.mComponentToServiceRecords.size());
        synchronized (this.mComponentToServiceRecords) {
            for (ServiceRecord serviceRecord : this.mComponentToServiceRecords.values()) {
                ActivityManager.RunningServiceInfo runningServiceInfo = new ActivityManager.RunningServiceInfo();
                runningServiceInfo.pid = Process.myPid();
                runningServiceInfo.uid = VClient.get().getVUid();
                runningServiceInfo.activeSince = serviceRecord.activeSince;
                runningServiceInfo.lastActivityTime = serviceRecord.lastActivityTime;
                runningServiceInfo.clientCount = serviceRecord.getClientCount();
                runningServiceInfo.service = serviceRecord.component;
                runningServiceInfo.started = serviceRecord.started;
                runningServiceInfo.process = VClient.get().getClientConfig().processName;
                arrayList.add(runningServiceInfo);
            }
        }
        return arrayList;
    }

    public Service getShadowService() {
        return this.mShadowService;
    }

    public void setShadowService(Service service) {
        this.mShadowService = service;
    }
}
