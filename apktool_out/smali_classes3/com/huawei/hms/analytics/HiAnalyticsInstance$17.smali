.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->setPropertyCollection(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ikl:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

.field final synthetic klm:Z

.field final synthetic lmn:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;->ikl:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    iput-object p2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;->lmn:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;->klm:Z

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

    iget-object v1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;->lmn:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;->klm:Z

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/bi;->lmn(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
