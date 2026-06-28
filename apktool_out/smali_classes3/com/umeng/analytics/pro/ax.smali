.class public Lcom/umeng/analytics/pro/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/av;


# static fields
.field private static final a:Ljava/lang/String; = "Coolpad"

.field private static final b:Ljava/lang/String; = "com.coolpad.deviceidsupport"

.field private static final c:Ljava/lang/String; = "com.coolpad.deviceidsupport.DeviceIdService"

.field private static d:Lcom/umeng/analytics/pro/a;


# instance fields
.field private e:Ljava/lang/String;

.field private f:Ljava/util/concurrent/CountDownLatch;

.field private g:Landroid/content/Context;

.field private final h:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/umeng/analytics/pro/ax;->e:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Lcom/umeng/analytics/pro/ax$1;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/umeng/analytics/pro/ax$1;-><init>(Lcom/umeng/analytics/pro/ax;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/umeng/analytics/pro/ax;->h:Landroid/content/ServiceConnection;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic a(Lcom/umeng/analytics/pro/ax;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/analytics/pro/ax;->g:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic a()Lcom/umeng/analytics/pro/a;
    .locals 1

    .line 2
    sget-object v0, Lcom/umeng/analytics/pro/ax;->d:Lcom/umeng/analytics/pro/a;

    return-object v0
.end method

.method static synthetic a(Lcom/umeng/analytics/pro/a;)Lcom/umeng/analytics/pro/a;
    .locals 0

    .line 3
    sput-object p0, Lcom/umeng/analytics/pro/ax;->d:Lcom/umeng/analytics/pro/a;

    return-object p0
.end method

.method static synthetic a(Lcom/umeng/analytics/pro/ax;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/ax;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/umeng/analytics/pro/ax;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/analytics/pro/ax;->e:Ljava/lang/String;

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 5

    const-string v0, "Coolpad"

    .line 2
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 3
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.coolpad.deviceidsupport"

    const-string v4, "com.coolpad.deviceidsupport.DeviceIdService"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 5
    iget-object v2, p0, Lcom/umeng/analytics/pro/ax;->h:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "bindService return false"

    .line 6
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService failed. e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object p1, p0, Lcom/umeng/analytics/pro/ax;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/umeng/analytics/pro/ax;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/analytics/pro/ax;->f:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method private c(Landroid/content/Context;)V
    .locals 3

    const-string v0, "Coolpad"

    :try_start_0
    const-string v1, "call unbindService."

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v1, p0, Lcom/umeng/analytics/pro/ax;->h:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unbindService failed. e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const-string v0, "Coolpad"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iput-object v2, p0, Lcom/umeng/analytics/pro/ax;->g:Landroid/content/Context;

    .line 6
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v2, p0, Lcom/umeng/analytics/pro/ax;->f:Ljava/util/concurrent/CountDownLatch;

    .line 7
    :try_start_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ax;->b(Landroid/content/Context;)V

    .line 8
    iget-object v2, p0, Lcom/umeng/analytics/pro/ax;->f:Ljava/util/concurrent/CountDownLatch;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v4, v5, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "getOAID time-out"

    .line 9
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ax;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ax;->c(Landroid/content/Context;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 12
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getOAID interrupted. e="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ax;->c(Landroid/content/Context;)V

    return-object v1

    :goto_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ax;->c(Landroid/content/Context;)V

    .line 14
    throw v0
.end method
