.class Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "IBluetoothProfileServiceConnectionStub"
.end annotation

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
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub$1;

    .line 5
    .line 6
    const-string v1, "onServiceConnected"

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
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
