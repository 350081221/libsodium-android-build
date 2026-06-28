.class public Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
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
.field private static sActivityClientControllerProxy:Landroid/os/IInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    sget-object v1, Lmirror/android/app/ActivityClient;->getActivityClientController:Lmirror/RefStaticMethod;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method

.method public static getProxyInterface()Landroid/os/IInterface;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;->sActivityClientControllerProxy:Landroid/os/IInterface;

    return-object v0
.end method


# virtual methods
.method public inject()V
    .locals 3

    .line 1
    sget-object v0, Lmirror/android/app/ActivityClient;->INTERFACE_SINGLETON:Lmirror/RefStaticObject;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lmirror/android/app/ActivityClient$ActivityClientControllerSingleton;->mKnownInstance:Lmirror/RefObject;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lmirror/android/app/ActivityClient;->INTERFACE_SINGLETON:Lmirror/RefStaticObject;

    .line 10
    .line 11
    invoke-virtual {v1}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/os/IInterface;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object v0, Lmirror/android/util/Singleton;->mInstance:Lmirror/RefObject;

    .line 29
    .line 30
    sget-object v1, Lmirror/android/app/ActivityClient;->INTERFACE_SINGLETON:Lmirror/RefStaticObject;

    .line 31
    .line 32
    invoke-virtual {v1}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/os/IInterface;

    .line 56
    .line 57
    sput-object v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;->sActivityClientControllerProxy:Landroid/os/IInterface;

    .line 58
    .line 59
    :cond_1
    return-void
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

.method public isEnvBad()Z
    .locals 3

    sget-object v0, Lmirror/android/app/ActivityClient;->getActivityClientController:Lmirror/RefStaticMethod;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    move-result-object v2

    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    move-result-object v2

    if-eq v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$1;

    .line 5
    .line 6
    const-string v1, "activityDestroyed"

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$2;

    .line 15
    .line 16
    const-string v1, "activityResumed"

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$3;

    .line 25
    .line 26
    const-string v1, "finishActivity"

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$3;-><init>(Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$4;

    .line 35
    .line 36
    const-string v1, "finishActivityAffinity"

    .line 37
    .line 38
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$4;-><init>(Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isSamsung()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$5;

    .line 51
    .line 52
    const-string v1, "startAppLockService"

    .line 53
    .line 54
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub$5;-><init>(Lcom/lody/virtual/client/hook/proxies/app/ActivityClientControllerStub;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
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
