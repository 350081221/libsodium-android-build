package com.lody.virtual.remote;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.lody.virtual.helper.compat.BundleCompat;

/* loaded from: classes3.dex */
public class ServiceData {

    /* loaded from: classes3.dex */
    public static class ServiceStartData {
        public ComponentName component;
        public ServiceInfo info;
        public Intent intent;
        public int userId;

        public ServiceStartData(ComponentName componentName, ServiceInfo serviceInfo, Intent intent, int i5) {
            this.component = componentName;
            this.info = serviceInfo;
            this.intent = intent;
            this.userId = i5;
        }

        public void saveToIntent(Intent intent) {
            intent.setAction("start_service");
            intent.setType(this.component.flattenToString());
            intent.putExtra("info", this.info);
            intent.putExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.intent);
            intent.putExtra("user_id", this.userId);
        }

        public ServiceStartData(Intent intent) {
            Intent intent2;
            String type = intent.getType();
            if (type != null) {
                this.component = ComponentName.unflattenFromString(type);
            }
            this.info = (ServiceInfo) intent.getParcelableExtra("info");
            this.intent = (Intent) intent.getParcelableExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            this.userId = intent.getIntExtra("user_id", 0);
            if (this.info == null || (intent2 = this.intent) == null || this.component == null || intent2.getComponent() != null) {
                return;
            }
            this.intent.setComponent(this.component);
        }
    }

    /* loaded from: classes3.dex */
    public static class ServiceStopData {
        public ComponentName component;
        public int startId;
        public IBinder token;
        public int userId;

        public ServiceStopData(int i5, ComponentName componentName, int i6, IBinder iBinder) {
            this.userId = i5;
            this.component = componentName;
            this.startId = i6;
            this.token = iBinder;
        }

        public void saveToIntent(Intent intent) {
            intent.setAction("stop_service");
            intent.setType(this.component.flattenToString());
            intent.putExtra("user_id", this.userId);
            intent.putExtra("start_id", this.startId);
            BundleCompat.putBinder(intent, "token", this.token);
        }

        public ServiceStopData(Intent intent) {
            String type = intent.getType();
            if (type != null) {
                this.component = ComponentName.unflattenFromString(type);
            }
            this.userId = intent.getIntExtra("user_id", 0);
            this.startId = intent.getIntExtra("start_id", 0);
            this.token = BundleCompat.getBinder(intent, "token");
        }
    }

    /* loaded from: classes3.dex */
    public static class ServiceBindData {
        public ComponentName component;
        public IServiceConnection connection;
        public int flags;
        public ServiceInfo info;
        public Intent intent;
        public int userId;

        public ServiceBindData(ComponentName componentName, ServiceInfo serviceInfo, Intent intent, int i5, int i6, IServiceConnection iServiceConnection) {
            this.component = componentName;
            this.info = serviceInfo;
            this.intent = intent;
            this.flags = i5;
            this.userId = i6;
            this.connection = iServiceConnection;
        }

        public void saveToIntent(Intent intent) {
            intent.putExtra("info", this.info);
            intent.putExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.intent);
            intent.putExtra("flags", this.flags);
            intent.putExtra("user_id", this.userId);
            IServiceConnection iServiceConnection = this.connection;
            if (iServiceConnection != null) {
                BundleCompat.putBinder(intent, "conn", iServiceConnection.asBinder());
            }
        }

        public ServiceBindData(Intent intent) {
            ServiceInfo serviceInfo = (ServiceInfo) intent.getParcelableExtra("info");
            this.info = serviceInfo;
            if (serviceInfo != null) {
                ServiceInfo serviceInfo2 = this.info;
                this.component = new ComponentName(serviceInfo2.packageName, serviceInfo2.name);
            }
            this.intent = (Intent) intent.getParcelableExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            this.flags = intent.getIntExtra("flags", 0);
            this.userId = intent.getIntExtra("user_id", 0);
            IBinder binder = BundleCompat.getBinder(intent, "conn");
            if (binder != null) {
                this.connection = IServiceConnection.Stub.asInterface(binder);
            }
        }
    }
}
