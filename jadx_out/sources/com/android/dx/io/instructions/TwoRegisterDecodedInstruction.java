package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class TwoRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3096a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3097b;

    public TwoRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8, int i9) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3096a = i8;
        this.f3097b = i9;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3096a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f3097b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 2;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new TwoRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3096a, this.f3097b);
    }
}
