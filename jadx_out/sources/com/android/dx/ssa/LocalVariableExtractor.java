package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecSet;
import com.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class LocalVariableExtractor {
    private final ArrayList<SsaBasicBlock> blocks;
    private final SsaMethod method;
    private final LocalVariableInfo resultInfo;
    private final BitSet workSet;

    private LocalVariableExtractor(SsaMethod ssaMethod) {
        if (ssaMethod != null) {
            ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
            this.method = ssaMethod;
            this.blocks = blocks;
            this.resultInfo = new LocalVariableInfo(ssaMethod);
            this.workSet = new BitSet(blocks.size());
            return;
        }
        throw new NullPointerException("method == null");
    }

    private LocalVariableInfo doit() {
        if (this.method.getRegCount() > 0) {
            int entryBlockIndex = this.method.getEntryBlockIndex();
            while (entryBlockIndex >= 0) {
                this.workSet.clear(entryBlockIndex);
                processBlock(entryBlockIndex);
                entryBlockIndex = this.workSet.nextSetBit(0);
            }
        }
        this.resultInfo.setImmutable();
        return this.resultInfo;
    }

    public static LocalVariableInfo extract(SsaMethod ssaMethod) {
        return new LocalVariableExtractor(ssaMethod).doit();
    }

    private void processBlock(int i5) {
        boolean z4;
        RegisterSpecSet registerSpecSet;
        RegisterSpecSet mutableCopyOfStarts = this.resultInfo.mutableCopyOfStarts(i5);
        SsaBasicBlock ssaBasicBlock = this.blocks.get(i5);
        ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
        int size = insns.size();
        if (i5 == this.method.getExitBlockIndex()) {
            return;
        }
        int i6 = size - 1;
        SsaInsn ssaInsn = insns.get(i6);
        boolean z5 = true;
        if (ssaInsn.getOriginalRopInsn().getCatches().size() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || ssaInsn.getResult() == null) {
            z5 = false;
        }
        RegisterSpecSet registerSpecSet2 = mutableCopyOfStarts;
        for (int i7 = 0; i7 < size; i7++) {
            if (z5 && i7 == i6) {
                registerSpecSet2.setImmutable();
                registerSpecSet2 = registerSpecSet2.mutableCopy();
            }
            SsaInsn ssaInsn2 = insns.get(i7);
            RegisterSpec localAssignment = ssaInsn2.getLocalAssignment();
            if (localAssignment == null) {
                RegisterSpec result = ssaInsn2.getResult();
                if (result != null && registerSpecSet2.get(result.getReg()) != null) {
                    registerSpecSet2.remove(registerSpecSet2.get(result.getReg()));
                }
            } else {
                RegisterSpec withSimpleType = localAssignment.withSimpleType();
                if (!withSimpleType.equals(registerSpecSet2.get(withSimpleType))) {
                    RegisterSpec localItemToSpec = registerSpecSet2.localItemToSpec(withSimpleType.getLocalItem());
                    if (localItemToSpec != null && localItemToSpec.getReg() != withSimpleType.getReg()) {
                        registerSpecSet2.remove(localItemToSpec);
                    }
                    this.resultInfo.addAssignment(ssaInsn2, withSimpleType);
                    registerSpecSet2.put(withSimpleType);
                }
            }
        }
        registerSpecSet2.setImmutable();
        IntList successorList = ssaBasicBlock.getSuccessorList();
        int size2 = successorList.size();
        int primarySuccessorIndex = ssaBasicBlock.getPrimarySuccessorIndex();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = successorList.get(i8);
            if (i9 == primarySuccessorIndex) {
                registerSpecSet = registerSpecSet2;
            } else {
                registerSpecSet = mutableCopyOfStarts;
            }
            if (this.resultInfo.mergeStarts(i9, registerSpecSet)) {
                this.workSet.set(i9);
            }
        }
    }
}
