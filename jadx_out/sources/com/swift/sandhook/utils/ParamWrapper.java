package com.swift.sandhook.utils;

import com.swift.sandhook.SandHook;

/* loaded from: classes3.dex */
public class ParamWrapper {
    private static boolean is64Bit = SandHook.is64Bit();

    public static Object addressToObject(Class cls, long j5) {
        if (is64Bit) {
            return addressToObject64(cls, j5);
        }
        return addressToObject32(cls, (int) j5);
    }

    public static Object addressToObject32(Class cls, int i5) {
        boolean z4;
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return Integer.valueOf(i5);
            }
            if (cls == Short.TYPE) {
                return Short.valueOf((short) i5);
            }
            if (cls == Byte.TYPE) {
                return Byte.valueOf((byte) i5);
            }
            if (cls == Character.TYPE) {
                return Character.valueOf((char) i5);
            }
            if (cls == Boolean.TYPE) {
                if (i5 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
            throw new RuntimeException("unknown type: " + cls.toString());
        }
        return SandHook.getObject(i5);
    }

    public static Object addressToObject64(Class cls, long j5) {
        boolean z4;
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return Integer.valueOf((int) j5);
            }
            if (cls == Long.TYPE) {
                return Long.valueOf(j5);
            }
            if (cls == Short.TYPE) {
                return Short.valueOf((short) j5);
            }
            if (cls == Byte.TYPE) {
                return Byte.valueOf((byte) j5);
            }
            if (cls == Character.TYPE) {
                return Character.valueOf((char) j5);
            }
            if (cls == Boolean.TYPE) {
                if (j5 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
            throw new RuntimeException("unknown type: " + cls.toString());
        }
        return SandHook.getObject(j5);
    }

    public static long objectToAddress(Class cls, Object obj) {
        if (is64Bit) {
            return objectToAddress64(cls, obj);
        }
        return objectToAddress32(cls, obj);
    }

    public static int objectToAddress32(Class cls, Object obj) {
        if (obj == null) {
            return 0;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return ((Integer) obj).intValue();
            }
            if (cls == Short.TYPE) {
                return ((Short) obj).shortValue();
            }
            if (cls == Byte.TYPE) {
                return ((Byte) obj).byteValue();
            }
            if (cls == Character.TYPE) {
                return ((Character) obj).charValue();
            }
            if (cls == Boolean.TYPE) {
                return Boolean.TRUE.equals(obj) ? 1 : 0;
            }
            throw new RuntimeException("unknown type: " + cls.toString());
        }
        return (int) SandHook.getObjectAddress(obj);
    }

    public static long objectToAddress64(Class cls, Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return ((Integer) obj).intValue();
            }
            if (cls == Long.TYPE) {
                return ((Long) obj).longValue();
            }
            if (cls == Short.TYPE) {
                return ((Short) obj).shortValue();
            }
            if (cls == Byte.TYPE) {
                return ((Byte) obj).byteValue();
            }
            if (cls == Character.TYPE) {
                return ((Character) obj).charValue();
            }
            if (cls == Boolean.TYPE) {
                if (!Boolean.TRUE.equals(obj)) {
                    return 0L;
                }
                return 1L;
            }
            throw new RuntimeException("unknown type: " + cls.toString());
        }
        return SandHook.getObjectAddress(obj);
    }

    public static boolean support(Class cls) {
        if (is64Bit) {
            if (cls != Float.TYPE && cls != Double.TYPE) {
                return true;
            }
            return false;
        }
        if (cls != Float.TYPE && cls != Double.TYPE && cls != Long.TYPE) {
            return true;
        }
        return false;
    }
}
