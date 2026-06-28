.class final Lcom/airbnb/lottie/compose/a$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/a;->c(Lcom/airbnb/lottie/k;ZZZLcom/airbnb/lottie/compose/g;FILcom/airbnb/lottie/compose/f;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;
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
    c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3"
    f = "animateLottieCompositionAsState.kt"
    i = {}
    l = {
        0x49,
        0x4e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $actualSpeed:F

.field final synthetic $animatable:Lcom/airbnb/lottie/compose/LottieAnimatable;

.field final synthetic $cancellationBehavior:Lcom/airbnb/lottie/compose/f;

.field final synthetic $clipSpec:Lcom/airbnb/lottie/compose/g;

.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $isPlaying:Z

.field final synthetic $iterations:I

.field final synthetic $restartOnPlay:Z

.field final synthetic $reverseOnRepeat:Z

.field final synthetic $useCompositionFrameRate:Z

.field final synthetic $wasPlaying$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(ZZLcom/airbnb/lottie/compose/LottieAnimatable;Lcom/airbnb/lottie/k;IZFLcom/airbnb/lottie/compose/g;Lcom/airbnb/lottie/compose/f;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/airbnb/lottie/compose/LottieAnimatable;",
            "Lcom/airbnb/lottie/k;",
            "IZF",
            "Lcom/airbnb/lottie/compose/g;",
            "Lcom/airbnb/lottie/compose/f;",
            "Z",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/airbnb/lottie/compose/a$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/airbnb/lottie/compose/a$a;->$isPlaying:Z

    iput-boolean p2, p0, Lcom/airbnb/lottie/compose/a$a;->$restartOnPlay:Z

    iput-object p3, p0, Lcom/airbnb/lottie/compose/a$a;->$animatable:Lcom/airbnb/lottie/compose/LottieAnimatable;

    iput-object p4, p0, Lcom/airbnb/lottie/compose/a$a;->$composition:Lcom/airbnb/lottie/k;

    iput p5, p0, Lcom/airbnb/lottie/compose/a$a;->$iterations:I

    iput-boolean p6, p0, Lcom/airbnb/lottie/compose/a$a;->$reverseOnRepeat:Z

    iput p7, p0, Lcom/airbnb/lottie/compose/a$a;->$actualSpeed:F

    iput-object p8, p0, Lcom/airbnb/lottie/compose/a$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    iput-object p9, p0, Lcom/airbnb/lottie/compose/a$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    iput-boolean p10, p0, Lcom/airbnb/lottie/compose/a$a;->$useCompositionFrameRate:Z

    iput-object p11, p0, Lcom/airbnb/lottie/compose/a$a;->$wasPlaying$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 13
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

    new-instance p1, Lcom/airbnb/lottie/compose/a$a;

    iget-boolean v1, p0, Lcom/airbnb/lottie/compose/a$a;->$isPlaying:Z

    iget-boolean v2, p0, Lcom/airbnb/lottie/compose/a$a;->$restartOnPlay:Z

    iget-object v3, p0, Lcom/airbnb/lottie/compose/a$a;->$animatable:Lcom/airbnb/lottie/compose/LottieAnimatable;

    iget-object v4, p0, Lcom/airbnb/lottie/compose/a$a;->$composition:Lcom/airbnb/lottie/k;

    iget v5, p0, Lcom/airbnb/lottie/compose/a$a;->$iterations:I

    iget-boolean v6, p0, Lcom/airbnb/lottie/compose/a$a;->$reverseOnRepeat:Z

    iget v7, p0, Lcom/airbnb/lottie/compose/a$a;->$actualSpeed:F

    iget-object v8, p0, Lcom/airbnb/lottie/compose/a$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    iget-object v9, p0, Lcom/airbnb/lottie/compose/a$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    iget-boolean v10, p0, Lcom/airbnb/lottie/compose/a$a;->$useCompositionFrameRate:Z

    iget-object v11, p0, Lcom/airbnb/lottie/compose/a$a;->$wasPlaying$delegate:Landroidx/compose/runtime/MutableState;

    move-object v0, p1

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lcom/airbnb/lottie/compose/a$a;-><init>(ZZLcom/airbnb/lottie/compose/LottieAnimatable;Lcom/airbnb/lottie/k;IZFLcom/airbnb/lottie/compose/g;Lcom/airbnb/lottie/compose/f;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/a$a;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/a$a;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/compose/a$a;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/compose/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v14

    .line 7
    iget v0, v15, Lcom/airbnb/lottie/compose/a$a;->label:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, v15, Lcom/airbnb/lottie/compose/a$a;->$isPlaying:Z

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, v15, Lcom/airbnb/lottie/compose/a$a;->$wasPlaying$delegate:Landroidx/compose/runtime/MutableState;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/airbnb/lottie/compose/a;->a(Landroidx/compose/runtime/MutableState;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    iget-boolean v0, v15, Lcom/airbnb/lottie/compose/a$a;->$restartOnPlay:Z

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, v15, Lcom/airbnb/lottie/compose/a$a;->$animatable:Lcom/airbnb/lottie/compose/LottieAnimatable;

    .line 54
    .line 55
    iput v2, v15, Lcom/airbnb/lottie/compose/a$a;->label:I

    .line 56
    .line 57
    invoke-static {v0, v15}, Lcom/airbnb/lottie/compose/c;->e(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v14, :cond_3

    .line 62
    .line 63
    return-object v14

    .line 64
    :cond_3
    :goto_0
    iget-object v0, v15, Lcom/airbnb/lottie/compose/a$a;->$wasPlaying$delegate:Landroidx/compose/runtime/MutableState;

    .line 65
    .line 66
    iget-boolean v2, v15, Lcom/airbnb/lottie/compose/a$a;->$isPlaying:Z

    .line 67
    .line 68
    invoke-static {v0, v2}, Lcom/airbnb/lottie/compose/a;->b(Landroidx/compose/runtime/MutableState;Z)V

    .line 69
    .line 70
    .line 71
    iget-boolean v0, v15, Lcom/airbnb/lottie/compose/a$a;->$isPlaying:Z

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_4
    iget-object v0, v15, Lcom/airbnb/lottie/compose/a$a;->$animatable:Lcom/airbnb/lottie/compose/LottieAnimatable;

    .line 79
    .line 80
    iget-object v2, v15, Lcom/airbnb/lottie/compose/a$a;->$composition:Lcom/airbnb/lottie/k;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    iget v4, v15, Lcom/airbnb/lottie/compose/a$a;->$iterations:I

    .line 84
    .line 85
    iget-boolean v5, v15, Lcom/airbnb/lottie/compose/a$a;->$reverseOnRepeat:Z

    .line 86
    .line 87
    iget v6, v15, Lcom/airbnb/lottie/compose/a$a;->$actualSpeed:F

    .line 88
    .line 89
    iget-object v7, v15, Lcom/airbnb/lottie/compose/a$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    .line 90
    .line 91
    invoke-interface {v0}, Lcom/airbnb/lottie/compose/LottieAnimationState;->getProgress()F

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v9, 0x0

    .line 96
    iget-object v10, v15, Lcom/airbnb/lottie/compose/a$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    iget-boolean v12, v15, Lcom/airbnb/lottie/compose/a$a;->$useCompositionFrameRate:Z

    .line 100
    .line 101
    const/16 v13, 0x202

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    iput v1, v15, Lcom/airbnb/lottie/compose/a$a;->label:I

    .line 106
    .line 107
    move-object v1, v2

    .line 108
    move v2, v3

    .line 109
    move v3, v4

    .line 110
    move v4, v5

    .line 111
    move v5, v6

    .line 112
    move-object v6, v7

    .line 113
    move v7, v8

    .line 114
    move v8, v9

    .line 115
    move-object v9, v10

    .line 116
    move v10, v11

    .line 117
    move v11, v12

    .line 118
    move-object/from16 v12, p0

    .line 119
    .line 120
    move-object v15, v14

    .line 121
    move-object/from16 v14, v16

    .line 122
    .line 123
    invoke-static/range {v0 .. v14}, Lcom/airbnb/lottie/compose/LottieAnimatable$a;->a(Lcom/airbnb/lottie/compose/LottieAnimatable;Lcom/airbnb/lottie/k;IIZFLcom/airbnb/lottie/compose/g;FZLcom/airbnb/lottie/compose/f;ZZLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-ne v0, v15, :cond_5

    .line 128
    .line 129
    return-object v15

    .line 130
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 131
    .line 132
    return-object v0
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
.end method
