package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class ca {

    /* renamed from: c, reason: collision with root package name */
    private static volatile ca f11578c = new ca();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f11580b = new LinkedBlockingQueue<>(1);

    /* renamed from: a, reason: collision with root package name */
    ServiceConnection f11579a = new ServiceConnection() { // from class: com.tendcloud.tenddata.ca.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ca.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ca.this.f11580b.size() > 0) {
                            ca.this.f11580b.clear();
                        }
                        ca.this.f11580b.put(iBinder);
                    } catch (Throwable unused) {
                    }
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* loaded from: classes3.dex */
    public static final class a implements IInterface {
        private IBinder iBinder;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.iBinder;
        }

        public String getOAID() {
            Parcel obtain;
            Parcel obtain2;
            String str = null;
            try {
                obtain = Parcel.obtain();
                obtain2 = Parcel.obtain();
            } catch (Throwable unused) {
            }
            try {
                try {
                    obtain.writeInterfaceToken(s.b.f22321a);
                    this.iBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readString();
                } catch (Throwable unused2) {
                    obtain.recycle();
                    obtain2.recycle();
                }
                return str;
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }

        private a(IBinder iBinder) {
            this.iBinder = iBinder;
        }
    }

    private ca() {
    }

    public static String b(Context context) {
        if (a(context, "com.huawei.hwid")) {
            return "com.huawei.hwid";
        }
        String str = PackageConstants.SERVICES_PACKAGE_ALL_SCENE;
        if (!a(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
            str = "com.huawei.hwid.tv";
            if (!a(context, "com.huawei.hwid.tv")) {
                return "com.huawei.hwid";
            }
        }
        return str;
    }

    public static void bindHWServiceGetOAID(Context context) {
        f11578c.c(context);
    }

    private void c(Context context) {
        try {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(b(context));
            if (context.bindService(intent, this.f11579a, 1)) {
                try {
                    df.a().setOAID(new a(this.f11580b.take()).getOAID());
                } catch (Throwable unused) {
                }
                context.unbindService(this.f11579a);
            }
        } catch (Throwable unused2) {
        }
    }

    public static boolean a(Context context) {
        try {
            if (bx.b() || bx.c()) {
                return !TextUtils.isEmpty(b(context));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static PackageInfo b(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean a(Context context, String str) {
        return b(context, str) != null;
    }
}
