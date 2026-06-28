package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable variable = null;
    float constantValue = 0.0f;
    boolean used = false;
    ArrayList<SolverVariable> variablesToUpdate = new ArrayList<>();
    boolean isSimpleDefinition = false;

    /* loaded from: classes2.dex */
    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f5, boolean z4);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f5);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i5);

        float getVariableValue(int i5);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f5);

        float remove(SolverVariable solverVariable, boolean z4);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z4);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < currentSize; i5++) {
            float variableValue = this.variables.getVariableValue(i5);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i5);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f5)) {
                    f5 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i5) {
        this.variables.put(linearSystem.createErrorVariable(i5, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i5, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow addSingleError(SolverVariable solverVariable, int i5) {
        this.variables.put(solverVariable, i5);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z4;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z4 = true;
        } else {
            pivot(chooseSubjectInVariables);
            z4 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
        }
        return z4;
    }

    SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        boolean isNew;
        boolean isNew2;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        SolverVariable solverVariable2 = null;
        for (int i5 = 0; i5 < currentSize; i5++) {
            float variableValue = this.variables.getVariableValue(i5);
            SolverVariable variable = this.variables.getVariable(i5);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (f5 > variableValue) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (!z4 && isNew(variable, linearSystem)) {
                    f5 = variableValue;
                    solverVariable = variable;
                    z4 = true;
                }
                z4 = isNew2;
                f5 = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    isNew = isNew(variable, linearSystem);
                } else if (f6 > variableValue) {
                    isNew = isNew(variable, linearSystem);
                } else if (!z5 && isNew(variable, linearSystem)) {
                    f6 = variableValue;
                    solverVariable2 = variable;
                    z5 = true;
                }
                z5 = isNew;
                f6 = variableValue;
                solverVariable2 = variable;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, float f5, SolverVariable solverVariable3, SolverVariable solverVariable4, int i6) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f5 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i5 > 0 || i6 > 0) {
                this.constantValue = (-i5) + i6;
            }
        } else if (f5 <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.constantValue = i5;
        } else if (f5 >= 1.0f) {
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            this.constantValue = -i6;
        } else {
            float f6 = 1.0f - f5;
            this.variables.put(solverVariable, f6 * 1.0f);
            this.variables.put(solverVariable2, f6 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f5);
            this.variables.put(solverVariable4, 1.0f * f5);
            if (i5 > 0 || i6 > 0) {
                this.constantValue = ((-i5) * f6) + (i6 * f5);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i5) {
        this.variable = solverVariable;
        float f5 = i5;
        solverVariable.computedValue = f5;
        this.constantValue = f5;
        this.isSimpleDefinition = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f5) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f5);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f5) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f5);
        this.variables.put(solverVariable4, -f5);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f5, float f6, float f7, SolverVariable solverVariable, int i5, SolverVariable solverVariable2, int i6, SolverVariable solverVariable3, int i7, SolverVariable solverVariable4, int i8) {
        if (f6 != 0.0f && f5 != f7) {
            float f8 = (f5 / f6) / (f7 / f6);
            this.constantValue = ((-i5) - i6) + (i7 * f8) + (i8 * f8);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f8);
            this.variables.put(solverVariable3, -f8);
        } else {
            this.constantValue = ((-i5) - i6) + i7 + i8;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f5, float f6, float f7, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.constantValue = 0.0f;
        if (f6 != 0.0f && f5 != f7) {
            if (f5 == 0.0f) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
            } else if (f7 == 0.0f) {
                this.variables.put(solverVariable3, 1.0f);
                this.variables.put(solverVariable4, -1.0f);
            } else {
                float f8 = (f5 / f6) / (f7 / f6);
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable4, f8);
                this.variables.put(solverVariable3, -f8);
            }
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i5) {
        if (i5 < 0) {
            this.constantValue = i5 * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.constantValue = i5;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (!z4) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (!z4) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f5) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f5;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensurePositiveConstant() {
        float f5 = this.constantValue;
        if (f5 < 0.0f) {
            this.constantValue = f5 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.variable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasKeyVariable() {
        SolverVariable solverVariable = this.variable;
        return solverVariable != null && (solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            for (int i5 = 0; i5 < arrayRow.variables.getCurrentSize(); i5++) {
                this.variables.add(arrayRow.variables.getVariable(i5), arrayRow.variables.getVariableValue(i5), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.variable == null && this.constantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable.definitionId = -1;
            this.variable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.constantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int sizeInBytes() {
        int i5;
        if (this.variable != null) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        return i5 + 4 + 4 + this.variables.sizeInBytes();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toReadableString() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z4) {
        if (solverVariable != null && solverVariable.isFinalValue) {
            this.constantValue += solverVariable.computedValue * this.variables.get(solverVariable);
            this.variables.remove(solverVariable, z4);
            if (z4) {
                solverVariable.removeFromRow(this);
            }
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.isSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z4) {
        this.constantValue += arrayRow.constantValue * this.variables.use(arrayRow, z4);
        if (z4) {
            arrayRow.variable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z4) {
        if (solverVariable != null && solverVariable.isSynonym) {
            float f5 = this.variables.get(solverVariable);
            this.constantValue += solverVariable.synonymDelta * f5;
            this.variables.remove(solverVariable, z4);
            if (z4) {
                solverVariable.removeFromRow(this);
            }
            this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.synonym], f5, z4);
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.isSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z4 = false;
        while (!z4) {
            int currentSize = this.variables.getCurrentSize();
            for (int i5 = 0; i5 < currentSize; i5++) {
                SolverVariable variable = this.variables.getVariable(i5);
                if (variable.definitionId != -1 || variable.isFinalValue || variable.isSynonym) {
                    this.variablesToUpdate.add(variable);
                }
            }
            int size = this.variablesToUpdate.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    SolverVariable solverVariable = this.variablesToUpdate.get(i6);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.isSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.definitionId], true);
                    }
                }
                this.variablesToUpdate.clear();
            } else {
                z4 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i5 = solverVariable.strength;
        float f5 = 1.0f;
        if (i5 != 1) {
            if (i5 == 2) {
                f5 = 1000.0f;
            } else if (i5 == 3) {
                f5 = 1000000.0f;
            } else if (i5 == 4) {
                f5 = 1.0E9f;
            } else if (i5 == 5) {
                f5 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f5);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (!z4) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        }
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i5, SolverVariable solverVariable2) {
        this.constantValue = i5;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
