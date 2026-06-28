.class public Lcom/lody/virtual/server/content/SyncStorageEngine;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;,
        Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;,
        Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;,
        Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;,
        Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;,
        Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;
    }
.end annotation


# static fields
.field private static final ACCOUNTS_VERSION:I = 0x2

.field private static final DEBUG:Z = false

.field private static final DEFAULT_FLEX_PERCENT_SYNC:D = 0.04

.field private static final DEFAULT_MIN_FLEX_ALLOWED_SECS:J = 0x5L

.field private static final DEFAULT_POLL_FREQUENCY_SECONDS:J = 0x15180L

.field public static final EVENTS:[Ljava/lang/String;

.field public static final EVENT_START:I = 0x0

.field public static final EVENT_STOP:I = 0x1

.field public static final MAX_HISTORY:I = 0x64

.field public static final MESG_CANCELED:Ljava/lang/String; = "canceled"

.field public static final MESG_SUCCESS:Ljava/lang/String; = "success"

.field private static final MSG_WRITE_STATISTICS:I = 0x2

.field private static final MSG_WRITE_STATUS:I = 0x1

.field public static final NOT_IN_BACKOFF_MODE:J = -0x1L

.field private static final PENDING_FINISH_TO_WRITE:I = 0x4

.field public static final PENDING_OPERATION_VERSION:I = 0x3

.field public static final SOURCES:[Ljava/lang/String;

.field public static final SOURCE_LOCAL:I = 0x1

.field public static final SOURCE_PERIODIC:I = 0x4

.field public static final SOURCE_POLL:I = 0x2

.field public static final SOURCE_SERVER:I = 0x0

.field public static final SOURCE_USER:I = 0x3

.field public static final STATISTICS_FILE_END:I = 0x0

.field public static final STATISTICS_FILE_ITEM:I = 0x65

.field public static final STATISTICS_FILE_ITEM_OLD:I = 0x64

.field public static final STATUS_FILE_END:I = 0x0

.field public static final STATUS_FILE_ITEM:I = 0x64

.field private static final SYNC_ENABLED_DEFAULT:Z = false

.field private static final TAG:Ljava/lang/String; = "SyncManager"

.field private static final TAG_FILE:Ljava/lang/String; = "SyncManagerFile"

.field private static final WRITE_STATISTICS_DELAY:J = 0x1b7740L

.field private static final WRITE_STATUS_DELAY:J = 0x927c0L

.field private static final XML_ATTR_AUTHORITYID:Ljava/lang/String; = "authority_id"

.field private static final XML_ATTR_ENABLED:Ljava/lang/String; = "enabled"

.field private static final XML_ATTR_EXPEDITED:Ljava/lang/String; = "expedited"

.field private static final XML_ATTR_LISTEN_FOR_TICKLES:Ljava/lang/String; = "listen-for-tickles"

.field private static final XML_ATTR_NEXT_AUTHORITY_ID:Ljava/lang/String; = "nextAuthorityId"

.field private static final XML_ATTR_REASON:Ljava/lang/String; = "reason"

.field private static final XML_ATTR_SOURCE:Ljava/lang/String; = "source"

.field private static final XML_ATTR_SYNC_RANDOM_OFFSET:Ljava/lang/String; = "offsetInSeconds"

.field private static final XML_ATTR_USER:Ljava/lang/String; = "user"

.field private static final XML_ATTR_VERSION:Ljava/lang/String; = "version"

.field private static final XML_TAG_LISTEN_FOR_TICKLES:Ljava/lang/String; = "listenForTickles"

.field private static sAuthorityRenames:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;


# instance fields
.field private final mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

.field private final mAccounts:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/lody/virtual/server/accounts/AccountAndUser;",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mAuthorities:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mCal:Ljava/util/Calendar;

.field private final mChangeListeners:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "Landroid/content/ISyncStatusObserver;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private final mCurrentSyncs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/VSyncInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

.field private mDefaultMasterSyncAutomatically:Z

.field private mMasterSyncAutomatically:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private mNextAuthorityId:I

.field private mNextHistoryId:I

.field private mNumPendingFinished:I

.field private final mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

.field private final mPendingOperations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;",
            ">;"
        }
    .end annotation
.end field

.field private final mServices:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Landroid/util/SparseArray<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

.field private final mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

.field private final mSyncHistory:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;",
            ">;"
        }
    .end annotation
.end field

.field private mSyncRandomOffset:I

.field private mSyncRequestListener:Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;

.field private final mSyncStatus:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/content/SyncStatusInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mYear:I

.field private mYearInDays:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "START"

    .line 2
    .line 3
    const-string v1, "STOP"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->EVENTS:[Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "USER"

    .line 12
    .line 13
    const-string v1, "PERIODIC"

    .line 14
    .line 15
    const-string v2, "SERVER"

    .line 16
    .line 17
    const-string v3, "LOCAL"

    .line 18
    .line 19
    const-string v4, "POLL"

    .line 20
    .line 21
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->SOURCES:[Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sAuthorityRenames:Ljava/util/HashMap;

    .line 33
    .line 34
    const-string v1, "contacts"

    .line 35
    .line 36
    const-string v2, "com.android.contacts"

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sAuthorityRenames:Ljava/util/HashMap;

    .line 42
    .line 43
    const-string v1, "calendar"

    .line 44
    .line 45
    const-string v2, "com.android.calendar"

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    sput-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 52
    .line 53
    return-void
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

.method private constructor <init>(Landroid/content/Context;Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v0, Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCurrentSyncs:Landroid/util/SparseArray;

    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance v0, Landroid/os/RemoteCallbackList;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mServices:Ljava/util/HashMap;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 62
    .line 63
    const/16 v1, 0x1c

    .line 64
    .line 65
    new-array v1, v1, [Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 66
    .line 67
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 68
    .line 69
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNumPendingFinished:I

    .line 70
    .line 71
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextHistoryId:I

    .line 72
    .line 73
    new-instance v1, Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 79
    .line 80
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mContext:Landroid/content/Context;

    .line 81
    .line 82
    sput-object p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 83
    .line 84
    const-string p1, "GMT+0"

    .line 85
    .line 86
    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 95
    .line 96
    iput-boolean v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDefaultMasterSyncAutomatically:Z

    .line 97
    .line 98
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->maybeDeleteLegacyPendingInfoLocked(Ljava/io/File;)V

    .line 99
    .line 100
    .line 101
    new-instance p1, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 102
    .line 103
    new-instance v0, Ljava/io/File;

    .line 104
    .line 105
    const-string v1, "accounts.xml"

    .line 106
    .line 107
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 114
    .line 115
    new-instance p1, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 116
    .line 117
    new-instance v0, Ljava/io/File;

    .line 118
    .line 119
    const-string v1, "status.bin"

    .line 120
    .line 121
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 128
    .line 129
    new-instance p1, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 130
    .line 131
    new-instance v0, Ljava/io/File;

    .line 132
    .line 133
    const-string v1, "pending.xml"

    .line 134
    .line 135
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 142
    .line 143
    new-instance p1, Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 144
    .line 145
    new-instance v0, Ljava/io/File;

    .line 146
    .line 147
    const-string v1, "stats.bin"

    .line 148
    .line 149
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;-><init>(Ljava/io/File;)V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 156
    .line 157
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readAccountInfoLocked()V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readStatusLocked()V

    .line 161
    .line 162
    .line 163
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readPendingOperationsLocked()V

    .line 164
    .line 165
    .line 166
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readStatisticsLocked()V

    .line 167
    .line 168
    .line 169
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readAndDeleteLegacyAccountInfoLocked()V

    .line 170
    .line 171
    .line 172
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 173
    .line 174
    .line 175
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 182
    .line 183
    .line 184
    return-void
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

.method private appendPendingOperationLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Appending to "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "SyncManager"

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->openAppend()Ljava/io/FileOutputStream;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 35
    :try_start_1
    new-instance v2, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 36
    .line 37
    invoke-direct {v2}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "utf-8"

    .line 41
    .line 42
    invoke-interface {v2, v0, v3}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;Lorg/xmlpull/v1/XmlSerializer;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    :goto_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception p1

    .line 63
    :try_start_3
    const-string v2, "Error writing appending operation"

    .line 64
    .line 65
    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_1
    :goto_1
    return-void

    .line 75
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 76
    .line 77
    .line 78
    :catch_2
    throw p1

    .line 79
    :catch_3
    const-string p1, "Failed append; writing full file"

    .line 80
    .line 81
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 85
    .line 86
    .line 87
    return-void
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

.method public static calculateDefaultFlexTime(J)J
    .locals 2

    const-wide/16 v0, 0x5

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_0
    const-wide/32 v0, 0x15180

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    long-to-double p0, p0

    const-wide v0, 0x3fa47ae147ae147bL    # 0.04

    mul-double/2addr p0, v0

    double-to-long p0, p0

    return-wide p0

    :cond_1
    const-wide/16 p0, 0xd80

    return-wide p0
.end method

.method private createCopyPairOfAuthorityWithSyncStatusLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            "Landroid/content/SyncStatusInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;-><init>(Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/content/SyncStatusInfo;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/content/SyncStatusInfo;-><init>(Landroid/content/SyncStatusInfo;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private extrasToXml(Lorg/xmlpull/v1/XmlSerializer;Landroid/os/Bundle;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_7

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "extra"

    .line 23
    .line 24
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 25
    .line 26
    .line 27
    const-string v4, "name"

    .line 28
    .line 29
    invoke-interface {p1, v2, v4, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    instance-of v4, v1, Ljava/lang/Long;

    .line 37
    .line 38
    const-string v5, "value1"

    .line 39
    .line 40
    const-string v6, "type"

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    const-string v4, "long"

    .line 45
    .line 46
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    instance-of v4, v1, Ljava/lang/Integer;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    const-string v4, "integer"

    .line 62
    .line 63
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    const-string v4, "boolean"

    .line 79
    .line 80
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    instance-of v4, v1, Ljava/lang/Float;

    .line 92
    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    const-string v4, "float"

    .line 96
    .line 97
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    instance-of v4, v1, Ljava/lang/Double;

    .line 109
    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    const-string v4, "double"

    .line 113
    .line 114
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    instance-of v4, v1, Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    const-string v4, "string"

    .line 130
    .line 131
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-interface {p1, v2, v5, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    instance-of v4, v1, Landroid/accounts/Account;

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    const-string v4, "account"

    .line 147
    .line 148
    invoke-interface {p1, v2, v6, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 149
    .line 150
    .line 151
    check-cast v1, Landroid/accounts/Account;

    .line 152
    .line 153
    iget-object v4, v1, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {p1, v2, v5, v4}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 156
    .line 157
    .line 158
    const-string v4, "value2"

    .line 159
    .line 160
    iget-object v1, v1, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 161
    .line 162
    invoke-interface {p1, v2, v4, v1}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_1
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_7
    return-void
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

.method private static flattenBundle(Landroid/os/Bundle;)[B
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 19
    .line 20
    .line 21
    throw p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 0

    .line 1
    new-instance p4, Lcom/lody/virtual/server/accounts/AccountAndUser;

    invoke-direct {p4, p1, p2}, Lcom/lody/virtual/server/accounts/AccountAndUser;-><init>(Landroid/accounts/Account;I)V

    .line 2
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    invoke-virtual {p1, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 3
    :cond_0
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    if-nez p1, :cond_1

    return-object p2

    :cond_1
    return-object p1
.end method

.method private getAuthorityLocked(Landroid/content/ComponentName;ILjava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 0

    .line 4
    iget-object p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mServices:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method private getCurrentDayLocked()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mYear:I

    .line 18
    .line 19
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v1, v2, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mYear:I

    .line 35
    .line 36
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/Calendar;->clear()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 42
    .line 43
    iget v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mYear:I

    .line 44
    .line 45
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCal:Ljava/util/Calendar;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    const-wide/32 v3, 0x5265c00

    .line 55
    .line 56
    .line 57
    div-long/2addr v1, v3

    .line 58
    long-to-int v1, v1

    .line 59
    iput v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mYearInDays:I

    .line 60
    .line 61
    :cond_0
    iget v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mYearInDays:I

    .line 62
    .line 63
    add-int/2addr v0, v1

    .line 64
    return v0
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

.method private getCurrentSyncs(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/content/VSyncInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncsLocked(I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    monitor-exit v0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
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

.method private getCurrentSyncsLocked(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/content/VSyncInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCurrentSyncs:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mCurrentSyncs:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I
    .locals 0

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    return p0
.end method

.method static getLongColumn(Landroid/database/Cursor;Ljava/lang/String;)J
    .locals 0

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p0

    return-wide p0
.end method

.method private getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 3

    .line 11
    new-instance v0, Lcom/lody/virtual/server/accounts/AccountAndUser;

    invoke-direct {v0, p1, p2}, Lcom/lody/virtual/server/accounts/AccountAndUser;-><init>(Landroid/accounts/Account;I)V

    .line 12
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    if-nez v1, :cond_0

    .line 13
    new-instance v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    invoke-direct {v1, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;-><init>(Lcom/lody/virtual/server/accounts/AccountAndUser;)V

    .line 14
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_0
    iget-object v0, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    if-nez v0, :cond_2

    if-gez p4, :cond_1

    .line 16
    iget p4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    add-int/lit8 p5, p4, 0x1

    .line 17
    iput p5, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    const/4 p5, 0x1

    .line 18
    :cond_1
    new-instance v0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;-><init>(Landroid/accounts/Account;ILjava/lang/String;I)V

    .line 19
    iget-object p1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    invoke-virtual {p1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    invoke-virtual {p1, p4, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    if-eqz p5, :cond_2

    .line 21
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    :cond_2
    return-object v0
.end method

.method private getOrCreateAuthorityLocked(Landroid/content/ComponentName;IIZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mServices:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mServices:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    if-nez v1, :cond_2

    if-gez p3, :cond_1

    .line 5
    iget p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    add-int/lit8 p4, p3, 0x1

    .line 6
    iput p4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    const/4 p4, 0x1

    .line 7
    :cond_1
    new-instance v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    invoke-direct {v1, p1, p2, p3}, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;-><init>(Landroid/content/ComponentName;II)V

    .line 8
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 9
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    invoke-virtual {p1, p3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    if-eqz p4, :cond_2

    .line 10
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    :cond_2
    return-object v1
.end method

.method private getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/SyncStatusInfo;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/content/SyncStatusInfo;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Landroid/content/SyncStatusInfo;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static getSingleton()Lcom/lody/virtual/server/content/SyncStorageEngine;
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "not initialized"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static init(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getSyncDirectory()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/FileUtils;->ensureDirCreate(Ljava/io/File;)Z

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 14
    .line 15
    invoke-direct {v1, p0, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;-><init>(Landroid/content/Context;Ljava/io/File;)V

    .line 16
    .line 17
    .line 18
    sput-object v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->sSyncStorageEngine:Lcom/lody/virtual/server/content/SyncStorageEngine;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private maybeDeleteLegacyPendingInfoLocked(Ljava/io/File;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "pending.bin"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-void
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

.method private maybeMigrateSettingsForRenamedAuthorities()Z
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    const/4 v5, 0x1

    .line 16
    if-ge v3, v1, :cond_3

    .line 17
    .line 18
    iget-object v6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v6, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 25
    .line 26
    sget-object v7, Lcom/lody/virtual/server/content/SyncStorageEngine;->sAuthorityRenames:Ljava/util/HashMap;

    .line 27
    .line 28
    iget-object v8, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    move-object v11, v7

    .line 35
    check-cast v11, Ljava/lang/String;

    .line 36
    .line 37
    if-nez v11, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    iget-boolean v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 44
    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 49
    .line 50
    iget v8, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 51
    .line 52
    const-string v9, "cleanup"

    .line 53
    .line 54
    invoke-direct {p0, v7, v8, v11, v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v9, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 62
    .line 63
    iget v10, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 64
    .line 65
    const/4 v12, -0x1

    .line 66
    const/4 v13, 0x0

    .line 67
    move-object v8, p0

    .line 68
    invoke-direct/range {v8 .. v13}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iput-boolean v5, v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 73
    .line 74
    move v4, v5

    .line 75
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 93
    .line 94
    iget-object v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 95
    .line 96
    iget v4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 97
    .line 98
    iget-object v1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {p0, v3, v4, v1, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->removeAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    move v4, v5

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    return v4
    .line 106
.end method

.method private parseAuthority(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v8, "SyncManager"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    const-string v0, "id"

    .line 9
    .line 10
    invoke-interface {v1, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    move v5, v0

    .line 19
    goto :goto_1

    .line 20
    :catch_0
    move-exception v0

    .line 21
    const-string v3, "the id of the authority is null"

    .line 22
    .line 23
    invoke-static {v8, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception v0

    .line 28
    const-string v3, "error parsing the id of the authority"

    .line 29
    .line 30
    invoke-static {v8, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :goto_0
    const/4 v5, -0x1

    .line 34
    :goto_1
    if-ltz v5, :cond_b

    .line 35
    .line 36
    const-string v0, "authority"

    .line 37
    .line 38
    invoke-interface {v1, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v3, "enabled"

    .line 43
    .line 44
    invoke-interface {v1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    const-string v3, "syncable"

    .line 49
    .line 50
    invoke-interface {v1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "account"

    .line 55
    .line 56
    invoke-interface {v1, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    const-string v4, "type"

    .line 61
    .line 62
    invoke-interface {v1, v2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const-string v6, "user"

    .line 67
    .line 68
    invoke-interface {v1, v2, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string v12, "package"

    .line 73
    .line 74
    invoke-interface {v1, v2, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    const-string v13, "class"

    .line 79
    .line 80
    invoke-interface {v1, v2, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-nez v6, :cond_0

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    goto :goto_2

    .line 88
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    move v6, v2

    .line 93
    :goto_2
    const-string v14, "unknown"

    .line 94
    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    const-string v4, "com.google"

    .line 98
    .line 99
    move-object v15, v14

    .line 100
    goto :goto_3

    .line 101
    :cond_1
    move-object v15, v3

    .line 102
    :goto_3
    iget-object v2, v7, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 103
    .line 104
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 109
    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v9, "Adding authority: account="

    .line 116
    .line 117
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v9, " auth="

    .line 124
    .line 125
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v13, " user="

    .line 132
    .line 133
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v13, " enabled="

    .line 140
    .line 141
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    move-object/from16 v16, v13

    .line 148
    .line 149
    const-string v13, " syncable="

    .line 150
    .line 151
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v8, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    const-string v2, "Creating entry"

    .line 167
    .line 168
    invoke-static {v8, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    if-eqz v11, :cond_2

    .line 172
    .line 173
    new-instance v2, Landroid/accounts/Account;

    .line 174
    .line 175
    invoke-direct {v2, v11, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 v12, 0x0

    .line 179
    move-object/from16 v1, p0

    .line 180
    .line 181
    move v3, v6

    .line 182
    move-object v4, v0

    .line 183
    move v6, v12

    .line 184
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    move-object v2, v1

    .line 189
    const/4 v1, 0x0

    .line 190
    goto :goto_4

    .line 191
    :cond_2
    new-instance v2, Landroid/content/ComponentName;

    .line 192
    .line 193
    invoke-direct {v2, v12, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 v1, 0x0

    .line 197
    invoke-direct {v7, v2, v6, v5, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/content/ComponentName;IIZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    :goto_4
    if-lez p2, :cond_4

    .line 202
    .line 203
    iget-object v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_3
    const/4 v1, 0x0

    .line 210
    :cond_4
    :goto_5
    if-eqz v2, :cond_a

    .line 211
    .line 212
    const/4 v0, 0x1

    .line 213
    if-eqz v10, :cond_6

    .line 214
    .line 215
    invoke-static {v10}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_5

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_5
    move v3, v1

    .line 223
    goto :goto_7

    .line 224
    :cond_6
    :goto_6
    move v3, v0

    .line 225
    :goto_7
    iput-boolean v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 226
    .line 227
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_7

    .line 232
    .line 233
    const/4 v3, -0x1

    .line 234
    iput v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_7
    if-eqz v15, :cond_9

    .line 238
    .line 239
    invoke-static {v15}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_8

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_8
    move v13, v1

    .line 247
    goto :goto_9

    .line 248
    :cond_9
    :goto_8
    move v13, v0

    .line 249
    :goto_9
    iput v13, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v3, "Failure adding authority: account="

    .line 258
    .line 259
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-object/from16 v0, v16

    .line 272
    .line 273
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    :cond_b
    :goto_a
    return-object v2
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

.method private parseExtra(Lorg/xmlpull/v1/XmlPullParser;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const-string v0, "error parsing bundle value"

    .line 2
    .line 3
    const-string v1, "SyncManager"

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-interface {p1, v3, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v4, "type"

    .line 13
    .line 14
    invoke-interface {p1, v3, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, "value1"

    .line 19
    .line 20
    invoke-interface {p1, v3, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v6, "value2"

    .line 25
    .line 26
    invoke-interface {p1, v3, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :try_start_0
    const-string v3, "long"

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {p2, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v3, "integer"

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p2, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const-string v3, "double"

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-virtual {p2, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-string v3, "float"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {p2, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const-string v3, "boolean"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p2, v2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    const-string v3, "string"

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    invoke-virtual {p2, v2, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    const-string v3, "account"

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    new-instance v3, Landroid/accounts/Account;

    .line 131
    .line 132
    invoke-direct {v3, v5, p1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :catch_0
    move-exception p1

    .line 140
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :catch_1
    move-exception p1

    .line 145
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_0
    return-void
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

.method private parseListenForTickles(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 5

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    const-string v1, "user"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception v1

    .line 17
    const-string v4, "the user in listen-for-tickles is null"

    .line 18
    .line 19
    invoke-static {v0, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_1
    move-exception v1

    .line 24
    const-string v4, "error parsing the user for listen-for-tickles"

    .line 25
    .line 26
    invoke-static {v0, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    .line 28
    .line 29
    :goto_0
    move v0, v3

    .line 30
    :goto_1
    const-string v1, "enabled"

    .line 31
    .line 32
    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    :cond_0
    const/4 v3, 0x1

    .line 45
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
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

.method private parsePeriodicSync(Lorg/xmlpull/v1/XmlPullParser;Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)Landroid/content/PeriodicSync;
    .locals 9

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    new-instance v4, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "period"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {p1, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v3, "flex"

    .line 16
    .line 17
    invoke-interface {p1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2

    .line 25
    :try_start_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    :goto_0
    move-wide v7, v0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    invoke-static {v5, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->calculateDefaultFlexTime(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "No flex time specified for this sync, using a default. period: "

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, " flex: "

    .line 49
    .line 50
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-wide v7, v1

    .line 64
    goto :goto_1

    .line 65
    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "Error formatting value parsed for periodic sync flex: "

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->calculateDefaultFlexTime(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    goto :goto_0

    .line 90
    :goto_1
    new-instance p1, Landroid/content/PeriodicSync;

    .line 91
    .line 92
    iget-object v2, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 93
    .line 94
    iget-object v3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 95
    .line 96
    move-object v1, p1

    .line 97
    invoke-direct/range {v1 .. v6}, Landroid/content/PeriodicSync;-><init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 101
    .line 102
    invoke-virtual {v0, p1, v7, v8}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :catch_2
    move-exception p1

    .line 112
    const-string p2, "the period of a periodic sync is null"

    .line 113
    .line 114
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :catch_3
    move-exception p1

    .line 119
    const-string p2, "error parsing the period of a periodic sync"

    .line 120
    .line 121
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 122
    .line 123
    .line 124
    return-object v2
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

.method private readAccountInfoLocked()V
    .locals 15

    .line 1
    const-string v0, "Error reading accounts"

    .line 2
    .line 3
    const-string v1, "SyncManager"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    :try_start_0
    iget-object v5, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 9
    .line 10
    invoke-virtual {v5}, Lcom/lody/virtual/helper/utils/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v5
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v7, "Reading "

    .line 20
    .line 21
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v7, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 25
    .line 26
    invoke-virtual {v7}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/nio/channels/FileChannel;->size()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    const-wide/16 v8, 0x0

    .line 49
    .line 50
    cmp-long v6, v6, v8

    .line 51
    .line 52
    if-nez v6, :cond_0

    .line 53
    .line 54
    const-string v6, "File is empty, writing default content"

    .line 55
    .line 56
    invoke-static {v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeDefaultAccountInfo()V

    .line 60
    .line 61
    .line 62
    iget-object v6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 63
    .line 64
    invoke-virtual {v6}, Lcom/lody/virtual/helper/utils/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    :cond_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface {v6, v5, v4}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    :goto_0
    const/4 v8, 0x2

    .line 80
    if-eq v7, v8, :cond_1

    .line 81
    .line 82
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    const-string v9, "accounts"

    .line 92
    .line 93
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_d

    .line 98
    .line 99
    const-string v7, "listen-for-tickles"

    .line 100
    .line 101
    invoke-interface {v6, v4, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    const-string v9, "version"

    .line 106
    .line 107
    invoke-interface {v6, v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    const/4 v10, 0x0

    .line 112
    if-nez v9, :cond_2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    :try_start_2
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v9
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    goto :goto_2

    .line 120
    :catch_0
    :goto_1
    move v9, v10

    .line 121
    :goto_2
    :try_start_3
    const-string v11, "nextAuthorityId"

    .line 122
    .line 123
    invoke-interface {v6, v4, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    if-nez v11, :cond_3

    .line 128
    .line 129
    move v11, v10

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    :try_start_4
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    :goto_3
    iget v12, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 136
    .line 137
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    iput v11, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 142
    .line 143
    :catch_1
    :try_start_5
    const-string v11, "offsetInSeconds"

    .line 144
    .line 145
    invoke-interface {v6, v4, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    if-nez v11, :cond_4

    .line 150
    .line 151
    move v11, v10

    .line 152
    goto :goto_4

    .line 153
    :cond_4
    :try_start_6
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    :goto_4
    iput v11, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :catch_2
    :try_start_7
    iput v10, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I

    .line 161
    .line 162
    :goto_5
    iget v11, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I

    .line 163
    .line 164
    if-nez v11, :cond_5

    .line 165
    .line 166
    new-instance v11, Ljava/util/Random;

    .line 167
    .line 168
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    invoke-direct {v11, v12, v13}, Ljava/util/Random;-><init>(J)V

    .line 173
    .line 174
    .line 175
    const v12, 0x15180

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11, v12}, Ljava/util/Random;->nextInt(I)I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    iput v11, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I

    .line 183
    .line 184
    :cond_5
    iget-object v11, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 185
    .line 186
    if-eqz v7, :cond_7

    .line 187
    .line 188
    invoke-static {v7}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_6

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_6
    move v7, v10

    .line 196
    goto :goto_7

    .line 197
    :cond_7
    :goto_6
    move v7, v2

    .line 198
    :goto_7
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {v11, v10, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    move-object v10, v4

    .line 210
    move-object v11, v10

    .line 211
    :cond_8
    if-ne v7, v8, :cond_c

    .line 212
    .line 213
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-ne v12, v8, :cond_a

    .line 222
    .line 223
    const-string v12, "authority"

    .line 224
    .line 225
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_9

    .line 230
    .line 231
    invoke-direct {p0, v6, v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->parseAuthority(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    iget v7, v11, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 236
    .line 237
    move-object v10, v4

    .line 238
    if-le v7, v3, :cond_c

    .line 239
    .line 240
    move v3, v7

    .line 241
    goto :goto_8

    .line 242
    :cond_9
    const-string v12, "listenForTickles"

    .line 243
    .line 244
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    if-eqz v7, :cond_c

    .line 249
    .line 250
    invoke-direct {p0, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->parseListenForTickles(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 251
    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_a
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    const/4 v13, 0x3

    .line 259
    if-ne v12, v13, :cond_b

    .line 260
    .line 261
    const-string v12, "periodicSync"

    .line 262
    .line 263
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_c

    .line 268
    .line 269
    if-eqz v11, :cond_c

    .line 270
    .line 271
    invoke-direct {p0, v6, v11}, Lcom/lody/virtual/server/content/SyncStorageEngine;->parsePeriodicSync(Lorg/xmlpull/v1/XmlPullParser;Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)Landroid/content/PeriodicSync;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    goto :goto_8

    .line 276
    :cond_b
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    const/4 v13, 0x4

    .line 281
    if-ne v12, v13, :cond_c

    .line 282
    .line 283
    if-eqz v10, :cond_c

    .line 284
    .line 285
    const-string v12, "extra"

    .line 286
    .line 287
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    if-eqz v7, :cond_c

    .line 292
    .line 293
    iget-object v7, v10, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 294
    .line 295
    invoke-direct {p0, v6, v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->parseExtra(Lorg/xmlpull/v1/XmlPullParser;Landroid/os/Bundle;)V

    .line 296
    .line 297
    .line 298
    :cond_c
    :goto_8
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 299
    .line 300
    .line 301
    move-result v7
    :try_end_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 302
    if-ne v7, v2, :cond_8

    .line 303
    .line 304
    :cond_d
    add-int/2addr v3, v2

    .line 305
    iget v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 306
    .line 307
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 312
    .line 313
    if-eqz v5, :cond_e

    .line 314
    .line 315
    :try_start_8
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 316
    .line 317
    .line 318
    :catch_3
    :cond_e
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->maybeMigrateSettingsForRenamedAuthorities()Z

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :catchall_0
    move-exception v0

    .line 323
    move-object v4, v5

    .line 324
    goto :goto_c

    .line 325
    :catch_4
    move-exception v4

    .line 326
    goto :goto_9

    .line 327
    :catch_5
    move-exception v4

    .line 328
    goto :goto_b

    .line 329
    :catchall_1
    move-exception v0

    .line 330
    goto :goto_c

    .line 331
    :catch_6
    move-exception v5

    .line 332
    move-object v14, v5

    .line 333
    move-object v5, v4

    .line 334
    move-object v4, v14

    .line 335
    :goto_9
    if-nez v5, :cond_f

    .line 336
    .line 337
    :try_start_9
    const-string v0, "No initial accounts"

    .line 338
    .line 339
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_f
    invoke-static {v1, v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 344
    .line 345
    .line 346
    :goto_a
    add-int/2addr v3, v2

    .line 347
    iget v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 348
    .line 349
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 354
    .line 355
    if-eqz v5, :cond_10

    .line 356
    .line 357
    :try_start_a
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 358
    .line 359
    .line 360
    :catch_7
    :cond_10
    return-void

    .line 361
    :catch_8
    move-exception v5

    .line 362
    move-object v14, v5

    .line 363
    move-object v5, v4

    .line 364
    move-object v4, v14

    .line 365
    :goto_b
    :try_start_b
    invoke-static {v1, v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 366
    .line 367
    .line 368
    add-int/2addr v3, v2

    .line 369
    iget v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 370
    .line 371
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    iput v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 376
    .line 377
    if-eqz v5, :cond_11

    .line 378
    .line 379
    :try_start_c
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9

    .line 380
    .line 381
    .line 382
    :catch_9
    :cond_11
    return-void

    .line 383
    :goto_c
    add-int/2addr v3, v2

    .line 384
    iget v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 385
    .line 386
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    iput v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 391
    .line 392
    if-eqz v4, :cond_12

    .line 393
    .line 394
    :try_start_d
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_a

    .line 395
    .line 396
    .line 397
    :catch_a
    :cond_12
    throw v0
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

.method private readAndDeleteLegacyAccountInfoLocked()V
    .locals 36

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-object v0, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mContext:Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "syncmanager.db"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x1

    .line 24
    :try_start_0
    invoke-static {v7, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    move-object/from16 v18, v0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-object/from16 v18, v8

    .line 32
    .line 33
    :goto_0
    if-eqz v18, :cond_14

    .line 34
    .line 35
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/16 v1, 0xb

    .line 40
    .line 41
    if-lt v0, v1, :cond_1

    .line 42
    .line 43
    move/from16 v19, v9

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/16 v19, 0x0

    .line 47
    .line 48
    :goto_1
    const-string v0, "SyncManager"

    .line 49
    .line 50
    const-string v1, "Reading legacy sync accounts db"

    .line 51
    .line 52
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    new-instance v10, Landroid/database/sqlite/SQLiteQueryBuilder;

    .line 56
    .line 57
    invoke-direct {v10}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v0, "stats, status"

    .line 61
    .line 62
    invoke-virtual {v10, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "_id"

    .line 71
    .line 72
    const-string v2, "status._id as _id"

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    const-string v1, "stats.account as account"

    .line 78
    .line 79
    const-string v4, "account"

    .line 80
    .line 81
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const-string v3, "account_type"

    .line 85
    .line 86
    if-eqz v19, :cond_2

    .line 87
    .line 88
    const-string v1, "stats.account_type as account_type"

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_2
    const-string v1, "stats.authority as authority"

    .line 94
    .line 95
    const-string v2, "authority"

    .line 96
    .line 97
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    const-string v1, "totalElapsedTime"

    .line 101
    .line 102
    invoke-virtual {v0, v1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    const-string v15, "numSyncs"

    .line 106
    .line 107
    invoke-virtual {v0, v15, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v14, "numSourceLocal"

    .line 111
    .line 112
    invoke-virtual {v0, v14, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-string v13, "numSourcePoll"

    .line 116
    .line 117
    invoke-virtual {v0, v13, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    const-string v12, "numSourceServer"

    .line 121
    .line 122
    invoke-virtual {v0, v12, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    const-string v11, "numSourceUser"

    .line 126
    .line 127
    invoke-virtual {v0, v11, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const-string v8, "lastSuccessSource"

    .line 131
    .line 132
    invoke-virtual {v0, v8, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    const-string v9, "lastSuccessTime"

    .line 136
    .line 137
    invoke-virtual {v0, v9, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    const-string v5, "lastFailureSource"

    .line 141
    .line 142
    invoke-virtual {v0, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-object/from16 v20, v5

    .line 146
    .line 147
    const-string v5, "lastFailureTime"

    .line 148
    .line 149
    invoke-virtual {v0, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-object/from16 v21, v5

    .line 153
    .line 154
    const-string v5, "lastFailureMesg"

    .line 155
    .line 156
    invoke-virtual {v0, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-object/from16 v22, v5

    .line 160
    .line 161
    const-string v5, "pending"

    .line 162
    .line 163
    invoke-virtual {v0, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->setProjectionMap(Ljava/util/Map;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "stats._id = status.stats_id"

    .line 170
    .line 171
    invoke-virtual {v10, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->appendWhere(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const/16 v23, 0x0

    .line 180
    .line 181
    const/16 v24, 0x0

    .line 182
    .line 183
    const/16 v25, 0x0

    .line 184
    .line 185
    move-object/from16 v26, v11

    .line 186
    .line 187
    move-object/from16 v11, v18

    .line 188
    .line 189
    move-object/from16 v27, v12

    .line 190
    .line 191
    move-object v12, v0

    .line 192
    move-object v0, v13

    .line 193
    move-object/from16 v13, v16

    .line 194
    .line 195
    move-object/from16 v28, v14

    .line 196
    .line 197
    move-object/from16 v14, v17

    .line 198
    .line 199
    move-object/from16 v29, v15

    .line 200
    .line 201
    move-object/from16 v15, v23

    .line 202
    .line 203
    move-object/from16 v16, v24

    .line 204
    .line 205
    move-object/from16 v17, v25

    .line 206
    .line 207
    invoke-virtual/range {v10 .. v17}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_a

    .line 216
    .line 217
    invoke-interface {v10, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    if-eqz v19, :cond_3

    .line 226
    .line 227
    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    goto :goto_3

    .line 236
    :cond_3
    const/4 v12, 0x0

    .line 237
    :goto_3
    if-nez v12, :cond_4

    .line 238
    .line 239
    const-string v12, "com.google"

    .line 240
    .line 241
    :cond_4
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    invoke-interface {v10, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    new-instance v14, Landroid/accounts/Account;

    .line 250
    .line 251
    invoke-direct {v14, v11, v12}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const/4 v11, 0x0

    .line 255
    const/4 v12, -0x1

    .line 256
    const/4 v15, 0x0

    .line 257
    move-object/from16 v30, v0

    .line 258
    .line 259
    move-object/from16 v0, p0

    .line 260
    .line 261
    move-object/from16 v31, v1

    .line 262
    .line 263
    move-object v1, v14

    .line 264
    move-object v14, v2

    .line 265
    move v2, v11

    .line 266
    move-object v11, v3

    .line 267
    move-object v3, v13

    .line 268
    move-object v13, v4

    .line 269
    move v4, v12

    .line 270
    move-object/from16 v32, v5

    .line 271
    .line 272
    move-object/from16 v35, v20

    .line 273
    .line 274
    move-object/from16 v34, v21

    .line 275
    .line 276
    move-object/from16 v33, v22

    .line 277
    .line 278
    const/4 v12, 0x0

    .line 279
    move v5, v15

    .line 280
    invoke-direct/range {v0 .. v5}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_9

    .line 285
    .line 286
    iget-object v1, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    const/4 v2, 0x0

    .line 293
    :cond_5
    if-lez v1, :cond_6

    .line 294
    .line 295
    add-int/lit8 v1, v1, -0x1

    .line 296
    .line 297
    iget-object v2, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 298
    .line 299
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    check-cast v2, Landroid/content/SyncStatusInfo;

    .line 304
    .line 305
    iget v3, v2, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 306
    .line 307
    iget v4, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 308
    .line 309
    if-ne v3, v4, :cond_5

    .line 310
    .line 311
    const/4 v5, 0x1

    .line 312
    goto :goto_4

    .line 313
    :cond_6
    move v5, v12

    .line 314
    :goto_4
    if-nez v5, :cond_7

    .line 315
    .line 316
    new-instance v2, Landroid/content/SyncStatusInfo;

    .line 317
    .line 318
    iget v1, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 319
    .line 320
    invoke-direct {v2, v1}, Landroid/content/SyncStatusInfo;-><init>(I)V

    .line 321
    .line 322
    .line 323
    iget-object v1, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 324
    .line 325
    iget v0, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 326
    .line 327
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_7
    move-object/from16 v0, v31

    .line 331
    .line 332
    invoke-static {v10, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getLongColumn(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 333
    .line 334
    .line 335
    move-result-wide v3

    .line 336
    iput-wide v3, v2, Landroid/content/SyncStatusInfo;->totalElapsedTime:J

    .line 337
    .line 338
    move-object/from16 v1, v29

    .line 339
    .line 340
    invoke-static {v10, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    iput v3, v2, Landroid/content/SyncStatusInfo;->numSyncs:I

    .line 345
    .line 346
    move-object/from16 v3, v28

    .line 347
    .line 348
    invoke-static {v10, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    iput v4, v2, Landroid/content/SyncStatusInfo;->numSourceLocal:I

    .line 353
    .line 354
    move-object/from16 v4, v30

    .line 355
    .line 356
    invoke-static {v10, v4}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    iput v5, v2, Landroid/content/SyncStatusInfo;->numSourcePoll:I

    .line 361
    .line 362
    move-object/from16 v5, v27

    .line 363
    .line 364
    invoke-static {v10, v5}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v15

    .line 368
    iput v15, v2, Landroid/content/SyncStatusInfo;->numSourceServer:I

    .line 369
    .line 370
    move-object/from16 v31, v0

    .line 371
    .line 372
    move-object/from16 v15, v26

    .line 373
    .line 374
    invoke-static {v10, v15}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    iput v0, v2, Landroid/content/SyncStatusInfo;->numSourceUser:I

    .line 379
    .line 380
    iput v12, v2, Landroid/content/SyncStatusInfo;->numSourcePeriodic:I

    .line 381
    .line 382
    invoke-static {v10, v8}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    iput v0, v2, Landroid/content/SyncStatusInfo;->lastSuccessSource:I

    .line 387
    .line 388
    move-object v0, v13

    .line 389
    invoke-static {v10, v9}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getLongColumn(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 390
    .line 391
    .line 392
    move-result-wide v12

    .line 393
    iput-wide v12, v2, Landroid/content/SyncStatusInfo;->lastSuccessTime:J

    .line 394
    .line 395
    move-object/from16 v12, v35

    .line 396
    .line 397
    invoke-static {v10, v12}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    move-result v13

    .line 401
    iput v13, v2, Landroid/content/SyncStatusInfo;->lastFailureSource:I

    .line 402
    .line 403
    move-object/from16 v16, v0

    .line 404
    .line 405
    move-object/from16 v13, v34

    .line 406
    .line 407
    invoke-static {v10, v13}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getLongColumn(Landroid/database/Cursor;Ljava/lang/String;)J

    .line 408
    .line 409
    .line 410
    move-result-wide v0

    .line 411
    iput-wide v0, v2, Landroid/content/SyncStatusInfo;->lastFailureTime:J

    .line 412
    .line 413
    move-object/from16 v0, v33

    .line 414
    .line 415
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    iput-object v1, v2, Landroid/content/SyncStatusInfo;->lastFailureMesg:Ljava/lang/String;

    .line 424
    .line 425
    move-object/from16 v1, v32

    .line 426
    .line 427
    invoke-static {v10, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getIntColumn(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 428
    .line 429
    .line 430
    move-result v17

    .line 431
    if-eqz v17, :cond_8

    .line 432
    .line 433
    const/4 v0, 0x1

    .line 434
    goto :goto_5

    .line 435
    :cond_8
    const/4 v0, 0x0

    .line 436
    :goto_5
    iput-boolean v0, v2, Landroid/content/SyncStatusInfo;->pending:Z

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_9
    move-object/from16 v16, v13

    .line 440
    .line 441
    move-object/from16 v15, v26

    .line 442
    .line 443
    move-object/from16 v5, v27

    .line 444
    .line 445
    move-object/from16 v3, v28

    .line 446
    .line 447
    move-object/from16 v4, v30

    .line 448
    .line 449
    move-object/from16 v1, v32

    .line 450
    .line 451
    move-object/from16 v13, v34

    .line 452
    .line 453
    move-object/from16 v12, v35

    .line 454
    .line 455
    :goto_6
    move-object/from16 v28, v3

    .line 456
    .line 457
    move-object v0, v4

    .line 458
    move-object/from16 v27, v5

    .line 459
    .line 460
    move-object v3, v11

    .line 461
    move-object/from16 v20, v12

    .line 462
    .line 463
    move-object/from16 v21, v13

    .line 464
    .line 465
    move-object v2, v14

    .line 466
    move-object/from16 v26, v15

    .line 467
    .line 468
    move-object/from16 v4, v16

    .line 469
    .line 470
    move-object/from16 v22, v33

    .line 471
    .line 472
    move-object v5, v1

    .line 473
    move-object/from16 v1, v31

    .line 474
    .line 475
    goto/16 :goto_2

    .line 476
    .line 477
    :cond_a
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 478
    .line 479
    .line 480
    new-instance v10, Landroid/database/sqlite/SQLiteQueryBuilder;

    .line 481
    .line 482
    invoke-direct {v10}, Landroid/database/sqlite/SQLiteQueryBuilder;-><init>()V

    .line 483
    .line 484
    .line 485
    const-string v0, "settings"

    .line 486
    .line 487
    invoke-virtual {v10, v0}, Landroid/database/sqlite/SQLiteQueryBuilder;->setTables(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    const/4 v13, 0x0

    .line 492
    const/4 v14, 0x0

    .line 493
    const/4 v15, 0x0

    .line 494
    const/16 v16, 0x0

    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    move-object/from16 v11, v18

    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-virtual/range {v10 .. v17}, Landroid/database/sqlite/SQLiteQueryBuilder;->query(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    :goto_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_13

    .line 510
    .line 511
    const-string v2, "name"

    .line 512
    .line 513
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const-string v3, "value"

    .line 522
    .line 523
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    if-nez v2, :cond_b

    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_b
    const-string v4, "listen_for_tickles"

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    if-eqz v4, :cond_e

    .line 541
    .line 542
    if-eqz v3, :cond_d

    .line 543
    .line 544
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-eqz v2, :cond_c

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_c
    move v5, v0

    .line 552
    goto :goto_9

    .line 553
    :cond_d
    :goto_8
    const/4 v5, 0x1

    .line 554
    :goto_9
    invoke-virtual {v6, v5, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->setMasterSyncAutomatically(ZI)V

    .line 555
    .line 556
    .line 557
    goto :goto_d

    .line 558
    :cond_e
    const-string v4, "sync_provider_"

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    if-eqz v4, :cond_12

    .line 565
    .line 566
    const/16 v4, 0xe

    .line 567
    .line 568
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    iget-object v4, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 577
    .line 578
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    :goto_a
    if-lez v4, :cond_12

    .line 583
    .line 584
    add-int/lit8 v4, v4, -0x1

    .line 585
    .line 586
    iget-object v5, v6, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 587
    .line 588
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    check-cast v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 593
    .line 594
    iget-object v8, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 595
    .line 596
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v8

    .line 600
    if-eqz v8, :cond_11

    .line 601
    .line 602
    if-eqz v3, :cond_10

    .line 603
    .line 604
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 605
    .line 606
    .line 607
    move-result v8

    .line 608
    if-eqz v8, :cond_f

    .line 609
    .line 610
    goto :goto_b

    .line 611
    :cond_f
    move v8, v0

    .line 612
    goto :goto_c

    .line 613
    :cond_10
    :goto_b
    const/4 v8, 0x1

    .line 614
    :goto_c
    iput-boolean v8, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 615
    .line 616
    const/4 v8, 0x1

    .line 617
    iput v8, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 618
    .line 619
    goto :goto_a

    .line 620
    :cond_11
    const/4 v8, 0x1

    .line 621
    goto :goto_a

    .line 622
    :cond_12
    :goto_d
    const/4 v8, 0x1

    .line 623
    goto :goto_7

    .line 624
    :cond_13
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 628
    .line 629
    .line 630
    new-instance v0, Ljava/io/File;

    .line 631
    .line 632
    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 636
    .line 637
    .line 638
    :cond_14
    return-void
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
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
.end method

.method private readPendingOperationsLocked()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "SyncManager"

    .line 4
    .line 5
    const-string v3, " "

    .line 6
    .line 7
    iget-object v0, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v4, "SyncManagerFile"

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, "No pending operation file."

    .line 22
    .line 23
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 v5, 0x0

    .line 28
    :try_start_0
    iget-object v0, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->openRead()Ljava/io/FileInputStream;

    .line 31
    .line 32
    .line 33
    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-interface {v7, v6, v5}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    const/4 v8, 0x2

    .line 46
    const/4 v9, 0x1

    .line 47
    if-eq v0, v8, :cond_1

    .line 48
    .line 49
    if-eq v0, v9, :cond_1

    .line 50
    .line 51
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    if-ne v0, v9, :cond_3

    .line 57
    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    .line 62
    .line 63
    :catch_0
    :cond_2
    return-void

    .line 64
    :cond_3
    :try_start_3
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_4
    if-ne v0, v8, :cond_8

    .line 68
    .line 69
    :try_start_4
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-ne v10, v9, :cond_7

    .line 78
    .line 79
    const-string v10, "op"

    .line 80
    .line 81
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    const-string v0, "version"

    .line 88
    .line 89
    invoke-interface {v7, v5, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    const/4 v11, 0x3

    .line 100
    if-ne v10, v11, :cond_6

    .line 101
    .line 102
    const-string v0, "authority_id"

    .line 103
    .line 104
    invoke-interface {v7, v5, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const-string v10, "expedited"

    .line 117
    .line 118
    invoke-interface {v7, v5, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    const-string v11, "source"

    .line 131
    .line 132
    invoke-interface {v7, v5, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    const-string v11, "reason"

    .line 145
    .line 146
    invoke-interface {v7, v5, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    iget-object v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 159
    .line 160
    invoke-virtual {v11, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    check-cast v11, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 165
    .line 166
    new-instance v12, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-static {v4, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    if-eqz v11, :cond_5

    .line 200
    .line 201
    new-instance v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

    .line 202
    .line 203
    iget-object v12, v11, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 204
    .line 205
    iget v13, v11, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 206
    .line 207
    iget-object v11, v11, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 208
    .line 209
    new-instance v17, Landroid/os/Bundle;

    .line 210
    .line 211
    invoke-direct/range {v17 .. v17}, Landroid/os/Bundle;-><init>()V

    .line 212
    .line 213
    .line 214
    move-object/from16 v16, v11

    .line 215
    .line 216
    move-object v11, v0

    .line 217
    move/from16 v18, v10

    .line 218
    .line 219
    invoke-direct/range {v11 .. v18}, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;-><init>(Landroid/accounts/Account;IIILjava/lang/String;Landroid/os/Bundle;Z)V

    .line 220
    .line 221
    .line 222
    iput-object v5, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->flatExtras:[B

    .line 223
    .line 224
    iget-object v10, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    new-instance v10, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v11, "Adding pending op: "

    .line 235
    .line 236
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    iget-object v11, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v11, " src="

    .line 245
    .line 246
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    iget v11, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->syncSource:I

    .line 250
    .line 251
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v11, " reason="

    .line 255
    .line 256
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    iget v11, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->reason:I

    .line 260
    .line 261
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v11, " expedited="

    .line 265
    .line 266
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    iget-boolean v0, v0, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->expedited:Z

    .line 270
    .line 271
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    goto :goto_1

    .line 282
    :cond_5
    new-instance v10, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const-string v11, "No authority found for "

    .line 288
    .line 289
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v0, ", skipping"

    .line 296
    .line 297
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v4, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    goto :goto_1

    .line 308
    :cond_6
    new-instance v10, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const-string v11, "Unknown pending operation version "

    .line 314
    .line 315
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    new-instance v0, Ljava/io/IOException;

    .line 329
    .line 330
    const-string v10, "Unknown version."

    .line 331
    .line 332
    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v0

    .line 336
    :cond_7
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 337
    .line 338
    .line 339
    move-result v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 340
    goto :goto_1

    .line 341
    :catch_1
    move-exception v0

    .line 342
    :try_start_5
    const-string v10, "Invalid data in xml file."

    .line 343
    .line 344
    invoke-static {v2, v10, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 345
    .line 346
    .line 347
    :cond_8
    :goto_1
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 348
    .line 349
    .line 350
    move-result v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 351
    if-ne v0, v9, :cond_4

    .line 352
    .line 353
    if-eqz v6, :cond_9

    .line 354
    .line 355
    :try_start_6
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :catchall_0
    move-exception v0

    .line 360
    move-object v5, v6

    .line 361
    goto :goto_6

    .line 362
    :catch_2
    move-exception v0

    .line 363
    move-object v5, v6

    .line 364
    goto :goto_2

    .line 365
    :catch_3
    move-exception v0

    .line 366
    move-object v5, v6

    .line 367
    goto :goto_4

    .line 368
    :catchall_1
    move-exception v0

    .line 369
    goto :goto_6

    .line 370
    :catch_4
    move-exception v0

    .line 371
    :goto_2
    :try_start_7
    const-string v2, "Error parsing pending ops xml."

    .line 372
    .line 373
    invoke-static {v4, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 374
    .line 375
    .line 376
    if-eqz v5, :cond_9

    .line 377
    .line 378
    :goto_3
    :try_start_8
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :catch_5
    move-exception v0

    .line 383
    :goto_4
    :try_start_9
    const-string v2, "Error reading pending data."

    .line 384
    .line 385
    invoke-static {v4, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 386
    .line 387
    .line 388
    if-eqz v5, :cond_9

    .line 389
    .line 390
    goto :goto_3

    .line 391
    :catch_6
    :cond_9
    :goto_5
    return-void

    .line 392
    :goto_6
    if-eqz v5, :cond_a

    .line 393
    .line 394
    :try_start_a
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 395
    .line 396
    .line 397
    :catch_7
    :cond_a
    throw v0
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

.method private readStatisticsLocked()V
    .locals 7

    .line 1
    const-string v0, "SyncManager"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->readFully()[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    array-length v3, v1

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v2, v1, v4, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    const/16 v3, 0x65

    .line 28
    .line 29
    const/16 v5, 0x64

    .line 30
    .line 31
    if-eq v1, v3, :cond_2

    .line 32
    .line 33
    if-ne v1, v5, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "Unknown stats token: "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_1
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-ne v1, v5, :cond_3

    .line 62
    .line 63
    add-int/lit16 v3, v3, -0x7d9

    .line 64
    .line 65
    add-int/lit16 v3, v3, 0x37a5

    .line 66
    .line 67
    :cond_3
    new-instance v1, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 68
    .line 69
    invoke-direct {v1, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successCount:I

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/os/Parcel;->readLong()J

    .line 79
    .line 80
    .line 81
    move-result-wide v5

    .line 82
    iput-wide v5, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successTime:J

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iput v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureCount:I

    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/os/Parcel;->readLong()J

    .line 91
    .line 92
    .line 93
    move-result-wide v5

    .line 94
    iput-wide v5, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureTime:J

    .line 95
    .line 96
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 97
    .line 98
    array-length v5, v3

    .line 99
    if-ge v4, v5, :cond_0

    .line 100
    .line 101
    aput-object v1, v3, v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    const-string v1, "No initial statistics"

    .line 107
    .line 108
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_2
    return-void
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

.method private readStatusLocked()V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Reading "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "SyncManager"

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->readFully()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    array-length v3, v0

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v2, v0, v4, v3}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    :goto_0
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x64

    .line 54
    .line 55
    if-ne v0, v3, :cond_1

    .line 56
    .line 57
    new-instance v0, Landroid/content/SyncStatusInfo;

    .line 58
    .line 59
    invoke-direct {v0, v2}, Landroid/content/SyncStatusInfo;-><init>(Landroid/os/Parcel;)V

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 63
    .line 64
    iget v5, v0, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 65
    .line 66
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ltz v3, :cond_0

    .line 71
    .line 72
    iput-boolean v4, v0, Landroid/content/SyncStatusInfo;->pending:Z

    .line 73
    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v5, "Adding status for id "

    .line 80
    .line 81
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget v5, v0, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 85
    .line 86
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 97
    .line 98
    iget v5, v0, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 99
    .line 100
    invoke-virtual {v3, v5, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v3, "Unknown status token: "

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catch_0
    const-string v0, "No initial status"

    .line 126
    .line 127
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_2
    :goto_1
    return-void
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

.method private removeAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 2
    .line 3
    new-instance v1, Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lcom/lody/virtual/server/accounts/AccountAndUser;-><init>(Landroid/accounts/Account;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 27
    .line 28
    iget p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 31
    .line 32
    .line 33
    if-eqz p4, :cond_0

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
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

.method private reportChange(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-lez v1, :cond_2

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/2addr v3, p1

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-nez v2, :cond_1

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 39
    .line 40
    invoke-virtual {v3, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroid/content/ISyncStatusObserver;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 53
    .line 54
    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :catch_0
    :goto_1
    if-lez v0, :cond_3

    .line 63
    .line 64
    add-int/lit8 v0, v0, -0x1

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroid/content/ISyncStatusObserver;

    .line 71
    .line 72
    invoke-interface {v1, p1}, Landroid/content/ISyncStatusObserver;->onStatusChanged(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    return-void

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    throw p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private requestSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lcom/lody/virtual/os/VEnvironment;->SYSTEM_UID:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRequestListener:Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    move v4, p2

    .line 15
    move v5, p3

    .line 16
    move-object v6, p4

    .line 17
    move-object v7, p5

    .line 18
    invoke-interface/range {v2 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;->onSyncRequest(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1, p4, p5}, Landroid/content/ContentResolver;->requestSync(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
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
.end method

.method private static unflattenBundle([B)Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :catch_0
    :try_start_1
    new-instance p0, Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 30
    .line 31
    .line 32
    throw p0
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

.method private updateOrRemovePeriodicSync(Landroid/content/PeriodicSync;IZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p1, Landroid/content/PeriodicSync;->period:J

    .line 5
    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long v1, v1, v3

    .line 9
    .line 10
    if-gtz v1, :cond_0

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    const-string v1, "SyncManager"

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v5, "period < 0, should never happen in updateOrRemovePeriodicSync: add-"

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, p1, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, "SyncManager"

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v5, "null extras, should never happen in updateOrRemovePeriodicSync: add-"

    .line 48
    .line 49
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    .line 62
    :cond_1
    :try_start_1
    iget-object v6, p1, Landroid/content/PeriodicSync;->account:Landroid/accounts/Account;

    .line 63
    .line 64
    iget-object v8, p1, Landroid/content/PeriodicSync;->authority:Ljava/lang/String;

    .line 65
    .line 66
    const/4 v9, -0x1

    .line 67
    const/4 v10, 0x0

    .line 68
    move-object v5, p0

    .line 69
    move v7, p2

    .line 70
    invoke-direct/range {v5 .. v10}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const/4 v1, 0x0

    .line 75
    const/4 v2, 0x1

    .line 76
    if-eqz p3, :cond_5

    .line 77
    .line 78
    iget-object p3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    move v5, v1

    .line 85
    :goto_0
    if-ge v5, p3, :cond_4

    .line 86
    .line 87
    iget-object v6, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Landroid/content/PeriodicSync;

    .line 94
    .line 95
    iget-object v7, p1, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 96
    .line 97
    iget-object v8, v6, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 98
    .line 99
    invoke-static {v7, v8}, Lmirror/android/content/PeriodicSync;->syncExtrasEquals(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_3

    .line 104
    .line 105
    iget-wide v7, p1, Landroid/content/PeriodicSync;->period:J

    .line 106
    .line 107
    iget-wide v9, v6, Landroid/content/PeriodicSync;->period:J

    .line 108
    .line 109
    cmp-long p3, v7, v9

    .line 110
    .line 111
    if-nez p3, :cond_2

    .line 112
    .line 113
    sget-object p3, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 114
    .line 115
    invoke-virtual {p3, p1}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    sget-object p3, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 120
    .line 121
    invoke-virtual {p3, v6}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    cmp-long p3, v7, v9

    .line 126
    .line 127
    if-nez p3, :cond_2

    .line 128
    .line 129
    :try_start_2
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 130
    .line 131
    .line 132
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 133
    .line 134
    .line 135
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    return-void

    .line 137
    :cond_2
    :try_start_3
    iget-object p3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-static {p1}, Lmirror/android/content/PeriodicSync;->clone(Landroid/content/PeriodicSync;)Landroid/content/PeriodicSync;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {p3, v5, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move v1, v2

    .line 147
    goto :goto_1

    .line 148
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    :goto_1
    if-nez v1, :cond_9

    .line 152
    .line 153
    iget-object p3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-static {p1}, Lmirror/android/content/PeriodicSync;->clone(Landroid/content/PeriodicSync;)Landroid/content/PeriodicSync;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    iget p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 163
    .line 164
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object p2, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    sub-int/2addr p2, v2

    .line 175
    invoke-virtual {p1, p2, v3, v4}, Landroid/content/SyncStatusInfo;->setPeriodicSyncTime(IJ)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    iget-object p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 180
    .line 181
    iget v3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 182
    .line 183
    invoke-virtual {p3, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    check-cast p3, Landroid/content/SyncStatusInfo;

    .line 188
    .line 189
    iget-object p2, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    move v3, v1

    .line 196
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_8

    .line 201
    .line 202
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, Landroid/content/PeriodicSync;

    .line 207
    .line 208
    iget-object v4, v4, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 209
    .line 210
    iget-object v5, p1, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 211
    .line 212
    invoke-static {v4, v5}, Lmirror/android/content/PeriodicSync;->syncExtrasEquals(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_7

    .line 217
    .line 218
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 219
    .line 220
    .line 221
    if-eqz p3, :cond_6

    .line 222
    .line 223
    invoke-virtual {p3, v3}, Landroid/content/SyncStatusInfo;->removePeriodicSyncTime(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_6
    const-string v1, "SyncManager"

    .line 228
    .line 229
    const-string v4, "Tried removing sync status on remove periodic sync butdid not find it."

    .line 230
    .line 231
    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 232
    .line 233
    .line 234
    :goto_3
    move v1, v2

    .line 235
    goto :goto_2

    .line 236
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_8
    if-nez v1, :cond_9

    .line 240
    .line 241
    :try_start_4
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 242
    .line 243
    .line 244
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 245
    .line 246
    .line 247
    monitor-exit v0

    .line 248
    return-void

    .line 249
    :cond_9
    :goto_4
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 250
    .line 251
    .line 252
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 253
    .line 254
    .line 255
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 256
    invoke-direct {p0, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :catchall_0
    move-exception p1

    .line 261
    :try_start_5
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 262
    .line 263
    .line 264
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :catchall_1
    move-exception p1

    .line 269
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 270
    throw p1
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
.end method

.method private writeAccountInfoLocked()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "periodicSync"

    .line 4
    .line 5
    const-string v2, "listenForTickles"

    .line 6
    .line 7
    const-string v3, "accounts"

    .line 8
    .line 9
    const-string v4, "authority"

    .line 10
    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v6, "Writing new "

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v6, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 22
    .line 23
    invoke-virtual {v6}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "SyncManager"

    .line 35
    .line 36
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    :try_start_0
    iget-object v7, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 41
    .line 42
    invoke-virtual {v7}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 43
    .line 44
    .line 45
    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 46
    :try_start_1
    new-instance v8, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 47
    .line 48
    invoke-direct {v8}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v9, "utf-8"

    .line 52
    .line 53
    invoke-interface {v8, v7, v9}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-interface {v8, v5, v9}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 59
    .line 60
    .line 61
    const-string v9, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 62
    .line 63
    const/4 v10, 0x1

    .line 64
    invoke-interface {v8, v9, v10}, Lorg/xmlpull/v1/XmlSerializer;->setFeature(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v8, v5, v3}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 68
    .line 69
    .line 70
    const-string v9, "version"

    .line 71
    .line 72
    const/4 v11, 0x2

    .line 73
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-interface {v8, v5, v9, v11}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 78
    .line 79
    .line 80
    const-string v9, "nextAuthorityId"

    .line 81
    .line 82
    iget v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextAuthorityId:I

    .line 83
    .line 84
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-interface {v8, v5, v9, v11}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 89
    .line 90
    .line 91
    const-string v9, "offsetInSeconds"

    .line 92
    .line 93
    iget v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I

    .line 94
    .line 95
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-interface {v8, v5, v9, v11}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 100
    .line 101
    .line 102
    iget-object v9, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 103
    .line 104
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 105
    .line 106
    .line 107
    move-result v9
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    const/4 v11, 0x0

    .line 109
    move v12, v11

    .line 110
    :goto_0
    const-string v13, "enabled"

    .line 111
    .line 112
    const-string v14, "user"

    .line 113
    .line 114
    if-ge v12, v9, :cond_0

    .line 115
    .line 116
    :try_start_2
    iget-object v15, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 117
    .line 118
    invoke-virtual {v15, v12}, Landroid/util/SparseArray;->keyAt(I)I

    .line 119
    .line 120
    .line 121
    move-result v15

    .line 122
    iget-object v10, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 123
    .line 124
    invoke-virtual {v10, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    check-cast v10, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-interface {v8, v5, v2}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 131
    .line 132
    .line 133
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-interface {v8, v5, v14, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    invoke-static {v10}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-interface {v8, v5, v13, v10}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 149
    .line 150
    .line 151
    invoke-interface {v8, v5, v2}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 152
    .line 153
    .line 154
    add-int/lit8 v12, v12, 0x1

    .line 155
    .line 156
    const/4 v10, 0x1

    .line 157
    goto :goto_0

    .line 158
    :cond_0
    iget-object v2, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 159
    .line 160
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    move v9, v11

    .line 165
    :goto_1
    if-ge v9, v2, :cond_5

    .line 166
    .line 167
    iget-object v10, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 168
    .line 169
    invoke-virtual {v10, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    check-cast v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 174
    .line 175
    invoke-interface {v8, v5, v4}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 176
    .line 177
    .line 178
    const-string v12, "id"

    .line 179
    .line 180
    iget v15, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 181
    .line 182
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    invoke-interface {v8, v5, v12, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 187
    .line 188
    .line 189
    iget v12, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 190
    .line 191
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    invoke-interface {v8, v5, v14, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 196
    .line 197
    .line 198
    iget-boolean v12, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 199
    .line 200
    invoke-static {v12}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    invoke-interface {v8, v5, v13, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 205
    .line 206
    .line 207
    iget-object v12, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    .line 208
    .line 209
    if-nez v12, :cond_1

    .line 210
    .line 211
    const-string v12, "account"

    .line 212
    .line 213
    iget-object v15, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 214
    .line 215
    iget-object v15, v15, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 216
    .line 217
    invoke-interface {v8, v5, v12, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 218
    .line 219
    .line 220
    const-string v12, "type"

    .line 221
    .line 222
    iget-object v15, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 223
    .line 224
    iget-object v15, v15, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 225
    .line 226
    invoke-interface {v8, v5, v12, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 227
    .line 228
    .line 229
    iget-object v12, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 230
    .line 231
    invoke-interface {v8, v5, v4, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_1
    const-string v15, "package"

    .line 236
    .line 237
    invoke-virtual {v12}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    invoke-interface {v8, v5, v15, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 242
    .line 243
    .line 244
    const-string v12, "class"

    .line 245
    .line 246
    iget-object v15, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->service:Landroid/content/ComponentName;

    .line 247
    .line 248
    invoke-virtual {v15}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    invoke-interface {v8, v5, v12, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 253
    .line 254
    .line 255
    :goto_2
    iget v12, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 256
    .line 257
    const-string v15, "syncable"

    .line 258
    .line 259
    if-gez v12, :cond_2

    .line 260
    .line 261
    :try_start_3
    const-string v12, "unknown"

    .line 262
    .line 263
    invoke-interface {v8, v5, v15, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_2
    if-eqz v12, :cond_3

    .line 268
    .line 269
    const/4 v12, 0x1

    .line 270
    goto :goto_3

    .line 271
    :cond_3
    move v12, v11

    .line 272
    :goto_3
    invoke-static {v12}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    invoke-interface {v8, v5, v15, v12}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 277
    .line 278
    .line 279
    :goto_4
    iget-object v10, v10, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    if-eqz v12, :cond_4

    .line 290
    .line 291
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    check-cast v12, Landroid/content/PeriodicSync;

    .line 296
    .line 297
    invoke-interface {v8, v5, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 298
    .line 299
    .line 300
    const-string v15, "period"
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 301
    .line 302
    move-object/from16 v16, v6

    .line 303
    .line 304
    :try_start_4
    iget-wide v5, v12, Landroid/content/PeriodicSync;->period:J

    .line 305
    .line 306
    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    const/4 v6, 0x0

    .line 311
    invoke-interface {v8, v6, v15, v5}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 312
    .line 313
    .line 314
    sget-object v5, Lmirror/android/content/PeriodicSync;->flexTime:Lmirror/RefLong;

    .line 315
    .line 316
    invoke-virtual {v5, v12}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v17

    .line 320
    const-string v5, "flex"

    .line 321
    .line 322
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v15

    .line 326
    invoke-interface {v8, v6, v5, v15}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 327
    .line 328
    .line 329
    iget-object v5, v12, Landroid/content/PeriodicSync;->extras:Landroid/os/Bundle;

    .line 330
    .line 331
    invoke-direct {v1, v8, v5}, Lcom/lody/virtual/server/content/SyncStorageEngine;->extrasToXml(Lorg/xmlpull/v1/XmlSerializer;Landroid/os/Bundle;)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v8, v6, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 335
    .line 336
    .line 337
    move-object/from16 v6, v16

    .line 338
    .line 339
    const/4 v5, 0x0

    .line 340
    goto :goto_5

    .line 341
    :cond_4
    move-object/from16 v16, v6

    .line 342
    .line 343
    invoke-interface {v8, v5, v4}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 344
    .line 345
    .line 346
    add-int/lit8 v9, v9, 0x1

    .line 347
    .line 348
    move-object/from16 v6, v16

    .line 349
    .line 350
    const/4 v5, 0x0

    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :cond_5
    move-object/from16 v16, v6

    .line 354
    .line 355
    move-object v2, v5

    .line 356
    invoke-interface {v8, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 357
    .line 358
    .line 359
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 360
    .line 361
    .line 362
    iget-object v0, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 363
    .line 364
    invoke-virtual {v0, v7}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 365
    .line 366
    .line 367
    goto :goto_8

    .line 368
    :catch_0
    move-exception v0

    .line 369
    goto :goto_6

    .line 370
    :catch_1
    move-exception v0

    .line 371
    move-object/from16 v16, v6

    .line 372
    .line 373
    :goto_6
    move-object v5, v7

    .line 374
    goto :goto_7

    .line 375
    :catch_2
    move-exception v0

    .line 376
    move-object v2, v5

    .line 377
    move-object/from16 v16, v6

    .line 378
    .line 379
    :goto_7
    const-string v2, "Error writing accounts"

    .line 380
    .line 381
    move-object/from16 v3, v16

    .line 382
    .line 383
    invoke-static {v3, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 384
    .line 385
    .line 386
    if-eqz v5, :cond_6

    .line 387
    .line 388
    iget-object v0, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 389
    .line 390
    invoke-virtual {v0, v5}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 391
    .line 392
    .line 393
    :cond_6
    :goto_8
    return-void
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

.method private writeDefaultAccountInfo()V
    .locals 7

    .line 1
    const-string v0, "0"

    .line 2
    .line 3
    const-string v1, "accounts"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 7
    .line 8
    invoke-virtual {v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 12
    :try_start_1
    new-instance v4, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 13
    .line 14
    invoke-direct {v4}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v5, "utf-8"

    .line 18
    .line 19
    invoke-interface {v4, v3, v5}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-interface {v4, v2, v5}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 25
    .line 26
    .line 27
    const-string v5, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    invoke-interface {v4, v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->setFeature(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v4, v2, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 34
    .line 35
    .line 36
    const-string v5, "version"

    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v4, v2, v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 44
    .line 45
    .line 46
    const-string v5, "nextAuthorityId"

    .line 47
    .line 48
    invoke-interface {v4, v2, v5, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 49
    .line 50
    .line 51
    const-string v5, "offsetInSeconds"

    .line 52
    .line 53
    invoke-interface {v4, v2, v5, v0}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 54
    .line 55
    .line 56
    invoke-interface {v4, v2, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 57
    .line 58
    .line 59
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object v2, v3

    .line 70
    goto :goto_0

    .line 71
    :catch_1
    move-exception v0

    .line 72
    :goto_0
    const-string v1, "SyncManager"

    .line 73
    .line 74
    const-string v3, "Error writing default account info"

    .line 75
    .line 76
    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccountInfoFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void
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

.method private writePendingOperationLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;Lorg/xmlpull/v1/XmlSerializer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "op"

    .line 3
    .line 4
    invoke-interface {p2, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "version"

    .line 13
    .line 14
    invoke-interface {p2, v0, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 15
    .line 16
    .line 17
    iget v2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authorityId:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "authority_id"

    .line 24
    .line 25
    invoke-interface {p2, v0, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 26
    .line 27
    .line 28
    iget v2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->syncSource:I

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "source"

    .line 35
    .line 36
    invoke-interface {p2, v0, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 37
    .line 38
    .line 39
    iget-boolean v2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->expedited:Z

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "expedited"

    .line 46
    .line 47
    invoke-interface {p2, v0, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 48
    .line 49
    .line 50
    iget v2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->reason:I

    .line 51
    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "reason"

    .line 57
    .line 58
    invoke-interface {p2, v0, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->extras:Landroid/os/Bundle;

    .line 62
    .line 63
    invoke-direct {p0, p2, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->extrasToXml(Lorg/xmlpull/v1/XmlSerializer;Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 67
    .line 68
    .line 69
    return-void
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

.method private writePendingOperationsLocked()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "SyncManagerFile"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "Truncating "

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 23
    .line 24
    invoke-virtual {v3}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->truncate()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v4, "Writing new "

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v1, Lcom/lody/virtual/helper/utils/FastXmlSerializer;

    .line 77
    .line 78
    invoke-direct {v1}, Lcom/lody/virtual/helper/utils/FastXmlSerializer;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v3, "utf-8"

    .line 82
    .line 83
    invoke-interface {v1, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    :goto_0
    if-ge v3, v0, :cond_1

    .line 88
    .line 89
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

    .line 96
    .line 97
    invoke-direct {p0, v4, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;Lorg/xmlpull/v1/XmlSerializer;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    const-string v1, "SyncManager"

    .line 114
    .line 115
    const-string v3, "Error writing pending operations"

    .line 116
    .line 117
    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    if-eqz v2, :cond_2

    .line 121
    .line 122
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    :goto_1
    return-void
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

.method private writeStatisticsLocked()V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Writing new "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "SyncManager"

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 45
    .line 46
    array-length v3, v3

    .line 47
    const/4 v4, 0x0

    .line 48
    move v5, v4

    .line 49
    :goto_0
    if-ge v5, v3, :cond_1

    .line 50
    .line 51
    iget-object v6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 52
    .line 53
    aget-object v6, v6, v5

    .line 54
    .line 55
    if-nez v6, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const/16 v7, 0x65

    .line 59
    .line 60
    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    .line 63
    iget v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->day:I

    .line 64
    .line 65
    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    iget v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successCount:I

    .line 69
    .line 70
    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    .line 72
    .line 73
    iget-wide v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successTime:J

    .line 74
    .line 75
    invoke-virtual {v2, v7, v8}, Landroid/os/Parcel;->writeLong(J)V

    .line 76
    .line 77
    .line 78
    iget v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureCount:I

    .line 79
    .line 80
    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    .line 82
    .line 83
    iget-wide v6, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureTime:J

    .line 84
    .line 85
    invoke-virtual {v2, v6, v7}, Landroid/os/Parcel;->writeLong(J)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    :goto_1
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v0, v3}, Ljava/io/FileOutputStream;->write([B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 105
    .line 106
    invoke-virtual {v2, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :catch_0
    move-exception v2

    .line 111
    const-string v3, "Error writing stats"

    .line 112
    .line 113
    invoke-static {v1, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 114
    .line 115
    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatisticsFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_2
    return-void
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

.method private writeStatusLocked()V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Writing new "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/lody/virtual/helper/utils/AtomicFile;->getBaseFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "SyncManager"

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/lody/virtual/helper/utils/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    move v5, v4

    .line 52
    :goto_0
    if-ge v5, v3, :cond_0

    .line 53
    .line 54
    iget-object v6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Landroid/content/SyncStatusInfo;

    .line 61
    .line 62
    const/16 v7, 0x64

    .line 63
    .line 64
    invoke-virtual {v2, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v2, v4}, Landroid/content/SyncStatusInfo;->writeToParcel(Landroid/os/Parcel;I)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v0, v3}, Ljava/io/FileOutputStream;->write([B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catch_0
    move-exception v2

    .line 93
    const-string v3, "Error writing status"

    .line 94
    .line 95
    invoke-static {v1, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mStatusFile:Lcom/lody/virtual/helper/utils/AtomicFile;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/utils/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_1
    return-void
    .line 106
.end method


# virtual methods
.method public addActiveSync(Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;)Lcom/lody/virtual/server/content/VSyncInfo;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p1, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mSyncOperation:Lcom/lody/virtual/server/content/SyncOperation;

    .line 5
    .line 6
    iget-object v3, v1, Lcom/lody/virtual/server/content/SyncOperation;->account:Landroid/accounts/Account;

    .line 7
    .line 8
    iget v4, v1, Lcom/lody/virtual/server/content/SyncOperation;->userId:I

    .line 9
    .line 10
    iget-object v5, v1, Lcom/lody/virtual/server/content/SyncOperation;->authority:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    const/4 v7, 0x1

    .line 14
    move-object v2, p0

    .line 15
    invoke-direct/range {v2 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v8, Lcom/lody/virtual/server/content/VSyncInfo;

    .line 20
    .line 21
    iget v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 22
    .line 23
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 24
    .line 25
    iget-object v5, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 26
    .line 27
    iget-wide v6, p1, Lcom/lody/virtual/server/content/SyncManager$ActiveSyncContext;->mStartTime:J

    .line 28
    .line 29
    move-object v2, v8

    .line 30
    invoke-direct/range {v2 .. v7}, Lcom/lody/virtual/server/content/VSyncInfo;-><init>(ILandroid/accounts/Account;Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    iget p1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 34
    .line 35
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncs(I)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportActiveChange()V

    .line 44
    .line 45
    .line 46
    return-object v8

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
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

.method public addPeriodicSync(Landroid/content/PeriodicSync;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->updateOrRemovePeriodicSync(Landroid/content/PeriodicSync;IZ)V

    return-void
.end method

.method public addStatusChangeListener(ILandroid/content/ISyncStatusObserver;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p2, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
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

.method public clearAllBackoffsLocked(Lcom/lody/virtual/server/content/SyncQueue;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    .line 27
    .line 28
    iget-object v5, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 49
    .line 50
    iget-wide v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 51
    .line 52
    const-wide/16 v9, -0x1

    .line 53
    .line 54
    cmp-long v7, v7, v9

    .line 55
    .line 56
    if-nez v7, :cond_2

    .line 57
    .line 58
    iget-wide v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 59
    .line 60
    cmp-long v7, v7, v9

    .line 61
    .line 62
    if-eqz v7, :cond_1

    .line 63
    .line 64
    :cond_2
    iput-wide v9, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 65
    .line 66
    iput-wide v9, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 67
    .line 68
    iget-object v2, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 69
    .line 70
    iget-object v8, v2, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 71
    .line 72
    iget v9, v2, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 73
    .line 74
    iget-object v10, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 75
    .line 76
    const-wide/16 v11, 0x0

    .line 77
    .line 78
    move-object v7, p1

    .line 79
    invoke-virtual/range {v7 .. v12}, Lcom/lody/virtual/server/content/SyncQueue;->onBackoffChanged(Landroid/accounts/Account;ILjava/lang/String;J)V

    .line 80
    .line 81
    .line 82
    move v2, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-direct {p0, v4}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1
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

.method public clearAndReadState()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mServices:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readAccountInfoLocked()V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readStatusLocked()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readPendingOperationsLocked()V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readStatisticsLocked()V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->readAndDeleteLegacyAccountInfoLocked()V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 59
    .line 60
    .line 61
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    throw v1
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

.method public deleteFromPending(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNumPendingFinished:I

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-lt v1, v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    add-int/2addr v1, v3

    .line 29
    iput v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNumPendingFinished:I

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 33
    .line 34
    .line 35
    iput v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNumPendingFinished:I

    .line 36
    .line 37
    :goto_1
    iget-object v1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 38
    .line 39
    iget v4, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 40
    .line 41
    iget-object v5, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 42
    .line 43
    const-string v6, "deleteFromPending"

    .line 44
    .line 45
    invoke-direct {p0, v1, v4, v5, v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    move v5, v2

    .line 58
    :goto_2
    if-ge v5, v4, :cond_3

    .line 59
    .line 60
    iget-object v6, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

    .line 67
    .line 68
    iget-object v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 69
    .line 70
    iget-object v8, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 71
    .line 72
    invoke-virtual {v7, v8}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    iget-object v7, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v8, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_2

    .line 87
    .line 88
    iget v6, v6, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 89
    .line 90
    iget v7, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 91
    .line 92
    if-ne v6, v7, :cond_2

    .line 93
    .line 94
    move p1, v3

    .line 95
    goto :goto_3

    .line 96
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move p1, v2

    .line 100
    :goto_3
    if-nez p1, :cond_4

    .line 101
    .line 102
    iget p1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 103
    .line 104
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-boolean v2, p1, Landroid/content/SyncStatusInfo;->pending:Z

    .line 109
    .line 110
    :cond_4
    move v2, v3

    .line 111
    :cond_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    const/4 p1, 0x2

    .line 113
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 114
    .line 115
    .line 116
    return v2

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    throw p1
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

.method public doDatabaseCleanup([Landroid/accounts/Account;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    .line 30
    .line 31
    iget-object v4, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 32
    .line 33
    iget-object v4, v4, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 34
    .line 35
    invoke-static {p1, v4}, Lcom/lody/virtual/helper/utils/ArrayUtils;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    iget-object v4, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 42
    .line 43
    iget v4, v4, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 44
    .line 45
    if-ne v4, p2, :cond_0

    .line 46
    .line 47
    iget-object v3, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 68
    .line 69
    iget v5, v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 70
    .line 71
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-lez p1, :cond_8

    .line 84
    .line 85
    :cond_3
    if-lez p1, :cond_7

    .line 86
    .line 87
    add-int/lit8 p1, p1, -0x1

    .line 88
    .line 89
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 94
    .line 95
    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->remove(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    :cond_4
    :goto_2
    if-lez v2, :cond_5

    .line 105
    .line 106
    add-int/lit8 v2, v2, -0x1

    .line 107
    .line 108
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 109
    .line 110
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-ne v3, p2, :cond_4

    .line 115
    .line 116
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    :cond_6
    :goto_3
    if-lez v2, :cond_3

    .line 133
    .line 134
    add-int/lit8 v2, v2, -0x1

    .line 135
    .line 136
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;

    .line 143
    .line 144
    iget v3, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->authorityId:I

    .line 145
    .line 146
    if-ne v3, p2, :cond_6

    .line 147
    .line 148
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 161
    .line 162
    .line 163
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 164
    .line 165
    .line 166
    :cond_8
    monitor-exit v0

    .line 167
    return-void

    .line 168
    :catchall_0
    move-exception p1

    .line 169
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    throw p1
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

.method public dumpPendingOperations(Ljava/lang/StringBuilder;)V
    .locals 5

    .line 1
    const-string v0, "Pending Ops: "

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, " operation(s)\n"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v3, "("

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, ", u"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v3, ", "

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->extras:Landroid/os/Bundle;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ")\n"

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_0
    return-void
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
.end method

.method public getAuthority(I)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1
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

.method public getBackoff(Landroid/accounts/Account;ILjava/lang/String;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "getBackoff"

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-wide p2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    cmp-long v1, p2, v1

    .line 17
    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-wide v1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    monitor-exit v0

    .line 36
    return-object p1

    .line 37
    :cond_1
    :goto_0
    monitor-exit v0

    .line 38
    const/4 p1, 0x0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
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

.method public getCopyOfAllAuthoritiesWithSyncStatus()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/util/Pair<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            "Landroid/content/SyncStatusInfo;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v2, v3, :cond_0

    .line 23
    .line 24
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 31
    .line 32
    invoke-direct {p0, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->createCopyPairOfAuthorityWithSyncStatusLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)Landroid/util/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    monitor-exit v0

    .line 43
    return-object v1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
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

.method public getCopyOfAuthorityWithSyncStatus(Landroid/accounts/Account;ILjava/lang/String;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;",
            "Landroid/content/SyncStatusInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v5, -0x1

    .line 5
    const/4 v6, 0x1

    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move v3, p2

    .line 9
    move-object v4, p3

    .line 10
    :try_start_0
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->createCopyPairOfAuthorityWithSyncStatusLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;)Landroid/util/Pair;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    monitor-exit v0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
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
.end method

.method public getCurrentSyncsCopy(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/content/VSyncInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncsLocked(I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/lody/virtual/server/content/VSyncInfo;

    .line 28
    .line 29
    new-instance v3, Lcom/lody/virtual/server/content/VSyncInfo;

    .line 30
    .line 31
    invoke-direct {v3, v2}, Lcom/lody/virtual/server/content/VSyncInfo;-><init>(Lcom/lody/virtual/server/content/VSyncInfo;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    monitor-exit v0

    .line 39
    return-object v1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
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

.method public getDayStatistics()[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    new-array v3, v2, [Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object v3

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getDelayUntilTime(Landroid/accounts/Account;ILjava/lang/String;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "getDelayUntil"

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    const-wide/16 p1, 0x0

    .line 14
    .line 15
    return-wide p1

    .line 16
    :cond_0
    iget-wide p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->delayUntil:J

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-wide p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
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
.end method

.method public getIsSyncable(Landroid/accounts/Account;ILjava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, -0x1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    :try_start_0
    const-string v2, "getIsSyncable"

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return v1

    .line 17
    :cond_0
    iget p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return p1

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    :cond_2
    if-lez p1, :cond_3

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 38
    .line 39
    iget-object v2, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return p1

    .line 51
    :cond_3
    monitor-exit v0

    .line 52
    return v1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getMasterSyncAutomatically(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDefaultMasterSyncAutomatically:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
    .line 26
    .line 27
.end method

.method public getPendingOperationCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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

.method public getPendingOperations()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getPeriodicSyncs(Landroid/accounts/Account;ILjava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/accounts/Account;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/PeriodicSync;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    const-string v2, "getPeriodicSyncs"

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Landroid/content/PeriodicSync;

    .line 34
    .line 35
    invoke-static {p2}, Lmirror/android/content/PeriodicSync;->clone(Landroid/content/PeriodicSync;)Landroid/content/PeriodicSync;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    monitor-exit v1

    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1
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

.method public getStatusByAccountAndAuthority(Landroid/accounts/Account;ILjava/lang/String;)Landroid/content/SyncStatusInfo;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_2

    .line 18
    .line 19
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Landroid/content/SyncStatusInfo;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 28
    .line 29
    iget v6, v4, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 30
    .line 31
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 36
    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-object v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    iget v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 48
    .line 49
    if-ne v6, p2, :cond_1

    .line 50
    .line 51
    iget-object v5, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 52
    .line 53
    invoke-virtual {p1, v5}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    monitor-exit v1

    .line 60
    return-object v4

    .line 61
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    monitor-exit v1

    .line 65
    return-object v0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1

    .line 69
    :cond_3
    :goto_1
    return-object v0
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

.method public getSyncAutomatically(Landroid/accounts/Account;ILjava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :try_start_0
    const-string v3, "getSyncAutomatically"

    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-boolean p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    monitor-exit v0

    .line 23
    return v1

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :cond_2
    if-lez p1, :cond_3

    .line 31
    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    iget-object v3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 41
    .line 42
    iget-object v4, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iget v4, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 51
    .line 52
    if-ne v4, p2, :cond_2

    .line 53
    .line 54
    iget-boolean v3, v3, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return v1

    .line 60
    :cond_3
    monitor-exit v0

    .line 61
    return v2

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getSyncHistory()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;

    .line 25
    .line 26
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-object v2

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
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

.method public getSyncRandomOffset()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRandomOffset:I

    return v0
.end method

.method public getSyncStatus()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/content/SyncStatusInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/content/SyncStatusInfo;

    .line 25
    .line 26
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-object v2

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
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

.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 21
    .line 22
    monitor-enter p1

    .line 23
    :try_start_1
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 24
    .line 25
    .line 26
    monitor-exit p1

    .line 27
    goto :goto_0

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    throw v0

    .line 31
    :cond_1
    :goto_0
    return-void
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

.method public insertIntoPending(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->account:Landroid/accounts/Account;

    .line 5
    .line 6
    iget v3, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->userId:I

    .line 7
    .line 8
    iget-object v4, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authority:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, -0x1

    .line 11
    const/4 v6, 0x1

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v2, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;

    .line 23
    .line 24
    invoke-direct {v2, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;-><init>(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)V

    .line 25
    .line 26
    .line 27
    iget p1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 28
    .line 29
    iput p1, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;->authorityId:I

    .line 30
    .line 31
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mPendingOperations:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->appendPendingOperationLocked(Lcom/lody/virtual/server/content/SyncStorageEngine$PendingOperation;)V

    .line 37
    .line 38
    .line 39
    iget p1, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v1, 0x1

    .line 46
    iput-boolean v1, p1, Landroid/content/SyncStatusInfo;->pending:Z

    .line 47
    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    const/4 p1, 0x2

    .line 50
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
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

.method public insertStartSyncEvent(Landroid/accounts/Account;IILjava/lang/String;JIZLandroid/os/Bundle;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "insertStartSyncEvent"

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p4, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Ljava/lang/String;)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    const-wide/16 p1, -0x1

    .line 14
    .line 15
    return-wide p1

    .line 16
    :cond_0
    new-instance p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;

    .line 17
    .line 18
    invoke-direct {p2}, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-boolean p8, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->initialization:Z

    .line 22
    .line 23
    iget p1, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->ident:I

    .line 24
    .line 25
    iput p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->authorityId:I

    .line 26
    .line 27
    iget p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextHistoryId:I

    .line 28
    .line 29
    add-int/lit8 p4, p1, 0x1

    .line 30
    .line 31
    iput p4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextHistoryId:I

    .line 32
    .line 33
    iput p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->historyId:I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    if-gez p4, :cond_1

    .line 37
    .line 38
    iput p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNextHistoryId:I

    .line 39
    .line 40
    :cond_1
    iput-wide p5, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->eventTime:J

    .line 41
    .line 42
    iput p7, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->source:I

    .line 43
    .line 44
    iput p3, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->reason:I

    .line 45
    .line 46
    iput-object p9, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->extras:Landroid/os/Bundle;

    .line 47
    .line 48
    iput p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->event:I

    .line 49
    .line 50
    iget-object p3, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p3, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/16 p3, 0x64

    .line 62
    .line 63
    if-le p1, p3, :cond_2

    .line 64
    .line 65
    iget-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    add-int/lit8 p3, p3, -0x1

    .line 72
    .line 73
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget p1, p2, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->historyId:I

    .line 78
    .line 79
    int-to-long p1, p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    const/16 p3, 0x8

    .line 82
    .line 83
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 84
    .line 85
    .line 86
    return-wide p1

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1
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
.end method

.method public isSyncActive(Landroid/accounts/Account;ILjava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncs(I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/lody/virtual/server/content/VSyncInfo;

    .line 23
    .line 24
    iget v2, v2, Lcom/lody/virtual/server/content/VSyncInfo;->authorityId:I

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getAuthority(I)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iget-object v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    iget v2, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 49
    .line 50
    if-ne v2, p2, :cond_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_1
    monitor-exit v0

    .line 56
    const/4 p1, 0x0

    .line 57
    return p1

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p1
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

.method public isSyncPending(Landroid/accounts/Account;ILjava/lang/String;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_4

    .line 13
    .line 14
    iget-object v4, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Landroid/content/SyncStatusInfo;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 23
    .line 24
    iget v6, v4, Landroid/content/SyncStatusInfo;->authorityId:I

    .line 25
    .line 26
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->userId:I

    .line 36
    .line 37
    if-eq p2, v6, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->account:Landroid/accounts/Account;

    .line 43
    .line 44
    invoke-virtual {v6, p1}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v5, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    iget-boolean v4, v4, Landroid/content/SyncStatusInfo;->pending:Z

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    monitor-exit v0

    .line 64
    const/4 p1, 0x1

    .line 65
    return p1

    .line 66
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    monitor-exit v0

    .line 70
    return v2

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p1
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

.method public removeActiveSync(Lcom/lody/virtual/server/content/VSyncInfo;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentSyncs(I)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-virtual {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportActiveChange()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
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

.method public removeAuthority(Landroid/accounts/Account;ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    invoke-direct {p0, p1, p2, p3, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->removeAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
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

.method public removePeriodicSync(Landroid/content/PeriodicSync;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->updateOrRemovePeriodicSync(Landroid/content/PeriodicSync;IZ)V

    return-void
.end method

.method public removeStatusChangeListener(Landroid/content/ISyncStatusObserver;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mChangeListeners:Landroid/os/RemoteCallbackList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public reportActiveChange()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    return-void
.end method

.method public setBackoff(Landroid/accounts/Account;ILjava/lang/String;JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v6, -0x1

    .line 11
    const/4 v7, 0x1

    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    move v4, p2

    .line 15
    move-object v5, p3

    .line 16
    :try_start_0
    invoke-direct/range {v2 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-wide p2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 21
    .line 22
    cmp-long p2, p2, p4

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    iget-wide p2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 27
    .line 28
    cmp-long p2, p2, p6

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_1
    iput-wide p4, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 35
    .line 36
    iput-wide p6, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 37
    .line 38
    move v3, v1

    .line 39
    goto :goto_3

    .line 40
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAccounts:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x0

    .line 51
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_8

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    iget-object v5, v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 66
    .line 67
    iget-object v5, v5, Lcom/lody/virtual/server/accounts/AccountAndUser;->account:Landroid/accounts/Account;

    .line 68
    .line 69
    invoke-virtual {p1, v5}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_4

    .line 74
    .line 75
    iget-object v5, v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->accountAndUser:Lcom/lody/virtual/server/accounts/AccountAndUser;

    .line 76
    .line 77
    iget v5, v5, Lcom/lody/virtual/server/accounts/AccountAndUser;->userId:I

    .line 78
    .line 79
    if-eq p2, v5, :cond_4

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    iget-object v4, v4, Lcom/lody/virtual/server/content/SyncStorageEngine$AccountInfo;->authorities:Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 103
    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    iget-object v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    iget-wide v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 116
    .line 117
    cmp-long v6, v6, p4

    .line 118
    .line 119
    if-nez v6, :cond_7

    .line 120
    .line 121
    iget-wide v6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 122
    .line 123
    cmp-long v6, v6, p6

    .line 124
    .line 125
    if-eqz v6, :cond_5

    .line 126
    .line 127
    :cond_7
    iput-wide p4, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffTime:J

    .line 128
    .line 129
    iput-wide p6, v5, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->backoffDelay:J

    .line 130
    .line 131
    move v3, v1

    .line 132
    goto :goto_2

    .line 133
    :cond_8
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    if-eqz v3, :cond_9

    .line 135
    .line 136
    invoke-direct {p0, v1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 137
    .line 138
    .line 139
    :cond_9
    return-void

    .line 140
    :catchall_0
    move-exception p1

    .line 141
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw p1
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
.end method

.method public setDelayUntilTime(Landroid/accounts/Account;ILjava/lang/String;J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v5, -0x1

    .line 5
    const/4 v6, 0x1

    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move v3, p2

    .line 9
    move-object v4, p3

    .line 10
    :try_start_0
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-wide p2, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->delayUntil:J

    .line 15
    .line 16
    cmp-long p2, p2, p4

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :cond_0
    iput-wide p4, p1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->delayUntil:J

    .line 23
    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const/4 p1, 0x1

    .line 26
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public setIsSyncable(Landroid/accounts/Account;ILjava/lang/String;I)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p4, v0, :cond_0

    .line 3
    .line 4
    move p4, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, -0x1

    .line 7
    if-ge p4, v1, :cond_1

    .line 8
    .line 9
    move p4, v1

    .line 10
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    const/4 v6, -0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v2, p0

    .line 16
    move-object v3, p1

    .line 17
    move v4, p2

    .line 18
    move-object v5, p3

    .line 19
    :try_start_0
    invoke-direct/range {v2 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v3, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 24
    .line 25
    if-ne v3, p4, :cond_2

    .line 26
    .line 27
    monitor-exit v1

    .line 28
    return-void

    .line 29
    :cond_2
    iput p4, v2, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->syncable:I

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 32
    .line 33
    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-lez p4, :cond_3

    .line 36
    .line 37
    const/4 v5, -0x5

    .line 38
    new-instance v7, Landroid/os/Bundle;

    .line 39
    .line 40
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 41
    .line 42
    .line 43
    move-object v2, p0

    .line 44
    move-object v3, p1

    .line 45
    move v4, p2

    .line 46
    move-object v6, p3

    .line 47
    invoke-direct/range {v2 .. v7}, Lcom/lody/virtual/server/content/SyncStorageEngine;->requestSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
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

.method public setMasterSyncAutomatically(ZI)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v1, p1, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mMasterSyncAutomatically:Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, p2, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 32
    .line 33
    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v6, -0x7

    .line 39
    const/4 v7, 0x0

    .line 40
    new-instance v8, Landroid/os/Bundle;

    .line 41
    .line 42
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 43
    .line 44
    .line 45
    move-object v3, p0

    .line 46
    move v5, p2

    .line 47
    invoke-direct/range {v3 .. v8}, Lcom/lody/virtual/server/content/SyncStorageEngine;->requestSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 p1, 0x1

    .line 51
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1
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

.method protected setOnSyncRequestListener(Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRequestListener:Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncRequestListener:Lcom/lody/virtual/server/content/SyncStorageEngine$OnSyncRequestListener;

    .line 6
    .line 7
    :cond_0
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setPeriodicSyncTime(ILandroid/content/PeriodicSync;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    iget-object v4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->periodicSyncs:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Landroid/content/PeriodicSync;

    .line 29
    .line 30
    invoke-virtual {p2, v4}, Landroid/content/PeriodicSync;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object p2, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncStatus:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/content/SyncStatusInfo;

    .line 43
    .line 44
    invoke-virtual {p1, v3, p3, p4}, Landroid/content/SyncStatusInfo;->setPeriodicSyncTime(IJ)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    const-string p1, "SyncManager"

    .line 56
    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string p3, "Ignoring setPeriodicSyncTime request for a sync that does not exist. Authority: "

    .line 63
    .line 64
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object p3, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->authority:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public setSyncAutomatically(Landroid/accounts/Account;ILjava/lang/String;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v5, -0x1

    .line 5
    const/4 v6, 0x0

    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move v3, p2

    .line 9
    move-object v4, p3

    .line 10
    :try_start_0
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateAuthorityLocked(Landroid/accounts/Account;ILjava/lang/String;IZ)Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-boolean v2, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 15
    .line 16
    if-ne v2, p4, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :cond_0
    iput-boolean p4, v1, Lcom/lody/virtual/server/content/SyncStorageEngine$AuthorityInfo;->enabled:Z

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeAccountInfoLocked()V

    .line 23
    .line 24
    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    const/4 v4, -0x6

    .line 29
    new-instance v6, Landroid/os/Bundle;

    .line 30
    .line 31
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 32
    .line 33
    .line 34
    move-object v1, p0

    .line 35
    move-object v2, p1

    .line 36
    move v3, p2

    .line 37
    move-object v5, p3

    .line 38
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/content/SyncStorageEngine;->requestSync(Landroid/accounts/Account;IILjava/lang/String;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 p1, 0x1

    .line 42
    invoke-direct {p0, p1}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1
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

.method public stopSyncEvent(JJLjava/lang/String;JJ)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p5

    .line 8
    .line 9
    iget-object v6, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 10
    .line 11
    monitor-enter v6

    .line 12
    :try_start_0
    iget-object v7, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    :cond_0
    if-lez v7, :cond_1

    .line 19
    .line 20
    add-int/lit8 v7, v7, -0x1

    .line 21
    .line 22
    iget-object v9, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mSyncHistory:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    check-cast v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;

    .line 29
    .line 30
    iget v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->historyId:I

    .line 31
    .line 32
    int-to-long v10, v10

    .line 33
    cmp-long v10, v10, v2

    .line 34
    .line 35
    if-nez v10, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v9, 0x0

    .line 39
    :goto_0
    if-nez v9, :cond_2

    .line 40
    .line 41
    const-string v0, "SyncManager"

    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "stopSyncEvent: no history for id "

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    monitor-exit v6

    .line 64
    return-void

    .line 65
    :cond_2
    iput-wide v4, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->elapsedTime:J

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    iput v2, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->event:I

    .line 69
    .line 70
    iput-object v0, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->mesg:Ljava/lang/String;

    .line 71
    .line 72
    move-wide/from16 v10, p6

    .line 73
    .line 74
    iput-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->downstreamActivity:J

    .line 75
    .line 76
    move-wide/from16 v10, p8

    .line 77
    .line 78
    iput-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->upstreamActivity:J

    .line 79
    .line 80
    iget v3, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->authorityId:I

    .line 81
    .line 82
    invoke-direct {v1, v3}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getOrCreateSyncStatusLocked(I)Landroid/content/SyncStatusInfo;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSyncs:I

    .line 87
    .line 88
    add-int/2addr v7, v2

    .line 89
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSyncs:I

    .line 90
    .line 91
    iget-wide v10, v3, Landroid/content/SyncStatusInfo;->totalElapsedTime:J

    .line 92
    .line 93
    add-long/2addr v10, v4

    .line 94
    iput-wide v10, v3, Landroid/content/SyncStatusInfo;->totalElapsedTime:J

    .line 95
    .line 96
    iget v7, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->source:I

    .line 97
    .line 98
    const/4 v10, 0x2

    .line 99
    if-eqz v7, :cond_7

    .line 100
    .line 101
    if-eq v7, v2, :cond_6

    .line 102
    .line 103
    if-eq v7, v10, :cond_5

    .line 104
    .line 105
    const/4 v11, 0x3

    .line 106
    if-eq v7, v11, :cond_4

    .line 107
    .line 108
    const/4 v11, 0x4

    .line 109
    if-eq v7, v11, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSourcePeriodic:I

    .line 113
    .line 114
    add-int/2addr v7, v2

    .line 115
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSourcePeriodic:I

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSourceUser:I

    .line 119
    .line 120
    add-int/2addr v7, v2

    .line 121
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSourceUser:I

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSourcePoll:I

    .line 125
    .line 126
    add-int/2addr v7, v2

    .line 127
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSourcePoll:I

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSourceLocal:I

    .line 131
    .line 132
    add-int/2addr v7, v2

    .line 133
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSourceLocal:I

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    iget v7, v3, Landroid/content/SyncStatusInfo;->numSourceServer:I

    .line 137
    .line 138
    add-int/2addr v7, v2

    .line 139
    iput v7, v3, Landroid/content/SyncStatusInfo;->numSourceServer:I

    .line 140
    .line 141
    :goto_1
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->getCurrentDayLocked()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    iget-object v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 146
    .line 147
    const/4 v12, 0x0

    .line 148
    aget-object v13, v11, v12

    .line 149
    .line 150
    if-nez v13, :cond_8

    .line 151
    .line 152
    new-instance v13, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 153
    .line 154
    invoke-direct {v13, v7}, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;-><init>(I)V

    .line 155
    .line 156
    .line 157
    aput-object v13, v11, v12

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    iget v13, v13, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->day:I

    .line 161
    .line 162
    if-eq v7, v13, :cond_9

    .line 163
    .line 164
    array-length v13, v11

    .line 165
    sub-int/2addr v13, v2

    .line 166
    invoke-static {v11, v12, v11, v2, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 167
    .line 168
    .line 169
    iget-object v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 170
    .line 171
    new-instance v13, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 172
    .line 173
    invoke-direct {v13, v7}, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;-><init>(I)V

    .line 174
    .line 175
    .line 176
    aput-object v13, v11, v12

    .line 177
    .line 178
    move v7, v2

    .line 179
    goto :goto_3

    .line 180
    :cond_9
    :goto_2
    move v7, v12

    .line 181
    :goto_3
    iget-object v11, v1, Lcom/lody/virtual/server/content/SyncStorageEngine;->mDayStats:[Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;

    .line 182
    .line 183
    aget-object v11, v11, v12

    .line 184
    .line 185
    iget-wide v13, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->eventTime:J

    .line 186
    .line 187
    add-long/2addr v13, v4

    .line 188
    const-string v15, "success"

    .line 189
    .line 190
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    move-object/from16 p2, v11

    .line 195
    .line 196
    const-wide/16 v10, 0x0

    .line 197
    .line 198
    if-eqz v15, :cond_c

    .line 199
    .line 200
    move-object/from16 v16, v9

    .line 201
    .line 202
    iget-wide v8, v3, Landroid/content/SyncStatusInfo;->lastSuccessTime:J

    .line 203
    .line 204
    cmp-long v0, v8, v10

    .line 205
    .line 206
    if-eqz v0, :cond_a

    .line 207
    .line 208
    iget-wide v8, v3, Landroid/content/SyncStatusInfo;->lastFailureTime:J

    .line 209
    .line 210
    cmp-long v0, v8, v10

    .line 211
    .line 212
    if-eqz v0, :cond_b

    .line 213
    .line 214
    :cond_a
    move v12, v2

    .line 215
    :cond_b
    iput-wide v13, v3, Landroid/content/SyncStatusInfo;->lastSuccessTime:J

    .line 216
    .line 217
    move-object/from16 v8, v16

    .line 218
    .line 219
    iget v0, v8, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->source:I

    .line 220
    .line 221
    iput v0, v3, Landroid/content/SyncStatusInfo;->lastSuccessSource:I

    .line 222
    .line 223
    iput-wide v10, v3, Landroid/content/SyncStatusInfo;->lastFailureTime:J

    .line 224
    .line 225
    const/4 v0, -0x1

    .line 226
    iput v0, v3, Landroid/content/SyncStatusInfo;->lastFailureSource:I

    .line 227
    .line 228
    const/4 v0, 0x0

    .line 229
    iput-object v0, v3, Landroid/content/SyncStatusInfo;->lastFailureMesg:Ljava/lang/String;

    .line 230
    .line 231
    iput-wide v10, v3, Landroid/content/SyncStatusInfo;->initialFailureTime:J

    .line 232
    .line 233
    move-object/from16 v9, p2

    .line 234
    .line 235
    iget v0, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successCount:I

    .line 236
    .line 237
    add-int/2addr v0, v2

    .line 238
    iput v0, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successCount:I

    .line 239
    .line 240
    iget-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successTime:J

    .line 241
    .line 242
    add-long/2addr v10, v4

    .line 243
    iput-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->successTime:J

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_c
    move-object v8, v9

    .line 247
    move-object/from16 v9, p2

    .line 248
    .line 249
    const-string v15, "canceled"

    .line 250
    .line 251
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v15

    .line 255
    if-nez v15, :cond_f

    .line 256
    .line 257
    move-wide/from16 p6, v13

    .line 258
    .line 259
    iget-wide v12, v3, Landroid/content/SyncStatusInfo;->lastFailureTime:J

    .line 260
    .line 261
    cmp-long v12, v12, v10

    .line 262
    .line 263
    move-wide/from16 v13, p6

    .line 264
    .line 265
    if-nez v12, :cond_d

    .line 266
    .line 267
    move v12, v2

    .line 268
    goto :goto_4

    .line 269
    :cond_d
    const/4 v12, 0x0

    .line 270
    :goto_4
    iput-wide v13, v3, Landroid/content/SyncStatusInfo;->lastFailureTime:J

    .line 271
    .line 272
    iget v8, v8, Lcom/lody/virtual/server/content/SyncStorageEngine$SyncHistoryItem;->source:I

    .line 273
    .line 274
    iput v8, v3, Landroid/content/SyncStatusInfo;->lastFailureSource:I

    .line 275
    .line 276
    iput-object v0, v3, Landroid/content/SyncStatusInfo;->lastFailureMesg:Ljava/lang/String;

    .line 277
    .line 278
    iget-wide v10, v3, Landroid/content/SyncStatusInfo;->initialFailureTime:J

    .line 279
    .line 280
    const-wide/16 v15, 0x0

    .line 281
    .line 282
    cmp-long v0, v10, v15

    .line 283
    .line 284
    if-nez v0, :cond_e

    .line 285
    .line 286
    iput-wide v13, v3, Landroid/content/SyncStatusInfo;->initialFailureTime:J

    .line 287
    .line 288
    :cond_e
    iget v0, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureCount:I

    .line 289
    .line 290
    add-int/2addr v0, v2

    .line 291
    iput v0, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureCount:I

    .line 292
    .line 293
    iget-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureTime:J

    .line 294
    .line 295
    add-long/2addr v10, v4

    .line 296
    iput-wide v10, v9, Lcom/lody/virtual/server/content/SyncStorageEngine$DayStats;->failureTime:J

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_f
    const/4 v12, 0x0

    .line 300
    :goto_5
    if-eqz v12, :cond_10

    .line 301
    .line 302
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_10
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_11

    .line 311
    .line 312
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    const-wide/32 v2, 0x927c0

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 320
    .line 321
    .line 322
    :cond_11
    :goto_6
    if-eqz v7, :cond_12

    .line 323
    .line 324
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_12
    const/4 v0, 0x2

    .line 329
    invoke-virtual {v1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-nez v2, :cond_13

    .line 334
    .line 335
    invoke-virtual {v1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    const-wide/32 v2, 0x1b7740

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 343
    .line 344
    .line 345
    :cond_13
    :goto_7
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    const/16 v0, 0x8

    .line 347
    .line 348
    invoke-direct {v1, v0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->reportChange(I)V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :catchall_0
    move-exception v0

    .line 353
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    throw v0
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
.end method

.method public writeAllState()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mAuthorities:Landroid/util/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lcom/lody/virtual/server/content/SyncStorageEngine;->mNumPendingFinished:I

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writePendingOperationsLocked()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatusLocked()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/lody/virtual/server/content/SyncStorageEngine;->writeStatisticsLocked()V

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw v1
    .line 22
    .line 23
.end method
