.class public final Lcom/huawei/hms/analytics/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static klm:Z

.field private static final lmn:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/ba;->lmn:Ljava/util/Map;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hms/analytics/ba;->klm:Z

    return-void
.end method

.method public static ijk()Z
    .locals 7

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v1, "global_v2"

    const-string v2, "is_analytics_enabled"

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "is_restriction_enabled"

    invoke-static {v0, v1, v4}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-static {v0, v1, v4, v6}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    if-nez v2, :cond_1

    return v3

    :cond_1
    return v6
.end method

.method public static ikl()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hms/analytics/ba;->klm:Z

    return-void
.end method

.method public static klm()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/hms/analytics/ba;->klm:Z

    return v0
.end method

.method public static klm(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static lmn(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/ba;->lmn:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static lmn()Z
    .locals 1

    const-string v0, "_openness_config_tag"

    invoke-static {v0}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static lmn(Ljava/lang/String;)Z
    .locals 3

    sget-object v0, Lcom/huawei/hms/analytics/ba;->lmn:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-nez p0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_1
    return v2
.end method
