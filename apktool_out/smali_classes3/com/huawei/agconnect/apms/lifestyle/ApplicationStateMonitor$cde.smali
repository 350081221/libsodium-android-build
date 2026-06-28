.class public Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->activityStopped()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;->abc:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;->abc:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->access$200(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;->abc:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->uiHidden()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
.end method
