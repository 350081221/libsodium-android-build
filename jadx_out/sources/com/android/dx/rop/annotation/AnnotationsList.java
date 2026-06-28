package com.android.dx.rop.annotation;

import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class AnnotationsList extends FixedSizeList {
    public static final AnnotationsList EMPTY = new AnnotationsList(0);

    public AnnotationsList(int i5) {
        super(i5);
    }

    public static AnnotationsList combine(AnnotationsList annotationsList, AnnotationsList annotationsList2) {
        int size = annotationsList.size();
        if (size == annotationsList2.size()) {
            AnnotationsList annotationsList3 = new AnnotationsList(size);
            for (int i5 = 0; i5 < size; i5++) {
                annotationsList3.set(i5, Annotations.combine(annotationsList.get(i5), annotationsList2.get(i5)));
            }
            annotationsList3.setImmutable();
            return annotationsList3;
        }
        throw new IllegalArgumentException("list1.size() != list2.size()");
    }

    public Annotations get(int i5) {
        return (Annotations) get0(i5);
    }

    public void set(int i5, Annotations annotations) {
        annotations.throwIfMutable();
        set0(i5, annotations);
    }
}
