.class public Lcom/lody/virtual/server/pm/VAppManagerService;
.super Lcom/lody/virtual/server/interfaces/IAppManager$Stub;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "VAppManagerService"

.field private static final sService:Lcom/lody/virtual/helper/utils/Singleton;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/utils/Singleton<",
            "Lcom/lody/virtual/server/pm/VAppManagerService;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final ANDROID_TEST_BASE:Ljava/lang/String;

.field private final ANDROID_TEST_RUNNER:Ljava/lang/String;

.field private final ORG_APACHE_HTTP_LEGACY:Ljava/lang/String;

.field private appEventReceiver:Landroid/content/BroadcastReceiver;

.field private final mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

.field private mRemoteCallbackList:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "Lcom/lody/virtual/server/interfaces/IPackageObserver;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mScanning:Z

.field private final mSystemConfig:Lcom/lody/virtual/server/pm/SystemConfig;

.field private final mUidSystem:Lcom/lody/virtual/server/am/UidSystem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/pm/VAppManagerService$1;

    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VAppManagerService$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->sService:Lcom/lody/virtual/helper/utils/Singleton;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IAppManager$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.test.base"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->ANDROID_TEST_BASE:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "android.test.runner"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->ANDROID_TEST_RUNNER:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "org.apache.http.legacy"

    .line 13
    .line 14
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->ORG_APACHE_HTTP_LEGACY:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lcom/lody/virtual/server/am/UidSystem;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/lody/virtual/server/am/UidSystem;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mUidSystem:Lcom/lody/virtual/server/am/UidSystem;

    .line 22
    .line 23
    new-instance v0, Lcom/lody/virtual/server/pm/SystemConfig;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/SystemConfig;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mSystemConfig:Lcom/lody/virtual/server/pm/SystemConfig;

    .line 29
    .line 30
    new-instance v0, Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/pm/PackagePersistenceLayer;-><init>(Lcom/lody/virtual/server/pm/VAppManagerService;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 36
    .line 37
    new-instance v0, Landroid/os/RemoteCallbackList;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 43
    .line 44
    new-instance v0, Lcom/lody/virtual/server/pm/VAppManagerService$2;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/pm/VAppManagerService$2;-><init>(Lcom/lody/virtual/server/pm/VAppManagerService;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->appEventReceiver:Landroid/content/BroadcastReceiver;

    .line 50
    .line 51
    return-void
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

.method static synthetic access$000(Lcom/lody/virtual/server/pm/VAppManagerService;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    return p0
.end method

.method static synthetic access$100(Lcom/lody/virtual/server/pm/VAppManagerService;Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/lody/virtual/server/pm/VAppManagerService;Lcom/lody/virtual/server/pm/PackageSetting;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/pm/VAppManagerService;->uninstallPackageFully(Lcom/lody/virtual/server/pm/PackageSetting;Z)V

    return-void
.end method

.method private cleanUpResidualFiles(Lcom/lody/virtual/server/pm/PackageSetting;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    const-string v2, "cleanup residual files for : %s"

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v3}, Lcom/lody/virtual/server/pm/VAppManagerService;->uninstallPackageFully(Lcom/lody/virtual/server/pm/PackageSetting;Z)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private extractApacheFrameworksForPie()V
    .locals 3

    .line 1
    const-string v0, "org.apache.http.legacy.boot"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getOptimizedFrameworkFile(Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2, v0, v1}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFileFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    return-void
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

.method public static get()Lcom/lody/virtual/server/pm/VAppManagerService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->sService:Lcom/lody/virtual/helper/utils/Singleton;

    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/Singleton;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/server/pm/VAppManagerService;

    return-object v0
.end method

.method private installOrUpdateMediaProvider()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->enableMediaRedirect()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "com.yqtech.multiapp.media.module"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, ".apk"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v3, Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4, v2}, Lcom/lody/virtual/client/core/VirtualCore;->isAppInstalled(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    new-instance v2, Ljava/io/File;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    cmp-long v2, v4, v6

    .line 74
    .line 75
    if-lez v2, :cond_2

    .line 76
    .line 77
    :try_start_0
    invoke-static {v0, v1, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFileFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 92
    .line 93
    const/16 v1, 0x1a

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>(II)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v1, v2, v0}, Lcom/lody/virtual/client/core/VirtualCore;->installPackage(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    :try_start_1
    invoke-static {v0, v1, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFileFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 121
    .line 122
    invoke-direct {v0}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v1, v2, v0}, Lcom/lody/virtual/client/core/VirtualCore;->installPackage(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :catch_1
    move-exception v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 139
    .line 140
    .line 141
    :cond_2
    :goto_1
    return-void
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

.method private installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/lody/virtual/remote/VAppInstallerParams;->getInstallFlags()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x4

    .line 12
    if-eqz p1, :cond_3e

    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1c

    .line 21
    .line 22
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v6, "package"

    .line 27
    .line 28
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const-string v8, "file"

    .line 33
    .line 34
    if-nez v7, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-nez v7, :cond_1

    .line 41
    .line 42
    invoke-static {v5}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_1
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    invoke-static {v5}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_2
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    invoke-static {v5}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/4 v6, 0x7

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/env/HostPackageManager;->get()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-wide/16 v9, 0x400

    .line 101
    .line 102
    invoke-virtual {v0, v8, v9, v10}, Lcom/lody/virtual/client/env/HostPackageManager;->getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_0

    .line 107
    :catch_0
    move-exception v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    :goto_0
    if-nez v0, :cond_4

    .line 113
    .line 114
    invoke-static {v8, v6}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_4
    new-instance v8, Ljava/io/File;

    .line 120
    .line 121
    iget-object v9, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 122
    .line 123
    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v9, v8

    .line 127
    move-object v8, v0

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    new-instance v8, Ljava/io/File;

    .line 130
    .line 131
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    move-object v9, v8

    .line 139
    const/4 v8, 0x0

    .line 140
    :goto_1
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_3d

    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    goto/16 :goto_1b

    .line 153
    .line 154
    :cond_6
    const/4 v10, 0x0

    .line 155
    :try_start_1
    invoke-static {v9, v10}, Landroid/content/pm/PackageParser;->parseApkLite(Ljava/io/File;I)Landroid/content/pm/PackageParser$ApkLite;

    .line 156
    .line 157
    .line 158
    move-result-object v11
    :try_end_1
    .catch Landroid/content/pm/PackageParser$PackageParserException; {:try_start_1 .. :try_end_1} :catch_2

    .line 159
    iget-object v0, v11, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    move-object/from16 v12, p2

    .line 164
    .line 165
    invoke-direct {v1, v9, v11, v12}, Lcom/lody/virtual/server/pm/VAppManagerService;->installSplitPackageInternal(Ljava/io/File;Landroid/content/pm/PackageParser$ApkLite;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :cond_7
    move-object/from16 v12, p2

    .line 171
    .line 172
    :try_start_2
    invoke-static {v9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->parsePackage(Ljava/io/File;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 173
    .line 174
    .line 175
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    move-object v13, v0

    .line 177
    goto :goto_2

    .line 178
    :catchall_0
    move-exception v0

    .line 179
    move-object v13, v0

    .line 180
    invoke-virtual {v13}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    :goto_2
    if-eqz v13, :cond_3c

    .line 185
    .line 186
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 187
    .line 188
    if-nez v0, :cond_8

    .line 189
    .line 190
    goto/16 :goto_1a

    .line 191
    .line 192
    :cond_8
    invoke-static {v0}, Lcom/lody/virtual/server/pm/PackageCacheManager;->get(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    const/4 v15, 0x5

    .line 197
    const/4 v6, 0x3

    .line 198
    const/4 v5, -0x1

    .line 199
    const/16 v17, 0x2

    .line 200
    .line 201
    if-eqz v14, :cond_c

    .line 202
    .line 203
    and-int/lit8 v0, v4, 0x4

    .line 204
    .line 205
    if-eqz v0, :cond_9

    .line 206
    .line 207
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v0, v6}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :cond_9
    and-int/lit8 v0, v4, 0x2

    .line 215
    .line 216
    if-nez v0, :cond_a

    .line 217
    .line 218
    iget v0, v14, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionCode:I

    .line 219
    .line 220
    iget v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionCode:I

    .line 221
    .line 222
    if-lt v0, v6, :cond_a

    .line 223
    .line 224
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v0, v15}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :cond_a
    and-int/lit8 v0, v4, 0x8

    .line 232
    .line 233
    if-nez v0, :cond_b

    .line 234
    .line 235
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v0, v6, v5}, Lcom/lody/virtual/server/am/VActivityManagerService;->killAppByPkg(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    :cond_b
    move/from16 v6, v17

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_c
    move v6, v10

    .line 248
    :goto_3
    new-instance v15, Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 249
    .line 250
    invoke-direct {v15}, Lcom/lody/virtual/remote/VAppInstallerResult;-><init>()V

    .line 251
    .line 252
    .line 253
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 254
    .line 255
    iput-object v0, v15, Lcom/lody/virtual/remote/VAppInstallerResult;->packageName:Ljava/lang/String;

    .line 256
    .line 257
    iput v6, v15, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    .line 258
    .line 259
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 264
    .line 265
    .line 266
    move-result v19

    .line 267
    const/4 v5, 0x6

    .line 268
    if-nez v19, :cond_d

    .line 269
    .line 270
    sget-object v2, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 271
    .line 272
    new-instance v3, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v4, "failed to create app dir: "

    .line 278
    .line 279
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v2, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iput v5, v15, Lcom/lody/virtual/remote/VAppInstallerResult;->flags:I

    .line 293
    .line 294
    return-object v15

    .line 295
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/lody/virtual/remote/VAppInstallerParams;->getCpuAbiOverride()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v5, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    const/16 v20, 0x1

    .line 305
    .line 306
    if-eqz v0, :cond_e

    .line 307
    .line 308
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {v11}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    new-instance v7, Ljava/io/File;

    .line 315
    .line 316
    invoke-static {v0}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    invoke-direct {v7, v11, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    move-wide/from16 v24, v2

    .line 324
    .line 325
    move/from16 v28, v4

    .line 326
    .line 327
    move-object v3, v5

    .line 328
    move/from16 p1, v6

    .line 329
    .line 330
    move-object v2, v7

    .line 331
    move/from16 v10, v20

    .line 332
    .line 333
    const/4 v4, 0x0

    .line 334
    const/4 v7, 0x0

    .line 335
    goto/16 :goto_f

    .line 336
    .line 337
    :cond_e
    if-eqz v8, :cond_11

    .line 338
    .line 339
    sget-object v0, Lmirror/android/content/pm/ApplicationInfoL;->primaryCpuAbi:Lmirror/RefObject;

    .line 340
    .line 341
    invoke-virtual {v0, v8}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Ljava/lang/String;

    .line 346
    .line 347
    sget-object v7, Lmirror/android/content/pm/ApplicationInfoL;->secondaryCpuAbi:Lmirror/RefObject;

    .line 348
    .line 349
    invoke-virtual {v7, v8}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    check-cast v7, Ljava/lang/String;

    .line 354
    .line 355
    iget-object v10, v8, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 356
    .line 357
    if-eqz v10, :cond_f

    .line 358
    .line 359
    new-instance v11, Ljava/io/File;

    .line 360
    .line 361
    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_f
    const/4 v11, 0x0

    .line 366
    :goto_4
    sget-object v10, Lmirror/android/content/pm/ApplicationInfoL;->secondaryNativeLibraryDir:Lmirror/RefObject;

    .line 367
    .line 368
    invoke-virtual {v10, v8}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    check-cast v10, Ljava/lang/String;

    .line 373
    .line 374
    if-eqz v10, :cond_10

    .line 375
    .line 376
    move-object/from16 p1, v0

    .line 377
    .line 378
    new-instance v0, Ljava/io/File;

    .line 379
    .line 380
    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_10
    move-object/from16 p1, v0

    .line 385
    .line 386
    const/4 v0, 0x0

    .line 387
    :goto_5
    sget-object v10, Lmirror/android/content/pm/ApplicationInfoL;->nativeLibraryRootDir:Lmirror/RefObject;

    .line 388
    .line 389
    invoke-virtual {v10, v8}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    check-cast v10, Ljava/lang/String;

    .line 394
    .line 395
    move-object/from16 v16, v0

    .line 396
    .line 397
    new-instance v0, Ljava/io/File;

    .line 398
    .line 399
    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    sget-object v10, Lmirror/android/content/pm/ApplicationInfoL;->nativeLibraryRootRequiresIsa:Lmirror/RefBoolean;

    .line 403
    .line 404
    invoke-virtual {v10, v8}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    move-wide/from16 v24, v2

    .line 409
    .line 410
    move/from16 v28, v4

    .line 411
    .line 412
    move-object v3, v5

    .line 413
    move-object v2, v11

    .line 414
    move-object/from16 v4, v16

    .line 415
    .line 416
    move-object v11, v0

    .line 417
    move-object/from16 v0, p1

    .line 418
    .line 419
    move/from16 p1, v6

    .line 420
    .line 421
    goto/16 :goto_f

    .line 422
    .line 423
    :cond_11
    :try_start_3
    iget-boolean v0, v11, Landroid/content/pm/PackageParser$ApkLite;->use32bitAbi:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 424
    .line 425
    goto :goto_6

    .line 426
    :catchall_1
    move-exception v0

    .line 427
    move-object v7, v0

    .line 428
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    .line 429
    .line 430
    .line 431
    const/4 v0, 0x0

    .line 432
    :goto_6
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    invoke-static {v7}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->getPackageAbiList(Ljava/lang/String;)Ljava/util/Set;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    sget-object v10, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 441
    .line 442
    invoke-static {v10, v7}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->findSupportedAbi([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    sget-object v11, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v11, v7}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->findSupportedAbi([Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    sget-object v11, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 453
    .line 454
    const/16 v22, 0x0

    .line 455
    .line 456
    aget-object v11, v11, v22

    .line 457
    .line 458
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 459
    .line 460
    .line 461
    move-result-object v23

    .line 462
    invoke-virtual/range {v23 .. v23}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 463
    .line 464
    .line 465
    move-result v23

    .line 466
    if-nez v23, :cond_12

    .line 467
    .line 468
    const-string v11, "arm64-v8a"

    .line 469
    .line 470
    const/4 v0, 0x0

    .line 471
    :cond_12
    if-eqz v7, :cond_14

    .line 472
    .line 473
    if-nez v0, :cond_13

    .line 474
    .line 475
    if-nez v10, :cond_14

    .line 476
    .line 477
    :cond_13
    move-object v0, v7

    .line 478
    move-object v7, v10

    .line 479
    goto :goto_7

    .line 480
    :cond_14
    if-eqz v10, :cond_16

    .line 481
    .line 482
    if-eqz v0, :cond_15

    .line 483
    .line 484
    if-nez v7, :cond_16

    .line 485
    .line 486
    :cond_15
    move-object v0, v10

    .line 487
    goto :goto_7

    .line 488
    :cond_16
    move-object v0, v11

    .line 489
    const/4 v7, 0x0

    .line 490
    :goto_7
    new-instance v10, Ljava/util/HashSet;

    .line 491
    .line 492
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 493
    .line 494
    .line 495
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 496
    .line 497
    if-nez v11, :cond_17

    .line 498
    .line 499
    new-instance v11, Ljava/util/ArrayList;

    .line 500
    .line 501
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 502
    .line 503
    .line 504
    iput-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 505
    .line 506
    :cond_17
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 507
    .line 508
    if-nez v11, :cond_18

    .line 509
    .line 510
    new-instance v11, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .line 514
    .line 515
    iput-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 516
    .line 517
    :cond_18
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 518
    .line 519
    iget v11, v11, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 520
    .line 521
    const/16 v12, 0x17

    .line 522
    .line 523
    if-ge v11, v12, :cond_19

    .line 524
    .line 525
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 526
    .line 527
    const-string v12, "org.apache.http.legacy"

    .line 528
    .line 529
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    if-nez v11, :cond_19

    .line 534
    .line 535
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-nez v11, :cond_19

    .line 542
    .line 543
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :cond_19
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 549
    .line 550
    const-string v12, "android.test.runner"

    .line 551
    .line 552
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    if-nez v11, :cond_1b

    .line 557
    .line 558
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v11

    .line 564
    if-eqz v11, :cond_1a

    .line 565
    .line 566
    goto :goto_8

    .line 567
    :cond_1a
    const/4 v11, 0x0

    .line 568
    goto :goto_9

    .line 569
    :cond_1b
    :goto_8
    move/from16 v11, v20

    .line 570
    .line 571
    :goto_9
    if-nez v11, :cond_1c

    .line 572
    .line 573
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isR()Z

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    if-eqz v11, :cond_1d

    .line 578
    .line 579
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 580
    .line 581
    iget v11, v11, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 582
    .line 583
    const/16 v12, 0x1e

    .line 584
    .line 585
    if-ge v11, v12, :cond_1d

    .line 586
    .line 587
    :cond_1c
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 588
    .line 589
    const-string v12, "android.test.base"

    .line 590
    .line 591
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v11

    .line 595
    if-nez v11, :cond_1d

    .line 596
    .line 597
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 598
    .line 599
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v11

    .line 603
    if-nez v11, :cond_1d

    .line 604
    .line 605
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    :cond_1d
    iget-object v11, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object v11

    .line 616
    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v12

    .line 620
    const/16 v23, 0x9

    .line 621
    .line 622
    move-wide/from16 v24, v2

    .line 623
    .line 624
    const-string v2, "android"

    .line 625
    .line 626
    const/16 v26, 0x8

    .line 627
    .line 628
    if-eqz v12, :cond_20

    .line 629
    .line 630
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v12

    .line 634
    check-cast v12, Ljava/lang/String;

    .line 635
    .line 636
    iget-object v3, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mSystemConfig:Lcom/lody/virtual/server/pm/SystemConfig;

    .line 637
    .line 638
    invoke-virtual {v3, v12}, Lcom/lody/virtual/server/pm/SystemConfig;->getSharedLibrary(Ljava/lang/String;)Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    if-nez v3, :cond_1e

    .line 643
    .line 644
    sget-object v2, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 645
    .line 646
    new-instance v3, Ljava/lang/StringBuilder;

    .line 647
    .line 648
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 649
    .line 650
    .line 651
    move-object/from16 v27, v11

    .line 652
    .line 653
    const-string v11, "skip optional shared library: "

    .line 654
    .line 655
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    invoke-static {v2, v3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    move-wide/from16 v2, v24

    .line 669
    .line 670
    move-object/from16 v11, v27

    .line 671
    .line 672
    goto :goto_a

    .line 673
    :cond_1e
    move-object/from16 v27, v11

    .line 674
    .line 675
    iget-object v11, v3, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->path:Ljava/lang/String;

    .line 676
    .line 677
    invoke-interface {v10, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 681
    .line 682
    .line 683
    move-result v11

    .line 684
    if-eqz v11, :cond_1f

    .line 685
    .line 686
    sget-object v11, Lmirror/android/content/pm/SharedLibraryInfo;->ctor:Lmirror/RefConstructor;

    .line 687
    .line 688
    const/16 v12, 0xa

    .line 689
    .line 690
    new-array v12, v12, [Ljava/lang/Object;

    .line 691
    .line 692
    move/from16 v28, v4

    .line 693
    .line 694
    iget-object v4, v3, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->path:Ljava/lang/String;

    .line 695
    .line 696
    const/16 v22, 0x0

    .line 697
    .line 698
    aput-object v4, v12, v22

    .line 699
    .line 700
    const/4 v4, 0x0

    .line 701
    aput-object v4, v12, v20

    .line 702
    .line 703
    aput-object v4, v12, v17

    .line 704
    .line 705
    iget-object v3, v3, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->name:Ljava/lang/String;

    .line 706
    .line 707
    const/16 v21, 0x3

    .line 708
    .line 709
    aput-object v3, v12, v21

    .line 710
    .line 711
    const/4 v3, -0x1

    .line 712
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 713
    .line 714
    .line 715
    move-result-object v21

    .line 716
    const/4 v3, 0x4

    .line 717
    aput-object v21, v12, v3

    .line 718
    .line 719
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    const/16 v18, 0x5

    .line 724
    .line 725
    aput-object v3, v12, v18

    .line 726
    .line 727
    new-instance v3, Landroid/content/pm/VersionedPackage;

    .line 728
    .line 729
    move-object/from16 v29, v5

    .line 730
    .line 731
    const-wide/16 v4, 0x0

    .line 732
    .line 733
    invoke-direct {v3, v2, v4, v5}, Landroid/content/pm/VersionedPackage;-><init>(Ljava/lang/String;J)V

    .line 734
    .line 735
    .line 736
    const/4 v2, 0x6

    .line 737
    aput-object v3, v12, v2

    .line 738
    .line 739
    const/4 v2, 0x7

    .line 740
    const/4 v3, 0x0

    .line 741
    aput-object v3, v12, v2

    .line 742
    .line 743
    aput-object v3, v12, v26

    .line 744
    .line 745
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 746
    .line 747
    aput-object v2, v12, v23

    .line 748
    .line 749
    invoke-virtual {v11, v12}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    check-cast v2, Landroid/content/pm/SharedLibraryInfo;

    .line 754
    .line 755
    move-object/from16 v3, v29

    .line 756
    .line 757
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    goto :goto_b

    .line 761
    :cond_1f
    move/from16 v28, v4

    .line 762
    .line 763
    move-object v3, v5

    .line 764
    :goto_b
    move-object v5, v3

    .line 765
    move-wide/from16 v2, v24

    .line 766
    .line 767
    move-object/from16 v11, v27

    .line 768
    .line 769
    move/from16 v4, v28

    .line 770
    .line 771
    goto/16 :goto_a

    .line 772
    .line 773
    :cond_20
    move/from16 v28, v4

    .line 774
    .line 775
    move-object v3, v5

    .line 776
    iget-object v4, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 777
    .line 778
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    if-eqz v5, :cond_23

    .line 787
    .line 788
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    check-cast v5, Ljava/lang/String;

    .line 793
    .line 794
    iget-object v11, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mSystemConfig:Lcom/lody/virtual/server/pm/SystemConfig;

    .line 795
    .line 796
    invoke-virtual {v11, v5}, Lcom/lody/virtual/server/pm/SystemConfig;->getSharedLibrary(Ljava/lang/String;)Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;

    .line 797
    .line 798
    .line 799
    move-result-object v11

    .line 800
    if-nez v11, :cond_21

    .line 801
    .line 802
    sget-object v11, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 803
    .line 804
    new-instance v12, Ljava/lang/StringBuilder;

    .line 805
    .line 806
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 807
    .line 808
    .line 809
    move-object/from16 v27, v4

    .line 810
    .line 811
    const-string v4, "skip required shared library: "

    .line 812
    .line 813
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v4

    .line 823
    invoke-static {v11, v4}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    :goto_d
    move-object/from16 v4, v27

    .line 827
    .line 828
    goto :goto_c

    .line 829
    :cond_21
    move-object/from16 v27, v4

    .line 830
    .line 831
    iget-object v4, v11, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->path:Ljava/lang/String;

    .line 832
    .line 833
    invoke-interface {v10, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    if-eqz v4, :cond_22

    .line 841
    .line 842
    sget-object v4, Lmirror/android/content/pm/SharedLibraryInfo;->ctor:Lmirror/RefConstructor;

    .line 843
    .line 844
    const/16 v5, 0xa

    .line 845
    .line 846
    new-array v12, v5, [Ljava/lang/Object;

    .line 847
    .line 848
    iget-object v5, v11, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->path:Ljava/lang/String;

    .line 849
    .line 850
    const/16 v22, 0x0

    .line 851
    .line 852
    aput-object v5, v12, v22

    .line 853
    .line 854
    const/4 v5, 0x0

    .line 855
    aput-object v5, v12, v20

    .line 856
    .line 857
    aput-object v5, v12, v17

    .line 858
    .line 859
    iget-object v11, v11, Lcom/lody/virtual/server/pm/SystemConfig$SharedLibraryEntry;->name:Ljava/lang/String;

    .line 860
    .line 861
    const/16 v29, 0x3

    .line 862
    .line 863
    aput-object v11, v12, v29

    .line 864
    .line 865
    const/4 v11, -0x1

    .line 866
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 867
    .line 868
    .line 869
    move-result-object v21

    .line 870
    const/4 v11, 0x4

    .line 871
    aput-object v21, v12, v11

    .line 872
    .line 873
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 874
    .line 875
    .line 876
    move-result-object v11

    .line 877
    const/16 v18, 0x5

    .line 878
    .line 879
    aput-object v11, v12, v18

    .line 880
    .line 881
    new-instance v11, Landroid/content/pm/VersionedPackage;

    .line 882
    .line 883
    move/from16 p1, v6

    .line 884
    .line 885
    const-wide/16 v5, 0x0

    .line 886
    .line 887
    invoke-direct {v11, v2, v5, v6}, Landroid/content/pm/VersionedPackage;-><init>(Ljava/lang/String;J)V

    .line 888
    .line 889
    .line 890
    const/16 v19, 0x6

    .line 891
    .line 892
    aput-object v11, v12, v19

    .line 893
    .line 894
    const/4 v11, 0x7

    .line 895
    const/16 v21, 0x0

    .line 896
    .line 897
    aput-object v21, v12, v11

    .line 898
    .line 899
    aput-object v21, v12, v26

    .line 900
    .line 901
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 902
    .line 903
    aput-object v11, v12, v23

    .line 904
    .line 905
    invoke-virtual {v4, v12}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    check-cast v4, Landroid/content/pm/SharedLibraryInfo;

    .line 910
    .line 911
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    goto :goto_e

    .line 915
    :cond_22
    move/from16 p1, v6

    .line 916
    .line 917
    const-wide/16 v5, 0x0

    .line 918
    .line 919
    const/16 v18, 0x5

    .line 920
    .line 921
    const/16 v29, 0x3

    .line 922
    .line 923
    :goto_e
    move/from16 v6, p1

    .line 924
    .line 925
    goto :goto_d

    .line 926
    :cond_23
    move/from16 p1, v6

    .line 927
    .line 928
    invoke-interface {v10}, Ljava/util/Set;->isEmpty()Z

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    if-nez v2, :cond_24

    .line 933
    .line 934
    iget-object v2, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 935
    .line 936
    const/4 v4, 0x0

    .line 937
    new-array v5, v4, [Ljava/lang/String;

    .line 938
    .line 939
    invoke-interface {v10, v5}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v4

    .line 943
    check-cast v4, [Ljava/lang/String;

    .line 944
    .line 945
    iput-object v4, v2, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 946
    .line 947
    :cond_24
    iget-object v2, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 948
    .line 949
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 950
    .line 951
    .line 952
    move-result-object v11

    .line 953
    new-instance v2, Ljava/io/File;

    .line 954
    .line 955
    invoke-static {v0}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v4

    .line 959
    invoke-direct {v2, v11, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    if-eqz v7, :cond_25

    .line 963
    .line 964
    new-instance v4, Ljava/io/File;

    .line 965
    .line 966
    invoke-static {v7}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v5

    .line 970
    invoke-direct {v4, v11, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    move/from16 v10, v20

    .line 974
    .line 975
    goto :goto_f

    .line 976
    :cond_25
    move/from16 v10, v20

    .line 977
    .line 978
    const/4 v4, 0x0

    .line 979
    :goto_f
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->primaryCpuAbi:Lmirror/RefObject;

    .line 980
    .line 981
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 982
    .line 983
    invoke-virtual {v5, v6, v0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->secondaryCpuAbi:Lmirror/RefObject;

    .line 987
    .line 988
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 989
    .line 990
    invoke-virtual {v5, v6, v7}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    if-eqz v11, :cond_26

    .line 994
    .line 995
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->nativeLibraryRootDir:Lmirror/RefObject;

    .line 996
    .line 997
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 998
    .line 999
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v12

    .line 1003
    invoke-virtual {v5, v6, v12}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    :cond_26
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->nativeLibraryRootRequiresIsa:Lmirror/RefBoolean;

    .line 1007
    .line 1008
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1009
    .line 1010
    invoke-virtual {v5, v6, v10}, Lmirror/RefBoolean;->set(Ljava/lang/Object;Z)V

    .line 1011
    .line 1012
    .line 1013
    if-eqz v2, :cond_27

    .line 1014
    .line 1015
    iget-object v5, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1016
    .line 1017
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v6

    .line 1021
    iput-object v6, v5, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 1022
    .line 1023
    :cond_27
    if-eqz v4, :cond_28

    .line 1024
    .line 1025
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->secondaryNativeLibraryDir:Lmirror/RefObject;

    .line 1026
    .line 1027
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1028
    .line 1029
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v10

    .line 1033
    invoke-virtual {v5, v6, v10}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    :cond_28
    if-eqz v8, :cond_2a

    .line 1037
    .line 1038
    iget-object v3, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1039
    .line 1040
    iget-object v5, v8, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 1041
    .line 1042
    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 1043
    .line 1044
    iget-object v5, v8, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1045
    .line 1046
    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1047
    .line 1048
    iget-object v5, v8, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 1049
    .line 1050
    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 1051
    .line 1052
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1053
    .line 1054
    const/16 v6, 0x1a

    .line 1055
    .line 1056
    if-lt v5, v6, :cond_29

    .line 1057
    .line 1058
    invoke-static {v8}, Lcom/lody/virtual/server/pm/a;->a(Landroid/content/pm/ApplicationInfo;)[Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v5

    .line 1062
    invoke-static {v3, v5}, Lcom/lody/virtual/server/pm/b;->a(Landroid/content/pm/ApplicationInfo;[Ljava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_29
    iget-object v3, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1066
    .line 1067
    iget-object v5, v8, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 1068
    .line 1069
    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 1070
    .line 1071
    iget-object v5, v8, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 1072
    .line 1073
    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 1074
    .line 1075
    sget-object v3, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos:Lmirror/RefObject;

    .line 1076
    .line 1077
    if-eqz v3, :cond_2b

    .line 1078
    .line 1079
    invoke-static {v8}, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos(Landroid/content/pm/ApplicationInfo;)Ljava/util/List;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v3

    .line 1083
    iget-object v5, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1084
    .line 1085
    invoke-static {v5, v3}, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos(Landroid/content/pm/ApplicationInfo;Ljava/util/List;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_10

    .line 1089
    :cond_2a
    iget-object v5, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 1090
    .line 1091
    invoke-static {v5}, Lcom/lody/virtual/os/VEnvironment;->getPackageFile(Ljava/lang/String;)Ljava/io/File;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v5

    .line 1095
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v5

    .line 1099
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1100
    .line 1101
    iput-object v5, v6, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 1102
    .line 1103
    iput-object v5, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1104
    .line 1105
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos:Lmirror/RefObject;

    .line 1106
    .line 1107
    if-eqz v5, :cond_2b

    .line 1108
    .line 1109
    invoke-static {v6, v3}, Lmirror/android/content/pm/ApplicationInfoP;->sharedLibraryInfos(Landroid/content/pm/ApplicationInfo;Ljava/util/List;)V

    .line 1110
    .line 1111
    .line 1112
    :cond_2b
    :goto_10
    iget-object v3, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 1113
    .line 1114
    invoke-static {v3}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->scanSourceDir:Lmirror/RefObject;

    .line 1123
    .line 1124
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1125
    .line 1126
    invoke-virtual {v5, v6, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->scanPublicSourceDir:Lmirror/RefObject;

    .line 1130
    .line 1131
    iget-object v6, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1132
    .line 1133
    invoke-virtual {v5, v6, v3}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    new-instance v3, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;

    .line 1137
    .line 1138
    invoke-direct {v3, v9}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;-><init>(Ljava/io/File;)V

    .line 1139
    .line 1140
    .line 1141
    if-nez v8, :cond_2f

    .line 1142
    .line 1143
    invoke-static {v11}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v5

    .line 1147
    if-nez v5, :cond_2c

    .line 1148
    .line 1149
    sget-object v5, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 1150
    .line 1151
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1152
    .line 1153
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1154
    .line 1155
    .line 1156
    const-string v10, "failed to create native lib root dir: "

    .line 1157
    .line 1158
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v6

    .line 1168
    invoke-static {v5, v6}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    :cond_2c
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v5

    .line 1175
    if-eqz v5, :cond_2d

    .line 1176
    .line 1177
    invoke-virtual {v3, v2, v0}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->copyNativeBinaries(Ljava/io/File;Ljava/lang/String;)I

    .line 1178
    .line 1179
    .line 1180
    goto :goto_11

    .line 1181
    :cond_2d
    sget-object v5, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 1182
    .line 1183
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1186
    .line 1187
    .line 1188
    const-string v10, "failed to create native lib dir: "

    .line 1189
    .line 1190
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    invoke-static {v5, v2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    :goto_11
    if-eqz v7, :cond_2f

    .line 1204
    .line 1205
    invoke-static {v4}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v2

    .line 1209
    if-eqz v2, :cond_2e

    .line 1210
    .line 1211
    invoke-virtual {v3, v4, v7}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->copyNativeBinaries(Ljava/io/File;Ljava/lang/String;)I

    .line 1212
    .line 1213
    .line 1214
    goto :goto_12

    .line 1215
    :cond_2e
    sget-object v2, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 1216
    .line 1217
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1220
    .line 1221
    .line 1222
    const-string v5, "failed to create secondary native lib dir: "

    .line 1223
    .line 1224
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    invoke-static {v2, v3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    :cond_2f
    :goto_12
    if-eqz v14, :cond_30

    .line 1238
    .line 1239
    iget-object v2, v14, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 1242
    .line 1243
    goto :goto_13

    .line 1244
    :cond_30
    new-instance v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 1245
    .line 1246
    invoke-direct {v2}, Lcom/lody/virtual/server/pm/PackageSetting;-><init>()V

    .line 1247
    .line 1248
    .line 1249
    :goto_13
    iput-object v0, v2, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    .line 1250
    .line 1251
    iput-object v7, v2, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-static {v0}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->is64bitAbi(Ljava/lang/String;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    iput-boolean v0, v2, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    .line 1258
    .line 1259
    if-nez v8, :cond_32

    .line 1260
    .line 1261
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageFile(Ljava/lang/String;)Ljava/io/File;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v3

    .line 1267
    :try_start_4
    invoke-static {v9, v3}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFile(Ljava/io/File;Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1268
    .line 1269
    .line 1270
    move/from16 v0, v20

    .line 1271
    .line 1272
    goto :goto_14

    .line 1273
    :catch_1
    move-exception v0

    .line 1274
    move-object v4, v0

    .line 1275
    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 1276
    .line 1277
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1280
    .line 1281
    .line 1282
    const-string v6, "failed to copy file: "

    .line 1283
    .line 1284
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v5

    .line 1294
    invoke-static {v0, v5}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1298
    .line 1299
    .line 1300
    const/4 v0, 0x0

    .line 1301
    :goto_14
    if-nez v0, :cond_31

    .line 1302
    .line 1303
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 1304
    .line 1305
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 1310
    .line 1311
    .line 1312
    const/4 v2, 0x6

    .line 1313
    iput v2, v15, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 1314
    .line 1315
    return-object v15

    .line 1316
    :cond_31
    invoke-static {v3}, Lcom/lody/virtual/os/VEnvironment;->chmodPackageDictionary(Ljava/io/File;)V

    .line 1317
    .line 1318
    .line 1319
    move-object v9, v3

    .line 1320
    :cond_32
    if-eqz v8, :cond_33

    .line 1321
    .line 1322
    move/from16 v0, v20

    .line 1323
    .line 1324
    goto :goto_15

    .line 1325
    :cond_33
    const/4 v0, 0x0

    .line 1326
    :goto_15
    iput-boolean v0, v2, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 1327
    .line 1328
    iget-object v0, v13, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 1329
    .line 1330
    iput-object v0, v2, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 1331
    .line 1332
    iget-object v0, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mUidSystem:Lcom/lody/virtual/server/am/UidSystem;

    .line 1333
    .line 1334
    invoke-virtual {v0, v13}, Lcom/lody/virtual/server/am/UidSystem;->getOrCreateUid(Lcom/lody/virtual/server/pm/parser/VPackage;)I

    .line 1335
    .line 1336
    .line 1337
    move-result v0

    .line 1338
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getAppId(I)I

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    iput v0, v2, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 1343
    .line 1344
    and-int/lit8 v0, p1, 0x2

    .line 1345
    .line 1346
    if-eqz v0, :cond_34

    .line 1347
    .line 1348
    move-wide/from16 v3, v24

    .line 1349
    .line 1350
    iput-wide v3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->lastUpdateTime:J

    .line 1351
    .line 1352
    goto :goto_18

    .line 1353
    :cond_34
    move-wide/from16 v3, v24

    .line 1354
    .line 1355
    iput-wide v3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->firstInstallTime:J

    .line 1356
    .line 1357
    iput-wide v3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->lastUpdateTime:J

    .line 1358
    .line 1359
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-virtual {v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUserIds()[I

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    array-length v3, v0

    .line 1368
    const/4 v4, 0x0

    .line 1369
    :goto_16
    if-ge v4, v3, :cond_36

    .line 1370
    .line 1371
    aget v5, v0, v4

    .line 1372
    .line 1373
    if-nez v5, :cond_35

    .line 1374
    .line 1375
    move/from16 v6, v20

    .line 1376
    .line 1377
    goto :goto_17

    .line 1378
    :cond_35
    const/4 v6, 0x0

    .line 1379
    :goto_17
    const/4 v7, 0x0

    .line 1380
    invoke-virtual {v2, v5, v7, v7, v6}, Lcom/lody/virtual/server/pm/PackageSetting;->setUserState(IZZZ)V

    .line 1381
    .line 1382
    .line 1383
    add-int/lit8 v4, v4, 0x1

    .line 1384
    .line 1385
    goto :goto_16

    .line 1386
    :cond_36
    :goto_18
    invoke-static {v13}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->savePackageCache(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-static {v13, v2}, Lcom/lody/virtual/server/pm/PackageCacheManager;->put(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;)V

    .line 1390
    .line 1391
    .line 1392
    iget-boolean v0, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 1393
    .line 1394
    if-nez v0, :cond_37

    .line 1395
    .line 1396
    iget-object v0, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 1397
    .line 1398
    invoke-virtual {v0}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 1399
    .line 1400
    .line 1401
    :cond_37
    if-nez v8, :cond_39

    .line 1402
    .line 1403
    invoke-virtual {v2}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v0

    .line 1407
    if-nez v0, :cond_39

    .line 1408
    .line 1409
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->getCurrentInstructionSet()Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    iget-object v3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 1414
    .line 1415
    invoke-static {v3, v0}, Lcom/lody/virtual/os/VEnvironment;->getOatFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v3

    .line 1423
    if-eqz v3, :cond_38

    .line 1424
    .line 1425
    invoke-virtual/range {p2 .. p2}, Lcom/lody/virtual/remote/VAppInstallerParams;->getInstallFlags()I

    .line 1426
    .line 1427
    .line 1428
    move-result v3

    .line 1429
    and-int/lit8 v3, v3, 0x10

    .line 1430
    .line 1431
    if-nez v3, :cond_39

    .line 1432
    .line 1433
    :cond_38
    :try_start_5
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v3

    .line 1437
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-static {v3, v0}, Lcom/lody/virtual/helper/DexOptimizer;->dex2oat(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1442
    .line 1443
    .line 1444
    goto :goto_19

    .line 1445
    :catchall_2
    move-exception v0

    .line 1446
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1447
    .line 1448
    .line 1449
    :cond_39
    :goto_19
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    const/4 v3, 0x0

    .line 1454
    invoke-virtual {v0, v3}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->refreshAuthenticatorCache(Ljava/lang/String;)V

    .line 1455
    .line 1456
    .line 1457
    iget-boolean v0, v1, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 1458
    .line 1459
    if-nez v0, :cond_3a

    .line 1460
    .line 1461
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V

    .line 1462
    .line 1463
    .line 1464
    :cond_3a
    and-int/lit8 v0, v28, 0x1

    .line 1465
    .line 1466
    if-eqz v0, :cond_3b

    .line 1467
    .line 1468
    const/4 v3, -0x1

    .line 1469
    invoke-direct {v1, v2, v3}, Lcom/lody/virtual/server/pm/VAppManagerService;->notifyAppInstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V

    .line 1470
    .line 1471
    .line 1472
    :cond_3b
    const/4 v2, 0x0

    .line 1473
    iput v2, v15, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 1474
    .line 1475
    return-object v15

    .line 1476
    :cond_3c
    :goto_1a
    move v2, v6

    .line 1477
    invoke-static {v2}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    return-object v0

    .line 1482
    :catch_2
    move v2, v5

    .line 1483
    invoke-static {v2}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    return-object v0

    .line 1488
    :cond_3d
    :goto_1b
    move v2, v5

    .line 1489
    invoke-static {v2}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    return-object v0

    .line 1494
    :cond_3e
    :goto_1c
    move v2, v5

    .line 1495
    invoke-static {v2}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    return-object v0
.end method

.method private installSplitPackageInternal(Ljava/io/File;Landroid/content/pm/PackageParser$ApkLite;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 7

    .line 1
    iget-object v0, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/PackageCacheManager;->get(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, v1}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v2, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 21
    .line 22
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v4, p2, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {p3}, Lcom/lody/virtual/remote/VAppInstallerParams;->getInstallFlags()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    and-int/lit8 v3, v3, 0x2

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    iget-object p1, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 51
    .line 52
    const/4 p2, 0x5

    .line 53
    invoke-static {p1, p2}, Lcom/lody/virtual/remote/VAppInstallerResult;->create(Ljava/lang/String;I)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_2
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 59
    .line 60
    iget-object v4, p2, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x3

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    const/4 v3, 0x1

    .line 68
    :goto_1
    invoke-virtual {p3}, Lcom/lody/virtual/remote/VAppInstallerParams;->getInstallFlags()I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    and-int/2addr p3, v1

    .line 73
    if-nez p3, :cond_4

    .line 74
    .line 75
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    iget-object v1, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 80
    .line 81
    const/4 v4, -0x1

    .line 82
    invoke-virtual {p3, v1, v4}, Lcom/lody/virtual/server/am/VActivityManagerService;->killAppByPkg(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget-object p3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v1, p2, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    iget-object p3, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v1, p2, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {p3, v1}, Lcom/lody/virtual/os/VEnvironment;->getSplitPackageFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    :try_start_0
    invoke-static {p1, p3}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFile(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catch_0
    move-exception p3

    .line 105
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-static {p3}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->getPackageAbiList(Ljava/lang/String;)Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    const/4 v1, 0x0

    .line 117
    new-array v4, v1, [Ljava/lang/String;

    .line 118
    .line 119
    invoke-interface {p3, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    check-cast p3, [Ljava/lang/String;

    .line 124
    .line 125
    array-length v4, p3

    .line 126
    if-lez v4, :cond_6

    .line 127
    .line 128
    aget-object p3, p3, v1

    .line 129
    .line 130
    iget-object v4, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v4}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    new-instance v5, Ljava/io/File;

    .line 137
    .line 138
    invoke-static {p3}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iput-object p3, v2, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {p3}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->is64bitAbi(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    iput-boolean v4, v2, Lcom/lody/virtual/server/pm/PackageSetting;->is64bitPackage:Z

    .line 152
    .line 153
    new-instance v2, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;

    .line 154
    .line 155
    invoke-direct {v2, p1}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;-><init>(Ljava/io/File;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v5}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    invoke-virtual {v2, v5, p3}, Lcom/lody/virtual/helper/compat/NativeLibraryHelperCompat;->copyNativeBinaries(Ljava/io/File;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    sget-object p1, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 169
    .line 170
    new-instance p3, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v2, "failed to create native lib dir: "

    .line 176
    .line 177
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-static {p1, p3}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->savePackageCache(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 191
    .line 192
    .line 193
    iget-boolean p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 194
    .line 195
    if-nez p1, :cond_7

    .line 196
    .line 197
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V

    .line 198
    .line 199
    .line 200
    :cond_7
    new-instance p1, Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 201
    .line 202
    iget-object p2, p2, Landroid/content/pm/PackageParser$ApkLite;->packageName:Ljava/lang/String;

    .line 203
    .line 204
    invoke-direct {p1, p2, v1, v3}, Lcom/lody/virtual/remote/VAppInstallerResult;-><init>(Ljava/lang/String;II)V

    .line 205
    .line 206
    .line 207
    return-object p1
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
.end method

.method private loadPackageInnerLocked(Lcom/lody/virtual/server/pm/PackageSetting;)Z
    .locals 7

    .line 1
    iget-boolean v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Lcom/lody/virtual/client/core/VirtualCore;->isOutsideInstalled(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    iget v2, p1, Lcom/lody/virtual/server/pm/PackageSetting;->version:I

    .line 20
    .line 21
    const/4 v3, 0x6

    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v2, v3, :cond_1

    .line 24
    .line 25
    const/4 v3, 0x7

    .line 26
    if-ge v2, v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/VAppManagerService;->reInstallVApp(Lcom/lody/virtual/server/pm/PackageSetting;)V

    .line 29
    .line 30
    .line 31
    iput v3, p1, Lcom/lody/virtual/server/pm/PackageSetting;->version:I

    .line 32
    .line 33
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 34
    .line 35
    iput-boolean v4, v2, Lcom/lody/virtual/server/pm/PackagePersistenceLayer;->changed:Z

    .line 36
    .line 37
    :cond_1
    iget-object v2, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->getPackageCacheFile(Ljava/lang/String;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :try_start_0
    iget-object v3, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->readPackageCache(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 46
    .line 47
    .line 48
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    :goto_0
    if-eqz v3, :cond_6

    .line 56
    .line 57
    iget-object v5, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 58
    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    invoke-static {v2}, Lcom/lody/virtual/os/VEnvironment;->chmodPackageDictionary(Ljava/io/File;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v3, p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->put(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;)V

    .line 67
    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v2, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 80
    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    invoke-virtual {v0, v2, v5, v6}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget v2, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionCode:I

    .line 88
    .line 89
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 90
    .line 91
    if-eq v2, v0, :cond_3

    .line 92
    .line 93
    move v0, v4

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move v0, v1

    .line 96
    :goto_1
    new-instance v2, Ljava/io/File;

    .line 97
    .line 98
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 99
    .line 100
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 101
    .line 102
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    xor-int/2addr v2, v4

    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    :cond_4
    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 115
    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v3, "app ("

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget-object v3, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v3, ") has changed version, update it."

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    new-array v3, v1, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {v0, v2, v3}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 146
    .line 147
    const/16 v2, 0xa

    .line 148
    .line 149
    invoke-direct {v0, v2, v4}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>(II)V

    .line 150
    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v3, "package:"

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catch_0
    move-exception p1

    .line 180
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    return v1

    .line 184
    :cond_5
    :goto_2
    return v4

    .line 185
    :cond_6
    :goto_3
    return v1
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

.method private notifyAppInstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    if-ne p2, v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageInstalled(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-interface {v0, v2, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageInstalledAsUser(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 47
    .line 48
    invoke-interface {v0, p2, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageInstalledAsUser(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 54
    .line 55
    .line 56
    :goto_1
    move v0, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 59
    .line 60
    invoke-direct {v0, p2}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->sendInstalledBroadcast(Ljava/lang/String;Lcom/lody/virtual/os/VUserHandle;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

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

.method private notifyAppUninstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    if-ne p2, v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageUninstalled(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-interface {v0, v2, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageUninstalledAsUser(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/lody/virtual/server/interfaces/IPackageObserver;

    .line 47
    .line 48
    invoke-interface {v0, p2, p1}, Lcom/lody/virtual/server/interfaces/IPackageObserver;->onPackageUninstalledAsUser(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 54
    .line 55
    .line 56
    :goto_1
    move v0, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v0, Lcom/lody/virtual/os/VUserHandle;

    .line 59
    .line 60
    invoke-direct {v0, p2}, Lcom/lody/virtual/os/VUserHandle;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->sendUninstalledBroadcast(Ljava/lang/String;Lcom/lody/virtual/os/VUserHandle;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

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

.method private sendInstalledBroadcast(Ljava/lang/String;Lcom/lody/virtual/os/VUserHandle;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "package:"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0, p2}, Lcom/lody/virtual/server/am/VActivityManagerService;->sendBroadcastAsUser(Landroid/content/Intent;Lcom/lody/virtual/os/VUserHandle;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method private sendUninstalledBroadcast(Ljava/lang/String;Lcom/lody/virtual/os/VUserHandle;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "package:"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0, p2}, Lcom/lody/virtual/server/am/VActivityManagerService;->sendBroadcastAsUser(Landroid/content/Intent;Lcom/lody/virtual/os/VUserHandle;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method private startup()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mSystemConfig:Lcom/lody/virtual/server/pm/SystemConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lody/virtual/server/pm/SystemConfig;->load()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mUidSystem:Lcom/lody/virtual/server/am/UidSystem;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/lody/virtual/server/am/UidSystem;->initUidList()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/content/IntentFilter;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "android.intent.action.PACKAGE_REPLACED"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "package"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->appEventReceiver:Landroid/content/BroadcastReceiver;

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

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

.method public static systemReady()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->systemReady()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isQ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->extractApacheFrameworksForPie()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->startup()V

    .line 28
    .line 29
    .line 30
    return-void
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

.method private uninstallPackageFully(Lcom/lody/virtual/server/pm/PackageSetting;Z)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, -0x1

    .line 8
    invoke-virtual {v1, v0, v2}, Lcom/lody/virtual/server/am/VActivityManagerService;->killAppByPkg(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/lody/virtual/server/pm/PackageCacheManager;->remove(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getOatDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectory()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, v0}, Lcom/lody/virtual/helper/PackageCleaner;->cleanAllUserPackage(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/lody/virtual/os/VUserManager;->getUsers()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lcom/lody/virtual/os/VUserInfo;

    .line 58
    .line 59
    invoke-static {}, Lcom/lody/virtual/server/notification/VNotificationManagerService;->get()Lcom/lody/virtual/server/notification/VNotificationManagerService;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v5, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 64
    .line 65
    iget v6, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 66
    .line 67
    invoke-virtual {v4, v5, v6}, Lcom/lody/virtual/server/notification/VNotificationManagerService;->cancelAllNotification(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    iget v3, v3, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 71
    .line 72
    invoke-static {v3}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3, v0}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->clear(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    if-eqz p2, :cond_1

    .line 81
    .line 82
    invoke-direct {p0, p1, v2}, Lcom/lody/virtual/server/pm/VAppManagerService;->notifyAppUninstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-boolean p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 86
    .line 87
    if-nez p1, :cond_2

    .line 88
    .line 89
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/4 p2, 0x0

    .line 97
    invoke-virtual {p1, p2}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->refreshAuthenticatorCache(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
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


# virtual methods
.method public cleanPackageData(Ljava/lang/String;I)Z
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/am/VActivityManagerService;->get()Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, p1, p2}, Lcom/lody/virtual/server/am/VActivityManagerService;->killAppByPkg(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/server/notification/VNotificationManagerService;->get()Lcom/lody/virtual/server/notification/VNotificationManagerService;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, v3, p2}, Lcom/lody/virtual/server/notification/VNotificationManagerService;->cancelAllNotification(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p1}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p1}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    new-array v3, v2, [I

    .line 41
    .line 42
    aput p2, v3, v1

    .line 43
    .line 44
    iget-object v0, v0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v3, v0}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->cleanPackageData([ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->clear(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return v2
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
.end method

.method public getInstalledAppCount()I
    .locals 1

    invoke-static {}, Lcom/lody/virtual/server/pm/PackageCacheManager;->size()I

    move-result v0

    return v0
.end method

.method public getInstalledAppInfo(Ljava/lang/String;I)Lcom/lody/virtual/remote/InstalledAppInfo;
    .locals 0

    .line 1
    const-class p2, Lcom/lody/virtual/server/pm/PackageCacheManager;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/lody/virtual/server/pm/PackageSetting;->getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    monitor-exit p2

    .line 17
    return-object p1

    .line 18
    :cond_0
    monitor-exit p2

    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
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

.method public getInstalledApps(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/InstalledAppInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/VAppManagerService;->getInstalledAppCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    invoke-virtual {v0}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 32
    .line 33
    iget-object v2, v2, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/lody/virtual/server/pm/PackageSetting;->getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    monitor-exit v0

    .line 46
    return-object p1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
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

.method public getInstalledAppsAsUser(II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/InstalledAppInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/lody/virtual/server/pm/VAppManagerService;->getInstalledAppCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcom/lody/virtual/server/pm/PackageCacheManager;->PACKAGE_CACHE:Landroid/util/ArrayMap;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    invoke-virtual {v1}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 32
    .line 33
    iget-object v3, v3, Lcom/lody/virtual/server/pm/parser/VPackage;->mExtras:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lcom/lody/virtual/server/pm/PackageSetting;

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isInstalled(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    and-int/lit8 v5, p2, 0x1

    .line 42
    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isHidden(I)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    :cond_1
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/lody/virtual/server/pm/PackageSetting;->getAppInfo()Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    monitor-exit v1

    .line 63
    return-object v0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p1
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

.method public getInstalledSplitNames(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/lody/virtual/server/pm/PackageCacheManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->get(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    monitor-exit v0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
    .line 27
.end method

.method public getPackageInstalledUsers(Ljava/lang/String;)[I
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    new-instance v1, Lcom/lody/virtual/helper/collection/IntArray;

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-direct {v1, v2}, Lcom/lody/virtual/helper/collection/IntArray;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUserIds()[I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, v2

    .line 23
    :goto_0
    if-ge v0, v3, :cond_1

    .line 24
    .line 25
    aget v4, v2, v0

    .line 26
    .line 27
    invoke-virtual {p1, v4}, Lcom/lody/virtual/server/pm/PackageSetting;->readUserState(I)Lcom/lody/virtual/server/pm/PackageUserState;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-boolean v5, v5, Lcom/lody/virtual/server/pm/PackageUserState;->installed:Z

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Lcom/lody/virtual/helper/collection/IntArray;->add(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/IntArray;->getAll()[I

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2
    new-array p1, v0, [I

    .line 47
    .line 48
    return-object p1
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

.method public getUidForSharedUser(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mUidSystem:Lcom/lody/virtual/server/am/UidSystem;

    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/am/UidSystem;->getUid(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public installPackage(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_0

    .line 10
    :catchall_1
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    new-instance p2, Ljava/lang/RuntimeException;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2

    .line 20
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
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

.method public declared-synchronized installPackageAsUser(ILjava/lang/String;)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {p2}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isInstalled(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2, p1, v1}, Lcom/lody/virtual/server/pm/PackageSetting;->setInstalled(IZ)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->syncPackages()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p2, p1}, Lcom/lody/virtual/server/pm/VAppManagerService;->notifyAppInstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return v1

    .line 41
    :cond_0
    monitor-exit p0

    .line 42
    return v1

    .line 43
    :cond_1
    monitor-exit p0

    .line 44
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    monitor-exit p0

    .line 48
    throw p1
    .line 49
    .line 50
.end method

.method public isAppInstalled(Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->contain(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isAppInstalledAsUser(ILjava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p2}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isInstalled(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    return v0
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

.method public isPackageLaunched(ILjava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isLaunched(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1
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

.method public isRunInExtProcess(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1
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

.method declared-synchronized loadPackage(Lcom/lody/virtual/server/pm/PackageSetting;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VAppManagerService;->loadPackageInnerLocked(Lcom/lody/virtual/server/pm/PackageSetting;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/VAppManagerService;->cleanUpResidualFiles(Lcom/lody/virtual/server/pm/PackageSetting;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    monitor-exit p0

    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit p0

    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onUserCreated(Lcom/lody/virtual/os/VUserInfo;)V
    .locals 0

    iget p1, p1, Lcom/lody/virtual/os/VUserInfo;->id:I

    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getDataUserDirectory(I)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    return-void
.end method

.method public reInstallVApp(Lcom/lody/virtual/server/pm/PackageSetting;)V
    .locals 10

    .line 1
    iget-boolean v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 2
    .line 3
    const-string v1, "package:"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageFile(Ljava/lang/String;)Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    iget-object v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileExt(Ljava/lang/String;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_0
    const-string v1, "PackagePersistenceLayer"

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    const/4 v3, 0x1

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    new-instance v4, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 86
    .line 87
    const/16 v5, 0x1a

    .line 88
    .line 89
    invoke-direct {v4, v5, v3}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>(II)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0, v4}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v0, v0, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 97
    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    iget-object v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v4, p1, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 107
    .line 108
    iput-object v4, v0, Lcom/lody/virtual/server/pm/PackageSetting;->userState:Landroid/util/SparseArray;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    new-array v0, v3, [Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v4, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 114
    .line 115
    aput-object v4, v0, v2

    .line 116
    .line 117
    const-string v4, "update package info failed : install %s failed"

    .line 118
    .line 119
    invoke-static {v1, v4, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_1
    iget-boolean v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 123
    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    iget-object v0, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 127
    .line 128
    const-string v4, "no_use"

    .line 129
    .line 130
    invoke-static {v0, v4}, Lcom/lody/virtual/os/VEnvironment;->getSplitPackageFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v4, Lcom/lody/virtual/server/pm/VAppManagerService$3;

    .line 139
    .line 140
    invoke-direct {v4, p0}, Lcom/lody/virtual/server/pm/VAppManagerService$3;-><init>(Lcom/lody/virtual/server/pm/VAppManagerService;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v4}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    array-length v4, v0

    .line 150
    if-lez v4, :cond_6

    .line 151
    .line 152
    new-instance v4, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 153
    .line 154
    const/16 v5, 0xa

    .line 155
    .line 156
    invoke-direct {v4, v5}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>(I)V

    .line 157
    .line 158
    .line 159
    array-length v5, v0

    .line 160
    move v6, v2

    .line 161
    :goto_2
    if-ge v6, v5, :cond_6

    .line 162
    .line 163
    aget-object v7, v0, v6

    .line 164
    .line 165
    invoke-static {v7}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-direct {p0, v8, v4}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    iget v8, v8, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 174
    .line 175
    if-eqz v8, :cond_5

    .line 176
    .line 177
    const/4 v8, 0x2

    .line 178
    new-array v8, v8, [Ljava/lang/Object;

    .line 179
    .line 180
    iget-object v9, p1, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 181
    .line 182
    aput-object v9, v8, v2

    .line 183
    .line 184
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    aput-object v7, v8, v3

    .line 189
    .line 190
    const-string v7, "update split package info failed : install %s apk:%s failed"

    .line 191
    .line 192
    invoke-static {v1, v7, v8}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_6
    return-void
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

.method public registerObserver(Lcom/lody/virtual/server/interfaces/IPackageObserver;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    :goto_0
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method restoreFactoryState()V
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "Warning: Restore the factory state..."

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getRoot()Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/io/File;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->systemReady()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public savePersistenceData()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    invoke-virtual {v0}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    return-void
.end method

.method public scanApps()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 10
    .line 11
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/lody/virtual/helper/PersistenceLayer;->read()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 17
    .line 18
    iget-boolean v3, v2, Lcom/lody/virtual/server/pm/PackagePersistenceLayer;->changed:Z

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iput-boolean v1, v2, Lcom/lody/virtual/server/pm/PackagePersistenceLayer;->changed:Z

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lcom/lody/virtual/server/pm/VAppManagerService;->TAG:Ljava/lang/String;

    .line 28
    .line 29
    const-string v3, "Package PersistenceLayer updated."

    .line 30
    .line 31
    new-array v4, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v2, v3, v4}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/VAppManagerService;->installOrUpdateMediaProvider()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v0}, Lcom/lody/virtual/server/pm/VUserManagerService;->getUsers(Z)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {}, Lcom/lody/virtual/client/env/SpecialComponentList;->getPreInstallPackages()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :catch_0
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Lcom/lody/virtual/server/pm/VAppManagerService;->isAppInstalled(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    :try_start_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-wide/16 v7, 0x0

    .line 82
    .line 83
    invoke-virtual {v6, v4, v7, v8}, Lcom/lody/virtual/client/env/HostPackageManager;->getApplicationInfo(Ljava/lang/String;J)Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    :cond_3
    :try_start_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    :cond_4
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_2

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lcom/lody/virtual/os/VUserInfo;

    .line 101
    .line 102
    if-nez v5, :cond_5

    .line 103
    .line 104
    iget v8, v7, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 105
    .line 106
    if-nez v8, :cond_5

    .line 107
    .line 108
    new-instance v7, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 109
    .line 110
    const/16 v8, 0xa

    .line 111
    .line 112
    invoke-direct {v7, v8, v0}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>(II)V

    .line 113
    .line 114
    .line 115
    new-instance v8, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v9, "package:"

    .line 121
    .line 122
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-direct {p0, v8, v7}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageInternal(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    iget v8, v7, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 141
    .line 142
    invoke-virtual {p0, v8, v4}, Lcom/lody/virtual/server/pm/VAppManagerService;->isAppInstalledAsUser(ILjava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-nez v8, :cond_4

    .line 147
    .line 148
    iget v7, v7, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 149
    .line 150
    invoke-virtual {p0, v7, v4}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackageAsUser(ILjava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_6
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-virtual {v0, v2}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->refreshAuthenticatorCache(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    .line 161
    .line 162
    :try_start_3
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 163
    .line 164
    monitor-exit p0

    .line 165
    return-void

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mScanning:Z

    .line 168
    .line 169
    throw v0

    .line 170
    :catchall_1
    move-exception v0

    .line 171
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 172
    throw v0
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

.method public setPackageHidden(ILjava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, p1, p3}, Lcom/lody/virtual/server/pm/PackageSetting;->setHidden(IZ)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 23
    .line 24
    .line 25
    :cond_0
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
.end method

.method public declared-synchronized uninstallPackage(Ljava/lang/String;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/pm/VAppManagerService;->uninstallPackageFully(Lcom/lody/virtual/server/pm/PackageSetting;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v0

    .line 14
    :cond_0
    monitor-exit p0

    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit p0

    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public declared-synchronized uninstallPackageAsUser(Ljava/lang/String;I)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0, p2}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return v1

    .line 15
    :cond_0
    :try_start_1
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/VAppManagerService;->getPackageInstalledUsers(Ljava/lang/String;)[I

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2, p2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->contains([II)Z

    .line 26
    .line 27
    .line 28
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return v1

    .line 33
    :cond_1
    :try_start_2
    array-length v2, v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-gt v2, v3, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, v0, v3}, Lcom/lody/virtual/server/pm/VAppManagerService;->uninstallPackageFully(Lcom/lody/virtual/server/pm/PackageSetting;Z)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/server/pm/VAppManagerService;->cleanPackageData(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2, v1}, Lcom/lody/virtual/server/pm/PackageSetting;->setInstalled(IZ)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/pm/PackagePersistenceLayer;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0, p2}, Lcom/lody/virtual/server/pm/VAppManagerService;->notifyAppUninstalled(Lcom/lody/virtual/server/pm/PackageSetting;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_0
    monitor-exit p0

    .line 56
    return v3

    .line 57
    :cond_3
    monitor-exit p0

    .line 58
    return v1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit p0

    .line 61
    throw p1
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

.method public unregisterObserver(Lcom/lody/virtual/server/interfaces/IPackageObserver;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/VAppManagerService;->mRemoteCallbackList:Landroid/os/RemoteCallbackList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    :goto_0
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
