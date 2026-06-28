.class final Landroidx/compose/material3/TimePickerState$update$2;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TimePickerState;->update$material3_release(FZLkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/l<",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.material3.TimePickerState$update$2"
    f = "TimePicker.kt"
    i = {}
    l = {
        0x2b1,
        0x2b3
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
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
.field final synthetic $fromTap:Z

.field final synthetic $value:F

.field label:I

.field final synthetic this$0:Landroidx/compose/material3/TimePickerState;


# direct methods
.method constructor <init>(Landroidx/compose/material3/TimePickerState;FZLkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TimePickerState;",
            "FZ",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/material3/TimePickerState$update$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    iput p2, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    iput-boolean p3, p0, Landroidx/compose/material3/TimePickerState$update$2;->$fromTap:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 4
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/material3/TimePickerState$update$2;

    iget-object v1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    iget v2, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    iget-boolean v3, p0, Landroidx/compose/material3/TimePickerState$update$2;->$fromTap:Z

    invoke-direct {v0, v1, v2, v3, p1}, Landroidx/compose/material3/TimePickerState$update$2;-><init>(Landroidx/compose/material3/TimePickerState;FZLkotlin/coroutines/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TimePickerState$update$2;->invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TimePickerState$update$2;->create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/material3/TimePickerState$update$2;

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, v0}, Landroidx/compose/material3/TimePickerState$update$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
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
    iget v1, p0, Landroidx/compose/material3/TimePickerState$update$2;->label:I

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
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    sget-object v1, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {p1, v1}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 51
    .line 52
    iget v1, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    .line 53
    .line 54
    invoke-static {p1, v1}, Landroidx/compose/material3/TimePickerState;->access$toHour(Landroidx/compose/material3/TimePickerState;F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    rem-int/lit8 v1, v1, 0xc

    .line 59
    .line 60
    int-to-float v1, v1

    .line 61
    const v4, 0x3f060a92

    .line 62
    .line 63
    .line 64
    mul-float/2addr v1, v4

    .line 65
    invoke-virtual {p1, v1}, Landroidx/compose/material3/TimePickerState;->setHourAngle$material3_release(F)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-boolean p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->$fromTap:Z

    .line 70
    .line 71
    const v1, 0x3dd67750

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 77
    .line 78
    iget v4, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    .line 79
    .line 80
    invoke-static {p1, v4}, Landroidx/compose/material3/TimePickerState;->access$toMinute(Landroidx/compose/material3/TimePickerState;F)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget-object v5, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 85
    .line 86
    iget v6, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    .line 87
    .line 88
    invoke-static {v5, v6}, Landroidx/compose/material3/TimePickerState;->access$toMinute(Landroidx/compose/material3/TimePickerState;F)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    rem-int/lit8 v5, v5, 0x5

    .line 93
    .line 94
    sub-int/2addr v4, v5

    .line 95
    int-to-float v4, v4

    .line 96
    mul-float/2addr v4, v1

    .line 97
    invoke-virtual {p1, v4}, Landroidx/compose/material3/TimePickerState;->setMinuteAngle$material3_release(F)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 102
    .line 103
    iget v4, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    .line 104
    .line 105
    invoke-static {p1, v4}, Landroidx/compose/material3/TimePickerState;->access$toMinute(Landroidx/compose/material3/TimePickerState;F)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    int-to-float v4, v4

    .line 110
    mul-float/2addr v4, v1

    .line 111
    invoke-virtual {p1, v4}, Landroidx/compose/material3/TimePickerState;->setMinuteAngle$material3_release(F)V

    .line 112
    .line 113
    .line 114
    :goto_1
    iget-boolean p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->$fromTap:Z

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroidx/compose/material3/TimePickerState;->getCurrentAngle$material3_release()Landroidx/compose/animation/core/Animatable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object v1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 125
    .line 126
    invoke-virtual {v1}, Landroidx/compose/material3/TimePickerState;->getMinuteAngle$material3_release()F

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iput v3, p0, Landroidx/compose/material3/TimePickerState$update$2;->label:I

    .line 135
    .line 136
    invoke-virtual {p1, v1, p0}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v0, :cond_6

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_5
    iget-object p1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroidx/compose/material3/TimePickerState;->getCurrentAngle$material3_release()Landroidx/compose/animation/core/Animatable;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object v1, p0, Landroidx/compose/material3/TimePickerState$update$2;->this$0:Landroidx/compose/material3/TimePickerState;

    .line 150
    .line 151
    iget v3, p0, Landroidx/compose/material3/TimePickerState$update$2;->$value:F

    .line 152
    .line 153
    invoke-static {v1, v3}, Landroidx/compose/material3/TimePickerState;->access$offsetHour(Landroidx/compose/material3/TimePickerState;F)F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iput v2, p0, Landroidx/compose/material3/TimePickerState$update$2;->label:I

    .line 162
    .line 163
    invoke-virtual {p1, v1, p0}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-ne p1, v0, :cond_6

    .line 168
    .line 169
    return-object v0

    .line 170
    :cond_6
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 171
    .line 172
    return-object p1
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
