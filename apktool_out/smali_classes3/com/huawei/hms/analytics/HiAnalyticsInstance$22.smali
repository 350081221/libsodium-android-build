.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->addDefaultEventParams(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

.field final synthetic lmn:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;->klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    iput-object p2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;->lmn:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm()Lcom/huawei/hms/analytics/bi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;->lmn:Landroid/os/Bundle;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/bi;->lmn(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
