package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class ThreeRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3093a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3094b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3095c;

    public ThreeRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8, int i9, int i10) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3093a = i8;
        this.f3094b = i9;
        this.f3095c = i10;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3093a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f3094b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f3095c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 3;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new ThreeRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3093a, this.f3094b, this.f3095c);
    }
}
