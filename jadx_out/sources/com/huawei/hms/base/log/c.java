package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import com.android.multidex.ClassPathElement;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public String f8350b;

    /* renamed from: c, reason: collision with root package name */
    public String f8351c;

    /* renamed from: d, reason: collision with root package name */
    public int f8352d;

    /* renamed from: g, reason: collision with root package name */
    public String f8355g;

    /* renamed from: h, reason: collision with root package name */
    public int f8356h;

    /* renamed from: i, reason: collision with root package name */
    public int f8357i;

    /* renamed from: j, reason: collision with root package name */
    public int f8358j;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f8349a = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public long f8353e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f8354f = 0;

    public c(int i5, String str, int i6, String str2) {
        this.f8351c = "HMS";
        this.f8358j = i5;
        this.f8350b = str;
        this.f8352d = i6;
        if (str2 != null) {
            this.f8351c = str2;
        }
        b();
    }

    public static String a(int i5) {
        return i5 != 3 ? i5 != 4 ? i5 != 5 ? i5 != 6 ? String.valueOf(i5) : "E" : "W" : "I" : "D";
    }

    public final c b() {
        this.f8353e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f8354f = currentThread.getId();
        this.f8356h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i5 = this.f8358j;
        if (length > i5) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            this.f8355g = stackTraceElement.getFileName();
            this.f8357i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        a(sb);
        return sb.toString();
    }

    public <T> c a(T t5) {
        this.f8349a.append(t5);
        return this;
    }

    public c a(Throwable th) {
        a((c) '\n').a((c) Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    public final StringBuilder a(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f8349a.toString());
        return sb;
    }

    public final StringBuilder b(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f8353e)));
        String a5 = a(this.f8352d);
        sb.append(' ');
        sb.append(a5);
        sb.append(ClassPathElement.SEPARATOR_CHAR);
        sb.append(this.f8351c);
        sb.append(ClassPathElement.SEPARATOR_CHAR);
        sb.append(this.f8350b);
        sb.append(' ');
        sb.append(this.f8356h);
        sb.append(':');
        sb.append(this.f8354f);
        sb.append(' ');
        sb.append(this.f8355g);
        sb.append(':');
        sb.append(this.f8357i);
        sb.append(']');
        return sb;
    }
}
