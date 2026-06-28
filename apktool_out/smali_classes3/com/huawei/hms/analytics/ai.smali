.class public final Lcom/huawei/hms/analytics/ai;
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
    .locals 9

    const-string v0, ""

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "content://com.vivo.vms.IdProvider/IdentifierId/OAID"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    iget-object v2, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "value"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    if-eqz v1, :cond_1

    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    :try_start_1
    const-string v2, "vvOaid"

    const-string v3, "contentResolver query exception"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0

    :goto_2
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
.end method


# virtual methods
.method public final klm()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lmn()V
    .locals 4

    invoke-direct {p0}, Lcom/huawei/hms/analytics/ai;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "oaid is empty, begin get gaid"

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/ad;->lmn(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/ad;->lmn:Lcom/huawei/hms/analytics/i$lmn;

    const-string v2, ""

    const-string v3, "oaid"

    invoke-interface {v1, v0, v2, v3}, Lcom/huawei/hms/analytics/i$lmn;->lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
