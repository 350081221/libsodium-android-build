package com.android.dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.file.MixedItemSection;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstBaseMethodRef;
import com.android.dx.rop.cst.CstCallSiteRef;
import com.android.dx.rop.cst.CstEnumRef;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.util.ByteArrayAnnotatedOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public final class DexFile {
    private final MixedItemSection byteData;
    private final CallSiteIdsSection callSiteIds;
    private final MixedItemSection classData;
    private final ClassDefsSection classDefs;
    private final DexOptions dexOptions;
    private int dumpWidth;
    private final FieldIdsSection fieldIds;
    private int fileSize;
    private final HeaderSection header;
    private final MixedItemSection map;
    private final MethodHandlesSection methodHandles;
    private final MethodIdsSection methodIds;
    private final ProtoIdsSection protoIds;
    private final Section[] sections;
    private final MixedItemSection stringData;
    private final StringIdsSection stringIds;
    private final TypeIdsSection typeIds;
    private final MixedItemSection typeLists;
    private final MixedItemSection wordData;

    /* loaded from: classes2.dex */
    public static final class Storage {
        byte[] storage;

        public Storage(byte[] bArr) {
            this.storage = bArr;
        }

        public byte[] getStorage(int i5) {
            if (this.storage.length < i5) {
                Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + this.storage.length + " vs " + i5);
                this.storage = new byte[i5];
            }
            return this.storage;
        }
    }

    public DexFile(DexOptions dexOptions) {
        this.dexOptions = dexOptions;
        HeaderSection headerSection = new HeaderSection(this);
        this.header = headerSection;
        MixedItemSection.SortType sortType = MixedItemSection.SortType.NONE;
        MixedItemSection mixedItemSection = new MixedItemSection(null, this, 4, sortType);
        this.typeLists = mixedItemSection;
        MixedItemSection.SortType sortType2 = MixedItemSection.SortType.TYPE;
        MixedItemSection mixedItemSection2 = new MixedItemSection("word_data", this, 4, sortType2);
        this.wordData = mixedItemSection2;
        MixedItemSection mixedItemSection3 = new MixedItemSection("string_data", this, 1, MixedItemSection.SortType.INSTANCE);
        this.stringData = mixedItemSection3;
        MixedItemSection mixedItemSection4 = new MixedItemSection(null, this, 1, sortType);
        this.classData = mixedItemSection4;
        MixedItemSection mixedItemSection5 = new MixedItemSection("byte_data", this, 1, sortType2);
        this.byteData = mixedItemSection5;
        StringIdsSection stringIdsSection = new StringIdsSection(this);
        this.stringIds = stringIdsSection;
        TypeIdsSection typeIdsSection = new TypeIdsSection(this);
        this.typeIds = typeIdsSection;
        ProtoIdsSection protoIdsSection = new ProtoIdsSection(this);
        this.protoIds = protoIdsSection;
        FieldIdsSection fieldIdsSection = new FieldIdsSection(this);
        this.fieldIds = fieldIdsSection;
        MethodIdsSection methodIdsSection = new MethodIdsSection(this);
        this.methodIds = methodIdsSection;
        ClassDefsSection classDefsSection = new ClassDefsSection(this);
        this.classDefs = classDefsSection;
        MixedItemSection mixedItemSection6 = new MixedItemSection("map", this, 4, sortType);
        this.map = mixedItemSection6;
        if (dexOptions.apiIsSupported(26)) {
            CallSiteIdsSection callSiteIdsSection = new CallSiteIdsSection(this);
            this.callSiteIds = callSiteIdsSection;
            MethodHandlesSection methodHandlesSection = new MethodHandlesSection(this);
            this.methodHandles = methodHandlesSection;
            this.sections = new Section[]{headerSection, stringIdsSection, typeIdsSection, protoIdsSection, fieldIdsSection, methodIdsSection, classDefsSection, callSiteIdsSection, methodHandlesSection, mixedItemSection2, mixedItemSection, mixedItemSection3, mixedItemSection5, mixedItemSection4, mixedItemSection6};
        } else {
            this.callSiteIds = null;
            this.methodHandles = null;
            this.sections = new Section[]{headerSection, stringIdsSection, typeIdsSection, protoIdsSection, fieldIdsSection, methodIdsSection, classDefsSection, mixedItemSection2, mixedItemSection, mixedItemSection3, mixedItemSection5, mixedItemSection4, mixedItemSection6};
        }
        this.fileSize = -1;
        this.dumpWidth = 79;
    }

    private static void calcChecksum(byte[] bArr, int i5) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, i5 - 12);
        int value = (int) adler32.getValue();
        bArr[8] = (byte) value;
        bArr[9] = (byte) (value >> 8);
        bArr[10] = (byte) (value >> 16);
        bArr[11] = (byte) (value >> 24);
    }

    private static void calcSignature(byte[] bArr, int i5) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i5 - 32);
            try {
                int digest = messageDigest.digest(bArr, 12, 20);
                if (digest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + digest + " bytes");
            } catch (DigestException e5) {
                throw new RuntimeException(e5);
            }
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        }
    }

    private ByteArrayAnnotatedOutput toDex0(boolean z4, boolean z5, Storage storage) {
        byte[] storage2;
        ExceptionWithContext exceptionWithContext;
        this.classDefs.prepare();
        this.classData.prepare();
        this.wordData.prepare();
        if (this.dexOptions.apiIsSupported(26)) {
            this.callSiteIds.prepare();
        }
        this.byteData.prepare();
        if (this.dexOptions.apiIsSupported(26)) {
            this.methodHandles.prepare();
        }
        this.methodIds.prepare();
        this.fieldIds.prepare();
        this.protoIds.prepare();
        this.typeLists.prepare();
        this.typeIds.prepare();
        this.stringIds.prepare();
        this.stringData.prepare();
        this.header.prepare();
        int length = this.sections.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            Section section = this.sections[i6];
            if ((section != this.callSiteIds && section != this.methodHandles) || !section.items().isEmpty()) {
                int fileOffset = section.setFileOffset(i5);
                if (fileOffset >= i5) {
                    try {
                        MixedItemSection mixedItemSection = this.map;
                        if (section == mixedItemSection) {
                            MapItem.addMap(this.sections, mixedItemSection);
                            this.map.prepare();
                        }
                        if (section instanceof MixedItemSection) {
                            ((MixedItemSection) section).placeItems();
                        }
                        i5 = section.writeSize() + fileOffset;
                    } catch (RuntimeException e5) {
                        throw ExceptionWithContext.withContext(e5, "...while writing section " + i6);
                    }
                } else {
                    throw new RuntimeException("bogus placement for section " + i6);
                }
            }
        }
        this.fileSize = i5;
        if (storage == null) {
            storage2 = new byte[i5];
        } else {
            storage2 = storage.getStorage(i5);
        }
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(storage2);
        if (z4) {
            byteArrayAnnotatedOutput.enableAnnotations(this.dumpWidth, z5);
        }
        for (int i7 = 0; i7 < length; i7++) {
            try {
                Section section2 = this.sections[i7];
                if ((section2 != this.callSiteIds && section2 != this.methodHandles) || !section2.items().isEmpty()) {
                    int fileOffset2 = section2.getFileOffset() - byteArrayAnnotatedOutput.getCursor();
                    if (fileOffset2 >= 0) {
                        byteArrayAnnotatedOutput.writeZeroes(fileOffset2);
                        section2.writeTo(byteArrayAnnotatedOutput);
                    } else {
                        throw new ExceptionWithContext("excess write of " + (-fileOffset2));
                    }
                }
            } catch (RuntimeException e6) {
                if (e6 instanceof ExceptionWithContext) {
                    exceptionWithContext = (ExceptionWithContext) e6;
                } else {
                    exceptionWithContext = new ExceptionWithContext(e6);
                }
                exceptionWithContext.addContext("...while writing section " + i7);
                throw exceptionWithContext;
            }
        }
        if (byteArrayAnnotatedOutput.getCursor() == this.fileSize) {
            calcSignature(storage2, byteArrayAnnotatedOutput.getCursor());
            calcChecksum(storage2, byteArrayAnnotatedOutput.getCursor());
            if (z4) {
                this.wordData.writeIndexAnnotation(byteArrayAnnotatedOutput, ItemType.TYPE_CODE_ITEM, "\nmethod code index:\n\n");
                getStatistics().writeAnnotation(byteArrayAnnotatedOutput);
                byteArrayAnnotatedOutput.finishAnnotating();
            }
            return byteArrayAnnotatedOutput;
        }
        throw new RuntimeException("foreshortened write");
    }

    public void add(ClassDefItem classDefItem) {
        this.classDefs.add(classDefItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexedItem findItemOrNull(Constant constant) {
        if (constant instanceof CstString) {
            return this.stringIds.get(constant);
        }
        if (constant instanceof CstType) {
            return this.typeIds.get(constant);
        }
        if (constant instanceof CstBaseMethodRef) {
            return this.methodIds.get(constant);
        }
        if (constant instanceof CstFieldRef) {
            return this.fieldIds.get(constant);
        }
        if (constant instanceof CstEnumRef) {
            return this.fieldIds.intern(((CstEnumRef) constant).getFieldRef());
        }
        if (constant instanceof CstProtoRef) {
            return this.protoIds.get(constant);
        }
        if (constant instanceof CstMethodHandle) {
            return this.methodHandles.get(constant);
        }
        if (constant instanceof CstCallSiteRef) {
            return this.callSiteIds.get(constant);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getByteData() {
        return this.byteData;
    }

    public CallSiteIdsSection getCallSiteIds() {
        return this.callSiteIds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getClassData() {
        return this.classData;
    }

    public ClassDefsSection getClassDefs() {
        return this.classDefs;
    }

    public ClassDefItem getClassOrNull(String str) {
        try {
            return (ClassDefItem) this.classDefs.get(new CstType(Type.internClassName(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public DexOptions getDexOptions() {
        return this.dexOptions;
    }

    public FieldIdsSection getFieldIds() {
        return this.fieldIds;
    }

    public int getFileSize() {
        int i5 = this.fileSize;
        if (i5 >= 0) {
            return i5;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Section getFirstDataSection() {
        return this.wordData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Section getLastDataSection() {
        return this.map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getMap() {
        return this.map;
    }

    public MethodHandlesSection getMethodHandles() {
        return this.methodHandles;
    }

    public MethodIdsSection getMethodIds() {
        return this.methodIds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtoIdsSection getProtoIds() {
        return this.protoIds;
    }

    public Statistics getStatistics() {
        Statistics statistics = new Statistics();
        for (Section section : this.sections) {
            statistics.addAll(section);
        }
        return statistics;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getStringData() {
        return this.stringData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringIdsSection getStringIds() {
        return this.stringIds;
    }

    public TypeIdsSection getTypeIds() {
        return this.typeIds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getTypeLists() {
        return this.typeLists;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MixedItemSection getWordData() {
        return this.wordData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void internIfAppropriate(Constant constant) {
        if (constant != null) {
            if (constant instanceof CstString) {
                this.stringIds.intern((CstString) constant);
                return;
            }
            if (constant instanceof CstType) {
                this.typeIds.intern((CstType) constant);
                return;
            }
            if (constant instanceof CstBaseMethodRef) {
                this.methodIds.intern((CstBaseMethodRef) constant);
                return;
            }
            if (constant instanceof CstFieldRef) {
                this.fieldIds.intern((CstFieldRef) constant);
                return;
            }
            if (constant instanceof CstEnumRef) {
                this.fieldIds.intern(((CstEnumRef) constant).getFieldRef());
                return;
            } else if (constant instanceof CstProtoRef) {
                this.protoIds.intern(((CstProtoRef) constant).getPrototype());
                return;
            } else {
                if (constant instanceof CstMethodHandle) {
                    this.methodHandles.intern((CstMethodHandle) constant);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("cst == null");
    }

    public boolean isEmpty() {
        return this.classDefs.items().isEmpty();
    }

    public void setDumpWidth(int i5) {
        if (i5 >= 40) {
            this.dumpWidth = i5;
            return;
        }
        throw new IllegalArgumentException("dumpWidth < 40");
    }

    public byte[] toDex(Writer writer, boolean z4) throws IOException {
        boolean z5;
        if (writer != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        ByteArrayAnnotatedOutput dex0 = toDex0(z5, z4, null);
        if (z5) {
            dex0.writeAnnotationsTo(writer);
        }
        return dex0.getArray();
    }

    public void writeTo(OutputStream outputStream, Writer writer, boolean z4) throws IOException {
        writeTo(outputStream, null, writer, z4);
    }

    public void writeTo(OutputStream outputStream, Storage storage, Writer writer, boolean z4) throws IOException {
        boolean z5 = writer != null;
        ByteArrayAnnotatedOutput dex0 = toDex0(z5, z4, storage);
        if (outputStream != null) {
            outputStream.write(dex0.getArray());
        }
        if (z5) {
            dex0.writeAnnotationsTo(writer);
        }
    }

    public ByteArrayAnnotatedOutput writeTo(Storage storage) {
        return toDex0(false, false, storage);
    }
}
