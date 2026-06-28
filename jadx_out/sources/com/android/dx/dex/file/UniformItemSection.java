package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.util.AnnotatedOutput;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class UniformItemSection extends Section {
    public UniformItemSection(String str, DexFile dexFile, int i5) {
        super(str, dexFile, i5);
    }

    public abstract IndexedItem get(Constant constant);

    @Override // com.android.dx.dex.file.Section
    public final int getAbsoluteItemOffset(Item item) {
        IndexedItem indexedItem = (IndexedItem) item;
        return getAbsoluteOffset(indexedItem.getIndex() * indexedItem.writeSize());
    }

    protected abstract void orderItems();

    @Override // com.android.dx.dex.file.Section
    protected final void prepare0() {
        DexFile file = getFile();
        orderItems();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().addContents(file);
        }
    }

    @Override // com.android.dx.dex.file.Section
    public final int writeSize() {
        Collection<? extends Item> items = items();
        int size = items.size();
        if (size == 0) {
            return 0;
        }
        return size * items.iterator().next().writeSize();
    }

    @Override // com.android.dx.dex.file.Section
    protected final void writeTo0(AnnotatedOutput annotatedOutput) {
        DexFile file = getFile();
        int alignment = getAlignment();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            it.next().writeTo(file, annotatedOutput);
            annotatedOutput.alignTo(alignment);
        }
    }
}
