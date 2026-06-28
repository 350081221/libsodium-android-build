package com.zzhoujay.richtext.ext;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.y1;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15722a = "47494638";

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length > 0) {
            for (byte b5 : bArr) {
                String hexString = Integer.toHexString(b5 & y1.f19838d);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return null;
    }

    public static boolean b(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(10);
            byte[] bArr = new byte[4];
            try {
                inputStream.read(bArr, 0, 4);
                inputStream.reset();
                return f15722a.equals(a(bArr));
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static boolean c(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        FileNotFoundException e5;
        BufferedInputStream bufferedInputStream;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    boolean b5 = b(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                        fileInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return b5;
                } catch (FileNotFoundException e7) {
                    e5 = e7;
                    e5.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            return false;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        return false;
                    }
                    return false;
                }
            } catch (FileNotFoundException e9) {
                e5 = e9;
                bufferedInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
                if (str != 0) {
                    try {
                        str.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e11) {
            fileInputStream = null;
            e5 = e11;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            str = 0;
        }
    }

    public static boolean d(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        return f15722a.equals(a(bArr2));
    }
}
