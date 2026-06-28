package com.lody.virtual.client.env;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.SharedLibraryInfo;
import com.lody.virtual.BuildConfig;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.BroadcastIntentData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mirror.android.content.IntentFilterU;

/* loaded from: classes3.dex */
public final class SpecialComponentList {
    private static final List<String> ACTION_BLACK_LIST;
    private static final HashSet<String> BROADCAST_START_WHITE_LIST;
    private static final HashSet<String> INSTRUMENTATION_CONFLICTING;
    private static final Set<String> PRE_INSTALL_PACKAGES;
    private static final Map<String, String> PROTECTED_ACTION_MAP;
    private static final String PROTECT_ACTION_PREFIX = "_VA_protected_";
    private static final HashSet<String> SPEC_SYSTEM_APP_LIST;
    public static final Set<String> SYSTEM_BROADCAST_ACTION;
    private static final HashSet<String> WHITE_PERMISSION;
    private static final List<ComponentName> GMS_BLOCK_COMPONENT = Arrays.asList(new ComponentName(GmsSupport.GMS_PKG, "com.google.android.gms.update.SystemUpdateService"), new ComponentName(GmsSupport.GSF_PKG, "com.google.android.gsf.update.SystemUpdateService"));
    private static final List<String> GMS_BLOCK_ACTION_LIST = Arrays.asList("com.google.android.gms.update.START_SERVICE");

    static {
        ArrayList arrayList = new ArrayList(2);
        ACTION_BLACK_LIST = arrayList;
        HashMap hashMap = new HashMap(5);
        PROTECTED_ACTION_MAP = hashMap;
        HashSet<String> hashSet = new HashSet<>(3);
        WHITE_PERMISSION = hashSet;
        BROADCAST_START_WHITE_LIST = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>(2);
        INSTRUMENTATION_CONFLICTING = hashSet2;
        HashSet<String> hashSet3 = new HashSet<>(3);
        SPEC_SYSTEM_APP_LIST = hashSet3;
        HashSet hashSet4 = new HashSet(7);
        SYSTEM_BROADCAST_ACTION = hashSet4;
        HashSet hashSet5 = new HashSet(7);
        PRE_INSTALL_PACKAGES = hashSet5;
        hashSet4.add("android.intent.action.SCREEN_ON");
        hashSet4.add("android.intent.action.SCREEN_OFF");
        hashSet4.add("android.intent.action.NEW_OUTGOING_CALL");
        hashSet4.add("android.intent.action.TIME_TICK");
        hashSet4.add("android.intent.action.TIME_SET");
        hashSet4.add("android.intent.action.TIMEZONE_CHANGED");
        hashSet4.add("android.intent.action.BATTERY_CHANGED");
        hashSet4.add("android.intent.action.BATTERY_LOW");
        hashSet4.add("android.intent.action.BATTERY_OKAY");
        hashSet4.add("android.intent.action.ACTION_POWER_CONNECTED");
        hashSet4.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        hashSet4.add("android.intent.action.USER_PRESENT");
        hashSet4.add("android.provider.Telephony.SMS_RECEIVED");
        hashSet4.add("android.provider.Telephony.SMS_DELIVER");
        hashSet4.add("android.net.wifi.STATE_CHANGE");
        hashSet4.add("android.net.wifi.SCAN_RESULTS");
        hashSet4.add("android.net.wifi.WIFI_STATE_CHANGED");
        hashSet4.add("android.net.conn.CONNECTIVITY_CHANGE");
        hashSet4.add("android.intent.action.ANY_DATA_STATE");
        hashSet4.add("android.intent.action.SIM_STATE_CHANGED");
        hashSet4.add("android.location.PROVIDERS_CHANGED");
        hashSet4.add("android.location.MODE_CHANGED");
        hashSet4.add("android.intent.action.HEADSET_PLUG");
        hashSet4.add("android.media.VOLUME_CHANGED_ACTION");
        hashSet4.add("android.intent.action.CONFIGURATION_CHANGED");
        hashSet4.add("android.intent.action.DYNAMIC_SENSOR_CHANGED");
        hashSet4.add("dynamic_sensor_change");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_CONFIGURE");
        hashSet.add("com.google.android.gms.settings.SECURITY_SETTINGS");
        hashSet.add("com.google.android.apps.plus.PRIVACY_SETTINGS");
        hashSet.add("android.permission.ACCOUNT_MANAGER");
        hashMap.put("android.intent.action.PACKAGE_ADDED", Constants.ACTION_PACKAGE_ADDED);
        hashMap.put("android.intent.action.PACKAGE_REMOVED", Constants.ACTION_PACKAGE_REMOVED);
        hashMap.put("android.intent.action.PACKAGE_CHANGED", Constants.ACTION_PACKAGE_CHANGED);
        hashMap.put("android.intent.action.USER_ADDED", Constants.ACTION_USER_ADDED);
        hashMap.put("android.intent.action.USER_REMOVED", Constants.ACTION_USER_REMOVED);
        hashMap.put("android.intent.action.MEDIA_SCANNER_SCAN_FILE", "android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        hashSet2.add("com.qihoo.magic");
        hashSet2.add("com.qihoo.magic_mutiple");
        hashSet2.add("com.facebook.katana");
        hashSet3.add(SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        hashSet3.add("com.google.android.webview");
        hashSet3.add("com.android.providers.downloads");
        hashSet3.add("FelipeLeite.Sober.appicon");
        hashSet5.add("com.huawei.hwid");
        hashSet5.add("com.hihonor.id");
        hashSet5.add("com.vivo.sdkplugin");
        hashSet5.add("com.xiaomi.gamecenter.sdk.service");
        if (VEnvironment.enableMediaRedirect()) {
            hashSet5.add(BuildConfig.VA_MEDIAPROVIDER_PKG);
        }
    }

    public static void addBlackAction(String str) {
        ACTION_BLACK_LIST.add(str);
    }

    public static void addStaticBroadCastWhiteList(String str) {
        BROADCAST_START_WHITE_LIST.add(str);
    }

    public static boolean allowedStartFromBroadcast(String str) {
        return BROADCAST_START_WHITE_LIST.contains(str);
    }

    public static Set<String> getPreInstallPackages() {
        return PRE_INSTALL_PACKAGES;
    }

    public static String getProtectActionPrefix() {
        return PROTECT_ACTION_PREFIX;
    }

    public static boolean isActionInBlackList(String str) {
        return ACTION_BLACK_LIST.contains(str);
    }

    public static boolean isConflictingInstrumentation(String str) {
        return INSTRUMENTATION_CONFLICTING.contains(str);
    }

    public static boolean isSpecSystemPackage(String str) {
        return SPEC_SYSTEM_APP_LIST.contains(str);
    }

    public static boolean isWhitePermission(String str) {
        return WHITE_PERMISSION.contains(str);
    }

    public static String protectAction(String str) {
        if (str == null) {
            return null;
        }
        if (VirtualCore.getConfig().isUnProtectAction(str)) {
            return str;
        }
        if (str.startsWith(getProtectActionPrefix())) {
            return str;
        }
        String str2 = PROTECTED_ACTION_MAP.get(str);
        if (str2 == null) {
            return getProtectActionPrefix() + str;
        }
        return str2;
    }

    public static void protectIntent(Intent intent) {
        String protectAction = protectAction(intent.getAction());
        if (protectAction != null) {
            intent.setAction(protectAction);
        }
    }

    public static void protectIntentFilter(IntentFilter intentFilter) {
        List<String> list;
        if (intentFilter != null) {
            if (BuildCompat.isUpsideDownCake()) {
                list = IntentFilterU.mActions.get(intentFilter);
            } else {
                list = mirror.android.content.IntentFilter.mActions.get(intentFilter);
            }
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (isActionInBlackList(str)) {
                    it.remove();
                } else {
                    String protectAction = protectAction(str);
                    if (protectAction != null) {
                        it.remove();
                        arrayList.add(protectAction);
                    }
                }
            }
            list.addAll(arrayList);
        }
    }

    public static boolean shouldBlockIntent(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null && GMS_BLOCK_COMPONENT.contains(component)) {
            return true;
        }
        String action = intent.getAction();
        if (action != null && GMS_BLOCK_ACTION_LIST.contains(action)) {
            return true;
        }
        return false;
    }

    public static String unprotectAction(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(getProtectActionPrefix())) {
            return str.substring(getProtectActionPrefix().length());
        }
        for (Map.Entry<String, String> entry : PROTECTED_ACTION_MAP.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Intent unprotectIntent(int i5, Intent intent) {
        BroadcastIntentData broadcastIntentData = new BroadcastIntentData(intent);
        Intent intent2 = broadcastIntentData.intent;
        if (intent2 != null) {
            int i6 = broadcastIntentData.userId;
            if (i6 == -1 || i6 == i5) {
                String unprotectAction = unprotectAction(intent2.getAction());
                if (unprotectAction != null) {
                    intent2.setAction(unprotectAction);
                }
                return intent2;
            }
            return intent;
        }
        return intent;
    }
}
