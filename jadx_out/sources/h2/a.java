package h2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.util.e;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.y1;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16132a = "HiPkgSignManager";

    private static PackageInfo a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getPackageArchiveInfo(str, 64);
            }
            return null;
        } catch (Exception e5) {
            e.q(f16132a, "Exception : " + e5.getMessage(), true);
            return null;
        }
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < length; i5++) {
            byte b5 = bArr[i5];
            if ((b5 & y1.f19838d) < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i5] & y1.f19838d));
            } else {
                stringBuffer.append(Integer.toHexString(b5 & y1.f19838d));
            }
        }
        return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
    }

    private static List<String> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        if (signatureArr != null && signatureArr.length != 0) {
            for (Signature signature : signatureArr) {
                arrayList.add(d(signature.toByteArray()));
            }
        }
        return arrayList;
    }

    private static String d(byte[] bArr) {
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e5) {
            e.l(f16132a, "NoSuchAlgorithmException" + e5.getMessage());
            return "";
        }
    }

    public static boolean e(Context context, String str, String str2, String str3) {
        PackageInfo a5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || context == null || TextUtils.isEmpty(str3) || (a5 = a(context, str2)) == null) {
            return false;
        }
        String d5 = d(a5.signatures[0].toByteArray());
        String str4 = a5.packageName;
        if (!str.equalsIgnoreCase(d5) || !str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public static boolean f(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && context != null) {
            return str.equalsIgnoreCase(i(context, str2));
        }
        return false;
    }

    public static boolean g(Context context, List<String> list, String str) {
        List<String> j5;
        if (TextUtils.isEmpty(str) || list == null || context == null || (j5 = j(context, str)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
        }
        Iterator<String> it2 = j5.iterator();
        while (it2.hasNext()) {
            if (!arrayList.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static byte[] h(Context context, String str) {
        PackageInfo packageInfo;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e5) {
                e.q(f16132a, "PackageManager.NameNotFoundException : " + e5.getMessage(), true);
            } catch (Exception e6) {
                e.q(f16132a, "Exception : " + e6.getMessage(), true);
            }
            return new byte[0];
        }
        e.l(f16132a, "packageName is null or context is null");
        return new byte[0];
    }

    public static String i(Context context, String str) {
        byte[] h5 = h(context, str);
        if (h5 != null && h5.length > 0) {
            return d(h5);
        }
        return "";
    }

    public static List<String> j(Context context, String str) {
        PackageManager packageManager;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        boolean hasMultipleSigners;
        SigningInfo signingInfo3;
        Signature[] signingCertificateHistory;
        SigningInfo signingInfo4;
        Signature[] apkContentsSigners;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageParserEx.GET_SIGNING_CERTIFICATES);
            if (packageInfo != null) {
                signingInfo = packageInfo.signingInfo;
                if (signingInfo != null) {
                    signingInfo2 = packageInfo.signingInfo;
                    hasMultipleSigners = signingInfo2.hasMultipleSigners();
                    if (hasMultipleSigners) {
                        signingInfo4 = packageInfo.signingInfo;
                        apkContentsSigners = signingInfo4.getApkContentsSigners();
                        return c(apkContentsSigners);
                    }
                    signingInfo3 = packageInfo.signingInfo;
                    signingCertificateHistory = signingInfo3.getSigningCertificateHistory();
                    return c(signingCertificateHistory);
                }
            }
            return null;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
        if (packageInfo2 != null && (signatureArr = packageInfo2.signatures) != null && signatureArr.length != 0 && signatureArr[0] != null) {
            return c(signatureArr);
        }
        return null;
    }

    public static String k(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            PackageInfo a5 = a(context, str);
            if (a5 == null) {
                return "";
            }
            return a5.packageName;
        }
        e.l(f16132a, "archiveFilePath is null or context is null");
        return "";
    }

    public static byte[] l(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            PackageInfo a5 = a(context, str);
            if (a5 != null) {
                Signature signature = a5.signatures[0];
                if (signature != null) {
                    return signature.toByteArray();
                }
            } else {
                e.l(f16132a, "PackageInfo is null ");
            }
            return new byte[0];
        }
        e.l(f16132a, "archiveFilePath is null or context is null");
        return new byte[0];
    }

    public static String m(Context context, String str) {
        byte[] l5 = l(context, str);
        if (l5 != null && l5.length > 0) {
            return d(l5);
        }
        return "";
    }
}
