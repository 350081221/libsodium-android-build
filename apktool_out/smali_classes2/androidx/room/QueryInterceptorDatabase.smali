.class public final Landroidx/room/QueryInterceptorDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/sqlite/db/SupportSQLiteDatabase;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010:\u001a\u00020\u0001\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u00a2\u0006\u0004\u0008]\u0010^J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0008\u0018\u00010\u0007H\u0096\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\r\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0014\u0008\u0001\u0010\u0011\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0008\u0018\u00010\u0007H\u0096\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u000eH\u0096\u0001J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0097\u0001J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0096\u0001JF\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0008\u0018\u00010\u0007H\u0096\u0001\u00a2\u0006\u0004\u0008%\u0010&J\t\u0010\'\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0008\u0010+\u001a\u00020\u0002H\u0016J\u0008\u0010,\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0008\u00101\u001a\u00020\u0002H\u0016J\u0008\u00102\u001a\u00020\u0002H\u0016J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u0004H\u0016J)\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u00042\u0010\u0010\u0011\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00080\u0007H\u0016\u00a2\u0006\u0004\u00083\u00105J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u000206H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00103\u001a\u0002062\u0008\u00108\u001a\u0004\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J)\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0011\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00080\u0007H\u0016\u00a2\u0006\u0004\u00089\u0010\u0013R\u0014\u0010:\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR(\u0010F\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040C\u0018\u00010B8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0014\u0010G\u001a\u00020\u000e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u0014\u0010I\u001a\u00020\u000e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010HR\u0014\u0010J\u001a\u00020\u000e8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010HR\u0014\u0010K\u001a\u00020\u000e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010HR\u0014\u0010L\u001a\u00020\u000e8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010HR\u0014\u0010M\u001a\u00020\u000e8WX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010HR\u0014\u0010P\u001a\u00020\u00188\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010OR\u001c\u0010T\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u0008Q\u0010O\"\u0004\u0008R\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010VR\u001c\u0010\\\u001a\u00020\n8\u0016@\u0016X\u0096\u000f\u00a2\u0006\u000c\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010[\u00a8\u0006_"
    }
    d2 = {
        "Landroidx/room/QueryInterceptorDatabase;",
        "Landroidx/sqlite/db/SupportSQLiteDatabase;",
        "Lkotlin/r2;",
        "close",
        "",
        "table",
        "whereClause",
        "",
        "",
        "whereArgs",
        "",
        "delete",
        "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I",
        "disableWriteAheadLogging",
        "",
        "enableWriteAheadLogging",
        "sql",
        "bindArgs",
        "execPerConnectionSQL",
        "(Ljava/lang/String;[Ljava/lang/Object;)V",
        "inTransaction",
        "conflictAlgorithm",
        "Landroid/content/ContentValues;",
        "values",
        "",
        "insert",
        "newVersion",
        "needUpgrade",
        "enabled",
        "setForeignKeyConstraintsEnabled",
        "Ljava/util/Locale;",
        "locale",
        "setLocale",
        "cacheSize",
        "setMaxSqlCacheSize",
        "numBytes",
        "setMaximumSize",
        "update",
        "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I",
        "yieldIfContendedSafely",
        "sleepAfterYieldDelayMillis",
        "Landroidx/sqlite/db/SupportSQLiteStatement;",
        "compileStatement",
        "beginTransaction",
        "beginTransactionNonExclusive",
        "Landroid/database/sqlite/SQLiteTransactionListener;",
        "transactionListener",
        "beginTransactionWithListener",
        "beginTransactionWithListenerNonExclusive",
        "endTransaction",
        "setTransactionSuccessful",
        "query",
        "Landroid/database/Cursor;",
        "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;",
        "Landroidx/sqlite/db/SupportSQLiteQuery;",
        "Landroid/os/CancellationSignal;",
        "cancellationSignal",
        "execSQL",
        "delegate",
        "Landroidx/sqlite/db/SupportSQLiteDatabase;",
        "Ljava/util/concurrent/Executor;",
        "queryCallbackExecutor",
        "Ljava/util/concurrent/Executor;",
        "Landroidx/room/RoomDatabase$QueryCallback;",
        "queryCallback",
        "Landroidx/room/RoomDatabase$QueryCallback;",
        "",
        "Landroid/util/Pair;",
        "getAttachedDbs",
        "()Ljava/util/List;",
        "attachedDbs",
        "isDatabaseIntegrityOk",
        "()Z",
        "isDbLockedByCurrentThread",
        "isExecPerConnectionSQLSupported",
        "isOpen",
        "isReadOnly",
        "isWriteAheadLoggingEnabled",
        "getMaximumSize",
        "()J",
        "maximumSize",
        "getPageSize",
        "setPageSize",
        "(J)V",
        "pageSize",
        "getPath",
        "()Ljava/lang/String;",
        "path",
        "getVersion",
        "()I",
        "setVersion",
        "(I)V",
        "version",
        "<init>",
        "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"
    }
.end annotation


# instance fields
.field private final delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final queryCallback:Landroidx/room/RoomDatabase$QueryCallback;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final queryCallbackExecutor:Ljava/util/concurrent/Executor;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V
    .locals 1
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/room/RoomDatabase$QueryCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "queryCallbackExecutor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "queryCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 20
    .line 21
    iput-object p2, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    iput-object p3, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static synthetic A(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->beginTransactionNonExclusive$lambda$1(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method public static synthetic a(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/QueryInterceptorDatabase;->query$lambda$8(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V

    return-void
.end method

.method public static synthetic b(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->beginTransactionWithListener$lambda$2(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method private static final beginTransaction$lambda$0(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "BEGIN EXCLUSIVE TRANSACTION"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final beginTransactionNonExclusive$lambda$1(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "BEGIN DEFERRED TRANSACTION"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final beginTransactionWithListener$lambda$2(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "BEGIN EXCLUSIVE TRANSACTION"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final beginTransactionWithListenerNonExclusive$lambda$3(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "BEGIN DEFERRED TRANSACTION"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic c(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->beginTransaction$lambda$0(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method public static synthetic d(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/QueryInterceptorDatabase;->query$lambda$7(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final endTransaction$lambda$4(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "END TRANSACTION"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final execSQL$lambda$10(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$sql"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 13
    .line 14
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0, p1, v0}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private static final execSQL$lambda$12(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$sql"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "$inputArguments"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 18
    .line 19
    invoke-interface {p0, p1, p2}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static synthetic h(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->beginTransactionWithListenerNonExclusive$lambda$3(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method public static synthetic j(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/QueryInterceptorDatabase;->execSQL$lambda$12(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic m(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->endTransaction$lambda$4(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method public static synthetic o(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 0

    invoke-static {p0}, Landroidx/room/QueryInterceptorDatabase;->setTransactionSuccessful$lambda$5(Landroidx/room/QueryInterceptorDatabase;)V

    return-void
.end method

.method public static synthetic p(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/QueryInterceptorDatabase;->execSQL$lambda$10(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic q(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/QueryInterceptorDatabase;->query$lambda$9(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V

    return-void
.end method

.method private static final query$lambda$6(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$query"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 13
    .line 14
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0, p1, v0}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private static final query$lambda$7(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$query"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "$bindArgs"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 18
    .line 19
    invoke-static {p2}, Lkotlin/collections/l;->Jy([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p0, p1, p2}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private static final query$lambda$8(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$query"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "$queryInterceptorProgram"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/sqlite/db/SupportSQLiteQuery;->getSql()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, Landroidx/room/QueryInterceptorProgram;->getBindArgsCache$room_runtime_release()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p0, p1, p2}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private static final query$lambda$9(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$query"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "$queryInterceptorProgram"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/sqlite/db/SupportSQLiteQuery;->getSql()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, Landroidx/room/QueryInterceptorProgram;->getBindArgsCache$room_runtime_release()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p0, p1, p2}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private static final setTransactionSuccessful$lambda$5(Landroidx/room/QueryInterceptorDatabase;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 8
    .line 9
    const-string v0, "TRANSACTION SUCCESSFUL"

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p0, v0, v1}, Landroidx/room/RoomDatabase$QueryCallback;->onQuery(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic y(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/QueryInterceptorDatabase;->query$lambda$6(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public beginTransaction()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/o;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/room/o;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->beginTransaction()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public beginTransactionNonExclusive()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/g;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/room/g;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->beginTransactionNonExclusive()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteTransactionListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string/jumbo v0, "transactionListener"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    new-instance v1, Landroidx/room/i;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Landroidx/room/i;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public beginTransactionWithListenerNonExclusive(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteTransactionListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string/jumbo v0, "transactionListener"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    new-instance v1, Landroidx/room/m;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Landroidx/room/m;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->beginTransactionWithListenerNonExclusive(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "sql"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/QueryInterceptorStatement;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallback:Landroidx/room/RoomDatabase$QueryCallback;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1, v2, v3}, Landroidx/room/QueryInterceptorStatement;-><init>(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
.end method

.method public delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2, p3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public disableWriteAheadLogging()V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->disableWriteAheadLogging()V

    return-void
.end method

.method public enableWriteAheadLogging()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->enableWriteAheadLogging()Z

    move-result v0

    return v0
.end method

.method public endTransaction()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/q;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/room/q;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->endTransaction()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public execPerConnectionSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "ArrayReturn"
            }
        .end annotation

        .annotation build Lp4/m;
        .end annotation
    .end param

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execPerConnectionSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public execSQL(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/h;

    invoke-direct {v1, p0, p1}, Landroidx/room/h;-><init>(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    instance-of v1, v0, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lkotlin/collections/u;->i()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p2}, Lkotlin/collections/u;->p0(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-static {v0}, Lkotlin/collections/u;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 4
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/s;

    invoke-direct {v1, p0, p1, p2}, Landroidx/room/s;-><init>(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    check-cast p2, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    invoke-interface {p2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 7
    instance-of v1, v0, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v1, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, p1, p2}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getAttachedDbs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMaximumSize()J
    .locals 2

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->getMaximumSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPageSize()J
    .locals 2

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->getPageSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->getVersion()I

    move-result v0

    return v0
.end method

.method public inTransaction()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->inTransaction()Z

    move-result v0

    return v0
.end method

.method public insert(Ljava/lang/String;ILandroid/content/ContentValues;)J
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/content/ContentValues;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "values"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2, p3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide p1

    return-wide p1
.end method

.method public isDatabaseIntegrityOk()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isDatabaseIntegrityOk()Z

    move-result v0

    return v0
.end method

.method public isDbLockedByCurrentThread()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isDbLockedByCurrentThread()Z

    move-result v0

    return v0
.end method

.method public isExecPerConnectionSQLSupported()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isExecPerConnectionSQLSupported()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isReadOnly()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isReadOnly()Z

    move-result v0

    return v0
.end method

.method public isWriteAheadLoggingEnabled()Z
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    move-result v0

    return v0
.end method

.method public needUpgrade(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->needUpgrade(I)Z

    move-result p1

    return p1
.end method

.method public query(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;
    .locals 3
    .param p1    # Landroidx/sqlite/db/SupportSQLiteQuery;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Landroidx/room/QueryInterceptorProgram;

    invoke-direct {v0}, Landroidx/room/QueryInterceptorProgram;-><init>()V

    .line 6
    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteQuery;->bindTo(Landroidx/sqlite/db/SupportSQLiteProgram;)V

    .line 7
    iget-object v1, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/room/n;

    invoke-direct {v2, p0, p1, v0}, Landroidx/room/n;-><init>(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 8
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public query(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 2
    .param p1    # Landroidx/sqlite/db/SupportSQLiteQuery;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/os/CancellationSignal;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string p2, "query"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance p2, Landroidx/room/QueryInterceptorProgram;

    invoke-direct {p2}, Landroidx/room/QueryInterceptorProgram;-><init>()V

    .line 10
    invoke-interface {p1, p2}, Landroidx/sqlite/db/SupportSQLiteQuery;->bindTo(Landroidx/sqlite/db/SupportSQLiteProgram;)V

    .line 11
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/j;

    invoke-direct {v1, p0, p1, p2}, Landroidx/room/j;-><init>(Landroidx/room/QueryInterceptorDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/QueryInterceptorProgram;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    iget-object p2, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {p2, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public query(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/p;

    invoke-direct {v1, p0, p1}, Landroidx/room/p;-><init>(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public query(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/k;

    invoke-direct {v1, p0, p1, p2}, Landroidx/room/k;-><init>(Landroidx/room/QueryInterceptorDatabase;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public setForeignKeyConstraintsEnabled(Z)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setForeignKeyConstraintsEnabled(Z)V

    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 1
    .param p1    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setLocale(Ljava/util/Locale;)V

    return-void
.end method

.method public setMaxSqlCacheSize(I)V
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setMaxSqlCacheSize(I)V

    return-void
.end method

.method public setMaximumSize(J)J
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setMaximumSize(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public setPageSize(J)V
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setPageSize(J)V

    return-void
.end method

.method public setTransactionSuccessful()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->queryCallbackExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/l;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/room/l;-><init>(Landroidx/room/QueryInterceptorDatabase;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setTransactionSuccessful()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public setVersion(I)V
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->setVersion(I)V

    return-void
.end method

.method public update(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/content/ContentValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "values"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Landroidx/sqlite/db/SupportSQLiteDatabase;->update(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public yieldIfContendedSafely()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->yieldIfContendedSafely()Z

    move-result v0

    return v0
.end method

.method public yieldIfContendedSafely(J)Z
    .locals 1

    iget-object v0, p0, Landroidx/room/QueryInterceptorDatabase;->delegate:Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-interface {v0, p1, p2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->yieldIfContendedSafely(J)Z

    move-result p1

    return p1
.end method
