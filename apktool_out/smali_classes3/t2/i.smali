.class public Lt2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lt2/i;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yuanqi/group/home/models/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt2/i;

    invoke-direct {v0}, Lt2/i;-><init>()V

    sput-object v0, Lt2/i;->b:Lt2/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt2/i;->a:Ljava/util/Map;

    .line 10
    .line 11
    return-void
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

.method public static synthetic a(Lt2/i;Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;
    .locals 0

    invoke-direct {p0, p1}, Lt2/i;->e(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lt2/i;
    .locals 1

    sget-object v0, Lt2/i;->b:Lt2/i;

    return-object v0
.end method

.method private synthetic e(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lt2/i;->b(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;

    move-result-object p1

    return-object p1
.end method

.method private f(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/client/core/VirtualCore;->getInstalledAppInfo(Ljava/lang/String;I)Lcom/lody/virtual/remote/InstalledAppInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/yuanqi/group/home/models/i;

    .line 13
    .line 14
    sget-object v2, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v1, v2, v0}, Lcom/yuanqi/group/home/models/i;-><init>(Landroid/content/Context;Lcom/lody/virtual/remote/InstalledAppInfo;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lt2/i;->a:Ljava/util/Map;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Lt2/i;->a:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p1

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return-object p1
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


# virtual methods
.method public b(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lt2/i;->a:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lt2/i;->a:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/yuanqi/group/home/models/i;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lt2/i;->f(Ljava/lang/String;)Lcom/yuanqi/group/home/models/i;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public c(Ljava/lang/String;Lq2/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq2/c<",
            "Lcom/yuanqi/group/home/models/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/yuanqi/group/abs/ui/b;->a()Lorg/jdeferred/android/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lt2/g;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lt2/g;-><init>(Lt2/i;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lorg/jdeferred/impl/a;->h(Ljava/util/concurrent/Callable;)Lorg/jdeferred/p;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lt2/h;

    .line 18
    .line 19
    invoke-direct {v0, p2}, Lt2/h;-><init>(Lq2/c;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lorg/jdeferred/p;->d(Lorg/jdeferred/g;)Lorg/jdeferred/p;

    .line 23
    .line 24
    .line 25
    return-void
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
