.class public final Lorg/burnoutcrew/reorderable/k;
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
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "listState",
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
        "Lorg/burnoutcrew/reorderable/j;",
        "a",
        "(Lv3/p;Landroidx/compose/foundation/lazy/LazyListState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/j;",
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
.method public static final a(Lv3/p;Landroidx/compose/foundation/lazy/LazyListState;Lv3/p;Lv3/p;FLorg/burnoutcrew/reorderable/b;Landroidx/compose/runtime/Composer;II)Lorg/burnoutcrew/reorderable/j;
    .locals 16
    .param p0    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/lazy/LazyListState;
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
            "Landroidx/compose/foundation/lazy/LazyListState;",
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
            "Lorg/burnoutcrew/reorderable/j;"
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
    move-object/from16 v6, p0

    .line 6
    .line 7
    invoke-static {v6, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v1, -0x30c243d4

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 14
    .line 15
    .line 16
    and-int/lit8 v2, p8, 0x2

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {v10, v10, v0, v10, v2}, Landroidx/compose/foundation/lazy/LazyListStateKt;->rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v11, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object/from16 v11, p1

    .line 29
    .line 30
    :goto_0
    and-int/lit8 v2, p8, 0x4

    .line 31
    .line 32
    const/4 v12, 0x0

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    move-object v7, v12

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object/from16 v7, p2

    .line 38
    .line 39
    :goto_1
    and-int/lit8 v2, p8, 0x8

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move-object v8, v12

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object/from16 v8, p3

    .line 46
    .line 47
    :goto_2
    and-int/lit8 v2, p8, 0x10

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    const/16 v2, 0x14

    .line 52
    .line 53
    int-to-float v2, v2

    .line 54
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move/from16 v2, p4

    .line 60
    .line 61
    :goto_3
    and-int/lit8 v3, p8, 0x20

    .line 62
    .line 63
    const/4 v13, 0x1

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    new-instance v3, Lorg/burnoutcrew/reorderable/m;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, v4, v13, v12}, Lorg/burnoutcrew/reorderable/m;-><init>(FILkotlin/jvm/internal/w;)V

    .line 70
    .line 71
    .line 72
    move-object v9, v3

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    move-object/from16 v9, p5

    .line 75
    .line 76
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    const/4 v3, -0x1

    .line 83
    const-string v4, "org.burnoutcrew.reorderable.rememberReorderableLazyListState (ReorderableLazyListState.kt:36)"

    .line 84
    .line 85
    move/from16 v5, p7

    .line 86
    .line 87
    invoke-static {v1, v5, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 99
    .line 100
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const v1, 0x2e20b340

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 108
    .line 109
    .line 110
    const v1, -0x1d58f75c

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 114
    .line 115
    .line 116
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 121
    .line 122
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-ne v1, v2, :cond_6

    .line 127
    .line 128
    sget-object v1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 129
    .line 130
    invoke-static {v1, v0}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 135
    .line 136
    invoke-direct {v2, v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v1, v2

    .line 143
    :cond_6
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 144
    .line 145
    .line 146
    check-cast v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 153
    .line 154
    .line 155
    const v1, 0x44faf204

    .line 156
    .line 157
    .line 158
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    if-nez v2, :cond_7

    .line 170
    .line 171
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-ne v3, v2, :cond_8

    .line 176
    .line 177
    :cond_7
    new-instance v15, Lorg/burnoutcrew/reorderable/j;

    .line 178
    .line 179
    move-object v2, v15

    .line 180
    move-object v3, v11

    .line 181
    move-object/from16 v6, p0

    .line 182
    .line 183
    invoke-direct/range {v2 .. v9}, Lorg/burnoutcrew/reorderable/j;-><init>(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;FLv3/p;Lv3/p;Lv3/p;Lorg/burnoutcrew/reorderable/b;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v3, v15

    .line 190
    :cond_8
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 191
    .line 192
    .line 193
    check-cast v3, Lorg/burnoutcrew/reorderable/j;

    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    sget-object v4, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 204
    .line 205
    if-ne v2, v4, :cond_9

    .line 206
    .line 207
    move v10, v13

    .line 208
    :cond_9
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v1, :cond_a

    .line 220
    .line 221
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-ne v2, v1, :cond_b

    .line 226
    .line 227
    :cond_a
    new-instance v2, Lorg/burnoutcrew/reorderable/k$a;

    .line 228
    .line 229
    invoke-direct {v2, v3, v12}, Lorg/burnoutcrew/reorderable/k$a;-><init>(Lorg/burnoutcrew/reorderable/j;Lkotlin/coroutines/d;)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_b
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 236
    .line 237
    .line 238
    check-cast v2, Lv3/p;

    .line 239
    .line 240
    const/16 v1, 0x40

    .line 241
    .line 242
    invoke-static {v3, v2, v0, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 243
    .line 244
    .line 245
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const v4, 0x607fb4c4

    .line 250
    .line 251
    .line 252
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    or-int/2addr v2, v4

    .line 264
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    or-int/2addr v2, v4

    .line 269
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    if-nez v2, :cond_c

    .line 274
    .line 275
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    if-ne v4, v2, :cond_d

    .line 280
    .line 281
    :cond_c
    new-instance v4, Lorg/burnoutcrew/reorderable/k$b;

    .line 282
    .line 283
    invoke-direct {v4, v11, v10, v3, v12}, Lorg/burnoutcrew/reorderable/k$b;-><init>(Landroidx/compose/foundation/lazy/LazyListState;ZLorg/burnoutcrew/reorderable/j;Lkotlin/coroutines/d;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_d
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 290
    .line 291
    .line 292
    check-cast v4, Lv3/p;

    .line 293
    .line 294
    invoke-static {v3, v4, v0, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_e

    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 304
    .line 305
    .line 306
    :cond_e
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 307
    .line 308
    .line 309
    return-object v3
.end method
