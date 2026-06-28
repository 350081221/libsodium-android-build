package com.lody.virtual.client.hook.providers;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.provider.Settings;
import android.text.TextUtils;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.hook.base.MethodBox;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.remote.VDeviceConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import t0.b;
import u.dont.know.what.i.am.g;
import u.dont.know.what.i.am.k;

/* loaded from: classes3.dex */
public class SettingsProviderHook extends ExternalProviderHook {
    private static final int METHOD_GET = 0;
    private static final int METHOD_PUT = 1;
    private static final Map<String, String> PRE_SET_VALUES;
    private static final Set<String> SETTINGS_DIRECT_TO_SYSTEM;
    public static final int SET_ALL_RESULT_SUCCESS = 1;
    private static final String TAG = "SettingsProviderHook";
    private static final Set<String> sSystemTableColums;

    static {
        HashMap hashMap = new HashMap();
        PRE_SET_VALUES = hashMap;
        HashSet hashSet = new HashSet();
        SETTINGS_DIRECT_TO_SYSTEM = hashSet;
        sSystemTableColums = new HashSet();
        hashMap.put("user_setup_complete", "1");
        hashMap.put("install_non_market_apps", "1");
        hashSet.add("device_provisioned");
        hashSet.add("location_providers_allowed");
    }

    public SettingsProviderHook(IInterface iInterface) {
        super(iInterface);
    }

    private static int getMethodType(String str) {
        if (str.startsWith("GET_")) {
            return 0;
        }
        if (str.startsWith("PUT_")) {
            return 1;
        }
        return -1;
    }

    static int getTableIndex(String str) {
        if (str.contains(ClientCookie.SECURE_ATTR)) {
            return 1;
        }
        if (str.contains("system")) {
            return 0;
        }
        if (str.contains("global")) {
            return 2;
        }
        if (str.contains("config")) {
            return 3;
        }
        return -1;
    }

    private static void initSystemTableColums() {
        try {
            Field[] declaredFields = Settings.System.class.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 1) != 0 && (field.getModifiers() & 8) != 0 && (field.getModifiers() & 16) != 0 && field.getType() == String.class) {
                        sSystemTableColums.add((String) field.get(null));
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static boolean isSecureMethod(String str) {
        return str.endsWith(ClientCookie.SECURE_ATTR);
    }

    private static boolean isUseVSettingsProvider(String str) {
        if (!GmsSupport.isGoogleAppOrService(str) && !SpecialComponentList.getPreInstallPackages().contains(str)) {
            return false;
        }
        return true;
    }

    public static void passSettingsProviderPermissionCheck(String str) {
        if (!isUseVSettingsProvider(str)) {
            return;
        }
        try {
            k.n("android.provider.DeviceConfig", Settings.class.getClassLoader(), "getString", String.class, String.class, String.class, new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    aVar.h(aVar.f22498e[2]);
                }
            });
            k.n("android.provider.DeviceConfig", Settings.class.getClassLoader(), "getBoolean", String.class, String.class, Boolean.TYPE, new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    aVar.h(aVar.f22498e[2]);
                }
            });
            k.n("android.provider.DeviceConfig", Settings.class.getClassLoader(), "getInt", String.class, String.class, Integer.TYPE, new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    aVar.h(aVar.f22498e[2]);
                }
            });
            k.n("android.provider.DeviceConfig", Settings.class.getClassLoader(), "getLong", String.class, String.class, Long.TYPE, new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.4
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    aVar.h(aVar.f22498e[2]);
                }
            });
            k.n("android.provider.DeviceConfig", Settings.class.getClassLoader(), "getFloat", String.class, String.class, Float.TYPE, new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    aVar.h(aVar.f22498e[2]);
                }
            });
            if (BuildCompat.isS()) {
                k.n("android.provider.Settings$NameValueCache", Settings.class.getClassLoader(), "isCallerExemptFromReadableRestriction", new g() { // from class: com.lody.virtual.client.hook.providers.SettingsProviderHook.6
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // u.dont.know.what.i.am.g
                    public void beforeHookedMethod(g.a aVar) throws Throwable {
                        aVar.h(Boolean.TRUE);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private Bundle wrapBundle(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString(b.f22420d, str2);
        return bundle;
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public Bundle call(MethodBox methodBox, String str, String str2, Bundle bundle) throws InvocationTargetException {
        String str3;
        if (!VClient.get().isProcessBound()) {
            return (Bundle) methodBox.call();
        }
        int tableIndex = getTableIndex(str);
        if (tableIndex >= 0) {
            if (BuildCompat.isR() && TextUtils.equals(str, "SET_ALL_config")) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("config_set_all_return", 1);
                return bundle2;
            }
            if (BuildCompat.isR() && TextUtils.equals(str, "LIST_config")) {
                return null;
            }
            if (getMethodType(str) == 0) {
                String str4 = PRE_SET_VALUES.get(str2);
                if (str4 != null) {
                    return wrapBundle(str2, str4);
                }
                if ("android_id".equals(str2)) {
                    VDeviceConfig deviceConfig = VClient.get().getDeviceConfig();
                    if (deviceConfig.enable && (str3 = deviceConfig.androidId) != null) {
                        return wrapBundle("android_id", str3);
                    }
                }
                if (SETTINGS_DIRECT_TO_SYSTEM.contains(str2)) {
                    return (Bundle) methodBox.call();
                }
                if (tableIndex != 0 && isUseVSettingsProvider(VClient.get().getCurrentPackage())) {
                    return wrapBundle(str2, VActivityManager.get().getSettingsProvider(tableIndex, str2));
                }
            } else {
                if (tableIndex != 0 && isUseVSettingsProvider(VClient.get().getCurrentPackage())) {
                    String string = bundle.getString(b.f22420d);
                    if (!TextUtils.isEmpty(string) && !SETTINGS_DIRECT_TO_SYSTEM.contains(str2)) {
                        VActivityManager.get().setSettingsProvider(tableIndex, str2, string);
                        return new Bundle();
                    }
                    return new Bundle();
                }
                if (isSecureMethod(str)) {
                    return new Bundle();
                }
            }
        }
        try {
            return (Bundle) methodBox.call();
        } catch (Exception e5) {
            if (e5.getCause() instanceof SecurityException) {
                return new Bundle();
            }
            if (e5.getCause() instanceof IllegalArgumentException) {
                return new Bundle();
            }
            throw e5;
        }
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.providers.ExternalProviderHook, com.lody.virtual.client.hook.providers.ProviderHook
    public void processArgs(Method method, Object... objArr) {
        super.processArgs(method, objArr);
    }

    @Override // com.lody.virtual.client.hook.providers.ProviderHook
    public Cursor query(MethodBox methodBox, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Bundle bundle) throws InvocationTargetException {
        if (uri.toString().equals("content://settings/config")) {
            return null;
        }
        return super.query(methodBox, uri, strArr, str, strArr2, str2, bundle);
    }
}
