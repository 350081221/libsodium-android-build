.class public Lcom/ss/android/socialbase/appdownloader/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "d"

.field private static volatile b:Lcom/ss/android/socialbase/appdownloader/d; = null

.field private static f:Z = false

.field private static g:Z = false

.field private static h:Z = false


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

.field private i:Ljava/util/concurrent/Future;

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Lcom/ss/android/socialbase/appdownloader/c/c;

.field private n:Lcom/ss/android/socialbase/appdownloader/c/d;

.field private o:Lcom/ss/android/socialbase/appdownloader/c/h;

.field private p:Lcom/ss/android/socialbase/appdownloader/c/g;

.field private q:Lcom/ss/android/socialbase/appdownloader/c/m;

.field private r:Lcom/ss/android/socialbase/appdownloader/c/f;

.field private s:Lcom/ss/android/socialbase/appdownloader/c/j;

.field private t:Lcom/ss/android/socialbase/downloader/depend/ad;

.field private u:Lcom/ss/android/socialbase/downloader/depend/ag;

.field private v:Lcom/ss/android/socialbase/appdownloader/c/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->k:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->l:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private a(Lcom/ss/android/socialbase/appdownloader/c/e;)Lcom/ss/android/socialbase/downloader/depend/z;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 141
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/d$6;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/socialbase/appdownloader/d$6;-><init>(Lcom/ss/android/socialbase/appdownloader/d;Lcom/ss/android/socialbase/appdownloader/c/e;)V

    return-object v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    if-eqz p1, :cond_1

    .line 150
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 151
    :cond_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;"
        }
    .end annotation

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "User-Agent"

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    .line 132
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 133
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/c;

    if-eqz v3, :cond_0

    .line 134
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 135
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v2, 0x1

    .line 136
    :cond_1
    new-instance v4, Lcom/ss/android/socialbase/downloader/model/c;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    .line 138
    new-instance p1, Lcom/ss/android/socialbase/downloader/model/c;

    sget-object v2, Lcom/ss/android/socialbase/appdownloader/b/a;->a:Ljava/lang/String;

    invoke-direct {p1, v1, v2}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method

.method static synthetic a(Lcom/ss/android/socialbase/appdownloader/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/d;->s()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/appdownloader/d;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 127
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->download()I

    .line 128
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 129
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setAntiHijackErrorCode(I)V

    :cond_1
    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    .line 130
    invoke-virtual {p1, p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSavePathRedirected(Z)V

    :cond_2
    return-void
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 1

    const/4 v0, 0x1

    .line 11
    invoke-static {p0, p1, v0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;IZ)I

    move-result p0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lcom/ss/android/socialbase/appdownloader/d;)Lcom/ss/android/socialbase/appdownloader/c/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/d;->o:Lcom/ss/android/socialbase/appdownloader/c/h;

    return-object p0
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 12
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfoList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isSavePathRedirected()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private b(I)V
    .locals 3

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "app_install_keep_receiver_time_s"

    const/16 v2, 0x3c

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->j:I

    .line 5
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tryUnRegisterTempAppInstallDownloadReceiver mAppInstallReceiverKeepTime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/d;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->j:I

    if-gtz v0, :cond_0

    return-void

    :cond_0
    if-lez p1, :cond_1

    .line 7
    iput p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->j:I

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->i:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    :cond_2
    :goto_0
    new-instance p1, Lcom/ss/android/socialbase/appdownloader/d$2;

    invoke-direct {p1, p0}, Lcom/ss/android/socialbase/appdownloader/d$2;-><init>(Lcom/ss/android/socialbase/appdownloader/d;)V

    iget v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->j:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->i:Ljava/util/concurrent/Future;

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 2
    sget-boolean v0, Lcom/ss/android/socialbase/appdownloader/d;->f:Z

    if-nez v0, :cond_1

    const-string v0, "application/vnd.android.package-archive"

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/constants/e;->a(Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Landroid/content/Context;)V

    .line 5
    new-instance p1, Lcom/ss/android/socialbase/appdownloader/d/b;

    invoke-direct {p1}, Lcom/ss/android/socialbase/appdownloader/d/b;-><init>()V

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/l;)V

    .line 6
    iget-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->l:Z

    if-eqz p1, :cond_0

    .line 7
    new-instance p1, Lcom/ss/android/socialbase/appdownloader/d$1;

    invoke-direct {p1, p0}, Lcom/ss/android/socialbase/appdownloader/d$1;-><init>(Lcom/ss/android/socialbase/appdownloader/d;)V

    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/d;->s()V

    .line 9
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/d;->t()V

    const/4 p1, 0x1

    .line 10
    sput-boolean p1, Lcom/ss/android/socialbase/appdownloader/d;->f:Z

    :cond_1
    return-void
.end method

.method public static j()Lcom/ss/android/socialbase/appdownloader/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->b:Lcom/ss/android/socialbase/appdownloader/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/appdownloader/d;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/appdownloader/d;->b:Lcom/ss/android/socialbase/appdownloader/d;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/appdownloader/d;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/appdownloader/d;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/appdownloader/d;->b:Lcom/ss/android/socialbase/appdownloader/d;

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
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->b:Lcom/ss/android/socialbase/appdownloader/d;

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

.method static synthetic r()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method private s()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->g:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    new-instance v1, Landroid/content/IntentFilter;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "android.ss.intent.action.DOWNLOAD_COMPLETE"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Landroid/content/IntentFilter;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "android.intent.action.MEDIA_MOUNTED"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v3, "file"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 45
    .line 46
    invoke-virtual {v3, v4, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 54
    .line 55
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    sput-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->g:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception v1

    .line 63
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v2, "registerDownloadReceiver mIsRegistered:"

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    sget-boolean v2, Lcom/ss/android/socialbase/appdownloader/d;->g:Z

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_0
    move-exception v1

    .line 93
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    throw v1
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

.method private t()V
    .locals 1

    new-instance v0, Lcom/ss/android/socialbase/appdownloader/d$3;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/appdownloader/d$3;-><init>(Lcom/ss/android/socialbase/appdownloader/d;)V

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/r;->a(Lcom/ss/android/socialbase/downloader/impls/r$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ss/android/socialbase/appdownloader/f;)I
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    const/4 v9, 0x0

    if-eqz v8, :cond_19

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->b()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v10, 0x1

    .line 18
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->f()Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->c()Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v9

    .line 21
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->u()I

    move-result v5

    if-nez v5, :cond_2

    move v6, v10

    goto :goto_0

    :cond_2
    move v6, v9

    .line 22
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->N()Ljava/lang/String;

    move-result-object v2

    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->d()Ljava/lang/String;

    move-result-object v3

    .line 24
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->n()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2, v6}, Lcom/ss/android/socialbase/appdownloader/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    .line 26
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v11, 0xff

    if-le v4, v11, :cond_4

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v11

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 28
    :cond_4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v3, v2

    .line 29
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->n()Ljava/lang/String;

    move-result-object v4

    const-string v11, ".apk"

    .line 30
    invoke-virtual {v2, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->n()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/ss/android/socialbase/appdownloader/c;->c(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_6

    const-string v4, "application/vnd.android.package-archive"

    .line 31
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->e()Ljava/lang/String;

    move-result-object v11

    .line 32
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->e()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 33
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/c;->b()Ljava/lang/String;

    move-result-object v11

    :cond_7
    move-object v15, v11

    .line 34
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_18

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto/16 :goto_9

    .line 35
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->U()Ljava/lang/String;

    move-result-object v11

    .line 36
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_9

    move-object v11, v1

    .line 37
    :cond_9
    invoke-static {v11, v15}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v14

    .line 38
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ag()Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v11}, Lcom/ss/android/socialbase/downloader/g/a;->a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v11

    const-string v12, "resume_task_override_settings"

    invoke-virtual {v11, v12}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 39
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v11

    invoke-virtual {v11, v14}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v11, :cond_a

    .line 40
    :try_start_1
    new-instance v12, Lorg/json/JSONObject;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadSettingString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v12, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/appdownloader/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :catchall_0
    :cond_a
    :try_start_2
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ag()Lorg/json/JSONObject;

    move-result-object v11

    invoke-static {v14, v11}, Lcom/ss/android/socialbase/downloader/g/a;->a(ILorg/json/JSONObject;)V

    .line 42
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->M()Z

    move-result v11

    .line 43
    invoke-static {v14}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v12

    const-string v13, "modify_force"

    invoke-virtual {v12, v13, v10}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v12

    if-ne v12, v10, :cond_b

    if-nez v11, :cond_b

    .line 44
    invoke-static {v15, v2}, Lcom/ss/android/socialbase/downloader/i/f;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->b()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v12

    invoke-virtual {v12, v14}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v12

    if-nez v12, :cond_b

    move v13, v10

    goto :goto_1

    :cond_b
    move v13, v11

    .line 45
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->l()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v11

    if-nez v11, :cond_d

    .line 46
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->g()Z

    move-result v12

    if-nez v12, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->h()Z

    move-result v12

    if-eqz v12, :cond_d

    .line 47
    :cond_c
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->p()Lcom/ss/android/socialbase/downloader/notification/a;

    move-result-object v11

    if-eqz v11, :cond_e

    .line 48
    new-instance v11, Lcom/ss/android/socialbase/appdownloader/e/b;

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->p()Lcom/ss/android/socialbase/downloader/notification/a;

    move-result-object v12

    invoke-direct {v11, v12}, Lcom/ss/android/socialbase/appdownloader/e/b;-><init>(Lcom/ss/android/socialbase/downloader/notification/a;)V

    :cond_d
    move v9, v13

    move/from16 v19, v14

    move-object/from16 v20, v15

    goto :goto_2

    .line 49
    :cond_e
    new-instance v18, Lcom/ss/android/socialbase/appdownloader/e/b;

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->b()Landroid/content/Context;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->m()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v11, v18

    move v9, v13

    move v13, v14

    move/from16 v19, v14

    move-object v14, v3

    move-object/from16 v20, v15

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v17}, Lcom/ss/android/socialbase/appdownloader/e/b;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v11, v18

    .line 50
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->P()Lcom/ss/android/socialbase/downloader/depend/n;

    move-result-object v12

    if-nez v12, :cond_f

    .line 51
    new-instance v12, Lcom/ss/android/socialbase/appdownloader/d$4;

    invoke-direct {v12, v7}, Lcom/ss/android/socialbase/appdownloader/d$4;-><init>(Lcom/ss/android/socialbase/appdownloader/d;)V

    .line 52
    :cond_f
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->B()Ljava/util/List;

    move-result-object v13

    .line 53
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_10

    .line 54
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/ss/android/socialbase/downloader/depend/m;

    .line 55
    invoke-virtual {v8, v14}, Lcom/ss/android/socialbase/appdownloader/f;->a(Lcom/ss/android/socialbase/downloader/depend/m;)Lcom/ss/android/socialbase/appdownloader/f;

    goto :goto_3

    .line 56
    :cond_10
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->m()Ljava/lang/String;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 57
    :try_start_3
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_11

    .line 58
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14, v13}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_4

    .line 59
    :cond_11
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    :goto_4
    const-string v15, "auto_install_with_notification"

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->i()Z

    move-result v10

    invoke-virtual {v14, v15, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v10, "auto_install_without_notification"

    .line 61
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->h()Z

    move-result v15

    invoke-virtual {v14, v10, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 62
    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :catchall_1
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->g()Z

    move-result v10

    if-nez v10, :cond_13

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->h()Z

    move-result v10

    if-eqz v10, :cond_12

    goto :goto_5

    :cond_12
    const/4 v10, 0x0

    goto :goto_6

    :cond_13
    :goto_5
    const/4 v10, 0x1

    :goto_6
    if-eqz v10, :cond_14

    .line 64
    invoke-static/range {v19 .. v19}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v14

    const-string v15, "enable_notification_ui"

    invoke-virtual {v14, v15}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v14

    const/4 v15, 0x1

    if-lt v14, v15, :cond_14

    .line 65
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e/c;->a()Lcom/ss/android/socialbase/appdownloader/e/c;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ad()Ljava/lang/String;

    move-result-object v15

    move/from16 v8, v19

    invoke-virtual {v14, v8, v15}, Lcom/ss/android/socialbase/appdownloader/e/c;->a(ILjava/lang/String;)V

    goto :goto_7

    :cond_14
    move/from16 v8, v19

    .line 66
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->b()Landroid/content/Context;

    move-result-object v14

    invoke-static {v14}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->with(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v14

    .line 67
    invoke-virtual {v14, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->url(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ae()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v1, v14}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->backUpUrls(Ljava/util/List;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    .line 69
    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->name(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    .line 70
    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->title(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    move-object/from16 v2, v20

    .line 71
    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->savePath(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    .line 72
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->j()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->onlyWifi(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->extraHeaders(Ljava/util/List;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 74
    invoke-virtual {v0, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->depend(Lcom/ss/android/socialbase/downloader/depend/n;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->y()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->retryCount(I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->z()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->backUpUrlRetryCount(I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v10}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->showNotification(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 78
    invoke-virtual {v0, v13}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->extra(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 79
    invoke-virtual {v0, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->mimeType(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->F()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->minProgressTimeMsInterval(I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->G()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->maxProgressCount(I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->k()Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->mainThreadListener(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 83
    invoke-virtual {v0, v11}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationListener(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->Q()Lcom/ss/android/socialbase/appdownloader/c/e;

    move-result-object v1

    invoke-direct {v7, v1}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/appdownloader/c/e;)Lcom/ss/android/socialbase/downloader/depend/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationEventListener(Lcom/ss/android/socialbase/downloader/depend/z;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 85
    invoke-virtual {v0, v9}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->force(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->autoResumed(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 87
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->t()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->showNotificationForAutoResumed(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 88
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->q()Lcom/ss/android/socialbase/downloader/downloader/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->chunkStategy(Lcom/ss/android/socialbase/downloader/downloader/h;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 89
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->r()Lcom/ss/android/socialbase/downloader/downloader/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->chunkAdjustCalculator(Lcom/ss/android/socialbase/downloader/downloader/g;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 90
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->o()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needHttpsToHttpRetry(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 91
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->packageName(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->md5(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->x()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->expectFileLength(J)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->A()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needRetryDelay(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 95
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->B()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->retryDelayTimeArray(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 96
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->C()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needDefaultHttpServiceBackUp(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->D()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needReuseFirstConnection(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 98
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->H()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needReuseChunkRunnable(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 99
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->I()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needIndependentProcess(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->L()Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->enqueueType(Lcom/ss/android/socialbase/downloader/constants/EnqueueType;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 101
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->O()Lcom/ss/android/socialbase/downloader/depend/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->monitorDepend(Lcom/ss/android/socialbase/downloader/depend/x;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 102
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->E()Lcom/ss/android/socialbase/downloader/downloader/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->retryDelayTimeCalculator(Lcom/ss/android/socialbase/downloader/downloader/s;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 103
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->J()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->headConnectionAvailable(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 104
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->R()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->fileUriProvider(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->af()Lcom/ss/android/socialbase/downloader/depend/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->diskSpaceHandler(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->K()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needChunkDowngradeRetry(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 107
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->S()Lcom/ss/android/socialbase/downloader/depend/af;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->notificationClickCallback(Lcom/ss/android/socialbase/downloader/depend/af;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 108
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ag()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->downloadSetting(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ad()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->iconUrl(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 110
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->Y()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->needSDKMonitor(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 111
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->Z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->monitorScene(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->aa()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->extraMonitorStatus([I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 113
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->W()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->executorGroup(I)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 114
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->X()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->throttleNetSpeed(J)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 115
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ab()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->distinctDirectory(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->U()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->taskKey(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v0

    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->ac()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->setAutoInstall(Z)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 118
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->T()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    .line 119
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->T()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->setDownloadCompleteHandlers(Ljava/util/List;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    :cond_15
    if-eqz v4, :cond_17

    if-eqz v10, :cond_16

    .line 120
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->V()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->a()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e/d;->a()Z

    move-result v0

    if-nez v0, :cond_16

    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->a()Landroid/app/Activity;

    move-result-object v0

    new-instance v9, Lcom/ss/android/socialbase/appdownloader/d$5;

    move-object v1, v9

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/ss/android/socialbase/appdownloader/d$5;-><init>(Lcom/ss/android/socialbase/appdownloader/d;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    invoke-static {v0, v9}, Lcom/ss/android/socialbase/appdownloader/e/d;->a(Landroid/app/Activity;Lcom/ss/android/socialbase/appdownloader/c/n;)V

    goto :goto_8

    .line 122
    :cond_16
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notification permission need not request, start download :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-direct {v7, v4, v5, v6}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    .line 124
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_17
    :goto_8
    return v8

    :cond_18
    :goto_9
    move v1, v9

    return v1

    :catchall_2
    move-exception v0

    .line 125
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/appdownloader/f;->O()Lcom/ss/android/socialbase/downloader/depend/x;

    move-result-object v1

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "addDownloadTask"

    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x3eb

    invoke-direct {v2, v4, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/depend/x;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    .line 126
    sget-object v1, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v4

    const-string v0, "add download task error:%s"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v4

    :cond_19
    :goto_a
    move v4, v9

    return v4
.end method

.method public a()Lcom/ss/android/socialbase/appdownloader/c/c;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->m:Lcom/ss/android/socialbase/appdownloader/c/c;

    return-object v0
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 4

    .line 142
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    if-nez p1, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/d;->h()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 144
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    .line 145
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    .line 146
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    .line 147
    :cond_3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v2

    const-string v3, "get_download_info_by_list"

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v0, :cond_4

    if-eqz v2, :cond_4

    .line 148
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/d;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    return-object v0

    :catchall_0
    move-exception p1

    .line 149
    sget-object p2, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "getAppDownloadInfo error:%s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-object v1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 140
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ".apk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/ss/android/socialbase/appdownloader/c;->c(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p2, "application/vnd.android.package-archive"

    :cond_0
    return-object p2
.end method

.method public a(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 152
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getUnCompletedDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(I)V
    .locals 3

    .line 157
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "enable_app_install_receiver"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    .line 158
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/appdownloader/d;->k()V

    .line 159
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/d;->b(I)V

    return-void
.end method

.method public a(Landroid/content/Context;II)V
    .locals 0

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 12
    :pswitch_1
    :try_start_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->pause(I)V

    goto :goto_0

    .line 13
    :pswitch_2
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->resume(I)V

    goto :goto_0

    :pswitch_3
    const/4 p3, 0x1

    .line 14
    invoke-static {p1, p2, p3}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;IZ)I

    goto :goto_0

    .line 15
    :pswitch_4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->restart(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/socialbase/appdownloader/c/c;Lcom/ss/android/socialbase/appdownloader/c/d;Lcom/ss/android/socialbase/appdownloader/c/h;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p3, :cond_0

    .line 7
    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/d;->m:Lcom/ss/android/socialbase/appdownloader/c/c;

    :cond_0
    if-eqz p4, :cond_1

    .line 8
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/d;->n:Lcom/ss/android/socialbase/appdownloader/c/d;

    :cond_1
    if-eqz p5, :cond_2

    .line 9
    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/d;->o:Lcom/ss/android/socialbase/appdownloader/c/h;

    .line 10
    :cond_2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/appdownloader/d;->c(Landroid/content/Context;)V

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/appdownloader/c/g;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->p:Lcom/ss/android/socialbase/appdownloader/c/g;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/appdownloader/c/j;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->s:Lcom/ss/android/socialbase/appdownloader/c/j;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/appdownloader/c/o;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->v:Lcom/ss/android/socialbase/appdownloader/c/o;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/ad;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->t:Lcom/ss/android/socialbase/downloader/depend/ad;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/depend/ag;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->u:Lcom/ss/android/socialbase/downloader/depend/ag;

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/downloader/r;)V
    .locals 1

    .line 154
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->setReserveWifiStatusListener(Lcom/ss/android/socialbase/downloader/downloader/r;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->d:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 161
    iput-boolean p1, p0, Lcom/ss/android/socialbase/appdownloader/d;->l:Z

    return-void
.end method

.method public b()Lcom/ss/android/socialbase/appdownloader/c/d;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->n:Lcom/ss/android/socialbase/appdownloader/c/d;

    return-object v0
.end method

.method public b(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 15
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadingDownloadInfosWithMimeType(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->setDefaultSavePath(Ljava/lang/String;)V

    return-void
.end method

.method public c()Lcom/ss/android/socialbase/appdownloader/c/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->o:Lcom/ss/android/socialbase/appdownloader/c/h;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/ss/android/socialbase/appdownloader/c/f;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->r:Lcom/ss/android/socialbase/appdownloader/c/f;

    return-object v0
.end method

.method public f()Z
    .locals 3

    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "package_flag_config"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public g()Lcom/ss/android/socialbase/appdownloader/c/j;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->s:Lcom/ss/android/socialbase/appdownloader/c/j;

    return-object v0
.end method

.method public h()Ljava/io/File;
    .locals 1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getGlobalSaveDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public k()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "enable_app_install_receiver"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "disable app install receiver"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    const/4 v1, 0x0

    .line 26
    :try_start_0
    sget-boolean v3, Lcom/ss/android/socialbase/appdownloader/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/appdownloader/d;->b(I)V

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 34
    return-void

    .line 35
    :cond_1
    :try_start_2
    new-instance v3, Landroid/content/IntentFilter;

    .line 36
    .line 37
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v4, "android.intent.action.PACKAGE_ADDED"

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v4, "android.intent.action.PACKAGE_REPLACED"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v4, "package"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v5, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 60
    .line 61
    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    sput-boolean v2, Lcom/ss/android/socialbase/appdownloader/d;->h:Z

    .line 65
    .line 66
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/d;->v:Lcom/ss/android/socialbase/appdownloader/c/o;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-interface {v2}, Lcom/ss/android/socialbase/appdownloader/c/o;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v2

    .line 75
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_0
    :try_start_4
    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/appdownloader/d;->b(I)V

    .line 79
    .line 80
    .line 81
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 82
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    .line 83
    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v2, "tryRegisterTempAppInstallDownloadReceiver mIsAppInstallRegistered:"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    sget-boolean v2, Lcom/ss/android/socialbase/appdownloader/d;->g:Z

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :catchall_1
    move-exception v2

    .line 108
    :try_start_5
    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/appdownloader/d;->b(I)V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :catchall_2
    move-exception v1

    .line 113
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 114
    throw v1
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

.method public l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->g:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/d;->e:Lcom/ss/android/socialbase/appdownloader/DownloadReceiver;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 15
    .line 16
    .line 17
    sget-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->h:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/d;->v:Lcom/ss/android/socialbase/appdownloader/c/o;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/ss/android/socialbase/appdownloader/c/o;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v1

    .line 32
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 36
    sput-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->g:Z

    .line 37
    .line 38
    sput-boolean v1, Lcom/ss/android/socialbase/appdownloader/d;->h:Z

    .line 39
    .line 40
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    sget-object v0, Lcom/ss/android/socialbase/appdownloader/d;->a:Ljava/lang/String;

    .line 42
    .line 43
    const-string v1, "registerDownloadReceiver unRegisterDownloadReceiver"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw v1
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

.method public m()Lcom/ss/android/socialbase/appdownloader/c/m;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->q:Lcom/ss/android/socialbase/appdownloader/c/m;

    return-object v0
.end method

.method public n()Lcom/ss/android/socialbase/appdownloader/c/g;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->p:Lcom/ss/android/socialbase/appdownloader/c/g;

    return-object v0
.end method

.method public o()Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getReserveWifiStatusListener()Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    return-object v0
.end method

.method public p()Lcom/ss/android/socialbase/downloader/depend/ad;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->t:Lcom/ss/android/socialbase/downloader/depend/ad;

    return-object v0
.end method

.method public q()Lcom/ss/android/socialbase/downloader/depend/ag;
    .locals 1

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d;->u:Lcom/ss/android/socialbase/downloader/depend/ag;

    return-object v0
.end method
