.class final Lcom/airbnb/lottie/compose/r$g;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/r;->v(Lcom/airbnb/lottie/compose/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;
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
    c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3"
    f = "rememberLottieComposition.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x5b,
        0x5d
    }
    m = "invokeSuspend"
    n = {
        "exception",
        "failedCount",
        "exception",
        "failedCount"
    }
    s = {
        "L$0",
        "I$0",
        "L$0",
        "I$0"
    }
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
.field final synthetic $cacheKey:Ljava/lang/String;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $fontAssetsFolder:Ljava/lang/String;

.field final synthetic $fontFileExtension:Ljava/lang/String;

.field final synthetic $imageAssetsFolder:Ljava/lang/String;

.field final synthetic $onRetry:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $result$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $spec:Lcom/airbnb/lottie/compose/i;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lv3/q;Landroid/content/Context;Lcom/airbnb/lottie/compose/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/airbnb/lottie/compose/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/airbnb/lottie/compose/r$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/compose/r$g;->$onRetry:Lv3/q;

    iput-object p2, p0, Lcom/airbnb/lottie/compose/r$g;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/airbnb/lottie/compose/r$g;->$spec:Lcom/airbnb/lottie/compose/i;

    iput-object p4, p0, Lcom/airbnb/lottie/compose/r$g;->$imageAssetsFolder:Ljava/lang/String;

    iput-object p5, p0, Lcom/airbnb/lottie/compose/r$g;->$fontAssetsFolder:Ljava/lang/String;

    iput-object p6, p0, Lcom/airbnb/lottie/compose/r$g;->$fontFileExtension:Ljava/lang/String;

    iput-object p7, p0, Lcom/airbnb/lottie/compose/r$g;->$cacheKey:Ljava/lang/String;

    iput-object p8, p0, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 10
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

    new-instance p1, Lcom/airbnb/lottie/compose/r$g;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/r$g;->$onRetry:Lv3/q;

    iget-object v2, p0, Lcom/airbnb/lottie/compose/r$g;->$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/airbnb/lottie/compose/r$g;->$spec:Lcom/airbnb/lottie/compose/i;

    iget-object v4, p0, Lcom/airbnb/lottie/compose/r$g;->$imageAssetsFolder:Ljava/lang/String;

    iget-object v5, p0, Lcom/airbnb/lottie/compose/r$g;->$fontAssetsFolder:Ljava/lang/String;

    iget-object v6, p0, Lcom/airbnb/lottie/compose/r$g;->$fontFileExtension:Ljava/lang/String;

    iget-object v7, p0, Lcom/airbnb/lottie/compose/r$g;->$cacheKey:Ljava/lang/String;

    iget-object v8, p0, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    move-object v0, p1

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/airbnb/lottie/compose/r$g;-><init>(Lv3/q;Landroid/content/Context;Lcom/airbnb/lottie/compose/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/r$g;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/compose/r$g;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/compose/r$g;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/compose/r$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/airbnb/lottie/compose/r$g;->label:I

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
    iget v1, p0, Lcom/airbnb/lottie/compose/r$g;->I$0:I

    .line 16
    .line 17
    iget-object v4, p0, Lcom/airbnb/lottie/compose/r$g;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/lang/Throwable;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    move-object v5, v4

    .line 25
    move v4, v1

    .line 26
    move-object v1, v0

    .line 27
    move-object v0, p0

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :catchall_0
    move-exception p1

    .line 31
    move-object v4, p1

    .line 32
    move-object p1, p0

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    iget v1, p0, Lcom/airbnb/lottie/compose/r$g;->I$0:I

    .line 44
    .line 45
    iget-object v4, p0, Lcom/airbnb/lottie/compose/r$g;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v5, v4

    .line 53
    move v4, v1

    .line 54
    move-object v1, v0

    .line 55
    move-object v0, p0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    const/4 v1, 0x0

    .line 62
    move-object v4, p1

    .line 63
    move-object p1, p0

    .line 64
    :goto_0
    iget-object v5, p1, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    .line 65
    .line 66
    invoke-static {v5}, Lcom/airbnb/lottie/compose/r;->k(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;->isSuccess()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    iget-object v5, p1, Lcom/airbnb/lottie/compose/r$g;->$onRetry:Lv3/q;

    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->f(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object v4, p1, Lcom/airbnb/lottie/compose/r$g;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    iput v1, p1, Lcom/airbnb/lottie/compose/r$g;->I$0:I

    .line 90
    .line 91
    iput v3, p1, Lcom/airbnb/lottie/compose/r$g;->label:I

    .line 92
    .line 93
    invoke-interface {v5, v6, v4, p1}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    if-ne v5, v0, :cond_3

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_3
    move-object v13, v0

    .line 101
    move-object v0, p1

    .line 102
    move-object p1, v5

    .line 103
    move-object v5, v4

    .line 104
    move v4, v1

    .line 105
    move-object v1, v13

    .line 106
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    move-object p1, v0

    .line 115
    move-object v0, v1

    .line 116
    move v1, v4

    .line 117
    move-object v4, v5

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    move-object p1, v0

    .line 120
    move-object v4, v5

    .line 121
    goto :goto_5

    .line 122
    :cond_5
    :goto_2
    :try_start_1
    iget-object v6, p1, Lcom/airbnb/lottie/compose/r$g;->$context:Landroid/content/Context;

    .line 123
    .line 124
    iget-object v7, p1, Lcom/airbnb/lottie/compose/r$g;->$spec:Lcom/airbnb/lottie/compose/i;

    .line 125
    .line 126
    iget-object v5, p1, Lcom/airbnb/lottie/compose/r$g;->$imageAssetsFolder:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v5}, Lcom/airbnb/lottie/compose/r;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    iget-object v5, p1, Lcom/airbnb/lottie/compose/r$g;->$fontAssetsFolder:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v5}, Lcom/airbnb/lottie/compose/r;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    iget-object v5, p1, Lcom/airbnb/lottie/compose/r$g;->$fontFileExtension:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v5}, Lcom/airbnb/lottie/compose/r;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    iget-object v11, p1, Lcom/airbnb/lottie/compose/r$g;->$cacheKey:Ljava/lang/String;

    .line 145
    .line 146
    iput-object v4, p1, Lcom/airbnb/lottie/compose/r$g;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput v1, p1, Lcom/airbnb/lottie/compose/r$g;->I$0:I

    .line 149
    .line 150
    iput v2, p1, Lcom/airbnb/lottie/compose/r$g;->label:I

    .line 151
    .line 152
    move-object v12, p1

    .line 153
    invoke-static/range {v6 .. v12}, Lcom/airbnb/lottie/compose/r;->f(Landroid/content/Context;Lcom/airbnb/lottie/compose/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 157
    if-ne v5, v0, :cond_6

    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_6
    move-object v13, v0

    .line 161
    move-object v0, p1

    .line 162
    move-object p1, v5

    .line 163
    move-object v5, v4

    .line 164
    move v4, v1

    .line 165
    move-object v1, v13

    .line 166
    :goto_3
    :try_start_2
    check-cast p1, Lcom/airbnb/lottie/k;

    .line 167
    .line 168
    iget-object v6, v0, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    .line 169
    .line 170
    invoke-static {v6}, Lcom/airbnb/lottie/compose/r;->k(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-virtual {v6, p1}, Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;->c(Lcom/airbnb/lottie/k;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 175
    .line 176
    .line 177
    move-object p1, v0

    .line 178
    move-object v0, v1

    .line 179
    move v1, v4

    .line 180
    move-object v4, v5

    .line 181
    goto :goto_0

    .line 182
    :catchall_1
    move-exception p1

    .line 183
    move v13, v4

    .line 184
    move-object v4, p1

    .line 185
    move-object p1, v0

    .line 186
    move-object v0, v1

    .line 187
    move v1, v13

    .line 188
    goto :goto_4

    .line 189
    :catchall_2
    move-exception v4

    .line 190
    :goto_4
    add-int/2addr v1, v3

    .line 191
    goto :goto_0

    .line 192
    :cond_7
    :goto_5
    iget-object v0, p1, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    .line 193
    .line 194
    invoke-static {v0}, Lcom/airbnb/lottie/compose/r;->k(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0}, Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;->j()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_8

    .line 203
    .line 204
    if-eqz v4, :cond_8

    .line 205
    .line 206
    iget-object p1, p1, Lcom/airbnb/lottie/compose/r$g;->$result$delegate:Landroidx/compose/runtime/MutableState;

    .line 207
    .line 208
    invoke-static {p1}, Lcom/airbnb/lottie/compose/r;->k(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1, v4}, Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;->h(Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    :cond_8
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 216
    .line 217
    return-object p1
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
