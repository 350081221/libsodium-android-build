.class public Lcom/umeng/analytics/pro/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/m$a;
    }
.end annotation


# static fields
.field private static a:Lcom/umeng/analytics/pro/m;


# instance fields
.field private final b:I

.field private c:Z

.field private d:Z

.field private e:Landroid/os/Handler;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/umeng/analytics/pro/n;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/umeng/analytics/pro/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/umeng/analytics/pro/m;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/m;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/m;->a:Lcom/umeng/analytics/pro/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xbb8

    .line 5
    .line 6
    iput v0, p0, Lcom/umeng/analytics/pro/m;->b:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/m;->c:Z

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/m;->d:Z

    .line 13
    .line 14
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/umeng/analytics/pro/m;->e:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Lcom/umeng/analytics/pro/m$a;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/umeng/analytics/pro/m$a;-><init>(Lcom/umeng/analytics/pro/m;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/umeng/analytics/pro/m;->g:Lcom/umeng/analytics/pro/m$a;

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

.method public static a()Lcom/umeng/analytics/pro/m;
    .locals 1

    .line 5
    sget-object v0, Lcom/umeng/analytics/pro/m;->a:Lcom/umeng/analytics/pro/m;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 3
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 4
    check-cast p0, Landroid/app/Application;

    sget-object v0, Lcom/umeng/analytics/pro/m;->a:Lcom/umeng/analytics/pro/m;

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/umeng/analytics/pro/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/umeng/analytics/pro/m;->c:Z

    return p0
.end method

.method static synthetic a(Lcom/umeng/analytics/pro/m;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/m;->c:Z

    return p1
.end method

.method static synthetic b(Lcom/umeng/analytics/pro/m;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/umeng/analytics/pro/m;->d:Z

    return p0
.end method

.method static synthetic c(Lcom/umeng/analytics/pro/m;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/umeng/analytics/pro/n;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    .line 7
    :cond_0
    :goto_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized b(Lcom/umeng/analytics/pro/n;)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/umeng/analytics/pro/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    .line 5
    :cond_1
    monitor-exit p0

    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/m;->d:Z

    .line 3
    .line 4
    iget-object p1, p0, Lcom/umeng/analytics/pro/m;->g:Lcom/umeng/analytics/pro/m$a;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/umeng/analytics/pro/m;->e:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/umeng/analytics/pro/m;->e:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/umeng/analytics/pro/m;->g:Lcom/umeng/analytics/pro/m$a;

    .line 16
    .line 17
    const-wide/16 v1, 0xbb8

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/m;->d:Z

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/umeng/analytics/pro/m;->c:Z

    .line 6
    .line 7
    iget-object p1, p0, Lcom/umeng/analytics/pro/m;->g:Lcom/umeng/analytics/pro/m$a;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/umeng/analytics/pro/m;->e:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
