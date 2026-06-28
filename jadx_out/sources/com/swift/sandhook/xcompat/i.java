package com.swift.sandhook.xcompat;

import android.util.Log;
import com.swift.sandhook.SandHook;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class i {
    public static Object callOriginError(Member member, Method method, Object obj, Object[] objArr) throws Throwable {
        if (a.retryWhenCallOriginError) {
            Log.w("SandHook", "method <" + member.toString() + "> use invoke to call origin!");
            return SandHook.callOriginMethod(member, method, obj, objArr);
        }
        return null;
    }
}
