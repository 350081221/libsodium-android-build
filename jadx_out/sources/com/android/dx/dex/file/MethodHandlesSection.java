package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstMethodHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class MethodHandlesSection extends UniformItemSection {
    private final TreeMap<CstMethodHandle, MethodHandleItem> methodHandles;

    public MethodHandlesSection(DexFile dexFile) {
        super("method_handles", dexFile, 8);
        this.methodHandles = new TreeMap<>();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant != null) {
            throwIfNotPrepared();
            MethodHandleItem methodHandleItem = this.methodHandles.get((CstMethodHandle) constant);
            if (methodHandleItem != null) {
                return methodHandleItem;
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("cst == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int indexOf(CstMethodHandle cstMethodHandle) {
        return this.methodHandles.get(cstMethodHandle).getIndex();
    }

    public void intern(CstMethodHandle cstMethodHandle) {
        if (cstMethodHandle != null) {
            throwIfPrepared();
            if (this.methodHandles.get(cstMethodHandle) == null) {
                this.methodHandles.put(cstMethodHandle, new MethodHandleItem(cstMethodHandle));
                return;
            }
            return;
        }
        throw new NullPointerException("methodHandle == null");
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.methodHandles.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    protected void orderItems() {
        Iterator<MethodHandleItem> it = this.methodHandles.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            it.next().setIndex(i5);
            i5++;
        }
    }
}
