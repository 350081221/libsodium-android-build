package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import kotlin.y1;
import o0.d;

/* loaded from: classes3.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a, reason: collision with root package name */
    public static final String f8853a = "ReadApkFileUtil";

    /* renamed from: b, reason: collision with root package name */
    public static String f8854b;

    /* renamed from: c, reason: collision with root package name */
    public static String f8855c;

    /* renamed from: d, reason: collision with root package name */
    public static String f8856d;

    /* renamed from: e, reason: collision with root package name */
    public static String f8857e;

    /* renamed from: f, reason: collision with root package name */
    public static String f8858f;

    public static byte[] a(ZipFile zipFile) {
        return a(zipFile, "META-INF/MANIFEST.MF");
    }

    @TargetApi(19)
    public static void b(byte[] bArr) {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        BufferedReader bufferedReader;
        if (bArr == null) {
            HMSLog.e(f8853a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        f8854b = null;
        f8855c = null;
        f8856d = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    String a5 = a(bufferedReader);
                    while (a5 != null) {
                        if (a5.length() != 0) {
                            if (a5.startsWith("ApkHash:")) {
                                f8857e = a(a5.substring(a5.indexOf(":") + 1));
                            }
                            if (a5.startsWith(KEY_SIGNATURE)) {
                                f8854b = a(a5.substring(a5.indexOf(":") + 1));
                                a5 = a(bufferedReader);
                            } else if (a5.startsWith(KEY_SIGNATURE2)) {
                                f8855c = a(a5.substring(a5.indexOf(":") + 1));
                                a5 = a(bufferedReader);
                            } else if (a5.startsWith(KEY_SIGNATURE3)) {
                                f8856d = a(a5.substring(a5.indexOf(":") + 1));
                                a5 = a(bufferedReader);
                            } else {
                                stringBuffer.append(a5);
                                stringBuffer.append("\r\n");
                            }
                        }
                        a5 = a(bufferedReader);
                    }
                    f8858f = stringBuffer.toString();
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    try {
                        HMSLog.e(f8853a, "loadApkCert Exception!");
                        bufferedReader = bufferedReader2;
                        IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                        IOUtils.closeQuietly((Reader) bufferedReader);
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                        IOUtils.closeQuietly((Reader) bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    IOUtils.closeQuietly((InputStream) byteArrayInputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception unused3) {
            byteArrayInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
        }
        IOUtils.closeQuietly((InputStream) byteArrayInputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & y1.f19838d;
            int i7 = i5 * 2;
            cArr2[i7] = cArr[i6 >>> 4];
            cArr2[i7 + 1] = cArr[i6 & 15];
        }
        return String.valueOf(cArr2);
    }

    public static boolean c() {
        try {
        } catch (Exception e5) {
            HMSLog.i(f8853a, "verifyMDMSignatureV3 MDM verify Exception!:" + e5.getMessage());
        }
        if (a(Base64.decode(EMUI11_PK, 0), a(f8858f, "SHA-384"), b(f8856d), "SHA384withRSA")) {
            HMSLog.i(f8853a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.i(f8853a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (f8856d != null) {
            return c();
        }
        if (f8855c != null) {
            return b();
        }
        if (f8854b != null) {
            return a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(f8853a, "HMS is not found!");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(19)
    public static boolean isCertFound(String str) {
        ZipFile zipFile;
        boolean z4;
        boolean z5 = false;
        ZipFile zipFile2 = null;
        ZipFile zipFile3 = null;
        ZipFile zipFile4 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            if (zipFile.getEntry("META-INF/HUAWEI.CER") != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                b(a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e6) {
                String str2 = f8853a;
                StringBuilder sb = new StringBuilder();
                sb.append("zipFile.close Exception!");
                sb.append(e6.getMessage());
                HMSLog.e(str2, sb.toString());
                zipFile3 = sb;
            }
            z5 = z4;
            zipFile2 = zipFile3;
        } catch (Exception e7) {
            e = e7;
            zipFile4 = zipFile;
            HMSLog.e(f8853a, "isCertFound Exception!" + e.getMessage());
            zipFile2 = zipFile4;
            if (zipFile4 != null) {
                try {
                    zipFile4.close();
                    zipFile2 = zipFile4;
                } catch (IOException e8) {
                    String str3 = f8853a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("zipFile.close Exception!");
                    sb2.append(e8.getMessage());
                    HMSLog.e(str3, sb2.toString());
                    zipFile2 = sb2;
                }
            }
            return z5;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e9) {
                    HMSLog.e(f8853a, "zipFile.close Exception!" + e9.getMessage());
                }
            }
            throw th;
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static boolean verifyApkHash(String str) {
        ZipFile zipFile;
        ?? r12 = 0;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            byte[] a5 = a(zipFile);
            ArrayList<String> a6 = a(a5);
            if (a6 != null) {
                a5 = a(a6);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(a5);
            String bytesToString = bytesToString(messageDigest.digest());
            String str2 = f8857e;
            if (str2 != null) {
                if (str2.equals(bytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e6) {
                        HMSLog.i(f8853a, "close stream Exception!" + e6.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e7) {
                HMSLog.i(f8853a, "close stream Exception!" + e7.getMessage());
                return false;
            }
        } catch (Exception e8) {
            e = e8;
            zipFile2 = zipFile;
            HMSLog.i(f8853a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                    return false;
                } catch (Exception e9) {
                    r12 = f8853a;
                    HMSLog.i(r12, "close stream Exception!" + e9.getMessage());
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            r12 = zipFile;
            if (r12 != 0) {
                try {
                    r12.close();
                } catch (Exception e10) {
                    HMSLog.i(f8853a, "close stream Exception!" + e10.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0099: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:56:0x0098 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.InputStream] */
    public static byte[] a(ZipFile zipFile, String str) {
        Throwable th;
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        Exception e5;
        Object obj;
        ?? r42;
        ?? entry = zipFile.getEntry(str);
        OutputStream outputStream2 = null;
        try {
            if (entry == 0) {
                return null;
            }
            try {
                zipFile = zipFile.getInputStream(entry);
                if (zipFile == 0) {
                    IOUtils.closeQuietly((InputStream) zipFile);
                    IOUtils.closeQuietly((InputStream) null);
                    IOUtils.closeQuietly((OutputStream) null);
                    IOUtils.closeQuietly((OutputStream) null);
                    return null;
                }
                try {
                    entry = new BufferedInputStream(zipFile);
                } catch (Exception e6) {
                    e5 = e6;
                    obj = zipFile;
                    entry = 0;
                    byteArrayOutputStream = null;
                    zipFile = obj;
                    r42 = byteArrayOutputStream;
                    HMSLog.i(f8853a, "getManifestBytes Exception!" + e5.getMessage());
                    IOUtils.closeQuietly((InputStream) zipFile);
                    IOUtils.closeQuietly((InputStream) entry);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) r42);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    th = th2;
                    entry = 0;
                    byteArrayOutputStream = null;
                    IOUtils.closeQuietly((InputStream) zipFile);
                    IOUtils.closeQuietly((InputStream) entry);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream2);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[4096];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        r42 = new BufferedOutputStream(byteArrayOutputStream);
                        try {
                            for (int read = entry.read(bArr, 0, 4096); read > 0; read = entry.read(bArr, 0, 4096)) {
                                r42.write(bArr, 0, read);
                            }
                            r42.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            IOUtils.closeQuietly((InputStream) zipFile);
                            IOUtils.closeQuietly((InputStream) entry);
                            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                            IOUtils.closeQuietly((OutputStream) r42);
                            return byteArray;
                        } catch (Exception e7) {
                            e5 = e7;
                            HMSLog.i(f8853a, "getManifestBytes Exception!" + e5.getMessage());
                            IOUtils.closeQuietly((InputStream) zipFile);
                            IOUtils.closeQuietly((InputStream) entry);
                            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                            IOUtils.closeQuietly((OutputStream) r42);
                            return null;
                        }
                    } catch (Exception e8) {
                        e5 = e8;
                        r42 = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        IOUtils.closeQuietly((InputStream) zipFile);
                        IOUtils.closeQuietly((InputStream) entry);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly(outputStream2);
                        throw th;
                    }
                } catch (Exception e9) {
                    e5 = e9;
                    byteArrayOutputStream = null;
                    zipFile = zipFile;
                    entry = entry;
                    r42 = byteArrayOutputStream;
                    HMSLog.i(f8853a, "getManifestBytes Exception!" + e5.getMessage());
                    IOUtils.closeQuietly((InputStream) zipFile);
                    IOUtils.closeQuietly((InputStream) entry);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) r42);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = null;
                }
            } catch (Exception e10) {
                e5 = e10;
                obj = null;
            } catch (Throwable th6) {
                th2 = th6;
                zipFile = 0;
            }
        } catch (Throwable th7) {
            th = th7;
            outputStream2 = outputStream;
        }
    }

    @TargetApi(19)
    public static ArrayList<String> a(byte[] bArr) {
        if (bArr == null) {
            HMSLog.e(f8853a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (a(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.e(f8853a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    public static boolean b() {
        try {
        } catch (Exception e5) {
            HMSLog.i(f8853a, "verifyMDMSignatureV2 MDM verify Exception!:" + e5.getMessage());
        }
        if (a(Base64.decode(EMUI10_PK, 0), a(f8858f, "SHA-256"), b(f8855c), "SHA256withRSA")) {
            HMSLog.i(f8853a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.i(f8853a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    public static byte[] b(String str) {
        int i5;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i5 = length / 2;
        } else {
            i5 = (length / 2) + 1;
        }
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < length; i6 += 2) {
            int i7 = i6 + 1;
            if (i7 < length) {
                bArr[i6 / 2] = (byte) ((Character.digit(str.charAt(i6), 16) << 4) + Character.digit(str.charAt(i7), 16));
            } else {
                bArr[i6 / 2] = (byte) (Character.digit(str.charAt(i6), 16) << 4);
            }
        }
        return bArr;
    }

    @TargetApi(19)
    public static byte[] a(ArrayList<String> arrayList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String str = arrayList.get(i5);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e5) {
                HMSLog.i(f8853a, "getManifestBytesbySorted Exception!" + e5.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th;
        }
    }

    public static boolean a(BufferedReader bufferedReader, ArrayList<String> arrayList) throws IOException {
        String a5 = a(bufferedReader);
        boolean z4 = false;
        while (a5 != null) {
            if (a5.equals("Name: META-INF/HUAWEI.CER")) {
                String a6 = a(bufferedReader);
                while (true) {
                    if (a6 == null) {
                        break;
                    }
                    if (a6.startsWith("Name:")) {
                        a5 = a6;
                        break;
                    }
                    a6 = a(bufferedReader);
                }
                z4 = true;
            }
            if (a5.length() != 0) {
                arrayList.add(a5);
            }
            a5 = a(bufferedReader);
        }
        return z4;
    }

    public static String a(BufferedReader bufferedReader) throws IOException {
        int read;
        if (bufferedReader == null || (read = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        while (read != -1) {
            char c5 = (char) read;
            if (c5 == '\n') {
                break;
            }
            if (sb.length() < 4096) {
                sb.append(c5);
                read = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String sb2 = sb.toString();
        return (sb2.isEmpty() || !sb2.endsWith("\r")) ? sb2 : sb2.substring(0, sb2.length() - 1);
    }

    public static boolean a() {
        try {
            if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(f8858f, "SHA-256"), b(f8854b), "SHA256withRSA")) {
                HMSLog.i(f8853a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.i(f8853a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e5) {
            HMSLog.i(f8853a, "verifyMDMSignatureV1 MDM verify Exception!:" + e5.getMessage());
            return false;
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance(d.f20838a).generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    @TargetApi(19)
    public static byte[] a(String str, String str2) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    public static String a(String str) {
        return str != null ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
    }
}
