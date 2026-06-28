package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.y1;
import o.a;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public o.a f20821a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f20822b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f20823c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20824d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public ServiceConnection f20825e = new a();

    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.this.f20821a = a.AbstractBinderC0624a.a(iBinder);
            synchronized (c.this.f20824d) {
                c.this.f20824d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.f20821a = null;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f20827a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
    }

    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f20821a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f20825e, 1)) {
                    synchronized (this.f20824d) {
                        try {
                            this.f20824d.wait(a1.b.f90a);
                        } catch (InterruptedException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
                if (this.f20821a == null) {
                    return "";
                }
                try {
                    return c(context, str);
                } catch (RemoteException e6) {
                    e6.printStackTrace();
                    return "";
                }
            }
            try {
                return c(context, str);
            } catch (RemoteException e7) {
                e7.printStackTrace();
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }

    public boolean b(Context context) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                if (packageInfo == null) {
                    return false;
                }
                longVersionCode = packageInfo.getLongVersionCode();
                if (longVersionCode < 1) {
                    return false;
                }
                return true;
            }
            if (packageInfo == null || packageInfo.versionCode < 1) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f20822b)) {
            this.f20822b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f20823c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f20822b, 64).signatures;
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
            this.f20823c = str2;
        }
        String a5 = ((a.AbstractBinderC0624a.C0625a) this.f20821a).a(this.f20822b, this.f20823c, str);
        if (TextUtils.isEmpty(a5)) {
            return "";
        }
        return a5;
    }
}
