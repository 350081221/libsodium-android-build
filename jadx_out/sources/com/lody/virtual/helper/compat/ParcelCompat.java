package com.lody.virtual.helper.compat;

import android.os.Parcel;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class ParcelCompat {
    private static final int VAL_BOOLEAN = 9;
    private static final int VAL_BOOLEANARRAY = 23;
    private static final int VAL_BUNDLE = 3;
    private static final int VAL_BYTE = 20;
    private static final int VAL_BYTEARRAY = 13;
    private static final int VAL_CHARSEQUENCE = 10;
    private static final int VAL_CHARSEQUENCEARRAY = 24;
    private static final int VAL_DOUBLE = 8;
    private static final int VAL_DOUBLEARRAY = 28;
    private static final int VAL_FLOAT = 7;
    private static final int VAL_IBINDER = 15;
    private static final int VAL_INTARRAY = 18;
    private static final int VAL_INTEGER = 1;
    private static final int VAL_LIST = 11;
    private static final int VAL_LONG = 6;
    private static final int VAL_LONGARRAY = 19;
    private static final int VAL_MAP = 2;
    private static final int VAL_NULL = -1;
    private static final int VAL_OBJECTARRAY = 17;
    private static final int VAL_PARCELABLE = 4;
    private static final int VAL_PARCELABLEARRAY = 16;
    private static final int VAL_PERSISTABLEBUNDLE = 25;
    private static final int VAL_SERIALIZABLE = 21;
    private static final int VAL_SHORT = 5;
    private static final int VAL_SIZE = 26;
    private static final int VAL_SIZEF = 27;
    private static final int VAL_SPARSEARRAY = 12;
    private static final int VAL_SPARSEBOOLEANARRAY = 22;
    private static final int VAL_STRING = 0;
    private static final int VAL_STRINGARRAY = 14;
    private final Parcel parcel;

    public ParcelCompat(Parcel parcel) {
        this.parcel = parcel;
    }

    private void readSparseArrayInternal(@NonNull SparseArray sparseArray, int i5, @Nullable ClassLoader classLoader) {
        while (i5 > 0) {
            sparseArray.append(this.parcel.readInt(), readValue(classLoader));
            i5--;
        }
    }

    public final <T> SparseArray<T> readSparseArray(@Nullable ClassLoader classLoader) {
        int readInt = this.parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(readInt);
        readSparseArrayInternal(sparseArray, readInt, classLoader);
        return sparseArray;
    }

    @Nullable
    public final Object readValue(@Nullable ClassLoader classLoader) {
        int readInt = this.parcel.readInt();
        switch (readInt) {
            case -1:
                return null;
            case 0:
                return this.parcel.readString();
            case 1:
                return Integer.valueOf(this.parcel.readInt());
            case 2:
                return this.parcel.readHashMap(classLoader);
            case 3:
                return this.parcel.readBundle(classLoader);
            case 4:
                return this.parcel.readParcelable(classLoader);
            case 5:
                return Short.valueOf((short) this.parcel.readInt());
            case 6:
                return Long.valueOf(this.parcel.readLong());
            case 7:
                return Float.valueOf(this.parcel.readFloat());
            case 8:
                return Double.valueOf(this.parcel.readDouble());
            case 9:
                boolean z4 = true;
                if (this.parcel.readInt() != 1) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 10:
            case 14:
            case 24:
            default:
                throw new RuntimeException("Parcel " + this + ": Unmarshalling unknown type code " + readInt + " at offset " + (this.parcel.dataPosition() - 4));
            case 11:
                return this.parcel.readArrayList(classLoader);
            case 12:
                return readSparseArray(classLoader);
            case 13:
                return this.parcel.createByteArray();
            case 15:
                return this.parcel.readStrongBinder();
            case 16:
                return this.parcel.readParcelableArray(classLoader);
            case 17:
                return this.parcel.readArray(classLoader);
            case 18:
                return this.parcel.createIntArray();
            case 19:
                return this.parcel.createLongArray();
            case 20:
                return Byte.valueOf(this.parcel.readByte());
            case 21:
                return this.parcel.readSerializable();
            case 22:
                return this.parcel.readSparseBooleanArray();
            case 23:
                return this.parcel.createBooleanArray();
            case 25:
                return this.parcel.readPersistableBundle(classLoader);
            case 26:
                return this.parcel.readSize();
            case 27:
                return this.parcel.readSizeF();
            case 28:
                return this.parcel.createDoubleArray();
        }
    }
}
