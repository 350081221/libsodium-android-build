.class public Lcom/ss/android/socialbase/downloader/downloader/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/downloader/c$a;
    }
.end annotation


# static fields
.field private static volatile A:Lcom/ss/android/socialbase/downloader/downloader/q;

.field private static volatile B:Lcom/ss/android/socialbase/downloader/d/b;

.field private static volatile C:Lcom/ss/android/socialbase/downloader/depend/aa;

.field private static volatile D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ak;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile E:Z

.field private static volatile F:Lokhttp3/OkHttpClient;

.field private static volatile G:Lcom/ss/android/socialbase/downloader/network/f;

.field private static volatile H:Lcom/ss/android/socialbase/downloader/network/f;

.field private static volatile I:Lcom/ss/android/socialbase/downloader/downloader/u;

.field private static final J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation
.end field

.field private static K:Z

.field private static L:I

.field private static final M:I

.field private static final N:I

.field private static final O:I

.field private static final P:I

.field private static Q:I

.field private static R:Z

.field private static final S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/k;",
            ">;"
        }
    .end annotation
.end field

.field private static final T:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ab;",
            ">;"
        }
    .end annotation
.end field

.field private static U:I

.field private static V:Z

.field private static W:Z

.field private static X:Lcom/ss/android/socialbase/downloader/downloader/r;

.field private static Y:Lcom/ss/android/socialbase/downloader/d/c;

.field private static volatile Z:Z

.field private static volatile a:Landroid/content/Context;

.field private static volatile b:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private static volatile c:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private static volatile d:Lcom/ss/android/socialbase/downloader/downloader/h;

.field private static volatile e:Lcom/ss/android/socialbase/downloader/depend/af;

.field private static volatile f:Lcom/ss/android/socialbase/downloader/impls/a;

.field private static volatile g:Lcom/ss/android/socialbase/downloader/downloader/o;

.field private static volatile h:Lcom/ss/android/socialbase/downloader/downloader/o;

.field private static volatile i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

.field private static volatile j:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

.field private static volatile k:Lcom/ss/android/socialbase/downloader/network/h;

.field private static volatile l:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

.field private static volatile m:Lcom/ss/android/socialbase/downloader/network/h;

.field private static volatile n:Lcom/ss/android/socialbase/downloader/downloader/l;

.field private static volatile o:Ljava/util/concurrent/ExecutorService;

.field private static volatile p:Ljava/util/concurrent/ExecutorService;

.field private static volatile q:Ljava/util/concurrent/ExecutorService;

.field private static volatile r:Ljava/util/concurrent/ExecutorService;

.field private static volatile s:Ljava/util/concurrent/ExecutorService;

.field private static volatile t:Ljava/util/concurrent/ExecutorService;

.field private static volatile u:Ljava/util/concurrent/ExecutorService;

.field private static volatile v:Ljava/util/concurrent/ExecutorService;

.field private static volatile w:Ljava/util/concurrent/ScheduledExecutorService;

.field private static volatile x:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private static volatile y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

.field private static volatile z:Lcom/ss/android/socialbase/downloader/downloader/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->D:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->F:Lokhttp3/OkHttpClient;

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->J:Ljava/util/List;

    .line 20
    .line 21
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->K:Z

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    add-int/2addr v1, v2

    .line 33
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/c;->M:I

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Runtime;->availableProcessors()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    mul-int/lit8 v3, v3, 0x2

    .line 44
    .line 45
    add-int/2addr v3, v2

    .line 46
    sput v3, Lcom/ss/android/socialbase/downloader/downloader/c;->N:I

    .line 47
    .line 48
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/c;->O:I

    .line 49
    .line 50
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/c;->P:I

    .line 51
    .line 52
    const/16 v1, 0x2000

    .line 53
    .line 54
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/c;->Q:I

    .line 55
    .line 56
    new-instance v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->S:Ljava/util/List;

    .line 62
    .line 63
    new-instance v1, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->T:Ljava/util/List;

    .line 69
    .line 70
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/c;->V:Z

    .line 71
    .line 72
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->W:Z

    .line 73
    .line 74
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Z:Z

    .line 75
    .line 76
    return-void
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

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()Lcom/ss/android/socialbase/downloader/downloader/o;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/c$a;->a()Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 19
    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    goto :goto_0

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
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 26
    .line 27
    return-object v0
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

.method public static B()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->J:Ljava/util/List;

    return-object v0
.end method

.method public static C()Lcom/ss/android/socialbase/downloader/downloader/k;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/i;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/i;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

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

.method public static D()Lcom/ss/android/socialbase/downloader/impls/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/e;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/e;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

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

.method public static E()I
    .locals 1

    sget v0, Lcom/ss/android/socialbase/downloader/downloader/c;->U:I

    return v0
.end method

.method public static F()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->C:Lcom/ss/android/socialbase/downloader/depend/aa;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->C:Lcom/ss/android/socialbase/downloader/depend/aa;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/aa;->a()Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->C:Lcom/ss/android/socialbase/downloader/depend/aa;

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/aa;->a()Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->i:Lorg/json/JSONObject;

    .line 22
    .line 23
    return-object v0
.end method

.method public static G()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->c:Ljava/lang/String;

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
    const-string v0, "oppo"

    .line 10
    .line 11
    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->c:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/e;->b:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
.end method

.method public static H()Z
    .locals 1

    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->V:Z

    return v0
.end method

.method public static declared-synchronized I()I
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Lcom/ss/android/socialbase/downloader/downloader/c;->Q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static J()Lcom/ss/android/socialbase/downloader/downloader/h;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/c;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/c;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

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

.method public static K()Lcom/ss/android/socialbase/downloader/depend/af;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->e:Lcom/ss/android/socialbase/downloader/depend/af;

    return-object v0
.end method

.method public static L()Lcom/ss/android/socialbase/downloader/downloader/g;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/b;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/b;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

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

.method public static M()Lcom/ss/android/socialbase/downloader/downloader/s;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/j;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/j;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

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

.method public static N()Lcom/ss/android/socialbase/downloader/downloader/u;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/u$a;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/u$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

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

.method public static declared-synchronized O()Landroid/content/Context;
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static declared-synchronized P()Z
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->R:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static Q()Lcom/ss/android/socialbase/downloader/d/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Y:Lcom/ss/android/socialbase/downloader/d/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/c$3;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/downloader/c$3;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Y:Lcom/ss/android/socialbase/downloader/d/c;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Y:Lcom/ss/android/socialbase/downloader/d/c;

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

.method public static R()Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->X:Lcom/ss/android/socialbase/downloader/downloader/r;

    return-object v0
.end method

.method public static S()Z
    .locals 1

    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Z:Z

    return v0
.end method

.method public static T()Z
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "supportMultiProc::="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "wjd"

    .line 28
    .line 29
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v2, v3

    .line 38
    :goto_1
    return v2
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

.method public static U()Lcom/ss/android/socialbase/downloader/downloader/c$a;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    return-object v0
.end method

.method private static V()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->K:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    .line 28
    .line 29
    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/c;->y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->K:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void
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

.method public static a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 123
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    .line 124
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 125
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->C()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 126
    :cond_0
    invoke-interface {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/g;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 85
    invoke-static {p0, p1, v0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/g;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/g;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 86
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(I)[I

    move-result-object p2

    .line 87
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v4, p2, v2

    .line 88
    :try_start_0
    invoke-static {p0, p1, v4, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/g;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    return-object v4

    :catch_0
    move-exception v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    return-object v1

    .line 89
    :cond_2
    throw v3
.end method

.method private static a(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/io/IOException;
        }
    .end annotation

    move v7, p4

    const/4 v0, 0x1

    if-ne v7, v0, :cond_0

    .line 78
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->d()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->h()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    const/4 v1, 0x0

    const/4 v8, 0x0

    const-wide/16 v2, 0x0

    if-eqz p5, :cond_1

    .line 79
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v5, p1

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v5, p1

    goto :goto_2

    :cond_1
    :goto_1
    move v4, p0

    move-object v5, p1

    move-object v6, p3

    .line 80
    :try_start_1
    invoke-interface {v0, p0, p1, p3}, Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;->downloadWithConnection(ILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p5, :cond_2

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v2

    const-string v6, "get"

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, v9

    move v7, p4

    move-object/from16 v9, p6

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    :goto_2
    move-object v4, v0

    .line 82
    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v0

    move-object v8, v4

    :goto_3
    if-eqz p5, :cond_3

    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v2

    const-string v6, "get"

    move-object v2, p1

    move-object v3, p2

    move-wide v4, v9

    move v7, p4

    move-object/from16 v9, p6

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_3
    throw v0

    .line 84
    :cond_4
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "httpService not exist, netLib = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3fe

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public static a(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 68
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p4, :cond_0

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p4

    .line 70
    :goto_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/model/c;

    const-string v2, "ss_d_request_host_ip_114"

    move-object/from16 v10, p3

    invoke-direct {v1, v2, v10}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    move v14, v1

    move-object v1, v0

    move v0, v14

    goto :goto_1

    :cond_1
    move-object/from16 v10, p3

    if-nez p0, :cond_2

    const/4 v0, 0x2

    move-object/from16 v1, p4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p4

    move/from16 v0, p5

    .line 71
    :goto_1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(I)[I

    move-result-object v2

    .line 72
    array-length v11, v2

    const/4 v12, 0x0

    const/4 v0, 0x0

    move v13, v0

    move-object v0, v12

    :goto_2
    if-ge v13, v11, :cond_6

    aget v7, v2, v13

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v6, v1

    move/from16 v8, p6

    move-object/from16 v9, p7

    .line 73
    :try_start_0
    invoke-static/range {v3 .. v9}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_5

    return-object v3

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 74
    invoke-virtual/range {p7 .. p7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/i/f;->g(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    .line 75
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dcach::http exception 304, throw excepiton, not retry "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/c/a;->a(Ljava/lang/String;)V

    .line 76
    throw v3

    :cond_4
    :goto_3
    move-object v0, v3

    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_6
    if-nez v0, :cond_7

    return-object v12

    .line 77
    :cond_7
    throw v0
.end method

.method public static a(ZILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v4, p3

    .line 67
    invoke-static/range {v0 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/Future;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 107
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->t()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0, p0, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method static declared-synchronized a()V
    .locals 3

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->K:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 37
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/c;->y:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v1, 0x0

    .line 38
    sput-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->K:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 39
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    if-eqz p0, :cond_0

    .line 119
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 120
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    .line 121
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a;->a()Lcom/ss/android/socialbase/downloader/a/a;

    move-result-object p0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->a:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 122
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/constants/d;)V
    .locals 4

    .line 50
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->S:Ljava/util/List;

    monitor-enter v0

    .line 51
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 52
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/k;

    if-eqz v2, :cond_0

    .line 54
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/d;->b:Lcom/ss/android/socialbase/downloader/constants/d;

    if-ne p0, v3, :cond_1

    .line 55
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/k;->a()V

    goto :goto_0

    .line 56
    :cond_1
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/d;->c:Lcom/ss/android/socialbase/downloader/constants/d;

    if-ne p0, v3, :cond_0

    .line 57
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/k;->b()V

    goto :goto_0

    .line 58
    :cond_2
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/d;->c:Lcom/ss/android/socialbase/downloader/constants/d;

    if-ne p0, v1, :cond_3

    .line 59
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->S:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 60
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static a(Lcom/ss/android/socialbase/downloader/d/b;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 113
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->B:Lcom/ss/android/socialbase/downloader/d/b;

    :cond_0
    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/d/c;)V
    .locals 0

    .line 127
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->Y:Lcom/ss/android/socialbase/downloader/d/c;

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/depend/aa;)V
    .locals 0

    .line 114
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->C:Lcom/ss/android/socialbase/downloader/depend/aa;

    .line 115
    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->a()V

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/depend/af;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 117
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->e:Lcom/ss/android/socialbase/downloader/depend/af;

    :cond_0
    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/depend/ak;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 41
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->D:Ljava/util/List;

    monitor-enter v0

    .line 42
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->D:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/depend/k;)V
    .locals 2

    .line 44
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->S:Ljava/util/List;

    monitor-enter v0

    if-eqz p0, :cond_1

    .line 45
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    monitor-exit v0

    return-void

    .line 48
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static declared-synchronized a(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 3

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->Z:Z

    if-eqz v1, :cond_0

    const-string p0, "DownloadComponentManager"

    const-string v1, "component has init"

    .line 2
    invoke-static {p0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z

    .line 5
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->c(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V

    .line 6
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    if-nez p0, :cond_1

    .line 7
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/d;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/d;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 8
    :cond_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-nez p0, :cond_2

    .line 9
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/h;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/h;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 10
    :cond_2
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-nez p0, :cond_3

    .line 11
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    if-eqz p0, :cond_3

    .line 12
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/downloader/c$a;->a()Lcom/ss/android/socialbase/downloader/downloader/o;

    move-result-object p0

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->h:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 13
    :cond_3
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-nez p0, :cond_4

    .line 14
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/i;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/i;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 15
    :cond_4
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

    if-nez p0, :cond_5

    .line 16
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/e;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/e;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->f:Lcom/ss/android/socialbase/downloader/impls/a;

    .line 17
    :cond_5
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

    if-nez p0, :cond_6

    .line 18
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/c;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/c;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

    .line 19
    :cond_6
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

    if-nez p0, :cond_7

    .line 20
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/b;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

    .line 21
    :cond_7
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

    if-nez p0, :cond_8

    .line 22
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/j;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/j;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->z:Lcom/ss/android/socialbase/downloader/downloader/s;

    .line 23
    :cond_8
    sget p0, Lcom/ss/android/socialbase/downloader/downloader/c;->L:I

    if-lez p0, :cond_9

    sget v2, Lcom/ss/android/socialbase/downloader/downloader/c;->M:I

    if-le p0, v2, :cond_a

    .line 24
    :cond_9
    sget p0, Lcom/ss/android/socialbase/downloader/downloader/c;->M:I

    sput p0, Lcom/ss/android/socialbase/downloader/downloader/c;->L:I

    .line 25
    :cond_a
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->V()V

    .line 26
    sget-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z

    const/4 v2, 0x1

    if-eqz p0, :cond_b

    if-nez v1, :cond_b

    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->c()Z

    move-result p0

    if-nez p0, :cond_b

    .line 27
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/impls/l;->a(Z)Lcom/ss/android/socialbase/downloader/downloader/m;

    move-result-object p0

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/downloader/m;->e()V

    goto :goto_0

    .line 28
    :cond_b
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->d()Z

    move-result p0

    if-eqz p0, :cond_c

    .line 29
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->m()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 30
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/c$1;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/c$1;-><init>()V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 31
    :cond_c
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 32
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/i/f;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 33
    :cond_d
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->G()V

    .line 34
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/c;->Z:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/downloader/c$a;)V
    .locals 2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setIndependentServiceCreator::creator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wjd"

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->i:Lcom/ss/android/socialbase/downloader/downloader/c$a;

    return-void
.end method

.method private static a(Lcom/ss/android/socialbase/downloader/downloader/g;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 118
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->x:Lcom/ss/android/socialbase/downloader/downloader/g;

    :cond_0
    return-void
.end method

.method private static a(Lcom/ss/android/socialbase/downloader/downloader/h;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 116
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->d:Lcom/ss/android/socialbase/downloader/downloader/h;

    :cond_0
    return-void
.end method

.method private static a(Lcom/ss/android/socialbase/downloader/downloader/j;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 111
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    :cond_0
    return-void
.end method

.method private static a(Lcom/ss/android/socialbase/downloader/downloader/k;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 112
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->c:Lcom/ss/android/socialbase/downloader/downloader/k;

    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Lcom/ss/android/socialbase/downloader/downloader/l;)V
    .locals 1

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    if-eqz p0, :cond_0

    .line 92
    :try_start_0
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->n:Lcom/ss/android/socialbase/downloader/downloader/l;

    .line 93
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    instance-of p0, p0, Lcom/ss/android/socialbase/downloader/impls/d;

    if-eqz p0, :cond_0

    .line 94
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    check-cast p0, Lcom/ss/android/socialbase/downloader/impls/d;

    .line 95
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/impls/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 96
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/downloader/r;)V
    .locals 0

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V
    .locals 3

    .line 61
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->T:Ljava/util/List;

    monitor-enter v0

    .line 62
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 63
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/ab;

    if-eqz v2, :cond_0

    .line 65
    invoke-interface {v2, p0, p1}, Lcom/ss/android/socialbase/downloader/depend/ab;->a(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    goto :goto_0

    .line 66
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 108
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->j:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    .line 109
    :cond_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->j:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/c;->R:Z

    return-void
.end method

.method public static a(Lcom/ss/android/socialbase/downloader/network/h;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 110
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->k:Lcom/ss/android/socialbase/downloader/network/h;

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 103
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public static a(Ljava/lang/Runnable;Z)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 104
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->d()Z

    move-result p1

    if-nez p1, :cond_1

    .line 105
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 106
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->l()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private static a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/m;",
            ">;)V"
        }
    .end annotation

    .line 98
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 99
    monitor-enter v0

    .line 100
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 101
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_0
    :goto_0
    return-void
.end method

.method public static a(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 97
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->u:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 102
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/c;->W:Z

    return-void
.end method

.method private static a(I)[I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    new-array p0, v2, [I

    .line 90
    fill-array-data p0, :array_0

    return-object p0

    :cond_0
    new-array p0, v2, [I

    .line 91
    fill-array-data p0, :array_1

    return-object p0

    :cond_1
    new-array p0, v1, [I

    aput v1, p0, v0

    return-object p0

    :cond_2
    new-array p0, v1, [I

    aput v0, p0, v0

    return-object p0

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method private static b(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/g;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 26
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->f()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->i()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    const/4 v1, 0x0

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    if-eqz p3, :cond_1

    .line 27
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 28
    :cond_1
    invoke-interface {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/network/h;->a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_2

    const/4 v4, 0x0

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v5, v0, v2

    const-string v7, "head"

    move-object v2, p1

    move-object v3, p0

    move v8, p2

    move-object v10, p4

    invoke-static/range {v2 .. v10}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-object p1

    :catchall_0
    move-exception p1

    move-object v8, v9

    goto :goto_1

    :catch_0
    move-exception p1

    .line 30
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object v8, p1

    move-object p1, v0

    :goto_1
    if-eqz p3, :cond_3

    const/4 p3, 0x0

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-string v6, "head"

    move-object v2, p0

    move-object v3, p3

    move v7, p2

    move-object v9, p4

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/network/g;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_3
    throw p1

    .line 32
    :cond_4
    new-instance p0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance p1, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "httpService not exist, netLib = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x3fe

    invoke-direct {p0, p2, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p0
.end method

.method public static declared-synchronized b()V
    .locals 5

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 4
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 5
    :try_start_1
    sput-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->c()Z

    move-result v2

    if-nez v2, :cond_1

    .line 10
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/l;->a(Z)Lcom/ss/android/socialbase/downloader/downloader/m;

    move-result-object v1

    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/m;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    const/4 v2, 0x0

    .line 11
    :try_start_3
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z

    .line 12
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 13
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static b(I)V
    .locals 0

    if-lez p0, :cond_0

    .line 38
    sput p0, Lcom/ss/android/socialbase/downloader/downloader/c;->L:I

    :cond_0
    return-void
.end method

.method public static b(Lcom/ss/android/socialbase/downloader/depend/k;)V
    .locals 2

    .line 14
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->S:Ljava/util/List;

    monitor-enter v0

    if-eqz p0, :cond_1

    .line 15
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 17
    monitor-exit v0

    return-void

    .line 18
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static declared-synchronized b(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 1

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->c(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static b(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V
    .locals 3

    .line 20
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->T:Ljava/util/List;

    monitor-enter v0

    .line 21
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/ab;

    if-eqz v2, :cond_0

    .line 24
    invoke-interface {v2, p0, p1}, Lcom/ss/android/socialbase/downloader/depend/ab;->b(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    goto :goto_0

    .line 25
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public static b(Ljava/lang/Runnable;Z)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 35
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->d()Z

    move-result p1

    if-nez p1, :cond_1

    .line 36
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 37
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->m()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public static b(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 33
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->v:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method private static b(Z)V
    .locals 0

    .line 39
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/c;->V:Z

    return-void
.end method

.method private static c(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 2

    if-eqz p0, :cond_1b

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Landroid/content/Context;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCache()Lcom/ss/android/socialbase/downloader/downloader/j;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCache()Lcom/ss/android/socialbase/downloader/downloader/j;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIdGenerator()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIdGenerator()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkCntCalculator()Lcom/ss/android/socialbase/downloader/downloader/h;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkCntCalculator()Lcom/ss/android/socialbase/downloader/downloader/h;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/h;)V

    .line 9
    :cond_3
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/af;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/af;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/depend/af;)V

    .line 11
    :cond_4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMaxDownloadPoolSize()I

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMaxDownloadPoolSize()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(I)V

    .line 13
    :cond_5
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHttpService()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 14
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHttpService()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 15
    :cond_6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHeadHttpService()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 16
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHeadHttpService()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/h;)V

    .line 17
    :cond_7
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadLaunchHandler()Lcom/ss/android/socialbase/downloader/downloader/l;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadLaunchHandler()Lcom/ss/android/socialbase/downloader/downloader/l;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/l;)V

    .line 19
    :cond_8
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getCPUThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 20
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getCPUThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 21
    :cond_9
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIOThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 22
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIOThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->d(Ljava/util/concurrent/ExecutorService;)V

    .line 23
    :cond_a
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixDefaultDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 24
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixDefaultDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->e(Ljava/util/concurrent/ExecutorService;)V

    .line 25
    :cond_b
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixFrequentDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 26
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixFrequentDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->f(Ljava/util/concurrent/ExecutorService;)V

    .line 27
    :cond_c
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixApkDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 28
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixApkDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->g(Ljava/util/concurrent/ExecutorService;)V

    .line 29
    :cond_d
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDBThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 30
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDBThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->h(Ljava/util/concurrent/ExecutorService;)V

    .line 31
    :cond_e
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 32
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/util/concurrent/ExecutorService;)V

    .line 33
    :cond_f
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getOkHttpDispatcherExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 34
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getOkHttpDispatcherExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Ljava/util/concurrent/ExecutorService;)V

    .line 35
    :cond_10
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCompleteHandlers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 36
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCompleteHandlers()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Ljava/util/List;)V

    .line 37
    :cond_11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMonitorConfig()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 38
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMonitorConfig()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->A:Lcom/ss/android/socialbase/downloader/downloader/q;

    .line 39
    :cond_12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getWriteBufferSize()I

    move-result v0

    const/16 v1, 0x400

    if-le v0, v1, :cond_13

    .line 40
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getWriteBufferSize()I

    move-result v0

    sput v0, Lcom/ss/android/socialbase/downloader/downloader/c;->Q:I

    .line 41
    :cond_13
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/g;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 42
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/g;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/downloader/g;)V

    .line 43
    :cond_14
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->isDownloadInMultiProcess()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    .line 44
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z

    .line 45
    :cond_15
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadExpSwitch()I

    move-result v0

    if-eqz v0, :cond_16

    .line 46
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadExpSwitch()I

    move-result v0

    sput v0, Lcom/ss/android/socialbase/downloader/downloader/c;->U:I

    .line 47
    :cond_16
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadSetting()Lcom/ss/android/socialbase/downloader/depend/aa;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 48
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadSetting()Lcom/ss/android/socialbase/downloader/depend/aa;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/depend/aa;)V

    .line 49
    :cond_17
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadDns()Lcom/ss/android/socialbase/downloader/network/f;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 50
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadDns()Lcom/ss/android/socialbase/downloader/network/f;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->G:Lcom/ss/android/socialbase/downloader/network/f;

    .line 51
    :cond_18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getTTNetHandler()Lcom/ss/android/socialbase/downloader/downloader/u;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 52
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getTTNetHandler()Lcom/ss/android/socialbase/downloader/downloader/u;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    .line 53
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->a()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 54
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->b()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 55
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->I:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->c()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/h;)V

    goto :goto_0

    .line 56
    :cond_19
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->h()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 57
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->i()Lcom/ss/android/socialbase/downloader/network/h;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/network/h;)V

    .line 58
    :cond_1a
    :goto_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->needAutoRefreshUnSuccessTask()Z

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/c;->b(Z)V

    .line 59
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadMonitorListener()Lcom/ss/android/socialbase/downloader/d/b;

    move-result-object v0

    if-eqz v0, :cond_1b

    .line 60
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadMonitorListener()Lcom/ss/android/socialbase/downloader/d/b;

    move-result-object p0

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(Lcom/ss/android/socialbase/downloader/d/b;)V

    :cond_1b
    return-void
.end method

.method public static c(Ljava/lang/Runnable;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 64
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 65
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->r()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private static c(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 62
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->o:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static declared-synchronized c()Z
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 61
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->E:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static d()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->j:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object v0
.end method

.method private static d(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->p:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static e()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ak;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->D:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->D:Ljava/util/List;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static e(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 4
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->q:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static f()Lcom/ss/android/socialbase/downloader/network/h;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->k:Lcom/ss/android/socialbase/downloader/network/h;

    return-object v0
.end method

.method private static f(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->r:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static g()Lcom/ss/android/socialbase/downloader/d/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->B:Lcom/ss/android/socialbase/downloader/d/b;

    return-object v0
.end method

.method private static g(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->s:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static h()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->l:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->l:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/g;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/g;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->l:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->l:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object v0
.end method

.method private static h(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 7
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/c;->t:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static i()Lcom/ss/android/socialbase/downloader/network/h;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->m:Lcom/ss/android/socialbase/downloader/network/h;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->m:Lcom/ss/android/socialbase/downloader/network/h;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/f;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/f;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->m:Lcom/ss/android/socialbase/downloader/network/h;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->m:Lcom/ss/android/socialbase/downloader/network/h;

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

.method public static j()Z
    .locals 3

    invoke-static {}, Lcom/ss/android/socialbase/downloader/g/a;->c()Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object v0

    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/c;->W:Z

    const-string v2, "switch_not_auto_boot_service"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static declared-synchronized k()Lcom/ss/android/socialbase/downloader/downloader/q;
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->A:Lcom/ss/android/socialbase/downloader/downloader/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static l()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->o:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->o:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 13
    .line 14
    sget v4, Lcom/ss/android/socialbase/downloader/downloader/c;->M:I

    .line 15
    .line 16
    const-wide/16 v5, 0xf

    .line 17
    .line 18
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, Lcom/ss/android/socialbase/downloader/h/a;

    .line 26
    .line 27
    const-string v2, "DownloadThreadPool-cpu-fixed"

    .line 28
    .line 29
    const/4 v10, 0x1

    .line 30
    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/h/a;-><init>(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    move v3, v4

    .line 35
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v2

    .line 43
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->o:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    :cond_0
    monitor-exit v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    throw v1

    .line 53
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->o:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    return-object v0
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

.method public static m()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->p:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->p:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->l()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static n()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->r:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->r:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->p()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static o()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->s:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->s:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->p()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static p()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->q:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->q:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 13
    .line 14
    sget v4, Lcom/ss/android/socialbase/downloader/downloader/c;->O:I

    .line 15
    .line 16
    const-wide/16 v5, 0xf

    .line 17
    .line 18
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, Lcom/ss/android/socialbase/downloader/h/a;

    .line 26
    .line 27
    const-string v2, "DownloadThreadPool-mix-fixed"

    .line 28
    .line 29
    const/4 v10, 0x1

    .line 30
    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/h/a;-><init>(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    move v3, v4

    .line 35
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v2

    .line 43
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->q:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    :cond_0
    monitor-exit v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    throw v1

    .line 53
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->q:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    return-object v0
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

.method public static q()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->u:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->u:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 13
    .line 14
    sget v4, Lcom/ss/android/socialbase/downloader/downloader/c;->N:I

    .line 15
    .line 16
    const-wide/16 v5, 0xf

    .line 17
    .line 18
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, Lcom/ss/android/socialbase/downloader/h/a;

    .line 26
    .line 27
    const-string v2, "DownloadThreadPool-chunk-fixed"

    .line 28
    .line 29
    const/4 v10, 0x1

    .line 30
    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/h/a;-><init>(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    move v3, v4

    .line 35
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v2

    .line 43
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->u:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    :cond_0
    monitor-exit v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    throw v1

    .line 53
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->u:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    return-object v0
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

.method public static r()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->t:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->t:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 13
    .line 14
    sget v4, Lcom/ss/android/socialbase/downloader/downloader/c;->P:I

    .line 15
    .line 16
    const-wide/16 v5, 0xf

    .line 17
    .line 18
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, Lcom/ss/android/socialbase/downloader/h/a;

    .line 26
    .line 27
    const-string v2, "DownloadThreadPool-db-fixed"

    .line 28
    .line 29
    const/4 v10, 0x1

    .line 30
    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/h/a;-><init>(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    move v3, v4

    .line 35
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v2

    .line 43
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->t:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    :cond_0
    monitor-exit v0

    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    throw v1

    .line 53
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->t:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    return-object v0
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

.method public static s()Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->F:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->F:Lokhttp3/OkHttpClient;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->u()Lokhttp3/OkHttpClient$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v2, v1, Lokhttp3/OkHttpClient$Builder;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/OkHttpClient$Builder;)Lokhttp3/OkHttpClient;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->F:Lokhttp3/OkHttpClient;

    .line 30
    .line 31
    :cond_1
    monitor-exit v0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1

    .line 36
    :cond_2
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->F:Lokhttp3/OkHttpClient;

    .line 37
    .line 38
    return-object v0
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

.method public static t()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 5

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->w:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->w:Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 13
    .line 14
    new-instance v2, Lcom/ss/android/socialbase/downloader/h/a;

    .line 15
    .line 16
    const-string v3, "DownloadThreadPool-Schedule"

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/h/a;-><init>(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v4, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->w:Ljava/util/concurrent/ScheduledExecutorService;

    .line 26
    .line 27
    :cond_0
    monitor-exit v0

    .line 28
    goto :goto_0

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
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->w:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    return-object v0
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

.method public static u()Lokhttp3/OkHttpClient$Builder;
    .locals 5

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v2, 0x7530

    .line 9
    .line 10
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual {v4, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 32
    .line 33
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->protocols(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 38
    .line 39
    .line 40
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->v:Ljava/util/concurrent/ExecutorService;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    new-instance v1, Lokhttp3/Dispatcher;

    .line 45
    .line 46
    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/c;->v:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    invoke-direct {v1, v2}, Lokhttp3/Dispatcher;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-object v0
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

.method public static v()Lcom/ss/android/socialbase/downloader/network/f;
    .locals 1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->G:Lcom/ss/android/socialbase/downloader/network/f;

    return-object v0
.end method

.method public static w()Lcom/ss/android/socialbase/downloader/network/f;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->H:Lcom/ss/android/socialbase/downloader/network/f;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->H:Lcom/ss/android/socialbase/downloader/network/f;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/c$2;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/c$2;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->H:Lcom/ss/android/socialbase/downloader/network/f;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->H:Lcom/ss/android/socialbase/downloader/network/f;

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

.method public static declared-synchronized x()Lcom/ss/android/socialbase/downloader/downloader/l;
    .locals 2

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->n:Lcom/ss/android/socialbase/downloader/downloader/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
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

.method public static y()Lcom/ss/android/socialbase/downloader/downloader/j;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/d;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/d;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->b:Lcom/ss/android/socialbase/downloader/downloader/j;

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

.method public static z()Lcom/ss/android/socialbase/downloader/downloader/o;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/c;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/h;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/h;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/c;->g:Lcom/ss/android/socialbase/downloader/downloader/o;

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
