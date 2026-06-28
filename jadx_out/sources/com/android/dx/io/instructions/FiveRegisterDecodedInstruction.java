package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* loaded from: classes2.dex */
public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    /* renamed from: a, reason: collision with root package name */
    private final int f3081a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3082b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3083c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3084d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3085e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, IndexType indexType, int i7, long j5, int i8, int i9, int i10, int i11, int i12) {
        super(instructionCodec, i5, i6, indexType, i7, j5);
        this.f3081a = i8;
        this.f3082b = i9;
        this.f3083c = i10;
        this.f3084d = i11;
        this.f3085e = i12;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.f3081a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
        return this.f3082b;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
        return this.f3083c;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
        return this.f3084d;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getE() {
        return this.f3085e;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 5;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i5, getIndexType(), getTarget(), getLiteral(), this.f3081a, this.f3082b, this.f3083c, this.f3084d, this.f3085e);
    }
}
