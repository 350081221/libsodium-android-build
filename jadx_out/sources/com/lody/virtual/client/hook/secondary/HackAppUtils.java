package com.lody.virtual.client.hook.secondary;

import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.ReflectException;

/* loaded from: classes3.dex */
public class HackAppUtils {
    public static void enableQQLogOutput(String str, ClassLoader classLoader) {
        if ("com.tencent.mobileqq".equals(str)) {
            try {
                Reflect.on("com.tencent.qphone.base.util.QLog", classLoader).set("UIN_REPORTLOG_LEVEL", 100);
            } catch (ReflectException unused) {
            }
        }
    }
}
