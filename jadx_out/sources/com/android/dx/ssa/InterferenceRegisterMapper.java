package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.ssa.back.InterferenceGraph;
import com.android.dx.util.BitIntSet;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class InterferenceRegisterMapper extends BasicRegisterMapper {
    private final ArrayList<BitIntSet> newRegInterference;
    private final InterferenceGraph oldRegInterference;

    public InterferenceRegisterMapper(InterferenceGraph interferenceGraph, int i5) {
        super(i5);
        this.newRegInterference = new ArrayList<>();
        this.oldRegInterference = interferenceGraph;
    }

    private void addInterfence(int i5, int i6) {
        int i7 = i5 + 1;
        this.newRegInterference.ensureCapacity(i7);
        while (i5 >= this.newRegInterference.size()) {
            this.newRegInterference.add(new BitIntSet(i7));
        }
        this.oldRegInterference.mergeInterferenceSet(i6, this.newRegInterference.get(i5));
    }

    @Override // com.android.dx.ssa.BasicRegisterMapper
    public void addMapping(int i5, int i6, int i7) {
        super.addMapping(i5, i6, i7);
        addInterfence(i6, i5);
        if (i7 == 2) {
            addInterfence(i6 + 1, i5);
        }
    }

    public boolean areAnyPinned(RegisterSpecList registerSpecList, int i5, int i6) {
        int size = registerSpecList.size();
        for (int i7 = 0; i7 < size; i7++) {
            RegisterSpec registerSpec = registerSpecList.get(i7);
            int oldToNew = oldToNew(registerSpec.getReg());
            if (oldToNew != i5) {
                if (registerSpec.getCategory() != 2 || oldToNew + 1 != i5) {
                    if (i6 == 2 && oldToNew == i5 + 1) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean interferes(int i5, int i6, int i7) {
        BitIntSet bitIntSet;
        if (i6 >= this.newRegInterference.size() || (bitIntSet = this.newRegInterference.get(i6)) == null) {
            return false;
        }
        if (i7 == 1) {
            return bitIntSet.has(i5);
        }
        return bitIntSet.has(i5) || interferes(i5, i6 + 1, i7 - 1);
    }

    public boolean interferes(RegisterSpec registerSpec, int i5) {
        return interferes(registerSpec.getReg(), i5, registerSpec.getCategory());
    }
}
