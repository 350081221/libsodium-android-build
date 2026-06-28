package com.bytedance.pangle.res;

import android.content.pm.SharedLibraryInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.pangle.util.i;
import com.bytedance.pangle.util.j;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f4533a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private LinkedHashMap<String, Integer> f4534b;

    static {
        List<String> a5 = j.a();
        if (a5 != null && a5.size() > 0) {
            Iterator<String> it = a5.iterator();
            while (it.hasNext()) {
                f4533a.put(it.next(), 0);
            }
        }
    }

    public a() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        this.f4534b = linkedHashMap;
        linkedHashMap.put(Zeus.getAppApplication().getApplicationInfo().sourceDir, 0);
    }

    private static AssetManager b(AssetManager assetManager, String str, boolean z4) {
        String str2;
        boolean z5;
        int intValue;
        String str3 = "addAssetPath";
        if (!z4) {
            str2 = "addAssetPath";
        } else {
            str2 = "addAssetPathAsSharedLibrary";
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 && (i5 != 29 || Build.VERSION.PREVIEW_SDK_INT <= 0)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5 && !z4 && str.startsWith("/product/overlay/")) {
            str2 = "addOverlayPath";
        }
        Method accessibleMethod = MethodUtils.getAccessibleMethod(AssetManager.class, str2, String.class);
        if (accessibleMethod == null && z4) {
            accessibleMethod = MethodUtils.getAccessibleMethod(AssetManager.class, "addAssetPath", String.class);
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor AssetManager.addAssetPath() invoke addAssetPathAsSharedLibrary failed. use addAssetPath.");
        } else {
            str3 = str2;
        }
        if (accessibleMethod != null) {
            int i6 = 3;
            while (true) {
                int i7 = i6 - 1;
                if (i6 < 0) {
                    break;
                }
                try {
                    intValue = ((Integer) accessibleMethod.invoke(assetManager, str)).intValue();
                } catch (Exception e5) {
                    ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor invoke AssetManager.addAssetPath() failed. asSharedLibrary = " + z4 + ", methodName = " + str3, e5);
                }
                if (intValue != 0) {
                    ZeusLogger.i(ZeusLogger.TAG_LOAD, "AssetManagerProcessor invoke AssetManager.addAssetPath() success, cookie = " + intValue + ", path = " + str);
                    break;
                }
                ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor invoke AssetManager.addAssetPath() failed, cookie = " + intValue + " " + str);
                i6 = i7;
            }
        } else {
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor reflect AssetManager.addAssetPath() failed. addAssetPathMethod == null. asSharedLibrary = " + z4 + " methodName:" + str3);
        }
        return assetManager;
    }

    private static AssetManager c(AssetManager assetManager, String str, boolean z4) {
        int i5;
        int i6;
        boolean z5;
        int i7 = 3;
        Throwable th = null;
        int i8 = 3;
        loop0: while (true) {
            int i9 = i8 - 1;
            if (i8 < 0) {
                break;
            }
            try {
                synchronized (assetManager) {
                    i5 = 0;
                    for (int i10 = 0; i10 < i7; i10++) {
                        try {
                            if (i.c()) {
                                i5 = ((Integer) MethodUtils.invokeMethod(assetManager, "addAssetPathNative", new Object[]{str}, new Class[]{String.class})).intValue();
                            } else {
                                if (Build.VERSION.SDK_INT <= 25) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i5 = ((Integer) MethodUtils.invokeMethod(assetManager, "addAssetPathNative", new Object[]{str, Boolean.valueOf(z4)}, new Class[]{String.class, Boolean.TYPE})).intValue();
                                }
                            }
                            if (i5 != 0) {
                                break loop0;
                            }
                        } finally {
                        }
                    }
                    break loop0;
                }
            } catch (Throwable th2) {
                th = th2;
                i8 = i9;
                i7 = 3;
            }
        }
        if (i5 == 0) {
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor invoke AssetManager.appendAssetPathSafely() failed, cookie = " + i5 + " " + str);
        } else {
            Object readField = FieldUtils.readField(assetManager, "mStringBlocks");
            if (readField != null) {
                i6 = Array.getLength(readField);
            } else {
                i6 = 0;
            }
            int intValue = ((Integer) MethodUtils.invokeMethod(assetManager, "getStringBlockCount", new Object[0])).intValue();
            Object newInstance = Array.newInstance(readField.getClass().getComponentType(), intValue);
            for (int i11 = 0; i11 < intValue; i11++) {
                if (i11 < i6) {
                    Array.set(newInstance, i11, Array.get(readField, i11));
                } else {
                    Array.set(newInstance, i11, MethodUtils.invokeConstructor(readField.getClass().getComponentType(), new Object[]{Long.valueOf(((Long) MethodUtils.invokeMethod(assetManager, "getNativeStringBlock", new Object[]{Integer.valueOf(i11)}, new Class[]{Integer.TYPE})).longValue()), Boolean.TRUE}, new Class[]{Long.TYPE, Boolean.TYPE}));
                }
            }
            FieldUtils.writeField(assetManager, "mStringBlocks", newInstance);
            ZeusLogger.d(ZeusLogger.TAG_LOAD, "AssetManagerProcessor appendAssetPathSafely success, sourceDir = ".concat(String.valueOf(str)));
        }
        if (th != null) {
            if (!TextUtils.equals(Build.BRAND.toLowerCase(), "samsung")) {
                ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "AssetManagerProcessor appendAssetPathSafely failed, sourceDir = ".concat(String.valueOf(str)), th);
            }
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor appendAssetPathSafely failed, sourceDir = ".concat(String.valueOf(str)), th);
        }
        return assetManager;
    }

    public final AssetManager a(AssetManager assetManager, String str, boolean z4) {
        AssetManager a5;
        if (str.endsWith(".frro")) {
            ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor updateAssetManager skip frro. ".concat(str));
            return assetManager;
        }
        if (i.a()) {
            if (i.e()) {
                a5 = c(assetManager, str, z4);
                if (!j.a(a5, str)) {
                    a5 = b(assetManager, str, z4);
                }
            } else {
                a5 = b(assetManager, str, z4);
            }
        } else {
            a5 = a(assetManager, str);
        }
        synchronized (this.f4534b) {
            this.f4534b.put(str, 0);
        }
        return a5;
    }

    private AssetManager a(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        List<String> a5 = j.a(assetManager);
        ArrayList<String> arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (String str2 : a5) {
            if (!f4533a.containsKey(str2) && !this.f4534b.containsKey(str2) && !str2.equals(str)) {
                arrayList.add(str2);
            }
        }
        ZeusLogger.i(ZeusLogger.TAG_LOAD, "AssetManagerProcessor newAssetManager, runtimeAdditionalAssets path = ".concat(String.valueOf(str)));
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            ZeusLogger.i(ZeusLogger.TAG_LOAD, "AssetManagerProcessor newAssetManager = ".concat(String.valueOf(assetManager2)));
            synchronized (this.f4534b) {
                for (Map.Entry<String, Integer> entry : this.f4534b.entrySet()) {
                    if (!f4533a.containsKey(entry.getKey())) {
                        sb.append(entry.getKey());
                        b(assetManager2, entry.getKey(), false);
                    }
                }
            }
            if (!sb.toString().contains(Zeus.getAppApplication().getApplicationInfo().sourceDir)) {
                b(assetManager2, Zeus.getAppApplication().getApplicationInfo().sourceDir, false);
                ZeusLogger.w(ZeusLogger.TAG_LOAD, "AssetManagerProcessor newAssetManager lost host path : " + f4533a.containsKey(Zeus.getAppApplication().getApplicationInfo().sourceDir));
            }
            sb.append(str);
            b(assetManager2, str, false);
            if (!arrayList.isEmpty()) {
                for (String str3 : arrayList) {
                    sb.append(str3);
                    b(assetManager2, str3, false);
                }
            }
            if (i.d() && !sb.toString().toLowerCase().contains("webview")) {
                try {
                    Resources resources = Zeus.getAppApplication().getResources();
                    String str4 = Zeus.getAppApplication().createPackageContext(resources.getString(resources.getIdentifier("android:string/config_webViewPackageName", TypedValues.Custom.S_STRING, SharedLibraryInfo.PLATFORM_PACKAGE_NAME)), 0).getApplicationInfo().sourceDir;
                    if (!TextUtils.isEmpty(str4)) {
                        b(assetManager2, str4, false);
                    }
                } catch (Exception e5) {
                    ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "AssetManagerProcessor newAssetManager appendAsset webview failed.", e5);
                }
            }
            assetManager = assetManager2;
        } catch (Exception e6) {
            ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "AssetManagerProcessor newAssetManager failed.", e6);
            b(assetManager, str, false);
        }
        try {
            MethodUtils.invokeMethod(assetManager, "ensureStringBlocks", new Object[0]);
            ZeusLogger.i(ZeusLogger.TAG_LOAD, "AssetManagerProcessor ensureStringBlocks");
        } catch (Exception e7) {
            ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "AssetManagerProcessor ensureStringBlocks failed.", e7);
        }
        return assetManager;
    }
}
