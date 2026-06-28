package com.bytedance.pangle.res.a;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class g extends f {
    public g(i iVar) {
        super(iVar);
    }

    public final int[] a(int i5) {
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            iArr[i6] = readInt();
        }
        return iArr;
    }

    public final void b() {
        byte readByte = readByte();
        if (readByte != 0) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", (byte) 0, Byte.valueOf(readByte)));
        }
    }

    @Override // com.bytedance.pangle.res.a.f, java.io.DataInput
    public final int skipBytes(int i5) {
        int i6 = 0;
        while (i6 < i5) {
            int skipBytes = super.skipBytes(i5 - i6);
            if (skipBytes <= 0) {
                break;
            }
            i6 += skipBytes;
        }
        return i6;
    }

    public final void a() {
        short readShort = readShort();
        if (readShort != 8) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", (short) 8, Short.valueOf(readShort)));
        }
    }

    public final void b(int i5) {
        int readInt;
        while (true) {
            readInt = readInt();
            if (readInt != i5 && readInt >= 1835009) {
                break;
            } else {
                i5 = -1;
            }
        }
        if (readInt != 1835009) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", 1835009, Integer.valueOf(readInt)));
        }
    }
}
