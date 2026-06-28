.class final Lcom/huawei/hms/analytics/connector/ConnectorManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/connector/ConnectorManager;->onReport()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lmn:Lcom/huawei/hms/analytics/connector/ConnectorManager;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/connector/ConnectorManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;->lmn:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;->lmn:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-static {v1}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    if-nez v0, :cond_0

    const-string v0, "IE-006"

    const-string v1, "The Analytics Kit is disabled"

    const-string v2, "InteractionManager"

    invoke-static {v2, v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;->lmn:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-static {v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/ba;->klm(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;->lmn:Lcom/huawei/hms/analytics/connector/ConnectorManager;

    invoke-static {v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Lcom/huawei/hms/analytics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/ijk;->lmn()V

    :cond_1
    return-void
.end method
