.class public Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;
.super Landroid/app/Instrumentation;
.source "SourceFile"


# instance fields
.field private avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

.field protected base:Landroid/app/Instrumentation;

.field protected root:Landroid/app/Instrumentation;


# direct methods
.method public constructor <init>(Landroid/app/Instrumentation;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Instrumentation;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/helper/MultiAvoidRecursive;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 16
    .line 17
    return-void
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

.method private static varargs findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "Method "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " with parameters "

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " not found in "

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v0, p0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0
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


# virtual methods
.method public addMonitor(Landroid/content/IntentFilter;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->addMonitor(Landroid/content/IntentFilter;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;

    move-result-object p1

    return-object p1
.end method

.method public addMonitor(Ljava/lang/String;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->addMonitor(Ljava/lang/String;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;

    move-result-object p1

    return-object p1
.end method

.method public addMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->addMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V

    return-void
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x4

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 5
    throw p1
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/4 v0, 0x5

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 10
    throw p1
.end method

.method public callActivityOnDestroy(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnDestroy(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnDestroy(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 31
    .line 32
    .line 33
    throw p1
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
.end method

.method public callActivityOnNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 2

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnPause(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnPause(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnPause(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnPictureInPictureRequested(Landroid/app/Activity;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-static {v0, p1}, Lcom/lody/virtual/client/hook/instruments/a;->a(Landroid/app/Instrumentation;Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const/16 v0, 0x9

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 5
    throw p1
.end method

.method public callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/16 v0, 0xa

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 10
    throw p1
.end method

.method public callActivityOnRestart(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnRestart(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnRestart(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x7

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 5
    throw p1
.end method

.method public callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/16 v0, 0x8

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 10
    throw p1
.end method

.method public callActivityOnResume(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnResume(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnResume(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const/16 v0, 0x10

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 5
    throw p1
.end method

.method public callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const/16 v0, 0x11

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 10
    throw p1
.end method

.method public callActivityOnStart(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnStart(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnStart(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnStop(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnStop(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnStop(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callActivityOnUserLeaving(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnUserLeaving(Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callActivityOnUserLeaving(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public callApplicationOnCreate(Landroid/app/Application;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callApplicationOnCreate(Landroid/app/Application;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroid/app/Instrumentation;->callApplicationOnCreate(Landroid/app/Application;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    const-string v1, "VA"

    .line 24
    .line 25
    invoke-static {v1, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_1
    move-exception p1

    .line 35
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 38
    .line 39
    .line 40
    throw p1
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
.end method

.method public checkMonitorHit(Landroid/app/Instrumentation$ActivityMonitor;I)Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2}, Landroid/app/Instrumentation;->checkMonitorHit(Landroid/app/Instrumentation$ActivityMonitor;I)Z

    move-result p1

    return p1
.end method

.method public endPerformanceSnapshot()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->endPerformanceSnapshot()V

    return-void
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x17

    .line 34
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/content/Intent;

    const-class v5, Landroid/app/Activity;

    const-class v6, Landroid/content/Context;

    const-string v7, "execStartActivity"

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const-class v12, Landroid/os/IBinder;

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x6

    if-eqz v0, :cond_0

    .line 35
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v15, [Ljava/lang/Class;

    aput-object v6, v2, v14

    aput-object v12, v2, v13

    aput-object v12, v2, v11

    aput-object v5, v2, v10

    aput-object v4, v2, v9

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v8

    invoke-static {v0, v7, v2}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v4, v15, [Ljava/lang/Object;

    aput-object p1, v4, v14

    aput-object p2, v4, v13

    aput-object p3, v4, v11

    aput-object p4, v4, v10

    aput-object p5, v4, v9

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 37
    :cond_0
    :try_start_2
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v15, [Ljava/lang/Class;

    aput-object v6, v2, v14

    aput-object v12, v2, v13

    aput-object v12, v2, v11

    aput-object v5, v2, v10

    aput-object v4, v2, v9

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v8

    invoke-static {v0, v7, v2}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v4, v15, [Ljava/lang/Object;

    aput-object p1, v4, v14

    aput-object p2, v4, v13

    aput-object p3, v4, v11

    aput-object p4, v4, v10

    aput-object p5, v4, v9

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 38
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 39
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v2, 0x0

    return-object v2

    :catch_1
    move-exception v0

    const/4 v2, 0x0

    .line 40
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_1

    .line 41
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v2

    .line 42
    :cond_1
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 43
    :goto_1
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 44
    throw v0
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x14

    .line 1
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/os/Bundle;

    const-class v5, Landroid/content/Intent;

    const-class v6, Landroid/app/Activity;

    const-class v7, Landroid/content/Context;

    const-string v8, "execStartActivity"

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const-class v14, Landroid/os/IBinder;

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v2, 0x7

    if-eqz v0, :cond_0

    .line 2
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x14

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 4
    :cond_0
    :try_start_3
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v2, 0x14

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 5
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 6
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v2, 0x14

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v3, 0x0

    return-object v3

    :catch_2
    move-exception v0

    move v2, v3

    :goto_1
    const/4 v3, 0x0

    .line 7
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_1

    .line 8
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v3

    .line 9
    :cond_1
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 10
    :goto_2
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x14

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 11
    throw v0
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;Landroid/os/UserHandle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 19
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x19

    .line 56
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/os/UserHandle;

    const-class v5, Landroid/os/Bundle;

    const-class v6, Landroid/content/Intent;

    const-class v7, Landroid/app/Activity;

    const-class v8, Landroid/content/Context;

    const-string v9, "execStartActivity"

    const/4 v10, 0x7

    const/4 v11, 0x6

    const/4 v12, 0x5

    const/4 v13, 0x4

    const/4 v14, 0x3

    const/4 v15, 0x2

    const-class v16, Landroid/os/IBinder;

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    .line 57
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v3, v2, [Ljava/lang/Class;

    aput-object v8, v3, v18

    aput-object v16, v3, v17

    aput-object v16, v3, v15

    aput-object v7, v3, v14

    aput-object v6, v3, v13

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    aput-object v4, v3, v10

    invoke-static {v0, v9, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v18

    aput-object p2, v2, v17

    aput-object p3, v2, v15

    aput-object p4, v2, v14

    aput-object p5, v2, v13

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v12

    aput-object p7, v2, v11

    aput-object p8, v2, v10

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x19

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 59
    :cond_0
    :try_start_3
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v3, v2, [Ljava/lang/Class;

    aput-object v8, v3, v18

    aput-object v16, v3, v17

    aput-object v16, v3, v15

    aput-object v7, v3, v14

    aput-object v6, v3, v13

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    aput-object v4, v3, v10

    invoke-static {v0, v9, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v18

    aput-object p2, v2, v17

    aput-object p3, v2, v15

    aput-object p4, v2, v14

    aput-object p5, v2, v13

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v12

    aput-object p7, v2, v11

    aput-object p8, v2, v10

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v2, 0x19

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 60
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v2, 0x19

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v3, 0x0

    return-object v3

    :catch_2
    move-exception v0

    move v2, v3

    :goto_1
    const/4 v3, 0x0

    .line 62
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_1

    .line 63
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v3

    .line 64
    :cond_1
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 65
    :goto_2
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x19

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 66
    throw v0
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x16

    .line 23
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/content/Intent;

    const-class v5, Landroid/app/Fragment;

    const-class v6, Landroid/content/Context;

    const-string v7, "execStartActivity"

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const-class v12, Landroid/os/IBinder;

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x6

    if-eqz v0, :cond_0

    .line 24
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v15, [Ljava/lang/Class;

    aput-object v6, v2, v14

    aput-object v12, v2, v13

    aput-object v12, v2, v11

    aput-object v5, v2, v10

    aput-object v4, v2, v9

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v8

    invoke-static {v0, v7, v2}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v4, v15, [Ljava/lang/Object;

    aput-object p1, v4, v14

    aput-object p2, v4, v13

    aput-object p3, v4, v11

    aput-object p4, v4, v10

    aput-object p5, v4, v9

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 26
    :cond_0
    :try_start_2
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v15, [Ljava/lang/Class;

    aput-object v6, v2, v14

    aput-object v12, v2, v13

    aput-object v12, v2, v11

    aput-object v5, v2, v10

    aput-object v4, v2, v9

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v8

    invoke-static {v0, v7, v2}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v4, v15, [Ljava/lang/Object;

    aput-object p1, v4, v14

    aput-object p2, v4, v13

    aput-object p3, v4, v11

    aput-object p4, v4, v10

    aput-object p5, v4, v9

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 27
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 28
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v2, 0x0

    return-object v2

    :catch_1
    move-exception v0

    const/4 v2, 0x0

    .line 29
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_1

    .line 30
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v2

    .line 31
    :cond_1
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 32
    :goto_1
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 33
    throw v0
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x18

    .line 45
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/os/Bundle;

    const-class v5, Landroid/content/Intent;

    const-class v6, Landroid/app/Fragment;

    const-class v7, Landroid/content/Context;

    const-string v8, "execStartActivity"

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const-class v14, Landroid/os/IBinder;

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v2, 0x7

    if-eqz v0, :cond_0

    .line 46
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 48
    :cond_0
    :try_start_3
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v2, 0x18

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 49
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 50
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v2, 0x18

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v3, 0x0

    return-object v3

    :catch_2
    move-exception v0

    move v2, v3

    :goto_1
    const/4 v3, 0x0

    .line 51
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_1

    .line 52
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v3

    .line 53
    :cond_1
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 54
    :goto_2
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 55
    throw v0
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v1, p0

    const/16 v3, 0x15

    .line 12
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-class v4, Landroid/os/Bundle;

    const-class v5, Landroid/content/Intent;

    const-class v6, Ljava/lang/String;

    const-class v7, Landroid/content/Context;

    const-string v8, "execStartActivity"

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const-class v14, Landroid/os/IBinder;

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v2, 0x7

    if-eqz v0, :cond_0

    .line 13
    :try_start_1
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    :goto_0
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x15

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 15
    :cond_0
    :try_start_3
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v3, v2, [Ljava/lang/Class;

    aput-object v7, v3, v16

    aput-object v14, v3, v15

    aput-object v14, v3, v13

    aput-object v6, v3, v12

    aput-object v5, v3, v11

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v10

    aput-object v4, v3, v9

    invoke-static {v0, v8, v3}, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->findDeclaredMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v16

    aput-object p2, v2, v15

    aput-object p3, v2, v13

    aput-object p4, v2, v12

    aput-object p5, v2, v11

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v10

    aput-object p7, v2, v9

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation$ActivityResult;
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v2, 0x15

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 16
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 17
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v2, 0x15

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    const/4 v3, 0x0

    return-object v3

    :catch_2
    move-exception v0

    move v2, v3

    :goto_1
    const/4 v3, 0x0

    .line 18
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v4, :cond_1

    .line 19
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v3

    .line 20
    :cond_1
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 21
    :goto_2
    iget-object v2, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    const/16 v3, 0x15

    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 22
    throw v0
.end method

.method public finish(ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2}, Landroid/app/Instrumentation;->finish(ILandroid/os/Bundle;)V

    return-void
.end method

.method public getAllocCounts()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getAllocCounts()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getBinderCounts()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getBinderCounts()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getComponentName()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getTargetContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getTargetContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getUiAutomation()Landroid/app/UiAutomation;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->getUiAutomation()Landroid/app/UiAutomation;

    move-result-object v0

    return-object v0
.end method

.method public invokeContextMenuAction(Landroid/app/Activity;II)Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->invokeContextMenuAction(Landroid/app/Activity;II)Z

    move-result p1

    return p1
.end method

.method public invokeMenuActionSync(Landroid/app/Activity;II)Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->invokeMenuActionSync(Landroid/app/Activity;II)Z

    move-result p1

    return p1
.end method

.method public isProfiling()Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->isProfiling()Z

    move-result v0

    return v0
.end method

.method public newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/content/Context;",
            "Landroid/os/IBinder;",
            "Landroid/app/Application;",
            "Landroid/content/Intent;",
            "Landroid/content/pm/ActivityInfo;",
            "Ljava/lang/CharSequence;",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Landroid/app/Activity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    move-object v1, p0

    const/4 v2, 0x2

    .line 1
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    invoke-virtual/range {v3 .. v13}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :goto_0
    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v3, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object v0

    .line 4
    :cond_0
    :try_start_1
    iget-object v4, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    invoke-virtual/range {v4 .. v14}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 5
    :catchall_0
    :try_start_2
    iget-object v4, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    invoke-virtual/range {v4 .. v14}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    .line 6
    iget-object v3, v1, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v3, v2}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 7
    throw v0
.end method

.method public newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :goto_0
    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    return-object p1

    .line 11
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 12
    :catchall_0
    :try_start_2
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 13
    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 14
    throw p1
.end method

.method public newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->beginCall(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :goto_0
    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->root:Landroid/app/Instrumentation;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2, p3}, Landroid/app/Instrumentation;->newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    iget-object p2, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->avoidRecursive:Lcom/lody/virtual/helper/MultiAvoidRecursive;

    .line 31
    .line 32
    invoke-virtual {p2, v0}, Lcom/lody/virtual/helper/MultiAvoidRecursive;->finishCall(I)V

    .line 33
    .line 34
    .line 35
    throw p1
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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->onDestroy()V

    return-void
.end method

.method public onException(Ljava/lang/Object;Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2}, Landroid/app/Instrumentation;->onException(Ljava/lang/Object;Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->onStart()V

    return-void
.end method

.method public removeMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->removeMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V

    return-void
.end method

.method public runOnMainSync(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->runOnMainSync(Ljava/lang/Runnable;)V

    return-void
.end method

.method public sendCharacterSync(I)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendCharacterSync(I)V

    return-void
.end method

.method public sendKeyDownUpSync(I)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendKeyDownUpSync(I)V

    return-void
.end method

.method public sendKeySync(Landroid/view/KeyEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendKeySync(Landroid/view/KeyEvent;)V

    return-void
.end method

.method public sendPointerSync(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendPointerSync(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public sendStatus(ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2}, Landroid/app/Instrumentation;->sendStatus(ILandroid/os/Bundle;)V

    return-void
.end method

.method public sendStringSync(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendStringSync(Ljava/lang/String;)V

    return-void
.end method

.method public sendTrackballEventSync(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->sendTrackballEventSync(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public setAutomaticPerformanceSnapshots()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->setAutomaticPerformanceSnapshots()V

    return-void
.end method

.method public setInTouchMode(Z)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->setInTouchMode(Z)V

    return-void
.end method

.method public start()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->start()V

    return-void
.end method

.method public startActivitySync(Landroid/content/Intent;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->startActivitySync(Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method

.method public startPerformanceSnapshot()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->startPerformanceSnapshot()V

    return-void
.end method

.method public startProfiling()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->startProfiling()V

    return-void
.end method

.method public stopProfiling()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->stopProfiling()V

    return-void
.end method

.method public waitForIdle(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->waitForIdle(Ljava/lang/Runnable;)V

    return-void
.end method

.method public waitForIdleSync()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0}, Landroid/app/Instrumentation;->waitForIdleSync()V

    return-void
.end method

.method public waitForMonitor(Landroid/app/Instrumentation$ActivityMonitor;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->waitForMonitor(Landroid/app/Instrumentation$ActivityMonitor;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method

.method public waitForMonitorWithTimeout(Landroid/app/Instrumentation$ActivityMonitor;J)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/instruments/InstrumentationProxy;->base:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->waitForMonitorWithTimeout(Landroid/app/Instrumentation$ActivityMonitor;J)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method
