package com.android.dx.dex.code;

import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class PositionList extends FixedSizeList {
    public static final PositionList EMPTY = new PositionList(0);
    public static final int IMPORTANT = 3;
    public static final int LINES = 2;
    public static final int NONE = 1;

    /* loaded from: classes2.dex */
    public static class Entry {
        private final int address;
        private final SourcePosition position;

        public Entry(int i5, SourcePosition sourcePosition) {
            if (i5 >= 0) {
                if (sourcePosition != null) {
                    this.address = i5;
                    this.position = sourcePosition;
                    return;
                }
                throw new NullPointerException("position == null");
            }
            throw new IllegalArgumentException("address < 0");
        }

        public int getAddress() {
            return this.address;
        }

        public SourcePosition getPosition() {
            return this.position;
        }
    }

    public PositionList(int i5) {
        super(i5);
    }

    public static PositionList make(DalvInsnList dalvInsnList, int i5) {
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                throw new IllegalArgumentException("bogus howMuch");
            }
            SourcePosition sourcePosition = SourcePosition.NO_INFO;
            int size = dalvInsnList.size();
            Entry[] entryArr = new Entry[size];
            SourcePosition sourcePosition2 = sourcePosition;
            int i6 = 0;
            boolean z4 = false;
            for (int i7 = 0; i7 < size; i7++) {
                DalvInsn dalvInsn = dalvInsnList.get(i7);
                if (dalvInsn instanceof CodeAddress) {
                    z4 = true;
                } else {
                    SourcePosition position = dalvInsn.getPosition();
                    if (!position.equals(sourcePosition) && !position.sameLine(sourcePosition2) && (i5 != 3 || z4)) {
                        entryArr[i6] = new Entry(dalvInsn.getAddress(), position);
                        i6++;
                        z4 = false;
                        sourcePosition2 = position;
                    }
                }
            }
            PositionList positionList = new PositionList(i6);
            for (int i8 = 0; i8 < i6; i8++) {
                positionList.set(i8, entryArr[i8]);
            }
            positionList.setImmutable();
            return positionList;
        }
        return EMPTY;
    }

    public Entry get(int i5) {
        return (Entry) get0(i5);
    }

    public void set(int i5, Entry entry) {
        set0(i5, entry);
    }
}
