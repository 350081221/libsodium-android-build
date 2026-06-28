.class public final Lcom/huawei/hms/analytics/bp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/bp$lmn;
    }
.end annotation


# static fields
.field private static ikl:Lcom/huawei/hms/analytics/bp;


# instance fields
.field private ghi:Lcom/huawei/hms/analytics/bh;

.field private hij:Z

.field private ijk:Lcom/huawei/hms/analytics/bp$lmn;

.field public klm:Z

.field public lmn:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/bp;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/bp;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/bp;->ikl:Lcom/huawei/hms/analytics/bp;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bp;->hij:Z

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bp;->klm:Z

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    const-string v1, "_openness_config_tag"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->ghi:Lcom/huawei/hms/analytics/bh;

    return-void
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/bp;)Lcom/huawei/hms/analytics/bh;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/bp;->ghi:Lcom/huawei/hms/analytics/bh;

    return-object p0
.end method

.method public static lmn()Lcom/huawei/hms/analytics/bp;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bp;->ikl:Lcom/huawei/hms/analytics/bp;

    return-object v0
.end method

.method public static lmn(J)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-wide p0, v0, Lcom/huawei/hms/analytics/at;->c:J

    return-void
.end method

.method private lmn(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "onMoveBackgroundPolicy"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hms/analytics/bp;->lmn(Z)V

    goto :goto_1

    :cond_1
    const-string v1, "onScheduledTime"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bp$lmn;->lmn()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    goto :goto_1

    :cond_2
    const-string v1, "onCacheThreshold"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x1e

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/bp;->lmn(J)V

    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "save policies : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PoliceCommander"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v1, "policies"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "global_v2"

    invoke-static {v0, v2, v1, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p0, "PoliceCommander"

    const-string p1, "jsonPut json Exception"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static lmn(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/a;

    move-result-object v0

    iput-boolean p0, v0, Lcom/huawei/hms/analytics/a;->klm:Z

    return-void
.end method


# virtual methods
.method public final ikl()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/bp;->hij:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ghi:Lcom/huawei/hms/analytics/bh;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bp;->hij:Z

    const-string v0, "PoliceCommander"

    const-string v1, "onAppLaunchPolicy onReport"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ghi:Lcom/huawei/hms/analytics/bh;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->lmn()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ghi:Lcom/huawei/hms/analytics/bh;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->klm()V

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/fgh;->klm()V

    return-void
.end method

.method public final klm()V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    :try_start_0
    const-string v1, "onMoveBackgroundPolicy"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    const-string v1, "onCacheThreshold"

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "PoliceCommander"

    const-string v1, "defPolicies json exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final klm(J)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/bp$lmn;

    invoke-direct {v0, p0}, Lcom/huawei/hms/analytics/bp$lmn;-><init>(Lcom/huawei/hms/analytics/bp;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/bp$lmn;->lmn(J)V

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/bp$lmn;->klm(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bp$lmn;->lmn()V

    new-instance v0, Lcom/huawei/hms/analytics/bp$lmn;

    invoke-direct {v0, p0}, Lcom/huawei/hms/analytics/bp$lmn;-><init>(Lcom/huawei/hms/analytics/bp;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->ijk:Lcom/huawei/hms/analytics/bp$lmn;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/bp$lmn;->lmn(J)V

    :cond_1
    return-void
.end method

.method public final declared-synchronized lmn(Ljava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/huawei/hms/analytics/type/ReportPolicy;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_7

    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_7

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/type/ReportPolicy;

    sget-object v2, Lcom/huawei/hms/analytics/bp$1;->lmn:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    const/4 v1, 0x4

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "onMoveBackgroundPolicy"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/bp;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/huawei/hms/analytics/bp;->lmn(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/huawei/hms/analytics/type/ReportPolicy;->getThreshold()J

    move-result-wide v1

    const-string v3, "onCacheThreshold"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/huawei/hms/analytics/bp;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/bp;->lmn(J)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/huawei/hms/analytics/type/ReportPolicy;->getThreshold()J

    move-result-wide v1

    const-string v4, "onScheduledTime"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v0, v4, v5}, Lcom/huawei/hms/analytics/bp;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "onScheduledTime"

    iget-object v5, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;

    if-eqz v5, :cond_4

    const-wide/16 v6, -0x1

    invoke-virtual {v5, v4, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v4, v4, v1

    if-nez v4, :cond_4

    const/4 v3, 0x0

    :cond_4
    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, v2}, Lcom/huawei/hms/analytics/bp;->klm(J)V

    goto :goto_0

    :cond_5
    const-string v1, "onAppLaunch"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/bp;->lmn(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/bp;->ikl()V

    goto :goto_0

    :cond_6
    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/bp;->lmn(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp;->lmn:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_7
    :goto_1
    monitor-exit p0

    return-void
.end method
