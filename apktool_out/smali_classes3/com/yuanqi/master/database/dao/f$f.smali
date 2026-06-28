.class Lcom/yuanqi/master/database/dao/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/dao/f;->deleteAll()Lio/reactivex/rxjava3/core/c;
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
.field final synthetic a:Lcom/yuanqi/master/database/dao/f;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/dao/f;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

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
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->h(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

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
    :try_start_0
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_2
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 33
    .line 34
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 42
    .line 43
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->h(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    :try_start_3
    iget-object v2, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 54
    .line 55
    invoke-static {v2}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 60
    .line 61
    .line 62
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    iget-object v2, p0, Lcom/yuanqi/master/database/dao/f$f;->a:Lcom/yuanqi/master/database/dao/f;

    .line 65
    .line 66
    invoke-static {v2}, Lcom/yuanqi/master/database/dao/f;->h(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 71
    .line 72
    .line 73
    throw v1
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

    invoke-virtual {p0}, Lcom/yuanqi/master/database/dao/f$f;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
