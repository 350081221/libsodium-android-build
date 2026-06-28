package com.ss.android.socialbase.downloader.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public interface b extends IInterface {
    void a(Map map, Map map2) throws RemoteException;

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.ss.android.socialbase.downloader.b.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0197a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static b f10417a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f10418b;

            C0197a(IBinder iBinder) {
                this.f10418b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.b.b
            public void a(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (!this.f10418b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        a.a().a(map, map2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10418b;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0197a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            ClassLoader classLoader = getClass().getClassLoader();
            a(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
            parcel2.writeNoException();
            return true;
        }

        public static b a() {
            return C0197a.f10417a;
        }
    }
}
