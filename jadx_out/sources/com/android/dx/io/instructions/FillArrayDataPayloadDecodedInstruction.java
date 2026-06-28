package com.android.dx.io.instructions;

/* loaded from: classes2.dex */
public final class FillArrayDataPayloadDecodedInstruction extends DecodedInstruction {
    private final Object data;
    private final int elementWidth;
    private final int size;

    private FillArrayDataPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, Object obj, int i6, int i7) {
        super(instructionCodec, i5, 0, null, 0, 0L);
        this.data = obj;
        this.size = i6;
        this.elementWidth = i7;
    }

    public Object getData() {
        return this.data;
    }

    public short getElementWidthUnit() {
        return (short) this.elementWidth;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        throw new UnsupportedOperationException("no index in instruction");
    }

    public FillArrayDataPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, byte[] bArr) {
        this(instructionCodec, i5, bArr, bArr.length, 1);
    }

    public FillArrayDataPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, short[] sArr) {
        this(instructionCodec, i5, sArr, sArr.length, 2);
    }

    public FillArrayDataPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, int[] iArr) {
        this(instructionCodec, i5, iArr, iArr.length, 4);
    }

    public FillArrayDataPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, long[] jArr) {
        this(instructionCodec, i5, jArr, jArr.length, 8);
    }
}
