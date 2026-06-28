.class public Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;
.super Landroid/content/pm/IPackageInstallerSession$Stub;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;
    }
.end annotation


# static fields
.field public static final INSTALL_FAILED_ABORTED:I = -0x73

.field public static final INSTALL_FAILED_INTERNAL_ERROR:I = -0x6e

.field public static final INSTALL_FAILED_INVALID_APK:I = -0x2

.field public static final INSTALL_SUCCEEDED:I = 0x1

.field private static final MSG_COMMIT:I = 0x0

.field private static final REMOVE_SPLIT_MARKER_EXTENSION:Ljava/lang/String; = ".removed"

.field private static final TAG:Ljava/lang/String; = "PackageInstaller"


# instance fields
.field final installerPackageName:Ljava/lang/String;

.field final installerUid:I

.field private final mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private mBridges:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/pm/installer/FileBridge;",
            ">;"
        }
    .end annotation
.end field

.field private final mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

.field private mClientProgress:F

.field private final mContext:Landroid/content/Context;

.field private mDestroyed:Z

.field private mFinalMessage:Ljava/lang/String;

.field private mFinalStatus:I

.field private final mHandler:Landroid/os/Handler;

.field private final mHandlerCallback:Landroid/os/Handler$Callback;

.field private mInternalProgress:F

.field private final mLock:Ljava/lang/Object;

.field private mPackageName:Ljava/lang/String;

.field private mPermissionsAccepted:Z

.field private mPrepared:Z

.field private mProgress:F

.field private mRemoteObserver:Landroid/content/pm/IPackageInstallObserver2;

.field private mReportedProgress:F

.field private mResolvedBaseFile:Ljava/io/File;

.field private mResolvedStageDir:Ljava/io/File;

.field private final mResolvedStagedFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private mSealed:Z

.field final params:Lcom/lody/virtual/server/pm/installer/SessionParams;

.field final sessionId:I

.field final stageDir:Ljava/io/File;

.field final userId:I


# direct methods
.method public constructor <init>(Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;IIILcom/lody/virtual/server/pm/installer/SessionParams;Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/pm/IPackageInstallerSession$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 20
    .line 21
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mInternalProgress:F

    .line 22
    .line 23
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mProgress:F

    .line 24
    .line 25
    const/high16 v0, -0x40800000    # -1.0f

    .line 26
    .line 27
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mReportedProgress:F

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPrepared:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mDestroyed:Z

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mBridges:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStagedFiles:Ljava/util/List;

    .line 49
    .line 50
    new-instance v0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$1;-><init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mHandlerCallback:Landroid/os/Handler$Callback;

    .line 56
    .line 57
    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 58
    .line 59
    iput-object p2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mContext:Landroid/content/Context;

    .line 60
    .line 61
    new-instance p1, Landroid/os/Handler;

    .line 62
    .line 63
    invoke-direct {p1, p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mHandler:Landroid/os/Handler;

    .line 67
    .line 68
    iput-object p4, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->installerPackageName:Ljava/lang/String;

    .line 69
    .line 70
    iput p5, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    .line 71
    .line 72
    iput p6, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    .line 73
    .line 74
    iput p7, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->installerUid:I

    .line 75
    .line 76
    iget-object p1, p8, Lcom/lody/virtual/server/pm/installer/SessionParams;->appPackageName:Ljava/lang/String;

    .line 77
    .line 78
    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPackageName:Ljava/lang/String;

    .line 79
    .line 80
    iput-object p8, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->params:Lcom/lody/virtual/server/pm/installer/SessionParams;

    .line 81
    .line 82
    iput-object p9, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 83
    .line 84
    return-void
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
.end method

.method static synthetic access$000(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$102(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Landroid/content/pm/IPackageInstallObserver2;)Landroid/content/pm/IPackageInstallObserver2;
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mRemoteObserver:Landroid/content/pm/IPackageInstallObserver2;

    return-object p1
.end method

.method static synthetic access$200(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->commitLocked()V

    return-void
.end method

.method static synthetic access$300(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->destroyInternal()V

    return-void
.end method

.method static synthetic access$400(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->dispatchSessionFinished(ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private assertPreparedAndNotSealed(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPrepared:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/SecurityException;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, " not allowed after commit"

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v1, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, " before prepared"

    .line 48
    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw p1
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

.method private commitLocked()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mDestroyed:Z

    .line 2
    .line 3
    const/16 v1, -0x6e

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->resolveStageDir()Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->validateInstallLocked()V

    .line 20
    .line 21
    .line 22
    const/high16 v0, 0x3f000000    # 0.5f

    .line 23
    .line 24
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mInternalProgress:F

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->computeProgressLocked(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    array-length v2, v1

    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_1
    if-ge v3, v2, :cond_1

    .line 40
    .line 41
    aget-object v5, v1, v3

    .line 42
    .line 43
    new-instance v6, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v7, "found apk in stage dir: "

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    const-string v7, "PackageInstaller"

    .line 65
    .line 66
    invoke-static {v7, v6}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-instance v7, Lcom/lody/virtual/remote/VAppInstallerParams;

    .line 78
    .line 79
    invoke-direct {v7}, Lcom/lody/virtual/remote/VAppInstallerParams;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v5, v7}, Lcom/lody/virtual/server/pm/VAppManagerService;->installPackage(Landroid/net/Uri;Lcom/lody/virtual/remote/VAppInstallerParams;)Lcom/lody/virtual/remote/VAppInstallerResult;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget v5, v5, Lcom/lody/virtual/remote/VAppInstallerResult;->status:I

    .line 87
    .line 88
    if-nez v5, :cond_0

    .line 89
    .line 90
    move v4, v0

    .line 91
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->destroyInternal()V

    .line 95
    .line 96
    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/16 v0, -0x73

    .line 101
    .line 102
    :goto_2
    const/4 v1, 0x0

    .line 103
    invoke-direct {p0, v0, v1, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->dispatchSessionFinished(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    new-instance v0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;

    .line 108
    .line 109
    const-string v2, "Session not sealed"

    .line 110
    .line 111
    invoke-direct {v0, p0, v1, v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;-><init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_4
    new-instance v0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;

    .line 116
    .line 117
    const-string v2, "Session destroyed"

    .line 118
    .line 119
    invoke-direct {v0, p0, v1, v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;-><init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
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

.method private computeProgressLocked(Z)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 2
    .line 3
    const v1, 0x3f4ccccd    # 0.8f

    .line 4
    .line 5
    .line 6
    mul-float/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v2, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->constrain(FFF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mInternalProgress:F

    .line 13
    .line 14
    const v3, 0x3e4ccccd    # 0.2f

    .line 15
    .line 16
    .line 17
    mul-float/2addr v1, v3

    .line 18
    invoke-static {v1, v2, v3}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->constrain(FFF)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-float/2addr v0, v1

    .line 23
    iput v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mProgress:F

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mReportedProgress:F

    .line 28
    .line 29
    sub-float/2addr v0, p1

    .line 30
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    float-to-double v0, p1

    .line 35
    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmpl-double p1, v0, v2

    .line 41
    .line 42
    if-ltz p1, :cond_1

    .line 43
    .line 44
    :cond_0
    iget p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mProgress:F

    .line 45
    .line 46
    iput p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mReportedProgress:F

    .line 47
    .line 48
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 49
    .line 50
    invoke-virtual {v0, p0, p1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionProgressChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;F)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
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

.method private static constrain(FFF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    move p0, p1

    goto :goto_0

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    move p0, p2

    :cond_1
    :goto_0
    return p0
.end method

.method private createRemoveSplitMarker(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, ".removed"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->isValidExtFilename(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ljava/io/File;

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->resolveStageDir()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-static {p1, v0}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v2, "Invalid marker: "

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    new-instance v0, Ljava/io/IOException;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v0
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

.method private destroyInternal()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mDestroyed:Z

    .line 8
    .line 9
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mBridges:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/lody/virtual/server/pm/installer/FileBridge;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/lody/virtual/server/pm/installer/FileBridge;->forceClose()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->deleteDir(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v1
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

.method private dispatchSessionFinished(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mFinalStatus:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mFinalMessage:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mRemoteObserver:Landroid/content/pm/IPackageInstallObserver2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPackageName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {v0, v1, p1, p2, p3}, Landroid/content/pm/IPackageInstallObserver2;->onPackageInstalled(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    :cond_0
    const/4 p2, 0x1

    .line 15
    if-ne p1, p2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p2, 0x0

    .line 19
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 20
    .line 21
    invoke-virtual {p1, p0, p2}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionFinished(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public static getCompleteMessage(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-string v1, ": "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
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

.method private openReadInternal(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "openRead"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->assertPreparedAndNotSealed(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/lody/virtual/helper/utils/FileUtils;->isValidExtFilename(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->resolveStageDir()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget v0, Landroid/system/OsConstants;->O_RDONLY:I

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p1, v0, v1}, Landroid/system/Os;->open(Ljava/lang/String;II)Ljava/io/FileDescriptor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Invalid name: "

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    :catch_0
    move-exception p1

    .line 61
    new-instance v0, Ljava/io/IOException;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v0
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

.method private openWriteInternal(Ljava/lang/String;JJ)Landroid/os/ParcelFileDescriptor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "openWrite"

    .line 5
    .line 6
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->assertPreparedAndNotSealed(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/lody/virtual/server/pm/installer/FileBridge;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/lody/virtual/server/pm/installer/FileBridge;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mBridges:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->resolveStageDir()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget v0, Landroid/system/OsConstants;->O_CREAT:I

    .line 34
    .line 35
    sget v2, Landroid/system/OsConstants;->O_WRONLY:I

    .line 36
    .line 37
    or-int/2addr v0, v2

    .line 38
    const/16 v2, 0x1a4

    .line 39
    .line 40
    invoke-static {p1, v0, v2}, Landroid/system/Os;->open(Ljava/lang/String;II)Ljava/io/FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    cmp-long v0, p4, v2

    .line 47
    .line 48
    if-lez v0, :cond_0

    .line 49
    .line 50
    invoke-static {p1, v2, v3, p4, p5}, Landroid/system/Os;->posix_fallocate(Ljava/io/FileDescriptor;JJ)V

    .line 51
    .line 52
    .line 53
    :cond_0
    cmp-long p4, p2, v2

    .line 54
    .line 55
    if-lez p4, :cond_1

    .line 56
    .line 57
    sget p4, Landroid/system/OsConstants;->SEEK_SET:I

    .line 58
    .line 59
    invoke-static {p1, p2, p3, p4}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/pm/installer/FileBridge;->setTargetFile(Ljava/io/FileDescriptor;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/lody/virtual/server/pm/installer/FileBridge;->getClientSocket()Ljava/io/FileDescriptor;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_1
    .catch Landroid/system/ErrnoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    return-object p1

    .line 77
    :catch_0
    move-exception p1

    .line 78
    new-instance p2, Ljava/io/IOException;

    .line 79
    .line 80
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw p2

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    throw p1
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private resolveStageDir()Ljava/io/File;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStageDir:Ljava/io/File;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStageDir:Ljava/io/File;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStageDir:Ljava/io/File;

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-object v1

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v1
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

.method private validateInstallLocked()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedBaseFile:Ljava/io/File;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStagedFiles:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStageDir:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, -0x2

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_2

    .line 24
    .line 25
    aget-object v4, v0, v3

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    new-instance v5, Ljava/io/File;

    .line 34
    .line 35
    iget-object v6, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStageDir:Ljava/io/File;

    .line 36
    .line 37
    const-string v7, "base.apk"

    .line 38
    .line 39
    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_0

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    iput-object v5, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedBaseFile:Ljava/io/File;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedStagedFiles:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedBaseFile:Ljava/io/File;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    new-instance v0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;

    .line 67
    .line 68
    const-string v2, "Full install must include a base package"

    .line 69
    .line 70
    invoke-direct {v0, p0, v1, v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;-><init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_4
    new-instance v0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;

    .line 75
    .line 76
    const-string v2, "No packages staged"

    .line 77
    .line 78
    invoke-direct {v0, p0, v1, v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession$PackageManagerException;-><init>(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
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
.method public abandon()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->destroyInternal()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Session was abandoned"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, -0x73

    .line 8
    .line 9
    invoke-direct {p0, v2, v0, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->dispatchSessionFinished(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public addClientProgress(F)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 5
    .line 6
    add-float/2addr v1, p1

    .line 7
    invoke-virtual {p0, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->setClientProgress(F)V

    .line 8
    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
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

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p0, v1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionActiveChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public commit(Landroid/content/IntentSender;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 4
    iget-object v3, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mBridges:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/lody/virtual/server/pm/installer/FileBridge;

    .line 5
    invoke-virtual {v4}, Lcom/lody/virtual/server/pm/installer/FileBridge;->isClosed()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string v1, "Files still open"

    invoke-direct {p1, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    iput-boolean v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    :cond_2
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    iput v3, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 9
    invoke-direct {p0, v2}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->computeProgressLocked(Z)V

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_3

    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    invoke-virtual {v0, p0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionSealedBlocking(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 13
    new-instance v0, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$PackageInstallObserverAdapter;

    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mContext:Landroid/content/Context;

    iget v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    iget v3, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->userId:I

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$PackageInstallObserverAdapter;-><init>(Landroid/content/Context;Landroid/content/IntentSender;II)V

    .line 14
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallObserver;->getBinder()Landroid/content/pm/IPackageInstallObserver2;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public commit(Landroid/content/IntentSender;Z)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->commit(Landroid/content/IntentSender;)V

    return-void
.end method

.method public generateInfo()Lcom/lody/virtual/server/pm/installer/SessionInfo;
    .locals 5

    .line 1
    new-instance v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/installer/SessionInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->sessionId:I

    .line 10
    .line 11
    iput v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sessionId:I

    .line 12
    .line 13
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->installerPackageName:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->installerPackageName:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mResolvedBaseFile:Ljava/io/File;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x0

    .line 27
    :goto_0
    iput-object v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->resolvedBaseCodePath:Ljava/lang/String;

    .line 28
    .line 29
    iget v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mProgress:F

    .line 30
    .line 31
    iput v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->progress:F

    .line 32
    .line 33
    iget-boolean v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 34
    .line 35
    iput-boolean v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sealed:Z

    .line 36
    .line 37
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-lez v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v2, 0x0

    .line 48
    :goto_1
    iput-boolean v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->active:Z

    .line 49
    .line 50
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->params:Lcom/lody/virtual/server/pm/installer/SessionParams;

    .line 51
    .line 52
    iget v3, v2, Lcom/lody/virtual/server/pm/installer/SessionParams;->mode:I

    .line 53
    .line 54
    iput v3, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->mode:I

    .line 55
    .line 56
    iget-wide v3, v2, Lcom/lody/virtual/server/pm/installer/SessionParams;->sizeBytes:J

    .line 57
    .line 58
    iput-wide v3, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sizeBytes:J

    .line 59
    .line 60
    iget-object v3, v2, Lcom/lody/virtual/server/pm/installer/SessionParams;->appPackageName:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v3, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appPackageName:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, v2, Lcom/lody/virtual/server/pm/installer/SessionParams;->appIcon:Landroid/graphics/Bitmap;

    .line 65
    .line 66
    iput-object v3, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appIcon:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    iget-object v2, v2, Lcom/lody/virtual/server/pm/installer/SessionParams;->appLabel:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v2, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appLabel:Ljava/lang/CharSequence;

    .line 71
    .line 72
    monitor-exit v1

    .line 73
    return-object v0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw v0
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

.method public getDataLoaderParams()Landroid/content/pm/DataLoaderParamsParcel;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->params:Lcom/lody/virtual/server/pm/installer/SessionParams;

    iget-object v0, v0, Lcom/lody/virtual/server/pm/installer/SessionParams;->mData:Landroid/content/pm/DataLoaderParamsParcel;

    return-object v0
.end method

.method public getNames()[Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const-string v0, "getNames"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->assertPreparedAndNotSealed(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->resolveStageDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object v0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v1
    .line 22
    .line 23
.end method

.method public isMultiPackage()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public open()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mActiveCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionActiveChanged(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-boolean v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPrepared:Z

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->stageDir:Ljava/io/File;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPrepared:Z

    .line 27
    .line 28
    iget-object v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mCallback:Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Lcom/lody/virtual/server/pm/installer/VPackageInstallerService$InternalCallback;->onSessionPrepared(Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v2, "Exactly one of stageDir or stageCid stage must be set"

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_2
    :goto_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
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

.method public openRead(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->openReadInternal(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw v0
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

.method public openWrite(Ljava/lang/String;JJ)Landroid/os/ParcelFileDescriptor;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct/range {p0 .. p5}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->openWriteInternal(Ljava/lang/String;JJ)Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    throw p2
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

.method public removeSplit(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->params:Lcom/lody/virtual/server/pm/installer/SessionParams;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/lody/virtual/server/pm/installer/SessionParams;->appPackageName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->createRemoveSplitMarker(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "Must specify package name to remove a split"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
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
.end method

.method public setClientProgress(F)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    cmpl-float v1, v1, v2

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mClientProgress:F

    .line 15
    .line 16
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->computeProgressLocked(Z)V

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method setPermissionsResult(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mSealed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mLock:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    const/4 v0, 0x1

    .line 11
    :try_start_0
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mPermissionsAccepted:Z

    .line 12
    .line 13
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-object p1, p0, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->mHandler:Landroid/os/Handler;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0

    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->destroyInternal()V

    .line 29
    .line 30
    .line 31
    const-string p1, "User rejected permissions"

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/16 v1, -0x73

    .line 35
    .line 36
    invoke-direct {p0, v1, p1, v0}, Lcom/lody/virtual/server/pm/installer/PackageInstallerSession;->dispatchSessionFinished(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    .line 41
    .line 42
    const-string v0, "Must be sealed to accept permissions"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
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
