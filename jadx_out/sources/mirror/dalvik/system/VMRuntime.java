package mirror.dalvik.system;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class VMRuntime {
    public static Class<?> TYPE = RefClass.load((Class<?>) VMRuntime.class, "dalvik.system.VMRuntime");
    public static RefStaticMethod<String> getCurrentInstructionSet;
    public static RefStaticMethod<Object> getRuntime;
    public static RefMethod<Boolean> is64Bit;

    @MethodParams({String.class})
    public static RefStaticMethod<Boolean> is64BitAbi;
    public static RefMethod<Boolean> isJavaDebuggable;

    @MethodParams({int.class})
    public static RefMethod<Void> setTargetSdkVersion;
}
