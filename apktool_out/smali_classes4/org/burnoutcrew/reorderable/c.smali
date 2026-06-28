.class public final Lorg/burnoutcrew/reorderable/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001ag\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0005H\u0080@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0080@\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a!\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\"\u0017\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001e\"\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "pointerId",
        "Landroidx/compose/ui/input/pointer/PointerType;",
        "pointerType",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Lkotlin/v0;",
        "name",
        "change",
        "Landroidx/compose/ui/geometry/Offset;",
        "overSlop",
        "Lkotlin/r2;",
        "onPointerSlopReached",
        "c",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "initialDown",
        "b",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/ui/input/pointer/PointerEvent;",
        "",
        "d",
        "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z",
        "Landroidx/compose/ui/platform/ViewConfiguration;",
        "",
        "e",
        "(Landroidx/compose/ui/platform/ViewConfiguration;I)F",
        "Landroidx/compose/ui/unit/Dp;",
        "a",
        "F",
        "mouseSlop",
        "defaultTouchSlop",
        "mouseToTouchSlopRatio",
        "reorderable"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    .line 2
    .line 3
    double-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lorg/burnoutcrew/reorderable/c;->a:F

    .line 9
    .line 10
    const/16 v1, 0x12

    .line 11
    .line 12
    int-to-float v1, v1

    .line 13
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sput v1, Lorg/burnoutcrew/reorderable/c;->b:F

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    sput v0, Lorg/burnoutcrew/reorderable/c;->c:F

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method

.method public static final synthetic a(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/burnoutcrew/reorderable/c;->d(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 8
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Lorg/burnoutcrew/reorderable/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lorg/burnoutcrew/reorderable/c$a;

    .line 7
    .line 8
    iget v1, v0, Lorg/burnoutcrew/reorderable/c$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/burnoutcrew/reorderable/c$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/burnoutcrew/reorderable/c$a;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lorg/burnoutcrew/reorderable/c$a;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lorg/burnoutcrew/reorderable/c$a;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lorg/burnoutcrew/reorderable/c$a;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lorg/burnoutcrew/reorderable/c$a;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkotlin/jvm/internal/k1$h;

    .line 42
    .line 43
    iget-object p1, v0, Lorg/burnoutcrew/reorderable/c$a;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/t3; {:try_start_0 .. :try_end_0} :catch_1

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Lkotlin/jvm/internal/k1$h;

    .line 63
    .line 64
    invoke-direct {p2}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lkotlin/jvm/internal/k1$h;

    .line 68
    .line 69
    invoke-direct {v2}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, v2, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/PointerInputScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v5}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v5

    .line 82
    :try_start_1
    new-instance v7, Lorg/burnoutcrew/reorderable/c$b;

    .line 83
    .line 84
    invoke-direct {v7, p0, v2, p2, v3}, Lorg/burnoutcrew/reorderable/c$b;-><init>(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, v0, Lorg/burnoutcrew/reorderable/c$a;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p2, v0, Lorg/burnoutcrew/reorderable/c$a;->L$1:Ljava/lang/Object;

    .line 90
    .line 91
    iput v4, v0, Lorg/burnoutcrew/reorderable/c$a;->label:I

    .line 92
    .line 93
    invoke-static {v5, v6, v7, v0}, Lkotlinx/coroutines/v3;->c(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/t3; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    if-ne p0, v1, :cond_4

    .line 98
    .line 99
    return-object v1

    .line 100
    :catch_0
    move-object p0, p2

    .line 101
    :catch_1
    iget-object p0, p0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 104
    .line 105
    if-nez p0, :cond_3

    .line 106
    .line 107
    move-object v3, p1

    .line 108
    goto :goto_1

    .line 109
    :cond_3
    move-object v3, p0

    .line 110
    :cond_4
    :goto_1
    return-object v3
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
    .line 219
    .line 220
    .line 221
.end method

.method public static final c(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 19
    .param p0    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Lorg/burnoutcrew/reorderable/c$c;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lorg/burnoutcrew/reorderable/c$c;

    .line 11
    .line 12
    iget v4, v3, Lorg/burnoutcrew/reorderable/c$c;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lorg/burnoutcrew/reorderable/c$c;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lorg/burnoutcrew/reorderable/c$c;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lorg/burnoutcrew/reorderable/c$c;-><init>(Lkotlin/coroutines/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lorg/burnoutcrew/reorderable/c$c;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Lorg/burnoutcrew/reorderable/c$c;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Lorg/burnoutcrew/reorderable/c$c;->F$0:F

    .line 47
    .line 48
    iget-wide v9, v3, Lorg/burnoutcrew/reorderable/c$c;->J$0:J

    .line 49
    .line 50
    iget-object v1, v3, Lorg/burnoutcrew/reorderable/c$c;->L$3:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 53
    .line 54
    iget-object v5, v3, Lorg/burnoutcrew/reorderable/c$c;->L$2:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Lkotlin/jvm/internal/k1$g;

    .line 57
    .line 58
    iget-object v11, v3, Lorg/burnoutcrew/reorderable/c$c;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v11, Lv3/p;

    .line 61
    .line 62
    iget-object v12, v3, Lorg/burnoutcrew/reorderable/c$c;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v12, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 65
    .line 66
    invoke-static {v2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v2, v0

    .line 70
    move v7, v6

    .line 71
    move-object v0, v12

    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    iget v0, v3, Lorg/burnoutcrew/reorderable/c$c;->F$0:F

    .line 83
    .line 84
    iget-wide v9, v3, Lorg/burnoutcrew/reorderable/c$c;->J$0:J

    .line 85
    .line 86
    iget-object v1, v3, Lorg/burnoutcrew/reorderable/c$c;->L$2:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lkotlin/jvm/internal/k1$g;

    .line 89
    .line 90
    iget-object v5, v3, Lorg/burnoutcrew/reorderable/c$c;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Lv3/p;

    .line 93
    .line 94
    iget-object v11, v3, Lorg/burnoutcrew/reorderable/c$c;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v11, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 v18, v3

    .line 102
    .line 103
    move v3, v0

    .line 104
    move-object v0, v11

    .line 105
    move-wide v10, v9

    .line 106
    move-object v9, v1

    .line 107
    move-object v1, v5

    .line 108
    :goto_1
    move-object v5, v4

    .line 109
    move-object/from16 v4, v18

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    invoke-static {v2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2, v0, v1}, Lorg/burnoutcrew/reorderable/c;->d(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    return-object v8

    .line 126
    :cond_4
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    move/from16 v5, p3

    .line 137
    .line 138
    invoke-static {v2, v5}, Lorg/burnoutcrew/reorderable/c;->e(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    new-instance v5, Lkotlin/jvm/internal/k1$g;

    .line 143
    .line 144
    invoke-direct {v5}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-wide v0, v5, Lkotlin/jvm/internal/k1$g;->element:J

    .line 148
    .line 149
    move-object/from16 v0, p0

    .line 150
    .line 151
    move-object/from16 v1, p4

    .line 152
    .line 153
    :goto_2
    iput-object v0, v3, Lorg/burnoutcrew/reorderable/c$c;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v1, v3, Lorg/burnoutcrew/reorderable/c$c;->L$1:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v5, v3, Lorg/burnoutcrew/reorderable/c$c;->L$2:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v8, v3, Lorg/burnoutcrew/reorderable/c$c;->L$3:Ljava/lang/Object;

    .line 160
    .line 161
    iput-wide v9, v3, Lorg/burnoutcrew/reorderable/c$c;->J$0:J

    .line 162
    .line 163
    iput v2, v3, Lorg/burnoutcrew/reorderable/c$c;->F$0:F

    .line 164
    .line 165
    iput v7, v3, Lorg/burnoutcrew/reorderable/c$c;->label:I

    .line 166
    .line 167
    invoke-static {v0, v8, v3, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    if-ne v11, v4, :cond_5

    .line 172
    .line 173
    return-object v4

    .line 174
    :cond_5
    move-object/from16 v18, v3

    .line 175
    .line 176
    move v3, v2

    .line 177
    move-object v2, v11

    .line 178
    move-wide v10, v9

    .line 179
    move-object v9, v5

    .line 180
    goto :goto_1

    .line 181
    :goto_3
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    const/4 v15, 0x0

    .line 192
    :goto_4
    if-ge v15, v13, :cond_7

    .line 193
    .line 194
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v16

    .line 198
    move-object/from16 v17, v16

    .line 199
    .line 200
    check-cast v17, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 201
    .line 202
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    move/from16 v17, v15

    .line 207
    .line 208
    iget-wide v14, v9, Lkotlin/jvm/internal/k1$g;->element:J

    .line 209
    .line 210
    invoke-static {v6, v7, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-eqz v6, :cond_6

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_6
    add-int/lit8 v15, v17, 0x1

    .line 218
    .line 219
    const/4 v6, 0x2

    .line 220
    const/4 v7, 0x1

    .line 221
    goto :goto_4

    .line 222
    :cond_7
    move-object/from16 v16, v8

    .line 223
    .line 224
    :goto_5
    move-object/from16 v6, v16

    .line 225
    .line 226
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 227
    .line 228
    if-nez v6, :cond_8

    .line 229
    .line 230
    return-object v8

    .line 231
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_9

    .line 236
    .line 237
    return-object v8

    .line 238
    :cond_9
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_d

    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    const/4 v14, 0x0

    .line 253
    :goto_6
    if-ge v14, v6, :cond_b

    .line 254
    .line 255
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    move-object v12, v7

    .line 260
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 261
    .line 262
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    if-eqz v12, :cond_a

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_b
    move-object v7, v8

    .line 273
    :goto_7
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 274
    .line 275
    if-nez v7, :cond_c

    .line 276
    .line 277
    return-object v8

    .line 278
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 279
    .line 280
    .line 281
    move-result-wide v6

    .line 282
    iput-wide v6, v9, Lkotlin/jvm/internal/k1$g;->element:J

    .line 283
    .line 284
    move v2, v3

    .line 285
    move-object v3, v4

    .line 286
    move-object v4, v5

    .line 287
    move-object v5, v9

    .line 288
    move-wide v9, v10

    .line 289
    const/4 v6, 0x2

    .line 290
    goto :goto_a

    .line 291
    :cond_d
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 292
    .line 293
    .line 294
    move-result-wide v12

    .line 295
    invoke-static {v10, v11, v12, v13}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 296
    .line 297
    .line 298
    move-result-wide v10

    .line 299
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    cmpl-float v7, v2, v3

    .line 304
    .line 305
    if-ltz v7, :cond_f

    .line 306
    .line 307
    invoke-static {v10, v11, v2}, Landroidx/compose/ui/geometry/Offset;->div-tuRUvjQ(JF)J

    .line 308
    .line 309
    .line 310
    move-result-wide v12

    .line 311
    invoke-static {v12, v13, v3}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    .line 312
    .line 313
    .line 314
    move-result-wide v12

    .line 315
    invoke-static {v10, v11, v12, v13}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 316
    .line 317
    .line 318
    move-result-wide v12

    .line 319
    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-interface {v1, v6, v2}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_e

    .line 331
    .line 332
    const/4 v14, 0x1

    .line 333
    goto :goto_8

    .line 334
    :cond_e
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 337
    .line 338
    .line 339
    move-result-wide v10

    .line 340
    :cond_f
    const/4 v14, 0x0

    .line 341
    :goto_8
    if-eqz v14, :cond_10

    .line 342
    .line 343
    return-object v6

    .line 344
    :cond_10
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 345
    .line 346
    iput-object v0, v4, Lorg/burnoutcrew/reorderable/c$c;->L$0:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v1, v4, Lorg/burnoutcrew/reorderable/c$c;->L$1:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v9, v4, Lorg/burnoutcrew/reorderable/c$c;->L$2:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v6, v4, Lorg/burnoutcrew/reorderable/c$c;->L$3:Ljava/lang/Object;

    .line 353
    .line 354
    iput-wide v10, v4, Lorg/burnoutcrew/reorderable/c$c;->J$0:J

    .line 355
    .line 356
    iput v3, v4, Lorg/burnoutcrew/reorderable/c$c;->F$0:F

    .line 357
    .line 358
    const/4 v7, 0x2

    .line 359
    iput v7, v4, Lorg/burnoutcrew/reorderable/c$c;->label:I

    .line 360
    .line 361
    invoke-interface {v0, v2, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-ne v2, v5, :cond_11

    .line 366
    .line 367
    return-object v5

    .line 368
    :cond_11
    move v2, v3

    .line 369
    move-object v3, v4

    .line 370
    move-object v4, v5

    .line 371
    move-object v5, v9

    .line 372
    move-wide v9, v10

    .line 373
    move-object v11, v1

    .line 374
    move-object v1, v6

    .line 375
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_12

    .line 380
    .line 381
    return-object v8

    .line 382
    :cond_12
    move v6, v7

    .line 383
    move-object v1, v11

    .line 384
    :goto_a
    const/4 v7, 0x1

    .line 385
    goto/16 :goto_2
.end method

.method private static final d(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    move-object v4, v3

    .line 18
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-static {v4, v5, p1, p2}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v3, 0x0

    .line 35
    :goto_1
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-ne p1, p0, :cond_2

    .line 45
    .line 46
    move v1, p0

    .line 47
    :cond_2
    xor-int/2addr p0, v1

    .line 48
    return p0
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
.end method

.method private static final e(Landroidx/compose/ui/platform/ViewConfiguration;I)F
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sget p1, Lorg/burnoutcrew/reorderable/c;->c:F

    .line 18
    .line 19
    mul-float/2addr p0, p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    :goto_0
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method
