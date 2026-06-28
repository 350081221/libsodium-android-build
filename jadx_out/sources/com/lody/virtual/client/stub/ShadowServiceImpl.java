package com.lody.virtual.client.stub;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.service.VServiceRuntime;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.ServiceData;
import com.lody.virtual.server.IBinderProxyService;
import com.lody.virtual.server.secondary.FakeIdentityBinder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ShadowServiceImpl extends Service {
    private static final String TAG = "ShadowServiceImpl";
    private static final Map<String, IBindServiceProxy> sBinderServiceProxies;
    private final VServiceRuntime mRuntime = VServiceRuntime.getInstance();

    /* loaded from: classes3.dex */
    static class BinderProxy extends IBinderProxyService.Stub {
        private IBinder binder;
        private ComponentName component;

        public BinderProxy(ComponentName componentName, IBinder iBinder) {
            this.component = componentName;
            this.binder = iBinder;
        }

        @Override // com.lody.virtual.server.IBinderProxyService
        public ComponentName getComponent() {
            return this.component;
        }

        @Override // com.lody.virtual.server.IBinderProxyService
        public IBinder getService() {
            return this.binder;
        }
    }

    /* loaded from: classes3.dex */
    interface IBindServiceProxy {
        Binder createProxy(Binder binder);
    }

    static {
        HashMap hashMap = new HashMap();
        sBinderServiceProxies = hashMap;
        hashMap.put("android.accounts.IAccountAuthenticator", new IBindServiceProxy() { // from class: com.lody.virtual.client.stub.ShadowServiceImpl.1
            @Override // com.lody.virtual.client.stub.ShadowServiceImpl.IBindServiceProxy
            public Binder createProxy(Binder binder) {
                return new FakeIdentityBinder(binder, VEnvironment.SYSTEM_UID, Process.myPid());
            }
        });
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ServiceData.ServiceBindData serviceBindData = new ServiceData.ServiceBindData(intent);
        ClientConfig clientConfig = VClient.get().getClientConfig();
        if (clientConfig == null) {
            VLog.e(TAG, "restart service process: " + serviceBindData.info.processName);
            return null;
        }
        if (!serviceBindData.info.processName.equals(clientConfig.processName) || serviceBindData.intent == null || serviceBindData.userId != VUserHandle.myUserId() || serviceBindData.connection == null) {
            return null;
        }
        VServiceRuntime.ServiceRecord serviceRecord = this.mRuntime.getServiceRecord(serviceBindData.component, true);
        if (serviceRecord.proxyComponent == null) {
            serviceRecord.proxyComponent = IntentBuilder.getProxyComponentName(clientConfig);
        }
        if (serviceRecord.service == null) {
            if ((serviceBindData.flags & 1) == 0) {
                return null;
            }
            serviceRecord.service = VClient.get().createService(serviceBindData.info, serviceRecord);
        }
        serviceBindData.intent.setExtrasClassLoader(serviceRecord.service.getClassLoader());
        IBinder onBind = serviceRecord.onBind(serviceBindData.connection, serviceBindData.intent);
        if (onBind instanceof Binder) {
            try {
                String interfaceDescriptor = onBind.getInterfaceDescriptor();
                IBindServiceProxy iBindServiceProxy = sBinderServiceProxies.get(interfaceDescriptor);
                if (iBindServiceProxy != null) {
                    onBind = iBindServiceProxy.createProxy((Binder) onBind);
                    VLog.e("ServiceRuntime", "proxy binder " + interfaceDescriptor + " for service: " + serviceBindData.component);
                }
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
        return new BinderProxy(serviceBindData.component, onBind);
    }

    @Override // android.app.Service
    public void onCreate() {
        this.mRuntime.setShadowService(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mRuntime.setShadowService(null);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        String action;
        VServiceRuntime.ServiceRecord serviceRecord;
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if (action.equals("start_service")) {
            ServiceData.ServiceStartData serviceStartData = new ServiceData.ServiceStartData(intent);
            if (serviceStartData.intent == null) {
                VLog.e(TAG, "invalid start service intent: " + intent);
                return 2;
            }
            ClientConfig clientConfig = VClient.get().getClientConfig();
            if (clientConfig == null) {
                VLog.e(TAG, "restart service process: " + serviceStartData.info.processName);
                return 2;
            }
            if (!serviceStartData.info.processName.equals(clientConfig.processName) || serviceStartData.userId != VUserHandle.myUserId()) {
                return 2;
            }
            VServiceRuntime.ServiceRecord serviceRecord2 = this.mRuntime.getServiceRecord(serviceStartData.component, true);
            if (serviceRecord2.proxyComponent == null) {
                serviceRecord2.proxyComponent = IntentBuilder.getProxyComponentName(clientConfig);
            }
            if (serviceRecord2.service == null) {
                serviceRecord2.service = VClient.get().createService(serviceStartData.info, serviceRecord2);
            }
            serviceRecord2.lastActivityTime = SystemClock.uptimeMillis();
            serviceRecord2.started = true;
            serviceRecord2.startId++;
            serviceStartData.intent.setExtrasClassLoader(serviceRecord2.service.getClassLoader());
            ComponentUtils.unpackFillIn(serviceStartData.intent, serviceRecord2.service.getClassLoader());
            int onStartCommand = serviceRecord2.service.onStartCommand(serviceStartData.intent, i5, serviceRecord2.startId);
            if (onStartCommand == 1) {
                return 3;
            }
            return onStartCommand;
        }
        if (action.equals("stop_service")) {
            ServiceData.ServiceStopData serviceStopData = new ServiceData.ServiceStopData(intent);
            IBinder iBinder = serviceStopData.token;
            if (iBinder instanceof VServiceRuntime.ServiceRecord) {
                serviceRecord = (VServiceRuntime.ServiceRecord) iBinder;
            } else {
                serviceRecord = null;
            }
            if (serviceRecord == null) {
                serviceRecord = this.mRuntime.getServiceRecord(serviceStopData.component, false);
            }
            if (serviceRecord == null) {
                return 2;
            }
            serviceRecord.stopServiceIfNecessary(serviceStopData.startId, true);
            return 2;
        }
        throw new RuntimeException("unknown action: " + action);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        VServiceRuntime.ServiceRecord serviceRecord;
        Service service;
        ServiceData.ServiceBindData serviceBindData = new ServiceData.ServiceBindData(intent);
        if (serviceBindData.intent != null && serviceBindData.userId == VUserHandle.myUserId() && serviceBindData.connection != null && (serviceRecord = this.mRuntime.getServiceRecord(serviceBindData.component, false)) != null && (service = serviceRecord.service) != null) {
            serviceBindData.intent.setExtrasClassLoader(service.getClassLoader());
            serviceRecord.onUnbind(serviceBindData.connection, serviceBindData.intent);
        }
        return false;
    }
}
