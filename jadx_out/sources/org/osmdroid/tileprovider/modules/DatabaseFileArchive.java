package org.osmdroid.tileprovider.modules;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;

@Instrumented
/* loaded from: classes4.dex */
public class DatabaseFileArchive implements IArchiveFile {
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_PROVIDER = "provider";
    public static final String TABLE = "tiles";
    private SQLiteDatabase mDatabase;
    private boolean mIgnoreTileSource = false;
    public static final String COLUMN_TILE = "tile";
    static final String[] tile_column = {COLUMN_TILE};

    public DatabaseFileArchive() {
    }

    public static DatabaseFileArchive getDatabaseFileArchive(File file) throws SQLiteException {
        return new DatabaseFileArchive(SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 0));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        this.mDatabase.close();
    }

    public byte[] getImage(e eVar, long j5) {
        Cursor query;
        byte[] bArr;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                String[] strArr = {COLUMN_TILE};
                long x4 = MapTileIndex.getX(j5);
                long y4 = MapTileIndex.getY(j5);
                long zoom = MapTileIndex.getZoom(j5);
                int i5 = (int) zoom;
                long j6 = (((zoom << i5) + x4) << i5) + y4;
                if (!this.mIgnoreTileSource) {
                    SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                    String str = "key = " + j6 + " and provider = ?";
                    String[] strArr2 = {eVar.name()};
                    if (!(sQLiteDatabase2 instanceof SQLiteDatabase)) {
                        query = sQLiteDatabase2.query("tiles", strArr, str, strArr2, null, null, null);
                    } else {
                        query = SQLiteInstrumentation.query(sQLiteDatabase2, "tiles", strArr, str, strArr2, null, null, null);
                    }
                } else {
                    SQLiteDatabase sQLiteDatabase3 = this.mDatabase;
                    String str2 = "key = " + j6;
                    if (!(sQLiteDatabase3 instanceof SQLiteDatabase)) {
                        query = sQLiteDatabase3.query("tiles", strArr, str2, null, null, null, null);
                    } else {
                        query = SQLiteInstrumentation.query(sQLiteDatabase3, "tiles", strArr, str2, null, null, null, null);
                    }
                }
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    bArr = query.getBlob(0);
                } else {
                    bArr = null;
                }
                query.close();
            } catch (Throwable th) {
                Log.w(IMapView.LOGTAG, "Error getting db stream: " + MapTileIndex.toString(j5), th);
            }
            if (bArr == null) {
                return null;
            }
            return bArr;
        }
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "Skipping DatabaseFileArchive lookup, database is closed");
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(e eVar, long j5) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] image = getImage(eVar, j5);
            if (image != null) {
                byteArrayInputStream = new ByteArrayInputStream(image);
            } else {
                byteArrayInputStream = null;
            }
        } catch (Throwable th) {
            Log.w(IMapView.LOGTAG, "Error getting db stream: " + MapTileIndex.toString(j5), th);
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        return byteArrayInputStream;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        Cursor rawQuery;
        HashSet hashSet = new HashSet();
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                rawQuery = sQLiteDatabase.rawQuery("SELECT distinct provider FROM tiles", null);
            } else {
                rawQuery = SQLiteInstrumentation.rawQuery(sQLiteDatabase, "SELECT distinct provider FROM tiles", null);
            }
            while (rawQuery.moveToNext()) {
                hashSet.add(rawQuery.getString(0));
            }
            rawQuery.close();
        } catch (Exception e5) {
            Log.w(IMapView.LOGTAG, "Error getting tile sources: ", e5);
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z4) {
        this.mIgnoreTileSource = z4;
    }

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.mDatabase.getPath() + "]";
    }

    private DatabaseFileArchive(SQLiteDatabase sQLiteDatabase) {
        this.mDatabase = sQLiteDatabase;
    }
}
