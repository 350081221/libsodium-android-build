.class public final Landroidx/compose/foundation/text2/input/TextUndoManagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a.\u0010\u000c\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0000\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\t*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
        "next",
        "merge",
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "pre",
        "post",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;",
        "changes",
        "",
        "allowMerge",
        "Lkotlin/r2;",
        "recordChanges",
        "",
        "TEXT_UNDO_CAPACITY",
        "I",
        "isNewLineInsert",
        "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final TEXT_UNDO_CAPACITY:I = 0x64


# direct methods
.method private static final isNewLineInsert(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\r\n"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final merge(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
    .locals 16
    .param p0    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getCanMerge()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getCanMerge()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    cmp-long v0, v2, v4

    .line 25
    .line 26
    if-ltz v0, :cond_7

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    sub-long/2addr v2, v4

    .line 37
    invoke-static {}, Landroidx/compose/foundation/text/UndoManagerKt;->getSNAPSHOTS_INTERVAL_MILLIS()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v4, v0

    .line 42
    cmp-long v0, v2, v4

    .line 43
    .line 44
    if-ltz v0, :cond_1

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_1
    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->isNewLineInsert(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_7

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->isNewLineInsert(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTextEditType()Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTextEditType()Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eq v0, v2, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTextEditType()Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;->Insert:Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 78
    .line 79
    if-ne v0, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v0, v2

    .line 94
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-ne v0, v2, :cond_4

    .line 99
    .line 100
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 101
    .line 102
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    const-string v5, ""

    .line 107
    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreSelection-d9O1mEE()J

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostSelection-d9O1mEE()J

    .line 136
    .line 137
    .line 138
    move-result-wide v9

    .line 139
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v11

    .line 143
    const/4 v13, 0x0

    .line 144
    const/16 v14, 0x40

    .line 145
    .line 146
    const/4 v15, 0x0

    .line 147
    move-object v3, v0

    .line 148
    invoke-direct/range {v3 .. v15}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/w;)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTextEditType()Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;->Delete:Landroidx/compose/foundation/text2/input/internal/undo/TextEditType;

    .line 157
    .line 158
    if-ne v0, v2, :cond_7

    .line 159
    .line 160
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getDeletionType()Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getDeletionType()Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-ne v0, v2, :cond_7

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getDeletionType()Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;->Start:Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 175
    .line 176
    if-eq v0, v2, :cond_5

    .line 177
    .line 178
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getDeletionType()Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;->End:Landroidx/compose/foundation/text2/input/internal/undo/TextDeleteType;

    .line 183
    .line 184
    if-ne v0, v2, :cond_7

    .line 185
    .line 186
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    add-int/2addr v2, v3

    .line 203
    if-ne v0, v2, :cond_6

    .line 204
    .line 205
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 206
    .line 207
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    const-string v6, ""

    .line 235
    .line 236
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreSelection-d9O1mEE()J

    .line 237
    .line 238
    .line 239
    move-result-wide v7

    .line 240
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostSelection-d9O1mEE()J

    .line 241
    .line 242
    .line 243
    move-result-wide v9

    .line 244
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 245
    .line 246
    .line 247
    move-result-wide v11

    .line 248
    const/4 v13, 0x0

    .line 249
    const/16 v14, 0x40

    .line 250
    .line 251
    const/4 v15, 0x0

    .line 252
    move-object v3, v0

    .line 253
    invoke-direct/range {v3 .. v15}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/w;)V

    .line 254
    .line 255
    .line 256
    return-object v0

    .line 257
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-ne v0, v2, :cond_7

    .line 266
    .line 267
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 268
    .line 269
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    new-instance v1, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    const-string v6, ""

    .line 297
    .line 298
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreSelection-d9O1mEE()J

    .line 299
    .line 300
    .line 301
    move-result-wide v7

    .line 302
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostSelection-d9O1mEE()J

    .line 303
    .line 304
    .line 305
    move-result-wide v9

    .line 306
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getTimeInMillis()J

    .line 307
    .line 308
    .line 309
    move-result-wide v11

    .line 310
    const/4 v13, 0x0

    .line 311
    const/16 v14, 0x40

    .line 312
    .line 313
    const/4 v15, 0x0

    .line 314
    move-object v3, v0

    .line 315
    invoke-direct/range {v3 .. v15}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/w;)V

    .line 316
    .line 317
    .line 318
    return-object v0

    .line 319
    :cond_7
    :goto_0
    return-object v1
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
.end method

.method public static final recordChanges(Landroidx/compose/foundation/text2/input/TextUndoManager;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Z)V
    .locals 19
    .param p0    # Landroidx/compose/foundation/text2/input/TextUndoManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    invoke-interface/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    invoke-interface/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 28
    .line 29
    .line 30
    move-result-wide v10

    .line 31
    const-wide/16 v12, 0x0

    .line 32
    .line 33
    const/4 v14, 0x0

    .line 34
    const/16 v15, 0x20

    .line 35
    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    move-object v4, v1

    .line 39
    invoke-direct/range {v4 .. v16}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/w;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->record(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface/range {p3 .. p3}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-interface {v1, v2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getOriginalRange--jx7JFs(I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-interface {v1, v2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getRange--jx7JFs(I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    :cond_1
    new-instance v5, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 74
    .line 75
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    move-object/from16 v6, p1

    .line 80
    .line 81
    invoke-static {v6, v3, v4}, Landroidx/compose/ui/text/TextRangeKt;->substring-FDrldGo(Ljava/lang/CharSequence;J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    invoke-static {v3, v1, v2}, Landroidx/compose/ui/text/TextRangeKt;->substring-FDrldGo(Ljava/lang/CharSequence;J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    invoke-interface/range {p2 .. p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    const-wide/16 v14, 0x0

    .line 100
    .line 101
    const/16 v17, 0x20

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    move-object v6, v5

    .line 106
    move/from16 v16, p4

    .line 107
    .line 108
    invoke-direct/range {v6 .. v18}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/w;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v5}, Landroidx/compose/foundation/text2/input/TextUndoManager;->record(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    :goto_0
    return-void
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
.end method

.method public static synthetic recordChanges$default(Landroidx/compose/foundation/text2/input/TextUndoManager;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->recordChanges(Landroidx/compose/foundation/text2/input/TextUndoManager;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Z)V

    return-void
.end method
