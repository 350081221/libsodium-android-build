package com.lody.virtual.client.core;

import android.os.Build;
import android.os.StatsManagerServiceStub;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.instruments.InstrumentationVirtualApp;
import com.lody.virtual.client.hook.proxies.accessibility.AccessibilityManagerStub;
import com.lody.virtual.client.hook.proxies.account.AccountManagerStub;
import com.lody.virtual.client.hook.proxies.alarm.AlarmManagerStub;
import com.lody.virtual.client.hook.proxies.am.ActivityManagerStub;
import com.lody.virtual.client.hook.proxies.am.HCallbackStub;
import com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub;
import com.lody.virtual.client.hook.proxies.app.LocaleManagerStub;
import com.lody.virtual.client.hook.proxies.appops.AppOpsManagerStub;
import com.lody.virtual.client.hook.proxies.appops.FlymePermissionServiceStub;
import com.lody.virtual.client.hook.proxies.appops.SmtOpsManagerStub;
import com.lody.virtual.client.hook.proxies.appwidget.AppWidgetManagerStub;
import com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub;
import com.lody.virtual.client.hook.proxies.audio.AudioManagerStub;
import com.lody.virtual.client.hook.proxies.backup.BackupManagerStub;
import com.lody.virtual.client.hook.proxies.battery_stats.BatteryStatsHub;
import com.lody.virtual.client.hook.proxies.biometrics.AuthServiceStub;
import com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub;
import com.lody.virtual.client.hook.proxies.clipboard.ClipBoardStub;
import com.lody.virtual.client.hook.proxies.clipboard.SemClipBoardStub;
import com.lody.virtual.client.hook.proxies.companion.CompanionDeviceManagerStub;
import com.lody.virtual.client.hook.proxies.connectivity.ConnectivityStub;
import com.lody.virtual.client.hook.proxies.content.ContentServiceStub;
import com.lody.virtual.client.hook.proxies.content.integrity.AppIntegrityManagerStub;
import com.lody.virtual.client.hook.proxies.context_hub.ContextHubServiceStub;
import com.lody.virtual.client.hook.proxies.cross_profile.CrossProfileAppsStub;
import com.lody.virtual.client.hook.proxies.dev_identifiers_policy.DeviceIdentifiersPolicyServiceHub;
import com.lody.virtual.client.hook.proxies.device.DeviceIdleControllerStub;
import com.lody.virtual.client.hook.proxies.devicepolicy.DevicePolicyManagerStub;
import com.lody.virtual.client.hook.proxies.display.DisplayStub;
import com.lody.virtual.client.hook.proxies.dropbox.DropBoxManagerStub;
import com.lody.virtual.client.hook.proxies.fingerprint.FingerprintManagerStub;
import com.lody.virtual.client.hook.proxies.grammatical_inflection.GrammaticalInflectionManagerStub;
import com.lody.virtual.client.hook.proxies.graphics.GraphicsStatsStub;
import com.lody.virtual.client.hook.proxies.imms.MmsStub;
import com.lody.virtual.client.hook.proxies.input.InputMethodManagerStub;
import com.lody.virtual.client.hook.proxies.isms.ISmsStub;
import com.lody.virtual.client.hook.proxies.isub.ISubStub;
import com.lody.virtual.client.hook.proxies.job.JobServiceStub;
import com.lody.virtual.client.hook.proxies.libcore.LibCoreStub;
import com.lody.virtual.client.hook.proxies.location.LocationManagerStub;
import com.lody.virtual.client.hook.proxies.media.router.MediaRouterServiceStub;
import com.lody.virtual.client.hook.proxies.media.session.SessionManagerStub;
import com.lody.virtual.client.hook.proxies.mount.MountServiceStub;
import com.lody.virtual.client.hook.proxies.network.NetworkManagementStub;
import com.lody.virtual.client.hook.proxies.network.NetworkStatsServiceStub;
import com.lody.virtual.client.hook.proxies.network.TetheringConnectorStub;
import com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub;
import com.lody.virtual.client.hook.proxies.permissionchecker.PermissionCheckerManagerStub;
import com.lody.virtual.client.hook.proxies.permissionmgr.PermissionManagerStub;
import com.lody.virtual.client.hook.proxies.persistent_data_block.PersistentDataBlockServiceStub;
import com.lody.virtual.client.hook.proxies.phonesubinfo.PhoneSubInfoStub;
import com.lody.virtual.client.hook.proxies.pm.PackageManagerStub;
import com.lody.virtual.client.hook.proxies.power.PowerManagerStub;
import com.lody.virtual.client.hook.proxies.restriction.RestrictionStub;
import com.lody.virtual.client.hook.proxies.role.RoleManagerStub;
import com.lody.virtual.client.hook.proxies.safetycenter.SafetyCenterManagerStub;
import com.lody.virtual.client.hook.proxies.search.SearchManagerStub;
import com.lody.virtual.client.hook.proxies.shortcut.ShortcutServiceStub;
import com.lody.virtual.client.hook.proxies.slice.SliceManagerStub;
import com.lody.virtual.client.hook.proxies.system.LockSettingsStub;
import com.lody.virtual.client.hook.proxies.system.SystemUpdateStub;
import com.lody.virtual.client.hook.proxies.system.WifiScannerStub;
import com.lody.virtual.client.hook.proxies.telecom.TelecomManagerStub;
import com.lody.virtual.client.hook.proxies.telephony.HonorTelephonyStub;
import com.lody.virtual.client.hook.proxies.telephony.HwTelephonyStub;
import com.lody.virtual.client.hook.proxies.telephony.TelephonyRegistryStub;
import com.lody.virtual.client.hook.proxies.telephony.TelephonyStub;
import com.lody.virtual.client.hook.proxies.textservices.TextServicesManagerServiceStub;
import com.lody.virtual.client.hook.proxies.uri_grants.UriGrantsManagerStub;
import com.lody.virtual.client.hook.proxies.usage.UsageStatsManagerStub;
import com.lody.virtual.client.hook.proxies.user.UserManagerStub;
import com.lody.virtual.client.hook.proxies.vibrator.VibratorStub;
import com.lody.virtual.client.hook.proxies.view.AutoFillManagerStub;
import com.lody.virtual.client.hook.proxies.wallpaper.WallpaperManagerStub;
import com.lody.virtual.client.hook.proxies.wifi.WifiManagerStub;
import com.lody.virtual.client.hook.proxies.window.WindowManagerStub;
import com.lody.virtual.client.interfaces.IInjector;
import com.lody.virtual.helper.compat.BuildCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mirror.android.os.IDeviceIdleController;
import mirror.android.permission.IPermissionChecker;
import mirror.android.safetycenter.ISafetyCenterManager;
import mirror.com.android.internal.app.ISmtOpsService;
import mirror.com.android.internal.telephony.IHwTelephony;
import mirror.com.android.server.biometrics.IAuthService;
import mirror.oem.IFlymePermissionService;

/* loaded from: classes3.dex */
public final class InvocationStubManager {
    private static boolean sInit;
    private static InvocationStubManager sInstance = new InvocationStubManager();
    private final Map<Class<?>, IInjector> mInjectors = new HashMap(20);

    private InvocationStubManager() {
    }

    public static InvocationStubManager getInstance() {
        return sInstance;
    }

    private void injectInternal() throws Throwable {
        if (VirtualCore.get().isMainProcess()) {
            return;
        }
        if (VirtualCore.get().isServerProcess()) {
            addInjector(new ActivityManagerStub());
            return;
        }
        if (VirtualCore.get().isVAppProcess()) {
            addInjector(new LibCoreStub());
            addInjector(new ActivityManagerStub());
            addInjector(new PackageManagerStub());
            addInjector(HCallbackStub.getDefault());
            addInjector(new ISmsStub());
            addInjector(new ISubStub());
            addInjector(new DropBoxManagerStub());
            addInjector(new NotificationManagerStub());
            addInjector(new LocationManagerStub());
            addInjector(new WindowManagerStub());
            addInjector(new ClipBoardStub());
            addInjector(new SemClipBoardStub());
            addInjector(new MountServiceStub());
            addInjector(new BackupManagerStub());
            addInjector(new TelephonyStub());
            addInjector(new AccessibilityManagerStub());
            if (BuildCompat.isOreo() && IHwTelephony.TYPE != null) {
                addInjector(new HwTelephonyStub());
                addInjector(new HonorTelephonyStub());
            }
            addInjector(new TelephonyRegistryStub());
            addInjector(new PhoneSubInfoStub());
            addInjector(new PowerManagerStub());
            addInjector(new AppWidgetManagerStub());
            addInjector(new AccountManagerStub());
            addInjector(new AudioManagerStub());
            addInjector(new SearchManagerStub());
            addInjector(new ContentServiceStub());
            addInjector(new ConnectivityStub());
            addInjector(new BluetoothStub());
            addInjector(new VibratorStub());
            addInjector(new WifiManagerStub());
            addInjector(new ContextHubServiceStub());
            addInjector(new UserManagerStub());
            addInjector(new WallpaperManagerStub());
            addInjector(new DisplayStub());
            addInjector(new PersistentDataBlockServiceStub());
            addInjector(new InputMethodManagerStub());
            addInjector(new MmsStub());
            addInjector(new SessionManagerStub());
            addInjector(new JobServiceStub());
            addInjector(new RestrictionStub());
            addInjector(new TelecomManagerStub());
            addInjector(new NetworkStatsServiceStub());
            addInjector(new AlarmManagerStub());
            addInjector(new AppOpsManagerStub());
            addInjector(new MediaRouterServiceStub());
            if (ISmtOpsService.TYPE != null) {
                addInjector(new SmtOpsManagerStub());
            }
            int i5 = Build.VERSION.SDK_INT;
            addInjector(new GraphicsStatsStub());
            addInjector(new UsageStatsManagerStub());
            addInjector(new FingerprintManagerStub());
            addInjector(new NetworkManagementStub());
            addInjector(new WifiScannerStub());
            addInjector(new ShortcutServiceStub());
            addInjector(new DevicePolicyManagerStub());
            addInjector(new BatteryStatsHub());
            if (BuildCompat.isOreo() && !BuildCompat.isTiramisu()) {
                addInjector(new AutoFillManagerStub());
            }
            if (BuildCompat.isPie()) {
                addInjector(new SystemUpdateStub());
                addInjector(new LockSettingsStub());
                addInjector(new CrossProfileAppsStub());
                addInjector(new SliceManagerStub());
            }
            if (IFlymePermissionService.TYPE != null) {
                addInjector(new FlymePermissionServiceStub());
            }
            if (BuildCompat.isQ()) {
                addInjector(new ActivityTaskManagerStub());
                addInjector(new DeviceIdentifiersPolicyServiceHub());
                addInjector(new UriGrantsManagerStub());
                addInjector(new RoleManagerStub());
                addInjector(new TextServicesManagerServiceStub());
            }
            if (BuildCompat.isR()) {
                addInjector(new PermissionManagerStub());
                addInjector(new AppIntegrityManagerStub());
                addInjector(new StatsManagerServiceStub());
                addInjector(new TetheringConnectorStub());
            }
            if (BuildCompat.isS()) {
                addInjector(new ActivityClientControllerStub());
            }
            if (BuildCompat.isTiramisu()) {
                addInjector(new LocaleManagerStub());
            }
            if (IDeviceIdleController.TYPE != null) {
                addInjector(new DeviceIdleControllerStub());
            }
            if (IPermissionChecker.TYPE != null) {
                addInjector(new PermissionCheckerManagerStub());
            }
            if (ISafetyCenterManager.TYPE != null) {
                addInjector(new SafetyCenterManagerStub());
            }
            if (i5 >= 34) {
                addInjector(new GrammaticalInflectionManagerStub());
            }
            addInjector(new CompanionDeviceManagerStub());
            OemInjectManager.oemInject(this);
            if (IAuthService.TYPE != null) {
                addInjector(new AuthServiceStub());
            }
        }
    }

    public void addInjector(IInjector iInjector) {
        this.mInjectors.put(iInjector.getClass(), iInjector);
    }

    public void checkAllEnv() {
        for (IInjector iInjector : this.mInjectors.values()) {
            if (iInjector.isEnvBad()) {
                try {
                    iInjector.inject();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public <T extends IInjector> void checkEnv(Class<T> cls) {
        IInjector findInjector = findInjector(cls);
        if (findInjector != null && findInjector.isEnvBad()) {
            try {
                findInjector.inject();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public <T extends IInjector> T findInjector(Class<T> cls) {
        return (T) this.mInjectors.get(cls);
    }

    public <T extends IInjector, H extends MethodInvocationStub> H getInvocationStub(Class<T> cls) {
        IInjector findInjector = findInjector(cls);
        if (findInjector instanceof MethodInvocationProxy) {
            return (H) ((MethodInvocationProxy) findInjector).getInvocationStub();
        }
        return null;
    }

    public void init() throws Throwable {
        if (!isInit()) {
            injectInternal();
            sInit = true;
            return;
        }
        throw new IllegalStateException("InvocationStubManager Has been initialized.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void injectAll() throws Throwable {
        Iterator<IInjector> it = this.mInjectors.values().iterator();
        while (it.hasNext()) {
            it.next().inject();
        }
        if (VirtualCore.get().isVAppProcess()) {
            addInjector(InstrumentationVirtualApp.getDefault());
        }
    }

    public boolean isInit() {
        return sInit;
    }
}
