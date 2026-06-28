.class final Lcom/huawei/hms/analytics/connector/ConnectorManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/connector/ConnectorManager;->onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ikl:Lcom/huawei/hms/analytics/connector/ConnectorManager;

.field final synthetic klm:Landroid/os/Bundle;

.field final synthetic lmn:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/connector/ConnectorManager;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->ikl:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    iput-object p2, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->lmn:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->klm:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->ikl:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-static {v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/ba;->klm(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->ikl:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-static {v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Lcom/huawei/hms/analytics/ak;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->lmn:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;->klm:Landroid/os/Bundle;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v3

    iget-object v3, v3, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v3, v3, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v4, "interactionInstance"

    if-eqz v3, :cond_5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v3

    iget-object v5, v0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v3

    iget-boolean v3, v3, Lcom/huawei/hms/analytics/au;->ikl:Z

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v0, "PE-001"

    const-string v1, " param is null"

    invoke-static {v4, v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    if-nez v2, :cond_2

    const-string v2, "bundle is null"

    invoke-static {v4, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    :goto_0
    new-instance v3, Lcom/huawei/hms/analytics/dj;

    iget-object v5, v0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-direct {v3, v1, v5}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/huawei/hms/analytics/an;->klm:Ljava/util/List;

    invoke-static {v1, v5}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    invoke-static {v1, v5}, Lcom/huawei/hms/analytics/dc;->lmn(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v3, v2}, Lcom/huawei/hms/analytics/dj;->lmn(Landroid/os/Bundle;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v0, "PE-006"

    const-string v1, "bundle params is invalid."

    invoke-static {v4, v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/huawei/hms/analytics/ijk;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    return-void

    :cond_4
    invoke-virtual {v3, v2}, Lcom/huawei/hms/analytics/dj;->ikl(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v3}, Lcom/huawei/hms/analytics/ijk;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;)V

    goto :goto_2

    :cond_5
    :goto_1
    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v4, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method
