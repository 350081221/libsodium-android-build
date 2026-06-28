package com.android.dx.cf.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeBearer;
import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public class OneLocalsArray extends LocalsArray {
    private final TypeBearer[] locals;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OneLocalsArray(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            com.android.dx.rop.type.TypeBearer[] r2 = new com.android.dx.rop.type.TypeBearer[r2]
            r1.locals = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.cf.code.OneLocalsArray.<init>(int):void");
    }

    private static TypeBearer throwSimException(int i5, String str) {
        throw new SimException("local " + Hex.u2(i5) + ": " + str);
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void annotate(ExceptionWithContext exceptionWithContext) {
        String obj;
        int i5 = 0;
        while (true) {
            TypeBearer[] typeBearerArr = this.locals;
            if (i5 < typeBearerArr.length) {
                TypeBearer typeBearer = typeBearerArr[i5];
                if (typeBearer == null) {
                    obj = "<invalid>";
                } else {
                    obj = typeBearer.toString();
                }
                exceptionWithContext.addContext("locals[" + Hex.u2(i5) + "]: " + obj);
                i5++;
            } else {
                return;
            }
        }
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public TypeBearer get(int i5) {
        TypeBearer typeBearer = this.locals[i5];
        if (typeBearer == null) {
            return throwSimException(i5, "invalid");
        }
        return typeBearer;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public TypeBearer getCategory1(int i5) {
        TypeBearer typeBearer = get(i5);
        Type type = typeBearer.getType();
        if (type.isUninitialized()) {
            return throwSimException(i5, "uninitialized instance");
        }
        if (type.isCategory2()) {
            return throwSimException(i5, "category-2");
        }
        return typeBearer;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public TypeBearer getCategory2(int i5) {
        TypeBearer typeBearer = get(i5);
        if (typeBearer.getType().isCategory1()) {
            return throwSimException(i5, "category-1");
        }
        return typeBearer;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public int getMaxLocals() {
        return this.locals.length;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public TypeBearer getOrNull(int i5) {
        return this.locals[i5];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.dx.cf.code.LocalsArray
    public OneLocalsArray getPrimary() {
        return this;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void invalidate(int i5) {
        throwIfImmutable();
        this.locals[i5] = null;
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void makeInitialized(Type type) {
        int length = this.locals.length;
        if (length == 0) {
            return;
        }
        throwIfImmutable();
        Type initializedType = type.getInitializedType();
        for (int i5 = 0; i5 < length; i5++) {
            TypeBearer[] typeBearerArr = this.locals;
            if (typeBearerArr[i5] == type) {
                typeBearerArr[i5] = initializedType;
            }
        }
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public LocalsArray merge(LocalsArray localsArray) {
        if (localsArray instanceof OneLocalsArray) {
            return merge((OneLocalsArray) localsArray);
        }
        return localsArray.merge(this);
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public LocalsArraySet mergeWithSubroutineCaller(LocalsArray localsArray, int i5) {
        return new LocalsArraySet(getMaxLocals()).mergeWithSubroutineCaller(localsArray, i5);
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(int i5, TypeBearer typeBearer) {
        int i6;
        TypeBearer typeBearer2;
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            if (i5 >= 0) {
                if (frameType.getType().isCategory2()) {
                    this.locals[i5 + 1] = null;
                }
                TypeBearer[] typeBearerArr = this.locals;
                typeBearerArr[i5] = frameType;
                if (i5 == 0 || (typeBearer2 = typeBearerArr[i5 - 1]) == null || !typeBearer2.getType().isCategory2()) {
                    return;
                }
                this.locals[i6] = null;
                return;
            }
            throw new IndexOutOfBoundsException("idx < 0");
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (true) {
            TypeBearer[] typeBearerArr = this.locals;
            if (i5 < typeBearerArr.length) {
                TypeBearer typeBearer = typeBearerArr[i5];
                if (typeBearer == null) {
                    obj = "<invalid>";
                } else {
                    obj = typeBearer.toString();
                }
                sb.append("locals[" + Hex.u2(i5) + "]: " + obj + "\n");
                i5++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public OneLocalsArray copy() {
        OneLocalsArray oneLocalsArray = new OneLocalsArray(this.locals.length);
        TypeBearer[] typeBearerArr = this.locals;
        System.arraycopy(typeBearerArr, 0, oneLocalsArray.locals, 0, typeBearerArr.length);
        return oneLocalsArray;
    }

    public OneLocalsArray merge(OneLocalsArray oneLocalsArray) {
        try {
            return Merger.mergeLocals(this, oneLocalsArray);
        } catch (SimException e5) {
            e5.addContext("underlay locals:");
            annotate(e5);
            e5.addContext("overlay locals:");
            oneLocalsArray.annotate(e5);
            throw e5;
        }
    }

    @Override // com.android.dx.cf.code.LocalsArray
    public void set(RegisterSpec registerSpec) {
        set(registerSpec.getReg(), registerSpec);
    }
}
