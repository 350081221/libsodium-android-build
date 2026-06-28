package org.osmdroid.tileprovider.modules;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;

@Instrumented
/* loaded from: classes4.dex */
public class SqliteArchiveTileWriter implements IFilesystemCache {
    static boolean hasInited = false;
    private static final String[] queryColumns = {DatabaseFileArchive.COLUMN_TILE};
    final File db_file;
    final SQLiteDatabase mDatabase;
    final int questimate = JosStatusCodes.RTN_CODE_COMMON_ERROR;

    public SqliteArchiveTileWriter(String str) throws Exception {
        File file = new File(str);
        this.db_file = file;
        try {
            SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null);
            this.mDatabase = openOrCreateDatabase;
            try {
                if (!(openOrCreateDatabase instanceof SQLiteDatabase)) {
                    openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, PRIMARY KEY (key, provider));");
                } else {
                    SQLiteInstrumentation.execSQL(openOrCreateDatabase, "CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, PRIMARY KEY (key, provider));");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                Log.d(IMapView.LOGTAG, "error setting db schema, it probably exists already", th);
            }
        } catch (Exception e5) {
            throw new Exception("Trouble creating database file at " + str, e5);
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(e eVar, long j5) {
        boolean z4;
        try {
            Cursor tileCursor = getTileCursor(SqlTileWriter.getPrimaryKeyParameters(SqlTileWriter.getIndex(j5), eVar));
            if (tileCursor.getCount() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            tileCursor.close();
            return z4;
        } catch (Throwable th) {
            Log.e(IMapView.LOGTAG, "Unable to store cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5), th);
            return false;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Long getExpirationTimestamp(e eVar, long j5) {
        return null;
    }

    public Cursor getTileCursor(String[] strArr) {
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            String[] strArr2 = queryColumns;
            String primaryKey = SqlTileWriter.getPrimaryKey();
            if (!(sQLiteDatabase2 instanceof SQLiteDatabase)) {
                return sQLiteDatabase2.query("tiles", strArr2, primaryKey, strArr, null, null, null);
            }
            return SQLiteInstrumentation.query(sQLiteDatabase2, "tiles", strArr2, primaryKey, strArr, null, null, null);
        }
        Log.w(IMapView.LOGTAG, "Skipping SqlArchiveTileWriter getTileCursor, database is closed");
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(e eVar, long j5) throws Exception {
        byte[] bArr;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        ByteArrayInputStream byteArrayInputStream = null;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                Cursor tileCursor = getTileCursor(SqlTileWriter.getPrimaryKeyParameters(SqlTileWriter.getIndex(j5), eVar));
                if (tileCursor == null) {
                    return null;
                }
                if (tileCursor.moveToFirst()) {
                    bArr = tileCursor.getBlob(tileCursor.getColumnIndex(DatabaseFileArchive.COLUMN_TILE));
                } else {
                    bArr = null;
                }
                tileCursor.close();
                if (bArr == null) {
                    if (a.a().M()) {
                        Log.d(IMapView.LOGTAG, "SqlCache - Tile doesn't exist: " + eVar.name() + MapTileIndex.toString(j5));
                    }
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                try {
                    Drawable drawable = eVar.getDrawable(byteArrayInputStream2);
                    StreamUtils.closeStream(byteArrayInputStream2);
                    return drawable;
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        StreamUtils.closeStream(byteArrayInputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Log.w(IMapView.LOGTAG, "Skipping SqlArchiveTileWriter loadTile, database is closed");
            return null;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(e eVar, long j5) {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(e eVar, long j5, InputStream inputStream, Long l5) {
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        boolean z4 = false;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    long index = SqlTileWriter.getIndex(j5);
                    contentValues.put("provider", eVar.name());
                    byte[] bArr = new byte[512];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                Log.e(IMapView.LOGTAG, "Unable to store cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5), th);
                                byteArrayOutputStream.close();
                                return z4;
                            } catch (Throwable th2) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused) {
                                }
                                throw th2;
                            }
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    contentValues.put(DatabaseFileArchive.COLUMN_KEY, Long.valueOf(index));
                    contentValues.put(DatabaseFileArchive.COLUMN_TILE, byteArray);
                    SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                    if (!(sQLiteDatabase2 instanceof SQLiteDatabase)) {
                        sQLiteDatabase2.insert("tiles", null, contentValues);
                    } else {
                        SQLiteInstrumentation.insert(sQLiteDatabase2, "tiles", null, contentValues);
                    }
                    z4 = true;
                    if (a.a().M()) {
                        Log.d(IMapView.LOGTAG, "tile inserted " + eVar.name() + MapTileIndex.toString(j5));
                    }
                    byteArrayOutputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused2) {
            }
        } else {
            Log.d(IMapView.LOGTAG, "Skipping SqlArchiveTileWriter saveFile, database is closed");
            return false;
        }
    }
}
