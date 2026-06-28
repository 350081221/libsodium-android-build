package sun.misc;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class Unsafe {
    public native int addressSize();

    public int arrayBaseOffset(Class cls) {
        throw new RuntimeException("Stub!");
    }

    public native byte getByte(long j5);

    public native int getInt(long j5);

    public native int getInt(Object obj, long j5);

    public native long getLong(long j5);

    public native long getLong(Object obj, long j5);

    public native Object getObject(Object obj, long j5);

    public native short getShort(Object obj, long j5);

    public long objectFieldOffset(Field field) {
        throw new RuntimeException("Stub!");
    }

    public native void putByte(long j5, byte b5);

    public native void putInt(Object obj, long j5, int i5);

    public native void putLong(Object obj, long j5, long j6);

    public native void putObject(Object obj, long j5, Object obj2);
}
