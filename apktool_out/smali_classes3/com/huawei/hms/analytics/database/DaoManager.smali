.class public Lcom/huawei/hms/analytics/database/DaoManager;
.super Lorg/greenrobot/greendao/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/database/DaoManager$lmn;,
        Lcom/huawei/hms/analytics/database/DaoManager$klm;
    }
.end annotation


# static fields
.field public static final SCHEMA_VERSION:I = 0x2


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    new-instance v0, Lorg/greenrobot/greendao/database/f;

    invoke-direct {v0, p1}, Lorg/greenrobot/greendao/database/f;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/database/DaoManager;-><init>(Lorg/greenrobot/greendao/database/a;)V

    return-void
.end method

.method public constructor <init>(Lorg/greenrobot/greendao/database/a;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lorg/greenrobot/greendao/b;-><init>(Lorg/greenrobot/greendao/database/a;I)V

    const-class p1, Lcom/huawei/hms/analytics/database/APIEventDao;

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/b;->registerDaoClass(Ljava/lang/Class;)V

    const-class p1, Lcom/huawei/hms/analytics/database/EventDao;

    invoke-virtual {p0, p1}, Lorg/greenrobot/greendao/b;->registerDaoClass(Ljava/lang/Class;)V

    return-void
.end method

.method public static createAPIEventTable(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/APIEventDao;->createTable(Lorg/greenrobot/greendao/database/a;Z)V

    return-void
.end method

.method public static createAllTables(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/APIEventDao;->createTable(Lorg/greenrobot/greendao/database/a;Z)V

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/EventDao;->createTable(Lorg/greenrobot/greendao/database/a;Z)V

    return-void
.end method

.method public static createEventTable(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/EventDao;->createTable(Lorg/greenrobot/greendao/database/a;Z)V

    return-void
.end method

.method public static dropAllTables(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/APIEventDao;->dropTable(Lorg/greenrobot/greendao/database/a;Z)V

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/database/EventDao;->dropTable(Lorg/greenrobot/greendao/database/a;Z)V

    return-void
.end method

.method public static newDevSession(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/database/DaoSession;
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/database/DaoManager$lmn;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hms/analytics/database/DaoManager$lmn;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/greenrobot/greendao/database/b;->getWritableDb()Lorg/greenrobot/greendao/database/a;

    move-result-object p0

    new-instance p1, Lcom/huawei/hms/analytics/database/DaoManager;

    invoke-direct {p1, p0}, Lcom/huawei/hms/analytics/database/DaoManager;-><init>(Lorg/greenrobot/greendao/database/a;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/DaoManager;->newSession()Lcom/huawei/hms/analytics/database/DaoSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public newSession()Lcom/huawei/hms/analytics/database/DaoSession;
    .locals 4

    new-instance v0, Lcom/huawei/hms/analytics/database/DaoSession;

    iget-object v1, p0, Lorg/greenrobot/greendao/b;->db:Lorg/greenrobot/greendao/database/a;

    sget-object v2, Lo4/d;->Session:Lo4/d;

    iget-object v3, p0, Lorg/greenrobot/greendao/b;->daoConfigMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/database/DaoSession;-><init>(Lorg/greenrobot/greendao/database/a;Lo4/d;Ljava/util/Map;)V

    return-object v0
.end method

.method public newSession(Lo4/d;)Lcom/huawei/hms/analytics/database/DaoSession;
    .locals 3

    new-instance v0, Lcom/huawei/hms/analytics/database/DaoSession;

    iget-object v1, p0, Lorg/greenrobot/greendao/b;->db:Lorg/greenrobot/greendao/database/a;

    iget-object v2, p0, Lorg/greenrobot/greendao/b;->daoConfigMap:Ljava/util/Map;

    invoke-direct {v0, v1, p1, v2}, Lcom/huawei/hms/analytics/database/DaoSession;-><init>(Lorg/greenrobot/greendao/database/a;Lo4/d;Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic newSession()Lorg/greenrobot/greendao/c;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/database/DaoManager;->newSession()Lcom/huawei/hms/analytics/database/DaoSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newSession(Lo4/d;)Lorg/greenrobot/greendao/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/database/DaoManager;->newSession(Lo4/d;)Lcom/huawei/hms/analytics/database/DaoSession;

    move-result-object p1

    return-object p1
.end method
