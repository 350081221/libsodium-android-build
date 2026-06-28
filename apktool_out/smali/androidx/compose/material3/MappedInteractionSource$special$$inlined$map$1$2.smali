.class public final Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/j;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "T",
        "R",
        "value",
        "Lkotlin/r2;",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "kotlinx/coroutines/flow/a0$f$b",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MappedInteractionSource.kt\nandroidx/compose/material3/MappedInteractionSource\n*L\n1#1,222:1\n54#2:223\n36#3,23:224\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:Lkotlinx/coroutines/flow/j;

.field final synthetic this$0:Landroidx/compose/material3/MappedInteractionSource;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/j;Landroidx/compose/material3/MappedInteractionSource;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    iput-object p2, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->this$0:Landroidx/compose/material3/MappedInteractionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;-><init>(Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/j;

    .line 55
    .line 56
    check-cast p1, Landroidx/compose/foundation/interaction/Interaction;

    .line 57
    .line 58
    instance-of v2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->this$0:Landroidx/compose/material3/MappedInteractionSource;

    .line 63
    .line 64
    move-object v4, p1

    .line 65
    check-cast v4, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 66
    .line 67
    invoke-static {v2, v4}, Landroidx/compose/material3/MappedInteractionSource;->access$mapPress(Landroidx/compose/material3/MappedInteractionSource;Landroidx/compose/foundation/interaction/PressInteraction$Press;)Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v4, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->this$0:Landroidx/compose/material3/MappedInteractionSource;

    .line 72
    .line 73
    invoke-static {v4}, Landroidx/compose/material3/MappedInteractionSource;->access$getMappedPresses$p(Landroidx/compose/material3/MappedInteractionSource;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v4, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-object p1, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    instance-of v2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 83
    .line 84
    if-eqz v2, :cond_5

    .line 85
    .line 86
    iget-object v2, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->this$0:Landroidx/compose/material3/MappedInteractionSource;

    .line 87
    .line 88
    invoke-static {v2}, Landroidx/compose/material3/MappedInteractionSource;->access$getMappedPresses$p(Landroidx/compose/material3/MappedInteractionSource;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;->getPress()Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 103
    .line 104
    if-nez v2, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 108
    .line 109
    invoke-direct {p1, v2}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    instance-of v2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    .line 114
    .line 115
    if-eqz v2, :cond_7

    .line 116
    .line 117
    iget-object v2, p0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2;->this$0:Landroidx/compose/material3/MappedInteractionSource;

    .line 118
    .line 119
    invoke-static {v2}, Landroidx/compose/material3/MappedInteractionSource;->access$getMappedPresses$p(Landroidx/compose/material3/MappedInteractionSource;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/compose/foundation/interaction/PressInteraction$Release;->getPress()Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 134
    .line 135
    if-nez v2, :cond_6

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_6
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    .line 139
    .line 140
    invoke-direct {p1, v2}, Landroidx/compose/foundation/interaction/PressInteraction$Release;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    :goto_1
    iput v3, v0, Landroidx/compose/material3/MappedInteractionSource$special$$inlined$map$1$2$1;->label:I

    .line 144
    .line 145
    invoke-interface {p2, p1, v0}, Lkotlinx/coroutines/flow/j;->emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-ne p1, v1, :cond_8

    .line 150
    .line 151
    return-object v1

    .line 152
    :cond_8
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 153
    .line 154
    return-object p1
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
