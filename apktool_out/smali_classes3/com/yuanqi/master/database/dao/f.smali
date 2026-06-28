.class public final Lcom/yuanqi/master/database/dao/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/master/database/dao/e;


# instance fields
.field private final a:Landroidx/room/RoomDatabase;

.field private final b:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lv2/c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/yuanqi/master/tools/c;

.field private final d:Landroidx/room/SharedSQLiteStatement;

.field private final e:Landroidx/room/SharedSQLiteStatement;


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .param p1    # Landroidx/room/RoomDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/yuanqi/master/tools/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/yuanqi/master/tools/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/master/database/dao/f;->c:Lcom/yuanqi/master/tools/c;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    .line 12
    .line 13
    new-instance v0, Lcom/yuanqi/master/database/dao/f$a;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/master/database/dao/f$a;-><init>(Lcom/yuanqi/master/database/dao/f;Landroidx/room/RoomDatabase;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/yuanqi/master/database/dao/f;->b:Landroidx/room/EntityInsertionAdapter;

    .line 19
    .line 20
    new-instance v0, Lcom/yuanqi/master/database/dao/f$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/master/database/dao/f$b;-><init>(Lcom/yuanqi/master/database/dao/f;Landroidx/room/RoomDatabase;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/yuanqi/master/database/dao/f;->d:Landroidx/room/SharedSQLiteStatement;

    .line 26
    .line 27
    new-instance v0, Lcom/yuanqi/master/database/dao/f$c;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/master/database/dao/f$c;-><init>(Lcom/yuanqi/master/database/dao/f;Landroidx/room/RoomDatabase;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/yuanqi/master/database/dao/f;->e:Landroidx/room/SharedSQLiteStatement;

    .line 33
    .line 34
    return-void
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

.method static synthetic d(Lcom/yuanqi/master/database/dao/f;)Lcom/yuanqi/master/tools/c;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/database/dao/f;->c:Lcom/yuanqi/master/tools/c;

    return-object p0
.end method

.method static synthetic e(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/RoomDatabase;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    return-object p0
.end method

.method static synthetic f(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/EntityInsertionAdapter;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/database/dao/f;->b:Landroidx/room/EntityInsertionAdapter;

    return-object p0
.end method

.method static synthetic g(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/database/dao/f;->d:Landroidx/room/SharedSQLiteStatement;

    return-object p0
.end method

.method static synthetic h(Lcom/yuanqi/master/database/dao/f;)Landroidx/room/SharedSQLiteStatement;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/database/dao/f;->e:Landroidx/room/SharedSQLiteStatement;

    return-object p0
.end method

.method public static i()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lv2/c;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "select * from history where package_name=?"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-static {v2, v3}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Landroidx/room/RoomSQLiteQuery;->bindNull(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2, v3, v0}, Landroidx/room/RoomSQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v0, v1, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :try_start_0
    const-string v0, "id"

    .line 35
    .line 36
    invoke-static {v3, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const-string v5, "app_name"

    .line 41
    .line 42
    invoke-static {v3, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const-string v6, "package_name"

    .line 47
    .line 48
    invoke-static {v3, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const-string v7, "address"

    .line 53
    .line 54
    invoke-static {v3, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    const-string v8, "latitude"

    .line 59
    .line 60
    invoke-static {v3, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    const-string v9, "longitude"

    .line 65
    .line 66
    invoke-static {v3, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const-string v10, "timestamp"

    .line 71
    .line 72
    invoke-static {v3, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    new-instance v11, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_5

    .line 90
    .line 91
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    invoke-interface {v3, v5}, Landroid/database/Cursor;->isNull(I)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-eqz v12, :cond_1

    .line 100
    .line 101
    move-object v15, v4

    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    move-object v15, v12

    .line 108
    :goto_2
    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_2

    .line 113
    .line 114
    move-object/from16 v16, v4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    move-object/from16 v16, v12

    .line 122
    .line 123
    :goto_3
    invoke-interface {v3, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-eqz v12, :cond_3

    .line 128
    .line 129
    move-object/from16 v17, v4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_3
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    move-object/from16 v17, v12

    .line 137
    .line 138
    :goto_4
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getDouble(I)D

    .line 139
    .line 140
    .line 141
    move-result-wide v18

    .line 142
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getDouble(I)D

    .line 143
    .line 144
    .line 145
    move-result-wide v20

    .line 146
    invoke-interface {v3, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_4

    .line 151
    .line 152
    move-object v12, v4

    .line 153
    goto :goto_5

    .line 154
    :cond_4
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v12

    .line 158
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    :goto_5
    iget-object v13, v1, Lcom/yuanqi/master/database/dao/f;->c:Lcom/yuanqi/master/tools/c;

    .line 163
    .line 164
    invoke-virtual {v13, v12}, Lcom/yuanqi/master/tools/c;->b(Ljava/lang/Long;)Ljava/util/Date;

    .line 165
    .line 166
    .line 167
    move-result-object v22

    .line 168
    new-instance v12, Lv2/c;

    .line 169
    .line 170
    move-object v13, v12

    .line 171
    invoke-direct/range {v13 .. v22}, Lv2/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/Date;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 182
    .line 183
    .line 184
    return-object v11

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 190
    .line 191
    .line 192
    throw v0
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

.method public b(Lv2/c;)Lio/reactivex/rxjava3/core/c;
    .locals 1

    new-instance v0, Lcom/yuanqi/master/database/dao/f$d;

    invoke-direct {v0, p0, p1}, Lcom/yuanqi/master/database/dao/f$d;-><init>(Lcom/yuanqi/master/database/dao/f;Lv2/c;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/core/c;->Y(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/rxjava3/core/c;
    .locals 1

    new-instance v0, Lcom/yuanqi/master/database/dao/f$e;

    invoke-direct {v0, p0, p1}, Lcom/yuanqi/master/database/dao/f$e;-><init>(Lcom/yuanqi/master/database/dao/f;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/core/c;->Y(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/c;

    move-result-object p1

    return-object p1
.end method

.method public deleteAll()Lio/reactivex/rxjava3/core/c;
    .locals 1

    new-instance v0, Lcom/yuanqi/master/database/dao/f$f;

    invoke-direct {v0, p0}, Lcom/yuanqi/master/database/dao/f$f;-><init>(Lcom/yuanqi/master/database/dao/f;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/core/c;->Y(Ljava/util/concurrent/Callable;)Lio/reactivex/rxjava3/core/c;

    move-result-object v0

    return-object v0
.end method

.method public getAll()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv2/c;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "select `history`.`id` AS `id`, `history`.`app_name` AS `app_name`, `history`.`package_name` AS `package_name`, `history`.`address` AS `address`, `history`.`latitude` AS `latitude`, `history`.`longitude` AS `longitude`, `history`.`timestamp` AS `timestamp` from history ORDER BY timestamp DESC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object v0, v1, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, Lcom/yuanqi/master/database/dao/f;->a:Landroidx/room/RoomDatabase;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_4

    .line 36
    .line 37
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const/4 v6, 0x1

    .line 42
    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    move-object v9, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    move-object v9, v6

    .line 55
    :goto_1
    const/4 v6, 0x2

    .line 56
    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    move-object v10, v4

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    move-object v10, v6

    .line 69
    :goto_2
    const/4 v6, 0x3

    .line 70
    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    move-object v11, v4

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    move-object v11, v6

    .line 83
    :goto_3
    const/4 v6, 0x4

    .line 84
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getDouble(I)D

    .line 85
    .line 86
    .line 87
    move-result-wide v12

    .line 88
    const/4 v6, 0x5

    .line 89
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getDouble(I)D

    .line 90
    .line 91
    .line 92
    move-result-wide v14

    .line 93
    const/4 v6, 0x6

    .line 94
    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    move-object v6, v4

    .line 101
    goto :goto_4

    .line 102
    :cond_3
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    :goto_4
    iget-object v7, v1, Lcom/yuanqi/master/database/dao/f;->c:Lcom/yuanqi/master/tools/c;

    .line 111
    .line 112
    invoke-virtual {v7, v6}, Lcom/yuanqi/master/tools/c;->b(Ljava/lang/Long;)Ljava/util/Date;

    .line 113
    .line 114
    .line 115
    move-result-object v16

    .line 116
    new-instance v6, Lv2/c;

    .line 117
    .line 118
    move-object v7, v6

    .line 119
    invoke-direct/range {v7 .. v16}, Lv2/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/Date;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 138
    .line 139
    .line 140
    throw v0
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
