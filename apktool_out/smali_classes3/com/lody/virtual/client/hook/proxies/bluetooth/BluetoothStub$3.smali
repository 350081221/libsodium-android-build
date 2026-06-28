.class Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$3;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$3;->this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    .line 3
    .line 4
    instance-of v1, v0, Ljava/lang/Integer;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    aget-object v0, p3, v1

    .line 18
    .line 19
    instance-of v2, v0, Landroid/os/IInterface;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    check-cast v0, Landroid/os/IInterface;

    .line 24
    .line 25
    new-instance v2, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;-><init>(Landroid/os/IInterface;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    aput-object v0, p3, v1

    .line 39
    .line 40
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
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
.end method
