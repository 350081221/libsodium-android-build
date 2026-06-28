package com.uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.uc.crashsdk.export.ICrashClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static ICrashClient f11977a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f11978b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f11979c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f11980d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f11981e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile List<ValueCallback<Bundle>> f11982f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f11983g = new Object();

    public static void a(ICrashClient iCrashClient) {
        f11977a = iCrashClient;
    }

    public static boolean b(ValueCallback<Bundle> valueCallback) {
        if (f11980d == null) {
            synchronized (f11983g) {
                if (f11980d == null) {
                    f11980d = new ArrayList();
                }
            }
        }
        synchronized (f11980d) {
            if (f11980d.size() >= f11978b) {
                return false;
            }
            f11980d.add(valueCallback);
            return true;
        }
    }

    public static boolean c(ValueCallback<Bundle> valueCallback) {
        if (f11981e == null) {
            synchronized (f11983g) {
                if (f11981e == null) {
                    f11981e = new ArrayList();
                }
            }
        }
        synchronized (f11981e) {
            if (f11981e.size() >= f11978b) {
                return false;
            }
            f11981e.add(valueCallback);
            return true;
        }
    }

    public static boolean d(ValueCallback<Bundle> valueCallback) {
        if (f11982f == null) {
            synchronized (f11983g) {
                if (f11982f == null) {
                    f11982f = new ArrayList();
                }
            }
        }
        synchronized (f11982f) {
            if (f11982f.size() >= f11978b) {
                return false;
            }
            f11982f.add(valueCallback);
            return true;
        }
    }

    public static void a(String str, String str2, String str3) {
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = e.h().equals(str2);
        if (f11977a != null) {
            File file = new File(str);
            try {
                if (equals) {
                    f11977a.onLogGenerated(file, str3);
                } else {
                    f11977a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        List<ValueCallback<Bundle>> list = f11979c;
        if (!equals) {
            list = f11980d;
        }
        if (list != null) {
            synchronized (list) {
                for (ValueCallback<Bundle> valueCallback : list) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!equals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                    }
                }
            }
        }
    }

    public static File a(File file) {
        ICrashClient iCrashClient = f11977a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        return file;
    }

    public static void a(boolean z4) {
        ICrashClient iCrashClient = f11977a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z4);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        if (f11981e != null) {
            synchronized (f11981e) {
                for (ValueCallback<Bundle> valueCallback : f11981e) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z4);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                    }
                }
            }
        }
    }

    public static void a(String str, int i5, int i6) {
        ICrashClient iCrashClient = f11977a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i5, i6);
        }
        if (f11982f != null) {
            synchronized (f11982f) {
                for (ValueCallback<Bundle> valueCallback : f11982f) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt(DatabaseFileArchive.COLUMN_KEY, i5);
                        bundle.putInt("count", i6);
                        valueCallback.onReceiveValue(bundle);
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                }
            }
        }
    }

    public static String a(String str, boolean z4) {
        ICrashClient iCrashClient = f11977a;
        return iCrashClient != null ? iCrashClient.onGetCallbackInfo(str, z4) : "";
    }

    public static boolean a(ValueCallback<Bundle> valueCallback) {
        if (f11979c == null) {
            synchronized (f11983g) {
                if (f11979c == null) {
                    f11979c = new ArrayList();
                }
            }
        }
        synchronized (f11979c) {
            if (f11979c.size() >= f11978b) {
                return false;
            }
            f11979c.add(valueCallback);
            return true;
        }
    }
}
