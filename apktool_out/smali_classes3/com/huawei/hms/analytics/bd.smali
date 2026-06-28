.class public final Lcom/huawei/hms/analytics/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/core/storage/IStorageHandler;


# static fields
.field private static lmn:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;


# instance fields
.field private klm:Lcom/huawei/hms/analytics/bc;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/huawei/hms/analytics/bc;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bc;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    return-void
.end method

.method private static declared-synchronized klm(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/bd;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/bd;->lmn:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/bd;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/bd;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/huawei/hms/analytics/bd;->lmn:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bd;->lmn:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/huawei/hms/analytics/bd;->klm(Landroid/content/Context;)V

    :cond_0
    sget-object p0, Lcom/huawei/hms/analytics/bd;->lmn:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    return-object p0
.end method


# virtual methods
.method public final count(Ljava/lang/String;)J
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ghi:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p1}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, p1, v1}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/greenrobot/greendao/query/k;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final deleteAll()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bc;->lmn()V

    return-void
.end method

.method public final deleteByTag(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final deleteByTagType(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final deleteEvents(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->deleteInTx(Ljava/lang/Iterable;)V

    return-void
.end method

.method public final insert(Lcom/huawei/hms/analytics/core/storage/Event;)J
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->insert(Ljava/lang/Object;)J

    move-result-wide v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p1

    const-string v0, "StorageHandler"

    const-string v1, "SQLite full exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bc;->lmn()V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final insertEx(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "StorageHandler"

    const-string v1, "SQLite full exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bc;->lmn()V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final readBySql(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    new-instance v1, Lorg/greenrobot/greendao/query/m$c;

    invoke-direct {v1, p1}, Lorg/greenrobot/greendao/query/m$c;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, p1}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final readEvents(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ghi:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p1}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, v2}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string v1, "StorageHandler"

    const-string v2, "SQLite blob too big exception"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v1, p1}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public final readEvents(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ghi:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p1}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, v3}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p2}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v1

    new-array v2, v2, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, v2}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string v1, "StorageHandler"

    const-string v2, "SQLite blob too big exception"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v1, p1, p2}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public final readEvents(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bc;->lmn:Lcom/huawei/hms/analytics/database/DaoSession;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/DaoSession;->getEventDao()Lcom/huawei/hms/analytics/database/EventDao;

    move-result-object v0

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ghi:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p1}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, v3}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    sget-object v1, Lcom/huawei/hms/analytics/database/EventDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    invoke-virtual {v1, p2}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v1

    new-array v2, v2, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v0, v1, v2}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v0

    invoke-virtual {v0, p3}, Lorg/greenrobot/greendao/query/k;->u(I)Lorg/greenrobot/greendao/query/k;

    move-result-object p3

    invoke-virtual {p3}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object p3

    invoke-virtual {p3}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object p3

    invoke-virtual {p3}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p3

    const-string v0, "StorageHandler"

    const-string v1, "SQLite blob too big exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bd;->klm:Lcom/huawei/hms/analytics/bc;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/bc;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method
