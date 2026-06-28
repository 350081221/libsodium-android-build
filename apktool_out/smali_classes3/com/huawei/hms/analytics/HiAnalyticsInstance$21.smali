.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->setSessionDuration(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

.field final synthetic lmn:J


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;->klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    iput-wide p2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;->lmn:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm()Lcom/huawei/hms/analytics/bi;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;->lmn:J

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/bi;->ijk(J)V

    :cond_0
    return-void
.end method
