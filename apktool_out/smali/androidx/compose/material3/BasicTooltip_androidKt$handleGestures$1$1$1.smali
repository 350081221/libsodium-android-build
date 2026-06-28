.class final Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$1$1$1"
    f = "BasicTooltip.android.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0xa2,
        0xa8,
        0xb0
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "pass",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "pass"
    }
    s = {
        "L$0",
        "L$1",
        "J$0",
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


# instance fields
.field final synthetic $$this$coroutineScope:Lkotlinx/coroutines/s0;

.field final synthetic $state:Landroidx/compose/material3/BasicTooltipState;

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/s0;Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/material3/BasicTooltipState;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

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

    new-instance v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;

    iget-object v1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iget-object v2, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;-><init>(Lkotlinx/coroutines/s0;Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->label:I

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v10, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    if-eq v0, v9, :cond_1

    .line 18
    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v0, p1

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    iget-object v0, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 39
    .line 40
    iget-object v1, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 43
    .line 44
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 45
    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    iget-wide v0, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->J$0:J

    .line 50
    .line 51
    iget-object v2, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 54
    .line 55
    iget-object v3, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-wide v12, v0

    .line 63
    move-object v14, v2

    .line 64
    move-object v1, v3

    .line 65
    move-object/from16 v0, p1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v11, v0

    .line 74
    check-cast v11, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 75
    .line 76
    invoke-interface {v11}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v12

    .line 84
    sget-object v14, Landroidx/compose/ui/input/pointer/PointerEventPass;->Initial:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v4, 0x1

    .line 88
    const/4 v5, 0x0

    .line 89
    iput-object v11, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v14, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$1:Ljava/lang/Object;

    .line 92
    .line 93
    iput-wide v12, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->J$0:J

    .line 94
    .line 95
    iput v1, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->label:I

    .line 96
    .line 97
    move-object v0, v11

    .line 98
    move v1, v2

    .line 99
    move-object v2, v14

    .line 100
    move-object/from16 v3, p0

    .line 101
    .line 102
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v7, :cond_4

    .line 107
    .line 108
    return-object v7

    .line 109
    :cond_4
    move-object v1, v11

    .line 110
    :goto_0
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v0, v3}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getStylus-T8wyACA()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-static {v0, v2}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    :cond_5
    :try_start_1
    new-instance v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1$1;

    .line 139
    .line 140
    invoke-direct {v0, v14, v10}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1$1;-><init>(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)V

    .line 141
    .line 142
    .line 143
    iput-object v1, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v14, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$1:Ljava/lang/Object;

    .line 146
    .line 147
    iput v9, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->label:I

    .line 148
    .line 149
    invoke-interface {v1, v12, v13, v0, v6}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeout(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    if-ne v0, v7, :cond_7

    .line 154
    .line 155
    return-object v7

    .line 156
    :catch_0
    move-object v0, v14

    .line 157
    :catch_1
    iget-object v11, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    const/4 v13, 0x0

    .line 161
    new-instance v14, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1$2;

    .line 162
    .line 163
    iget-object v2, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

    .line 164
    .line 165
    invoke-direct {v14, v2, v10}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1$2;-><init>(Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V

    .line 166
    .line 167
    .line 168
    const/4 v15, 0x3

    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 172
    .line 173
    .line 174
    iput-object v10, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$0:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v10, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    iput v8, v6, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$1$1$1;->label:I

    .line 179
    .line 180
    invoke-interface {v1, v0, v6}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-ne v0, v7, :cond_6

    .line 185
    .line 186
    return-object v7

    .line 187
    :cond_6
    :goto_1
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    const/4 v2, 0x0

    .line 198
    :goto_2
    if-ge v2, v1, :cond_7

    .line 199
    .line 200
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 205
    .line 206
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 207
    .line 208
    .line 209
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 213
    .line 214
    return-object v0
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
