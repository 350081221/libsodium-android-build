package com.swift.sandhook.xcompat;

import android.app.Application;
import android.content.Context;
import java.io.File;
import u.dont.know.what.i.am.c;
import u.dont.know.what.i.am.p;

/* loaded from: classes3.dex */
public class a {
    public static File cacheDir = null;
    public static volatile ClassLoader classLoader = null;
    public static Context context = null;
    public static boolean isFirstApplication = false;
    public static String packageName = null;
    public static String processName = null;
    public static volatile boolean retryWhenCallOriginError = false;
    private static ClassLoader sandHookXposedClassLoader = null;
    public static volatile boolean useInternalStub = true;
    public static volatile boolean useNewCallBackup = true;

    public static void addXposedModuleCallback(u.dont.know.what.i.am.c cVar) {
        u.dont.know.what.i.am.j.g(new c.a(cVar));
    }

    public static void callXposedModuleInit() throws Throwable {
        p.a aVar = new p.a(u.dont.know.what.i.am.j.f22524l);
        Application currentApplication = m.currentApplication();
        if (currentApplication != null) {
            if (aVar.f22545c == null) {
                aVar.f22545c = currentApplication.getPackageName();
            }
            if (aVar.f22546d == null) {
                aVar.f22546d = q.getProcessName(currentApplication);
            }
            if (aVar.f22547e == null) {
                aVar.f22547e = currentApplication.getClassLoader();
            }
            if (aVar.f22548f == null) {
                aVar.f22548f = currentApplication.getApplicationInfo();
            }
            if (cacheDir == null) {
                currentApplication.getCacheDir();
            }
        }
        u.dont.know.what.i.am.q.callAll(aVar);
    }

    public static boolean clearCache() {
        try {
            p.delete(getCacheDir());
            getCacheDir().mkdirs();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void clearOatCache() {
        h.clearOatFile();
    }

    public static File getCacheDir() {
        if (cacheDir == null) {
            if (context == null) {
                context = m.currentApplication();
            }
            if (context != null) {
                File cacheDir2 = context.getCacheDir();
                String str = processName;
                if (str == null) {
                    str = q.getProcessName(context);
                }
                cacheDir = new File(cacheDir2, o.MD5(str));
            }
        }
        return cacheDir;
    }

    public static ClassLoader getSandHookXposedClassLoader(ClassLoader classLoader2, ClassLoader classLoader3) {
        ClassLoader classLoader4 = sandHookXposedClassLoader;
        if (classLoader4 != null) {
            return classLoader4;
        }
        b bVar = new b(classLoader3, classLoader2);
        sandHookXposedClassLoader = bVar;
        return bVar;
    }

    public static void loadModule(String str, String str2, String str3, ClassLoader classLoader2) {
        u.dont.know.what.i.am.l.b(str, str2, str3, classLoader2);
    }
}
