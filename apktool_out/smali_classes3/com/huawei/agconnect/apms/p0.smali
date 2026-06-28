.class public Lcom/huawei/agconnect/apms/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field public final abc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/q0;",
            ">;"
        }
    .end annotation
.end field

.field public bcd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/huawei/agconnect/apms/p0;->bcd:Ljava/lang/String;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
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
.end method

.method public static synthetic abc(Lcom/huawei/agconnect/apms/p0;Lcom/huawei/agconnect/apms/j0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/p0;->abc(Lcom/huawei/agconnect/apms/j0;)V

    return-void
.end method


# virtual methods
.method public final abc(Lcom/huawei/agconnect/apms/j0;)V
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 7
    check-cast v1, Lcom/huawei/agconnect/apms/m0;

    invoke-virtual {v1, p1}, Lcom/huawei/agconnect/apms/m0;->abc(Lcom/huawei/agconnect/apms/j0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abc(Lcom/huawei/agconnect/apms/q0;)V
    .locals 4

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/agconnect/apms/p0$abc;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/apms/p0$abc;-><init>(Lcom/huawei/agconnect/apms/p0;Lcom/huawei/agconnect/apms/q0;)V

    const-wide/16 v2, 0x1770

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized bcd(Lcom/huawei/agconnect/apms/q0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    .line 3
    .line 4
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    iget-object v1, p0, Lcom/huawei/agconnect/apms/p0;->abc:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 16
    :catchall_1
    move-exception p1

    .line 17
    monitor-exit p0

    .line 18
    throw p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public queueIdle()Z
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/j0;->bcd:Lcom/huawei/agconnect/apms/j0;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/p0;->abc(Lcom/huawei/agconnect/apms/j0;)V

    const/4 v0, 0x0

    return v0
.end method
