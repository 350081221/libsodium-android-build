package com.huawei.hms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes3.dex */
public class SafeParcelWriter {
    private static final int BIT16_MARK = 65535;
    private static final int FIELD_ID_CHECKER = 20293;
    private static final int NEGATIVE_MARK = -65536;
    private static final int OFFSET16 = 16;

    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return getStartPosition(parcel, FIELD_ID_CHECKER);
    }

    public static void finishObjectHeader(Parcel parcel, int i5) {
        handleDataOver(parcel, i5);
    }

    private static int getStartPosition(Parcel parcel, int i5) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void handleDataOver(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(dataPosition - i5);
        parcel.setDataPosition(dataPosition);
    }

    private static void setHeader(Parcel parcel, int i5, int i6) {
        if (i6 >= 65535) {
            parcel.writeInt(i5 | (-65536));
            parcel.writeInt(i6);
        } else {
            parcel.writeInt(i5 | (i6 << 16));
        }
    }

    private static <P extends Parcelable> void setSizeOfData(Parcel parcel, P p5, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        p5.writeToParcel(parcel, i5);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void writeBigDecimal(Parcel parcel, int i5, BigDecimal bigDecimal, boolean z4) {
        if (bigDecimal != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i5, BigDecimal[] bigDecimalArr, boolean z4) {
        if (bigDecimalArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            int length = bigDecimalArr.length;
            parcel.writeInt(length);
            for (int i6 = 0; i6 < length; i6++) {
                parcel.writeByteArray(bigDecimalArr[i6].unscaledValue().toByteArray());
                parcel.writeInt(bigDecimalArr[i6].scale());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBigInteger(Parcel parcel, int i5, BigInteger bigInteger, boolean z4) {
        if (bigInteger != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeByteArray(bigInteger.toByteArray());
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i5, BigInteger[] bigIntegerArr, boolean z4) {
        if (bigIntegerArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeInt(bigIntegerArr.length);
            for (BigInteger bigInteger : bigIntegerArr) {
                parcel.writeByteArray(bigInteger.toByteArray());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBoolean(Parcel parcel, int i5, boolean z4) {
        setHeader(parcel, i5, 4);
        if (z4) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void writeBooleanArray(Parcel parcel, int i5, boolean[] zArr, boolean z4) {
        if (zArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeBooleanArray(zArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i5, List<Boolean> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(list.get(i6).booleanValue() ? 1 : 0);
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBooleanObject(Parcel parcel, int i5, Boolean bool, boolean z4) {
        if (bool != null) {
            setHeader(parcel, i5, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i5, Bundle bundle, boolean z4) {
        if (bundle != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeBundle(bundle);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeByte(Parcel parcel, int i5, byte b5) {
        setHeader(parcel, i5, 4);
        parcel.writeInt(b5);
    }

    public static void writeByteArray(Parcel parcel, int i5, byte[] bArr, boolean z4) {
        if (bArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeByteArray(bArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i5, byte[][] bArr, boolean z4) {
        if (bArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i5, SparseArray<byte[]> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                parcel.writeByteArray(sparseArray.valueAt(i6));
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeChar(Parcel parcel, int i5, char c5) {
        setHeader(parcel, i5, 4);
        parcel.writeInt(c5);
    }

    public static void writeCharArray(Parcel parcel, int i5, char[] cArr, boolean z4) {
        if (cArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeCharArray(cArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeDouble(Parcel parcel, int i5, double d5) {
        setHeader(parcel, i5, 8);
        parcel.writeDouble(d5);
    }

    public static void writeDoubleArray(Parcel parcel, int i5, double[] dArr, boolean z4) {
        if (dArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeDoubleArray(dArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i5, List<Double> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeDouble(list.get(i6).doubleValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeDoubleObject(Parcel parcel, int i5, Double d5, boolean z4) {
        if (d5 != null) {
            setHeader(parcel, i5, 8);
            parcel.writeDouble(d5.doubleValue());
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i5, SparseArray<Double> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                parcel.writeDouble(sparseArray.valueAt(i6).doubleValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeFloat(Parcel parcel, int i5, float f5) {
        setHeader(parcel, i5, 4);
        parcel.writeFloat(f5);
    }

    public static void writeFloatArray(Parcel parcel, int i5, float[] fArr, boolean z4) {
        if (fArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeFloatArray(fArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeFloatList(Parcel parcel, int i5, List<Float> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeFloat(list.get(i6).floatValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeFloatObject(Parcel parcel, int i5, Float f5, boolean z4) {
        if (f5 != null) {
            setHeader(parcel, i5, 4);
            parcel.writeFloat(f5.floatValue());
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i5, SparseArray<Float> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                parcel.writeFloat(sparseArray.valueAt(i6).floatValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIBinder(Parcel parcel, int i5, IBinder iBinder, boolean z4) {
        if (iBinder != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeStrongBinder(iBinder);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i5, IBinder[] iBinderArr, boolean z4) {
        if (iBinderArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeBinderArray(iBinderArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i5, List<IBinder> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeBinderList(list);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i5, SparseArray<IBinder> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                parcel.writeStrongBinder(sparseArray.valueAt(i6));
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeInt(Parcel parcel, int i5, int i6) {
        setHeader(parcel, i5, 4);
        parcel.writeInt(i6);
    }

    public static void writeIntArray(Parcel parcel, int i5, int[] iArr, boolean z4) {
        if (iArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeIntArray(iArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i5, List<Integer> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(list.get(i6).intValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeIntegerObject(Parcel parcel, int i5, Integer num, boolean z4) {
        if (num != null) {
            setHeader(parcel, i5, 4);
            parcel.writeInt(num.intValue());
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeList(Parcel parcel, int i5, List list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeList(list);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeLong(Parcel parcel, int i5, long j5) {
        setHeader(parcel, i5, 8);
        parcel.writeLong(j5);
    }

    public static void writeLongArray(Parcel parcel, int i5, long[] jArr, boolean z4) {
        if (jArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeLongArray(jArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeLongList(Parcel parcel, int i5, List<Long> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeLong(list.get(i6).longValue());
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeLongObject(Parcel parcel, int i5, Long l5, boolean z4) {
        if (l5 != null) {
            setHeader(parcel, i5, 8);
            parcel.writeLong(l5.longValue());
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i5, Parcel parcel2, boolean z4) {
        if (parcel2 != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i5, Parcel[] parcelArr, boolean z4) {
        if (parcelArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            int length = parcelArr.length;
            parcel.writeInt(length);
            for (int i6 = 0; i6 < length; i6++) {
                Parcel parcel2 = parcelArr[i6];
                if (parcel2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(parcel2.dataSize());
                    Parcel parcel3 = parcelArr[i6];
                    parcel.appendFrom(parcel3, 0, parcel3.dataSize());
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeParcelList(Parcel parcel, int i5, List<Parcel> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                Parcel parcel2 = list.get(i6);
                if (parcel2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(parcel2.dataSize());
                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeParcelSparseArray(Parcel parcel, int i5, SparseArray<Parcel> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                Parcel valueAt = sparseArray.valueAt(i6);
                if (valueAt == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(valueAt.dataSize());
                    parcel.appendFrom(valueAt, 0, valueAt.dataSize());
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeParcelable(Parcel parcel, int i5, Parcelable parcelable, int i6, boolean z4) {
        if (parcelable != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcelable.writeToParcel(parcel, i6);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeShort(Parcel parcel, int i5, short s5) {
        setHeader(parcel, i5, 4);
        parcel.writeInt(s5);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i5, SparseBooleanArray sparseBooleanArray, boolean z4) {
        if (sparseBooleanArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i5, SparseIntArray sparseIntArray, boolean z4) {
        if (sparseIntArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseIntArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseIntArray.keyAt(i6));
                parcel.writeInt(sparseIntArray.valueAt(i6));
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeSparseLongArray(Parcel parcel, int i5, SparseLongArray sparseLongArray, boolean z4) {
        if (sparseLongArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseLongArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseLongArray.keyAt(i6));
                parcel.writeLong(sparseLongArray.valueAt(i6));
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeString(Parcel parcel, int i5, String str, boolean z4) {
        if (str != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeString(str);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeStringArray(Parcel parcel, int i5, String[] strArr, boolean z4) {
        if (strArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeStringArray(strArr);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeStringList(Parcel parcel, int i5, List<String> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeStringList(list);
            handleDataOver(parcel, startPosition);
        } else if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i5, SparseArray<String> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                parcel.writeString(sparseArray.valueAt(i6));
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel parcel, int i5, P[] pArr, int i6, boolean z4) {
        if (pArr != null) {
            int startPosition = getStartPosition(parcel, i5);
            parcel.writeInt(startPosition);
            for (P p5 : pArr) {
                if (p5 != null) {
                    setSizeOfData(parcel, p5, i6);
                } else {
                    parcel.writeInt(0);
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i5, List<T> list, boolean z4) {
        if (list != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = list.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                T t5 = list.get(i6);
                if (t5 != null) {
                    setSizeOfData(parcel, t5, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i5, SparseArray<T> sparseArray, boolean z4) {
        if (sparseArray != null) {
            int startPosition = getStartPosition(parcel, i5);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(sparseArray.keyAt(i6));
                T valueAt = sparseArray.valueAt(i6);
                if (valueAt != null) {
                    setSizeOfData(parcel, valueAt, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
            handleDataOver(parcel, startPosition);
            return;
        }
        if (z4) {
            setHeader(parcel, i5, 0);
        }
    }
}
