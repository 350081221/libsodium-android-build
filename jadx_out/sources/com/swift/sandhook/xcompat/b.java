package com.swift.sandhook.xcompat;

/* loaded from: classes3.dex */
public class b extends ClassLoader {
    private final ClassLoader mClassLoader;

    public b(ClassLoader classLoader, ClassLoader classLoader2) {
        super(classLoader);
        this.mClassLoader = classLoader2;
    }

    @Override // java.lang.ClassLoader
    protected Class<?> loadClass(String str, boolean z4) throws ClassNotFoundException {
        Class<?> cls;
        try {
            cls = this.mClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null && (cls = super.loadClass(str, z4)) == null) {
            throw new ClassNotFoundException();
        }
        return cls;
    }
}
