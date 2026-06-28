package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.k1;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.text.e0;
import kotlin.text.f0;
import p4.l;
import u3.e;
import u3.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "name", "", "columns", "", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "options", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class FtsTableInfo {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @l
    @e
    public final Set<String> columns;

    @l
    @e
    public final String name;

    @l
    @e
    public final Set<String> options;

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "()V", "FTS_OPTIONS", "", "", "[Ljava/lang/String;", "parseOptions", "", "createStatement", "read", "Landroidx/room/util/FtsTableInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "readColumns", "readOptions", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Set d5;
            Set<String> a5;
            d5 = k1.d();
            Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                Cursor cursor = query;
                if (cursor.getColumnCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("name");
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(columnIndex);
                        l0.o(string, "cursor.getString(nameIndex)");
                        d5.add(string);
                    }
                }
                r2 r2Var = r2.f19517a;
                c.a(query, null);
                a5 = k1.a(d5);
                return a5;
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            String sql;
            Cursor query = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    sql = cursor.getString(cursor.getColumnIndexOrThrow("sql"));
                } else {
                    sql = "";
                }
                c.a(query, null);
                l0.o(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @l
        @VisibleForTesting
        @m
        public final Set<String> parseOptions(@l String createStatement) {
            boolean z4;
            int o32;
            int C3;
            CharSequence C5;
            Set<String> X5;
            boolean z5;
            boolean s22;
            boolean z6;
            boolean z7;
            int i5;
            boolean z8;
            Character ch;
            Set<String> k5;
            l0.p(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                k5 = l1.k();
                return k5;
            }
            o32 = f0.o3(createStatement, '(', 0, false, 6, null);
            C3 = f0.C3(createStatement, ')', 0, false, 6, null);
            String substring = createStatement.substring(o32 + 1, C3);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = -1;
            int i7 = 0;
            int i8 = 0;
            while (i7 < substring.length()) {
                char charAt = substring.charAt(i7);
                int i9 = i8 + 1;
                if (charAt == '\'' || charAt == '\"') {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 || charAt == '`') {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i6 + 1, i8);
                    l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i10 = 0;
                    boolean z9 = false;
                    while (i10 <= length) {
                        if (!z9) {
                            i5 = i10;
                        } else {
                            i5 = length;
                        }
                        if (l0.t(substring2.charAt(i5), 32) <= 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!z9) {
                            if (!z8) {
                                z9 = true;
                            } else {
                                i10++;
                            }
                        } else {
                            if (!z8) {
                                break;
                            }
                            length--;
                        }
                    }
                    arrayList.add(substring2.subSequence(i10, length + 1).toString());
                    i6 = i8;
                }
                i7++;
                i8 = i9;
            }
            String substring3 = substring.substring(i6 + 1);
            l0.o(substring3, "this as java.lang.String).substring(startIndex)");
            C5 = f0.C5(substring3);
            arrayList.add(C5.toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        s22 = e0.s2(str, strArr[i11], false, 2, null);
                        if (s22) {
                            z5 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    arrayList2.add(obj);
                }
            }
            X5 = kotlin.collections.e0.X5(arrayList2);
            return X5;
        }

        @l
        @m
        public final FtsTableInfo read(@l SupportSQLiteDatabase database, @l String tableName) {
            l0.p(database, "database");
            l0.p(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }
    }

    public FtsTableInfo(@l String name, @l Set<String> columns, @l Set<String> options) {
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @l
    @VisibleForTesting
    @m
    public static final Set<String> parseOptions(@l String str) {
        return Companion.parseOptions(str);
    }

    @l
    @m
    public static final FtsTableInfo read(@l SupportSQLiteDatabase supportSQLiteDatabase, @l String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (!l0.g(this.name, ftsTableInfo.name) || !l0.g(this.columns, ftsTableInfo.columns)) {
            return false;
        }
        return l0.g(this.options, ftsTableInfo.options);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    @l
    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(@l String name, @l Set<String> columns, @l String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(createSql, "createSql");
    }
}
