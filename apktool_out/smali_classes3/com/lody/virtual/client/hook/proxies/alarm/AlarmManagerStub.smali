.class public Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$Set;,
        Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$SetTime;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lmirror/android/app/IAlarmManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    const-string v1, "alarm"

    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public inject()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;->inject()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "alarm"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/app/AlarmManager;

    .line 19
    .line 20
    sget-object v1, Lmirror/android/app/AlarmManager;->mService:Lmirror/RefObject;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroid/os/IInterface;

    .line 35
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
    :cond_0
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

.method protected onBindMethods()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$Set;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$Set;-><init>(Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$1;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$SetTime;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$SetTime;-><init>(Lcom/lody/virtual/client/hook/proxies/alarm/AlarmManagerStub$1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 22
    .line 23
    const-string v2, "removeAll"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;

    .line 32
    .line 33
    const-string v2, "getNextAlarmClock"

    .line 34
    .line 35
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/hook/base/ReplaceFirstUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 42
    .line 43
    const-string v2, "setTimeZone"

    .line 44
    .line 45
    invoke-direct {v0, v2, v1}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 52
    .line 53
    const-string v1, "canScheduleExactAlarms"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;

    .line 62
    .line 63
    const-string v1, "hasScheduleExactAlarm"

    .line 64
    .line 65
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgAndLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 69
    .line 70
    .line 71
    return-void
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
