.class public final Landroidx/compose/runtime/SlotWriter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/SlotWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000cH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/runtime/SlotWriter$Companion;",
        "",
        "()V",
        "moveGroup",
        "",
        "Landroidx/compose/runtime/Anchor;",
        "fromWriter",
        "Landroidx/compose/runtime/SlotWriter;",
        "fromIndex",
        "",
        "toWriter",
        "updateFromCursor",
        "",
        "updateToCursor",
        "removeSourceGroup",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n1#2:3746\n33#3,6:3747\n4178#4,5:3753\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2302#1:3747,6\n2367#1:3753,5\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/SlotWriter$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$moveGroup(Landroidx/compose/runtime/SlotWriter$Companion;Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/runtime/SlotWriter$Companion;->moveGroup(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final moveGroup(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/SlotWriter;",
            "I",
            "Landroidx/compose/runtime/SlotWriter;",
            "ZZZ)",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/Anchor;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p2}, Landroidx/compose/runtime/SlotWriter;->groupSize(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    invoke-static/range {p1 .. p2}, Landroidx/compose/runtime/SlotWriter;->access$dataIndex(Landroidx/compose/runtime/SlotWriter;I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-static {v0, v4}, Landroidx/compose/runtime/SlotWriter;->access$dataIndex(Landroidx/compose/runtime/SlotWriter;I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    sub-int v7, v6, v5

    .line 22
    .line 23
    invoke-static/range {p1 .. p2}, Landroidx/compose/runtime/SlotWriter;->access$containsAnyGroupMarks(Landroidx/compose/runtime/SlotWriter;I)Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-static {v2, v3}, Landroidx/compose/runtime/SlotWriter;->access$insertGroups(Landroidx/compose/runtime/SlotWriter;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    invoke-static {v2, v7, v9}, Landroidx/compose/runtime/SlotWriter;->access$insertSlots(Landroidx/compose/runtime/SlotWriter;II)V

    .line 35
    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getGroupGapStart$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-ge v9, v4, :cond_0

    .line 42
    .line 43
    invoke-static {v0, v4}, Landroidx/compose/runtime/SlotWriter;->access$moveGroupGapTo(Landroidx/compose/runtime/SlotWriter;I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getSlotsGapStart$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-ge v9, v6, :cond_1

    .line 51
    .line 52
    invoke-static {v0, v6, v4}, Landroidx/compose/runtime/SlotWriter;->access$moveSlotGapTo(Landroidx/compose/runtime/SlotWriter;II)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getGroups$p(Landroidx/compose/runtime/SlotWriter;)[I

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getGroups$p(Landroidx/compose/runtime/SlotWriter;)[I

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    mul-int/lit8 v12, v10, 0x5

    .line 68
    .line 69
    mul-int/lit8 v13, v1, 0x5

    .line 70
    .line 71
    mul-int/lit8 v14, v4, 0x5

    .line 72
    .line 73
    invoke-static {v11, v9, v12, v13, v14}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 74
    .line 75
    .line 76
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getSlots$p(Landroidx/compose/runtime/SlotWriter;)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getCurrentSlot$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getSlots$p(Landroidx/compose/runtime/SlotWriter;)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v13, v11, v12, v5, v6}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-static {v9, v10, v6}, Landroidx/compose/runtime/SlotTableKt;->access$updateParentAnchor([III)V

    .line 96
    .line 97
    .line 98
    sub-int v13, v10, v1

    .line 99
    .line 100
    add-int v14, v10, v3

    .line 101
    .line 102
    invoke-static {v2, v9, v10}, Landroidx/compose/runtime/SlotWriter;->access$dataIndex(Landroidx/compose/runtime/SlotWriter;[II)I

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    sub-int v15, v12, v15

    .line 107
    .line 108
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getSlotsGapOwner$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 109
    .line 110
    .line 111
    move-result v16

    .line 112
    move/from16 v17, v8

    .line 113
    .line 114
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getSlotsGapLen$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    array-length v11, v11

    .line 119
    move/from16 v18, v12

    .line 120
    .line 121
    move/from16 v12, v16

    .line 122
    .line 123
    move/from16 v16, v5

    .line 124
    .line 125
    move v5, v10

    .line 126
    :goto_0
    const/16 v19, 0x0

    .line 127
    .line 128
    if-ge v5, v14, :cond_5

    .line 129
    .line 130
    if-eq v5, v10, :cond_2

    .line 131
    .line 132
    invoke-static {v9, v5}, Landroidx/compose/runtime/SlotTableKt;->access$parentAnchor([II)I

    .line 133
    .line 134
    .line 135
    move-result v20

    .line 136
    move/from16 v21, v14

    .line 137
    .line 138
    add-int v14, v20, v13

    .line 139
    .line 140
    invoke-static {v9, v5, v14}, Landroidx/compose/runtime/SlotTableKt;->access$updateParentAnchor([III)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    move/from16 v21, v14

    .line 145
    .line 146
    :goto_1
    invoke-static {v2, v9, v5}, Landroidx/compose/runtime/SlotWriter;->access$dataIndex(Landroidx/compose/runtime/SlotWriter;[II)I

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    add-int/2addr v14, v15

    .line 151
    if-ge v12, v5, :cond_3

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getSlotsGapStart$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 155
    .line 156
    .line 157
    move-result v19

    .line 158
    :goto_2
    move/from16 v20, v15

    .line 159
    .line 160
    move/from16 v15, v19

    .line 161
    .line 162
    invoke-static {v2, v14, v15, v8, v11}, Landroidx/compose/runtime/SlotWriter;->access$dataIndexToDataAnchor(Landroidx/compose/runtime/SlotWriter;IIII)I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    invoke-static {v9, v5, v14}, Landroidx/compose/runtime/SlotTableKt;->access$updateDataAnchor([III)V

    .line 167
    .line 168
    .line 169
    if-ne v5, v12, :cond_4

    .line 170
    .line 171
    add-int/lit8 v12, v12, 0x1

    .line 172
    .line 173
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 174
    .line 175
    move/from16 v15, v20

    .line 176
    .line 177
    move/from16 v14, v21

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_5
    move/from16 v21, v14

    .line 181
    .line 182
    invoke-static {v2, v12}, Landroidx/compose/runtime/SlotWriter;->access$setSlotsGapOwner$p(Landroidx/compose/runtime/SlotWriter;I)V

    .line 183
    .line 184
    .line 185
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getAnchors$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->getSize$runtime_release()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    invoke-static {v5, v1, v8}, Landroidx/compose/runtime/SlotTableKt;->access$locationOf(Ljava/util/ArrayList;II)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getAnchors$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->getSize$runtime_release()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    invoke-static {v8, v4, v11}, Landroidx/compose/runtime/SlotTableKt;->access$locationOf(Ljava/util/ArrayList;II)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-ge v5, v4, :cond_7

    .line 210
    .line 211
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getAnchors$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    new-instance v11, Ljava/util/ArrayList;

    .line 216
    .line 217
    sub-int v12, v4, v5

    .line 218
    .line 219
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    move v12, v5

    .line 223
    :goto_3
    if-ge v12, v4, :cond_6

    .line 224
    .line 225
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    check-cast v14, Landroidx/compose/runtime/Anchor;

    .line 230
    .line 231
    invoke-virtual {v14}, Landroidx/compose/runtime/Anchor;->getLocation$runtime_release()I

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    add-int/2addr v15, v13

    .line 236
    invoke-virtual {v14, v15}, Landroidx/compose/runtime/Anchor;->setLocation$runtime_release(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    add-int/lit8 v12, v12, 0x1

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_6
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getAnchors$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getSize$runtime_release()I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    invoke-static {v12, v13, v14}, Landroidx/compose/runtime/SlotTableKt;->access$locationOf(Ljava/util/ArrayList;II)I

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getAnchors$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/ArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v13

    .line 265
    invoke-virtual {v13, v12, v11}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, v5, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    :goto_4
    move-object v4, v11

    .line 281
    check-cast v4, Ljava/util/Collection;

    .line 282
    .line 283
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    const/4 v5, 0x1

    .line 288
    xor-int/2addr v4, v5

    .line 289
    if-eqz v4, :cond_b

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->access$getSourceInformationMap$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/HashMap;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    if-eqz v4, :cond_b

    .line 296
    .line 297
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getSourceInformationMap$p(Landroidx/compose/runtime/SlotWriter;)Ljava/util/HashMap;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    move/from16 v13, v19

    .line 306
    .line 307
    :goto_5
    if-ge v13, v12, :cond_a

    .line 308
    .line 309
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    check-cast v14, Landroidx/compose/runtime/Anchor;

    .line 314
    .line 315
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v15

    .line 319
    check-cast v15, Landroidx/compose/runtime/GroupSourceInformation;

    .line 320
    .line 321
    if-eqz v15, :cond_9

    .line 322
    .line 323
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    if-nez v8, :cond_8

    .line 327
    .line 328
    sget-object v8, Landroidx/compose/runtime/SlotWriter;->Companion:Landroidx/compose/runtime/SlotWriter$Companion;

    .line 329
    .line 330
    new-instance v8, Ljava/util/HashMap;

    .line 331
    .line 332
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-static {v2, v8}, Landroidx/compose/runtime/SlotWriter;->access$setSourceInformationMap$p(Landroidx/compose/runtime/SlotWriter;Ljava/util/HashMap;)V

    .line 336
    .line 337
    .line 338
    :cond_8
    invoke-interface {v8, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_9
    add-int/lit8 v13, v13, 0x1

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_a
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_b

    .line 349
    .line 350
    const/4 v4, 0x0

    .line 351
    invoke-static {v0, v4}, Landroidx/compose/runtime/SlotWriter;->access$setSourceInformationMap$p(Landroidx/compose/runtime/SlotWriter;Ljava/util/HashMap;)V

    .line 352
    .line 353
    .line 354
    :cond_b
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    invoke-static {v2, v6}, Landroidx/compose/runtime/SlotWriter;->access$sourceInformationOf(Landroidx/compose/runtime/SlotWriter;I)Landroidx/compose/runtime/GroupSourceInformation;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    if-eqz v8, :cond_d

    .line 363
    .line 364
    add-int/2addr v4, v5

    .line 365
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    const/4 v13, -0x1

    .line 370
    :goto_6
    if-ge v4, v12, :cond_c

    .line 371
    .line 372
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getGroups$p(Landroidx/compose/runtime/SlotWriter;)[I

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    invoke-static {v13, v4}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    .line 377
    .line 378
    .line 379
    move-result v13

    .line 380
    add-int/2addr v13, v4

    .line 381
    move/from16 v22, v13

    .line 382
    .line 383
    move v13, v4

    .line 384
    move/from16 v4, v22

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_c
    invoke-virtual {v8, v2, v13, v12}, Landroidx/compose/runtime/GroupSourceInformation;->addGroupAfter(Landroidx/compose/runtime/SlotWriter;II)V

    .line 388
    .line 389
    .line 390
    :cond_d
    invoke-virtual/range {p1 .. p2}, Landroidx/compose/runtime/SlotWriter;->parent(I)I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    if-nez p6, :cond_e

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_e
    if-eqz p4, :cond_12

    .line 398
    .line 399
    if-ltz v4, :cond_f

    .line 400
    .line 401
    move/from16 v19, v5

    .line 402
    .line 403
    :cond_f
    if-eqz v19, :cond_10

    .line 404
    .line 405
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->startGroup()V

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    sub-int/2addr v4, v3

    .line 413
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/SlotWriter;->advanceBy(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->startGroup()V

    .line 417
    .line 418
    .line 419
    :cond_10
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    sub-int/2addr v1, v3

    .line 424
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/SlotWriter;->advanceBy(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->removeGroup()Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v19, :cond_11

    .line 432
    .line 433
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->skipToGroupEnd()V

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->endGroup()I

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->skipToGroupEnd()V

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/runtime/SlotWriter;->endGroup()I

    .line 443
    .line 444
    .line 445
    :cond_11
    move/from16 v19, v1

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_12
    invoke-static {v0, v1, v3}, Landroidx/compose/runtime/SlotWriter;->access$removeGroups(Landroidx/compose/runtime/SlotWriter;II)Z

    .line 449
    .line 450
    .line 451
    move-result v19

    .line 452
    sub-int/2addr v1, v5

    .line 453
    move/from16 v3, v16

    .line 454
    .line 455
    invoke-static {v0, v3, v7, v1}, Landroidx/compose/runtime/SlotWriter;->access$removeSlots(Landroidx/compose/runtime/SlotWriter;III)V

    .line 456
    .line 457
    .line 458
    :goto_7
    xor-int/lit8 v0, v19, 0x1

    .line 459
    .line 460
    if-eqz v0, :cond_16

    .line 461
    .line 462
    invoke-static/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->access$getNodeCount$p(Landroidx/compose/runtime/SlotWriter;)I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    invoke-static {v9, v10}, Landroidx/compose/runtime/SlotTableKt;->access$isNode([II)Z

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-eqz v1, :cond_13

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_13
    invoke-static {v9, v10}, Landroidx/compose/runtime/SlotTableKt;->access$nodeCount([II)I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    :goto_8
    add-int/2addr v0, v5

    .line 478
    invoke-static {v2, v0}, Landroidx/compose/runtime/SlotWriter;->access$setNodeCount$p(Landroidx/compose/runtime/SlotWriter;I)V

    .line 479
    .line 480
    .line 481
    if-eqz p5, :cond_14

    .line 482
    .line 483
    move/from16 v10, v21

    .line 484
    .line 485
    invoke-static {v2, v10}, Landroidx/compose/runtime/SlotWriter;->access$setCurrentGroup$p(Landroidx/compose/runtime/SlotWriter;I)V

    .line 486
    .line 487
    .line 488
    add-int v12, v18, v7

    .line 489
    .line 490
    invoke-static {v2, v12}, Landroidx/compose/runtime/SlotWriter;->access$setCurrentSlot$p(Landroidx/compose/runtime/SlotWriter;I)V

    .line 491
    .line 492
    .line 493
    :cond_14
    if-eqz v17, :cond_15

    .line 494
    .line 495
    invoke-static {v2, v6}, Landroidx/compose/runtime/SlotWriter;->access$updateContainsMark(Landroidx/compose/runtime/SlotWriter;I)V

    .line 496
    .line 497
    .line 498
    :cond_15
    return-object v11

    .line 499
    :cond_16
    const-string v0, "Unexpectedly removed anchors"

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    .line 506
    .line 507
    .line 508
    new-instance v0, Lkotlin/y;

    .line 509
    .line 510
    invoke-direct {v0}, Lkotlin/y;-><init>()V

    .line 511
    .line 512
    .line 513
    throw v0
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
.end method

.method static synthetic moveGroup$default(Landroidx/compose/runtime/SlotWriter$Companion;Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZILjava/lang/Object;)Ljava/util/List;
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x1

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/runtime/SlotWriter$Companion;->moveGroup(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
