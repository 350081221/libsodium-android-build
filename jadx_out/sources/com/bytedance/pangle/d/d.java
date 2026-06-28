package com.bytedance.pangle.d;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f4319a;

    /* renamed from: b, reason: collision with root package name */
    private static List<String> f4320b = new CopyOnWriteArrayList();

    public static String a() {
        String processName;
        if (!TextUtils.isEmpty(f4319a)) {
            return f4319a;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                if (!TextUtils.isEmpty(processName)) {
                    f4319a = processName;
                }
                return f4319a;
            }
        } catch (Throwable unused) {
        }
        try {
            Object invokeStaticMethod = MethodUtils.invokeStaticMethod(Class.forName("android.app.ActivityThread"), "currentProcessName", new Object[0]);
            if (!TextUtils.isEmpty((String) invokeStaticMethod)) {
                f4319a = (String) invokeStaticMethod;
            }
            return f4319a;
        } catch (Exception e5) {
            e5.printStackTrace();
            String b5 = b();
            f4319a = b5;
            return b5;
        }
    }

    private static String b() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb.append((char) read);
            }
            if (ZeusLogger.isDebug()) {
                ZeusLogger.d("Process", "get processName = " + sb.toString());
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (Exception unused2) {
            }
            return sb2;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        }
    }

    public static boolean a(Context context) {
        String a5 = a();
        return (a5 == null || !a5.contains(":")) && a5 != null && a5.equals(context.getPackageName());
    }

    public static String a(String str) {
        return (TextUtils.isEmpty(str) || !str.contains(":")) ? TTAdSdk.S_C : str.split(":")[1];
    }
}
