.class public final Lcom/huawei/hms/analytics/ab;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    return-void
.end method

.method private ijk()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "content://com.meizu.flyme.openidsdk/"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    iget-object v1, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "oaid"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "value"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_0
    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    :try_start_1
    const-string v1, "MeizHelper"

    const-string v2, "contentResolver query exception"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    const-string v0, ""

    return-object v0

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v1
.end method


# virtual methods
.method public final klm()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lmn()V
    .locals 4

    invoke-direct {p0}, Lcom/huawei/hms/analytics/ab;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "meiz oid is empty, begin get gaid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->lmn(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v2, ""

    const-string v3, "oaid"

    invoke-interface {v1, v0, v2, v3}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
