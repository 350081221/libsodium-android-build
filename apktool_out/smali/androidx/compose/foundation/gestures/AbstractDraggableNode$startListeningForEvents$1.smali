.class final Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AbstractDraggableNode;->startListeningForEvents()V
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
    c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1"
    f = "Draggable.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x4,
        0x5
    }
    l = {
        0x1af,
        0x1b1,
        0x1b3,
        0x1ba,
        0x1bc,
        0x1bf
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "event",
        "$this$launch",
        "event",
        "$this$launch",
        "event",
        "$this$launch",
        "$this$launch",
        "$this$launch"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$0",
        "L$0"
    }
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
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/AbstractDraggableNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 2
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

    new-instance v0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;-><init>(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
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
    iget v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

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
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lkotlinx/coroutines/s0;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :pswitch_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lkotlinx/coroutines/s0;

    .line 30
    .line 31
    :goto_0
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :pswitch_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lkotlinx/coroutines/s0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    move-object p1, v1

    .line 41
    goto :goto_2

    .line 42
    :pswitch_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lkotlin/jvm/internal/k1$h;

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lkotlinx/coroutines/s0;

    .line 49
    .line 50
    :try_start_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    .line 52
    .line 53
    move-object p1, v3

    .line 54
    move-object v3, p0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :catch_0
    move-object v1, v3

    .line 58
    :catch_1
    move-object v3, p0

    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :pswitch_4
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lkotlin/jvm/internal/k1$h;

    .line 64
    .line 65
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lkotlinx/coroutines/s0;

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v4, v3

    .line 73
    move-object v3, p0

    .line 74
    goto :goto_5

    .line 75
    :pswitch_5
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$2:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lkotlin/jvm/internal/k1$h;

    .line 78
    .line 79
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Lkotlin/jvm/internal/k1$h;

    .line 82
    .line 83
    iget-object v4, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Lkotlinx/coroutines/s0;

    .line 86
    .line 87
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object v5, v3

    .line 91
    move-object v3, p0

    .line 92
    goto :goto_4

    .line 93
    :pswitch_6
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Lkotlinx/coroutines/s0;

    .line 99
    .line 100
    :goto_2
    move-object v1, p0

    .line 101
    :goto_3
    invoke-static {p1}, Lkotlinx/coroutines/t0;->k(Lkotlinx/coroutines/s0;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_7

    .line 106
    .line 107
    new-instance v3, Lkotlin/jvm/internal/k1$h;

    .line 108
    .line 109
    invoke-direct {v3}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 110
    .line 111
    .line 112
    iget-object v4, v1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 113
    .line 114
    invoke-static {v4}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$getChannel$p(Landroidx/compose/foundation/gestures/AbstractDraggableNode;)Lkotlinx/coroutines/channels/l;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iput-object p1, v1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v3, v1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, v1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    iput v5, v1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 126
    .line 127
    invoke-interface {v4, v1}, Lkotlinx/coroutines/channels/g0;->D(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-ne v4, v0, :cond_0

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_0
    move-object v5, v3

    .line 135
    move-object v3, v1

    .line 136
    move-object v1, v5

    .line 137
    move-object v7, v4

    .line 138
    move-object v4, p1

    .line 139
    move-object p1, v7

    .line 140
    :goto_4
    iput-object p1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object p1, v5, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 143
    .line 144
    instance-of v1, p1, Landroidx/compose/foundation/gestures/DragEvent$DragStarted;

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    iget-object v1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 149
    .line 150
    check-cast p1, Landroidx/compose/foundation/gestures/DragEvent$DragStarted;

    .line 151
    .line 152
    iput-object v4, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v5, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v2, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$2:Ljava/lang/Object;

    .line 157
    .line 158
    const/4 v6, 0x2

    .line 159
    iput v6, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 160
    .line 161
    invoke-static {v1, v4, p1, v3}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$processDragStart(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlinx/coroutines/s0;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-ne p1, v0, :cond_1

    .line 166
    .line 167
    return-object v0

    .line 168
    :cond_1
    move-object v1, v5

    .line 169
    :goto_5
    :try_start_2
    iget-object p1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 170
    .line 171
    new-instance v5, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;

    .line 172
    .line 173
    invoke-direct {v5, v1, p1, v2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlin/coroutines/d;)V

    .line 174
    .line 175
    .line 176
    iput-object v4, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 179
    .line 180
    const/4 v6, 0x3

    .line 181
    iput v6, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 182
    .line 183
    invoke-virtual {p1, v5, v3}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->drag(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3

    .line 187
    if-ne p1, v0, :cond_2

    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_2
    move-object p1, v4

    .line 191
    :goto_6
    :try_start_3
    iget-object v1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 192
    .line 193
    instance-of v4, v1, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    .line 194
    .line 195
    if-eqz v4, :cond_3

    .line 196
    .line 197
    iget-object v4, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 198
    .line 199
    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"

    .line 200
    .line 201
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    check-cast v1, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    .line 205
    .line 206
    iput-object p1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v2, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 209
    .line 210
    const/4 v5, 0x4

    .line 211
    iput v5, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 212
    .line 213
    invoke-static {v4, p1, v1, v3}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$processDragStop(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlinx/coroutines/s0;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    if-ne v1, v0, :cond_4

    .line 218
    .line 219
    return-object v0

    .line 220
    :cond_3
    instance-of v1, v1, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    .line 221
    .line 222
    if-eqz v1, :cond_4

    .line 223
    .line 224
    iget-object v1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 225
    .line 226
    iput-object p1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object v2, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 229
    .line 230
    const/4 v4, 0x5

    .line 231
    iput v4, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 232
    .line 233
    invoke-static {v1, p1, v3}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$processDragCancel(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 237
    if-ne v1, v0, :cond_4

    .line 238
    .line 239
    return-object v0

    .line 240
    :cond_4
    :goto_7
    move-object v1, v3

    .line 241
    goto/16 :goto_3

    .line 242
    .line 243
    :catch_2
    move-object v1, p1

    .line 244
    goto :goto_8

    .line 245
    :catch_3
    move-object v1, v4

    .line 246
    :goto_8
    iget-object p1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 247
    .line 248
    iput-object v1, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$0:Ljava/lang/Object;

    .line 249
    .line 250
    iput-object v2, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->L$1:Ljava/lang/Object;

    .line 251
    .line 252
    const/4 v4, 0x6

    .line 253
    iput v4, v3, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->label:I

    .line 254
    .line 255
    invoke-static {p1, v1, v3}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$processDragCancel(Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-ne p1, v0, :cond_5

    .line 260
    .line 261
    return-object v0

    .line 262
    :cond_5
    move-object p1, v1

    .line 263
    goto :goto_7

    .line 264
    :cond_6
    move-object v1, v3

    .line 265
    move-object p1, v4

    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :cond_7
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 269
    .line 270
    return-object p1

    .line 271
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
