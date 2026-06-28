.class final Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/HiAnalyticsInstance;->onNewIntent(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

.field final synthetic lmn:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;->klm:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    iput-object p2, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;->lmn:Landroid/content/Intent;

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

    iget-object v1, p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;->lmn:Landroid/content/Intent;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/bi;->lmn(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
