.class final Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->animateScrollToItem(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2"
    f = "LazyAnimateScroll.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1
    }
    l = {
        0xb6,
        0x118
    }
    m = "invokeSuspend"
    n = {
        "$this$scroll",
        "loop",
        "anim",
        "loops",
        "targetDistancePx",
        "boundDistancePx",
        "minDistancePx",
        "forward",
        "$this$scroll"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "F$0",
        "F$1",
        "F$2",
        "I$0",
        "L$0"
    }
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
        "SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n1#2:318\n41#3,4:319\n41#3,4:323\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n174#1:319,4\n277#1:323,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $index:I

.field final synthetic $numOfItemsForTeleport:I

.field final synthetic $scrollOffset:I

.field final synthetic $this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

.field F$0:F

.field F$1:F

.field F$2:F

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ILandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IILkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
            "II",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iput p4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I

    iput p5, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$numOfItemsForTeleport:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;II)Z

    move-result p0

    return p0
.end method

.method private static final invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;II)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-le p0, p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-ne p0, p2, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemScrollOffset()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-le p0, p3, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ge p0, p2, :cond_2

    .line 30
    .line 31
    :goto_0
    move v0, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-ne p0, p2, :cond_3

    .line 38
    .line 39
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemScrollOffset()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ge p0, p3, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_1
    return v0
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

    new-instance v7, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I

    iget v5, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$numOfItemsForTeleport:I

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;-><init>(ILandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IILkotlin/coroutines/d;)V

    iput-object p1, v7, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/ScrollScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->invoke(Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->label:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v6, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    iget-object v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/compose/foundation/gestures/ScrollScope;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object v11, v1

    .line 26
    goto/16 :goto_e

    .line 27
    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    iget v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->I$0:I

    .line 37
    .line 38
    iget v7, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$2:F

    .line 39
    .line 40
    iget v8, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$1:F

    .line 41
    .line 42
    iget v9, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$0:F

    .line 43
    .line 44
    iget-object v10, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$3:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Lkotlin/jvm/internal/k1$f;

    .line 47
    .line 48
    iget-object v11, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v11, Lkotlin/jvm/internal/k1$h;

    .line 51
    .line 52
    iget-object v12, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v12, Lkotlin/jvm/internal/k1$a;

    .line 55
    .line 56
    iget-object v13, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v13, Landroidx/compose/foundation/gestures/ScrollScope;

    .line 59
    .line 60
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move v15, v8

    .line 64
    move v14, v9

    .line 65
    move-object v9, v1

    .line 66
    move-object/from16 v35, v13

    .line 67
    .line 68
    move-object v13, v10

    .line 69
    move-object/from16 v10, v35

    .line 70
    .line 71
    move-object/from16 v36, v12

    .line 72
    .line 73
    move-object v12, v11

    .line 74
    move-object/from16 v11, v36

    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object v3, v0

    .line 80
    move-object v11, v1

    .line 81
    move-object v0, v13

    .line 82
    goto/16 :goto_c

    .line 83
    .line 84
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v7, v0

    .line 90
    check-cast v7, Landroidx/compose/foundation/gestures/ScrollScope;

    .line 91
    .line 92
    iget v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 93
    .line 94
    int-to-float v8, v0

    .line 95
    cmpl-float v8, v8, v4

    .line 96
    .line 97
    if-ltz v8, :cond_3

    .line 98
    .line 99
    move v8, v6

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const/4 v8, 0x0

    .line 102
    :goto_0
    if-eqz v8, :cond_10

    .line 103
    .line 104
    :try_start_1
    iget-object v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$density:Landroidx/compose/ui/unit/Density;

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->access$getTargetDistance$p()F

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-interface {v0, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v8, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$density:Landroidx/compose/ui/unit/Density;

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->access$getBoundDistance$p()F

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-interface {v8, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    iget-object v9, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$density:Landroidx/compose/ui/unit/Density;

    .line 125
    .line 126
    invoke-static {}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->access$getMinimumDistance$p()F

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-interface {v9, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    new-instance v10, Lkotlin/jvm/internal/k1$a;

    .line 135
    .line 136
    invoke-direct {v10}, Lkotlin/jvm/internal/k1$a;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-boolean v6, v10, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 140
    .line 141
    new-instance v11, Lkotlin/jvm/internal/k1$h;

    .line 142
    .line 143
    invoke-direct {v11}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 144
    .line 145
    .line 146
    const/4 v12, 0x0

    .line 147
    const/4 v13, 0x0

    .line 148
    const-wide/16 v14, 0x0

    .line 149
    .line 150
    const-wide/16 v16, 0x0

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, 0x1e

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    invoke-static/range {v12 .. v20}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    iput-object v12, v11, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v12, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 165
    .line 166
    iget v13, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 167
    .line 168
    invoke-static {v12, v13}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;I)Z

    .line 169
    .line 170
    .line 171
    move-result v12
    :try_end_1
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_1 .. :try_end_1} :catch_7

    .line 172
    if-nez v12, :cond_d

    .line 173
    .line 174
    :try_start_2
    iget v12, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 175
    .line 176
    iget-object v13, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 177
    .line 178
    invoke-interface {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    if-le v12, v13, :cond_4

    .line 183
    .line 184
    move v12, v6

    .line 185
    goto :goto_1

    .line 186
    :cond_4
    const/4 v12, 0x0

    .line 187
    :goto_1
    new-instance v13, Lkotlin/jvm/internal/k1$f;

    .line 188
    .line 189
    invoke-direct {v13}, Lkotlin/jvm/internal/k1$f;-><init>()V

    .line 190
    .line 191
    .line 192
    iput v6, v13, Lkotlin/jvm/internal/k1$f;->element:I
    :try_end_2
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_2 .. :try_end_2} :catch_6

    .line 193
    .line 194
    move v14, v0

    .line 195
    move v15, v8

    .line 196
    move v0, v12

    .line 197
    move-object v12, v11

    .line 198
    move-object v11, v10

    .line 199
    move-object v10, v7

    .line 200
    move v7, v9

    .line 201
    move-object v9, v1

    .line 202
    :goto_2
    :try_start_3
    iget-boolean v8, v11, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 203
    .line 204
    if-eqz v8, :cond_c

    .line 205
    .line 206
    iget-object v8, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 207
    .line 208
    invoke-interface {v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getItemCount()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-lez v8, :cond_c

    .line 213
    .line 214
    iget-object v8, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 215
    .line 216
    iget v5, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 217
    .line 218
    iget v3, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I

    .line 219
    .line 220
    invoke-interface {v8, v5, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->calculateDistanceTo(II)F

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 225
    .line 226
    .line 227
    move-result v5
    :try_end_3
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_3 .. :try_end_3} :catch_5

    .line 228
    cmpg-float v5, v5, v14

    .line 229
    .line 230
    if-gez v5, :cond_6

    .line 231
    .line 232
    :try_start_4
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-static {v3, v7}, Ljava/lang/Math;->max(FF)F

    .line 237
    .line 238
    .line 239
    move-result v3
    :try_end_4
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_4 .. :try_end_4} :catch_1

    .line 240
    if-eqz v0, :cond_5

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_5
    neg-float v3, v3

    .line 244
    goto :goto_3

    .line 245
    :catch_1
    move-exception v0

    .line 246
    goto/16 :goto_8

    .line 247
    .line 248
    :cond_6
    if-eqz v0, :cond_7

    .line 249
    .line 250
    move v3, v14

    .line 251
    goto :goto_3

    .line 252
    :cond_7
    neg-float v3, v14

    .line 253
    :goto_3
    :try_start_5
    iget-object v5, v12, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 254
    .line 255
    move-object/from16 v25, v5

    .line 256
    .line 257
    check-cast v25, Landroidx/compose/animation/core/AnimationState;

    .line 258
    .line 259
    const/16 v26, 0x0

    .line 260
    .line 261
    const/16 v27, 0x0

    .line 262
    .line 263
    const-wide/16 v28, 0x0

    .line 264
    .line 265
    const-wide/16 v30, 0x0

    .line 266
    .line 267
    const/16 v32, 0x0

    .line 268
    .line 269
    const/16 v33, 0x1e

    .line 270
    .line 271
    const/16 v34, 0x0

    .line 272
    .line 273
    invoke-static/range {v25 .. v34}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    iput-object v5, v12, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 278
    .line 279
    new-instance v5, Lkotlin/jvm/internal/k1$e;

    .line 280
    .line 281
    invoke-direct {v5}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 282
    .line 283
    .line 284
    iget-object v8, v12, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 285
    .line 286
    move-object/from16 v21, v8

    .line 287
    .line 288
    check-cast v21, Landroidx/compose/animation/core/AnimationState;

    .line 289
    .line 290
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 291
    .line 292
    .line 293
    move-result-object v22

    .line 294
    const/16 v23, 0x0

    .line 295
    .line 296
    iget-object v8, v12, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v8, Landroidx/compose/animation/core/AnimationState;

    .line 299
    .line 300
    invoke-virtual {v8}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    check-cast v8, Ljava/lang/Number;

    .line 305
    .line 306
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    cmpg-float v8, v8, v4

    .line 311
    .line 312
    if-nez v8, :cond_8

    .line 313
    .line 314
    move v8, v6

    .line 315
    goto :goto_4

    .line 316
    :cond_8
    const/4 v8, 0x0

    .line 317
    :goto_4
    if-nez v8, :cond_9

    .line 318
    .line 319
    move/from16 v25, v6

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_9
    const/16 v25, 0x0

    .line 323
    .line 324
    :goto_5
    new-instance v26, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;

    .line 325
    .line 326
    iget-object v8, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 327
    .line 328
    iget v4, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 329
    .line 330
    if-eqz v0, :cond_a

    .line 331
    .line 332
    move/from16 v16, v6

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_a
    const/16 v16, 0x0

    .line 336
    .line 337
    :goto_6
    iget v6, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$numOfItemsForTeleport:I

    .line 338
    .line 339
    iget v1, v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I
    :try_end_5
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_5 .. :try_end_5} :catch_5

    .line 340
    .line 341
    move-object/from16 v17, v8

    .line 342
    .line 343
    move-object/from16 v8, v26

    .line 344
    .line 345
    move-object/from16 v29, v2

    .line 346
    .line 347
    move-object v2, v9

    .line 348
    move-object/from16 v9, v17

    .line 349
    .line 350
    move-object/from16 p1, v10

    .line 351
    .line 352
    move v10, v4

    .line 353
    move-object v4, v11

    .line 354
    move v11, v3

    .line 355
    move-object v3, v12

    .line 356
    move-object v12, v5

    .line 357
    move-object v5, v13

    .line 358
    move-object/from16 v13, p1

    .line 359
    .line 360
    move/from16 v30, v0

    .line 361
    .line 362
    move v0, v14

    .line 363
    move-object v14, v4

    .line 364
    move/from16 v31, v15

    .line 365
    .line 366
    move/from16 v15, v16

    .line 367
    .line 368
    move/from16 v16, v31

    .line 369
    .line 370
    move-object/from16 v17, v5

    .line 371
    .line 372
    move/from16 v18, v6

    .line 373
    .line 374
    move/from16 v19, v1

    .line 375
    .line 376
    move-object/from16 v20, v3

    .line 377
    .line 378
    :try_start_6
    invoke-direct/range {v8 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IFLkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/jvm/internal/k1$a;ZFLkotlin/jvm/internal/k1$f;IILkotlin/jvm/internal/k1$h;)V
    :try_end_6
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_6 .. :try_end_6} :catch_4

    .line 379
    .line 380
    .line 381
    const/4 v1, 0x2

    .line 382
    const/4 v6, 0x0

    .line 383
    move-object/from16 v8, p1

    .line 384
    .line 385
    :try_start_7
    iput-object v8, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v4, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$1:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v3, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$2:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v5, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$3:Ljava/lang/Object;

    .line 392
    .line 393
    iput v0, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$0:F

    .line 394
    .line 395
    move/from16 v9, v31

    .line 396
    .line 397
    iput v9, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$1:F

    .line 398
    .line 399
    iput v7, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->F$2:F

    .line 400
    .line 401
    move/from16 v12, v30

    .line 402
    .line 403
    iput v12, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->I$0:I

    .line 404
    .line 405
    const/4 v10, 0x1

    .line 406
    iput v10, v2, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->label:I

    .line 407
    .line 408
    move-object/from16 v16, v21

    .line 409
    .line 410
    move-object/from16 v17, v22

    .line 411
    .line 412
    move-object/from16 v18, v23

    .line 413
    .line 414
    move/from16 v19, v25

    .line 415
    .line 416
    move-object/from16 v20, v26

    .line 417
    .line 418
    move-object/from16 v21, v2

    .line 419
    .line 420
    move/from16 v22, v1

    .line 421
    .line 422
    move-object/from16 v23, v6

    .line 423
    .line 424
    invoke-static/range {v16 .. v23}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1
    :try_end_7
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_7 .. :try_end_7} :catch_3

    .line 428
    move-object/from16 v6, v29

    .line 429
    .line 430
    if-ne v1, v6, :cond_b

    .line 431
    .line 432
    return-object v6

    .line 433
    :cond_b
    move v14, v0

    .line 434
    move-object v11, v4

    .line 435
    move-object v13, v5

    .line 436
    move-object v10, v8

    .line 437
    move v15, v9

    .line 438
    move v0, v12

    .line 439
    move-object v9, v2

    .line 440
    move-object v12, v3

    .line 441
    move-object v2, v6

    .line 442
    :goto_7
    :try_start_8
    iget v1, v13, Lkotlin/jvm/internal/k1$f;->element:I

    .line 443
    .line 444
    const/4 v3, 0x1

    .line 445
    add-int/2addr v1, v3

    .line 446
    iput v1, v13, Lkotlin/jvm/internal/k1$f;->element:I
    :try_end_8
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_8 .. :try_end_8} :catch_2

    .line 447
    .line 448
    move-object/from16 v1, p0

    .line 449
    .line 450
    const/4 v3, 0x2

    .line 451
    const/4 v4, 0x0

    .line 452
    const/4 v6, 0x1

    .line 453
    goto/16 :goto_2

    .line 454
    .line 455
    :catch_2
    move-exception v0

    .line 456
    move-object/from16 v1, p0

    .line 457
    .line 458
    :goto_8
    move-object v3, v0

    .line 459
    move-object v11, v9

    .line 460
    move-object v0, v10

    .line 461
    goto :goto_c

    .line 462
    :catch_3
    move-exception v0

    .line 463
    goto :goto_9

    .line 464
    :catch_4
    move-exception v0

    .line 465
    move-object/from16 v8, p1

    .line 466
    .line 467
    :goto_9
    move-object/from16 v6, v29

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_c
    move-object/from16 v1, p0

    .line 471
    .line 472
    goto/16 :goto_f

    .line 473
    .line 474
    :catch_5
    move-exception v0

    .line 475
    move-object v6, v2

    .line 476
    move-object v2, v9

    .line 477
    move-object v8, v10

    .line 478
    :goto_a
    move-object/from16 v1, p0

    .line 479
    .line 480
    move-object v3, v0

    .line 481
    move-object v11, v2

    .line 482
    move-object v2, v6

    .line 483
    move-object v0, v8

    .line 484
    goto :goto_c

    .line 485
    :catch_6
    move-exception v0

    .line 486
    move-object/from16 v1, p0

    .line 487
    .line 488
    move-object v11, v1

    .line 489
    move-object v3, v0

    .line 490
    goto :goto_b

    .line 491
    :cond_d
    :try_start_9
    iget-object v0, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 492
    .line 493
    iget v3, v1, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 494
    .line 495
    invoke-interface {v0, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getVisibleItemScrollOffset(I)I

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    new-instance v3, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    .line 500
    .line 501
    iget-object v4, v11, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v4, Landroidx/compose/animation/core/AnimationState;

    .line 504
    .line 505
    invoke-direct {v3, v0, v4}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/AnimationState;)V

    .line 506
    .line 507
    .line 508
    throw v3
    :try_end_9
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_9 .. :try_end_9} :catch_7

    .line 509
    :catch_7
    move-exception v0

    .line 510
    move-object v3, v0

    .line 511
    move-object v11, v1

    .line 512
    :goto_b
    move-object v0, v7

    .line 513
    :goto_c
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getPreviousAnimation()Landroidx/compose/animation/core/AnimationState;

    .line 514
    .line 515
    .line 516
    move-result-object v12

    .line 517
    const/4 v13, 0x0

    .line 518
    const/4 v14, 0x0

    .line 519
    const-wide/16 v15, 0x0

    .line 520
    .line 521
    const-wide/16 v17, 0x0

    .line 522
    .line 523
    const/16 v19, 0x0

    .line 524
    .line 525
    const/16 v20, 0x1e

    .line 526
    .line 527
    const/16 v21, 0x0

    .line 528
    .line 529
    invoke-static/range {v12 .. v21}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getItemOffset()I

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    iget v5, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I

    .line 538
    .line 539
    add-int/2addr v3, v5

    .line 540
    int-to-float v3, v3

    .line 541
    new-instance v5, Lkotlin/jvm/internal/k1$e;

    .line 542
    .line 543
    invoke-direct {v5}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 544
    .line 545
    .line 546
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    const/4 v7, 0x0

    .line 551
    invoke-virtual {v4}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    check-cast v8, Ljava/lang/Number;

    .line 556
    .line 557
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 558
    .line 559
    .line 560
    move-result v8

    .line 561
    const/4 v9, 0x0

    .line 562
    cmpg-float v8, v8, v9

    .line 563
    .line 564
    if-nez v8, :cond_e

    .line 565
    .line 566
    const/16 v24, 0x1

    .line 567
    .line 568
    goto :goto_d

    .line 569
    :cond_e
    const/16 v24, 0x0

    .line 570
    .line 571
    :goto_d
    const/4 v8, 0x1

    .line 572
    xor-int/lit8 v8, v24, 0x1

    .line 573
    .line 574
    new-instance v9, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5;

    .line 575
    .line 576
    invoke-direct {v9, v3, v5, v0}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5;-><init>(FLkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;)V

    .line 577
    .line 578
    .line 579
    const/4 v10, 0x2

    .line 580
    const/4 v12, 0x0

    .line 581
    iput-object v0, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$0:Ljava/lang/Object;

    .line 582
    .line 583
    const/4 v3, 0x0

    .line 584
    iput-object v3, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$1:Ljava/lang/Object;

    .line 585
    .line 586
    iput-object v3, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$2:Ljava/lang/Object;

    .line 587
    .line 588
    iput-object v3, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->L$3:Ljava/lang/Object;

    .line 589
    .line 590
    const/4 v3, 0x2

    .line 591
    iput v3, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->label:I

    .line 592
    .line 593
    move-object v3, v4

    .line 594
    move-object v4, v6

    .line 595
    move-object v5, v7

    .line 596
    move v6, v8

    .line 597
    move-object v7, v9

    .line 598
    move-object v8, v11

    .line 599
    move v9, v10

    .line 600
    move-object v10, v12

    .line 601
    invoke-static/range {v3 .. v10}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    if-ne v3, v2, :cond_f

    .line 606
    .line 607
    return-object v2

    .line 608
    :cond_f
    :goto_e
    iget-object v2, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 609
    .line 610
    iget v3, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$index:I

    .line 611
    .line 612
    iget v4, v11, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->$scrollOffset:I

    .line 613
    .line 614
    invoke-interface {v2, v0, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    .line 615
    .line 616
    .line 617
    :goto_f
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 618
    .line 619
    return-object v0

    .line 620
    :cond_10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 621
    .line 622
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 623
    .line 624
    .line 625
    const-string v3, "Index should be non-negative ("

    .line 626
    .line 627
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    const/16 v0, 0x29

    .line 634
    .line 635
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    throw v2
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
.end method
