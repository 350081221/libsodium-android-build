.class final Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1"
    f = "BasicTooltip.android.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "pass"
    }
    s = {
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
            "Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iput-object p2, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

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

    new-instance v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;

    iget-object v1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iget-object v2, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;-><init>(Lkotlinx/coroutines/s0;Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
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
    iget v1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v4, v3

    .line 24
    move-object v3, v1

    .line 25
    move-object v1, v0

    .line 26
    move-object v0, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 42
    .line 43
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 44
    .line 45
    move-object v3, p1

    .line 46
    move-object p1, p0

    .line 47
    :goto_0
    iput-object v3, p1, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v1, p1, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    iput v2, p1, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->label:I

    .line 52
    .line 53
    invoke-interface {v3, v1, p1}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-ne v4, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v13, v0

    .line 61
    move-object v0, p1

    .line 62
    move-object p1, v4

    .line 63
    move-object v4, v3

    .line 64
    move-object v3, v1

    .line 65
    move-object v1, v13

    .line 66
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const/4 v6, 0x0

    .line 73
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 78
    .line 79
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    sget-object v6, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 84
    .line 85
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-static {v5, v6}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getType-7fucELk()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    sget-object v5, Landroidx/compose/ui/input/pointer/PointerEventType;->Companion:Landroidx/compose/ui/input/pointer/PointerEventType$Companion;

    .line 100
    .line 101
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerEventType$Companion;->getEnter-7fucELk()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-static {p1, v6}, Landroidx/compose/ui/input/pointer/PointerEventType;->equals-impl0(II)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    iget-object v7, v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    new-instance v10, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1$1;

    .line 116
    .line 117
    iget-object p1, v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    invoke-direct {v10, p1, v5}, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1$1;-><init>(Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V

    .line 121
    .line 122
    .line 123
    const/4 v11, 0x3

    .line 124
    const/4 v12, 0x0

    .line 125
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerEventType$Companion;->getExit-7fucELk()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-static {p1, v5}, Landroidx/compose/ui/input/pointer/PointerEventType;->equals-impl0(II)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    iget-object p1, v0, Landroidx/compose/material3/BasicTooltip_androidKt$handleGestures$2$1$1;->$state:Landroidx/compose/material3/BasicTooltipState;

    .line 140
    .line 141
    invoke-interface {p1}, Landroidx/compose/material3/BasicTooltipState;->dismiss()V

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_2
    move-object p1, v0

    .line 145
    move-object v0, v1

    .line 146
    move-object v1, v3

    .line 147
    move-object v3, v4

    .line 148
    goto :goto_0
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
