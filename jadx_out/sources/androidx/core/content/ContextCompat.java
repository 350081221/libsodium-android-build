package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.http.Headers;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.pro.bi;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public class ContextCompat {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        static Drawable getDrawable(Context context, int i5) {
            return context.getDrawable(i5);
        }

        @DoNotInline
        static File getNoBackupFilesDir(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi(23)
    /* loaded from: classes2.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static int getColor(Context context, int i5) {
            return context.getColor(i5);
        }

        @DoNotInline
        static <T> T getSystemService(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        static String getSystemServiceName(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(24)
    /* loaded from: classes2.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        static File getDataDir(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        static boolean isDeviceProtectedStorage(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static Intent registerReceiver(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i5) {
            Intent registerReceiver;
            if ((i5 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, ContextCompat.obtainAndCheckReceiverPermission(context), handler);
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i5 & 1);
            return registerReceiver;
        }

        @DoNotInline
        static ComponentName startForegroundService(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    @RequiresApi(28)
    /* loaded from: classes2.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Executor getMainExecutor(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    @RequiresApi(30)
    /* loaded from: classes2.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        @DoNotInline
        static Context createAttributionContext(@NonNull Context context, @Nullable String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        @DoNotInline
        static String getAttributionTag(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }

        @DoNotInline
        static Display getDisplayOrDefault(Context context) {
            Display display;
            try {
                display = context.getDisplay();
                return display;
            } catch (UnsupportedOperationException unused) {
                Log.w(ContextCompat.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(33)
    /* loaded from: classes2.dex */
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        static Intent registerReceiver(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i5) {
            Intent registerReceiver;
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i5);
            return registerReceiver;
        }
    }

    /* loaded from: classes2.dex */
    private static final class LegacyServiceMapHolder {
        static final HashMap<Class<?>, String> SERVICES;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            SERVICES = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, ServiceManagerNative.ACCOUNT);
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, Headers.LOCATION);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, ServiceManagerNative.NOTIFICATION);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, BaseConstants.MARKET_URI_AUTHORITY_SEARCH);
            hashMap.put(SensorManager.class, bi.ac);
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, HintConstants.AUTOFILL_HINT_PHONE);
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, NetworkUtil.NETWORK_TYPE_WIFI);
            hashMap.put(WindowManager.class, "window");
        }

        private LegacyServiceMapHolder() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface RegisterReceiverFlags {
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        ObjectsCompat.requireNonNull(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.createAttributionContext(context, str);
        }
        return context;
    }

    @Nullable
    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        return Api24Impl.createDeviceProtectedStorageContext(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    @Nullable
    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return Api21Impl.getCodeCacheDir(context);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @ColorRes int i5) {
        return Api23Impl.getColor(context, i5);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @ColorRes int i5) {
        return ResourcesCompat.getColorStateList(context.getResources(), i5, context.getTheme());
    }

    @NonNull
    public static Context getContextForLanguage(@NonNull Context context) {
        LocaleListCompat applicationLocales = LocaleManagerCompat.getApplicationLocales(context);
        if (Build.VERSION.SDK_INT <= 32 && !applicationLocales.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            ConfigurationCompat.setLocales(configuration, applicationLocales);
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    @Nullable
    public static File getDataDir(@NonNull Context context) {
        return Api24Impl.getDataDir(context);
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getDisplayOrDefault(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int i5) {
        return Api21Impl.getDrawable(context, i5);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, @Nullable String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getMainExecutor(context);
        }
        return ExecutorCompat.create(new Handler(context.getMainLooper()));
    }

    @Nullable
    public static File getNoBackupFilesDir(@NonNull Context context) {
        return Api21Impl.getNoBackupFilesDir(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context, int i5) {
        return getContextForLanguage(context).getString(i5);
    }

    @Nullable
    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) Api23Impl.getSystemService(context, cls);
    }

    @Nullable
    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return Api23Impl.getSystemServiceName(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        return Api24Impl.isDeviceProtectedStorage(context);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (PermissionChecker.checkSelfPermission(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i5) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i5);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i5) {
        int i6 = i5 & 1;
        if (i6 != 0 && (i5 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i6 != 0) {
            i5 |= 2;
        }
        int i7 = i5;
        int i8 = i7 & 2;
        if (i8 == 0 && (i7 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            return Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i7);
        }
        if (i9 >= 26) {
            return Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i7);
        }
        if ((i7 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
