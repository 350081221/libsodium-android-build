.class final Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt;->detectPressDownGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2"
    f = "PressDownGesture.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x20,
        0x26
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "down"
    }
    s = {
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/r2;",
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
        "SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,44:1\n101#2,2:45\n33#2,6:47\n103#2:53\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n39#1:45,2\n39#1:47,6\n39#1:53\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $onDown:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

.field final synthetic $onUp:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lv3/a;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onDown:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onUp:Lv3/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onDown:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onUp:Lv3/a;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lv3/a;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->label:I

    .line 8
    .line 9
    const/4 v8, 0x2

    .line 10
    const/4 v9, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v9, :cond_1

    .line 14
    .line 15
    if-ne v0, v8, :cond_0

    .line 16
    .line 17
    iget-object v0, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 20
    .line 21
    iget-object v1, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v3, p1

    .line 29
    .line 30
    move-object v2, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget-object v0, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v10, v0

    .line 48
    move-object/from16 v0, p1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v10, v0

    .line 57
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    const/4 v2, 0x0

    .line 61
    const/4 v4, 0x2

    .line 62
    const/4 v5, 0x0

    .line 63
    iput-object v10, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v9, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->label:I

    .line 66
    .line 67
    move-object v0, v10

    .line 68
    move-object/from16 v3, p0

    .line 69
    .line 70
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v7, :cond_3

    .line 75
    .line 76
    return-object v7

    .line 77
    :cond_3
    :goto_0
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 78
    .line 79
    iget-object v1, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onDown:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-interface {v1, v2, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;->onEvent-k-4lQ0M(J)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v6, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onUp:Lv3/a;

    .line 89
    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    move-object v2, v6

    .line 93
    move-object v1, v10

    .line 94
    :cond_4
    iput-object v1, v2, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v0, v2, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput v8, v2, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->label:I

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {v1, v3, v2, v9, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-ne v3, v7, :cond_5

    .line 106
    .line 107
    return-object v7

    .line 108
    :cond_5
    :goto_1
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/4 v5, 0x0

    .line 119
    move v10, v5

    .line 120
    :goto_2
    if-ge v10, v4, :cond_8

    .line 121
    .line 122
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 127
    .line 128
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 129
    .line 130
    .line 131
    move-result-wide v12

    .line 132
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 133
    .line 134
    .line 135
    move-result-wide v14

    .line 136
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_6

    .line 141
    .line 142
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_6

    .line 147
    .line 148
    move v11, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move v11, v5

    .line 151
    :goto_3
    if-eqz v11, :cond_7

    .line 152
    .line 153
    move v5, v9

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    :goto_4
    if-nez v5, :cond_4

    .line 159
    .line 160
    iget-object v0, v2, Landroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2;->$onUp:Lv3/a;

    .line 161
    .line 162
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    :cond_9
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 166
    .line 167
    return-object v0
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
