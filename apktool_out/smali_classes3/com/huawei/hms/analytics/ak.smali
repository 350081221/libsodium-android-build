.class public final Lcom/huawei/hms/analytics/ak;
.super Lcom/huawei/hms/analytics/ijk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/ijk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk;->klm:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;

    invoke-virtual {v0, p2}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->build(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "is_analytics_enabled"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    const-string v2, "global_v2"

    invoke-static {p1, v2, p2, v1}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    return-void
.end method


# virtual methods
.method public final ikl(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ha-sdk-service"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object p1

    iput-object v0, p1, Lcom/huawei/hms/analytics/au;->klm:Ljava/util/Map;

    :cond_0
    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/instance/CallBack;)V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/al;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ghi:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    iget-object v3, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Lcom/huawei/hms/analytics/al;-><init>(Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;Ljava/lang/String;Lcom/huawei/hms/analytics/instance/CallBack;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method
