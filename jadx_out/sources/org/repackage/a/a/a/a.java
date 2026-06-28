package org.repackage.a.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: org.repackage.a.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractBinderC0656a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0657a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f22096a;

            public C0657a(IBinder iBinder) {
                this.f22096a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f22096a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22096a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0657a(iBinder);
        }
    }
}
