package b2;

import android.text.TextUtils;
import com.android.dx.util.ByteArray;
import f2.f;
import f2.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f632a = 8192;

    /* renamed from: c, reason: collision with root package name */
    private static final String f634c = "FileSHA256";

    /* renamed from: d, reason: collision with root package name */
    private static final String f635d = "";

    /* renamed from: b, reason: collision with root package name */
    private static final String f633b = "SHA-256";

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f636e = {f633b, "SHA-384", "SHA-512"};

    private static boolean a(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    private static boolean b(String str) {
        for (String str2 : f636e) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String c(File file) {
        return d(file, f633b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(File file, String str) {
        FileInputStream fileInputStream;
        if (!TextUtils.isEmpty(str) && b(str)) {
            if (!a(file)) {
                g.d(f634c, "file is not valid");
                return "";
            }
            ByteArray.MyInputStream myInputStream = 0;
            r0 = null;
            String str2 = null;
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(str);
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z4 = false;
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                            z4 = true;
                        }
                        if (z4) {
                            str2 = f2.c.b(messageDigest.digest());
                        }
                        f.g(fileInputStream);
                    } catch (IOException e5) {
                        e = e5;
                        g.d(f634c, "IOException" + e.getMessage());
                        f.g(fileInputStream);
                        return str2;
                    } catch (NoSuchAlgorithmException e6) {
                        e = e6;
                        g.d(f634c, "NoSuchAlgorithmException" + e.getMessage());
                        f.g(fileInputStream);
                        return str2;
                    }
                } catch (Throwable th) {
                    th = th;
                    myInputStream = "";
                    f.g(myInputStream);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                fileInputStream = null;
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                f.g(myInputStream);
                throw th;
            }
            return str2;
        }
        g.d(f634c, "algorithm is empty or not safe");
        return "";
    }

    public static String e(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        return f(inputStream, f633b);
    }

    public static String f(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        byte[] bArr = new byte[8192];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } else {
                    return f2.c.b(messageDigest.digest());
                }
            }
        } catch (IOException | NoSuchAlgorithmException unused) {
            g.d(f634c, "inputstraem exception");
            return "";
        } finally {
            f.g(inputStream);
        }
    }

    public static boolean g(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && b(str2)) {
            return str.equals(d(file, str2));
        }
        g.d(f634c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean h(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(c(file));
    }

    public static boolean i(InputStream inputStream, String str, String str2) {
        if (!TextUtils.isEmpty(str) && b(str2)) {
            return str.equals(f(inputStream, str2));
        }
        g.d(f634c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean j(InputStream inputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(e(inputStream));
    }
}
