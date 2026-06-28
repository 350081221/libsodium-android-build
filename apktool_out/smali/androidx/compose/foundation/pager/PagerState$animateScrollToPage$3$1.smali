.class final Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerState;->animateScrollToPage(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1"
    f = "PagerState.kt"
    i = {}
    l = {
        0x228
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
        "Landroidx/compose/foundation/gestures/ScrollScope;",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n772#2,4:792\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n*L\n531#1:788,4\n550#1:792,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $animationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targetPage:I

.field final synthetic $targetPageOffsetToSnappedPosition:I

.field final synthetic $this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "I",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
            "I",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    iput p2, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    iput-object p3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iput p4, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPageOffsetToSnappedPosition:I

    iput-object p5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 8
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

    new-instance v7, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;

    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    iget v2, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v4, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPageOffsetToSnappedPosition:I

    iget-object v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;-><init>(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)V

    iput-object p1, v7, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->L$0:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
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
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/ScrollScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->invoke(Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
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
    iget v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->label:I

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
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->L$0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroidx/compose/foundation/gestures/ScrollScope;

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    .line 33
    .line 34
    iget v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 35
    .line 36
    invoke-virtual {v1, p1, v3}, Landroidx/compose/foundation/pager/PagerState;->updateTargetPage(Landroidx/compose/foundation/gestures/ScrollScope;I)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 40
    .line 41
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 42
    .line 43
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    if-le v1, v3, :cond_2

    .line 49
    .line 50
    move v1, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v1, v4

    .line 53
    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 54
    .line 55
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getLastVisibleItemIndex()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget-object v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 60
    .line 61
    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    sub-int/2addr v3, v5

    .line 66
    add-int/2addr v3, v2

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 70
    .line 71
    iget-object v6, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 72
    .line 73
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getLastVisibleItemIndex()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-gt v5, v6, :cond_4

    .line 78
    .line 79
    :cond_3
    if-nez v1, :cond_6

    .line 80
    .line 81
    iget v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 82
    .line 83
    iget-object v6, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 84
    .line 85
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ge v5, v6, :cond_6

    .line 90
    .line 91
    :cond_4
    iget v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 92
    .line 93
    iget-object v6, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 94
    .line 95
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    sub-int/2addr v5, v6

    .line 100
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x3

    .line 105
    if-lt v5, v6, :cond_6

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 110
    .line 111
    sub-int/2addr v1, v3

    .line 112
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 113
    .line 114
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-static {v1, v3}, Lkotlin/ranges/s;->u(II)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    iget v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 124
    .line 125
    add-int/2addr v1, v3

    .line 126
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 127
    .line 128
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v1, v3}, Lkotlin/ranges/s;->B(II)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    :goto_1
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 137
    .line 138
    invoke-interface {v3, p1, v1, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    .line 139
    .line 140
    .line 141
    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$this_with:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 142
    .line 143
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getVisibleItemsAverageSize()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    .line 148
    .line 149
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    iget v4, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPage:I

    .line 154
    .line 155
    mul-int/2addr v4, v1

    .line 156
    mul-int/2addr v3, v1

    .line 157
    int-to-float v1, v1

    .line 158
    iget-object v5, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    .line 159
    .line 160
    invoke-virtual {v5}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPageOffsetFraction()F

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    mul-float/2addr v1, v5

    .line 165
    sub-int/2addr v4, v3

    .line 166
    iget v3, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$targetPageOffsetToSnappedPosition:I

    .line 167
    .line 168
    add-int/2addr v4, v3

    .line 169
    int-to-float v3, v4

    .line 170
    sub-float v5, v3, v1

    .line 171
    .line 172
    new-instance v1, Lkotlin/jvm/internal/k1$e;

    .line 173
    .line 174
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 175
    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    iget-object v7, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 180
    .line 181
    new-instance v8, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3;

    .line 182
    .line 183
    invoke-direct {v8, v1, p1}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3;-><init>(Lkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;)V

    .line 184
    .line 185
    .line 186
    const/4 v10, 0x4

    .line 187
    const/4 v11, 0x0

    .line 188
    iput v2, p0, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;->label:I

    .line 189
    .line 190
    move-object v9, p0

    .line 191
    invoke-static/range {v4 .. v11}, Landroidx/compose/animation/core/SuspendAnimationKt;->animate$default(FFFLandroidx/compose/animation/core/AnimationSpec;Lv3/p;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v0, :cond_7

    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 199
    .line 200
    return-object p1
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
