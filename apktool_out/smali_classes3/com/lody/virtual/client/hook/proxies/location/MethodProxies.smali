.class Lcom/lody/virtual/client/hook/proxies/location/MethodProxies;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RegisterLocationListener;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$locationCallbackFinished;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$getProviderProperties;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$sendExtraCommand;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RegisterGnssStatusCallback;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$UnregisterGnssStatusCallback;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveUpdatesPI;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RequestLocationUpdatesPI;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveGpsStatusListener;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetBestProvider;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$getAllProviders;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$IsProviderEnabled;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetLastKnownLocation;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetLastLocation;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveUpdates;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RequestLocationUpdates;,
        Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$AddGpsStatusListener;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Landroid/location/LocationRequest;)V
    .locals 0

    invoke-static {p0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies;->fixLocationRequest(Landroid/location/LocationRequest;)V

    return-void
.end method

.method private static fixLocationRequest(Landroid/location/LocationRequest;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "test"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    const-string v1, "passive"

    .line 12
    .line 13
    sget-object v2, Lmirror/android/location/LocationRequestL;->getProvider:Lmirror/RefMethod;

    .line 14
    .line 15
    new-array v3, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, p0, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object v1, Lmirror/android/location/LocationRequestL;->setProvider:Lmirror/RefMethod;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    const-string v3, "gps"

    .line 33
    .line 34
    aput-object v3, v2, v0

    .line 35
    .line 36
    invoke-virtual {v1, p0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :catchall_0
    :cond_0
    sget-object v1, Lmirror/android/location/LocationRequestL;->mHideFromAppOps:Lmirror/RefBoolean;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, p0, v0}, Lmirror/RefBoolean;->set(Ljava/lang/Object;Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    sget-object v0, Lmirror/android/location/LocationRequestL;->mWorkSource:Lmirror/RefObject;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Landroid/os/WorkSource;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/os/WorkSource;->clear()V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void

    .line 68
    :cond_3
    sget-object v0, Lmirror/android/location/LocationRequestL;->mWorkSource:Lmirror/RefObject;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, p0, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_4
    return-void
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
