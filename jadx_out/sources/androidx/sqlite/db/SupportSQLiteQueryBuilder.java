package androidx.sqlite.db;

import java.util.regex.Pattern;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J'\u0010\u000b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0000J\u001f\u0010\n\u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\"\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "name", "clause", "Lkotlin/r2;", "appendClause", "", "columns", "appendColumns", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)V", "distinct", "([Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "selection", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "groupBy", "having", "orderBy", "limit", "Landroidx/sqlite/db/SupportSQLiteQuery;", "create", "table", "Ljava/lang/String;", "", "Z", "[Ljava/lang/String;", "[Ljava/lang/Object;", "<init>", "(Ljava/lang/String;)V", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes2.dex */
public final class SupportSQLiteQueryBuilder {

    @l
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    @m
    private Object[] bindArgs;

    @m
    private String[] columns;
    private boolean distinct;

    @m
    private String groupBy;

    @m
    private String having;

    @m
    private String limit;

    @m
    private String orderBy;

    @m
    private String selection;

    @l
    private final String table;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "()V", "limitPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "builder", "Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "tableName", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final SupportSQLiteQueryBuilder builder(@l String tableName) {
            l0.p(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, w wVar) {
        this(str);
    }

    private final void appendClause(StringBuilder sb, String str, String str2) {
        boolean z4;
        if (str2 != null && str2.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            sb.append(str);
            sb.append(str2);
        }
    }

    private final void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr[i5];
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    @l
    @u3.m
    public static final SupportSQLiteQueryBuilder builder(@l String str) {
        return Companion.builder(str);
    }

    @l
    public final SupportSQLiteQueryBuilder columns(@m String[] strArr) {
        this.columns = strArr;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r4 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.sqlite.db.SupportSQLiteQuery create() {
        /*
            r5 = this;
            java.lang.String r0 = r5.groupBy
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L25
            java.lang.String r0 = r5.having
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L96
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 120(0x78, float:1.68E-43)
            r0.<init>(r3)
            java.lang.String r3 = "SELECT "
            r0.append(r3)
            boolean r3 = r5.distinct
            if (r3 == 0) goto L3d
            java.lang.String r3 = "DISTINCT "
            r0.append(r3)
        L3d:
            java.lang.String[] r3 = r5.columns
            if (r3 == 0) goto L49
            int r4 = r3.length
            if (r4 != 0) goto L46
            r4 = r2
            goto L47
        L46:
            r4 = r1
        L47:
            if (r4 == 0) goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 != 0) goto L53
            kotlin.jvm.internal.l0.m(r3)
            r5.appendColumns(r0, r3)
            goto L58
        L53:
            java.lang.String r1 = "* "
            r0.append(r1)
        L58:
            java.lang.String r1 = "FROM "
            r0.append(r1)
            java.lang.String r1 = r5.table
            r0.append(r1)
            java.lang.String r1 = " WHERE "
            java.lang.String r2 = r5.selection
            r5.appendClause(r0, r1, r2)
            java.lang.String r1 = " GROUP BY "
            java.lang.String r2 = r5.groupBy
            r5.appendClause(r0, r1, r2)
            java.lang.String r1 = " HAVING "
            java.lang.String r2 = r5.having
            r5.appendClause(r0, r1, r2)
            java.lang.String r1 = " ORDER BY "
            java.lang.String r2 = r5.orderBy
            r5.appendClause(r0, r1, r2)
            java.lang.String r1 = " LIMIT "
            java.lang.String r2 = r5.limit
            r5.appendClause(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.l0.o(r0, r1)
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.Object[] r2 = r5.bindArgs
            r1.<init>(r0, r2)
            return r1
        L96:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HAVING clauses are only permitted when using a groupBy clause"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteQueryBuilder.create():androidx.sqlite.db.SupportSQLiteQuery");
    }

    @l
    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder groupBy(@m String str) {
        this.groupBy = str;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder having(@m String str) {
        this.having = str;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder limit(@l String limit) {
        boolean z4;
        l0.p(limit, "limit");
        boolean matches = limitPattern.matcher(limit).matches();
        boolean z5 = true;
        if (limit.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && !matches) {
            z5 = false;
        }
        if (z5) {
            this.limit = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @l
    public final SupportSQLiteQueryBuilder orderBy(@m String str) {
        this.orderBy = str;
        return this;
    }

    @l
    public final SupportSQLiteQueryBuilder selection(@m String str, @m Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }
}
