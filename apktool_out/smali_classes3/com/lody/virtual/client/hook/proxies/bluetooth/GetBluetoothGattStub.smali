.class public Lcom/lody/virtual/client/hook/proxies/bluetooth/GetBluetoothGattStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/MethodInvocationStub<",
        "Landroid/os/IInterface;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-direct {v0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method


# virtual methods
.method public inject()V
    .locals 0

    return-void
.end method

.method public isEnvBad()Z
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 11
    .line 12
    const-string v1, "startScan"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 21
    .line 22
    const-string v1, "startScanForIntent"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 31
    .line 32
    const-string v1, "stopScanForIntent"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object v0, Lmirror/android/bluetooth/IBluetooth;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getAttributionSourceMethod(Ljava/lang/Class;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    new-instance v2, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v2, v1}, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-void
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
