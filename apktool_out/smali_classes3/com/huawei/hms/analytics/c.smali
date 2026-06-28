.class public final Lcom/huawei/hms/analytics/c;
.super Lcom/huawei/hms/analytics/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/b;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    iput-object p2, p0, Lcom/huawei/hms/analytics/b;->klm:Landroid/content/Context;

    const-string p1, "HwPushHandler"

    iput-object p1, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final lmn()Lcom/huawei/hms/analytics/ao;
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    const-string v1, "$CampaignPushInfo"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/bw;->hij(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/b;->lmn(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    const-string v1, "campaign info check failed"

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_0
    :try_start_0
    new-instance v1, Lcom/huawei/hms/analytics/ao;

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/ao;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    const-string v1, "getCampInfo exception"

    goto :goto_0
.end method
