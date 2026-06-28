package com.android.dx.io.instructions;

import kotlin.y1;

/* loaded from: classes2.dex */
public final class ShortArrayCodeOutput extends BaseCodeCursor implements CodeOutput {
    private final short[] array;

    public ShortArrayCodeOutput(int i5) {
        if (i5 >= 0) {
            this.array = new short[i5];
            return;
        }
        throw new IllegalArgumentException("maxSize < 0");
    }

    public short[] getArray() {
        int cursor = cursor();
        short[] sArr = this.array;
        if (cursor == sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[cursor];
        System.arraycopy(sArr, 0, sArr2, 0, cursor);
        return sArr2;
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s5) {
        this.array[cursor()] = s5;
        advance(1);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeInt(int i5) {
        write((short) i5);
        write((short) (i5 >> 16));
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeLong(long j5) {
        write((short) j5);
        write((short) (j5 >> 16));
        write((short) (j5 >> 32));
        write((short) (j5 >> 48));
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s5, short s6) {
        write(s5);
        write(s6);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s5, short s6, short s7) {
        write(s5);
        write(s6);
        write(s7);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s5, short s6, short s7, short s8) {
        write(s5);
        write(s6);
        write(s7);
        write(s8);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s5, short s6, short s7, short s8, short s9) {
        write(s5);
        write(s6);
        write(s7);
        write(s8);
        write(s9);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(byte[] bArr) {
        int i5 = 0;
        boolean z4 = true;
        for (byte b5 : bArr) {
            if (z4) {
                i5 = b5 & y1.f19838d;
                z4 = false;
            } else {
                int i6 = (b5 << 8) | i5;
                write((short) i6);
                i5 = i6;
                z4 = true;
            }
        }
        if (z4) {
            return;
        }
        write((short) i5);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short[] sArr) {
        for (short s5 : sArr) {
            write(s5);
        }
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(int[] iArr) {
        for (int i5 : iArr) {
            writeInt(i5);
        }
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(long[] jArr) {
        for (long j5 : jArr) {
            writeLong(j5);
        }
    }
}
