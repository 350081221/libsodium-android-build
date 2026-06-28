package com.android.dx.rop.code;

import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public final class AccessFlags {
    public static final int ACC_ABSTRACT = 1024;
    public static final int ACC_ANNOTATION = 8192;
    public static final int ACC_BRIDGE = 64;
    public static final int ACC_CONSTRUCTOR = 65536;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    public static final int ACC_ENUM = 16384;
    public static final int ACC_FINAL = 16;
    public static final int ACC_INTERFACE = 512;
    public static final int ACC_NATIVE = 256;
    public static final int ACC_PRIVATE = 2;
    public static final int ACC_PROTECTED = 4;
    public static final int ACC_PUBLIC = 1;
    public static final int ACC_STATIC = 8;
    public static final int ACC_STRICT = 2048;
    public static final int ACC_SUPER = 32;
    public static final int ACC_SYNCHRONIZED = 32;
    public static final int ACC_SYNTHETIC = 4096;
    public static final int ACC_TRANSIENT = 128;
    public static final int ACC_VARARGS = 128;
    public static final int ACC_VOLATILE = 64;
    public static final int CLASS_FLAGS = 30257;
    private static final int CONV_CLASS = 1;
    private static final int CONV_FIELD = 2;
    private static final int CONV_METHOD = 3;
    public static final int FIELD_FLAGS = 20703;
    public static final int INNER_CLASS_FLAGS = 30239;
    public static final int METHOD_FLAGS = 204287;

    private AccessFlags() {
    }

    public static String classString(int i5) {
        return humanHelper(i5, CLASS_FLAGS, 1);
    }

    public static String fieldString(int i5) {
        return humanHelper(i5, FIELD_FLAGS, 2);
    }

    private static String humanHelper(int i5, int i6, int i7) {
        StringBuilder sb = new StringBuilder(80);
        int i8 = (~i6) & i5;
        int i9 = i5 & i6;
        if ((i9 & 1) != 0) {
            sb.append("|public");
        }
        if ((i9 & 2) != 0) {
            sb.append("|private");
        }
        if ((i9 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i9 & 8) != 0) {
            sb.append("|static");
        }
        if ((i9 & 16) != 0) {
            sb.append("|final");
        }
        if ((i9 & 32) != 0) {
            if (i7 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i9 & 64) != 0) {
            if (i7 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i9 & 128) != 0) {
            if (i7 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i9 & 256) != 0) {
            sb.append("|native");
        }
        if ((i9 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i9 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i9 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i9 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i9 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i9 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i9) != 0) {
            sb.append("|constructor");
        }
        if ((i9 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i8 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(Hex.u2(i8));
        }
        return sb.substring(1);
    }

    public static String innerClassString(int i5) {
        return humanHelper(i5, INNER_CLASS_FLAGS, 1);
    }

    public static boolean isAbstract(int i5) {
        return (i5 & 1024) != 0;
    }

    public static boolean isAnnotation(int i5) {
        return (i5 & 8192) != 0;
    }

    public static boolean isConstructor(int i5) {
        return (i5 & 65536) != 0;
    }

    public static boolean isDeclaredSynchronized(int i5) {
        return (i5 & 131072) != 0;
    }

    public static boolean isEnum(int i5) {
        return (i5 & 16384) != 0;
    }

    public static boolean isInterface(int i5) {
        return (i5 & 512) != 0;
    }

    public static boolean isNative(int i5) {
        return (i5 & 256) != 0;
    }

    public static boolean isPrivate(int i5) {
        return (i5 & 2) != 0;
    }

    public static boolean isProtected(int i5) {
        return (i5 & 4) != 0;
    }

    public static boolean isPublic(int i5) {
        return (i5 & 1) != 0;
    }

    public static boolean isStatic(int i5) {
        return (i5 & 8) != 0;
    }

    public static boolean isSynchronized(int i5) {
        return (i5 & 32) != 0;
    }

    public static String methodString(int i5) {
        return humanHelper(i5, METHOD_FLAGS, 3);
    }
}
