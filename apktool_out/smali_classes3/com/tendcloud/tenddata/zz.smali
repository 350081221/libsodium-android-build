.class public final Lcom/tendcloud/tenddata/zz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/ao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/zz$a;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String; = null

.field public static volatile b:Z = false

.field public static volatile c:Z = false

.field static d:Z = false

.field public static e:Lcom/tendcloud/tenddata/b; = null

.field public static final f:I = 0x66

.field private static volatile g:Lcom/tendcloud/tenddata/zz; = null

.field private static final h:Ljava/lang/String; = "Function startA was not executed correctly!"

.field private static i:Ljava/lang/String; = null

.field private static j:Ljava/lang/String; = null

.field private static k:Ljava/lang/String; = null

.field private static l:Z = false

.field private static final m:I = 0x65

.field private static final n:I = 0x67

.field private static o:Landroid/os/Handler;

.field private static final p:Landroid/os/HandlerThread;

.field private static q:Landroid/os/Handler;

.field private static final r:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    const-string v1, "ProcessingThread"

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/tendcloud/tenddata/zz;->p:Landroid/os/HandlerThread;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    sput-object v1, Lcom/tendcloud/tenddata/zz;->q:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v1, Landroid/os/HandlerThread;

    .line 16
    .line 17
    const-string v3, "PauseEventThread"

    .line 18
    .line 19
    invoke-direct {v1, v3, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lcom/tendcloud/tenddata/zz;->r:Landroid/os/HandlerThread;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lcom/tendcloud/tenddata/zz$1;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v2, v0}, Lcom/tendcloud/tenddata/zz$1;-><init>(Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lcom/tendcloud/tenddata/zz;->o:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/tendcloud/tenddata/zz$12;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/zz$12;-><init>(Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/tendcloud/tenddata/zz;->q:Landroid/os/Handler;

    .line 51
    .line 52
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sput-object p0, Lcom/tendcloud/tenddata/zz;->g:Lcom/tendcloud/tenddata/zz;

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
.end method

.method static declared-synchronized a()Lcom/tendcloud/tenddata/zz;
    .locals 3

    const-class v0, Lcom/tendcloud/tenddata/zz;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/zz;->g:Lcom/tendcloud/tenddata/zz;

    if-nez v1, :cond_1

    .line 2
    const-class v1, Lcom/tendcloud/tenddata/zz;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    sget-object v2, Lcom/tendcloud/tenddata/zz;->g:Lcom/tendcloud/tenddata/zz;

    if-nez v2, :cond_0

    .line 4
    new-instance v2, Lcom/tendcloud/tenddata/zz;

    invoke-direct {v2}, Lcom/tendcloud/tenddata/zz;-><init>()V

    sput-object v2, Lcom/tendcloud/tenddata/zz;->g:Lcom/tendcloud/tenddata/zz;

    .line 5
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2

    .line 6
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/zz;->g:Lcom/tendcloud/tenddata/zz;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    const/16 v0, 0xe

    .line 220
    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->a(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 221
    :try_start_0
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 222
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    goto :goto_0

    .line 223
    :cond_0
    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 224
    check-cast p1, Landroid/app/Application;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 225
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->l:Z

    if-nez v0, :cond_3

    .line 226
    new-instance v0, Lcom/tendcloud/tenddata/b;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/b;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/zz;->e:Lcom/tendcloud/tenddata/b;

    .line 227
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 228
    sput-boolean v1, Lcom/tendcloud/tenddata/zz;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    .line 229
    :cond_2
    new-instance v0, Lcom/tendcloud/tenddata/zz$24;

    invoke-direct {v0, p0, p1}, Lcom/tendcloud/tenddata/zz$24;-><init>(Lcom/tendcloud/tenddata/zz;Landroid/content/Context;)V

    :try_start_1
    const-string p1, "android.app.ActivityManagerNative"

    .line 230
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v2, "gDefault"

    const-string v3, "android.app.IActivityManager"

    .line 231
    invoke-static {p1, v0, v2, v3}, Lcom/tendcloud/tenddata/y;->a(Ljava/lang/Class;Lcom/tendcloud/tenddata/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    sput-boolean v1, Lcom/tendcloud/tenddata/zz;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "registerActivityLifecycleListener "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    :catchall_1
    :cond_3
    :goto_1
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 55
    new-instance p1, Lcom/tendcloud/tenddata/zz$30;

    invoke-direct {p1, p0, p3, p2, p4}, Lcom/tendcloud/tenddata/zz$30;-><init>(Lcom/tendcloud/tenddata/zz;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static b()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/zz;->q:Landroid/os/Handler;

    return-object v0
.end method

.method public static c()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/zz;->o:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 37
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 38
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 39
    :cond_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->l:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->J:Z

    if-eqz v0, :cond_1

    return-void

    .line 40
    :cond_1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;)V

    .line 41
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/c;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V

    const/4 p1, 0x1

    .line 42
    sput-boolean p1, Lcom/tendcloud/tenddata/ab;->J:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 43
    :try_start_0
    sget-boolean p2, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p2, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 44
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 45
    :cond_0
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;)V

    .line 46
    invoke-virtual {p0, p1, p4}, Lcom/tendcloud/tenddata/zz;->a(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p1, v0, v0, p2}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 47
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 48
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 49
    :cond_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->d:Z

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    .line 50
    sput-boolean p1, Lcom/tendcloud/tenddata/zz;->d:Z

    return-void

    .line 51
    :cond_1
    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 52
    move-object p2, p1

    check-cast p2, Landroid/app/Activity;

    .line 53
    invoke-virtual {p2}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v0, 0x4

    .line 54
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, "start SDK failed Context is null"

    .line 9
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "android.permission.INTERNET"

    .line 10
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "[startA] Permission \"android.permission.INTERNET\" is needed."

    .line 11
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_1
    if-nez p5, :cond_2

    const-string p1, "Failed to start SDK!"

    .line 12
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    return-void

    .line 13
    :cond_2
    :try_start_1
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_7

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 15
    sput-object p2, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    .line 16
    sput-object p3, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    .line 17
    sput-object p4, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    const/16 p4, 0x80

    invoke-virtual {p2, p3, p4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    .line 19
    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string p3, "TD_APP_ID"

    .line 20
    invoke-static {p2, p3}, Lcom/tendcloud/tenddata/y;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string p4, "TD_CHANNEL_ID"

    .line 21
    invoke-static {p2, p4}, Lcom/tendcloud/tenddata/y;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-static {p3}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_3

    goto :goto_0

    :cond_3
    sget-object p3, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    :goto_0
    sput-object p3, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    .line 23
    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    :goto_1
    sput-object p2, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    .line 24
    sget-object p2, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {p2, p5}, Lcom/tendcloud/tenddata/ab;->c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    const-string p2, "ChannelConfig.json"

    .line 25
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/y;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_2

    :cond_5
    sget-object p2, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    :goto_2
    sput-object p2, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    .line 27
    sget-object p2, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p1, "[startA] TD AppId is null"

    .line 28
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 29
    :cond_6
    sget-object p2, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    sput-object p2, Lcom/tendcloud/tenddata/zz;->i:Ljava/lang/String;

    .line 30
    sget-object p3, Lcom/tendcloud/tenddata/zz;->k:Ljava/lang/String;

    invoke-static {p2, p3, p5}, Lcom/tendcloud/tenddata/ab;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    .line 31
    invoke-static {}, Lcom/tendcloud/tenddata/bi;->a()Lcom/tendcloud/tenddata/bi;

    .line 32
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;)V

    .line 33
    invoke-static {}, Lcom/tendcloud/tenddata/bh;->a()Lcom/tendcloud/tenddata/bh;

    .line 34
    new-instance p1, Lcom/tendcloud/tenddata/zz$23;

    invoke-direct {p1, p0, p5}, Lcom/tendcloud/tenddata/zz$23;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    .line 35
    sput-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    :try_start_2
    const-string p2, "[startA] Failed to start SDK!"

    .line 36
    invoke-static {p2, p1}, Lcom/tendcloud/tenddata/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_7
    :goto_3
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;D",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 74
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p1, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 75
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 76
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "onEvent()# event id is empty."

    .line 77
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onEvent being called! eventId: "

    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {p7}, Lcom/tendcloud/tenddata/a;->index()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x3

    const-string v2, "null"

    if-eq v0, v1, :cond_3

    :try_start_1
    const-string v0, ", eventLabel: "

    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    move-object v0, p3

    .line 83
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v0, ", eventMap: "

    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p4, :cond_4

    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value: "

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5, p6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 88
    new-instance p1, Lcom/tendcloud/tenddata/zz$32;

    move-object v0, p1

    move-object v1, p0

    move-object v2, p7

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/tendcloud/tenddata/zz$32;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;D)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 56
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 57
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p1, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 58
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 59
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "onEvent()# event id is empty."

    .line 60
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onEvent being called! eventId: "

    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {p6}, Lcom/tendcloud/tenddata/a;->index()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x3

    const-string v2, "null"

    if-eq v0, v1, :cond_3

    :try_start_1
    const-string v0, ", eventLabel: "

    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    move-object v0, p3

    .line 66
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v0, ", eventMap: "

    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p4, :cond_4

    goto :goto_1

    .line 68
    :cond_4
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p5, :cond_5

    .line 69
    invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, ", eventValue: "

    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    :cond_5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 73
    new-instance p1, Lcom/tendcloud/tenddata/zz$31;

    move-object v0, p1

    move-object v1, p0

    move-object v2, p6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/tendcloud/tenddata/zz$31;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;DLcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;D",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 89
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p1, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 90
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 91
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "onEvent()# event id is empty."

    .line 92
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 93
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onEvent being called! eventId: "

    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", eventMap: "

    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_2

    const-string v0, "null"

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value: "

    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 100
    new-instance p1, Lcom/tendcloud/tenddata/zz$33;

    move-object v0, p1

    move-object v1, p0

    move-object v2, p6

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/tendcloud/tenddata/zz$33;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/util/Map;D)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 101
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p1, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 102
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    return-void

    .line 103
    :cond_1
    new-instance p1, Lcom/tendcloud/tenddata/zz$34;

    invoke-direct {p1, p0, p2, p3}, Lcom/tendcloud/tenddata/zz$34;-><init>(Lcom/tendcloud/tenddata/zz;Ljava/lang/Throwable;Lcom/tendcloud/tenddata/a;)V

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataOrder;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 203
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 204
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_2

    const-string v0, "keyOrderId"

    .line 205
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 206
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCancelOrder called --> order: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 207
    new-instance v0, Lcom/tendcloud/tenddata/zz$20;

    invoke-direct {v0, p0, p2, p1}, Lcom/tendcloud/tenddata/zz$20;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Lcom/tendcloud/tenddata/TalkingDataOrder;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "onCancelOrder: order or orderID could not be null or empty"

    .line 208
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_1
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 196
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    .line 166
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 167
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "onPay: order could not be null or empty"

    .line 168
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 169
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOrderPaySucc called --> order: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,paymentType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 170
    new-instance v0, Lcom/tendcloud/tenddata/zz$13;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p3

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$13;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/TalkingDataOrder;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 197
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 198
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_3

    const-string v0, "keyOrderId"

    .line 199
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 200
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPlaceOrder called --> order: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 201
    new-instance v0, Lcom/tendcloud/tenddata/zz$18;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$18;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataOrder;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_1
    const-string p1, "onPlaceOrder: order or orderID could not be null or empty"

    .line 202
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 138
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 139
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 140
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onProfileUpdate called --> profile is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 141
    new-instance v0, Lcom/tendcloud/tenddata/zz$6;

    invoke-direct {v0, p0, p2, p1}, Lcom/tendcloud/tenddata/zz$6;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Lcom/tendcloud/tenddata/TalkingDataProfile;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataSearch;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 234
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 235
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "TDSearch cannot be null "

    .line 236
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 237
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSearch called --> search: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 238
    new-instance v0, Lcom/tendcloud/tenddata/zz$26;

    invoke-direct {v0, p0, p2, p1}, Lcom/tendcloud/tenddata/zz$26;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Lcom/tendcloud/tenddata/TalkingDataSearch;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Lcom/tendcloud/tenddata/TalkingDataShoppingCart;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 214
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 215
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 216
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onViewShoppingCart called --> shoppingCart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 217
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    .line 218
    :cond_1
    new-instance v0, Lcom/tendcloud/tenddata/zz$22;

    invoke-direct {v0, p0, p2, p1}, Lcom/tendcloud/tenddata/zz$22;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Lcom/tendcloud/tenddata/TalkingDataShoppingCart;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "viewShoppingCart# shoppingCart can\'t be null or empty"

    .line 219
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 6

    .line 187
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 9

    .line 158
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 159
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_4

    .line 160
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 161
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOrderPaySucc called --> orderid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,payType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    .line 162
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 163
    :cond_2
    new-instance v0, Lcom/tendcloud/tenddata/zz$11;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p5

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/tendcloud/tenddata/zz$11;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_0
    const-string p1, "currencyType length must be 3 likes CNY so so"

    .line 164
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    const-string p1, "onOrderPaySucc: orderId could not be null or empty"

    .line 165
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 188
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 189
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_5

    .line 190
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    .line 191
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPlaceOrder called --> orderId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_2

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p3, :cond_4

    .line 192
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    goto :goto_1

    .line 193
    :cond_3
    new-instance v0, Lcom/tendcloud/tenddata/zz$17;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p5

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/tendcloud/tenddata/zz$17;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_4
    :goto_1
    const-string p1, "currencyType length must be 3 likes CNY so so"

    .line 194
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_5
    :goto_2
    const-string p1, "onPlaceOrder: orderId could not be null or empty"

    .line 195
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_3
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 130
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 6

    .line 122
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 123
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 124
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 125
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onRegister: profileId could not be null or empty"

    .line 126
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    const-string v0, ", eventValue: "

    const-string v1, ""

    const-string v2, " , invitationCode is "

    const-string v3, "onRegister called --> profileId is "

    if-eqz p2, :cond_3

    .line 127
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , profile is "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_2

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    goto :goto_0

    .line 128
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_4

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 129
    :goto_0
    new-instance v0, Lcom/tendcloud/tenddata/zz$3;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p5

    move-object v4, p1

    move-object v5, p3

    move-object v6, p2

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/tendcloud/tenddata/zz$3;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/TalkingDataProfile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 131
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 132
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 133
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onLogin: profileId could not be null or empty"

    .line 134
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    const-string v0, ", eventValue: "

    const-string v1, ""

    const-string v2, "onLogin called --> profileId is "

    if-eqz p2, :cond_3

    .line 135
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \uff0cprofile is "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_4

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 137
    :goto_0
    new-instance v0, Lcom/tendcloud/tenddata/zz$5;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$5;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/TalkingDataProfile;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 6

    .line 115
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/af$ProfileType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 116
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 117
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 118
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onRegister: profileId could not be null or empty"

    .line 119
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 120
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRegister called --> profileId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \uff0ctype is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , name is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_2

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 121
    new-instance v0, Lcom/tendcloud/tenddata/zz$2;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p5

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/tendcloud/tenddata/zz$2;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 104
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 105
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setGlobalKV# key:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " value:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 107
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 9

    .line 171
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Function startA was not executed correctly!"

    .line 172
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_4

    .line 173
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    .line 174
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOrderPaySucc called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,orderid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,payType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p4, :cond_3

    .line 175
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 176
    :cond_2
    new-instance v8, Lcom/tendcloud/tenddata/zz$14;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/tendcloud/tenddata/zz$14;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_0
    const-string v0, "currencyType length must be 3 likes CNY so so"

    .line 177
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    const-string v0, "onOrderPaySucc: profileId could not be null or empty"

    .line 178
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 11

    move-object v4, p2

    move-object v6, p4

    .line 179
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Function startA was not executed correctly!"

    .line 180
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz v4, :cond_4

    .line 181
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    goto/16 :goto_1

    .line 182
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPay called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,orderid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,payType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, p5

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,itemId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, p6

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,itemCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, p7

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz v6, :cond_3

    .line 183
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 184
    :cond_2
    new-instance v10, Lcom/tendcloud/tenddata/zz$16;

    move-object v0, v10

    move-object v1, p0

    move-object/from16 v2, p8

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/tendcloud/tenddata/zz$16;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_0
    const-string v0, "currencyType length must be 3 likes CNY so so"

    .line 185
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    const-string v0, "onPay: orderId could not be null or empty"

    .line 186
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 153
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 154
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Function startA was not executed correctly!"

    .line 155
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 156
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAddItemToShoppingCart called --> itemId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ,category: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v6, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ,name: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ,unitPrice: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v8, p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " ,amount: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, p5

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz p6, :cond_1

    invoke-interface/range {p6 .. p6}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", eventValue: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v2, ""

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 157
    new-instance v0, Lcom/tendcloud/tenddata/zz$10;

    move-object v2, v0

    move-object v3, p0

    move-object/from16 v4, p7

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v2 .. v10}, Lcom/tendcloud/tenddata/zz$10;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    .locals 7

    .line 209
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 210
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 211
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 212
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onViewItem called --> itemId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,category: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,unitPrice: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-eqz p5, :cond_1

    invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 213
    new-instance v0, Lcom/tendcloud/tenddata/zz$21;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p6

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/tendcloud/tenddata/zz$21;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 7

    .line 149
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 150
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 151
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCreateCard called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " method: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  content: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 152
    new-instance v0, Lcom/tendcloud/tenddata/zz$9;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$9;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 143
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 144
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 145
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onRegister: profileId could not be null or empty"

    .line 146
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 147
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRegister called --> profileId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " invitationCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 148
    new-instance v0, Lcom/tendcloud/tenddata/zz$8;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$8;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 109
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 110
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 111
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onLogin: profileId could not be null or empty"

    .line 112
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 113
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLogin called --> profileId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 114
    new-instance v0, Lcom/tendcloud/tenddata/zz$35;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/tendcloud/tenddata/zz$35;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public a(Ljava/util/Map;Lcom/tendcloud/tenddata/TDGenerateUrl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/TDGenerateUrl;",
            ")V"
        }
    .end annotation

    .line 239
    invoke-static {}, Lcom/tendcloud/tenddata/bc;->a()Lcom/tendcloud/tenddata/bc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/bc;->a(Ljava/util/Map;)Lcom/tendcloud/tenddata/bc;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/tendcloud/tenddata/bc;->getShortUrl(Lcom/tendcloud/tenddata/TDGenerateUrl;)V

    return-void
.end method

.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 5
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    sget-boolean p2, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p2, :cond_0

    const-string p2, "Function startA was not executed correctly!"

    .line 3
    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 6
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 7
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->l:Z

    if-eqz v0, :cond_1

    return-void

    .line 9
    :cond_1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;)V

    .line 10
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/c;->b(Landroid/app/Activity;Lcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 11
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 12
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 14
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    .line 15
    invoke-static {p2}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {v0}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p2

    .line 17
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getChangingConfigurations()I

    move-result v0

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 p1, 0x1

    .line 18
    sput-boolean p1, Lcom/tendcloud/tenddata/zz;->d:Z

    return-void

    :cond_2
    const/4 v0, 0x5

    .line 19
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->a(Landroid/content/Context;Ljava/lang/String;ILcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b(Ljava/lang/String;ILjava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 42
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 43
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_4

    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCancelOrder called --> orderId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    .line 46
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 47
    :cond_2
    new-instance v0, Lcom/tendcloud/tenddata/zz$19;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p4

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/tendcloud/tenddata/zz$19;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_0
    const-string p1, "currencyType length must be 3 likes CNY so so"

    .line 48
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    const-string p1, "onCancelOrder: orderId could not be null or empty"

    .line 49
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, v0, p2}, Lcom/tendcloud/tenddata/zz;->b(Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 6

    .line 20
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tendcloud/tenddata/zz;->b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/af$ProfileType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 21
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 22
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 23
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onLogin: profileId could not be null or empty"

    .line 24
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLogin called --> profileId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cprofile is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , name is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_2

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/tendcloud/tenddata/zz$4;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p5

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/tendcloud/tenddata/zz$4;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/af$ProfileType;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 9

    .line 34
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Function startA was not executed correctly!"

    .line 35
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_4

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPay called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,orderid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,amount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,currencyType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,payType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    if-eqz p4, :cond_3

    .line 38
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    goto :goto_0

    .line 39
    :cond_2
    new-instance v8, Lcom/tendcloud/tenddata/zz$15;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/tendcloud/tenddata/zz$15;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    :goto_0
    const-string v0, "currencyType length must be 3 likes CNY so so"

    .line 40
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    const-string v0, "onPay: profileId could not be null or empty"

    .line 41
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_2
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 51
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 52
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onFavorite called --> category: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", content: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 54
    new-instance v0, Lcom/tendcloud/tenddata/zz$27;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$27;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 28
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 29
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 30
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onRegister: profileId could not be null or empty"

    .line 31
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onRegister called --> profileId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 33
    new-instance v0, Lcom/tendcloud/tenddata/zz$7;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/tendcloud/tenddata/zz$7;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 5
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 6
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "onReceiveDeepLink: url could not be null or empty"

    .line 8
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onReceiveDeepLink --> link: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 10
    new-instance v0, Lcom/tendcloud/tenddata/zz$25;

    invoke-direct {v0, p0, p1, p2}, Lcom/tendcloud/tenddata/zz$25;-><init>(Lcom/tendcloud/tenddata/zz;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 1

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/tendcloud/tenddata/zz;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/tendcloud/tenddata/a;",
            ")V"
        }
    .end annotation

    .line 12
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 13
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onShare called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", content: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", eventValue: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 15
    new-instance v0, Lcom/tendcloud/tenddata/zz$28;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/tendcloud/tenddata/zz$28;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 3
    :try_start_0
    sput-boolean p1, Lcom/tendcloud/tenddata/ab;->e:Z

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " setReportUncaughtExceptions: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 3
    :try_start_0
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez v0, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 4
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPunch called --> profileId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " punchId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 6
    new-instance v0, Lcom/tendcloud/tenddata/zz$29;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/tendcloud/tenddata/zz$29;-><init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public e(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;
    .locals 0

    .line 2
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/zz;->b:Z

    if-nez p1, :cond_0

    const-string p1, "Function startA was not executed correctly!"

    .line 3
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/df;->c()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sput-boolean v0, Lcom/tendcloud/tenddata/h;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public removeGlobalKV(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/zz;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "Function startA was not executed correctly!"

    .line 6
    .line 7
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->eForDeveloper(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "removeGlobalKV# key:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForDeveloper(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->d:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
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

.method public setCustomDataSwitch(Lcom/tendcloud/tenddata/TalkingDataSharingFilter;)V
    .locals 0

    sput-object p1, Lcom/tendcloud/tenddata/ab;->u:Lcom/tendcloud/tenddata/TalkingDataSharingFilter;

    return-void
.end method
