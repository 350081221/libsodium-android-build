.class final Lcom/huawei/hms/analytics/bp$lmn;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/bp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "lmn"
.end annotation


# instance fields
.field private ikl:J

.field private klm:Ljava/util/Timer;

.field final synthetic lmn:Lcom/huawei/hms/analytics/bp;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bp;)V
    .locals 2

    iput-object p1, p0, Lcom/huawei/hms/analytics/bp$lmn;->lmn:Lcom/huawei/hms/analytics/bp;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->ikl:J

    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bp$lmn;->klm:Ljava/util/Timer;

    return-void
.end method


# virtual methods
.method public final klm(J)Z
    .locals 4

    iget-wide v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->ikl:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final lmn()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->klm:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->klm:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->klm:Ljava/util/Timer;

    return-void
.end method

.method public final lmn(J)V
    .locals 8

    iput-wide p1, p0, Lcom/huawei/hms/analytics/bp$lmn;->ikl:J

    const-wide/16 v0, 0x3e8

    mul-long v6, p1, v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/bp$lmn;->klm:Ljava/util/Timer;

    move-object v3, p0

    move-wide v4, v6

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final run()V
    .locals 2

    const-string v0, "PoliceCommander"

    const-string v1, "Timer report timer running"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->lmn:Lcom/huawei/hms/analytics/bp;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bp;->lmn(Lcom/huawei/hms/analytics/bp;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->lmn:Lcom/huawei/hms/analytics/bp;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bp;->lmn(Lcom/huawei/hms/analytics/bp;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->lmn()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bp$lmn;->lmn:Lcom/huawei/hms/analytics/bp;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bp;->lmn(Lcom/huawei/hms/analytics/bp;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->klm()V

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/fgh;->klm()V

    return-void
.end method
