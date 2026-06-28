.class Lcom/yuanqi/master/database/AppDataBase_Impl$a;
.super Landroidx/room/RoomOpenHelper$Delegate;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/database/AppDataBase_Impl;->createOpenHelper(Landroidx/room/DatabaseConfiguration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/master/database/AppDataBase_Impl;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/database/AppDataBase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    invoke-direct {p0, p2}, Landroidx/room/RoomOpenHelper$Delegate;-><init>(I)V

    return-void
.end method


# virtual methods
.method public createAllTables(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 3
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const-string v1, "CREATE TABLE IF NOT EXISTS `AppNote` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `note_name` TEXT NOT NULL, `app_pwd` TEXT NOT NULL)"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-string v1, "CREATE TABLE IF NOT EXISTS `AdModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL)"

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, p1

    .line 26
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    .line 28
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_1
    const-string v1, "CREATE TABLE IF NOT EXISTS `history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `app_name` TEXT NOT NULL, `package_name` TEXT NOT NULL, `address` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `timestamp` INTEGER)"

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object v2, p1

    .line 40
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    const-string v1, "CREATE UNIQUE INDEX IF NOT EXISTS `index_history_id` ON `history` (`id`)"

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-object v2, p1

    .line 54
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 55
    .line 56
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_3
    const-string v1, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move-object v2, p1

    .line 68
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 69
    .line 70
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_4
    const-string v1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'ff4fef14337f4c003e19ed2c97aeadd7\')"

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_5
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 82
    .line 83
    invoke-static {p1, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_5
    return-void
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
.end method

.method public dropAllTables(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 3
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    const-string v1, "DROP TABLE IF EXISTS `AppNote`"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-string v1, "DROP TABLE IF EXISTS `AdModel`"

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, p1

    .line 26
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    .line 28
    invoke-static {v2, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_1
    const-string v1, "DROP TABLE IF EXISTS `history`"

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object v0, p1

    .line 40
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    invoke-static {v0, v1}, Lcom/huawei/agconnect/apms/instrument/SQLiteInstrumentation;->execSQL(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    iget-object v0, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/yuanqi/master/database/AppDataBase_Impl;->d(Lcom/yuanqi/master/database/AppDataBase_Impl;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Landroidx/room/RoomDatabase$Callback;

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Landroidx/room/RoomDatabase$Callback;->onDestructiveMigration(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    return-void
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

.method public onCreate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 2
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/master/database/AppDataBase_Impl;->e(Lcom/yuanqi/master/database/AppDataBase_Impl;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/room/RoomDatabase$Callback;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroidx/room/RoomDatabase$Callback;->onCreate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
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

.method public onOpen(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 2
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/yuanqi/master/database/AppDataBase_Impl;->f(Lcom/yuanqi/master/database/AppDataBase_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/sqlite/db/SupportSQLiteDatabase;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/yuanqi/master/database/AppDataBase_Impl;->g(Lcom/yuanqi/master/database/AppDataBase_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/yuanqi/master/database/AppDataBase_Impl$a;->a:Lcom/yuanqi/master/database/AppDataBase_Impl;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/yuanqi/master/database/AppDataBase_Impl;->h(Lcom/yuanqi/master/database/AppDataBase_Impl;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroidx/room/RoomDatabase$Callback;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Landroidx/room/RoomDatabase$Callback;->onOpen(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
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

.method public onPostMigrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onPreMigrate(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Landroidx/room/util/DBUtil;->dropFtsSyncTriggers(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method public onValidateSchema(Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/room/RoomOpenHelper$ValidationResult;
    .locals 22
    .param p1    # Landroidx/sqlite/db/SupportSQLiteDatabase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 10
    .line 11
    const-string v4, "id"

    .line 12
    .line 13
    const-string v5, "INTEGER"

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x1

    .line 19
    move-object v3, v2

    .line 20
    invoke-direct/range {v3 .. v9}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    const-string v3, "id"

    .line 24
    .line 25
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 29
    .line 30
    const-string v5, "package_name"

    .line 31
    .line 32
    const-string v6, "TEXT"

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x1

    .line 37
    move-object v4, v2

    .line 38
    invoke-direct/range {v4 .. v10}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    const-string v4, "package_name"

    .line 42
    .line 43
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 47
    .line 48
    const-string v6, "user_id"

    .line 49
    .line 50
    const-string v7, "INTEGER"

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x1

    .line 56
    move-object v5, v2

    .line 57
    invoke-direct/range {v5 .. v11}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    const-string v5, "user_id"

    .line 61
    .line 62
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 66
    .line 67
    const-string v7, "note_name"

    .line 68
    .line 69
    const-string v8, "TEXT"

    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x1

    .line 75
    move-object v6, v2

    .line 76
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    const-string v5, "note_name"

    .line 80
    .line 81
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 85
    .line 86
    const-string v7, "app_pwd"

    .line 87
    .line 88
    const-string v8, "TEXT"

    .line 89
    .line 90
    move-object v6, v2

    .line 91
    invoke-direct/range {v6 .. v12}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    const-string v5, "app_pwd"

    .line 95
    .line 96
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    new-instance v2, Ljava/util/HashSet;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 103
    .line 104
    .line 105
    new-instance v6, Ljava/util/HashSet;

    .line 106
    .line 107
    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 108
    .line 109
    .line 110
    new-instance v7, Landroidx/room/util/TableInfo;

    .line 111
    .line 112
    const-string v8, "AppNote"

    .line 113
    .line 114
    invoke-direct {v7, v8, v1, v2, v6}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v8}, Landroidx/room/util/TableInfo;->read(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v7, v1}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    const-string v6, "\n Found:\n"

    .line 126
    .line 127
    if-nez v2, :cond_0

    .line 128
    .line 129
    new-instance v0, Landroidx/room/RoomOpenHelper$ValidationResult;

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v3, "AppNote(com.yuanqi.master.database.model.AppNote).\n Expected:\n"

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v0, v5, v1}, Landroidx/room/RoomOpenHelper$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 159
    .line 160
    const/4 v2, 0x2

    .line 161
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 162
    .line 163
    .line 164
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 165
    .line 166
    const-string v8, "id"

    .line 167
    .line 168
    const-string v9, "INTEGER"

    .line 169
    .line 170
    const/4 v10, 0x1

    .line 171
    const/4 v11, 0x1

    .line 172
    const/4 v12, 0x0

    .line 173
    const/4 v13, 0x1

    .line 174
    move-object v7, v2

    .line 175
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 182
    .line 183
    const-string v15, "date"

    .line 184
    .line 185
    const-string v16, "TEXT"

    .line 186
    .line 187
    const/16 v17, 0x1

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const/16 v19, 0x0

    .line 192
    .line 193
    const/16 v20, 0x1

    .line 194
    .line 195
    move-object v14, v2

    .line 196
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 197
    .line 198
    .line 199
    const-string v7, "date"

    .line 200
    .line 201
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    new-instance v2, Ljava/util/HashSet;

    .line 205
    .line 206
    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 207
    .line 208
    .line 209
    new-instance v7, Ljava/util/HashSet;

    .line 210
    .line 211
    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 212
    .line 213
    .line 214
    new-instance v8, Landroidx/room/util/TableInfo;

    .line 215
    .line 216
    const-string v9, "AdModel"

    .line 217
    .line 218
    invoke-direct {v8, v9, v1, v2, v7}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v9}, Landroidx/room/util/TableInfo;->read(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v8, v1}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_1

    .line 230
    .line 231
    new-instance v0, Landroidx/room/RoomOpenHelper$ValidationResult;

    .line 232
    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v3, "AdModel(com.yuanqi.master.database.model.AdModel).\n Expected:\n"

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v0, v5, v1}, Landroidx/room/RoomOpenHelper$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 261
    .line 262
    const/4 v2, 0x7

    .line 263
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 264
    .line 265
    .line 266
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 267
    .line 268
    const-string v8, "id"

    .line 269
    .line 270
    const-string v9, "INTEGER"

    .line 271
    .line 272
    const/4 v10, 0x1

    .line 273
    const/4 v11, 0x1

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x1

    .line 276
    move-object v7, v2

    .line 277
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 284
    .line 285
    const-string v15, "app_name"

    .line 286
    .line 287
    const-string v16, "TEXT"

    .line 288
    .line 289
    const/16 v17, 0x1

    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    const/16 v19, 0x0

    .line 294
    .line 295
    const/16 v20, 0x1

    .line 296
    .line 297
    move-object v14, v2

    .line 298
    invoke-direct/range {v14 .. v20}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 299
    .line 300
    .line 301
    const-string v7, "app_name"

    .line 302
    .line 303
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 307
    .line 308
    const-string v9, "package_name"

    .line 309
    .line 310
    const-string v10, "TEXT"

    .line 311
    .line 312
    const/4 v12, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    const/4 v14, 0x1

    .line 315
    move-object v8, v2

    .line 316
    invoke-direct/range {v8 .. v14}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 323
    .line 324
    const-string v16, "address"

    .line 325
    .line 326
    const-string v17, "TEXT"

    .line 327
    .line 328
    const/16 v18, 0x1

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    const/16 v20, 0x0

    .line 333
    .line 334
    const/16 v21, 0x1

    .line 335
    .line 336
    move-object v15, v2

    .line 337
    invoke-direct/range {v15 .. v21}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 338
    .line 339
    .line 340
    const-string v4, "address"

    .line 341
    .line 342
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 346
    .line 347
    const-string v8, "latitude"

    .line 348
    .line 349
    const-string v9, "REAL"

    .line 350
    .line 351
    const/4 v10, 0x1

    .line 352
    const/4 v11, 0x0

    .line 353
    const/4 v12, 0x0

    .line 354
    const/4 v13, 0x1

    .line 355
    move-object v7, v2

    .line 356
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 357
    .line 358
    .line 359
    const-string v4, "latitude"

    .line 360
    .line 361
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 365
    .line 366
    const-string v8, "longitude"

    .line 367
    .line 368
    const-string v9, "REAL"

    .line 369
    .line 370
    move-object v7, v2

    .line 371
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 372
    .line 373
    .line 374
    const-string v4, "longitude"

    .line 375
    .line 376
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    new-instance v2, Landroidx/room/util/TableInfo$Column;

    .line 380
    .line 381
    const-string v8, "timestamp"

    .line 382
    .line 383
    const-string v9, "INTEGER"

    .line 384
    .line 385
    const/4 v10, 0x0

    .line 386
    move-object v7, v2

    .line 387
    invoke-direct/range {v7 .. v13}, Landroidx/room/util/TableInfo$Column;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 388
    .line 389
    .line 390
    const-string v4, "timestamp"

    .line 391
    .line 392
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    new-instance v2, Ljava/util/HashSet;

    .line 396
    .line 397
    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    .line 398
    .line 399
    .line 400
    new-instance v4, Ljava/util/HashSet;

    .line 401
    .line 402
    const/4 v7, 0x1

    .line 403
    invoke-direct {v4, v7}, Ljava/util/HashSet;-><init>(I)V

    .line 404
    .line 405
    .line 406
    new-instance v8, Landroidx/room/util/TableInfo$Index;

    .line 407
    .line 408
    filled-new-array {v3}, [Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const-string v9, "ASC"

    .line 417
    .line 418
    filled-new-array {v9}, [Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    const-string v10, "index_history_id"

    .line 427
    .line 428
    invoke-direct {v8, v10, v7, v3, v9}, Landroidx/room/util/TableInfo$Index;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    new-instance v3, Landroidx/room/util/TableInfo;

    .line 435
    .line 436
    const-string v8, "history"

    .line 437
    .line 438
    invoke-direct {v3, v8, v1, v2, v4}, Landroidx/room/util/TableInfo;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 439
    .line 440
    .line 441
    invoke-static {v0, v8}, Landroidx/room/util/TableInfo;->read(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v3, v0}, Landroidx/room/util/TableInfo;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_2

    .line 450
    .line 451
    new-instance v1, Landroidx/room/RoomOpenHelper$ValidationResult;

    .line 452
    .line 453
    new-instance v2, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    const-string v4, "history(com.yuanqi.master.database.model.History).\n Expected:\n"

    .line 459
    .line 460
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-direct {v1, v5, v0}, Landroidx/room/RoomOpenHelper$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    return-object v1

    .line 480
    :cond_2
    new-instance v0, Landroidx/room/RoomOpenHelper$ValidationResult;

    .line 481
    .line 482
    const/4 v1, 0x0

    .line 483
    invoke-direct {v0, v7, v1}, Landroidx/room/RoomOpenHelper$ValidationResult;-><init>(ZLjava/lang/String;)V

    .line 484
    .line 485
    .line 486
    return-object v0
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
.end method
