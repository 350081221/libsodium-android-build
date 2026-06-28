package com.android.dx;

import com.android.dex.DexFormat;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.code.RopTranslator;
import com.android.dx.dex.file.ClassDefItem;
import com.android.dx.dex.file.DexFile;
import com.android.dx.dex.file.EncodedField;
import com.android.dx.dex.file.EncodedMethod;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.StdTypeList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

/* loaded from: classes2.dex */
public final class DexMaker {
    private static boolean didWarnBlacklistedMethods;
    private static boolean didWarnNonBaseDexClassLoader;
    private boolean markAsTrusted;
    private DexFile outputDex;
    private ClassLoader sharedClassLoader;
    private final Map<TypeId<?>, TypeDeclaration> types = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class FieldDeclaration {
        private final int accessFlags;
        final FieldId<?, ?> fieldId;
        private final Object staticValue;

        FieldDeclaration(FieldId<?, ?> fieldId, int i5, Object obj) {
            if ((i5 & 8) == 0 && obj != null) {
                throw new IllegalArgumentException("instance fields may not have a value");
            }
            this.fieldId = fieldId;
            this.accessFlags = i5;
            this.staticValue = obj;
        }

        public boolean isStatic() {
            return (this.accessFlags & 8) != 0;
        }

        EncodedField toEncodedField() {
            return new EncodedField(this.fieldId.constant, this.accessFlags);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class MethodDeclaration {
        private final Code code = new Code(this);
        private final int flags;
        final MethodId<?, ?> method;

        public MethodDeclaration(MethodId<?, ?> methodId, int i5) {
            this.method = methodId;
            this.flags = i5;
        }

        boolean isDirect() {
            return (this.flags & 65546) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isStatic() {
            return (this.flags & 8) != 0;
        }

        EncodedMethod toEncodedMethod(DexOptions dexOptions) {
            return new EncodedMethod(this.method.constant, this.flags, RopTranslator.translate(new RopMethod(this.code.toBasicBlocks(), 0), 1, null, this.code.paramSize(), dexOptions), StdTypeList.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TypeDeclaration {
        private ClassDefItem classDefItem;
        private boolean declared;
        private int flags;
        private TypeList interfaces;
        private String sourceFile;
        private TypeId<?> supertype;
        private final TypeId<?> type;
        private final Map<FieldId, FieldDeclaration> fields = new LinkedHashMap();
        private final Map<MethodId, MethodDeclaration> methods = new LinkedHashMap();

        TypeDeclaration(TypeId<?> typeId) {
            this.type = typeId;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ClassDefItem toClassDefItem() {
            if (this.declared) {
                DexOptions dexOptions = new DexOptions();
                dexOptions.minSdkVersion = 13;
                CstType cstType = this.type.constant;
                if (this.classDefItem == null) {
                    this.classDefItem = new ClassDefItem(cstType, this.flags, this.supertype.constant, this.interfaces.ropTypes, new CstString(this.sourceFile));
                    for (MethodDeclaration methodDeclaration : this.methods.values()) {
                        EncodedMethod encodedMethod = methodDeclaration.toEncodedMethod(dexOptions);
                        if (methodDeclaration.isDirect()) {
                            this.classDefItem.addDirectMethod(encodedMethod);
                        } else {
                            this.classDefItem.addVirtualMethod(encodedMethod);
                        }
                    }
                    for (FieldDeclaration fieldDeclaration : this.fields.values()) {
                        EncodedField encodedField = fieldDeclaration.toEncodedField();
                        if (fieldDeclaration.isStatic()) {
                            this.classDefItem.addStaticField(encodedField, Constants.getConstant(fieldDeclaration.staticValue));
                        } else {
                            this.classDefItem.addInstanceField(encodedField);
                        }
                    }
                }
                return this.classDefItem;
            }
            throw new IllegalStateException("Undeclared type " + this.type + " declares members: " + this.fields.keySet() + " " + this.methods.keySet());
        }
    }

    private void doDeleteOatFiles(File file, String str) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && file2.getName().startsWith(str)) {
                file2.delete();
            }
        }
    }

    private ClassLoader generateClassLoader(File file, File file2, ClassLoader classLoader) {
        boolean z4;
        ClassLoader classLoader2;
        try {
            try {
                file.setWritable(false);
                ClassLoader classLoader3 = this.sharedClassLoader;
                if (classLoader3 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (classLoader != null) {
                    classLoader2 = classLoader;
                } else if (classLoader3 != null) {
                    classLoader2 = classLoader3;
                } else {
                    classLoader2 = null;
                }
                Class<?> cls = Class.forName("dalvik.system.BaseDexClassLoader");
                if (z4 && !cls.isAssignableFrom(classLoader2.getClass())) {
                    if (!classLoader2.getClass().getName().equals("java.lang.BootClassLoader") && !didWarnNonBaseDexClassLoader) {
                        System.err.println("Cannot share classloader as shared classloader '" + classLoader2 + "' is not a subclass of '" + cls + "'");
                        didWarnNonBaseDexClassLoader = true;
                    }
                    z4 = false;
                }
                if (this.markAsTrusted) {
                    try {
                        if (z4) {
                            classLoader2.getClass().getMethod("addDexPath", String.class, Boolean.TYPE).invoke(classLoader2, file.getPath(), Boolean.TRUE);
                            return classLoader2;
                        }
                        return (ClassLoader) cls.getConstructor(String.class, File.class, String.class, ClassLoader.class, Boolean.TYPE).newInstance(file.getPath(), file2.getAbsoluteFile(), null, classLoader2, Boolean.TRUE);
                    } catch (InvocationTargetException e5) {
                        if (e5.getCause() instanceof SecurityException) {
                            if (!didWarnBlacklistedMethods) {
                                System.err.println("Cannot allow to call blacklisted super methods. This might break spying on system classes." + e5.getCause());
                                didWarnBlacklistedMethods = true;
                            }
                        } else {
                            throw e5;
                        }
                    }
                }
                if (z4) {
                    classLoader2.getClass().getMethod("addDexPath", String.class).invoke(classLoader2, file.getPath());
                    return classLoader2;
                }
                return (ClassLoader) Class.forName("dalvik.system.DexClassLoader").getConstructor(String.class, String.class, String.class, ClassLoader.class).newInstance(file.getPath(), file2.getAbsolutePath(), null, classLoader2);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", e7);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InstantiationException unused2) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused3) {
            throw new AssertionError();
        }
    }

    private String generateFileName() {
        Set<TypeId<?>> keySet = this.types.keySet();
        Iterator<TypeId<?>> it = keySet.iterator();
        int size = keySet.size();
        int[] iArr = new int[size];
        int i5 = 0;
        while (it.hasNext()) {
            TypeDeclaration typeDeclaration = getTypeDeclaration(it.next());
            Set keySet2 = typeDeclaration.methods.keySet();
            if (typeDeclaration.supertype != null) {
                iArr[i5] = (((typeDeclaration.supertype.hashCode() * 31) + typeDeclaration.interfaces.hashCode()) * 31) + keySet2.hashCode();
                i5++;
            }
        }
        Arrays.sort(iArr);
        int i6 = 1;
        for (int i7 = 0; i7 < size; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        return "Generated_" + i6 + ".jar";
    }

    public void declare(TypeId<?> typeId, String str, int i5, TypeId<?> typeId2, TypeId<?>... typeIdArr) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(typeId);
        if ((i5 & (-5138)) == 0) {
            if (!typeDeclaration.declared) {
                typeDeclaration.declared = true;
                typeDeclaration.flags = i5;
                typeDeclaration.supertype = typeId2;
                typeDeclaration.sourceFile = str;
                typeDeclaration.interfaces = new TypeList(typeIdArr);
                return;
            }
            throw new IllegalStateException("already declared: " + typeId);
        }
        throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i5));
    }

    public void deleteOldDex(File file) {
        file.delete();
        File file2 = new File(file.getParent(), "/oat/");
        File file3 = new File(file2, "/arm/");
        File file4 = new File(file2, "/arm64/");
        if (!file2.exists()) {
            return;
        }
        String replaceAll = file.getName().replaceAll(".jar", "");
        doDeleteOatFiles(file2, replaceAll);
        doDeleteOatFiles(file3, replaceAll);
        doDeleteOatFiles(file4, replaceAll);
    }

    public byte[] generate() {
        if (this.outputDex == null) {
            DexOptions dexOptions = new DexOptions();
            dexOptions.minSdkVersion = 13;
            this.outputDex = new DexFile(dexOptions);
        }
        Iterator<TypeDeclaration> it = this.types.values().iterator();
        while (it.hasNext()) {
            this.outputDex.add(it.next().toClassDefItem());
        }
        try {
            return this.outputDex.toDex(null, false);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public ClassLoader generateAndLoad(ClassLoader classLoader, File file) throws IOException {
        return generateAndLoad(classLoader, file, generateFileName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DexFile getDexFile() {
        if (this.outputDex == null) {
            DexOptions dexOptions = new DexOptions();
            dexOptions.minSdkVersion = 13;
            this.outputDex = new DexFile(dexOptions);
        }
        return this.outputDex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeDeclaration getTypeDeclaration(TypeId<?> typeId) {
        TypeDeclaration typeDeclaration = this.types.get(typeId);
        if (typeDeclaration == null) {
            TypeDeclaration typeDeclaration2 = new TypeDeclaration(typeId);
            this.types.put(typeId, typeDeclaration2);
            return typeDeclaration2;
        }
        return typeDeclaration;
    }

    public ClassLoader loadClassDirect(ClassLoader classLoader, File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists()) {
            return generateClassLoader(file2, file, classLoader);
        }
        return null;
    }

    public void markAsTrusted() {
        this.markAsTrusted = true;
    }

    public void setSharedClassLoader(ClassLoader classLoader) {
        this.sharedClassLoader = classLoader;
    }

    public ClassLoader generateAndLoad(ClassLoader classLoader, File file, String str) throws IOException {
        if (file == null) {
            String property = System.getProperty("dexmaker.dexcache");
            if (property != null) {
                file = new File(property);
            } else {
                file = new AppDataDirGuesser().guess();
                if (file == null) {
                    throw new IllegalArgumentException("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
                }
            }
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            try {
                file2.setWritable(true);
                deleteOldDex(file2);
            } catch (Throwable unused) {
            }
        }
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        file2.createNewFile();
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file2));
        JarEntry jarEntry = new JarEntry(DexFormat.DEX_IN_JAR_NAME);
        byte[] generate = generate();
        jarEntry.setSize(generate.length);
        jarOutputStream.putNextEntry(jarEntry);
        jarOutputStream.write(generate);
        jarOutputStream.closeEntry();
        jarOutputStream.close();
        return generateClassLoader(file2, file, classLoader);
    }

    public Code declare(MethodId<?, ?> methodId, int i5) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(methodId.declaringType);
        if (typeDeclaration.methods.containsKey(methodId)) {
            throw new IllegalStateException("already declared: " + methodId);
        }
        if ((i5 & (-4224)) == 0) {
            if ((i5 & 32) != 0) {
                i5 = (i5 & (-33)) | 131072;
            }
            if (methodId.isConstructor() || methodId.isStaticInitializer()) {
                i5 |= 65536;
            }
            MethodDeclaration methodDeclaration = new MethodDeclaration(methodId, i5);
            typeDeclaration.methods.put(methodId, methodDeclaration);
            return methodDeclaration.code;
        }
        throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i5));
    }

    public void declare(FieldId<?, ?> fieldId, int i5, Object obj) {
        TypeDeclaration typeDeclaration = getTypeDeclaration(fieldId.declaringType);
        if (typeDeclaration.fields.containsKey(fieldId)) {
            throw new IllegalStateException("already declared: " + fieldId);
        }
        if ((i5 & (-4320)) != 0) {
            throw new IllegalArgumentException("Unexpected flag: " + Integer.toHexString(i5));
        }
        if ((i5 & 8) == 0 && obj != null) {
            throw new IllegalArgumentException("staticValue is non-null, but field is not static");
        }
        typeDeclaration.fields.put(fieldId, new FieldDeclaration(fieldId, i5, obj));
    }
}
