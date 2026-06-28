package com.android.dx.ssa;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.RegisterSpecSet;

/* loaded from: classes2.dex */
public abstract class RegisterMapper {
    public abstract int getNewRegisterCount();

    public abstract RegisterSpec map(RegisterSpec registerSpec);

    public final RegisterSpecList map(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        RegisterSpecList registerSpecList2 = new RegisterSpecList(size);
        for (int i5 = 0; i5 < size; i5++) {
            registerSpecList2.set(i5, map(registerSpecList.get(i5)));
        }
        registerSpecList2.setImmutable();
        return registerSpecList2.equals(registerSpecList) ? registerSpecList : registerSpecList2;
    }

    public final RegisterSpecSet map(RegisterSpecSet registerSpecSet) {
        int maxSize = registerSpecSet.getMaxSize();
        RegisterSpecSet registerSpecSet2 = new RegisterSpecSet(getNewRegisterCount());
        for (int i5 = 0; i5 < maxSize; i5++) {
            RegisterSpec registerSpec = registerSpecSet.get(i5);
            if (registerSpec != null) {
                registerSpecSet2.put(map(registerSpec));
            }
        }
        registerSpecSet2.setImmutable();
        return registerSpecSet2.equals(registerSpecSet) ? registerSpecSet : registerSpecSet2;
    }
}
