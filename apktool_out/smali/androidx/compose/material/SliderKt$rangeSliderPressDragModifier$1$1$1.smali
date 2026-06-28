.class final Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1"
    f = "Slider.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x3dd,
        0x3e7,
        0x3fa
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "event",
        "interaction",
        "posX",
        "draggingStart",
        "interaction",
        "draggingStart"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1"
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


# instance fields
.field final synthetic $$this$coroutineScope:Lkotlinx/coroutines/s0;

.field final synthetic $gestureEndAction:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/l<",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $isRtl:Z

.field final synthetic $maxPx:F

.field final synthetic $onDrag:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/p<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

.field final synthetic $rawOffsetEnd:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $rawOffsetStart:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(ZFLandroidx/compose/material/RangeSliderLogic;Landroidx/compose/runtime/State;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Landroidx/compose/material/RangeSliderLogic;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/p<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$isRtl:Z

    iput p2, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$maxPx:F

    iput-object p3, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

    iput-object p4, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetStart:Landroidx/compose/runtime/State;

    iput-object p5, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iput-object p6, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$gestureEndAction:Landroidx/compose/runtime/State;

    iput-object p7, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/State;

    iput-object p8, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$onDrag:Landroidx/compose/runtime/State;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 11
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

    new-instance v10, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;

    iget-boolean v1, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$isRtl:Z

    iget v2, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$maxPx:F

    iget-object v3, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

    iget-object v4, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetStart:Landroidx/compose/runtime/State;

    iget-object v5, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    iget-object v6, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$gestureEndAction:Landroidx/compose/runtime/State;

    iget-object v7, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/State;

    iget-object v8, p0, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$onDrag:Landroidx/compose/runtime/State;

    move-object v0, v10

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;-><init>(ZFLandroidx/compose/material/RangeSliderLogic;Landroidx/compose/runtime/State;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V

    iput-object p1, v10, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    return-object v10
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18
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
    iget v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->label:I

    .line 8
    .line 9
    const/4 v8, 0x3

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v12, 0x1

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v12, :cond_2

    .line 16
    .line 17
    if-eq v0, v9, :cond_1

    .line 18
    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    iget-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lkotlin/jvm/internal/k1$a;

    .line 24
    .line 25
    iget-object v1, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroidx/compose/foundation/interaction/DragInteraction$Start;

    .line 28
    .line 29
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 30
    .line 31
    .line 32
    move-object v3, v1

    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    goto/16 :goto_8

    .line 36
    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    iget-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$4:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lkotlin/jvm/internal/k1$a;

    .line 48
    .line 49
    iget-object v1, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$3:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lkotlin/jvm/internal/k1$e;

    .line 52
    .line 53
    iget-object v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Landroidx/compose/foundation/interaction/DragInteraction$Start;

    .line 56
    .line 57
    iget-object v3, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 60
    .line 61
    iget-object v4, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v5, v4

    .line 69
    move-object v4, v3

    .line 70
    move-object v3, v2

    .line 71
    move-object/from16 v2, p1

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_2
    iget-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v4, v0

    .line 83
    move-object/from16 v0, p1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v13, v0

    .line 92
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v4, 0x2

    .line 97
    const/4 v5, 0x0

    .line 98
    iput-object v13, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput v12, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->label:I

    .line 101
    .line 102
    move-object v0, v13

    .line 103
    move-object/from16 v3, p0

    .line 104
    .line 105
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v7, :cond_4

    .line 110
    .line 111
    return-object v7

    .line 112
    :cond_4
    move-object v4, v13

    .line 113
    :goto_0
    move-object v3, v0

    .line 114
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 115
    .line 116
    new-instance v0, Landroidx/compose/foundation/interaction/DragInteraction$Start;

    .line 117
    .line 118
    invoke-direct {v0}, Landroidx/compose/foundation/interaction/DragInteraction$Start;-><init>()V

    .line 119
    .line 120
    .line 121
    new-instance v1, Lkotlin/jvm/internal/k1$e;

    .line 122
    .line 123
    invoke-direct {v1}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-boolean v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$isRtl:Z

    .line 127
    .line 128
    if-eqz v2, :cond_5

    .line 129
    .line 130
    iget v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$maxPx:F

    .line 131
    .line 132
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 133
    .line 134
    .line 135
    move-result-wide v13

    .line 136
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    sub-float/2addr v2, v5

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 143
    .line 144
    .line 145
    move-result-wide v13

    .line 146
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    :goto_1
    iput v2, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 151
    .line 152
    iget-object v5, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

    .line 153
    .line 154
    invoke-virtual {v5, v2}, Landroidx/compose/material/RangeSliderLogic;->compareOffsets(F)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    new-instance v5, Lkotlin/jvm/internal/k1$a;

    .line 159
    .line 160
    invoke-direct {v5}, Lkotlin/jvm/internal/k1$a;-><init>()V

    .line 161
    .line 162
    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    if-gez v2, :cond_7

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    iget-object v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetStart:Landroidx/compose/runtime/State;

    .line 169
    .line 170
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iget v13, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 181
    .line 182
    cmpl-float v2, v2, v13

    .line 183
    .line 184
    if-lez v2, :cond_7

    .line 185
    .line 186
    :goto_2
    move v2, v12

    .line 187
    goto :goto_3

    .line 188
    :cond_7
    const/4 v2, 0x0

    .line 189
    :goto_3
    iput-boolean v2, v5, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 190
    .line 191
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 192
    .line 193
    .line 194
    move-result-wide v13

    .line 195
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    iput-object v4, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v3, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$1:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$2:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v1, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$3:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v5, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$4:Ljava/lang/Object;

    .line 208
    .line 209
    iput v9, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->label:I

    .line 210
    .line 211
    invoke-static {v4, v13, v14, v2, v6}, Landroidx/compose/material/SliderKt;->access$awaitSlop-8vUncbI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-ne v2, v7, :cond_8

    .line 216
    .line 217
    return-object v7

    .line 218
    :cond_8
    move-object/from16 v17, v3

    .line 219
    .line 220
    move-object v3, v0

    .line 221
    move-object v0, v5

    .line 222
    move-object v5, v4

    .line 223
    move-object/from16 v4, v17

    .line 224
    .line 225
    :goto_4
    check-cast v2, Lkotlin/u0;

    .line 226
    .line 227
    if-eqz v2, :cond_c

    .line 228
    .line 229
    iget-object v9, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/State;

    .line 230
    .line 231
    iget-object v13, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rawOffsetStart:Landroidx/compose/runtime/State;

    .line 232
    .line 233
    iget-boolean v14, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$isRtl:Z

    .line 234
    .line 235
    invoke-interface {v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    invoke-static {v15, v11}, Landroidx/compose/material/DragGestureDetectorCopyKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    invoke-interface {v9}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    check-cast v9, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    iget v15, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 258
    .line 259
    sub-float/2addr v9, v15

    .line 260
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    cmpg-float v9, v9, v11

    .line 265
    .line 266
    if-gez v9, :cond_9

    .line 267
    .line 268
    invoke-interface {v13}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    check-cast v9, Ljava/lang/Number;

    .line 273
    .line 274
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    iget v13, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 279
    .line 280
    sub-float/2addr v9, v13

    .line 281
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    cmpg-float v9, v9, v11

    .line 286
    .line 287
    if-gez v9, :cond_9

    .line 288
    .line 289
    move v9, v12

    .line 290
    goto :goto_5

    .line 291
    :cond_9
    const/4 v9, 0x0

    .line 292
    :goto_5
    if-eqz v9, :cond_c

    .line 293
    .line 294
    invoke-virtual {v2}, Lkotlin/u0;->getSecond()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    check-cast v9, Ljava/lang/Number;

    .line 299
    .line 300
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    const/4 v11, 0x0

    .line 305
    if-eqz v14, :cond_a

    .line 306
    .line 307
    cmpl-float v9, v9, v11

    .line 308
    .line 309
    if-ltz v9, :cond_b

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_a
    cmpg-float v9, v9, v11

    .line 313
    .line 314
    if-gez v9, :cond_b

    .line 315
    .line 316
    :goto_6
    move v11, v12

    .line 317
    goto :goto_7

    .line 318
    :cond_b
    const/4 v11, 0x0

    .line 319
    :goto_7
    iput-boolean v11, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 320
    .line 321
    iget v9, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 322
    .line 323
    invoke-virtual {v2}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 328
    .line 329
    invoke-static {v2}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 330
    .line 331
    .line 332
    move-result-wide v11

    .line 333
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    add-float/2addr v9, v2

    .line 338
    iput v9, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 339
    .line 340
    :cond_c
    iget-object v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

    .line 341
    .line 342
    iget-boolean v9, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 343
    .line 344
    iget v1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 345
    .line 346
    iget-object v11, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    .line 347
    .line 348
    invoke-virtual {v2, v9, v1, v3, v11}, Landroidx/compose/material/RangeSliderLogic;->captureThumb(ZFLandroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/s0;)V

    .line 349
    .line 350
    .line 351
    :try_start_1
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 352
    .line 353
    .line 354
    move-result-wide v1

    .line 355
    new-instance v4, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1;

    .line 356
    .line 357
    iget-object v9, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$onDrag:Landroidx/compose/runtime/State;

    .line 358
    .line 359
    iget-boolean v11, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$isRtl:Z

    .line 360
    .line 361
    invoke-direct {v4, v9, v0, v11}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1;-><init>(Landroidx/compose/runtime/State;Lkotlin/jvm/internal/k1$a;Z)V

    .line 362
    .line 363
    .line 364
    iput-object v3, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v0, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$1:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v10, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$2:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v10, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$3:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v10, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->L$4:Ljava/lang/Object;

    .line 373
    .line 374
    iput v8, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->label:I

    .line 375
    .line 376
    invoke-static {v5, v1, v2, v4, v6}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->horizontalDrag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    if-ne v1, v7, :cond_d

    .line 381
    .line 382
    return-object v7

    .line 383
    :cond_d
    :goto_8
    check-cast v1, Ljava/lang/Boolean;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_e

    .line 390
    .line 391
    new-instance v1, Landroidx/compose/foundation/interaction/DragInteraction$Stop;

    .line 392
    .line 393
    invoke-direct {v1, v3}, Landroidx/compose/foundation/interaction/DragInteraction$Stop;-><init>(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V

    .line 394
    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_e
    new-instance v1, Landroidx/compose/foundation/interaction/DragInteraction$Cancel;

    .line 398
    .line 399
    invoke-direct {v1, v3}, Landroidx/compose/foundation/interaction/DragInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 400
    .line 401
    .line 402
    goto :goto_9

    .line 403
    :catch_0
    move-object v1, v3

    .line 404
    :catch_1
    new-instance v2, Landroidx/compose/foundation/interaction/DragInteraction$Cancel;

    .line 405
    .line 406
    invoke-direct {v2, v1}, Landroidx/compose/foundation/interaction/DragInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V

    .line 407
    .line 408
    .line 409
    move-object v1, v2

    .line 410
    :goto_9
    iget-object v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$gestureEndAction:Landroidx/compose/runtime/State;

    .line 411
    .line 412
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    check-cast v2, Lv3/l;

    .line 417
    .line 418
    iget-boolean v3, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 419
    .line 420
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-interface {v2, v3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    iget-object v11, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/s0;

    .line 428
    .line 429
    const/4 v12, 0x0

    .line 430
    const/4 v13, 0x0

    .line 431
    new-instance v14, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1$2;

    .line 432
    .line 433
    iget-object v2, v6, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1;->$rangeSliderLogic:Landroidx/compose/material/RangeSliderLogic;

    .line 434
    .line 435
    invoke-direct {v14, v2, v0, v1, v10}, Landroidx/compose/material/SliderKt$rangeSliderPressDragModifier$1$1$1$2;-><init>(Landroidx/compose/material/RangeSliderLogic;Lkotlin/jvm/internal/k1$a;Landroidx/compose/foundation/interaction/DragInteraction;Lkotlin/coroutines/d;)V

    .line 436
    .line 437
    .line 438
    const/4 v15, 0x3

    .line 439
    const/16 v16, 0x0

    .line 440
    .line 441
    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 442
    .line 443
    .line 444
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 445
    .line 446
    return-object v0
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
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
