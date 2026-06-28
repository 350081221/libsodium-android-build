package com.bytedance.pangle;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.pangle.g;

/* loaded from: classes2.dex */
public interface e extends IInterface {
    ComponentName a(Intent intent, String str);

    void a(g gVar);

    boolean a(Intent intent, g gVar, int i5, String str);

    boolean b(Intent intent, String str);

    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements e {
        public a() {
            attachInterface(this, "com.bytedance.pangle.IServiceManager");
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.pangle.IServiceManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                return (e) queryLocalInterface;
            }
            return new C0118a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            Intent intent = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 1598968902) {
                                return super.onTransact(i5, parcel, parcel2, i6);
                            }
                            parcel2.writeString("com.bytedance.pangle.IServiceManager");
                            return true;
                        }
                        parcel.enforceInterface("com.bytedance.pangle.IServiceManager");
                        a(g.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface("com.bytedance.pangle.IServiceManager");
                    if (parcel.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                    }
                    boolean a5 = a(intent, g.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a5 ? 1 : 0);
                    return true;
                }
                parcel.enforceInterface("com.bytedance.pangle.IServiceManager");
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                boolean b5 = b(intent, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(b5 ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.bytedance.pangle.IServiceManager");
            if (parcel.readInt() != 0) {
                intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            }
            ComponentName a6 = a(intent, parcel.readString());
            parcel2.writeNoException();
            if (a6 != null) {
                parcel2.writeInt(1);
                a6.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        public static e a() {
            return C0118a.f4339a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.pangle.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0118a implements e {

            /* renamed from: a, reason: collision with root package name */
            public static e f4339a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f4340b;

            C0118a(IBinder iBinder) {
                this.f4340b = iBinder;
            }

            @Override // com.bytedance.pangle.e
            public final ComponentName a(Intent intent, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IServiceManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.f4340b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(intent, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4340b;
            }

            @Override // com.bytedance.pangle.e
            public final boolean b(Intent intent, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IServiceManager");
                    boolean z4 = true;
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.f4340b.transact(2, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().b(intent, str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.pangle.e
            public final boolean a(Intent intent, g gVar, int i5, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IServiceManager");
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.f4340b.transact(3, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(intent, gVar, i5, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.pangle.e
            public final void a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.pangle.IServiceManager");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    if (!this.f4340b.transact(4, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(gVar);
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
