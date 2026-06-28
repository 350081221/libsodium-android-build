.class public interface abstract Landroidx/sqlite/db/SupportSQLiteDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\u0008\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0008\u0010\r\u001a\u00020\u0006H&J\u0008\u0010\u000e\u001a\u00020\u0006H&J\u0008\u0010\u0010\u001a\u00020\u000fH&J\u0008\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&J-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0016\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H&J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0010\u0010\u0016\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00150\u0014H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001dJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001eH&J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001e2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\'J \u0010&\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H&J5\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0008\u0010\'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H&\u00a2\u0006\u0004\u0008)\u0010*JE\u0010+\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0008\u0010\'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H&\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0016\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00150\u0014H&\u00a2\u0006\u0004\u0008-\u0010\u0018J\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\"H&J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H&J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\"H&J\u0010\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000fH\'J\u0008\u00107\u001a\u00020\u000fH&J\u0008\u00108\u001a\u00020\u0006H\'R\u0014\u00109\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:R\u0014\u0010;\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010:R\u001c\u0010@\u001a\u00020\"8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\u0014\u0010C\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u001c\u0010G\u001a\u00020\u00128&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008D\u0010B\"\u0004\u0008E\u0010FR\u0014\u0010H\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010:R\u0014\u0010I\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010:R\u0016\u0010L\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR\u0014\u0010M\u001a\u00020\u000f8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010:R(\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020O\u0018\u00010N8fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u0014\u0010S\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010:\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006T\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/sqlite/db/SupportSQLiteDatabase;",
        "Ljava/io/Closeable;",
        "",
        "sql",
        "Landroidx/sqlite/db/SupportSQLiteStatement;",
        "compileStatement",
        "Lkotlin/r2;",
        "beginTransaction",
        "beginTransactionNonExclusive",
        "Landroid/database/sqlite/SQLiteTransactionListener;",
        "transactionListener",
        "beginTransactionWithListener",
        "beginTransactionWithListenerNonExclusive",
        "endTransaction",
        "setTransactionSuccessful",
        "",
        "inTransaction",
        "yieldIfContendedSafely",
        "",
        "sleepAfterYieldDelayMillis",
        "",
        "",
        "bindArgs",
        "execPerConnectionSQL",
        "(Ljava/lang/String;[Ljava/lang/Object;)V",
        "numBytes",
        "setMaximumSize",
        "query",
        "Landroid/database/Cursor;",
        "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;",
        "Landroidx/sqlite/db/SupportSQLiteQuery;",
        "Landroid/os/CancellationSignal;",
        "cancellationSignal",
        "table",
        "",
        "conflictAlgorithm",
        "Landroid/content/ContentValues;",
        "values",
        "insert",
        "whereClause",
        "whereArgs",
        "delete",
        "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I",
        "update",
        "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I",
        "execSQL",
        "newVersion",
        "needUpgrade",
        "Ljava/util/Locale;",
        "locale",
        "setLocale",
        "cacheSize",
        "setMaxSqlCacheSize",
        "enabled",
        "setForeignKeyConstraintsEnabled",
        "enableWriteAheadLogging",
        "disableWriteAheadLogging",
        "isDbLockedByCurrentThread",
        "()Z",
        "isExecPerConnectionSQLSupported",
        "getVersion",
        "()I",
        "setVersion",
        "(I)V",
        "version",
        "getMaximumSize",
        "()J",
        "maximumSize",
        "getPageSize",
        "setPageSize",
        "(J)V",
        "pageSize",
        "isReadOnly",
        "isOpen",
        "getPath",
        "()Ljava/lang/String;",
        "path",
        "isWriteAheadLoggingEnabled",
        "",
        "Landroid/util/Pair;",
        "getAttachedDbs",
        "()Ljava/util/List;",
        "attachedDbs",
        "isDatabaseIntegrityOk",
        "sqlite_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract beginTransaction()V
.end method

.method public abstract beginTransactionNonExclusive()V
.end method

.method public abstract beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .param p1    # Landroid/database/sqlite/SQLiteTransactionListener;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract beginTransactionWithListenerNonExclusive(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .param p1    # Landroid/database/sqlite/SQLiteTransactionListener;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
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
.end method

.method public abstract disableWriteAheadLogging()V
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation
.end method

.method public abstract enableWriteAheadLogging()Z
.end method

.method public abstract endTransaction()V
.end method

.method public execPerConnectionSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0
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

    .line 1
    const-string p2, "sql"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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

.method public abstract execSQL(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract getAttachedDbs()Ljava/util/List;
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
.end method

.method public abstract getMaximumSize()J
.end method

.method public abstract getPageSize()J
.end method

.method public abstract getPath()Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getVersion()I
.end method

.method public abstract inTransaction()Z
.end method

.method public abstract insert(Ljava/lang/String;ILandroid/content/ContentValues;)J
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroid/content/ContentValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract isDatabaseIntegrityOk()Z
.end method

.method public abstract isDbLockedByCurrentThread()Z
.end method

.method public isExecPerConnectionSQLSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract isOpen()Z
.end method

.method public abstract isReadOnly()Z
.end method

.method public abstract isWriteAheadLoggingEnabled()Z
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation
.end method

.method public abstract needUpgrade(I)Z
.end method

.method public abstract query(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;
    .param p1    # Landroidx/sqlite/db/SupportSQLiteQuery;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract query(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .param p1    # Landroidx/sqlite/db/SupportSQLiteQuery;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/os/CancellationSignal;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract query(Ljava/lang/String;)Landroid/database/Cursor;
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract query(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
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
.end method

.method public abstract setForeignKeyConstraintsEnabled(Z)V
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x10
    .end annotation
.end method

.method public abstract setLocale(Ljava/util/Locale;)V
    .param p1    # Ljava/util/Locale;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract setMaxSqlCacheSize(I)V
.end method

.method public abstract setMaximumSize(J)J
.end method

.method public abstract setPageSize(J)V
.end method

.method public abstract setTransactionSuccessful()V
.end method

.method public abstract setVersion(I)V
.end method

.method public abstract update(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I
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
.end method

.method public abstract yieldIfContendedSafely()Z
.end method

.method public abstract yieldIfContendedSafely(J)Z
.end method
