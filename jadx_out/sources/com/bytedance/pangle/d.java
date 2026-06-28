package com.bytedance.pangle;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface d extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.pangle.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0117a implements d {

            /* renamed from: a, reason: collision with root package name */
            public static d f4312a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f4313b;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0117a(IBinder iBinder) {
                this.f4313b = iBinder;
            }

            @Override // com.bytedance.pangle.d
            public final void a(String str, int i5, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPluginInstallListener");
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (!this.f4313b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(str, i5, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4313b;
            }
        }

        public a() {
            attachInterface(this, "com.bytedance.pangle.IPluginInstallListener");
        }

        public static d a() {
            return C0117a.f4312a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.bytedance.pangle.IPluginInstallListener");
                return true;
            }
            parcel.enforceInterface("com.bytedance.pangle.IPluginInstallListener");
            a(parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void a(String str, int i5, String str2);
}
