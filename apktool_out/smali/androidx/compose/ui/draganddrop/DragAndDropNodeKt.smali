.class public final Landroidx/compose/ui/draganddrop/DragAndDropNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a1\u0010\u0001\u001a\u00020\u00002!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t\u001a\u0014\u0010\u000c\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
        "DragAndDropModifierNode",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
        "Lkotlin/v0;",
        "name",
        "event",
        "",
        "shouldStartDragAndDrop",
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "target",
        "Lkotlin/r2;",
        "dispatchEntered",
        "Landroidx/compose/ui/geometry/Offset;",
        "position",
        "contains-Uv8p0NA",
        "(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z",
        "contains",
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
        "SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,307:1\n56#2,4:308\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n300#1:308,4\n*E\n"
    }
.end annotation


# direct methods
.method public static final DragAndDropModifierNode()Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/draganddrop/DragAndDropNode;

    sget-object v1, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt$DragAndDropModifierNode$1;->INSTANCE:Landroidx/compose/ui/draganddrop/DragAndDropNodeKt$DragAndDropModifierNode$1;

    invoke-direct {v0, v1}, Landroidx/compose/ui/draganddrop/DragAndDropNode;-><init>(Lv3/l;)V

    return-object v0
.end method

.method public static final DragAndDropModifierNode(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;
    .locals 2
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropTarget;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
            ")",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/ui/draganddrop/DragAndDropNode;

    new-instance v1, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt$DragAndDropModifierNode$2;

    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt$DragAndDropModifierNode$2;-><init>(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V

    invoke-direct {v0, v1}, Landroidx/compose/ui/draganddrop/DragAndDropNode;-><init>(Lv3/l;)V

    return-object v0
.end method

.method public static final synthetic access$contains-Uv8p0NA(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt;->contains-Uv8p0NA(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$dispatchEntered(Landroidx/compose/ui/draganddrop/DragAndDropTarget;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt;->dispatchEntered(Landroidx/compose/ui/draganddrop/DragAndDropTarget;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    return-void
.end method

.method private static final contains-Uv8p0NA(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z
    .locals 6

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->component1-impl(J)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->component2-impl(J)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    int-to-float v0, v0

    .line 53
    add-float/2addr v0, p0

    .line 54
    int-to-float v2, v2

    .line 55
    add-float/2addr v2, v3

    .line 56
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    cmpg-float p0, p0, v4

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    if-gtz p0, :cond_2

    .line 64
    .line 65
    cmpg-float p0, v4, v0

    .line 66
    .line 67
    if-gtz p0, :cond_2

    .line 68
    .line 69
    move p0, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move p0, v1

    .line 72
    :goto_0
    if-eqz p0, :cond_4

    .line 73
    .line 74
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    cmpg-float p1, v3, p0

    .line 79
    .line 80
    if-gtz p1, :cond_3

    .line 81
    .line 82
    cmpg-float p0, p0, v2

    .line 83
    .line 84
    if-gtz p0, :cond_3

    .line 85
    .line 86
    move p0, v5

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move p0, v1

    .line 89
    :goto_1
    if-eqz p0, :cond_4

    .line 90
    .line 91
    move v1, v5

    .line 92
    :cond_4
    return v1
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

.method private static final dispatchEntered(Landroidx/compose/ui/draganddrop/DragAndDropTarget;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropTarget;->onEntered(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropTarget;->onMoved(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    .line 5
    .line 6
    .line 7
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
.end method
