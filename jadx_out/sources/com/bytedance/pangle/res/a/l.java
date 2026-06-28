package com.bytedance.pangle.res.a;

/* loaded from: classes2.dex */
public final class l {
    public static void a(g gVar) {
        int i5;
        gVar.b(0);
        int readInt = gVar.readInt();
        int readInt2 = gVar.readInt();
        int readInt3 = gVar.readInt();
        gVar.skipBytes(4);
        int readInt4 = gVar.readInt();
        int readInt5 = gVar.readInt();
        gVar.skipBytes(readInt2 * 4);
        if (readInt3 != 0) {
            gVar.skipBytes(readInt3 * 4);
        }
        if (readInt5 == 0) {
            i5 = readInt;
        } else {
            i5 = readInt5;
        }
        gVar.skipBytes(i5 - readInt4);
        if (readInt5 != 0) {
            int i6 = readInt - readInt5;
            gVar.skipBytes(i6);
            int i7 = i6 % 4;
            if (i7 <= 0) {
                return;
            }
            while (true) {
                int i8 = i7 - 1;
                if (i7 > 0) {
                    gVar.readByte();
                    i7 = i8;
                } else {
                    return;
                }
            }
        }
    }
}
