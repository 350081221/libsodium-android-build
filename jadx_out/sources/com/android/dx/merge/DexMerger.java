package com.android.dx.merge;

import com.android.dex.Annotation;
import com.android.dex.CallSiteId;
import com.android.dex.ClassData;
import com.android.dex.ClassDef;
import com.android.dex.Code;
import com.android.dex.Dex;
import com.android.dex.DexException;
import com.android.dex.DexIndexOverflowException;
import com.android.dex.FieldId;
import com.android.dex.MethodHandle;
import com.android.dex.MethodId;
import com.android.dex.ProtoId;
import com.android.dex.TableOfContents;
import com.android.dex.TypeList;
import com.android.dx.command.dexer.DxContext;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class DexMerger {
    private static final byte DBG_ADVANCE_LINE = 2;
    private static final byte DBG_ADVANCE_PC = 1;
    private static final byte DBG_END_LOCAL = 5;
    private static final byte DBG_END_SEQUENCE = 0;
    private static final byte DBG_RESTART_LOCAL = 6;
    private static final byte DBG_SET_EPILOGUE_BEGIN = 8;
    private static final byte DBG_SET_FILE = 9;
    private static final byte DBG_SET_PROLOGUE_END = 7;
    private static final byte DBG_START_LOCAL = 3;
    private static final byte DBG_START_LOCAL_EXTENDED = 4;
    private final Dex.Section annotationOut;
    private final Dex.Section annotationSetOut;
    private final Dex.Section annotationSetRefListOut;
    private final Dex.Section annotationsDirectoryOut;
    private final Dex.Section classDataOut;
    private final Dex.Section codeOut;
    private final CollisionPolicy collisionPolicy;
    private int compactWasteThreshold;
    private final TableOfContents contentsOut;
    private final DxContext context;
    private final Dex.Section debugInfoOut;
    private final Dex dexOut;
    private final Dex[] dexes;
    private final Dex.Section encodedArrayOut;
    private final Dex.Section headerOut;
    private final Dex.Section idsDefsOut;
    private final IndexMap[] indexMaps;
    private final InstructionTransformer instructionTransformer;
    private final Dex.Section mapListOut;
    private final Dex.Section stringDataOut;
    private final Dex.Section typeListOut;
    private final WriterSizes writerSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class IdMerger<T extends Comparable<T>> {
        private final Dex.Section out;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class UnsortedValue implements Comparable<IdMerger<T>.UnsortedValue> {
            final int index;
            final IndexMap indexMap;
            final int offset;
            final Dex source;
            final T value;

            UnsortedValue(Dex dex, IndexMap indexMap, T t5, int i5, int i6) {
                this.source = dex;
                this.indexMap = indexMap;
                this.value = t5;
                this.index = i5;
                this.offset = i6;
            }

            @Override // java.lang.Comparable
            public int compareTo(IdMerger<T>.UnsortedValue unsortedValue) {
                return this.value.compareTo(unsortedValue.value);
            }
        }

        protected IdMerger(Dex.Section section) {
            this.out = section;
        }

        private int readIntoMap(Dex.Section section, TableOfContents.Section section2, IndexMap indexMap, int i5, TreeMap<T, List<Integer>> treeMap, int i6) {
            int i7;
            if (section != null) {
                i7 = section.getPosition();
            } else {
                i7 = -1;
            }
            if (i5 < section2.size) {
                T read = read(section, indexMap, i5);
                List<Integer> list = treeMap.get(read);
                if (list == null) {
                    list = new ArrayList<>();
                    treeMap.put(read, list);
                }
                list.add(Integer.valueOf(i6));
            }
            return i7;
        }

        private List<IdMerger<T>.UnsortedValue> readUnsortedValues(Dex dex, IndexMap indexMap) {
            TableOfContents.Section section = getSection(dex.getTableOfContents());
            if (!section.exists()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Dex.Section open = dex.open(section.off);
            for (int i5 = 0; i5 < section.size; i5++) {
                arrayList.add(new UnsortedValue(dex, indexMap, read(open, indexMap, 0), i5, open.getPosition()));
            }
            return arrayList;
        }

        abstract TableOfContents.Section getSection(TableOfContents tableOfContents);

        /* JADX WARN: Multi-variable type inference failed */
        public final void mergeSorted() {
            Dex.Section section;
            TableOfContents.Section[] sectionArr = new TableOfContents.Section[DexMerger.this.dexes.length];
            Dex.Section[] sectionArr2 = new Dex.Section[DexMerger.this.dexes.length];
            int[] iArr = new int[DexMerger.this.dexes.length];
            int[] iArr2 = new int[DexMerger.this.dexes.length];
            TreeMap treeMap = new TreeMap();
            int i5 = 0;
            for (int i6 = 0; i6 < DexMerger.this.dexes.length; i6++) {
                TableOfContents.Section section2 = getSection(DexMerger.this.dexes[i6].getTableOfContents());
                sectionArr[i6] = section2;
                if (section2.exists()) {
                    section = DexMerger.this.dexes[i6].open(sectionArr[i6].off);
                } else {
                    section = null;
                }
                Dex.Section section3 = section;
                sectionArr2[i6] = section3;
                iArr[i6] = readIntoMap(section3, sectionArr[i6], DexMerger.this.indexMaps[i6], iArr2[i6], treeMap, i6);
            }
            if (treeMap.isEmpty()) {
                getSection(DexMerger.this.contentsOut).off = 0;
                getSection(DexMerger.this.contentsOut).size = 0;
                return;
            }
            getSection(DexMerger.this.contentsOut).off = this.out.getPosition();
            while (!treeMap.isEmpty()) {
                Map.Entry pollFirstEntry = treeMap.pollFirstEntry();
                for (Integer num : (List) pollFirstEntry.getValue()) {
                    int i7 = iArr[num.intValue()];
                    IndexMap indexMap = DexMerger.this.indexMaps[num.intValue()];
                    int intValue = num.intValue();
                    int i8 = iArr2[intValue];
                    iArr2[intValue] = i8 + 1;
                    updateIndex(i7, indexMap, i8, i5);
                    iArr[num.intValue()] = readIntoMap(sectionArr2[num.intValue()], sectionArr[num.intValue()], DexMerger.this.indexMaps[num.intValue()], iArr2[num.intValue()], treeMap, num.intValue());
                }
                write((Comparable) pollFirstEntry.getKey());
                i5++;
            }
            getSection(DexMerger.this.contentsOut).size = i5;
        }

        public final void mergeUnsorted() {
            int i5;
            getSection(DexMerger.this.contentsOut).off = this.out.getPosition();
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < DexMerger.this.dexes.length; i6++) {
                arrayList.addAll(readUnsortedValues(DexMerger.this.dexes[i6], DexMerger.this.indexMaps[i6]));
            }
            if (arrayList.isEmpty()) {
                getSection(DexMerger.this.contentsOut).off = 0;
                getSection(DexMerger.this.contentsOut).size = 0;
                return;
            }
            Collections.sort(arrayList);
            int i7 = 0;
            for (int i8 = 0; i8 < arrayList.size(); i8 = i5) {
                i5 = i8 + 1;
                UnsortedValue unsortedValue = (UnsortedValue) arrayList.get(i8);
                int i9 = i7 - 1;
                updateIndex(unsortedValue.offset, unsortedValue.indexMap, unsortedValue.index, i9);
                while (i5 < arrayList.size() && unsortedValue.compareTo((UnsortedValue) arrayList.get(i5)) == 0) {
                    int i10 = i5 + 1;
                    UnsortedValue unsortedValue2 = (UnsortedValue) arrayList.get(i5);
                    updateIndex(unsortedValue2.offset, unsortedValue2.indexMap, unsortedValue2.index, i9);
                    i5 = i10;
                }
                write(unsortedValue.value);
                i7++;
            }
            getSection(DexMerger.this.contentsOut).size = i7;
        }

        abstract T read(Dex.Section section, IndexMap indexMap, int i5);

        abstract void updateIndex(int i5, IndexMap indexMap, int i6, int i7);

        abstract void write(T t5);
    }

    public DexMerger(Dex[] dexArr, CollisionPolicy collisionPolicy, DxContext dxContext) throws IOException {
        this(dexArr, collisionPolicy, dxContext, new WriterSizes(dexArr));
    }

    private SortableType[] getSortedTypes() {
        boolean z4;
        int i5 = this.contentsOut.typeIds.size;
        SortableType[] sortableTypeArr = new SortableType[i5];
        int i6 = 0;
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i6 >= dexArr.length) {
                break;
            }
            readSortableTypes(sortableTypeArr, dexArr[i6], this.indexMaps[i6]);
            i6++;
        }
        do {
            z4 = true;
            for (int i7 = 0; i7 < i5; i7++) {
                SortableType sortableType = sortableTypeArr[i7];
                if (sortableType != null && !sortableType.isDepthAssigned()) {
                    z4 &= sortableType.tryAssignDepth(sortableTypeArr);
                }
            }
        } while (!z4);
        Arrays.sort(sortableTypeArr, SortableType.NULLS_LAST_ORDER);
        int indexOf = Arrays.asList(sortableTypeArr).indexOf(null);
        if (indexOf != -1) {
            return (SortableType[]) Arrays.copyOfRange(sortableTypeArr, 0, indexOf);
        }
        return sortableTypeArr;
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 2) {
            printUsage();
            return;
        }
        Dex[] dexArr = new Dex[strArr.length - 1];
        for (int i5 = 1; i5 < strArr.length; i5++) {
            dexArr[i5 - 1] = new Dex(new File(strArr[i5]));
        }
        new DexMerger(dexArr, CollisionPolicy.KEEP_FIRST, new DxContext()).merge().writeTo(new File(strArr[0]));
    }

    private void mergeAnnotations() {
        new IdMerger<Annotation>(this.annotationOut) { // from class: com.android.dx.merge.DexMerger.9
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.annotations;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                indexMap.putAnnotationOffset(i5, DexMerger.this.annotationOut.getPosition());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public Annotation read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readAnnotation());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(Annotation annotation) {
                annotation.writeTo(DexMerger.this.annotationOut);
            }
        }.mergeUnsorted();
    }

    private int mergeApiLevels() {
        int i5 = -1;
        int i6 = 0;
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i6 < dexArr.length) {
                int i7 = dexArr[i6].getTableOfContents().apiLevel;
                if (i5 < i7) {
                    i5 = i7;
                }
                i6++;
            } else {
                return i5;
            }
        }
    }

    private void mergeCallSiteIds() {
        new IdMerger<CallSiteId>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.5
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.callSiteIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                indexMap.callSiteIds[i6] = i7;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public CallSiteId read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readCallSiteId());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(CallSiteId callSiteId) {
                callSiteId.writeTo(DexMerger.this.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeClassDefs() {
        SortableType[] sortedTypes = getSortedTypes();
        this.contentsOut.classDefs.off = this.idsDefsOut.getPosition();
        this.contentsOut.classDefs.size = sortedTypes.length;
        for (SortableType sortableType : sortedTypes) {
            transformClassDef(sortableType.getDex(), sortableType.getClassDef(), sortableType.getIndexMap());
        }
    }

    private Dex mergeDexes() throws IOException {
        mergeStringIds();
        mergeTypeIds();
        mergeTypeLists();
        mergeProtoIds();
        mergeFieldIds();
        mergeMethodIds();
        mergeMethodHandles();
        mergeAnnotations();
        unionAnnotationSetsAndDirectories();
        mergeCallSiteIds();
        mergeClassDefs();
        Arrays.sort(this.contentsOut.sections);
        TableOfContents tableOfContents = this.contentsOut;
        TableOfContents.Section section = tableOfContents.header;
        section.off = 0;
        section.size = 1;
        tableOfContents.fileSize = this.dexOut.getLength();
        this.contentsOut.computeSizesFromOffsets();
        this.contentsOut.writeHeader(this.headerOut, mergeApiLevels());
        this.contentsOut.writeMap(this.mapListOut);
        this.dexOut.writeHashes();
        return this.dexOut;
    }

    private void mergeFieldIds() {
        new IdMerger<FieldId>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.7
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.fieldIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                if (i7 >= 0 && i7 <= 65535) {
                    indexMap.fieldIds[i6] = (short) i7;
                    return;
                }
                throw new DexIndexOverflowException("field ID not in [0, 0xffff]: " + i7);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public FieldId read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readFieldId());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(FieldId fieldId) {
                fieldId.writeTo(DexMerger.this.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeMethodHandles() {
        new IdMerger<MethodHandle>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.6
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.methodHandles;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                indexMap.methodHandleIds.put(Integer.valueOf(i6), Integer.valueOf(indexMap.methodHandleIds.size()));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public MethodHandle read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readMethodHandle());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(MethodHandle methodHandle) {
                methodHandle.writeTo(DexMerger.this.idsDefsOut);
            }
        }.mergeUnsorted();
    }

    private void mergeMethodIds() {
        new IdMerger<MethodId>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.8
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.methodIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                if (i7 >= 0 && i7 <= 65535) {
                    indexMap.methodIds[i6] = (short) i7;
                    return;
                }
                throw new DexIndexOverflowException("method ID not in [0, 0xffff]: " + i7);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public MethodId read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readMethodId());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(MethodId methodId) {
                methodId.writeTo(DexMerger.this.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeProtoIds() {
        new IdMerger<ProtoId>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.4
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.protoIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                if (i7 >= 0 && i7 <= 65535) {
                    indexMap.protoIds[i6] = (short) i7;
                    return;
                }
                throw new DexIndexOverflowException("proto ID not in [0, 0xffff]: " + i7);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public ProtoId read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjust(section.readProtoId());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(ProtoId protoId) {
                protoId.writeTo(DexMerger.this.idsDefsOut);
            }
        }.mergeSorted();
    }

    private void mergeStringIds() {
        new IdMerger<String>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.1
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.stringIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                indexMap.stringIds[i6] = i7;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public String read(Dex.Section section, IndexMap indexMap, int i5) {
                return section.readString();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(String str) {
                DexMerger.this.contentsOut.stringDatas.size++;
                DexMerger.this.idsDefsOut.writeInt(DexMerger.this.stringDataOut.getPosition());
                DexMerger.this.stringDataOut.writeStringData(str);
            }
        }.mergeSorted();
    }

    private void mergeTypeIds() {
        new IdMerger<Integer>(this.idsDefsOut) { // from class: com.android.dx.merge.DexMerger.2
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.typeIds;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                if (i7 >= 0 && i7 <= 65535) {
                    indexMap.typeIds[i6] = (short) i7;
                    return;
                }
                throw new DexIndexOverflowException("type ID not in [0, 0xffff]: " + i7);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public Integer read(Dex.Section section, IndexMap indexMap, int i5) {
                return Integer.valueOf(indexMap.adjustString(section.readInt()));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(Integer num) {
                DexMerger.this.idsDefsOut.writeInt(num.intValue());
            }
        }.mergeSorted();
    }

    private void mergeTypeLists() {
        new IdMerger<TypeList>(this.typeListOut) { // from class: com.android.dx.merge.DexMerger.3
            @Override // com.android.dx.merge.DexMerger.IdMerger
            TableOfContents.Section getSection(TableOfContents tableOfContents) {
                return tableOfContents.typeLists;
            }

            @Override // com.android.dx.merge.DexMerger.IdMerger
            void updateIndex(int i5, IndexMap indexMap, int i6, int i7) {
                indexMap.putTypeListOffset(i5, DexMerger.this.typeListOut.getPosition());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public TypeList read(Dex.Section section, IndexMap indexMap, int i5) {
                return indexMap.adjustTypeList(section.readTypeList());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.android.dx.merge.DexMerger.IdMerger
            public void write(TypeList typeList) {
                DexMerger.this.typeListOut.writeTypeList(typeList);
            }
        }.mergeUnsorted();
    }

    private static void printUsage() {
        System.out.println("Usage: DexMerger <out.dex> <a.dex> <b.dex> ...");
        System.out.println();
        System.out.println("If a class is defined in several dex, the class found in the first dex will be used.");
    }

    private void readSortableTypes(SortableType[] sortableTypeArr, Dex dex, IndexMap indexMap) {
        for (ClassDef classDef : dex.classDefs()) {
            SortableType adjust = indexMap.adjust(new SortableType(dex, indexMap, classDef));
            int typeIndex = adjust.getTypeIndex();
            if (sortableTypeArr[typeIndex] == null) {
                sortableTypeArr[typeIndex] = adjust;
            } else if (this.collisionPolicy != CollisionPolicy.KEEP_FIRST) {
                throw new DexException("Multiple dex files define " + dex.typeNames().get(classDef.getTypeIndex()));
            }
        }
    }

    private void transformAnnotationDirectories(Dex dex, IndexMap indexMap) {
        TableOfContents.Section section = dex.getTableOfContents().annotationsDirectories;
        if (section.exists()) {
            Dex.Section open = dex.open(section.off);
            for (int i5 = 0; i5 < section.size; i5++) {
                transformAnnotationDirectory(open, indexMap);
            }
        }
    }

    private void transformAnnotationDirectory(Dex.Section section, IndexMap indexMap) {
        this.contentsOut.annotationsDirectories.size++;
        this.annotationsDirectoryOut.assertFourByteAligned();
        indexMap.putAnnotationDirectoryOffset(section.getPosition(), this.annotationsDirectoryOut.getPosition());
        this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        int readInt = section.readInt();
        this.annotationsDirectoryOut.writeInt(readInt);
        int readInt2 = section.readInt();
        this.annotationsDirectoryOut.writeInt(readInt2);
        int readInt3 = section.readInt();
        this.annotationsDirectoryOut.writeInt(readInt3);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustField(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
        for (int i6 = 0; i6 < readInt2; i6++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
        for (int i7 = 0; i7 < readInt3; i7++) {
            this.annotationsDirectoryOut.writeInt(indexMap.adjustMethod(section.readInt()));
            this.annotationsDirectoryOut.writeInt(indexMap.adjustAnnotationSetRefList(section.readInt()));
        }
    }

    private void transformAnnotationSet(IndexMap indexMap, Dex.Section section) {
        this.contentsOut.annotationSets.size++;
        this.annotationSetOut.assertFourByteAligned();
        indexMap.putAnnotationSetOffset(section.getPosition(), this.annotationSetOut.getPosition());
        int readInt = section.readInt();
        this.annotationSetOut.writeInt(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.annotationSetOut.writeInt(indexMap.adjustAnnotation(section.readInt()));
        }
    }

    private void transformAnnotationSetRefList(IndexMap indexMap, Dex.Section section) {
        this.contentsOut.annotationSetRefLists.size++;
        this.annotationSetRefListOut.assertFourByteAligned();
        indexMap.putAnnotationSetRefListOffset(section.getPosition(), this.annotationSetRefListOut.getPosition());
        int readInt = section.readInt();
        this.annotationSetRefListOut.writeInt(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.annotationSetRefListOut.writeInt(indexMap.adjustAnnotationSet(section.readInt()));
        }
    }

    private void transformAnnotationSetRefLists(Dex dex, IndexMap indexMap) {
        TableOfContents.Section section = dex.getTableOfContents().annotationSetRefLists;
        if (section.exists()) {
            Dex.Section open = dex.open(section.off);
            for (int i5 = 0; i5 < section.size; i5++) {
                transformAnnotationSetRefList(indexMap, open);
            }
        }
    }

    private void transformAnnotationSets(Dex dex, IndexMap indexMap) {
        TableOfContents.Section section = dex.getTableOfContents().annotationSets;
        if (section.exists()) {
            Dex.Section open = dex.open(section.off);
            for (int i5 = 0; i5 < section.size; i5++) {
                transformAnnotationSet(indexMap, open);
            }
        }
    }

    private int[] transformCatchHandlers(IndexMap indexMap, Code.CatchHandler[] catchHandlerArr) {
        int position = this.codeOut.getPosition();
        this.codeOut.writeUleb128(catchHandlerArr.length);
        int[] iArr = new int[catchHandlerArr.length];
        for (int i5 = 0; i5 < catchHandlerArr.length; i5++) {
            iArr[i5] = this.codeOut.getPosition() - position;
            transformEncodedCatchHandler(catchHandlerArr[i5], indexMap);
        }
        return iArr;
    }

    private void transformClassData(Dex dex, ClassData classData, IndexMap indexMap) {
        this.contentsOut.classDatas.size++;
        ClassData.Field[] staticFields = classData.getStaticFields();
        ClassData.Field[] instanceFields = classData.getInstanceFields();
        ClassData.Method[] directMethods = classData.getDirectMethods();
        ClassData.Method[] virtualMethods = classData.getVirtualMethods();
        this.classDataOut.writeUleb128(staticFields.length);
        this.classDataOut.writeUleb128(instanceFields.length);
        this.classDataOut.writeUleb128(directMethods.length);
        this.classDataOut.writeUleb128(virtualMethods.length);
        transformFields(indexMap, staticFields);
        transformFields(indexMap, instanceFields);
        transformMethods(dex, indexMap, directMethods);
        transformMethods(dex, indexMap, virtualMethods);
    }

    private void transformClassDef(Dex dex, ClassDef classDef, IndexMap indexMap) {
        this.idsDefsOut.assertFourByteAligned();
        this.idsDefsOut.writeInt(classDef.getTypeIndex());
        this.idsDefsOut.writeInt(classDef.getAccessFlags());
        this.idsDefsOut.writeInt(classDef.getSupertypeIndex());
        this.idsDefsOut.writeInt(classDef.getInterfacesOffset());
        this.idsDefsOut.writeInt(indexMap.adjustString(classDef.getSourceFileIndex()));
        this.idsDefsOut.writeInt(indexMap.adjustAnnotationDirectory(classDef.getAnnotationsOffset()));
        if (classDef.getClassDataOffset() == 0) {
            this.idsDefsOut.writeInt(0);
        } else {
            this.idsDefsOut.writeInt(this.classDataOut.getPosition());
            transformClassData(dex, dex.readClassData(classDef), indexMap);
        }
        this.idsDefsOut.writeInt(indexMap.adjustEncodedArray(classDef.getStaticValuesOffset()));
    }

    private void transformCode(Dex dex, Code code, IndexMap indexMap) {
        this.contentsOut.codes.size++;
        this.codeOut.assertFourByteAligned();
        this.codeOut.writeUnsignedShort(code.getRegistersSize());
        this.codeOut.writeUnsignedShort(code.getInsSize());
        this.codeOut.writeUnsignedShort(code.getOutsSize());
        Code.Try[] tries = code.getTries();
        Code.CatchHandler[] catchHandlers = code.getCatchHandlers();
        this.codeOut.writeUnsignedShort(tries.length);
        int debugInfoOffset = code.getDebugInfoOffset();
        if (debugInfoOffset != 0) {
            this.codeOut.writeInt(this.debugInfoOut.getPosition());
            transformDebugInfoItem(dex.open(debugInfoOffset), indexMap);
        } else {
            this.codeOut.writeInt(0);
        }
        short[] transform = this.instructionTransformer.transform(indexMap, code.getInstructions());
        this.codeOut.writeInt(transform.length);
        this.codeOut.write(transform);
        if (tries.length > 0) {
            if (transform.length % 2 == 1) {
                this.codeOut.writeShort((short) 0);
            }
            Dex.Section open = this.dexOut.open(this.codeOut.getPosition());
            this.codeOut.skip(tries.length * 8);
            transformTries(open, tries, transformCatchHandlers(indexMap, catchHandlers));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void transformDebugInfoItem(com.android.dex.Dex.Section r5, com.android.dx.merge.IndexMap r6) {
        /*
            r4 = this;
            com.android.dex.TableOfContents r0 = r4.contentsOut
            com.android.dex.TableOfContents$Section r0 = r0.debugInfos
            int r1 = r0.size
            int r1 = r1 + 1
            r0.size = r1
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2f
            int r2 = r5.readUleb128p1()
            com.android.dex.Dex$Section r3 = r4.debugInfoOut
            int r2 = r6.adjustString(r2)
            r3.writeUleb128p1(r2)
            int r1 = r1 + 1
            goto L1d
        L2f:
            byte r0 = r5.readByte()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeByte(r0)
            r1 = 9
            if (r0 == r1) goto L93
            switch(r0) {
                case 0: goto L92;
                case 1: goto L88;
                case 2: goto L7e;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L40;
                case 6: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L2f
        L40:
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            goto L2f
        L4a:
            int r1 = r5.readUleb128()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            r2.writeUleb128(r1)
            int r1 = r5.readUleb128p1()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            int r1 = r6.adjustString(r1)
            r2.writeUleb128p1(r1)
            int r1 = r5.readUleb128p1()
            com.android.dex.Dex$Section r2 = r4.debugInfoOut
            int r1 = r6.adjustType(r1)
            r2.writeUleb128p1(r1)
            r1 = 4
            if (r0 != r1) goto L2f
            int r0 = r5.readUleb128p1()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            int r0 = r6.adjustString(r0)
            r1.writeUleb128p1(r0)
            goto L2f
        L7e:
            int r0 = r5.readSleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeSleb128(r0)
            goto L2f
        L88:
            int r0 = r5.readUleb128()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            r1.writeUleb128(r0)
            goto L2f
        L92:
            return
        L93:
            int r0 = r5.readUleb128p1()
            com.android.dex.Dex$Section r1 = r4.debugInfoOut
            int r0 = r6.adjustString(r0)
            r1.writeUleb128p1(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.merge.DexMerger.transformDebugInfoItem(com.android.dex.Dex$Section, com.android.dx.merge.IndexMap):void");
    }

    private void transformEncodedCatchHandler(Code.CatchHandler catchHandler, IndexMap indexMap) {
        int catchAllAddress = catchHandler.getCatchAllAddress();
        int[] typeIndexes = catchHandler.getTypeIndexes();
        int[] addresses = catchHandler.getAddresses();
        if (catchAllAddress != -1) {
            this.codeOut.writeSleb128(-typeIndexes.length);
        } else {
            this.codeOut.writeSleb128(typeIndexes.length);
        }
        for (int i5 = 0; i5 < typeIndexes.length; i5++) {
            this.codeOut.writeUleb128(indexMap.adjustType(typeIndexes[i5]));
            this.codeOut.writeUleb128(addresses[i5]);
        }
        if (catchAllAddress != -1) {
            this.codeOut.writeUleb128(catchAllAddress);
        }
    }

    private void transformFields(IndexMap indexMap, ClassData.Field[] fieldArr) {
        int length = fieldArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            ClassData.Field field = fieldArr[i5];
            int adjustField = indexMap.adjustField(field.getFieldIndex());
            this.classDataOut.writeUleb128(adjustField - i6);
            this.classDataOut.writeUleb128(field.getAccessFlags());
            i5++;
            i6 = adjustField;
        }
    }

    private void transformMethods(Dex dex, IndexMap indexMap, ClassData.Method[] methodArr) {
        int length = methodArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            ClassData.Method method = methodArr[i5];
            int adjustMethod = indexMap.adjustMethod(method.getMethodIndex());
            this.classDataOut.writeUleb128(adjustMethod - i6);
            this.classDataOut.writeUleb128(method.getAccessFlags());
            if (method.getCodeOffset() == 0) {
                this.classDataOut.writeUleb128(0);
            } else {
                this.codeOut.alignToFourBytesWithZeroFill();
                this.classDataOut.writeUleb128(this.codeOut.getPosition());
                transformCode(dex, dex.readCode(method), indexMap);
            }
            i5++;
            i6 = adjustMethod;
        }
    }

    private void transformStaticValues(Dex dex, IndexMap indexMap) {
        TableOfContents.Section section = dex.getTableOfContents().encodedArrays;
        if (section.exists()) {
            Dex.Section open = dex.open(section.off);
            for (int i5 = 0; i5 < section.size; i5++) {
                transformStaticValues(open, indexMap);
            }
        }
    }

    private void transformTries(Dex.Section section, Code.Try[] tryArr, int[] iArr) {
        for (Code.Try r22 : tryArr) {
            section.writeInt(r22.getStartAddress());
            section.writeUnsignedShort(r22.getInstructionCount());
            section.writeUnsignedShort(iArr[r22.getCatchHandlerIndex()]);
        }
    }

    private void unionAnnotationSetsAndDirectories() {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i6 >= dexArr.length) {
                break;
            }
            transformAnnotationSets(dexArr[i6], this.indexMaps[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Dex[] dexArr2 = this.dexes;
            if (i7 >= dexArr2.length) {
                break;
            }
            transformAnnotationSetRefLists(dexArr2[i7], this.indexMaps[i7]);
            i7++;
        }
        int i8 = 0;
        while (true) {
            Dex[] dexArr3 = this.dexes;
            if (i8 >= dexArr3.length) {
                break;
            }
            transformAnnotationDirectories(dexArr3[i8], this.indexMaps[i8]);
            i8++;
        }
        while (true) {
            Dex[] dexArr4 = this.dexes;
            if (i5 < dexArr4.length) {
                transformStaticValues(dexArr4[i5], this.indexMaps[i5]);
                i5++;
            } else {
                return;
            }
        }
    }

    public Dex merge() throws IOException {
        Dex[] dexArr = this.dexes;
        if (dexArr.length == 1) {
            return dexArr[0];
        }
        if (dexArr.length == 0) {
            return null;
        }
        long nanoTime = System.nanoTime();
        Dex mergeDexes = mergeDexes();
        WriterSizes writerSizes = new WriterSizes(this);
        int size = this.writerSizes.size() - writerSizes.size();
        if (size > this.compactWasteThreshold) {
            mergeDexes = new DexMerger(new Dex[]{this.dexOut, new Dex(0)}, CollisionPolicy.FAIL, this.context, writerSizes).mergeDexes();
            this.context.out.printf("Result compacted from %.1fKiB to %.1fKiB to save %.1fKiB%n", Float.valueOf(this.dexOut.getLength() / 1024.0f), Float.valueOf(mergeDexes.getLength() / 1024.0f), Float.valueOf(size / 1024.0f));
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        int i5 = 0;
        while (i5 < this.dexes.length) {
            int i6 = i5 + 1;
            this.context.out.printf("Merged dex #%d (%d defs/%.1fKiB)%n", Integer.valueOf(i6), Integer.valueOf(this.dexes[i5].getTableOfContents().classDefs.size), Float.valueOf(this.dexes[i5].getLength() / 1024.0f));
            i5 = i6;
        }
        this.context.out.printf("Result is %d defs/%.1fKiB. Took %.1fs%n", Integer.valueOf(mergeDexes.getTableOfContents().classDefs.size), Float.valueOf(mergeDexes.getLength() / 1024.0f), Float.valueOf(((float) nanoTime2) / 1.0E9f));
        return mergeDexes;
    }

    public void setCompactWasteThreshold(int i5) {
        this.compactWasteThreshold = i5;
    }

    private DexMerger(Dex[] dexArr, CollisionPolicy collisionPolicy, DxContext dxContext, WriterSizes writerSizes) throws IOException {
        this.compactWasteThreshold = 1048576;
        this.dexes = dexArr;
        this.collisionPolicy = collisionPolicy;
        this.context = dxContext;
        this.writerSizes = writerSizes;
        this.dexOut = new Dex(writerSizes.size());
        this.indexMaps = new IndexMap[dexArr.length];
        for (int i5 = 0; i5 < dexArr.length; i5++) {
            this.indexMaps[i5] = new IndexMap(this.dexOut, dexArr[i5].getTableOfContents());
        }
        this.instructionTransformer = new InstructionTransformer();
        this.headerOut = this.dexOut.appendSection(writerSizes.header, "header");
        this.idsDefsOut = this.dexOut.appendSection(writerSizes.idsDefs, "ids defs");
        TableOfContents tableOfContents = this.dexOut.getTableOfContents();
        this.contentsOut = tableOfContents;
        tableOfContents.dataOff = this.dexOut.getNextSectionStart();
        tableOfContents.mapList.off = this.dexOut.getNextSectionStart();
        tableOfContents.mapList.size = 1;
        this.mapListOut = this.dexOut.appendSection(writerSizes.mapList, "map list");
        tableOfContents.typeLists.off = this.dexOut.getNextSectionStart();
        this.typeListOut = this.dexOut.appendSection(writerSizes.typeList, "type list");
        tableOfContents.annotationSetRefLists.off = this.dexOut.getNextSectionStart();
        this.annotationSetRefListOut = this.dexOut.appendSection(writerSizes.annotationsSetRefList, "annotation set ref list");
        tableOfContents.annotationSets.off = this.dexOut.getNextSectionStart();
        this.annotationSetOut = this.dexOut.appendSection(writerSizes.annotationsSet, "annotation sets");
        tableOfContents.classDatas.off = this.dexOut.getNextSectionStart();
        this.classDataOut = this.dexOut.appendSection(writerSizes.classData, "class data");
        tableOfContents.codes.off = this.dexOut.getNextSectionStart();
        this.codeOut = this.dexOut.appendSection(writerSizes.code, PluginConstants.KEY_ERROR_CODE);
        tableOfContents.stringDatas.off = this.dexOut.getNextSectionStart();
        this.stringDataOut = this.dexOut.appendSection(writerSizes.stringData, "string data");
        tableOfContents.debugInfos.off = this.dexOut.getNextSectionStart();
        this.debugInfoOut = this.dexOut.appendSection(writerSizes.debugInfo, "debug info");
        tableOfContents.annotations.off = this.dexOut.getNextSectionStart();
        this.annotationOut = this.dexOut.appendSection(writerSizes.annotation, "annotation");
        tableOfContents.encodedArrays.off = this.dexOut.getNextSectionStart();
        this.encodedArrayOut = this.dexOut.appendSection(writerSizes.encodedArray, "encoded array");
        tableOfContents.annotationsDirectories.off = this.dexOut.getNextSectionStart();
        this.annotationsDirectoryOut = this.dexOut.appendSection(writerSizes.annotationsDirectory, "annotations directory");
        tableOfContents.dataSize = this.dexOut.getNextSectionStart() - tableOfContents.dataOff;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class WriterSizes {
        private int annotation;
        private int annotationsDirectory;
        private int annotationsSet;
        private int annotationsSetRefList;
        private int classData;
        private int code;
        private int debugInfo;
        private int encodedArray;
        private int header;
        private int idsDefs;
        private int mapList;
        private int stringData;
        private int typeList;

        public WriterSizes(Dex[] dexArr) {
            this.header = 112;
            for (Dex dex : dexArr) {
                plus(dex.getTableOfContents(), false);
            }
            fourByteAlign();
        }

        private static int fourByteAlign(int i5) {
            return (i5 + 3) & (-4);
        }

        private void fourByteAlign() {
            this.header = fourByteAlign(this.header);
            this.idsDefs = fourByteAlign(this.idsDefs);
            this.mapList = fourByteAlign(this.mapList);
            this.typeList = fourByteAlign(this.typeList);
            this.classData = fourByteAlign(this.classData);
            this.code = fourByteAlign(this.code);
            this.stringData = fourByteAlign(this.stringData);
            this.debugInfo = fourByteAlign(this.debugInfo);
            this.encodedArray = fourByteAlign(this.encodedArray);
            this.annotationsDirectory = fourByteAlign(this.annotationsDirectory);
            this.annotationsSet = fourByteAlign(this.annotationsSet);
            this.annotationsSetRefList = fourByteAlign(this.annotationsSetRefList);
            this.annotation = fourByteAlign(this.annotation);
        }

        private void plus(TableOfContents tableOfContents, boolean z4) {
            this.idsDefs += (tableOfContents.stringIds.size * 4) + (tableOfContents.typeIds.size * 4) + (tableOfContents.protoIds.size * 12) + (tableOfContents.fieldIds.size * 8) + (tableOfContents.methodIds.size * 8) + (tableOfContents.classDefs.size * 32);
            this.mapList = (tableOfContents.sections.length * 12) + 4;
            this.typeList += fourByteAlign(tableOfContents.typeLists.byteCount);
            this.stringData += tableOfContents.stringDatas.byteCount;
            this.annotationsDirectory += tableOfContents.annotationsDirectories.byteCount;
            this.annotationsSet += tableOfContents.annotationSets.byteCount;
            this.annotationsSetRefList += tableOfContents.annotationSetRefLists.byteCount;
            if (z4) {
                this.code += tableOfContents.codes.byteCount;
                this.classData += tableOfContents.classDatas.byteCount;
                this.encodedArray += tableOfContents.encodedArrays.byteCount;
                this.annotation += tableOfContents.annotations.byteCount;
                this.debugInfo += tableOfContents.debugInfos.byteCount;
                return;
            }
            this.code += (int) Math.ceil(tableOfContents.codes.byteCount * 1.25d);
            this.classData += (int) Math.ceil(tableOfContents.classDatas.byteCount * 1.67d);
            this.encodedArray += tableOfContents.encodedArrays.byteCount * 2;
            this.annotation += (int) Math.ceil(tableOfContents.annotations.byteCount * 2);
            this.debugInfo += (tableOfContents.debugInfos.byteCount * 2) + 8;
        }

        public int size() {
            return this.header + this.idsDefs + this.mapList + this.typeList + this.classData + this.code + this.stringData + this.debugInfo + this.encodedArray + this.annotationsDirectory + this.annotationsSet + this.annotationsSetRefList + this.annotation;
        }

        public WriterSizes(DexMerger dexMerger) {
            this.header = 112;
            this.header = dexMerger.headerOut.used();
            this.idsDefs = dexMerger.idsDefsOut.used();
            this.mapList = dexMerger.mapListOut.used();
            this.typeList = dexMerger.typeListOut.used();
            this.classData = dexMerger.classDataOut.used();
            this.code = dexMerger.codeOut.used();
            this.stringData = dexMerger.stringDataOut.used();
            this.debugInfo = dexMerger.debugInfoOut.used();
            this.encodedArray = dexMerger.encodedArrayOut.used();
            this.annotationsDirectory = dexMerger.annotationsDirectoryOut.used();
            this.annotationsSet = dexMerger.annotationSetOut.used();
            this.annotationsSetRefList = dexMerger.annotationSetRefListOut.used();
            this.annotation = dexMerger.annotationOut.used();
            fourByteAlign();
        }
    }

    private void transformStaticValues(Dex.Section section, IndexMap indexMap) {
        this.contentsOut.encodedArrays.size++;
        indexMap.putEncodedArrayValueOffset(section.getPosition(), this.encodedArrayOut.getPosition());
        indexMap.adjustEncodedArray(section.readEncodedArray()).writeTo(this.encodedArrayOut);
    }
}
