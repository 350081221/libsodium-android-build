.class public abstract Lcom/umeng/commonsdk/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:I = 0x1


# instance fields
.field private final a:J

.field private final b:J

.field private c:J

.field private d:Z

.field private f:Landroid/os/HandlerThread;

.field private g:Landroid/os/Handler;

.field private h:Landroid/os/Handler$Callback;


# direct methods
.method public constructor <init>(JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 6
    .line 7
    new-instance v0, Lcom/umeng/commonsdk/utils/a$1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/utils/a$1;-><init>(Lcom/umeng/commonsdk/utils/a;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    .line 15
    .line 16
    iput-wide p3, p0, Lcom/umeng/commonsdk/utils/a;->b:J

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/umeng/commonsdk/utils/a;->d()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    new-instance p1, Landroid/os/HandlerThread;

    .line 25
    .line 26
    const-string p2, "CountDownTimerThread"

    .line 27
    .line 28
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroid/os/Handler;

    .line 37
    .line 38
    iget-object p2, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object p3, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    .line 45
    .line 46
    invoke-direct {p1, p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p1, Landroid/os/Handler;

    .line 53
    .line 54
    iget-object p2, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    .line 55
    .line 56
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    .line 60
    .line 61
    :goto_0
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
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

.method static synthetic a(Lcom/umeng/commonsdk/utils/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    return p0
.end method

.method static synthetic b(Lcom/umeng/commonsdk/utils/a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->c:J

    return-wide v0
.end method

.method static synthetic c(Lcom/umeng/commonsdk/utils/a;)Landroid/os/HandlerThread;
    .locals 0

    iget-object p0, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    return-object p0
.end method

.method static synthetic d(Lcom/umeng/commonsdk/utils/a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->b:J

    return-wide v0
.end method

.method private d()Z
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/umeng/commonsdk/utils/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x1

    .line 2
    :try_start_0
    iput-boolean v0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 3
    iget-object v1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public abstract a(J)V
.end method

.method public final declared-synchronized b()Lcom/umeng/commonsdk/utils/a;
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iput-boolean v0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 3
    iget-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/umeng/commonsdk/utils/a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-object p0

    .line 6
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->c:J

    .line 7
    iget-object v0, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public abstract c()V
.end method
