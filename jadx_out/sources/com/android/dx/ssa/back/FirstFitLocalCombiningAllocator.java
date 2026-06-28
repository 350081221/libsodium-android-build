package com.android.dx.ssa.back;

import com.android.dx.rop.code.CstInsn;
import com.android.dx.rop.code.LocalItem;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.Rop;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.ssa.InterferenceRegisterMapper;
import com.android.dx.ssa.NormalSsaInsn;
import com.android.dx.ssa.Optimizer;
import com.android.dx.ssa.PhiInsn;
import com.android.dx.ssa.RegisterMapper;
import com.android.dx.ssa.SsaInsn;
import com.android.dx.ssa.SsaMethod;
import com.android.dx.util.IntIterator;
import com.android.dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class FirstFitLocalCombiningAllocator extends RegisterAllocator {
    private static final boolean DEBUG = false;
    private final ArrayList<NormalSsaInsn> invokeRangeInsns;
    private final Map<LocalItem, ArrayList<RegisterSpec>> localVariables;
    private final InterferenceRegisterMapper mapper;
    private final boolean minimizeRegisters;
    private final ArrayList<NormalSsaInsn> moveResultPseudoInsns;
    private final int paramRangeEnd;
    private final ArrayList<PhiInsn> phiInsns;
    private final BitSet reservedRopRegs;
    private final BitSet ssaRegsMapped;
    private final BitSet usedRopRegs;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum Alignment {
        EVEN { // from class: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.1
            @Override // com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment
            int nextClearBit(BitSet bitSet, int i5) {
                int nextClearBit = bitSet.nextClearBit(i5);
                while (!FirstFitLocalCombiningAllocator.isEven(nextClearBit)) {
                    nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
                }
                return nextClearBit;
            }
        },
        ODD { // from class: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.2
            @Override // com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment
            int nextClearBit(BitSet bitSet, int i5) {
                int nextClearBit = bitSet.nextClearBit(i5);
                while (FirstFitLocalCombiningAllocator.isEven(nextClearBit)) {
                    nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
                }
                return nextClearBit;
            }
        },
        UNSPECIFIED { // from class: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.3
            @Override // com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment
            int nextClearBit(BitSet bitSet, int i5) {
                return bitSet.nextClearBit(i5);
            }
        };

        abstract int nextClearBit(BitSet bitSet, int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Multiset {
        private final int[] count;
        private final int[] reg;
        private int size = 0;

        public Multiset(int i5) {
            this.reg = new int[i5];
            this.count = new int[i5];
        }

        public void add(int i5) {
            int i6 = 0;
            while (true) {
                int i7 = this.size;
                if (i6 < i7) {
                    if (this.reg[i6] == i5) {
                        int[] iArr = this.count;
                        iArr[i6] = iArr[i6] + 1;
                        return;
                    }
                    i6++;
                } else {
                    this.reg[i7] = i5;
                    this.count[i7] = 1;
                    this.size = i7 + 1;
                    return;
                }
            }
        }

        public int getAndRemoveHighestCount() {
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < this.size; i8++) {
                int i9 = this.count[i8];
                if (i7 < i9) {
                    i6 = this.reg[i8];
                    i5 = i8;
                    i7 = i9;
                }
            }
            this.count[i5] = 0;
            return i6;
        }

        public int getSize() {
            return this.size;
        }
    }

    public FirstFitLocalCombiningAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph, boolean z4) {
        super(ssaMethod, interferenceGraph);
        this.ssaRegsMapped = new BitSet(ssaMethod.getRegCount());
        this.mapper = new InterferenceRegisterMapper(interferenceGraph, ssaMethod.getRegCount());
        this.minimizeRegisters = z4;
        int paramWidth = ssaMethod.getParamWidth();
        this.paramRangeEnd = paramWidth;
        BitSet bitSet = new BitSet(paramWidth * 2);
        this.reservedRopRegs = bitSet;
        bitSet.set(0, paramWidth);
        this.usedRopRegs = new BitSet(paramWidth * 2);
        this.localVariables = new TreeMap();
        this.moveResultPseudoInsns = new ArrayList<>();
        this.invokeRangeInsns = new ArrayList<>();
        this.phiInsns = new ArrayList<>();
    }

    private void addMapping(RegisterSpec registerSpec, int i5) {
        int reg = registerSpec.getReg();
        if (!this.ssaRegsMapped.get(reg) && canMapReg(registerSpec, i5)) {
            int category = registerSpec.getCategory();
            this.mapper.addMapping(registerSpec.getReg(), i5, category);
            this.ssaRegsMapped.set(reg);
            this.usedRopRegs.set(i5, category + i5);
            return;
        }
        throw new RuntimeException("attempt to add invalid register mapping");
    }

    private void adjustAndMapSourceRangeRange(NormalSsaInsn normalSsaInsn) {
        int findRangeAndAdjust = findRangeAndAdjust(normalSsaInsn);
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int i5 = 0;
        while (i5 < size) {
            RegisterSpec registerSpec = sources.get(i5);
            int reg = registerSpec.getReg();
            int category = registerSpec.getCategory();
            int i6 = findRangeAndAdjust + category;
            if (!this.ssaRegsMapped.get(reg)) {
                LocalItem localItemForReg = getLocalItemForReg(reg);
                addMapping(registerSpec, findRangeAndAdjust);
                if (localItemForReg != null) {
                    markReserved(findRangeAndAdjust, category);
                    ArrayList<RegisterSpec> arrayList = this.localVariables.get(localItemForReg);
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        RegisterSpec registerSpec2 = arrayList.get(i7);
                        if (-1 == sources.indexOfRegister(registerSpec2.getReg())) {
                            tryMapReg(registerSpec2, findRangeAndAdjust, category);
                        }
                    }
                }
            }
            i5++;
            findRangeAndAdjust = i6;
        }
    }

    private void analyzeInstructions() {
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor() { // from class: com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.1
            private void processInsn(SsaInsn ssaInsn) {
                RegisterSpec localAssignment = ssaInsn.getLocalAssignment();
                if (localAssignment != null) {
                    LocalItem localItem = localAssignment.getLocalItem();
                    ArrayList arrayList = (ArrayList) FirstFitLocalCombiningAllocator.this.localVariables.get(localItem);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        FirstFitLocalCombiningAllocator.this.localVariables.put(localItem, arrayList);
                    }
                    arrayList.add(localAssignment);
                }
                if (ssaInsn instanceof NormalSsaInsn) {
                    if (ssaInsn.getOpcode().getOpcode() == 56) {
                        FirstFitLocalCombiningAllocator.this.moveResultPseudoInsns.add((NormalSsaInsn) ssaInsn);
                        return;
                    } else {
                        if (Optimizer.getAdvice().requiresSourcesInOrder(ssaInsn.getOriginalRopInsn().getOpcode(), ssaInsn.getSources())) {
                            FirstFitLocalCombiningAllocator.this.invokeRangeInsns.add((NormalSsaInsn) ssaInsn);
                            return;
                        }
                        return;
                    }
                }
                if (ssaInsn instanceof PhiInsn) {
                    FirstFitLocalCombiningAllocator.this.phiInsns.add((PhiInsn) ssaInsn);
                }
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                processInsn(normalSsaInsn);
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitPhiInsn(PhiInsn phiInsn) {
                processInsn(phiInsn);
            }
        });
    }

    private boolean canMapReg(RegisterSpec registerSpec, int i5) {
        if (!spansParamRange(i5, registerSpec.getCategory()) && !this.mapper.interferes(registerSpec, i5)) {
            return true;
        }
        return false;
    }

    private boolean canMapRegs(ArrayList<RegisterSpec> arrayList, int i5) {
        Iterator<RegisterSpec> it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterSpec next = it.next();
            if (!this.ssaRegsMapped.get(next.getReg()) && !canMapReg(next, i5)) {
                return false;
            }
        }
        return true;
    }

    private int findAnyFittingRange(NormalSsaInsn normalSsaInsn, int i5, int[] iArr, BitSet bitSet) {
        Alignment alignment = Alignment.UNSPECIFIED;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            if (i9 == 2) {
                if (isEven(i8)) {
                    i7++;
                } else {
                    i6++;
                }
                i8 += 2;
            } else {
                i8++;
            }
        }
        if (i6 > i7) {
            if (isEven(this.paramRangeEnd)) {
                alignment = Alignment.ODD;
            } else {
                alignment = Alignment.EVEN;
            }
        } else if (i7 > 0) {
            if (isEven(this.paramRangeEnd)) {
                alignment = Alignment.EVEN;
            } else {
                alignment = Alignment.ODD;
            }
        }
        int i10 = this.paramRangeEnd;
        while (true) {
            int findNextUnreservedRopReg = findNextUnreservedRopReg(i10, i5, alignment);
            if (fitPlanForRange(findNextUnreservedRopReg, normalSsaInsn, iArr, bitSet) >= 0) {
                return findNextUnreservedRopReg;
            }
            i10 = findNextUnreservedRopReg + 1;
            bitSet.clear();
        }
    }

    private int findNextUnreservedRopReg(int i5, int i6) {
        return findNextUnreservedRopReg(i5, i6, getAlignment(i6));
    }

    private int findRangeAndAdjust(NormalSsaInsn normalSsaInsn) {
        int oldToNew;
        BitSet bitSet;
        int fitPlanForRange;
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        int[] iArr = new int[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int category = sources.get(i6).getCategory();
            iArr[i6] = category;
            i5 += category;
        }
        int i7 = Integer.MIN_VALUE;
        BitSet bitSet2 = null;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int reg = sources.get(i10).getReg();
            if (i10 != 0) {
                i9 -= iArr[i10 - 1];
            }
            if (this.ssaRegsMapped.get(reg) && (oldToNew = this.mapper.oldToNew(reg) + i9) >= 0 && !spansParamRange(oldToNew, i5) && (fitPlanForRange = fitPlanForRange(oldToNew, normalSsaInsn, iArr, (bitSet = new BitSet(size)))) >= 0) {
                int cardinality = fitPlanForRange - bitSet.cardinality();
                if (cardinality > i7) {
                    i7 = cardinality;
                    i8 = oldToNew;
                    bitSet2 = bitSet;
                }
                if (fitPlanForRange == i5) {
                    break;
                }
            }
        }
        if (i8 == -1) {
            bitSet2 = new BitSet(size);
            i8 = findAnyFittingRange(normalSsaInsn, i5, iArr, bitSet2);
        }
        for (int nextSetBit = bitSet2.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet2.nextSetBit(nextSetBit + 1)) {
            normalSsaInsn.changeOneSource(nextSetBit, insertMoveBefore(normalSsaInsn, sources.get(nextSetBit)));
        }
        return i8;
    }

    private int findRopRegForLocal(int i5, int i6) {
        Alignment alignment = getAlignment(i6);
        int nextClearBit = alignment.nextClearBit(this.usedRopRegs, i5);
        while (true) {
            int i7 = 1;
            while (i7 < i6 && !this.usedRopRegs.get(nextClearBit + i7)) {
                i7++;
            }
            if (i7 == i6) {
                return nextClearBit;
            }
            nextClearBit = alignment.nextClearBit(this.usedRopRegs, nextClearBit + i7);
        }
    }

    private int fitPlanForRange(int i5, NormalSsaInsn normalSsaInsn, int[] iArr, BitSet bitSet) {
        RegisterSpecList sources = normalSsaInsn.getSources();
        int size = sources.size();
        RegisterSpecList ssaSetToSpecs = ssaSetToSpecs(normalSsaInsn.getBlock().getLiveOutRegs());
        BitSet bitSet2 = new BitSet(this.ssaMeth.getRegCount());
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RegisterSpec registerSpec = sources.get(i7);
            int reg = registerSpec.getReg();
            int i8 = iArr[i7];
            if (i7 != 0) {
                i5 += iArr[i7 - 1];
            }
            if (!this.ssaRegsMapped.get(reg) || this.mapper.oldToNew(reg) != i5) {
                if (!rangeContainsReserved(i5, i8)) {
                    if (this.ssaRegsMapped.get(reg) || !canMapReg(registerSpec, i5) || bitSet2.get(reg)) {
                        if (!this.mapper.areAnyPinned(ssaSetToSpecs, i5, i8) && !this.mapper.areAnyPinned(sources, i5, i8)) {
                            bitSet.set(i7);
                            bitSet2.set(reg);
                        }
                    }
                }
                return -1;
            }
            i6 += i8;
            bitSet2.set(reg);
        }
        return i6;
    }

    private Alignment getAlignment(int i5) {
        Alignment alignment = Alignment.UNSPECIFIED;
        if (i5 == 2) {
            if (isEven(this.paramRangeEnd)) {
                return Alignment.EVEN;
            }
            return Alignment.ODD;
        }
        return alignment;
    }

    private LocalItem getLocalItemForReg(int i5) {
        for (Map.Entry<LocalItem, ArrayList<RegisterSpec>> entry : this.localVariables.entrySet()) {
            Iterator<RegisterSpec> it = entry.getValue().iterator();
            while (it.hasNext()) {
                if (it.next().getReg() == i5) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    private int getParameterIndexForReg(int i5) {
        Rop opcode;
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i5);
        if (definitionForRegister == null || (opcode = definitionForRegister.getOpcode()) == null || opcode.getOpcode() != 3) {
            return -1;
        }
        return ((CstInteger) ((CstInsn) definitionForRegister.getOriginalRopInsn()).getConstant()).getValue();
    }

    private void handleCheckCastResults() {
        Iterator<NormalSsaInsn> it = this.moveResultPseudoInsns.iterator();
        while (it.hasNext()) {
            NormalSsaInsn next = it.next();
            RegisterSpec result = next.getResult();
            int reg = result.getReg();
            BitSet predecessors = next.getBlock().getPredecessors();
            boolean z4 = true;
            if (predecessors.cardinality() == 1) {
                ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(predecessors.nextSetBit(0)).getInsns();
                SsaInsn ssaInsn = insns.get(insns.size() - 1);
                if (ssaInsn.getOpcode().getOpcode() == 43) {
                    RegisterSpec registerSpec = ssaInsn.getSources().get(0);
                    int reg2 = registerSpec.getReg();
                    int category = registerSpec.getCategory();
                    boolean z5 = this.ssaRegsMapped.get(reg);
                    boolean z6 = this.ssaRegsMapped.get(reg2);
                    if ((!z6) & z5) {
                        z6 = tryMapReg(registerSpec, this.mapper.oldToNew(reg), category);
                    }
                    if ((!z5) & z6) {
                        z5 = tryMapReg(result, this.mapper.oldToNew(reg2), category);
                    }
                    if (!z5 || !z6) {
                        int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                        ArrayList<RegisterSpec> arrayList = new ArrayList<>(2);
                        arrayList.add(result);
                        arrayList.add(registerSpec);
                        while (!tryMapRegs(arrayList, findNextUnreservedRopReg, category, false)) {
                            findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
                        }
                    }
                    if (ssaInsn.getOriginalRopInsn().getCatches().size() == 0) {
                        z4 = false;
                    }
                    int oldToNew = this.mapper.oldToNew(reg);
                    if (oldToNew != this.mapper.oldToNew(reg2) && !z4) {
                        ((NormalSsaInsn) ssaInsn).changeOneSource(0, insertMoveBefore(ssaInsn, registerSpec));
                        addMapping(ssaInsn.getSources().get(0), oldToNew);
                    }
                }
            }
        }
    }

    private void handleInvokeRangeInsns() {
        Iterator<NormalSsaInsn> it = this.invokeRangeInsns.iterator();
        while (it.hasNext()) {
            adjustAndMapSourceRangeRange(it.next());
        }
    }

    private void handleLocalAssociatedOther() {
        for (ArrayList<RegisterSpec> arrayList : this.localVariables.values()) {
            int i5 = this.paramRangeEnd;
            boolean z4 = false;
            do {
                int size = arrayList.size();
                int i6 = 1;
                for (int i7 = 0; i7 < size; i7++) {
                    RegisterSpec registerSpec = arrayList.get(i7);
                    int category = registerSpec.getCategory();
                    if (!this.ssaRegsMapped.get(registerSpec.getReg()) && category > i6) {
                        i6 = category;
                    }
                }
                int findRopRegForLocal = findRopRegForLocal(i5, i6);
                if (canMapRegs(arrayList, findRopRegForLocal)) {
                    z4 = tryMapRegs(arrayList, findRopRegForLocal, i6, true);
                }
                i5 = findRopRegForLocal + 1;
            } while (!z4);
        }
    }

    private void handleLocalAssociatedParams() {
        for (ArrayList<RegisterSpec> arrayList : this.localVariables.values()) {
            int size = arrayList.size();
            int i5 = 0;
            int i6 = -1;
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                RegisterSpec registerSpec = arrayList.get(i7);
                int parameterIndexForReg = getParameterIndexForReg(registerSpec.getReg());
                if (parameterIndexForReg >= 0) {
                    i5 = registerSpec.getCategory();
                    addMapping(registerSpec, parameterIndexForReg);
                    i6 = parameterIndexForReg;
                    break;
                }
                i7++;
                i6 = parameterIndexForReg;
            }
            if (i6 >= 0) {
                tryMapRegs(arrayList, i6, i5, true);
            }
        }
    }

    private void handleNormalUnassociated() {
        RegisterSpec definitionSpecForSsaReg;
        int regCount = this.ssaMeth.getRegCount();
        for (int i5 = 0; i5 < regCount; i5++) {
            if (!this.ssaRegsMapped.get(i5) && (definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i5)) != null) {
                int category = definitionSpecForSsaReg.getCategory();
                int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
                while (!canMapReg(definitionSpecForSsaReg, findNextUnreservedRopReg)) {
                    findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
                }
                addMapping(definitionSpecForSsaReg, findNextUnreservedRopReg);
            }
        }
    }

    private void handlePhiInsns() {
        Iterator<PhiInsn> it = this.phiInsns.iterator();
        while (it.hasNext()) {
            processPhiInsn(it.next());
        }
    }

    private void handleUnassociatedParameters() {
        int regCount = this.ssaMeth.getRegCount();
        for (int i5 = 0; i5 < regCount; i5++) {
            if (!this.ssaRegsMapped.get(i5)) {
                int parameterIndexForReg = getParameterIndexForReg(i5);
                RegisterSpec definitionSpecForSsaReg = getDefinitionSpecForSsaReg(i5);
                if (parameterIndexForReg >= 0) {
                    addMapping(definitionSpecForSsaReg, parameterIndexForReg);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEven(int i5) {
        return (i5 & 1) == 0;
    }

    private boolean isThisPointerReg(int i5) {
        return i5 == 0 && !this.ssaMeth.isStatic();
    }

    private void markReserved(int i5, int i6) {
        this.reservedRopRegs.set(i5, i6 + i5, true);
    }

    private void printLocalVars() {
        System.out.println("Printing local vars");
        for (Map.Entry<LocalItem, ArrayList<RegisterSpec>> entry : this.localVariables.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            sb.append(' ');
            Iterator<RegisterSpec> it = entry.getValue().iterator();
            while (it.hasNext()) {
                RegisterSpec next = it.next();
                sb.append('v');
                sb.append(next.getReg());
                sb.append(' ');
            }
            sb.append('}');
            System.out.printf("Local: %s Registers: %s\n", entry.getKey(), sb);
        }
    }

    private void processPhiInsn(PhiInsn phiInsn) {
        RegisterSpec result = phiInsn.getResult();
        int reg = result.getReg();
        int category = result.getCategory();
        RegisterSpecList sources = phiInsn.getSources();
        int size = sources.size();
        ArrayList<RegisterSpec> arrayList = new ArrayList<>();
        Multiset multiset = new Multiset(size + 1);
        if (this.ssaRegsMapped.get(reg)) {
            multiset.add(this.mapper.oldToNew(reg));
        } else {
            arrayList.add(result);
        }
        for (int i5 = 0; i5 < size; i5++) {
            RegisterSpec result2 = this.ssaMeth.getDefinitionForRegister(sources.get(i5).getReg()).getResult();
            int reg2 = result2.getReg();
            if (this.ssaRegsMapped.get(reg2)) {
                multiset.add(this.mapper.oldToNew(reg2));
            } else {
                arrayList.add(result2);
            }
        }
        for (int i6 = 0; i6 < multiset.getSize(); i6++) {
            tryMapRegs(arrayList, multiset.getAndRemoveHighestCount(), category, false);
        }
        int findNextUnreservedRopReg = findNextUnreservedRopReg(this.paramRangeEnd, category);
        while (!tryMapRegs(arrayList, findNextUnreservedRopReg, category, false)) {
            findNextUnreservedRopReg = findNextUnreservedRopReg(findNextUnreservedRopReg + 1, category);
        }
    }

    private boolean rangeContainsReserved(int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            if (this.reservedRopRegs.get(i7)) {
                return true;
            }
        }
        return false;
    }

    private boolean spansParamRange(int i5, int i6) {
        int i7 = this.paramRangeEnd;
        return i5 < i7 && i5 + i6 > i7;
    }

    private boolean tryMapReg(RegisterSpec registerSpec, int i5, int i6) {
        if (registerSpec.getCategory() <= i6 && !this.ssaRegsMapped.get(registerSpec.getReg()) && canMapReg(registerSpec, i5)) {
            addMapping(registerSpec, i5);
            return true;
        }
        return false;
    }

    private boolean tryMapRegs(ArrayList<RegisterSpec> arrayList, int i5, int i6, boolean z4) {
        Iterator<RegisterSpec> it = arrayList.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            RegisterSpec next = it.next();
            if (!this.ssaRegsMapped.get(next.getReg())) {
                boolean tryMapReg = tryMapReg(next, i5, i6);
                if (tryMapReg && !z5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (tryMapReg && z4) {
                    markReserved(i5, next.getCategory());
                }
            }
        }
        return !z5;
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public RegisterMapper allocateRegisters() {
        analyzeInstructions();
        handleLocalAssociatedParams();
        handleUnassociatedParameters();
        handleInvokeRangeInsns();
        handleLocalAssociatedOther();
        handleCheckCastResults();
        handlePhiInsns();
        handleNormalUnassociated();
        return this.mapper;
    }

    RegisterSpecList ssaSetToSpecs(IntSet intSet) {
        RegisterSpecList registerSpecList = new RegisterSpecList(intSet.elements());
        IntIterator it = intSet.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            registerSpecList.set(i5, getDefinitionSpecForSsaReg(it.next()));
            i5++;
        }
        return registerSpecList;
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
        return true;
    }

    private int findNextUnreservedRopReg(int i5, int i6, Alignment alignment) {
        int nextClearBit = alignment.nextClearBit(this.reservedRopRegs, i5);
        while (true) {
            int i7 = 1;
            while (i7 < i6 && !this.reservedRopRegs.get(nextClearBit + i7)) {
                i7++;
            }
            if (i7 == i6) {
                return nextClearBit;
            }
            nextClearBit = alignment.nextClearBit(this.reservedRopRegs, nextClearBit + i7);
        }
    }
}
