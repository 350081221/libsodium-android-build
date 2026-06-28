.class public Lcom/lody/virtual/server/content/SyncManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/content/SyncManager$SyncHandler;,
        Lcom/lody/virtual/server/content/SyncManager$ServiceConnectionData;,
        Lcom/lody/virtual/server/content/SyncManager$SyncTimeTracker;,
        Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;,
        Lcom/lody/virtual/server/content/SyncManager$SyncAlarmIntentReceiver;,
        Lcom/lody/virtual/server/content/SyncManager$SyncHandlerMessagePayload;
    }
.end annotation


# static fields
.field private static final ACTION_SYNC_ALARM:Ljava/lang/String; = "android.content.syncmanager.SYNC_ALARM"

.field private static final DEFAULT_MAX_SYNC_RETRY_TIME_IN_SECONDS:J = 0xe10L

.field private static final DELAY_RETRY_SYNC_IN_PROGRESS_IN_SECONDS:I = 0xa

.field private static final HANDLE_SYNC_ALARM_WAKE_LOCK:Ljava/lang/String; = "SyncManagerHandleSyncAlarm"

.field private static final INITIALIZATION_UNBIND_DELAY_MS:I = 0x1388

.field private static final INITIAL_ACCOUNTS_ARRAY:[Lcom/lody/virtual/server/accounts/AccountAndUser;

.field private static final INITIAL_SYNC_RETRY_TIME_IN_MS:J = 0x7530L

.field private static final LOCAL_SYNC_DELAY:J = 0x7530L

.field private static final MAX_SIMULTANEOUS_INITIALIZATION_SYNCS:I = 0x5

.field private static final MAX_SIMULTANEOUS_REGULAR_SYNCS:I = 0x2

.field private static final MAX_TIME_PER_SYNC:J = 0x493e0L

.field private static final SYNC_ALARM_TIMEOUT_MAX:J = 0x6ddd00L

.field private static final SYNC_ALARM_TIMEOUT_MIN:J = 0x7530L

.field private static final SYNC_LOOP_WAKE_LOCK:Ljava/lang/String; = "SyncLoopWakeLock"

.field private static final SYNC_NOTIFICATION_DELAY:J = 0x7530L

.field private static final SYNC_WAKE_LOCK_PREFIX:Ljava/lang/String; = "*sync*"

.field private static final TAG:Ljava/lang/String; = "SyncManager"


# instance fields
.field private mAccountsUpdatedReceiver:Landroid/content/BroadcastReceiver;

.field protected final mActiveSyncContexts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;",
            ">;"
        }
    .end annotation
.end field

.field private mAlarmService:Landroid/app/AlarmManager;

.field private mBackgroundDataSettingChanged:Landroid/content/BroadcastReceiver;

.field private volatile mBootCompleted:Z

.field private mBootCompletedReceiver:Landroid/content/BroadcastReceiver;

.field private mConnManagerDoNotUseDirectly:Landroid/net/ConnectivityManager;

.field private mConnectivityIntentReceiver:Landroid/content/BroadcastReceiver;

.field private mContext:Landroid/content/Context;

.field private volatile mDataConnectionIsConnected:Z

.field private final mPowerManager:Landroid/os/PowerManager;

.field private volatile mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

.field private mShutdownIntentReceiver:Landroid/content/BroadcastReceiver;

.field private mStorageIntentReceiver:Landroid/content/BroadcastReceiver;

.field private volatile mStorageIsLow:Z

.field protected mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

.field private final mSyncAlarmIntent:Landroid/app/PendingIntent;

.field private final mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

.field private final mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

.field private mSyncRandomOffsetMillis:I

.field private mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

.field private mUserIntentReceiver:Landroid/content/BroadcastReceiver;

.field private final mUserManager:Lcom/lody/virtual/os/VUserManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 3
    .line 4
    sput-object v0, Lcom/lody/virtual/server/content/SyncManager;->INITIAL_ACCOUNTS_ARRAY:[Lcom/lody/virtual/server/accounts/AccountAndUser;

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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/lody/virtual/server/content/SyncManager;->INITIAL_ACCOUNTS_ARRAY:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mDataConnectionIsConnected:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mStorageIsLow:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mAlarmService:Landroid/app/AlarmManager;

    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mActiveSyncContexts:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$1;

    .line 24
    .line 25
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$1;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mStorageIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 29
    .line 30
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$2;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$2;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 33
    .line 34
    .line 35
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompletedReceiver:Landroid/content/BroadcastReceiver;

    .line 36
    .line 37
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$3;

    .line 38
    .line 39
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$3;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mBackgroundDataSettingChanged:Landroid/content/BroadcastReceiver;

    .line 43
    .line 44
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$4;

    .line 45
    .line 46
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$4;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mAccountsUpdatedReceiver:Landroid/content/BroadcastReceiver;

    .line 50
    .line 51
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$5;

    .line 52
    .line 53
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$5;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mConnectivityIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 57
    .line 58
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$6;

    .line 59
    .line 60
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$6;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mShutdownIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 64
    .line 65
    new-instance v2, Lcom/lody/virtual/server/content/SyncManager$7;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Lcom/lody/virtual/server/content/SyncManager$7;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompleted:Z

    .line 73
    .line 74
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->init(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getSingleton()Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 84
    .line 85
    new-instance v3, Lcom/lody/virtual/server/content/SyncManager$8;

    .line 86
    .line 87
    invoke-direct {v3, p0}, Lcom/lody/virtual/server/content/SyncManager$8;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setOnSyncRequestListener(Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 94
    .line 95
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 96
    .line 97
    invoke-direct {v2, v3}, Lcom/lody/virtual/server/content/SyncAdaptersCache;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    iput-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->refreshServiceCache(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lcom/lody/virtual/server/content/SyncQueue;

    .line 106
    .line 107
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 108
    .line 109
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 110
    .line 111
    invoke-direct {v1, v2, v3}, Lcom/lody/virtual/server/content/SyncQueue;-><init>(Lcom/lody/virtual/server/content/SyncStorageEngine;Lcom/lody/virtual/server/content/SyncAdaptersCache;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 115
    .line 116
    new-instance v1, Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 117
    .line 118
    invoke-static {}, Lcom/lody/virtual/os/BackgroundThread;->get()Lcom/lody/virtual/os/BackgroundThread;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-direct {v1, p0, v2}, Lcom/lody/virtual/server/content/SyncManager$SyncHandler;-><init>(Lcom/lody/virtual/server/content/SyncManager;Landroid/os/Looper;)V

    .line 127
    .line 128
    .line 129
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 130
    .line 131
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isS()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_0

    .line 136
    .line 137
    const/high16 v1, 0x4000000

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    move v1, v0

    .line 141
    :goto_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 142
    .line 143
    new-instance v3, Landroid/content/Intent;

    .line 144
    .line 145
    const-string v4, "android.content.syncmanager.SYNC_ALARM"

    .line 146
    .line 147
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v0, v3, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAlarmIntent:Landroid/app/PendingIntent;

    .line 155
    .line 156
    new-instance v0, Landroid/content/IntentFilter;

    .line 157
    .line 158
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mConnectivityIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 164
    .line 165
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    new-instance v0, Landroid/content/IntentFilter;

    .line 169
    .line 170
    const-string v1, "android.intent.action.BOOT_COMPLETED"

    .line 171
    .line 172
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompletedReceiver:Landroid/content/BroadcastReceiver;

    .line 176
    .line 177
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 178
    .line 179
    .line 180
    new-instance v0, Landroid/content/IntentFilter;

    .line 181
    .line 182
    const-string v1, "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED"

    .line 183
    .line 184
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mBackgroundDataSettingChanged:Landroid/content/BroadcastReceiver;

    .line 188
    .line 189
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 190
    .line 191
    .line 192
    new-instance v0, Landroid/content/IntentFilter;

    .line 193
    .line 194
    const-string v1, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 195
    .line 196
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string v1, "android.intent.action.DEVICE_STORAGE_OK"

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mStorageIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 205
    .line 206
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 207
    .line 208
    .line 209
    new-instance v0, Landroid/content/IntentFilter;

    .line 210
    .line 211
    const-string v1, "android.intent.action.ACTION_SHUTDOWN"

    .line 212
    .line 213
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/16 v1, 0x64

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 219
    .line 220
    .line 221
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mShutdownIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 222
    .line 223
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 224
    .line 225
    .line 226
    new-instance v0, Landroid/content/IntentFilter;

    .line 227
    .line 228
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 229
    .line 230
    .line 231
    const-string v1, "virtual.android.intent.action.USER_REMOVED"

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v2, "virtual.android.intent.action.USER_ADDED"

    .line 237
    .line 238
    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 245
    .line 246
    const/16 v2, 0x21

    .line 247
    .line 248
    if-lt v1, v2, :cond_1

    .line 249
    .line 250
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 251
    .line 252
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 253
    .line 254
    const/4 v3, 0x2

    .line 255
    invoke-static {v1, v2, v0, v3}, Lcom/bytedance/pangle/j;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_1
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 260
    .line 261
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserIntentReceiver:Landroid/content/BroadcastReceiver;

    .line 262
    .line 263
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 264
    .line 265
    .line 266
    :goto_1
    new-instance v0, Lcom/lody/virtual/server/content/SyncManager$SyncAlarmIntentReceiver;

    .line 267
    .line 268
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/content/SyncManager$SyncAlarmIntentReceiver;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 269
    .line 270
    .line 271
    new-instance v1, Landroid/content/IntentFilter;

    .line 272
    .line 273
    invoke-direct {v1, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 277
    .line 278
    .line 279
    const-string v0, "power"

    .line 280
    .line 281
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, Landroid/os/PowerManager;

    .line 286
    .line 287
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mPowerManager:Landroid/os/PowerManager;

    .line 288
    .line 289
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserManager:Lcom/lody/virtual/os/VUserManager;

    .line 294
    .line 295
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 296
    .line 297
    new-instance v0, Lcom/lody/virtual/server/content/SyncManager$9;

    .line 298
    .line 299
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/content/SyncManager$9;-><init>(Lcom/lody/virtual/server/content/SyncManager;)V

    .line 300
    .line 301
    .line 302
    const/4 v1, 0x1

    .line 303
    invoke-virtual {p1, v1, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V

    .line 304
    .line 305
    .line 306
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 307
    .line 308
    invoke-virtual {p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getSyncRandomOffset()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    mul-int/lit16 p1, p1, 0x3e8

    .line 313
    .line 314
    iput p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncRandomOffsetMillis:I

    .line 315
    .line 316
    return-void
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

.method static synthetic access$000(Lcom/lody/virtual/server/content/SyncManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mStorageIsLow:Z

    return p0
.end method

.method static synthetic access$002(Lcom/lody/virtual/server/content/SyncManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mStorageIsLow:Z

    return p1
.end method

.method static synthetic access$100(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->sendCheckAlarmsMessage()V

    return-void
.end method

.method static synthetic access$1000(Lcom/lody/virtual/server/content/SyncManager;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->onUserStopping(I)V

    return-void
.end method

.method static synthetic access$1100(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->sendSyncAlarmMessage()V

    return-void
.end method

.method static synthetic access$1200(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/content/SyncManager;->sendSyncFinishedOrCanceledMessage(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/lody/virtual/server/content/SyncManager;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->doDatabaseCleanup()V

    return-void
.end method

.method static synthetic access$1600(Lcom/lody/virtual/server/content/SyncManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompleted:Z

    return p0
.end method

.method static synthetic access$1602(Lcom/lody/virtual/server/content/SyncManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompleted:Z

    return p1
.end method

.method static synthetic access$1700(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->isSyncStillActive(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1800(Lcom/lody/virtual/server/content/SyncManager;)[Lcom/lody/virtual/server/accounts/AccountAndUser;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    return-object p0
.end method

.method static synthetic access$1900(Lcom/lody/virtual/server/content/SyncManager;)I
    .locals 0

    iget p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncRandomOffsetMillis:I

    return p0
.end method

.method static synthetic access$200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncManager$SyncHandler;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/lody/virtual/server/content/SyncManager;[Lcom/lody/virtual/server/accounts/AccountAndUser;Landroid/accounts/Account;I)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncManager;->containsAccountAndUser([Lcom/lody/virtual/server/accounts/AccountAndUser;Landroid/accounts/Account;I)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2100()[Lcom/lody/virtual/server/accounts/AccountAndUser;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/content/SyncManager;->INITIAL_ACCOUNTS_ARRAY:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    return-object v0
.end method

.method static synthetic access$2200(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/os/VUserManager;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserManager:Lcom/lody/virtual/os/VUserManager;

    return-object p0
.end method

.method static synthetic access$2300()J
    .locals 2

    sget-wide v0, Lcom/lody/virtual/server/content/SyncManager;->MAX_TIME_PER_SYNC:J

    return-wide v0
.end method

.method static synthetic access$2400()I
    .locals 1

    sget v0, Lcom/lody/virtual/server/content/SyncManager;->MAX_SIMULTANEOUS_INITIALIZATION_SYNCS:I

    return v0
.end method

.method static synthetic access$2500()I
    .locals 1

    sget v0, Lcom/lody/virtual/server/content/SyncManager;->MAX_SIMULTANEOUS_REGULAR_SYNCS:I

    return v0
.end method

.method static synthetic access$2600(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->increaseBackoffSetting(Lcom/lody/virtual/server/content/SyncOperation;)V

    return-void
.end method

.method static synthetic access$2700(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->clearBackoffSetting(Lcom/lody/virtual/server/content/SyncOperation;)V

    return-void
.end method

.method static synthetic access$2800(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncOperation;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncManager;->setDelayUntilTime(Lcom/lody/virtual/server/content/SyncOperation;J)V

    return-void
.end method

.method static synthetic access$2900()J
    .locals 2

    sget-wide v0, Lcom/lody/virtual/server/content/SyncManager;->SYNC_NOTIFICATION_DELAY:J

    return-wide v0
.end method

.method static synthetic access$300(Lcom/lody/virtual/server/content/SyncManager;)Landroid/net/ConnectivityManager;
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->getConnectivityManager()Landroid/net/ConnectivityManager;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$3000(Lcom/lody/virtual/server/content/SyncManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->ensureAlarmService()V

    return-void
.end method

.method static synthetic access$3100(Lcom/lody/virtual/server/content/SyncManager;)Landroid/app/PendingIntent;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAlarmIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method static synthetic access$3200(Lcom/lody/virtual/server/content/SyncManager;)Landroid/app/AlarmManager;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mAlarmService:Landroid/app/AlarmManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/lody/virtual/server/content/SyncManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mDataConnectionIsConnected:Z

    return p0
.end method

.method static synthetic access$402(Lcom/lody/virtual/server/content/SyncManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mDataConnectionIsConnected:Z

    return p1
.end method

.method static synthetic access$500(Lcom/lody/virtual/server/content/SyncManager;)Z
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->readDataConnectionState()Z

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncQueue;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    return-object p0
.end method

.method static synthetic access$700(Lcom/lody/virtual/server/content/SyncManager;)Lcom/lody/virtual/server/content/SyncStorageEngine;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    return-object p0
.end method

.method static synthetic access$800(Lcom/lody/virtual/server/content/SyncManager;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->onUserRemoved(I)V

    return-void
.end method

.method static synthetic access$900(Lcom/lody/virtual/server/content/SyncManager;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncManager;->onUserStarting(I)V

    return-void
.end method

.method private clearBackoffSetting(Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 4
    .line 5
    iget v2, p1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 6
    .line 7
    iget-object v3, p1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 8
    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setBackoff(Landroid/accounts/Account;ILjava/lang/String;JJ)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 20
    .line 21
    iget-object v2, p1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 22
    .line 23
    iget v3, p1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 24
    .line 25
    iget-object v4, p1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncQueue;->onBackoffChanged(Landroid/accounts/Account;ILjava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method private containsAccountAndUser([Lcom/lody/virtual/server/accounts/AccountAndUser;Landroid/accounts/Account;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 9
    .line 10
    if-ne v3, p3, :cond_0

    .line 11
    .line 12
    iget-object v2, v2, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 13
    .line 14
    invoke-virtual {v2, p2}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    :goto_1
    return v0
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
.end method

.method private doDatabaseCleanup()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserManager:Lcom/lody/virtual/os/VUserManager;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/lody/virtual/os/VUserManager;->getUsers(Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/lody/virtual/os/VUserInfo;

    .line 23
    .line 24
    iget-boolean v2, v1, Lcom/lody/virtual/os/VUserInfo;->partial:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-virtual {v2, v3, v4}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->getAccounts(ILjava/lang/String;)[Landroid/accounts/Account;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 41
    .line 42
    iget v1, v1, Lcom/lody/virtual/os/VUserInfo;->id:I

    .line 43
    .line 44
    invoke-virtual {v3, v2, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->doDatabaseCleanup([Landroid/accounts/Account;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
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

.method private ensureAlarmService()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mAlarmService:Landroid/app/AlarmManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "alarm"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/AlarmManager;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mAlarmService:Landroid/app/AlarmManager;

    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static formatTime(J)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Landroid/text/format/Time;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, p1}, Landroid/text/format/Time;->set(J)V

    .line 7
    .line 8
    .line 9
    const-string p0, "%Y-%m-%d %H:%M:%S"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
.end method

.method private getAllUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/lody/virtual/os/VUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mUserManager:Lcom/lody/virtual/os/VUserManager;

    invoke-virtual {v0}, Lcom/lody/virtual/os/VUserManager;->getUsers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private getConnectivityManager()Landroid/net/ConnectivityManager;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mConnManagerDoNotUseDirectly:Landroid/net/ConnectivityManager;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mContext:Landroid/content/Context;

    .line 7
    .line 8
    const-string v1, "connectivity"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mConnManagerDoNotUseDirectly:Landroid/net/ConnectivityManager;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mConnManagerDoNotUseDirectly:Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method private getLastFailureMessage(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, "unknown"

    return-object p1

    :pswitch_0
    const-string p1, "internal error"

    return-object p1

    :pswitch_1
    const-string p1, "too many retries error"

    return-object p1

    :pswitch_2
    const-string p1, "too many deletions error"

    return-object p1

    :pswitch_3
    const-string p1, "conflict error"

    return-object p1

    :pswitch_4
    const-string p1, "parse error"

    return-object p1

    :pswitch_5
    const-string p1, "I/O error"

    return-object p1

    :pswitch_6
    const-string p1, "authentication error"

    return-object p1

    :pswitch_7
    const-string p1, "sync already in progress"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private increaseBackoffSetting(Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 12
    .line 13
    iget v6, v0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 14
    .line 15
    iget-object v7, v0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v4, v5, v6, v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getBackoff(Landroid/accounts/Account;ILjava/lang/String;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    cmp-long v5, v2, v5

    .line 32
    .line 33
    if-gez v5, :cond_0

    .line 34
    .line 35
    const-string v0, "SyncManager"

    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v6, "Still in backoff, do not increase it. Remaining: "

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    sub-long/2addr v6, v2

    .line 56
    const-wide/16 v2, 0x3e8

    .line 57
    .line 58
    div-long/2addr v6, v2

    .line 59
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v2, " seconds."

    .line 63
    .line 64
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    const-wide/16 v6, 0x2

    .line 84
    .line 85
    mul-long/2addr v4, v6

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const-wide/16 v4, -0x1

    .line 88
    .line 89
    :goto_0
    const-wide/16 v6, 0x0

    .line 90
    .line 91
    cmp-long v6, v4, v6

    .line 92
    .line 93
    if-gtz v6, :cond_2

    .line 94
    .line 95
    const-wide/16 v4, 0x7530

    .line 96
    .line 97
    const-wide/32 v6, 0x80e8

    .line 98
    .line 99
    .line 100
    invoke-direct {v1, v4, v5, v6, v7}, Lcom/lody/virtual/server/content/SyncManager;->jitterize(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    :cond_2
    const-wide/32 v6, 0x36ee80

    .line 105
    .line 106
    .line 107
    cmp-long v8, v4, v6

    .line 108
    .line 109
    if-lez v8, :cond_3

    .line 110
    .line 111
    move-wide v15, v6

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move-wide v15, v4

    .line 114
    :goto_1
    add-long/2addr v2, v15

    .line 115
    iget-object v9, v1, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 116
    .line 117
    iget-object v10, v0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 118
    .line 119
    iget v11, v0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 120
    .line 121
    iget-object v12, v0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 122
    .line 123
    move-wide v13, v2

    .line 124
    invoke-virtual/range {v9 .. v16}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setBackoff(Landroid/accounts/Account;ILjava/lang/String;JJ)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    iput-object v4, v0, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    .line 132
    .line 133
    invoke-virtual/range {p1 .. p1}, Lcom/lody/virtual/server/content/SyncOperation;->updateEffectiveRunTime()V

    .line 134
    .line 135
    .line 136
    iget-object v10, v1, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 137
    .line 138
    monitor-enter v10

    .line 139
    :try_start_0
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 140
    .line 141
    iget-object v5, v0, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 142
    .line 143
    iget v6, v0, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 144
    .line 145
    iget-object v7, v0, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 146
    .line 147
    move-wide v8, v2

    .line 148
    invoke-virtual/range {v4 .. v9}, Lcom/lody/virtual/server/content/SyncQueue;->onBackoffChanged(Landroid/accounts/Account;ILjava/lang/String;J)V

    .line 149
    .line 150
    .line 151
    monitor-exit v10

    .line 152
    return-void

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    throw v0
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

.method private isSyncStillActive(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;)Z
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mActiveSyncContexts:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private jitterize(JJ)J
    .locals 3

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    .line 8
    .line 9
    .line 10
    sub-long/2addr p3, p1

    .line 11
    const-wide/32 v1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    cmp-long v1, p3, v1

    .line 15
    .line 16
    if-gtz v1, :cond_0

    .line 17
    .line 18
    long-to-int p3, p3

    .line 19
    invoke-virtual {v0, p3}, Ljava/util/Random;->nextInt(I)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    int-to-long p3, p3

    .line 24
    add-long/2addr p1, p3

    .line 25
    return-wide p1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string p2, "the difference between the maxValue and the minValue must be less than 2147483647"

    .line 29
    .line 30
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method private onUserRemoved(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncManager;->updateRunningAccounts()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    new-array v1, v1, [Landroid/accounts/Account;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->doDatabaseCleanup([Landroid/accounts/Account;I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/content/SyncQueue;->removeUser(I)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
    .line 25
    .line 26
    .line 27
.end method

.method private onUserStarting(I)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->refreshServiceCache(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncManager;->updateRunningAccounts()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lcom/lody/virtual/server/content/SyncQueue;->addPendingOperations(I)V

    .line 16
    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->getAccounts(ILjava/lang/String;)[Landroid/accounts/Account;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    array-length v1, v0

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_0

    .line 30
    .line 31
    aget-object v4, v0, v2

    .line 32
    .line 33
    const/4 v6, -0x8

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    const-wide/16 v9, 0x0

    .line 37
    .line 38
    const-wide/16 v11, 0x0

    .line 39
    .line 40
    const/4 v13, 0x1

    .line 41
    move-object v3, p0

    .line 42
    move v5, p1

    .line 43
    invoke-virtual/range {v3 .. v13}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->sendCheckAlarmsMessage()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1
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

.method private onUserStopping(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncManager;->updateRunningAccounts()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, v0}, Lcom/lody/virtual/server/content/SyncManager;->cancelActiveSync(Landroid/accounts/Account;ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private readDataConnectionState()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->getConnectivityManager()Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
    .line 21
    .line 22
    .line 23
.end method

.method private sendCancelSyncsMessage(Landroid/accounts/Account;ILjava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    const-string v1, "sending MESSAGE_CANCEL"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x6

    .line 15
    iput v1, v0, Landroid/os/Message;->what:I

    .line 16
    .line 17
    invoke-static {p1, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 24
    .line 25
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 28
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
.end method

.method private sendCheckAlarmsMessage()V
    .locals 2

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    const-string v1, "sending MESSAGE_CHECK_ALARMS"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private sendSyncAlarmMessage()V
    .locals 2

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    const-string v1, "sending MESSAGE_SYNC_ALARM"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 12
    .line 13
    .line 14
    return-void
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

.method private sendSyncFinishedOrCanceledMessage(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V
    .locals 2

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    const-string v1, "sending MESSAGE_SYNC_FINISHED"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    iput v1, v0, Landroid/os/Message;->what:I

    .line 16
    .line 17
    new-instance v1, Lcom/lody/virtual/server/content/SyncManager$SyncHandlerMessagePayload;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1, p2}, Lcom/lody/virtual/server/content/SyncManager$SyncHandlerMessagePayload;-><init>(Lcom/lody/virtual/server/content/SyncManager;Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncHandler:Lcom/lody/virtual/server/content/SyncManager$SyncHandler;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 27
    .line 28
    .line 29
    return-void
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

.method private setDelayUntilTime(Lcom/lody/virtual/server/content/SyncOperation;J)V
    .locals 10

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    mul-long/2addr p2, v0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr p2, v0

    .line 17
    add-long/2addr v2, p2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    :goto_0
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 22
    .line 23
    iget-object v5, p1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 24
    .line 25
    iget v6, p1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 26
    .line 27
    iget-object v7, p1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 28
    .line 29
    move-wide v8, v2

    .line 30
    invoke-virtual/range {v4 .. v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setDelayUntilTime(Landroid/accounts/Account;ILjava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 34
    .line 35
    monitor-enter p2

    .line 36
    :try_start_0
    iget-object p3, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 37
    .line 38
    iget-object v0, p1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p3, v0, p1, v2, v3}, Lcom/lody/virtual/server/content/SyncQueue;->onDelayUntilTimeChanged(Landroid/accounts/Account;Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    monitor-exit p2

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
    .line 50
.end method


# virtual methods
.method public cancelActiveSync(Landroid/accounts/Account;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncManager;->sendCancelSyncsMessage(Landroid/accounts/Account;ILjava/lang/String;)V

    return-void
.end method

.method public clearScheduledSyncOperations(Landroid/accounts/Account;ILjava/lang/String;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncQueue;->remove(Landroid/accounts/Account;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 11
    .line 12
    const-wide/16 v6, -0x1

    .line 13
    .line 14
    const-wide/16 v8, -0x1

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    move v4, p2

    .line 18
    move-object v5, p3

    .line 19
    invoke-virtual/range {v2 .. v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setBackoff(Landroid/accounts/Account;ILjava/lang/String;JJ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
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
.end method

.method public getIsSyncable(Landroid/accounts/Account;ILjava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIsSyncable(Landroid/accounts/Account;ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {}, Lcom/lody/virtual/os/VUserManager;->get()Lcom/lody/virtual/os/VUserManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, p2}, Lcom/lody/virtual/os/VUserManager;->getUserInfo(I)Lcom/lody/virtual/os/VUserInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/lody/virtual/os/VUserInfo;->isRestricted()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 25
    .line 26
    invoke-virtual {p2, p1, p3}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->getServiceInfo(Landroid/accounts/Account;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    return v0
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
.end method

.method public getSyncAdapterTypes()[Landroid/content/SyncAdapterType;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->getAllServices()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-array v1, v1, [Landroid/content/SyncAdapterType;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;

    .line 29
    .line 30
    iget-object v3, v3, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 31
    .line 32
    aput-object v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object v1
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

.method public getSyncStorageEngine()Lcom/lody/virtual/server/content/SyncStorageEngine;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    return-object v0
.end method

.method maybeRescheduleSync(Landroid/content/SyncResult;Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v4, "encountered error(s) during the sync: "

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v4, ", "

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "SyncManager"

    .line 33
    .line 34
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    new-instance v3, Lcom/lody/virtual/server/content/SyncOperation;

    .line 38
    .line 39
    invoke-direct {v3, v2}, Lcom/lody/virtual/server/content/SyncOperation;-><init>(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 43
    .line 44
    const-string v5, "ignore_backoff"

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual {v2, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 59
    .line 60
    const-string v5, "do_not_retry"

    .line 61
    .line 62
    invoke-virtual {v2, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "not retrying sync operation because SYNC_EXTRAS_DO_NOT_RETRY was specified "

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_1
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 91
    .line 92
    const-string v5, "upload"

    .line 93
    .line 94
    invoke-virtual {v2, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    iget-boolean v2, v1, Landroid/content/SyncResult;->syncAlreadyInProgress:Z

    .line 101
    .line 102
    if-nez v2, :cond_2

    .line 103
    .line 104
    iget-object v1, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v2, "retrying sync operation as a two-way sync because an upload-only sync encountered an error: "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_2
    iget-boolean v2, v1, Landroid/content/SyncResult;->tooManyRetries:Z

    .line 135
    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v2, "not retrying sync operation because it retried too many times: "

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/content/SyncResult;->madeSomeProgress()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    const-string v1, "retrying sync operation because even though it had an error it achieved some success"

    .line 167
    .line 168
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v3}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_4
    iget-boolean v2, v1, Landroid/content/SyncResult;->syncAlreadyInProgress:Z

    .line 177
    .line 178
    if-eqz v2, :cond_5

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v2, "retrying sync operation that failed because there was already a sync in progress: "

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    new-instance v1, Lcom/lody/virtual/server/content/SyncOperation;

    .line 201
    .line 202
    iget-object v6, v3, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 203
    .line 204
    iget v7, v3, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 205
    .line 206
    iget v8, v3, Lcom/lody/virtual/server/content/SyncOperation;->reason:I

    .line 207
    .line 208
    iget v9, v3, Lcom/lody/virtual/server/content/SyncOperation;->syncSource:I

    .line 209
    .line 210
    iget-object v10, v3, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 211
    .line 212
    iget-object v11, v3, Lcom/lody/virtual/server/content/SyncOperation;->extras:Landroid/os/Bundle;

    .line 213
    .line 214
    const-wide/16 v12, 0x2710

    .line 215
    .line 216
    iget-wide v14, v3, Lcom/lody/virtual/server/content/SyncOperation;->flexTime:J

    .line 217
    .line 218
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->backoff:Ljava/lang/Long;

    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 221
    .line 222
    .line 223
    move-result-wide v16

    .line 224
    iget-wide v4, v3, Lcom/lody/virtual/server/content/SyncOperation;->delayUntil:J

    .line 225
    .line 226
    iget-boolean v2, v3, Lcom/lody/virtual/server/content/SyncOperation;->allowParallelSyncs:Z

    .line 227
    .line 228
    move-wide v3, v4

    .line 229
    move-object v5, v1

    .line 230
    move-wide/from16 v18, v3

    .line 231
    .line 232
    move/from16 v20, v2

    .line 233
    .line 234
    invoke-direct/range {v5 .. v20}, Lcom/lody/virtual/server/content/SyncOperation;-><init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;JJJJZ)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/content/SyncResult;->hasSoftError()Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_6

    .line 246
    .line 247
    new-instance v1, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v2, "retrying sync operation because it encountered a soft error: "

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v3}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 268
    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string v2, "not retrying sync operation because the error is a hard error: "

    .line 277
    .line 278
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 289
    .line 290
    .line 291
    :goto_0
    return-void
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method public scheduleLocalSync(Landroid/accounts/Account;IILjava/lang/String;)V
    .locals 11

    .line 1
    new-instance v5, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "upload"

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    sget-wide v6, Lcom/lody/virtual/server/content/SyncManager;->LOCAL_SYNC_DELAY:J

    .line 13
    .line 14
    const-wide/16 v0, 0x2

    .line 15
    .line 16
    mul-long v8, v6, v0

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move v2, p2

    .line 22
    move v3, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-virtual/range {v0 .. v10}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V

    .line 25
    .line 26
    .line 27
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

.method public scheduleSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;JJZ)V
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-boolean v4, v0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompleted:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/content/SyncManager;->getConnectivityManager()Landroid/net/ConnectivityManager;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getBackgroundDataSetting()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v4, v6

    .line 29
    :goto_1
    if-nez p5, :cond_2

    .line 30
    .line 31
    new-instance v7, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move-object/from16 v7, p5

    .line 38
    .line 39
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v9, "one-time sync for: "

    .line 45
    .line 46
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v9, " "

    .line 53
    .line 54
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const-string v15, "SyncManager"

    .line 75
    .line 76
    invoke-static {v15, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    const-string v8, "expedited"

    .line 80
    .line 81
    invoke-virtual {v7, v8, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_3

    .line 94
    .line 95
    const-wide/16 v8, -0x1

    .line 96
    .line 97
    move-wide v13, v8

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move-wide/from16 v13, p8

    .line 100
    .line 101
    :goto_3
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v8, -0x1

    .line 104
    if-eq v2, v8, :cond_4

    .line 105
    .line 106
    new-array v8, v6, [Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 107
    .line 108
    new-instance v9, Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 109
    .line 110
    invoke-direct {v9, v1, v2}, Lcom/lody/virtual/server/accounts/AccountAndUser;-><init>(Landroid/accounts/Account;I)V

    .line 111
    .line 112
    .line 113
    aput-object v9, v8, v5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    iget-object v8, v0, Lcom/lody/virtual/server/content/SyncManager;->mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 117
    .line 118
    array-length v1, v8

    .line 119
    if-nez v1, :cond_5

    .line 120
    .line 121
    const-string v1, "scheduleSync: no accounts configured, dropping"

    .line 122
    .line 123
    invoke-static {v15, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_5
    :goto_4
    move-object v1, v8

    .line 128
    const-string v2, "upload"

    .line 129
    .line 130
    invoke-virtual {v7, v2, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const-string v8, "force"

    .line 135
    .line 136
    invoke-virtual {v7, v8, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    const-string v9, "ignore_settings"

    .line 141
    .line 142
    if-eqz v8, :cond_6

    .line 143
    .line 144
    const-string v10, "ignore_backoff"

    .line 145
    .line 146
    invoke-virtual {v7, v10, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v9, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {v7, v9, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v24

    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    move v12, v6

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    if-eqz v8, :cond_8

    .line 161
    .line 162
    const/4 v8, 0x3

    .line 163
    :goto_5
    move v12, v8

    .line 164
    goto :goto_6

    .line 165
    :cond_8
    if-nez v3, :cond_9

    .line 166
    .line 167
    const/4 v8, 0x2

    .line 168
    goto :goto_5

    .line 169
    :cond_9
    move v12, v5

    .line 170
    :goto_6
    array-length v11, v1

    .line 171
    move v10, v5

    .line 172
    :goto_7
    if-ge v10, v11, :cond_18

    .line 173
    .line 174
    aget-object v9, v1, v10

    .line 175
    .line 176
    new-instance v8, Ljava/util/HashSet;

    .line 177
    .line 178
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 179
    .line 180
    .line 181
    iget-object v5, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 182
    .line 183
    invoke-virtual {v5}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->getAllServices()Ljava/util/Collection;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v16

    .line 195
    if-eqz v16, :cond_a

    .line 196
    .line 197
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v16

    .line 201
    move-object/from16 v6, v16

    .line 202
    .line 203
    check-cast v6, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;

    .line 204
    .line 205
    iget-object v6, v6, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 206
    .line 207
    iget-object v6, v6, Landroid/content/SyncAdapterType;->authority:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    const/4 v6, 0x1

    .line 213
    goto :goto_8

    .line 214
    :cond_a
    if-eqz v3, :cond_b

    .line 215
    .line 216
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-virtual {v8}, Ljava/util/HashSet;->clear()V

    .line 221
    .line 222
    .line 223
    if-eqz v5, :cond_b

    .line 224
    .line 225
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_b
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_17

    .line 237
    .line 238
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    check-cast v6, Ljava/lang/String;

    .line 243
    .line 244
    iget-object v8, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 245
    .line 246
    move-object/from16 p1, v1

    .line 247
    .line 248
    iget v1, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 249
    .line 250
    invoke-virtual {v0, v8, v1, v6}, Lcom/lody/virtual/server/content/SyncManager;->getIsSyncable(Landroid/accounts/Account;ILjava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    if-nez v1, :cond_c

    .line 255
    .line 256
    move-object/from16 v1, p1

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_c
    iget-object v8, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncAdapters:Lcom/lody/virtual/server/content/SyncAdaptersCache;

    .line 260
    .line 261
    iget-object v3, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 262
    .line 263
    invoke-virtual {v8, v3, v6}, Lcom/lody/virtual/server/content/SyncAdaptersCache;->getServiceInfo(Landroid/accounts/Account;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-nez v3, :cond_d

    .line 268
    .line 269
    move-object/from16 v1, p1

    .line 270
    .line 271
    move-object/from16 v3, p4

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_d
    iget-object v8, v3, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 275
    .line 276
    invoke-virtual {v8}, Landroid/content/SyncAdapterType;->allowParallelSyncs()Z

    .line 277
    .line 278
    .line 279
    move-result v23

    .line 280
    iget-object v8, v3, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 281
    .line 282
    invoke-virtual {v8}, Landroid/content/SyncAdapterType;->isAlwaysSyncable()Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-gez v1, :cond_e

    .line 287
    .line 288
    if-eqz v8, :cond_e

    .line 289
    .line 290
    iget-object v1, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 291
    .line 292
    iget-object v8, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 293
    .line 294
    move-object/from16 p2, v5

    .line 295
    .line 296
    iget v5, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 297
    .line 298
    move/from16 v16, v10

    .line 299
    .line 300
    const/4 v10, 0x1

    .line 301
    invoke-virtual {v1, v8, v5, v6, v10}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setIsSyncable(Landroid/accounts/Account;ILjava/lang/String;I)V

    .line 302
    .line 303
    .line 304
    const/4 v1, 0x1

    .line 305
    goto :goto_a

    .line 306
    :cond_e
    move-object/from16 p2, v5

    .line 307
    .line 308
    move/from16 v16, v10

    .line 309
    .line 310
    :goto_a
    if-eqz p10, :cond_f

    .line 311
    .line 312
    if-ltz v1, :cond_f

    .line 313
    .line 314
    :goto_b
    move-object/from16 v1, p1

    .line 315
    .line 316
    move-object/from16 v5, p2

    .line 317
    .line 318
    move-object/from16 v3, p4

    .line 319
    .line 320
    move/from16 v10, v16

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_f
    iget-object v3, v3, Lcom/lody/virtual/server/content/SyncAdaptersCache$SyncAdapterInfo;->type:Landroid/content/SyncAdapterType;

    .line 324
    .line 325
    invoke-virtual {v3}, Landroid/content/SyncAdapterType;->supportsUploading()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_10

    .line 330
    .line 331
    if-eqz v2, :cond_10

    .line 332
    .line 333
    goto :goto_b

    .line 334
    :cond_10
    if-ltz v1, :cond_12

    .line 335
    .line 336
    if-nez v24, :cond_12

    .line 337
    .line 338
    if-eqz v4, :cond_11

    .line 339
    .line 340
    iget-object v3, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 341
    .line 342
    iget v5, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 343
    .line 344
    invoke-virtual {v3, v5}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getMasterSyncAutomatically(I)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-eqz v3, :cond_11

    .line 349
    .line 350
    iget-object v3, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 351
    .line 352
    iget-object v5, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 353
    .line 354
    iget v8, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 355
    .line 356
    invoke-virtual {v3, v5, v8, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getSyncAutomatically(Landroid/accounts/Account;ILjava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_11

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_11
    const/4 v10, 0x0

    .line 364
    goto :goto_d

    .line 365
    :cond_12
    :goto_c
    const/4 v10, 0x1

    .line 366
    :goto_d
    if-nez v10, :cond_13

    .line 367
    .line 368
    new-instance v1, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    const-string v3, "scheduleSync: sync of "

    .line 374
    .line 375
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v3, ", "

    .line 382
    .line 383
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    const-string v3, " is not allowed, dropping request"

    .line 390
    .line 391
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-static {v15, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    goto :goto_b

    .line 402
    :cond_13
    iget-object v3, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 403
    .line 404
    iget-object v5, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 405
    .line 406
    iget v8, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 407
    .line 408
    invoke-virtual {v3, v5, v8, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getBackoff(Landroid/accounts/Account;ILjava/lang/String;)Landroid/util/Pair;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    iget-object v5, v0, Lcom/lody/virtual/server/content/SyncManager;->mSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 413
    .line 414
    iget-object v8, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 415
    .line 416
    iget v10, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 417
    .line 418
    move/from16 v41, v4

    .line 419
    .line 420
    invoke-virtual {v5, v8, v10, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getDelayUntilTime(Landroid/accounts/Account;ILjava/lang/String;)J

    .line 421
    .line 422
    .line 423
    move-result-wide v4

    .line 424
    if-eqz v3, :cond_14

    .line 425
    .line 426
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v3, Ljava/lang/Long;

    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 431
    .line 432
    .line 433
    move-result-wide v17

    .line 434
    goto :goto_e

    .line 435
    :cond_14
    const-wide/16 v17, 0x0

    .line 436
    .line 437
    :goto_e
    move-wide/from16 v19, v17

    .line 438
    .line 439
    const-string v3, ", extras "

    .line 440
    .line 441
    const-string v8, ", authority "

    .line 442
    .line 443
    const-string v10, ", account "

    .line 444
    .line 445
    move/from16 p5, v2

    .line 446
    .line 447
    const-string v2, ", source "

    .line 448
    .line 449
    if-gez v1, :cond_15

    .line 450
    .line 451
    new-instance v1, Landroid/os/Bundle;

    .line 452
    .line 453
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 454
    .line 455
    .line 456
    move/from16 v17, v11

    .line 457
    .line 458
    const-string v11, "initialize"

    .line 459
    .line 460
    move-object/from16 v42, v7

    .line 461
    .line 462
    const/4 v7, 0x1

    .line 463
    invoke-virtual {v1, v11, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 464
    .line 465
    .line 466
    new-instance v11, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    .line 471
    const-string v7, "schedule initialisation Sync:, delay until "

    .line 472
    .line 473
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v7, ", run by "

    .line 480
    .line 481
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v11

    .line 516
    invoke-static {v15, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 517
    .line 518
    .line 519
    new-instance v11, Lcom/lody/virtual/server/content/SyncOperation;

    .line 520
    .line 521
    iget-object v7, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 522
    .line 523
    move-object/from16 v18, v15

    .line 524
    .line 525
    iget v15, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 526
    .line 527
    const-wide/16 v32, 0x0

    .line 528
    .line 529
    const-wide/16 v34, 0x0

    .line 530
    .line 531
    move-object/from16 v25, v11

    .line 532
    .line 533
    move-object/from16 v26, v7

    .line 534
    .line 535
    move/from16 v27, v15

    .line 536
    .line 537
    move/from16 v28, p3

    .line 538
    .line 539
    move/from16 v29, v12

    .line 540
    .line 541
    move-object/from16 v30, v6

    .line 542
    .line 543
    move-object/from16 v31, v1

    .line 544
    .line 545
    move-wide/from16 v36, v19

    .line 546
    .line 547
    move-wide/from16 v38, v4

    .line 548
    .line 549
    move/from16 v40, v23

    .line 550
    .line 551
    invoke-direct/range {v25 .. v40}, Lcom/lody/virtual/server/content/SyncOperation;-><init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;JJJJZ)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v11}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 555
    .line 556
    .line 557
    goto :goto_f

    .line 558
    :cond_15
    move-object/from16 v42, v7

    .line 559
    .line 560
    move/from16 v17, v11

    .line 561
    .line 562
    move-object/from16 v18, v15

    .line 563
    .line 564
    :goto_f
    if-nez p10, :cond_16

    .line 565
    .line 566
    new-instance v1, Ljava/lang/StringBuilder;

    .line 567
    .line 568
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 569
    .line 570
    .line 571
    const-string v7, "scheduleSync: delay until "

    .line 572
    .line 573
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v7, " run by "

    .line 580
    .line 581
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string v7, " flex "

    .line 588
    .line 589
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    move-wide/from16 p8, v4

    .line 593
    .line 594
    move-wide/from16 v4, p6

    .line 595
    .line 596
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    move-object/from16 v7, v42

    .line 621
    .line 622
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    move-object/from16 v2, v18

    .line 630
    .line 631
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 632
    .line 633
    .line 634
    new-instance v1, Lcom/lody/virtual/server/content/SyncOperation;

    .line 635
    .line 636
    iget-object v3, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 637
    .line 638
    iget v10, v9, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 639
    .line 640
    move-object v8, v1

    .line 641
    move-object/from16 v25, v9

    .line 642
    .line 643
    move-object v9, v3

    .line 644
    move/from16 v3, v16

    .line 645
    .line 646
    move/from16 v26, v17

    .line 647
    .line 648
    move/from16 v11, p3

    .line 649
    .line 650
    move/from16 v27, v12

    .line 651
    .line 652
    move-wide/from16 v28, v13

    .line 653
    .line 654
    move-object v13, v6

    .line 655
    move-object v14, v7

    .line 656
    move-wide/from16 v15, v28

    .line 657
    .line 658
    move-wide/from16 v17, p6

    .line 659
    .line 660
    move-wide/from16 v21, p8

    .line 661
    .line 662
    invoke-direct/range {v8 .. v23}, Lcom/lody/virtual/server/content/SyncOperation;-><init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;JJJJZ)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v1}, Lcom/lody/virtual/server/content/SyncManager;->scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V

    .line 666
    .line 667
    .line 668
    goto :goto_10

    .line 669
    :cond_16
    move-wide/from16 v4, p6

    .line 670
    .line 671
    move-object/from16 v25, v9

    .line 672
    .line 673
    move/from16 v27, v12

    .line 674
    .line 675
    move-wide/from16 v28, v13

    .line 676
    .line 677
    move/from16 v3, v16

    .line 678
    .line 679
    move/from16 v26, v17

    .line 680
    .line 681
    move-object/from16 v2, v18

    .line 682
    .line 683
    move-object/from16 v7, v42

    .line 684
    .line 685
    :goto_10
    move-object/from16 v1, p1

    .line 686
    .line 687
    move-object/from16 v5, p2

    .line 688
    .line 689
    move-object v15, v2

    .line 690
    move v10, v3

    .line 691
    move-object/from16 v9, v25

    .line 692
    .line 693
    move/from16 v11, v26

    .line 694
    .line 695
    move/from16 v12, v27

    .line 696
    .line 697
    move-wide/from16 v13, v28

    .line 698
    .line 699
    move/from16 v4, v41

    .line 700
    .line 701
    move-object/from16 v3, p4

    .line 702
    .line 703
    move/from16 v2, p5

    .line 704
    .line 705
    goto/16 :goto_9

    .line 706
    .line 707
    :cond_17
    move-object/from16 p1, v1

    .line 708
    .line 709
    move/from16 p5, v2

    .line 710
    .line 711
    move/from16 v41, v4

    .line 712
    .line 713
    move v3, v10

    .line 714
    move/from16 v26, v11

    .line 715
    .line 716
    move/from16 v27, v12

    .line 717
    .line 718
    move-wide/from16 v28, v13

    .line 719
    .line 720
    move-object v2, v15

    .line 721
    move-wide/from16 v4, p6

    .line 722
    .line 723
    add-int/lit8 v10, v3, 0x1

    .line 724
    .line 725
    move-object/from16 v3, p4

    .line 726
    .line 727
    move/from16 v4, v41

    .line 728
    .line 729
    const/4 v5, 0x0

    .line 730
    const/4 v6, 0x1

    .line 731
    move/from16 v2, p5

    .line 732
    .line 733
    goto/16 :goto_7

    .line 734
    .line 735
    :cond_18
    return-void
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
.end method

.method public scheduleSyncOperation(Lcom/lody/virtual/server/content/SyncOperation;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncManager;->mSyncQueue:Lcom/lody/virtual/server/content/SyncQueue;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lcom/lody/virtual/server/content/SyncQueue;->add(Lcom/lody/virtual/server/content/SyncOperation;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v0, "SyncManager"

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "scheduleSyncOperation: enqueued "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->sendCheckAlarmsMessage()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v0, "SyncManager"

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "scheduleSyncOperation: dropping duplicate sync operation "

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1
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

.method public updateRunningAccounts()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->get()Lcom/lody/virtual/server/accounts/VAccountManagerService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/server/accounts/VAccountManagerService;->getAllAccounts()[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mBootCompleted:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->doDatabaseCleanup()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncManager;->mActiveSyncContexts:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncManager;->mRunningAccounts:[Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 37
    .line 38
    iget-object v3, v1, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

    .line 39
    .line 40
    iget-object v4, v3, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 41
    .line 42
    iget v3, v3, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 43
    .line 44
    invoke-direct {p0, v2, v4, v3}, Lcom/lody/virtual/server/content/SyncManager;->containsAccountAndUser([Lcom/lody/virtual/server/accounts/AccountAndUser;Landroid/accounts/Account;I)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    const-string v2, "SyncManager"

    .line 51
    .line 52
    const-string v3, "canceling sync since the account is no longer running"

    .line 53
    .line 54
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-direct {p0, v1, v2}, Lcom/lody/virtual/server/content/SyncManager;->sendSyncFinishedOrCanceledMessage(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;Landroid/content/SyncResult;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncManager;->sendCheckAlarmsMessage()V

    .line 63
    .line 64
    .line 65
    return-void
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
