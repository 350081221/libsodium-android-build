.class public Lcom/umeng/commonsdk/framework/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/framework/a$a;
    }
.end annotation


# static fields
.field private static a:Landroid/os/HandlerThread; = null

.field private static b:Landroid/os/Handler; = null

.field private static c:Landroid/os/Handler; = null

.field private static final d:I = 0xc8

.field private static final e:I = 0x111

.field private static final f:I = 0x112

.field private static final g:I = 0x200

.field private static final h:I = 0x301

.field private static i:Lcom/umeng/commonsdk/framework/a$a; = null

.field private static j:Landroid/net/ConnectivityManager; = null

.field private static k:Landroid/content/IntentFilter; = null

.field private static volatile l:Z = false

.field private static m:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/umeng/commonsdk/framework/UMSenderStateNotify;",
            ">;"
        }
    .end annotation
.end field

.field private static n:Ljava/lang/Object; = null

.field private static o:Ljava/util/concurrent/locks/ReentrantLock; = null

.field private static final p:Ljava/lang/String; = "report_policy"

.field private static final q:Ljava/lang/String; = "report_interval"

.field private static r:Z = false

.field private static final s:I = 0xf

.field private static final t:I = 0x3

.field private static final u:I = 0x5a

.field private static v:I

.field private static w:Ljava/lang/Object;

.field private static x:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 17
    .line 18
    const/16 v0, 0xf

    .line 19
    .line 20
    sput v0, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const-string v1, "connectivity"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 42
    .line 43
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 44
    .line 45
    :cond_0
    new-instance v0, Lcom/umeng/commonsdk/framework/a$2;

    .line 46
    .line 47
    invoke-direct {v0}, Lcom/umeng/commonsdk/framework/a$2;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

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

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const-string v1, "connectivity"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 23
    .line 24
    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    :cond_0
    sput-object p2, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    .line 27
    .line 28
    :try_start_0
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 29
    .line 30
    if-nez p2, :cond_3

    .line 31
    .line 32
    new-instance p2, Landroid/os/HandlerThread;

    .line 33
    .line 34
    const-string v0, "NetWorkSender"

    .line 35
    .line 36
    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object p2, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 42
    .line 43
    .line 44
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->i:Lcom/umeng/commonsdk/framework/a$a;

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    new-instance p2, Lcom/umeng/commonsdk/framework/a$a;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {p2, v0}, Lcom/umeng/commonsdk/framework/a$a;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object p2, Lcom/umeng/commonsdk/framework/a;->i:Lcom/umeng/commonsdk/framework/a$a;

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/os/FileObserver;->startWatching()V

    .line 60
    .line 61
    .line 62
    const-string p2, "--->>> FileMonitor has already started!"

    .line 63
    .line 64
    invoke-static {p2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-direct {p0}, Lcom/umeng/commonsdk/framework/a;->j()V

    .line 68
    .line 69
    .line 70
    sget-object p2, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 71
    .line 72
    if-nez p2, :cond_2

    .line 73
    .line 74
    new-instance p2, Lcom/umeng/commonsdk/framework/a$3;

    .line 75
    .line 76
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p2, p0, v0}, Lcom/umeng/commonsdk/framework/a$3;-><init>(Lcom/umeng/commonsdk/framework/a;Landroid/os/Looper;)V

    .line 83
    .line 84
    .line 85
    sput-object p2, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 86
    .line 87
    :cond_2
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-string v0, "report_policy"

    .line 92
    .line 93
    invoke-virtual {p2, v0, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    const-string v0, "report_interval"

    .line 101
    .line 102
    invoke-virtual {p2, v0, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception p2

    .line 107
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_0
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method static synthetic a(I)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/a;->c(I)V

    return-void
.end method

.method private static a(II)V
    .locals 3

    .line 35
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeMessages(I)V

    .line 37
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 38
    iput p0, v0, Landroid/os/Message;->what:I

    .line 39
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    int-to-long v1, p1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method private static a(IJ)V
    .locals 2

    .line 30
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 31
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 32
    iput p0, v0, Landroid/os/Message;->what:I

    .line 33
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--->>> sendMsgDelayed: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "MobclickRT"

    invoke-static {v1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    const-string v0, "connectivity"

    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    const-string v0, "MobclickRT"

    const-string v1, "--->>> createCMIfNeeded:\u6ce8\u518c\u7f51\u7edc\u72b6\u6001\u76d1\u542c\u5668\u3002"

    .line 4
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/umeng/commonsdk/framework/UMSenderStateNotify;)V
    .locals 3

    .line 6
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    :cond_0
    if-eqz p0, :cond_3

    const/4 v1, 0x0

    .line 9
    :goto_0
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 10
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_1

    const-string p0, "MobclickRT"

    const-string v1, "--->>> addConnStateObserver: input item has exist."

    .line 11
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 13
    :cond_2
    :try_start_2
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 14
    :try_start_3
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 15
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0
.end method

.method public static a(Z)V
    .locals 3

    .line 19
    sput-boolean p0, Lcom/umeng/commonsdk/framework/a;->l:Z

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 20
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    monitor-enter p0

    .line 21
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 23
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;

    invoke-interface {v2}, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;->onConnectionAvailable()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 24
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p0, "MobclickRT"

    const-string v0, "\u7f51\u7edc\u72b6\u6001\u901a\u77e5\uff1a\u5c1d\u8bd5\u53d1\u9001 MSG_PROCESS_NEXT"

    .line 25
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->d()V

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    const-string p0, "--->>> network disconnected."

    .line 28
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 29
    sput-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    :goto_1
    return-void
.end method

.method public static a()Z
    .locals 2

    .line 16
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 17
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static b()I
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget v1, Lcom/umeng/commonsdk/framework/a;->v:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static b(I)V
    .locals 1

    .line 25
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {v0, p0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 28
    iput p0, v0, Landroid/os/Message;->what:I

    .line 29
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "MissingPermission"
        }
    .end annotation

    const-string v0, "MobclickRT"

    if-nez p0, :cond_0

    const-string p0, "--->>> registerNetReceiver: context is null, registerNetReceiver failed."

    .line 4
    invoke-static {v0, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    const-string v3, "--->>> ACCESS_NETWORK_STATE permission access denied."

    const-string v4, "android.permission.ACCESS_NETWORK_STATE"

    if-lt v1, v2, :cond_2

    .line 6
    invoke-static {p0, v4}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    const/4 v2, 0x1

    .line 9
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    .line 11
    sget-object v2, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v2, :cond_4

    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v2, "--->>> \u6ce8\u518c\u7f51\u7edc\u72b6\u6001\u76d1\u542c\u5668:registerNetworkCallback"

    .line 13
    invoke-static {v0, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    new-instance v2, Lcom/umeng/commonsdk/framework/a$1;

    invoke-direct {v2, p0}, Lcom/umeng/commonsdk/framework/a$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-static {v0, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-static {p0, v4}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->j:Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_4

    .line 18
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    if-nez v1, :cond_4

    .line 19
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    sput-object v1, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 20
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 21
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_4

    const-string v1, "--->>> \u6ce8\u518c\u7f51\u7edc\u72b6\u6001\u76d1\u542c\u5668:registerReceiver"

    .line 22
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->x:Landroid/content/BroadcastReceiver;

    sget-object v1, Lcom/umeng/commonsdk/framework/a;->k:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0

    .line 24
    :cond_3
    invoke-static {v0, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public static c()V
    .locals 0

    return-void
.end method

.method private static c(I)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/umeng/commonsdk/framework/a;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput p0, v0, Landroid/os/Message;->what:I

    .line 14
    .line 15
    sget-object p0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static d()V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x111

    .line 10
    .line 11
    :try_start_0
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_0
    :goto_0
    return-void
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

.method public static e()V
    .locals 2

    const/16 v0, 0x112

    const/16 v1, 0xbb8

    invoke-static {v0, v1}, Lcom/umeng/commonsdk/framework/a;->a(II)V

    return-void
.end method

.method static synthetic f()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/framework/a;->o:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method static synthetic g()V
    .locals 0

    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->n()V

    return-void
.end method

.method static synthetic h()V
    .locals 0

    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->m()V

    return-void
.end method

.method static synthetic i()V
    .locals 0

    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->l()V

    return-void
.end method

.method private j()V
    .locals 6

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "report_policy"

    .line 9
    .line 10
    const-string v3, ""

    .line 11
    .line 12
    invoke-static {v1, v2, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "11"

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const-string v1, "MobclickRT"

    .line 25
    .line 26
    const-string v2, "--->>> switch to report_policy 11"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    sput v1, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 37
    .line 38
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "report_interval"

    .line 43
    .line 44
    const-string v4, "15"

    .line 45
    .line 46
    invoke-static {v2, v3, v4}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const-string v3, "MobclickRT"

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v5, "--->>> set report_interval value to: "

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v3, v4}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x3

    .line 81
    if-lt v2, v3, :cond_1

    .line 82
    .line 83
    const/16 v3, 0x5a

    .line 84
    .line 85
    if-le v2, v3, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    mul-int/lit16 v2, v2, 0x3e8

    .line 89
    .line 90
    sput v2, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :goto_0
    sput v1, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const/4 v1, 0x0

    .line 97
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 98
    .line 99
    :goto_1
    monitor-exit v0

    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception v1

    .line 102
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    throw v1
    .line 104
    .line 105
    .line 106
.end method

.method private static k()V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->a:Landroid/os/HandlerThread;

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->b:Landroid/os/Handler;

    .line 13
    .line 14
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sput-object v1, Lcom/umeng/commonsdk/framework/a;->c:Landroid/os/Handler;

    .line 19
    .line 20
    :cond_2
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private static l()V
    .locals 4

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    sget-object v3, Lcom/umeng/commonsdk/framework/a;->m:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;

    .line 24
    .line 25
    invoke-interface {v3}, Lcom/umeng/commonsdk/framework/UMSenderStateNotify;->onSenderIdle()V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    monitor-exit v0

    .line 32
    return-void

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

.method private static m()V
    .locals 0

    return-void
.end method

.method private static n()V
    .locals 7

    .line 1
    const-string v0, "]."

    .line 2
    .line 3
    const-string v1, "--->>> handleProcessNext: Enter..."

    .line 4
    .line 5
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Lcom/umeng/commonsdk/framework/a;->l:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :try_start_0
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/UMFrUtils;->envelopeFileNumber(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-lez v2, :cond_4

    .line 22
    .line 23
    const-string v2, "--->>> The envelope file exists."

    .line 24
    .line 25
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/UMFrUtils;->envelopeFileNumber(Landroid/content/Context;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0xc8

    .line 33
    .line 34
    if-le v2, v3, :cond_1

    .line 35
    .line 36
    const-string v2, "--->>> Number of envelope files is greater than 200, remove old files first."

    .line 37
    .line 38
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeRedundantEnvelopeFiles(Landroid/content/Context;I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeFile(Landroid/content/Context;)Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v5, "--->>> Ready to send envelope file ["

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "MobclickRT"

    .line 78
    .line 79
    new-instance v5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v6, "--->>> send envelope file [ "

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v4, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/umeng/commonsdk/statistics/c;

    .line 103
    .line 104
    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/statistics/c;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, Lcom/umeng/commonsdk/statistics/c;->a(Ljava/io/File;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    const-string v0, "--->>> Send envelope file success, delete it."

    .line 114
    .line 115
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeEnvelopeFile(Ljava/io/File;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    const-string v0, "--->>> Failed to delete already processed file. We try again after delete failed."

    .line 125
    .line 126
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->removeEnvelopeFile(Ljava/io/File;)Z

    .line 130
    .line 131
    .line 132
    :cond_2
    const/16 v0, 0x111

    .line 133
    .line 134
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->c(I)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    const-string v0, "--->>> Send envelope file failed, abandon and wait next trigger!"

    .line 139
    .line 140
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_4
    invoke-static {}, Lcom/umeng/commonsdk/framework/a;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    return-void
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method


# virtual methods
.method public onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/a;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "report_policy"

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-string v1, "11"

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const-string v1, "MobclickRT"

    .line 21
    .line 22
    const-string v2, "--->>> switch to report_policy 11"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    sput-boolean v1, Lcom/umeng/commonsdk/framework/a;->r:Z

    .line 33
    .line 34
    :cond_1
    :goto_0
    const-string v1, "report_interval"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const-string p2, "MobclickRT"

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "--->>> set report_interval value to: "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p2, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p2, 0x3

    .line 73
    if-lt p1, p2, :cond_3

    .line 74
    .line 75
    const/16 p2, 0x5a

    .line 76
    .line 77
    if-le p1, p2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    mul-int/lit16 p1, p1, 0x3e8

    .line 81
    .line 82
    sput p1, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    const/16 p1, 0x3a98

    .line 86
    .line 87
    sput p1, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 88
    .line 89
    :goto_2
    const-string p1, "MobclickRT"

    .line 90
    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v1, "--->>> really set report_interval value to: "

    .line 97
    .line 98
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    sget v1, Lcom/umeng/commonsdk/framework/a;->v:I

    .line 102
    .line 103
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    monitor-exit v0

    .line 114
    return-void

    .line 115
    :catchall_0
    move-exception p1

    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    throw p1
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
