.class public abstract Lcom/huawei/hms/analytics/cw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ghi:Ljava/lang/String;

.field private final hij:Ljava/lang/String;

.field private final ijk:Lcom/huawei/hms/analytics/bh;

.field protected ikl:Landroid/content/Context;

.field protected klm:Z

.field protected lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cw;->ijk:Lcom/huawei/hms/analytics/bh;

    iput-object p2, p0, Lcom/huawei/hms/analytics/cw;->hij:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/cw;->ghi:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p1, p1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    iput-object p1, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public abstract klm()Z
.end method

.method public abstract lmn()J
.end method

.method public final lmn(Lcom/huawei/hms/analytics/cv;)V
    .locals 7

    iget-object v0, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->ghi:Ljava/lang/String;

    const-string v2, "global_v2"

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/hms/analytics/dg;->ghi(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/huawei/hms/analytics/cw;->klm:Z

    const/4 v4, 0x1

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    move v3, v4

    :cond_1
    if-nez v3, :cond_2

    return-void

    :cond_2
    new-instance v0, Lcom/huawei/hms/analytics/dj;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->hij:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/cv;->lmn()Landroid/os/Bundle;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cw;->lmn()J

    move-result-wide v5

    iget-boolean p1, p0, Lcom/huawei/hms/analytics/cw;->klm:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->lmn:Ljava/lang/String;

    const-string v1, "debugview referrer event"

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->ijk:Lcom/huawei/hms/analytics/bh;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->hij:Ljava/lang/String;

    invoke-interface {p1, v1, v0, v5, v6}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->lmn:Ljava/lang/String;

    const-string v1, "normal referrer event"

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cw;->klm()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->ijk:Lcom/huawei/hms/analytics/bh;

    check-cast p1, Lcom/huawei/hms/analytics/ghi;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->hij:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v5, v6}, Lcom/huawei/hms/analytics/ijk;->klm(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->ijk:Lcom/huawei/hms/analytics/bh;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cw;->hij:Ljava/lang/String;

    invoke-interface {p1, v1, v0, v5, v6}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    :goto_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/cw;->ikl:Landroid/content/Context;

    iget-object v0, p0, Lcom/huawei/hms/analytics/cw;->ghi:Ljava/lang/String;

    invoke-static {p1, v2, v0, v4}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
