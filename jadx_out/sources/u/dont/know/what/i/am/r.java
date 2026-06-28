package u.dont.know.what.i.am;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22552a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22553b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22554c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f22555d = 0;

    static void c(String str) {
        if (str.startsWith("/")) {
            return;
        }
        throw new IllegalArgumentException("Only absolute filenames are allowed: " + str);
    }

    static void m(int i5, String str, String str2, String str3) throws IOException {
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 12) {
                    if (i5 != 13) {
                        if (i5 != 21) {
                            if (str == null) {
                                str = "Error " + i5 + str3 + str2;
                            }
                            throw new IOException(str);
                        }
                        if (str == null) {
                            str = "Is a directory: " + str2;
                        }
                        throw new FileNotFoundException(str);
                    }
                } else {
                    throw new OutOfMemoryError(str);
                }
            } else {
                if (str == null) {
                    str = "No such file or directory: " + str2;
                }
                throw new FileNotFoundException(str);
            }
        }
        if (str == null) {
            str = "Permission denied: " + str2;
        }
        throw new FileNotFoundException(str);
    }

    public abstract boolean a(String str, int i5);

    public boolean b(String str) {
        return a(str, 0);
    }

    public t d(String str, long j5, long j6) throws IOException {
        t j7 = j(str, j5, j6);
        if (j7.f22556a == null) {
            return j7;
        }
        return new t(new ByteArrayInputStream(j7.f22556a), j7.f22558c, j7.f22559d);
    }

    public InputStream e(String str) throws IOException {
        return new ByteArrayInputStream(k(str));
    }

    public long f(String str) throws IOException {
        return l(str).f22559d;
    }

    public long g(String str) throws IOException {
        return l(str).f22558c;
    }

    public boolean h() {
        return false;
    }

    public abstract t i(String str, int i5, int i6, long j5, long j6) throws IOException;

    public abstract t j(String str, long j5, long j6) throws IOException;

    public abstract byte[] k(String str) throws IOException;

    public abstract t l(String str) throws IOException;
}
