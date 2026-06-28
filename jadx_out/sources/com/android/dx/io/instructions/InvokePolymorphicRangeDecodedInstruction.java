package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public class InvokePolymorphicRangeDecodedInstruction extends DecodedInstruction {

    /* renamed from: c, reason: collision with root package name */
    private final int f3090c;
    private final int protoIndex;
    private final int registerCount;

    public InvokePolymorphicRangeDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, int i8, int i9) {
        super(instructionCodec, i5, i6, indexType, 0, 0L);
        if (i9 == ((short) i9)) {
            this.f3090c = i7;
            this.registerCount = i8;
            this.protoIndex = i9;
        } else {
            throw new IllegalArgumentException("protoIndex doesn't fit in a short: " + i9);
        }
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f3090c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        throw new UnsupportedOperationException("use withProtoIndex to update both the method and proto indices for invoke-polymorphic/range");
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withProtoIndex(int i5, int i6) {
        return new InvokePolymorphicRangeDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), this.f3090c, this.registerCount, i6);
    }
}
