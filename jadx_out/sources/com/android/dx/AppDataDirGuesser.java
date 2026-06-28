package com.android.dx;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
class AppDataDirGuesser {
    public static final int PER_USER_RANGE = 100000;

    private String getPathFromThisClassLoader(ClassLoader classLoader, Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField(ClientCookie.PATH_ATTR);
            declaredField.setAccessible(true);
            return (String) declaredField.get(classLoader);
        } catch (ClassCastException | IllegalAccessException | NoSuchFieldException unused) {
            return processClassLoaderString(classLoader.toString());
        }
    }

    private File getWriteableDirectory(String str) {
        File file = new File(str);
        if (!isWriteableDirectory(file)) {
            return null;
        }
        return file;
    }

    private ClassLoader guessSuitableClassLoader() {
        return AppDataDirGuesser.class.getClassLoader();
    }

    static String processClassLoaderString(String str) {
        if (str.contains("DexPathList")) {
            return processClassLoaderString43OrLater(str);
        }
        return processClassLoaderString42OrEarlier(str);
    }

    private static String processClassLoaderString42OrEarlier(String str) {
        int lastIndexOf = str.lastIndexOf(91);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        int indexOf = str.indexOf(93);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    private static String processClassLoaderString43OrLater(String str) {
        int indexOf = str.indexOf("DexPathList") + 11;
        if (str.length() > indexOf + 4) {
            String substring = str.substring(indexOf);
            int indexOf2 = substring.indexOf(93);
            if (substring.charAt(0) == '[' && substring.charAt(1) == '[' && indexOf2 >= 0) {
                String[] split = substring.substring(2, indexOf2).split(",");
                for (int i5 = 0; i5 < split.length; i5++) {
                    int indexOf3 = split[i5].indexOf(34);
                    int lastIndexOf = split[i5].lastIndexOf(34);
                    if (indexOf3 > 0 && indexOf3 < lastIndexOf) {
                        split[i5] = split[i5].substring(indexOf3 + 1, lastIndexOf);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String str2 : split) {
                    if (sb.length() > 0) {
                        sb.append(':');
                    }
                    sb.append(str2);
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    static String[] splitPathList(String str) {
        if (str.startsWith("dexPath=")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                str = str.substring(8);
            } else {
                str = str.substring(8, indexOf);
            }
        }
        return str.split(":");
    }

    boolean fileOrDirExists(File file) {
        return file.exists();
    }

    Integer getProcessUid() {
        try {
            return (Integer) Class.forName("android.os.Process").getMethod("myUid", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public File guess() {
        try {
            ClassLoader guessSuitableClassLoader = guessSuitableClassLoader();
            Class<?> cls = Class.forName("dalvik.system.PathClassLoader");
            cls.cast(guessSuitableClassLoader);
            File[] guessPath = guessPath(getPathFromThisClassLoader(guessSuitableClassLoader, cls));
            if (guessPath.length > 0) {
                return guessPath[0];
            }
            return null;
        } catch (ClassCastException | ClassNotFoundException unused) {
            return null;
        }
    }

    File[] guessPath(String str) {
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        for (String str2 : splitPathList(str)) {
            if (str2.startsWith("/data/app/") && (lastIndexOf = str2.lastIndexOf(".apk")) == str2.length() - 4) {
                int indexOf = str2.indexOf("-");
                if (indexOf != -1) {
                    lastIndexOf = indexOf;
                }
                String substring = str2.substring(10, lastIndexOf);
                File writeableDirectory = getWriteableDirectory("/data/data/" + substring);
                if (writeableDirectory == null) {
                    writeableDirectory = guessUserDataDirectory(substring);
                }
                if (writeableDirectory != null) {
                    File file = new File(writeableDirectory, "cache");
                    if ((fileOrDirExists(file) || file.mkdir()) && isWriteableDirectory(file)) {
                        arrayList.add(file);
                    }
                }
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    File guessUserDataDirectory(String str) {
        Integer processUid = getProcessUid();
        if (processUid == null) {
            return null;
        }
        return getWriteableDirectory(String.format("/data/user/%d/%s", Integer.valueOf(processUid.intValue() / 100000), str));
    }

    boolean isWriteableDirectory(File file) {
        return file.isDirectory() && file.canWrite();
    }
}
