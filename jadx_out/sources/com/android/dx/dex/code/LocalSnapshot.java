package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.RegisterSpecSet;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.ssa.RegisterMapper;

/* loaded from: classes2.dex */
public final class LocalSnapshot extends ZeroSizeInsn {
    private final RegisterSpecSet locals;

    public LocalSnapshot(SourcePosition sourcePosition, RegisterSpecSet registerSpecSet) {
        super(sourcePosition);
        if (registerSpecSet != null) {
            this.locals = registerSpecSet;
            return;
        }
        throw new NullPointerException("locals == null");
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        return this.locals.toString();
    }

    public RegisterSpecSet getLocals() {
        return this.locals;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String listingString0(boolean z4) {
        int size = this.locals.size();
        int maxSize = this.locals.getMaxSize();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i5 = 0; i5 < maxSize; i5++) {
            RegisterSpec registerSpec = this.locals.get(i5);
            if (registerSpec != null) {
                sb.append("\n  ");
                sb.append(LocalStart.localString(registerSpec));
            }
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return new LocalSnapshot(getPosition(), registerMapper.map(this.locals));
    }

    @Override // com.android.dx.dex.code.ZeroSizeInsn, com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisterOffset(int i5) {
        return new LocalSnapshot(getPosition(), this.locals.withOffset(i5));
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new LocalSnapshot(getPosition(), this.locals);
    }
}
