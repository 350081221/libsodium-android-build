.class Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub$1;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub$1;->this$0:Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothProfileServiceConnectionStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    aget-object v1, p3, v0

    .line 3
    .line 4
    instance-of v2, v1, Landroid/os/IBinder;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    check-cast v1, Landroid/os/IBinder;

    .line 9
    .line 10
    new-instance v2, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothHeadsetStub;

    .line 11
    .line 12
    sget-object v3, Lmirror/android/bluetooth/IBluetoothHeadset$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 13
    .line 14
    new-array v4, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v1, v4, v5

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/os/IInterface;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothHeadsetStub;-><init>(Landroid/os/IInterface;)V

    .line 26
    .line 27
    .line 28
    aput-object v2, p3, v0

    .line 29
    .line 30
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
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
.end method
