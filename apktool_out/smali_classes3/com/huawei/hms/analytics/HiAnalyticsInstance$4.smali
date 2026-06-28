.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->setRestrictionEnabled(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

.field final synthetic lmn:Z


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;->klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;->lmn:Z

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

    iget-boolean v1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;->lmn:Z

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/bi;->hij(Z)V

    :cond_0
    return-void
.end method
