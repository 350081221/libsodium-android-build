package com.bytedance.pangle;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.pangle.d;

/* loaded from: classes2.dex */
public interface c extends IInterface {
    void a(int i5);

    void a(int i5, d dVar);

    boolean a(String str);

    boolean a(String str, String str2);

    int b(String str);

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, "com.bytedance.pangle.IPackageManager");
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.pangle.IPackageManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0116a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            d c0117a;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                if (i5 != 1598968902) {
                                    return super.onTransact(i5, parcel, parcel2, i6);
                                }
                                parcel2.writeString("com.bytedance.pangle.IPackageManager");
                                return true;
                            }
                            parcel.enforceInterface("com.bytedance.pangle.IPackageManager");
                            a(parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.pangle.IPackageManager");
                        int readInt = parcel.readInt();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            c0117a = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.bytedance.pangle.IPluginInstallListener");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                                c0117a = (d) queryLocalInterface;
                            } else {
                                c0117a = new d.a.C0117a(readStrongBinder);
                            }
                        }
                        a(readInt, c0117a);
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.pangle.IPackageManager");
                    boolean a5 = a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a5 ? 1 : 0);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.pangle.IPackageManager");
                int b5 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(b5);
                return true;
            }
            parcel.enforceInterface("com.bytedance.pangle.IPackageManager");
            boolean a6 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(a6 ? 1 : 0);
            return true;
        }

        public static c a() {
            return C0116a.f4269a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.pangle.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0116a implements c {

            /* renamed from: a, reason: collision with root package name */
            public static c f4269a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f4270b;

            C0116a(IBinder iBinder) {
                this.f4270b = iBinder;
            }

            @Override // com.bytedance.pangle.c
            public final boolean a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPackageManager");
                    obtain.writeString(str);
                    if (!this.f4270b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4270b;
            }

            @Override // com.bytedance.pangle.c
            public final int b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPackageManager");
                    obtain.writeString(str);
                    if (!this.f4270b.transact(2, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().b(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.pangle.c
            public final boolean a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPackageManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f4270b.transact(3, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.pangle.c
            public final void a(int i5, d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPackageManager");
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    if (!this.f4270b.transact(4, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(i5, dVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.pangle.c
            public final void a(int i5) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IPackageManager");
                    obtain.writeInt(i5);
                    if (!this.f4270b.transact(5, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
