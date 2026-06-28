package com.android.dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.util.AnnotatedOutput;

/* loaded from: classes2.dex */
public abstract class OffsettedItem extends Item implements Comparable<OffsettedItem> {
    private Section addedTo;
    private final int alignment;
    private int offset;
    private int writeSize;

    public OffsettedItem(int i5, int i6) {
        Section.validateAlignment(i5);
        if (i6 >= -1) {
            this.alignment = i5;
            this.writeSize = i6;
            this.addedTo = null;
            this.offset = -1;
            return;
        }
        throw new IllegalArgumentException("writeSize < -1");
    }

    public static int getAbsoluteOffsetOr0(OffsettedItem offsettedItem) {
        if (offsettedItem == null) {
            return 0;
        }
        return offsettedItem.getAbsoluteOffset();
    }

    protected int compareTo0(OffsettedItem offsettedItem) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsettedItem offsettedItem = (OffsettedItem) obj;
        if (itemType() == offsettedItem.itemType() && compareTo0(offsettedItem) == 0) {
            return true;
        }
        return false;
    }

    public final int getAbsoluteOffset() {
        int i5 = this.offset;
        if (i5 >= 0) {
            return this.addedTo.getAbsoluteOffset(i5);
        }
        throw new RuntimeException("offset not yet known");
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final int getRelativeOffset() {
        int i5 = this.offset;
        if (i5 >= 0) {
            return i5;
        }
        throw new RuntimeException("offset not yet known");
    }

    public final String offsetString() {
        return '[' + Integer.toHexString(getAbsoluteOffset()) + ']';
    }

    public final int place(Section section, int i5) {
        if (section != null) {
            if (i5 >= 0) {
                if (this.addedTo == null) {
                    int i6 = this.alignment - 1;
                    int i7 = (i5 + i6) & (~i6);
                    this.addedTo = section;
                    this.offset = i7;
                    place0(section, i7);
                    return i7;
                }
                throw new RuntimeException("already written");
            }
            throw new IllegalArgumentException("offset < 0");
        }
        throw new NullPointerException("addedTo == null");
    }

    protected void place0(Section section, int i5) {
    }

    public final void setWriteSize(int i5) {
        if (i5 >= 0) {
            if (this.writeSize < 0) {
                this.writeSize = i5;
                return;
            }
            throw new UnsupportedOperationException("writeSize already set");
        }
        throw new IllegalArgumentException("writeSize < 0");
    }

    public abstract String toHuman();

    @Override // com.android.dx.dex.file.Item
    public final int writeSize() {
        int i5 = this.writeSize;
        if (i5 >= 0) {
            return i5;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // com.android.dx.dex.file.Item
    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
        try {
            if (this.writeSize >= 0) {
                annotatedOutput.assertCursor(getAbsoluteOffset());
                writeTo0(dexFile, annotatedOutput);
                return;
            }
            throw new UnsupportedOperationException("writeSize is unknown");
        } catch (RuntimeException e5) {
            throw ExceptionWithContext.withContext(e5, "...while writing " + this);
        }
    }

    protected abstract void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput);

    @Override // java.lang.Comparable
    public final int compareTo(OffsettedItem offsettedItem) {
        if (this == offsettedItem) {
            return 0;
        }
        ItemType itemType = itemType();
        ItemType itemType2 = offsettedItem.itemType();
        if (itemType != itemType2) {
            return itemType.compareTo(itemType2);
        }
        return compareTo0(offsettedItem);
    }
}
