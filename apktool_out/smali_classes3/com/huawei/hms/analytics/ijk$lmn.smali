.class public final Lcom/huawei/hms/analytics/ijk$lmn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/ijk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "lmn"
.end annotation


# instance fields
.field final synthetic lmn:Lcom/huawei/hms/analytics/ijk;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/ijk;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 11

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    const-string v1, "oper"

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->clearCacheData(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ijk;->ikl()V

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    iget-object v1, v1, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cy;->ikl(Landroid/content/Context;)V

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->ijk()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "createInstance"

    const-string v1, "bindService error"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ar;->ikl()Lcom/huawei/hms/analytics/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/aq;->ghi()V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ar;->klm()Lcom/huawei/hms/analytics/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/aq;->ghi()V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v1, ""

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->bcd:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->cde:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->t:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->s:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->o:Ljava/lang/String;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/huawei/hms/analytics/at;->p:Z

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->v:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/huawei/hms/analytics/at;->w:J

    iput-wide v1, v0, Lcom/huawei/hms/analytics/at;->q:J

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    const-string v3, "push_token"

    const-string v4, "ab_info"

    const-string v5, "w_app_id"

    const-string v6, "api_channel"

    const-string v7, "camp_info"

    const-string v8, "is_new_user"

    const-string v9, "sig_flg"

    const-string v10, "is_cs_refr_run"

    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "global_v2"

    invoke-static {v0, v4, v3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ijk;->lmn:Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;

    const/4 v3, 0x1

    invoke-interface {v0, v3}, Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;->setNeedRefreshSession(Z)V

    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v0

    iget-object v3, v0, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    iget-object v3, v0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    invoke-virtual {v3}, Lcom/huawei/hms/analytics/bcd$lmn;->lmn()V

    iget-object v3, v0, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hms/analytics/bcd$lmn;->lmn()V

    :cond_0
    iput-wide v1, v0, Lcom/huawei/hms/analytics/bcd;->ghi:J

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v1, v0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->clear()V

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/ijk$lmn;->lmn:Lcom/huawei/hms/analytics/ijk;

    const-string v1, "clearCachedData"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/ijk;->lmn(Lcom/huawei/hms/analytics/ijk;Ljava/lang/String;)V

    return-void
.end method
