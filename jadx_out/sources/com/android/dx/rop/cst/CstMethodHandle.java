package com.android.dx.rop.cst;

import a1.i;
import com.android.dx.rop.type.Type;

/* loaded from: classes2.dex */
public final class CstMethodHandle extends TypedConstant {
    public static final int METHOD_HANDLE_TYPE_INSTANCE_GET = 3;
    public static final int METHOD_HANDLE_TYPE_INSTANCE_PUT = 2;
    public static final int METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = 6;
    public static final int METHOD_HANDLE_TYPE_INVOKE_DIRECT = 7;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INSTANCE = 5;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INTERFACE = 8;
    public static final int METHOD_HANDLE_TYPE_INVOKE_STATIC = 4;
    public static final int METHOD_HANDLE_TYPE_STATIC_GET = 1;
    public static final int METHOD_HANDLE_TYPE_STATIC_PUT = 0;
    private static final String[] TYPE_NAMES = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};
    private final Constant ref;
    private final int type;

    private CstMethodHandle(int i5, Constant constant) {
        this.type = i5;
        this.ref = constant;
    }

    public static String getMethodHandleTypeName(int i5) {
        return TYPE_NAMES[i5];
    }

    public static boolean isAccessor(int i5) {
        return i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3;
    }

    public static boolean isInvocation(int i5) {
        switch (i5) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static CstMethodHandle make(int i5, Constant constant) {
        if (isAccessor(i5)) {
            if (!(constant instanceof CstFieldRef)) {
                throw new IllegalArgumentException("ref has wrong type: " + constant.getClass());
            }
        } else if (isInvocation(i5)) {
            if (!(constant instanceof CstBaseMethodRef)) {
                throw new IllegalArgumentException("ref has wrong type: " + constant.getClass());
            }
        } else {
            throw new IllegalArgumentException("type is out of range: " + i5);
        }
        return new CstMethodHandle(i5, constant);
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        CstMethodHandle cstMethodHandle = (CstMethodHandle) constant;
        if (getMethodHandleType() == cstMethodHandle.getMethodHandleType()) {
            return getRef().compareTo(cstMethodHandle.getRef());
        }
        return Integer.compare(getMethodHandleType(), cstMethodHandle.getMethodHandleType());
    }

    public int getMethodHandleType() {
        return this.type;
    }

    public Constant getRef() {
        return this.ref;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.METHOD_HANDLE;
    }

    public boolean isAccessor() {
        return isAccessor(this.type);
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    public boolean isInvocation() {
        return isInvocation(this.type);
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return getMethodHandleTypeName(this.type) + "," + this.ref.toString();
    }

    public String toString() {
        return "method-handle{" + toHuman() + i.f138d;
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "method handle";
    }
}
