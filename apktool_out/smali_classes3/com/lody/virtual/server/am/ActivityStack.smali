.class Lcom/lody/virtual/server/am/ActivityStack;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ActivityStack"

.field private static final sTrace:Z = true


# instance fields
.field private final mAM:Landroid/app/ActivityManager;

.field private final mHistory:Lcom/lody/virtual/helper/collection/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "Lcom/lody/virtual/server/am/TaskRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mPendingLaunchActivities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/lody/virtual/server/am/ActivityRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mService:Lcom/lody/virtual/server/am/VActivityManagerService;


# direct methods
.method constructor <init>(Lcom/lody/virtual/server/am/VActivityManagerService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mPendingLaunchActivities:Ljava/util/Set;

    .line 14
    .line 15
    new-instance v0, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/lody/virtual/helper/collection/SparseArray;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mService:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 23
    .line 24
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "activity"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/app/ActivityManager;

    .line 39
    .line 40
    iput-object p1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mAM:Landroid/app/ActivityManager;

    .line 41
    .line 42
    return-void
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

.method private static activityInfoFlagsToString(I)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v2, "FLAG_MULTIPROCESS | "

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    :cond_0
    const/high16 v1, 0x100000

    .line 23
    .line 24
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v2, "FLAG_VISIBLE_TO_INSTANT_APP | "

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const-string v2, "FLAG_FINISH_ON_TASK_LAUNCH | "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    :cond_2
    const/4 v2, 0x4

    .line 56
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    const-string v3, "FLAG_CLEAR_TASK_ON_LAUNCH | "

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    :cond_3
    const/16 v2, 0x8

    .line 72
    .line 73
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    const-string v3, "FLAG_ALWAYS_RETAIN_TASK_STATE | "

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    :cond_4
    const/16 v2, 0x10

    .line 89
    .line 90
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    const-string v3, "FLAG_STATE_NOT_NEEDED | "

    .line 97
    .line 98
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    :cond_5
    const/16 v2, 0x40

    .line 106
    .line 107
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    const-string v3, "FLAG_ALLOW_TASK_REPARENTING | "

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    :cond_6
    const/16 v2, 0x80

    .line 123
    .line 124
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_7

    .line 129
    .line 130
    const-string v3, "FLAG_NO_HISTORY | "

    .line 131
    .line 132
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    :cond_7
    const/16 v2, 0x100

    .line 140
    .line 141
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_8

    .line 146
    .line 147
    const-string v3, "FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS | "

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    :cond_8
    const/16 v2, 0x200

    .line 157
    .line 158
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_9

    .line 163
    .line 164
    const-string v3, "FLAG_HARDWARE_ACCELERATED | "

    .line 165
    .line 166
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    :cond_9
    const/high16 v2, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_a

    .line 180
    .line 181
    const-string v3, "FLAG_SINGLE_USER | "

    .line 182
    .line 183
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    :cond_a
    const/16 v2, 0x20

    .line 191
    .line 192
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_b

    .line 197
    .line 198
    const-string v3, "FLAG_EXCLUDE_FROM_RECENTS | "

    .line 199
    .line 200
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    :cond_b
    if-eqz p0, :cond_c

    .line 208
    .line 209
    const-string v1, "0x"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-le p0, v1, :cond_d

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    sub-int/2addr p0, v1

    .line 233
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    invoke-virtual {v0, p0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    :cond_d
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0
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

.method private static activityInfoToString(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "launchMode: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Landroid/content/pm/ActivityInfo;->launchMode:I

    .line 12
    .line 13
    invoke-static {v1}, Lcom/lody/virtual/server/am/ActivityStack;->launchModeToString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "\ndocumentLaunchMode: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Landroid/content/pm/ActivityInfo;->documentLaunchMode:I

    .line 26
    .line 27
    invoke-static {v1}, Lcom/lody/virtual/server/am/ActivityStack;->documentLaunchModeToString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "\naffinity: "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Landroid/content/pm/ActivityInfo;->taskAffinity:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, "\nflags: "

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget p0, p0, Landroid/content/pm/ActivityInfo;->flags:I

    .line 50
    .line 51
    invoke-static {p0}, Lcom/lody/virtual/server/am/ActivityStack;->activityInfoFlagsToString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
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

.method private static componentInfoToString(Landroid/content/pm/ComponentInfo;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static containFlags(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static containFlags(Landroid/content/Intent;I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    move-result p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private deliverNewIntentLocked(Lcom/lody/virtual/server/am/ActivityRecord;Lcom/lody/virtual/server/am/ActivityRecord;Landroid/content/Intent;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const-string p1, "android"

    .line 14
    .line 15
    :goto_0
    iget-boolean v0, p2, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p2, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v0, Lcom/lody/virtual/server/am/ProcessRecord;->client:Lcom/lody/virtual/client/IVClient;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    :try_start_0
    iget-object p2, p2, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/client/IVClient;->scheduleNewIntent(Ljava/lang/String;Landroid/os/IBinder;Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catch_0
    move-exception p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    new-instance v0, Lcom/lody/virtual/server/am/PendingNewIntent;

    .line 39
    .line 40
    invoke-direct {v0, p1, p3}, Lcom/lody/virtual/server/am/PendingNewIntent;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p2, Lcom/lody/virtual/server/am/ActivityRecord;->pendingNewIntent:Lcom/lody/virtual/server/am/PendingNewIntent;

    .line 44
    .line 45
    :goto_1
    return-void
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

.method private static documentLaunchModeToString(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "unknown"

    return-object p0

    :cond_0
    const-string p0, "never"

    return-object p0

    :cond_1
    const-string p0, "always"

    return-object p0

    :cond_2
    const-string p0, "intoExisting"

    return-object p0

    :cond_3
    const-string p0, "none"

    return-object p0
.end method

.method private findActivityByComponentName(Lcom/lody/virtual/server/am/TaskRecord;Landroid/content/ComponentName;)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    :goto_0
    if-ltz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 21
    .line 22
    iget-boolean v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iget-object v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 27
    .line 28
    invoke-virtual {v3, p2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object v2

    .line 36
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    monitor-exit v0

    .line 40
    const/4 p1, 0x0

    .line 41
    return-object p1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/lody/virtual/server/am/TaskRecord;

    .line 20
    .line 21
    iget v3, v2, Lcom/lody/virtual/server/am/TaskRecord;->userId:I

    .line 22
    .line 23
    if-eq v3, p1, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    iget-object v3, v2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    iget-object v2, v2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 46
    .line 47
    iget-object v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 48
    .line 49
    if-ne v5, p2, :cond_1

    .line 50
    .line 51
    move-object v0, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    monitor-exit v3

    .line 54
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1

    .line 60
    :cond_3
    return-object v0
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

.method private findTaskByAffinityLocked(ILjava/lang/String;)Lcom/lody/virtual/server/am/TaskRecord;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 17
    .line 18
    iget v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->userId:I

    .line 19
    .line 20
    if-ne p1, v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->affinity:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/lody/virtual/server/am/TaskRecord;->isFinishing()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return-object p1
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

.method private findTaskByComponentLocked(ILandroid/content/ComponentName;)Lcom/lody/virtual/server/am/TaskRecord;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 17
    .line 18
    iget v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->userId:I

    .line 19
    .line 20
    if-ne p1, v2, :cond_2

    .line 21
    .line 22
    iget-object v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 23
    .line 24
    monitor-enter v2

    .line 25
    :try_start_0
    iget-object v3, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 42
    .line 43
    iget-boolean v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 44
    .line 45
    if-nez v5, :cond_0

    .line 46
    .line 47
    iget-object v4, v4, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 48
    .line 49
    invoke-virtual {v4, p2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    monitor-exit v2

    .line 56
    return-object v1

    .line 57
    :cond_1
    monitor-exit v2

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p1

    .line 62
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 p1, 0x0

    .line 66
    return-object p1
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

.method private findTaskByIntentLocked(ILandroid/content/Intent;)Lcom/lody/virtual/server/am/TaskRecord;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 17
    .line 18
    iget v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->userId:I

    .line 19
    .line 20
    if-ne p1, v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->taskRoot:Landroid/content/Intent;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, v1, Lcom/lody/virtual/server/am/TaskRecord;->taskRoot:Landroid/content/Intent;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v2, v3}, Lcom/lody/virtual/helper/compat/ObjectsCompat;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return-object p1
    .line 48
    .line 49
    .line 50
.end method

.method private finishMarkedActivity()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 11
    .line 12
    if-lez v1, :cond_4

    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 21
    .line 22
    iget-object v3, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 23
    .line 24
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    iget-object v1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 42
    .line 43
    iget-boolean v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 44
    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-boolean v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    :try_start_2
    iget-object v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    iget-object v5, v5, Lcom/lody/virtual/server/am/ProcessRecord;->client:Lcom/lody/virtual/client/IVClient;

    .line 57
    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    iget-object v4, v4, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 61
    .line 62
    invoke-interface {v5, v4}, Lcom/lody/virtual/client/IVClient;->finishActivity(Landroid/os/IBinder;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception v4

    .line 70
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    monitor-exit v3

    .line 75
    move v1, v2

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :try_start_4
    throw v1

    .line 80
    :cond_4
    monitor-exit v0

    .line 81
    return-void

    .line 82
    :catchall_1
    move-exception v1

    .line 83
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 84
    throw v1
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

.method private getCallingRecordLocked(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    iget-object p2, p2, Lcom/lody/virtual/server/am/ActivityRecord;->resultTo:Landroid/os/IBinder;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private getStartShadowActivityIntentInner(Landroid/content/Intent;ZIILcom/lody/virtual/server/am/ActivityRecord;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/content/Intent;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 9
    .line 10
    .line 11
    iget v1, p6, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v1, p5, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p5, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 33
    .line 34
    iget v1, v1, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 35
    .line 36
    iput v1, p6, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    .line 37
    .line 38
    :cond_0
    invoke-static {p2}, Lcom/lody/virtual/client/stub/StubManifest;->getStubPackageName(Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-direct {p0, p3, p6}, Lcom/lody/virtual/server/am/ActivityStack;->selectShadowActivity(ILandroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    invoke-static {p6}, Lcom/lody/virtual/helper/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :cond_1
    invoke-virtual {p2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    new-instance p2, Lcom/lody/virtual/remote/ShadowActivityInfo;

    .line 67
    .line 68
    invoke-direct {p2, v0, p6, p4, p5}, Lcom/lody/virtual/remote/ShadowActivityInfo;-><init>(Landroid/content/Intent;Landroid/content/pm/ActivityInfo;ILandroid/os/IBinder;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, p1}, Lcom/lody/virtual/remote/ShadowActivityInfo;->saveToIntent(Landroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    return-object p1
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
.end method

.method private static launchModeToString(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "unknown"

    return-object p0

    :cond_0
    const-string p0, "singleInstance"

    return-object p0

    :cond_1
    const-string p0, "singleTask"

    return-object p0

    :cond_2
    const-string p0, "singleTop"

    return-object p0

    :cond_3
    const-string p0, "standard"

    return-object p0
.end method

.method private newActivityRecord(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/am/ActivityRecord;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/lody/virtual/server/am/ActivityRecord;-><init>(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;)V

    return-object v0
.end method

.method private optimizeTasksLocked()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/lody/virtual/client/core/VirtualCore;->getRecentTasksEx(II)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 20
    .line 21
    if-lez v1, :cond_3

    .line 22
    .line 23
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Landroid/app/ActivityManager$RecentTaskInfo;

    .line 46
    .line 47
    iget v4, v4, Landroid/app/ActivityManager$RecentTaskInfo;->id:I

    .line 48
    .line 49
    iget v5, v1, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 50
    .line 51
    if-ne v4, v5, :cond_0

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/ListIterator;->remove()V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v1, 0x0

    .line 59
    :goto_1
    if-nez v1, :cond_2

    .line 60
    .line 61
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->removeAt(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    move v1, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-void
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

.method private static parseIntentFlagsToString(Landroid/content/Intent;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "0x0"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const/high16 v1, 0x10000000

    .line 16
    .line 17
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const-string v2, "FLAG_ACTIVITY_NEW_TASK | "

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    :cond_1
    const v1, 0x8000

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const-string v2, "FLAG_ACTIVITY_CLEAR_TASK | "

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    :cond_2
    const/high16 v1, 0x8000000

    .line 51
    .line 52
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const-string v3, "FLAG_ACTIVITY_MULTIPLE_TASK | "

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    :cond_3
    const/high16 v2, 0x20000

    .line 68
    .line 69
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const-string v5, "FLAG_ACTIVITY_REORDER_TO_FRONT | "

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    :cond_4
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    :cond_5
    const/high16 v2, 0x20000000

    .line 98
    .line 99
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    const-string v4, "FLAG_ACTIVITY_SINGLE_TOP | "

    .line 106
    .line 107
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v2}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    :cond_6
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    :cond_7
    const/high16 v1, 0x2000000

    .line 128
    .line 129
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_8

    .line 134
    .line 135
    const-string v2, "FLAG_ACTIVITY_FORWARD_RESULT | "

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    :cond_8
    const/16 v1, 0x4000

    .line 145
    .line 146
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    const-string v2, "FLAG_ACTIVITY_TASK_ON_HOME | "

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    :cond_9
    const/high16 v1, 0x4000000

    .line 162
    .line 163
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    const-string v2, "FLAG_ACTIVITY_CLEAR_TOP | "

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    :cond_a
    const/high16 v1, 0x40000

    .line 179
    .line 180
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_b

    .line 185
    .line 186
    const-string v2, "FLAG_ACTIVITY_NO_USER_ACTION | "

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    :cond_b
    const/16 v1, 0x2000

    .line 196
    .line 197
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_c

    .line 202
    .line 203
    const-string v2, "FLAG_ACTIVITY_RETAIN_IN_RECENTS | "

    .line 204
    .line 205
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-static {p0, v1}, Lcom/lody/virtual/server/am/ActivityStack;->removeFlags(II)I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    :cond_c
    if-eqz p0, :cond_d

    .line 213
    .line 214
    const-string v1, "0x"

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    const/4 v1, 0x2

    .line 232
    if-lt p0, v1, :cond_e

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    sub-int/2addr p0, v1

    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-virtual {v0, p0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    :cond_e
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0
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

.method private realStartActivityLocked(Landroid/os/IInterface;Landroid/os/IBinder;Landroid/content/Intent;Ljava/lang/String;ILandroid/os/Bundle;)I
    .locals 8

    .line 1
    sget-object v0, Lmirror/android/app/IActivityManager;->startActivity:Lmirror/RefMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmirror/RefMethod;->paramList()[Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v1, v0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p1, v1, v2

    .line 12
    .line 13
    const-class p1, Landroid/content/Intent;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->protoIndexOf([Ljava/lang/Class;Ljava/lang/Class;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const-class v3, Landroid/os/IBinder;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-static {v0, v3, v4}, Lcom/lody/virtual/helper/utils/ArrayUtils;->protoIndexOf([Ljava/lang/Class;Ljava/lang/Class;I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const-class v4, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-static {v0, v4}, Lcom/lody/virtual/helper/utils/ArrayUtils;->protoIndexOf([Ljava/lang/Class;Ljava/lang/Class;)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/lit8 v5, p1, 0x1

    .line 33
    .line 34
    add-int/lit8 v6, v3, 0x1

    .line 35
    .line 36
    add-int/lit8 v7, v3, 0x2

    .line 37
    .line 38
    aput-object p3, v1, p1

    .line 39
    .line 40
    aput-object p2, v1, v3

    .line 41
    .line 42
    aput-object p4, v1, v6

    .line 43
    .line 44
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    aput-object p2, v1, v7

    .line 49
    .line 50
    const/4 p2, -0x1

    .line 51
    if-eq v4, p2, :cond_0

    .line 52
    .line 53
    aput-object p6, v1, v4

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    aput-object p2, v1, v5

    .line 60
    .line 61
    add-int/lit8 p1, p1, -0x1

    .line 62
    .line 63
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPkg()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    aput-object p2, v1, p1

    .line 72
    .line 73
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/ClassUtils;->fixArgs([Ljava/lang/Class;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_0
    sget-object p1, Lmirror/android/app/IActivityManager;->startActivity:Lmirror/RefMethod;

    .line 77
    .line 78
    sget-object p2, Lmirror/android/app/ActivityManagerNative;->getDefault:Lmirror/RefStaticMethod;

    .line 79
    .line 80
    new-array p3, v2, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {p2, p3}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p1, p2, v1}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    return p1

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    return v2
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
.end method

.method private static removeFlags(II)I
    .locals 0

    not-int p1, p1

    and-int/2addr p0, p1

    return p0
.end method

.method private static removeFlags(Landroid/content/Intent;I)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    not-int p1, p1

    and-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    return-void
.end method

.method private selectShadowActivity(ILandroid/content/pm/ActivityInfo;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lmirror/com/android/internal/R_Hide$styleable;->Window:Lmirror/RefStaticObject;

    .line 3
    .line 4
    invoke-virtual {v1}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, [I

    .line 9
    .line 10
    sget-object v2, Lmirror/com/android/internal/R_Hide$styleable;->Window_windowIsTranslucent:Lmirror/RefStaticInt;

    .line 11
    .line 12
    invoke-virtual {v2}, Lmirror/RefStaticInt;->get()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sget-object v3, Lmirror/com/android/internal/R_Hide$styleable;->Window_windowIsFloating:Lmirror/RefStaticInt;

    .line 17
    .line 18
    invoke-virtual {v3}, Lmirror/RefStaticInt;->get()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget-object v4, Lmirror/com/android/internal/R_Hide$styleable;->Window_windowShowWallpaper:Lmirror/RefStaticInt;

    .line 23
    .line 24
    invoke-virtual {v4}, Lmirror/RefStaticInt;->get()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-static {}, Lcom/lody/virtual/server/am/AttributeCache;->instance()Lcom/lody/virtual/server/am/AttributeCache;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 33
    .line 34
    iget v7, p2, Landroid/content/pm/ActivityInfo;->theme:I

    .line 35
    .line 36
    invoke-virtual {v5, v6, v7, v1}, Lcom/lody/virtual/server/am/AttributeCache;->get(Ljava/lang/String;I[I)Lcom/lody/virtual/server/am/AttributeCache$Entry;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v5, v1, Lcom/lody/virtual/server/am/AttributeCache$Entry;->array:Landroid/content/res/TypedArray;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v5, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 50
    :try_start_1
    iget-object v5, v1, Lcom/lody/virtual/server/am/AttributeCache$Entry;->array:Landroid/content/res/TypedArray;

    .line 51
    .line 52
    invoke-virtual {v5, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    :try_start_2
    iget-object v1, v1, Lcom/lody/virtual/server/am/AttributeCache$Entry;->array:Landroid/content/res/TypedArray;

    .line 57
    .line 58
    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    goto :goto_0

    .line 65
    :catchall_1
    move-exception v1

    .line 66
    move v2, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v1, v0

    .line 69
    move v2, v1

    .line 70
    move v4, v2

    .line 71
    goto :goto_1

    .line 72
    :catchall_2
    move-exception v1

    .line 73
    move v2, v0

    .line 74
    move v4, v2

    .line 75
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    move v1, v0

    .line 79
    :goto_1
    if-nez v1, :cond_1

    .line 80
    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    :cond_1
    const/4 v0, 0x1

    .line 86
    :cond_2
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-static {p1, p2}, Lcom/lody/virtual/client/stub/StubManifest;->getStubDialogName(ILandroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_3
    invoke-static {p1, p2}, Lcom/lody/virtual/client/stub/StubManifest;->getStubActivityName(ILandroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1
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

.method private startActivity(Landroid/content/Intent;Landroid/os/Bundle;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Lcom/lody/virtual/client/core/VirtualCore;->isAppInstalled(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    sget-object v2, Lcom/lody/virtual/client/stub/StubManifest;->PACKAGE_NAME:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-nez p3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    sget-object v0, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    if-eqz p3, :cond_1

    .line 48
    .line 49
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p3}, Lcom/lody/virtual/client/core/VirtualCore;->isSharedUserId()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-nez p3, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/4 v1, 0x0

    .line 61
    :goto_0
    if-eqz v1, :cond_2

    .line 62
    .line 63
    new-instance p3, Landroid/content/Intent;

    .line 64
    .line 65
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-class v1, Lcom/lody/virtual/client/stub/BridgeActivity;

    .line 74
    .line 75
    invoke-direct {p3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x10000000

    .line 79
    .line 80
    invoke-virtual {p3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    const-string v0, "_VA_|_intent_"

    .line 84
    .line 85
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const-string p1, "_VA_|_bundle_"

    .line 89
    .line 90
    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, p3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-virtual {p3}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-virtual {p3, p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    return-void
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

.method private startActivityFromSourceTask(Lcom/lody/virtual/server/am/ProcessRecord;Landroid/os/IBinder;Landroid/content/Intent;Ljava/lang/String;ILandroid/os/Bundle;)I
    .locals 7

    iget-object v1, p1, Lcom/lody/virtual/server/am/ProcessRecord;->appThread:Landroid/os/IInterface;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/lody/virtual/server/am/ActivityStack;->realStartActivityLocked(Landroid/os/IInterface;Landroid/os/IBinder;Landroid/content/Intent;Ljava/lang/String;ILandroid/os/Bundle;)I

    move-result p1

    return p1
.end method

.method private startActivityInNewTaskLocked(IILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/Bundle;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, p3, p4, v0}, Lcom/lody/virtual/server/am/ActivityStack;->newActivityRecord(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iput-object p5, v0, Lcom/lody/virtual/server/am/ActivityRecord;->options:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {p0, p2, v0, p3, p4}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityProcess(ILcom/lody/virtual/server/am/ActivityRecord;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const/high16 p1, 0x10000000

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    const/high16 p1, 0x8000000

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    const/high16 p1, 0x200000

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const/high16 p1, 0x80000

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    iget-object p1, p4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/lody/virtual/server/pm/PackageSetting;->isRunInExtProcess()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-direct {p0, p2, p5, p1}, Lcom/lody/virtual/server/am/ActivityStack;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return p1
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

.method private startActivityProcess(ILcom/lody/virtual/server/am/ActivityRecord;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mService:Lcom/lody/virtual/server/am/VActivityManagerService;

    .line 2
    .line 3
    iget-object v1, p4, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/lody/virtual/server/am/VActivityManagerService;->startProcessIfNeeded(Ljava/lang/String;ILjava/lang/String;I)Lcom/lody/virtual/server/am/ProcessRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-boolean v2, v0, Lcom/lody/virtual/server/am/ProcessRecord;->isExt:Z

    .line 17
    .line 18
    iget v3, v0, Lcom/lody/virtual/server/am/ProcessRecord;->vpid:I

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p3

    .line 22
    move v4, p1

    .line 23
    move-object v5, p2

    .line 24
    move-object v6, p4

    .line 25
    invoke-direct/range {v0 .. v6}, Lcom/lody/virtual/server/am/ActivityStack;->getStartShadowActivityIntentInner(Landroid/content/Intent;ZIILcom/lody/virtual/server/am/ActivityRecord;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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


# virtual methods
.method public finishActivityAffinity(ILandroid/os/IBinder;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 p2, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return p2

    .line 13
    :cond_0
    iget-object v1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 20
    .line 21
    iget-object v2, v2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 22
    .line 23
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    :try_start_1
    iget-object v3, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 25
    .line 26
    iget-object v3, v3, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v3, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :goto_0
    if-ltz v3, :cond_2

    .line 33
    .line 34
    iget-object v4, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 35
    .line 36
    iget-object v4, v4, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 43
    .line 44
    iget-object v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 45
    .line 46
    invoke-static {v5}, Lcom/lody/virtual/helper/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v5, 0x1

    .line 58
    iput-boolean v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 59
    .line 60
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    :goto_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->finishMarkedActivity()V

    .line 66
    .line 67
    .line 68
    return p2

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    :try_start_4
    throw p1

    .line 72
    :catchall_1
    move-exception p1

    .line 73
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 74
    throw p1
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

.method public finishAllActivities(Lcom/lody/virtual/server/am/ProcessRecord;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 11
    .line 12
    if-lez v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 21
    .line 22
    iget-object v3, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 23
    .line 24
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    iget-object v1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 42
    .line 43
    iget-object v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 44
    .line 45
    iget v5, v5, Lcom/lody/virtual/server/am/ProcessRecord;->pid:I

    .line 46
    .line 47
    iget v6, p1, Lcom/lody/virtual/server/am/ProcessRecord;->pid:I

    .line 48
    .line 49
    if-eq v5, v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/4 v5, 0x1

    .line 53
    iput-boolean v5, v4, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    monitor-exit v3

    .line 57
    move v1, v2

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    throw p1

    .line 62
    :cond_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->finishMarkedActivity()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    throw p1
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

.method getActivityClassForToken(ILandroid/os/IBinder;)Landroid/content/ComponentName;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :cond_0
    monitor-exit v0

    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
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

.method getCallingActivity(ILandroid/os/IBinder;)Landroid/content/ComponentName;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->getCallingRecordLocked(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    return-object p1
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

.method getCallingPackage(ILandroid/os/IBinder;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->getCallingRecordLocked(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 8
    .line 9
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return-object p1
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

.method getPackageForToken(ILandroid/os/IBinder;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 11
    .line 12
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
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

.method getTaskInfo(I)Lcom/lody/virtual/remote/AppTaskInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/lody/virtual/server/am/TaskRecord;->getAppTaskInfo()Lcom/lody/virtual/remote/AppTaskInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    monitor-exit v0

    .line 19
    return-object p1

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1

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

.method onActivityCreated(Lcom/lody/virtual/server/am/ProcessRecord;Landroid/os/IBinder;ILcom/lody/virtual/server/am/ActivityRecord;)V
    .locals 5

    .line 1
    const-string v0, "ActivityStack"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "onActivityCreated "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p4, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " taskId: "

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 34
    .line 35
    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mPendingLaunchActivities:Ljava/util/Set;

    .line 37
    .line 38
    invoke-interface {v1, p4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->optimizeTasksLocked()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 45
    .line 46
    invoke-virtual {v1, p3}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p4, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 60
    .line 61
    iget v2, p1, Lcom/lody/virtual/server/am/ProcessRecord;->userId:I

    .line 62
    .line 63
    iget-object v3, p4, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 64
    .line 65
    invoke-static {v3}, Lcom/lody/virtual/helper/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v4, p4, Lcom/lody/virtual/server/am/ActivityRecord;->intent:Landroid/content/Intent;

    .line 70
    .line 71
    invoke-direct {v1, p3, v2, v3, v4}, Lcom/lody/virtual/server/am/TaskRecord;-><init>(IILjava/lang/String;Landroid/content/Intent;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 75
    .line 76
    invoke-virtual {v2, p3, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    :goto_0
    iget-object p3, p4, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 80
    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    if-eq p3, v1, :cond_2

    .line 84
    .line 85
    iget-object p3, p3, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 86
    .line 87
    monitor-enter p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 88
    :try_start_1
    iget-object v2, p4, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 89
    .line 90
    iget-object v2, v2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v2, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    monitor-exit p3

    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    :try_start_2
    throw p1

    .line 100
    :cond_2
    :goto_1
    iput-object v1, p4, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 101
    .line 102
    iget-object p3, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 103
    .line 104
    monitor-enter p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 105
    :try_start_3
    iget-object v2, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v2, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 111
    :try_start_4
    iget-object p3, p4, Lcom/lody/virtual/server/am/ActivityRecord;->pendingClearAction:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 112
    .line 113
    sget-object v2, Lcom/lody/virtual/server/am/ClearTaskAction;->NONE:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 114
    .line 115
    if-eq p3, v2, :cond_3

    .line 116
    .line 117
    iget-object v3, p4, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {p0, v1, v3, p3, v4}, Lcom/lody/virtual/server/am/ActivityStack;->performClearTaskLocked(Lcom/lody/virtual/server/am/TaskRecord;Landroid/content/ComponentName;Lcom/lody/virtual/server/am/ClearTaskAction;Z)Z

    .line 121
    .line 122
    .line 123
    iput-object v2, p4, Lcom/lody/virtual/server/am/ActivityRecord;->pendingClearAction:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 124
    .line 125
    :cond_3
    invoke-virtual {p4, v1, p1, p2}, Lcom/lody/virtual/server/am/ActivityRecord;->init(Lcom/lody/virtual/server/am/TaskRecord;Lcom/lody/virtual/server/am/ProcessRecord;Landroid/os/IBinder;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    iget-object p1, p4, Lcom/lody/virtual/server/am/ActivityRecord;->pendingNewIntent:Lcom/lody/virtual/server/am/PendingNewIntent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 134
    .line 135
    if-eqz p1, :cond_4

    .line 136
    .line 137
    :try_start_5
    iget-object p2, p4, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 138
    .line 139
    iget-object p2, p2, Lcom/lody/virtual/server/am/ProcessRecord;->client:Lcom/lody/virtual/client/IVClient;

    .line 140
    .line 141
    iget-object p3, p1, Lcom/lody/virtual/server/am/PendingNewIntent;->creator:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p4, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 144
    .line 145
    iget-object p1, p1, Lcom/lody/virtual/server/am/PendingNewIntent;->intent:Landroid/content/Intent;

    .line 146
    .line 147
    invoke-interface {p2, p3, v1, p1}, Lcom/lody/virtual/client/IVClient;->scheduleNewIntent(Ljava/lang/String;Landroid/os/IBinder;Landroid/content/Intent;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catch_0
    move-exception p1

    .line 152
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 153
    .line 154
    .line 155
    :goto_2
    const/4 p1, 0x0

    .line 156
    iput-object p1, p4, Lcom/lody/virtual/server/am/ActivityRecord;->pendingNewIntent:Lcom/lody/virtual/server/am/PendingNewIntent;

    .line 157
    .line 158
    :cond_4
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->finishMarkedActivity()V

    .line 159
    .line 160
    .line 161
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 162
    return-void

    .line 163
    :catchall_1
    move-exception p1

    .line 164
    :try_start_7
    monitor-exit p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 165
    :try_start_8
    throw p1

    .line 166
    :catchall_2
    move-exception p1

    .line 167
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 168
    throw p1
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

.method onActivityDestroyed(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->optimizeTasksLocked()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string p2, "ActivityStack"

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "onActivityDestroyed "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " taskId: "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 36
    .line 37
    iget v2, v2, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {p2, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p2, 0x1

    .line 50
    iput-boolean p2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 51
    .line 52
    iget-object p2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 53
    .line 54
    iget-object p2, p2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 55
    .line 56
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    :try_start_1
    iget-object v1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    monitor-exit p2

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    :try_start_2
    throw p1

    .line 69
    :cond_0
    :goto_0
    monitor-exit v0

    .line 70
    return-object p1

    .line 71
    :catchall_1
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

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

.method onActivityFinish(ILandroid/os/IBinder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iput-boolean p2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 12
    .line 13
    :cond_0
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

.method onActivityResumed(ILandroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->optimizeTasksLocked()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p2, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 14
    .line 15
    iget-object p2, p2, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 16
    .line 17
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    :try_start_1
    iget-object v1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    monitor-exit p2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :try_start_2
    throw p1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :catchall_1
    move-exception p1

    .line 40
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    throw p1
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

.method performClearTaskLocked(Lcom/lody/virtual/server/am/TaskRecord;Landroid/content/ComponentName;Lcom/lody/virtual/server/am/ClearTaskAction;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/lody/virtual/server/am/ActivityStack$1;->$SwitchMap$com$lody$virtual$server$am$ClearTaskAction:[I

    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    aget p3, v1, p3

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eq p3, v1, :cond_6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq p3, v3, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq p3, v3, :cond_0

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    iget-object p3, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    sub-int/2addr p3, v1

    .line 30
    :goto_0
    if-ltz p3, :cond_2

    .line 31
    .line 32
    iget-object v3, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 39
    .line 40
    iget-object v3, v3, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 41
    .line 42
    invoke-virtual {v3, p2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    add-int/lit8 p3, p3, -0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 p3, -0x1

    .line 53
    :goto_1
    if-ltz p3, :cond_5

    .line 54
    .line 55
    if-eqz p4, :cond_3

    .line 56
    .line 57
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 58
    .line 59
    :cond_3
    iget-object p2, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-ge p3, p2, :cond_7

    .line 66
    .line 67
    iget-object p2, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 74
    .line 75
    iput-boolean v1, p2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByComponentName(Lcom/lody/virtual/server/am/TaskRecord;Landroid/content/ComponentName;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    iput-boolean v1, p1, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    :goto_3
    move v1, v2

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    iget-object p1, p1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 106
    .line 107
    iput-boolean v1, p2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 108
    .line 109
    move v2, v1

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    :goto_5
    monitor-exit v0

    .line 112
    return v1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    throw p1
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

.method processDied(Lcom/lody/virtual/server/am/ProcessRecord;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/server/am/ActivityStack;->optimizeTasksLocked()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 14
    .line 15
    if-lez v1, :cond_3

    .line 16
    .line 17
    iget-object v1, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/lody/virtual/server/am/TaskRecord;

    .line 24
    .line 25
    iget-object v3, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 26
    .line 27
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    iget-object v4, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 45
    .line 46
    iget-boolean v6, v5, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    .line 47
    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    iget-object v5, v5, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    iget v5, v5, Lcom/lody/virtual/server/am/ProcessRecord;->pid:I

    .line 55
    .line 56
    iget v6, p1, Lcom/lody/virtual/server/am/ProcessRecord;->pid:I

    .line 57
    .line 58
    if-eq v5, v6, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 62
    .line 63
    .line 64
    iget-object v5, v1, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    iget-object v5, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 73
    .line 74
    iget v6, v1, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Lcom/lody/virtual/helper/collection/SparseArray;->remove(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    monitor-exit v3

    .line 81
    move v1, v2

    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :try_start_2
    throw p1

    .line 86
    :cond_3
    monitor-exit v0

    .line 87
    return-void

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    throw p1
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

.method startActivitiesLocked(I[Landroid/content/Intent;[Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;)I
    .locals 12

    .line 1
    move-object v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    array-length v3, v0

    .line 5
    if-ge v2, v3, :cond_0

    .line 6
    .line 7
    aget-object v6, v0, v2

    .line 8
    .line 9
    aget-object v7, p3, v2

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v11, 0x0

    .line 13
    move-object v4, p0

    .line 14
    move v5, p1

    .line 15
    move-object/from16 v8, p4

    .line 16
    .line 17
    move-object/from16 v9, p5

    .line 18
    .line 19
    invoke-virtual/range {v4 .. v11}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityLocked(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1
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

.method public startActivityFromHistoryLocked(Landroid/content/Intent;)I
    .locals 10

    .line 1
    const-string v0, "ActivityStack"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "startActivityFromHistory: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    new-instance v1, Lcom/lody/virtual/remote/ShadowActivityInfo;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lcom/lody/virtual/remote/ShadowActivityInfo;-><init>(Landroid/content/Intent;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, Lcom/lody/virtual/remote/ShadowActivityInfo;->virtualToken:Landroid/os/IBinder;

    .line 32
    .line 33
    check-cast v1, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget-object v2, p0, Lcom/lody/virtual/server/am/ActivityStack;->mPendingLaunchActivities:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    iget-object v2, v1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v3, v1}, Lcom/lody/virtual/client/core/VirtualCore;->isRunInExtProcess(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move v1, v2

    .line 71
    :goto_0
    const/4 v3, 0x0

    .line 72
    invoke-direct {p0, p1, v3, v1}, Lcom/lody/virtual/server/am/ActivityStack;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;Z)V

    .line 73
    .line 74
    .line 75
    monitor-exit v0

    .line 76
    return v2

    .line 77
    :cond_2
    iget v2, v1, Lcom/lody/virtual/server/am/ActivityRecord;->userId:I

    .line 78
    .line 79
    iget-object v3, v1, Lcom/lody/virtual/server/am/ActivityRecord;->resultTo:Landroid/os/IBinder;

    .line 80
    .line 81
    invoke-direct {p0, v2, v3}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    iget-object v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 88
    .line 89
    iget-object v4, v1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 90
    .line 91
    if-eq v3, v4, :cond_4

    .line 92
    .line 93
    :cond_3
    iget-object v2, v1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_4
    iget-object v4, v2, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 100
    .line 101
    iget-object v5, v2, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 102
    .line 103
    iget-object v7, v1, Lcom/lody/virtual/server/am/ActivityRecord;->resultWho:Ljava/lang/String;

    .line 104
    .line 105
    iget v8, v1, Lcom/lody/virtual/server/am/ActivityRecord;->requestCode:I

    .line 106
    .line 107
    iget-object v9, v1, Lcom/lody/virtual/server/am/ActivityRecord;->options:Landroid/os/Bundle;

    .line 108
    .line 109
    move-object v3, p0

    .line 110
    move-object v6, p1

    .line 111
    invoke-direct/range {v3 .. v9}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityFromSourceTask(Lcom/lody/virtual/server/am/ProcessRecord;Landroid/os/IBinder;Landroid/content/Intent;Ljava/lang/String;ILandroid/os/Bundle;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    monitor-exit v0

    .line 116
    return p1

    .line 117
    :cond_5
    :goto_1
    const-string p1, "ActivityStack"

    .line 118
    .line 119
    const-string v1, "record not in pending list."

    .line 120
    .line 121
    invoke-static {p1, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    monitor-exit v0

    .line 125
    const/4 p1, -0x1

    .line 126
    return p1

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw p1
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

.method startActivityLocked(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;Landroid/os/Bundle;Ljava/lang/String;I)I
    .locals 23

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move-object/from16 v5, p3

    .line 8
    .line 9
    move-object/from16 v0, p4

    .line 10
    .line 11
    move/from16 v6, p7

    .line 12
    .line 13
    iget-object v1, v8, Lcom/lody/virtual/server/am/ActivityStack;->mHistory:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/am/ActivityStack;->optimizeTasksLocked()V

    .line 17
    .line 18
    .line 19
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-direct {v8, v3, v0}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-string v2, "ActivityStack"

    .line 29
    .line 30
    new-instance v7, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v9, "Not found source record: "

    .line 36
    .line 37
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v2, v7}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    const-string v2, "ActivityStack"

    .line 51
    .line 52
    new-instance v7, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v9, "startActivity:\n"

    .line 58
    .line 59
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    const-string v9, "null"

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object v9, v1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 68
    .line 69
    invoke-static {v9}, Lcom/lody/virtual/server/am/ActivityStack;->componentInfoToString(Landroid/content/pm/ComponentInfo;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    :goto_0
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v9, "  -->  "

    .line 77
    .line 78
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static/range {p3 .. p3}, Lcom/lody/virtual/server/am/ActivityStack;->componentInfoToString(Landroid/content/pm/ComponentInfo;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v9, "\n"

    .line 89
    .line 90
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static/range {p3 .. p3}, Lcom/lody/virtual/server/am/ActivityStack;->activityInfoToString(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v9, "\nintent flags: "

    .line 101
    .line 102
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-static/range {p2 .. p2}, Lcom/lody/virtual/server/am/ActivityStack;->parseIntentFlagsToString(Landroid/content/Intent;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v9, "\n"

    .line 113
    .line 114
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v9, "\nrequestCode: "

    .line 121
    .line 122
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-static {v2, v7}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    iget-object v7, v1, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    const/4 v0, 0x0

    .line 141
    const/4 v7, 0x0

    .line 142
    :goto_1
    invoke-static/range {p3 .. p3}, Lcom/lody/virtual/helper/utils/ComponentUtils;->getTaskAffinity(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    const/high16 v10, 0x10000000

    .line 147
    .line 148
    invoke-static {v4, v10}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    const/high16 v11, 0x4000000

    .line 153
    .line 154
    invoke-static {v4, v11}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-eqz v10, :cond_3

    .line 159
    .line 160
    const v14, 0x8000

    .line 161
    .line 162
    .line 163
    invoke-static {v4, v14}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_3

    .line 168
    .line 169
    const/4 v14, 0x1

    .line 170
    goto :goto_2

    .line 171
    :cond_3
    const/4 v14, 0x0

    .line 172
    :goto_2
    if-eqz v10, :cond_4

    .line 173
    .line 174
    const/high16 v15, 0x8000000

    .line 175
    .line 176
    invoke-static {v4, v15}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-eqz v15, :cond_4

    .line 181
    .line 182
    const/4 v15, 0x1

    .line 183
    goto :goto_3

    .line 184
    :cond_4
    const/4 v15, 0x0

    .line 185
    :goto_3
    const/high16 v2, 0x20000000

    .line 186
    .line 187
    invoke-static {v4, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    const/high16 v12, 0x20000

    .line 192
    .line 193
    invoke-static {v4, v12}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-eqz v12, :cond_5

    .line 198
    .line 199
    if-nez v11, :cond_5

    .line 200
    .line 201
    const/4 v12, 0x1

    .line 202
    goto :goto_4

    .line 203
    :cond_5
    const/4 v12, 0x0

    .line 204
    :goto_4
    const/high16 v13, 0x2000000

    .line 205
    .line 206
    invoke-static {v4, v13}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 207
    .line 208
    .line 209
    move-result v17

    .line 210
    iget v13, v5, Landroid/content/pm/ActivityInfo;->launchMode:I

    .line 211
    .line 212
    move-object/from16 v19, v0

    .line 213
    .line 214
    iget v0, v5, Landroid/content/pm/ActivityInfo;->documentLaunchMode:I

    .line 215
    .line 216
    move/from16 v20, v2

    .line 217
    .line 218
    iget v2, v5, Landroid/content/pm/ActivityInfo;->flags:I

    .line 219
    .line 220
    and-int/lit8 v2, v2, 0x20

    .line 221
    .line 222
    move/from16 v21, v15

    .line 223
    .line 224
    const/high16 v15, 0x800000

    .line 225
    .line 226
    if-nez v2, :cond_7

    .line 227
    .line 228
    invoke-static {v4, v15}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_6

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_6
    const/4 v15, 0x0

    .line 236
    :cond_7
    :goto_5
    const/high16 v2, 0x10000

    .line 237
    .line 238
    invoke-static {v4, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 239
    .line 240
    .line 241
    move-result v22

    .line 242
    if-eqz v22, :cond_8

    .line 243
    .line 244
    or-int/2addr v15, v2

    .line 245
    :cond_8
    const/16 v2, 0x2000

    .line 246
    .line 247
    invoke-static {v4, v2}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(Landroid/content/Intent;I)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_9

    .line 252
    .line 253
    or-int/lit16 v15, v15, 0x2000

    .line 254
    .line 255
    :cond_9
    const/4 v2, 0x2

    .line 256
    move-object/from16 v22, v7

    .line 257
    .line 258
    const/4 v7, 0x1

    .line 259
    if-eq v13, v7, :cond_a

    .line 260
    .line 261
    if-eq v13, v2, :cond_a

    .line 262
    .line 263
    const/4 v7, 0x3

    .line 264
    if-ne v13, v7, :cond_b

    .line 265
    .line 266
    :cond_a
    const/16 v20, 0x1

    .line 267
    .line 268
    :cond_b
    if-eqz v17, :cond_e

    .line 269
    .line 270
    if-eqz v1, :cond_d

    .line 271
    .line 272
    iget-object v7, v1, Lcom/lody/virtual/server/am/ActivityRecord;->resultTo:Landroid/os/IBinder;

    .line 273
    .line 274
    if-eqz v7, :cond_d

    .line 275
    .line 276
    invoke-direct {v8, v3, v7}, Lcom/lody/virtual/server/am/ActivityStack;->findActivityByToken(ILandroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    if-eqz v7, :cond_c

    .line 281
    .line 282
    const/high16 v17, 0x2000000

    .line 283
    .line 284
    or-int v15, v15, v17

    .line 285
    .line 286
    iget-object v7, v7, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 287
    .line 288
    move-object/from16 v19, v7

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_c
    const-string v7, "ActivityStack"

    .line 292
    .line 293
    new-instance v2, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    move/from16 v18, v15

    .line 299
    .line 300
    const-string v15, "forwardResult failed: "

    .line 301
    .line 302
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-static {v7, v2}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_d
    move/from16 v18, v15

    .line 317
    .line 318
    const-string v2, "ActivityStack"

    .line 319
    .line 320
    new-instance v7, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const-string v15, "forwardResult failed: "

    .line 326
    .line 327
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-static {v2, v7}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_e
    move/from16 v18, v15

    .line 342
    .line 343
    :goto_6
    move/from16 v15, v18

    .line 344
    .line 345
    :goto_7
    move-object/from16 v2, v19

    .line 346
    .line 347
    iget-object v7, v5, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 348
    .line 349
    if-eqz v7, :cond_f

    .line 350
    .line 351
    new-instance v7, Landroid/content/ComponentName;

    .line 352
    .line 353
    move/from16 v18, v15

    .line 354
    .line 355
    iget-object v15, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 356
    .line 357
    iget-object v4, v5, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    .line 358
    .line 359
    invoke-direct {v7, v15, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_f
    move/from16 v18, v15

    .line 364
    .line 365
    new-instance v7, Landroid/content/ComponentName;

    .line 366
    .line 367
    iget-object v4, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 368
    .line 369
    iget-object v15, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 370
    .line 371
    invoke-direct {v7, v4, v15}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :goto_8
    const/4 v4, 0x2

    .line 375
    if-ne v0, v4, :cond_10

    .line 376
    .line 377
    const/4 v0, 0x0

    .line 378
    const/4 v15, 0x1

    .line 379
    goto :goto_9

    .line 380
    :cond_10
    const/4 v4, 0x1

    .line 381
    if-eq v0, v4, :cond_11

    .line 382
    .line 383
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getFlags()I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    const/high16 v4, 0x80000

    .line 388
    .line 389
    invoke-static {v0, v4}, Lcom/lody/virtual/server/am/ActivityStack;->containFlags(II)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_12

    .line 394
    .line 395
    :cond_11
    if-eqz v10, :cond_12

    .line 396
    .line 397
    move/from16 v15, v21

    .line 398
    .line 399
    const/4 v0, 0x1

    .line 400
    goto :goto_9

    .line 401
    :cond_12
    move/from16 v15, v21

    .line 402
    .line 403
    const/4 v0, 0x0

    .line 404
    :goto_9
    if-nez v15, :cond_18

    .line 405
    .line 406
    if-eqz v0, :cond_13

    .line 407
    .line 408
    invoke-direct/range {p0 .. p2}, Lcom/lody/virtual/server/am/ActivityStack;->findTaskByIntentLocked(ILandroid/content/Intent;)Lcom/lody/virtual/server/am/TaskRecord;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    :goto_a
    move-object v4, v0

    .line 413
    goto :goto_c

    .line 414
    :cond_13
    if-nez v10, :cond_15

    .line 415
    .line 416
    if-eqz v1, :cond_15

    .line 417
    .line 418
    if-gez v6, :cond_14

    .line 419
    .line 420
    iget-object v0, v1, Lcom/lody/virtual/server/am/ActivityRecord;->info:Landroid/content/pm/ActivityInfo;

    .line 421
    .line 422
    iget v0, v0, Landroid/content/pm/ActivityInfo;->launchMode:I

    .line 423
    .line 424
    const/4 v4, 0x3

    .line 425
    if-eq v0, v4, :cond_15

    .line 426
    .line 427
    if-eqz v13, :cond_14

    .line 428
    .line 429
    const/4 v4, 0x1

    .line 430
    if-ne v13, v4, :cond_15

    .line 431
    .line 432
    :cond_14
    move-object/from16 v16, v22

    .line 433
    .line 434
    goto :goto_b

    .line 435
    :cond_15
    const/16 v16, 0x0

    .line 436
    .line 437
    :goto_b
    if-nez v16, :cond_17

    .line 438
    .line 439
    const/4 v4, 0x3

    .line 440
    if-ne v13, v4, :cond_16

    .line 441
    .line 442
    invoke-direct {v8, v3, v7}, Lcom/lody/virtual/server/am/ActivityStack;->findTaskByComponentLocked(ILandroid/content/ComponentName;)Lcom/lody/virtual/server/am/TaskRecord;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    goto :goto_a

    .line 447
    :cond_16
    invoke-direct {v8, v3, v9}, Lcom/lody/virtual/server/am/ActivityStack;->findTaskByAffinityLocked(ILjava/lang/String;)Lcom/lody/virtual/server/am/TaskRecord;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    goto :goto_a

    .line 452
    :cond_17
    move-object/from16 v4, v16

    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_18
    const/4 v4, 0x0

    .line 456
    :goto_c
    if-eqz v4, :cond_29

    .line 457
    .line 458
    invoke-virtual {v4}, Lcom/lody/virtual/server/am/TaskRecord;->isFinishing()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_19

    .line 463
    .line 464
    goto/16 :goto_14

    .line 465
    .line 466
    :cond_19
    :try_start_1
    iget-object v0, v8, Lcom/lody/virtual/server/am/ActivityStack;->mAM:Landroid/app/ActivityManager;

    .line 467
    .line 468
    iget v9, v4, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 469
    .line 470
    const/4 v10, 0x0

    .line 471
    invoke-virtual {v0, v9, v10}, Landroid/app/ActivityManager;->moveTaskToFront(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 472
    .line 473
    .line 474
    goto :goto_d

    .line 475
    :catch_0
    move-exception v0

    .line 476
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 477
    .line 478
    .line 479
    :goto_d
    if-nez v13, :cond_1a

    .line 480
    .line 481
    if-nez v20, :cond_1a

    .line 482
    .line 483
    if-nez v14, :cond_1a

    .line 484
    .line 485
    if-nez v11, :cond_1a

    .line 486
    .line 487
    if-nez v12, :cond_1a

    .line 488
    .line 489
    if-gtz v6, :cond_1a

    .line 490
    .line 491
    if-nez v2, :cond_1a

    .line 492
    .line 493
    iget-object v0, v4, Lcom/lody/virtual/server/am/TaskRecord;->taskRoot:Landroid/content/Intent;

    .line 494
    .line 495
    move-object/from16 v9, p2

    .line 496
    .line 497
    invoke-static {v0, v9}, Lcom/lody/virtual/helper/utils/ComponentUtils;->intentFilterEquals(Landroid/content/Intent;Landroid/content/Intent;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    goto :goto_e

    .line 502
    :cond_1a
    move-object/from16 v9, p2

    .line 503
    .line 504
    const/4 v0, 0x0

    .line 505
    :goto_e
    if-eqz v0, :cond_1b

    .line 506
    .line 507
    const/4 v10, 0x0

    .line 508
    return v10

    .line 509
    :cond_1b
    sget-object v0, Lcom/lody/virtual/server/am/ClearTaskAction;->NONE:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 510
    .line 511
    const/4 v10, 0x2

    .line 512
    if-eq v13, v10, :cond_1d

    .line 513
    .line 514
    const/4 v10, 0x3

    .line 515
    if-eq v13, v10, :cond_1d

    .line 516
    .line 517
    if-eqz v11, :cond_1c

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_1c
    move-object v10, v0

    .line 521
    goto :goto_10

    .line 522
    :cond_1d
    :goto_f
    sget-object v10, Lcom/lody/virtual/server/am/ClearTaskAction;->TOP:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 523
    .line 524
    :goto_10
    if-eqz v12, :cond_1e

    .line 525
    .line 526
    sget-object v10, Lcom/lody/virtual/server/am/ClearTaskAction;->ACTIVITY:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 527
    .line 528
    :cond_1e
    if-eqz v14, :cond_1f

    .line 529
    .line 530
    sget-object v10, Lcom/lody/virtual/server/am/ClearTaskAction;->TASK:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 531
    .line 532
    :cond_1f
    if-eqz v20, :cond_22

    .line 533
    .line 534
    sget-object v11, Lcom/lody/virtual/server/am/ClearTaskAction;->TOP:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 535
    .line 536
    if-ne v10, v11, :cond_20

    .line 537
    .line 538
    const/4 v12, 0x1

    .line 539
    invoke-virtual {v8, v4, v7, v11, v12}, Lcom/lody/virtual/server/am/ActivityStack;->performClearTaskLocked(Lcom/lody/virtual/server/am/TaskRecord;Landroid/content/ComponentName;Lcom/lody/virtual/server/am/ClearTaskAction;Z)Z

    .line 540
    .line 541
    .line 542
    move-result v10

    .line 543
    goto :goto_11

    .line 544
    :cond_20
    if-ne v10, v0, :cond_21

    .line 545
    .line 546
    const/4 v10, 0x1

    .line 547
    goto :goto_11

    .line 548
    :cond_21
    const/4 v10, 0x0

    .line 549
    :goto_11
    if-eqz v10, :cond_23

    .line 550
    .line 551
    invoke-virtual {v4}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    if-eqz v11, :cond_23

    .line 556
    .line 557
    iget-object v12, v11, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 558
    .line 559
    invoke-virtual {v12, v7}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    if-eqz v7, :cond_23

    .line 564
    .line 565
    invoke-direct {v8, v1, v11, v9}, Lcom/lody/virtual/server/am/ActivityStack;->deliverNewIntentLocked(Lcom/lody/virtual/server/am/ActivityRecord;Lcom/lody/virtual/server/am/ActivityRecord;Landroid/content/Intent;)V

    .line 566
    .line 567
    .line 568
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/am/ActivityStack;->finishMarkedActivity()V

    .line 569
    .line 570
    .line 571
    const/4 v1, 0x0

    .line 572
    return v1

    .line 573
    :cond_22
    move-object v0, v10

    .line 574
    const/4 v10, 0x0

    .line 575
    :cond_23
    if-eqz v10, :cond_24

    .line 576
    .line 577
    invoke-direct/range {p0 .. p0}, Lcom/lody/virtual/server/am/ActivityStack;->finishMarkedActivity()V

    .line 578
    .line 579
    .line 580
    :cond_24
    invoke-direct {v8, v3, v9, v5, v2}, Lcom/lody/virtual/server/am/ActivityStack;->newActivityRecord(ILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/IBinder;)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    iput v6, v2, Lcom/lody/virtual/server/am/ActivityRecord;->requestCode:I

    .line 585
    .line 586
    move-object/from16 v7, p6

    .line 587
    .line 588
    iput-object v7, v2, Lcom/lody/virtual/server/am/ActivityRecord;->resultWho:Ljava/lang/String;

    .line 589
    .line 590
    move-object/from16 v10, p5

    .line 591
    .line 592
    iput-object v10, v2, Lcom/lody/virtual/server/am/ActivityRecord;->options:Landroid/os/Bundle;

    .line 593
    .line 594
    iput-object v0, v2, Lcom/lody/virtual/server/am/ActivityRecord;->pendingClearAction:Lcom/lody/virtual/server/am/ClearTaskAction;

    .line 595
    .line 596
    iput-object v4, v2, Lcom/lody/virtual/server/am/ActivityRecord;->task:Lcom/lody/virtual/server/am/TaskRecord;

    .line 597
    .line 598
    invoke-direct {v8, v3, v2, v9, v5}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityProcess(ILcom/lody/virtual/server/am/ActivityRecord;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    const/4 v3, -0x1

    .line 603
    if-nez v0, :cond_25

    .line 604
    .line 605
    return v3

    .line 606
    :cond_25
    iget-object v5, v4, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 607
    .line 608
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    iget-object v5, v8, Lcom/lody/virtual/server/am/ActivityStack;->mPendingLaunchActivities:Ljava/util/Set;

    .line 612
    .line 613
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move/from16 v15, v18

    .line 617
    .line 618
    invoke-virtual {v0, v15}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 619
    .line 620
    .line 621
    move-object/from16 v5, v22

    .line 622
    .line 623
    if-ne v5, v4, :cond_26

    .line 624
    .line 625
    goto :goto_12

    .line 626
    :cond_26
    const/4 v1, 0x0

    .line 627
    invoke-virtual {v4, v1}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord(Z)Lcom/lody/virtual/server/am/ActivityRecord;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    :goto_12
    if-eqz v1, :cond_28

    .line 632
    .line 633
    iget-object v4, v1, Lcom/lody/virtual/server/am/ActivityRecord;->process:Lcom/lody/virtual/server/am/ProcessRecord;

    .line 634
    .line 635
    if-nez v4, :cond_27

    .line 636
    .line 637
    goto :goto_13

    .line 638
    :cond_27
    const/4 v5, 0x1

    .line 639
    iput-boolean v5, v2, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    .line 640
    .line 641
    iget-object v3, v1, Lcom/lody/virtual/server/am/ActivityRecord;->token:Landroid/os/IBinder;

    .line 642
    .line 643
    move-object/from16 v1, p0

    .line 644
    .line 645
    move-object v2, v4

    .line 646
    move-object v4, v0

    .line 647
    move-object/from16 v5, p6

    .line 648
    .line 649
    move/from16 v6, p7

    .line 650
    .line 651
    move-object/from16 v7, p5

    .line 652
    .line 653
    invoke-direct/range {v1 .. v7}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityFromSourceTask(Lcom/lody/virtual/server/am/ProcessRecord;Landroid/os/IBinder;Landroid/content/Intent;Ljava/lang/String;ILandroid/os/Bundle;)I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    return v0

    .line 658
    :cond_28
    :goto_13
    const-string v0, "ActivityStack"

    .line 659
    .line 660
    new-instance v1, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 663
    .line 664
    .line 665
    const-string v2, "getCallerRecord failed: "

    .line 666
    .line 667
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    return v3

    .line 681
    :cond_29
    :goto_14
    move-object/from16 v9, p2

    .line 682
    .line 683
    move-object/from16 v10, p5

    .line 684
    .line 685
    move/from16 v15, v18

    .line 686
    .line 687
    const-string v0, "ActivityStack"

    .line 688
    .line 689
    new-instance v1, Ljava/lang/StringBuilder;

    .line 690
    .line 691
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 692
    .line 693
    .line 694
    const-string v2, "startActivityInNewTask: "

    .line 695
    .line 696
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    move-object/from16 v1, p0

    .line 710
    .line 711
    move v2, v15

    .line 712
    move/from16 v3, p1

    .line 713
    .line 714
    move-object/from16 v4, p2

    .line 715
    .line 716
    move-object/from16 v5, p3

    .line 717
    .line 718
    move-object/from16 v6, p5

    .line 719
    .line 720
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/server/am/ActivityStack;->startActivityInNewTaskLocked(IILandroid/content/Intent;Landroid/content/pm/ActivityInfo;Landroid/os/Bundle;)I

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    return v0

    .line 725
    :catchall_0
    move-exception v0

    .line 726
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 727
    throw v0
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
.end method
