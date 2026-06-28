.class final Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;->fling(Landroidx/compose/foundation/gestures/ScrollScope;FLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
        "Landroidx/compose/foundation/gestures/snapping/AnimationResult<",
        "Ljava/lang/Float;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1"
    f = "SnapFlingBehavior.kt"
    i = {
        0x0
    }
    l = {
        0xae,
        0xbb
    }
    m = "invokeSuspend"
    n = {
        "remainingScrollOffset"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Landroidx/compose/foundation/gestures/snapping/AnimationResult;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
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
        "SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,538:1\n534#2,4:539\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n185#1:539,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $initialVelocity:F

.field final synthetic $onRemainingScrollOffsetUpdate:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_fling:Landroidx/compose/foundation/gestures/ScrollScope;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;FLv3/l;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;",
            "F",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    iput p2, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$initialVelocity:F

    iput-object p3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$onRemainingScrollOffsetUpdate:Lv3/l;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$this_fling:Landroidx/compose/foundation/gestures/ScrollScope;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 6
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

    new-instance p1, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    iget v2, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$initialVelocity:F

    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$onRemainingScrollOffsetUpdate:Lv3/l;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$this_fling:Landroidx/compose/foundation/gestures/ScrollScope;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;-><init>(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;FLv3/l;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
            "Landroidx/compose/foundation/gestures/snapping/AnimationResult<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->label:I

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
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->L$0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lkotlin/jvm/internal/k1$e;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 40
    .line 41
    invoke-static {p1}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;->access$getSnapLayoutInfoProvider$p(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$initialVelocity:F

    .line 46
    .line 47
    invoke-interface {p1, v1}, Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;->calculateApproachOffset(F)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$initialVelocity:F

    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    mul-float/2addr p1, v1

    .line 62
    new-instance v1, Lkotlin/jvm/internal/k1$e;

    .line 63
    .line 64
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 65
    .line 66
    .line 67
    iput p1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 68
    .line 69
    iget-object v4, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$onRemainingScrollOffsetUpdate:Lv3/l;

    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {v4, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v5, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 79
    .line 80
    iget-object v6, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$this_fling:Landroidx/compose/foundation/gestures/ScrollScope;

    .line 81
    .line 82
    iget v7, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 83
    .line 84
    iget v8, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$initialVelocity:F

    .line 85
    .line 86
    new-instance v9, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1$animationState$1;

    .line 87
    .line 88
    iget-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$onRemainingScrollOffsetUpdate:Lv3/l;

    .line 89
    .line 90
    invoke-direct {v9, v1, p1}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1$animationState$1;-><init>(Lkotlin/jvm/internal/k1$e;Lv3/l;)V

    .line 91
    .line 92
    .line 93
    iput-object v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput v3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->label:I

    .line 96
    .line 97
    move-object v10, p0

    .line 98
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;->access$tryApproach(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;Landroidx/compose/foundation/gestures/ScrollScope;FFLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_3

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_3
    :goto_0
    move-object v3, p1

    .line 106
    check-cast v3, Landroidx/compose/animation/core/AnimationState;

    .line 107
    .line 108
    iget-object p1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 109
    .line 110
    invoke-static {p1}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;->access$getSnapLayoutInfoProvider$p(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v3}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-interface {p1, v4}, Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;->calculateSnappingOffset(F)F

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iput p1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 129
    .line 130
    iget-object v13, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$this_fling:Landroidx/compose/foundation/gestures/ScrollScope;

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    const-wide/16 v6, 0x0

    .line 135
    .line 136
    const-wide/16 v8, 0x0

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    const/16 v11, 0x1e

    .line 140
    .line 141
    const/4 v12, 0x0

    .line 142
    invoke-static/range {v3 .. v12}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->this$0:Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;

    .line 147
    .line 148
    invoke-static {v3}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;->access$getSnapAnimationSpec$p(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;)Landroidx/compose/animation/core/AnimationSpec;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    new-instance v10, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1$2;

    .line 153
    .line 154
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->$onRemainingScrollOffsetUpdate:Lv3/l;

    .line 155
    .line 156
    invoke-direct {v10, v1, v3}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1$2;-><init>(Lkotlin/jvm/internal/k1$e;Lv3/l;)V

    .line 157
    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    iput-object v1, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->L$0:Ljava/lang/Object;

    .line 161
    .line 162
    iput v2, p0, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1;->label:I

    .line 163
    .line 164
    move-object v5, v13

    .line 165
    move v6, p1

    .line 166
    move v7, p1

    .line 167
    move-object v11, p0

    .line 168
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt;->access$animateWithTarget(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v0, :cond_4

    .line 173
    .line 174
    return-object v0

    .line 175
    :cond_4
    :goto_1
    return-object p1
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
