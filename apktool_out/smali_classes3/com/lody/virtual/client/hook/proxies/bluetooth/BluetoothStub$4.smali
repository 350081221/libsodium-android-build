.class Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;
.super Landroid/bluetooth/IBluetoothManagerCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;->hookBluetoothAdapter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;

.field final synthetic val$callback:Landroid/bluetooth/IBluetoothManagerCallback;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;Landroid/bluetooth/IBluetoothManagerCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;->this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;

    iput-object p2, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;->val$callback:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-direct {p0}, Landroid/bluetooth/IBluetoothManagerCallback$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onBluetoothServiceDown()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;->val$callback:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothServiceDown()V

    return-void
.end method

.method public onBluetoothServiceUp(Landroid/bluetooth/IBluetooth;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/lody/virtual/client/hook/proxies/bluetooth/RegisterAdapterStub;-><init>(Landroid/bluetooth/IBluetooth;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/bluetooth/IBluetooth;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;->val$callback:Landroid/bluetooth/IBluetoothManagerCallback;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothServiceUp(Landroid/bluetooth/IBluetooth;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onBrEdrDown()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$4;->val$callback:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBrEdrDown()V

    return-void
.end method
