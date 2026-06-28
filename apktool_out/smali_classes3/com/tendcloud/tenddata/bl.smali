.class public Lcom/tendcloud/tenddata/bl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bl$a;,
        Lcom/tendcloud/tenddata/bl$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ScheduledThreadPoolExecutor; = null

.field private static final b:J = 0x7530L

.field private static c:J = 0x0L

.field private static d:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:J = 0x2L

.field private static volatile f:Lcom/tendcloud/tenddata/bl;

.field private static g:Z

.field private static h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->a()Lcom/tendcloud/tenddata/bl;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/z;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    const/4 v0, 0x0

    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Lcom/tendcloud/tenddata/bl;->g:Z

    .line 17
    .line 18
    sput-boolean v0, Lcom/tendcloud/tenddata/bl;->h:Z

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/bl;
    .locals 2

    .line 17
    sget-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    if-nez v0, :cond_1

    .line 18
    const-class v0, Lcom/tendcloud/tenddata/bl;

    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Lcom/tendcloud/tenddata/bl;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/bl;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    .line 21
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 22
    :cond_1
    :goto_0
    sget-object v0, Lcom/tendcloud/tenddata/bl;->f:Lcom/tendcloud/tenddata/bl;

    return-object v0
.end method

.method private a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 2
    sget-boolean v0, Lcom/tendcloud/tenddata/bl;->h:Z

    if-nez v0, :cond_2

    .line 3
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TalkingData SDK init...\n\tSDK_VERSION is: Android+TD+V5.0.28 gp Type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {}, Lcom/tendcloud/tenddata/ab;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  Build_Num:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "2596"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp ID is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp Channel is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp Custom is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\tSDK_OVC is: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "TDOVC+637ff1b24178b44f9d59753306b08a6f+SaaS"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    sget-boolean p2, Lcom/tendcloud/tenddata/ab;->b:Z

    if-nez p2, :cond_0

    sget-boolean p2, Lcom/tendcloud/tenddata/h;->a:Z

    if-eqz p2, :cond_1

    :cond_0
    const-string p2, "TDLog"

    .line 9
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 p1, 0x1

    .line 10
    sput-boolean p1, Lcom/tendcloud/tenddata/bl;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->d(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "[ModuleInit] current context is null..."

    .line 11
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 14
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 15
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    const-string v4, "android.permission.READ_PHONE_STATE"

    .line 16
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    return v0
.end method

.method static synthetic b()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->e()V

    return-void
.end method

.method static synthetic b(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->g(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method static synthetic c()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->h(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method static synthetic d()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/tendcloud/tenddata/bl;->c:J

    return-wide v0
.end method

.method private static d(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "TDFeatures is null..."

    .line 2
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lcom/tendcloud/tenddata/i;->b(JLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private static e()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/i;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/i;->setInitTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private static e(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/i;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long p0, v0, v2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    .line 6
    sput-boolean p0, Lcom/tendcloud/tenddata/y;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private static f()V
    .locals 9

    .line 6
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/bl;->c:J

    .line 7
    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Lcom/tendcloud/tenddata/bl$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/bl$b;-><init>(Lcom/tendcloud/tenddata/bl$1;)V

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v2, Lcom/tendcloud/tenddata/bl;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 8
    new-instance v3, Lcom/tendcloud/tenddata/bl$a;

    invoke-direct {v3, v1}, Lcom/tendcloud/tenddata/bl$a;-><init>(Lcom/tendcloud/tenddata/bl$1;)V

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x2

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static f(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 2
    new-instance v1, Lcom/tendcloud/tenddata/bl$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bl$1;-><init>(Lcom/tendcloud/tenddata/a;)V

    .line 3
    sget-wide v2, Lcom/tendcloud/tenddata/ab;->q:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->eForInternal(Ljava/lang/Throwable;)V

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/bl;->g(Lcom/tendcloud/tenddata/a;)V

    :goto_0
    return-void
.end method

.method private static g()V
    .locals 4

    .line 30
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "env"

    .line 31
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "getProp"

    .line 32
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 33
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const-string v2, "sysproperty"

    .line 34
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 36
    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 37
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static g(Lcom/tendcloud/tenddata/a;)V
    .locals 9

    const-string v0, "isDeclareIMEI"

    const-string v1, "targetAPI"

    if-nez p0, :cond_0

    :try_start_0
    const-string p0, "TDFeatures is null..."

    .line 1
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 3
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->a(Lcom/tendcloud/tenddata/a;)Z

    move-result v3

    const-string v4, "first"

    .line 4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v4, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "custom"

    .line 6
    sget-object v5, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/tendcloud/tenddata/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    :cond_1
    :try_start_1
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v4}, Lcom/tendcloud/tenddata/y;->c(Landroid/content/Context;)I

    move-result v4

    .line 8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "TRACKING"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "SDK"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    if-eqz v3, :cond_3

    .line 10
    sget-object v5, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v5}, Lcom/tendcloud/tenddata/bl;->a(Landroid/content/Context;)Z

    move-result v5

    .line 11
    sget-object v6, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v7, "android.permission.READ_PHONE_STATE"

    invoke-static {v6, v7}, Lcom/tendcloud/tenddata/y;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 12
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "isGetIMEI"

    .line 13
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_3

    if-nez v6, :cond_3

    const/16 v6, 0x17

    if-lt v4, v6, :cond_3

    .line 14
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    sput-object v6, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v1, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :catchall_0
    :cond_3
    :try_start_2
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    const-string v1, "app"

    .line 19
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "init"

    .line 20
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 21
    iput-object v2, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 22
    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    if-eqz v3, :cond_4

    .line 23
    new-instance v1, Lcom/tendcloud/tenddata/bl$2;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/bl$2;-><init>(Lcom/tendcloud/tenddata/a;)V

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    .line 24
    :cond_4
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 25
    :catchall_1
    :try_start_4
    new-instance v0, Lcom/tendcloud/tenddata/bu;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    .line 26
    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    .line 27
    sget-object p0, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    .line 28
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    if-eqz v3, :cond_5

    .line 29
    invoke-static {}, Lcom/tendcloud/tenddata/bl;->g()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_5
    return-void
.end method

.method private static h(Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/bv;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "app"

    .line 7
    .line 8
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "getIMEI"

    .line 11
    .line 12
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v1, Lcom/tendcloud/tenddata/bl;->d:Ljava/util/Map;

    .line 15
    .line 16
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p0, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 19
    .line 20
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lcom/tendcloud/tenddata/bu;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/tendcloud/tenddata/bu;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    .line 33
    .line 34
    sget-object p0, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    .line 35
    .line 36
    iput-object p0, v0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    .line 37
    .line 38
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lcom/tendcloud/tenddata/bl;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :catchall_0
    return-void
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
.method public final onTDEBEventInitEvent(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "apiType"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v2, "action"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 34
    .line 35
    const-string v3, "service"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/tendcloud/tenddata/a;

    .line 42
    .line 43
    const-string v3, "install"

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    const-string v4, "SDK"

    .line 50
    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    :try_start_1
    const-string v3, "deeplink"

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    :cond_1
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const-string v5, "TRACKING"

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string p1, "init"

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_7

    .line 91
    .line 92
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 93
    .line 94
    invoke-static {}, Lcom/tendcloud/tenddata/bp;->a()Lcom/tendcloud/tenddata/bp;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/tendcloud/tenddata/be;->a()Lcom/tendcloud/tenddata/be;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lcom/tendcloud/tenddata/bj;->a()Lcom/tendcloud/tenddata/bj;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/tendcloud/tenddata/bf;->a()Lcom/tendcloud/tenddata/bf;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lcom/tendcloud/tenddata/bn;->a()Lcom/tendcloud/tenddata/bn;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/tendcloud/tenddata/bg;->a()Lcom/tendcloud/tenddata/bg;

    .line 110
    .line 111
    .line 112
    invoke-static {}, Lcom/tendcloud/tenddata/bk;->a()Lcom/tendcloud/tenddata/bk;

    .line 113
    .line 114
    .line 115
    invoke-static {p1}, Lcom/tendcloud/tenddata/y;->a(Landroid/content/Context;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_3

    .line 120
    .line 121
    invoke-static {}, Lcom/tendcloud/tenddata/bd;->a()Lcom/tendcloud/tenddata/bd;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/bd;->b()V

    .line 126
    .line 127
    .line 128
    :cond_3
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->b:Z

    .line 129
    .line 130
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    invoke-direct {p0, p1, v2}, Lcom/tendcloud/tenddata/bl;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-static {v2}, Lcom/tendcloud/tenddata/bl;->e(Lcom/tendcloud/tenddata/a;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v2}, Lcom/tendcloud/tenddata/bl;->f(Lcom/tendcloud/tenddata/a;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    :goto_0
    new-instance v1, Lcom/tendcloud/tenddata/bv;

    .line 151
    .line 152
    invoke-direct {v1}, Lcom/tendcloud/tenddata/bv;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object v3, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 156
    .line 157
    const-string v4, "data"

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 164
    .line 165
    const-string v4, "domain"

    .line 166
    .line 167
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, v1, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    .line 176
    .line 177
    iput-object v0, v1, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    .line 178
    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    instance-of p1, v3, Ljava/util/Map;

    .line 182
    .line 183
    if-eqz p1, :cond_6

    .line 184
    .line 185
    check-cast v3, Ljava/util/Map;

    .line 186
    .line 187
    iput-object v3, v1, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    .line 188
    .line 189
    :cond_6
    iput-object v2, v1, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    .line 190
    .line 191
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1, v1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    .line 197
    .line 198
    :catchall_0
    :cond_7
    :goto_1
    return-void
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
.end method
