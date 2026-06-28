.class public Lcom/ss/android/socialbase/downloader/downloader/Downloader;
.super Lcom/ss/android/socialbase/downloader/downloader/b;
.source "SourceFile"


# static fields
.field private static volatile instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/downloader/v;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/c$a;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

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

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 28
    .line 29
    return-object p0
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

.method public static declared-synchronized init(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-static {p0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->initOrCover(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0

    .line 12
    throw p0
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

.method public static declared-synchronized initOrCover(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;Z)V
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->build()Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->instance:Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->S()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    if-eqz p1, :cond_3

    .line 30
    .line 31
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :cond_3
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    monitor-exit v0

    .line 38
    throw p0
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

.method public static bridge synthetic with(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
    .locals 0

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->with(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic addMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->addMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic addNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->addNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic addSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->addSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic canResume(I)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->canResume(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic cancel(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->cancel(I)V

    return-void
.end method

.method public bridge synthetic cancel(IZ)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->cancel(IZ)V

    return-void
.end method

.method public bridge synthetic clearDownloadData(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->clearDownloadData(I)V

    return-void
.end method

.method public bridge synthetic clearDownloadData(IZ)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->clearDownloadData(IZ)V

    return-void
.end method

.method public bridge synthetic destoryDownloader()V
    .locals 0

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->destoryDownloader()V

    return-void
.end method

.method public bridge synthetic forceDownloadIngoreRecommendSize(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->forceDownloadIngoreRecommendSize(I)V

    return-void
.end method

.method public bridge synthetic getAllDownloadInfo()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->getAllDownloadInfo()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getCurBytes(I)J
    .locals 2

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getCurBytes(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getDownloadFileUriProvider(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadFileUriProvider(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDownloadId(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadId(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDownloadInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDownloadInfoList(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadInfoList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDownloadNotificationEventListener(I)Lcom/ss/android/socialbase/downloader/depend/z;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadNotificationEventListener(I)Lcom/ss/android/socialbase/downloader/depend/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDownloadingDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getDownloadingDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getFailedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getFailedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getGlobalSaveDir()Ljava/io/File;
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->getGlobalSaveDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGlobalSaveTempDir()Ljava/io/File;
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->getGlobalSaveTempDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getReserveWifiStatusListener()Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->getReserveWifiStatusListener()Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getStatus(I)I
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getStatus(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getSuccessedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getSuccessedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getUnCompletedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->getUnCompletedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic isDownloadCacheSyncSuccess()Z
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->isDownloadCacheSyncSuccess()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isDownloadServiceForeground(I)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->isDownloadServiceForeground(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isDownloadSuccessAndFileNotExist(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->isDownloadSuccessAndFileNotExist(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isDownloading(I)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->isDownloading(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isHttpServiceInit()Z
    .locals 1

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->isHttpServiceInit()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic pause(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->pause(I)V

    return-void
.end method

.method public bridge synthetic pauseAll()V
    .locals 0

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->pauseAll()V

    return-void
.end method

.method public bridge synthetic registerDownloadCacheSyncListener(Lcom/ss/android/socialbase/downloader/depend/k;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->registerDownloadCacheSyncListener(Lcom/ss/android/socialbase/downloader/depend/k;)V

    return-void
.end method

.method public bridge synthetic registerDownloaderProcessConnectedListener(Lcom/ss/android/socialbase/downloader/depend/ac;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->registerDownloaderProcessConnectedListener(Lcom/ss/android/socialbase/downloader/depend/ac;)V

    return-void
.end method

.method public bridge synthetic removeMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic removeNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic removeSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic removeTaskMainListener(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeTaskMainListener(I)V

    return-void
.end method

.method public bridge synthetic removeTaskNotificationListener(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeTaskNotificationListener(I)V

    return-void
.end method

.method public bridge synthetic removeTaskSubListener(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->removeTaskSubListener(I)V

    return-void
.end method

.method public bridge synthetic restart(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->restart(I)V

    return-void
.end method

.method public bridge synthetic restartAllFailedDownloadTasks(Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->restartAllFailedDownloadTasks(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic restartAllPauseReserveOnWifiDownloadTasks(Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->restartAllPauseReserveOnWifiDownloadTasks(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic resume(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->resume(I)V

    return-void
.end method

.method public bridge synthetic setDefaultSavePath(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->setDefaultSavePath(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDefaultSaveTempPath(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->setDefaultSaveTempPath(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDownloadInMultiProcess()V
    .locals 0

    invoke-super {p0}, Lcom/ss/android/socialbase/downloader/downloader/b;->setDownloadInMultiProcess()V

    return-void
.end method

.method public bridge synthetic setDownloadNotificationEventListener(ILcom/ss/android/socialbase/downloader/depend/z;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->setDownloadNotificationEventListener(ILcom/ss/android/socialbase/downloader/depend/z;)V

    return-void
.end method

.method public bridge synthetic setLogLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->setLogLevel(I)V

    return-void
.end method

.method public bridge synthetic setMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->setMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic setMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/b;->setMainThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Z)V

    return-void
.end method

.method public bridge synthetic setNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->setNotificationListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic setReserveWifiStatusListener(Lcom/ss/android/socialbase/downloader/downloader/r;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->setReserveWifiStatusListener(Lcom/ss/android/socialbase/downloader/downloader/r;)V

    return-void
.end method

.method public bridge synthetic setSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/b;->setSubThreadListener(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;)V

    return-void
.end method

.method public bridge synthetic setThrottleNetSpeed(IJ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/b;->setThrottleNetSpeed(IJ)V

    return-void
.end method

.method public bridge synthetic unRegisterDownloadCacheSyncListener(Lcom/ss/android/socialbase/downloader/depend/k;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->unRegisterDownloadCacheSyncListener(Lcom/ss/android/socialbase/downloader/depend/k;)V

    return-void
.end method

.method public bridge synthetic unRegisterDownloaderProcessConnectedListener(Lcom/ss/android/socialbase/downloader/depend/ac;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->unRegisterDownloaderProcessConnectedListener(Lcom/ss/android/socialbase/downloader/depend/ac;)V

    return-void
.end method
