package com.android.dx.cf.code;

import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public class BootstrapMethodsList extends FixedSizeList {
    public static final BootstrapMethodsList EMPTY = new BootstrapMethodsList(0);

    /* loaded from: classes2.dex */
    public static class Item {
        private final BootstrapMethodArgumentsList bootstrapMethodArgumentsList;
        private final CstMethodHandle bootstrapMethodHandle;
        private final CstType declaringClass;

        public Item(CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
            if (cstType != null) {
                if (cstMethodHandle != null) {
                    if (bootstrapMethodArgumentsList != null) {
                        this.bootstrapMethodHandle = cstMethodHandle;
                        this.bootstrapMethodArgumentsList = bootstrapMethodArgumentsList;
                        this.declaringClass = cstType;
                        return;
                    }
                    throw new NullPointerException("bootstrapMethodArguments == null");
                }
                throw new NullPointerException("bootstrapMethodHandle == null");
            }
            throw new NullPointerException("declaringClass == null");
        }

        public BootstrapMethodArgumentsList getBootstrapMethodArguments() {
            return this.bootstrapMethodArgumentsList;
        }

        public CstMethodHandle getBootstrapMethodHandle() {
            return this.bootstrapMethodHandle;
        }

        public CstType getDeclaringClass() {
            return this.declaringClass;
        }
    }

    public BootstrapMethodsList(int i5) {
        super(i5);
    }

    public static BootstrapMethodsList concat(BootstrapMethodsList bootstrapMethodsList, BootstrapMethodsList bootstrapMethodsList2) {
        BootstrapMethodsList bootstrapMethodsList3 = EMPTY;
        if (bootstrapMethodsList == bootstrapMethodsList3) {
            return bootstrapMethodsList2;
        }
        if (bootstrapMethodsList2 == bootstrapMethodsList3) {
            return bootstrapMethodsList;
        }
        int size = bootstrapMethodsList.size();
        int size2 = bootstrapMethodsList2.size();
        BootstrapMethodsList bootstrapMethodsList4 = new BootstrapMethodsList(size + size2);
        for (int i5 = 0; i5 < size; i5++) {
            bootstrapMethodsList4.set(i5, bootstrapMethodsList.get(i5));
        }
        for (int i6 = 0; i6 < size2; i6++) {
            bootstrapMethodsList4.set(size + i6, bootstrapMethodsList2.get(i6));
        }
        return bootstrapMethodsList4;
    }

    public Item get(int i5) {
        return (Item) get0(i5);
    }

    public void set(int i5, Item item) {
        if (item != null) {
            set0(i5, item);
            return;
        }
        throw new NullPointerException("item == null");
    }

    public void set(int i5, CstType cstType, CstMethodHandle cstMethodHandle, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        set(i5, new Item(cstType, cstMethodHandle, bootstrapMethodArgumentsList));
    }
}
