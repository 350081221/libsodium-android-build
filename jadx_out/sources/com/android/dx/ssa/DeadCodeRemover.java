package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.ssa.SsaInsn;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DeadCodeRemover {
    private final int regCount;
    private final SsaMethod ssaMeth;
    private final ArrayList<SsaInsn>[] useList;
    private final BitSet worklist;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class NoSideEffectVisitor implements SsaInsn.Visitor {
        BitSet noSideEffectRegs;

        public NoSideEffectVisitor(BitSet bitSet) {
            this.noSideEffectRegs = bitSet;
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            if (!DeadCodeRemover.hasSideEffect(normalSsaInsn)) {
                this.noSideEffectRegs.set(normalSsaInsn.getResult().getReg());
            }
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
            RegisterSpec result = normalSsaInsn.getResult();
            if (!DeadCodeRemover.hasSideEffect(normalSsaInsn) && result != null) {
                this.noSideEffectRegs.set(result.getReg());
            }
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitPhiInsn(PhiInsn phiInsn) {
            if (!DeadCodeRemover.hasSideEffect(phiInsn)) {
                this.noSideEffectRegs.set(phiInsn.getResult().getReg());
            }
        }
    }

    private DeadCodeRemover(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        int regCount = ssaMethod.getRegCount();
        this.regCount = regCount;
        this.worklist = new BitSet(regCount);
        this.useList = ssaMethod.getUseListCopy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasSideEffect(SsaInsn ssaInsn) {
        if (ssaInsn == null) {
            return true;
        }
        return ssaInsn.hasSideEffect();
    }

    private boolean isCircularNoSideEffect(int i5, BitSet bitSet) {
        if (bitSet != null && bitSet.get(i5)) {
            return true;
        }
        Iterator<SsaInsn> it = this.useList[i5].iterator();
        while (it.hasNext()) {
            if (hasSideEffect(it.next())) {
                return false;
            }
        }
        if (bitSet == null) {
            bitSet = new BitSet(this.regCount);
        }
        bitSet.set(i5);
        Iterator<SsaInsn> it2 = this.useList[i5].iterator();
        while (it2.hasNext()) {
            RegisterSpec result = it2.next().getResult();
            if (result == null || !isCircularNoSideEffect(result.getReg(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    public static void process(SsaMethod ssaMethod) {
        new DeadCodeRemover(ssaMethod).run();
    }

    private void pruneDeadInstructions() {
        HashSet hashSet = new HashSet();
        BitSet computeReachability = this.ssaMeth.computeReachability();
        ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        int i5 = 0;
        while (true) {
            int nextClearBit = computeReachability.nextClearBit(i5);
            if (nextClearBit < blocks.size()) {
                SsaBasicBlock ssaBasicBlock = blocks.get(nextClearBit);
                i5 = nextClearBit + 1;
                for (int i6 = 0; i6 < ssaBasicBlock.getInsns().size(); i6++) {
                    SsaInsn ssaInsn = ssaBasicBlock.getInsns().get(i6);
                    RegisterSpecList sources = ssaInsn.getSources();
                    int size = sources.size();
                    if (size != 0) {
                        hashSet.add(ssaInsn);
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        this.useList[sources.get(i7).getReg()].remove(ssaInsn);
                    }
                    RegisterSpec result = ssaInsn.getResult();
                    if (result != null) {
                        Iterator<SsaInsn> it = this.useList[result.getReg()].iterator();
                        while (it.hasNext()) {
                            SsaInsn next = it.next();
                            if (next instanceof PhiInsn) {
                                ((PhiInsn) next).removePhiRegister(result);
                            }
                        }
                    }
                }
            } else {
                this.ssaMeth.deleteInsns(hashSet);
                return;
            }
        }
    }

    private void run() {
        pruneDeadInstructions();
        HashSet hashSet = new HashSet();
        this.ssaMeth.forEachInsn(new NoSideEffectVisitor(this.worklist));
        while (true) {
            int nextSetBit = this.worklist.nextSetBit(0);
            if (nextSetBit >= 0) {
                this.worklist.clear(nextSetBit);
                if (this.useList[nextSetBit].size() == 0 || isCircularNoSideEffect(nextSetBit, null)) {
                    SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(nextSetBit);
                    if (!hashSet.contains(definitionForRegister)) {
                        RegisterSpecList sources = definitionForRegister.getSources();
                        int size = sources.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            RegisterSpec registerSpec = sources.get(i5);
                            this.useList[registerSpec.getReg()].remove(definitionForRegister);
                            if (!hasSideEffect(this.ssaMeth.getDefinitionForRegister(registerSpec.getReg()))) {
                                this.worklist.set(registerSpec.getReg());
                            }
                        }
                        hashSet.add(definitionForRegister);
                    }
                }
            } else {
                this.ssaMeth.deleteInsns(hashSet);
                return;
            }
        }
    }
}
