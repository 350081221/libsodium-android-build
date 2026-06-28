.class public Lcom/huawei/agconnect/apms/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final abc:Ljava/lang/Object;

.field public bcd:Z

.field public final cde:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/huawei/agconnect/apms/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/m;->abc:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/m;->bcd:Z

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/k;)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/m;->abc()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/m;->bcd()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/agconnect/apms/l;

    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/l;->bcd(Lcom/huawei/agconnect/apms/k;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abc(Lcom/huawei/agconnect/apms/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final abc()Z
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/huawei/agconnect/apms/m;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/m;->cde()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v2, 0x1

    .line 9
    iput-boolean v2, p0, Lcom/huawei/agconnect/apms/m;->bcd:Z

    .line 10
    :cond_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bcd()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/l;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    monitor-enter v0

    .line 8
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    iget-object v2, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 10
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public bcd(Lcom/huawei/agconnect/apms/k;)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/m;->abc()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/m;->bcd()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/agconnect/apms/l;

    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/l;->abc(Lcom/huawei/agconnect/apms/k;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bcd(Lcom/huawei/agconnect/apms/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/m;->cde:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public cde()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/m;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/huawei/agconnect/apms/m;->bcd:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
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
.end method
