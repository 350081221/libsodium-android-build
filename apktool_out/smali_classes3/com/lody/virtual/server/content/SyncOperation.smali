.class public Lcom/lody/virtual/server/content/SyncOperation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final REASON_ACCOUNTS_UPDATED:I = -0x2

.field public static final REASON_BACKGROUND_DATA_SETTINGS_CHANGED:I = -0x1

.field public static final REASON_IS_SYNCABLE:I = -0x5

.field public static final REASON_MASTER_SYNC_AUTO:I = -0x7

.field private static REASON_NAMES:[Ljava/lang/String; = null

.field public static final REASON_PERIODIC:I = -0x4

.field public static final REASON_SERVICE_CHANGED:I = -0x3

.field public static final REASON_SYNC_AUTO:I = -0x6

.field public static final REASON_USER_START:I = -0x8


# instance fields
.field public final account:Landroid/accounts/Account;

.field public final allowParallelSyncs:Z

.field public final authority:Ljava/lang/String;

.field public backoff:Ljava/lang/Long;

.field public delayUntil:J

.field public effectiveRunTime:J

.field public expedited:Z

.field public extras:Landroid/os/Bundle;

.field public flexTime:J

.field public final key:Ljava/lang/String;

.field public latestRunTime:J

.field public pendingOperation:Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

.field public final reason:I

.field public final service:Landroid/content/ComponentName;

.field public syncSource:I

.field public final userId:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "DataSettingsChanged"

    .line 2
    .line 3
    const-string v1, "AccountsUpdated"

    .line 4
    .line 5
    const-string v2, "ServiceChanged"

    .line 6
    .line 7
    const-string v3, "Periodic"

    .line 8
    .line 9
    const-string v4, "IsSyncable"

    .line 10
    .line 11
    const-string v5, "AutoSync"

    .line 12
    .line 13
    const-string v6, "MasterSyncAuto"

    .line 14
    .line 15
    const-string v7, "UserStart"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/lody/virtual/server/content/SyncOperation;->REASON_NAMES:[Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;JJJJZ)V
    .locals 6

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 2
    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    move-object v1, p1

    .line 3
    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    move-object v1, p5

    .line 4
    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    move v1, p2

    .line 5
    iput v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    move v1, p3

    .line 6
    iput v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->reason:I

    move v1, p4

    .line 7
    iput v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->syncSource:I

    move/from16 v1, p15

    .line 8
    iput-boolean v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->allowParallelSyncs:Z

    .line 9
    new-instance v1, Landroid/os/Bundle;

    move-object v2, p6

    invoke-direct {v1, p6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 10
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/content/SyncOperation;->cleanBundle(Landroid/os/Bundle;)V

    move-wide/from16 v1, p13

    .line 11
    iput-wide v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->delayUntil:J

    .line 12
    invoke-static/range {p11 .. p12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, p7, v3

    if-ltz v5, :cond_1

    .line 14
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncOperation;->isExpedited()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 15
    iput-boolean v3, v0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    add-long/2addr v1, p7

    .line 16
    iput-wide v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    move-wide v1, p9

    .line 17
    iput-wide v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 18
    iput-boolean v5, v0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    .line 19
    iput-wide v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    .line 20
    iput-wide v3, v0, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    .line 21
    :goto_1
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncOperation;->updateEffectiveRunTime()V

    .line 22
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncOperation;->toKey()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/lody/virtual/server/content/SyncOperation;->key:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    .line 25
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 26
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 27
    iget v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 28
    iget v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->reason:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->reason:I

    .line 29
    iget v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->syncSource:I

    iput v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->syncSource:I

    .line 30
    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p1, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 31
    iget-boolean v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    const-wide/16 v0, 0x0

    .line 33
    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    .line 34
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    .line 35
    iget-boolean p1, p1, Lcom/lody/virtual/server/content/SyncOperation;->allowParallelSyncs:Z

    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncOperation;->allowParallelSyncs:Z

    .line 36
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncOperation;->updateEffectiveRunTime()V

    .line 37
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncOperation;->toKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncOperation;->key:Ljava/lang/String;

    return-void
.end method

.method private cleanBundle(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "upload"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "force"

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ignore_settings"

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ignore_backoff"

    .line 17
    .line 18
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "do_not_retry"

    .line 22
    .line 23
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "discard_deletions"

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "expedited"

    .line 32
    .line 33
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "deletions_override"

    .line 37
    .line 38
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "allow_metered"

    .line 42
    .line 43
    invoke-direct {p0, p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "expected_upload"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "expected_download"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
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

.method public static extrasToStringBuilder(Landroid/os/Bundle;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "="

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, " "

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "]"

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
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

.method public static reasonToString(Landroid/content/pm/PackageManager;I)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ltz p1, :cond_3

    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-ne v2, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    aget-object p0, v1, p0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_3
    neg-int p0, p1

    .line 37
    sub-int/2addr p0, v0

    .line 38
    sget-object v0, Lcom/lody/virtual/server/content/SyncOperation;->REASON_NAMES:[Ljava/lang/String;

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    if-lt p0, v1, :cond_4

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_4
    aget-object p0, v0, p0

    .line 49
    .line 50
    return-object p0
.end method

.method private removeFalseExtra(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
    .line 24
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
.end method

.method private toKey()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    .line 7
    .line 8
    const-string v2, "}"

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "authority: "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, " account {name="

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 33
    .line 34
    iget-object v3, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, ", user="

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v3, p0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v3, ", type="

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 55
    .line 56
    iget-object v3, v3, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string v1, "service {package="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, " user="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", class="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->service:Landroid/content/ComponentName;

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :goto_0
    const-string v1, " extras: "

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-static {v1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->extrasToStringBuilder(Landroid/os/Bundle;Ljava/lang/StringBuilder;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0
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
.method public compareTo(Ljava/lang/Object;)I
    .locals 10

    .line 1
    check-cast p1, Lcom/lody/virtual/server/content/SyncOperation;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    .line 4
    .line 5
    iget-boolean v1, p1, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, -0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move v2, v3

    .line 14
    :cond_0
    return v2

    .line 15
    :cond_1
    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->effectiveRunTime:J

    .line 16
    .line 17
    iget-wide v4, p0, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    .line 18
    .line 19
    sub-long/2addr v0, v4

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget-wide v6, p1, Lcom/lody/virtual/server/content/SyncOperation;->effectiveRunTime:J

    .line 27
    .line 28
    iget-wide v8, p1, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    .line 29
    .line 30
    sub-long/2addr v6, v8

    .line 31
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long p1, v0, v4

    .line 36
    .line 37
    if-gez p1, :cond_2

    .line 38
    .line 39
    return v3

    .line 40
    :cond_2
    cmp-long p1, v4, v0

    .line 41
    .line 42
    if-gez p1, :cond_3

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    return p1
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

.method public dump(Landroid/content/pm/PackageManager;Z)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 7
    .line 8
    iget-object v1, v1, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " u"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " ("

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 29
    .line 30
    iget-object v1, v1, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ")"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", "

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    sget-object v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->SOURCES:[Ljava/lang/String;

    .line 54
    .line 55
    iget v2, p0, Lcom/lody/virtual/server/content/SyncOperation;->syncSource:I

    .line 56
    .line 57
    aget-object v1, v1, v2

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", latestRunTime "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-wide v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-boolean v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    .line 73
    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    const-string v1, ", EXPEDITED"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_0
    const-string v1, ", reason: "

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget v1, p0, Lcom/lody/virtual/server/content/SyncOperation;->reason:I

    .line 87
    .line 88
    invoke-static {p1, v1}, Lcom/lody/virtual/server/content/SyncOperation;->reasonToString(Landroid/content/pm/PackageManager;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    if-nez p2, :cond_1

    .line 96
    .line 97
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_1

    .line 108
    .line 109
    const-string p1, "\n    "

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 115
    .line 116
    invoke-static {p1, v0}, Lcom/lody/virtual/server/content/SyncOperation;->extrasToStringBuilder(Landroid/os/Bundle;Ljava/lang/StringBuilder;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
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

.method public ignoreBackoff()Z
    .locals 3

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    const-string v1, "ignore_backoff"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isExpedited()Z
    .locals 3

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    const-string v1, "expedited"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->expedited:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public isInitialization()Z
    .locals 3

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    const-string v1, "initialize"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isMeteredDisallowed()Z
    .locals 3

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    const-string v1, "allow_metered"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/server/content/SyncOperation;->dump(Landroid/content/pm/PackageManager;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateEffectiveRunTime()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncOperation;->ignoreBackoff()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->latestRunTime:J

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/lody/virtual/server/content/SyncOperation;->delayUntil:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_0
    iput-wide v0, p0, Lcom/lody/virtual/server/content/SyncOperation;->effectiveRunTime:J

    .line 29
    .line 30
    return-void
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
