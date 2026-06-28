package com.android.dx.cf.code;

import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.FixedSizeList;
import com.android.dx.util.IntList;

/* loaded from: classes2.dex */
public final class ByteCatchList extends FixedSizeList {
    public static final ByteCatchList EMPTY = new ByteCatchList(0);

    /* loaded from: classes2.dex */
    public static class Item {
        private final int endPc;
        private final CstType exceptionClass;
        private final int handlerPc;
        private final int startPc;

        public Item(int i5, int i6, int i7, CstType cstType) {
            if (i5 >= 0) {
                if (i6 >= i5) {
                    if (i7 >= 0) {
                        this.startPc = i5;
                        this.endPc = i6;
                        this.handlerPc = i7;
                        this.exceptionClass = cstType;
                        return;
                    }
                    throw new IllegalArgumentException("handlerPc < 0");
                }
                throw new IllegalArgumentException("endPc < startPc");
            }
            throw new IllegalArgumentException("startPc < 0");
        }

        public boolean covers(int i5) {
            return i5 >= this.startPc && i5 < this.endPc;
        }

        public int getEndPc() {
            return this.endPc;
        }

        public CstType getExceptionClass() {
            CstType cstType = this.exceptionClass;
            return cstType != null ? cstType : CstType.OBJECT;
        }

        public int getHandlerPc() {
            return this.handlerPc;
        }

        public int getStartPc() {
            return this.startPc;
        }
    }

    public ByteCatchList(int i5) {
        super(i5);
    }

    private static boolean typeNotFound(Item item, Item[] itemArr, int i5) {
        CstType exceptionClass = item.getExceptionClass();
        for (int i6 = 0; i6 < i5; i6++) {
            CstType exceptionClass2 = itemArr[i6].getExceptionClass();
            if (exceptionClass2 == exceptionClass || exceptionClass2 == CstType.OBJECT) {
                return false;
            }
        }
        return true;
    }

    public int byteLength() {
        return (size() * 8) + 2;
    }

    public Item get(int i5) {
        return (Item) get0(i5);
    }

    public ByteCatchList listFor(int i5) {
        int size = size();
        Item[] itemArr = new Item[size];
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Item item = get(i7);
            if (item.covers(i5) && typeNotFound(item, itemArr, i6)) {
                itemArr[i6] = item;
                i6++;
            }
        }
        if (i6 == 0) {
            return EMPTY;
        }
        ByteCatchList byteCatchList = new ByteCatchList(i6);
        for (int i8 = 0; i8 < i6; i8++) {
            byteCatchList.set(i8, itemArr[i8]);
        }
        byteCatchList.setImmutable();
        return byteCatchList;
    }

    public void set(int i5, Item item) {
        if (item != null) {
            set0(i5, item);
            return;
        }
        throw new NullPointerException("item == null");
    }

    public TypeList toRopCatchList() {
        int size = size();
        if (size == 0) {
            return StdTypeList.EMPTY;
        }
        StdTypeList stdTypeList = new StdTypeList(size);
        for (int i5 = 0; i5 < size; i5++) {
            stdTypeList.set(i5, get(i5).getExceptionClass().getClassType());
        }
        stdTypeList.setImmutable();
        return stdTypeList;
    }

    public IntList toTargetList(int i5) {
        int i6;
        if (i5 >= -1) {
            if (i5 >= 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            int size = size();
            if (size == 0) {
                if (i6 != 0) {
                    return IntList.makeImmutable(i5);
                }
                return IntList.EMPTY;
            }
            IntList intList = new IntList(size + i6);
            for (int i7 = 0; i7 < size; i7++) {
                intList.add(get(i7).getHandlerPc());
            }
            if (i6 != 0) {
                intList.add(i5);
            }
            intList.setImmutable();
            return intList;
        }
        throw new IllegalArgumentException("noException < -1");
    }

    public void set(int i5, int i6, int i7, int i8, CstType cstType) {
        set0(i5, new Item(i6, i7, i8, cstType));
    }
}
