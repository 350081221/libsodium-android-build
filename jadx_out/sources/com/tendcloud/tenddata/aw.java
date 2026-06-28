package com.tendcloud.tenddata;

import android.text.TextUtils;
import com.tendcloud.tenddata.n;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11439a = "Archimedes_p";

    /* renamed from: b, reason: collision with root package name */
    private static final int f11440b = 1000000000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        try {
            n.b bVar = n.b.AES_DATA_LOCK;
            n.getFileLock(bVar.toString());
            int a5 = at.a(b());
            if (a5 == 0) {
                a5 = y.b().nextInt(1000000000);
                a(a5);
            }
            n.releaseFileLock(bVar.toString());
            return a5;
        } catch (Throwable unused) {
            n.releaseFileLock(n.b.AES_DATA_LOCK.toString());
            return 0;
        }
    }

    private static int[][] b() {
        int i5;
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            for (int i7 = 1; i7 < 4; i7++) {
                String a5 = av.a(f11439a + i7);
                if (!TextUtils.isEmpty(a5)) {
                    arrayList.add(a5);
                    i6++;
                }
            }
            int i8 = 4;
            while (true) {
                if (i8 >= 6) {
                    break;
                }
                String b5 = av.b(f11439a + i8);
                if (!TextUtils.isEmpty(b5)) {
                    arrayList.add(b5);
                    i6++;
                }
                i8++;
            }
            if (i6 < 4) {
                for (i5 = 6; i5 < 8; i5++) {
                    String c5 = av.c(ab.f11351g.getPackageName() + i5);
                    if (!TextUtils.isEmpty(c5)) {
                        arrayList.add(c5);
                    }
                }
            }
            if (arrayList.size() < 4) {
                return null;
            }
            for (int i9 = 0; i9 < 4; i9++) {
                sb.append((String) arrayList.get(i9));
            }
            return a(sb.toString(), 4, 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a(int i5) {
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList(16);
        int i9 = 0;
        do {
            int[] iArr = new int[3];
            int[] iArr2 = new int[7];
            int[] iArr3 = new int[7];
            SecureRandom b5 = y.b();
            for (int i10 = 0; i10 < 3; i10++) {
                iArr[i10] = b5.nextInt(1000);
            }
            for (int i11 = 0; i11 < 7; i11++) {
                iArr2[i11] = b5.nextInt(100);
            }
            int i12 = 0;
            while (true) {
                i6 = 1;
                if (i12 >= 7) {
                    break;
                }
                int i13 = iArr[0];
                int i14 = iArr2[i12];
                iArr3[i12] = (i13 * i14 * i14 * i14) + (iArr[1] * i14 * i14) + (iArr[2] * i14) + i5;
                arrayList.add(iArr2[i12] + "," + iArr3[i12] + ",");
                i12++;
            }
            if (a(arrayList, i5)) {
                break;
            }
            arrayList.clear();
            i9++;
        } while (i9 < 7);
        while (true) {
            i7 = 4;
            if (i6 >= 4) {
                break;
            }
            av.a(f11439a + i6, (String) arrayList.get(i6 - 1));
            i6++;
        }
        while (true) {
            if (i7 >= 6) {
                break;
            }
            av.b(f11439a + i7, (String) arrayList.get(i7 - 1));
            i7++;
        }
        for (i8 = 6; i8 < 8; i8++) {
            av.c(ab.f11351g.getPackageName() + i8, (String) arrayList.get(i8 - 1));
        }
    }

    private static boolean a(ArrayList<String> arrayList, int i5) {
        String str = "";
        for (int i6 = 0; i6 < 4; i6++) {
            try {
                str = str.concat(arrayList.get(i6));
            } catch (Throwable unused) {
                return false;
            }
        }
        return i5 == at.a(a(str, 4, 2));
    }

    private static int[][] a(String str, int i5, int i6) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i5, i6);
        String[] split = str.split(",");
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            for (int i9 = 0; i9 < i6; i9++) {
                iArr[i8][i9] = Integer.parseInt(split[i7]);
                i7++;
            }
        }
        return iArr;
    }
}
