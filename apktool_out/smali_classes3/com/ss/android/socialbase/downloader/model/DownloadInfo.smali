.class public Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_MAX_PROCESS_POST_COUNT:I = 0x64

.field private static final DEFAULT_MIN_BYTES_INTERVAL:J = 0x100000L

.field private static final RESERVE_STATUS_NEVER:I = 0x0

.field private static final RESERVE_STATUS_NOW:I = 0x2

.field private static final RESERVE_STATUS_ONCE:I = 0x1

.field private static final TAG:Ljava/lang/String; = "DownloadInfo"


# instance fields
.field private addListenerToSameTask:Z

.field private allConnectTime:Ljava/util/concurrent/atomic/AtomicLong;

.field private appVersionCode:I

.field private asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

.field private autoResumed:Z

.field private backUpUrlRetryCount:I

.field private backUpUrlUsed:Z

.field private backUpUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private backUpUrlsStr:Ljava/lang/String;

.field private bindValueCount:I

.field private byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

.field private chunkCount:I

.field private chunkDowngradeRetryUsed:Z

.field private curBackUpUrlIndex:I

.field private curBytes:Ljava/util/concurrent/atomic/AtomicLong;

.field private curRetryTime:I

.field private dbJsonData:Lorg/json/JSONObject;

.field private dbJsonDataString:Ljava/lang/String;

.field private deleteCacheIfCheckFailed:Z

.field private distinctDirectory:Z

.field private downloadTime:J

.field private eTag:Ljava/lang/String;

.field private enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

.field private errorBytesLog:Ljava/lang/StringBuffer;

.field private expiredRedownload:Z

.field private extra:Ljava/lang/String;

.field private extraHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private extraMonitorStatus:[I

.field private failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private filePackageName:Ljava/lang/String;

.field private forbiddenBackupUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private force:Z

.field private forceIgnoreRecommendSize:Z

.field private headConnectionAvailable:Z

.field private headConnectionException:Ljava/lang/String;

.field private httpStatusCode:I

.field private httpStatusMessage:Ljava/lang/String;

.field private httpsToHttpRetryUsed:Z

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private ignoreDataVerify:Z

.field private isAutoInstallWithoutNotification:Ljava/lang/Boolean;

.field private isFirstDownload:Z

.field private isFirstSuccess:Z

.field private isForbiddenRetryed:Z

.field private volatile isSaveTempFile:Z

.field private lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

.field private mDownloadFromReserveWifi:Z

.field private maxBytes:I

.field private maxProgressCount:I

.field private md5:Ljava/lang/String;

.field private mimeType:Ljava/lang/String;

.field private minProgressTimeMsInterval:I

.field private monitorScene:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private needChunkDowngradeRetry:Z

.field private needDefaultHttpServiceBackUp:Z

.field private needHttpsToHttpRetry:Z

.field private needIndependentProcess:Z

.field private needPostProgress:Z

.field private needRetryDelay:Z

.field private needReuseChunkRunnable:Z

.field private needReuseFirstConnection:Z

.field private needSDKMonitor:Z

.field private networkQuality:Ljava/lang/String;

.field private notificationVisibility:I

.field private onlyWifi:Z

.field private openLimitSpeed:Z

.field private outIp:[Ljava/lang/String;

.field private outSize:[I

.field private packageInfoRef:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation
.end field

.field private packageName:Ljava/lang/String;

.field private realDownloadTime:J

.field private realStartDownloadTime:J

.field private retryCount:I

.field private retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

.field private retryDelayTimeArray:Ljava/lang/String;

.field private retryScheduleMinutes:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private savePath:Ljava/lang/String;

.field private showNotification:Z

.field private showNotificationForAutoResumed:Z

.field private showNotificationForNetworkResumed:Z

.field private spData:Lorg/json/JSONObject;

.field private startDownloadTime:J

.field private status:Ljava/util/concurrent/atomic/AtomicInteger;

.field private statusAtDbInit:I

.field private successByCache:Z

.field private supportPartial:Z

.field private taskId:Ljava/lang/String;

.field private tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile tempFileSaveCompleteCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ai;",
            ">;"
        }
    .end annotation
.end field

.field private tempPath:Ljava/lang/String;

.field private throttleNetSpeed:J

.field private title:Ljava/lang/String;

.field private totalBytes:J

.field private ttnetProtectTimeout:J

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$1;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$1;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 4
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->a:Lcom/ss/android/socialbase/downloader/constants/g;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 6
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/a;->a:Lcom/ss/android/socialbase/downloader/constants/a;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 7
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 8
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 9
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 10
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 11
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 12
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 13
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 14
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 15
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/b;->a:Lcom/ss/android/socialbase/downloader/constants/b;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 16
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 9

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 123
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 124
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->a:Lcom/ss/android/socialbase/downloader/constants/g;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    const/4 v2, 0x0

    .line 125
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 126
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/a;->a:Lcom/ss/android/socialbase/downloader/constants/a;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 127
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 128
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 129
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 130
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 131
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 132
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 133
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 134
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 135
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/b;->a:Lcom/ss/android/socialbase/downloader/constants/b;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 136
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 137
    new-instance v3, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v4, 0x0

    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v3, 0x0

    .line 138
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v3, "_id"

    .line 139
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    const/4 v6, -0x1

    if-eq v3, v6, :cond_1

    .line 140
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    :cond_1
    const-string v3, "name"

    .line 141
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_2

    .line 142
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    :cond_2
    const-string v3, "title"

    .line 143
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_3

    .line 144
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    :cond_3
    const-string v3, "url"

    .line 145
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_4

    .line 146
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    :cond_4
    const-string v3, "savePath"

    .line 147
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_5

    .line 148
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    :cond_5
    const-string v3, "tempPath"

    .line 149
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_6

    .line 150
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    :cond_6
    const-string v3, "chunkCount"

    .line 151
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_7

    .line 152
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    :cond_7
    const-string v3, "status"

    .line 153
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_8

    .line 154
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-direct {v7, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v7, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    goto :goto_0

    .line 155
    :cond_8
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    :goto_0
    const-string v3, "curBytes"

    .line 156
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_9

    .line 157
    new-instance v4, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-direct {v4, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    goto :goto_1

    .line 158
    :cond_9
    new-instance v3, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    :goto_1
    const-string v3, "totalBytes"

    .line 159
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_a

    .line 160
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    :cond_a
    const-string v3, "eTag"

    .line 161
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_b

    .line 162
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    :cond_b
    const-string v3, "onlyWifi"

    .line 163
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_d

    .line 164
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-eqz v3, :cond_c

    move v3, v0

    goto :goto_2

    :cond_c
    move v3, v2

    :goto_2
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    :cond_d
    const-string v3, "force"

    .line 165
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_f

    .line 166
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-eqz v3, :cond_e

    move v3, v0

    goto :goto_3

    :cond_e
    move v3, v2

    :goto_3
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    :cond_f
    const-string v3, "retryCount"

    .line 167
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_10

    .line 168
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    :cond_10
    const-string v3, "extra"

    .line 169
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_11

    .line 170
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    :cond_11
    const-string v3, "mimeType"

    .line 171
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_12

    .line 172
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    :cond_12
    const-string v3, "notificationEnable"

    .line 173
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_14

    .line 174
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-eqz v3, :cond_13

    move v3, v0

    goto :goto_4

    :cond_13
    move v3, v2

    :goto_4
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    :cond_14
    const-string v3, "notificationVisibility"

    .line 175
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_15

    .line 176
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    :cond_15
    const-string v3, "isFirstDownload"

    .line 177
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_17

    .line 178
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ne v3, v0, :cond_16

    move v3, v0

    goto :goto_5

    :cond_16
    move v3, v2

    :goto_5
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    :cond_17
    const-string v3, "isFirstSuccess"

    .line 179
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_19

    .line 180
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ne v3, v0, :cond_18

    move v3, v0

    goto :goto_6

    :cond_18
    move v3, v2

    :goto_6
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    :cond_19
    const-string v3, "needHttpsToHttpRetry"

    .line 181
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_1b

    .line 182
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ne v3, v0, :cond_1a

    move v3, v0

    goto :goto_7

    :cond_1a
    move v3, v2

    :goto_7
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    :cond_1b
    const-string v3, "downloadTime"

    .line 183
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_1c

    .line 184
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    :cond_1c
    const-string v3, "packageName"

    .line 185
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_1d

    .line 186
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    :cond_1d
    const-string v3, "md5"

    .line 187
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_1e

    .line 188
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    :cond_1e
    const-string v3, "retryDelay"

    .line 189
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_20

    .line 190
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-ne v3, v0, :cond_1f

    move v3, v0

    goto :goto_8

    :cond_1f
    move v3, v2

    :goto_8
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    :cond_20
    const-string v3, "curRetryTime"

    .line 191
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_21

    .line 192
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    :cond_21
    const-string v3, "retryDelayStatus"

    .line 193
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v6, :cond_25

    .line 194
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 195
    sget-object v4, Lcom/ss/android/socialbase/downloader/constants/g;->b:Lcom/ss/android/socialbase/downloader/constants/g;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-ne v3, v5, :cond_22

    .line 196
    iput-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    goto :goto_9

    .line 197
    :cond_22
    sget-object v4, Lcom/ss/android/socialbase/downloader/constants/g;->c:Lcom/ss/android/socialbase/downloader/constants/g;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-ne v3, v5, :cond_23

    .line 198
    iput-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    goto :goto_9

    .line 199
    :cond_23
    sget-object v4, Lcom/ss/android/socialbase/downloader/constants/g;->d:Lcom/ss/android/socialbase/downloader/constants/g;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-ne v3, v5, :cond_24

    .line 200
    iput-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    goto :goto_9

    .line 201
    :cond_24
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    :cond_25
    :goto_9
    const-string v1, "defaultHttpServiceBackUp"

    .line 202
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_27

    .line 203
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-ne v1, v0, :cond_26

    move v1, v0

    goto :goto_a

    :cond_26
    move v1, v2

    :goto_a
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    :cond_27
    const-string v1, "chunkRunnableReuse"

    .line 204
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_29

    .line 205
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-ne v1, v0, :cond_28

    move v1, v0

    goto :goto_b

    :cond_28
    move v1, v2

    :goto_b
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    :cond_29
    const-string v1, "retryDelayTimeArray"

    .line 206
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_2a

    .line 207
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    :cond_2a
    const-string v1, "chunkDowngradeRetry"

    .line 208
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_2c

    .line 209
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-ne v1, v0, :cond_2b

    move v1, v0

    goto :goto_c

    :cond_2b
    move v1, v2

    :goto_c
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    :cond_2c
    const-string v1, "backUpUrlsStr"

    .line 210
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_2d

    .line 211
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setBackUpUrlsStr(Ljava/lang/String;)V

    :cond_2d
    const-string v1, "backUpUrlRetryCount"

    .line 212
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_2e

    .line 213
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    :cond_2e
    const-string v1, "realDownloadTime"

    .line 214
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_2f

    .line 215
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    :cond_2f
    const-string v1, "retryScheduleMinutes"

    .line 216
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_30

    .line 217
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryScheduleMinutes:I

    :cond_30
    const-string v1, "independentProcess"

    .line 218
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v6, :cond_32

    .line 219
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-ne v1, v0, :cond_31

    goto :goto_d

    :cond_31
    move v0, v2

    :goto_d
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    :cond_32
    const-string v0, "auxiliaryJsonobjectString"

    .line 220
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v6, :cond_33

    .line 221
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    :cond_33
    const-string v0, "iconUrl"

    .line 222
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v6, :cond_34

    .line 223
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    :cond_34
    const-string v0, "appVersionCode"

    .line 224
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v6, :cond_35

    .line 225
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    :cond_35
    const-string v0, "taskId"

    .line 226
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v6, :cond_36

    .line 227
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    .line 228
    :cond_36
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->parseMonitorSetting()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_e

    :catch_0
    move-exception p1

    .line 229
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_e
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 106
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->a:Lcom/ss/android/socialbase/downloader/constants/g;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    const/4 v1, 0x0

    .line 107
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 108
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/a;->a:Lcom/ss/android/socialbase/downloader/constants/a;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 109
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 110
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 111
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 112
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 113
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 114
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 115
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 116
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 117
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/b;->a:Lcom/ss/android/socialbase/downloader/constants/b;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 118
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 119
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    .line 120
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)V
    .locals 6

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 21
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->a:Lcom/ss/android/socialbase/downloader/constants/g;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 23
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/a;->a:Lcom/ss/android/socialbase/downloader/constants/a;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 24
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 25
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 26
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 27
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 28
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 29
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 30
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 31
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 32
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/b;->a:Lcom/ss/android/socialbase/downloader/constants/b;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 33
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 34
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v2, 0x0

    .line 35
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    if-nez p1, :cond_0

    return-void

    .line 36
    :cond_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 37
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 38
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 39
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 41
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->e()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v5

    .line 42
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    :cond_1
    :goto_0
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 44
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    .line 45
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 46
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->f()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    :cond_2
    const-string v2, "task_key"

    .line 47
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v2, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->g(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 49
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v5

    invoke-interface {v2, v5}, Lcom/ss/android/socialbase/downloader/downloader/j;->b(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    if-nez v2, :cond_4

    .line 50
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/ss/android/socialbase/downloader/i/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 51
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/ss/android/socialbase/downloader/i/f;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v2, "DownloadInfo"

    const-string v5, "The distinct directory option is not set, which may cause 1005 problems and file downloads being covered"

    .line 52
    invoke-static {v2, v5}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_4
    :goto_1
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->h(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 56
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    .line 57
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->j(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraHeaders:Ljava/util/List;

    .line 58
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->k(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxBytes:I

    .line 59
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->l(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 60
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 61
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->n(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    .line 62
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->o(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outIp:[Ljava/lang/String;

    .line 63
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)[I

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outSize:[I

    .line 64
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->q(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needPostProgress:Z

    .line 65
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->r(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxProgressCount:I

    .line 66
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->s(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->minProgressTimeMsInterval:I

    .line 67
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->t(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 68
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->u(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    .line 69
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->v(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    .line 70
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->w(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 71
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->x(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    .line 72
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->y(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    .line 73
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->z(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    .line 74
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->A(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    .line 75
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->B(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 76
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->C(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    .line 77
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->D(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    .line 78
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->E(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    .line 79
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->F(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 80
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->G(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    .line 81
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->H(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 82
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->I(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionAvailable:Z

    .line 83
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->J(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ignoreDataVerify:Z

    .line 84
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->K(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->addListenerToSameTask:Z

    .line 85
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->L(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    .line 86
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->M(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    .line 87
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->N(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->throttleNetSpeed:J

    .line 88
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->O(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->openLimitSpeed:Z

    .line 89
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->P(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "download_setting"

    .line 90
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    :cond_5
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->Q(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "dbjson_key_expect_file_length"

    invoke-virtual {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->R(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "executor_group"

    invoke-virtual {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->S(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "auto_install"

    invoke-virtual {p0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->T(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 95
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->U(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->monitorScene:Ljava/lang/String;

    .line 96
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->V(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)[I

    move-result-object v1

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    .line 97
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->W(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 98
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->X(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 99
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->Y(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ttnetProtectTimeout:J

    .line 100
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->g(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->distinctDirectory:Z

    .line 101
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    if-gtz p1, :cond_6

    .line 102
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 103
    :cond_6
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->putMonitorSetting()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;)V

    return-void
.end method

.method private convertEnqueueType(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_HEAD:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_TAIL:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne p1, v1, :cond_1

    .line 19
    .line 20
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method private convertRetryDelayStatus(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/g;->b:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/g;->c:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne p1, v1, :cond_1

    .line 19
    .line 20
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/g;->d:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ne p1, v1, :cond_2

    .line 30
    .line 31
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object p1, Lcom/ss/android/socialbase/downloader/constants/g;->a:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 37
    .line 38
    :goto_0
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
.end method

.method private convertStrToJson(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
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

.method private ensureDBJsonData()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 45
    .line 46
    :cond_1
    :goto_0
    monitor-exit p0

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    throw v0

    .line 51
    :cond_2
    :goto_1
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

.method private ensureSpData()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v1, "sp_download_info"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-long v1, v1

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    new-instance v0, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 61
    .line 62
    :cond_1
    return-void
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

.method private ensureTempCacheData()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    :cond_0
    monitor-exit p0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    return-void
    .line 23
.end method

.method private getBackUpUrlsStr()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    const-string v0, ""

    .line 64
    .line 65
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;

    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;

    .line 68
    .line 69
    return-object v0
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

.method private getDBJsonDataString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
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
.end method

.method private getReserveWifiStatus()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v2, "pause_reserve_on_wifi"

    .line 8
    .line 9
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
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

.method private mergeAuxiliaryJSONObject(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-virtual {v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :catch_0
    :cond_3
    const/4 p1, 0x0

    .line 50
    :try_start_1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 51
    .line 52
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->parseMonitorSetting()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw p1
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

.method private parseMonitorSetting()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "need_sdk_monitor"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 16
    .line 17
    const-string v1, "monitor_scene"

    .line 18
    .line 19
    const-string v3, ""

    .line 20
    .line 21
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->monitorScene:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 28
    .line 29
    const-string v1, "extra_monitor_status"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    new-array v1, v1, [I

    .line 48
    .line 49
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ge v2, v1, :cond_0

    .line 56
    .line 57
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optInt(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    aput v3, v1, v2

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
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

.method private putMonitorSetting()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "need_sdk_monitor"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "monitor_scene"

    .line 13
    .line 14
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->monitorScene:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 20
    .line 21
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    array-length v1, v1

    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    .line 33
    .line 34
    array-length v3, v2

    .line 35
    if-ge v1, v3, :cond_0

    .line 36
    .line 37
    aget v2, v2, v1

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v1, "extra_monitor_status"

    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void
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

.method private refreshBackupUrls(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-le v0, p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 28
    .line 29
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ge p1, v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    goto :goto_1

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

.method private setBackUpUrlsStr(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlsStr:Ljava/lang/String;

    .line 16
    .line 17
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-lez p1, :cond_3

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v1, v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_1
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
    .line 84
    .line 85
.end method


# virtual methods
.method public addErrorBytesLog(JILjava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuffer;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 27
    .line 28
    const-string v1, ","

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 34
    .line 35
    const-string v1, "[type:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 41
    .line 42
    .line 43
    const-string p3, ",bytes:"

    .line 44
    .line 45
    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 49
    .line 50
    .line 51
    const-string p1, ",method:"

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    .line 58
    .line 59
    const-string p1, "]"

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    :cond_2
    :goto_0
    return-void
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

.method public bindValue(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 15
    .line 16
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 17
    .line 18
    int-to-long v1, v1

    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 27
    .line 28
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, ""

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    move-object v1, v2

    .line 35
    :cond_1
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 43
    .line 44
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    move-object v1, v2

    .line 49
    :cond_2
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 57
    .line 58
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    move-object v1, v2

    .line 63
    :cond_3
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 71
    .line 72
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 73
    .line 74
    if-nez v1, :cond_4

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_4
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 85
    .line 86
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 87
    .line 88
    int-to-long v3, v1

    .line 89
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 90
    .line 91
    .line 92
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    int-to-long v3, v1

    .line 103
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 104
    .line 105
    .line 106
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 107
    .line 108
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 117
    .line 118
    .line 119
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 124
    .line 125
    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 126
    .line 127
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 128
    .line 129
    .line 130
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 131
    .line 132
    add-int/lit8 v0, v0, 0x1

    .line 133
    .line 134
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 135
    .line 136
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v1, :cond_5

    .line 139
    .line 140
    move-object v1, v2

    .line 141
    :cond_5
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 145
    .line 146
    add-int/lit8 v0, v0, 0x1

    .line 147
    .line 148
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 149
    .line 150
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    .line 151
    .line 152
    const-wide/16 v3, 0x1

    .line 153
    .line 154
    const-wide/16 v5, 0x0

    .line 155
    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    move-wide v7, v3

    .line 159
    goto :goto_0

    .line 160
    :cond_6
    move-wide v7, v5

    .line 161
    :goto_0
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 162
    .line 163
    .line 164
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 165
    .line 166
    add-int/lit8 v0, v0, 0x1

    .line 167
    .line 168
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 169
    .line 170
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    .line 171
    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    move-wide v7, v3

    .line 175
    goto :goto_1

    .line 176
    :cond_7
    move-wide v7, v5

    .line 177
    :goto_1
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 178
    .line 179
    .line 180
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 181
    .line 182
    add-int/lit8 v0, v0, 0x1

    .line 183
    .line 184
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 185
    .line 186
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 187
    .line 188
    int-to-long v7, v1

    .line 189
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 193
    .line 194
    add-int/lit8 v0, v0, 0x1

    .line 195
    .line 196
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 197
    .line 198
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 199
    .line 200
    if-nez v1, :cond_8

    .line 201
    .line 202
    move-object v1, v2

    .line 203
    :cond_8
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 207
    .line 208
    add-int/lit8 v0, v0, 0x1

    .line 209
    .line 210
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 211
    .line 212
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    .line 213
    .line 214
    if-nez v1, :cond_9

    .line 215
    .line 216
    move-object v1, v2

    .line 217
    :cond_9
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 221
    .line 222
    add-int/lit8 v0, v0, 0x1

    .line 223
    .line 224
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 225
    .line 226
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 227
    .line 228
    if-nez v1, :cond_a

    .line 229
    .line 230
    move-object v1, v2

    .line 231
    :cond_a
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 235
    .line 236
    add-int/lit8 v0, v0, 0x1

    .line 237
    .line 238
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 239
    .line 240
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    .line 241
    .line 242
    if-eqz v1, :cond_b

    .line 243
    .line 244
    move-wide v7, v3

    .line 245
    goto :goto_2

    .line 246
    :cond_b
    move-wide v7, v5

    .line 247
    :goto_2
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 248
    .line 249
    .line 250
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 251
    .line 252
    add-int/lit8 v0, v0, 0x1

    .line 253
    .line 254
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 255
    .line 256
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    .line 257
    .line 258
    int-to-long v7, v1

    .line 259
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 260
    .line 261
    .line 262
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 263
    .line 264
    add-int/lit8 v0, v0, 0x1

    .line 265
    .line 266
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 267
    .line 268
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 269
    .line 270
    if-eqz v1, :cond_c

    .line 271
    .line 272
    move-wide v7, v3

    .line 273
    goto :goto_3

    .line 274
    :cond_c
    move-wide v7, v5

    .line 275
    :goto_3
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 276
    .line 277
    .line 278
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 279
    .line 280
    add-int/lit8 v0, v0, 0x1

    .line 281
    .line 282
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 283
    .line 284
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 285
    .line 286
    if-eqz v1, :cond_d

    .line 287
    .line 288
    move-wide v7, v3

    .line 289
    goto :goto_4

    .line 290
    :cond_d
    move-wide v7, v5

    .line 291
    :goto_4
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 292
    .line 293
    .line 294
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 295
    .line 296
    add-int/lit8 v0, v0, 0x1

    .line 297
    .line 298
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 299
    .line 300
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 301
    .line 302
    if-eqz v1, :cond_e

    .line 303
    .line 304
    move-wide v7, v3

    .line 305
    goto :goto_5

    .line 306
    :cond_e
    move-wide v7, v5

    .line 307
    :goto_5
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 308
    .line 309
    .line 310
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 311
    .line 312
    add-int/lit8 v0, v0, 0x1

    .line 313
    .line 314
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 315
    .line 316
    iget-wide v7, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 317
    .line 318
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 319
    .line 320
    .line 321
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 322
    .line 323
    add-int/lit8 v0, v0, 0x1

    .line 324
    .line 325
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 326
    .line 327
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    .line 328
    .line 329
    if-nez v1, :cond_f

    .line 330
    .line 331
    move-object v1, v2

    .line 332
    :cond_f
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 336
    .line 337
    add-int/lit8 v0, v0, 0x1

    .line 338
    .line 339
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 340
    .line 341
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    .line 342
    .line 343
    if-nez v1, :cond_10

    .line 344
    .line 345
    move-object v1, v2

    .line 346
    :cond_10
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 350
    .line 351
    add-int/lit8 v0, v0, 0x1

    .line 352
    .line 353
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 354
    .line 355
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    .line 356
    .line 357
    if-eqz v1, :cond_11

    .line 358
    .line 359
    move-wide v7, v3

    .line 360
    goto :goto_6

    .line 361
    :cond_11
    move-wide v7, v5

    .line 362
    :goto_6
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 363
    .line 364
    .line 365
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 366
    .line 367
    add-int/lit8 v0, v0, 0x1

    .line 368
    .line 369
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 370
    .line 371
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 372
    .line 373
    int-to-long v7, v1

    .line 374
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 375
    .line 376
    .line 377
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 378
    .line 379
    add-int/lit8 v0, v0, 0x1

    .line 380
    .line 381
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 382
    .line 383
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    int-to-long v7, v1

    .line 390
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 391
    .line 392
    .line 393
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 394
    .line 395
    add-int/lit8 v0, v0, 0x1

    .line 396
    .line 397
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 398
    .line 399
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 400
    .line 401
    if-eqz v1, :cond_12

    .line 402
    .line 403
    move-wide v7, v3

    .line 404
    goto :goto_7

    .line 405
    :cond_12
    move-wide v7, v5

    .line 406
    :goto_7
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 407
    .line 408
    .line 409
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 410
    .line 411
    add-int/lit8 v0, v0, 0x1

    .line 412
    .line 413
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 414
    .line 415
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    .line 416
    .line 417
    if-eqz v1, :cond_13

    .line 418
    .line 419
    move-wide v7, v3

    .line 420
    goto :goto_8

    .line 421
    :cond_13
    move-wide v7, v5

    .line 422
    :goto_8
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 423
    .line 424
    .line 425
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 426
    .line 427
    add-int/lit8 v0, v0, 0x1

    .line 428
    .line 429
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 430
    .line 431
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    .line 432
    .line 433
    if-nez v1, :cond_14

    .line 434
    .line 435
    move-object v1, v2

    .line 436
    :cond_14
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 437
    .line 438
    .line 439
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 440
    .line 441
    add-int/lit8 v0, v0, 0x1

    .line 442
    .line 443
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 444
    .line 445
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    .line 446
    .line 447
    if-eqz v1, :cond_15

    .line 448
    .line 449
    move-wide v7, v3

    .line 450
    goto :goto_9

    .line 451
    :cond_15
    move-wide v7, v5

    .line 452
    :goto_9
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 453
    .line 454
    .line 455
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 456
    .line 457
    add-int/lit8 v0, v0, 0x1

    .line 458
    .line 459
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 460
    .line 461
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlsStr()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 466
    .line 467
    .line 468
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 469
    .line 470
    add-int/lit8 v0, v0, 0x1

    .line 471
    .line 472
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 473
    .line 474
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 475
    .line 476
    int-to-long v7, v1

    .line 477
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 478
    .line 479
    .line 480
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 481
    .line 482
    add-int/lit8 v0, v0, 0x1

    .line 483
    .line 484
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 485
    .line 486
    iget-wide v7, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 487
    .line 488
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 489
    .line 490
    .line 491
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 492
    .line 493
    add-int/lit8 v0, v0, 0x1

    .line 494
    .line 495
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 496
    .line 497
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryScheduleMinutes:I

    .line 498
    .line 499
    int-to-long v7, v1

    .line 500
    invoke-virtual {p1, v0, v7, v8}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 501
    .line 502
    .line 503
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 504
    .line 505
    add-int/lit8 v0, v0, 0x1

    .line 506
    .line 507
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 508
    .line 509
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    .line 510
    .line 511
    if-eqz v1, :cond_16

    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_16
    move-wide v3, v5

    .line 515
    :goto_a
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 516
    .line 517
    .line 518
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 519
    .line 520
    add-int/lit8 v0, v0, 0x1

    .line 521
    .line 522
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 523
    .line 524
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDBJsonDataString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 529
    .line 530
    .line 531
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 532
    .line 533
    add-int/lit8 v0, v0, 0x1

    .line 534
    .line 535
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 536
    .line 537
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    .line 538
    .line 539
    if-nez v1, :cond_17

    .line 540
    .line 541
    move-object v1, v2

    .line 542
    :cond_17
    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 543
    .line 544
    .line 545
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 546
    .line 547
    add-int/lit8 v0, v0, 0x1

    .line 548
    .line 549
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 550
    .line 551
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    .line 552
    .line 553
    int-to-long v3, v1

    .line 554
    invoke-virtual {p1, v0, v3, v4}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 555
    .line 556
    .line 557
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 558
    .line 559
    add-int/lit8 v0, v0, 0x1

    .line 560
    .line 561
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    .line 562
    .line 563
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    .line 564
    .line 565
    if-nez v1, :cond_18

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :cond_18
    move-object v2, v1

    .line 569
    :goto_b
    invoke-virtual {p1, v0, v2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 570
    .line 571
    .line 572
    return-void
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
.end method

.method public cacheExpierd()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloaded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/i/f;->d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

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

.method public canNotifyProgress()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sub-long/2addr v2, v0

    .line 18
    const-wide/16 v0, 0x14

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 28
    :goto_1
    return v0
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
.end method

.method public canReStartAsyncTask()Z
    .locals 2

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->b:Lcom/ss/android/socialbase/downloader/constants/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canReplaceHttpForRetry()Z
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canShowNotification()Z
    .locals 2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    if-nez v1, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForNetworkResumed:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canSkipStatusHandler()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 9
    .line 10
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/g;->b:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 19
    .line 20
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->b:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->c:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 29
    .line 30
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/b;->b:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 38
    :goto_1
    return v0
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

.method public canStartRetryDelayTask()Z
    .locals 2

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedRetryDelay()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->b:Lcom/ss/android/socialbase/downloader/constants/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public changeSkipStatus()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 9
    .line 10
    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/g;->b:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    :cond_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/g;->c:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setRetryDelayStatus(Lcom/ss/android/socialbase/downloader/constants/g;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 24
    .line 25
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->b:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/a;->c:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/a;->d:Lcom/ss/android/socialbase/downloader/constants/a;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setAsyncHandleStatus(Lcom/ss/android/socialbase/downloader/constants/a;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 39
    .line 40
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/b;->b:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 41
    .line 42
    if-ne v0, v1, :cond_4

    .line 43
    .line 44
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/b;->c:Lcom/ss/android/socialbase/downloader/constants/b;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setByteInvalidRetryStatus(Lcom/ss/android/socialbase/downloader/constants/b;)V

    .line 47
    .line 48
    .line 49
    :cond_4
    return-void
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

.method public checkMd5Status()I
    .locals 3

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public checkMd5Valid()Z
    .locals 3

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/i/f;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public clearSpData()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    const-string v1, "sp_download_info"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :cond_0
    :goto_0
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

.method public copyFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {p0, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(JZ)V

    .line 24
    .line 25
    .line 26
    iget-wide v0, p1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 27
    .line 28
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 44
    .line 45
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 48
    .line 49
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTime()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 59
    .line 60
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->seteTag(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p0, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getIsFirstDownload()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryDelayStatus()Lcom/ss/android/socialbase/downloader/constants/g;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 95
    .line 96
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mergeAuxiliaryJSONObject(Lorg/json/JSONObject;)V

    .line 97
    .line 98
    .line 99
    return-void
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

.method public copyTaskIdFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equalsTask(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public erase()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(JZ)V

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 8
    .line 9
    iput v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 19
    .line 20
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 21
    .line 22
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageInfoRef:Ljava/lang/ref/SoftReference;

    .line 36
    .line 37
    return-void
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

.method public generateTaskId()V
    .locals 1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    return-void
.end method

.method public getAllConnectTime()J
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->allConnectTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "dbjson_key_all_connect_time"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->allConnectTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->allConnectTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
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

.method public getAntiHijackErrorCode(I)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "anti_hijack_error_code"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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

.method public getAppVersionCode()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    return v0
.end method

.method public getAsyncHandleStatus()Lcom/ss/android/socialbase/downloader/constants/a;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    return-object v0
.end method

.method public getBackUpUrl()Ljava/lang/String;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 28
    .line 29
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const-string v0, ""

    .line 45
    .line 46
    :goto_0
    return-object v0
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

.method public getBackUpUrlRetryCount()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    return v0
.end method

.method public getBackUpUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    return-object v0
.end method

.method public getBindValueCount()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->bindValueCount:I

    return v0
.end method

.method public getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/b;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    return-object v0
.end method

.method public getCacheControl()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v2, "cache-control"

    .line 8
    .line 9
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
    return-object v0
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

.method public getCacheExpiredTime()J
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 7
    .line 8
    const-string v3, "cache-control/expired_time"

    .line 9
    .line 10
    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    return-wide v0
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

.method public getChunkCount()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    return v0
.end method

.method public getConnectionUrl()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-lez v1, :cond_1

    .line 48
    .line 49
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 50
    .line 51
    if-ltz v1, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-ge v1, v2, :cond_1

    .line 60
    .line 61
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 62
    .line 63
    iget v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 64
    .line 65
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 88
    .line 89
    const-string v2, "https"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 98
    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 106
    .line 107
    const-string v1, "http"

    .line 108
    .line 109
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_2
    :goto_0
    return-object v0
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

.method public getCurBackUpUrlIndex()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    return v0
.end method

.method public getCurBytes()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
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

.method public getCurRetryTime()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    return v0
.end method

.method public getCurRetryTimeInTotal()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    iget v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    add-int/2addr v0, v1

    .line 18
    :cond_0
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getDBJsonInt(Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
.end method

.method public getDBJsonString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
.end method

.method public getDownloadPrepareTime()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "dbjson_key_download_prepare_time"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public getDownloadProcess()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x64

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide/16 v2, 0x64

    .line 29
    .line 30
    mul-long/2addr v0, v2

    .line 31
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 32
    .line 33
    div-long/2addr v0, v2

    .line 34
    long-to-int v0, v0

    .line 35
    return v0
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

.method public getDownloadSettingString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "download_setting"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public getDownloadSpeed()D
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    long-to-double v0, v0

    .line 6
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    .line 7
    .line 8
    div-double/2addr v0, v2

    .line 9
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealDownloadTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    long-to-double v2, v2

    .line 14
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    div-double/2addr v2, v4

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    cmpl-double v6, v0, v4

    .line 23
    .line 24
    if-lez v6, :cond_0

    .line 25
    .line 26
    cmpl-double v4, v2, v4

    .line 27
    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    div-double/2addr v0, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 33
    .line 34
    :goto_0
    return-wide v0
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

.method public getDownloadTime()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    return-wide v0
.end method

.method public getEnqueueType()Lcom/ss/android/socialbase/downloader/constants/EnqueueType;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object v0
.end method

.method public getErrorBytesLog()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    const-string v0, ""

    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
.end method

.method public getExecutorGroup()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "executor_group"

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getExpectFileLength()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "dbjson_key_expect_file_length"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public getExtra()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    return-object v0
.end method

.method public getExtraHeaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraHeaders:Ljava/util/List;

    return-object v0
.end method

.method public getExtraMonitorStatus()[I
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraMonitorStatus:[I

    return-object v0
.end method

.method public getFailedException()Lcom/ss/android/socialbase/downloader/exception/BaseException;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    return-object v0
.end method

.method public getFailedResumeCount()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "failed_resume_count"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getFilePackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->filePackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstSpeedTime()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "dbjson_key_first_speed_time"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public getForbiddenBackupUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    return-object v0
.end method

.method public getHeadConnectionException()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionException:Ljava/lang/String;

    return-object v0
.end method

.method public getHttpStatusCode()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusCode:I

    return v0
.end method

.method public getHttpStatusMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 12
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

.method public getIsFirstDownload()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    return v0
.end method

.method public getLastDownloadTime()J
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "dbjson_last_start_download_time"

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public getLastFailedResumeTime()J
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "last_failed_resume_time"

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public getLastModified()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v2, "last-modified"

    .line 8
    .line 9
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
    return-object v0
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

.method public getLastUninstallResumeTime()J
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "last_unins_resume_time"

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public getLinkMode()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "link_mode"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public getMaxBytes()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxBytes:I

    return v0
.end method

.method public getMaxProgressCount()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxProgressCount:I

    return v0
.end method

.method public getMd5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public getMinByteIntervalForPostToMainThread(J)J
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxProgressCount:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    div-long/2addr p1, v0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v0, p1, v0

    .line 14
    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    const-wide/32 p1, 0x100000

    .line 18
    .line 19
    .line 20
    :cond_1
    return-wide p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getMinProgressTimeMsInterval()I
    .locals 2

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->minProgressTimeMsInterval:I

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public getMonitorScene()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->monitorScene:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkQuality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->networkQuality:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationVisibility()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    return v0
.end method

.method public getOpenLimitSpeed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->openLimitSpeed:Z

    return v0
.end method

.method public getOutIp()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outIp:[Ljava/lang/String;

    return-object v0
.end method

.method public getOutSize()[I
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outSize:[I

    return-object v0
.end method

.method public getPackageInfo()Landroid/content/pm/PackageInfo;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageInfoRef:Ljava/lang/ref/SoftReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    :goto_0
    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getPausedResumeCount()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "paused_resume_count"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getPreconnectLevel()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "dbjson_key_preconnect_level"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getRealDownloadTime()J
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getRealStatus()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

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
    .line 22
    .line 23
.end method

.method public getRetryCount()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    return v0
.end method

.method public getRetryDelayStatus()Lcom/ss/android/socialbase/downloader/constants/g;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    return-object v0
.end method

.method public getRetryDelayTimeArray()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    return-object v0
.end method

.method public getRetryScheduleCount()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "retry_schedule_count"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getSavePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method public getSpIntVal(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public getSpLongVal(Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {v0, p1, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
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

.method public getSpStringVal(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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

.method public getStatus()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x5

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x2

    .line 13
    :cond_0
    return v0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getStatusAtDbInit()I
    .locals 1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->statusAtDbInit:I

    return v0
.end method

.method public getTTMd5CheckStatus()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "ttmd5_check_status"

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getTargetFilePath()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public getTaskKey()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "task_key"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public getTempCacheData()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureTempCacheData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempCacheData:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getTempFilePath()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTempName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTempPath()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getThrottleNetSpeed()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->throttleNetSpeed:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
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

.method public getTotalBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    return-wide v0
.end method

.method public getTotalRetryCount()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 14
    .line 15
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    mul-int/2addr v1, v2

    .line 22
    add-int/2addr v0, v1

    .line 23
    :cond_0
    return v0
.end method

.method public getTtnetProtectTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ttnetProtectTimeout:J

    return-wide v0
.end method

.method public getUninstallResumeCount()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "unins_resume_count"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

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

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    return-object v0
.end method

.method public geteTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized handleTempSaveCallback(ZLcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSaveTempFile:Z

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_1
    const-string v0, "DownloadInfo"

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "handleTempSaveCallback isSuccess "

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, " callback size:"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lcom/ss/android/socialbase/downloader/depend/ai;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/depend/ai;->a()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-interface {v1, p2}, Lcom/ss/android/socialbase/downloader/depend/ai;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    monitor-exit p0

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit p0

    .line 81
    throw p1
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

.method public hasNextBackupUrl()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr v2, v1

    .line 27
    if-ge v0, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :cond_1
    :goto_0
    return v1
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

.method public hasPauseReservedOnWifi()Z
    .locals 2

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getReserveWifiStatus()I

    move-result v0

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public increaseAllConnectTime(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getAllConnectTime()J

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->allConnectTime:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "dbjson_key_all_connect_time"

    .line 21
    .line 22
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
.end method

.method public increaseCurBytes(J)V
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    return-void
.end method

.method public increaseDownloadPrepareTime(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadPrepareTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-long/2addr v0, p1

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "dbjson_key_download_prepare_time"

    .line 17
    .line 18
    invoke-virtual {p0, p2, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public isAddListenerToSameTask()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->addListenerToSameTask:Z

    return v0
.end method

.method public isAutoInstall()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "auto_install"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_0
    return v2
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isAutoInstallWithoutNotification()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "auto_install_without_notification"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    .line 42
    .line 43
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    return v0
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

.method public isAutoResumed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    return v0
.end method

.method public isBackUpUrlUsed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    return v0
.end method

.method public isBreakpointAvailable()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFileDataValid()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

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

.method public isCanResumeFromBreakPointStatus()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-wide/16 v3, 0x0

    .line 32
    .line 33
    cmp-long v0, v0, v3

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    :cond_2
    :goto_0
    return v2
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

.method public isChunkBreakpointAvailable()Z
    .locals 6

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-le v0, v1, :cond_4

    .line 5
    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->c(I)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lcom/ss/android/socialbase/downloader/model/b;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/b;->o()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    add-long/2addr v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    cmp-long v0, v2, v4

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0, v2, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 70
    return v0

    .line 71
    :cond_4
    :goto_2
    return v1
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

.method public isChunkDowngradeRetryUsed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkDowngradeRetryUsed:Z

    return v0
.end method

.method public isChunked()Z
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/i/f;->b(J)Z

    move-result v0

    return v0
.end method

.method public isDeleteCacheIfCheckFailed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    return v0
.end method

.method public isDownloadFromReserveWifi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mDownloadFromReserveWifi:Z

    return v0
.end method

.method public isDownloadOverStatus()Z
    .locals 1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/constants/DownloadStatus;->isDownloadOver(I)Z

    move-result v0

    return v0
.end method

.method public isDownloadWithWifiValid()Z
    .locals 1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isDownloaded()Z
    .locals 1

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/i/f;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v0

    return v0
.end method

.method public isDownloadingStatus()Z
    .locals 1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/constants/DownloadStatus;->isDownloading(I)Z

    move-result v0

    return v0
.end method

.method public isEntityInvalid()Z
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isExpiredRedownload()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "force_close_download_cache_check"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "isExpiredRedownload force to false, reason(global setting) id="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " name="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 53
    .line 54
    return v0
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

.method public isFileDataExists()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isEntityInvalid()Z

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
    return v1

    .line 9
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_2
    :goto_0
    return v1
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

.method public isFileDataValid()Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isEntityInvalid()Z

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
    return v1

    .line 9
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v2, :cond_6

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v6, "fix_file_data_valid"

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const-string v6, ",fileLength="

    .line 55
    .line 56
    const-string v7, ",totalBytes ="

    .line 57
    .line 58
    const-string v8, "isFileDataValid: cur = "

    .line 59
    .line 60
    const-string v9, "DownloadInfo"

    .line 61
    .line 62
    const-wide/16 v10, 0x0

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    cmp-long v0, v4, v10

    .line 67
    .line 68
    if-lez v0, :cond_2

    .line 69
    .line 70
    iget-wide v12, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 71
    .line 72
    cmp-long v0, v12, v10

    .line 73
    .line 74
    if-lez v0, :cond_2

    .line 75
    .line 76
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 77
    .line 78
    if-lez v0, :cond_2

    .line 79
    .line 80
    cmp-long v0, v2, v4

    .line 81
    .line 82
    if-ltz v0, :cond_2

    .line 83
    .line 84
    cmp-long v0, v2, v12

    .line 85
    .line 86
    if-lez v0, :cond_4

    .line 87
    .line 88
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 103
    .line 104
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v9, v0}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return v1

    .line 121
    :cond_3
    cmp-long v0, v2, v10

    .line 122
    .line 123
    if-lez v0, :cond_5

    .line 124
    .line 125
    cmp-long v0, v4, v10

    .line 126
    .line 127
    if-lez v0, :cond_5

    .line 128
    .line 129
    iget-wide v12, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 130
    .line 131
    cmp-long v0, v12, v10

    .line 132
    .line 133
    if-lez v0, :cond_5

    .line 134
    .line 135
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 136
    .line 137
    if-lez v0, :cond_5

    .line 138
    .line 139
    cmp-long v0, v2, v4

    .line 140
    .line 141
    if-ltz v0, :cond_5

    .line 142
    .line 143
    cmp-long v0, v2, v12

    .line 144
    .line 145
    if-gtz v0, :cond_5

    .line 146
    .line 147
    cmp-long v0, v4, v12

    .line 148
    .line 149
    if-ltz v0, :cond_4

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_4
    const/4 v0, 0x1

    .line 153
    return v0

    .line 154
    :cond_5
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 169
    .line 170
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v9, v0}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    :goto_1
    return v1
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

.method public isFirstDownload()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    xor-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2
    :goto_0
    return v1
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

.method public isFirstSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    return v0
.end method

.method public isForbiddenRetryed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed:Z

    return v0
.end method

.method public isForce()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    return v0
.end method

.method public isForceIgnoreRecommendSize()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forceIgnoreRecommendSize:Z

    return v0
.end method

.method public isHeadConnectionAvailable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionAvailable:Z

    return v0
.end method

.method public isHttpsToHttpRetryUsed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    return v0
.end method

.method public isIgnoreDataVerify()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ignoreDataVerify:Z

    return v0
.end method

.method public isNeedChunkDowngradeRetry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    return v0
.end method

.method public isNeedDefaultHttpServiceBackUp()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    return v0
.end method

.method public isNeedHttpsToHttpRetry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    return v0
.end method

.method public isNeedIndependentProcess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    return v0
.end method

.method public isNeedPostProgress()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needPostProgress:Z

    return v0
.end method

.method public isNeedRetryDelay()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isNeedReuseChunkRunnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    return v0
.end method

.method public isNeedReuseFirstConnection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    return v0
.end method

.method public isNeedSDKMonitor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needSDKMonitor:Z

    return v0
.end method

.method public isNewTask()Z
    .locals 1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isOnlyWifi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    return v0
.end method

.method public isPauseReserveOnWifi()Z
    .locals 1

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getReserveWifiStatus()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPauseReserveWithWifiValid()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mDownloadFromReserveWifi:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->b(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :cond_1
    :goto_0
    return v1
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
.end method

.method public isRwConcurrent()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "rw_concurrent"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    :cond_0
    return v2
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isSavePathRedirected()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "is_save_path_redirected"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

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

.method public declared-synchronized isSaveTempFile()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSaveTempFile:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0

    .line 8
    throw v0
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
.end method

.method public isShowNotification()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    return v0
.end method

.method public isShowNotificationForAutoResumed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    return v0
.end method

.method public isShowNotificationForNetworkResumed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForNetworkResumed:Z

    return v0
.end method

.method public isSuccessByCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    return v0
.end method

.method public isSupportPartial()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    return v0
.end method

.method public isWaitingWifiStatus()Z
    .locals 2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v1, 0x3f5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v0, v2

    .line 48
    :goto_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 55
    .line 56
    sget-object v0, Lcom/ss/android/socialbase/downloader/model/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraHeaders:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxBytes:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outIp:[Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outSize:[I

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    move v0, v1

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move v0, v2

    .line 103
    :goto_1
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    move v0, v1

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move v0, v2

    .line 114
    :goto_2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needPostProgress:Z

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxProgressCount:I

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->minProgressTimeMsInterval:I

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    move v0, v1

    .line 141
    goto :goto_3

    .line 142
    :cond_3
    move v0, v2

    .line 143
    :goto_3
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_4

    .line 156
    .line 157
    move v0, v1

    .line 158
    goto :goto_4

    .line 159
    :cond_4
    move v0, v2

    .line 160
    :goto_4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_5

    .line 179
    .line 180
    move v0, v1

    .line 181
    goto :goto_5

    .line 182
    :cond_5
    move v0, v2

    .line 183
    :goto_5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    move v0, v1

    .line 192
    goto :goto_6

    .line 193
    :cond_6
    move v0, v2

    .line 194
    :goto_6
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 195
    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    move v0, v1

    .line 203
    goto :goto_7

    .line 204
    :cond_7
    move v0, v2

    .line 205
    :goto_7
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->convertRetryDelayStatus(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_8

    .line 237
    .line 238
    move v0, v1

    .line 239
    goto :goto_8

    .line 240
    :cond_8
    move v0, v2

    .line 241
    :goto_8
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 242
    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    move v0, v1

    .line 250
    goto :goto_9

    .line 251
    :cond_9
    move v0, v2

    .line 252
    :goto_9
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forceIgnoreRecommendSize:Z

    .line 253
    .line 254
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->networkQuality:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 265
    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    .line 271
    .line 272
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 277
    .line 278
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 279
    .line 280
    .line 281
    move-result-wide v3

    .line 282
    invoke-virtual {p0, v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 286
    .line 287
    .line 288
    move-result-wide v3

    .line 289
    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 290
    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 299
    .line 300
    .line 301
    move-result-wide v3

    .line 302
    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 303
    .line 304
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 309
    .line 310
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_a

    .line 315
    .line 316
    move v0, v1

    .line 317
    goto :goto_a

    .line 318
    :cond_a
    move v0, v2

    .line 319
    :goto_a
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_b

    .line 326
    .line 327
    move v0, v1

    .line 328
    goto :goto_b

    .line 329
    :cond_b
    move v0, v2

    .line 330
    :goto_b
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    .line 331
    .line 332
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 333
    .line 334
    if-nez v0, :cond_c

    .line 335
    .line 336
    new-instance v0, Ljava/lang/StringBuffer;

    .line 337
    .line 338
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-direct {v0, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    .line 362
    .line 363
    goto :goto_c

    .line 364
    :catch_0
    move-exception v0

    .line 365
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 366
    .line 367
    .line 368
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_d

    .line 373
    .line 374
    move v0, v1

    .line 375
    goto :goto_d

    .line 376
    :cond_d
    move v0, v2

    .line 377
    :goto_d
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    .line 378
    .line 379
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_e

    .line 384
    .line 385
    move v0, v1

    .line 386
    goto :goto_e

    .line 387
    :cond_e
    move v0, v2

    .line 388
    :goto_e
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    .line 389
    .line 390
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_f

    .line 395
    .line 396
    move v0, v1

    .line 397
    goto :goto_f

    .line 398
    :cond_f
    move v0, v2

    .line 399
    :goto_f
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForNetworkResumed:Z

    .line 400
    .line 401
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 406
    .line 407
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_10

    .line 412
    .line 413
    move v0, v1

    .line 414
    goto :goto_10

    .line 415
    :cond_10
    move v0, v2

    .line 416
    :goto_10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    .line 417
    .line 418
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->convertEnqueueType(I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_11

    .line 430
    .line 431
    move v0, v1

    .line 432
    goto :goto_11

    .line 433
    :cond_11
    move v0, v2

    .line 434
    :goto_11
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionAvailable:Z

    .line 435
    .line 436
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusCode:I

    .line 441
    .line 442
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusMessage:Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_12

    .line 453
    .line 454
    move v0, v1

    .line 455
    goto :goto_12

    .line 456
    :cond_12
    move v0, v2

    .line 457
    :goto_12
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSaveTempFile:Z

    .line 458
    .line 459
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_13

    .line 464
    .line 465
    move v0, v1

    .line 466
    goto :goto_13

    .line 467
    :cond_13
    move v0, v2

    .line 468
    :goto_13
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed:Z

    .line 469
    .line 470
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_14

    .line 475
    .line 476
    move v0, v1

    .line 477
    goto :goto_14

    .line 478
    :cond_14
    move v0, v2

    .line 479
    :goto_14
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->addListenerToSameTask:Z

    .line 480
    .line 481
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    if-eqz v0, :cond_15

    .line 486
    .line 487
    move v0, v1

    .line 488
    goto :goto_15

    .line 489
    :cond_15
    move v0, v2

    .line 490
    :goto_15
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    .line 491
    .line 492
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_16

    .line 497
    .line 498
    move v0, v1

    .line 499
    goto :goto_16

    .line 500
    :cond_16
    move v0, v2

    .line 501
    :goto_16
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkDowngradeRetryUsed:Z

    .line 502
    .line 503
    const-class v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    check-cast v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 514
    .line 515
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 516
    .line 517
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryScheduleMinutes:I

    .line 522
    .line 523
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-eqz v0, :cond_17

    .line 534
    .line 535
    move v0, v1

    .line 536
    goto :goto_17

    .line 537
    :cond_17
    move v0, v2

    .line 538
    :goto_17
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 539
    .line 540
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    .line 551
    .line 552
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_18

    .line 563
    .line 564
    move v0, v1

    .line 565
    goto :goto_18

    .line 566
    :cond_18
    move v0, v2

    .line 567
    :goto_18
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 568
    .line 569
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-eqz v0, :cond_19

    .line 574
    .line 575
    move v0, v1

    .line 576
    goto :goto_19

    .line 577
    :cond_19
    move v0, v2

    .line 578
    :goto_19
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 579
    .line 580
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    if-eqz p1, :cond_1a

    .line 585
    .line 586
    goto :goto_1a

    .line 587
    :cond_1a
    move v1, v2

    .line 588
    :goto_1a
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 589
    .line 590
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->parseMonitorSetting()V

    .line 591
    .line 592
    .line 593
    return-void
.end method

.method public declared-synchronized registerTempFileSaveCallback(Lcom/ss/android/socialbase/downloader/depend/ai;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    const-string v0, "DownloadInfo"

    .line 7
    .line 8
    const-string v1, "registerTempFileSaveCallback"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempFileSaveCompleteCallbacks:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 43
    .line 44
    const-string v2, "registerTempFileSaveCallback"

    .line 45
    .line 46
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/16 v2, 0x40e

    .line 51
    .line 52
    invoke-direct {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v1}, Lcom/ss/android/socialbase/downloader/depend/ai;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :catchall_1
    move-exception p1

    .line 61
    monitor-exit p0

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

.method public reset()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(JZ)V

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 8
    .line 9
    iput v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public resetDataForEtagEndure(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(JZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->seteTag(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 14
    .line 15
    .line 16
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public resetRealStartDownloadTime()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    return-void
.end method

.method public safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonData:Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :catch_0
    :goto_0
    const/4 p1, 0x0

    .line 16
    :try_start_1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->dbJsonDataString:Ljava/lang/String;

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
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

.method public setAddListenerToSameTask(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->addListenerToSameTask:Z

    return-void
.end method

.method public setAntiHijackErrorCode(I)V
    .locals 1

    .line 1
    const-string v0, "anti_hijack_error_code"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setAppVersionCode(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    return-void
.end method

.method public setAsyncHandleStatus(Lcom/ss/android/socialbase/downloader/constants/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->asyncHandleStatus:Lcom/ss/android/socialbase/downloader/constants/a;

    return-void
.end method

.method public setAutoResumed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    return-void
.end method

.method public setByteInvalidRetryStatus(Lcom/ss/android/socialbase/downloader/constants/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->byteInvalidRetryStatus:Lcom/ss/android/socialbase/downloader/constants/b;

    return-void
.end method

.method public setCacheControl(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "cache-control"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
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
.end method

.method public setCacheExpiredTime(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "cache-control/expired_time"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
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
.end method

.method public setChunkCount(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    return-void
.end method

.method public setChunkDowngradeRetryUsed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkDowngradeRetryUsed:Z

    return-void
.end method

.method public setCurBytes(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBytes:Ljava/util/concurrent/atomic/AtomicLong;

    :goto_0
    return-void
.end method

.method public setCurBytes(JZ)V
    .locals 2

    if-eqz p3, :cond_0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    cmp-long p3, p1, v0

    if-lez p3, :cond_1

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setDeleteCacheIfCheckFailed()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    return-void
.end method

.method public setDownloadFromReserveWifi(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mDownloadFromReserveWifi:Z

    return-void
.end method

.method public setDownloadTime(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    :cond_0
    return-void
.end method

.method public setExtra(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    return-void
.end method

.method public setFailedException(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    return-void
.end method

.method public setFailedResumeCount(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "failed_resume_count"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setFilePackageName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->filePackageName:Ljava/lang/String;

    return-void
.end method

.method public setFirstDownload(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    return-void
.end method

.method public setFirstSpeedTime(J)V
    .locals 1

    .line 1
    const-string v0, "dbjson_key_first_speed_time"

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setFirstSuccess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    return-void
.end method

.method public setForbiddenBackupUrls(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->refreshBackupUrls(Z)V

    .line 4
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

.method public setForbiddenRetryed()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed:Z

    return-void
.end method

.method public setForceIgnoreRecommendSize(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forceIgnoreRecommendSize:Z

    return-void
.end method

.method public setHeadConnectionException(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionException:Ljava/lang/String;

    return-void
.end method

.method public setHttpStatusCode(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusCode:I

    return-void
.end method

.method public setHttpStatusMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusMessage:Ljava/lang/String;

    return-void
.end method

.method public setHttpsToHttpRetryUsed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    return-void
.end method

.method public setIsRwConcurrent(Z)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "rw_concurrent"

    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized setIsSaveTempFile(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSaveTempFile:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    monitor-exit p0

    .line 8
    throw p1
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
    .line 25
    .line 26
    .line 27
.end method

.method public setLastFailedResumeTime(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "last_failed_resume_time"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setLastModified(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "last-modified"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
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
.end method

.method public setLastNotifyProgressTime()V
    .locals 3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->lastNotifyProgressTime:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public setLastUninstallResumeTime(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "last_unins_resume_time"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setLinkMode(I)V
    .locals 1

    .line 1
    const-string v0, "link_mode"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setMd5(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    return-void
.end method

.method public setMimeType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public setNetworkQuality(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->networkQuality:Ljava/lang/String;

    return-void
.end method

.method public setNotificationVisibility(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    return-void
.end method

.method public setOnlyWifi(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    return-void
.end method

.method public setOpenLimitSpeed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->openLimitSpeed:Z

    return-void
.end method

.method public setPackageInfo(Landroid/content/pm/PackageInfo;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageInfoRef:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    return-void
.end method

.method public setPausedResumeCount(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "paused_resume_count"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setPreconnectLevel(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureDBJsonData()V

    .line 2
    .line 3
    .line 4
    const-string v0, "dbjson_key_preconnect_level"

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

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
.end method

.method public setRetryDelayStatus(Lcom/ss/android/socialbase/downloader/constants/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    return-void
.end method

.method public setRetryScheduleCount(I)V
    .locals 1

    .line 1
    const-string v0, "retry_schedule_count"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setSavePath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    return-void
.end method

.method public setSavePathRedirected(Z)V
    .locals 1

    .line 1
    const-string v0, "is_save_path_redirected"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setShowNotification(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    return-void
.end method

.method public setShowNotificationForAutoResumed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    return-void
.end method

.method public setShowNotificationForNetworkResumed(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForNetworkResumed:Z

    return-void
.end method

.method public setSpValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    :goto_0
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
.end method

.method public setStatus(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->status:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setStatusAtDbInit(I)V
    .locals 0

    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->statusAtDbInit:I

    return-void
.end method

.method public setSuccessByCache(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    return-void
.end method

.method public setSupportPartial(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    return-void
.end method

.method public setTTMd5CheckStatus(I)V
    .locals 1

    .line 1
    const-string v0, "ttmd5_check_status"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public setThrottleNetSpeed(J)V
    .locals 0

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->throttleNetSpeed:J

    return-void
.end method

.method public setTotalBytes(J)V
    .locals 0

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    return-void
.end method

.method public setUninstallResumeCount(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "unins_resume_count"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    return-void
.end method

.method public seteTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    return-void
.end method

.method public startPauseReserveOnWifi()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "pause_reserve_on_wifi"

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
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

.method public statusInPause()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x2

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x5

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    :goto_1
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public stopPauseReserveOnWifi()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->ensureSpData()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "pause_reserve_on_wifi"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
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

.method public toContentValues()Landroid/content/ContentValues;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "_id"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "url"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "savePath"

    .line 25
    .line 26
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, "tempPath"

    .line 32
    .line 33
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "name"

    .line 39
    .line 40
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "chunkCount"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "status"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "curBytes"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 80
    .line 81
    .line 82
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 83
    .line 84
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "totalBytes"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "eTag"

    .line 94
    .line 95
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    .line 101
    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const-string v2, "onlyWifi"

    .line 107
    .line 108
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    .line 112
    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v2, "force"

    .line 118
    .line 119
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 120
    .line 121
    .line 122
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "retryCount"

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "extra"

    .line 134
    .line 135
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const-string v1, "mimeType"

    .line 141
    .line 142
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v1, "title"

    .line 148
    .line 149
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    .line 155
    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-string v2, "notificationEnable"

    .line 161
    .line 162
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 163
    .line 164
    .line 165
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    .line 166
    .line 167
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v2, "notificationVisibility"

    .line 172
    .line 173
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 174
    .line 175
    .line 176
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstDownload:Z

    .line 177
    .line 178
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-string v2, "isFirstDownload"

    .line 183
    .line 184
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 185
    .line 186
    .line 187
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFirstSuccess:Z

    .line 188
    .line 189
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const-string v2, "isFirstSuccess"

    .line 194
    .line 195
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 196
    .line 197
    .line 198
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 199
    .line 200
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v2, "needHttpsToHttpRetry"

    .line 205
    .line 206
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 207
    .line 208
    .line 209
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 210
    .line 211
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const-string v2, "downloadTime"

    .line 216
    .line 217
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 218
    .line 219
    .line 220
    const-string v1, "packageName"

    .line 221
    .line 222
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string v1, "md5"

    .line 228
    .line 229
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    .line 235
    .line 236
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const-string v2, "retryDelay"

    .line 241
    .line 242
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 243
    .line 244
    .line 245
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 246
    .line 247
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const-string v2, "curRetryTime"

    .line 252
    .line 253
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 254
    .line 255
    .line 256
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    const-string v2, "retryDelayStatus"

    .line 267
    .line 268
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 269
    .line 270
    .line 271
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 272
    .line 273
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const-string v2, "defaultHttpServiceBackUp"

    .line 278
    .line 279
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 280
    .line 281
    .line 282
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    .line 283
    .line 284
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    const-string v2, "chunkRunnableReuse"

    .line 289
    .line 290
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 291
    .line 292
    .line 293
    const-string v1, "retryDelayTimeArray"

    .line 294
    .line 295
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    .line 301
    .line 302
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    const-string v2, "chunkDowngradeRetry"

    .line 307
    .line 308
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 309
    .line 310
    .line 311
    const-string v1, "backUpUrlsStr"

    .line 312
    .line 313
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlsStr()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 321
    .line 322
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const-string v2, "backUpUrlRetryCount"

    .line 327
    .line 328
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 329
    .line 330
    .line 331
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 332
    .line 333
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-string v2, "realDownloadTime"

    .line 338
    .line 339
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 340
    .line 341
    .line 342
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryScheduleMinutes:I

    .line 343
    .line 344
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    const-string v2, "retryScheduleMinutes"

    .line 349
    .line 350
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 351
    .line 352
    .line 353
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    .line 354
    .line 355
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    const-string v2, "independentProcess"

    .line 360
    .line 361
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 362
    .line 363
    .line 364
    const-string v1, "auxiliaryJsonobjectString"

    .line 365
    .line 366
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDBJsonDataString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    const-string v1, "iconUrl"

    .line 374
    .line 375
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    .line 381
    .line 382
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    const-string v2, "appVersionCode"

    .line 387
    .line 388
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 389
    .line 390
    .line 391
    const-string v1, "taskId"

    .line 392
    .line 393
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadInfo{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", title=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", url=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", savePath=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trySwitchToNextBackupUrl()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 28
    .line 29
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 38
    .line 39
    iget v3, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 40
    .line 41
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 57
    .line 58
    add-int/2addr v0, v1

    .line 59
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    return v2
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

.method public updateCurRetryTime(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 9
    .line 10
    :goto_0
    sub-int/2addr v0, p1

    .line 11
    iput v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 12
    .line 13
    if-gez v0, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 17
    .line 18
    :cond_1
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
.end method

.method public updateDownloadTime()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->startDownloadTime:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->startDownloadTime:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 18
    .line 19
    cmp-long v4, v4, v2

    .line 20
    .line 21
    if-gez v4, :cond_1

    .line 22
    .line 23
    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 24
    .line 25
    :cond_1
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-lez v2, :cond_2

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 30
    .line 31
    :cond_2
    return-void
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

.method public updateRealDownloadTime(Z)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmp-long v6, v2, v4

    .line 10
    .line 11
    if-gtz v6, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    sub-long v2, v0, v2

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iput-wide v4, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 26
    .line 27
    :goto_0
    cmp-long p1, v2, v4

    .line 28
    .line 29
    if-lez p1, :cond_3

    .line 30
    .line 31
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 32
    .line 33
    add-long/2addr v0, v2

    .line 34
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 35
    .line 36
    :cond_3
    return-void
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

.method public updateRealStartDownloadTime()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realStartDownloadTime:J

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

.method public updateSpData()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v1, "sp_download_info"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->spData:Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 42
    .line 43
    .line 44
    :cond_1
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

.method public updateStartDownloadTime()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->startDownloadTime:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "dbjson_last_start_download_time"

    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->safePutToDBJsonData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->id:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->name:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->title:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->url:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->savePath:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->tempPath:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->onlyWifi:Z

    .line 32
    .line 33
    int-to-byte v0, v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extra:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->extraHeaders:Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxBytes:I

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outIp:[Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->outSize:[I

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryCount:I

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlRetryCount:I

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    .line 71
    .line 72
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->force:Z

    .line 73
    .line 74
    int-to-byte v0, v0

    .line 75
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 76
    .line 77
    .line 78
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needPostProgress:Z

    .line 79
    .line 80
    int-to-byte v0, v0

    .line 81
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 82
    .line 83
    .line 84
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->maxProgressCount:I

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->minProgressTimeMsInterval:I

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrls:Ljava/util/List;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotification:Z

    .line 100
    .line 101
    int-to-byte v0, v0

    .line 102
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->mimeType:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needHttpsToHttpRetry:Z

    .line 111
    .line 112
    int-to-byte v0, v0

    .line 113
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->packageName:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->md5:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needRetryDelay:Z

    .line 127
    .line 128
    int-to-byte v0, v0

    .line 129
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 130
    .line 131
    .line 132
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needDefaultHttpServiceBackUp:Z

    .line 133
    .line 134
    int-to-byte v0, v0

    .line 135
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 136
    .line 137
    .line 138
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseChunkRunnable:Z

    .line 139
    .line 140
    int-to-byte v0, v0

    .line 141
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayTimeArray:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->eTag:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curRetryTime:I

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryDelayStatus:Lcom/ss/android/socialbase/downloader/constants/g;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    .line 167
    .line 168
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needReuseFirstConnection:Z

    .line 169
    .line 170
    int-to-byte v0, v0

    .line 171
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 172
    .line 173
    .line 174
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forceIgnoreRecommendSize:Z

    .line 175
    .line 176
    int-to-byte v0, v0

    .line 177
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->networkQuality:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->curBackUpUrlIndex:I

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 188
    .line 189
    .line 190
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->notificationVisibility:I

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    .line 194
    .line 195
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkCount:I

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 205
    .line 206
    .line 207
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->totalBytes:J

    .line 208
    .line 209
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    .line 218
    .line 219
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->downloadTime:J

    .line 220
    .line 221
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 222
    .line 223
    .line 224
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->realDownloadTime:J

    .line 225
    .line 226
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 227
    .line 228
    .line 229
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->backUpUrlUsed:Z

    .line 230
    .line 231
    int-to-byte v0, v0

    .line 232
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 233
    .line 234
    .line 235
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpsToHttpRetryUsed:Z

    .line 236
    .line 237
    int-to-byte v0, v0

    .line 238
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->errorBytesLog:Ljava/lang/StringBuffer;

    .line 242
    .line 243
    if-eqz v0, :cond_0

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    goto :goto_0

    .line 250
    :cond_0
    const-string v0, ""

    .line 251
    .line 252
    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->autoResumed:Z

    .line 256
    .line 257
    int-to-byte v0, v0

    .line 258
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 259
    .line 260
    .line 261
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForAutoResumed:Z

    .line 262
    .line 263
    int-to-byte v0, v0

    .line 264
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 265
    .line 266
    .line 267
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->showNotificationForNetworkResumed:Z

    .line 268
    .line 269
    int-to-byte v0, v0

    .line 270
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->forbiddenBackupUrls:Ljava/util/List;

    .line 274
    .line 275
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needIndependentProcess:Z

    .line 279
    .line 280
    int-to-byte v0, v0

    .line 281
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->enqueueType:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 291
    .line 292
    .line 293
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->headConnectionAvailable:Z

    .line 294
    .line 295
    int-to-byte v0, v0

    .line 296
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 297
    .line 298
    .line 299
    iget v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusCode:I

    .line 300
    .line 301
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 302
    .line 303
    .line 304
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->httpStatusMessage:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSaveTempFile:Z

    .line 310
    .line 311
    int-to-byte v0, v0

    .line 312
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 313
    .line 314
    .line 315
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed:Z

    .line 316
    .line 317
    int-to-byte v0, v0

    .line 318
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 319
    .line 320
    .line 321
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->addListenerToSameTask:Z

    .line 322
    .line 323
    int-to-byte v0, v0

    .line 324
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 325
    .line 326
    .line 327
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->needChunkDowngradeRetry:Z

    .line 328
    .line 329
    int-to-byte v0, v0

    .line 330
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 331
    .line 332
    .line 333
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->chunkDowngradeRetryUsed:Z

    .line 334
    .line 335
    int-to-byte v0, v0

    .line 336
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 337
    .line 338
    .line 339
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->failedException:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 340
    .line 341
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 342
    .line 343
    .line 344
    iget p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->retryScheduleMinutes:I

    .line 345
    .line 346
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 347
    .line 348
    .line 349
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDBJsonDataString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->supportPartial:Z

    .line 357
    .line 358
    int-to-byte p2, p2

    .line 359
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 360
    .line 361
    .line 362
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->iconUrl:Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    iget p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->appVersionCode:I

    .line 368
    .line 369
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 370
    .line 371
    .line 372
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->taskId:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->expiredRedownload:Z

    .line 378
    .line 379
    int-to-byte p2, p2

    .line 380
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 381
    .line 382
    .line 383
    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->deleteCacheIfCheckFailed:Z

    .line 384
    .line 385
    int-to-byte p2, p2

    .line 386
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 387
    .line 388
    .line 389
    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->successByCache:Z

    .line 390
    .line 391
    int-to-byte p2, p2

    .line 392
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 393
    .line 394
    .line 395
    return-void
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
