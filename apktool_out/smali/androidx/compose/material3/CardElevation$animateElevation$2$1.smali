.class final Landroidx/compose/material3/CardElevation$animateElevation$2$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/CardElevation;->animateElevation(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
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
    c = "androidx.compose.material3.CardElevation$animateElevation$2$1"
    f = "Card.kt"
    i = {}
    l = {
        0x2dc,
        0x2e5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
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
.field final synthetic $animatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $interaction:Landroidx/compose/foundation/interaction/Interaction;

.field final synthetic $target:F

.field label:I

.field final synthetic this$0:Landroidx/compose/material3/CardElevation;


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Animatable;FZLandroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;FZ",
            "Landroidx/compose/material3/CardElevation;",
            "Landroidx/compose/foundation/interaction/Interaction;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/CardElevation$animateElevation$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    iput p2, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$target:F

    iput-boolean p3, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$enabled:Z

    iput-object p4, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    iput-object p5, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 7
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

    new-instance p1, Landroidx/compose/material3/CardElevation$animateElevation$2$1;

    iget-object v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    iget v2, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$target:F

    iget-boolean v3, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$enabled:Z

    iget-object v4, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    iget-object v5, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/CardElevation$animateElevation$2$1;-><init>(Landroidx/compose/animation/core/Animatable;FZLandroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/CardElevation$animateElevation$2$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
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
    iget v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->label:I

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
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroidx/compose/ui/unit/Dp;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iget v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$target:F

    .line 45
    .line 46
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_8

    .line 51
    .line 52
    iget-boolean p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$enabled:Z

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 57
    .line 58
    iget v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$target:F

    .line 59
    .line 60
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput v3, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->label:I

    .line 65
    .line 66
    invoke-virtual {p1, v1, p0}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_8

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_3
    iget-object p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroidx/compose/ui/unit/Dp;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iget-object v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    .line 86
    .line 87
    invoke-static {v1}, Landroidx/compose/material3/CardElevation;->access$getPressedElevation$p(Landroidx/compose/material3/CardElevation;)F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/4 v3, 0x0

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    new-instance p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 99
    .line 100
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    invoke-direct {p1, v4, v5, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/w;)V

    .line 107
    .line 108
    .line 109
    move-object v3, p1

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    iget-object v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    .line 112
    .line 113
    invoke-static {v1}, Landroidx/compose/material3/CardElevation;->access$getHoveredElevation$p(Landroidx/compose/material3/CardElevation;)F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    new-instance v3, Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 124
    .line 125
    invoke-direct {v3}, Landroidx/compose/foundation/interaction/HoverInteraction$Enter;-><init>()V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    iget-object v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    .line 130
    .line 131
    invoke-static {v1}, Landroidx/compose/material3/CardElevation;->access$getFocusedElevation$p(Landroidx/compose/material3/CardElevation;)F

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    new-instance v3, Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 142
    .line 143
    invoke-direct {v3}, Landroidx/compose/foundation/interaction/FocusInteraction$Focus;-><init>()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    iget-object v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->this$0:Landroidx/compose/material3/CardElevation;

    .line 148
    .line 149
    invoke-static {v1}, Landroidx/compose/material3/CardElevation;->access$getDraggedElevation$p(Landroidx/compose/material3/CardElevation;)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-static {p1, v1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_7

    .line 158
    .line 159
    new-instance v3, Landroidx/compose/foundation/interaction/DragInteraction$Start;

    .line 160
    .line 161
    invoke-direct {v3}, Landroidx/compose/foundation/interaction/DragInteraction$Start;-><init>()V

    .line 162
    .line 163
    .line 164
    :cond_7
    :goto_1
    iget-object p1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$animatable:Landroidx/compose/animation/core/Animatable;

    .line 165
    .line 166
    iget v1, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$target:F

    .line 167
    .line 168
    iget-object v4, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->$interaction:Landroidx/compose/foundation/interaction/Interaction;

    .line 169
    .line 170
    iput v2, p0, Landroidx/compose/material3/CardElevation$animateElevation$2$1;->label:I

    .line 171
    .line 172
    invoke-static {p1, v1, v3, v4, p0}, Landroidx/compose/material3/ElevationKt;->animateElevation-rAjV9yQ(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v0, :cond_8

    .line 177
    .line 178
    return-object v0

    .line 179
    :cond_8
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 180
    .line 181
    return-object p1
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
