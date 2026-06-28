.class public final Lcom/lody/virtual/client/VClient;
.super Lcom/lody/virtual/client/IVClient$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/VClient$H;,
        Lcom/lody/virtual/client/VClient$ReceiverData;,
        Lcom/lody/virtual/client/VClient$AppBindData;,
        Lcom/lody/virtual/client/VClient$NewIntentData;,
        Lcom/lody/virtual/client/VClient$RootThreadGroup;
    }
.end annotation


# static fields
.field private static CheckJunitClazz:Z = false

.field private static final FINISH_ACTIVITY:I = 0xd

.field private static final NEW_INTENT:I = 0xb

.field private static final RECEIVER:I = 0xc

.field private static final TAG:Ljava/lang/String; = "VClient"

.field private static final gClient:Lcom/lody/virtual/client/VClient;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private clientConfig:Lcom/lody/virtual/remote/ClientConfig;

.field private corePid:I

.field private crashHandler:Lcom/lody/virtual/client/core/CrashHandler;

.field private final mAllApplications:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private mAppInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

.field private mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

.field private mExportedVApiPkgs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mH:Lcom/lody/virtual/client/VClient$H;

.field private mInitialApplication:Landroid/app/Application;

.field private mInstrumentation:Landroid/app/Instrumentation;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/lody/virtual/client/VClient;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/client/VClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lody/virtual/client/VClient;->gClient:Lcom/lody/virtual/client/VClient;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lcom/lody/virtual/client/VClient;->CheckJunitClazz:Z

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/IVClient$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/client/VClient$H;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/client/VClient$H;-><init>(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$1;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/client/VClient;->mH:Lcom/lody/virtual/client/VClient$H;

    .line 11
    .line 12
    invoke-static {}, Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;->getDefault()Lcom/lody/virtual/client/hook/instruments/InstrumentationVirtualApp;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/lody/virtual/client/VClient;->mInstrumentation:Landroid/app/Instrumentation;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/lody/virtual/client/VClient;->mExportedVApiPkgs:Ljava/util/Set;

    .line 32
    .line 33
    return-void
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

.method static synthetic access$100(Lcom/lody/virtual/client/VClient;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/client/VClient;->bindApplicationMainThread(Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V

    return-void
.end method

.method static synthetic access$500()Lcom/lody/virtual/client/VClient;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/VClient;->gClient:Lcom/lody/virtual/client/VClient;

    return-object v0
.end method

.method static synthetic access$600(Lcom/lody/virtual/client/VClient;)Lcom/lody/virtual/client/core/CrashHandler;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/VClient;->crashHandler:Lcom/lody/virtual/client/core/CrashHandler;

    return-object p0
.end method

.method static synthetic access$700(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$NewIntentData;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/VClient;->handleNewIntent(Lcom/lody/virtual/client/VClient$NewIntentData;)V

    return-void
.end method

.method static synthetic access$800(Lcom/lody/virtual/client/VClient;Lcom/lody/virtual/client/VClient$ReceiverData;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/VClient;->handleReceiver(Lcom/lody/virtual/client/VClient$ReceiverData;)V

    return-void
.end method

.method private bindApplicationMainThread(Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v1, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 6
    .line 7
    monitor-enter v3

    .line 8
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    monitor-exit v3

    .line 17
    return-void

    .line 18
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 19
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 20
    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/core/SettingConfig;->isEnableSeccomp(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lcom/lody/virtual/client/seccomp/NativeEngineSeccomp;->loadSo()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtHelperProcess()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v0, v1, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    const/4 v4, 0x0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    move v5, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move v5, v4

    .line 53
    :goto_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 54
    .line 55
    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    move-object v6, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object/from16 v6, p2

    .line 61
    .line 62
    :goto_1
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->setupUncaughtHandler()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    move-object v7, v0

    .line 68
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    :try_start_2
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->fixInstalledProviders()V

    .line 80
    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/hook/providers/SettingsProviderHook;->passSettingsProviderPermissionCheck(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v8, v0}, Lcom/lody/virtual/client/ipc/VDeviceManager;->applyBuildProp(Lcom/lody/virtual/remote/VDeviceConfig;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "com.cctv.yangshipin"

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v8, 0x0

    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    sget-object v0, Lmirror/android/app/ActivityThread;->mInitialApplication:Lmirror/RefObject;

    .line 111
    .line 112
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v0, v9, v8}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_5
    new-instance v9, Lcom/lody/virtual/client/VClient$AppBindData;

    .line 120
    .line 121
    invoke-direct {v9, v8}, Lcom/lody/virtual/client/VClient$AppBindData;-><init>(Lcom/lody/virtual/client/VClient$1;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, v2, v4}, Lcom/lody/virtual/client/core/VirtualCore;->getInstalledAppInfo(Ljava/lang/String;I)Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    if-nez v10, :cond_6

    .line 133
    .line 134
    new-instance v0, Ljava/lang/Exception;

    .line 135
    .line 136
    const-string v11, "app not exist"

    .line 137
    .line 138
    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 142
    .line 143
    .line 144
    invoke-static {v4}, Landroid/os/Process;->killProcess(I)V

    .line 145
    .line 146
    .line 147
    invoke-static {v4}, Ljava/lang/System;->exit(I)V

    .line 148
    .line 149
    .line 150
    :cond_6
    if-eqz v5, :cond_7

    .line 151
    .line 152
    iput-object v10, v1, Lcom/lody/virtual/client/VClient;->mAppInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 153
    .line 154
    :cond_7
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0, v2, v4, v7}, Lcom/lody/virtual/client/ipc/VPackageManager;->getApplicationInfo(Ljava/lang/String;II)Landroid/content/pm/ApplicationInfo;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 163
    .line 164
    iput-object v6, v9, Lcom/lody/virtual/client/VClient$AppBindData;->processName:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    const/16 v12, 0x80

    .line 175
    .line 176
    invoke-virtual {v0, v6, v11, v12}, Lcom/lody/virtual/client/ipc/VPackageManager;->queryContentProviders(Ljava/lang/String;II)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, v9, Lcom/lody/virtual/client/VClient$AppBindData;->providers:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-eqz v11, :cond_9

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    check-cast v11, Landroid/content/pm/ProviderInfo;

    .line 197
    .line 198
    iget-boolean v11, v11, Landroid/content/pm/ProviderInfo;->enabled:Z

    .line 199
    .line 200
    if-nez v11, :cond_8

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_9
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackage()Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v5, :cond_10

    .line 215
    .line 216
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 217
    .line 218
    .line 219
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/core/SettingConfig;->isEnableSeccomp(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    invoke-static {}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->nativeSetup()I

    .line 226
    .line 227
    .line 228
    :cond_a
    iput-object v9, v1, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 229
    .line 230
    iget-object v0, v9, Lcom/lody/virtual/client/VClient$AppBindData;->processName:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v12, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 233
    .line 234
    invoke-static {v0, v12}, Lcom/lody/virtual/client/env/VirtualRuntime;->setupRuntime(Ljava/lang/String;Landroid/content/pm/ApplicationInfo;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 238
    .line 239
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 240
    .line 241
    const/16 v12, 0x9

    .line 242
    .line 243
    if-ge v0, v12, :cond_b

    .line 244
    .line 245
    new-instance v12, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 246
    .line 247
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    invoke-direct {v12, v13}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-virtual {v12}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    invoke-virtual {v12}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    const/16 v13, 0x18

    .line 274
    .line 275
    if-lt v12, v13, :cond_c

    .line 276
    .line 277
    if-ge v0, v13, :cond_c

    .line 278
    .line 279
    invoke-static {}, Lcom/lody/virtual/helper/compat/StrictModeCompat;->disableDeathOnFileUriExposure()Z

    .line 280
    .line 281
    .line 282
    :cond_c
    const/16 v12, 0x15

    .line 283
    .line 284
    if-ge v0, v12, :cond_d

    .line 285
    .line 286
    sget-object v12, Lmirror/android/os/Message;->updateCheckRecycle:Lmirror/RefStaticMethod;

    .line 287
    .line 288
    new-array v13, v3, [Ljava/lang/Object;

    .line 289
    .line 290
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    aput-object v14, v13, v4

    .line 295
    .line 296
    invoke-virtual {v12, v13}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    :cond_d
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    invoke-virtual {v12}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    const-string v13, "alarm"

    .line 308
    .line 309
    invoke-virtual {v12, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    check-cast v12, Landroid/app/AlarmManager;

    .line 314
    .line 315
    sget-object v13, Lmirror/android/app/AlarmManager;->mTargetSdkVersion:Lmirror/RefInt;

    .line 316
    .line 317
    if-eqz v13, :cond_e

    .line 318
    .line 319
    :try_start_3
    invoke-virtual {v13, v12, v0}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :catch_0
    move-exception v0

    .line 324
    move-object v12, v0

    .line 325
    invoke-virtual {v12}, Ljava/lang/Throwable;->printStackTrace()V

    .line 326
    .line 327
    .line 328
    :cond_e
    :goto_5
    if-eqz v11, :cond_f

    .line 329
    .line 330
    const-string v0, "java.io.tmpdir"

    .line 331
    .line 332
    new-instance v12, Ljava/io/File;

    .line 333
    .line 334
    iget-object v13, v10, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 335
    .line 336
    invoke-static {v7, v13}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    const-string v14, "cache"

    .line 341
    .line 342
    invoke-direct {v12, v13, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    invoke-static {v0, v12}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_f
    const-string v0, "java.io.tmpdir"

    .line 354
    .line 355
    new-instance v12, Ljava/io/File;

    .line 356
    .line 357
    iget-object v13, v10, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 358
    .line 359
    invoke-static {v7, v13}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    const-string v14, "cache"

    .line 364
    .line 365
    invoke-direct {v12, v13, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    invoke-static {v0, v12}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    :goto_6
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/NativeEngine;->launchEngine(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->isEnableIORedirect()Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    if-eqz v0, :cond_10

    .line 387
    .line 388
    invoke-direct {v1, v10, v11}, Lcom/lody/virtual/client/VClient;->mountVirtualFS(Lcom/lody/virtual/remote/InstalledAppInfo;Z)V

    .line 389
    .line 390
    .line 391
    :cond_10
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 392
    .line 393
    .line 394
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/core/SettingConfig;->isEnableSeccomp(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_11

    .line 399
    .line 400
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lcom/lody/virtual/client/VClient;->getCurrentPackage()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v0}, Lcom/lody/virtual/client/seccomp/SeccompWhitelist;->isProtectApp(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-static {v0}, Lcom/lody/virtual/client/seccomp/SeccompSandbox;->nativeStart(Z)I

    .line 413
    .line 414
    .line 415
    :cond_11
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v12

    .line 419
    invoke-direct {v1, v11, v7, v2}, Lcom/lody/virtual/client/VClient;->initDataStorage(ZILjava/lang/String;)V

    .line 420
    .line 421
    .line 422
    iget-object v0, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 423
    .line 424
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 425
    .line 426
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 427
    .line 428
    .line 429
    move-result-object v11

    .line 430
    invoke-virtual {v11, v0}, Lcom/lody/virtual/client/core/SettingConfig;->isOutsideAppInfoPriority(Ljava/lang/String;)Z

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    if-nez v11, :cond_12

    .line 435
    .line 436
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 437
    .line 438
    .line 439
    move-result-object v11

    .line 440
    invoke-virtual {v11, v0, v4}, Lcom/lody/virtual/client/core/VirtualCore;->getOutSidePackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    if-eqz v11, :cond_12

    .line 445
    .line 446
    sget-object v11, Lmirror/android/app/ActivityThread;->mPackages:Lmirror/RefObject;

    .line 447
    .line 448
    invoke-virtual {v11, v12}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    check-cast v11, Ljava/util/Map;

    .line 453
    .line 454
    invoke-interface {v11, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    sget-object v11, Lmirror/android/app/ActivityThread;->mResourcePackages:Lmirror/RefObject;

    .line 458
    .line 459
    if-eqz v11, :cond_12

    .line 460
    .line 461
    invoke-virtual {v11, v12}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    check-cast v11, Ljava/util/Map;

    .line 466
    .line 467
    invoke-interface {v11, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    :cond_12
    invoke-direct {v1, v0}, Lcom/lody/virtual/client/VClient;->createPackageContext(Ljava/lang/String;)Landroid/content/Context;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    if-eqz v5, :cond_1a

    .line 475
    .line 476
    invoke-static {}, Lcom/lody/virtual/client/NativeEngine;->startDexOverride()V

    .line 477
    .line 478
    .line 479
    invoke-static {}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->get()Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    .line 480
    .line 481
    .line 482
    move-result-object v15

    .line 483
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 484
    .line 485
    .line 486
    move-result-object v16

    .line 487
    invoke-virtual/range {v16 .. v16}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    iget-object v14, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 492
    .line 493
    invoke-virtual {v15, v6, v8, v14, v7}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->attach(Ljava/lang/String;Landroid/content/Context;Landroid/content/pm/ApplicationInfo;I)V

    .line 494
    .line 495
    .line 496
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 497
    .line 498
    invoke-virtual {v11}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    sget-object v14, Lmirror/android/view/ThreadedRenderer;->setupDiskCache:Lmirror/RefStaticMethod;

    .line 503
    .line 504
    if-eqz v14, :cond_13

    .line 505
    .line 506
    new-array v15, v3, [Ljava/lang/Object;

    .line 507
    .line 508
    aput-object v8, v15, v4

    .line 509
    .line 510
    invoke-virtual {v14, v15}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    :cond_13
    sget-object v14, Lmirror/android/renderscript/RenderScriptCacheDir;->setupDiskCache:Lmirror/RefStaticMethod;

    .line 514
    .line 515
    if-eqz v14, :cond_14

    .line 516
    .line 517
    new-array v15, v3, [Ljava/lang/Object;

    .line 518
    .line 519
    aput-object v8, v15, v4

    .line 520
    .line 521
    invoke-virtual {v14, v15}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    :cond_14
    iget-object v8, v1, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 525
    .line 526
    sget-object v14, Lmirror/android/app/ContextImpl;->mPackageInfo:Lmirror/RefObject;

    .line 527
    .line 528
    invoke-virtual {v14, v11}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v14

    .line 532
    iput-object v14, v8, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 533
    .line 534
    sget-object v8, Lmirror/android/app/ActivityThread;->mBoundApplication:Lmirror/RefObject;

    .line 535
    .line 536
    invoke-virtual {v8, v12}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    sget-object v14, Lmirror/android/app/ActivityThread$AppBindData;->appInfo:Lmirror/RefObject;

    .line 541
    .line 542
    iget-object v15, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 543
    .line 544
    invoke-virtual {v14, v8, v15}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    sget-object v14, Lmirror/android/app/ActivityThread$AppBindData;->processName:Lmirror/RefObject;

    .line 548
    .line 549
    iget-object v15, v9, Lcom/lody/virtual/client/VClient$AppBindData;->processName:Ljava/lang/String;

    .line 550
    .line 551
    invoke-virtual {v14, v8, v15}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    sget-object v14, Lmirror/android/app/ActivityThread$AppBindData;->instrumentationName:Lmirror/RefObject;

    .line 555
    .line 556
    new-instance v15, Landroid/content/ComponentName;

    .line 557
    .line 558
    const-class v17, Landroid/app/Instrumentation;

    .line 559
    .line 560
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v13

    .line 564
    invoke-direct {v15, v0, v13}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v14, v8, v15}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    sget-object v13, Lmirror/android/app/ActivityThread$AppBindData;->info:Lmirror/RefObject;

    .line 571
    .line 572
    iget-object v14, v9, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 573
    .line 574
    invoke-virtual {v13, v8, v14}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    sget-object v13, Lmirror/android/app/ActivityThread$AppBindData;->providers:Lmirror/RefObject;

    .line 578
    .line 579
    iget-object v14, v9, Lcom/lody/virtual/client/VClient$AppBindData;->providers:Ljava/util/List;

    .line 580
    .line 581
    invoke-virtual {v13, v8, v14}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    sget-object v8, Lmirror/android/app/LoadedApk;->mSecurityViolation:Lmirror/RefBoolean;

    .line 585
    .line 586
    if-eqz v8, :cond_15

    .line 587
    .line 588
    iget-object v13, v1, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 589
    .line 590
    iget-object v13, v13, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 591
    .line 592
    invoke-virtual {v8, v13, v4}, Lmirror/RefBoolean;->set(Ljava/lang/Object;Z)V

    .line 593
    .line 594
    .line 595
    :cond_15
    sget-object v8, Lmirror/dalvik/system/VMRuntime;->setTargetSdkVersion:Lmirror/RefMethod;

    .line 596
    .line 597
    sget-object v13, Lmirror/dalvik/system/VMRuntime;->getRuntime:Lmirror/RefStaticMethod;

    .line 598
    .line 599
    new-array v14, v4, [Ljava/lang/Object;

    .line 600
    .line 601
    invoke-virtual {v13, v14}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v13

    .line 605
    new-array v14, v3, [Ljava/lang/Object;

    .line 606
    .line 607
    iget-object v15, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 608
    .line 609
    iget v15, v15, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 610
    .line 611
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 612
    .line 613
    .line 614
    move-result-object v15

    .line 615
    aput-object v15, v14, v4

    .line 616
    .line 617
    invoke-virtual {v8, v13, v14}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 621
    .line 622
    .line 623
    move-result-object v8

    .line 624
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 625
    .line 626
    .line 627
    move-result-object v8

    .line 628
    sget-object v13, Lmirror/android/content/res/CompatibilityInfo;->ctor:Lmirror/RefConstructor;

    .line 629
    .line 630
    const/4 v15, 0x4

    .line 631
    if-eqz v13, :cond_16

    .line 632
    .line 633
    new-array v14, v15, [Ljava/lang/Object;

    .line 634
    .line 635
    iget-object v15, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 636
    .line 637
    aput-object v15, v14, v4

    .line 638
    .line 639
    iget v15, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 640
    .line 641
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v15

    .line 645
    aput-object v15, v14, v3

    .line 646
    .line 647
    iget v15, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 648
    .line 649
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v15

    .line 653
    const/16 v18, 0x2

    .line 654
    .line 655
    aput-object v15, v14, v18

    .line 656
    .line 657
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 658
    .line 659
    const/16 v17, 0x3

    .line 660
    .line 661
    aput-object v15, v14, v17

    .line 662
    .line 663
    invoke-virtual {v13, v14}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v13

    .line 667
    goto :goto_7

    .line 668
    :cond_16
    const/4 v13, 0x0

    .line 669
    :goto_7
    sget-object v14, Lmirror/android/content/res/CompatibilityInfo;->ctorLG:Lmirror/RefConstructor;

    .line 670
    .line 671
    if-eqz v14, :cond_17

    .line 672
    .line 673
    const/4 v13, 0x5

    .line 674
    new-array v13, v13, [Ljava/lang/Object;

    .line 675
    .line 676
    iget-object v15, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 677
    .line 678
    aput-object v15, v13, v4

    .line 679
    .line 680
    iget v15, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 681
    .line 682
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 683
    .line 684
    .line 685
    move-result-object v15

    .line 686
    aput-object v15, v13, v3

    .line 687
    .line 688
    iget v8, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 689
    .line 690
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    const/4 v15, 0x2

    .line 695
    aput-object v8, v13, v15

    .line 696
    .line 697
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 698
    .line 699
    const/4 v15, 0x3

    .line 700
    aput-object v8, v13, v15

    .line 701
    .line 702
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object v8

    .line 706
    const/4 v15, 0x4

    .line 707
    aput-object v8, v13, v15

    .line 708
    .line 709
    invoke-virtual {v14, v13}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v13

    .line 713
    :cond_17
    if-eqz v13, :cond_18

    .line 714
    .line 715
    sget-object v8, Lmirror/android/view/DisplayAdjustments;->setCompatibilityInfo:Lmirror/RefMethod;

    .line 716
    .line 717
    sget-object v14, Lmirror/android/app/LoadedApkKitkat;->mDisplayAdjustments:Lmirror/RefObject;

    .line 718
    .line 719
    iget-object v15, v1, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 720
    .line 721
    iget-object v15, v15, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 722
    .line 723
    invoke-virtual {v14, v15}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v14

    .line 727
    new-array v15, v3, [Ljava/lang/Object;

    .line 728
    .line 729
    aput-object v13, v15, v4

    .line 730
    .line 731
    invoke-virtual {v8, v14, v15}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    :cond_18
    const/16 v8, 0x1e

    .line 735
    .line 736
    if-lt v7, v8, :cond_19

    .line 737
    .line 738
    const/4 v7, 0x0

    .line 739
    invoke-static {v7}, Landroid/security/net/config/ApplicationConfig;->setDefaultInstance(Landroid/security/net/config/ApplicationConfig;)V

    .line 740
    .line 741
    .line 742
    :cond_19
    iget-object v7, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 743
    .line 744
    iget v7, v7, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 745
    .line 746
    invoke-direct {v1, v7}, Lcom/lody/virtual/client/VClient;->fixSystem(I)V

    .line 747
    .line 748
    .line 749
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    invoke-virtual {v7}, Lcom/lody/virtual/client/core/VirtualCore;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 754
    .line 755
    .line 756
    move-result-object v7

    .line 757
    invoke-interface {v7, v2, v6, v11}, Lcom/lody/virtual/client/core/AppCallback;->beforeStartApplication(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 758
    .line 759
    .line 760
    iget-object v7, v1, Lcom/lody/virtual/client/VClient;->mExportedVApiPkgs:Ljava/util/Set;

    .line 761
    .line 762
    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v7

    .line 766
    if-eqz v7, :cond_1a

    .line 767
    .line 768
    sget-object v7, Lmirror/android/app/LoadedApk;->mClassLoader:Lmirror/RefObject;

    .line 769
    .line 770
    if-eqz v7, :cond_1a

    .line 771
    .line 772
    iget-object v8, v9, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 773
    .line 774
    new-instance v13, Lcom/lody/virtual/helper/ComposeClassLoader;

    .line 775
    .line 776
    const-class v14, Lcom/lody/virtual/client/VClient;

    .line 777
    .line 778
    invoke-virtual {v14}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 779
    .line 780
    .line 781
    move-result-object v14

    .line 782
    sget-object v15, Lmirror/android/app/LoadedApk;->getClassLoader:Lmirror/RefMethod;

    .line 783
    .line 784
    iget-object v3, v9, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 785
    .line 786
    move-object/from16 v19, v10

    .line 787
    .line 788
    new-array v10, v4, [Ljava/lang/Object;

    .line 789
    .line 790
    invoke-virtual {v15, v3, v10}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v3

    .line 794
    check-cast v3, Ljava/lang/ClassLoader;

    .line 795
    .line 796
    invoke-direct {v13, v14, v3}, Lcom/lody/virtual/helper/ComposeClassLoader;-><init>(Ljava/lang/ClassLoader;Ljava/lang/ClassLoader;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v7, v8, v13}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    goto :goto_8

    .line 803
    :cond_1a
    move-object/from16 v19, v10

    .line 804
    .line 805
    :goto_8
    sget-boolean v3, Lcom/lody/virtual/client/VClient;->CheckJunitClazz:Z

    .line 806
    .line 807
    if-eqz v3, :cond_1b

    .line 808
    .line 809
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    if-eqz v3, :cond_1b

    .line 814
    .line 815
    iget-object v3, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 816
    .line 817
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 818
    .line 819
    const/16 v7, 0x1e

    .line 820
    .line 821
    if-ge v3, v7, :cond_1b

    .line 822
    .line 823
    sget-object v3, Lmirror/android/app/LoadedApk;->getClassLoader:Lmirror/RefMethod;

    .line 824
    .line 825
    iget-object v8, v9, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 826
    .line 827
    new-array v10, v4, [Ljava/lang/Object;

    .line 828
    .line 829
    invoke-virtual {v3, v8, v10}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    check-cast v3, Ljava/lang/ClassLoader;

    .line 834
    .line 835
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 836
    .line 837
    if-lt v8, v7, :cond_1b

    .line 838
    .line 839
    invoke-static {v3}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    const-string v7, "parent"

    .line 844
    .line 845
    new-instance v8, Lcom/lody/virtual/client/VClient$2;

    .line 846
    .line 847
    invoke-direct {v8, v1}, Lcom/lody/virtual/client/VClient$2;-><init>(Lcom/lody/virtual/client/VClient;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v3, v7, v8}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 851
    .line 852
    .line 853
    :cond_1b
    invoke-static {v6, v2}, Lcom/lody/virtual/oem/apps/VAppFix;->handleBeforeAppStart(Ljava/lang/String;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    :try_start_4
    sget-object v3, Lmirror/android/app/LoadedApk;->makeApplication:Lmirror/RefMethod;

    .line 857
    .line 858
    iget-object v7, v9, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 859
    .line 860
    const/4 v8, 0x2

    .line 861
    new-array v8, v8, [Ljava/lang/Object;

    .line 862
    .line 863
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 864
    .line 865
    aput-object v10, v8, v4

    .line 866
    .line 867
    const/4 v10, 0x0

    .line 868
    const/4 v13, 0x1

    .line 869
    aput-object v10, v8, v13

    .line 870
    .line 871
    invoke-virtual {v3, v7, v8}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    check-cast v3, Landroid/app/Application;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 876
    .line 877
    invoke-static {v3, v0}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    invoke-static {v6, v2, v3}, Lcom/lody/virtual/oem/apps/VAppFix;->handleAfterAppStart(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    .line 881
    .line 882
    .line 883
    if-eqz v5, :cond_1c

    .line 884
    .line 885
    iput-object v3, v1, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 886
    .line 887
    sget-object v0, Lmirror/android/app/ActivityThread;->mInitialApplication:Lmirror/RefObject;

    .line 888
    .line 889
    invoke-virtual {v0, v12, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    :cond_1c
    sget-object v0, Lmirror/android/app/LoadedApk;->mApplication:Lmirror/RefObject;

    .line 893
    .line 894
    if-eqz v0, :cond_1d

    .line 895
    .line 896
    sget-object v0, Lmirror/android/app/ContextImpl;->mPackageInfo:Lmirror/RefObject;

    .line 897
    .line 898
    invoke-virtual {v0, v11}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    if-eqz v0, :cond_1d

    .line 903
    .line 904
    sget-object v7, Lmirror/android/app/LoadedApk;->mApplication:Lmirror/RefObject;

    .line 905
    .line 906
    invoke-virtual {v7, v0, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 907
    .line 908
    .line 909
    :cond_1d
    const-string v0, "com.tencent.mm:recovery"

    .line 910
    .line 911
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    if-eqz v0, :cond_1e

    .line 916
    .line 917
    iget-object v0, v1, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 918
    .line 919
    invoke-direct {v1, v0}, Lcom/lody/virtual/client/VClient;->fixWeChatRecovery(Landroid/app/Application;)V

    .line 920
    .line 921
    .line 922
    :cond_1e
    const-string v0, "com.android.vending"

    .line 923
    .line 924
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-eqz v0, :cond_1f

    .line 929
    .line 930
    :try_start_5
    const-string v0, "vending_preferences"

    .line 931
    .line 932
    invoke-virtual {v11, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    const-string v7, "notify_updates"

    .line 941
    .line 942
    invoke-interface {v0, v7, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    const-string v7, "notify_updates_completion"

    .line 947
    .line 948
    invoke-interface {v0, v7, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 953
    .line 954
    .line 955
    const-string v0, "finsky"

    .line 956
    .line 957
    invoke-virtual {v11, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    const-string v7, "auto_update_enabled"

    .line 966
    .line 967
    invoke-interface {v0, v7, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 972
    .line 973
    .line 974
    goto :goto_9

    .line 975
    :catchall_2
    move-exception v0

    .line 976
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 977
    .line 978
    .line 979
    :cond_1f
    :goto_9
    iget-object v4, v1, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 980
    .line 981
    monitor-enter v4

    .line 982
    :try_start_6
    iget-object v0, v1, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 983
    .line 984
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 988
    sget-object v0, Lmirror/android/app/ActivityThread;->mBoundApplication:Lmirror/RefObject;

    .line 989
    .line 990
    invoke-virtual {v0, v12}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    sget-object v4, Lmirror/android/app/ActivityThread$AppBindData;->providers:Lmirror/RefObject;

    .line 995
    .line 996
    invoke-virtual {v4, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    check-cast v0, Ljava/util/List;

    .line 1001
    .line 1002
    if-eqz v0, :cond_20

    .line 1003
    .line 1004
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v4

    .line 1008
    if-nez v4, :cond_20

    .line 1009
    .line 1010
    invoke-direct {v1, v3, v0}, Lcom/lody/virtual/client/VClient;->installContentProviders(Landroid/content/Context;Ljava/util/List;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_20
    if-eqz v5, :cond_21

    .line 1014
    .line 1015
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    invoke-interface {v0, v2, v6, v3}, Lcom/lody/virtual/client/core/AppCallback;->beforeApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    .line 1024
    .line 1025
    .line 1026
    :cond_21
    if-eqz p3, :cond_22

    .line 1027
    .line 1028
    invoke-virtual/range {p3 .. p3}, Landroid/os/ConditionVariable;->open()V

    .line 1029
    .line 1030
    .line 1031
    :cond_22
    :try_start_7
    iget-object v0, v1, Lcom/lody/virtual/client/VClient;->mInstrumentation:Landroid/app/Instrumentation;

    .line 1032
    .line 1033
    iget-object v4, v1, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 1034
    .line 1035
    invoke-virtual {v0, v4}, Landroid/app/Instrumentation;->callApplicationOnCreate(Landroid/app/Application;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-static {}, Lcom/lody/virtual/client/core/InvocationStubManager;->getInstance()Lcom/lody/virtual/client/core/InvocationStubManager;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    const-class v4, Lcom/lody/virtual/client/hook/proxies/am/HCallbackStub;

    .line 1043
    .line 1044
    invoke-virtual {v0, v4}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 1045
    .line 1046
    .line 1047
    if-eqz v5, :cond_23

    .line 1048
    .line 1049
    sget-object v0, Lmirror/android/app/ActivityThread;->mInitialApplication:Lmirror/RefObject;

    .line 1050
    .line 1051
    invoke-virtual {v0, v12}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    check-cast v0, Landroid/app/Application;

    .line 1056
    .line 1057
    if-eqz v0, :cond_23

    .line 1058
    .line 1059
    iput-object v0, v1, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 1060
    .line 1061
    goto :goto_a

    .line 1062
    :catch_1
    move-exception v0

    .line 1063
    iget-object v4, v1, Lcom/lody/virtual/client/VClient;->mInstrumentation:Landroid/app/Instrumentation;

    .line 1064
    .line 1065
    invoke-virtual {v4, v3, v0}, Landroid/app/Instrumentation;->onException(Ljava/lang/Object;Ljava/lang/Throwable;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v4

    .line 1069
    if-eqz v4, :cond_25

    .line 1070
    .line 1071
    :cond_23
    :goto_a
    if-eqz v5, :cond_24

    .line 1072
    .line 1073
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getAppCallback()Lcom/lody/virtual/client/core/AppCallback;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    invoke-interface {v0, v2, v6, v3}, Lcom/lody/virtual/client/core/AppCallback;->afterApplicationCreate(Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V

    .line 1082
    .line 1083
    .line 1084
    :cond_24
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    move-object/from16 v2, v19

    .line 1089
    .line 1090
    iget-object v2, v2, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 1091
    .line 1092
    invoke-virtual {v0, v2}, Lcom/lody/virtual/client/ipc/VActivityManager;->appDoneExecuting(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :cond_25
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1097
    .line 1098
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1101
    .line 1102
    .line 1103
    const-string v4, "Unable to create application "

    .line 1104
    .line 1105
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    iget-object v4, v9, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 1109
    .line 1110
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 1111
    .line 1112
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1113
    .line 1114
    .line 1115
    const-string v4, ": "

    .line 1116
    .line 1117
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v4

    .line 1124
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1132
    .line 1133
    .line 1134
    throw v2

    .line 1135
    :catchall_3
    move-exception v0

    .line 1136
    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1137
    throw v0

    .line 1138
    :catchall_4
    move-exception v0

    .line 1139
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1140
    .line 1141
    const-string v3, "Unable to makeApplication"

    .line 1142
    .line 1143
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1144
    .line 1145
    .line 1146
    throw v2

    .line 1147
    :catchall_5
    move-exception v0

    .line 1148
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 1149
    throw v0
.end method

.method private static clearContentProvider(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lmirror/android/providers/Settings$NameValueCacheOreo;->mProviderHolder:Lmirror/RefObject;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lmirror/android/providers/Settings$ContentProviderHolder;->mContentProvider:Lmirror/RefObject;

    .line 17
    .line 18
    invoke-virtual {v0, p0, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, Lmirror/android/providers/Settings$NameValueCache;->mContentProvider:Lmirror/RefObject;

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method private clearSettingProvider()V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/providers/Settings$System;->sNameValueCache:Lmirror/RefStaticObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/client/VClient;->clearContentProvider(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Lmirror/android/providers/Settings$Secure;->sNameValueCache:Lmirror/RefStaticObject;

    .line 13
    .line 14
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Lcom/lody/virtual/client/VClient;->clearContentProvider(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    sget-object v0, Lmirror/android/providers/Settings$Global;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lmirror/android/providers/Settings$Global;->sNameValueCache:Lmirror/RefStaticObject;

    .line 28
    .line 29
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lcom/lody/virtual/client/VClient;->clearContentProvider(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
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

.method private createPackageContext(Ljava/lang/String;)Landroid/content/Context;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p1

    .line 15
    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/lang/RuntimeException;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method private fixInstalledProviders()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient;->clearSettingProvider()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmirror/android/app/ActivityThread;->mProviderMap:Lmirror/RefObject;

    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x1

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    sget-object v2, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mProvider:Lmirror/RefObject;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroid/os/IInterface;

    .line 54
    .line 55
    sget-object v4, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mHolder:Lmirror/RefObject;

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    sget-object v5, Lmirror/android/content/ContentProviderHolderOreo;->info:Lmirror/RefObject;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Landroid/content/pm/ProviderInfo;

    .line 71
    .line 72
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 73
    .line 74
    sget-object v7, Lcom/lody/virtual/client/stub/StubManifest;->STUB_CP_AUTHORITY:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_0

    .line 81
    .line 82
    iget-object v5, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v3, v5, v2}, Lcom/lody/virtual/client/hook/providers/ProviderHook;->createProxy(ZLjava/lang/String;Landroid/os/IInterface;)Landroid/os/IInterface;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    sget-object v3, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mProvider:Lmirror/RefObject;

    .line 89
    .line 90
    invoke-virtual {v3, v1, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    sget-object v1, Lmirror/android/content/ContentProviderHolderOreo;->provider:Lmirror/RefObject;

    .line 94
    .line 95
    invoke-virtual {v1, v4, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    sget-object v2, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mProvider:Lmirror/RefObject;

    .line 100
    .line 101
    invoke-virtual {v2, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Landroid/os/IInterface;

    .line 106
    .line 107
    sget-object v4, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mHolder:Lmirror/RefObject;

    .line 108
    .line 109
    invoke-virtual {v4, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-nez v4, :cond_3

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    sget-object v5, Lmirror/android/app/IActivityManager$ContentProviderHolder;->info:Lmirror/RefObject;

    .line 117
    .line 118
    invoke-virtual {v5, v4}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Landroid/content/pm/ProviderInfo;

    .line 123
    .line 124
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 125
    .line 126
    sget-object v7, Lcom/lody/virtual/client/stub/StubManifest;->STUB_CP_AUTHORITY:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-nez v6, :cond_0

    .line 133
    .line 134
    iget-object v5, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v3, v5, v2}, Lcom/lody/virtual/client/hook/providers/ProviderHook;->createProxy(ZLjava/lang/String;Landroid/os/IInterface;)Landroid/os/IInterface;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    sget-object v3, Lmirror/android/app/ActivityThread$ProviderClientRecordJB;->mProvider:Lmirror/RefObject;

    .line 141
    .line 142
    invoke-virtual {v3, v1, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    sget-object v1, Lmirror/android/app/IActivityManager$ContentProviderHolder;->provider:Lmirror/RefObject;

    .line 146
    .line 147
    invoke-virtual {v1, v4, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    return-void
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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

.method private fixSystem(I)V
    .locals 6

    .line 1
    :try_start_0
    const-class v0, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Class;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "setCompatibilityVersion"

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    new-array v3, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v4, v3, v5

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Lcom/lody/virtual/helper/utils/Reflect;->call(Ljava/lang/String;[Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 20
    .line 21
    .line 22
    const-string v0, "android.graphics.Compatibility"

    .line 23
    .line 24
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "setTargetSdkVersion"

    .line 29
    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    aput-object p1, v2, v5

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/helper/utils/Reflect;->call(Ljava/lang/String;[Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :catchall_0
    invoke-static {}, Lcom/lody/virtual/oem/EmuiHelper;->disableCache()V

    .line 42
    .line 43
    .line 44
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
.end method

.method private fixWeChatRecovery(Landroid/app/Application;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.tencent.recovery.Recovery"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "context"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    .line 40
    .line 41
    :goto_0
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

.method private forbidHost()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "activity"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/app/ActivityManager;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 36
    .line 37
    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    .line 47
    .line 48
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Lcom/lody/virtual/client/core/VirtualCore;->myUid()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eq v2, v3, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget v3, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lcom/lody/virtual/client/ipc/VActivityManager;->isAppPid(I)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-object v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 73
    .line 74
    sget-object v3, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    sget-object v2, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v2, :cond_0

    .line 85
    .line 86
    iget-object v3, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_0

    .line 93
    .line 94
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v3, "/proc/"

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget v4, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 105
    .line 106
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v4, "/maps"

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/4 v4, 0x1

    .line 119
    invoke-static {v2, v4}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 131
    .line 132
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, "/cmdline"

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1, v4}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_5
    return-void
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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

.method public static get()Lcom/lody/virtual/client/VClient;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/VClient;->gClient:Lcom/lody/virtual/client/VClient;

    return-object v0
.end method

.method private getMountPoints()Ljava/util/HashSet;
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "/mnt/sdcard/"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    const-string v1, "/sdcard/"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "/storage/emulated/"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, "/"

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "storage/emulated/"

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Lcom/lody/virtual/helper/compat/StorageManagerCompat;->getAllPoints(Landroid/content/Context;)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    array-length v3, v1

    .line 88
    const/4 v4, 0x0

    .line 89
    :goto_0
    if-ge v4, v3, :cond_1

    .line 90
    .line 91
    aget-object v5, v1, v4

    .line 92
    .line 93
    invoke-virtual {v5, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_0

    .line 98
    .line 99
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    return-object v0
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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

.method private handleNewIntent(Lcom/lody/virtual/client/VClient$NewIntentData;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->intent:Landroid/content/Intent;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/ComponentUtils;->unpackFillIn(Landroid/content/Intent;Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lmirror/com/android/internal/content/ReferrerIntent;->ctor:Lmirror/RefConstructor;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    new-array v2, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->intent:Landroid/content/Intent;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object v3, v2, v4

    .line 23
    .line 24
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->creator:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    aput-object v3, v2, v5

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/content/Intent;

    .line 34
    .line 35
    sget-object v2, Lmirror/android/app/ActivityThread;->performNewIntents:Lmirror/RefMethod;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-array v1, v1, [Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->token:Landroid/os/IBinder;

    .line 46
    .line 47
    aput-object p1, v1, v4

    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    aput-object p1, v1, v5

    .line 54
    .line 55
    invoke-virtual {v2, v3, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object v2, Lmirror/android/app/ActivityThreadNMR1;->performNewIntents:Lmirror/RefMethod;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v6, 0x3

    .line 68
    new-array v6, v6, [Ljava/lang/Object;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->token:Landroid/os/IBinder;

    .line 71
    .line 72
    aput-object p1, v6, v4

    .line 73
    .line 74
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    aput-object p1, v6, v5

    .line 79
    .line 80
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    aput-object p1, v6, v1

    .line 83
    .line 84
    invoke-virtual {v2, v3, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    sget-object v1, Lmirror/android/app/ActivityThread;->mActivities:Lmirror/RefObject;

    .line 95
    .line 96
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v2}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/util/Map;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->token:Landroid/os/IBinder;

    .line 107
    .line 108
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_3

    .line 113
    .line 114
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {p1, v0}, Lmirror/android/app/ActivityThread;->handleNewIntent(Ljava/lang/Object;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    sget-object v2, Lmirror/android/app/ActivityThreadQ;->handleNewIntent:Lmirror/RefMethod;

    .line 123
    .line 124
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-array v1, v1, [Ljava/lang/Object;

    .line 129
    .line 130
    iget-object p1, p1, Lcom/lody/virtual/client/VClient$NewIntentData;->token:Landroid/os/IBinder;

    .line 131
    .line 132
    aput-object p1, v1, v4

    .line 133
    .line 134
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    aput-object p1, v1, v5

    .line 139
    .line 140
    invoke-virtual {v2, v3, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_3
    :goto_0
    return-void
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private handleReceiver(Lcom/lody/virtual/client/VClient$ReceiverData;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    iget-object v3, p0, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 6
    .line 7
    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Lmirror/android/app/ContextImpl;->getReceiverRestrictedContext:Lmirror/RefMethod;

    .line 12
    .line 13
    new-array v5, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v4, v3, v5}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Landroid/content/Context;

    .line 20
    .line 21
    iget-object v5, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->component:Landroid/content/ComponentName;

    .line 22
    .line 23
    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v4, v5}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v5, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->component:Landroid/content/ComponentName;

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    sget-object v6, Lmirror/android/app/LoadedApk;->getClassLoader:Lmirror/RefMethod;

    .line 37
    .line 38
    iget-object v7, p0, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 39
    .line 40
    iget-object v7, v7, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 41
    .line 42
    new-array v8, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v6, v7, v8}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/ClassLoader;

    .line 49
    .line 50
    invoke-virtual {v6, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Landroid/content/BroadcastReceiver;

    .line 59
    .line 60
    sget-object v7, Lmirror/android/content/BroadcastReceiver;->setPendingResult:Lmirror/RefMethod;

    .line 61
    .line 62
    new-array v8, v1, [Ljava/lang/Object;

    .line 63
    .line 64
    aput-object v0, v8, v2

    .line 65
    .line 66
    invoke-virtual {v7, v5, v8}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-object v7, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v7, v3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 79
    .line 80
    invoke-static {v3, v6}, Lcom/lody/virtual/helper/utils/ComponentUtils;->unpackFillIn(Landroid/content/Intent;Ljava/lang/ClassLoader;)V

    .line 81
    .line 82
    .line 83
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-nez v3, :cond_0

    .line 90
    .line 91
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 92
    .line 93
    iget-object v6, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->component:Landroid/content/ComponentName;

    .line 94
    .line 95
    invoke-virtual {v3, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/secondary/FakeIdentityBinder;->setSystemIdentity()V

    .line 99
    .line 100
    .line 101
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 102
    .line 103
    invoke-virtual {v5, v4, v3}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 104
    .line 105
    .line 106
    sget-object v3, Lmirror/android/content/BroadcastReceiver;->getPendingResult:Lmirror/RefMethod;

    .line 107
    .line 108
    new-array v4, v2, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {v3, v5, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    sget-object v3, Lmirror/android/content/BroadcastReceiver$PendingResult;->mToken:Lmirror/RefObject;

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Landroid/os/IBinder;

    .line 123
    .line 124
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4, v3}, Lcom/lody/virtual/client/ipc/VActivityManager;->broadcastFinish(Landroid/os/IBinder;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_1

    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    iget-object v3, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->stacktrace:Ljava/lang/Throwable;

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 142
    .line 143
    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v4, "Unable to start receiver "

    .line 150
    .line 151
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget-object p1, p1, Lcom/lody/virtual/client/VClient$ReceiverData;->component:Landroid/content/ComponentName;

    .line 155
    .line 156
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-array v1, v1, [Ljava/lang/Object;

    .line 164
    .line 165
    aput-object v0, v1, v2

    .line 166
    .line 167
    const-string v0, "VA"

    .line 168
    .line 169
    invoke-static {v0, p1, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_1
    :goto_0
    return-void
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private initDataStorage(ZILjava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p2, p3}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p2, p3}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p3}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
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
.end method

.method private installContentProviders(Landroid/content/Context;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Landroid/content/pm/ProviderInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, Lcom/lody/virtual/client/env/InstallProviderSkip;->isSkip(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    :try_start_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Landroid/content/pm/ProviderInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    :try_start_2
    invoke-static {v2, p1, v3, v4}, Lmirror/android/app/ActivityThread;->installProvider(Ljava/lang/Object;Landroid/content/Context;Landroid/content/pm/ProviderInfo;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v3

    .line 45
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 55
    .line 56
    .line 57
    throw p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private mountVirtualFS(Lcom/lody/virtual/remote/InstalledAppInfo;Z)V
    .locals 16
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3, v2}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v3}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectoryExtRoot(I)Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static {v3, v2}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt_DataUser(ILjava/lang/String;)Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectoryExt_DataUser(Ljava/lang/String;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v3, v2}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v3}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectoryRoot(I)Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v3, v2}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory_DataUser(ILjava/lang/String;)Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectory_DataUser(Ljava/lang/String;)Ljava/io/File;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    iget-boolean v9, v9, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    .line 99
    .line 100
    if-eqz v9, :cond_1

    .line 101
    .line 102
    invoke-virtual/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9, v3, v1}, Lcom/lody/virtual/remote/VDeviceConfig;->getWifiFile(IZ)Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    if-eqz v9, :cond_1

    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_1

    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    const-string v10, "/sys/class/net/wlan0/address"

    .line 123
    .line 124
    invoke-static {v10, v9}, Lcom/lody/virtual/client/NativeEngine;->redirectFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string v10, "/sys/class/net/eth0/address"

    .line 128
    .line 129
    invoke-static {v10, v9}, Lcom/lody/virtual/client/NativeEngine;->redirectFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v10, "/sys/class/net/wifi/address"

    .line 133
    .line 134
    invoke-static {v10, v9}, Lcom/lody/virtual/client/NativeEngine;->redirectFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->forbidHost()V

    .line 138
    .line 139
    .line 140
    new-instance v9, Ljava/io/File;

    .line 141
    .line 142
    const-string v10, "cache"

    .line 143
    .line 144
    invoke-direct {v9, v4, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    const-string v10, "/tmp/"

    .line 152
    .line 153
    invoke-static {v10, v9}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    new-instance v9, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const-string v10, "/data/data/"

    .line 162
    .line 163
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    invoke-static {v9, v4}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->realUserId()I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    new-instance v11, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v12, "/data/user/"

    .line 186
    .line 187
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v13, "/"

    .line 194
    .line 195
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-static {v11, v7}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v11, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const-string v14, "/data/user_de/"

    .line 214
    .line 215
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-static {v11, v5}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v11, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    sget-object v15, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-static {v11}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    new-instance v11, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    sget-object v14, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    invoke-static {v11}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v6}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    new-instance v11, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    sget-object v14, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v14, "/virtual/"

    .line 306
    .line 307
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    invoke-static {v11}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    new-instance v11, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    sget-object v15, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    invoke-static {v11}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    iget-boolean v11, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 341
    .line 342
    const-string v14, "/lib/"

    .line 343
    .line 344
    if-eqz v11, :cond_2

    .line 345
    .line 346
    new-instance v8, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    invoke-static {v8}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_1

    .line 374
    :cond_2
    new-instance v11, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    invoke-static {v11, v6}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    new-instance v11, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    invoke-static {v11, v8}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :goto_1
    invoke-static {v3, v2}, Lcom/lody/virtual/os/VEnvironment;->getUserAppLibDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-static {v8, v6}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    new-instance v8, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    const-string v11, "/data/app/virtual/"

    .line 439
    .line 440
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    const-string v11, "/lib"

    .line 447
    .line 448
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    invoke-static {v8, v6}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->get()Lcom/lody/virtual/client/ipc/VirtualStorageManager;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    iget-object v8, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {v6, v8, v3}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getVirtualStorage(Ljava/lang/String;I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    iget-object v11, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v6, v11, v3}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->isVirtualStorageEnable(Ljava/lang/String;I)Z

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->enableMediaRedirect()Z

    .line 475
    .line 476
    .line 477
    move-result v14

    .line 478
    if-eqz v14, :cond_5

    .line 479
    .line 480
    if-eqz v11, :cond_3

    .line 481
    .line 482
    if-nez v8, :cond_5

    .line 483
    .line 484
    :cond_3
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    invoke-virtual {v8}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    new-instance v11, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 498
    .line 499
    .line 500
    move-result-object v14

    .line 501
    invoke-virtual {v14}, Lcom/lody/virtual/client/core/SettingConfig;->getVirtualSdcardAndroidDataName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 512
    .line 513
    .line 514
    move-result v14

    .line 515
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    invoke-virtual {v8, v11}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    invoke-virtual {v11}, Lcom/lody/virtual/client/core/VirtualCore;->isSharedUserId()Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-eqz v11, :cond_4

    .line 542
    .line 543
    sget-object v11, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 544
    .line 545
    sget-object v14, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual {v8, v11, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v8

    .line 551
    :cond_4
    iget-object v11, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v6, v11, v3, v8}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->setVirtualStorage(Ljava/lang/String;ILjava/lang/String;)V

    .line 554
    .line 555
    .line 556
    iget-object v11, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->packageName:Ljava/lang/String;

    .line 557
    .line 558
    const/4 v14, 0x1

    .line 559
    invoke-virtual {v6, v11, v3, v14}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->setVirtualStorageState(Ljava/lang/String;IZ)V

    .line 560
    .line 561
    .line 562
    move v11, v14

    .line 563
    :cond_5
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/client/VClient;->getMountPoints()Ljava/util/HashSet;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    if-eqz v11, :cond_7

    .line 568
    .line 569
    if-eqz v8, :cond_7

    .line 570
    .line 571
    new-instance v6, Ljava/io/File;

    .line 572
    .line 573
    invoke-direct {v6, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    if-nez v11, :cond_6

    .line 581
    .line 582
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    if-eqz v6, :cond_8

    .line 587
    .line 588
    :cond_6
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 593
    .line 594
    .line 595
    move-result v6

    .line 596
    if-eqz v6, :cond_8

    .line 597
    .line 598
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    check-cast v6, Ljava/lang/String;

    .line 603
    .line 604
    invoke-static {v6, v8}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    goto :goto_2

    .line 608
    :cond_7
    invoke-direct/range {p0 .. p1}, Lcom/lody/virtual/client/VClient;->redirectSdcard(Lcom/lody/virtual/remote/InstalledAppInfo;)V

    .line 609
    .line 610
    .line 611
    :cond_8
    iget-boolean v3, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 612
    .line 613
    if-nez v3, :cond_9

    .line 614
    .line 615
    new-instance v3, Ljava/io/File;

    .line 616
    .line 617
    invoke-virtual/range {p1 .. p2}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApkPath(Z)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    if-eqz v3, :cond_9

    .line 629
    .line 630
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileStub(Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    invoke-virtual/range {p1 .. p2}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApkPath(Z)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    invoke-static {v3, v6}, Lcom/lody/virtual/client/NativeEngine;->redirectFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 642
    .line 643
    const/16 v6, 0x1b

    .line 644
    .line 645
    if-ne v3, v6, :cond_9

    .line 646
    .line 647
    new-instance v3, Lcom/lody/virtual/client/DexOverride;

    .line 648
    .line 649
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileStub(Ljava/lang/String;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    invoke-virtual/range {p1 .. p2}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApkPath(Z)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    const/4 v8, 0x0

    .line 658
    invoke-direct {v3, v6, v1, v8, v8}, Lcom/lody/virtual/client/DexOverride;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-static {v3}, Lcom/lody/virtual/client/NativeEngine;->addDexOverride(Lcom/lody/virtual/client/DexOverride;)V

    .line 662
    .line 663
    .line 664
    :cond_9
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-virtual {v1, v2}, Lcom/lody/virtual/client/core/SettingConfig;->isDisableTinker(Ljava/lang/String;)Z

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    if-eqz v1, :cond_a

    .line 673
    .line 674
    new-instance v1, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    const-string v3, "/tinker/"

    .line 686
    .line 687
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    const/4 v6, 0x0

    .line 695
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 696
    .line 697
    .line 698
    new-instance v1, Ljava/lang/StringBuilder;

    .line 699
    .line 700
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    const-string v8, "/tinker_server/"

    .line 710
    .line 711
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 719
    .line 720
    .line 721
    new-instance v1, Ljava/lang/StringBuilder;

    .line 722
    .line 723
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const-string v10, "/tinker_temp/"

    .line 733
    .line 734
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 742
    .line 743
    .line 744
    new-instance v1, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 769
    .line 770
    .line 771
    new-instance v1, Ljava/lang/StringBuilder;

    .line 772
    .line 773
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 796
    .line 797
    .line 798
    new-instance v1, Ljava/lang/StringBuilder;

    .line 799
    .line 800
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-static {v1, v6}, Lcom/lody/virtual/client/NativeEngine;->forbid(Ljava/lang/String;Z)V

    .line 823
    .line 824
    .line 825
    :cond_a
    const-string v1, "com.google.android.gsf"

    .line 826
    .line 827
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v1

    .line 831
    if-nez v1, :cond_b

    .line 832
    .line 833
    const-string v1, "com.google.android.gms"

    .line 834
    .line 835
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v1

    .line 839
    if-eqz v1, :cond_c

    .line 840
    .line 841
    :cond_b
    const-string v1, "/data/data/com.google.android.gsf/"

    .line 842
    .line 843
    invoke-static {v1, v4}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    const-string v1, "/data/data/com.google.android.gms/"

    .line 847
    .line 848
    invoke-static {v1, v4}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    new-instance v1, Ljava/lang/StringBuilder;

    .line 852
    .line 853
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    const-string v2, "/com.google.android.gsf/"

    .line 863
    .line 864
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-static {v1, v7}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    new-instance v1, Ljava/lang/StringBuilder;

    .line 875
    .line 876
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    const-string v2, "/com.google.android.gms/"

    .line 886
    .line 887
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    invoke-static {v1, v7}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    new-instance v1, Ljava/io/File;

    .line 898
    .line 899
    const-string v2, "misc_ce"

    .line 900
    .line 901
    invoke-direct {v1, v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    new-instance v2, Ljava/lang/StringBuilder;

    .line 905
    .line 906
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 907
    .line 908
    .line 909
    const-string v3, "/data/misc_ce/"

    .line 910
    .line 911
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    invoke-static {v2, v3}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    new-instance v2, Ljava/io/File;

    .line 929
    .line 930
    const-string v3, "checkin"

    .line 931
    .line 932
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 936
    .line 937
    .line 938
    :cond_c
    invoke-static/range {p1 .. p1}, Lcom/lody/virtual/client/NativeEngine;->enableIORedirect(Lcom/lody/virtual/remote/InstalledAppInfo;)V

    .line 939
    .line 940
    .line 941
    return-void
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method private redirectSdcard(Lcom/lody/virtual/remote/InstalledAppInfo;)V
    .locals 9

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient;->redirectSdcardAndroidData()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient;->getMountPoints()Ljava/util/HashSet;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    const-string v4, "/"

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v2, :cond_8

    .line 21
    .line 22
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v6, 0x1e

    .line 31
    .line 32
    if-lt v2, v6, :cond_8

    .line 33
    .line 34
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p1, v2}, Lcom/lody/virtual/remote/InstalledAppInfo;->getApplicationInfo(I)Landroid/content/pm/ApplicationInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 46
    .line 47
    if-ge p1, v6, :cond_8

    .line 48
    .line 49
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->getVirtualSdcardAndroidDataName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isSharedUserId()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    new-instance v0, Ljava/io/File;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget-object v2, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 107
    .line 108
    sget-object v6, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p1, v2, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object p1, v0

    .line 118
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    sget-object v0, Lcom/lody/virtual/client/VClient;->TAG:Ljava/lang/String;

    .line 131
    .line 132
    new-instance v2, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v6, "failed to create dir: "

    .line 138
    .line 139
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v0, v2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_3

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, Ljava/lang/String;

    .line 167
    .line 168
    new-instance v6, Ljava/io/File;

    .line 169
    .line 170
    new-instance v7, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-direct {v6, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-static {v2, v6}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_3
    const-class v0, Landroid/os/Environment;

    .line 201
    .line 202
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Class;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v2, "STANDARD_DIRECTORIES"

    .line 207
    .line 208
    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/utils/Reflect;->field(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/Reflect;->get()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, [Ljava/lang/String;

    .line 217
    .line 218
    array-length v2, v0

    .line 219
    move v6, v5

    .line 220
    :goto_1
    if-ge v6, v2, :cond_5

    .line 221
    .line 222
    aget-object v7, v0, v6

    .line 223
    .line 224
    new-instance v8, Ljava/io/File;

    .line 225
    .line 226
    invoke-direct {v8, p1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    if-nez v7, :cond_4

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 236
    .line 237
    .line 238
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_5
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_7

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, Ljava/lang/String;

    .line 256
    .line 257
    :try_start_0
    array-length v6, v0

    .line 258
    move v7, v5

    .line 259
    :goto_3
    if-ge v7, v6, :cond_6

    .line 260
    .line 261
    aget-object v8, v0, v7

    .line 262
    .line 263
    invoke-static {v2, v8}, Lcom/lody/virtual/client/NativeEngine;->pathCat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-static {v8}, Lcom/lody/virtual/client/NativeEngine;->whitelist(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    .line 269
    .line 270
    add-int/lit8 v7, v7, 0x1

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :catch_0
    move-exception v2

    .line 274
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_7
    move p1, v3

    .line 279
    goto :goto_4

    .line 280
    :cond_8
    move p1, v5

    .line 281
    :goto_4
    if-nez p1, :cond_a

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_a

    .line 292
    .line 293
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, Ljava/lang/String;

    .line 298
    .line 299
    const-string v1, "//"

    .line 300
    .line 301
    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_9

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    sub-int/2addr v1, v3

    .line 320
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    :cond_9
    invoke-static {v1}, Lcom/lody/virtual/client/NativeEngine;->whitelistFile(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_a
    return-void
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private redirectSdcardAndroidData()V
    .locals 10

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/lody/virtual/client/VClient;->getMountPoints()Ljava/util/HashSet;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "/Android/data"

    .line 10
    .line 11
    const-string v3, "/Android/media"

    .line 12
    .line 13
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    const/4 v5, 0x2

    .line 35
    if-ge v4, v5, :cond_0

    .line 36
    .line 37
    aget-object v5, v2, v4

    .line 38
    .line 39
    new-instance v6, Ljava/io/File;

    .line 40
    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v7}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->getVirtualSdcardAndroidDataName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v9, "/"

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->myUserId()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v9, "/external_root/"

    .line 92
    .line 93
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const/16 v9, 0x2f

    .line 97
    .line 98
    invoke-virtual {v5, v9}, Ljava/lang/String;->lastIndexOf(I)I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-virtual {v5, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v7, v5}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v7}, Lcom/lody/virtual/client/core/VirtualCore;->isSharedUserId()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_1

    .line 126
    .line 127
    new-instance v7, Ljava/io/File;

    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    sget-object v8, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 134
    .line 135
    sget-object v9, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    move-object v5, v7

    .line 145
    :cond_1
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-nez v7, :cond_2

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-nez v7, :cond_2

    .line 156
    .line 157
    sget-object v7, Lcom/lody/virtual/client/VClient;->TAG:Ljava/lang/String;

    .line 158
    .line 159
    new-instance v8, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v9, "failed to create dir: "

    .line 165
    .line 166
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-static {v7, v8}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_2
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v6, v5}, Lcom/lody/virtual/client/NativeEngine;->redirectDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    add-int/lit8 v4, v4, 0x1

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_3
    return-void
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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

.method private sendMessage(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput p1, v0, Landroid/os/Message;->what:I

    .line 6
    .line 7
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/lody/virtual/client/VClient;->mH:Lcom/lody/virtual/client/VClient$H;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
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
.end method

.method private setupUncaughtHandler()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ThreadGroup;->getParent()Ljava/lang/ThreadGroup;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ThreadGroup;->getParent()Ljava/lang/ThreadGroup;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lcom/lody/virtual/client/VClient$RootThreadGroup;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lcom/lody/virtual/client/VClient$RootThreadGroup;-><init>(Ljava/lang/ThreadGroup;)V

    .line 23
    .line 24
    .line 25
    sget-object v2, Lmirror/java/lang/ThreadGroupN;->groups:Lmirror/RefObject;

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, [Ljava/lang/ThreadGroup;

    .line 32
    .line 33
    monitor-enter v2

    .line 34
    :try_start_0
    invoke-virtual {v2}, [Ljava/lang/ThreadGroup;->clone()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, [Ljava/lang/ThreadGroup;

    .line 39
    .line 40
    sget-object v4, Lmirror/java/lang/ThreadGroupN;->groups:Lmirror/RefObject;

    .line 41
    .line 42
    invoke-virtual {v4, v1, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    sget-object v4, Lmirror/java/lang/ThreadGroupN;->groups:Lmirror/RefObject;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    new-array v6, v5, [Ljava/lang/ThreadGroup;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    aput-object v1, v6, v7

    .line 52
    .line 53
    invoke-virtual {v4, v0, v6}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    array-length v4, v3

    .line 57
    :goto_1
    if-ge v7, v4, :cond_3

    .line 58
    .line 59
    aget-object v6, v3, v7

    .line 60
    .line 61
    if-nez v6, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    if-ne v6, v1, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    sget-object v8, Lmirror/java/lang/ThreadGroupN;->parent:Lmirror/RefObject;

    .line 68
    .line 69
    invoke-virtual {v8, v6, v1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    sget-object v1, Lmirror/java/lang/ThreadGroupN;->ngroups:Lmirror/RefObject;

    .line 76
    .line 77
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1, v0, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    monitor-exit v2

    .line 85
    return-void

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    throw v0
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
.method public acquireProviderClient(Landroid/content/pm/ProviderInfo;)Landroid/os/IBinder;
    .locals 5

    .line 1
    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Landroid/content/pm/ProviderInfo;->processName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/client/VClient;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "_VA_START_PROCESS"

    .line 9
    .line 10
    iget-object v1, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, ";"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    array-length v2, v0

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    aget-object v0, v0, v2

    .line 36
    .line 37
    :goto_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :try_start_0
    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :goto_1
    if-eqz v0, :cond_2

    .line 60
    .line 61
    sget-object v2, Lmirror/android/content/ContentProviderClient;->mContentProvider:Lmirror/RefObject;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Landroid/os/IInterface;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move-object v2, v1

    .line 74
    :goto_2
    sget-object v0, Lcom/lody/virtual/client/VClient;->TAG:Ljava/lang/String;

    .line 75
    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v4, "acquireProviderClient "

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, " result: "

    .line 90
    .line 91
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, " process: "

    .line 98
    .line 99
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->getProcessName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_3
    return-object v1
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public declared-synchronized addExportedVApiPkg(Ljava/lang/String;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mExportedVApiPkgs:Ljava/util/Set;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    monitor-exit p0

    .line 11
    throw p1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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

.method public bindApplication(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/VClient;->mAllApplications:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    new-instance v0, Landroid/os/ConditionVariable;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->getUIHandler()Landroid/os/Handler;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lcom/lody/virtual/client/VClient$1;

    .line 39
    .line 40
    invoke-direct {v2, p0, p1, p2, v0}, Lcom/lody/virtual/client/VClient$1;-><init>(Lcom/lody/virtual/client/VClient;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lcom/lody/virtual/client/VClient;->bindApplicationMainThread(Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v1, "Unrecorded process: "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public createProxyService(Landroid/content/ComponentName;Landroid/os/IBinder;)Landroid/os/IBinder;
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/lody/virtual/client/hook/secondary/ProxyServiceFactory;->getProxyService(Landroid/content/Context;Landroid/content/ComponentName;Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public createService(Landroid/content/pm/ServiceInfo;Landroid/os/IBinder;)Landroid/app/Service;
    .locals 9

    .line 1
    const-string v0, "mApplication"

    .line 2
    .line 3
    const-string v1, "mPackageInfo"

    .line 4
    .line 5
    const-string v2, ": "

    .line 6
    .line 7
    iget-object v3, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p1, Landroid/content/pm/ServiceInfo;->processName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0, v3, v4}, Lcom/lody/virtual/client/VClient;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v3, Lmirror/android/app/LoadedApk;->getClassLoader:Lmirror/RefMethod;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 17
    .line 18
    iget-object v4, v4, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    new-array v6, v5, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v3, v4, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/ClassLoader;

    .line 28
    .line 29
    :try_start_0
    iget-object v4, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/app/Service;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 40
    .line 41
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v6, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 50
    .line 51
    const/4 v7, 0x3

    .line 52
    invoke-virtual {v4, v6, v7}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    :try_start_2
    invoke-static {v4}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6, v1}, Lcom/lody/virtual/helper/utils/Reflect;->field(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6, v0}, Lcom/lody/virtual/helper/utils/Reflect;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-nez v6, :cond_0

    .line 69
    .line 70
    invoke-static {v4}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6, v1}, Lcom/lody/virtual/helper/utils/Reflect;->field(Ljava/lang/String;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v6}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v1, v0, v6}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    :try_start_3
    sget-object v1, Lcom/lody/virtual/client/VClient;->TAG:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v6, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v8, "ex:"

    .line 99
    .line 100
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-array v6, v5, [Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v1, v0, v6}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_0
    :goto_0
    sget-object v0, Lmirror/android/app/ContextImpl;->setOuterContext:Lmirror/RefMethod;

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    new-array v6, v1, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object v3, v6, v5

    .line 121
    .line 122
    invoke-virtual {v0, v4, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    sget-object v0, Lmirror/android/app/Service;->attach:Lmirror/RefMethod;

    .line 126
    .line 127
    const/4 v6, 0x6

    .line 128
    new-array v6, v6, [Ljava/lang/Object;

    .line 129
    .line 130
    aput-object v4, v6, v5

    .line 131
    .line 132
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    aput-object v8, v6, v1

    .line 137
    .line 138
    iget-object v1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 139
    .line 140
    const/4 v8, 0x2

    .line 141
    aput-object v1, v6, v8

    .line 142
    .line 143
    aput-object p2, v6, v7

    .line 144
    .line 145
    iget-object p2, p0, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    .line 146
    .line 147
    const/4 v1, 0x4

    .line 148
    aput-object p2, v6, v1

    .line 149
    .line 150
    sget-object p2, Lmirror/android/app/ActivityManagerNative;->getDefault:Lmirror/RefStaticMethod;

    .line 151
    .line 152
    new-array v1, v5, [Ljava/lang/Object;

    .line 153
    .line 154
    invoke-virtual {p2, v1}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    const/4 v1, 0x5

    .line 159
    aput-object p2, v6, v1

    .line 160
    .line 161
    invoke-virtual {v0, v3, v6}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    iget-object p2, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v4, p2}, Lcom/lody/virtual/client/fixer/ContextFixer;->fixContext(Landroid/content/Context;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/app/Service;->onCreate()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 170
    .line 171
    .line 172
    return-object v3

    .line 173
    :catch_0
    move-exception p2

    .line 174
    new-instance v0, Ljava/lang/RuntimeException;

    .line 175
    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v3, "Unable to create service "

    .line 182
    .line 183
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :catch_1
    move-exception p2

    .line 210
    new-instance v0, Ljava/lang/RuntimeException;

    .line 211
    .line 212
    new-instance v1, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v3, "Unable to instantiate service "

    .line 218
    .line 219
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    throw v0
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method public finishActivity(Landroid/os/IBinder;)V
    .locals 1

    const/16 v0, 0xd

    invoke-direct {p0, v0, p1}, Lcom/lody/virtual/client/VClient;->sendMessage(ILjava/lang/Object;)V

    return-void
.end method

.method public finishReceiver(Landroid/os/IBinder;)Z
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->get()Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->broadcastFinish(Landroid/os/IBinder;)Z

    move-result p1

    return p1
.end method

.method public getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mAppInfo:Lcom/lody/virtual/remote/InstalledAppInfo;

    return-object v0
.end method

.method public getAppThread()Landroid/os/IBinder;
    .locals 3

    sget-object v0, Lmirror/android/app/ActivityThread;->getApplicationThread:Lmirror/RefMethod;

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->mainThread()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    return-object v0
.end method

.method public getBaseVUid()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, v0, Lcom/lody/virtual/remote/ClientConfig;->vuid:I

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 3

    .line 3
    sget-object v0, Lmirror/android/app/LoadedApk;->getClassLoader:Lmirror/RefMethod;

    iget-object v1, p0, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    iget-object v1, v1, Lcom/lody/virtual/client/VClient$AppBindData;->info:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ClassLoader;

    return-object v0
.end method

.method public getClassLoader(Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/VClient;->createPackageContext(Ljava/lang/String;)Landroid/content/Context;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    return-object p1
.end method

.method public getClientConfig()Lcom/lody/virtual/remote/ClientConfig;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    return-object v0
.end method

.method public getCorePid()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/client/VClient;->corePid:I

    return v0
.end method

.method public getCrashHandler()Lcom/lody/virtual/client/core/CrashHandler;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->crashHandler:Lcom/lody/virtual/client/core/CrashHandler;

    return-object v0
.end method

.method public getCurrentApplication()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    return-object v0
.end method

.method public getCurrentApplicationInfo()Landroid/content/pm/ApplicationInfo;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCurrentPackage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mBoundApplication:Lcom/lody/virtual/client/VClient$AppBindData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/lody/virtual/client/VClient$AppBindData;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/VPackageManager;->getNameForUid(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    return-object v0
    .line 23
.end method

.method public getDebugInfo()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->getProcessName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceConfig()Lcom/lody/virtual/remote/VDeviceConfig;
    .locals 2

    invoke-static {}, Lcom/lody/virtual/client/ipc/VDeviceManager;->get()Lcom/lody/virtual/client/ipc/VDeviceManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/lody/virtual/client/VClient;->getVUid()I

    move-result v1

    invoke-static {v1}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/VDeviceManager;->getDeviceConfig(I)Lcom/lody/virtual/remote/VDeviceConfig;

    move-result-object v0

    return-object v0
.end method

.method public getServices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningServiceInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/lody/virtual/client/service/VServiceRuntime;->getInstance()Lcom/lody/virtual/client/service/VServiceRuntime;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/service/VServiceRuntime;->getServices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getToken()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, Lcom/lody/virtual/remote/ClientConfig;->token:Landroid/os/IBinder;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getVUid()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, v0, Lcom/lody/virtual/remote/ClientConfig;->vuid:I

    .line 8
    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getVUserHandle()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, v0, Lcom/lody/virtual/remote/ClientConfig;->vuid:I

    .line 8
    .line 9
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getVpid()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, v0, Lcom/lody/virtual/remote/ClientConfig;->vpid:I

    .line 8
    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public initProcess(Lcom/lody/virtual/remote/ClientConfig;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "reject init process "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v2, p1, Lcom/lody/virtual/remote/ClientConfig;->vpid:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " : "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lcom/lody/virtual/remote/ClientConfig;->processName:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, ", this process is : "

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    .line 41
    .line 42
    iget-object p1, p1, Lcom/lody/virtual/remote/ClientConfig;->processName:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
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

.method public isAppRunning()Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->mInitialApplication:Landroid/app/Application;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isDynamicApp()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/client/VClient;->getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lcom/lody/virtual/remote/InstalledAppInfo;->dynamic:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isProcessBound()Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/VClient;->clientConfig:Lcom/lody/virtual/remote/ClientConfig;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public scheduleNewIntent(Ljava/lang/String;Landroid/os/IBinder;Landroid/content/Intent;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/lody/virtual/client/VClient$NewIntentData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/VClient$NewIntentData;-><init>(Lcom/lody/virtual/client/VClient$1;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, v0, Lcom/lody/virtual/client/VClient$NewIntentData;->creator:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, v0, Lcom/lody/virtual/client/VClient$NewIntentData;->token:Landroid/os/IBinder;

    .line 10
    .line 11
    iput-object p3, v0, Lcom/lody/virtual/client/VClient$NewIntentData;->intent:Landroid/content/Intent;

    .line 12
    .line 13
    const/16 p1, 0xb

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/client/VClient;->sendMessage(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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
.end method

.method public scheduleReceiver(Ljava/lang/String;Landroid/content/ComponentName;Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/lody/virtual/client/VClient$ReceiverData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/lody/virtual/client/VClient$ReceiverData;-><init>(Lcom/lody/virtual/client/VClient$1;)V

    .line 5
    .line 6
    .line 7
    iput-object p4, v0, Lcom/lody/virtual/client/VClient$ReceiverData;->pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    iput-object p3, v0, Lcom/lody/virtual/client/VClient$ReceiverData;->intent:Landroid/content/Intent;

    .line 10
    .line 11
    iput-object p2, v0, Lcom/lody/virtual/client/VClient$ReceiverData;->component:Landroid/content/ComponentName;

    .line 12
    .line 13
    iput-object p1, v0, Lcom/lody/virtual/client/VClient$ReceiverData;->processName:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Exception;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lcom/lody/virtual/client/VClient$ReceiverData;->stacktrace:Ljava/lang/Throwable;

    .line 21
    .line 22
    const/16 p1, 0xc

    .line 23
    .line 24
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/client/VClient;->sendMessage(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public setCorePid(I)V
    .locals 0

    iput p1, p0, Lcom/lody/virtual/client/VClient;->corePid:I

    return-void
.end method

.method public setCrashHandler(Lcom/lody/virtual/client/core/CrashHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/VClient;->crashHandler:Lcom/lody/virtual/client/core/CrashHandler;

    return-void
.end method
