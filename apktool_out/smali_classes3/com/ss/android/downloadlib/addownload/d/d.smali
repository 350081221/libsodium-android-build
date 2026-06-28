.class public Lcom/ss/android/downloadlib/addownload/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/ss/android/downloadlib/addownload/d/d;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/downloadlib/addownload/d/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

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
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/d/d;->b:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Lcom/ss/android/downloadlib/addownload/d/e;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/d/e;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/d/d;->b:Ljava/util/List;

    .line 20
    .line 21
    new-instance v1, Lcom/ss/android/downloadlib/addownload/d/b;

    .line 22
    .line 23
    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/d/b;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/d/d;->b:Ljava/util/List;

    .line 30
    .line 31
    new-instance v1, Lcom/ss/android/downloadlib/addownload/d/c;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/d/c;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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

.method public static a()Lcom/ss/android/downloadlib/addownload/d/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/d/d;->a:Lcom/ss/android/downloadlib/addownload/d/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/downloadlib/addownload/d/k;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/addownload/d/d;->a:Lcom/ss/android/downloadlib/addownload/d/d;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/downloadlib/addownload/d/d;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/d/d;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/addownload/d/d;->a:Lcom/ss/android/downloadlib/addownload/d/d;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/d/d;->a:Lcom/ss/android/downloadlib/addownload/d/d;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/ss/android/downloadad/api/a/b;ILcom/ss/android/downloadlib/addownload/d/h;Lcom/ss/android/downloadlib/addownload/a/c;)V
    .locals 4

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/d/d;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 9
    :cond_0
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/d/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->af()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/i;->a(Landroid/content/Context;)Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/i;->b(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_3

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/a/b;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :cond_3
    if-eqz v0, :cond_8

    const-string v1, "application/vnd.android.package-archive"

    .line 14
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 15
    :cond_4
    new-instance v0, Lcom/ss/android/downloadlib/addownload/d/j;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/d/j;-><init>()V

    .line 16
    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/d/j;->a(Lcom/ss/android/downloadad/api/a/b;ILcom/ss/android/downloadlib/addownload/d/h;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/d/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadlib/addownload/d/g;

    .line 18
    invoke-interface {v1, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/addownload/d/g;->a(Lcom/ss/android/downloadad/api/a/b;ILcom/ss/android/downloadlib/addownload/d/h;Lcom/ss/android/downloadlib/addownload/a/c;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-void

    .line 19
    :cond_7
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/d/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    return-void

    .line 20
    :cond_8
    :goto_1
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/d/h;->a(Lcom/ss/android/downloadad/api/a/b;)V

    return-void
.end method
