package com.android.dx.io.instructions;

/* loaded from: classes2.dex */
public final class PackedSwitchPayloadDecodedInstruction extends DecodedInstruction {
    private final int firstKey;
    private final int[] targets;

    public PackedSwitchPayloadDecodedInstruction(InstructionCodec instructionCodec, int i5, int i6, int[] iArr) {
        super(instructionCodec, i5, 0, null, 0, 0L);
        this.firstKey = i6;
        this.targets = iArr;
    }

    public int getFirstKey() {
        return this.firstKey;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 0;
    }

    public int[] getTargets() {
        return this.targets;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i5) {
        throw new UnsupportedOperationException("no index in instruction");
    }
}
