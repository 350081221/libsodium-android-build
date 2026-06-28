package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class RegisterRangeDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3092a;
    private final int registerCount;

    public RegisterRangeDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8, int i9) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3092a = i8;
        this.registerCount = i9;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3092a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new RegisterRangeDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3092a, this.registerCount);
    }
}
