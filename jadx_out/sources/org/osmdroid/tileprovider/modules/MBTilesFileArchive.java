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
import java.util.Collections;
import java.util.Set;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;

@Instrumented
/* loaded from: classes4.dex */
public class MBTilesFileArchive implements IArchiveFile {
    public static final String COL_TILES_TILE_COLUMN = "tile_column";
    public static final String COL_TILES_TILE_DATA = "tile_data";
    public static final String COL_TILES_TILE_ROW = "tile_row";
    public static final String COL_TILES_ZOOM_LEVEL = "zoom_level";
    public static final String TABLE_TILES = "tiles";
    private SQLiteDatabase mDatabase;

    public MBTilesFileArchive() {
    }

    public static MBTilesFileArchive getDatabaseFileArchive(File file) throws SQLiteException {
        return new MBTilesFileArchive(SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        this.mDatabase.close();
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(e eVar, long j5) {
        Cursor query;
        ByteArrayInputStream byteArrayInputStream;
        try {
            String[] strArr = {COL_TILES_TILE_DATA};
            String[] strArr2 = {Integer.toString(MapTileIndex.getX(j5)), Double.toString((Math.pow(2.0d, MapTileIndex.getZoom(j5)) - MapTileIndex.getY(j5)) - 1.0d), Integer.toString(MapTileIndex.getZoom(j5))};
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                query = sQLiteDatabase.query("tiles", strArr, "tile_column=? and tile_row=? and zoom_level=?", strArr2, null, null, null);
            } else {
                query = SQLiteInstrumentation.query(sQLiteDatabase, "tiles", strArr, "tile_column=? and tile_row=? and zoom_level=?", strArr2, null, null, null);
            }
            if (query.getCount() != 0) {
                query.moveToFirst();
                byteArrayInputStream = new ByteArrayInputStream(query.getBlob(0));
            } else {
                byteArrayInputStream = null;
            }
            query.close();
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
        return Collections.EMPTY_SET;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z4) {
    }

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.mDatabase.getPath() + "]";
    }

    private MBTilesFileArchive(SQLiteDatabase sQLiteDatabase) {
        this.mDatabase = sQLiteDatabase;
    }
}
