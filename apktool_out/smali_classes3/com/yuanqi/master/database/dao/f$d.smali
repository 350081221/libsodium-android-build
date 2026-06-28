.class Lcom/yuanqi/master/database/dao/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/dao/f;->b(Lv2/c;)Lio/reactivex/rxjava3/core/c;
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
.field final synthetic a:Lv2/c;

.field final synthetic b:Lcom/yuanqi/master/database/dao/f;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/dao/f;Lv2/c;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    iput-object p2, p0, Lcom/yuanqi/master/database/dao/f$d;->a:Lv2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->f(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/EntityInsertionAdapter;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$d;->a:Lv2/c;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return-object v0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    iget-object v1, p0, Lcom/yuanqi/master/database/dao/f$d;->b:Lcom/yuanqi/master/database/dao/f;

    .line 43
    .line 44
    invoke-static {v1}, Lcom/yuanqi/master/database/dao/f;->e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 49
    .line 50
    .line 51
    throw v0
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

    invoke-virtual {p0}, Lcom/yuanqi/master/database/dao/f$d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
