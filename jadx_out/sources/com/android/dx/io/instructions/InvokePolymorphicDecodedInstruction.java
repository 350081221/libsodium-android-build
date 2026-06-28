package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public class InvokePolymorphicDecodedInstruction extends DecodedInstruction {
    private final int protoIndex;
    private final int[] registers;

    public InvokePolymorphicDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, int[] iArr) {
        super(instructionCodec, i5, i6, indexType, 0, 0L);
        if (i7 == ((short) i7)) {
            this.protoIndex = i7;
            this.registers = iArr;
        } else {
            throw new IllegalArgumentException("protoIndex doesn't fit in a short: " + i7);
        }
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        int[] iArr = this.registers;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
        int[] iArr = this.registers;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getE() {
        int[] iArr = this.registers;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    public int getF() {
        int[] iArr = this.registers;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    public int getG() {
        int[] iArr = this.registers;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registers.length;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        throw new UnsupportedOperationException("use withProtoIndex to update both the method and proto indices for invoke-polymorphic");
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withProtoIndex(int i5, int i6) {
        return new InvokePolymorphicDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), i6, this.registers);
    }
}
