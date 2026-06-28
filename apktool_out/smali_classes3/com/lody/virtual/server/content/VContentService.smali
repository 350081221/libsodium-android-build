.class public final Lcom/lody/virtual/server/content/VContentService;
.super Lcom/lody/virtual/server/interfaces/IContentService$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/content/VContentService$ObserverNode;,
        Lcom/lody/virtual/server/content/VContentService$ObserverCall;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ContentService"

.field private static final sInstance:Lcom/lody/virtual/server/content/VContentService;


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

.field private mSyncManager:Lcom/lody/virtual/server/content/SyncManager;

.field private final mSyncManagerLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/content/VContentService;

    invoke-direct {v0}, Lcom/lody/virtual/server/content/VContentService;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/content/VContentService;->sInstance:Lcom/lody/virtual/server/content/VContentService;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IContentService$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/lody/virtual/server/content/VContentService$ObserverNode;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManager:Lcom/lody/virtual/server/content/SyncManager;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManagerLock:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mContext:Landroid/content/Context;

    .line 32
    .line 33
    return-void
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

.method public static get()Lcom/lody/virtual/server/content/VContentService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/content/VContentService;->sInstance:Lcom/lody/virtual/server/content/VContentService;

    return-object v0
.end method

.method private getSyncManager()Lcom/lody/virtual/server/content/SyncManager;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManagerLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManager:Lcom/lody/virtual/server/content/SyncManager;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/lody/virtual/server/content/SyncManager;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/lody/virtual/server/content/VContentService;->mContext:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lcom/lody/virtual/server/content/SyncManager;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManager:Lcom/lody/virtual/server/content/SyncManager;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :catch_0
    move-exception v1

    .line 21
    :try_start_1
    const-string v2, "ContentService"

    .line 22
    .line 23
    const-string v3, "Can\'t create SyncManager"

    .line 24
    .line 25
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/VContentService;->mSyncManager:Lcom/lody/virtual/server/content/SyncManager;

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-object v1

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
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

.method public static systemReady()V
    .locals 1

    invoke-static {}, Lcom/lody/virtual/server/content/VContentService;->get()Lcom/lody/virtual/server/content/VContentService;

    move-result-object v0

    invoke-direct {v0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    return-void
.end method


# virtual methods
.method public addPeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 10

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide/16 v1, 0x3c

    .line 14
    .line 15
    cmp-long v3, p4, v1

    .line 16
    .line 17
    if-gez v3, :cond_0

    .line 18
    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "Requested poll frequency of "

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p4, " seconds being rounded up to 60 seconds."

    .line 33
    .line 34
    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    const/4 p5, 0x0

    .line 42
    new-array p5, p5, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v3, "ContentService"

    .line 45
    .line 46
    invoke-static {v3, p4, p5}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-wide p4, v1

    .line 50
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    :try_start_0
    new-instance v3, Landroid/content/PeriodicSync;

    .line 55
    .line 56
    move-object v4, v3

    .line 57
    move-object v5, p1

    .line 58
    move-object v6, p2

    .line 59
    move-object v7, p3

    .line 60
    move-wide v8, p4

    .line 61
    invoke-direct/range {v4 .. v9}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 65
    .line 66
    invoke-static {p4, p5}, Lcom/lody/virtual/server/content/SyncStorageEngine;->calculateDefaultFlexTime(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p2

    .line 70
    invoke-virtual {p1, v3, p2, p3}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, v3, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->addPeriodicSync(Landroid/content/PeriodicSync;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    const-string p2, "Authority must not be empty."

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string p2, "Account must not be null"

    .line 104
    .line 105
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1
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
.end method

.method public addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, p1, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public cancelSync(Landroid/accounts/Account;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string p2, "Authority must be non-empty"

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncManager;->clearScheduledSyncOperations(Landroid/accounts/Account;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncManager;->cancelActiveSync(Landroid/accounts/Account;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public getCurrentSyncs()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/SyncInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncsCopy(I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lcom/lody/virtual/server/content/VSyncInfo;

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/lody/virtual/server/content/VSyncInfo;->toSyncInfo()Landroid/content/SyncInfo;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 60
    .line 61
    .line 62
    throw v0
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

.method public getIsSyncable(Landroid/accounts/Account;Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncManager;->getIsSyncable(Landroid/accounts/Account;ILjava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 20
    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 24
    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    return p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 30
    .line 31
    .line 32
    throw p1
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

.method public getMasterSyncAutomatically()Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getMasterSyncAutomatically(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 24
    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    return v0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method public getPeriodicSyncs(Landroid/accounts/Account;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/PeriodicSync;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getPeriodicSyncs(Landroid/accounts/Account;ILjava/lang/String;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string p2, "Authority must not be empty"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string p2, "Account must not be null"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
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

.method public getSyncAdapterTypes()[Landroid/content/SyncAdapterType;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lcom/lody/virtual/server/content/SyncManager;->getSyncAdapterTypes()[Landroid/content/SyncAdapterType;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 22
    .line 23
    .line 24
    throw v2
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

.method public getSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getSyncAutomatically(Landroid/accounts/Account;ILjava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 24
    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw p1
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

.method public getSyncStatus(Landroid/accounts/Account;Ljava/lang/String;)Landroid/content/SyncStatusInfo;
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getStatusByAccountAndAuthority(Landroid/accounts/Account;ILjava/lang/String;)Landroid/content/SyncStatusInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    return-object p1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p2, "Authority must not be empty"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public isSyncActive(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->isSyncActive(Landroid/accounts/Account;ILjava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 24
    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw p1
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

.method public isSyncPending(Landroid/accounts/Account;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1, v0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->isSyncPending(Landroid/accounts/Account;ILjava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 24
    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw p1
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

.method public notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZ)V
    .locals 6

    .line 31
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 32
    invoke-virtual/range {v0 .. v5}, Lcom/lody/virtual/server/content/VContentService;->notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZI)V

    return-void
.end method

.method public notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZI)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v9, p4

    move/from16 v10, p5

    const-string v2, "ContentService"

    const/4 v11, 0x2

    .line 1
    invoke-static {v2, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "ContentService"

    .line 2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Notifying update of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for user "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " from observer "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, p2

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", syncToNetwork "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    .line 3
    :goto_0
    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    move-result v12

    .line 4
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v13

    .line 5
    :try_start_0
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v8, v1, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 7
    :try_start_1
    iget-object v2, v1, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p5

    move-object/from16 v16, v8

    move-object v8, v15

    :try_start_2
    invoke-virtual/range {v2 .. v8}, Lcom/lody/virtual/server/content/VContentService$ObserverNode;->collectObserversLocked(Landroid/net/Uri;ILandroid/database/IContentObserver;ZILjava/util/ArrayList;)V

    .line 8
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 9
    :try_start_3
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_4

    .line 10
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 11
    :try_start_4
    iget-object v6, v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;->mObserver:Landroid/database/IContentObserver;

    iget-boolean v7, v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;->mSelfChange:Z

    invoke-interface {v6, v7, v0, v10}, Landroid/database/IContentObserver;->onChange(ZLandroid/net/Uri;I)V

    const-string v6, "ContentService"

    .line 12
    invoke-static {v6, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "ContentService"

    .line 13
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Notified "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;->mObserver:Landroid/database/IContentObserver;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " of update at "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    .line 14
    :catch_0
    :try_start_5
    iget-object v6, v1, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    monitor-enter v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    const-string v7, "ContentService"

    const-string v8, "Found dead observer, removing"

    .line 15
    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    iget-object v7, v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;->mObserver:Landroid/database/IContentObserver;

    invoke-interface {v7}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v7

    .line 17
    iget-object v5, v5, Lcom/lody/virtual/server/content/VContentService$ObserverCall;->mNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 18
    invoke-static {v5}, Lcom/lody/virtual/server/content/VContentService$ObserverNode;->access$000(Lcom/lody/virtual/server/content/VContentService$ObserverNode;)Ljava/util/ArrayList;

    move-result-object v5

    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v8, :cond_2

    .line 20
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lcom/lody/virtual/server/content/VContentService$ObserverNode$ObserverEntry;

    .line 21
    iget-object v11, v11, Lcom/lody/virtual/server/content/VContentService$ObserverNode$ObserverEntry;->observer:Landroid/database/IContentObserver;

    invoke-interface {v11}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v11

    if-ne v11, v7, :cond_1

    .line 22
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v8, v8, -0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    const/4 v11, 0x2

    goto :goto_2

    .line 23
    :cond_2
    monitor-exit v6

    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    const/4 v11, 0x2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v0

    :cond_4
    if-eqz v9, :cond_5

    .line 24
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 25
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3, v10, v12, v0}, Lcom/lody/virtual/server/content/SyncManager;->scheduleLocalSync(Landroid/accounts/Account;IILjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 27
    :cond_5
    invoke-static {v13, v14}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object/from16 v16, v8

    .line 28
    :goto_4
    :try_start_8
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    move-exception v0

    .line 29
    invoke-static {v13, v14}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 30
    throw v0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/interfaces/IContentService$Stub;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    instance-of p2, p1, Ljava/lang/SecurityException;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    .line 13
    .line 14
    :cond_0
    throw p1
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
.end method

.method public registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;)V
    .locals 1

    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    move-result v0

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/lody/virtual/server/content/VContentService;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;I)V

    return-void
.end method

.method public registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;I)V
    .locals 9

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v5, p0, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 3
    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    move-result v6

    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingPid()I

    move-result v7

    move-object v1, v5

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v8, p4

    .line 4
    invoke-virtual/range {v1 .. v8}, Lcom/lody/virtual/server/content/VContentService$ObserverNode;->addObserverLocked(Landroid/net/Uri;Landroid/database/IContentObserver;ZLjava/lang/Object;III)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must pass a valid uri and observer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removePeriodicSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 10

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    :try_start_0
    new-instance v9, Landroid/content/PeriodicSync;

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    move-object v3, v9

    .line 22
    move-object v4, p1

    .line 23
    move-object v5, p2

    .line 24
    move-object v6, p3

    .line 25
    invoke-direct/range {v3 .. v8}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v9, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->removePeriodicSync(Landroid/content/PeriodicSync;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string p2, "Authority must not be empty"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string p2, "Account must not be null"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
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
.end method

.method public removeStatusChangeListener(Landroid/content/ISyncStatusObserver;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->removeStatusChangeListener(Landroid/content/ISyncStatusObserver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 26
    .line 27
    .line 28
    throw p1
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
.end method

.method public requestSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-static/range {p3 .. p3}, Landroid/content/ContentResolver;->validateSyncExtrasBundle(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 13
    .line 14
    .line 15
    move-result-wide v12

    .line 16
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    move-object v2, p1

    .line 28
    move-object/from16 v5, p2

    .line 29
    .line 30
    move-object/from16 v6, p3

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v11}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-static {v12, v13}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    invoke-static {v12, v13}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 41
    .line 42
    .line 43
    throw v0
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
.end method

.method public setIsSyncable(Landroid/accounts/Account;Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p1, v0, p2, p3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setIsSyncable(Landroid/accounts/Account;ILjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p2, "Authority must not be empty"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
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
.end method

.method public setMasterSyncAutomatically(Z)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setMasterSyncAutomatically(ZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.end method

.method public setSyncAutomatically(Landroid/accounts/Account;Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p1, v0, p2, p3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setSyncAutomatically(Landroid/accounts/Account;ILjava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p2, "Authority must be non-empty"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
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
.end method

.method public sync(Landroid/content/SyncRequest;)V
    .locals 14

    .line 1
    sget-object v0, Lmirror/android/content/SyncRequest;->mExtras:Lmirror/RefObject;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v6, v0

    .line 8
    check-cast v6, Landroid/os/Bundle;

    .line 9
    .line 10
    sget-object v0, Lmirror/android/content/SyncRequest;->mSyncFlexTimeSecs:Lmirror/RefLong;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v7

    .line 16
    sget-object v0, Lmirror/android/content/SyncRequest;->mSyncRunTimeSecs:Lmirror/RefLong;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {}, Lcom/lody/virtual/os/VUserHandle;->getCallingUserId()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-static {}, Lcom/lody/virtual/os/VBinder;->getCallingUid()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object v3, Lmirror/android/content/SyncRequest;->mAccountToSync:Lmirror/RefObject;

    .line 41
    .line 42
    invoke-virtual {v3, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/accounts/Account;

    .line 47
    .line 48
    sget-object v5, Lmirror/android/content/SyncRequest;->mAuthority:Lmirror/RefObject;

    .line 49
    .line 50
    invoke-virtual {v5, p1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    sget-object v10, Lmirror/android/content/SyncRequest;->mIsPeriodic:Lmirror/RefBoolean;

    .line 57
    .line 58
    invoke-virtual {v10, p1}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    const-wide/16 v10, 0x3c

    .line 65
    .line 66
    cmp-long p1, v0, v10

    .line 67
    .line 68
    if-gez p1, :cond_0

    .line 69
    .line 70
    const-string p1, "ContentService"

    .line 71
    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v4, "Requested poll frequency of "

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, " seconds being rounded up to 60 seconds."

    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/4 v1, 0x0

    .line 95
    new-array v1, v1, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {p1, v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-wide v10, v0

    .line 102
    :goto_0
    new-instance p1, Landroid/content/PeriodicSync;

    .line 103
    .line 104
    move-object v1, p1

    .line 105
    move-object v2, v3

    .line 106
    move-object v3, v5

    .line 107
    move-object v4, v6

    .line 108
    move-wide v5, v10

    .line 109
    invoke-direct/range {v1 .. v6}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 113
    .line 114
    invoke-virtual {v0, p1, v7, v8}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0}, Lcom/lody/virtual/server/content/VContentService;->getSyncManager()Lcom/lody/virtual/server/content/SyncManager;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lcom/lody/virtual/server/content/SyncManager;->getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, p1, v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->addPeriodicSync(Landroid/content/PeriodicSync;I)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    const-wide/16 v10, 0x3e8

    .line 130
    .line 131
    mul-long/2addr v7, v10

    .line 132
    mul-long/2addr v10, v0

    .line 133
    const/4 p1, 0x0

    .line 134
    move-object v1, v2

    .line 135
    move-object v2, v3

    .line 136
    move v3, v9

    .line 137
    move-wide v9, v10

    .line 138
    move v11, p1

    .line 139
    invoke-virtual/range {v1 .. v11}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_2
    :goto_1
    invoke-static {v12, v13}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :catchall_0
    move-exception p1

    .line 147
    invoke-static {v12, v13}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 148
    .line 149
    .line 150
    throw p1
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
.end method

.method public unregisterContentObserver(Landroid/database/IContentObserver;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/VContentService;->mRootNode:Lcom/lody/virtual/server/content/VContentService$ObserverNode;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/content/VContentService$ObserverNode;->removeObserverLocked(Landroid/database/IContentObserver;)Z

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "You must pass a valid observer"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method
