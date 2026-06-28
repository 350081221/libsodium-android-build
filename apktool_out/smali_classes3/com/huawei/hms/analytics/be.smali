.class public final Lcom/huawei/hms/analytics/be;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static klm:Lcom/huawei/hms/analytics/be;


# instance fields
.field public final lmn:Lcom/huawei/hms/analytics/bf;


# direct methods
.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/database/LogEventDaoManager$lmn;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v2, "ha_levt.db"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/database/LogEventDaoManager$lmn;-><init>(Landroid/content/Context;Ljava/lang/String;B)V

    new-instance v1, Lcom/huawei/hms/analytics/database/LogEventDaoManager;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/database/LogEventDaoManager;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/database/LogEventDaoManager;->newSession()Lcom/huawei/hms/analytics/bf;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/huawei/hms/analytics/bc$lmn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/bc$lmn;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static declared-synchronized hij()V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/be;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/huawei/hms/analytics/be;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/be;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/be;->klm:Lcom/huawei/hms/analytics/be;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static lmn()Lcom/huawei/hms/analytics/be;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/be;->klm:Lcom/huawei/hms/analytics/be;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/be;->hij()V

    :cond_0
    sget-object v0, Lcom/huawei/hms/analytics/be;->klm:Lcom/huawei/hms/analytics/be;

    return-object v0
.end method


# virtual methods
.method public final ijk()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->deleteAll()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bf;->lmn()V

    return-void
.end method

.method public final ikl()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->deleteAll()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->deleteAll()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bf;->lmn()V

    return-void
.end method

.method public final klm()J
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {v0}, Lorg/greenrobot/greendao/a;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final klm(Lcom/huawei/hms/analytics/database/LogConfig;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->update(Ljava/lang/Object;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/database/LogConfig;)J
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->insert(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final lmn(Lcom/huawei/hms/analytics/database/LogEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->insert(Ljava/lang/Object;)J

    return-void
.end method

.method public final lmn(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {v0, p1}, Lorg/greenrobot/greendao/a;->deleteByKeyInTx(Ljava/lang/Iterable;)V

    return-void
.end method
