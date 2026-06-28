.class Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub$IBluetoothHeadsetStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationStub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/bluetooth/BluetoothStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "IBluetoothHeadsetStub"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;-><init>(Landroid/os/IInterface;)V

    .line 2
    .line 3
    .line 4
    const-class p1, Landroid/bluetooth/IBluetooth;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/lody/virtual/client/hook/utils/MethodParameterUtils;->getAttributionSourceMethod(Ljava/lang/Class;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    new-instance v1, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v1, v0}, Lcom/lody/virtual/client/hook/base/FixAttributionSourceMethodProxy;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
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
