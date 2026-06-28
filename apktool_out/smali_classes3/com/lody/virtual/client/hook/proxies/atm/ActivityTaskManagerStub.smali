.class public Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1d
.end annotation

.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/atm/MethodProxies;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lmirror/android/app/IActivityTaskManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 2
    .line 3
    const-string v1, "activity_task"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v0, "android.app.ActivityTaskManager"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "IActivityTaskManagerSingleton"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/utils/Reflect;->field(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/Reflect;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lmirror/android/util/Singleton;->mInstance:Lmirror/RefObject;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
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


# virtual methods
.method protected onBindMethods()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$1;

    .line 5
    .line 6
    const-string v1, "activityDestroyed"

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$2;

    .line 15
    .line 16
    const-string v1, "activityResumed"

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$3;

    .line 25
    .line 26
    const-string v1, "finishActivity"

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$3;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$4;

    .line 35
    .line 36
    const-string v1, "finishActivityAffinity"

    .line 37
    .line 38
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$4;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

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
    const-string v1, "startAppLockService"

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$5;

    .line 53
    .line 54
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$5;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 58
    .line 59
    .line 60
    :cond_0
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$6;

    .line 61
    .line 62
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub$6;-><init>(Lcom/lody/virtual/client/hook/proxies/atm/ActivityTaskManagerStub;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 66
    .line 67
    .line 68
    return-void
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
