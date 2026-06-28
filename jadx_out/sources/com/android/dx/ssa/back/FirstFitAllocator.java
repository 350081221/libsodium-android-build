package com.android.dx.ssa.back;

import com.android.dx.rop.code.CstInsn;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.ssa.BasicRegisterMapper;
import com.android.dx.ssa.NormalSsaInsn;
import com.android.dx.ssa.RegisterMapper;
import com.android.dx.ssa.SsaMethod;
import com.android.dx.util.BitIntSet;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class FirstFitAllocator extends RegisterAllocator {
    private static final boolean PRESLOT_PARAMS = true;
    private final BitSet mapped;

    public FirstFitAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
        this.mapped = new BitSet(ssaMethod.getRegCount());
    }

    private int paramNumberFromMoveParam(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public RegisterMapper allocateRegisters() {
        int i5;
        boolean z4;
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        int paramWidth = this.ssaMeth.getParamWidth();
        for (int i6 = 0; i6 < regCount; i6++) {
            if (!this.mapped.get(i6)) {
                int categoryForSsaReg = getCategoryForSsaReg(i6);
                BitIntSet bitIntSet = new BitIntSet(regCount);
                this.interference.mergeInterferenceSet(i6, bitIntSet);
                if (isDefinitionMoveParam(i6)) {
                    i5 = paramNumberFromMoveParam((NormalSsaInsn) this.ssaMeth.getDefinitionForRegister(i6));
                    basicRegisterMapper.addMapping(i6, i5, categoryForSsaReg);
                    z4 = true;
                } else {
                    basicRegisterMapper.addMapping(i6, paramWidth, categoryForSsaReg);
                    i5 = paramWidth;
                    z4 = false;
                }
                for (int i7 = i6 + 1; i7 < regCount; i7++) {
                    if (!this.mapped.get(i7) && !isDefinitionMoveParam(i7) && !bitIntSet.has(i7) && (!z4 || categoryForSsaReg >= getCategoryForSsaReg(i7))) {
                        this.interference.mergeInterferenceSet(i7, bitIntSet);
                        categoryForSsaReg = Math.max(categoryForSsaReg, getCategoryForSsaReg(i7));
                        basicRegisterMapper.addMapping(i7, i5, categoryForSsaReg);
                        this.mapped.set(i7);
                    }
                }
                this.mapped.set(i6);
                if (!z4) {
                    paramWidth += categoryForSsaReg;
                }
            }
        }
        return basicRegisterMapper;
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
        return true;
    }
}
