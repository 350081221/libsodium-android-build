.class final Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1"
    f = "Scrollable.kt"
    i = {
        0x0
    }
    l = {
        0x29f
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope"
    }
    s = {
        "L$0"
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
        "SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1021:1\n86#2,2:1022\n33#2,6:1024\n88#2:1030\n33#2,6:1031\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1\n*L\n672#1:1022,2\n672#1:1024,6\n672#1:1030\n688#1:1031,6\n*E\n"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/MouseWheelScrollNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 2
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

    new-instance v0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollNode;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;-><init>(Landroidx/compose/foundation/gestures/MouseWheelScrollNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v5, p1

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 39
    .line 40
    move-object v4, v0

    .line 41
    :cond_2
    iput-object v2, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    iput v3, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->label:I

    .line 44
    .line 45
    invoke-static {v2, v4}, Landroidx/compose/foundation/gestures/ScrollableKt;->access$awaitScrollEvent(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-ne v5, v1, :cond_3

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_3
    :goto_0
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 53
    .line 54
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v8, 0x0

    .line 63
    move v9, v8

    .line 64
    :goto_1
    if-ge v9, v7, :cond_5

    .line 65
    .line 66
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 71
    .line 72
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    xor-int/2addr v10, v3

    .line 77
    if-nez v10, :cond_4

    .line 78
    .line 79
    move v6, v8

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    move v6, v3

    .line 85
    :goto_2
    if-eqz v6, :cond_2

    .line 86
    .line 87
    iget-object v6, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollNode;

    .line 88
    .line 89
    invoke-virtual {v6}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->getScrollConfig()Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-static {v6}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v7, v4, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollNode;

    .line 97
    .line 98
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getSize-YbymL2g()J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    invoke-interface {v6, v2, v5, v9, v10}, Landroidx/compose/foundation/gestures/ScrollConfig;->calculateMouseWheelScroll-8xgXZGE(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    invoke-static {v7}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->access$getScrollingLogic$p(Landroidx/compose/foundation/gestures/MouseWheelScrollNode;)Landroidx/compose/foundation/gestures/ScrollingLogic;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    new-instance v14, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1$2$1$1;

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    invoke-direct {v14, v6, v9, v10, v7}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1$1$2$1$1;-><init>(Landroidx/compose/foundation/gestures/ScrollingLogic;JLkotlin/coroutines/d;)V

    .line 120
    .line 121
    .line 122
    const/4 v15, 0x3

    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    :goto_3
    if-ge v8, v6, :cond_2

    .line 137
    .line 138
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 143
    .line 144
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v8, v8, 0x1

    .line 148
    .line 149
    goto :goto_3
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
