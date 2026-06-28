.class final Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1"
    f = "TapAndDoubleTapGesture.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4
    }
    l = {
        0x2c,
        0x32,
        0x36,
        0x40,
        0x45,
        0x4d
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "longPressTimeout",
        "$this$awaitEachGesture",
        "longPressTimeout",
        "$this$awaitEachGesture"
    }
    s = {
        "L$0",
        "L$0",
        "J$0",
        "L$0",
        "J$0",
        "L$0",
        "J$0",
        "L$0"
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
.field final synthetic $onDoubleTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

.field final synthetic $onTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;",
            "Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onDoubleTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
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

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onDoubleTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    return-object v0
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
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
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :pswitch_1
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 29
    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :pswitch_2
    iget-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :pswitch_3
    iget-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_4
    iget-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 59
    .line 60
    :try_start_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_5
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_6
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v7, 0x3

    .line 82
    const/4 v8, 0x0

    .line 83
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    iput v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 87
    .line 88
    move-object v3, p1

    .line 89
    move-object v6, p0

    .line 90
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-ne v1, v0, :cond_0

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_0
    move-object v9, v1

    .line 98
    move-object v1, p1

    .line 99
    move-object p1, v9

    .line 100
    :goto_0
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    :try_start_2
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1;

    .line 114
    .line 115
    invoke-direct {p1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1;-><init>(Lkotlin/coroutines/d;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 121
    .line 122
    const/4 v5, 0x2

    .line 123
    iput v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 124
    .line 125
    invoke-interface {v1, v3, v4, p1, p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeout(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v0, :cond_1

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_1
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;
    :try_end_2
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catch_0
    iput-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    iput-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 138
    .line 139
    const/4 p1, 0x3

    .line 140
    iput p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 141
    .line 142
    invoke-static {v1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt;->access$consumeUntilUp(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v0, :cond_2

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_2
    :goto_2
    move-object p1, v2

    .line 150
    :goto_3
    if-eqz p1, :cond_5

    .line 151
    .line 152
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 153
    .line 154
    .line 155
    iget-object v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    .line 156
    .line 157
    if-eqz v5, :cond_3

    .line 158
    .line 159
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 160
    .line 161
    .line 162
    move-result-wide v6

    .line 163
    invoke-interface {v5, v6, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;->onEvent-k-4lQ0M(J)V

    .line 164
    .line 165
    .line 166
    :cond_3
    iget-object v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onDoubleTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    .line 167
    .line 168
    if-eqz v5, :cond_5

    .line 169
    .line 170
    iput-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-wide v3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->J$0:J

    .line 173
    .line 174
    const/4 v5, 0x4

    .line 175
    iput v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 176
    .line 177
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt;->access$awaitSecondDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v0, :cond_4

    .line 182
    .line 183
    return-object v0

    .line 184
    :cond_4
    :goto_4
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 185
    .line 186
    if-eqz p1, :cond_5

    .line 187
    .line 188
    :try_start_3
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2;

    .line 189
    .line 190
    iget-object v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->$onDoubleTap:Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;

    .line 191
    .line 192
    invoke-direct {p1, v5, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lkotlin/coroutines/d;)V

    .line 193
    .line 194
    .line 195
    iput-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    const/4 v5, 0x5

    .line 198
    iput v5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 199
    .line 200
    invoke-interface {v1, v3, v4, p1, p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeout(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1
    :try_end_3
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 204
    if-ne p1, v0, :cond_5

    .line 205
    .line 206
    return-object v0

    .line 207
    :catch_1
    iput-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    const/4 p1, 0x6

    .line 210
    iput p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1;->label:I

    .line 211
    .line 212
    invoke-static {v1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt;->access$consumeUntilUp(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-ne p1, v0, :cond_5

    .line 217
    .line 218
    return-object v0

    .line 219
    :cond_5
    :goto_5
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 220
    .line 221
    return-object p1

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
