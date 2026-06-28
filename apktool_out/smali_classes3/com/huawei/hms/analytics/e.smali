.class public final Lcom/huawei/hms/analytics/e;
.super Lcom/huawei/hms/analytics/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bw;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/b;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    iput-object p2, p0, Lcom/huawei/hms/analytics/b;->klm:Landroid/content/Context;

    const-string p1, "MiPushHelper"

    iput-object p1, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final lmn()Lcom/huawei/hms/analytics/ao;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.xiaomi.mipush.sdk.MiPushMessage"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/b;->ikl:Lcom/huawei/hms/analytics/bw;

    const-string v3, "key_message"

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/bw;->ijk(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "getExtra"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/util/Map;

    const-string v2, "$CampaignPushInfo"

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/b;->lmn(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/b;->lmn:Ljava/lang/String;

    const-string v2, "campaign info check failed"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v2, Lcom/huawei/hms/analytics/ao;

    invoke-direct {v2, v1}, Lcom/huawei/hms/analytics/ao;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :catchall_0
    const-string v1, "MiPushHelper"

    const-string v2, "getCampInfo exception"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method
