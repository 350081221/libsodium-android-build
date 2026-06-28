package com.android.dex;

/* loaded from: classes2.dex */
public final class ClassDef {
    public static final int NO_INDEX = -1;
    private final int accessFlags;
    private final int annotationsOffset;
    private final Dex buffer;
    private final int classDataOffset;
    private final int interfacesOffset;
    private final int offset;
    private final int sourceFileIndex;
    private final int staticValuesOffset;
    private final int supertypeIndex;
    private final int typeIndex;

    public ClassDef(Dex dex, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.buffer = dex;
        this.offset = i5;
        this.typeIndex = i6;
        this.accessFlags = i7;
        this.supertypeIndex = i8;
        this.interfacesOffset = i9;
        this.sourceFileIndex = i10;
        this.annotationsOffset = i11;
        this.classDataOffset = i12;
        this.staticValuesOffset = i13;
    }

    public int getAccessFlags() {
        return this.accessFlags;
    }

    public int getAnnotationsOffset() {
        return this.annotationsOffset;
    }

    public int getClassDataOffset() {
        return this.classDataOffset;
    }

    public short[] getInterfaces() {
        return this.buffer.readTypeList(this.interfacesOffset).getTypes();
    }

    public int getInterfacesOffset() {
        return this.interfacesOffset;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSourceFileIndex() {
        return this.sourceFileIndex;
    }

    public int getStaticValuesOffset() {
        return this.staticValuesOffset;
    }

    public int getSupertypeIndex() {
        return this.supertypeIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public String toString() {
        if (this.buffer == null) {
            return this.typeIndex + " " + this.supertypeIndex;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.buffer.typeNames().get(this.typeIndex));
        if (this.supertypeIndex != -1) {
            sb.append(" extends ");
            sb.append(this.buffer.typeNames().get(this.supertypeIndex));
        }
        return sb.toString();
    }
}
