package com.huawei.secure.android.common.detect;

import android.content.Context;
import android.os.Process;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8868a = "XpsDetect";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8869b = "64652e726f62762e616e64726f69642e78706f7365642e696e7374616c6c6572";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8870c = "64652e726f62762e616e64726f69642e78706f7365642e58706f736564427269646765";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8871d = "58706f7365644272696467652e6a6172";

    private static boolean a() {
        try {
            throw new SecurityException("Xps detect exception");
        } catch (SecurityException e5) {
            for (StackTraceElement stackTraceElement : e5.getStackTrace()) {
                try {
                    if (stackTraceElement.getClassName().equals(new String(z1.a.c(f8870c), "UTF-8")) && stackTraceElement.getMethodName().equals(TTAdSdk.S_C)) {
                        z1.c.d(f8868a, "find Xps Bridge by exception class name");
                        return true;
                    }
                } catch (UnsupportedEncodingException unused) {
                    z1.c.d(f8868a, "UnsupportedEncodingException");
                }
            }
            return false;
        }
    }

    private static boolean b() {
        Throwable th;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        IOException iOException;
        FileInputStream fileInputStream;
        String readLine;
        FileInputStream fileInputStream2 = null;
        try {
            String str = "/proc/" + Process.myPid() + "/maps";
            String str2 = new String(z1.a.c(f8871d), "UTF-8");
            FileInputStream fileInputStream3 = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream3, Charset.forName("UTF-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    do {
                        try {
                            readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                z1.b.i(bufferedReader);
                                z1.b.i(inputStreamReader);
                                z1.b.g(fileInputStream3);
                                return false;
                            }
                        } catch (IOException e5) {
                            fileInputStream = fileInputStream3;
                            iOException = e5;
                            fileInputStream2 = fileInputStream;
                            try {
                                z1.c.d(f8868a, "Xps Jar Check " + iOException.getMessage());
                                z1.b.i(bufferedReader);
                                z1.b.i(inputStreamReader);
                                z1.b.g(fileInputStream2);
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                z1.b.i(bufferedReader);
                                z1.b.i(inputStreamReader);
                                z1.b.g(fileInputStream2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream2 = fileInputStream3;
                            z1.b.i(bufferedReader);
                            z1.b.i(inputStreamReader);
                            z1.b.g(fileInputStream2);
                            throw th;
                        }
                    } while (!readLine.contains(str2));
                    z1.c.d(f8868a, "Xps JAR found: ");
                    z1.b.i(bufferedReader);
                    z1.b.i(inputStreamReader);
                    z1.b.g(fileInputStream3);
                    return true;
                } catch (IOException e6) {
                    fileInputStream = fileInputStream3;
                    iOException = e6;
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (IOException e7) {
                inputStreamReader = null;
                fileInputStream2 = fileInputStream3;
                iOException = e7;
                bufferedReader = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                inputStreamReader = null;
            }
        } catch (IOException e8) {
            iOException = e8;
            bufferedReader = null;
            inputStreamReader = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }

    public static boolean c(Context context) {
        return a() && b();
    }
}
