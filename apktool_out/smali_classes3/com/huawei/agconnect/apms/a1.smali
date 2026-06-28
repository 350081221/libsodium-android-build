.class public Lcom/huawei/agconnect/apms/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public final abc:Ljava/lang/Object;

.field public bcd:Lcom/huawei/agconnect/apms/log/AgentLog;


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
    iput-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lcom/huawei/agconnect/apms/z0;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/z0;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

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

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {v1, p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getLevel()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 5
    .line 6
    invoke-interface {v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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

.method public info(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public setLevel(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->setLevel(I)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public warn(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/a1;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/a1;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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
