package com.bytedance.pangle.res.a;

import java.io.DataInput;

/* loaded from: classes2.dex */
public abstract class f implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final i f4572a;

    public f(i iVar) {
        this.f4572a = iVar;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        return this.f4572a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return this.f4572a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return this.f4572a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return this.f4572a.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return this.f4572a.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i5, int i6) {
        this.f4572a.readFully(bArr, i5, i6);
    }

    @Override // java.io.DataInput
    public int readInt() {
        return this.f4572a.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() {
        return this.f4572a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return this.f4572a.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() {
        return this.f4572a.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return this.f4572a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return this.f4572a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return this.f4572a.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i5) {
        return this.f4572a.skipBytes(i5);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        this.f4572a.readFully(bArr);
    }
}
