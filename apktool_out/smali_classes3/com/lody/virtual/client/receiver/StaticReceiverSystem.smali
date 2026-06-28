.class public Lcom/lody/virtual/client/receiver/StaticReceiverSystem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;,
        Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;,
        Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;,
        Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;
    }
.end annotation


# static fields
.field private static final BROADCAST_TIME_OUT:I = 0x2134

.field private static final TAG:Ljava/lang/String; = "StaticReceiverSystem"

.field private static final mSystem:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;


# instance fields
.field private mApplicationInfo:Landroid/content/pm/ApplicationInfo;

.field private final mBroadcastRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;",
            ">;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

.field private mTimeoutHandler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;

.field private mUserId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    invoke-direct {v0}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mSystem:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    .line 10
    .line 11
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
.end method

.method static synthetic access$000(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Lcom/lody/virtual/remote/BroadcastIntentData;Landroid/content/pm/ActivityInfo;Landroid/content/BroadcastReceiver$PendingResult;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->handleStaticBroadcast(Lcom/lody/virtual/remote/BroadcastIntentData;Landroid/content/pm/ActivityInfo;Landroid/content/BroadcastReceiver$PendingResult;)Z

    move-result p0

    return p0
.end method

.method public static get()Lcom/lody/virtual/client/receiver/StaticReceiverSystem;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mSystem:Lcom/lody/virtual/client/receiver/StaticReceiverSystem;

    return-object v0
.end method

.method private handleStaticBroadcast(Lcom/lody/virtual/remote/BroadcastIntentData;Landroid/content/pm/ActivityInfo;Landroid/content/BroadcastReceiver$PendingResult;)Z
    .locals 6

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->targetPackage:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget v0, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->userId:I

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    iget v2, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mUserId:I

    .line 21
    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    :try_start_0
    invoke-static {p2}, Lcom/lody/virtual/helper/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;

    .line 30
    .line 31
    invoke-direct {v2, p2, p3}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;-><init>(Landroid/content/pm/ActivityInfo;Landroid/content/BroadcastReceiver$PendingResult;)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Lmirror/android/content/BroadcastReceiver$PendingResult;->mToken:Lmirror/RefObject;

    .line 35
    .line 36
    invoke-virtual {v3, p3}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Landroid/os/IBinder;

    .line 41
    .line 42
    iget-object v4, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    .line 43
    .line 44
    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :try_start_1
    iget-object v5, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    .line 46
    .line 47
    invoke-interface {v5, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :try_start_2
    new-instance v2, Landroid/os/Message;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mTimeoutHandler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;

    .line 59
    .line 60
    const-wide/16 v4, 0x2134

    .line 61
    .line 62
    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, p1, Lcom/lody/virtual/remote/BroadcastIntentData;->intent:Landroid/content/Intent;

    .line 72
    .line 73
    invoke-virtual {v2, p2, v0, p1, p3}, Lcom/lody/virtual/client/VClient;->scheduleReceiver(Ljava/lang/String;Landroid/content/ComponentName;Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 81
    :catch_0
    move-exception p1

    .line 82
    const-string p2, "StaticReceiverSystem"

    .line 83
    .line 84
    invoke-static {p2, p1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    return v1
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public attach(Ljava/lang/String;Landroid/content/Context;Landroid/content/pm/ApplicationInfo;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mApplicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    if-nez v3, :cond_4

    .line 10
    .line 11
    move-object/from16 v3, p2

    .line 12
    .line 13
    iput-object v3, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mContext:Landroid/content/Context;

    .line 14
    .line 15
    iput-object v1, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mApplicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    iput v2, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mUserId:I

    .line 18
    .line 19
    new-instance v3, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v4, "BroadcastThread"

    .line 22
    .line 23
    invoke-direct {v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Landroid/os/HandlerThread;

    .line 27
    .line 28
    const-string v5, "BroadcastAnrThread"

    .line 29
    .line 30
    invoke-direct {v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 37
    .line 38
    .line 39
    new-instance v5, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v5, v3}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iput-object v5, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 49
    .line 50
    new-instance v3, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-direct {v3, v0, v4}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;-><init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mTimeoutHandler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;

    .line 60
    .line 61
    invoke-static {}, Lcom/lody/virtual/client/ipc/VPackageManager;->get()Lcom/lody/virtual/client/ipc/VPackageManager;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 66
    .line 67
    move-object/from16 v4, p1

    .line 68
    .line 69
    invoke-virtual {v3, v1, v4, v2}, Lcom/lody/virtual/client/ipc/VPackageManager;->getReceiverInfos(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lcom/lody/virtual/remote/ReceiverInfo;

    .line 88
    .line 89
    iget-object v3, v2, Lcom/lody/virtual/remote/ReceiverInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 90
    .line 91
    invoke-static {v3}, Lcom/lody/virtual/helper/utils/ComponentUtils;->getComponentAction(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    new-instance v6, Landroid/content/IntentFilter;

    .line 96
    .line 97
    invoke-direct {v6, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v3, "__VA__|_static_receiver_"

    .line 101
    .line 102
    invoke-virtual {v6, v3}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/16 v11, 0x21

    .line 109
    .line 110
    if-lt v4, v11, :cond_1

    .line 111
    .line 112
    iget-object v4, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mContext:Landroid/content/Context;

    .line 113
    .line 114
    new-instance v5, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;

    .line 115
    .line 116
    iget-object v7, v2, Lcom/lody/virtual/remote/ReceiverInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 117
    .line 118
    invoke-direct {v5, v0, v7}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;-><init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/content/pm/ActivityInfo;)V

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    iget-object v8, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 123
    .line 124
    const/4 v9, 0x2

    .line 125
    invoke-static/range {v4 .. v9}, Landroidx/core/content/a;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    iget-object v4, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mContext:Landroid/content/Context;

    .line 130
    .line 131
    new-instance v5, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;

    .line 132
    .line 133
    iget-object v7, v2, Lcom/lody/virtual/remote/ReceiverInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 134
    .line 135
    invoke-direct {v5, v0, v7}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;-><init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/content/pm/ActivityInfo;)V

    .line 136
    .line 137
    .line 138
    iget-object v7, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 139
    .line 140
    invoke-virtual {v4, v5, v6, v10, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    :goto_0
    iget-object v4, v2, Lcom/lody/virtual/remote/ReceiverInfo;->filters:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_0

    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    move-object v14, v5

    .line 160
    check-cast v14, Landroid/content/IntentFilter;

    .line 161
    .line 162
    invoke-static {v14}, Lcom/lody/virtual/client/env/SpecialComponentList;->protectIntentFilter(Landroid/content/IntentFilter;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v14, v3}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 169
    .line 170
    if-lt v5, v11, :cond_2

    .line 171
    .line 172
    iget-object v12, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mContext:Landroid/content/Context;

    .line 173
    .line 174
    new-instance v13, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;

    .line 175
    .line 176
    iget-object v5, v2, Lcom/lody/virtual/remote/ReceiverInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 177
    .line 178
    invoke-direct {v13, v0, v5}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;-><init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/content/pm/ActivityInfo;)V

    .line 179
    .line 180
    .line 181
    const/4 v15, 0x0

    .line 182
    iget-object v5, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 183
    .line 184
    const/16 v17, 0x2

    .line 185
    .line 186
    move-object/from16 v16, v5

    .line 187
    .line 188
    invoke-static/range {v12 .. v17}, Landroidx/core/content/a;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_2
    iget-object v5, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mContext:Landroid/content/Context;

    .line 193
    .line 194
    new-instance v6, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;

    .line 195
    .line 196
    iget-object v7, v2, Lcom/lody/virtual/remote/ReceiverInfo;->info:Landroid/content/pm/ActivityInfo;

    .line 197
    .line 198
    invoke-direct {v6, v0, v7}, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticReceiver;-><init>(Lcom/lody/virtual/client/receiver/StaticReceiverSystem;Landroid/content/pm/ActivityInfo;)V

    .line 199
    .line 200
    .line 201
    iget-object v7, v0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mScheduler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$StaticScheduler;

    .line 202
    .line 203
    invoke-virtual {v5, v6, v14, v10, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_3
    return-void

    .line 208
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 209
    .line 210
    const-string v2, "attached"

    .line 211
    .line 212
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v1
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

.method public broadcastFinish(Landroid/os/IBinder;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mBroadcastRecords:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-object v2, p0, Lcom/lody/virtual/client/receiver/StaticReceiverSystem;->mTimeoutHandler:Lcom/lody/virtual/client/receiver/StaticReceiverSystem$TimeoutHandler;

    .line 18
    .line 19
    invoke-virtual {v2, v0, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :try_start_1
    iget-object p1, v1, Lcom/lody/virtual/client/receiver/StaticReceiverSystem$BroadcastRecord;->pendingResult:Landroid/content/BroadcastReceiver$PendingResult;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    :goto_0
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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
