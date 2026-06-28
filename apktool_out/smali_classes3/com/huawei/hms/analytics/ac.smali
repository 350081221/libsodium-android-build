.class public final Lcom/huawei/hms/analytics/ac;
.super Lcom/huawei/hms/analytics/ad;
.source "SourceFile"


# instance fields
.field private ijk:Z


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/v;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hms/analytics/v;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hms/analytics/ad;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/i$lmn;Lcom/huawei/hms/analytics/ad;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/ac;->ijk:Z

    return-void
.end method

.method private ijk()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "content://cn.nubia.identity/identity"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/analytics/ad;->klm:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/ContentResolver;->acquireContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->close()V

    :cond_0
    return-object v0

    :cond_1
    :try_start_1
    const-string v3, "getOAID"

    invoke-virtual {v2, v3, v1, v1}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->close()V

    return-object v0

    :cond_2
    :try_start_2
    const-string v3, "code"

    const/4 v4, -0x1

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "id"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/huawei/hms/analytics/ac;->ijk:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-virtual {v2}, Landroid/content/ContentProviderClient;->close()V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto :goto_3

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_1
    :goto_1
    :try_start_3
    const-string v2, "NibOaid"

    const-string v3, "contentResolver query exception"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    :cond_4
    :goto_2
    return-object v0

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    :cond_5
    throw v0
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

    invoke-direct {p0}, Lcom/huawei/hms/analytics/ac;->ijk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/huawei/hms/analytics/ac;->ijk:Z

    if-nez v1, :cond_0

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
