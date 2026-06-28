package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class ClassDefsSection extends UniformItemSection {
    private final TreeMap<Type, ClassDefItem> classDefs;
    private ArrayList<ClassDefItem> orderedDefs;

    public ClassDefsSection(DexFile dexFile) {
        super("class_defs", dexFile, 4);
        this.classDefs = new TreeMap<>();
        this.orderedDefs = null;
    }

    private int orderItems0(Type type, int i5, int i6) {
        ClassDefItem classDefItem = this.classDefs.get(type);
        if (classDefItem != null && !classDefItem.hasIndex()) {
            if (i6 >= 0) {
                int i7 = i6 - 1;
                CstType superclass = classDefItem.getSuperclass();
                if (superclass != null) {
                    i5 = orderItems0(superclass.getClassType(), i5, i7);
                }
                TypeList interfaces = classDefItem.getInterfaces();
                int size = interfaces.size();
                for (int i8 = 0; i8 < size; i8++) {
                    i5 = orderItems0(interfaces.getType(i8), i5, i7);
                }
                classDefItem.setIndex(i5);
                this.orderedDefs.add(classDefItem);
                return i5 + 1;
            }
            throw new RuntimeException("class circularity with " + type);
        }
        return i5;
    }

    public void add(ClassDefItem classDefItem) {
        try {
            Type classType = classDefItem.getThisClass().getClassType();
            throwIfPrepared();
            if (this.classDefs.get(classType) == null) {
                this.classDefs.put(classType, classDefItem);
                return;
            }
            throw new IllegalArgumentException("already added: " + classType);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant != null) {
            throwIfNotPrepared();
            ClassDefItem classDefItem = this.classDefs.get(((CstType) constant).getClassType());
            if (classDefItem != null) {
                return classDefItem;
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("cst == null");
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        ArrayList<ClassDefItem> arrayList = this.orderedDefs;
        if (arrayList != null) {
            return arrayList;
        }
        return this.classDefs.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    protected void orderItems() {
        int size = this.classDefs.size();
        this.orderedDefs = new ArrayList<>(size);
        Iterator<Type> it = this.classDefs.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = orderItems0(it.next(), i5, size - i5);
        }
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int fileOffset;
        throwIfNotPrepared();
        int size = this.classDefs.size();
        if (size == 0) {
            fileOffset = 0;
        } else {
            fileOffset = getFileOffset();
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "class_defs_size: " + Hex.u4(size));
            annotatedOutput.annotate(4, "class_defs_off:  " + Hex.u4(fileOffset));
        }
        annotatedOutput.writeInt(size);
        annotatedOutput.writeInt(fileOffset);
    }
}
