package com.android.dx.cf.code;

import com.android.dx.util.IntList;
import com.android.dx.util.MutabilityControl;

/* loaded from: classes2.dex */
public final class SwitchList extends MutabilityControl {
    private int size;
    private final IntList targets;
    private final IntList values;

    public SwitchList(int i5) {
        super(true);
        this.values = new IntList(i5);
        this.targets = new IntList(i5 + 1);
        this.size = i5;
    }

    public void add(int i5, int i6) {
        throwIfImmutable();
        if (i6 >= 0) {
            this.values.add(i5);
            this.targets.add(i6);
            return;
        }
        throw new IllegalArgumentException("target < 0");
    }

    public int getDefaultTarget() {
        return this.targets.get(this.size);
    }

    public int getTarget(int i5) {
        return this.targets.get(i5);
    }

    public IntList getTargets() {
        return this.targets;
    }

    public int getValue(int i5) {
        return this.values.get(i5);
    }

    public IntList getValues() {
        return this.values;
    }

    public void removeSuperfluousDefaults() {
        throwIfImmutable();
        int i5 = this.size;
        if (i5 == this.targets.size() - 1) {
            int i6 = this.targets.get(i5);
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.targets.get(i8);
                if (i9 != i6) {
                    if (i8 != i7) {
                        this.targets.set(i7, i9);
                        IntList intList = this.values;
                        intList.set(i7, intList.get(i8));
                    }
                    i7++;
                }
            }
            if (i7 != i5) {
                this.values.shrink(i7);
                this.targets.set(i7, i6);
                this.targets.shrink(i7 + 1);
                this.size = i7;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("incomplete instance");
    }

    public void setDefaultTarget(int i5) {
        throwIfImmutable();
        if (i5 >= 0) {
            if (this.targets.size() == this.size) {
                this.targets.add(i5);
                return;
            }
            throw new RuntimeException("non-default elements not all set");
        }
        throw new IllegalArgumentException("target < 0");
    }

    @Override // com.android.dx.util.MutabilityControl
    public void setImmutable() {
        this.values.setImmutable();
        this.targets.setImmutable();
        super.setImmutable();
    }

    public int size() {
        return this.size;
    }
}
