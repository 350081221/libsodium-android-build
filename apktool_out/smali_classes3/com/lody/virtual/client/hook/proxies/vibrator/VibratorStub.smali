.class public Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub;
.super Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lmirror/com/android/internal/os/IVibratorManagerService$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lmirror/com/android/internal/os/IVibratorService$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 11
    .line 12
    :goto_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-string v1, "vibrator_manager"

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const-string v1, "vibrator"

    .line 22
    .line 23
    :goto_1
    invoke-direct {p0, v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationProxy;-><init>(Lmirror/RefStaticMethod;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
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


# virtual methods
.method protected onBindMethods()V
    .locals 3

    .line 1
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;

    .line 2
    .line 3
    const-string v1, "vibrateMagnitude"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;-><init>(Ljava/lang/String;Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$1;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;

    .line 13
    .line 14
    const-string v1, "vibratePatternMagnitude"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;-><init>(Ljava/lang/String;Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;

    .line 23
    .line 24
    const-string v1, "vibrate"

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;-><init>(Ljava/lang/String;Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$1;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;

    .line 33
    .line 34
    const-string v1, "vibratePattern"

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$VibrateMethodProxy;-><init>(Ljava/lang/String;Lcom/lody/virtual/client/hook/proxies/vibrator/VibratorStub$1;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 40
    .line 41
    .line 42
    return-void
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
