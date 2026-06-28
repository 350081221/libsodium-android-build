package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@Instrumented
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB'\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006 "}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "checkIdentity", "updateIdentity", "createMasterTableIfNotExists", "onConfigure", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "onDowngrade", "onOpen", "Landroidx/room/DatabaseConfiguration;", "configuration", "Landroidx/room/DatabaseConfiguration;", "Landroidx/room/RoomOpenHelper$Delegate;", "delegate", "Landroidx/room/RoomOpenHelper$Delegate;", "", "identityHash", "Ljava/lang/String;", "legacyHash", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "Companion", "Delegate", "ValidationResult", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
/* loaded from: classes2.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.m
    private DatabaseConfiguration configuration;

    @p4.l
    private final Delegate delegate;

    @p4.l
    private final String identityHash;

    @p4.l
    private final String legacyHash;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "()V", "hasEmptySchema", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "hasEmptySchema$room_runtime_release", "hasRoomMasterTable", "hasRoomMasterTable$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean hasEmptySchema$room_runtime_release(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
            Cursor query = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = query;
                boolean z4 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z4 = true;
                    }
                }
                kotlin.io.c.a(query, null);
                return z4;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
            Cursor query = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = query;
                boolean z4 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z4 = true;
                    }
                }
                kotlin.io.c.a(query, null);
                return z4;
            } finally {
            }
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "dropAllTables", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/RoomOpenHelper$ValidationResult;", "onValidateSchema", "onPreMigrate", "onPostMigrate", "", "version", "I", "<init>", "(I)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static abstract class Delegate {

        @u3.e
        public final int version;

        public Delegate(int i5) {
            this.version = i5;
        }

        public abstract void createAllTables(@p4.l SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(@p4.l SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(@p4.l SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(@p4.l SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        public void onPreMigrate(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        @p4.l
        public ValidationResult onValidateSchema(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
            validateMigration(db);
            return new ValidationResult(true, null);
        }

        @kotlin.k(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "isValid", "", "expectedFoundMsg", "", "(ZLjava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static class ValidationResult {

        @p4.m
        @u3.e
        public final String expectedFoundMsg;

        @u3.e
        public final boolean isValid;

        public ValidationResult(boolean z4, @p4.m String str) {
            this.isValid = z4;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@p4.l DatabaseConfiguration configuration, @p4.l Delegate delegate, @p4.l String identityHash, @p4.l String legacyHash) {
        super(delegate.version);
        l0.p(configuration, "configuration");
        l0.p(delegate, "delegate");
        l0.p(identityHash, "identityHash");
        l0.p(legacyHash, "legacyHash");
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        String str;
        if (Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            Cursor query = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    str = cursor.getString(0);
                } else {
                    str = null;
                }
                kotlin.io.c.a(query, null);
                if (!l0.g(this.identityHash, str) && !l0.g(this.legacyHash, str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + str);
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(query, th);
                    throw th2;
                }
            }
        }
        ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
        if (onValidateSchema.isValid) {
            this.delegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
        } else {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, RoomMasterTable.CREATE_QUERY);
        } else {
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        String createInsertQuery = RoomMasterTable.createInsertQuery(this.identityHash);
        if (!(supportSQLiteDatabase instanceof SQLiteDatabase)) {
            supportSQLiteDatabase.execSQL(createInsertQuery);
        } else {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, createInsertQuery);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        super.onConfigure(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        boolean hasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db);
        this.delegate.createAllTables(db);
        if (!hasEmptySchema$room_runtime_release) {
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db);
        this.delegate.onCreate(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(@p4.l SupportSQLiteDatabase db, int i5, int i6) {
        l0.p(db, "db");
        onUpgrade(db, i5, i6);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        super.onOpen(db);
        checkIdentity(db);
        this.delegate.onOpen(db);
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(@p4.l SupportSQLiteDatabase db, int i5, int i6) {
        List<Migration> findMigrationPath;
        l0.p(db, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        boolean z4 = false;
        if (databaseConfiguration != null && (findMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i5, i6)) != null) {
            this.delegate.onPreMigrate(db);
            Iterator<T> it = findMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(db);
            }
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db);
            if (onValidateSchema.isValid) {
                this.delegate.onPostMigrate(db);
                updateIdentity(db);
                z4 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg);
            }
        }
        if (!z4) {
            DatabaseConfiguration databaseConfiguration2 = this.configuration;
            if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i5, i6)) {
                this.delegate.dropAllTables(db);
                this.delegate.createAllTables(db);
                return;
            }
            throw new IllegalStateException("A migration from " + i5 + " to " + i6 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@p4.l DatabaseConfiguration configuration, @p4.l Delegate delegate, @p4.l String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        l0.p(configuration, "configuration");
        l0.p(delegate, "delegate");
        l0.p(legacyHash, "legacyHash");
    }
}
