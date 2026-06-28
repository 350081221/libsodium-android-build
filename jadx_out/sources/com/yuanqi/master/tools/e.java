package com.yuanqi.master.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.yuanqi.master.network.model.DeviceModel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.t1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/yuanqi/master/tools/DeviceUtil;", "", "()V", "deviceName", "", "getDeviceName", "()Ljava/lang/String;", "isAppStorePhone", "", "()Z", "isHonorPhone", "isHuaweiPhone", "isXiaoMiPhone", "bytesToHex", "bytes", "", "getAndroidID", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "getHostDeviceModel", "Lcom/yuanqi/master/network/model/DeviceModel;", "getMacAddress", "isAppSignatureValid", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final e f15100a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15101b = 0;

    private e() {
    }

    private final String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            t1 t1Var = t1.f19457a;
            String format = String.format("%02x:", Arrays.copyOf(new Object[]{Byte.valueOf(b5)}, 1));
            kotlin.jvm.internal.l0.o(format, "format(format, *args)");
            sb.append(format);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "toString(...)");
        return sb2;
    }

    private final String b(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        return string;
    }

    private final String c() {
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.l0.o(MODEL, "MODEL");
        return MODEL;
    }

    private final String e(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
            return "Permission not granted";
        }
        Object systemService = context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
        kotlin.jvm.internal.l0.o(connectionInfo, "getConnectionInfo(...)");
        String macAddress = connectionInfo.getMacAddress();
        kotlin.jvm.internal.l0.o(macAddress, "getMacAddress(...)");
        return macAddress;
    }

    @p4.l
    public final DeviceModel d(@p4.l Context context) {
        String c5;
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            c5 = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
        } catch (Exception unused) {
            c5 = c();
        }
        String str = c5;
        String b5 = b(context);
        String e5 = e(context);
        kotlin.jvm.internal.l0.m(str);
        String c6 = c();
        String DEVICE = Build.DEVICE;
        kotlin.jvm.internal.l0.o(DEVICE, "DEVICE");
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.l0.o(MANUFACTURER, "MANUFACTURER");
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.l0.o(BRAND, "BRAND");
        return new DeviceModel(str, c6, DEVICE, MANUFACTURER, BRAND, null, b5, e5);
    }

    public final boolean f(@p4.l Context context) {
        PackageInfo packageInfo;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageParserEx.GET_SIGNING_CERTIFICATES);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            }
            if (i5 >= 28) {
                signingInfo = packageInfo.signingInfo;
                signatureArr = signingInfo.getApkContentsSigners();
                kotlin.jvm.internal.l0.m(signatureArr);
            } else {
                signatureArr = packageInfo.signatures;
                kotlin.jvm.internal.l0.m(signatureArr);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest();
                kotlin.jvm.internal.l0.o(digest, "digest(...)");
                if (kotlin.jvm.internal.l0.g(a(digest), com.yuanqi.master.config.c.f14523c)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
        }
        return false;
    }

    public final boolean g() {
        boolean K1;
        boolean K12;
        boolean K13;
        String str = Build.MANUFACTURER;
        K1 = kotlin.text.e0.K1(str, "HUAWEI", true);
        if (K1) {
            return true;
        }
        K12 = kotlin.text.e0.K1(str, "xiaomi", true);
        if (K12) {
            return true;
        }
        K13 = kotlin.text.e0.K1(str, "honor", true);
        if (K13) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        boolean K1;
        K1 = kotlin.text.e0.K1(Build.MANUFACTURER, "honor", true);
        return K1;
    }

    public final boolean i() {
        boolean K1;
        K1 = kotlin.text.e0.K1(Build.MANUFACTURER, "HUAWEI", true);
        return K1;
    }

    public final boolean j() {
        boolean K1;
        K1 = kotlin.text.e0.K1(Build.MANUFACTURER, "xiaomi", true);
        return K1;
    }
}
