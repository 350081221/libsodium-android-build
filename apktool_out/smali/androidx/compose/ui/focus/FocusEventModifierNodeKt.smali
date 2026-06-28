.class public final Landroidx/compose/ui/focus/FocusEventModifierNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u000c\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Lkotlin/r2;",
        "invalidateFocusEvent",
        "Landroidx/compose/ui/focus/FocusState;",
        "getFocusState",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "refreshFocusEventNodes",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,71:1\n90#2:72\n94#2:182\n90#2:183\n282#3:73\n385#3,6:74\n395#3,2:81\n397#3,8:86\n405#3,9:97\n414#3,8:109\n283#3:117\n133#3:118\n134#3,8:120\n142#3,9:129\n385#3,37:138\n151#3,6:175\n284#3:181\n241#3,2:184\n58#3:186\n59#3,8:188\n243#3:196\n244#3,2:198\n385#3,12:200\n397#3,8:215\n405#3,9:226\n414#3,8:238\n247#3:246\n68#3,7:247\n248#3:254\n261#4:80\n261#4:197\n234#5,3:83\n237#5,3:106\n234#5,3:212\n237#5,3:235\n1208#6:94\n1187#6,2:95\n1208#6:223\n1187#6,2:224\n1#7:119\n1#7:187\n48#8:128\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n47#1:72\n66#1:182\n66#1:183\n47#1:73\n47#1:74,6\n47#1:81,2\n47#1:86,8\n47#1:97,9\n47#1:109,8\n47#1:117\n47#1:118\n47#1:120,8\n47#1:129,9\n47#1:138,37\n47#1:175,6\n47#1:181\n66#1:184,2\n66#1:186\n66#1:188,8\n66#1:196\n66#1:198,2\n66#1:200,12\n66#1:215,8\n66#1:226,9\n66#1:238,8\n66#1:246\n66#1:247,7\n66#1:254\n47#1:80\n66#1:197\n47#1:83,3\n47#1:106,3\n66#1:212,3\n66#1:235,3\n47#1:94\n47#1:95,2\n66#1:223\n66#1:224,2\n47#1:119\n66#1:187\n47#1:128\n*E\n"
    }
.end annotation


# direct methods
.method public static final getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;
    .locals 12
    .param p0    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x2

    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x1

    .line 19
    if-eqz v1, :cond_a

    .line 20
    .line 21
    instance-of v9, v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v6, Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    aget v6, v6, v7

    .line 38
    .line 39
    if-eq v6, v8, :cond_0

    .line 40
    .line 41
    if-eq v6, v5, :cond_0

    .line 42
    .line 43
    if-eq v6, v4, :cond_0

    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_0
    return-object v1

    .line 47
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    and-int/2addr v4, v0

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    move v4, v8

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v4, v7

    .line 57
    :goto_1
    if-eqz v4, :cond_9

    .line 58
    .line 59
    instance-of v4, v1, Landroidx/compose/ui/node/DelegatingNode;

    .line 60
    .line 61
    if-eqz v4, :cond_9

    .line 62
    .line 63
    move-object v4, v1

    .line 64
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 65
    .line 66
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    move v5, v7

    .line 71
    :goto_2
    if-eqz v4, :cond_8

    .line 72
    .line 73
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    and-int/2addr v9, v0

    .line 78
    if-eqz v9, :cond_3

    .line 79
    .line 80
    move v9, v8

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move v9, v7

    .line 83
    :goto_3
    if-eqz v9, :cond_7

    .line 84
    .line 85
    add-int/lit8 v5, v5, 0x1

    .line 86
    .line 87
    if-ne v5, v8, :cond_4

    .line 88
    .line 89
    move-object v1, v4

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    if-nez v3, :cond_5

    .line 92
    .line 93
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 94
    .line 95
    new-array v9, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 96
    .line 97
    invoke-direct {v3, v9, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    :cond_5
    if-eqz v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-object v1, v2

    .line 106
    :cond_6
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_7
    :goto_4
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    goto :goto_2

    .line 114
    :cond_8
    if-ne v5, v8, :cond_9

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_9
    :goto_5
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    goto :goto_0

    .line 122
    :cond_a
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_1a

    .line 131
    .line 132
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 133
    .line 134
    new-array v3, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 135
    .line 136
    invoke-direct {v1, v3, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-nez v3, :cond_b

    .line 148
    .line 149
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {v1, p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_b
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    :cond_c
    :goto_6
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->isNotEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_19

    .line 165
    .line 166
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    sub-int/2addr p0, v8

    .line 171
    invoke-virtual {v1, p0}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Landroidx/compose/ui/Modifier$Node;

    .line 176
    .line 177
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    and-int/2addr v3, v0

    .line 182
    if-nez v3, :cond_d

    .line 183
    .line 184
    invoke-static {v1, p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_d
    :goto_7
    if-eqz p0, :cond_c

    .line 189
    .line 190
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    and-int/2addr v3, v0

    .line 195
    if-eqz v3, :cond_18

    .line 196
    .line 197
    move-object v3, v2

    .line 198
    :goto_8
    if-eqz p0, :cond_c

    .line 199
    .line 200
    instance-of v9, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 201
    .line 202
    if-eqz v9, :cond_f

    .line 203
    .line 204
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 205
    .line 206
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    sget-object v9, Landroidx/compose/ui/focus/FocusEventModifierNodeKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    aget v9, v9, v10

    .line 217
    .line 218
    if-eq v9, v8, :cond_e

    .line 219
    .line 220
    if-eq v9, v5, :cond_e

    .line 221
    .line 222
    if-eq v9, v4, :cond_e

    .line 223
    .line 224
    goto :goto_d

    .line 225
    :cond_e
    return-object p0

    .line 226
    :cond_f
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    and-int/2addr v9, v0

    .line 231
    if-eqz v9, :cond_10

    .line 232
    .line 233
    move v9, v8

    .line 234
    goto :goto_9

    .line 235
    :cond_10
    move v9, v7

    .line 236
    :goto_9
    if-eqz v9, :cond_17

    .line 237
    .line 238
    instance-of v9, p0, Landroidx/compose/ui/node/DelegatingNode;

    .line 239
    .line 240
    if-eqz v9, :cond_17

    .line 241
    .line 242
    move-object v9, p0

    .line 243
    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 244
    .line 245
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    move v10, v7

    .line 250
    :goto_a
    if-eqz v9, :cond_16

    .line 251
    .line 252
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    and-int/2addr v11, v0

    .line 257
    if-eqz v11, :cond_11

    .line 258
    .line 259
    move v11, v8

    .line 260
    goto :goto_b

    .line 261
    :cond_11
    move v11, v7

    .line 262
    :goto_b
    if-eqz v11, :cond_15

    .line 263
    .line 264
    add-int/lit8 v10, v10, 0x1

    .line 265
    .line 266
    if-ne v10, v8, :cond_12

    .line 267
    .line 268
    move-object p0, v9

    .line 269
    goto :goto_c

    .line 270
    :cond_12
    if-nez v3, :cond_13

    .line 271
    .line 272
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 273
    .line 274
    new-array v11, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 275
    .line 276
    invoke-direct {v3, v11, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    :cond_13
    if-eqz p0, :cond_14

    .line 280
    .line 281
    invoke-virtual {v3, p0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-object p0, v2

    .line 285
    :cond_14
    invoke-virtual {v3, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    :cond_15
    :goto_c
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    goto :goto_a

    .line 293
    :cond_16
    if-ne v10, v8, :cond_17

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_17
    :goto_d
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    goto :goto_8

    .line 301
    :cond_18
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    goto :goto_7

    .line 306
    :cond_19
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 307
    .line 308
    return-object p0

    .line 309
    :cond_1a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 310
    .line 311
    const-string/jumbo v0, "visitChildren called on an unattached node"

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw p0
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
.end method

.method public static final invalidateFocusEvent(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p0    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/compose/ui/focus/FocusOwner;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    return-void
.end method

.method public static final refreshFocusEventNodes(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 13
    .param p0    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x400

    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    or-int v3, v0, v1

    .line 18
    .line 19
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_10

    .line 28
    .line 29
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    if-eqz p0, :cond_f

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    and-int/2addr v5, v3

    .line 52
    const/4 v6, 0x0

    .line 53
    if-eqz v5, :cond_d

    .line 54
    .line 55
    :goto_1
    if-eqz v4, :cond_d

    .line 56
    .line 57
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    and-int/2addr v5, v3

    .line 62
    if-eqz v5, :cond_c

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v7, 0x1

    .line 66
    if-eq v4, v2, :cond_1

    .line 67
    .line 68
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    and-int/2addr v8, v1

    .line 73
    if-eqz v8, :cond_0

    .line 74
    .line 75
    move v8, v7

    .line 76
    goto :goto_2

    .line 77
    :cond_0
    move v8, v5

    .line 78
    :goto_2
    if-nez v8, :cond_f

    .line 79
    .line 80
    :cond_1
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    and-int/2addr v8, v0

    .line 85
    if-eqz v8, :cond_2

    .line 86
    .line 87
    move v8, v7

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    move v8, v5

    .line 90
    :goto_3
    if-eqz v8, :cond_c

    .line 91
    .line 92
    move-object v8, v4

    .line 93
    move-object v9, v6

    .line 94
    :goto_4
    if-eqz v8, :cond_c

    .line 95
    .line 96
    instance-of v10, v8, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 97
    .line 98
    if-eqz v10, :cond_3

    .line 99
    .line 100
    check-cast v8, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 101
    .line 102
    invoke-static {v8}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-interface {v8, v10}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 107
    .line 108
    .line 109
    goto :goto_9

    .line 110
    :cond_3
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    and-int/2addr v10, v0

    .line 115
    if-eqz v10, :cond_4

    .line 116
    .line 117
    move v10, v7

    .line 118
    goto :goto_5

    .line 119
    :cond_4
    move v10, v5

    .line 120
    :goto_5
    if-eqz v10, :cond_b

    .line 121
    .line 122
    instance-of v10, v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 123
    .line 124
    if-eqz v10, :cond_b

    .line 125
    .line 126
    move-object v10, v8

    .line 127
    check-cast v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 128
    .line 129
    invoke-virtual {v10}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    move v11, v5

    .line 134
    :goto_6
    if-eqz v10, :cond_a

    .line 135
    .line 136
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    and-int/2addr v12, v0

    .line 141
    if-eqz v12, :cond_5

    .line 142
    .line 143
    move v12, v7

    .line 144
    goto :goto_7

    .line 145
    :cond_5
    move v12, v5

    .line 146
    :goto_7
    if-eqz v12, :cond_9

    .line 147
    .line 148
    add-int/lit8 v11, v11, 0x1

    .line 149
    .line 150
    if-ne v11, v7, :cond_6

    .line 151
    .line 152
    move-object v8, v10

    .line 153
    goto :goto_8

    .line 154
    :cond_6
    if-nez v9, :cond_7

    .line 155
    .line 156
    new-instance v9, Landroidx/compose/runtime/collection/MutableVector;

    .line 157
    .line 158
    const/16 v12, 0x10

    .line 159
    .line 160
    new-array v12, v12, [Landroidx/compose/ui/Modifier$Node;

    .line 161
    .line 162
    invoke-direct {v9, v12, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    :cond_7
    if-eqz v8, :cond_8

    .line 166
    .line 167
    invoke-virtual {v9, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-object v8, v6

    .line 171
    :cond_8
    invoke-virtual {v9, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_9
    :goto_8
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    goto :goto_6

    .line 179
    :cond_a
    if-ne v11, v7, :cond_b

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_b
    :goto_9
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    goto :goto_4

    .line 187
    :cond_c
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-eqz p0, :cond_e

    .line 198
    .line 199
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    if-eqz v4, :cond_e

    .line 204
    .line 205
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_e
    move-object v4, v6

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_f
    return-void

    .line 215
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 216
    .line 217
    const-string/jumbo v0, "visitAncestors called on an unattached node"

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p0
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
.end method
