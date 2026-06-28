.class public Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;
.super Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;
.source "SourceFile"


# annotations
.annotation runtime Lcom/lody/virtual/client/hook/annotations/Inject;
    value = Lcom/lody/virtual/client/hook/proxies/location/MethodProxies;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$GetFromLocation;,
        Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/lody/virtual/client/hook/base/MethodInvocationProxy<",
        "Lcom/lody/virtual/client/hook/base/BinderInvocationStub;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    invoke-static {}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;->getInterface()Landroid/os/IInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;-><init>(Landroid/os/IInterface;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;-><init>(Lcom/lody/virtual/client/hook/base/MethodInvocationStub;)V

    return-void
.end method

.method private static getInterface()Landroid/os/IInterface;
    .locals 5

    .line 1
    sget-object v0, Lmirror/android/os/ServiceManager;->getService:Lmirror/RefStaticMethod;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "location"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/os/IBinder;

    .line 16
    .line 17
    instance-of v2, v0, Landroid/os/Binder;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "mILocationManager"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroid/os/IInterface;
    :try_end_0
    .catch Lcom/lody/virtual/helper/utils/ReflectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v2

    .line 34
    :catch_0
    move-exception v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :cond_0
    sget-object v2, Lmirror/android/location/ILocationManager$Stub;->asInterface:Lmirror/RefStaticMethod;

    .line 39
    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object v0, v1, v4

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/os/IInterface;

    .line 49
    .line 50
    return-object v0
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
.method public inject()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "location"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/location/LocationManager;

    .line 12
    .line 13
    sget-object v2, Lmirror/android/location/LocationManager;->mService:Lmirror/RefObject;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    instance-of v3, v2, Landroid/os/Binder;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "mILocationManager"

    .line 38
    .line 39
    invoke-virtual {v2, v4, v3}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object v2, Lmirror/android/location/LocationManager;->mService:Lmirror/RefObject;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 49
    .line 50
    invoke-virtual {v3}, Lcom/lody/virtual/client/hook/base/MethodInvocationStub;->getProxyInterface()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/os/IInterface;

    .line 55
    .line 56
    invoke-virtual {v2, v0, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->getInvocationStub()Lcom/lody/virtual/client/hook/base/MethodInvocationStub;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/hook/base/BinderInvocationStub;->replaceService(Ljava/lang/String;)V

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

.method public isEnvBad()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onBindMethods()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->onBindMethods()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 5
    .line 6
    const-string v1, "addTestProvider"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 15
    .line 16
    const-string v1, "removeTestProvider"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 25
    .line 26
    const-string v1, "setTestProviderLocation"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 35
    .line 36
    const-string v1, "clearTestProviderLocation"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 45
    .line 46
    const-string v1, "setTestProviderEnabled"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 55
    .line 56
    const-string v1, "clearTestProviderEnabled"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 65
    .line 66
    const-string v1, "setTestProviderStatus"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 72
    .line 73
    .line 74
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;

    .line 75
    .line 76
    const-string v1, "clearTestProviderStatus"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 82
    .line 83
    .line 84
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 85
    .line 86
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    const-string v2, "addGpsMeasurementListener"

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-direct {v0, v2, v1, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 95
    .line 96
    .line 97
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 98
    .line 99
    const-string v2, "addGpsNavigationMessageListener"

    .line 100
    .line 101
    invoke-direct {v0, v2, v1, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 105
    .line 106
    .line 107
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 108
    .line 109
    const-string v1, "removeGpsMeasurementListener"

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-direct {v0, v1, v4, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 120
    .line 121
    .line 122
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 123
    .line 124
    const-string v1, "removeGpsNavigationMessageListener"

    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-direct {v0, v1, v4, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 134
    .line 135
    .line 136
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 137
    .line 138
    const-string v1, "requestGeofence"

    .line 139
    .line 140
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-direct {v0, v1, v4, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 148
    .line 149
    .line 150
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 151
    .line 152
    const-string v1, "removeGeofence"

    .line 153
    .line 154
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-direct {v0, v1, v4, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 162
    .line 163
    .line 164
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RequestLocationUpdates;

    .line 165
    .line 166
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RequestLocationUpdates;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 170
    .line 171
    .line 172
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveUpdates;

    .line 173
    .line 174
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveUpdates;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 178
    .line 179
    .line 180
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$IsProviderEnabled;

    .line 181
    .line 182
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$IsProviderEnabled;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 186
    .line 187
    .line 188
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetBestProvider;

    .line 189
    .line 190
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetBestProvider;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 194
    .line 195
    .line 196
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetLastLocation;

    .line 197
    .line 198
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$GetLastLocation;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 202
    .line 203
    .line 204
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$AddGpsStatusListener;

    .line 205
    .line 206
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$AddGpsStatusListener;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 210
    .line 211
    .line 212
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveGpsStatusListener;

    .line 213
    .line 214
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RemoveGpsStatusListener;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 218
    .line 219
    .line 220
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 221
    .line 222
    const-string v1, "addNmeaListener"

    .line 223
    .line 224
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-direct {v0, v1, v4, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 232
    .line 233
    .line 234
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;

    .line 235
    .line 236
    const-string v1, "removeNmeaListener"

    .line 237
    .line 238
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-direct {v0, v1, v2, v3}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$FakeReplaceLastPkgMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 246
    .line 247
    .line 248
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_0

    .line 253
    .line 254
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;

    .line 255
    .line 256
    const-string v1, "registerGnssStatusCallback"

    .line 257
    .line 258
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceFirstPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 262
    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_0
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RegisterGnssStatusCallback;

    .line 266
    .line 267
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$RegisterGnssStatusCallback;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 271
    .line 272
    .line 273
    :goto_0
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$UnregisterGnssStatusCallback;

    .line 274
    .line 275
    invoke-direct {v0}, Lcom/lody/virtual/client/hook/proxies/location/MethodProxies$UnregisterGnssStatusCallback;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 279
    .line 280
    .line 281
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 282
    .line 283
    const-string v1, "isProviderEnabledForUser"

    .line 284
    .line 285
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 289
    .line 290
    .line 291
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;

    .line 292
    .line 293
    const-string v1, "isLocationEnabledForUser"

    .line 294
    .line 295
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceLastUserIdMethodProxy;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isQ()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_1

    .line 306
    .line 307
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;

    .line 308
    .line 309
    const-string v1, "setLocationControllerExtraPackageEnabled"

    .line 310
    .line 311
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$1;-><init>(Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 315
    .line 316
    .line 317
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$2;

    .line 318
    .line 319
    const-string v1, "setExtraLocationControllerPackageEnabled"

    .line 320
    .line 321
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$2;-><init>(Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 325
    .line 326
    .line 327
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$3;

    .line 328
    .line 329
    const-string v1, "setExtraLocationControllerPackage"

    .line 330
    .line 331
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$3;-><init>(Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 335
    .line 336
    .line 337
    :cond_1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_2

    .line 342
    .line 343
    new-instance v0, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;

    .line 344
    .line 345
    const-string v1, "setLocationEnabledForUser"

    .line 346
    .line 347
    invoke-direct {v0, v1, v3}, Lcom/lody/virtual/client/hook/base/ResultStaticMethodProxy;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 351
    .line 352
    .line 353
    :cond_2
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_3

    .line 358
    .line 359
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;

    .line 360
    .line 361
    const-string v1, "registerLocationPendingIntent"

    .line 362
    .line 363
    const/4 v2, 0x2

    .line 364
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 368
    .line 369
    .line 370
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;

    .line 371
    .line 372
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/hook/base/ReplaceSequencePkgMethodProxy;-><init>(Ljava/lang/String;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 376
    .line 377
    .line 378
    new-instance v0, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;

    .line 379
    .line 380
    const-string v1, "registerGnssNmeaCallback"

    .line 381
    .line 382
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/base/ReplaceCallingPkgMethodProxy;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 386
    .line 387
    .line 388
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$GetFromLocation;

    .line 389
    .line 390
    const-string v1, "getFromLocationName"

    .line 391
    .line 392
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$GetFromLocation;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 396
    .line 397
    .line 398
    new-instance v0, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$GetFromLocation;

    .line 399
    .line 400
    const-string v1, "getFromLocation"

    .line 401
    .line 402
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/hook/proxies/location/LocationManagerStub$GetFromLocation;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0, v0}, Lcom/lody/virtual/client/hook/base/MethodInvocationProxy;->addMethodProxy(Lcom/lody/virtual/client/hook/base/MethodProxy;)Lcom/lody/virtual/client/hook/base/MethodProxy;

    .line 406
    .line 407
    .line 408
    :cond_3
    return-void
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
