.class public final Lcom/huawei/hms/analytics/ct;
.super Lcom/huawei/hms/analytics/cw;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bh;)V
    .locals 2

    const-string v0, "$AppFirstOpen"

    const-string v1, "isFirstRun"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/hms/analytics/cw;-><init>(Lcom/huawei/hms/analytics/bh;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "FsOpenHandler"

    iput-object p1, p0, Lcom/huawei/hms/analytics/cw;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final lmn()J
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    const-string v1, ""

    const-string v2, "global_v2"

    const-string v3, "firstRunTime"

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cw;->lmn:Ljava/lang/String;

    const-string v1, "first run time error"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v4, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v3, v5}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-wide v0
.end method
