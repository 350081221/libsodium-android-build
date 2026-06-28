.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5"
    f = "DragGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xaf,
        0x374,
        0x39e,
        0xc0
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "down",
        "overSlop",
        "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv",
        "pointerDirectionConfig$iv",
        "pointer$iv",
        "touchSlop$iv",
        "totalPositionChange$iv",
        "$this$awaitEachGesture",
        "down",
        "overSlop",
        "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv",
        "pointerDirectionConfig$iv",
        "pointer$iv",
        "dragEvent$iv",
        "touchSlop$iv",
        "totalPositionChange$iv"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "F$0",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "F$0",
        "J$0"
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n659#2,10:876\n669#2,4:895\n673#2,38:906\n116#3,2:886\n33#3,6:888\n118#3:894\n33#3,6:899\n118#3:905\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n179#1:876,10\n179#1:895,4\n179#1:906,38\n179#1:886,2\n179#1:888,6\n179#1:894\n179#1:899,6\n179#1:905\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $onDrag:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragCancel:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragEnd:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragStart:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field F$0:F

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lv3/l;Lv3/p;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lv3/l;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lv3/p;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lv3/a;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lv3/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lv3/l;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lv3/p;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lv3/a;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lv3/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;-><init>(Lv3/l;Lv3/p;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    return-object v6
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 8
    .line 9
    const/4 v8, 0x4

    .line 10
    const/4 v9, 0x3

    .line 11
    const/4 v10, 0x2

    .line 12
    const/4 v11, 0x1

    .line 13
    const/4 v12, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-eq v0, v11, :cond_3

    .line 17
    .line 18
    if-eq v0, v10, :cond_2

    .line 19
    .line 20
    if-eq v0, v9, :cond_1

    .line 21
    .line 22
    if-ne v0, v8, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    move-object v2, v6

    .line 30
    goto/16 :goto_c

    .line 31
    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget-wide v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->J$0:J

    .line 41
    .line 42
    iget v2, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 43
    .line 44
    iget-object v3, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 47
    .line 48
    iget-object v4, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Lkotlin/jvm/internal/k1$g;

    .line 51
    .line 52
    iget-object v5, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 55
    .line 56
    iget-object v13, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 59
    .line 60
    iget-object v14, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v14, Lkotlin/jvm/internal/k1$g;

    .line 63
    .line 64
    iget-object v15, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 67
    .line 68
    iget-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move-object/from16 v20, v6

    .line 76
    .line 77
    move v6, v2

    .line 78
    move-object/from16 v2, v20

    .line 79
    .line 80
    move-object/from16 v21, v15

    .line 81
    .line 82
    move-object v15, v4

    .line 83
    move-object/from16 v22, v14

    .line 84
    .line 85
    move-object v14, v5

    .line 86
    move-wide v4, v0

    .line 87
    move-object/from16 v1, v22

    .line 88
    .line 89
    move-object/from16 v0, v21

    .line 90
    .line 91
    move-object/from16 v23, v13

    .line 92
    .line 93
    move-object v13, v8

    .line 94
    move-object/from16 v8, v23

    .line 95
    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :cond_2
    iget-wide v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->J$0:J

    .line 99
    .line 100
    iget v2, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 101
    .line 102
    iget-object v3, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Lkotlin/jvm/internal/k1$g;

    .line 105
    .line 106
    iget-object v4, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 109
    .line 110
    iget-object v5, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 113
    .line 114
    iget-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v8, Lkotlin/jvm/internal/k1$g;

    .line 117
    .line 118
    iget-object v13, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 121
    .line 122
    iget-object v14, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 125
    .line 126
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v10, p1

    .line 130
    .line 131
    move-object v15, v3

    .line 132
    move-object/from16 v20, v5

    .line 133
    .line 134
    move v5, v2

    .line 135
    move-object v2, v6

    .line 136
    move-object/from16 v21, v14

    .line 137
    .line 138
    move-object v14, v4

    .line 139
    move-wide v3, v0

    .line 140
    move-object v1, v8

    .line 141
    move-object v0, v13

    .line 142
    move-object/from16 v13, v21

    .line 143
    .line 144
    move-object/from16 v8, v20

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_3
    iget-object v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 151
    .line 152
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object v8, v0

    .line 156
    move-object/from16 v0, p1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v8, v0

    .line 165
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    const/4 v2, 0x0

    .line 169
    const/4 v4, 0x2

    .line 170
    const/4 v5, 0x0

    .line 171
    iput-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 172
    .line 173
    iput v11, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 174
    .line 175
    move-object v0, v8

    .line 176
    move-object/from16 v3, p0

    .line 177
    .line 178
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-ne v0, v7, :cond_5

    .line 183
    .line 184
    return-object v7

    .line 185
    :cond_5
    :goto_0
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 186
    .line 187
    new-instance v1, Lkotlin/jvm/internal/k1$g;

    .line 188
    .line 189
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 190
    .line 191
    .line 192
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    iput-wide v2, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 199
    .line 200
    move-object v2, v6

    .line 201
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 202
    .line 203
    .line 204
    move-result-wide v3

    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    invoke-static {}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->getBidirectionalPointerDirectionConfig()Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-static {v14, v3, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    if-eqz v14, :cond_6

    .line 222
    .line 223
    move-object v6, v12

    .line 224
    goto/16 :goto_a

    .line 225
    .line 226
    :cond_6
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    invoke-static {v14, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    new-instance v14, Lkotlin/jvm/internal/k1$g;

    .line 235
    .line 236
    invoke-direct {v14}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 237
    .line 238
    .line 239
    iput-wide v3, v14, Lkotlin/jvm/internal/k1$g;->element:J

    .line 240
    .line 241
    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 242
    .line 243
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    move-object v15, v14

    .line 248
    move-object v14, v13

    .line 249
    move-object v13, v8

    .line 250
    :goto_2
    iput-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v12, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 263
    .line 264
    iput v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 265
    .line 266
    iput-wide v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->J$0:J

    .line 267
    .line 268
    iput v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 269
    .line 270
    invoke-static {v8, v12, v2, v11, v12}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    if-ne v10, v7, :cond_7

    .line 275
    .line 276
    return-object v7

    .line 277
    :cond_7
    :goto_3
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 278
    .line 279
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    const/16 v16, 0x0

    .line 288
    .line 289
    move/from16 v9, v16

    .line 290
    .line 291
    :goto_4
    if-ge v9, v12, :cond_9

    .line 292
    .line 293
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v17

    .line 297
    move-object/from16 v18, v17

    .line 298
    .line 299
    check-cast v18, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 300
    .line 301
    move-object/from16 p1, v11

    .line 302
    .line 303
    move/from16 v19, v12

    .line 304
    .line 305
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 306
    .line 307
    .line 308
    move-result-wide v11

    .line 309
    move-object/from16 v18, v7

    .line 310
    .line 311
    iget-wide v6, v15, Lkotlin/jvm/internal/k1$g;->element:J

    .line 312
    .line 313
    invoke-static {v11, v12, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-eqz v6, :cond_8

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 321
    .line 322
    move-object/from16 v6, p0

    .line 323
    .line 324
    move-object/from16 v11, p1

    .line 325
    .line 326
    move-object/from16 v7, v18

    .line 327
    .line 328
    move/from16 v12, v19

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_9
    move-object/from16 v18, v7

    .line 332
    .line 333
    const/16 v17, 0x0

    .line 334
    .line 335
    :goto_5
    move-object/from16 v6, v17

    .line 336
    .line 337
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 338
    .line 339
    if-nez v6, :cond_a

    .line 340
    .line 341
    :goto_6
    move-object v8, v13

    .line 342
    move-object/from16 v7, v18

    .line 343
    .line 344
    const/4 v6, 0x0

    .line 345
    const/4 v9, 0x3

    .line 346
    goto/16 :goto_a

    .line 347
    .line 348
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    if-eqz v7, :cond_b

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_b
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-eqz v7, :cond_f

    .line 360
    .line 361
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    move/from16 v9, v16

    .line 370
    .line 371
    :goto_7
    if-ge v9, v7, :cond_d

    .line 372
    .line 373
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    move-object v11, v10

    .line 378
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 379
    .line 380
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    if-eqz v11, :cond_c

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_d
    const/4 v10, 0x0

    .line 391
    :goto_8
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 392
    .line 393
    if-nez v10, :cond_e

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_e
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    iput-wide v6, v15, Lkotlin/jvm/internal/k1$g;->element:J

    .line 401
    .line 402
    move-object/from16 v6, p0

    .line 403
    .line 404
    move-object/from16 v7, v18

    .line 405
    .line 406
    const/4 v9, 0x3

    .line 407
    const/4 v10, 0x2

    .line 408
    const/4 v11, 0x1

    .line 409
    const/4 v12, 0x0

    .line 410
    goto/16 :goto_2

    .line 411
    .line 412
    :cond_f
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 413
    .line 414
    .line 415
    move-result-wide v9

    .line 416
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 417
    .line 418
    .line 419
    move-result-wide v11

    .line 420
    invoke-static {v9, v10, v11, v12}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 421
    .line 422
    .line 423
    move-result-wide v9

    .line 424
    invoke-static {v3, v4, v9, v10}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 425
    .line 426
    .line 427
    move-result-wide v3

    .line 428
    invoke-interface {v14, v3, v4}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->calculateDeltaChange-k-4lQ0M(J)F

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    cmpg-float v7, v7, v5

    .line 433
    .line 434
    if-gez v7, :cond_12

    .line 435
    .line 436
    sget-object v7, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 437
    .line 438
    iput-object v13, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v1, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 443
    .line 444
    iput-object v8, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 445
    .line 446
    iput-object v14, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 447
    .line 448
    iput-object v15, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 449
    .line 450
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 451
    .line 452
    iput v5, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 453
    .line 454
    iput-wide v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->J$0:J

    .line 455
    .line 456
    const/4 v9, 0x3

    .line 457
    iput v9, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 458
    .line 459
    invoke-interface {v8, v7, v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    move-object/from16 v10, v18

    .line 464
    .line 465
    if-ne v7, v10, :cond_10

    .line 466
    .line 467
    return-object v10

    .line 468
    :cond_10
    move-object v7, v10

    .line 469
    move-object/from16 v20, v6

    .line 470
    .line 471
    move v6, v5

    .line 472
    move-wide v4, v3

    .line 473
    move-object/from16 v3, v20

    .line 474
    .line 475
    :goto_9
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-eqz v3, :cond_11

    .line 480
    .line 481
    move-object v8, v13

    .line 482
    const/4 v6, 0x0

    .line 483
    goto :goto_a

    .line 484
    :cond_11
    move-wide v3, v4

    .line 485
    move v5, v6

    .line 486
    const/4 v10, 0x2

    .line 487
    const/4 v11, 0x1

    .line 488
    const/4 v12, 0x0

    .line 489
    move-object/from16 v6, p0

    .line 490
    .line 491
    goto/16 :goto_2

    .line 492
    .line 493
    :cond_12
    move-object/from16 v10, v18

    .line 494
    .line 495
    const/4 v9, 0x3

    .line 496
    invoke-interface {v14, v3, v4, v5}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->calculatePostSlopOffset-8S9VItk(JF)J

    .line 497
    .line 498
    .line 499
    move-result-wide v3

    .line 500
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 501
    .line 502
    .line 503
    iput-wide v3, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 504
    .line 505
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-eqz v3, :cond_18

    .line 510
    .line 511
    move-object v7, v10

    .line 512
    move-object v8, v13

    .line 513
    :goto_a
    if-eqz v6, :cond_14

    .line 514
    .line 515
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    if-eqz v3, :cond_13

    .line 520
    .line 521
    goto :goto_b

    .line 522
    :cond_13
    move-object/from16 v6, p0

    .line 523
    .line 524
    const/4 v10, 0x2

    .line 525
    const/4 v11, 0x1

    .line 526
    const/4 v12, 0x0

    .line 527
    goto/16 :goto_1

    .line 528
    .line 529
    :cond_14
    :goto_b
    if-eqz v6, :cond_17

    .line 530
    .line 531
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lv3/l;

    .line 532
    .line 533
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 534
    .line 535
    .line 536
    move-result-wide v3

    .line 537
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-interface {v0, v3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lv3/p;

    .line 545
    .line 546
    iget-wide v3, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 547
    .line 548
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    invoke-interface {v0, v6, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 556
    .line 557
    .line 558
    move-result-wide v0

    .line 559
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5$2;

    .line 560
    .line 561
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lv3/p;

    .line 562
    .line 563
    invoke-direct {v3, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5$2;-><init>(Lv3/p;)V

    .line 564
    .line 565
    .line 566
    const/4 v4, 0x0

    .line 567
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 568
    .line 569
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 570
    .line 571
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 572
    .line 573
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 574
    .line 575
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 576
    .line 577
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 578
    .line 579
    iput-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 580
    .line 581
    const/4 v6, 0x4

    .line 582
    iput v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 583
    .line 584
    invoke-static {v8, v0, v1, v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    if-ne v0, v7, :cond_15

    .line 589
    .line 590
    return-object v7

    .line 591
    :cond_15
    :goto_c
    check-cast v0, Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-nez v0, :cond_16

    .line 598
    .line 599
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lv3/a;

    .line 600
    .line 601
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    goto :goto_d

    .line 605
    :cond_16
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lv3/a;

    .line 606
    .line 607
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    :cond_17
    :goto_d
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 611
    .line 612
    return-object v0

    .line 613
    :cond_18
    const/4 v4, 0x0

    .line 614
    const/4 v6, 0x4

    .line 615
    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 616
    .line 617
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 618
    .line 619
    .line 620
    move-result-wide v11

    .line 621
    move-object/from16 v6, p0

    .line 622
    .line 623
    move-object v7, v10

    .line 624
    const/4 v10, 0x2

    .line 625
    move-wide/from16 v20, v11

    .line 626
    .line 627
    move-object v12, v4

    .line 628
    move-wide/from16 v3, v20

    .line 629
    .line 630
    const/4 v11, 0x1

    .line 631
    goto/16 :goto_2
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
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
