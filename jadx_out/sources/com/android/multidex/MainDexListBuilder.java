package com.android.multidex;

import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.iface.Attribute;
import com.android.dx.cf.iface.FieldList;
import com.android.dx.cf.iface.HasAttribute;
import com.android.dx.cf.iface.MethodList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class MainDexListBuilder {
    private static final String CLASS_EXTENSION = ".class";
    private static final String DISABLE_ANNOTATION_RESOLUTION_WORKAROUND = "--disable-annotation-resolution-workaround";
    private static final String EOL;
    private static final int STATUS_ERROR = 1;
    private static final String USAGE_MESSAGE;
    private Set<String> filesToKeep = new HashSet();

    static {
        String property = System.getProperty("line.separator");
        EOL = property;
        USAGE_MESSAGE = "Usage:" + property + property + "Short version: Don't use this." + property + property + "Slightly longer version: This tool is used by mainDexClasses script to build" + property + "the main dex list." + property;
    }

    public MainDexListBuilder(boolean z4, String str, String str2) throws IOException {
        Path path;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(str);
                try {
                    path = new Path(str2);
                    try {
                        ClassReferenceListBuilder classReferenceListBuilder = new ClassReferenceListBuilder(path);
                        classReferenceListBuilder.addRoots(zipFile2);
                        for (String str3 : classReferenceListBuilder.getClassNames()) {
                            this.filesToKeep.add(str3 + CLASS_EXTENSION);
                        }
                        if (z4) {
                            keepAnnotated(path);
                        }
                        try {
                            zipFile2.close();
                        } catch (IOException unused) {
                        }
                        Iterator<ClassPathElement> it = path.elements.iterator();
                        while (it.hasNext()) {
                            try {
                                it.next().close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        try {
                            zipFile.close();
                        } catch (IOException unused3) {
                        }
                        if (path != null) {
                            Iterator<ClassPathElement> it2 = path.elements.iterator();
                            while (it2.hasNext()) {
                                try {
                                    it2.next().close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    path = null;
                }
            } catch (IOException e5) {
                throw new IOException("\"" + str + "\" can not be read as a zip archive. (" + e5.getMessage() + ")", e5);
            }
        } catch (Throwable th3) {
            th = th3;
            path = null;
        }
    }

    private boolean hasRuntimeVisibleAnnotation(HasAttribute hasAttribute) {
        Attribute findFirst = hasAttribute.getAttributes().findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        if (findFirst != null && ((AttRuntimeVisibleAnnotations) findFirst).getAnnotations().size() > 0) {
            return true;
        }
        return false;
    }

    private void keepAnnotated(Path path) throws FileNotFoundException {
        Iterator<ClassPathElement> it = path.getElements().iterator();
        while (it.hasNext()) {
            for (String str : it.next().list()) {
                if (str.endsWith(CLASS_EXTENSION)) {
                    DirectClassFile directClassFile = path.getClass(str);
                    if (hasRuntimeVisibleAnnotation(directClassFile)) {
                        this.filesToKeep.add(str);
                    } else {
                        MethodList methods = directClassFile.getMethods();
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i6 < methods.size()) {
                                if (hasRuntimeVisibleAnnotation(methods.get(i6))) {
                                    this.filesToKeep.add(str);
                                    break;
                                }
                                i6++;
                            } else {
                                FieldList fields = directClassFile.getFields();
                                while (true) {
                                    if (i5 >= fields.size()) {
                                        break;
                                    }
                                    if (hasRuntimeVisibleAnnotation(fields.get(i5))) {
                                        this.filesToKeep.add(str);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] strArr) {
        int i5 = 0;
        boolean z4 = true;
        while (i5 < strArr.length - 2) {
            if (strArr[i5].equals(DISABLE_ANNOTATION_RESOLUTION_WORKAROUND)) {
                z4 = false;
            } else {
                System.err.println("Invalid option " + strArr[i5]);
                printUsage();
                System.exit(1);
            }
            i5++;
        }
        if (strArr.length - i5 != 2) {
            printUsage();
            System.exit(1);
        }
        try {
            printList(new MainDexListBuilder(z4, strArr[i5], strArr[i5 + 1]).getMainDexList());
        } catch (IOException e5) {
            System.err.println("A fatal error occured: " + e5.getMessage());
            System.exit(1);
        }
    }

    private static void printList(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void printUsage() {
        System.err.print(USAGE_MESSAGE);
    }

    public Set<String> getMainDexList() {
        return this.filesToKeep;
    }
}
