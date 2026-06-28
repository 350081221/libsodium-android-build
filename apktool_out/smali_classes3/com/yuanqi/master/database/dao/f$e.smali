.class Lcom/yuanqi/master/database/dao/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/dao/f;->c(Ljava/lang/String;)Lio/reactivex/rxjava3/core/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/yuanqi/master/database/dao/f;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/dao/f;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    iput-object p2, p0, Lcom/yuanqi/master/database/dao/f$e;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->g(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$e;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindNull(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {v0, v2, v1}, Landroidx/sqlite/db/SupportSQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_2
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 54
    .line 55
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->g(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    return-object v0

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    :try_start_3
    iget-object v2, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 66
    .line 67
    invoke-static {v2}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 72
    .line 73
    .line 74
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    :catchall_1
    move-exception v1

    .line 76
    iget-object v2, p0, Lcom/yuanqi/master/database/dao/f$e;->b:Lcom/yuanqi/master/database/dao/f;

    .line 77
    .line 78
    invoke-static {v2}, Lcom/yuanqi/master/database/dao/f;->g(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 83
    .line 84
    .line 85
    throw v1
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
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/database/dao/f$e;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
