package com.android.dx;

import com.android.dx.rop.type.StdTypeList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TypeList {
    final StdTypeList ropTypes;
    final TypeId<?>[] types;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeList(TypeId<?>[] typeIdArr) {
        this.types = (TypeId[]) typeIdArr.clone();
        this.ropTypes = new StdTypeList(typeIdArr.length);
        for (int i5 = 0; i5 < typeIdArr.length; i5++) {
            this.ropTypes.set(i5, typeIdArr[i5].ropType);
        }
    }

    public List<TypeId<?>> asList() {
        return Collections.unmodifiableList(Arrays.asList(this.types));
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeList) && Arrays.equals(((TypeList) obj).types, this.types);
    }

    public int hashCode() {
        return Arrays.hashCode(this.types);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < this.types.length; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.types[i5]);
        }
        return sb.toString();
    }
}
