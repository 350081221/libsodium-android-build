.class final Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Landroidx/compose/foundation/gestures/AbstractDragScope;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1"
    f = "Draggable.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x1b5,
        0x1b6
    }
    m = "invokeSuspend"
    n = {
        "$this$drag",
        "$this$drag"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/AbstractDragScope;",
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
        "SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $event:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;",
            "Landroidx/compose/foundation/gestures/AbstractDraggableNode;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->$event:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

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

    new-instance v0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->$event:Lkotlin/jvm/internal/k1$h;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/foundation/gestures/AbstractDraggableNode;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/AbstractDragScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/AbstractDragScope;
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
            "Landroidx/compose/foundation/gestures/AbstractDragScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/AbstractDragScope;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->invoke(Landroidx/compose/foundation/gestures/AbstractDragScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
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
    iget v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->label:I

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
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlin/jvm/internal/k1$h;

    .line 18
    .line 19
    iget-object v4, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Landroidx/compose/foundation/gestures/AbstractDragScope;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v5, v4

    .line 27
    move-object v4, v1

    .line 28
    move-object v1, v0

    .line 29
    move-object v0, p0

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/compose/foundation/gestures/AbstractDragScope;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p1, p0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Landroidx/compose/foundation/gestures/AbstractDragScope;

    .line 55
    .line 56
    move-object v1, p1

    .line 57
    move-object p1, p0

    .line 58
    :goto_0
    iget-object v4, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->$event:Lkotlin/jvm/internal/k1$h;

    .line 59
    .line 60
    iget-object v4, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 61
    .line 62
    instance-of v5, v4, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    .line 63
    .line 64
    if-nez v5, :cond_6

    .line 65
    .line 66
    instance-of v5, v4, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    .line 67
    .line 68
    if-nez v5, :cond_6

    .line 69
    .line 70
    instance-of v5, v4, Landroidx/compose/foundation/gestures/DragEvent$DragDelta;

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    move-object v5, v4

    .line 76
    check-cast v5, Landroidx/compose/foundation/gestures/DragEvent$DragDelta;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v5, v6

    .line 80
    :goto_1
    if-eqz v5, :cond_4

    .line 81
    .line 82
    iget-object v5, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 83
    .line 84
    const-string v7, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"

    .line 85
    .line 86
    invoke-static {v4, v7}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    check-cast v4, Landroidx/compose/foundation/gestures/DragEvent$DragDelta;

    .line 90
    .line 91
    iput-object v1, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v6, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v3, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->label:I

    .line 96
    .line 97
    invoke-virtual {v5, v1, v4, p1}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->draggingBy(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-ne v4, v0, :cond_4

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_4
    :goto_2
    move-object v4, v1

    .line 105
    iget-object v1, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->$event:Lkotlin/jvm/internal/k1$h;

    .line 106
    .line 107
    iget-object v5, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    .line 108
    .line 109
    invoke-static {v5}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->access$getChannel$p(Landroidx/compose/foundation/gestures/AbstractDraggableNode;)Lkotlinx/coroutines/channels/l;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iput-object v4, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v1, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput v2, p1, Landroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1;->label:I

    .line 118
    .line 119
    invoke-interface {v5, p1}, Lkotlinx/coroutines/channels/g0;->D(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    if-ne v5, v0, :cond_5

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    move-object v8, v0

    .line 127
    move-object v0, p1

    .line 128
    move-object p1, v5

    .line 129
    move-object v5, v4

    .line 130
    move-object v4, v1

    .line 131
    move-object v1, v8

    .line 132
    :goto_3
    iput-object p1, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 133
    .line 134
    move-object p1, v0

    .line 135
    move-object v0, v1

    .line 136
    move-object v1, v5

    .line 137
    goto :goto_0

    .line 138
    :cond_6
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    return-object p1
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
