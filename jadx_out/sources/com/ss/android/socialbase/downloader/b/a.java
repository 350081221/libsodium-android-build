package com.ss.android.socialbase.downloader.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import java.io.File;

@Instrumented
/* loaded from: classes3.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f10415a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10416b;

    private a() {
        super(com.ss.android.socialbase.downloader.downloader.c.O(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 15);
        this.f10416b = false;
    }

    public static a a() {
        if (f10415a == null) {
            synchronized (a.class) {
                if (f10415a == null) {
                    f10415a = new a();
                }
            }
        }
        return f10415a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        Context O = com.ss.android.socialbase.downloader.downloader.c.O();
        if (!this.f10416b && O != null) {
            try {
                File file = new File("/data/data/" + O.getPackageName() + "/database/main/");
                if (!file.exists()) {
                    file.mkdir();
                }
                SQLiteDatabase readableDatabase = super.getReadableDatabase();
                if (!(readableDatabase instanceof SQLiteDatabase)) {
                    readableDatabase.execSQL("PRAGMA temp_store_directory = tempDir");
                } else {
                    SQLiteInstrumentation.execSQL(readableDatabase, "PRAGMA temp_store_directory = tempDir");
                }
                this.f10416b = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return super.getReadableDatabase();
        }
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (com.ss.android.socialbase.downloader.g.a.c().b("disable_sqlite_wal") > 0 && Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z4 = sQLiteDatabase instanceof SQLiteDatabase;
        if (!z4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT)");
        } else {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT)");
        }
        if (!z4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
        } else {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
        }
        if (!z4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
        } else {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        if (com.ss.android.socialbase.downloader.c.a.a()) {
            com.ss.android.socialbase.downloader.c.a.a("onDowngrade");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        switch (i5) {
            case 1:
                boolean z4 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z4) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD mimeType TEXT");
                }
                if (!z4) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD title TEXT");
                }
                if (!z4) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD notificationEnable INTEGER");
                }
                if (!z4) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD notificationVisibility INTEGER");
                }
            case 2:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD isFirstDownload INTEGER");
                }
            case 3:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD isFirstSuccess INTEGER");
                }
            case 4:
                boolean z5 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z5) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                }
                if (!z5) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD downloadTime INTEGER");
                }
            case 5:
                boolean z6 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z6) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD packageName TEXT");
                }
                if (!z6) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD md5 TEXT");
                }
            case 6:
                boolean z7 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z7) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD retryDelay INTEGER");
                }
                if (!z7) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD curRetryTime INTEGER");
                }
                if (!z7) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                }
                if (!z7) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
                }
            case 7:
                boolean z8 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z8) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
                }
                if (!z8) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
                }
            case 8:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
                }
            case 9:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
                }
            case 10:
                boolean z9 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                }
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                }
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                }
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD realDownloadTime INTEGER");
                }
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                }
                if (!z9) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD independentProcess INTEGER");
                }
            case 11:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
                }
            case 12:
                boolean z10 = sQLiteDatabase instanceof SQLiteDatabase;
                if (!z10) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD iconUrl TEXT");
                }
                if (!z10) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD appVersionCode INTEGER");
                }
            case 13:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )");
                }
            case 14:
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
                    return;
                } else {
                    SQLiteInstrumentation.execSQL(sQLiteDatabase, "ALTER TABLE downloader ADD taskId TEXT");
                    return;
                }
            default:
                return;
        }
    }
}
