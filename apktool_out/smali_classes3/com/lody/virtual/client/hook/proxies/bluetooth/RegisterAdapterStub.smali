.class public Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub$getAddress;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/MethodInvocationStub<",
        "Landroid/bluetooth/IBluetooth;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/bluetooth/IBluetooth;)V
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
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub$getAddress;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub$getAddress;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const-class v0, Landroid/bluetooth/IBluetooth;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getAttributionSourceMethod(Ljava/lang/Class;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    new-instance v2, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v2, v1}, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-void
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
