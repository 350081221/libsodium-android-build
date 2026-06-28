.class public abstract Lcom/lody/virtual/helper/utils/SchedulerTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mDelay:J

.field private mHandler:Landroid/os/Handler;

.field private final mInnerRunnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/os/Handler;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/helper/utils/SchedulerTask$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/lody/virtual/helper/utils/SchedulerTask$1;-><init>(Lcom/lody/virtual/helper/utils/SchedulerTask;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mInnerRunnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mHandler:Landroid/os/Handler;

    .line 12
    .line 13
    iput-wide p2, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mDelay:J

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method static synthetic access$000(Lcom/lody/virtual/helper/utils/SchedulerTask;)J
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mDelay:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/lody/virtual/helper/utils/SchedulerTask;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mHandler:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mInnerRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public schedule()V
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/lody/virtual/helper/utils/SchedulerTask;->mInnerRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
