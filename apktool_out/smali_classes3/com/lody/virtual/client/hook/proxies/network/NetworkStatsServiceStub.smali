.class public Lcom/lody/virtual/client/hook/proxies/network/NetworkStatsServiceStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# static fields
.field private static final SERVER_NAME:Ljava/lang/String; = "netstats"


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/net/INetworkStatsService$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "netstats"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public inject()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->inject()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lmirror/android/net/TrafficStats;->sStatsService()Landroid/os/IInterface;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/os/IInterface;

    .line 21
    .line 22
    invoke-static {v0}, Lmirror/android/net/TrafficStats;->sStatsService(Landroid/os/IInterface;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 5
    .line 6
    const-string v1, "incrementOperationCount"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 15
    .line 16
    const-string v1, "getUidStats"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 25
    .line 26
    const-string v1, "getDataLayerSnapshotForUid"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 35
    .line 36
    const-string v1, "registerUsageCallback"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 45
    .line 46
    const-string v1, "openSessionForUsageStats"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
