.class public final Landroidx/compose/foundation/text2/input/TextFieldStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0007\u001a&\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\u0011\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u001a\u000c\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0007\u001a8\u0010\u0018\u001a\u00020\u0017*\u00020\u00022\"\u0010\u0016\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0087@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "initialValue",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "TextFieldState",
        "Lkotlinx/coroutines/flow/i;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "textAsFlow",
        "",
        "initialText",
        "Landroidx/compose/ui/text/TextRange;",
        "initialSelectionInChars",
        "rememberTextFieldState-Le-punE",
        "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text2/input/TextFieldState;",
        "rememberTextFieldState",
        "text",
        "Lkotlin/r2;",
        "setTextAndPlaceCursorAtEnd",
        "setTextAndSelectAll",
        "clearText",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/d;",
        "",
        "block",
        "",
        "forEachTextValue",
        "(Landroidx/compose/foundation/text2/input/TextFieldState;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,569:1\n1116#2,6:570\n123#3,4:576\n123#3,4:580\n123#3,4:584\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n*L\n472#1:570,6\n495#1:576,4\n520#1:580,4\n543#1:584,4\n*E\n"
    }
.end annotation


# direct methods
.method public static final TextFieldState(Landroidx/compose/ui/text/input/TextFieldValue;)Landroidx/compose/foundation/text2/input/TextFieldState;
    .locals 4
    .param p0    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    const/4 p0, 0x0

    .line 12
    invoke-direct {v0, v1, v2, v3, p0}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
.end method

.method public static final clearText(Landroidx/compose/foundation/text2/input/TextFieldState;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->startEdit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/text2/input/TextFieldBufferKt;->delete(Landroidx/compose/foundation/text2/input/TextFieldBuffer;II)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/TextFieldBufferKt;->placeCursorAtEnd(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->commitEdit(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final forEachTextValue(Landroidx/compose/foundation/text2/input/TextFieldState;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldState;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0

    .line 46
    :cond_1
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Landroidx/compose/foundation/text2/input/TextFieldStateKt;->textAsFlow(Landroidx/compose/foundation/text2/input/TextFieldState;)Lkotlinx/coroutines/flow/i;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iput v3, v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$forEachTextValue$1;->label:I

    .line 58
    .line 59
    invoke-static {p0, p1, v0}, Lkotlinx/coroutines/flow/k;->A(Lkotlinx/coroutines/flow/i;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p1, "textAsFlow expected not to complete without exception"

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
.end method

.method public static final rememberTextFieldState-Le-punE(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text2/input/TextFieldState;
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, -0x32ff5935

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p5, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 14
    .line 15
    if-eqz p5, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    if-eqz p5, :cond_2

    .line 30
    .line 31
    const/4 p5, -0x1

    .line 32
    const-string v1, "androidx.compose.foundation.text2.input.rememberTextFieldState (TextFieldState.kt:471)"

    .line 33
    .line 34
    invoke-static {v0, p4, p5, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    const/4 p4, 0x0

    .line 38
    new-array v0, p4, [Ljava/lang/Object;

    .line 39
    .line 40
    sget-object v1, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;->INSTANCE:Landroidx/compose/foundation/text2/input/TextFieldState$Saver;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const p4, 0x26c880a9

    .line 44
    .line 45
    .line 46
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    invoke-interface {p3, p1, p2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 54
    .line 55
    .line 56
    move-result p5

    .line 57
    or-int/2addr p4, p5

    .line 58
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p5

    .line 62
    if-nez p4, :cond_3

    .line 63
    .line 64
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 65
    .line 66
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    if-ne p5, p4, :cond_4

    .line 71
    .line 72
    :cond_3
    new-instance p5, Landroidx/compose/foundation/text2/input/TextFieldStateKt$rememberTextFieldState$1$1;

    .line 73
    .line 74
    invoke-direct {p5, p0, p1, p2}, Landroidx/compose/foundation/text2/input/TextFieldStateKt$rememberTextFieldState$1$1;-><init>(Ljava/lang/String;J)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    move-object v3, p5

    .line 81
    check-cast v3, Lv3/a;

    .line 82
    .line 83
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 84
    .line 85
    .line 86
    const/16 v5, 0x38

    .line 87
    .line 88
    const/4 v6, 0x4

    .line 89
    move-object v4, p3

    .line 90
    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 95
    .line 96
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 106
    .line 107
    .line 108
    return-object p0
    .line 109
    .line 110
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
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method public static final setTextAndPlaceCursorAtEnd(Landroidx/compose/foundation/text2/input/TextFieldState;Ljava/lang/String;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->startEdit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2, v1, p1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/TextFieldBufferKt;->placeCursorAtEnd(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->commitEdit(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public static final setTextAndSelectAll(Landroidx/compose/foundation/text2/input/TextFieldState;Ljava/lang/String;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->startEdit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getLength()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2, v1, p1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/TextFieldBufferKt;->selectAll(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->commitEdit(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public static final textAsFlow(Landroidx/compose/foundation/text2/input/TextFieldState;)Lkotlinx/coroutines/flow/i;
    .locals 1
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldState;",
            ")",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/TextFieldStateKt$textAsFlow$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text2/input/TextFieldStateKt$textAsFlow$1;-><init>(Landroidx/compose/foundation/text2/input/TextFieldState;)V

    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lv3/a;)Lkotlinx/coroutines/flow/i;

    move-result-object p0

    return-object p0
.end method
