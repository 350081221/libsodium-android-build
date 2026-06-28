.class final Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ClickableKt;->genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(Landroidx/compose/ui/Modifier;ZLjava/util/Map;Landroidx/compose/runtime/State;Lkotlinx/coroutines/s0;Lv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "keyEvent",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "invoke-ZmokQxo",
        "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $currentKeyPressInteractions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/input/key/Key;",
            "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $indicationScope:Lkotlinx/coroutines/s0;

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $keyClickOffset:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClick:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLjava/util/Map;Landroidx/compose/runtime/State;Lkotlinx/coroutines/s0;Lv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/input/key/Key;",
            "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$enabled:Z

    iput-object p2, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$currentKeyPressInteractions:Ljava/util/Map;

    iput-object p3, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$keyClickOffset:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$indicationScope:Lkotlinx/coroutines/s0;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$onClick:Lv3/a;

    iput-object p6, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/key/KeyEvent;

    invoke-virtual {p1}, Landroidx/compose/ui/input/key/KeyEvent;->unbox-impl()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 10
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$enabled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/foundation/Clickable_androidKt;->isPress-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$currentKeyPressInteractions:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    new-instance v0, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$keyClickOffset:Landroidx/compose/runtime/State;

    .line 33
    .line 34
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroidx/compose/ui/geometry/Offset;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-direct {v0, v4, v5, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/w;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$currentKeyPressInteractions:Ljava/util/Map;

    .line 48
    .line 49
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$indicationScope:Lkotlinx/coroutines/s0;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    new-instance v7, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1;

    .line 65
    .line 66
    iget-object p1, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 67
    .line 68
    invoke-direct {v7, p1, v0, v3}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/d;)V

    .line 69
    .line 70
    .line 71
    const/4 v8, 0x3

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$enabled:Z

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/compose/foundation/Clickable_androidKt;->isClick-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$currentKeyPressInteractions:Ljava/util/Map;

    .line 88
    .line 89
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 102
    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    iget-object v4, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$indicationScope:Lkotlinx/coroutines/s0;

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x0

    .line 111
    new-instance v7, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1;

    .line 112
    .line 113
    invoke-direct {v7, v0, p1, v3}, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/d;)V

    .line 114
    .line 115
    .line 116
    const/4 v8, 0x3

    .line 117
    const/4 v9, 0x0

    .line 118
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 119
    .line 120
    .line 121
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1;->$onClick:Lv3/a;

    .line 122
    .line 123
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    move v1, v2

    .line 128
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1
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
