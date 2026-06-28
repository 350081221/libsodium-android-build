package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float epsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int NONE = -1;
    private int SIZE = 16;
    private int HASH_SIZE = 16;
    int[] keys = new int[16];
    int[] nextKeys = new int[16];
    int[] variables = new int[16];
    float[] values = new float[16];
    int[] previous = new int[16];
    int[] next = new int[16];
    int mCount = 0;
    int head = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i5) {
        int[] iArr;
        int i6 = solverVariable.id % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            iArr2[i6] = i5;
        } else {
            while (true) {
                iArr = this.nextKeys;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    break;
                } else {
                    i7 = i8;
                }
            }
            iArr[i7] = i5;
        }
        this.nextKeys[i5] = -1;
    }

    private void addVariable(int i5, SolverVariable solverVariable, float f5) {
        this.variables[i5] = solverVariable.id;
        this.values[i5] = f5;
        this.previous[i5] = -1;
        this.next[i5] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i5 = 0; i5 < this.HASH_SIZE; i5++) {
            if (this.keys[i5] != -1) {
                String str = hashCode() + " hash [" + i5 + "] => ";
                int i6 = this.keys[i5];
                boolean z4 = false;
                while (!z4) {
                    str = str + " " + this.variables[i6];
                    int i7 = this.nextKeys[i6];
                    if (i7 != -1) {
                        i6 = i7;
                    } else {
                        z4 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i5 = 0; i5 < this.SIZE; i5++) {
            if (this.variables[i5] == -1) {
                return i5;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i5 = this.SIZE * 2;
        this.variables = Arrays.copyOf(this.variables, i5);
        this.values = Arrays.copyOf(this.values, i5);
        this.previous = Arrays.copyOf(this.previous, i5);
        this.next = Arrays.copyOf(this.next, i5);
        this.nextKeys = Arrays.copyOf(this.nextKeys, i5);
        for (int i6 = this.SIZE; i6 < i5; i6++) {
            this.variables[i6] = -1;
            this.nextKeys[i6] = -1;
        }
        this.SIZE = i5;
    }

    private void insertVariable(int i5, SolverVariable solverVariable, float f5) {
        int findEmptySlot = findEmptySlot();
        addVariable(findEmptySlot, solverVariable, f5);
        if (i5 != -1) {
            this.previous[findEmptySlot] = i5;
            int[] iArr = this.next;
            iArr[findEmptySlot] = iArr[i5];
            iArr[i5] = findEmptySlot;
        } else {
            this.previous[findEmptySlot] = -1;
            if (this.mCount > 0) {
                this.next[findEmptySlot] = this.head;
                this.head = findEmptySlot;
            } else {
                this.next[findEmptySlot] = -1;
            }
        }
        int i6 = this.next[findEmptySlot];
        if (i6 != -1) {
            this.previous[i6] = findEmptySlot;
        }
        addToHashMap(solverVariable, findEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i5;
        int i6 = solverVariable.id;
        int i7 = i6 % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i8 = iArr2[i7];
        if (i8 == -1) {
            return;
        }
        if (this.variables[i8] == i6) {
            int[] iArr3 = this.nextKeys;
            iArr2[i7] = iArr3[i8];
            iArr3[i8] = -1;
            return;
        }
        while (true) {
            iArr = this.nextKeys;
            i5 = iArr[i8];
            if (i5 == -1 || this.variables[i5] == i6) {
                break;
            } else {
                i8 = i5;
            }
        }
        if (i5 != -1 && this.variables[i5] == i6) {
            iArr[i8] = iArr[i5];
            iArr[i5] = -1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f5, boolean z4) {
        float f6 = epsilon;
        if (f5 > (-f6) && f5 < f6) {
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            put(solverVariable, f5);
            return;
        }
        float[] fArr = this.values;
        float f7 = fArr[indexOf] + f5;
        fArr[indexOf] = f7;
        float f8 = epsilon;
        if (f7 > (-f8) && f7 < f8) {
            fArr[indexOf] = 0.0f;
            remove(solverVariable, z4);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i5 = this.mCount;
        for (int i6 = 0; i6 < i5; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i7 = 0; i7 < this.SIZE; i7++) {
            this.variables[i7] = -1;
            this.nextKeys[i7] = -1;
        }
        for (int i8 = 0; i8 < this.HASH_SIZE; i8++) {
            this.keys[i8] = -1;
        }
        this.mCount = 0;
        this.head = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i5 = this.mCount;
        System.out.print("{ ");
        for (int i6 = 0; i6 < i5; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i6) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f5) {
        int i5 = this.mCount;
        int i6 = this.head;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.values;
            fArr[i6] = fArr[i6] / f5;
            i6 = this.next[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.values[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i5) {
        int i6 = this.mCount;
        if (i6 == 0) {
            return null;
        }
        int i7 = this.head;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5 && i7 != -1) {
                return this.mCache.mIndexedVariables[this.variables[i7]];
            }
            i7 = this.next[i7];
            if (i7 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i5) {
        int i6 = this.mCount;
        int i7 = this.head;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5) {
                return this.values[i7];
            }
            i7 = this.next[i7];
            if (i7 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i5 = solverVariable.id;
            int i6 = this.keys[i5 % this.HASH_SIZE];
            if (i6 == -1) {
                return -1;
            }
            if (this.variables[i6] == i5) {
                return i6;
            }
            do {
                i6 = this.nextKeys[i6];
                if (i6 == -1) {
                    break;
                }
            } while (this.variables[i6] != i5);
            if (i6 != -1 && this.variables[i6] == i5) {
                return i6;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i5 = this.mCount;
        int i6 = this.head;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.values;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.next[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f5) {
        float f6 = epsilon;
        if (f5 > (-f6) && f5 < f6) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f5);
            addToHashMap(solverVariable, 0);
            this.head = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.values[indexOf] = f5;
            return;
        }
        if (this.mCount + 1 >= this.SIZE) {
            increaseSize();
        }
        int i5 = this.mCount;
        int i6 = this.head;
        int i7 = -1;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.variables[i6];
            int i10 = solverVariable.id;
            if (i9 == i10) {
                this.values[i6] = f5;
                return;
            }
            if (i9 < i10) {
                i7 = i6;
            }
            i6 = this.next[i6];
            if (i6 == -1) {
                break;
            }
        }
        insertVariable(i7, solverVariable, f5);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z4) {
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f5 = this.values[indexOf];
        if (this.head == indexOf) {
            this.head = this.next[indexOf];
        }
        this.variables[indexOf] = -1;
        int[] iArr = this.previous;
        int i5 = iArr[indexOf];
        if (i5 != -1) {
            int[] iArr2 = this.next;
            iArr2[i5] = iArr2[indexOf];
        }
        int i6 = this.next[indexOf];
        if (i6 != -1) {
            iArr[i6] = iArr[indexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z4) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f5;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i5 = this.mCount;
        for (int i6 = 0; i6 < i5; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                String str4 = str3 + variable + " = " + getVariableValue(i6) + " ";
                int indexOf = indexOf(variable);
                String str5 = str4 + "[p: ";
                if (this.previous[indexOf] != -1) {
                    str = str5 + this.mCache.mIndexedVariables[this.variables[this.previous[indexOf]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.next[indexOf] != -1) {
                    str2 = str6 + this.mCache.mIndexedVariables[this.variables[this.next[indexOf]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z4) {
        float f5 = get(arrayRow.variable);
        remove(arrayRow.variable, z4);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i5 = 0;
        int i6 = 0;
        while (i5 < currentSize) {
            int i7 = solverVariableValues.variables[i6];
            if (i7 != -1) {
                add(this.mCache.mIndexedVariables[i7], solverVariableValues.values[i6] * f5, z4);
                i5++;
            }
            i6++;
        }
        return f5;
    }
}
