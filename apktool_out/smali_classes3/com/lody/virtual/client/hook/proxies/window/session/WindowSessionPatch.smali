.class public Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplayAsUser;,
        Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplay;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/MethodInvocationStub<",
        "Landroid/os/IInterface;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final ADD_PERMISSION_DENIED:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/view/WindowManagerGlobal;->ADD_PERMISSION_DENIED:Lmirror/RefStaticInt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lmirror/RefStaticInt;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, -0x8

    .line 11
    :goto_0
    sput v0, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch;->ADD_PERMISSION_DENIED:I

    .line 12
    .line 13
    return-void
    .line 14
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

.method public constructor <init>(Landroid/os/IInterface;)V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    invoke-direct {v0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    sget v0, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch;->ADD_PERMISSION_DENIED:I

    return v0
.end method


# virtual methods
.method public inject()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

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
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 2
    .line 3
    const-string v1, "add"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplayAsUser;

    .line 12
    .line 13
    const-string v1, "addToDisplayAsUser"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplayAsUser;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplay;

    .line 22
    .line 23
    const-string v2, "addToDisplay"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/proxies/window/session/WindowSessionPatch$AddToDisplay;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 32
    .line 33
    const-string v2, "addToDisplayWithoutInputChannel"

    .line 34
    .line 35
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 42
    .line 43
    const-string v2, "addWithoutInputChannel"

    .line 44
    .line 45
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 52
    .line 53
    const-string v2, "relayout"

    .line 54
    .line 55
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v2, 0x1e

    .line 64
    .line 65
    if-lt v0, v2, :cond_0

    .line 66
    .line 67
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 68
    .line 69
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;

    .line 76
    .line 77
    const-string v1, "grantInputChannel"

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void
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
