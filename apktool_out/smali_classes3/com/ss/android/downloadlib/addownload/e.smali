.class public Lcom/ss/android/downloadlib/addownload/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/g;
.implements Lcom/ss/android/downloadlib/g/n$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/e$b;,
        Lcom/ss/android/downloadlib/addownload/e$a;,
        Lcom/ss/android/downloadlib/addownload/e$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "e"


# instance fields
.field private final b:Lcom/ss/android/downloadlib/g/n;

.field private c:Lcom/ss/android/downloadlib/addownload/h;

.field private d:Lcom/ss/android/downloadlib/addownload/d;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/ss/android/download/api/model/DownloadShortInfo;

.field private h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private i:Lcom/ss/android/downloadlib/addownload/e$c;

.field private final j:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

.field private k:Z

.field private l:J

.field private m:Ljava/lang/String;

.field private n:J

.field private o:Lcom/ss/android/download/api/download/DownloadModel;

.field private p:Lcom/ss/android/download/api/download/DownloadEventConfig;

.field private q:Lcom/ss/android/download/api/download/DownloadController;

.field private r:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/download/api/config/OnItemClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private s:Z

.field private final t:Z

.field private u:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/ss/android/download/api/config/IDownloadButtonClickListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/ss/android/downloadlib/g/n;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1, p0}, Lcom/ss/android/downloadlib/g/n;-><init>(Landroid/os/Looper;Lcom/ss/android/downloadlib/g/n$a;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->b:Lcom/ss/android/downloadlib/g/n;

    .line 14
    .line 15
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    .line 21
    .line 22
    new-instance v1, Lcom/ss/android/downloadlib/addownload/h$a;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lcom/ss/android/downloadlib/addownload/h$a;-><init>(Lcom/ss/android/downloadlib/g/n;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->j:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    .line 28
    .line 29
    const-wide/16 v1, -0x1

    .line 30
    .line 31
    iput-wide v1, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 37
    .line 38
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->q:Lcom/ss/android/download/api/download/DownloadController;

    .line 39
    .line 40
    new-instance v1, Lcom/ss/android/downloadlib/addownload/h;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/h;-><init>(Lcom/ss/android/downloadlib/addownload/e;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    .line 46
    .line 47
    new-instance v1, Lcom/ss/android/downloadlib/addownload/d;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lcom/ss/android/downloadlib/addownload/d;-><init>(Landroid/os/Handler;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    .line 53
    .line 54
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "ttdownloader_callback_twice"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/e;->t:Z

    .line 65
    .line 66
    return-void
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

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->l()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/e;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return-object p1
.end method

.method private a(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1
    .param p3    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 96
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p3

    const-string v0, "fix_click_start"

    invoke-virtual {p3, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x3

    if-eq p2, p3, :cond_0

    .line 97
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/d;->a()Lcom/ss/android/socialbase/downloader/downloader/d;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/ss/android/socialbase/downloader/downloader/d;->e(I)Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 98
    invoke-virtual {p0, p1, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(ZZ)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object p3

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3, v0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;II)V

    goto :goto_0

    .line 100
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object p3

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3, v0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/d;->a(Landroid/content/Context;II)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/e;IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/e;->a(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/e;Z)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->g(Z)V

    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2

    .line 101
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x3

    .line 102
    iput v1, v0, Landroid/os/Message;->what:I

    .line 103
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 104
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->b:Lcom/ss/android/downloadlib/g/n;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method static synthetic b(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/downloadlib/addownload/h;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    return-object p0
.end method

.method static synthetic b(Lcom/ss/android/downloadlib/addownload/e;Z)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->h(Z)V

    return-void
.end method

.method static synthetic c(Lcom/ss/android/downloadlib/addownload/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    return-wide v0
.end method

.method private c(I)Z
    .locals 5

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/e;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/d;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v2, -0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_0

    :cond_2
    const/4 v2, 0x5

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    instance-of v4, v3, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v4, :cond_3

    .line 6
    check-cast v3, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    const/4 v4, 0x3

    .line 7
    invoke-virtual {v3, v4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFunnelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 8
    :cond_3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/ss/android/downloadlib/g/i;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v1, v3, v4, p1}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    .line 10
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object p1

    .line 11
    iput v2, p1, Landroid/os/Message;->what:I

    .line 12
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/c;->a()Lcom/ss/android/downloadlib/addownload/c;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {p1, p0, v2, v1}, Lcom/ss/android/downloadlib/addownload/c;->a(Lcom/ss/android/downloadlib/addownload/e;ILcom/ss/android/download/api/download/DownloadModel;)V

    goto :goto_1

    .line 14
    :cond_4
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {p1, v2, v3, v1, v1}, Lcom/ss/android/downloadlib/d/a;->a(JZI)V

    :goto_1
    return v0
.end method

.method static synthetic d(Lcom/ss/android/downloadlib/addownload/e;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic e(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/download/api/model/DownloadShortInfo;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->r()Lcom/ss/android/download/api/model/DownloadShortInfo;

    move-result-object p0

    return-object p0
.end method

.method private e(Z)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/g/e;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "notification_opt_2"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/b;->a()Lcom/ss/android/socialbase/downloader/notification/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/notification/b;->f(I)V

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->f(Z)V

    return-void
.end method

.method static synthetic f(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/downloadlib/addownload/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    return-object p0
.end method

.method private f(Z)V
    .locals 13

    .line 3
    sget-object v0, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    const-string v1, "pBCD"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 4
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->p()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/b/f;->e(J)Lcom/ss/android/downloadlib/addownload/b/e;

    move-result-object v0

    .line 6
    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/e;->s:Z

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/e;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {p0, v3}, Lcom/ss/android/downloadlib/addownload/e;->d(Z)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 9
    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    if-eqz v0, :cond_c

    .line 10
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->isAutoDownloadOnCardShow()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 11
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/e;->a(ZZ)V

    goto/16 :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/e;->a(ZZ)V

    goto/16 :goto_1

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/b/e;->d:Lcom/ss/android/download/api/download/DownloadController;

    if-eqz v1, :cond_2

    .line 14
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadController;->enableShowComplianceDialog()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v1, :cond_2

    .line 15
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/b;->a()Lcom/ss/android/downloadlib/addownload/compliance/b;

    move-result-object v1

    iget-object v2, v0, Lcom/ss/android/downloadlib/addownload/b/e;->b:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/b;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/b;->a()Lcom/ss/android/downloadlib/addownload/compliance/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadlib/addownload/compliance/b;->a(Lcom/ss/android/downloadlib/addownload/b/e;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 17
    :cond_2
    invoke-virtual {p0, p1, v4}, Lcom/ss/android/downloadlib/addownload/e;->a(ZZ)V

    goto/16 :goto_1

    .line 18
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "pBCD continue download, status:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v1, :cond_4

    .line 20
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isNeedWifi()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setOnlyWifi(Z)V

    .line 21
    :cond_4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    .line 22
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    .line 23
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v2

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v5}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v2

    const/4 v12, -0x2

    if-eq v0, v12, :cond_a

    const/4 v5, -0x1

    if-ne v0, v5, :cond_5

    goto/16 :goto_0

    .line 24
    :cond_5
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/n;->a(I)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 25
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v5}, Lcom/ss/android/download/api/download/DownloadModel;->enablePause()Z

    move-result v5

    if-nez v5, :cond_6

    return-void

    .line 26
    :cond_6
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    invoke-virtual {v5, v4}, Lcom/ss/android/downloadlib/addownload/d;->a(Z)V

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/c/h;->a()Lcom/ss/android/downloadlib/c/h;

    move-result-object v5

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v6

    iget-wide v7, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v6, v7, v8}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/ss/android/downloadlib/c/h;->b(Lcom/ss/android/downloadad/api/a/b;)V

    .line 28
    invoke-static {v2}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/downloadad/api/a/a;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v5

    const-string v6, "cancel_pause_optimise_switch"

    invoke-virtual {v5, v6, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v5

    if-ne v5, v4, :cond_7

    move v3, v4

    :cond_7
    if-eqz v3, :cond_8

    .line 29
    new-instance v3, Lcom/ss/android/downloadlib/addownload/e$5;

    invoke-direct {v3, p0}, Lcom/ss/android/downloadlib/addownload/e$5;-><init>(Lcom/ss/android/downloadlib/addownload/e;)V

    .line 30
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/d;->a()Lcom/ss/android/downloadlib/addownload/d/d;

    move-result-object v4

    new-instance v11, Lcom/ss/android/downloadlib/addownload/e$6;

    move-object v5, v11

    move-object v6, p0

    move v7, v1

    move v8, p1

    move-object v9, v2

    move v10, v0

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/e$6;-><init>(Lcom/ss/android/downloadlib/addownload/e;IZLcom/ss/android/downloadad/api/a/b;I)V

    invoke-virtual {v4, v2, v0, v11, v3}, Lcom/ss/android/downloadlib/addownload/d/d;->a(Lcom/ss/android/downloadad/api/a/b;ILcom/ss/android/downloadlib/addownload/d/h;Lcom/ss/android/downloadlib/addownload/a/c;)V

    goto/16 :goto_1

    .line 31
    :cond_8
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/d/k;->a()Lcom/ss/android/downloadlib/addownload/d/k;

    move-result-object v3

    new-instance v4, Lcom/ss/android/downloadlib/addownload/e$7;

    move-object v5, v4

    move-object v6, p0

    move v7, v1

    move v8, p1

    move-object v9, v2

    move v10, v0

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/e$7;-><init>(Lcom/ss/android/downloadlib/addownload/e;IZLcom/ss/android/downloadad/api/a/b;I)V

    invoke-virtual {v3, v2, v0, v4}, Lcom/ss/android/downloadlib/addownload/d/k;->a(Lcom/ss/android/downloadad/api/a/b;ILcom/ss/android/downloadlib/addownload/d/h;)V

    goto/16 :goto_1

    .line 32
    :cond_9
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v3, p1}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 33
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-direct {p0, v1, v0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_1

    .line 34
    :cond_a
    :goto_0
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5, v6, p1}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    if-eqz v2, :cond_b

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/ss/android/downloadad/api/a/b;->h(J)V

    .line 36
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/ss/android/downloadad/api/a/b;->i(J)V

    .line 37
    :cond_b
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setDownloadFromReserveWifi(Z)V

    .line 38
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    new-instance v11, Lcom/ss/android/downloadlib/addownload/b/e;

    iget-wide v6, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v9

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v10

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Lcom/ss/android/downloadlib/addownload/b/e;-><init>(JLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    invoke-virtual {p1, v11}, Lcom/ss/android/downloadlib/addownload/d;->a(Lcom/ss/android/downloadlib/addownload/b/e;)V

    .line 39
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v7

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v9

    new-instance v11, Lcom/ss/android/downloadlib/addownload/e$3;

    invoke-direct {v11, p0, v1, v0}, Lcom/ss/android/downloadlib/addownload/e$3;-><init>(Lcom/ss/android/downloadlib/addownload/e;II)V

    move v6, v1

    invoke-virtual/range {v5 .. v11}, Lcom/ss/android/downloadlib/addownload/d;->a(IJJLcom/ss/android/downloadlib/addownload/e$a;)V

    if-ne v0, v12, :cond_c

    .line 40
    invoke-static {v2}, Lcom/ss/android/downloadlib/g/e;->a(Lcom/ss/android/downloadad/api/a/a;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "show_pause_continue_toast"

    invoke-virtual {p1, v0, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v4, :cond_c

    .line 41
    invoke-static {}, Lcom/ss/android/downloadlib/g;->a()Lcom/ss/android/downloadlib/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/g;->b()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/ss/android/downloadlib/addownload/e$4;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/addownload/e$4;-><init>(Lcom/ss/android/downloadlib/addownload/e;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_c
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return-object p0
.end method

.method private g(Z)V
    .locals 16

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    new-instance v8, Lcom/ss/android/downloadlib/addownload/b/e;

    iget-wide v3, v0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    iget-object v5, v0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct/range {p0 .. p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v6

    invoke-direct/range {p0 .. p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/ss/android/downloadlib/addownload/b/e;-><init>(JLcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    invoke-virtual {v1, v8}, Lcom/ss/android/downloadlib/addownload/d;->a(Lcom/ss/android/downloadlib/addownload/b/e;)V

    .line 3
    iget-object v9, v0, Lcom/ss/android/downloadlib/addownload/e;->d:Lcom/ss/android/downloadlib/addownload/d;

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    new-instance v15, Lcom/ss/android/downloadlib/addownload/e$9;

    move/from16 v1, p1

    invoke-direct {v15, v0, v1}, Lcom/ss/android/downloadlib/addownload/e$9;-><init>(Lcom/ss/android/downloadlib/addownload/e;Z)V

    invoke-virtual/range {v9 .. v15}, Lcom/ss/android/downloadlib/addownload/d;->a(IJJLcom/ss/android/downloadlib/addownload/e$a;)V

    return-void
.end method

.method static synthetic h(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/download/api/download/DownloadModel;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    return-object p0
.end method

.method private h(Z)V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/h;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 3
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadStart(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->j:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/h;->a(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)I

    move-result v0

    .line 5
    sget-object v1, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "beginDown id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz v0, :cond_3

    .line 6
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v2

    const-string v4, "fix_click_start"

    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p1, :cond_4

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/h;->a()V

    goto :goto_2

    .line 9
    :cond_3
    new-instance p1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$a;->a()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    const/4 v2, -0x1

    .line 10
    invoke-virtual {p1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 11
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/4 v6, 0x2

    const-string v7, "start download failed, id=0"

    invoke-direct {v2, v6, v7}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1, v4, v5, v2}, Lcom/ss/android/downloadlib/d/a;->a(JLcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const-string v2, "beginDown"

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/e/c;->b(Ljava/lang/String;)V

    .line 14
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/e;->c()Z

    move-result v2

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/addownload/h;->a(Z)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beginDown IC id:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v3}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 16
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->k()V

    :cond_5
    return-void
.end method

.method static synthetic i(Lcom/ss/android/downloadlib/addownload/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/downloadlib/addownload/e;->t:Z

    return p0
.end method

.method static synthetic j(Lcom/ss/android/downloadlib/addownload/e;)Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/e;->j:Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;

    return-object p0
.end method

.method static synthetic j()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->r:Ljava/lang/ref/SoftReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->r:Ljava/lang/ref/SoftReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/ss/android/download/api/config/OnItemClickListener;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v0, v1, v2, v3}, Lcom/ss/android/download/api/config/OnItemClickListener;->onItemClick(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->r:Ljava/lang/ref/SoftReference;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->c()Lcom/ss/android/download/api/config/c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->l()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 45
    .line 46
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ss/android/download/api/config/c;->a(Landroid/content/Context;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void
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

.method private l()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->e:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/content/Context;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
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

.method private m()Lcom/ss/android/download/api/download/DownloadEventConfig;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    if-nez v0, :cond_0

    new-instance v0, Lcom/ss/android/download/api/download/c$a;

    invoke-direct {v0}, Lcom/ss/android/download/api/download/c$a;-><init>()V

    invoke-virtual {v0}, Lcom/ss/android/download/api/download/c$a;->a()Lcom/ss/android/download/api/download/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private n()Lcom/ss/android/download/api/download/DownloadController;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->q:Lcom/ss/android/download/api/download/DownloadController;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/download/api/download/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/download/api/download/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->q:Lcom/ss/android/download/api/download/DownloadController;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->q:Lcom/ss/android/download/api/download/DownloadController;

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

.method private o()V
    .locals 4

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "pICD"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lcom/ss/android/downloadlib/addownload/h;->d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-string v1, "pICD BC"

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/e;->f(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v1, "pICD IC"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->k()V

    .line 35
    .line 36
    .line 37
    :goto_0
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

.method private p()Z
    .locals 8

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "fix_click_start"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, -0x3

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return v3

    .line 21
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    const-wide/16 v6, 0x0

    .line 34
    .line 35
    cmp-long v0, v4, v6

    .line 36
    .line 37
    if-gtz v0, :cond_1

    .line 38
    .line 39
    return v3

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v2, -0x4

    .line 55
    if-ne v0, v2, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v0, v2, v4}, Lcom/ss/android/socialbase/downloader/i/f;->a(ILjava/lang/String;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    return v3

    .line 83
    :catch_0
    :cond_3
    return v1

    .line 84
    :cond_4
    :goto_0
    return v3

    .line 85
    :cond_5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 86
    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    return v3

    .line 90
    :cond_6
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eq v0, v2, :cond_7

    .line 95
    .line 96
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 105
    .line 106
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v0, v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->canResume(I)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    return v3

    .line 117
    :cond_7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_8

    .line 124
    .line 125
    return v3

    .line 126
    :cond_8
    return v1
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

.method private q()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/AsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/addownload/e$c;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v2}, Lcom/ss/android/downloadlib/addownload/e$c;-><init>(Lcom/ss/android/downloadlib/addownload/e;Lcom/ss/android/downloadlib/addownload/e$1;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->m:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    new-array v4, v4, [Ljava/lang/String;

    .line 41
    .line 42
    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 43
    .line 44
    invoke-interface {v5}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    aput-object v5, v4, v2

    .line 49
    .line 50
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 51
    .line 52
    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    aput-object v2, v4, v1

    .line 57
    .line 58
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->m:Ljava/lang/String;

    .line 59
    .line 60
    aput-object v1, v4, v3

    .line 61
    .line 62
    invoke-static {v0, v4}, Lcom/ss/android/downloadlib/g/b;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    .line 67
    .line 68
    new-array v3, v3, [Ljava/lang/String;

    .line 69
    .line 70
    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 71
    .line 72
    invoke-interface {v4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    aput-object v4, v3, v2

    .line 77
    .line 78
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 79
    .line 80
    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    aput-object v2, v3, v1

    .line 85
    .line 86
    invoke-static {v0, v3}, Lcom/ss/android/downloadlib/g/b;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return-void
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

.method private r()Lcom/ss/android/download/api/model/DownloadShortInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->g:Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/download/api/model/DownloadShortInfo;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->g:Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->g:Lcom/ss/android/download/api/model/DownloadShortInfo;

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


# virtual methods
.method public a(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 3

    if-eqz p2, :cond_2

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "back_use_softref_listener"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "use_weakref_listener"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public a(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->e:Ljava/lang/ref/WeakReference;

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/k;->b(Landroid/content/Context;)V

    return-object p0
.end method

.method public a(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 3

    .line 28
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->q:Lcom/ss/android/download/api/download/DownloadController;

    .line 29
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/g/e;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "force_auto_open"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 30
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadController;->setLinkMode(I)V

    .line 31
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "fix_show_dialog"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 32
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getExtra()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "subprocess"

    .line 33
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_1

    .line 34
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadController;->setEnableNewActivity(Z)V

    .line 35
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/b/f;->a(JLcom/ss/android/download/api/download/DownloadController;)V

    return-object p0
.end method

.method public a(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 3

    .line 36
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    .line 37
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadEventConfig;->getDownloadScene()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/addownload/e;->s:Z

    .line 38
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/b/f;->a(JLcom/ss/android/download/api/download/DownloadEventConfig;)V

    return-object p0
.end method

.method public a(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 5

    if-eqz p1, :cond_3

    .line 12
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    .line 13
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-lez v0, :cond_0

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v0

    const-string v1, "setDownloadModel ad error"

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v0, :cond_2

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "setDownloadModel id=0"

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/e/c;->a(ZLjava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "fix_model_id"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    move-object v0, p1

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setId(J)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 19
    :cond_2
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/download/api/download/DownloadModel;)V

    .line 20
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    .line 21
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 22
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/i;->a(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    check-cast p1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    const-wide/16 v0, 0x3

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setExtraValue(J)V

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object p1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {p1, v2, v3}, Lcom/ss/android/downloadlib/addownload/b/f;->d(J)Lcom/ss/android/downloadad/api/a/b;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 25
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->l()J

    move-result-wide v2

    cmp-long v2, v2, v0

    if-eqz v2, :cond_3

    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadad/api/a/b;->e(J)V

    .line 27
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/i;->a()Lcom/ss/android/downloadlib/addownload/b/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/i;->a(Lcom/ss/android/downloadad/api/a/b;)V

    :cond_3
    return-object p0
.end method

.method public a(J)Lcom/ss/android/downloadlib/addownload/g;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    .line 73
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/b/f;->a(J)Lcom/ss/android/download/api/download/DownloadModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 74
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 75
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    .line 76
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/h;->a(J)V

    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "setModelId"

    invoke-virtual {p1, p2, v0}, Lcom/ss/android/downloadlib/e/c;->a(ZLjava/lang/String;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public a(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    goto :goto_0

    .line 108
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    :goto_0
    return-object p0
.end method

.method public a(Lcom/ss/android/download/api/config/OnItemClickListener;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->r:Ljava/lang/ref/SoftReference;

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->r:Ljava/lang/ref/SoftReference;

    :goto_0
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 1

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->m:Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method public a()V
    .locals 5

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/e;->k:Z

    .line 42
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->m()Lcom/ss/android/download/api/download/DownloadEventConfig;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/b/f;->a(JLcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v1

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/b/f;->a(JLcom/ss/android/download/api/download/DownloadController;)V

    .line 44
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/h;->a(J)V

    .line 45
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->q()V

    .line 46
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "enable_empty_listener"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    const/high16 v1, -0x80000000

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/ss/android/download/api/config/a;

    invoke-direct {v0}, Lcom/ss/android/download/api/config/a;-><init>()V

    invoke-virtual {p0, v1, v0}, Lcom/ss/android/downloadlib/addownload/e;->a(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/e;

    :cond_0
    return-void
.end method

.method public a(Landroid/os/Message;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 78
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/e;->k:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 81
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->r()Lcom/ss/android/download/api/model/DownloadShortInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-virtual {v0, p1, v1, v2}, Lcom/ss/android/downloadlib/addownload/h;->a(Landroid/os/Message;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 66
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/appdownloader/d;->b()Lcom/ss/android/socialbase/appdownloader/c/d;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/appdownloader/c/d;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 68
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->cancel(IZ)V

    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "android.ss.intent.action.DOWNLOAD_DELETE"

    .line 70
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    const-string v1, "extra_click_download_ids"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 72
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_2
    :goto_0
    return-void
.end method

.method public a(ZZ)V
    .locals 3

    if-eqz p1, :cond_0

    .line 82
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    .line 83
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/g/m;->a()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 84
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 85
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p1

    if-nez p1, :cond_2

    .line 86
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    goto :goto_0

    :cond_1
    const-string p1, "android.permission.READ_MEDIA_IMAGES"

    .line 87
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "android.permission.READ_MEDIA_AUDIO"

    .line 88
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "android.permission.READ_MEDIA_VIDEO"

    .line 89
    invoke-static {p1}, Lcom/ss/android/downloadlib/g/j;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 90
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->n()Lcom/ss/android/download/api/download/DownloadController;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->enableNewActivity()Z

    move-result p1

    if-nez p1, :cond_2

    .line 91
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/download/DownloadModel;->setFilePath(Ljava/lang/String;)Lcom/ss/android/download/api/download/DownloadModel;

    .line 92
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/g/e;->c(Lcom/ss/android/download/api/download/DownloadModel;)I

    move-result p1

    if-nez p1, :cond_3

    .line 93
    sget-object p1, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    const-string v0, "pBCD not start"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 94
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    new-instance v0, Lcom/ss/android/downloadlib/addownload/e$8;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/addownload/e$8;-><init>(Lcom/ss/android/downloadlib/addownload/e;Z)V

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/download/api/config/t;)V

    goto :goto_1

    .line 95
    :cond_3
    invoke-direct {p0, p2}, Lcom/ss/android/downloadlib/addownload/e;->g(Z)V

    :goto_1
    return-void
.end method

.method public a(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 49
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :goto_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    .line 52
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/e;->k:Z

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/ss/android/downloadlib/addownload/e;->l:J

    .line 54
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p1, :cond_1

    .line 55
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->removeTaskMainListener(I)V

    .line 56
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/os/AsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object p1

    sget-object v0, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq p1, v0, :cond_2

    .line 57
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->i:Lcom/ss/android/downloadlib/addownload/e$c;

    invoke-virtual {p1, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 58
    :cond_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/h;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 59
    sget-object p1, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUnbind removeCallbacksAndMessages, downloadUrl:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v2, :cond_3

    const-string v2, ""

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 60
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->b:Lcom/ss/android/downloadlib/g/n;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 61
    iput-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->g:Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 62
    iput-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    return v1

    .line 63
    :cond_4
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    const/high16 v1, -0x80000000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 64
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/h;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_5
    return v0
.end method

.method public synthetic b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/downloadlib/addownload/e;->a(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->a(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/e;

    move-result-object p1

    return-object p1
.end method

.method public b(I)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "error actionType"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/h;->a(J)V

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v2

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/downloadlib/addownload/b/f;->e(J)Lcom/ss/android/downloadlib/addownload/b/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/downloadlib/addownload/b/e;->y()Z

    move-result v2

    if-nez v2, :cond_2

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v2

    const-string v3, "handleDownload ModelBox !isStrictValid"

    invoke-virtual {v2, v3}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/String;)V

    .line 13
    :cond_2
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v2, p1, v3}, Lcom/ss/android/downloadlib/addownload/h;->a(ILcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a()Lcom/ss/android/downloadlib/addownload/compliance/f;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/h;->a:Lcom/ss/android/downloadlib/addownload/b/e;

    new-instance v2, Lcom/ss/android/downloadlib/addownload/e$1;

    invoke-direct {v2, p0, p1}, Lcom/ss/android/downloadlib/addownload/e$1;-><init>(Lcom/ss/android/downloadlib/addownload/e;I)V

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/f;->a(Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadlib/addownload/compliance/h;)V

    return-void

    .line 15
    :cond_3
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/e;->c:Lcom/ss/android/downloadlib/addownload/h;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->l()Landroid/content/Context;

    move-result-object v3

    iget-boolean v4, p0, Lcom/ss/android/downloadlib/addownload/e;->s:Z

    invoke-virtual {v2, v3, p1, v4}, Lcom/ss/android/downloadlib/addownload/h;->a(Landroid/content/Context;IZ)Z

    move-result v2

    if-nez v2, :cond_6

    .line 16
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->c(I)Z

    move-result v2

    const/4 v3, 0x0

    const-string v4, "handleDownload id:"

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_4

    goto :goto_1

    :cond_4
    if-nez v2, :cond_6

    .line 17
    sget-object p1, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",pBC:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 18
    invoke-virtual {p0, v1}, Lcom/ss/android/downloadlib/addownload/e;->b(Z)V

    goto :goto_1

    :cond_5
    if-nez v2, :cond_6

    .line 19
    sget-object p1, Lcom/ss/android/downloadlib/addownload/e;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",pIC:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Lcom/ss/android/downloadlib/g/k;->a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 20
    invoke-virtual {p0, v1}, Lcom/ss/android/downloadlib/addownload/e;->c(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/e;->e(Z)V

    return-void
.end method

.method public b()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/e;->k:Z

    return v0
.end method

.method public c(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 15
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/d/a;->a(JI)V

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->o()V

    return-void
.end method

.method public c()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/e;->l:J

    return-wide v0
.end method

.method public d(Z)Z
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    const/4 v1, 0x0

    const-string v2, "mDownloadButtonClickListener has recycled"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 4
    :try_start_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-interface {p1, v0}, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;->handleComplianceDialog(Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    invoke-virtual {p1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-interface {p1}, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;->handleMarketFailedComplianceDialog()V

    :goto_0
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 7
    :catch_0
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/e/c;->b(Ljava/lang/String;)V

    return v1

    .line 8
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/e/c;->b(Ljava/lang/String;)V

    return v1
.end method

.method public e()Z
    .locals 5

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "quick_app_enable_switch"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/d;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    .line 4
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/download/api/model/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 5
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/c;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/e;->l()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getQuickAppModel()Lcom/ss/android/download/api/model/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ss/android/download/api/model/d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/g/m;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method public f()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->b:Lcom/ss/android/downloadlib/g/n;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/e$2;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/e$2;-><init>(Lcom/ss/android/downloadlib/addownload/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->f:Ljava/util/Map;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/h;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 6
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->h:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_2

    const/4 v1, -0x4

    .line 8
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    :cond_2
    return-void
.end method

.method public h()V
    .locals 3

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/e;->n:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/b/f;->f(J)V

    return-void
.end method

.method public i()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/e;->u:Ljava/lang/ref/SoftReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/e;->o:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/download/api/config/IDownloadButtonClickListener;

    invoke-static {v1, v0}, Lcom/ss/android/downloadlib/addownload/i;->a(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Z

    move-result v0

    return v0
.end method
