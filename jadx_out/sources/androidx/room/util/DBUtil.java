package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.actions.SearchIntents;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import kotlin.text.e0;
import p4.l;
import p4.m;
import u3.h;

@h(name = "DBUtil")
@Instrumented
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n\u001a\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u001a\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u001a\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u001a\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¨\u0006\u0017"}, d2 = {"Landroidx/room/RoomDatabase;", "db", "Landroidx/sqlite/db/SupportSQLiteQuery;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "Landroid/os/CancellationSignal;", "signal", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lkotlin/r2;", "dropFtsSyncTriggers", "", "tableName", "foreignKeyCheck", "Ljava/io/File;", "databaseFile", "", "readVersion", "createCancellationSignal", "cursor", "processForeignKeyCheckFailure", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@r1({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DBUtil {
    @m
    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void dropFtsSyncTriggers(@l SupportSQLiteDatabase db) {
        List i5;
        List<String> a5;
        boolean s22;
        l0.p(db, "db");
        i5 = v.i();
        Cursor query = db.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                i5.add(cursor.getString(0));
            }
            r2 r2Var = r2.f19517a;
            c.a(query, null);
            a5 = v.a(i5);
            for (String triggerName : a5) {
                l0.o(triggerName, "triggerName");
                s22 = e0.s2(triggerName, "room_fts_content_sync_", false, 2, null);
                if (s22) {
                    String str = "DROP TRIGGER IF EXISTS " + triggerName;
                    if (!(db instanceof SQLiteDatabase)) {
                        db.execSQL(str);
                    } else {
                        SQLiteInstrumentation.execSQL((SQLiteDatabase) db, str);
                    }
                }
            }
        } finally {
        }
    }

    public static final void foreignKeyCheck(@l SupportSQLiteDatabase db, @l String tableName) {
        l0.p(db, "db");
        l0.p(tableName, "tableName");
        Cursor query = db.query("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            Cursor cursor = query;
            if (cursor.getCount() <= 0) {
                r2 r2Var = r2.f19517a;
                c.a(query, null);
                return;
            }
            throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursor));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(query, th);
                throw th2;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                l0.o(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                l0.o(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @k(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final Cursor query(@l RoomDatabase db, @l SupportSQLiteQuery sqLiteQuery, boolean z4) {
        l0.p(db, "db");
        l0.p(sqLiteQuery, "sqLiteQuery");
        return query(db, sqLiteQuery, z4, null);
    }

    public static final int readVersion(@l File databaseFile) throws IOException {
        l0.p(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i5 = allocate.getInt();
                c.a(channel, null);
                return i5;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(channel, th);
                throw th2;
            }
        }
    }

    @l
    public static final Cursor query(@l RoomDatabase db, @l SupportSQLiteQuery sqLiteQuery, boolean z4, @m CancellationSignal cancellationSignal) {
        l0.p(db, "db");
        l0.p(sqLiteQuery, "sqLiteQuery");
        Cursor query = db.query(sqLiteQuery, cancellationSignal);
        if (!z4 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(query) : query;
    }
}
