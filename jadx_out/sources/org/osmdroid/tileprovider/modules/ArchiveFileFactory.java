package org.osmdroid.tileprovider.modules;

import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.osmdroid.api.IMapView;

/* loaded from: classes4.dex */
public class ArchiveFileFactory {
    static Map<String, Class<? extends IArchiveFile>> extensionMap;

    static {
        HashMap hashMap = new HashMap();
        extensionMap = hashMap;
        hashMap.put("zip", ZipFileArchive.class);
        extensionMap.put("sqlite", DatabaseFileArchive.class);
        extensionMap.put("mbtiles", MBTilesFileArchive.class);
        extensionMap.put("gemf", GEMFFileArchive.class);
    }

    public static IArchiveFile getArchiveFile(File file) {
        String name = file.getName();
        if (name.contains(".")) {
            try {
                name = name.substring(name.lastIndexOf(".") + 1);
            } catch (Exception unused) {
            }
        }
        Class<? extends IArchiveFile> cls = extensionMap.get(name.toLowerCase());
        if (cls != null) {
            try {
                IArchiveFile newInstance = cls.newInstance();
                newInstance.init(file);
                return newInstance;
            } catch (IllegalAccessException e5) {
                Log.e(IMapView.LOGTAG, "Error initializing archive file provider " + file.getAbsolutePath(), e5);
                return null;
            } catch (InstantiationException e6) {
                Log.e(IMapView.LOGTAG, "Error initializing archive file provider " + file.getAbsolutePath(), e6);
                return null;
            } catch (Exception e7) {
                Log.e(IMapView.LOGTAG, "Error opening archive file " + file.getAbsolutePath(), e7);
                return null;
            }
        }
        return null;
    }

    public static Set<String> getRegisteredExtensions() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(extensionMap.keySet());
        return hashSet;
    }

    public static boolean isFileExtensionRegistered(String str) {
        return extensionMap.containsKey(str);
    }

    public static void registerArchiveFileProvider(Class<? extends IArchiveFile> cls, String str) {
        extensionMap.put(str, cls);
    }
}
