.class public Lcom/huawei/agconnect/apms/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public abc:J

.field public bcd:J

.field public volatile cde:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field public def:Ljava/lang/String;

.field public efg:Ljava/util/UUID;

.field public fgh:J

.field public ghi:Ljava/lang/String;

.field public hij:I

.field public ijk:Z

.field public jkl:Lcom/huawei/agconnect/apms/t0;

.field public klm:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/huawei/agconnect/apms/c;->def:Ljava/lang/String;

    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/c;->fgh:J

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/apms/c;->ghi:Ljava/lang/String;

    .line 5
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 6
    new-instance v0, Ljava/util/UUID;

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/c;->efg:Ljava/util/UUID;

    .line 7
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/c;->abc()V

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/c;->ijk:Z

    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lcom/huawei/agconnect/apms/c;->hij:I

    .line 10
    iput p1, p0, Lcom/huawei/agconnect/apms/c;->klm:I

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/huawei/agconnect/apms/c;->jkl:Lcom/huawei/agconnect/apms/t0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 12
    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/c;->ijk:Z

    .line 14
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/huawei/agconnect/apms/h0;->bcd:Lcom/huawei/agconnect/apms/h0;

    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/h0;->cde:Lcom/huawei/agconnect/apms/h0;

    .line 16
    :goto_0
    iget v0, v0, Lcom/huawei/agconnect/apms/h0;->abc:I

    .line 17
    iput v0, p0, Lcom/huawei/agconnect/apms/c;->hij:I

    .line 18
    iput-object p1, p0, Lcom/huawei/agconnect/apms/c;->def:Ljava/lang/String;

    .line 19
    iput p2, p0, Lcom/huawei/agconnect/apms/c;->klm:I

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/c;->abc:J

    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/huawei/agconnect/apms/c;->jkl:Lcom/huawei/agconnect/apms/t0;

    return-void
.end method


# virtual methods
.method public final abc()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/c;->cde:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/c;->cde:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/c;->cde:Ljava/util/Set;

    .line 7
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public abc(I)V
    .locals 0

    return-void
.end method

.method public abc(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/huawei/agconnect/apms/c;->bcd:J

    return-void
.end method

.method public abc(Ljava/util/UUID;)V
    .locals 0

    return-void
.end method

.method public abc(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/c;->ijk:Z

    return-void
.end method
