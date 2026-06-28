.class public Lcom/ss/android/socialbase/downloader/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/a/a$a;,
        Lcom/ss/android/socialbase/downloader/a/a$c;,
        Lcom/ss/android/socialbase/downloader/a/a$b;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Application;

.field private b:Lcom/ss/android/socialbase/downloader/a/a$c;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/a/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:I

.field private volatile g:Z

.field private final h:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->f:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->g:Z

    .line 6
    new-instance v0, Lcom/ss/android/socialbase/downloader/a/a$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/a/a$1;-><init>(Lcom/ss/android/socialbase/downloader/a/a;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->h:Landroid/app/Application$ActivityLifecycleCallbacks;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/socialbase/downloader/a/a$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/a/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/a/a;->d:I

    return p0
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/a/a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/socialbase/downloader/a/a;->d:I

    return p1
.end method

.method public static a()Lcom/ss/android/socialbase/downloader/a/a;
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a$b;->a()Lcom/ss/android/socialbase/downloader/a/a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/a/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a;->e:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/a/a;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/a/a;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/ss/android/socialbase/downloader/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;->e()V

    return-void
.end method

.method static synthetic c(Lcom/ss/android/socialbase/downloader/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;->f()V

    return-void
.end method

.method private d()[Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
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

.method private e()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->f:I

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;->d()[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_0

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    check-cast v3, Lcom/ss/android/socialbase/downloader/a/a$a;

    .line 17
    .line 18
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/a/a$a;->b()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
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

.method private f()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->f:I

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;->d()[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    :goto_0
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    aget-object v3, v1, v0

    .line 14
    .line 15
    check-cast v3, Lcom/ss/android/socialbase/downloader/a/a$a;

    .line 16
    .line 17
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/a/a$a;->c()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method private g()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->a:Landroid/app/Application;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const-string v2, "activity"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroid/app/ActivityManager;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return v0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    return v0
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


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->a:Landroid/app/Application;

    if-nez v0, :cond_1

    .line 7
    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 8
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->a:Landroid/app/Application;

    if-nez v0, :cond_0

    .line 10
    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a;->a:Landroid/app/Application;

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->h:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/a/a$a;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 16
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/a/a$c;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a;->b:Lcom/ss/android/socialbase/downloader/a/a$c;

    return-void
.end method

.method public b(Lcom/ss/android/socialbase/downloader/a/a$a;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Z
    .locals 2

    .line 2
    iget v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/a/a;->g()Z

    move-result v0

    .line 4
    iput v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->f:I

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public c()Z
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/a/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/a/a;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
