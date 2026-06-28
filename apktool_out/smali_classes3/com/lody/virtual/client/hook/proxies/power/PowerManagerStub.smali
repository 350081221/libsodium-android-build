.class public Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/os/IPowerManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "power"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;->replaceWorkSource([Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;->onHandleError(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private onHandleError(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/lang/SecurityException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private replaceWorkSource([Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    instance-of v1, v1, Landroid/os/WorkSource;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object v1, p1, v0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "wakeUp"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$1;

    .line 15
    .line 16
    const-string v1, "acquireWakeLock"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v0, p0, v1, v2}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$2;

    .line 26
    .line 27
    const-string v1, "acquireWakeLockWithUid"

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$3;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "updateWakeLockWorkSource"

    .line 43
    .line 44
    invoke-direct {v0, p0, v2, v1}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$3;-><init>(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 48
    .line 49
    .line 50
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 51
    .line 52
    const-string v1, "FUJITSU"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$4;

    .line 61
    .line 62
    const-string v1, "acquireWakeLockWithLogging"

    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub$4;-><init>(Lcom/lody/virtual/client/hook/proxies/power/PowerManagerStub;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
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
