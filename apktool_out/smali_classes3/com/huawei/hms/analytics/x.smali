.class final Lcom/huawei/hms/analytics/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/x$lmn;
    }
.end annotation


# instance fields
.field private ghi:Ljava/lang/String;

.field private hij:Ljava/lang/String;

.field private ijk:Landroid/content/Intent;

.field private final ikl:Lcom/huawei/hms/analytics/w;

.field klm:Lcom/huawei/hms/analytics/x$lmn;

.field final lmn:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/analytics/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/x;->lmn:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/x;->ijk:Landroid/content/Intent;

    iput-object p3, p0, Lcom/huawei/hms/analytics/x;->ikl:Lcom/huawei/hms/analytics/w;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/x;->lmn:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/x;->hij:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/x;->ghi:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/x;->ikl:Lcom/huawei/hms/analytics/w;

    return-void
.end method


# virtual methods
.method public final varargs lmn()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/x;->ijk:Landroid/content/Intent;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/hms/analytics/x;->hij:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/x;->ijk:Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/hms/analytics/x;->ghi:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    new-instance v0, Lcom/huawei/hms/analytics/x$lmn;

    iget-object v1, p0, Lcom/huawei/hms/analytics/x;->ikl:Lcom/huawei/hms/analytics/w;

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/x$lmn;-><init>(Lcom/huawei/hms/analytics/w;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/x;->klm:Lcom/huawei/hms/analytics/x$lmn;

    iget-object v1, p0, Lcom/huawei/hms/analytics/x;->lmn:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/analytics/x;->ijk:Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    const-string v1, "isBind: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oaidService"

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/x;->ikl:Lcom/huawei/hms/analytics/w;

    iget-object v1, p0, Lcom/huawei/hms/analytics/x;->klm:Lcom/huawei/hms/analytics/x$lmn;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/w;->lmn(Lcom/huawei/hms/analytics/x$lmn;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/analytics/x;->ikl:Lcom/huawei/hms/analytics/w;

    const-string v1, "bindService fail,begin get gaid"

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/w;->lmn(Ljava/lang/String;)V

    return-void
.end method
