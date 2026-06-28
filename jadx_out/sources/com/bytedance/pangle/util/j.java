package com.bytedance.pangle.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.log.ZeusLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    static volatile ArrayList<String> f4647a;

    /* renamed from: b, reason: collision with root package name */
    private static String f4648b;

    public static List<String> a() {
        AssetManager assetManager;
        try {
            assetManager = (AssetManager) AssetManager.class.newInstance();
        } catch (Exception e5) {
            ZeusLogger.errReport(ZeusLogger.TAG_RESOURCES, "Execute 'AssetManager.class.newInstance()' failed. ", e5);
            assetManager = null;
        }
        return a(assetManager);
    }

    public static String b(AssetManager assetManager) {
        List<String> a5 = a(assetManager);
        StringBuilder sb = new StringBuilder("[");
        if (a5.size() > 0) {
            Iterator<String> it = a5.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(" , ");
            }
            sb.delete(sb.lastIndexOf(" , "), sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    public static List<String> a(AssetManager assetManager) {
        ArrayList arrayList = new ArrayList();
        if (assetManager == null) {
            return arrayList;
        }
        try {
            if (i.j()) {
                Object[] objArr = (Object[]) MethodUtils.invokeMethod(assetManager, "getApkAssets", new Object[0]);
                if (objArr != null && objArr.length > 0) {
                    for (Object obj : objArr) {
                        arrayList.add((String) MethodUtils.invokeMethod(obj, "getAssetPath", new Object[0]));
                    }
                }
            } else {
                int intValue = ((Integer) MethodUtils.invokeMethod(assetManager, "getStringBlockCount", new Object[0])).intValue();
                for (int i5 = 0; i5 < intValue; i5++) {
                    try {
                        String str = (String) MethodUtils.invokeMethod(assetManager, "getCookieName", Integer.valueOf(i5 + 1));
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(str);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_RESOURCES, "ResUtils GetAssetsPaths error. ", th);
        }
        return arrayList;
    }

    public static synchronized List<String> b() {
        ArrayList<String> arrayList;
        synchronized (j.class) {
            GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_WEB, "start");
            if (f4647a == null) {
                synchronized (j.class) {
                    if (f4647a == null) {
                        f4647a = new ArrayList<>();
                        boolean z4 = false;
                        if (i.c()) {
                            try {
                                Resources resources = Zeus.getAppApplication().getResources();
                                f4647a.add(Zeus.getAppApplication().createPackageContext(resources.getString(resources.getIdentifier("android:string/config_webViewPackageName", TypedValues.Custom.S_STRING, SharedLibraryInfo.PLATFORM_PACKAGE_NAME)), 0).getApplicationInfo().sourceDir);
                            } catch (Exception e5) {
                                ZeusLogger.w(ZeusLogger.TAG_LOAD, "getWebViewPaths1 failed.", e5);
                            }
                        } else if (i.h()) {
                            try {
                                Object invokeStaticMethod = MethodUtils.invokeStaticMethod(Class.forName("android.webkit.WebViewFactory"), "getWebViewContextAndSetProvider", new Object[0]);
                                int i5 = Build.VERSION.SDK_INT;
                                if (i5 >= 29 || (i5 == 28 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                                    z4 = true;
                                }
                                if (z4) {
                                    Collections.addAll(f4647a, a(((Context) invokeStaticMethod).getApplicationInfo()));
                                } else {
                                    f4647a.add(((Context) invokeStaticMethod).getApplicationInfo().sourceDir);
                                }
                            } catch (Exception e6) {
                                ZeusLogger.w(ZeusLogger.TAG_LOAD, "getWebViewPaths2 failed.", e6);
                            }
                        }
                    }
                }
            }
            GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_WEB, "finish :" + f4647a);
            arrayList = f4647a;
        }
        return arrayList;
    }

    public static boolean a(AssetManager assetManager, String str) {
        try {
            if (i.j()) {
                Object[] objArr = (Object[]) MethodUtils.invokeMethod(assetManager, "getApkAssets", new Object[0]);
                if (objArr != null && objArr.length > 0) {
                    for (Object obj : objArr) {
                        if (TextUtils.equals((String) MethodUtils.invokeMethod(obj, "getAssetPath", new Object[0]), str)) {
                            return true;
                        }
                    }
                }
            } else {
                int intValue = ((Integer) MethodUtils.invokeMethod(assetManager, "getStringBlockCount", new Object[0])).intValue();
                int i5 = 0;
                while (i5 < intValue) {
                    i5++;
                    if (TextUtils.equals((String) MethodUtils.invokeMethod(assetManager, "getCookieName", Integer.valueOf(i5)), str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_RESOURCES, "containsPath error. ", th);
        }
        return false;
    }

    @RequiresApi(api = 21)
    private static String[] a(ApplicationInfo applicationInfo) {
        String[] strArr;
        try {
            strArr = (String[]) com.bytedance.pangle.b.b.a.a((Class<?>) ApplicationInfo.class, "resourceDirs").get(applicationInfo);
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_LOAD, "get resourceDirs failed.", th);
            strArr = new String[0];
        }
        String[][] strArr2 = {applicationInfo.splitSourceDirs, applicationInfo.sharedLibraryFiles, strArr};
        ArrayList arrayList = new ArrayList(10);
        String str = applicationInfo.sourceDir;
        if (str != null) {
            arrayList.add(str);
        }
        for (int i5 = 0; i5 < 3; i5++) {
            String[] strArr3 = strArr2[i5];
            if (strArr3 != null) {
                arrayList.addAll(Arrays.asList(strArr3));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
