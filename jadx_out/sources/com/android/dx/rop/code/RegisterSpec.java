package com.android.dx.rop.code;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeBearer;
import com.android.dx.util.ToHuman;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class RegisterSpec implements TypeBearer, ToHuman, Comparable<RegisterSpec> {
    public static final String PREFIX = "v";
    private final LocalItem local;
    private final int reg;
    private final TypeBearer type;
    private static final ConcurrentHashMap<Object, RegisterSpec> theInterns = new ConcurrentHashMap<>(10000, 0.75f);
    private static final ThreadLocal<ForComparison> theInterningItem = new ThreadLocal<ForComparison>() { // from class: com.android.dx.rop.code.RegisterSpec.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public ForComparison initialValue() {
            return new ForComparison();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ForComparison {
        private LocalItem local;
        private int reg;
        private TypeBearer type;

        private ForComparison() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof RegisterSpec)) {
                return false;
            }
            return ((RegisterSpec) obj).equals(this.reg, this.type, this.local);
        }

        public int hashCode() {
            return RegisterSpec.hashCodeOf(this.reg, this.type, this.local);
        }

        public void set(int i5, TypeBearer typeBearer, LocalItem localItem) {
            this.reg = i5;
            this.type = typeBearer;
            this.local = localItem;
        }

        public RegisterSpec toRegisterSpec() {
            return new RegisterSpec(this.reg, this.type, this.local);
        }
    }

    public static void clearInternTable() {
        theInterns.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int hashCodeOf(int i5, TypeBearer typeBearer, LocalItem localItem) {
        int i6;
        if (localItem != null) {
            i6 = localItem.hashCode();
        } else {
            i6 = 0;
        }
        return (((i6 * 31) + typeBearer.hashCode()) * 31) + i5;
    }

    private static RegisterSpec intern(int i5, TypeBearer typeBearer, LocalItem localItem) {
        RegisterSpec putIfAbsent;
        ForComparison forComparison = theInterningItem.get();
        forComparison.set(i5, typeBearer, localItem);
        ConcurrentHashMap<Object, RegisterSpec> concurrentHashMap = theInterns;
        RegisterSpec registerSpec = concurrentHashMap.get(forComparison);
        if (registerSpec == null && (putIfAbsent = concurrentHashMap.putIfAbsent((registerSpec = forComparison.toRegisterSpec()), registerSpec)) != null) {
            return putIfAbsent;
        }
        return registerSpec;
    }

    public static RegisterSpec make(int i5, TypeBearer typeBearer) {
        return intern(i5, typeBearer, null);
    }

    public static RegisterSpec makeLocalOptional(int i5, TypeBearer typeBearer, LocalItem localItem) {
        return intern(i5, typeBearer, localItem);
    }

    public static String regString(int i5) {
        return "v" + i5;
    }

    private String toString0(boolean z4) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(regString());
        sb.append(":");
        LocalItem localItem = this.local;
        if (localItem != null) {
            sb.append(localItem.toString());
        }
        Type type = this.type.getType();
        sb.append(type);
        if (type != this.type) {
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            if (z4) {
                TypeBearer typeBearer = this.type;
                if (typeBearer instanceof CstString) {
                    sb.append(((CstString) typeBearer).toQuoted());
                }
            }
            if (z4) {
                TypeBearer typeBearer2 = this.type;
                if (typeBearer2 instanceof Constant) {
                    sb.append(typeBearer2.toHuman());
                }
            }
            sb.append(this.type);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSpec)) {
            if (!(obj instanceof ForComparison)) {
                return false;
            }
            ForComparison forComparison = (ForComparison) obj;
            return equals(forComparison.reg, forComparison.type, forComparison.local);
        }
        RegisterSpec registerSpec = (RegisterSpec) obj;
        return equals(registerSpec.reg, registerSpec.type, registerSpec.local);
    }

    public boolean equalsUsingSimpleType(RegisterSpec registerSpec) {
        if (!matchesVariable(registerSpec) || this.reg != registerSpec.reg) {
            return false;
        }
        return true;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
        return this.type.getBasicFrameType();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicType() {
        return this.type.getBasicType();
    }

    public int getCategory() {
        return this.type.getType().getCategory();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public TypeBearer getFrameType() {
        return this.type.getFrameType();
    }

    public LocalItem getLocalItem() {
        return this.local;
    }

    public int getNextReg() {
        return this.reg + getCategory();
    }

    public int getReg() {
        return this.reg;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return this.type.getType();
    }

    public TypeBearer getTypeBearer() {
        return this.type;
    }

    public int hashCode() {
        return hashCodeOf(this.reg, this.type, this.local);
    }

    public RegisterSpec intersect(RegisterSpec registerSpec, boolean z4) {
        LocalItem localItem;
        boolean z5;
        TypeBearer type;
        if (this == registerSpec) {
            return this;
        }
        if (registerSpec == null || this.reg != registerSpec.getReg()) {
            return null;
        }
        LocalItem localItem2 = this.local;
        if (localItem2 != null && localItem2.equals(registerSpec.getLocalItem())) {
            localItem = this.local;
        } else {
            localItem = null;
        }
        if (localItem == this.local) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((z4 && !z5) || (type = getType()) != registerSpec.getType()) {
            return null;
        }
        if (this.type.equals(registerSpec.getTypeBearer())) {
            type = this.type;
        }
        if (type == this.type && z5) {
            return this;
        }
        int i5 = this.reg;
        if (localItem == null) {
            return make(i5, type);
        }
        return make(i5, type, localItem);
    }

    public boolean isCategory1() {
        return this.type.getType().isCategory1();
    }

    public boolean isCategory2() {
        return this.type.getType().isCategory2();
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final boolean isConstant() {
        return false;
    }

    public boolean isEvenRegister() {
        return (getReg() & 1) == 0;
    }

    public boolean matchesVariable(RegisterSpec registerSpec) {
        if (registerSpec == null || !this.type.getType().equals(registerSpec.type.getType())) {
            return false;
        }
        LocalItem localItem = this.local;
        LocalItem localItem2 = registerSpec.local;
        if (localItem != localItem2 && (localItem == null || !localItem.equals(localItem2))) {
            return false;
        }
        return true;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return toString0(true);
    }

    public String toString() {
        return toString0(false);
    }

    public RegisterSpec withLocalItem(LocalItem localItem) {
        LocalItem localItem2 = this.local;
        if (localItem2 != localItem && (localItem2 == null || !localItem2.equals(localItem))) {
            return makeLocalOptional(this.reg, this.type, localItem);
        }
        return this;
    }

    public RegisterSpec withOffset(int i5) {
        return i5 == 0 ? this : withReg(this.reg + i5);
    }

    public RegisterSpec withReg(int i5) {
        if (this.reg == i5) {
            return this;
        }
        return makeLocalOptional(i5, this.type, this.local);
    }

    public RegisterSpec withSimpleType() {
        Type type;
        TypeBearer typeBearer = this.type;
        if (typeBearer instanceof Type) {
            type = (Type) typeBearer;
        } else {
            type = typeBearer.getType();
        }
        if (type.isUninitialized()) {
            type = type.getInitializedType();
        }
        if (type == typeBearer) {
            return this;
        }
        return makeLocalOptional(this.reg, type, this.local);
    }

    public RegisterSpec withType(TypeBearer typeBearer) {
        return makeLocalOptional(this.reg, typeBearer, this.local);
    }

    private RegisterSpec(int i5, TypeBearer typeBearer, LocalItem localItem) {
        if (i5 < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (typeBearer != null) {
            this.reg = i5;
            this.type = typeBearer;
            this.local = localItem;
            return;
        }
        throw new NullPointerException("type == null");
    }

    public static RegisterSpec make(int i5, TypeBearer typeBearer, LocalItem localItem) {
        if (localItem != null) {
            return intern(i5, typeBearer, localItem);
        }
        throw new NullPointerException("local  == null");
    }

    @Override // java.lang.Comparable
    public int compareTo(RegisterSpec registerSpec) {
        int i5 = this.reg;
        int i6 = registerSpec.reg;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        if (this == registerSpec) {
            return 0;
        }
        int compareTo = this.type.getType().compareTo(registerSpec.type.getType());
        if (compareTo != 0) {
            return compareTo;
        }
        LocalItem localItem = this.local;
        if (localItem == null) {
            return registerSpec.local == null ? 0 : -1;
        }
        LocalItem localItem2 = registerSpec.local;
        if (localItem2 == null) {
            return 1;
        }
        return localItem.compareTo(localItem2);
    }

    public String regString() {
        return regString(this.reg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean equals(int i5, TypeBearer typeBearer, LocalItem localItem) {
        LocalItem localItem2;
        return this.reg == i5 && this.type.equals(typeBearer) && ((localItem2 = this.local) == localItem || (localItem2 != null && localItem2.equals(localItem)));
    }
}
