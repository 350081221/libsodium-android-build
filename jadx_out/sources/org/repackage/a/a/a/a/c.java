package org.repackage.a.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.y1;
import org.repackage.a.a.a.a;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public org.repackage.a.a.a.a f22098a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f22099b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f22100c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22101d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public ServiceConnection f22102e = new b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f22103a = new c(null);
    }

    public /* synthetic */ c(b bVar) {
    }

    public boolean a(Context context) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo != null && packageInfo.versionCode >= 1;
            }
            if (packageInfo == null) {
                return false;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode >= 1;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public final String b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f22099b)) {
            this.f22099b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f22100c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f22099b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b5 : digest) {
                            sb.append(Integer.toHexString((b5 & y1.f19838d) | 256).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e6) {
                    e6.printStackTrace();
                }
            }
            this.f22100c = str2;
        }
        String a5 = ((a.AbstractBinderC0656a.C0657a) this.f22098a).a(this.f22099b, this.f22100c, str);
        if (TextUtils.isEmpty(a5)) {
            return "";
        }
        return a5;
    }

    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f22098a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f22102e, 1)) {
                    synchronized (this.f22101d) {
                        try {
                            this.f22101d.wait(a1.b.f90a);
                        } catch (InterruptedException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
                if (this.f22098a == null) {
                    return "";
                }
                try {
                    return b(context, str);
                } catch (RemoteException e6) {
                    e6.printStackTrace();
                    return "";
                }
            }
            try {
                return b(context, str);
            } catch (RemoteException e7) {
                e7.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }
}
