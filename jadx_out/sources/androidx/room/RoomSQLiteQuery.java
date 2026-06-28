package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.hms.actions.SearchIntents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002<;B\u0011\b\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b9\u0010:J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010#R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010#R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010#R\u001a\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u0010#R$\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u0014\u00108\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006="}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", SearchIntents.EXTRA_QUERY, "", "initArgCount", "Lkotlin/r2;", "init", "release", "statement", "bindTo", "index", "bindNull", "", t0.b.f22420d, "bindLong", "", "bindDouble", "bindString", "", "bindBlob", ILivePush.ClickType.CLOSE, "other", "copyArgumentsFrom", "clearBindings", "capacity", "I", "getCapacity", "()I", "Ljava/lang/String;", "", "longBindings", "[J", "getLongBindings$annotations", "()V", "", "doubleBindings", "[D", "getDoubleBindings$annotations", "", "stringBindings", "[Ljava/lang/String;", "getStringBindings$annotations", "blobBindings", "[[B", "getBlobBindings$annotations", "", "bindingTypes", "[I", "getBindingTypes$annotations", "<set-?>", "argCount", "getArgCount", "getSql", "()Ljava/lang/String;", "sql", "<init>", "(I)V", "Companion", "Binding", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;

    @p4.l
    private final int[] bindingTypes;

    @p4.l
    @u3.e
    public final byte[][] blobBindings;

    @VisibleForTesting
    private final int capacity;

    @p4.l
    @u3.e
    public final double[] doubleBindings;

    @p4.l
    @u3.e
    public final long[] longBindings;

    @p4.m
    private volatile String query;

    @p4.l
    @u3.e
    public final String[] stringBindings;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    @u3.e
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    @n3.e(n3.a.SOURCE)
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Binding {
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteQuery;", "supportSQLiteQuery", "Landroidx/room/RoomSQLiteQuery;", "copyFrom", "", SearchIntents.EXTRA_QUERY, "", "argumentCount", "acquire", "Lkotlin/r2;", "prunePoolLocked$room_runtime_release", "()V", "prunePoolLocked", "BLOB", "I", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", "NULL", "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "<init>", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }

        @p4.l
        @u3.m
        public final RoomSQLiteQuery acquire(@p4.l String query, int i5) {
            l0.p(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i5));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    RoomSQLiteQuery sqliteQuery = ceilingEntry.getValue();
                    sqliteQuery.init(query, i5);
                    l0.o(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                r2 r2Var = r2.f19517a;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i5, null);
                roomSQLiteQuery.init(query, i5);
                return roomSQLiteQuery;
            }
        }

        @p4.l
        @u3.m
        public final RoomSQLiteQuery copyFrom(@p4.l SupportSQLiteQuery supportSQLiteQuery) {
            l0.p(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int i5, @p4.l byte[] value) {
                    l0.p(value, "value");
                    RoomSQLiteQuery.this.bindBlob(i5, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int i5, double d5) {
                    RoomSQLiteQuery.this.bindDouble(i5, d5);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int i5, long j5) {
                    RoomSQLiteQuery.this.bindLong(i5, j5);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int i5) {
                    RoomSQLiteQuery.this.bindNull(i5);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int i5, @p4.l String value) {
                    l0.p(value, "value");
                    RoomSQLiteQuery.this.bindString(i5, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    RoomSQLiteQuery.this.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    RoomSQLiteQuery.this.close();
                }
            });
            return acquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                l0.o(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i5 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i5;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private RoomSQLiteQuery(int i5) {
        this.capacity = i5;
        int i6 = i5 + 1;
        this.bindingTypes = new int[i6];
        this.longBindings = new long[i6];
        this.doubleBindings = new double[i6];
        this.stringBindings = new String[i6];
        this.blobBindings = new byte[i6];
    }

    public /* synthetic */ RoomSQLiteQuery(int i5, kotlin.jvm.internal.w wVar) {
        this(i5);
    }

    @p4.l
    @u3.m
    public static final RoomSQLiteQuery acquire(@p4.l String str, int i5) {
        return Companion.acquire(str, i5);
    }

    @p4.l
    @u3.m
    public static final RoomSQLiteQuery copyFrom(@p4.l SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, @p4.l byte[] value) {
        l0.p(value, "value");
        this.bindingTypes[i5] = 5;
        this.blobBindings[i5] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        this.bindingTypes[i5] = 3;
        this.doubleBindings[i5] = d5;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        this.bindingTypes[i5] = 2;
        this.longBindings[i5] = j5;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        this.bindingTypes[i5] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, @p4.l String value) {
        l0.p(value, "value");
        this.bindingTypes[i5] = 4;
        this.stringBindings[i5] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@p4.l SupportSQLiteProgram statement) {
        l0.p(statement, "statement");
        int argCount = getArgCount();
        if (1 <= argCount) {
            int i5 = 1;
            while (true) {
                int i6 = this.bindingTypes[i5];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 == 5) {
                                    byte[] bArr = this.blobBindings[i5];
                                    if (bArr != null) {
                                        statement.bindBlob(i5, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.stringBindings[i5];
                                if (str != null) {
                                    statement.bindString(i5, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            statement.bindDouble(i5, this.doubleBindings[i5]);
                        }
                    } else {
                        statement.bindLong(i5, this.longBindings[i5]);
                    }
                } else {
                    statement.bindNull(i5);
                }
                if (i5 != argCount) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void copyArgumentsFrom(@p4.l RoomSQLiteQuery other) {
        l0.p(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @p4.l
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void init(@p4.l String query, int i5) {
        l0.p(query, "query");
        this.query = query;
        this.argCount = i5;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            r2 r2Var = r2.f19517a;
        }
    }
}
