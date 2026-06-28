package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: classes3.dex */
public class PackageManagerHelper {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f8851a;

    /* loaded from: classes3.dex */
    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED,
        SPOOF
    }

    public PackageManagerHelper(Context context) {
        this.f8851a = context.getPackageManager();
    }

    public final byte[] a(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (AndroidException e5) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e5.getMessage());
        } catch (RuntimeException e6) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.", e6);
        }
        HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getApplicationName(String str) {
        try {
            return this.f8851a.getApplicationLabel(this.f8851a.getApplicationInfo(str, 128)).toString();
        } catch (AndroidException unused) {
            HMSLog.e("PackageManagerHelper", "Failed to get application name for " + str);
            return null;
        }
    }

    public long getPackageFirstInstallTime(String str) {
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 128);
            if (packageInfo == null) {
                return 0L;
            }
            return packageInfo.firstInstallTime;
        } catch (AndroidException | RuntimeException unused) {
            return 0L;
        }
    }

    public String getPackageSignature(String str) {
        byte[] a5 = a(str);
        if (a5 != null && a5.length != 0) {
            return HEX.encodeHexString(SHA256.digest(a5), true);
        }
        return null;
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            return PackageStates.NOT_INSTALLED;
        }
        try {
            if (this.f8851a.getApplicationInfo(str, 128).enabled) {
                return PackageStates.ENABLED;
            }
            return PackageStates.DISABLED;
        } catch (AndroidException unused) {
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) {
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 16);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (AndroidException e5) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed " + e5);
            return 0;
        } catch (RuntimeException e6) {
            HMSLog.e("PackageManagerHelper", "get PackageVersionCode failed", e6);
            return 0;
        }
    }

    public String getPackageVersionName(String str) {
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        } catch (AndroidException unused) {
            return "";
        } catch (RuntimeException e5) {
            HMSLog.e("PackageManagerHelper", "get getPackageVersionName failed", e5);
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) {
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 8);
            if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return false;
    }

    public boolean isPackageFreshInstall(String str) {
        try {
            PackageInfo packageInfo = this.f8851a.getPackageInfo(str, 128);
            if (packageInfo == null) {
                return false;
            }
            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                return false;
            }
            return true;
        } catch (AndroidException | RuntimeException unused) {
            return false;
        }
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) {
        PackageInfo packageArchiveInfo = this.f8851a.getPackageArchiveInfo(str, 64);
        if (packageArchiveInfo == null || packageArchiveInfo.signatures.length <= 0 || !str2.equals(packageArchiveInfo.packageName)) {
            return false;
        }
        InputStream inputStream = null;
        try {
            try {
                inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
                return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance("X.509").generateCertificate(inputStream).getEncoded()), true));
            } finally {
                IOUtils.closeQuietly((InputStream) null);
            }
        } catch (IOException | CertificateException e5) {
            HMSLog.e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e5.getMessage());
            return false;
        }
    }
}
