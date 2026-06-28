.class public final Lcom/huawei/hms/analytics/x$lmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "lmn"
.end annotation


# instance fields
.field private final ikl:Lcom/huawei/hms/analytics/w;

.field private klm:Z

.field private final lmn:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/w;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/x$lmn;->lmn:Ljava/util/concurrent/LinkedBlockingQueue;

    iput-object p1, p0, Lcom/huawei/hms/analytics/x$lmn;->ikl:Lcom/huawei/hms/analytics/w;

    return-void
.end method


# virtual methods
.method public final lmn()Landroid/os/IBinder;
    .locals 4

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/x$lmn;->klm:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/x$lmn;->klm:Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/x$lmn;->lmn:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/16 v1, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/x$lmn;->lmn:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, p2, v1, v2, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "idServiceConn"

    const-string p2, "onServiceConnected handler Ibinder error"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/x$lmn;->ikl:Lcom/huawei/hms/analytics/w;

    const-string p2, "getOaid error,begin get gaid"

    invoke-interface {p1, p2}, Lcom/huawei/hms/analytics/w;->lmn(Ljava/lang/String;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "idServiceConn"

    const-string v0, "onServiceDisconnected"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
