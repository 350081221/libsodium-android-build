.class public Lcom/bytedance/pangle/GlobalParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static mInstance:Lcom/bytedance/pangle/GlobalParam;


# instance fields
.field private hasInit:Z

.field private mApmFlag:I

.field private mAutoFetch:Z

.field private mCheckMatchHostAbi:Z

.field private mCheckPermission:Z

.field private mCloseBgDex2oat:Z

.field private mCloseCrashMonitor:Z

.field private mCloseFlipped:Z

.field private mCloseHookHuaweiOnInit:Z

.field private final mCustomTag:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private mDebug:Z

.field private mDexOptDelayTime:J

.field private mDid:Ljava/lang/String;

.field private mDownloadDir:Ljava/io/File;

.field private mDownloaderProvider:Lcom/bytedance/pangle/download/IDownloaderProvider;

.field private mFastDex2oat:Z

.field private mHostUrl:Ljava/lang/String;

.field private mInstallThreads:I

.field private mLogger:Lcom/bytedance/pangle/log/IZeusLogger;

.field private mPostBgDexOptByInit:Z

.field private final mRemoveApkEntry:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mReporter:Lcom/bytedance/pangle/log/IZeusReporter;

.field private final mRequestHeader:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mSignature:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final unInstallPluginWhenHostChange:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->hasInit:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/bytedance/pangle/GlobalParam;->mDebug:Z

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    iput v2, p0, Lcom/bytedance/pangle/GlobalParam;->mInstallThreads:I

    .line 12
    .line 13
    iput-boolean v1, p0, Lcom/bytedance/pangle/GlobalParam;->mCheckMatchHostAbi:Z

    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Lcom/bytedance/pangle/GlobalParam;->mRequestHeader:Ljava/util/Map;

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v2, p0, Lcom/bytedance/pangle/GlobalParam;->unInstallPluginWhenHostChange:Ljava/util/Map;

    .line 28
    .line 29
    new-instance v2, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lcom/bytedance/pangle/GlobalParam;->mCustomTag:Ljava/util/Map;

    .line 35
    .line 36
    new-instance v2, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lcom/bytedance/pangle/GlobalParam;->mSignature:Ljava/util/Map;

    .line 42
    .line 43
    const-wide/16 v2, 0x3a98

    .line 44
    .line 45
    iput-wide v2, p0, Lcom/bytedance/pangle/GlobalParam;->mDexOptDelayTime:J

    .line 46
    .line 47
    iput-boolean v1, p0, Lcom/bytedance/pangle/GlobalParam;->mPostBgDexOptByInit:Z

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/bytedance/pangle/GlobalParam;->mAutoFetch:Z

    .line 50
    .line 51
    new-instance v1, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lcom/bytedance/pangle/GlobalParam;->mRemoveApkEntry:Ljava/util/Map;

    .line 57
    .line 58
    const/4 v1, -0x1

    .line 59
    iput v1, p0, Lcom/bytedance/pangle/GlobalParam;->mApmFlag:I

    .line 60
    .line 61
    iput-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseBgDex2oat:Z

    .line 62
    .line 63
    return-void
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
.end method

.method private ensureInit()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->hasInit:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0
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
.end method

.method public static getInstance()Lcom/bytedance/pangle/GlobalParam;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/pangle/GlobalParam;->mInstance:Lcom/bytedance/pangle/GlobalParam;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/bytedance/pangle/GlobalParam;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/pangle/GlobalParam;->mInstance:Lcom/bytedance/pangle/GlobalParam;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/bytedance/pangle/GlobalParam;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/bytedance/pangle/GlobalParam;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/bytedance/pangle/GlobalParam;->mInstance:Lcom/bytedance/pangle/GlobalParam;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/bytedance/pangle/GlobalParam;->mInstance:Lcom/bytedance/pangle/GlobalParam;

    .line 25
    .line 26
    return-object v0
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
.end method


# virtual methods
.method public addRequestHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mRequestHeader:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
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

.method public autoFetch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mAutoFetch:Z

    return v0
.end method

.method public checkMatchHostAbi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCheckMatchHostAbi:Z

    return v0
.end method

.method public checkPermission()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCheckPermission:Z

    return v0
.end method

.method public closeBgDex2oat(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseBgDex2oat:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public closeCrashMonitor(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseCrashMonitor:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public closeHookHuaweiOnInit(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseHookHuaweiOnInit:Z

    return-void
.end method

.method public closeHookHuaweiOnInit()Z
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseHookHuaweiOnInit:Z

    return v0
.end method

.method public getApmFlag()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/pangle/GlobalParam;->mApmFlag:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    iput v0, p0, Lcom/bytedance/pangle/GlobalParam;->mApmFlag:I

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/bytedance/pangle/GlobalParam;->mApmFlag:I

    .line 10
    .line 11
    return v0
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
.end method

.method public getCustomTag(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCustomTag:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public getDexOptDelayTime()J
    .locals 2

    iget-wide v0, p0, Lcom/bytedance/pangle/GlobalParam;->mDexOptDelayTime:J

    return-wide v0
.end method

.method public getDid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mDid:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadDir()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mDownloadDir:Ljava/io/File;

    return-object v0
.end method

.method public getDownloaderProvider()Lcom/bytedance/pangle/download/IDownloaderProvider;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mDownloaderProvider:Lcom/bytedance/pangle/download/IDownloaderProvider;

    return-object v0
.end method

.method public getHostUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mHostUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getInstallThreads()I
    .locals 1

    iget v0, p0, Lcom/bytedance/pangle/GlobalParam;->mInstallThreads:I

    return v0
.end method

.method public getLogger()Lcom/bytedance/pangle/log/IZeusLogger;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mLogger:Lcom/bytedance/pangle/log/IZeusLogger;

    return-object v0
.end method

.method public getRemoveApkEntryFlag(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mRemoveApkEntry:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getReporter()Lcom/bytedance/pangle/log/IZeusReporter;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mReporter:Lcom/bytedance/pangle/log/IZeusReporter;

    return-object v0
.end method

.method public getRequestHeader()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mRequestHeader:Ljava/util/Map;

    return-object v0
.end method

.method public getSignature(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mSignature:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public init()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->hasInit:Z

    return-void
.end method

.method public isCloseBgDex2oat()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseBgDex2oat:Z

    return v0
.end method

.method public isCloseCrashMonitor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseCrashMonitor:Z

    return v0
.end method

.method public isCloseFlipped()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseFlipped:Z

    return v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mDebug:Z

    return v0
.end method

.method public isFastDex2oat()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mFastDex2oat:Z

    return v0
.end method

.method public isPostBgDexOptByInit()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/pangle/GlobalParam;->mPostBgDexOptByInit:Z

    return v0
.end method

.method public postBgDexOptByInit(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mPostBgDexOptByInit:Z

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mPostBgDexOptByInit:Z

    .line 7
    .line 8
    return-void
    .line 9
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
    .line 24
.end method

.method public removeApkEntry(Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    or-int/lit8 p2, p2, 0x2

    .line 7
    .line 8
    :cond_0
    iget-object p3, p0, Lcom/bytedance/pangle/GlobalParam;->mRemoveApkEntry:Ljava/util/Map;

    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
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
.end method

.method public setApmFlag(ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    or-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    :cond_0
    if-eqz p3, :cond_1

    .line 9
    .line 10
    or-int/lit8 p1, p1, 0x4

    .line 11
    .line 12
    :cond_1
    if-eqz p4, :cond_2

    .line 13
    .line 14
    or-int/lit8 p1, p1, 0x8

    .line 15
    .line 16
    :cond_2
    iput p1, p0, Lcom/bytedance/pangle/GlobalParam;->mApmFlag:I

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
.end method

.method public setAutoFetch(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mAutoFetch:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setCheckMatchHostAbi(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCheckMatchHostAbi:Z

    return-void
.end method

.method public setCheckPermission(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCheckPermission:Z

    return-void
.end method

.method public setCloseFlipped(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mCloseFlipped:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setCustomTag(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mCustomTag:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mDebug:Z

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setDexOptDelayTime(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/bytedance/pangle/GlobalParam;->mDexOptDelayTime:J

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setDid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mDid:Ljava/lang/String;

    return-void
.end method

.method public setDownloadDir(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mDownloadDir:Ljava/io/File;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setDownloaderProvider(Lcom/bytedance/pangle/download/IDownloaderProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mDownloaderProvider:Lcom/bytedance/pangle/download/IDownloaderProvider;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setFastDex2oat(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/pangle/GlobalParam;->mFastDex2oat:Z

    return-void
.end method

.method public setHostUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mHostUrl:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setInstallThreads(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/bytedance/pangle/GlobalParam;->mInstallThreads:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setLogger(Lcom/bytedance/pangle/log/IZeusLogger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mLogger:Lcom/bytedance/pangle/log/IZeusLogger;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setReporter(Lcom/bytedance/pangle/log/IZeusReporter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/GlobalParam;->mReporter:Lcom/bytedance/pangle/log/IZeusReporter;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 24
.end method

.method public setSignature(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->mSignature:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setUnInstallPluginWhenHostChange(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/GlobalParam;->ensureInit()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->unInstallPluginWhenHostChange:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
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

.method public unInstallPluginWhenHostChange(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/GlobalParam;->unInstallPluginWhenHostChange:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
