.class public Lcom/huawei/agconnect/apms/instrument/TraceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static traceEventListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 13
    .line 14
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addListener(Lcom/huawei/agconnect/apms/b;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
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

.method public static clearListener()V
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 13
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
.end method

.method public static enterMethod(Ljava/lang/String;Lcom/huawei/agconnect/apms/i0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/huawei/agconnect/apms/c;

    .line 12
    .line 13
    iget p1, p1, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->notifyToEnterMethod(Lcom/huawei/agconnect/apms/c;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lcom/huawei/agconnect/apms/c;

    .line 23
    .line 24
    iget p1, p1, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->notifyToAsyncEnterMethod(Lcom/huawei/agconnect/apms/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    sget-object p1, Lcom/huawei/agconnect/apms/instrument/TraceManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 35
    .line 36
    const-string v0, "something error happened in enter method: "

    .line 37
    .line 38
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static exitMethod()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->notifyToExitMethod()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    sget-object v1, Lcom/huawei/agconnect/apms/instrument/TraceManager;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 7
    .line 8
    const-string v2, "something error happened in exit method: "

    .line 9
    .line 10
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static notifyToAddNetworkInfoToTrace(Lcom/huawei/agconnect/apms/t0;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/huawei/agconnect/apms/n0;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-boolean v2, v1, Lcom/huawei/agconnect/apms/m0;->def:Z

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/m0;->bcd()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v2, v1, Lcom/huawei/agconnect/apms/m0;->abc:Lcom/huawei/agconnect/apms/o0;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/o0;->abc()Lcom/huawei/agconnect/apms/c;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    iput-object p0, v2, Lcom/huawei/agconnect/apms/c;->jkl:Lcom/huawei/agconnect/apms/t0;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/m0;->abc(Lcom/huawei/agconnect/apms/c;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, v1, Lcom/huawei/agconnect/apms/m0;->def:Z

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    iget-object v1, v1, Lcom/huawei/agconnect/apms/m0;->cde:Lcom/huawei/agconnect/apms/g0;

    .line 54
    .line 55
    sget-object v3, Lcom/huawei/agconnect/apms/g0;->cde:Lcom/huawei/agconnect/apms/g0;

    .line 56
    .line 57
    if-ne v1, v3, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-virtual {v2, v1}, Lcom/huawei/agconnect/apms/c;->abc(Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static notifyToAsyncEnterMethod(Lcom/huawei/agconnect/apms/c;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/huawei/agconnect/apms/c;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/huawei/agconnect/apms/c;->def:Ljava/lang/String;

    .line 20
    .line 21
    iget v4, p0, Lcom/huawei/agconnect/apms/c;->klm:I

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Lcom/huawei/agconnect/apms/n0;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/m0;->bcd(Lcom/huawei/agconnect/apms/c;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static notifyToEnterMethod(Lcom/huawei/agconnect/apms/c;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/huawei/agconnect/apms/c;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/huawei/agconnect/apms/c;->def:Ljava/lang/String;

    .line 20
    .line 21
    iget v4, p0, Lcom/huawei/agconnect/apms/c;->klm:I

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    check-cast v1, Lcom/huawei/agconnect/apms/n0;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static notifyToExitMethod()V
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/instrument/TraceManager;->traceEventListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/huawei/agconnect/apms/n0;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/n0;->abc()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public static startActivityTrace(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateBegin(Ljava/lang/String;)V

    return-void
.end method
