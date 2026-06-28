.class public Lcom/ss/android/downloadlib/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/ss/android/downloadlib/g;


# instance fields
.field private final b:Landroid/os/Handler;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/downloadlib/addownload/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ss/android/downloadlib/addownload/g;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/ss/android/downloadlib/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    new-instance v0, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    .line 35
    .line 36
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

.method public static a()Lcom/ss/android/downloadlib/g;
    .locals 2

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/g;->a:Lcom/ss/android/downloadlib/g;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/ss/android/downloadlib/g;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/g;->a:Lcom/ss/android/downloadlib/g;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/g;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/g;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/g;->a:Lcom/ss/android/downloadlib/g;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/g;->a:Lcom/ss/android/downloadlib/g;

    return-object v0
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/g;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method private declared-synchronized a(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 42
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 43
    invoke-direct/range {p0 .. p5}, Lcom/ss/android/downloadlib/g;->b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/addownload/g;

    .line 45
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/g;->b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 46
    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 47
    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 48
    invoke-interface {p1, p5}, Lcom/ss/android/downloadlib/addownload/g;->a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 49
    invoke-interface {p1}, Lcom/ss/android/downloadlib/addownload/g;->a()V

    .line 50
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p1, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object p1

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p5, p2}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/g;->c(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/addownload/g;

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/g;->b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 5
    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 6
    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Lcom/ss/android/downloadlib/addownload/g;->a()V

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V
    .locals 1

    if-nez p4, :cond_0

    return-void

    .line 10
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/addownload/e;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/e;-><init>()V

    .line 11
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/g;->b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 12
    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 13
    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 14
    invoke-interface {p1, p5}, Lcom/ss/android/downloadlib/addownload/g;->a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 15
    invoke-interface {p1}, Lcom/ss/android/downloadlib/addownload/g;->a()V

    .line 16
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p1, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object p1

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p5, p2}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c()V
    .locals 6

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 8
    iget-wide v2, p0, Lcom/ss/android/downloadlib/g;->f:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x493e0

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    return-void

    .line 9
    :cond_0
    iput-wide v0, p0, Lcom/ss/android/downloadlib/g;->f:J

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    invoke-direct {p0}, Lcom/ss/android/downloadlib/g;->d()V

    :cond_1
    return-void
.end method

.method private c(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 1

    if-nez p4, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/addownload/e;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/e;-><init>()V

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/g;->b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 3
    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 4
    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 5
    invoke-interface {p1}, Lcom/ss/android/downloadlib/addownload/g;->a()V

    .line 6
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private d()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lcom/ss/android/downloadlib/addownload/g;

    .line 27
    .line 28
    invoke-interface {v4}, Lcom/ss/android/downloadlib/addownload/g;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {v4}, Lcom/ss/android/downloadlib/addownload/g;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    sub-long v5, v0, v5

    .line 40
    .line 41
    const-wide/32 v7, 0x493e0

    .line 42
    .line 43
    .line 44
    cmp-long v5, v5, v7

    .line 45
    .line 46
    if-lez v5, :cond_0

    .line 47
    .line 48
    invoke-interface {v4}, Lcom/ss/android/downloadlib/addownload/g;->h()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v0, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    :cond_3
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


# virtual methods
.method public a(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/e;
    .locals 4

    .line 36
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 37
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "filter_download_url_key"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v3, v2

    :cond_1
    if-eqz v3, :cond_2

    .line 38
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    goto :goto_0

    .line 39
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    .line 40
    :goto_0
    instance-of v0, p1, Lcom/ss/android/downloadlib/addownload/e;

    if-eqz v0, :cond_3

    .line 41
    check-cast p1, Lcom/ss/android/downloadlib/addownload/e;

    return-object p1

    :cond_3
    :goto_1
    return-object v1
.end method

.method public a(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 9

    if-eqz p4, :cond_c

    .line 8
    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 9
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "filter_download_url_key"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move v2, v1

    .line 10
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v2, :cond_2

    .line 11
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/addownload/g;

    .line 13
    instance-of v1, p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v1, :cond_3

    move-object v1, p4

    check-cast v1, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    invoke-virtual {v1, v8}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setTaskKey(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/addownload/g;

    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 16
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/g;->b(Landroid/content/Context;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->b(ILcom/ss/android/download/api/download/DownloadStatusChangeListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ss/android/downloadlib/addownload/g;->a()V

    return-void

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    if-eqz v2, :cond_7

    .line 18
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 19
    invoke-direct/range {v3 .. v8}, Lcom/ss/android/downloadlib/g;->a(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 20
    :cond_5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/ss/android/downloadlib/addownload/f;->a(Lcom/ss/android/download/api/download/DownloadModel;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 22
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/g;->b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    goto/16 :goto_1

    :cond_6
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, v0

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/ss/android/downloadlib/g;->a(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V

    .line 24
    instance-of p1, p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz p1, :cond_c

    check-cast p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {p4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 25
    invoke-virtual {p4, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setTaskKey(Ljava/lang/String;)V

    goto :goto_1

    .line 26
    :cond_7
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/g;->b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    goto :goto_1

    :cond_8
    if-eqz v2, :cond_b

    .line 27
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 28
    invoke-direct/range {v3 .. v8}, Lcom/ss/android/downloadlib/g;->b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V

    goto :goto_1

    .line 29
    :cond_9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/ss/android/downloadlib/addownload/f;->a(Lcom/ss/android/download/api/download/DownloadModel;)Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/g;->c(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    goto :goto_1

    :cond_a
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, v0

    .line 32
    invoke-direct/range {v1 .. v6}, Lcom/ss/android/downloadlib/g;->b(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;Ljava/lang/String;)V

    .line 33
    instance-of p1, p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz p1, :cond_c

    check-cast p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {p4}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 34
    invoke-virtual {p4, v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setTaskKey(Ljava/lang/String;)V

    goto :goto_1

    .line 35
    :cond_b
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/g;->c(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    :cond_c
    :goto_1
    return-void
.end method

.method public a(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;)V
    .locals 2
    .param p2    # Lcom/ss/android/download/api/download/DownloadController;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ss/android/download/api/download/DownloadEventConfig;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 90
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ss/android/downloadlib/g$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ss/android/downloadlib/g$1;-><init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Lcom/ss/android/download/api/download/a/a;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 87
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    const-string v1, "fix_listener_oom"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ss/android/downloadlib/g$5;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/g$5;-><init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ss/android/downloadlib/g$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ss/android/downloadlib/g$2;-><init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ss/android/downloadlib/g$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/g$3;-><init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 3

    .line 53
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 54
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "filter_download_url_key"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move v2, v1

    .line 55
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_2

    .line 56
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 57
    iget-object v1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadlib/addownload/g;

    goto :goto_0

    .line 58
    :cond_2
    iget-object v1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadlib/addownload/g;

    :goto_0
    if-eqz v1, :cond_5

    .line 59
    invoke-interface {v1, p2}, Lcom/ss/android/downloadlib/addownload/g;->a(I)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 60
    iget-object p2, p0, Lcom/ss/android/downloadlib/g;->c:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_3

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 62
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ss/android/downloadlib/addownload/f;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 64
    :cond_3
    iget-object p2, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/g;->c()V

    :cond_5
    return-void
.end method

.method public a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 73
    invoke-virtual/range {v0 .. v8}, Lcom/ss/android/downloadlib/g;->a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    return-void
.end method

.method public a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 9

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v8, p7

    .line 74
    invoke-virtual/range {v0 .. v8}, Lcom/ss/android/downloadlib/g;->a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    return-void
.end method

.method public a(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 3

    .line 75
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 76
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "filter_download_url_key"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move v2, v1

    .line 77
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_2

    .line 78
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 79
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    :goto_0
    if-eqz p1, :cond_3

    .line 81
    invoke-interface {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/g;->a(J)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 82
    invoke-interface {p1, p5}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadEventConfig;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 83
    invoke-interface {p1, p6}, Lcom/ss/android/downloadlib/addownload/g;->b(Lcom/ss/android/download/api/download/DownloadController;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 84
    invoke-interface {p1, p7}, Lcom/ss/android/downloadlib/addownload/g;->a(Lcom/ss/android/download/api/config/OnItemClickListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 85
    invoke-interface {p1, p8}, Lcom/ss/android/downloadlib/addownload/g;->a(Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)Lcom/ss/android/downloadlib/addownload/g;

    move-result-object p1

    .line 86
    invoke-interface {p1, p4}, Lcom/ss/android/downloadlib/addownload/g;->b(I)V

    :cond_3
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3

    .line 66
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 67
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "filter_download_url_key"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move v2, v1

    .line 68
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/f;->a()Lcom/ss/android/downloadlib/addownload/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_2

    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 70
    iget-object p1, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/g;

    :goto_0
    if-eqz p1, :cond_3

    .line 72
    invoke-interface {p1, p2}, Lcom/ss/android/downloadlib/addownload/g;->a(Z)V

    :cond_3
    return-void
.end method

.method public b()Landroid/os/Handler;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    return-object v0
.end method

.method public b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/ss/android/downloadlib/g;->b:Landroid/os/Handler;

    new-instance v1, Lcom/ss/android/downloadlib/g$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/g$4;-><init>(Lcom/ss/android/downloadlib/g;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
