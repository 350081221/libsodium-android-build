.class public Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private chunkAdjustCalculator:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private chunkCntCalculator:Lcom/ss/android/socialbase/downloader/downloader/h;

.field private chunkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

.field private final context:Landroid/content/Context;

.field private cpuThreadExecutor:Ljava/util/concurrent/ExecutorService;

.field private dbThreadExecutor:Ljava/util/concurrent/ExecutorService;

.field private downloadCache:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private downloadCompleteHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation
.end field

.field private downloadDns:Lcom/ss/android/socialbase/downloader/network/f;

.field private downloadExpSwitch:I

.field private downloadInMultiProcess:Z

.field private downloadLaunchHandler:Lcom/ss/android/socialbase/downloader/downloader/l;

.field private downloadMonitorListener:Lcom/ss/android/socialbase/downloader/d/b;

.field private downloadSetting:Lcom/ss/android/socialbase/downloader/depend/aa;

.field private headHttpService:Lcom/ss/android/socialbase/downloader/network/h;

.field private httpService:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

.field private idGenerator:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private ioThreadExecutor:Ljava/util/concurrent/ExecutorService;

.field private maxDownloadPoolSize:I

.field private mixApkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

.field private mixDefaultDownloadExecutor:Ljava/util/concurrent/ExecutorService;

.field private mixFrequentDownloadExecutor:Ljava/util/concurrent/ExecutorService;

.field private monitorConfig:Lcom/ss/android/socialbase/downloader/downloader/q;

.field private needAutoRefreshUnSuccessTask:Z

.field private notificationClickCallback:Lcom/ss/android/socialbase/downloader/depend/af;

.field private okHttpDispatcherExecutor:Ljava/util/concurrent/ExecutorService;

.field private ttNetHandler:Lcom/ss/android/socialbase/downloader/downloader/u;

.field private writeBufferSize:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCompleteHandlers:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->needAutoRefreshUnSuccessTask:Z

    .line 13
    .line 14
    const v0, 0x3effffff    # 0.49999997f

    .line 15
    .line 16
    .line 17
    iput v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadExpSwitch:I

    .line 18
    .line 19
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->context:Landroid/content/Context;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public addDownloadCompleteHandler(Lcom/ss/android/socialbase/downloader/depend/m;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCompleteHandlers:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCompleteHandlers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCompleteHandlers:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :cond_1
    :goto_0
    monitor-exit v0

    .line 23
    return-object p0

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

.method public build()Lcom/ss/android/socialbase/downloader/downloader/Downloader;
    .locals 1

    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;-><init>(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V

    return-object v0
.end method

.method public chunkAdjustCalculator(Lcom/ss/android/socialbase/downloader/downloader/g;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkAdjustCalculator:Lcom/ss/android/socialbase/downloader/downloader/g;

    return-object p0
.end method

.method public chunkCntCalculator(Lcom/ss/android/socialbase/downloader/downloader/h;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkCntCalculator:Lcom/ss/android/socialbase/downloader/downloader/h;

    return-object p0
.end method

.method public chunkThreadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public cpuThreadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->cpuThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public dbThreadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->dbThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public downloadCache(Lcom/ss/android/socialbase/downloader/downloader/j;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCache:Lcom/ss/android/socialbase/downloader/downloader/j;

    return-object p0
.end method

.method public downloadDns(Lcom/ss/android/socialbase/downloader/network/f;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadDns:Lcom/ss/android/socialbase/downloader/network/f;

    return-object p0
.end method

.method public downloadExpSwitch(I)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadExpSwitch:I

    return-object p0
.end method

.method public downloadInMultiProcess(Z)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadInMultiProcess:Z

    return-object p0
.end method

.method public downloadLaunchHandler(Lcom/ss/android/socialbase/downloader/downloader/l;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadLaunchHandler:Lcom/ss/android/socialbase/downloader/downloader/l;

    return-object p0
.end method

.method public downloadMonitorListener(Lcom/ss/android/socialbase/downloader/d/b;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadMonitorListener:Lcom/ss/android/socialbase/downloader/d/b;

    return-object p0
.end method

.method public downloadSetting(Lcom/ss/android/socialbase/downloader/depend/aa;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadSetting:Lcom/ss/android/socialbase/downloader/depend/aa;

    return-object p0
.end method

.method public getCPUThreadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->cpuThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/g;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkAdjustCalculator:Lcom/ss/android/socialbase/downloader/downloader/g;

    return-object v0
.end method

.method public getChunkCntCalculator()Lcom/ss/android/socialbase/downloader/downloader/h;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkCntCalculator:Lcom/ss/android/socialbase/downloader/downloader/h;

    return-object v0
.end method

.method public getChunkThreadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->chunkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getDBThreadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->dbThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getDownloadCache()Lcom/ss/android/socialbase/downloader/downloader/j;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCache:Lcom/ss/android/socialbase/downloader/downloader/j;

    return-object v0
.end method

.method public getDownloadCompleteHandlers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadCompleteHandlers:Ljava/util/List;

    return-object v0
.end method

.method public getDownloadDns()Lcom/ss/android/socialbase/downloader/network/f;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadDns:Lcom/ss/android/socialbase/downloader/network/f;

    return-object v0
.end method

.method public getDownloadExpSwitch()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadExpSwitch:I

    return v0
.end method

.method public getDownloadLaunchHandler()Lcom/ss/android/socialbase/downloader/downloader/l;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadLaunchHandler:Lcom/ss/android/socialbase/downloader/downloader/l;

    return-object v0
.end method

.method public getDownloadMonitorListener()Lcom/ss/android/socialbase/downloader/d/b;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadMonitorListener:Lcom/ss/android/socialbase/downloader/d/b;

    return-object v0
.end method

.method public getDownloadSetting()Lcom/ss/android/socialbase/downloader/depend/aa;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadSetting:Lcom/ss/android/socialbase/downloader/depend/aa;

    return-object v0
.end method

.method public getHeadHttpService()Lcom/ss/android/socialbase/downloader/network/h;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->headHttpService:Lcom/ss/android/socialbase/downloader/network/h;

    return-object v0
.end method

.method public getHttpService()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->httpService:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object v0
.end method

.method public getIOThreadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->ioThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getIdGenerator()Lcom/ss/android/socialbase/downloader/downloader/k;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->idGenerator:Lcom/ss/android/socialbase/downloader/downloader/k;

    return-object v0
.end method

.method public getMaxDownloadPoolSize()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->maxDownloadPoolSize:I

    return v0
.end method

.method public getMixApkDownloadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixApkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getMixDefaultDownloadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixDefaultDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getMixFrequentDownloadExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixFrequentDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getMonitorConfig()Lcom/ss/android/socialbase/downloader/downloader/q;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->monitorConfig:Lcom/ss/android/socialbase/downloader/downloader/q;

    return-object v0
.end method

.method public getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/af;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->notificationClickCallback:Lcom/ss/android/socialbase/downloader/depend/af;

    return-object v0
.end method

.method public getOkHttpDispatcherExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->okHttpDispatcherExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getTTNetHandler()Lcom/ss/android/socialbase/downloader/downloader/u;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->ttNetHandler:Lcom/ss/android/socialbase/downloader/downloader/u;

    return-object v0
.end method

.method public getWriteBufferSize()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->writeBufferSize:I

    return v0
.end method

.method public headHttpService(Lcom/ss/android/socialbase/downloader/network/h;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->headHttpService:Lcom/ss/android/socialbase/downloader/network/h;

    return-object p0
.end method

.method public httpService(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->httpService:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object p0
.end method

.method public idGenerator(Lcom/ss/android/socialbase/downloader/downloader/k;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->idGenerator:Lcom/ss/android/socialbase/downloader/downloader/k;

    return-object p0
.end method

.method public ioThreadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->ioThreadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public isDownloadInMultiProcess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->downloadInMultiProcess:Z

    return v0
.end method

.method public maxDownloadPoolSize(I)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->maxDownloadPoolSize:I

    return-object p0
.end method

.method public mixApkDownloadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixApkDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public mixDefaultDownloadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixDefaultDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public mixFrequentDownloadExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->mixFrequentDownloadExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public monitorConfig(Lcom/ss/android/socialbase/downloader/downloader/q;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->monitorConfig:Lcom/ss/android/socialbase/downloader/downloader/q;

    return-object p0
.end method

.method public needAutoRefreshUnSuccessTask(Z)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->needAutoRefreshUnSuccessTask:Z

    return-object p0
.end method

.method public needAutoRefreshUnSuccessTask()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->needAutoRefreshUnSuccessTask:Z

    return v0
.end method

.method public notificationClickCallback(Lcom/ss/android/socialbase/downloader/depend/af;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->notificationClickCallback:Lcom/ss/android/socialbase/downloader/depend/af;

    return-object p0
.end method

.method public okHttpDispatcherExecutor(Ljava/util/concurrent/ExecutorService;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->okHttpDispatcherExecutor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public ttNetHandler(Lcom/ss/android/socialbase/downloader/downloader/u;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->ttNetHandler:Lcom/ss/android/socialbase/downloader/downloader/u;

    return-object p0
.end method

.method public writeBufferSize(I)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->writeBufferSize:I

    return-object p0
.end method
