.class Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies$GetActivityInfo;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/pm/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GetActivityInfo"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    .line 3
    .line 4
    check-cast v0, Landroid/content/ComponentName;

    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    aget-object v2, p3, v2

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getIntOrLongValue(Ljava/lang/Object;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    long-to-int v2, v2

    .line 37
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v0, v2, v1}, Lcom/lody/virtual/client/ipc/VPackageManager;->getActivityInfo(Landroid/content/ComponentName;II)Landroid/content/pm/ActivityInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    invoke-static {p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->replaceLastUserId([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    move-object v0, p1

    .line 55
    check-cast v0, Landroid/content/pm/ActivityInfo;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object p1, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isOutsidePackage(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v0}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixOutsideComponentInfo(Landroid/content/pm/ComponentInfo;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 73
    return-object p1

    .line 74
    :cond_3
    :goto_1
    return-object v0
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

.method public getMethodName()Ljava/lang/String;
    .locals 1

    const-string v0, "getActivityInfo"

    return-object v0
.end method

.method public isEnable()Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppProcess()Z

    move-result v0

    return v0
.end method
