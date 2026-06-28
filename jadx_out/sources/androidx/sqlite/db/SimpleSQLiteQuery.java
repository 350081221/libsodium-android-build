package androidx.sqlite.db;

import com.huawei.hms.actions.SearchIntents;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "Lkotlin/r2;", "bindTo", "", SearchIntents.EXTRA_QUERY, "Ljava/lang/String;", "", "", "bindArgs", "[Ljava/lang/Object;", "getSql", "()Ljava/lang/String;", "sql", "", "getArgCount", "()I", "argCount", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private final Object[] bindArgs;

    @l
    private final String query;

    public SimpleSQLiteQuery(@l String query, @m Object[] objArr) {
        l0.p(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @u3.m
    public static final void bind(@l SupportSQLiteProgram supportSQLiteProgram, @m Object[] objArr) {
        Companion.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@l SupportSQLiteProgram statement) {
        l0.p(statement, "statement");
        Companion.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @l
    public String getSql() {
        return this.query;
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "index", "arg", "Lkotlin/r2;", "bind", "", "bindArgs", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @u3.m
        public final void bind(@l SupportSQLiteProgram statement, @m Object[] objArr) {
            l0.p(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i5 = 0;
            while (i5 < length) {
                Object obj = objArr[i5];
                i5++;
                bind(statement, i5, obj);
            }
        }

        private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i5, Object obj) {
            if (obj == null) {
                supportSQLiteProgram.bindNull(i5);
                return;
            }
            if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i5, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                supportSQLiteProgram.bindDouble(i5, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                supportSQLiteProgram.bindDouble(i5, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                supportSQLiteProgram.bindLong(i5, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                supportSQLiteProgram.bindLong(i5, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                supportSQLiteProgram.bindLong(i5, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                supportSQLiteProgram.bindLong(i5, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                supportSQLiteProgram.bindString(i5, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                supportSQLiteProgram.bindLong(i5, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i5 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(@l String query) {
        this(query, null);
        l0.p(query, "query");
    }
}
