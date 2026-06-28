package com.android.dx.cf.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeBearer;
import com.android.dx.util.Hex;
import com.android.dx.util.MutabilityControl;

/* loaded from: classes2.dex */
public final class ExecutionStack extends MutabilityControl {
    private final boolean[] local;
    private final TypeBearer[] stack;
    private int stackPtr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExecutionStack(int r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2.<init>(r1)
            com.android.dx.rop.type.TypeBearer[] r1 = new com.android.dx.rop.type.TypeBearer[r3]
            r2.stack = r1
            boolean[] r3 = new boolean[r3]
            r2.local = r3
            r2.stackPtr = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.cf.code.ExecutionStack.<init>(int):void");
    }

    private static String stackElementString(TypeBearer typeBearer) {
        if (typeBearer == null) {
            return "<invalid>";
        }
        return typeBearer.toString();
    }

    private static TypeBearer throwSimException(String str) {
        throw new SimException("stack: " + str);
    }

    public void annotate(ExceptionWithContext exceptionWithContext) {
        String u22;
        int i5 = this.stackPtr - 1;
        for (int i6 = 0; i6 <= i5; i6++) {
            if (i6 == i5) {
                u22 = "top0";
            } else {
                u22 = Hex.u2(i5 - i6);
            }
            exceptionWithContext.addContext("stack[" + u22 + "]: " + stackElementString(this.stack[i6]));
        }
    }

    public void change(int i5, TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int i6 = (this.stackPtr - i5) - 1;
            TypeBearer typeBearer2 = this.stack[i6];
            if (typeBearer2 == null || typeBearer2.getType().getCategory() != frameType.getType().getCategory()) {
                throwSimException("incompatible substitution: " + stackElementString(typeBearer2) + " -> " + stackElementString(frameType));
            }
            this.stack[i6] = frameType;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    public void clear() {
        throwIfImmutable();
        for (int i5 = 0; i5 < this.stackPtr; i5++) {
            this.stack[i5] = null;
            this.local[i5] = false;
        }
        this.stackPtr = 0;
    }

    public ExecutionStack copy() {
        ExecutionStack executionStack = new ExecutionStack(this.stack.length);
        TypeBearer[] typeBearerArr = this.stack;
        System.arraycopy(typeBearerArr, 0, executionStack.stack, 0, typeBearerArr.length);
        boolean[] zArr = this.local;
        System.arraycopy(zArr, 0, executionStack.local, 0, zArr.length);
        executionStack.stackPtr = this.stackPtr;
        return executionStack;
    }

    public int getMaxStack() {
        return this.stack.length;
    }

    public void makeInitialized(Type type) {
        if (this.stackPtr == 0) {
            return;
        }
        throwIfImmutable();
        Type initializedType = type.getInitializedType();
        for (int i5 = 0; i5 < this.stackPtr; i5++) {
            TypeBearer[] typeBearerArr = this.stack;
            if (typeBearerArr[i5] == type) {
                typeBearerArr[i5] = initializedType;
            }
        }
    }

    public ExecutionStack merge(ExecutionStack executionStack) {
        try {
            return Merger.mergeStack(this, executionStack);
        } catch (SimException e5) {
            e5.addContext("underlay stack:");
            annotate(e5);
            e5.addContext("overlay stack:");
            executionStack.annotate(e5);
            throw e5;
        }
    }

    public TypeBearer peek(int i5) {
        if (i5 >= 0) {
            if (i5 >= this.stackPtr) {
                return throwSimException("underflow");
            }
            return this.stack[(r0 - i5) - 1];
        }
        throw new IllegalArgumentException("n < 0");
    }

    public boolean peekLocal(int i5) {
        if (i5 >= 0) {
            if (i5 < this.stackPtr) {
                return this.local[(r0 - i5) - 1];
            }
            throw new SimException("stack: underflow");
        }
        throw new IllegalArgumentException("n < 0");
    }

    public Type peekType(int i5) {
        return peek(i5).getType();
    }

    public TypeBearer pop() {
        throwIfImmutable();
        TypeBearer peek = peek(0);
        TypeBearer[] typeBearerArr = this.stack;
        int i5 = this.stackPtr;
        typeBearerArr[i5 - 1] = null;
        this.local[i5 - 1] = false;
        this.stackPtr = i5 - peek.getType().getCategory();
        return peek;
    }

    public void push(TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int category = frameType.getType().getCategory();
            int i5 = this.stackPtr;
            int i6 = i5 + category;
            TypeBearer[] typeBearerArr = this.stack;
            if (i6 > typeBearerArr.length) {
                throwSimException("overflow");
                return;
            }
            if (category == 2) {
                typeBearerArr[i5] = null;
                this.stackPtr = i5 + 1;
            }
            int i7 = this.stackPtr;
            typeBearerArr[i7] = frameType;
            this.stackPtr = i7 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    public void setLocal() {
        throwIfImmutable();
        this.local[this.stackPtr] = true;
    }

    public int size() {
        return this.stackPtr;
    }
}
