package com.umeng.analytics.pro;

import java.util.BitSet;

/* loaded from: classes3.dex */
public final class cw extends ck {

    /* loaded from: classes3.dex */
    public static class a implements cs {
        @Override // com.umeng.analytics.pro.cs
        public cq a(de deVar) {
            return new cw(deVar);
        }
    }

    public cw(de deVar) {
        super(deVar);
    }

    @Override // com.umeng.analytics.pro.cq
    public Class<? extends cy> D() {
        return db.class;
    }

    public void a(BitSet bitSet, int i5) throws bx {
        for (byte b5 : b(bitSet, i5)) {
            a(b5);
        }
    }

    public BitSet b(int i5) throws bx {
        int ceil = (int) Math.ceil(i5 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i6 = 0; i6 < ceil; i6++) {
            bArr[i6] = u();
        }
        return a(bArr);
    }

    public static BitSet a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i5 = 0; i5 < bArr.length * 8; i5++) {
            if ((bArr[(bArr.length - (i5 / 8)) - 1] & (1 << (i5 % 8))) > 0) {
                bitSet.set(i5);
            }
        }
        return bitSet;
    }

    public static byte[] b(BitSet bitSet, int i5) {
        int ceil = (int) Math.ceil(i5 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i6 = 0; i6 < bitSet.length(); i6++) {
            if (bitSet.get(i6)) {
                int i7 = (ceil - (i6 / 8)) - 1;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        return bArr;
    }
}
