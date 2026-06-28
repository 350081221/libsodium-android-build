package com.android.dx.dex.file;

import a1.i;
import com.android.dx.dex.file.OffsettedItem;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class UniformListItem<T extends OffsettedItem> extends OffsettedItem {
    private static final int HEADER_SIZE = 4;
    private final ItemType itemType;
    private final List<T> items;

    public UniformListItem(ItemType itemType, List<T> list) {
        super(getAlignment(list), writeSize(list));
        if (itemType != null) {
            this.items = list;
            this.itemType = itemType;
            return;
        }
        throw new NullPointerException("itemType == null");
    }

    private static int getAlignment(List<? extends OffsettedItem> list) {
        try {
            return Math.max(4, list.get(0).getAlignment());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    private int headerSize() {
        return getAlignment();
    }

    private static int writeSize(List<? extends OffsettedItem> list) {
        return (list.size() * list.get(0).writeSize()) + getAlignment(list);
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().addContents(dexFile);
        }
    }

    public final List<T> getItems() {
        return this.items;
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return this.itemType;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    protected void place0(Section section, int i5) {
        int headerSize = i5 + headerSize();
        boolean z4 = true;
        int i6 = -1;
        int i7 = -1;
        for (T t5 : this.items) {
            int writeSize = t5.writeSize();
            if (z4) {
                i7 = t5.getAlignment();
                z4 = false;
                i6 = writeSize;
            } else if (writeSize == i6) {
                if (t5.getAlignment() != i7) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            } else {
                throw new UnsupportedOperationException("item size mismatch");
            }
            headerSize = t5.place(section, headerSize) + writeSize;
        }
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public final String toHuman() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{");
        boolean z4 = true;
        for (T t5 : this.items) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(t5.toHuman());
        }
        sb.append(i.f138d);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(UniformListItem.class.getName());
        sb.append(this.items);
        return sb.toString();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int size = this.items.size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + " " + typeName());
            StringBuilder sb = new StringBuilder();
            sb.append("  size: ");
            sb.append(Hex.u4(size));
            annotatedOutput.annotate(4, sb.toString());
        }
        annotatedOutput.writeInt(size);
        Iterator<T> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().writeTo(dexFile, annotatedOutput);
        }
    }
}
