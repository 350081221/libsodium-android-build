package com.android.dx.dex.file;

import com.android.dx.rop.annotation.Annotation;
import com.android.dx.rop.annotation.Annotations;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class AnnotationSetItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ENTRY_WRITE_SIZE = 4;
    private final Annotations annotations;
    private final AnnotationItem[] items;

    public AnnotationSetItem(Annotations annotations, DexFile dexFile) {
        super(4, writeSize(annotations));
        this.annotations = annotations;
        this.items = new AnnotationItem[annotations.size()];
        Iterator<Annotation> it = annotations.getAnnotations().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            this.items[i5] = new AnnotationItem(it.next(), dexFile);
            i5++;
        }
    }

    private static int writeSize(Annotations annotations) {
        try {
            return (annotations.size() * 4) + 4;
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        MixedItemSection byteData = dexFile.getByteData();
        int length = this.items.length;
        for (int i5 = 0; i5 < length; i5++) {
            AnnotationItem[] annotationItemArr = this.items;
            annotationItemArr[i5] = (AnnotationItem) byteData.intern(annotationItemArr[i5]);
        }
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    protected int compareTo0(OffsettedItem offsettedItem) {
        return this.annotations.compareTo(((AnnotationSetItem) offsettedItem).annotations);
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    protected void place0(Section section, int i5) {
        AnnotationItem.sortByTypeIdIndex(this.items);
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.annotations.toString();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    protected void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        int length = this.items.length;
        if (annotates) {
            annotatedOutput.annotate(0, offsetString() + " annotation set");
            annotatedOutput.annotate(4, "  size: " + Hex.u4(length));
        }
        annotatedOutput.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            int absoluteOffset = this.items[i5].getAbsoluteOffset();
            if (annotates) {
                annotatedOutput.annotate(4, "  entries[" + Integer.toHexString(i5) + "]: " + Hex.u4(absoluteOffset));
                this.items[i5].annotateTo(annotatedOutput, "    ");
            }
            annotatedOutput.writeInt(absoluteOffset);
        }
    }
}
