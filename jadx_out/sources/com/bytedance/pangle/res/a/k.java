package com.bytedance.pangle.res.a;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(g gVar) {
        return (int) gVar.f4572a.a().b();
    }

    private static byte[] a(int i5) {
        return new byte[]{(byte) (i5 >> 0), (byte) (i5 >> 8), (byte) (i5 >> 16), (byte) (i5 >> 24)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i5, int i6, h hVar) {
        if (i5 < 2130706432) {
            return i5;
        }
        int a5 = hVar.a(i5);
        byte[] a6 = a(a5);
        bArr[i6] = a6[0];
        bArr[i6 + 1] = a6[1];
        bArr[i6 + 2] = a6[2];
        bArr[i6 + 3] = a6[3];
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, h hVar) {
        b bVar = new b(bArr, hVar);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        bVar.a();
        bVar.f4548c = new g(new i(new e(byteArrayInputStream)));
        do {
        } while (bVar.b() != 1);
    }

    public static void a(int i5, byte[] bArr, int[] iArr, int i6, HashMap<Integer, Integer> hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        int i7 = -1;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = i8 * 5;
            int i10 = iArr[i9 + 1];
            if (hashMap.containsKey(Integer.valueOf(i10))) {
                if (i7 == -1) {
                    i7 = i8;
                }
                int i11 = (i9 * 4) + i5;
                hashMap2.put(Integer.valueOf(i8), Arrays.copyOfRange(bArr, i11, i11 + 20));
                hashMap3.put(Integer.valueOf(hashMap.get(Integer.valueOf(i10)).intValue()), Integer.valueOf(i8));
            }
        }
        ArrayList arrayList = new ArrayList(hashMap3.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) hashMap2.get(Integer.valueOf(((Integer) hashMap3.get((Integer) it.next())).intValue()));
            System.arraycopy(bArr2, 0, bArr, ((i12 + i7) * 5 * 4) + i5, bArr2.length);
            i12++;
        }
    }
}
