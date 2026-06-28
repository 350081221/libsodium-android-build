package u.dont.know.what.i.am;

import android.util.Log;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import u.dont.know.what.i.am.c;
import u.dont.know.what.i.am.d;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22535a = "SandXposed";

    /* renamed from: b, reason: collision with root package name */
    private static final String f22536b = "com.android.tools.fd.runtime.BootstrapApplication";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f22537c = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AtomicBoolean f22538d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private static volatile AtomicBoolean f22539e = new AtomicBoolean(false);

    private l() {
    }

    static void a() throws Throwable {
    }

    public static void b(String str, String str2, String str3, ClassLoader classLoader) {
        ZipFile zipFile;
        if (!new File(str).exists()) {
            Log.e("SandXposed", "  File does not exist");
            return;
        }
        try {
            DexFile dexFile = new DexFile(str);
            if (dexFile.loadClass(f22536b, classLoader) != null) {
                Log.e("SandXposed", "  Cannot load module, please disable \"Instant Run\" in Android Studio.");
                k.f(dexFile);
                return;
            }
            if (dexFile.loadClass(j.class.getName(), classLoader) != null) {
                Log.e("SandXposed", "  Cannot load module:");
                Log.e("SandXposed", "  The Xposed API classes are compiled into the module's APK.");
                Log.e("SandXposed", "  This may cause strange issues and must be fixed by the module developer.");
                Log.e("SandXposed", "  For details, see: http://api.xposed.info/using.html");
                k.f(dexFile);
                return;
            }
            k.f(dexFile);
            ZipFile zipFile2 = null;
            try {
                zipFile = new ZipFile(str);
            } catch (IOException e5) {
                e = e5;
            }
            try {
                ZipEntry entry = zipFile.getEntry("assets/xposed_init");
                if (entry == null) {
                    Log.e("SandXposed", "  assets/xposed_init not found in the APK");
                    k.h(zipFile);
                    return;
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                DexClassLoader dexClassLoader = new DexClassLoader(str, str2, str3, classLoader);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (!trim.isEmpty() && !trim.startsWith("#")) {
                                try {
                                    Log.i("SandXposed", "  Loading class " + trim);
                                    Class<?> loadClass = dexClassLoader.loadClass(trim);
                                    if (!e.class.isAssignableFrom(loadClass)) {
                                        Log.e("SandXposed", "    This class doesn't implement any sub-interface of IXposedMod, skipping it");
                                    } else if (f22537c && b.class.isAssignableFrom(loadClass)) {
                                        Log.e("SandXposed", "    This class requires resource-related hooks (which are disabled), skipping it.");
                                    } else {
                                        Object newInstance = loadClass.newInstance();
                                        if (newInstance instanceof d) {
                                            d.a aVar = new d.a();
                                            aVar.f22492a = str;
                                            aVar.f22493b = false;
                                            ((d) newInstance).c(aVar);
                                        }
                                        if (newInstance instanceof c) {
                                            j.g(new c.a((c) newInstance));
                                        }
                                        if (newInstance instanceof b) {
                                            throw new UnsupportedOperationException("can not hook resource!");
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    Log.e("SandXposed", "    Failed to load class " + trim, th);
                                }
                            }
                        } catch (IOException e6) {
                            Log.e("SandXposed", "  Failed to load module from " + str, e6);
                            return;
                        }
                    } finally {
                        k.g(inputStream);
                        k.h(zipFile);
                    }
                }
            } catch (IOException e7) {
                e = e7;
                zipFile2 = zipFile;
                Log.e("SandXposed", "  Cannot read assets/xposed_init in the APK", e);
                k.h(zipFile2);
            }
        } catch (IOException e8) {
            Log.e("SandXposed", "  Cannot load module", e8);
        }
    }

    private static boolean c() {
        return false;
    }
}
