package com.android.dx.util;

import com.android.dex.util.ByteOutput;

/* loaded from: classes2.dex */
public interface Output extends ByteOutput {
    void alignTo(int i5);

    void assertCursor(int i5);

    int getCursor();

    void write(ByteArray byteArray);

    void write(byte[] bArr);

    void write(byte[] bArr, int i5, int i6);

    @Override // com.android.dex.util.ByteOutput
    void writeByte(int i5);

    void writeInt(int i5);

    void writeLong(long j5);

    void writeShort(int i5);

    int writeSleb128(int i5);

    int writeUleb128(int i5);

    void writeZeroes(int i5);
}
