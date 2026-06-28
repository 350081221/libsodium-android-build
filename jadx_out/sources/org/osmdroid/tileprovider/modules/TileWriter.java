package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class TileWriter implements IFilesystemCache {
    static boolean hasInited = false;
    private static long mUsedCacheSpace;
    Thread initThread;
    private long mMaximumCachedFileAge;

    public TileWriter() {
        this.initThread = null;
        if (!hasInited) {
            hasInited = true;
            Thread thread = new Thread() { // from class: org.osmdroid.tileprovider.modules.TileWriter.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    long unused = TileWriter.mUsedCacheSpace = 0L;
                    TileWriter.this.calculateDirectorySize(a.a().f());
                    if (TileWriter.mUsedCacheSpace > a.a().i()) {
                        TileWriter.this.cutCurrentCache();
                    }
                    if (a.a().M()) {
                        Log.d(IMapView.LOGTAG, "Finished init thread");
                    }
                }
            };
            this.initThread = thread;
            thread.setName("TileWriter#init");
            this.initThread.setPriority(1);
            this.initThread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateDirectorySize(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    mUsedCacheSpace += file2.length();
                }
                if (file2.isDirectory() && !isSymbolicDirectoryLink(file, file2)) {
                    calculateDirectorySize(file2);
                }
            }
        }
    }

    private boolean createFolderAndCheckIfExists(File file) {
        if (file.mkdirs()) {
            return true;
        }
        if (a.a().M()) {
            Log.d(IMapView.LOGTAG, "Failed to create " + file + " - wait and check again");
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        if (file.exists()) {
            if (a.a().M()) {
                Log.d(IMapView.LOGTAG, "Seems like another thread created " + file);
            }
            return true;
        }
        if (a.a().M()) {
            Log.d(IMapView.LOGTAG, "File still doesn't exist: " + file);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cutCurrentCache() {
        synchronized (a.a().f()) {
            if (mUsedCacheSpace > a.a().I()) {
                Log.d(IMapView.LOGTAG, "Trimming tile cache from " + mUsedCacheSpace + " to " + a.a().I());
                File[] fileArr = (File[]) getDirectoryFileList(a.a().f()).toArray(new File[0]);
                Arrays.sort(fileArr, new Comparator<File>() { // from class: org.osmdroid.tileprovider.modules.TileWriter.2
                    @Override // java.util.Comparator
                    public int compare(File file, File file2) {
                        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                    }
                });
                for (File file : fileArr) {
                    if (mUsedCacheSpace <= a.a().I()) {
                        break;
                    }
                    long length = file.length();
                    if (file.delete()) {
                        if (a.a().k()) {
                            Log.d(IMapView.LOGTAG, "Cache trim deleting " + file.getAbsolutePath());
                        }
                        mUsedCacheSpace -= length;
                    }
                }
                Log.d(IMapView.LOGTAG, "Finished trimming tile cache");
            }
        }
    }

    private List<File> getDirectoryFileList(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory()) {
                    arrayList.addAll(getDirectoryFileList(file2));
                }
            }
        }
        return arrayList;
    }

    public static long getUsedCacheSpace() {
        return mUsedCacheSpace;
    }

    private boolean isSymbolicDirectoryLink(File file, File file2) {
        try {
            return !file.getCanonicalPath().equals(file2.getCanonicalFile().getParent());
        } catch (IOException | NoSuchElementException unused) {
            return true;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(e eVar, long j5) {
        return getFile(eVar, j5).exists();
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Long getExpirationTimestamp(e eVar, long j5) {
        return null;
    }

    public File getFile(e eVar, long j5) {
        return new File(a.a().f(), eVar.getTileRelativeFilenameString(j5) + OpenStreetMapTileProviderConstants.TILE_PATH_EXTENSION);
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(e eVar, long j5) throws Exception {
        boolean z4;
        File file = getFile(eVar, j5);
        if (!file.exists()) {
            return null;
        }
        Drawable drawable = eVar.getDrawable(file.getPath());
        if (file.lastModified() < System.currentTimeMillis() - this.mMaximumCachedFileAge) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && drawable != null) {
            if (a.a().M()) {
                Log.d(IMapView.LOGTAG, "Tile expired: " + MapTileIndex.toString(j5));
            }
            ExpirableBitmapDrawable.setState(drawable, -2);
        }
        return drawable;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
        Thread thread = this.initThread;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(e eVar, long j5) {
        File file = getFile(eVar, j5);
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception e5) {
                Log.i(IMapView.LOGTAG, "Unable to delete cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5), e5);
                return false;
            }
        }
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(e eVar, long j5, InputStream inputStream, Long l5) {
        BufferedOutputStream bufferedOutputStream;
        File file = getFile(eVar, j5);
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "TileWrite " + file.getAbsolutePath());
        }
        File parentFile = file.getParentFile();
        if (!parentFile.exists() && !createFolderAndCheckIfExists(parentFile)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.getPath()), 8192);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long copy = mUsedCacheSpace + StreamUtils.copy(inputStream, bufferedOutputStream);
            mUsedCacheSpace = copy;
            if (copy > a.a().i()) {
                cutCurrentCache();
            }
            StreamUtils.closeStream(bufferedOutputStream);
            return true;
        } catch (IOException unused2) {
            bufferedOutputStream2 = bufferedOutputStream;
            Counters.fileCacheSaveErrors++;
            if (bufferedOutputStream2 != null) {
                StreamUtils.closeStream(bufferedOutputStream2);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                StreamUtils.closeStream(bufferedOutputStream2);
            }
            throw th;
        }
    }

    public void setMaximumCachedFileAge(long j5) {
        this.mMaximumCachedFileAge = j5;
    }
}
