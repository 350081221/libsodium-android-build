package kotlin.io;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"print", "", CrashHianalyticsData.MESSAGE, "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "ConsoleKt")
/* loaded from: classes2.dex */
public final class d {
    @kotlin.internal.f
    private static final void a(byte b5) {
        System.out.print(Byte.valueOf(b5));
    }

    @kotlin.internal.f
    private static final void b(char c5) {
        System.out.print(c5);
    }

    @kotlin.internal.f
    private static final void c(double d5) {
        System.out.print(d5);
    }

    @kotlin.internal.f
    private static final void d(float f5) {
        System.out.print(f5);
    }

    @kotlin.internal.f
    private static final void e(int i5) {
        System.out.print(i5);
    }

    @kotlin.internal.f
    private static final void f(long j5) {
        System.out.print(j5);
    }

    @kotlin.internal.f
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @kotlin.internal.f
    private static final void h(short s5) {
        System.out.print(Short.valueOf(s5));
    }

    @kotlin.internal.f
    private static final void i(boolean z4) {
        System.out.print(z4);
    }

    @kotlin.internal.f
    private static final void j(char[] message) {
        l0.p(message, "message");
        System.out.print(message);
    }

    @kotlin.internal.f
    private static final void k() {
        System.out.println();
    }

    @kotlin.internal.f
    private static final void l(byte b5) {
        System.out.println(Byte.valueOf(b5));
    }

    @kotlin.internal.f
    private static final void m(char c5) {
        System.out.println(c5);
    }

    @kotlin.internal.f
    private static final void n(double d5) {
        System.out.println(d5);
    }

    @kotlin.internal.f
    private static final void o(float f5) {
        System.out.println(f5);
    }

    @kotlin.internal.f
    private static final void p(int i5) {
        System.out.println(i5);
    }

    @kotlin.internal.f
    private static final void q(long j5) {
        System.out.println(j5);
    }

    @kotlin.internal.f
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @kotlin.internal.f
    private static final void s(short s5) {
        System.out.println(Short.valueOf(s5));
    }

    @kotlin.internal.f
    private static final void t(boolean z4) {
        System.out.println(z4);
    }

    @kotlin.internal.f
    private static final void u(char[] message) {
        l0.p(message, "message");
        System.out.println(message);
    }

    @p4.m
    public static final String v() {
        r rVar = r.f19361a;
        InputStream inputStream = System.in;
        l0.o(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        l0.o(defaultCharset, "defaultCharset()");
        return rVar.d(inputStream, defaultCharset);
    }

    @p4.l
    @g1(version = "1.6")
    public static final String w() {
        String x4 = x();
        if (x4 != null) {
            return x4;
        }
        throw new v("EOF has already been reached");
    }

    @g1(version = "1.6")
    @p4.m
    public static final String x() {
        return v();
    }
}
