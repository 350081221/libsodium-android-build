.class public Lio/busniess/va/delegate/MyComponentDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lody/virtual/client/core/AppCallback;


# static fields
.field private static final sTrace:Z = false


# instance fields
.field TAG:Ljava/lang/String;

.field hookedClasses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field vLocation:Lcom/lody/virtual/remote/vloc/VLocation;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "xxposed"

    .line 5
    .line 6
    iput-object v0, p0, Lio/busniess/va/delegate/MyComponentDelegate;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lio/busniess/va/delegate/MyComponentDelegate;->hookedClasses:Ljava/util/Set;

    .line 14
    .line 15
    invoke-static {}, Lcom/lody/virtual/client/ipc/VLocationManager;->get()Lcom/lody/virtual/client/ipc/VLocationManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/lody/virtual/client/ipc/VLocationManager;->getCurAppLocation()Lcom/lody/virtual/remote/vloc/VLocation;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lio/busniess/va/delegate/MyComponentDelegate;->vLocation:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 24
    .line 25
    return-void
    .line 26
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
.method public afterActivityOnCreate(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public afterActivityOnDestroy(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public afterActivityOnResume(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public afterActivityOnStart(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public afterActivityOnStop(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public afterApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string p3, "com.tencent.mm"

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isFakeLocationEnable()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x5

    .line 20
    new-array p1, p1, [Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    const-class v0, Ljava/lang/String;

    .line 24
    .line 25
    aput-object v0, p1, p3

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aput-object v0, p1, v1

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    aput-object v0, p1, v2

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    const-class v2, Ljava/lang/ClassLoader;

    .line 35
    .line 36
    aput-object v2, p1, v0

    .line 37
    .line 38
    new-instance v0, Lio/busniess/va/delegate/MyComponentDelegate$2;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lio/busniess/va/delegate/MyComponentDelegate$2;-><init>(Lio/busniess/va/delegate/MyComponentDelegate;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    aput-object v0, p1, v2

    .line 45
    .line 46
    const-class v0, Ldalvik/system/DexClassLoader;

    .line 47
    .line 48
    invoke-static {v0, p1}, Lu/dont/know/what/i/am/k;->k(Ljava/lang/Class;[Ljava/lang/Object;)Lu/dont/know/what/i/am/g$b;

    .line 49
    .line 50
    .line 51
    :try_start_0
    const-string p1, "c.t.m.sapp.c.f"

    .line 52
    .line 53
    const-string v0, "a"

    .line 54
    .line 55
    new-array v1, v1, [Ljava/lang/Object;

    .line 56
    .line 57
    new-instance v2, Lio/busniess/va/delegate/MyComponentDelegate$3;

    .line 58
    .line 59
    invoke-direct {v2, p0}, Lio/busniess/va/delegate/MyComponentDelegate$3;-><init>(Lio/busniess/va/delegate/MyComponentDelegate;)V

    .line 60
    .line 61
    .line 62
    aput-object v2, v1, p3

    .line 63
    .line 64
    invoke-static {p1, p2, v0, v1}, Lu/dont/know/what/i/am/k;->n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lu/dont/know/what/i/am/g$b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    :catch_0
    :cond_0
    return-void
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

.method public beforeActivityOnCreate(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public beforeActivityOnDestroy(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public beforeActivityOnResume(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public beforeActivityOnStart(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public beforeActivityOnStop(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public beforeApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V
    .locals 0

    .line 1
    const-string p2, "com.tencent.mm"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->isFakeLocationEnable()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    new-array p1, p1, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const-class p3, Landroid/os/Message;

    .line 20
    .line 21
    aput-object p3, p1, p2

    .line 22
    .line 23
    new-instance p2, Lio/busniess/va/delegate/MyComponentDelegate$1;

    .line 24
    .line 25
    invoke-direct {p2, p0}, Lio/busniess/va/delegate/MyComponentDelegate$1;-><init>(Lio/busniess/va/delegate/MyComponentDelegate;)V

    .line 26
    .line 27
    .line 28
    const/4 p3, 0x1

    .line 29
    aput-object p2, p1, p3

    .line 30
    .line 31
    const-class p2, Landroid/os/Handler;

    .line 32
    .line 33
    const-string p3, "sendMessage"

    .line 34
    .line 35
    invoke-static {p2, p3, p1}, Lu/dont/know/what/i/am/k;->m(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lu/dont/know/what/i/am/g$b;

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
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
.end method

.method public beforeStartApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public format(D)D
    .locals 2

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    .line 2
    .line 3
    const-string v1, "#.######"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1
    .line 17
    .line 18
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
