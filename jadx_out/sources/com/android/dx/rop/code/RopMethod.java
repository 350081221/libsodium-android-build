package com.android.dx.rop.code;

import com.android.dx.util.Hex;
import com.android.dx.util.IntList;

/* loaded from: classes2.dex */
public final class RopMethod {
    private final BasicBlockList blocks;
    private IntList exitPredecessors;
    private final int firstLabel;
    private IntList[] predecessors;

    public RopMethod(BasicBlockList basicBlockList, int i5) {
        if (basicBlockList != null) {
            if (i5 >= 0) {
                this.blocks = basicBlockList;
                this.firstLabel = i5;
                this.predecessors = null;
                this.exitPredecessors = null;
                return;
            }
            throw new IllegalArgumentException("firstLabel < 0");
        }
        throw new NullPointerException("blocks == null");
    }

    private void calcPredecessors() {
        int maxLabel = this.blocks.getMaxLabel();
        IntList[] intListArr = new IntList[maxLabel];
        IntList intList = new IntList(10);
        int size = this.blocks.size();
        for (int i5 = 0; i5 < size; i5++) {
            BasicBlock basicBlock = this.blocks.get(i5);
            int label = basicBlock.getLabel();
            IntList successors = basicBlock.getSuccessors();
            int size2 = successors.size();
            if (size2 == 0) {
                intList.add(label);
            } else {
                for (int i6 = 0; i6 < size2; i6++) {
                    int i7 = successors.get(i6);
                    IntList intList2 = intListArr[i7];
                    if (intList2 == null) {
                        intList2 = new IntList(10);
                        intListArr[i7] = intList2;
                    }
                    intList2.add(label);
                }
            }
        }
        for (int i8 = 0; i8 < maxLabel; i8++) {
            IntList intList3 = intListArr[i8];
            if (intList3 != null) {
                intList3.sort();
                intList3.setImmutable();
            }
        }
        intList.sort();
        intList.setImmutable();
        int i9 = this.firstLabel;
        if (intListArr[i9] == null) {
            intListArr[i9] = IntList.EMPTY;
        }
        this.predecessors = intListArr;
        this.exitPredecessors = intList;
    }

    public BasicBlockList getBlocks() {
        return this.blocks;
    }

    public IntList getExitPredecessors() {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        return this.exitPredecessors;
    }

    public int getFirstLabel() {
        return this.firstLabel;
    }

    public IntList labelToPredecessors(int i5) {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        IntList intList = this.predecessors[i5];
        if (intList != null) {
            return intList;
        }
        throw new RuntimeException("no such block: " + Hex.u2(i5));
    }

    public RopMethod withRegisterOffset(int i5) {
        RopMethod ropMethod = new RopMethod(this.blocks.withRegisterOffset(i5), this.firstLabel);
        IntList intList = this.exitPredecessors;
        if (intList != null) {
            ropMethod.exitPredecessors = intList;
            ropMethod.predecessors = this.predecessors;
        }
        return ropMethod;
    }
}
