.class final Landroidx/compose/ui/node/NodeChain$Differ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/DiffCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/node/NodeChain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Differ"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\u0008*\u0010+J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R(\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R(\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010\u001e\"\u0004\u0008#\u0010 R\"\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Landroidx/compose/ui/node/NodeChain$Differ;",
        "Landroidx/compose/ui/node/DiffCallback;",
        "",
        "oldIndex",
        "newIndex",
        "",
        "areItemsTheSame",
        "Lkotlin/r2;",
        "insert",
        "atIndex",
        "remove",
        "same",
        "Landroidx/compose/ui/Modifier$Node;",
        "node",
        "Landroidx/compose/ui/Modifier$Node;",
        "getNode",
        "()Landroidx/compose/ui/Modifier$Node;",
        "setNode",
        "(Landroidx/compose/ui/Modifier$Node;)V",
        "offset",
        "I",
        "getOffset",
        "()I",
        "setOffset",
        "(I)V",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/ui/Modifier$Element;",
        "before",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "getBefore",
        "()Landroidx/compose/runtime/collection/MutableVector;",
        "setBefore",
        "(Landroidx/compose/runtime/collection/MutableVector;)V",
        "after",
        "getAfter",
        "setAfter",
        "shouldAttachOnInsert",
        "Z",
        "getShouldAttachOnInsert",
        "()Z",
        "setShouldAttachOnInsert",
        "(Z)V",
        "<init>",
        "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,862:1\n523#2:863\n523#2:864\n523#2:865\n523#2:866\n523#2:867\n523#2:870\n523#2:871\n72#3:868\n261#4:869\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n422#1:863\n423#1:864\n430#1:865\n431#1:866\n456#1:867\n472#1:870\n473#1:871\n457#1:868\n457#1:869\n*E\n"
    }
.end annotation


# instance fields
.field private after:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private before:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private node:Landroidx/compose/ui/Modifier$Node;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private offset:I

.field private shouldAttachOnInsert:Z

.field final synthetic this$0:Landroidx/compose/ui/node/NodeChain;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V
    .locals 0
    .param p1    # Landroidx/compose/ui/node/NodeChain;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/collection/MutableVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier$Node;",
            "I",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    .line 13
    .line 14
    iput-boolean p6, p0, Landroidx/compose/ui/node/NodeChain$Differ;->shouldAttachOnInsert:Z

    .line 15
    .line 16
    return-void
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
.end method


# virtual methods
.method public areItemsTheSame(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 4
    .line 5
    add-int/2addr v1, p1

    .line 6
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    aget-object p1, p1, v1

    .line 11
    .line 12
    check-cast p1, Landroidx/compose/ui/Modifier$Element;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    .line 15
    .line 16
    iget v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 17
    .line 18
    add-int/2addr v1, p2

    .line 19
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    aget-object p2, p2, v1

    .line 24
    .line 25
    check-cast p2, Landroidx/compose/ui/Modifier$Element;

    .line 26
    .line 27
    invoke-static {p1, p2}, Landroidx/compose/ui/node/NodeChainKt;->actionForModifiers(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    :goto_0
    return p1
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
.end method

.method public final getAfter()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    return-object v0
.end method

.method public final getBefore()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    return-object v0
.end method

.method public final getNode()Landroidx/compose/ui/Modifier$Node;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    return v0
.end method

.method public final getShouldAttachOnInsert()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->shouldAttachOnInsert:Z

    return v0
.end method

.method public insert(I)V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 2
    .line 3
    add-int v3, v0, p1

    .line 4
    .line 5
    iget-object v5, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    aget-object v0, v0, v3

    .line 16
    .line 17
    check-cast v0, Landroidx/compose/ui/Modifier$Element;

    .line 18
    .line 19
    invoke-static {p1, v0, v5}, Landroidx/compose/ui/node/NodeChain;->access$createAndInsertNodeAsChild(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 26
    .line 27
    invoke-static {p1}, Landroidx/compose/ui/node/NodeChain;->access$getLogger$p(Landroidx/compose/ui/node/NodeChain;)Landroidx/compose/ui/node/NodeChain$Logger;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    aget-object p1, p1, v3

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, Landroidx/compose/ui/Modifier$Element;

    .line 43
    .line 44
    iget-object v6, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 45
    .line 46
    move v2, v3

    .line 47
    invoke-interface/range {v1 .. v6}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeInserted(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-boolean p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->shouldAttachOnInsert:Z

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 71
    .line 72
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->asLayoutModifierNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    new-instance v1, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;

    .line 79
    .line 80
    iget-object v2, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2, v0}, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;-><init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 95
    .line 96
    iget-object v2, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 97
    .line 98
    invoke-static {v0, v2, v1}, Landroidx/compose/ui/node/NodeChain;->access$propagateCoordinator(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v1, v0}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, p1}, Landroidx/compose/ui/node/NodeCoordinator;->setWrapped$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 121
    .line 122
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->markAsAttached$ui_release()V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->runAttachLifecycle$ui_release()V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 131
    .line 132
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateInsertedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 137
    .line 138
    const/4 v0, 0x1

    .line 139
    invoke-virtual {p1, v0}, Landroidx/compose/ui/Modifier$Node;->setInsertedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 140
    .line 141
    .line 142
    :goto_1
    return-void
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
.end method

.method public remove(II)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/compose/ui/node/NodeChain;->access$getLogger$p(Landroidx/compose/ui/node/NodeChain;)Landroidx/compose/ui/node/NodeChain$Logger;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    .line 19
    .line 20
    iget v2, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 21
    .line 22
    add-int/2addr v2, p2

    .line 23
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    aget-object v1, v1, v2

    .line 28
    .line 29
    check-cast v1, Landroidx/compose/ui/Modifier$Element;

    .line 30
    .line 31
    invoke-interface {v0, p2, v1, p1}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeRemoved(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 p2, 0x2

    .line 35
    invoke-static {p2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    and-int/2addr p2, v0

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p2, 0x0

    .line 49
    :goto_0
    if-eqz p2, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p2}, Landroidx/compose/ui/node/NodeCoordinator;->getWrapped$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-static {p2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->setWrapped$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {p2, v0}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 81
    .line 82
    invoke-static {v0, v1, p2}, Landroidx/compose/ui/node/NodeChain;->access$propagateCoordinator(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    iget-object p2, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 86
    .line 87
    invoke-static {p2, p1}, Landroidx/compose/ui/node/NodeChain;->access$detachAndRemoveNode(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 92
    .line 93
    return-void
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
.end method

.method public same(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    .line 13
    .line 14
    iget v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 15
    .line 16
    add-int/2addr v1, p1

    .line 17
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, Landroidx/compose/ui/Modifier$Element;

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    .line 27
    .line 28
    iget v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 29
    .line 30
    add-int/2addr v1, p2

    .line 31
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    aget-object v0, v0, v1

    .line 36
    .line 37
    move-object v5, v0

    .line 38
    check-cast v5, Landroidx/compose/ui/Modifier$Element;

    .line 39
    .line 40
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 49
    .line 50
    invoke-static {v0, v4, v5, v1}, Landroidx/compose/ui/node/NodeChain;->access$updateNode(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 54
    .line 55
    invoke-static {v0}, Landroidx/compose/ui/node/NodeChain;->access$getLogger$p(Landroidx/compose/ui/node/NodeChain;)Landroidx/compose/ui/node/NodeChain$Logger;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 62
    .line 63
    add-int v2, v0, p1

    .line 64
    .line 65
    add-int v3, v0, p2

    .line 66
    .line 67
    iget-object v6, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 68
    .line 69
    invoke-interface/range {v1 .. v6}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeUpdated(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->this$0:Landroidx/compose/ui/node/NodeChain;

    .line 74
    .line 75
    invoke-static {v0}, Landroidx/compose/ui/node/NodeChain;->access$getLogger$p(Landroidx/compose/ui/node/NodeChain;)Landroidx/compose/ui/node/NodeChain$Logger;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    iget v0, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    .line 82
    .line 83
    add-int v2, v0, p1

    .line 84
    .line 85
    add-int v3, v0, p2

    .line 86
    .line 87
    iget-object v6, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    .line 88
    .line 89
    invoke-interface/range {v1 .. v6}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeReused(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final setAfter(Landroidx/compose/runtime/collection/MutableVector;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/collection/MutableVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->after:Landroidx/compose/runtime/collection/MutableVector;

    return-void
.end method

.method public final setBefore(Landroidx/compose/runtime/collection/MutableVector;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/collection/MutableVector;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->before:Landroidx/compose/runtime/collection/MutableVector;

    return-void
.end method

.method public final setNode(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->node:Landroidx/compose/ui/Modifier$Node;

    return-void
.end method

.method public final setOffset(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->offset:I

    return-void
.end method

.method public final setShouldAttachOnInsert(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/node/NodeChain$Differ;->shouldAttachOnInsert:Z

    return-void
.end method
