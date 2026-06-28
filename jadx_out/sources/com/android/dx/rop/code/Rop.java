package com.android.dx.rop.code;

import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public final class Rop {
    public static final int BRANCH_GOTO = 3;
    public static final int BRANCH_IF = 4;
    public static final int BRANCH_MAX = 6;
    public static final int BRANCH_MIN = 1;
    public static final int BRANCH_NONE = 1;
    public static final int BRANCH_RETURN = 2;
    public static final int BRANCH_SWITCH = 5;
    public static final int BRANCH_THROW = 6;
    private final int branchingness;
    private final TypeList exceptions;
    private final boolean isCallLike;
    private final String nickname;
    private final int opcode;
    private final Type result;
    private final TypeList sources;

    public Rop(int i5, Type type, TypeList typeList, TypeList typeList2, int i6, boolean z4, String str) {
        if (type == null) {
            throw new NullPointerException("result == null");
        }
        if (typeList == null) {
            throw new NullPointerException("sources == null");
        }
        if (typeList2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i6 >= 1 && i6 <= 6) {
            if (typeList2.size() != 0 && i6 != 6) {
                throw new IllegalArgumentException("exceptions / branchingness mismatch");
            }
            this.opcode = i5;
            this.result = type;
            this.sources = typeList;
            this.exceptions = typeList2;
            this.branchingness = i6;
            this.isCallLike = z4;
            this.nickname = str;
            return;
        }
        throw new IllegalArgumentException("invalid branchingness: " + i6);
    }

    public final boolean canThrow() {
        return this.exceptions.size() != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rop)) {
            return false;
        }
        Rop rop = (Rop) obj;
        if (this.opcode == rop.opcode && this.branchingness == rop.branchingness && this.result == rop.result && this.sources.equals(rop.sources) && this.exceptions.equals(rop.exceptions)) {
            return true;
        }
        return false;
    }

    public int getBranchingness() {
        return this.branchingness;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }

    public String getNickname() {
        String str = this.nickname;
        if (str != null) {
            return str;
        }
        return toString();
    }

    public int getOpcode() {
        return this.opcode;
    }

    public Type getResult() {
        return this.result;
    }

    public TypeList getSources() {
        return this.sources;
    }

    public int hashCode() {
        return (((((((this.opcode * 31) + this.branchingness) * 31) + this.result.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.exceptions.hashCode();
    }

    public boolean isCallLike() {
        return this.isCallLike;
    }

    public boolean isCommutative() {
        int i5 = this.opcode;
        if (i5 == 14 || i5 == 16) {
            return true;
        }
        switch (i5) {
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(RegOps.opName(this.opcode));
        if (this.result != Type.VOID) {
            sb.append(" ");
            sb.append(this.result);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        int size = this.sources.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                sb.append(' ');
                sb.append(this.sources.getType(i5));
            }
        }
        if (this.isCallLike) {
            sb.append(" call");
        }
        int size2 = this.exceptions.size();
        if (size2 != 0) {
            sb.append(" throws");
            for (int i6 = 0; i6 < size2; i6++) {
                sb.append(' ');
                if (this.exceptions.getType(i6) == Type.THROWABLE) {
                    sb.append("<any>");
                } else {
                    sb.append(this.exceptions.getType(i6));
                }
            }
        } else {
            int i7 = this.branchingness;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                sb.append(" " + Hex.u1(this.branchingness));
                            } else {
                                sb.append(" switches");
                            }
                        } else {
                            sb.append(" ifs");
                        }
                    } else {
                        sb.append(" gotos");
                    }
                } else {
                    sb.append(" returns");
                }
            } else {
                sb.append(" flows");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Rop(int i5, Type type, TypeList typeList, TypeList typeList2, int i6, String str) {
        this(i5, type, typeList, typeList2, i6, false, str);
    }

    public Rop(int i5, Type type, TypeList typeList, int i6, String str) {
        this(i5, type, typeList, StdTypeList.EMPTY, i6, false, str);
    }

    public Rop(int i5, Type type, TypeList typeList, String str) {
        this(i5, type, typeList, StdTypeList.EMPTY, 1, false, str);
    }

    public Rop(int i5, Type type, TypeList typeList, TypeList typeList2, String str) {
        this(i5, type, typeList, typeList2, 6, false, str);
    }

    public Rop(int i5, TypeList typeList, TypeList typeList2) {
        this(i5, Type.VOID, typeList, typeList2, 6, true, null);
    }
}
