package org.osmdroid.tileprovider.modules;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.GarbageCollector;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.SplashScreenable;

@Instrumented
/* loaded from: classes4.dex */
public class SqlTileWriter implements IFilesystemCache, SplashScreenable {
    public static final String COLUMN_EXPIRES = "expires";
    public static final String COLUMN_EXPIRES_INDEX = "expires_index";
    public static final String DATABASE_FILENAME = "cache.db";
    private static boolean cleanOnStartup = true;
    protected static File db_file = null;
    static boolean hasInited = false;
    protected static SQLiteDatabase mDb = null;
    private static final String primaryKey = "key=? and provider=?";
    private final GarbageCollector garbageCollector;
    protected long lastSizeCheck = 0;
    private static final Object mLock = new Object();
    private static final String[] queryColumns = {DatabaseFileArchive.COLUMN_TILE, "expires"};
    private static final String[] expireQueryColumn = {"expires"};

    public SqlTileWriter() {
        GarbageCollector garbageCollector = new GarbageCollector(new Runnable() { // from class: org.osmdroid.tileprovider.modules.SqlTileWriter.1
            @Override // java.lang.Runnable
            public void run() {
                SqlTileWriter.this.runCleanupOperation();
            }
        });
        this.garbageCollector = garbageCollector;
        getDb();
        if (!hasInited) {
            hasInited = true;
            if (cleanOnStartup) {
                garbageCollector.gc();
            }
        }
    }

    private void createIndex(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
        } else {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
        }
    }

    protected static String extractXFromKeyInSQL(int i5) {
        return "((key>>" + i5 + ")%" + (1 << i5) + ")";
    }

    protected static String extractYFromKeyInSQL(int i5) {
        return "(key%" + (1 << i5) + ")";
    }

    public static long getIndex(long j5) {
        return getIndex(MapTileIndex.getX(j5), MapTileIndex.getY(j5), MapTileIndex.getZoom(j5));
    }

    public static long getIndex(long j5, long j6, long j7) {
        int i5 = (int) j7;
        return (((j7 << i5) + j5) << i5) + j6;
    }

    public static String getPrimaryKey() {
        return primaryKey;
    }

    public static String[] getPrimaryKeyParameters(long j5, e eVar) {
        return getPrimaryKeyParameters(j5, eVar.name());
    }

    public static boolean isFunctionalException(SQLiteException sQLiteException) {
        String simpleName = sQLiteException.getClass().getSimpleName();
        return simpleName.equals("SQLiteFullException") || simpleName.equals("SQLiteBindOrColumnIndexOutOfRangeException") || simpleName.equals("SQLiteTableLockedException") || simpleName.equals("SQLiteMisuseException") || simpleName.equals("SQLiteBlobTooBigException") || simpleName.equals("SQLiteConstraintException") || simpleName.equals("SQLiteDatatypeMismatchException");
    }

    public static void setCleanupOnStart(boolean z4) {
        cleanOnStartup = z4;
    }

    protected void catchException(Exception exc) {
        if ((exc instanceof SQLiteException) && !isFunctionalException((SQLiteException) exc)) {
            refreshDb();
        }
    }

    public long delete(String str, int i5, Collection<Rect> collection, Collection<Rect> collection2) {
        String str2;
        String[] strArr;
        try {
            SQLiteDatabase db = getDb();
            if (db != null && db.isOpen()) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) getWhereClause(i5, collection, collection2));
                if (str != null) {
                    str2 = " and provider=?";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                String sb2 = sb.toString();
                if (str != null) {
                    strArr = new String[]{str};
                } else {
                    strArr = null;
                }
                return SQLiteInstrumentation.delete(db, "tiles", sb2, strArr);
            }
            return -1L;
        } catch (Exception e5) {
            catchException(e5);
            return 0L;
        }
    }

    public boolean exists(String str, long j5) {
        return 1 == getRowCount(primaryKey, getPrimaryKeyParameters(getIndex(j5), str));
    }

    protected SQLiteDatabase getDb() {
        SQLiteDatabase sQLiteDatabase = mDb;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (mLock) {
            a.a().f().mkdirs();
            File file = new File(a.a().f().getAbsolutePath() + File.separator + DATABASE_FILENAME);
            db_file = file;
            if (mDb == null) {
                try {
                    SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                    mDb = openOrCreateDatabase;
                    if (!(openOrCreateDatabase instanceof SQLiteDatabase)) {
                        openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                    } else {
                        SQLiteInstrumentation.execSQL(openOrCreateDatabase, "CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                    }
                } catch (Exception e5) {
                    Log.e(IMapView.LOGTAG, "Unable to start the sqlite tile writer. Check external storage availability.", e5);
                    catchException(e5);
                    return null;
                }
            }
        }
        return mDb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Long getExpirationTimestamp(org.osmdroid.tileprovider.tilesource.e r3, long r4) {
        /*
            r2 = this;
            r0 = 0
            long r4 = getIndex(r4)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.lang.String[] r3 = getPrimaryKeyParameters(r4, r3)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.lang.String[] r4 = org.osmdroid.tileprovider.modules.SqlTileWriter.expireQueryColumn     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            android.database.Cursor r3 = r2.getTileCursor(r3, r4)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L38
            if (r4 == 0) goto L34
            r4 = 0
            long r4 = r3.getLong(r4)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L38
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L38
            r3.close()
            return r4
        L22:
            r4 = move-exception
            goto L28
        L24:
            r4 = move-exception
            goto L3a
        L26:
            r4 = move-exception
            r3 = r0
        L28:
            java.lang.String r5 = "OsmDroid"
            java.lang.String r1 = "error getting expiration date from the tile cache"
            android.util.Log.e(r5, r1, r4)     // Catch: java.lang.Throwable -> L38
            r2.catchException(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L37
        L34:
            r3.close()
        L37:
            return r0
        L38:
            r4 = move-exception
            r0 = r3
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.SqlTileWriter.getExpirationTimestamp(org.osmdroid.tileprovider.tilesource.e, long):java.lang.Long");
    }

    public long getFirstExpiry() {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                Cursor rawQuery = SQLiteInstrumentation.rawQuery(db, "select min(expires) from tiles", null);
                rawQuery.moveToFirst();
                long j5 = rawQuery.getLong(0);
                rawQuery.close();
                return j5;
            } catch (Exception e5) {
                Log.e(IMapView.LOGTAG, "Unable to query for oldest tile", e5);
                catchException(e5);
            }
        }
        return 0L;
    }

    public long getRowCount(String str) {
        if (str == null) {
            return getRowCount(null, null);
        }
        return getRowCount("provider=?", new String[]{str});
    }

    public long getSize() {
        return db_file.length();
    }

    public Cursor getTileCursor(String[] strArr, String[] strArr2) {
        SQLiteDatabase db = getDb();
        if (!(db instanceof SQLiteDatabase)) {
            return db.query("tiles", strArr2, primaryKey, strArr, null, null, null);
        }
        return SQLiteInstrumentation.query(db, "tiles", strArr2, primaryKey, strArr, null, null, null);
    }

    protected StringBuilder getWhereClause(int i5, Rect rect) {
        long j5 = (1 << (i5 + 1)) - 1;
        long j6 = i5;
        long index = getIndex(0L, 0L, j6);
        long index2 = getIndex(j5, j5, j6);
        String extractXFromKeyInSQL = extractXFromKeyInSQL(i5);
        String extractYFromKeyInSQL = extractYFromKeyInSQL(i5);
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(DatabaseFileArchive.COLUMN_KEY);
        sb.append(" between ");
        sb.append(index);
        sb.append(" and ");
        sb.append(index2);
        if (rect != null) {
            sb.append(" and ");
            if (rect.left == rect.right) {
                sb.append(extractXFromKeyInSQL);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(rect.left);
            } else {
                sb.append("(");
                sb.append(extractXFromKeyInSQL);
                sb.append(">=");
                sb.append(rect.left);
                sb.append(rect.left < rect.right ? " and " : " or ");
                sb.append(extractXFromKeyInSQL);
                sb.append("<=");
                sb.append(rect.right);
                sb.append(")");
            }
            sb.append(" and ");
            if (rect.top == rect.bottom) {
                sb.append(extractYFromKeyInSQL);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(rect.top);
            } else {
                sb.append("(");
                sb.append(extractYFromKeyInSQL);
                sb.append(">=");
                sb.append(rect.top);
                sb.append(rect.top >= rect.bottom ? " or " : " and ");
                sb.append(extractYFromKeyInSQL);
                sb.append("<=");
                sb.append(rect.bottom);
                sb.append(")");
            }
        }
        sb.append(')');
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] importFromFileCache(boolean r28) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.SqlTileWriter.importFromFileCache(boolean):int[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [org.osmdroid.tileprovider.tilesource.e] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(e eVar, long j5) throws Exception {
        Cursor tileCursor;
        long j6;
        byte[] bArr;
        ?? byteArrayInputStream;
        Cursor cursor = null;
        try {
            try {
                tileCursor = getTileCursor(getPrimaryKeyParameters(getIndex(j5), (e) eVar), queryColumns);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z4 = true;
            if (tileCursor.moveToFirst()) {
                bArr = tileCursor.getBlob(0);
                j6 = tileCursor.getLong(1);
            } else {
                j6 = 0;
                bArr = null;
            }
            if (bArr == null) {
                if (a.a().M()) {
                    Log.d(IMapView.LOGTAG, "SqlCache - Tile doesn't exist: " + eVar.name() + MapTileIndex.toString(j5));
                }
                tileCursor.close();
                return null;
            }
            tileCursor.close();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Drawable drawable = eVar.getDrawable(byteArrayInputStream);
                if (j6 >= System.currentTimeMillis()) {
                    z4 = false;
                }
                if (z4 && drawable != null) {
                    if (a.a().M()) {
                        Log.d(IMapView.LOGTAG, "Tile expired: " + eVar.name() + MapTileIndex.toString(j5));
                    }
                    ExpirableBitmapDrawable.setState(drawable, -2);
                }
                StreamUtils.closeStream(byteArrayInputStream);
                return drawable;
            } catch (Throwable th3) {
                th = th3;
                cursor = byteArrayInputStream;
                if (cursor != null) {
                    StreamUtils.closeStream(cursor);
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            cursor = tileCursor;
            catchException(e);
            throw e;
        } catch (Throwable th4) {
            th = th4;
            cursor = tileCursor;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
    }

    public boolean purgeCache() {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            return false;
        }
        try {
            SQLiteInstrumentation.delete(db, "tiles", null, null);
            return true;
        } catch (Exception e5) {
            Log.w(IMapView.LOGTAG, "Error purging the db", e5);
            catchException(e5);
            return false;
        }
    }

    public void refreshDb() {
        synchronized (mLock) {
            SQLiteDatabase sQLiteDatabase = mDb;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                mDb = null;
            }
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(e eVar, long j5) {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                SQLiteInstrumentation.delete(db, "tiles", primaryKey, getPrimaryKeyParameters(getIndex(j5), eVar));
                return true;
            } catch (Exception e5) {
                Log.e(IMapView.LOGTAG, "Unable to delete cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5) + " db is not null", e5);
                Counters.fileCacheSaveErrors = Counters.fileCacheSaveErrors + 1;
                catchException(e5);
                return false;
            }
        }
        Log.d(IMapView.LOGTAG, "Unable to delete cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5) + ", database not available.");
        Counters.fileCacheSaveErrors = Counters.fileCacheSaveErrors + 1;
        return false;
    }

    public void runCleanupOperation() {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            createIndex(db);
            long length = db_file.length();
            if (length <= a.a().i()) {
                return;
            }
            runCleanupOperation(length - a.a().I(), a.a().j(), a.a().g(), true);
            return;
        }
        if (a.a().M()) {
            Log.d(IMapView.LOGTAG, "Finished init thread, aborted due to null database reference");
        }
    }

    @Override // org.osmdroid.util.SplashScreenable
    public void runDuringSplashScreen() {
        createIndex(getDb());
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(e eVar, long j5, InputStream inputStream, Long l5) {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        long index = getIndex(j5);
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
                            } catch (SQLiteFullException e5) {
                                e = e5;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                Log.e(IMapView.LOGTAG, "SQLiteFullException while saving tile.", e);
                                this.garbageCollector.gc();
                                catchException(e);
                                byteArrayOutputStream.close();
                                return false;
                            } catch (Exception e6) {
                                e = e6;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                Log.e(IMapView.LOGTAG, "Unable to store cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5) + " db is not null", e);
                                Counters.fileCacheSaveErrors = Counters.fileCacheSaveErrors + 1;
                                catchException(e);
                                byteArrayOutputStream.close();
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused) {
                                }
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        contentValues.put(DatabaseFileArchive.COLUMN_KEY, Long.valueOf(index));
                        contentValues.put(DatabaseFileArchive.COLUMN_TILE, byteArray);
                        if (l5 != null) {
                            contentValues.put("expires", l5);
                        }
                        SQLiteInstrumentation.replaceOrThrow(db, "tiles", null, contentValues);
                        if (a.a().M()) {
                            Log.d(IMapView.LOGTAG, "tile inserted " + eVar.name() + MapTileIndex.toString(j5));
                        }
                        if (System.currentTimeMillis() > this.lastSizeCheck + a.a().P()) {
                            this.lastSizeCheck = System.currentTimeMillis();
                            this.garbageCollector.gc();
                        }
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLiteFullException e7) {
                    e = e7;
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (IOException unused2) {
            }
        } else {
            Log.d(IMapView.LOGTAG, "Unable to store cached tile from " + eVar.name() + " " + MapTileIndex.toString(j5) + ", database not available.");
            Counters.fileCacheSaveErrors = Counters.fileCacheSaveErrors + 1;
            return false;
        }
    }

    public static String[] getPrimaryKeyParameters(long j5, String str) {
        return new String[]{String.valueOf(j5), str};
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(e eVar, long j5) {
        return exists(eVar.name(), j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r2 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected long getRowCount(java.lang.String r8, java.lang.String[] r9) {
        /*
            r7 = this;
            r0 = -1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.getDb()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r3 == 0) goto L4a
            boolean r4 = r3.isOpen()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r4 != 0) goto L10
            goto L4a
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r5 = "select count(*) from tiles"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r8 != 0) goto L1f
            java.lang.String r8 = ""
            goto L30
        L1f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r6 = " where "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5.append(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
        L30:
            r4.append(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            android.database.Cursor r2 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.rawQuery(r3, r8, r9)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            boolean r8 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r8 == 0) goto L53
            r8 = 0
            long r8 = r2.getLong(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r2.close()
            return r8
        L4a:
            return r0
        L4b:
            r8 = move-exception
            goto L57
        L4d:
            r8 = move-exception
            r7.catchException(r8)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L56
        L53:
            r2.close()
        L56:
            return r0
        L57:
            if (r2 == 0) goto L5c
            r2.close()
        L5c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.SqlTileWriter.getRowCount(java.lang.String, java.lang.String[]):long");
    }

    public boolean purgeCache(String str) {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                SQLiteInstrumentation.delete(db, "tiles", "provider = ?", new String[]{str});
                return true;
            } catch (Exception e5) {
                Log.w(IMapView.LOGTAG, "Error purging the db", e5);
                catchException(e5);
            }
        }
        return false;
    }

    public void runCleanupOperation(long j5, int i5, long j6, boolean z4) {
        boolean z5;
        String str;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase db = getDb();
        long j7 = j5;
        boolean z6 = true;
        while (j7 > 0) {
            if (z6) {
                z5 = false;
            } else {
                if (j6 > 0) {
                    try {
                        Thread.sleep(j6);
                    } catch (InterruptedException unused) {
                    }
                }
                z5 = z6;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT key,LENGTH(HEX(tile))/2 FROM tiles WHERE expires IS NOT NULL ");
                if (z4) {
                    str = "";
                } else {
                    str = "AND expires < " + currentTimeMillis + " ";
                }
                sb2.append(str);
                sb2.append("ORDER BY ");
                sb2.append("expires");
                sb2.append(" ASC LIMIT ");
                sb2.append(i5);
                String sb3 = sb2.toString();
                Cursor rawQuery = !(db instanceof SQLiteDatabase) ? db.rawQuery(sb3, null) : SQLiteInstrumentation.rawQuery(db, sb3, null);
                rawQuery.moveToFirst();
                sb.setLength(0);
                sb.append("key in (");
                String str2 = "";
                while (true) {
                    if (rawQuery.isAfterLast()) {
                        break;
                    }
                    long j8 = rawQuery.getLong(0);
                    long j9 = rawQuery.getLong(1);
                    rawQuery.moveToNext();
                    sb.append(str2);
                    sb.append(j8);
                    j7 -= j9;
                    if (j7 <= 0) {
                        str2 = ",";
                        break;
                    }
                    str2 = ",";
                }
                rawQuery.close();
                if ("".equals(str2)) {
                    return;
                }
                sb.append(')');
                try {
                    String sb4 = sb.toString();
                    if (db instanceof SQLiteDatabase) {
                        SQLiteInstrumentation.delete(db, "tiles", sb4, null);
                    } else {
                        db.delete("tiles", sb4, null);
                    }
                } catch (SQLiteFullException e5) {
                    Log.e(IMapView.LOGTAG, "SQLiteFullException while cleanup.", e5);
                    catchException(e5);
                } catch (Exception e6) {
                    catchException(e6);
                    return;
                }
                z6 = z5;
            } catch (Exception e7) {
                catchException(e7);
                return;
            }
        }
    }

    public long getRowCount(String str, int i5, Collection<Rect> collection, Collection<Rect> collection2) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getWhereClause(i5, collection, collection2));
        sb.append(str != null ? " and provider=?" : "");
        return getRowCount(sb.toString(), str != null ? new String[]{str} : null);
    }

    protected StringBuilder getWhereClause(int i5, Collection<Rect> collection, Collection<Rect> collection2) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((CharSequence) getWhereClause(i5, null));
        String str = "";
        if (collection != null && collection.size() > 0) {
            sb.append(" and (");
            String str2 = "";
            for (Rect rect : collection) {
                sb.append(str2);
                sb.append('(');
                sb.append((CharSequence) getWhereClause(i5, rect));
                sb.append(')');
                str2 = " or ";
            }
            sb.append(")");
        }
        if (collection2 != null && collection2.size() > 0) {
            sb.append(" and not(");
            for (Rect rect2 : collection2) {
                sb.append(str);
                sb.append('(');
                sb.append((CharSequence) getWhereClause(i5, rect2));
                sb.append(')');
                str = " or ";
            }
            sb.append(")");
        }
        sb.append(')');
        return sb;
    }
}
