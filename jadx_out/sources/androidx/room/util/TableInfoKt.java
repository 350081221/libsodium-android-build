package androidx.room.util;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.collections.k1;
import kotlin.collections.v;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000H\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¨\u0006\u0017"}, d2 = {"readColumns", "", "", "Landroidx/room/util/TableInfo$Column;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "readForeignKeyFieldMappings", "", "Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "cursor", "Landroid/database/Cursor;", "readForeignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readIndex", "Landroidx/room/util/TableInfo$Index;", "name", "unique", "", "readIndices", "readTableInfo", "Landroidx/room/util/TableInfo;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Map g5;
        Map<String, TableInfo.Column> d5;
        boolean z4;
        Map<String, TableInfo.Column> z5;
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = query;
            if (cursor.getColumnCount() <= 0) {
                z5 = a1.z();
                c.a(query, null);
                return z5;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex(d.S);
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            g5 = z0.g();
            while (cursor.moveToNext()) {
                String name = cursor.getString(columnIndex);
                String type = cursor.getString(columnIndex2);
                if (cursor.getInt(columnIndex3) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i5 = cursor.getInt(columnIndex4);
                String string = cursor.getString(columnIndex5);
                l0.o(name, "name");
                l0.o(type, "type");
                g5.put(name, new TableInfo.Column(name, type, z4, i5, string, 2));
            }
            d5 = z0.d(g5);
            c.a(query, null);
            return d5;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(query, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        List i5;
        List a5;
        List<TableInfo.ForeignKeyWithSequence> n5;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        i5 = v.i();
        while (cursor.moveToNext()) {
            int i6 = cursor.getInt(columnIndex);
            int i7 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l0.o(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l0.o(string2, "cursor.getString(toColumnIndex)");
            i5.add(new TableInfo.ForeignKeyWithSequence(i6, i7, string, string2));
        }
        a5 = v.a(i5);
        n5 = e0.n5(a5);
        return n5;
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set d5;
        Set<TableInfo.ForeignKey> a5;
        boolean z4;
        Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(cursor);
            cursor.moveToPosition(-1);
            d5 = k1.d();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i5 = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    l0.o(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursor.getString(columnIndex4);
                    l0.o(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursor.getString(columnIndex5);
                    l0.o(string3, "cursor.getString(onUpdateColumnIndex)");
                    d5.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            a5 = k1.a(d5);
            c.a(query, null);
            return a5;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z4) {
        List S5;
        List S52;
        String str2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i5 = cursor.getInt(columnIndex);
                        String columnName = cursor.getString(columnIndex3);
                        if (cursor.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i5);
                        l0.o(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i5), str2);
                    }
                }
                Collection values = treeMap.values();
                l0.o(values, "columnsMap.values");
                S5 = e0.S5(values);
                Collection values2 = treeMap2.values();
                l0.o(values2, "ordersMap.values");
                S52 = e0.S5(values2);
                TableInfo.Index index = new TableInfo.Index(str, z4, S5, S52);
                c.a(query, null);
                return index;
            }
            c.a(query, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set d5;
        Set<TableInfo.Index> a5;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                d5 = k1.d();
                while (cursor.moveToNext()) {
                    if (l0.g("c", cursor.getString(columnIndex2))) {
                        String name = cursor.getString(columnIndex);
                        boolean z4 = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z4 = false;
                        }
                        l0.o(name, "name");
                        TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, name, z4);
                        if (readIndex == null) {
                            c.a(query, null);
                            return null;
                        }
                        d5.add(readIndex);
                    }
                }
                a5 = k1.a(d5);
                c.a(query, null);
                return a5;
            }
            c.a(query, null);
            return null;
        } finally {
        }
    }

    @l
    public static final TableInfo readTableInfo(@l SupportSQLiteDatabase database, @l String tableName) {
        l0.p(database, "database");
        l0.p(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }
}
