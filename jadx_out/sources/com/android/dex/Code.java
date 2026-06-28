package com.android.dex;

/* loaded from: classes2.dex */
public final class Code {
    private final CatchHandler[] catchHandlers;
    private final int debugInfoOffset;
    private final int insSize;
    private final short[] instructions;
    private final int outsSize;
    private final int registersSize;
    private final Try[] tries;

    /* loaded from: classes2.dex */
    public static class CatchHandler {
        final int[] addresses;
        final int catchAllAddress;
        final int offset;
        final int[] typeIndexes;

        public CatchHandler(int[] iArr, int[] iArr2, int i5, int i6) {
            this.typeIndexes = iArr;
            this.addresses = iArr2;
            this.catchAllAddress = i5;
            this.offset = i6;
        }

        public int[] getAddresses() {
            return this.addresses;
        }

        public int getCatchAllAddress() {
            return this.catchAllAddress;
        }

        public int getOffset() {
            return this.offset;
        }

        public int[] getTypeIndexes() {
            return this.typeIndexes;
        }
    }

    /* loaded from: classes2.dex */
    public static class Try {
        final int catchHandlerIndex;
        final int instructionCount;
        final int startAddress;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Try(int i5, int i6, int i7) {
            this.startAddress = i5;
            this.instructionCount = i6;
            this.catchHandlerIndex = i7;
        }

        public int getCatchHandlerIndex() {
            return this.catchHandlerIndex;
        }

        public int getInstructionCount() {
            return this.instructionCount;
        }

        public int getStartAddress() {
            return this.startAddress;
        }
    }

    public Code(int i5, int i6, int i7, int i8, short[] sArr, Try[] tryArr, CatchHandler[] catchHandlerArr) {
        this.registersSize = i5;
        this.insSize = i6;
        this.outsSize = i7;
        this.debugInfoOffset = i8;
        this.instructions = sArr;
        this.tries = tryArr;
        this.catchHandlers = catchHandlerArr;
    }

    public CatchHandler[] getCatchHandlers() {
        return this.catchHandlers;
    }

    public int getDebugInfoOffset() {
        return this.debugInfoOffset;
    }

    public int getInsSize() {
        return this.insSize;
    }

    public short[] getInstructions() {
        return this.instructions;
    }

    public int getOutsSize() {
        return this.outsSize;
    }

    public int getRegistersSize() {
        return this.registersSize;
    }

    public Try[] getTries() {
        return this.tries;
    }
}
