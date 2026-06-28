package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3086a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3087b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3088c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3089d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8, int i9, int i10, int i11) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3086a = i8;
        this.f3087b = i9;
        this.f3088c = i10;
        this.f3089d = i11;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3086a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f3087b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f3088c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
        return this.f3089d;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 4;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3086a, this.f3087b, this.f3088c, this.f3089d);
    }
}
