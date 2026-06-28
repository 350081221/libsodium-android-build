.class public final Lcom/huawei/hms/analytics/ghi;
.super Lcom/huawei/hms/analytics/ijk;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/bi;


# instance fields
.field private fgh:Lcom/huawei/hms/analytics/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "_openness_config_tag"

    invoke-direct {p0, p1, v0}, Lcom/huawei/hms/analytics/ijk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ijk;->klm:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;->build(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    return-void
.end method

.method private def(Z)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean p1, v0, Lcom/huawei/hms/analytics/at;->def:Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v1, "global_v2"

    const-string v2, "is_restriction_shared"

    invoke-static {v0, v1, v2, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private efg()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/ghi;->fgh:Lcom/huawei/hms/analytics/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/g;

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/ghi;->fgh:Lcom/huawei/hms/analytics/g;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ghi;->fgh:Lcom/huawei/hms/analytics/g;

    iget-object v0, v0, Lcom/huawei/hms/analytics/g;->lmn:Lcom/huawei/hms/analytics/p;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/p;->lmn()Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/g$lmn;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/g$lmn;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/hmf/tasks/Task;->h(Lcom/huawei/hmf/tasks/h;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/g$klm;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/g$klm;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "instanceimpl"

    const-string v1, "observableManager Exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private efg(Z)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v1, "stop_event"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "stop_v2_1"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/hms/analytics/dj;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "$StopAnalyticsCollection"

    invoke-direct {v0, v2, v1}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v1, Lcom/huawei/hms/analytics/cl;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/cl;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/cl;->setStopEventReport(Z)V

    iput-boolean p1, v1, Lcom/huawei/hms/analytics/cl;->klm:Z

    iget-object p1, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    const-string v2, "oper"

    iget-object v0, v0, Lcom/huawei/hms/analytics/dj;->ikl:Ljava/util/ArrayList;

    invoke-interface {p1, v2, v0, v1}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->onStreamEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method


# virtual methods
.method public final cde(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setCustomReferrer"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v2, 0x100

    invoke-static {p1, v2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    const-string p1, "Custom referrer check failed"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    new-instance v1, Lcom/huawei/hms/analytics/cs;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/cs;-><init>(Lcom/huawei/hms/analytics/bh;)V

    new-instance v2, Lcom/huawei/hms/analytics/cr;

    invoke-direct {v2, p1}, Lcom/huawei/hms/analytics/cr;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/cw;->lmn(Lcom/huawei/hms/analytics/cv;)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final def(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setChannel(String))"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v3, v2, Lcom/huawei/hms/analytics/at;->ijk:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string p1, "channel already exists in manifest file"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    invoke-virtual {v2}, Lcom/huawei/hms/analytics/at;->lmn()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string p1, "duplicate set,channel already exists"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/huawei/hms/analytics/dg;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "global_v2"

    const-string v4, "api_channel"

    invoke-static {v1, v3, v4, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, v2, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    :cond_3
    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final efg(Ljava/lang/String;)V
    .locals 3

    const-string v0, "HiAnalyticsInstance#setPushToken(String)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v2, "instanceimpl"

    if-nez v1, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->x:Z

    if-nez v1, :cond_1

    const-string p1, "push token switch is disabled"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    const/16 v1, 0x100

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_2

    const-string p1, "push token check failed"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/huawei/hms/analytics/at;->p:Z

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v1, Lcom/huawei/hms/analytics/at;->o:Ljava/lang/String;

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final fgh()Lcom/huawei/hmf/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string v0, "IE-006"

    const-string v1, "The Analytics Kit is disabled"

    const-string v2, "instanceimpl"

    invoke-static {v2, v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "HiAnalyticsInstance#getAAID()"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/cy;->ikl()Lcom/huawei/hmf/tasks/Task;

    move-result-object v1

    const-string v2, "0"

    iput-object v2, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw v1
.end method

.method public final fgh(Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    const-string v1, "instanceimpl"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setUserId(String)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const/4 v2, 0x1

    const-string v3, ""

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/dr;->lmn(Landroid/content/Context;I)V

    :goto_0
    move-object p1, v3

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const-string v5, "UserIdHandler"

    if-eqz v4, :cond_2

    const-string p1, "PE-001"

    const-string v1, "UserId is empty"

    :goto_1
    invoke-static {v5, p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v6, 0x100

    if-le v4, v6, :cond_3

    const-string p1, "PE-002"

    const-string v1, "Length of userId exceeds the limit"

    goto :goto_1

    :cond_3
    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/dr;->lmn(Landroid/content/Context;I)V

    :goto_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->bcd:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    invoke-interface {v1, v2}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->setNeedRefreshSession(Z)V

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v1, Lcom/huawei/hms/analytics/at;->bcd:Ljava/lang/String;

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final fgh(Z)V
    .locals 5

    const-string v0, "HiAnalyticsInstance#setPushTokenCollectionEnabled(boolean))"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v2, "instanceimpl"

    if-nez v1, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v3, v1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v4, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "CN"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string p1, "only available in China region"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "global_v2"

    const-string v4, "push_token_collection_enable"

    invoke-static {v2, v3, v4, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-boolean p1, v1, Lcom/huawei/hms/analytics/at;->x:Z

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ghi()V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string v0, "IE-006"

    const-string v2, "The Analytics Kit is disabled"

    invoke-static {v1, v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#clearCachedData()"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    :try_start_0
    new-instance v2, Lcom/huawei/hms/analytics/ijk$lmn;

    invoke-direct {v2, p0}, Lcom/huawei/hms/analytics/ijk$lmn;-><init>(Lcom/huawei/hms/analytics/ijk;)V

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/ijk$lmn;->lmn()V

    const-string v2, "0"

    iput-object v2, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "reset analytics exception: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ghi(Ljava/lang/String;)V
    .locals 14

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#pageEnd(String)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v2, 0x100

    invoke-static {p1, v2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    const-string p1, "pageEnd: pageName check failed"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "onPageExit "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " with time: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "ActivityStatCommander"

    invoke-static {v5, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/hms/analytics/bcd$lmn;

    if-nez v4, :cond_2

    const-string p1, "onPageEnter should be invoked first."

    :goto_0
    invoke-static {v5, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    iget-wide v6, v4, Lcom/huawei/hms/analytics/bcd$lmn;->ijk:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-nez v10, :cond_3

    const-string p1, "timestamp is 0."

    goto :goto_0

    :cond_3
    iput-object v4, v1, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    iput-wide v2, v1, Lcom/huawei/hms/analytics/bcd;->ghi:J

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    const-string v11, "$CurActivityName"

    iget-object v12, v4, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "$CurActivityClass"

    iget-object v12, v4, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "$CurActivityId"

    iget-object v12, v4, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v11, v1, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    const-string v12, "$PrevActivityClass"

    const-string v13, ""

    invoke-virtual {v11, v12, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "$PrePageId"

    invoke-virtual {v10, v12, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "$CurrPageId"

    iget-object v4, v4, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v10, v11, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v11, "onPageExit duration cal: 1. "

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, " 2. "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    sub-long v6, v2, v6

    const-wide/32 v11, 0x240c8400

    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const-string v6, "$Duration"

    invoke-virtual {v10, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "onPageExit: send ScreenExit event..."

    invoke-static {v5, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v1, Lcom/huawei/hms/analytics/bcd;->def:Lcom/huawei/hms/analytics/bh;

    new-instance v5, Lcom/huawei/hms/analytics/dj;

    const-string v6, "$ExitScreen"

    invoke-direct {v5, v6, v10}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v4, v6, v5, v2, v3}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    iget-object v2, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v2, v2, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_5

    iget-object v2, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/hms/analytics/bcd$lmn;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    if-eqz v5, :cond_4

    iget-wide v4, v5, Lcom/huawei/hms/analytics/bcd$lmn;->ijk:J

    cmp-long v6, v4, v8

    if-lez v6, :cond_4

    iget-object v6, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hms/analytics/bcd$lmn;

    iput-object v3, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    move-wide v8, v4

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    iput-object v2, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    :cond_6
    iget-object v1, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ghi(Z)V
    .locals 7

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-ne v0, p1, :cond_0

    const-string v0, "The collection status is the same. isEnableAnalytics: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setAnalyticsEnabled(boolean)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean p1, v2, Lcom/huawei/hms/analytics/at;->fgh:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "is_analytics_enabled"

    const-string v4, "global_v2"

    invoke-static {v2, v4, v3, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "is_restriction_enabled"

    invoke-static {v2, v4, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-nez p1, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v2, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    if-nez v2, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean v6, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-static {v2, v4, v3, v6}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/hms/analytics/ghi;->efg(Z)V

    invoke-direct {p0, v6}, Lcom/huawei/hms/analytics/ghi;->def(Z)V

    goto :goto_1

    :cond_1
    if-nez p1, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v2, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    if-eqz v2, :cond_3

    const-string v2, "The stop event has been reported."

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    xor-int/lit8 v3, p1, 0x1

    iput-boolean v3, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/huawei/hms/analytics/ghi;->efg()V

    const-string v2, "0"

    iput-object v2, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    const-string v0, "The collection status is the differ. isEnableAnalytics: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "analyticsEnabled"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/hms/analytics/bj;->lmn()Lcom/huawei/hms/analytics/bk;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/bk;->lmn(Ljava/util/Map;)V

    return-void
.end method

.method public final hij(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "CN"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "Region is not CN. This api does not take effect"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "HiAnalyticsInstance#setWXAppId"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v1, 0x100

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v1

    const-string v2, "w_app_id"

    const-string v3, "global_v2"

    if-nez v1, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v1, ""

    iput-object v1, p1, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    iget-object p1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-static {p1, v3, v2, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v1, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-static {v1, v3, v2, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final hij(Z)V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->efg:Z

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean p1, v2, Lcom/huawei/hms/analytics/at;->efg:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "global_v2"

    const-string v4, "is_restriction_enabled"

    invoke-static {v2, v3, v4, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    if-ne p1, v0, :cond_1

    const-string v0, "The enabled status is the same. isRestriction: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "HiAnalyticsInstance#setRestrictionEnabled(boolean)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/ghi;->efg(Z)V

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/ghi;->def(Z)V

    :cond_2
    invoke-direct {p0}, Lcom/huawei/hms/analytics/ghi;->efg()V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final hij()Z
    .locals 6

    const-string v0, "0"

    const-string v1, "HiAnalyticsInstance#isRestrictionShared"

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v1

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v3, "CN"

    iget-object v4, v2, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v5, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v2, "instanceimpl"

    const-string v3, "Region is not CN. This api does not take effect"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    :try_start_1
    iget-boolean v2, v2, Lcom/huawei/hms/analytics/at;->def:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return v2

    :catchall_0
    move-exception v2

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw v2
.end method

.method public final ijk(J)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    const-string v0, "instanceimpl"

    invoke-static {v0, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setSessionDuration(long)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "sessionDuration"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;J)J

    move-result-wide p1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    invoke-interface {v1, p1, p2}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->setSessionTimeoutDuration(J)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ijk(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "CN"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "Region is not CN. This api does not take effect"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "HiAnalyticsInstance#setWXOpenId"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v1, 0x100

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v1, ""

    iput-object v1, p1, Lcom/huawei/hms/analytics/at;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v1, Lcom/huawei/hms/analytics/at;->t:Ljava/lang/String;

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ijk(Z)V
    .locals 7

    const-string v0, "0"

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v2, "instanceimpl"

    if-nez v1, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v2, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v1, "HiAnalyticsInstance#setRestrictionShared"

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v1

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v3

    iget-object v3, v3, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v4, "CN"

    iget-object v5, v3, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v6, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string p1, "Region is not CN. This api does not take effect"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    :try_start_1
    iget-boolean v4, v3, Lcom/huawei/hms/analytics/at;->efg:Z

    if-eqz v4, :cond_2

    const-string p1, "Restriction enabled, setRestrictionShared failed"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    :try_start_2
    iget-boolean v4, v3, Lcom/huawei/hms/analytics/at;->def:Z

    if-ne p1, v4, :cond_3

    const-string p1, "The enabled status is the same."

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_3
    :try_start_3
    iput-boolean p1, v3, Lcom/huawei/hms/analytics/at;->def:Z

    invoke-direct {p0}, Lcom/huawei/hms/analytics/ghi;->efg()V

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "global_v2"

    const-string v4, "is_restriction_shared"

    invoke-static {v2, v3, v4, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw p1
.end method

.method public final ijk()Z
    .locals 2

    const-string v0, "HiAnalyticsInstance#isRestrictionEnabled"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "0"

    iput-object v1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->efg:Z

    return v0
.end method

.method public final ikl(J)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    const-string v0, "instanceimpl"

    invoke-static {v0, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setMinActivitySessions(long)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "minActivitySessions"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;J)J

    move-result-wide p1

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    invoke-interface {v1, p1, p2}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->setMinSessionDuration(J)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ikl(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "CN"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "Region is not CN. This api does not take effect"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "HiAnalyticsInstance#setWXUnionId"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v1, 0x100

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v1, ""

    iput-object v1, p1, Lcom/huawei/hms/analytics/at;->s:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v1, Lcom/huawei/hms/analytics/at;->s:Ljava/lang/String;

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final ikl(Z)V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    const-string v1, "instanceimpl"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setCollectAdsIdEnabled"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->k:Z

    if-eq v1, p1, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean p1, v1, Lcom/huawei/hms/analytics/at;->k:Z

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v2, "global_v2"

    const-string v3, "is_enabled_adsid"

    invoke-static {v1, v2, v3, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_1
    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final klm(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#pageStart(String,String)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const/16 v2, 0x100

    invoke-static {p1, v2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {p2, v2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v2, v2, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p1, "pageStart: pageName cannot be equals to previous pageName"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const-string v3, "onScreenEnter with time: "

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v11, "ActivityStatCommander"

    invoke-static {v11, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, ""

    new-instance v12, Lcom/huawei/hms/analytics/bcd$lmn;

    move-object v3, v12

    move-object v4, p1

    move-object v5, p2

    move-wide v7, v9

    invoke-direct/range {v3 .. v8}, Lcom/huawei/hms/analytics/bcd$lmn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    iget-object p2, v1, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {p2, p1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onPageEnterSend"

    invoke-static {v11, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    const-string p2, "$PrePageId"

    const-string v3, "$PrevActivityId"

    const-string v4, "$PrevActivityName"

    const-string v5, "$PrevActivityClass"

    if-nez p1, :cond_3

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v2, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v2, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    iget-object v3, v1, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v3, v3, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p1, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v2, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v2, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    iget-object v3, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v3, v3, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p1, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    :goto_0
    iget-object p1, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v2, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$CurActivityName"

    iget-object p2, v12, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v12, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    const-string p2, "$CurActivityClass"

    invoke-virtual {v2, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$CurActivityId"

    iget-object v3, v12, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {v2, p1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    iget-object v3, v12, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p1, p2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$CurrPageId"

    iget-object p2, v12, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v12, v1, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object p1, v1, Lcom/huawei/hms/analytics/bcd;->def:Lcom/huawei/hms/analytics/bh;

    new-instance p2, Lcom/huawei/hms/analytics/dj;

    const-string v1, "$EnterScreen"

    invoke-direct {p2, v1, v2}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {p1, v1, p2, v9, v10}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_4
    :goto_1
    const-string p1, "pageStart: pageName or pageClassOverride check failed"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Z)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    const-string v1, "instanceimpl"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_0
    const-string v0, "HiAnalyticsInstance#getUserProfiles(boolean)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-super {p0, p1}, Lcom/huawei/hms/analytics/ijk;->lmn(Z)Ljava/util/Map;

    move-result-object p1

    const-string v1, "_openness_config_tag"

    if-nez p1, :cond_2

    :try_start_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_1
    return-object p1

    :cond_2
    :try_start_1
    const-string v2, "0"

    iput-object v2, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_3
    return-object p1

    :catchall_0
    move-exception p1

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_4
    throw p1
.end method

.method public final lmn(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setCurrentActivity(Activity,String,String))"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    if-eqz p1, :cond_5

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p3

    :cond_2
    move-object v4, p3

    const/16 p3, 0x100

    invoke-static {p2, p3}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_3

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_3
    :try_start_1
    invoke-static {v4, p3}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p3, :cond_4

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_4
    :try_start_2
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object p3

    invoke-virtual {p3, v8, v9}, Lcom/huawei/hms/analytics/bcd;->lmn(J)V

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v1

    const-string v2, "ActivityStatCommander"

    const-string v3, "onScreenEnter with time: "

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getTaskId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/huawei/hms/analytics/bcd$lmn;

    move-object v2, p1

    move-object v3, p2

    move-wide v6, v8

    invoke-direct/range {v2 .. v7}, Lcom/huawei/hms/analytics/bcd$lmn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {v1, p1, p3, v8, v9}, Lcom/huawei/hms/analytics/bcd;->lmn(Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_5
    :goto_0
    :try_start_3
    const-string p1, "PE-001"

    const-string p2, " activity is null,or screenName is null"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw p1
.end method

.method public final lmn(Landroid/content/Intent;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#onNewIntent"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    if-nez p1, :cond_1

    const-string p1, "new intent is null"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    new-instance v2, Lcom/huawei/hms/analytics/bw;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/huawei/hms/analytics/bw;-><init>(Landroid/os/Bundle;)V

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/f;->lmn(Landroid/content/Context;Lcom/huawei/hms/analytics/bw;)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Landroid/os/Bundle;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string v0, "The Analytics Kit is disabled"

    const-string v1, "instanceimpl"

    invoke-static {v1, p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#addDefaultEventParameters(Bundle)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/ar;->ikl()Lcom/huawei/hms/analytics/aq;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/huawei/hms/analytics/aq;->lmn(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :catch_0
    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/type/HALogConfig;Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#writeLog"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getRegion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x80

    invoke-static {v2, v6}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v3, v6}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v4, v6}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v5, v6}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x1000

    invoke-static {p2, v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getTags()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/type/HALogConfig;->setTags(Ljava/util/Map;)V

    new-instance v1, Lcom/huawei/hms/analytics/co;

    const-string v2, "$WriteLog"

    invoke-direct {v1, p1, v2, p2}, Lcom/huawei/hms/analytics/co;-><init>(Lcom/huawei/hms/analytics/type/HALogConfig;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->ijk()Lcom/huawei/hms/analytics/cx;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string p2, "global_v2"

    const-string v1, "is_log"

    invoke-static {p1, p2, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_3
    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_4
    :goto_0
    const-string p1, "The logConfigure parameter is invalid."

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "_openness_config_tag"

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v2, "instanceimpl"

    if-nez v1, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v2, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v1, "HiAnalyticsInstance#onEvent(String,Bundle)"

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v1

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string p2, "PE-001"

    const-string v3, " eventId is empty"

    invoke-static {v2, p2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iput-object p1, v1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_1
    return-void

    :cond_2
    :try_start_1
    sget-object v3, Lcom/huawei/hms/analytics/an;->lmn:Ljava/util/List;

    invoke-static {p1, v3}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string p2, "PE-004"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " is reserved."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, p2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iput-object p1, v1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_3
    return-void

    :cond_4
    :try_start_2
    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_6

    iget-object p2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iput-object p1, v1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_5
    return-void

    :cond_6
    :try_start_3
    new-instance v3, Lcom/huawei/hms/analytics/dj;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hms/analytics/ar;->ikl()Lcom/huawei/hms/analytics/aq;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hms/analytics/aq;->ikl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v5, :cond_7

    :try_start_4
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, v3, Lcom/huawei/hms/analytics/dj;->ijk:Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_5
    const-string v4, "P_CEvtHandler"

    const-string v5, "defEvtJson exception"

    invoke-static {v4, v5}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_0
    if-nez p2, :cond_8

    const-string p2, "bundle is null"

    invoke-static {v2, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    :cond_8
    invoke-virtual {v3, p2}, Lcom/huawei/hms/analytics/dj;->ikl(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1, v3}, Lcom/huawei/hms/analytics/ijk;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;)V

    const-string p2, "0"

    iput-object p2, v1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object p2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    iput-object p1, v1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_9
    return-void

    :catchall_0
    move-exception p2

    iget-object v2, p0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iput-object p1, v1, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    :cond_a
    throw p2
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setUserProfile(String,String)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string p1, "userProperties check failed"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/ar;->klm()Lcom/huawei/hms/analytics/aq;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/huawei/hms/analytics/aq;->lmn(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "add userProper json exception"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Ljava/lang/String;Z)V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "instanceimpl"

    if-nez v0, :cond_0

    const-string p1, "IE-006"

    const-string p2, "The Analytics Kit is disabled"

    invoke-static {v1, p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "HiAnalyticsInstance#setPropertyCollection"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "property is empty"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_1
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/huawei/hms/analytics/an;->ikl:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string p2, "set property collection failed: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/hms/analytics/dh;->lmn(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez p2, :cond_5

    :goto_0
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_6

    const-string p2, ""

    :goto_2
    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/dh;->lmn(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :goto_4
    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/huawei/hms/analytics/type/ReportPolicy;",
            ">;)V"
        }
    .end annotation

    const-string v0, "HiAnalyticsInstance#setReportPolicies(Set<ReportPolicy>)"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/bp;->lmn()Lcom/huawei/hms/analytics/bp;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/huawei/hms/analytics/bp;->lmn(Ljava/util/Set;)V

    const-string p1, "0"

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    :try_start_1
    const-string p1, "instanceimpl"

    const-string v1, "decide policy exception"

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void

    :goto_0
    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw p1
.end method
