package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.y1;

/* loaded from: classes3.dex */
public class cj {

    /* renamed from: b, reason: collision with root package name */
    private static String f11596b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile cj f11597c = new cj();

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f11598a = new LinkedBlockingQueue<>(1);

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f11599d = new ServiceConnection() { // from class: com.tendcloud.tenddata.cj.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.cj.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (cj.this.f11598a.size() > 0) {
                            cj.this.f11598a.clear();
                        }
                        cj.this.f11598a.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements IInterface {
        private IBinder mIBinder;

        a(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        String getSerID(String str, String str2, String str3) {
            String str4 = null;
            try {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mIBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str4 = obtain2.readString();
                } catch (Throwable unused) {
                }
                obtain.recycle();
                obtain2.recycle();
            } catch (Throwable unused2) {
            }
            return str4;
        }
    }

    private cj() {
    }

    private void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (context.bindService(intent, this.f11599d, 1)) {
                a aVar = new a(this.f11598a.take());
                try {
                    df.a().setOAID(a("OUID", context, aVar));
                } catch (Throwable unused) {
                }
                try {
                    df.a().setVAID(a("DUID", context, aVar));
                } catch (Throwable unused2) {
                }
                try {
                    df.a().setAAID(a("AUID", context, aVar));
                } catch (Throwable unused3) {
                }
                context.unbindService(this.f11599d);
            }
        } catch (Throwable unused4) {
        }
    }

    public static void bindOPPOServiceGetOAID(Context context) {
        f11597c.b(context);
    }

    public static boolean a(Context context) {
        PackageInfo packageInfo;
        try {
            if (bx.d() && (packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0)) != null) {
                return packageInfo.versionCode >= 1;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String a(String str, Context context, a aVar) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        if (f11596b == null) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Throwable unused) {
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
                } catch (Throwable unused2) {
                }
            }
            f11596b = str2;
        }
        return aVar.getSerID(packageName, f11596b, str);
    }
}
