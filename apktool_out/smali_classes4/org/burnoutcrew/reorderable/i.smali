.class public final Lorg/burnoutcrew/reorderable/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u00c5\u0001\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042:\u0008\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00002:\u0008\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\r\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlin/Function2;",
        "Lorg/burnoutcrew/reorderable/d;",
        "Lkotlin/r2;",
        "onMove",
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "gridState",
        "Lkotlin/v0;",
        "name",
        "draggedOver",
        "dragging",
        "",
        "canDragOver",
        "",
        "startIndex",
        "endIndex",
        "onDragEnd",
        "Landroidx/compose/ui/unit/Dp;",
        "maxScrollPerFrame",
        "Lorg/burnoutcrew/reorderable/b;",
        "dragCancelledAnimation",
        "Lorg/burnoutcrew/reorderable/h;",
        "a",
        "(Lv3/p;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/h;",
        "reorderable"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lv3/p;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/h;
    .locals 14
    .param p0    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lorg/burnoutcrew/reorderable/b;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Lorg/burnoutcrew/reorderable/d;",
            "-",
            "Lorg/burnoutcrew/reorderable/d;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Lv3/p<",
            "-",
            "Lorg/burnoutcrew/reorderable/d;",
            "-",
            "Lorg/burnoutcrew/reorderable/d;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;F",
            "Lorg/burnoutcrew/reorderable/b;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lorg/burnoutcrew/reorderable/h;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    const-string v1, "onMove"

    .line 4
    .line 5
    move-object v6, p0

    .line 6
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const v1, 0x7459502c

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 13
    .line 14
    .line 15
    and-int/lit8 v2, p8, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v3, v3, v0, v3, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->rememberLazyGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v10, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v10, p1

    .line 28
    :goto_0
    and-int/lit8 v2, p8, 0x4

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move-object v7, v11

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v7, p2

    .line 36
    .line 37
    :goto_1
    and-int/lit8 v2, p8, 0x8

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move-object v8, v11

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move-object/from16 v8, p3

    .line 44
    .line 45
    :goto_2
    and-int/lit8 v2, p8, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    const/16 v2, 0x14

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move/from16 v2, p4

    .line 58
    .line 59
    :goto_3
    and-int/lit8 v3, p8, 0x20

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    new-instance v3, Lorg/burnoutcrew/reorderable/m;

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x1

    .line 67
    invoke-direct {v3, v4, v5, v11}, Lorg/burnoutcrew/reorderable/m;-><init>(FILkotlin/jvm/internal/w;)V

    .line 68
    .line 69
    .line 70
    move-object v9, v3

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move-object/from16 v9, p5

    .line 73
    .line 74
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    const/4 v3, -0x1

    .line 81
    const-string v4, "org.burnoutcrew.reorderable.rememberReorderableLazyGridState (ReorderableLazyGridState.kt:32)"

    .line 82
    .line 83
    move/from16 v5, p7

    .line 84
    .line 85
    invoke-static {v1, v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 97
    .line 98
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    const v1, 0x2e20b340

    .line 103
    .line 104
    .line 105
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 106
    .line 107
    .line 108
    const v1, -0x1d58f75c

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 119
    .line 120
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-ne v1, v2, :cond_6

    .line 125
    .line 126
    sget-object v1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 127
    .line 128
    invoke-static {v1, v0}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 133
    .line 134
    invoke-direct {v2, v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v1, v2

    .line 141
    :cond_6
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 142
    .line 143
    .line 144
    check-cast v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 145
    .line 146
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 151
    .line 152
    .line 153
    const v1, 0x44faf204

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-nez v2, :cond_7

    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-ne v3, v2, :cond_8

    .line 174
    .line 175
    :cond_7
    new-instance v13, Lorg/burnoutcrew/reorderable/h;

    .line 176
    .line 177
    move-object v2, v13

    .line 178
    move-object v3, v10

    .line 179
    move-object v6, p0

    .line 180
    invoke-direct/range {v2 .. v9}, Lorg/burnoutcrew/reorderable/h;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/s0;FLv3/p;Lv3/p;Lv3/p;Lorg/burnoutcrew/reorderable/b;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v3, v13

    .line 187
    :cond_8
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 188
    .line 189
    .line 190
    check-cast v3, Lorg/burnoutcrew/reorderable/h;

    .line 191
    .line 192
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-nez v1, :cond_9

    .line 204
    .line 205
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-ne v2, v1, :cond_a

    .line 210
    .line 211
    :cond_9
    new-instance v2, Lorg/burnoutcrew/reorderable/i$a;

    .line 212
    .line 213
    invoke-direct {v2, v3, v11}, Lorg/burnoutcrew/reorderable/i$a;-><init>(Lorg/burnoutcrew/reorderable/h;Lkotlin/coroutines/d;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_a
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 220
    .line 221
    .line 222
    check-cast v2, Lv3/p;

    .line 223
    .line 224
    const/16 v1, 0x40

    .line 225
    .line 226
    invoke-static {v3, v2, v0, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 227
    .line 228
    .line 229
    const v2, 0x1e7b2b64

    .line 230
    .line 231
    .line 232
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    or-int/2addr v2, v4

    .line 244
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-nez v2, :cond_b

    .line 249
    .line 250
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    if-ne v4, v2, :cond_c

    .line 255
    .line 256
    :cond_b
    new-instance v4, Lorg/burnoutcrew/reorderable/i$b;

    .line 257
    .line 258
    invoke-direct {v4, v3, v10, v11}, Lorg/burnoutcrew/reorderable/i$b;-><init>(Lorg/burnoutcrew/reorderable/h;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/d;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_c
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 265
    .line 266
    .line 267
    check-cast v4, Lv3/p;

    .line 268
    .line 269
    invoke-static {v3, v4, v0, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 270
    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_d

    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 279
    .line 280
    .line 281
    :cond_d
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 282
    .line 283
    .line 284
    return-object v3
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
.end method
