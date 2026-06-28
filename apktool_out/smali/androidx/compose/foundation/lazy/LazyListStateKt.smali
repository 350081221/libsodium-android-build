.class public final Landroidx/compose/foundation/lazy/LazyListStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "DeltaThresholdForScrollAnimation",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "EmptyLazyListMeasureResult",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "NumberOfItemsToTeleport",
        "",
        "rememberLazyListState",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "initialFirstVisibleItemIndex",
        "initialFirstVisibleItemScrollOffset",
        "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,567:1\n1116#2,6:568\n154#3:574\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n79#1:568,6\n540#1:574\n*E\n"
    }
.end annotation


# static fields
.field private static final DeltaThresholdForScrollAnimation:F

.field private static final EmptyLazyListMeasureResult:Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final NumberOfItemsToTeleport:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/foundation/lazy/LazyListStateKt;->DeltaThresholdForScrollAnimation:F

    .line 8
    .line 9
    new-instance v6, Landroidx/compose/foundation/lazy/LazyListStateKt$EmptyLazyListMeasureResult$1;

    .line 10
    .line 11
    invoke-direct {v6}, Landroidx/compose/foundation/lazy/LazyListStateKt$EmptyLazyListMeasureResult$1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    sget-object v14, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 19
    .line 20
    new-instance v0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    invoke-direct/range {v1 .. v16}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Landroidx/compose/foundation/lazy/LazyListStateKt;->EmptyLazyListMeasureResult:Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    .line 40
    .line 41
    return-void
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
.end method

.method public static final synthetic access$getDeltaThresholdForScrollAnimation$p()F
    .locals 1

    sget v0, Landroidx/compose/foundation/lazy/LazyListStateKt;->DeltaThresholdForScrollAnimation:F

    return v0
.end method

.method public static final synthetic access$getEmptyLazyListMeasureResult$p()Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/lazy/LazyListStateKt;->EmptyLazyListMeasureResult:Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    return-object v0
.end method

.method public static final rememberLazyListState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;
    .locals 10
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x57a86af4

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p4, 0x1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move p0, v2

    .line 13
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    move p1, v2

    .line 18
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    if-eqz p4, :cond_2

    .line 23
    .line 24
    const/4 p4, -0x1

    .line 25
    const-string v1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)"

    .line 26
    .line 27
    invoke-static {v0, p3, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    new-array v3, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    sget-object p3, Landroidx/compose/foundation/lazy/LazyListState;->Companion:Landroidx/compose/foundation/lazy/LazyListState$Companion;

    .line 33
    .line 34
    invoke-virtual {p3}, Landroidx/compose/foundation/lazy/LazyListState$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x0

    .line 39
    const p3, -0x623ff0f4

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    or-int/2addr p3, p4

    .line 54
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    if-nez p3, :cond_3

    .line 59
    .line 60
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 61
    .line 62
    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p4, p3, :cond_4

    .line 67
    .line 68
    :cond_3
    new-instance p4, Landroidx/compose/foundation/lazy/LazyListStateKt$rememberLazyListState$1$1;

    .line 69
    .line 70
    invoke-direct {p4, p0, p1}, Landroidx/compose/foundation/lazy/LazyListStateKt$rememberLazyListState$1$1;-><init>(II)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    move-object v6, p4

    .line 77
    check-cast v6, Lv3/a;

    .line 78
    .line 79
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 80
    .line 81
    .line 82
    const/16 v8, 0x48

    .line 83
    .line 84
    const/4 v9, 0x4

    .line 85
    move-object v7, p2

    .line 86
    invoke-static/range {v3 .. v9}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Landroidx/compose/foundation/lazy/LazyListState;

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 102
    .line 103
    .line 104
    return-object p0
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
.end method
