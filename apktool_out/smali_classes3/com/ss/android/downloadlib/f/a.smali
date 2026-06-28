.class public Lcom/ss/android/downloadlib/f/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/c/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/f/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/f/a;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V

    return-void
.end method

.method private b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V
    .locals 2
    .param p2    # Lcom/ss/android/downloadlib/guide/install/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/ss/android/downloadlib/b/f;->a(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, Lcom/ss/android/downloadlib/b/f;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/f/a$3;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/f/a$3;-><init>(Lcom/ss/android/downloadlib/f/a;Lcom/ss/android/downloadlib/guide/install/a;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/ss/android/downloadlib/b/c;->a(Lcom/ss/android/downloadad/api/a/b;Lcom/ss/android/downloadlib/guide/install/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p2}, Lcom/ss/android/downloadlib/guide/install/a;->a()V

    .line 32
    .line 33
    .line 34
    return-void
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


# virtual methods
.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V
    .locals 2
    .param p2    # Lcom/ss/android/downloadlib/guide/install/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {v0}, Lcom/ss/android/downloadlib/b/i;->a(Lcom/ss/android/downloadad/api/a/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/f/a$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/f/a$2;-><init>(Lcom/ss/android/downloadlib/f/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->a(Lcom/ss/android/downloadad/api/a/a;Lcom/ss/android/downloadlib/guide/install/a;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/f/a;->b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V

    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/c/i;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/f/a$1;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/f/a$1;-><init>(Lcom/ss/android/downloadlib/f/a;Lcom/ss/android/socialbase/appdownloader/c/i;)V

    invoke-virtual {p0, p1, v0}, Lcom/ss/android/downloadlib/f/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/a;)V

    return-void
.end method
