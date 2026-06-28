package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.e0;
import kotlin.text.f0;
import n3.a;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/room/util/TableInfo;", "", "name", "", "columns", "", "Landroidx/room/util/TableInfo$Column;", "foreignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "indices", "Landroidx/room/util/TableInfo$Index;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "Column", "Companion", "CreatedFrom", "ForeignKey", "ForeignKeyWithSequence", "Index", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public final Map<String, Column> columns;

    @l
    @e
    public final Set<ForeignKey> foreignKeys;

    @m
    @e
    public final Set<Index> indices;

    @l
    @e
    public final String name;

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "()V", "CREATED_FROM_DATABASE", "", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "read", "Landroidx/room/util/TableInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final TableInfo read(@l SupportSQLiteDatabase database, @l String tableName) {
            l0.p(database, "database");
            l0.p(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }
    }

    @n3.e(a.SOURCE)
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface CreatedFrom {
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "referenceTable", "", "onDelete", "onUpdate", "columnNames", "", "referenceColumnNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static final class ForeignKey {

        @l
        @e
        public final List<String> columnNames;

        @l
        @e
        public final String onDelete;

        @l
        @e
        public final String onUpdate;

        @l
        @e
        public final List<String> referenceColumnNames;

        @l
        @e
        public final String referenceTable;

        public ForeignKey(@l String referenceTable, @l String onDelete, @l String onUpdate, @l List<String> columnNames, @l List<String> referenceColumnNames) {
            l0.p(referenceTable, "referenceTable");
            l0.p(onDelete, "onDelete");
            l0.p(onUpdate, "onUpdate");
            l0.p(columnNames, "columnNames");
            l0.p(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (!l0.g(this.referenceTable, foreignKey.referenceTable) || !l0.g(this.onDelete, foreignKey.onDelete) || !l0.g(this.onUpdate, foreignKey.onUpdate) || !l0.g(this.columnNames, foreignKey.columnNames)) {
                return false;
            }
            return l0.g(this.referenceColumnNames, foreignKey.referenceColumnNames);
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        @l
        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "", "id", "", "sequence", TypedValues.TransitionType.S_FROM, "", TypedValues.TransitionType.S_TO, "(IILjava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getId", "()I", "getSequence", "getTo", "compareTo", "other", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

        @l
        private final String from;
        private final int id;
        private final int sequence;

        @l
        private final String to;

        public ForeignKeyWithSequence(int i5, int i6, @l String from, @l String to) {
            l0.p(from, "from");
            l0.p(to, "to");
            this.id = i5;
            this.sequence = i6;
            this.from = from;
            this.to = to;
        }

        @l
        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        @l
        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(@l ForeignKeyWithSequence other) {
            l0.p(other, "other");
            int i5 = this.id - other.id;
            return i5 == 0 ? this.sequence - other.sequence : i5;
        }
    }

    public TableInfo(@l String name, @l Map<String, Column> columns, @l Set<ForeignKey> foreignKeys, @m Set<Index> set) {
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    @l
    @u3.m
    public static final TableInfo read(@l SupportSQLiteDatabase supportSQLiteDatabase, @l String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@m Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!l0.g(this.name, tableInfo.name) || !l0.g(this.columns, tableInfo.columns) || !l0.g(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return l0.g(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    @l
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i5, w wVar) {
        this(str, map, set, (i5 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TableInfo(@p4.l java.lang.String r2, @p4.l java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> r3, @p4.l java.util.Set<androidx.room.util.TableInfo.ForeignKey> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "foreignKeys"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.util.Set r0 = kotlin.collections.j1.k()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.<init>(java.lang.String, java.util.Map, java.util.Set):void");
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0010\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "name", "", "type", "notNull", "", "primaryKeyPosition", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "defaultValue", "createdFrom", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "affinity", "getAffinity$annotations", "()V", "isPrimaryKey", "()Z", "equals", "other", "findAffinity", TTDownloadField.TT_HASHCODE, "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Column {

        @l
        public static final Companion Companion = new Companion(null);

        @e
        public final int affinity;

        @e
        public final int createdFrom;

        @m
        @e
        public final String defaultValue;

        @l
        @e
        public final String name;

        @e
        public final boolean notNull;

        @e
        public final int primaryKeyPosition;

        @l
        @e
        public final String type;

        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "()V", "containsSurroundingParenthesis", "", "current", "", "defaultValueEquals", "other", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            private final boolean containsSurroundingParenthesis(String str) {
                boolean z4;
                if (str.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return false;
                }
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    int i8 = i7 + 1;
                    if (i7 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i6++;
                    } else if (charAt == ')' && i6 - 1 == 0 && i7 != str.length() - 1) {
                        return false;
                    }
                    i5++;
                    i7 = i8;
                }
                if (i6 == 0) {
                    return true;
                }
                return false;
            }

            @VisibleForTesting
            @u3.m
            public final boolean defaultValueEquals(@l String current, @m String str) {
                CharSequence C5;
                l0.p(current, "current");
                if (l0.g(current, str)) {
                    return true;
                }
                if (containsSurroundingParenthesis(current)) {
                    String substring = current.substring(1, current.length() - 1);
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    C5 = f0.C5(substring);
                    return l0.g(C5.toString(), str);
                }
                return false;
            }
        }

        public Column(@l String name, @l String type, boolean z4, int i5, @m String str, int i6) {
            l0.p(name, "name");
            l0.p(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z4;
            this.primaryKeyPosition = i5;
            this.defaultValue = str;
            this.createdFrom = i6;
            this.affinity = findAffinity(type);
        }

        @VisibleForTesting
        @u3.m
        public static final boolean defaultValueEquals(@l String str, @m String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        @ColumnInfo.SQLiteTypeAffinity
        private final int findAffinity(String str) {
            boolean T2;
            boolean T22;
            boolean T23;
            boolean T24;
            boolean T25;
            boolean T26;
            boolean T27;
            boolean T28;
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            l0.o(US, "US");
            String upperCase = str.toUpperCase(US);
            l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            T2 = f0.T2(upperCase, "INT", false, 2, null);
            if (T2) {
                return 3;
            }
            T22 = f0.T2(upperCase, "CHAR", false, 2, null);
            if (!T22) {
                T23 = f0.T2(upperCase, "CLOB", false, 2, null);
                if (!T23) {
                    T24 = f0.T2(upperCase, "TEXT", false, 2, null);
                    if (!T24) {
                        T25 = f0.T2(upperCase, "BLOB", false, 2, null);
                        if (T25) {
                            return 5;
                        }
                        T26 = f0.T2(upperCase, "REAL", false, 2, null);
                        if (!T26) {
                            T27 = f0.T2(upperCase, "FLOA", false, 2, null);
                            if (!T27) {
                                T28 = f0.T2(upperCase, "DOUB", false, 2, null);
                                if (!T28) {
                                    return 1;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                }
            }
            return 2;
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@p4.m java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof androidx.room.util.TableInfo.Column
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.primaryKeyPosition
                r3 = r7
                androidx.room.util.TableInfo$Column r3 = (androidx.room.util.TableInfo.Column) r3
                int r3 = r3.primaryKeyPosition
                if (r1 == r3) goto L14
                return r2
            L14:
                java.lang.String r1 = r6.name
                androidx.room.util.TableInfo$Column r7 = (androidx.room.util.TableInfo.Column) r7
                java.lang.String r3 = r7.name
                boolean r1 = kotlin.jvm.internal.l0.g(r1, r3)
                if (r1 != 0) goto L21
                return r2
            L21:
                boolean r1 = r6.notNull
                boolean r3 = r7.notNull
                if (r1 == r3) goto L28
                return r2
            L28:
                int r1 = r6.createdFrom
                r3 = 2
                if (r1 != r0) goto L40
                int r1 = r7.createdFrom
                if (r1 != r3) goto L40
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L40
                androidx.room.util.TableInfo$Column$Companion r4 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r5 = r7.defaultValue
                boolean r1 = r4.defaultValueEquals(r1, r5)
                if (r1 != 0) goto L40
                return r2
            L40:
                int r1 = r6.createdFrom
                if (r1 != r3) goto L57
                int r1 = r7.createdFrom
                if (r1 != r0) goto L57
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L57
                androidx.room.util.TableInfo$Column$Companion r3 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r4 = r6.defaultValue
                boolean r1 = r3.defaultValueEquals(r1, r4)
                if (r1 != 0) goto L57
                return r2
            L57:
                int r1 = r6.createdFrom
                if (r1 == 0) goto L78
                int r3 = r7.createdFrom
                if (r1 != r3) goto L78
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L6e
                androidx.room.util.TableInfo$Column$Companion r3 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r4 = r7.defaultValue
                boolean r1 = r3.defaultValueEquals(r1, r4)
                if (r1 != 0) goto L74
                goto L72
            L6e:
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L74
            L72:
                r1 = r0
                goto L75
            L74:
                r1 = r2
            L75:
                if (r1 == 0) goto L78
                return r2
            L78:
                int r1 = r6.affinity
                int r7 = r7.affinity
                if (r1 != r7) goto L7f
                goto L80
            L7f:
                r0 = r2
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Column.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i5;
            int hashCode = ((this.name.hashCode() * 31) + this.affinity) * 31;
            if (this.notNull) {
                i5 = 1231;
            } else {
                i5 = 1237;
            }
            return ((hashCode + i5) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @k(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public Column(@l String name, @l String type, boolean z4, int i5) {
            this(name, type, z4, i5, null, 0);
            l0.p(name, "name");
            l0.p(type, "type");
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "name", "", "unique", "", "columns", "", "(Ljava/lang/String;ZLjava/util/List;)V", "orders", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Index {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        public static final String DEFAULT_PREFIX = "index_";

        @l
        @e
        public final List<String> columns;

        @l
        @e
        public final String name;

        @l
        @e
        public List<String> orders;

        @e
        public final boolean unique;

        @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/room/util/TableInfo$Index$Companion;", "", "()V", "DEFAULT_PREFIX", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(@l String name, boolean z4, @l List<String> columns, @l List<String> orders) {
            l0.p(name, "name");
            l0.p(columns, "columns");
            l0.p(orders, "orders");
            this.name = name;
            this.unique = z4;
            this.columns = columns;
            this.orders = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    list.add(Index.Order.ASC.name());
                }
            }
            this.orders = (List) list;
        }

        public boolean equals(@m Object obj) {
            boolean s22;
            boolean s23;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique != index.unique || !l0.g(this.columns, index.columns) || !l0.g(this.orders, index.orders)) {
                return false;
            }
            s22 = e0.s2(this.name, DEFAULT_PREFIX, false, 2, null);
            if (s22) {
                s23 = e0.s2(index.name, DEFAULT_PREFIX, false, 2, null);
                return s23;
            }
            return l0.g(this.name, index.name);
        }

        public int hashCode() {
            boolean s22;
            int hashCode;
            s22 = e0.s2(this.name, DEFAULT_PREFIX, false, 2, null);
            if (s22) {
                hashCode = -1184239155;
            } else {
                hashCode = this.name.hashCode();
            }
            return (((((hashCode * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        @l
        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @kotlin.k(message = "Use {@link #Index(String, boolean, List, List)}")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Index(@p4.l java.lang.String r5, boolean r6, @p4.l java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.l0.p(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.l0.p(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L22
                androidx.room.Index$Order r3 = androidx.room.Index.Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L22:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}
