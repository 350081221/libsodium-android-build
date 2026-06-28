package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* loaded from: classes2.dex */
    private static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i5) {
        int[] iArr3;
        int i6;
        int i7;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i8 = 0;
        for (int i9 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i9));
            if (num == null) {
                dArr[i8] = pointProviderLab.fromInt(i9);
                iArr4[i8] = i9;
                i8++;
                linkedHashMap.put(Integer.valueOf(i9), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            iArr5[i10] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i10]))).intValue();
        }
        int min = Math.min(i5, i8);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr2.length; i12++) {
            dArr2[i12] = pointProviderLab.fromInt(iArr2[i12]);
            i11++;
        }
        int i13 = min - i11;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
            }
        }
        int[] iArr6 = new int[i8];
        for (int i15 = 0; i15 < i8; i15++) {
            iArr6[i15] = random.nextInt(min);
        }
        int[][] iArr7 = new int[min];
        for (int i16 = 0; i16 < min; i16++) {
            iArr7[i16] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min];
        for (int i17 = 0; i17 < min; i17++) {
            distanceArr[i17] = new Distance[min];
            for (int i18 = 0; i18 < min; i18++) {
                distanceArr[i17][i18] = new Distance();
            }
        }
        int[] iArr8 = new int[min];
        int i19 = 0;
        while (true) {
            if (i19 < 10) {
                int i20 = 0;
                while (i20 < min) {
                    int i21 = i20 + 1;
                    int i22 = i21;
                    while (i22 < min) {
                        int[] iArr9 = iArr8;
                        double distance = pointProviderLab.distance(dArr2[i20], dArr2[i22]);
                        Distance distance2 = distanceArr[i22][i20];
                        distance2.distance = distance;
                        distance2.index = i20;
                        Distance distance3 = distanceArr[i20][i22];
                        distance3.distance = distance;
                        distance3.index = i22;
                        i22++;
                        iArr8 = iArr9;
                    }
                    int[] iArr10 = iArr8;
                    Arrays.sort(distanceArr[i20]);
                    for (int i23 = 0; i23 < min; i23++) {
                        iArr7[i20][i23] = distanceArr[i20][i23].index;
                    }
                    iArr8 = iArr10;
                    i20 = i21;
                }
                int[] iArr11 = iArr8;
                int i24 = 0;
                int i25 = 0;
                while (i24 < i8) {
                    double[] dArr3 = dArr[i24];
                    int i26 = iArr6[i24];
                    double distance4 = pointProviderLab.distance(dArr3, dArr2[i26]);
                    int[][] iArr12 = iArr7;
                    int[] iArr13 = iArr5;
                    double d5 = distance4;
                    int i27 = -1;
                    int i28 = 0;
                    while (i28 < min) {
                        Distance[][] distanceArr2 = distanceArr;
                        int i29 = i8;
                        if (distanceArr[i26][i28].distance < 4.0d * distance4) {
                            double distance5 = pointProviderLab.distance(dArr3, dArr2[i28]);
                            if (distance5 < d5) {
                                i27 = i28;
                                d5 = distance5;
                            }
                        }
                        i28++;
                        i8 = i29;
                        distanceArr = distanceArr2;
                    }
                    Distance[][] distanceArr3 = distanceArr;
                    int i30 = i8;
                    if (i27 != -1 && Math.abs(Math.sqrt(d5) - Math.sqrt(distance4)) > 3.0d) {
                        i25++;
                        iArr6[i24] = i27;
                    }
                    i24++;
                    iArr7 = iArr12;
                    iArr5 = iArr13;
                    i8 = i30;
                    distanceArr = distanceArr3;
                }
                int[] iArr14 = iArr5;
                int[][] iArr15 = iArr7;
                Distance[][] distanceArr4 = distanceArr;
                int i31 = i8;
                if (i25 == 0 && i19 != 0) {
                    i6 = 0;
                    iArr3 = iArr11;
                    break;
                }
                double[] dArr4 = new double[min];
                double[] dArr5 = new double[min];
                double[] dArr6 = new double[min];
                char c5 = 0;
                Arrays.fill(iArr11, 0);
                int i32 = 0;
                while (true) {
                    i7 = i31;
                    if (i32 >= i7) {
                        break;
                    }
                    int i33 = iArr6[i32];
                    double[] dArr7 = dArr[i32];
                    int i34 = iArr14[i32];
                    iArr11[i33] = iArr11[i33] + i34;
                    double d6 = i34;
                    dArr4[i33] = dArr4[i33] + (dArr7[c5] * d6);
                    dArr5[i33] = dArr5[i33] + (dArr7[1] * d6);
                    dArr6[i33] = dArr6[i33] + (dArr7[2] * d6);
                    i32++;
                    i19 = i19;
                    i31 = i7;
                    c5 = 0;
                }
                int i35 = i19;
                for (int i36 = 0; i36 < min; i36++) {
                    int i37 = iArr11[i36];
                    if (i37 == 0) {
                        dArr2[i36] = new double[]{0.0d, 0.0d, 0.0d};
                    } else {
                        double d7 = i37;
                        double d8 = dArr4[i36] / d7;
                        double d9 = dArr5[i36] / d7;
                        double d10 = dArr6[i36] / d7;
                        double[] dArr8 = dArr2[i36];
                        dArr8[0] = d8;
                        dArr8[1] = d9;
                        dArr8[2] = d10;
                    }
                }
                iArr7 = iArr15;
                i19 = i35 + 1;
                iArr8 = iArr11;
                i8 = i7;
                iArr5 = iArr14;
                distanceArr = distanceArr4;
            } else {
                iArr3 = iArr8;
                i6 = 0;
                break;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i38 = i6; i38 < min; i38++) {
            int i39 = iArr3[i38];
            if (i39 != 0) {
                int i40 = pointProviderLab.toInt(dArr2[i38]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i40))) {
                    linkedHashMap2.put(Integer.valueOf(i40), Integer.valueOf(i39));
                }
            }
        }
        return linkedHashMap2;
    }
}
