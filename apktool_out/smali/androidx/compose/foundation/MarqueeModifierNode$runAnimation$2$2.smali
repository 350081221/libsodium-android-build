.class final Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Ljava/lang/Float;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2"
    f = "BasicMarquee.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x17c,
        0x17e,
        0x182,
        0x182
    }
    m = "invokeSuspend"
    n = {
        "contentWithSpacingWidth",
        "spec"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"
    }
    d2 = {
        "",
        "contentWithSpacingWidth",
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
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/MarqueeModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/MarqueeModifierNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MarqueeModifierNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

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

    new-instance v0, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;

    iget-object v1, p0, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;-><init>(Landroidx/compose/foundation/MarqueeModifierNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Float;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Float;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->invoke(Ljava/lang/Float;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v10

    .line 7
    iget v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->label:I

    .line 8
    .line 9
    const/4 v11, 0x4

    .line 10
    const/4 v12, 0x3

    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v13, 0x0

    .line 14
    const/4 v14, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    if-eq v0, v12, :cond_1

    .line 22
    .line 23
    if-eq v0, v11, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_0
    iget-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_2
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_3
    iget-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$1:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Landroidx/compose/animation/core/AnimationSpec;

    .line 58
    .line 59
    iget-object v2, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Ljava/lang/Float;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v3, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Float;

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_5
    iget-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 81
    .line 82
    invoke-static {v3}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getIterations$p(Landroidx/compose/foundation/MarqueeModifierNode;)I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v16

    .line 90
    iget-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 91
    .line 92
    invoke-static {v3}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getInitialDelayMillis$p(Landroidx/compose/foundation/MarqueeModifierNode;)I

    .line 93
    .line 94
    .line 95
    move-result v17

    .line 96
    iget-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 97
    .line 98
    invoke-static {v3}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getDelayMillis$p(Landroidx/compose/foundation/MarqueeModifierNode;)I

    .line 99
    .line 100
    .line 101
    move-result v18

    .line 102
    iget-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 103
    .line 104
    invoke-static {v3}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getVelocity$p(Landroidx/compose/foundation/MarqueeModifierNode;)F

    .line 105
    .line 106
    .line 107
    move-result v19

    .line 108
    iget-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 109
    .line 110
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireDensity(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;

    .line 111
    .line 112
    .line 113
    move-result-object v20

    .line 114
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BasicMarqueeKt;->access$createMarqueeAnimationSpec-Z4HSEVQ(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iget-object v4, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 119
    .line 120
    invoke-static {v4}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getOffset$p(Landroidx/compose/foundation/MarqueeModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iput-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v3, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$1:Ljava/lang/Object;

    .line 131
    .line 132
    iput v2, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->label:I

    .line 133
    .line 134
    invoke-virtual {v4, v5, v9}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-ne v2, v10, :cond_6

    .line 139
    .line 140
    return-object v10

    .line 141
    :cond_6
    move-object v2, v0

    .line 142
    :goto_0
    :try_start_1
    iget-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 143
    .line 144
    invoke-static {v0}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getOffset$p(Landroidx/compose/foundation/MarqueeModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    const/16 v7, 0xc

    .line 151
    .line 152
    const/4 v8, 0x0

    .line 153
    iput-object v13, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v13, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    iput v1, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->label:I

    .line 158
    .line 159
    move-object v1, v0

    .line 160
    move-object/from16 v6, p0

    .line 161
    .line 162
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/Animatable;->animateTo$default(Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    if-ne v0, v10, :cond_7

    .line 167
    .line 168
    return-object v10

    .line 169
    :cond_7
    :goto_1
    iget-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 170
    .line 171
    invoke-static {v0}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getOffset$p(Landroidx/compose/foundation/MarqueeModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iput v12, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->label:I

    .line 180
    .line 181
    invoke-virtual {v0, v1, v9}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-ne v0, v10, :cond_8

    .line 186
    .line 187
    return-object v10

    .line 188
    :cond_8
    :goto_2
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 189
    .line 190
    return-object v0

    .line 191
    :goto_3
    iget-object v1, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->this$0:Landroidx/compose/foundation/MarqueeModifierNode;

    .line 192
    .line 193
    invoke-static {v1}, Landroidx/compose/foundation/MarqueeModifierNode;->access$getOffset$p(Landroidx/compose/foundation/MarqueeModifierNode;)Landroidx/compose/animation/core/Animatable;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iput-object v0, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$0:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v13, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->L$1:Ljava/lang/Object;

    .line 204
    .line 205
    iput v11, v9, Landroidx/compose/foundation/MarqueeModifierNode$runAnimation$2$2;->label:I

    .line 206
    .line 207
    invoke-virtual {v1, v2, v9}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-ne v1, v10, :cond_9

    .line 212
    .line 213
    return-object v10

    .line 214
    :cond_9
    :goto_4
    throw v0
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
