package com.android.dx.ssa.back;

import com.android.dx.rop.code.BasicBlock;
import com.android.dx.rop.code.BasicBlockList;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.util.IntList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class IdenticalBlockCombiner {
    private final BasicBlockList blocks;
    private final BasicBlockList newBlocks;
    private final RopMethod ropMethod;

    public IdenticalBlockCombiner(RopMethod ropMethod) {
        this.ropMethod = ropMethod;
        BasicBlockList blocks = ropMethod.getBlocks();
        this.blocks = blocks;
        this.newBlocks = blocks.getMutableCopy();
    }

    private void combineBlocks(int i5, IntList intList) {
        int size = intList.size();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = intList.get(i6);
            IntList labelToPredecessors = this.ropMethod.labelToPredecessors(this.blocks.labelToBlock(i7).getLabel());
            int size2 = labelToPredecessors.size();
            for (int i8 = 0; i8 < size2; i8++) {
                replaceSucc(this.newBlocks.labelToBlock(labelToPredecessors.get(i8)), i7, i5);
            }
        }
    }

    private static boolean compareInsns(BasicBlock basicBlock, BasicBlock basicBlock2) {
        return basicBlock.getInsns().contentEquals(basicBlock2.getInsns());
    }

    private void replaceSucc(BasicBlock basicBlock, int i5, int i6) {
        IntList mutableCopy = basicBlock.getSuccessors().mutableCopy();
        mutableCopy.set(mutableCopy.indexOf(i5), i6);
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        if (primarySuccessor != i5) {
            i6 = primarySuccessor;
        }
        mutableCopy.setImmutable();
        BasicBlock basicBlock2 = new BasicBlock(basicBlock.getLabel(), basicBlock.getInsns(), mutableCopy, i6);
        BasicBlockList basicBlockList = this.newBlocks;
        basicBlockList.set(basicBlockList.indexOfLabel(basicBlock.getLabel()), basicBlock2);
    }

    public RopMethod process() {
        int size = this.blocks.size();
        BitSet bitSet = new BitSet(this.blocks.getMaxLabel());
        for (int i5 = 0; i5 < size; i5++) {
            BasicBlock basicBlock = this.blocks.get(i5);
            if (!bitSet.get(basicBlock.getLabel())) {
                IntList labelToPredecessors = this.ropMethod.labelToPredecessors(basicBlock.getLabel());
                int size2 = labelToPredecessors.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    int i7 = labelToPredecessors.get(i6);
                    BasicBlock labelToBlock = this.blocks.labelToBlock(i7);
                    if (!bitSet.get(i7) && labelToBlock.getSuccessors().size() <= 1 && labelToBlock.getFirstInsn().getOpcode().getOpcode() != 55) {
                        IntList intList = new IntList();
                        for (int i8 = i6 + 1; i8 < size2; i8++) {
                            int i9 = labelToPredecessors.get(i8);
                            BasicBlock labelToBlock2 = this.blocks.labelToBlock(i9);
                            if (labelToBlock2.getSuccessors().size() == 1 && compareInsns(labelToBlock, labelToBlock2)) {
                                intList.add(i9);
                                bitSet.set(i9);
                            }
                        }
                        combineBlocks(i7, intList);
                    }
                }
            }
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            if (bitSet.get(this.newBlocks.get(i10).getLabel())) {
                this.newBlocks.set(i10, (BasicBlock) null);
            }
        }
        this.newBlocks.shrinkToFit();
        this.newBlocks.setImmutable();
        return new RopMethod(this.newBlocks, this.ropMethod.getFirstLabel());
    }
}
