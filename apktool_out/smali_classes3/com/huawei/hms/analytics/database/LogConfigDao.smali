.class public Lcom/huawei/hms/analytics/database/LogConfigDao;
.super Lorg/greenrobot/greendao/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/database/LogConfigDao$Properties;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/greenrobot/greendao/a<",
        "Lcom/huawei/hms/analytics/database/LogConfig;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field public static final TABLENAME:Ljava/lang/String; = "ha_lgcf"


# direct methods
.method public constructor <init>(Lorg/greenrobot/greendao/internal/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/greenrobot/greendao/a;-><init>(Lorg/greenrobot/greendao/internal/a;)V

    return-void
.end method

.method public constructor <init>(Lorg/greenrobot/greendao/internal/a;Lcom/huawei/hms/analytics/bf;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/greenrobot/greendao/a;-><init>(Lorg/greenrobot/greendao/internal/a;Lorg/greenrobot/greendao/c;)V

    return-void
.end method

.method public static createTable(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 2

    if-eqz p1, :cond_0

    const-string p1, "IF NOT EXISTS "

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"ha_lgcf\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"_eg\" TEXT,\"lg_pid\" TEXT,\"lg_gid\" TEXT,\"lg_sid\" TEXT,\"lg_tag\" TEXT);"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lorg/greenrobot/greendao/database/a;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public static dropTable(Lorg/greenrobot/greendao/database/a;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DROP TABLE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p1, "IF EXISTS "

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"ha_lgcf\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lorg/greenrobot/greendao/database/a;->execSQL(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final bindValues(Landroid/database/sqlite/SQLiteStatement;Lcom/huawei/hms/analytics/database/LogConfig;)V
    .locals 4

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    :cond_0
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getRegion()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    :cond_2
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    :cond_4
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogTags()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    :cond_5
    return-void
.end method

.method protected bridge synthetic bindValues(Landroid/database/sqlite/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/analytics/database/LogConfigDao;->bindValues(Landroid/database/sqlite/SQLiteStatement;Lcom/huawei/hms/analytics/database/LogConfig;)V

    return-void
.end method

.method protected final bindValues(Lorg/greenrobot/greendao/database/c;Lcom/huawei/hms/analytics/database/LogConfig;)V
    .locals 4

    invoke-interface {p1}, Lorg/greenrobot/greendao/database/c;->clearBindings()V

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lorg/greenrobot/greendao/database/c;->bindLong(IJ)V

    :cond_0
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getRegion()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    invoke-interface {p1, v1, v0}, Lorg/greenrobot/greendao/database/c;->bindString(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Lorg/greenrobot/greendao/database/c;->bindString(ILjava/lang/String;)V

    :cond_2
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    invoke-interface {p1, v1, v0}, Lorg/greenrobot/greendao/database/c;->bindString(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v1, 0x5

    invoke-interface {p1, v1, v0}, Lorg/greenrobot/greendao/database/c;->bindString(ILjava/lang/String;)V

    :cond_4
    invoke-virtual {p2}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogTags()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 v0, 0x6

    invoke-interface {p1, v0, p2}, Lorg/greenrobot/greendao/database/c;->bindString(ILjava/lang/String;)V

    :cond_5
    return-void
.end method

.method protected bridge synthetic bindValues(Lorg/greenrobot/greendao/database/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/analytics/database/LogConfigDao;->bindValues(Lorg/greenrobot/greendao/database/c;Lcom/huawei/hms/analytics/database/LogConfig;)V

    return-void
.end method

.method public getKey(Lcom/huawei/hms/analytics/database/LogConfig;)Ljava/lang/Long;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic getKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/database/LogConfigDao;->getKey(Lcom/huawei/hms/analytics/database/LogConfig;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public hasKey(Lcom/huawei/hms/analytics/database/LogConfig;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic hasKey(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/database/LogConfigDao;->hasKey(Lcom/huawei/hms/analytics/database/LogConfig;)Z

    move-result p1

    return p1
.end method

.method protected final isEntityUpdateable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public readEntity(Landroid/database/Cursor;I)Lcom/huawei/hms/analytics/database/LogConfig;
    .locals 8

    new-instance v7, Lcom/huawei/hms/analytics/database/LogConfig;

    add-int/lit8 v0, p2, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v1, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    :goto_1
    add-int/lit8 v0, p2, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    :goto_2
    add-int/lit8 v0, p2, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    :goto_3
    add-int/lit8 v0, p2, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    :goto_4
    add-int/lit8 p2, p2, 0x5

    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object p1, v2

    goto :goto_5

    :cond_5
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_5
    move-object v0, v7

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hms/analytics/database/LogConfig;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public bridge synthetic readEntity(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/analytics/database/LogConfigDao;->readEntity(Landroid/database/Cursor;I)Lcom/huawei/hms/analytics/database/LogConfig;

    move-result-object p1

    return-object p1
.end method

.method public readEntity(Landroid/database/Cursor;Lcom/huawei/hms/analytics/database/LogConfig;I)V
    .locals 3

    add-int/lit8 v0, p3, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setId(Ljava/lang/Long;)V

    add-int/lit8 v0, p3, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setRegion(Ljava/lang/String;)V

    add-int/lit8 v0, p3, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, v2

    goto :goto_2

    :cond_2
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setProjectId(Ljava/lang/String;)V

    add-int/lit8 v0, p3, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v0, v2

    goto :goto_3

    :cond_3
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogGroupId(Ljava/lang/String;)V

    add-int/lit8 v0, p3, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v0, v2

    goto :goto_4

    :cond_4
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogStreamId(Ljava/lang/String;)V

    add-int/lit8 p3, p3, 0x5

    invoke-interface {p1, p3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_5
    invoke-virtual {p2, v2}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogStreamId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic readEntity(Landroid/database/Cursor;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/database/LogConfigDao;->readEntity(Landroid/database/Cursor;Lcom/huawei/hms/analytics/database/LogConfig;I)V

    return-void
.end method

.method public readKey(Landroid/database/Cursor;I)Ljava/lang/Long;
    .locals 1

    add-int/lit8 p2, p2, 0x0

    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic readKey(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/analytics/database/LogConfigDao;->readKey(Landroid/database/Cursor;I)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected final updateKeyAfterInsert(Lcom/huawei/hms/analytics/database/LogConfig;J)Ljava/lang/Long;
    .locals 1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setId(Ljava/lang/Long;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic updateKeyAfterInsert(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/database/LogConfigDao;->updateKeyAfterInsert(Lcom/huawei/hms/analytics/database/LogConfig;J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
