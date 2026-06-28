.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectHorizontalDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5"
    f = "DragGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1
    }
    l = {
        0x21a,
        0x21c,
        0x227
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "overSlop"
    }
    s = {
        "L$0",
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

.field final synthetic $onHorizontalDrag:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Ljava/lang/Float;",
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
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragStart:Lv3/l;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onHorizontalDrag:Lv3/p;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragEnd:Lv3/a;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragCancel:Lv3/a;

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

    new-instance v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragStart:Lv3/l;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onHorizontalDrag:Lv3/p;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragEnd:Lv3/a;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragCancel:Lv3/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;-><init>(Lv3/l;Lv3/p;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)V

    iput-object p1, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lkotlin/jvm/internal/k1$e;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v9, 0x2

    .line 61
    const/4 v10, 0x0

    .line 62
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    iput v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->label:I

    .line 65
    .line 66
    move-object v5, p1

    .line 67
    move-object v8, p0

    .line 68
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-ne v1, v0, :cond_4

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_4
    move-object v11, v1

    .line 76
    move-object v1, p1

    .line 77
    move-object p1, v11

    .line 78
    :goto_0
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 79
    .line 80
    new-instance v10, Lkotlin/jvm/internal/k1$e;

    .line 81
    .line 82
    invoke-direct {v10}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    new-instance v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1;

    .line 94
    .line 95
    invoke-direct {v8, v10}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1;-><init>(Lkotlin/jvm/internal/k1$e;)V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v10, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->label:I

    .line 103
    .line 104
    move-object v4, v1

    .line 105
    move-object v9, p0

    .line 106
    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitHorizontalPointerSlopOrCancellation-gDDlDlE(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_5
    move-object v3, v1

    .line 114
    move-object v1, v10

    .line 115
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 116
    .line 117
    if-eqz p1, :cond_8

    .line 118
    .line 119
    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragStart:Lv3/l;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v4, v5}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onHorizontalDrag:Lv3/p;

    .line 133
    .line 134
    iget v1, v1, Lkotlin/jvm/internal/k1$e;->element:F

    .line 135
    .line 136
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {v4, p1, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    new-instance p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5$1;

    .line 148
    .line 149
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onHorizontalDrag:Lv3/p;

    .line 150
    .line 151
    invoke-direct {p1, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5$1;-><init>(Lv3/p;)V

    .line 152
    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    iput-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$0:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->L$1:Ljava/lang/Object;

    .line 158
    .line 159
    iput v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->label:I

    .line 160
    .line 161
    invoke-static {v3, v4, v5, p1, p0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->horizontalDrag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-ne p1, v0, :cond_6

    .line 166
    .line 167
    return-object v0

    .line 168
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_7

    .line 175
    .line 176
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragEnd:Lv3/a;

    .line 177
    .line 178
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;->$onDragCancel:Lv3/a;

    .line 183
    .line 184
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_8
    :goto_3
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 188
    .line 189
    return-object p1
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
