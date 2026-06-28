.class final Lcom/huawei/hms/analytics/bj$lmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/bl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/bj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "lmn"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/bj$lmn;-><init>()V

    return-void
.end method

.method private static lmn()Z
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/bj;->ikl()Landroid/content/Context;

    move-result-object v0

    const-string v1, "is_analytics_enabled"

    const/4 v2, 0x1

    const-string v3, "global_v2"

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final klm(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/bj$lmn;->lmn()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    const-string p3, "ThirdRingback"

    invoke-static {p3, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/bj$lmn$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/hms/analytics/bj$lmn$2;-><init>(Lcom/huawei/hms/analytics/bj$lmn;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final lmn(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ar;->klm()Lcom/huawei/hms/analytics/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/aq;->klm()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/bj$lmn;->lmn()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    const-string p3, "ThirdRingback"

    invoke-static {p3, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/bj$lmn$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/hms/analytics/bj$lmn$1;-><init>(Lcom/huawei/hms/analytics/bj$lmn;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method
