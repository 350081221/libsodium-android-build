.class public final Lcom/huawei/hms/analytics/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/m$lmn;
    }
.end annotation


# instance fields
.field public ikl:Lcom/huawei/hms/analytics/l;

.field public klm:Landroid/content/ServiceConnection;

.field public lmn:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/m;->lmn:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 2

    const-string v0, "PpsServiceCommander"

    const-string v1, "ads unBindService.."

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/m;->lmn:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/m;->klm:Landroid/content/ServiceConnection;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    return-void
.end method
