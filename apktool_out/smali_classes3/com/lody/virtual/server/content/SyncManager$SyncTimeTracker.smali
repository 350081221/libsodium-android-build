.class Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/server/content/SyncManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SyncTimeTracker"
.end annotation


# instance fields
.field mLastWasSyncing:Z

.field private mTimeSpentSyncing:J

.field mWhenSyncStarted:J

.field final synthetic this$0:Lcom/lody/virtual/server/content/SyncManager;


# direct methods
.method private constructor <init>(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mLastWasSyncing:Z

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mWhenSyncStarted:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized timeSpentSyncing()J
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mLastWasSyncing:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mTimeSpentSyncing:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mTimeSpentSyncing:J

    .line 15
    .line 16
    iget-wide v4, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mWhenSyncStarted:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    sub-long/2addr v0, v4

    .line 19
    add-long/2addr v2, v0

    .line 20
    monitor-exit p0

    .line 21
    return-wide v2

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    monitor-exit p0

    .line 24
    throw v0
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

.method public declared-synchronized update()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->this$0:Lcom/lody/virtual/server/content/SyncManager;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/lody/virtual/server/content/SyncManager;->mActiveSyncContexts:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-boolean v1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mLastWasSyncing:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput-wide v1, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mWhenSyncStarted:J

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget-wide v3, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mTimeSpentSyncing:J

    .line 31
    .line 32
    iget-wide v5, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mWhenSyncStarted:J

    .line 33
    .line 34
    sub-long/2addr v1, v5

    .line 35
    add-long/2addr v3, v1

    .line 36
    iput-wide v3, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mTimeSpentSyncing:J

    .line 37
    .line 38
    :goto_1
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;->mLastWasSyncing:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    monitor-exit p0

    .line 44
    throw v0
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
