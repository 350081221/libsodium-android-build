.class final Lorg/burnoutcrew/reorderable/c$b$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/burnoutcrew/reorderable/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "org.burnoutcrew.reorderable.DragGestureKt$awaitLongPressOrCancellation$2$1"
    f = "DragGesture.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x67,
        0x78
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "finished",
        "$this$awaitPointerEventScope",
        "event",
        "finished"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "L$1",
        "I$0"
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
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $currentDown:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $longPress:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lorg/burnoutcrew/reorderable/c$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/c$b$a;->$currentDown:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Lorg/burnoutcrew/reorderable/c$b$a;->$longPress:Lkotlin/jvm/internal/k1$h;

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

    new-instance v0, Lorg/burnoutcrew/reorderable/c$b$a;

    iget-object v1, p0, Lorg/burnoutcrew/reorderable/c$b$a;->$currentDown:Lkotlin/jvm/internal/k1$h;

    iget-object v2, p0, Lorg/burnoutcrew/reorderable/c$b$a;->$longPress:Lkotlin/jvm/internal/k1$h;

    invoke-direct {v0, v1, v2, p2}, Lorg/burnoutcrew/reorderable/c$b$a;-><init>(Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/c$b$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lorg/burnoutcrew/reorderable/c$b$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lorg/burnoutcrew/reorderable/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lorg/burnoutcrew/reorderable/c$b$a;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
    iget v2, v0, Lorg/burnoutcrew/reorderable/c$b$a;->label:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v6, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    iget v2, v0, Lorg/burnoutcrew/reorderable/c$b$a;->I$0:I

    .line 19
    .line 20
    iget-object v7, v0, Lorg/burnoutcrew/reorderable/c$b$a;->L$1:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 23
    .line 24
    iget-object v8, v0, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v4, p1

    .line 32
    .line 33
    move-object v5, v0

    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    iget v2, v0, Lorg/burnoutcrew/reorderable/c$b$a;->I$0:I

    .line 45
    .line 46
    iget-object v7, v0, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object/from16 v9, p1

    .line 54
    .line 55
    move-object v8, v7

    .line 56
    move-object v7, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v0, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 64
    .line 65
    move-object v8, v0

    .line 66
    move-object v7, v2

    .line 67
    const/4 v2, 0x0

    .line 68
    :goto_0
    if-nez v2, :cond_16

    .line 69
    .line 70
    sget-object v9, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 71
    .line 72
    iput-object v7, v8, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, v8, Lorg/burnoutcrew/reorderable/c$b$a;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    iput v2, v8, Lorg/burnoutcrew/reorderable/c$b$a;->I$0:I

    .line 77
    .line 78
    iput v6, v8, Lorg/burnoutcrew/reorderable/c$b$a;->label:I

    .line 79
    .line 80
    invoke-interface {v7, v9, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    if-ne v9, v1, :cond_3

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_3
    move-object/from16 v16, v8

    .line 88
    .line 89
    move-object v8, v7

    .line 90
    move-object/from16 v7, v16

    .line 91
    .line 92
    :goto_1
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 93
    .line 94
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    const/4 v12, 0x0

    .line 103
    :goto_2
    if-ge v12, v11, :cond_5

    .line 104
    .line 105
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 110
    .line 111
    invoke-static {v13}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-nez v13, :cond_4

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    move v10, v6

    .line 123
    :goto_3
    if-eqz v10, :cond_6

    .line 124
    .line 125
    move v2, v6

    .line 126
    :cond_6
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    const/4 v12, 0x0

    .line 135
    :goto_4
    if-ge v12, v11, :cond_a

    .line 136
    .line 137
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 142
    .line 143
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-nez v14, :cond_8

    .line 148
    .line 149
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getSize-YbymL2g()J

    .line 150
    .line 151
    .line 152
    move-result-wide v14

    .line 153
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getExtendedTouchPadding-NH-jbRc()J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    invoke-static {v13, v14, v15, v4, v5}, Landroidx/compose/ui/input/pointer/PointerEventKt;->isOutOfBounds-jwHxaWs(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_7

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    const/4 v4, 0x0

    .line 165
    goto :goto_6

    .line 166
    :cond_8
    :goto_5
    move v4, v6

    .line 167
    :goto_6
    if-eqz v4, :cond_9

    .line 168
    .line 169
    move v4, v6

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    goto :goto_4

    .line 175
    :cond_a
    const/4 v4, 0x0

    .line 176
    :goto_7
    if-eqz v4, :cond_b

    .line 177
    .line 178
    move v2, v6

    .line 179
    :cond_b
    sget-object v4, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 180
    .line 181
    iput-object v8, v7, Lorg/burnoutcrew/reorderable/c$b$a;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v9, v7, Lorg/burnoutcrew/reorderable/c$b$a;->L$1:Ljava/lang/Object;

    .line 184
    .line 185
    iput v2, v7, Lorg/burnoutcrew/reorderable/c$b$a;->I$0:I

    .line 186
    .line 187
    iput v3, v7, Lorg/burnoutcrew/reorderable/c$b$a;->label:I

    .line 188
    .line 189
    invoke-interface {v8, v4, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-ne v4, v1, :cond_c

    .line 194
    .line 195
    return-object v1

    .line 196
    :cond_c
    move-object v5, v7

    .line 197
    move-object v7, v9

    .line 198
    :goto_8
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 199
    .line 200
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    const/4 v10, 0x0

    .line 209
    :goto_9
    if-ge v10, v9, :cond_e

    .line 210
    .line 211
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 216
    .line 217
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    if-eqz v11, :cond_d

    .line 222
    .line 223
    move v4, v6

    .line 224
    goto :goto_a

    .line 225
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_e
    const/4 v4, 0x0

    .line 229
    :goto_a
    if-eqz v4, :cond_f

    .line 230
    .line 231
    move v2, v6

    .line 232
    :cond_f
    iget-object v4, v5, Lorg/burnoutcrew/reorderable/c$b$a;->$currentDown:Lkotlin/jvm/internal/k1$h;

    .line 233
    .line 234
    iget-object v4, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 237
    .line 238
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 239
    .line 240
    .line 241
    move-result-wide v9

    .line 242
    invoke-static {v7, v9, v10}, Lorg/burnoutcrew/reorderable/c;->a(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-nez v4, :cond_12

    .line 247
    .line 248
    iget-object v4, v5, Lorg/burnoutcrew/reorderable/c$b$a;->$longPress:Lkotlin/jvm/internal/k1$h;

    .line 249
    .line 250
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    iget-object v9, v5, Lorg/burnoutcrew/reorderable/c$b$a;->$currentDown:Lkotlin/jvm/internal/k1$h;

    .line 255
    .line 256
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    const/4 v11, 0x0

    .line 261
    :goto_b
    if-ge v11, v10, :cond_11

    .line 262
    .line 263
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    move-object v13, v12

    .line 268
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 269
    .line 270
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 271
    .line 272
    .line 273
    move-result-wide v13

    .line 274
    iget-object v15, v9, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 277
    .line 278
    move-object/from16 p1, v7

    .line 279
    .line 280
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    invoke-static {v13, v14, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_10

    .line 289
    .line 290
    goto :goto_c

    .line 291
    :cond_10
    add-int/lit8 v11, v11, 0x1

    .line 292
    .line 293
    move-object/from16 v7, p1

    .line 294
    .line 295
    const/4 v6, 0x1

    .line 296
    goto :goto_b

    .line 297
    :cond_11
    const/4 v12, 0x0

    .line 298
    :goto_c
    iput-object v12, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 299
    .line 300
    goto :goto_f

    .line 301
    :cond_12
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    const/4 v7, 0x0

    .line 310
    :goto_d
    if-ge v7, v6, :cond_14

    .line 311
    .line 312
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    move-object v10, v9

    .line 317
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 318
    .line 319
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    if-eqz v10, :cond_13

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_14
    const/4 v9, 0x0

    .line 330
    :goto_e
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 331
    .line 332
    if-eqz v9, :cond_15

    .line 333
    .line 334
    iget-object v4, v5, Lorg/burnoutcrew/reorderable/c$b$a;->$currentDown:Lkotlin/jvm/internal/k1$h;

    .line 335
    .line 336
    iput-object v9, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 337
    .line 338
    iget-object v4, v5, Lorg/burnoutcrew/reorderable/c$b$a;->$longPress:Lkotlin/jvm/internal/k1$h;

    .line 339
    .line 340
    iput-object v9, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 341
    .line 342
    :goto_f
    move-object v7, v8

    .line 343
    :goto_10
    const/4 v4, 0x0

    .line 344
    const/4 v6, 0x1

    .line 345
    move-object v8, v5

    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_15
    move-object v7, v8

    .line 349
    const/4 v2, 0x1

    .line 350
    goto :goto_10

    .line 351
    :cond_16
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 352
    .line 353
    return-object v1
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
.end method
