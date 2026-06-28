.class final Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/ImeAction;",
        "imeAction",
        "Lkotlin/r2;",
        "invoke-KlQnJC8",
        "(I)V",
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
.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/text/input/ImeAction;

    invoke-virtual {p1}, Landroidx/compose/ui/text/input/ImeAction;->unbox-impl()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->invoke-KlQnJC8(I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-KlQnJC8(I)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnDone()Lv3/l;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getGo-eUduSuo()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnGo()Lv3/l;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnNext()Lv3/l;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getPrevious-eUduSuo()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnPrevious()Lv3/l;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getSearch-eUduSuo()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnSearch()Lv3/l;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getSend-eUduSuo()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 122
    .line 123
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->getKeyboardActions()Landroidx/compose/foundation/text/KeyboardActions;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions;->getOnSend()Lv3/l;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDefault-eUduSuo()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    const/4 v0, 0x1

    .line 143
    goto :goto_0

    .line 144
    :cond_6
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNone-eUduSuo()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {p1, v0}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    :goto_0
    if-eqz v0, :cond_9

    .line 153
    .line 154
    move-object v0, v2

    .line 155
    :goto_1
    if-eqz v0, :cond_7

    .line 156
    .line 157
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 158
    .line 159
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->access$getKeyboardActionScope$p(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-interface {v0, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;

    .line 167
    .line 168
    :cond_7
    if-nez v2, :cond_8

    .line 169
    .line 170
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;->this$0:Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;

    .line 171
    .line 172
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;->access$getKeyboardActionScope$p(Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;)Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;->defaultKeyboardAction-KlQnJC8(I)V

    .line 177
    .line 178
    .line 179
    :cond_8
    return-void

    .line 180
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v0, "invalid ImeAction"

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1
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
