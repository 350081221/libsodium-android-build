.class public final Lcom/huawei/hms/analytics/ak$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/ak;

.field final synthetic lmn:Z


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/ak;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/ak$1;->klm:Lcom/huawei/hms/analytics/ak;

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/ak$1;->lmn:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/ak$1;->klm:Lcom/huawei/hms/analytics/ak;

    iget-object v1, v1, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    iget-boolean v1, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    iget-boolean v2, p0, Lcom/huawei/hms/analytics/ak$1;->lmn:Z

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iput-boolean v2, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/ak$1;->klm:Lcom/huawei/hms/analytics/ak;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ijk;->ijk:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "is_analytics_enabled"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/hms/analytics/ak$1;->klm:Lcom/huawei/hms/analytics/ak;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/hms/analytics/ak$1;->lmn:Z

    const-string v3, "global_v2"

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
