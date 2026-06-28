.class public Lcom/lody/virtual/client/hook/proxies/am/MethodProxies$StartActivities;
.super Lcom/lody/virtual/client/hook/base/MethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/hook/proxies/am/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartActivities"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/client/hook/base/MethodProxy;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    .line 8
    .line 9
    const-class p1, [Landroid/content/Intent;

    .line 10
    .line 11
    invoke-static {p3, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->getFirst([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, [Landroid/content/Intent;

    .line 17
    .line 18
    const-class p1, [Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p3, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->getFirst([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, [Ljava/lang/String;

    .line 26
    .line 27
    const-class p1, Landroid/os/IBinder;

    .line 28
    .line 29
    const/4 p2, 0x2

    .line 30
    invoke-static {p3, p1, p2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->indexOfObject([Ljava/lang/Object;Ljava/lang/Class;I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 p2, -0x1

    .line 35
    if-eq p1, p2, :cond_0

    .line 36
    .line 37
    aget-object p1, p3, p1

    .line 38
    .line 39
    check-cast p1, Landroid/os/IBinder;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    :goto_0
    move-object v3, p1

    .line 44
    const-class p1, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-static {p3, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->getFirst([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    move-object v4, p1

    .line 51
    check-cast v4, Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/lody/virtual/client/VClient;->getCurrentPackage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-virtual/range {v0 .. v6}, Lcom/lody/virtual/client/ipc/VActivityManager;->startActivities([Landroid/content/Intent;[Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
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

    const-string v0, "startActivities"

    return-object v0
.end method

.method public isEnable()Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppProcess()Z

    move-result v0

    return v0
.end method
