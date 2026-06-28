.class public final Lcom/umeng/cconfig/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/cconfig/a/b$a;
    }
.end annotation


# static fields
.field private static c:Landroid/database/sqlite/SQLiteOpenHelper;

.field private static d:Landroid/content/Context;


# instance fields
.field public a:Landroid/database/sqlite/SQLiteDatabase;

.field private b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/umeng/cconfig/a/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/umeng/cconfig/a/b;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/cconfig/a/b;
    .locals 1

    sget-object v0, Lcom/umeng/cconfig/a/b;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/cconfig/a/b;->d:Landroid/content/Context;

    invoke-static {p0}, Lcom/umeng/cconfig/a/a;->a(Landroid/content/Context;)Lcom/umeng/cconfig/a/a;

    move-result-object p0

    sput-object p0, Lcom/umeng/cconfig/a/b;->c:Landroid/database/sqlite/SQLiteOpenHelper;

    :cond_0
    invoke-static {}, Lcom/umeng/cconfig/a/b$a;->a()Lcom/umeng/cconfig/a/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/umeng/cconfig/a/b;->c:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    :cond_0
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "update  __cc set __a=\"1\" where __ts=\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "jessie"

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "[DbManager] updateCloudConfigByTimestamp\uff1a"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v3, v2, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v3, :cond_0

    invoke-virtual {v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {v2, p1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_1

    goto :goto_1

    :catchall_0
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_1

    :goto_1
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_1
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    move v0, v1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_2
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    :goto_2
    return v0

    :catchall_3
    move-exception p1

    :try_start_4
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    :cond_3
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    throw p1
.end method

.method public final declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    monitor-exit p0

    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v3, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v3, "select *  from __cc where __a=\"1\" group by __ts"

    iget-object v4, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v5, v4, Landroid/database/sqlite/SQLiteDatabase;

    const/4 v6, 0x0

    if-nez v5, :cond_0

    invoke-virtual {v4, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {v4, v3, v6}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_2

    :cond_1
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "__ts"

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "__c"

    invoke-interface {v3, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "__a"

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "id"

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "timeStamp = %s, content = %s, active = %s, id = %s"

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v4, v9, v1

    aput-object v5, v9, v2

    const/4 v10, 0x2

    aput-object v6, v9, v10

    const/4 v10, 0x3

    aput-object v7, v9, v10

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    new-instance v7, Lcom/umeng/cconfig/b/d;

    invoke-direct {v7}, Lcom/umeng/cconfig/b/d;-><init>()V

    iput-object v4, v7, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    iput-object v5, v7, Lcom/umeng/cconfig/b/d;->b:Ljava/lang/String;

    iput-object v6, v7, Lcom/umeng/cconfig/b/d;->c:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const-string p1, "update  __cc set __a=\"0\" where "

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const-string v4, ""

    move v5, v1

    :goto_2
    if-ge v5, v3, :cond_5

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/umeng/cconfig/b/d;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v7, v3, -0x1

    const-string v8, "__ts=\""

    if-eq v5, v7, :cond_3

    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v6, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" or "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v6, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "jessie"

    new-array v8, v2, [Ljava/lang/Object;

    const-string v9, "[DbManager] updateOtherCloudConfigInfo : "

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v1

    invoke-static {v7, v8}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v7, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v8, v7, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v8, :cond_4

    invoke-virtual {v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    invoke-static {v7, v6}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_5
    iget-object v6, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    :try_start_2
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_6

    goto :goto_6

    :catchall_0
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_6

    :goto_6
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_6
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    move v1, v2

    goto :goto_7

    :catch_0
    move-exception p1

    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    iget-object p1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_7
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    :goto_7
    return v1

    :catchall_3
    move-exception p1

    :try_start_5
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :catchall_4
    :cond_8
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    throw p1
.end method

.method public final c()Lcom/umeng/cconfig/b/d;
    .locals 11

    new-instance v0, Lcom/umeng/cconfig/b/d;

    invoke-direct {v0}, Lcom/umeng/cconfig/b/d;-><init>()V

    :try_start_0
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v1, "select *  from __cc where __a=\"1\" group by __ts"

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v3, v2, Landroid/database/sqlite/SQLiteDatabase;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual {v2, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {v2, v1, v4}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "__ts"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "__c"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "__a"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "timeStamp = %s, content = %s, active = %s, id = %s"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v9, 0x1

    aput-object v3, v7, v9

    const/4 v10, 0x2

    aput-object v4, v7, v10

    const/4 v10, 0x3

    aput-object v1, v7, v10

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "jessie"

    new-array v6, v9, [Ljava/lang/Object;

    const-string v7, "[DbManager] selectRecentActiveOne"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v8

    invoke-static {v5, v6}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lcom/umeng/cconfig/b/d;

    invoke-direct {v1}, Lcom/umeng/cconfig/b/d;-><init>()V

    iput-object v2, v1, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    iput-object v3, v1, Lcom/umeng/cconfig/b/d;->b:Ljava/lang/String;

    iput-object v4, v1, Lcom/umeng/cconfig/b/d;->c:Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    return-object v1

    :cond_2
    :try_start_2
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_3

    goto :goto_1

    :catchall_1
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_3

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :cond_3
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    return-object v0

    :catchall_3
    move-exception v0

    :try_start_6
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :cond_4
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    throw v0
.end method

.method public final d()Z
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v2, "select *  from __cc where __a=\"0\" order by __ts asc"

    iget-object v3, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v4, v3, Landroid/database/sqlite/SQLiteDatabase;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    invoke-virtual {v3, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {v3, v2, v5}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_1

    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "__ts"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string v2, "delete from __cc where "

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x5

    const-string v4, ""
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v3, :cond_5

    move v5, v1

    :goto_2
    if-ge v5, v3, :cond_3

    add-int/lit8 v6, v3, -0x1

    const-string v7, "__ts=\""

    if-eq v5, v6, :cond_2

    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" or "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "jessie"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "[DbManager] deleteExtraCloudConfigInfo: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v2, v3}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v3, v2, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v3, :cond_4

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    invoke-static {v2, v0}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    :goto_5
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_6

    goto :goto_6

    :catchall_0
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_6

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iget-object v0, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_6

    :goto_6
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    :cond_6
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    return v1

    :catchall_2
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :cond_7
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    throw v0
.end method

.method public final e()Lcom/umeng/cconfig/b/d;
    .locals 12

    new-instance v0, Lcom/umeng/cconfig/b/d;

    invoke-direct {v0}, Lcom/umeng/cconfig/b/d;-><init>()V

    :try_start_0
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v1, "select *  from __cc order by __ts desc"

    iget-object v2, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    instance-of v3, v2, Landroid/database/sqlite/SQLiteDatabase;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual {v2, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {v2, v1, v4}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "__ts"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "__c"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "__a"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "timeStamp = %s, content = %s, active = %s, id = %s"

    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v2, v8, v9

    const/4 v10, 0x1

    aput-object v3, v8, v10

    const/4 v11, 0x2

    aput-object v4, v8, v11

    const/4 v11, 0x3

    aput-object v5, v8, v11

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "jessie"

    new-array v7, v10, [Ljava/lang/Object;

    const-string v8, "[DbManager] getLastestConfigInfo"

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v9

    invoke-static {v6, v7}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/umeng/cconfig/b/d;->a:Ljava/lang/String;

    iput-object v3, v0, Lcom/umeng/cconfig/b/d;->b:Ljava/lang/String;

    iput-object v4, v0, Lcom/umeng/cconfig/b/d;->c:Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_2
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    return-object v0

    :cond_3
    :try_start_2
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_4

    goto :goto_1

    :catchall_1
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v1, :cond_4

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_4

    :goto_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :cond_4
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    return-object v0

    :catchall_3
    move-exception v0

    :try_start_6
    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/umeng/cconfig/a/b;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :cond_5
    invoke-virtual {p0}, Lcom/umeng/cconfig/a/b;->b()V

    throw v0
.end method
