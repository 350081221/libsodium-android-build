.class Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;
.super Ljava/util/TimerTask;
.source "SourceFile"


# static fields
.field private static INSTANCE:Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;


# instance fields
.field private isRunning:Z

.field private listeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;

    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->INSTANCE:Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->isRunning:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->listeners:Ljava/util/Map;

    .line 13
    .line 14
    new-instance v0, Ljava/util/Timer;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->timer:Ljava/util/Timer;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public static get()Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->INSTANCE:Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;

    return-object v0
.end method


# virtual methods
.method public addListenerTransport(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->isRunning:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->isRunning:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->isRunning:Z

    .line 12
    .line 13
    iget-object v1, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->timer:Ljava/util/Timer;

    .line 14
    .line 15
    const-wide/16 v3, 0x64

    .line 16
    .line 17
    const-wide/16 v5, 0x320

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 21
    .line 22
    .line 23
    :cond_0
    monitor-exit p0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->listeners:Ljava/util/Map;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void
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

.method public removeListenerTransport(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->listeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->listeners:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->listeners:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/Map$Entry;

    .line 30
    .line 31
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->invokeSvStatusChanged(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/lody/virtual/client/hook/proxies/location/MockLocationHelper;->invokeNmeaReceived(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
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

.method public stop()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/proxies/location/GPSStatusListenerThread;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method
