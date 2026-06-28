package com.lody.virtual.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class VParceledListSlice<T extends Parcelable> implements Parcelable {
    private static final int MAX_FIRST_IPC_SIZE = 131072;
    private static final int MAX_IPC_SIZE = 262144;
    private final List<T> mList;
    public static final Parcelable.ClassLoaderCreator<VParceledListSlice> CREATOR = new Parcelable.ClassLoaderCreator<VParceledListSlice>() { // from class: com.lody.virtual.remote.VParceledListSlice.1
        @Override // android.os.Parcelable.Creator
        public VParceledListSlice[] newArray(int i5) {
            return new VParceledListSlice[i5];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public VParceledListSlice createFromParcel(Parcel parcel) {
            return new VParceledListSlice(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public VParceledListSlice createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new VParceledListSlice(parcel, classLoader);
        }
    };
    private static String TAG = "ParceledListSlice";
    private static boolean DEBUG = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static void verifySameType(Class<?> cls, Class<?> cls2) {
        if (cls2.equals(cls)) {
            return;
        }
        throw new IllegalArgumentException("Can't unparcel type " + cls2.getName() + " in list of type " + cls.getName());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.mList.size(); i6++) {
            i5 |= this.mList.get(i6).describeContents();
        }
        return i5;
    }

    public List<T> getList() {
        return this.mList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, final int i5) {
        final int size = this.mList.size();
        parcel.writeInt(size);
        if (DEBUG) {
            Log.d(TAG, "Writing " + size + " items");
        }
        if (size > 0) {
            final Class<?> cls = this.mList.get(0).getClass();
            int i6 = 0;
            while (i6 < size && parcel.dataSize() < 131072) {
                parcel.writeInt(1);
                T t5 = this.mList.get(i6);
                if (t5 == null) {
                    parcel.writeString(null);
                } else {
                    verifySameType(cls, t5.getClass());
                    parcel.writeParcelable(t5, i5);
                }
                if (DEBUG) {
                    Log.d(TAG, "Wrote inline #" + i6 + ": " + this.mList.get(i6));
                }
                i6++;
            }
            if (i6 < size) {
                parcel.writeInt(0);
                Binder binder = new Binder() { // from class: com.lody.virtual.remote.VParceledListSlice.2
                    @Override // android.os.Binder
                    protected boolean onTransact(int i7, Parcel parcel2, Parcel parcel3, int i8) throws RemoteException {
                        if (i7 != 1) {
                            return super.onTransact(i7, parcel2, parcel3, i8);
                        }
                        int readInt = parcel2.readInt();
                        if (VParceledListSlice.DEBUG) {
                            Log.d(VParceledListSlice.TAG, "Writing more @" + readInt + " of " + size);
                        }
                        while (readInt < size && parcel3.dataSize() < 262144) {
                            parcel3.writeInt(1);
                            Parcelable parcelable = (Parcelable) VParceledListSlice.this.mList.get(readInt);
                            VParceledListSlice.verifySameType(cls, parcelable.getClass());
                            parcel3.writeParcelable(parcelable, i5);
                            if (VParceledListSlice.DEBUG) {
                                Log.d(VParceledListSlice.TAG, "Wrote extra #" + readInt + ": " + VParceledListSlice.this.mList.get(readInt));
                            }
                            readInt++;
                        }
                        if (readInt < size) {
                            if (VParceledListSlice.DEBUG) {
                                Log.d(VParceledListSlice.TAG, "Breaking @" + readInt + " of " + size);
                            }
                            parcel3.writeInt(0);
                        }
                        return true;
                    }
                };
                if (DEBUG) {
                    Log.d(TAG, "Breaking @" + i6 + " of " + size + ": retriever=" + binder);
                }
                parcel.writeStrongBinder(binder);
            }
        }
    }

    public VParceledListSlice(List<T> list) {
        this.mList = list;
    }

    private VParceledListSlice(Parcel parcel, ClassLoader classLoader) {
        classLoader = classLoader == null ? VParceledListSlice.class.getClassLoader() : classLoader;
        int readInt = parcel.readInt();
        this.mList = new ArrayList(readInt);
        if (DEBUG) {
            Log.d(TAG, "Retrieving " + readInt + " items");
        }
        if (readInt <= 0) {
            return;
        }
        Class<?> cls = null;
        int i5 = 0;
        while (i5 < readInt && parcel.readInt() != 0) {
            Parcelable readParcelable = parcel.readParcelable(classLoader);
            if (cls == null) {
                cls = readParcelable.getClass();
            } else if (readParcelable != null) {
                verifySameType(cls, readParcelable.getClass());
            }
            this.mList.add(readParcelable);
            if (DEBUG) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Read inline #");
                sb.append(i5);
                sb.append(": ");
                List<T> list = this.mList;
                sb.append(list.get(list.size() - 1));
                Log.d(str, sb.toString());
            }
            i5++;
        }
        if (i5 >= readInt) {
            return;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        while (i5 < readInt) {
            if (DEBUG) {
                Log.d(TAG, "Reading more @" + i5 + " of " + readInt + ": retriever=" + readStrongBinder);
            }
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInt(i5);
            try {
                readStrongBinder.transact(1, obtain, obtain2, 0);
                while (i5 < readInt && obtain2.readInt() != 0) {
                    Parcelable readParcelable2 = obtain2.readParcelable(classLoader);
                    if (readParcelable2 != null) {
                        verifySameType(cls, readParcelable2.getClass());
                    }
                    this.mList.add(readParcelable2);
                    if (DEBUG) {
                        String str2 = TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Read extra #");
                        sb2.append(i5);
                        sb2.append(": ");
                        List<T> list2 = this.mList;
                        sb2.append(list2.get(list2.size() - 1));
                        Log.d(str2, sb2.toString());
                    }
                    i5++;
                }
                obtain2.recycle();
                obtain.recycle();
            } catch (RemoteException e5) {
                Log.w(TAG, "Failure retrieving array; only received " + i5 + " of " + readInt, e5);
                return;
            }
        }
    }
}
