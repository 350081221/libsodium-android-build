.class public Lcom/lody/virtual/client/hook/proxies/libcore/LibCoreStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/libcore/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/MethodInvocationStub<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/libcore/LibCoreStub;->getOs()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method

.method private static getOs()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lmirror/libcore/io/Libcore;->os:Lmirror/RefStaticObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lmirror/libcore/io/ForwardingOs;->os:Lmirror/RefObject;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object v0, v1

    .line 18
    :cond_0
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public inject()V
    .locals 2

    sget-object v0, Lmirror/libcore/io/Libcore;->os:Lmirror/RefStaticObject;

    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    move-result-object v1

    invoke-virtual {v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmirror/RefStaticObject;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public isEnvBad()Z
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/libcore/LibCoreStub;->getOs()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    move-result-object v1

    invoke-virtual {v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onBindMethods()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;

    .line 5
    .line 6
    const-string v1, "chown"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;

    .line 16
    .line 17
    const-string v1, "fchown"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;

    .line 26
    .line 27
    const-string v1, "getpwuid"

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 34
    .line 35
    .line 36
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;

    .line 37
    .line 38
    const-string v1, "lchown"

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 44
    .line 45
    .line 46
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;

    .line 47
    .line 48
    const-string v1, "setuid"

    .line 49
    .line 50
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ReplaceUidMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 54
    .line 55
    .line 56
    return-void
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
