package com.huawei.secure.android.common.detect;

import android.securitydiagnose.HwSecurityDiagnoseManager;
import com.huawei.android.util.NoExtAPIException;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8879a = "Emui10RootDetect";

    /* renamed from: b, reason: collision with root package name */
    private static final int f8880b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8881c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static int f8882d = 21;

    public static int a() {
        Object obj;
        try {
            Class<?> cls = Class.forName(EmuiUtil.BUILDEX_VERSION);
            Field declaredField = cls.getDeclaredField(EmuiUtil.EMUI_SDK_INT);
            AccessibleObject.setAccessible(new Field[]{declaredField}, true);
            obj = declaredField.get(cls);
        } catch (Throwable th) {
            z1.c.g(f8879a, "getEMUIVersionCode :" + th.getMessage());
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        try {
        } catch (NoClassDefFoundError e5) {
            z1.c.g(f8879a, "NoClassDefFoundError : " + e5.getMessage());
        } catch (NoExtAPIException e6) {
            z1.c.g(f8879a, "NoExtAPIException : " + e6.getMessage());
        }
        if (a() >= f8882d) {
            if (1 != HwSecurityDiagnoseManager.getInstance().getStpStatusByCategory(8, false, false, new HwSecurityDiagnoseManager.StpExtraStatusInfo())) {
                return false;
            }
            return true;
        }
        z1.c.e(f8879a, "OS is lower than Emui 10.");
        return false;
    }
}
