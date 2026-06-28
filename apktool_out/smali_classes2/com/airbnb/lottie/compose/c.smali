.class public final Lcom/airbnb/lottie/compose/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u000c*\u00020\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "LottieAnimatable",
        "Lcom/airbnb/lottie/compose/LottieAnimatable;",
        "defaultProgress",
        "",
        "composition",
        "Lcom/airbnb/lottie/LottieComposition;",
        "clipSpec",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "speed",
        "rememberLottieAnimatable",
        "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;",
        "resetToBeginning",
        "",
        "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "lottie-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLottieAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,359:1\n25#2:360\n1097#3,6:361\n*S KotlinDebug\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableKt\n*L\n29#1:360\n29#1:361,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a()Lcom/airbnb/lottie/compose/LottieAnimatable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/compose/b;

    invoke-direct {v0}, Lcom/airbnb/lottie/compose/b;-><init>()V

    return-object v0
.end method

.method public static final synthetic b(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/compose/g;F)F
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/airbnb/lottie/compose/c;->c(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/compose/g;F)F

    move-result p0

    return p0
.end method

.method private static final c(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/compose/g;F)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float p2, p2, v0

    .line 3
    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-gez p2, :cond_1

    .line 7
    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    :cond_0
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    if-nez p0, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    if-gez p2, :cond_3

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/compose/g;->a(Lcom/airbnb/lottie/k;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_3
    if-eqz p1, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/compose/g;->b(Lcom/airbnb/lottie/k;)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :cond_4
    :goto_0
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;
    .locals 3
    .param p0    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x78ab5fda

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)"

    .line 15
    .line 16
    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p1, -0x1d58f75c

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    invoke-static {}, Lcom/airbnb/lottie/compose/c;->a()Lcom/airbnb/lottie/compose/LottieAnimatable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lcom/airbnb/lottie/compose/LottieAnimatable;

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 59
    .line 60
    .line 61
    return-object p1
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
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
.end method

.method public static final e(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 8
    .param p0    # Lcom/airbnb/lottie/compose/LottieAnimatable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/compose/LottieAnimatable;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    invoke-interface {p0}, Lcom/airbnb/lottie/compose/LottieAnimationState;->getComposition()Lcom/airbnb/lottie/k;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {p0}, Lcom/airbnb/lottie/compose/LottieAnimationState;->q()Lcom/airbnb/lottie/compose/g;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {p0}, Lcom/airbnb/lottie/compose/LottieAnimationState;->m()F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-static {v0, v2, v3}, Lcom/airbnb/lottie/compose/c;->c(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/compose/g;F)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    const/16 v6, 0x9

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v0, p0

    .line 24
    move-object v5, p1

    .line 25
    invoke-static/range {v0 .. v7}, Lcom/airbnb/lottie/compose/LottieAnimatable$a;->c(Lcom/airbnb/lottie/compose/LottieAnimatable;Lcom/airbnb/lottie/k;FIZLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-ne p0, p1, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 37
    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
