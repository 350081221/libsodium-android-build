.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "<anonymous parameter 0>",
        "Landroidx/compose/ui/geometry/Offset;",
        "delta",
        "Lkotlin/r2;",
        "invoke-Uv8p0NA",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $dragBeginPosition:Lkotlin/jvm/internal/k1$g;

.field final synthetic $dragTotalDistance:Lkotlin/jvm/internal/k1$g;

.field final synthetic $handle:Landroidx/compose/foundation/text/Handle;

.field final synthetic $isStartHandle:Z

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;Lkotlin/jvm/internal/k1$g;Z)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$handle:Landroidx/compose/foundation/text/Handle;

    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    iput-boolean p5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$isStartHandle:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    check-cast p2, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V
    .locals 9
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    .line 2
    .line 3
    iget-wide v0, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 4
    .line 5
    invoke-static {v0, v1, p2, p3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    iput-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 25
    .line 26
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$handle:Landroidx/compose/foundation/text/Handle;

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    .line 29
    .line 30
    iget-wide v0, v0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    .line 33
    .line 34
    iget-wide v2, v2, Lkotlin/jvm/internal/k1$g;->element:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {p2, p3, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;J)V

    .line 41
    .line 42
    .line 43
    iget-boolean p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$isStartHandle:Z

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandleDragPosition-F1C5BW0()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    invoke-virtual {p1, p2, p3}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 59
    .line 60
    invoke-static {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 69
    .line 70
    .line 71
    move-result-wide p2

    .line 72
    invoke-static {p2, p3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    :goto_0
    move v2, p2

    .line 77
    iget-boolean p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$isStartHandle:Z

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 82
    .line 83
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 101
    .line 102
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandleDragPosition-F1C5BW0()J

    .line 103
    .line 104
    .line 105
    move-result-wide p2

    .line 106
    invoke-virtual {p1, p2, p3}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    :goto_1
    move v3, p1

    .line 111
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 112
    .line 113
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 122
    .line 123
    .line 124
    move-result-wide p1

    .line 125
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 126
    .line 127
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-boolean v4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->$isStartHandle:Z

    .line 136
    .line 137
    sget-object p3, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 138
    .line 139
    invoke-virtual {p3}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getCharacterWithWordAccelerate()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    const/4 v6, 0x0

    .line 144
    const/16 v7, 0x20

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateSelection-QNhciaU$default(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZILjava/lang/Object;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-nez p1, :cond_3

    .line 156
    .line 157
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_4

    .line 162
    .line 163
    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 164
    .line 165
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 170
    .line 171
    .line 172
    :cond_4
    return-void
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
