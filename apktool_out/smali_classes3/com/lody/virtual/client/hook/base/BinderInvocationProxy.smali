.class public abstract Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/BinderInvocationStub;",
        ">;"
    }
.end annotation


# instance fields
.field protected mServiceName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/IInterface;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    invoke-direct {v0, p1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;-><init>(Landroid/os/IInterface;)V

    invoke-direct {p0, v0, p2}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/BinderInvocationStub;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/lody/virtual/client/hook/base/BinderInvocationStub;Ljava/lang/String;)V
    .locals 2

    .line 4
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    .line 5
    invoke-virtual {p1}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getBaseInterface()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p1, v0

    const-string v0, "BinderInvocationProxy"

    const-string v1, "Unable to build HookDelegate: %s."

    .line 6
    invoke-static {v0, v1, p1}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    :cond_0
    iput-object p2, p0, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->mServiceName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    new-instance v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    invoke-static {p2}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;-><init>(Ljava/lang/Class;Landroid/os/IBinder;)V

    invoke-direct {p0, v0, p2}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/BinderInvocationStub;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmirror/RefStaticMethod<",
            "Landroid/os/IInterface;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    invoke-static {p2}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;-><init>(Lmirror/RefStaticMethod;Landroid/os/IBinder;)V

    invoke-direct {p0, v0, p2}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/BinderInvocationStub;Ljava/lang/String;)V

    return-void
.end method

.method public static getService(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 3

    sget-object v0, Lmirror/android/os/ServiceManager;->getService:Lmirror/RefStaticMethod;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v0, v1}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    return-object p0
.end method


# virtual methods
.method public inject()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    iget-object v1, p0, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->mServiceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;->replaceService(Ljava/lang/String;)V

    return-void
.end method

.method public isEnvBad()Z
    .locals 5

    .line 1
    sget-object v0, Lmirror/android/os/ServiceManager;->getService:Lmirror/RefStaticMethod;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->mServiceName:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/os/IBinder;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eq v2, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v4

    .line 27
    :goto_0
    return v1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
