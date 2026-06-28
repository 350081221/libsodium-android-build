package kotlin.text;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final f f19702a = new f();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19703b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19704c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19705d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19706e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19707f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final Charset f19708g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private static volatile Charset f19709h;

    /* renamed from: i, reason: collision with root package name */
    @p4.m
    private static volatile Charset f19710i;

    /* renamed from: j, reason: collision with root package name */
    @p4.m
    private static volatile Charset f19711j;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l0.o(forName, "forName(\"UTF-8\")");
        f19703b = forName;
        Charset forName2 = Charset.forName(HTTP.UTF_16);
        kotlin.jvm.internal.l0.o(forName2, "forName(\"UTF-16\")");
        f19704c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.l0.o(forName3, "forName(\"UTF-16BE\")");
        f19705d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.l0.o(forName4, "forName(\"UTF-16LE\")");
        f19706e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.l0.o(forName5, "forName(\"US-ASCII\")");
        f19707f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l0.o(forName6, "forName(\"ISO-8859-1\")");
        f19708g = forName6;
    }

    private f() {
    }

    @p4.l
    @u3.h(name = "UTF32")
    public final Charset a() {
        Charset charset = f19709h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32");
            kotlin.jvm.internal.l0.o(forName, "forName(\"UTF-32\")");
            f19709h = forName;
            return forName;
        }
        return charset;
    }

    @p4.l
    @u3.h(name = "UTF32_BE")
    public final Charset b() {
        Charset charset = f19711j;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            kotlin.jvm.internal.l0.o(forName, "forName(\"UTF-32BE\")");
            f19711j = forName;
            return forName;
        }
        return charset;
    }

    @p4.l
    @u3.h(name = "UTF32_LE")
    public final Charset c() {
        Charset charset = f19710i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            kotlin.jvm.internal.l0.o(forName, "forName(\"UTF-32LE\")");
            f19710i = forName;
            return forName;
        }
        return charset;
    }
}
