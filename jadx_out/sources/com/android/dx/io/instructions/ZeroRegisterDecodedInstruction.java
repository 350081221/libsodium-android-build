package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class ZeroRegisterDecodedInstruction extends DecodedInstruction {
    public ZeroRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 0;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new ZeroRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral());
    }
}
