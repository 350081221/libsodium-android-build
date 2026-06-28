package io.busniess.va.common;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatDelegate;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.helper.Keep;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.remote.InstalledAppInfo;
import io.busniess.va.delegate.DefaultCrashHandler;
import io.busniess.va.delegate.MyAppRequestListener;
import io.busniess.va.delegate.MyComponentDelegate;
import io.busniess.va.delegate.MyTaskDescDelegate;
import java.util.HashMap;
import jonathanfinerty.once.Once;

@Keep
/* loaded from: classes3.dex */
public class CommonApp {
    private static HashMap<String, Boolean> sUseRealLibMapCache;
    private SettingConfig mConfig = new SettingConfig() { // from class: io.busniess.va.common.CommonApp.1
        @Override // com.lody.virtual.client.core.SettingConfig
        public String getExtPackageName() {
            return "com.yqtech.multiapp.addon";
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public String getMainPackageName() {
            return "com.yqtech.multiapp";
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isAllowCreateShortcut() {
            return false;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isEnableIORedirect() {
            return true;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isEnableVirtualSdcardAndroidData() {
            return BuildCompat.isQ();
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isHostIntent(Intent intent) {
            String action = intent.getAction();
            String type = intent.getType();
            if ("android.intent.action.TTS_SERVICE".equals(action) || "vnd.android.cursor.dir/contact".equals(type)) {
                return true;
            }
            if (intent.getData() != null && "market".equals(intent.getData().getScheme())) {
                return true;
            }
            return false;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isOutsidePackage(String str) {
            return false;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isUnProtectAction(String str) {
            if (str.startsWith("VA_BroadcastTest_")) {
                return true;
            }
            return super.isUnProtectAction(str);
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isUseRealApkPath(String str, ApplicationInfo applicationInfo) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (CommonApp.sUseRealLibMapCache.containsKey(str)) {
                return ((Boolean) CommonApp.sUseRealLibMapCache.get(str)).booleanValue();
            }
            InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(str, 0);
            if (installedAppInfo != null && !installedAppInfo.dynamic && applicationInfo.metaData.keySet().contains("unity.launch-fullscreen")) {
                CommonApp.sUseRealLibMapCache.put(str, Boolean.TRUE);
                return true;
            }
            CommonApp.sUseRealLibMapCache.put(str, Boolean.FALSE);
            return false;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public boolean isUseRealDataDir(String str) {
            return true;
        }

        @Override // com.lody.virtual.client.core.SettingConfig
        public Intent onHandleLauncherIntent(Intent intent) {
            try {
                return VirtualCore.get().getPackageManager().getLaunchIntentForPackage(getMainPackageName());
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    };
    private BroadcastReceiver mGmsInitializeReceiver = new BroadcastReceiver() { // from class: io.busniess.va.common.CommonApp.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    };
    private VirtualCore virtualCore;

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        sUseRealLibMapCache = hashMap;
        Boolean bool = Boolean.TRUE;
        hashMap.put("com.seeyon.cmp", bool);
        sUseRealLibMapCache.put("com.momoklucky.worldsoccerchyccs", bool);
    }

    public void attachBaseContext(Context context) {
        VLog.OPEN_LOG = true;
        try {
            VirtualCore.get().startup(context, this.mConfig);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(final Application application) {
        VirtualCore virtualCore = VirtualCore.get();
        this.virtualCore = virtualCore;
        virtualCore.initialize(new VirtualCore.VirtualInitializer() { // from class: io.busniess.va.common.CommonApp.3
            @Override // com.lody.virtual.client.core.VirtualCore.VirtualInitializer
            public void onMainProcess() {
                AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
                Once.initialise(application);
                if (Build.VERSION.SDK_INT >= 33) {
                    application.registerReceiver(CommonApp.this.mGmsInitializeReceiver, new IntentFilter(Constants.ACTION_GMS_INITIALIZED), 2);
                } else {
                    application.registerReceiver(CommonApp.this.mGmsInitializeReceiver, new IntentFilter(Constants.ACTION_GMS_INITIALIZED));
                }
            }

            @Override // com.lody.virtual.client.core.VirtualCore.VirtualInitializer
            public void onServerProcess() {
            }

            @Override // com.lody.virtual.client.core.VirtualCore.VirtualInitializer
            @RequiresApi(api = 17)
            public void onVirtualProcess() {
                CommonApp.this.virtualCore.setCrashHandler(new DefaultCrashHandler());
                CommonApp.this.virtualCore.setAppCallback(new MyComponentDelegate());
                CommonApp.this.virtualCore.setTaskDescriptionDelegate(new MyTaskDescDelegate());
                CommonApp.this.virtualCore.setAppRequestListener(new MyAppRequestListener(application));
            }
        });
    }
}
