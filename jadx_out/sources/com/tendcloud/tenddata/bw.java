package com.tendcloud.tenddata;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class bw implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            try {
                df.a().setOAID((String) objArr[1].getClass().getMethod("getOAID", new Class[0]).invoke(objArr[1], new Object[0]));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            df.a().setOAID((String) objArr[0].getClass().getMethod("getOAID", new Class[0]).invoke(objArr[0], new Object[0]));
        }
        try {
            try {
                String str = (String) objArr[1].getClass().getMethod("getVAID", new Class[0]).invoke(objArr[1], new Object[0]);
                df a5 = df.a();
                if (y.b(str)) {
                    str = null;
                }
                a5.setVAID(str);
            } catch (Throwable unused3) {
                String str2 = (String) objArr[0].getClass().getMethod("getVAID", new Class[0]).invoke(objArr[0], new Object[0]);
                df a6 = df.a();
                if (y.b(str2)) {
                    str2 = null;
                }
                a6.setVAID(str2);
            }
        } catch (Throwable unused4) {
        }
        try {
            try {
                String str3 = (String) objArr[1].getClass().getMethod("getAAID", new Class[0]).invoke(objArr[1], new Object[0]);
                df a7 = df.a();
                if (y.b(str3)) {
                    str3 = null;
                }
                a7.setAAID(str3);
            } catch (Throwable unused5) {
                String str4 = (String) objArr[0].getClass().getMethod("getAAID", new Class[0]).invoke(objArr[0], new Object[0]);
                df a8 = df.a();
                if (y.b(str4)) {
                    str4 = null;
                }
                a8.setAAID(str4);
            }
        } catch (Throwable unused6) {
        }
        bi.f11506a.countDown();
        return null;
    }
}
