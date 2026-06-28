.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->clearCachedData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$12;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm()Lcom/huawei/hms/analytics/bi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->ghi()V

    :cond_0
    return-void
.end method
