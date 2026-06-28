.class Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$3;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;->onBindMethods()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;


# direct methods
.method constructor <init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$3;->this$0:Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;

    invoke-direct {p0, p2}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
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
    check-cast v0, Landroid/os/IBinder;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    aget-object v2, p3, v1

    .line 8
    .line 9
    check-cast v2, Landroid/content/Intent;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-static {v3, v4, v2}, Lcom/lody/virtual/helper/utils/ComponentUtils;->processOutsideIntent(IZLandroid/content/Intent;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aput-object v2, p3, v1

    .line 30
    .line 31
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v0}, Lcom/lody/virtual/client/ipc/VActivityManager;->onFinishActivity(Landroid/os/IBinder;)V

    .line 36
    .line 37
    .line 38
    invoke-super {p0, p1, p2, p3}, Lcom/lody/virtual/client/hook/base/MethodProxy;->call(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
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

.method public isEnable()Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isAppProcess()Z

    move-result v0

    return v0
.end method
