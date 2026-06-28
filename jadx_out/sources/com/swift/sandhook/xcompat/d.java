package com.swift.sandhook.xcompat;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.utils.ParamWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public class d {
    public Method backup;
    public Method hook;
    public boolean isStatic;
    public Member origin;
    public Class[] parType;
    public Class retType;

    public d(Member member, Method method, Method method2) {
        this.origin = member;
        this.hook = method;
        this.backup = method2;
        this.isStatic = Modifier.isStatic(member.getModifiers());
    }

    public Object getArg(int i5, long j5) {
        return ParamWrapper.addressToObject(this.parType[i5], j5);
    }

    public Object[] getArgs(long... jArr) {
        if (jArr != null && jArr.length != 0) {
            Class[] clsArr = this.parType;
            if (clsArr != null && clsArr.length != 0) {
                int i5 = !this.isStatic ? 1 : 0;
                Object[] objArr = new Object[clsArr.length];
                for (int i6 = i5; i6 < this.parType.length + i5; i6++) {
                    int i7 = i6 - i5;
                    objArr[i7] = getArg(i7, jArr[i6]);
                }
                return objArr;
            }
            return new Object[0];
        }
        return new Object[0];
    }

    public long[] getArgsAddress(long[] jArr, Object... objArr) {
        long[] jArr2;
        int i5;
        int i6 = 0;
        if (jArr != null && jArr.length != 0) {
            if (!this.isStatic) {
                i5 = 1;
                jArr2 = new long[jArr.length + 1];
                jArr2[0] = jArr[0];
            } else {
                jArr2 = new long[jArr.length];
                i5 = 0;
            }
            while (true) {
                Class[] clsArr = this.parType;
                if (i6 < clsArr.length) {
                    jArr2[i6 + i5] = ParamWrapper.objectToAddress(clsArr[i6], objArr[i6]);
                    i6++;
                } else {
                    return jArr2;
                }
            }
        } else {
            return new long[0];
        }
    }

    public Object getResult(long j5) {
        if (isVoid()) {
            return null;
        }
        return ParamWrapper.addressToObject(this.retType, j5);
    }

    public long getResultAddress(Object obj) {
        if (isVoid()) {
            return 0L;
        }
        return ParamWrapper.objectToAddress(this.retType, obj);
    }

    public Object getThis(long j5) {
        if (this.isStatic) {
            return null;
        }
        return SandHook.getObject(j5);
    }

    public boolean isConstructor() {
        return this.origin instanceof Constructor;
    }

    public boolean isVoid() {
        Class cls = this.retType;
        return cls == null || Void.TYPE.equals(cls);
    }
}
