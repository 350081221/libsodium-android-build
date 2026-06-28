package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class OneRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3091a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3091a = i8;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3091a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 1;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3091a);
    }
}
