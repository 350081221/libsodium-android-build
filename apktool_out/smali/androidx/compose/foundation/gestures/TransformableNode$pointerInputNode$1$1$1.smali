.class final Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1"
    f = "Transformable.kt"
    i = {
        0x0,
        0x0,
        0x1
    }
    l = {
        0x9e,
        0xa1
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "event",
        "$this$launch"
    }
    s = {
        "L$0",
        "L$1",
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
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
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/TransformableNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/TransformableNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/TransformableNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->this$0:Landroidx/compose/foundation/gestures/TransformableNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->this$0:Landroidx/compose/foundation/gestures/TransformableNode;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;-><init>(Landroidx/compose/foundation/gestures/TransformableNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
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
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/s0;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    move-object p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$2:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlin/jvm/internal/k1$h;

    .line 35
    .line 36
    iget-object v4, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Lkotlin/jvm/internal/k1$h;

    .line 39
    .line 40
    iget-object v5, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Lkotlinx/coroutines/s0;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v6, v4

    .line 48
    move-object v4, p0

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 56
    .line 57
    :goto_0
    move-object v1, p0

    .line 58
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/t0;->k(Lkotlinx/coroutines/s0;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    new-instance v4, Lkotlin/jvm/internal/k1$h;

    .line 65
    .line 66
    invoke-direct {v4}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v5, v1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->this$0:Landroidx/compose/foundation/gestures/TransformableNode;

    .line 70
    .line 71
    invoke-static {v5}, Landroidx/compose/foundation/gestures/TransformableNode;->access$getChannel$p(Landroidx/compose/foundation/gestures/TransformableNode;)Lkotlinx/coroutines/channels/l;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iput-object p1, v1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v4, v1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v4, v1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, v1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->label:I

    .line 82
    .line 83
    invoke-interface {v5, v1}, Lkotlinx/coroutines/channels/g0;->D(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-ne v5, v0, :cond_3

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    move-object v6, v4

    .line 91
    move-object v4, v1

    .line 92
    move-object v1, v6

    .line 93
    move-object v10, v5

    .line 94
    move-object v5, p1

    .line 95
    move-object p1, v10

    .line 96
    :goto_2
    iput-object p1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object p1, v6, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 99
    .line 100
    instance-of p1, p1, Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;

    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    :try_start_1
    iget-object p1, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->this$0:Landroidx/compose/foundation/gestures/TransformableNode;

    .line 105
    .line 106
    invoke-static {p1}, Landroidx/compose/foundation/gestures/TransformableNode;->access$getState$p(Landroidx/compose/foundation/gestures/TransformableNode;)Landroidx/compose/foundation/gestures/TransformableState;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget-object v1, Landroidx/compose/foundation/MutatePriority;->UserInput:Landroidx/compose/foundation/MutatePriority;

    .line 111
    .line 112
    new-instance v7, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1$1;

    .line 113
    .line 114
    iget-object v8, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->this$0:Landroidx/compose/foundation/gestures/TransformableNode;

    .line 115
    .line 116
    const/4 v9, 0x0

    .line 117
    invoke-direct {v7, v6, v8, v9}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1$1;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/foundation/gestures/TransformableNode;Lkotlin/coroutines/d;)V

    .line 118
    .line 119
    .line 120
    iput-object v5, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v9, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v9, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    iput v2, v4, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1$1$1;->label:I

    .line 127
    .line 128
    invoke-interface {p1, v1, v7, v4}, Landroidx/compose/foundation/gestures/TransformableState;->transform(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 132
    if-ne p1, v0, :cond_4

    .line 133
    .line 134
    return-object v0

    .line 135
    :catch_1
    :cond_4
    move-object v1, v4

    .line 136
    move-object p1, v5

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    return-object p1
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
.end method
