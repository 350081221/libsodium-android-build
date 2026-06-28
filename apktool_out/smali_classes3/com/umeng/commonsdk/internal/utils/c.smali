.class public Lcom/umeng/commonsdk/internal/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/internal/utils/c$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "BatteryUtils"

.field private static b:Z = false

.field private static c:Landroid/content/Context;


# instance fields
.field private d:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/umeng/commonsdk/internal/utils/c$1;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/utils/c$1;-><init>(Lcom/umeng/commonsdk/internal/utils/c;)V

    iput-object v0, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/commonsdk/internal/utils/c$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/utils/c;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/utils/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 3
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/c$a;->a()Lcom/umeng/commonsdk/internal/utils/c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 1

    monitor-enter p0

    .line 4
    :try_start_0
    sget-boolean v0, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    .line 3
    .line 4
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    sput-boolean v0, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    sget-object v1, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :goto_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_1
    move-exception v0

    .line 32
    monitor-exit p0

    .line 33
    throw v0
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

.method public declared-synchronized c()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/c;->d:Landroid/content/BroadcastReceiver;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/umeng/commonsdk/internal/utils/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    sget-object v1, Lcom/umeng/commonsdk/internal/utils/c;->c:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_1
    move-exception v0

    .line 22
    monitor-exit p0

    .line 23
    throw v0
.end method
