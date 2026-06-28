package com.android.dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class MixedItemSection extends Section {
    private static final Comparator<OffsettedItem> TYPE_SORTER = new Comparator<OffsettedItem>() { // from class: com.android.dx.dex.file.MixedItemSection.1
        @Override // java.util.Comparator
        public int compare(OffsettedItem offsettedItem, OffsettedItem offsettedItem2) {
            return offsettedItem.itemType().compareTo(offsettedItem2.itemType());
        }
    };
    private final HashMap<OffsettedItem, OffsettedItem> interns;
    private final ArrayList<OffsettedItem> items;
    private final SortType sort;
    private int writeSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.dx.dex.file.MixedItemSection$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType;

        static {
            int[] iArr = new int[SortType.values().length];
            $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType = iArr;
            try {
                iArr[SortType.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType[SortType.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum SortType {
        NONE,
        TYPE,
        INSTANCE
    }

    public MixedItemSection(String str, DexFile dexFile, int i5, SortType sortType) {
        super(str, dexFile, i5);
        this.items = new ArrayList<>(100);
        this.interns = new HashMap<>(100);
        this.sort = sortType;
        this.writeSize = -1;
    }

    public void add(OffsettedItem offsettedItem) {
        throwIfPrepared();
        try {
            if (offsettedItem.getAlignment() <= getAlignment()) {
                this.items.add(offsettedItem);
                return;
            }
            throw new IllegalArgumentException("incompatible item alignment");
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    public <T extends OffsettedItem> T get(T t5) {
        throwIfNotPrepared();
        T t6 = (T) this.interns.get(t5);
        if (t6 != null) {
            return t6;
        }
        throw new NoSuchElementException(t5.toString());
    }

    @Override // com.android.dx.dex.file.Section
    public int getAbsoluteItemOffset(Item item) {
        return ((OffsettedItem) item).getAbsoluteOffset();
    }

    public synchronized <T extends OffsettedItem> T intern(T t5) {
        throwIfPrepared();
        T t6 = (T) this.interns.get(t5);
        if (t6 != null) {
            return t6;
        }
        add(t5);
        this.interns.put(t5, t5);
        return t5;
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.items;
    }

    public void placeItems() {
        throwIfNotPrepared();
        int i5 = AnonymousClass2.$SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType[this.sort.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                Collections.sort(this.items, TYPE_SORTER);
            }
        } else {
            Collections.sort(this.items);
        }
        int size = this.items.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            OffsettedItem offsettedItem = this.items.get(i7);
            try {
                int place = offsettedItem.place(this, i6);
                if (place >= i6) {
                    i6 = offsettedItem.writeSize() + place;
                } else {
                    throw new RuntimeException("bogus place() result for " + offsettedItem);
                }
            } catch (RuntimeException e5) {
                throw ExceptionWithContext.withContext(e5, "...while placing " + offsettedItem);
            }
        }
        this.writeSize = i6;
    }

    @Override // com.android.dx.dex.file.Section
    protected void prepare0() {
        DexFile file = getFile();
        int i5 = 0;
        while (true) {
            int size = this.items.size();
            if (i5 >= size) {
                return;
            }
            while (i5 < size) {
                this.items.get(i5).addContents(file);
                i5++;
            }
        }
    }

    public int size() {
        return this.items.size();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int fileOffset;
        throwIfNotPrepared();
        int i5 = this.writeSize;
        if (i5 != -1) {
            if (i5 == 0) {
                fileOffset = 0;
            } else {
                fileOffset = getFileOffset();
            }
            String name = getName();
            if (name == null) {
                name = "<unnamed>";
            }
            char[] cArr = new char[15 - name.length()];
            Arrays.fill(cArr, ' ');
            String str = new String(cArr);
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(4, name + "_size:" + str + Hex.u4(i5));
                annotatedOutput.annotate(4, name + "_off: " + str + Hex.u4(fileOffset));
            }
            annotatedOutput.writeInt(i5);
            annotatedOutput.writeInt(fileOffset);
            return;
        }
        throw new RuntimeException("write size not yet set");
    }

    public void writeIndexAnnotation(AnnotatedOutput annotatedOutput, ItemType itemType, String str) {
        throwIfNotPrepared();
        TreeMap treeMap = new TreeMap();
        Iterator<OffsettedItem> it = this.items.iterator();
        while (it.hasNext()) {
            OffsettedItem next = it.next();
            if (next.itemType() == itemType) {
                treeMap.put(next.toHuman(), next);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        annotatedOutput.annotate(0, str);
        for (Map.Entry entry : treeMap.entrySet()) {
            annotatedOutput.annotate(0, ((OffsettedItem) entry.getValue()).offsetString() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // com.android.dx.dex.file.Section
    public int writeSize() {
        throwIfNotPrepared();
        return this.writeSize;
    }

    @Override // com.android.dx.dex.file.Section
    protected void writeTo0(AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        DexFile file = getFile();
        Iterator<OffsettedItem> it = this.items.iterator();
        boolean z4 = true;
        int i5 = 0;
        while (it.hasNext()) {
            OffsettedItem next = it.next();
            if (annotates) {
                if (z4) {
                    z4 = false;
                } else {
                    annotatedOutput.annotate(0, "\n");
                }
            }
            int alignment = next.getAlignment() - 1;
            int i6 = (~alignment) & (i5 + alignment);
            if (i5 != i6) {
                annotatedOutput.writeZeroes(i6 - i5);
                i5 = i6;
            }
            next.writeTo(file, annotatedOutput);
            i5 += next.writeSize();
        }
        if (i5 == this.writeSize) {
        } else {
            throw new RuntimeException("output size mismatch");
        }
    }
}
