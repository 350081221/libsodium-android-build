package com.android.dx.rop.code;

import com.android.dx.rop.code.Insn;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import com.android.dx.util.LabeledItem;
import com.android.dx.util.LabeledList;

/* loaded from: classes2.dex */
public final class BasicBlockList extends LabeledList {
    private int regCount;

    /* loaded from: classes2.dex */
    private static class RegCountVisitor implements Insn.Visitor {
        private int regCount = 0;

        private void processReg(RegisterSpec registerSpec) {
            int nextReg = registerSpec.getNextReg();
            if (nextReg > this.regCount) {
                this.regCount = nextReg;
            }
        }

        private void visit(Insn insn) {
            RegisterSpec result = insn.getResult();
            if (result != null) {
                processReg(result);
            }
            RegisterSpecList sources = insn.getSources();
            int size = sources.size();
            for (int i5 = 0; i5 < size; i5++) {
                processReg(sources.get(i5));
            }
        }

        public int getRegCount() {
            return this.regCount;
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
            visit(fillArrayDataInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitInvokePolymorphicInsn(InvokePolymorphicInsn invokePolymorphicInsn) {
            visit(invokePolymorphicInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
            visit(plainCstInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainInsn(PlainInsn plainInsn) {
            visit(plainInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitSwitchInsn(SwitchInsn switchInsn) {
            visit(switchInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
            visit(throwingCstInsn);
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
            visit(throwingInsn);
        }
    }

    public BasicBlockList(int i5) {
        super(i5);
        this.regCount = -1;
    }

    public boolean catchesEqual(BasicBlock basicBlock, BasicBlock basicBlock2) {
        if (!StdTypeList.equalContents(basicBlock.getExceptionHandlerTypes(), basicBlock2.getExceptionHandlerTypes())) {
            return false;
        }
        IntList successors = basicBlock.getSuccessors();
        IntList successors2 = basicBlock2.getSuccessors();
        int size = successors.size();
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        int primarySuccessor2 = basicBlock2.getPrimarySuccessor();
        if ((primarySuccessor == -1 || primarySuccessor2 == -1) && primarySuccessor != primarySuccessor2) {
            return false;
        }
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = successors.get(i5);
            int i7 = successors2.get(i5);
            if (i6 == primarySuccessor) {
                if (i7 != primarySuccessor2) {
                    return false;
                }
            } else if (i6 != i7) {
                return false;
            }
        }
        return true;
    }

    public void forEachInsn(Insn.Visitor visitor) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            get(i5).getInsns().forEach(visitor);
        }
    }

    public BasicBlock get(int i5) {
        return (BasicBlock) get0(i5);
    }

    public int getEffectiveInstructionCount() {
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            BasicBlock basicBlock = (BasicBlock) getOrNull0(i6);
            if (basicBlock != null) {
                InsnList insns = basicBlock.getInsns();
                int size2 = insns.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (insns.get(i7).getOpcode().getOpcode() != 54) {
                        i5++;
                    }
                }
            }
        }
        return i5;
    }

    public int getInstructionCount() {
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            BasicBlock basicBlock = (BasicBlock) getOrNull0(i6);
            if (basicBlock != null) {
                i5 += basicBlock.getInsns().size();
            }
        }
        return i5;
    }

    public BasicBlockList getMutableCopy() {
        return new BasicBlockList(this);
    }

    public int getRegCount() {
        if (this.regCount == -1) {
            RegCountVisitor regCountVisitor = new RegCountVisitor();
            forEachInsn(regCountVisitor);
            this.regCount = regCountVisitor.getRegCount();
        }
        return this.regCount;
    }

    public BasicBlock labelToBlock(int i5) {
        int indexOfLabel = indexOfLabel(i5);
        if (indexOfLabel >= 0) {
            return get(indexOfLabel);
        }
        throw new IllegalArgumentException("no such label: " + Hex.u2(i5));
    }

    public BasicBlock preferredSuccessorOf(BasicBlock basicBlock) {
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        if (size != 0) {
            if (size != 1) {
                if (primarySuccessor != -1) {
                    return labelToBlock(primarySuccessor);
                }
                return labelToBlock(successors.get(0));
            }
            return labelToBlock(successors.get(0));
        }
        return null;
    }

    public void set(int i5, BasicBlock basicBlock) {
        super.set(i5, (LabeledItem) basicBlock);
        this.regCount = -1;
    }

    public BasicBlockList withRegisterOffset(int i5) {
        int size = size();
        BasicBlockList basicBlockList = new BasicBlockList(size);
        for (int i6 = 0; i6 < size; i6++) {
            BasicBlock basicBlock = (BasicBlock) get0(i6);
            if (basicBlock != null) {
                basicBlockList.set(i6, basicBlock.withRegisterOffset(i5));
            }
        }
        if (isImmutable()) {
            basicBlockList.setImmutable();
        }
        return basicBlockList;
    }

    private BasicBlockList(BasicBlockList basicBlockList) {
        super(basicBlockList);
        this.regCount = basicBlockList.regCount;
    }
}
