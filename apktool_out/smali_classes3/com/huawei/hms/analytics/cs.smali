.class public final Lcom/huawei/hms/analytics/cs;
.super Lcom/huawei/hms/analytics/cw;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bh;)V
    .locals 2

    const-string v0, "$CustomReferrer"

    const-string v1, "is_cs_refr_run"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/hms/analytics/cw;-><init>(Lcom/huawei/hms/analytics/bh;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "CusRefrHandler"

    iput-object p1, p0, Lcom/huawei/hms/analytics/cw;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final klm()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final lmn()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
