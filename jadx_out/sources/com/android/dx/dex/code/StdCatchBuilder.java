package com.android.dx.dex.code;

import com.android.dx.dex.code.CatchTable;
import com.android.dx.rop.code.BasicBlock;
import com.android.dx.rop.code.BasicBlockList;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class StdCatchBuilder implements CatchBuilder {
    private static final int MAX_CATCH_RANGE = 65535;
    private final BlockAddresses addresses;
    private final RopMethod method;
    private final int[] order;

    public StdCatchBuilder(RopMethod ropMethod, int[] iArr, BlockAddresses blockAddresses) {
        if (ropMethod != null) {
            if (iArr != null) {
                if (blockAddresses != null) {
                    this.method = ropMethod;
                    this.order = iArr;
                    this.addresses = blockAddresses;
                    return;
                }
                throw new NullPointerException("addresses == null");
            }
            throw new NullPointerException("order == null");
        }
        throw new NullPointerException("method == null");
    }

    private static CatchHandlerList handlersFor(BasicBlock basicBlock, BlockAddresses blockAddresses) {
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        TypeList catches = basicBlock.getLastInsn().getCatches();
        int size2 = catches.size();
        if (size2 == 0) {
            return CatchHandlerList.EMPTY;
        }
        if ((primarySuccessor == -1 && size != size2) || (primarySuccessor != -1 && (size != size2 + 1 || primarySuccessor != successors.get(size2)))) {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                break;
            }
            if (catches.getType(i5).equals(Type.OBJECT)) {
                size2 = i5 + 1;
                break;
            }
            i5++;
        }
        CatchHandlerList catchHandlerList = new CatchHandlerList(size2);
        for (int i6 = 0; i6 < size2; i6++) {
            catchHandlerList.set(i6, new CstType(catches.getType(i6)), blockAddresses.getStart(successors.get(i6)).getAddress());
        }
        catchHandlerList.setImmutable();
        return catchHandlerList;
    }

    private static CatchTable.Entry makeEntry(BasicBlock basicBlock, BasicBlock basicBlock2, CatchHandlerList catchHandlerList, BlockAddresses blockAddresses) {
        return new CatchTable.Entry(blockAddresses.getLast(basicBlock).getAddress(), blockAddresses.getEnd(basicBlock2).getAddress(), catchHandlerList);
    }

    private static boolean rangeIsValid(BasicBlock basicBlock, BasicBlock basicBlock2, BlockAddresses blockAddresses) {
        if (basicBlock != null) {
            if (basicBlock2 != null) {
                if (blockAddresses.getEnd(basicBlock2).getAddress() - blockAddresses.getLast(basicBlock).getAddress() <= 65535) {
                    return true;
                }
                return false;
            }
            throw new NullPointerException("end == null");
        }
        throw new NullPointerException("start == null");
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public CatchTable build() {
        return build(this.method, this.order, this.addresses);
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public HashSet<Type> getCatchTypes() {
        HashSet<Type> hashSet = new HashSet<>(20);
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        for (int i5 = 0; i5 < size; i5++) {
            TypeList catches = blocks.get(i5).getLastInsn().getCatches();
            int size2 = catches.size();
            for (int i6 = 0; i6 < size2; i6++) {
                hashSet.add(catches.getType(i6));
            }
        }
        return hashSet;
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public boolean hasAnyCatches() {
        BasicBlockList blocks = this.method.getBlocks();
        int size = blocks.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (blocks.get(i5).getLastInsn().getCatches().size() != 0) {
                return true;
            }
        }
        return false;
    }

    public static CatchTable build(RopMethod ropMethod, int[] iArr, BlockAddresses blockAddresses) {
        int length = iArr.length;
        BasicBlockList blocks = ropMethod.getBlocks();
        ArrayList arrayList = new ArrayList(length);
        CatchHandlerList catchHandlerList = CatchHandlerList.EMPTY;
        BasicBlock basicBlock = null;
        BasicBlock basicBlock2 = null;
        for (int i5 : iArr) {
            BasicBlock labelToBlock = blocks.labelToBlock(i5);
            if (labelToBlock.canThrow()) {
                CatchHandlerList handlersFor = handlersFor(labelToBlock, blockAddresses);
                if (catchHandlerList.size() != 0) {
                    if (catchHandlerList.equals(handlersFor) && rangeIsValid(basicBlock, labelToBlock, blockAddresses)) {
                        basicBlock2 = labelToBlock;
                    } else if (catchHandlerList.size() != 0) {
                        arrayList.add(makeEntry(basicBlock, basicBlock2, catchHandlerList, blockAddresses));
                    }
                }
                basicBlock = labelToBlock;
                basicBlock2 = basicBlock;
                catchHandlerList = handlersFor;
            }
        }
        if (catchHandlerList.size() != 0) {
            arrayList.add(makeEntry(basicBlock, basicBlock2, catchHandlerList, blockAddresses));
        }
        int size = arrayList.size();
        if (size == 0) {
            return CatchTable.EMPTY;
        }
        CatchTable catchTable = new CatchTable(size);
        for (int i6 = 0; i6 < size; i6++) {
            catchTable.set(i6, (CatchTable.Entry) arrayList.get(i6));
        }
        catchTable.setImmutable();
        return catchTable;
    }
}
