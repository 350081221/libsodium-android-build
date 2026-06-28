.class public final Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a:\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u001a \u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\"\u001a\u0010\u001a\u001a\u00020\u00138\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/ui/platform/PlatformTextInputSession;",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "state",
        "Landroidx/compose/ui/text/input/ImeOptions;",
        "imeOptions",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "Lkotlin/r2;",
        "onImeAction",
        "",
        "platformSpecificTextInputSession",
        "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroid/view/inputmethod/EditorInfo;",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "textFieldValue",
        "update",
        "",
        "bits",
        "flag",
        "",
        "hasFlag",
        "",
        "tag",
        "Lkotlin/Function0;",
        "content",
        "logDebug",
        "TIA_DEBUG",
        "Z",
        "getTIA_DEBUG$annotations",
        "()V",
        "TAG",
        "Ljava/lang/String;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AndroidTextInputSession"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final TIA_DEBUG:Z = false


# direct methods
.method public static synthetic getTIA_DEBUG$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method private static final hasFlag(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final logDebug(Ljava/lang/String;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method static synthetic logDebug$default(Ljava/lang/String;Lv3/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string p0, "AndroidTextInputSession"

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt;->logDebug(Ljava/lang/String;Lv3/a;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
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
.end method

.method public static final platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 11
    .param p0    # Landroidx/compose/ui/platform/PlatformTextInputSession;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/input/ImeOptions;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/PlatformTextInputSession;",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;-><init>(Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

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
    invoke-static {p4}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p4}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Landroidx/compose/ui/platform/PlatformTextInputSession;->getView()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    invoke-static {p4}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManager(Landroid/view/View;)Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    new-instance p4, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    move-object v4, p4

    .line 65
    move-object v5, p0

    .line 66
    move-object v6, p1

    .line 67
    move-object v8, p2

    .line 68
    move-object v9, p3

    .line 69
    invoke-direct/range {v4 .. v10}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;-><init>(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lkotlin/coroutines/d;)V

    .line 70
    .line 71
    .line 72
    iput v3, v0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    .line 73
    .line 74
    invoke-static {p4, v0}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    new-instance p0, Lkotlin/y;

    .line 82
    .line 83
    invoke-direct {p0}, Lkotlin/y;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p0
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

.method public static final update(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/ui/text/input/ImeOptions;)V
    .locals 7
    .param p0    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/input/ImeOptions;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getImeAction-eUduSuo()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDefault-eUduSuo()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x3

    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x6

    .line 18
    const/4 v6, 0x1

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getSingleLine()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNone-eUduSuo()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    move v5, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getGo-eUduSuo()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    move v5, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    const/4 v5, 0x5

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getPrevious-eUduSuo()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    const/4 v5, 0x7

    .line 77
    goto :goto_0

    .line 78
    :cond_5
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getSearch-eUduSuo()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    move v5, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getSend-eUduSuo()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    const/4 v5, 0x4

    .line 101
    goto :goto_0

    .line 102
    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_16

    .line 111
    .line 112
    :goto_0
    iput v5, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 113
    .line 114
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getKeyboardType-PjHm6EE()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    sget-object v2, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getText-PjHm6EE()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-static {v0, v5}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_8

    .line 129
    .line 130
    :goto_1
    move v3, v6

    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :cond_8
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getAscii-PjHm6EE()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-static {v0, v5}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_9

    .line 142
    .line 143
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 144
    .line 145
    const/high16 v2, -0x80000000

    .line 146
    .line 147
    or-int/2addr v0, v2

    .line 148
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_9
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumber-PjHm6EE()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-static {v0, v5}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_a

    .line 160
    .line 161
    move v3, v4

    .line 162
    goto :goto_2

    .line 163
    :cond_a
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPhone-PjHm6EE()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-static {v0, v4}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_b
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getUri-PjHm6EE()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-static {v0, v3}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_c

    .line 183
    .line 184
    const/16 v3, 0x11

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_c
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getEmail-PjHm6EE()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-static {v0, v3}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_d

    .line 196
    .line 197
    const/16 v3, 0x21

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_d
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    invoke-static {v0, v3}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_e

    .line 209
    .line 210
    const/16 v3, 0x81

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_e
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-static {v0, v3}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_f

    .line 222
    .line 223
    const/16 v3, 0x12

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_f
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getDecimal-PjHm6EE()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_15

    .line 235
    .line 236
    const/16 v3, 0x2002

    .line 237
    .line 238
    :goto_2
    iput v3, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 239
    .line 240
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getSingleLine()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_10

    .line 245
    .line 246
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 247
    .line 248
    invoke-static {v0, v6}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt;->hasFlag(II)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_10

    .line 253
    .line 254
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 255
    .line 256
    const/high16 v2, 0x20000

    .line 257
    .line 258
    or-int/2addr v0, v2

    .line 259
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 260
    .line 261
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getImeAction-eUduSuo()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDefault-eUduSuo()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-static {v0, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_10

    .line 274
    .line 275
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 276
    .line 277
    const/high16 v1, 0x40000000    # 2.0f

    .line 278
    .line 279
    or-int/2addr v0, v1

    .line 280
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 281
    .line 282
    :cond_10
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 283
    .line 284
    invoke-static {v0, v6}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt;->hasFlag(II)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_14

    .line 289
    .line 290
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getCapitalization-IUNYP9k()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    sget-object v1, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    .line 295
    .line 296
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getCharacters-IUNYP9k()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/KeyboardCapitalization;->equals-impl0(II)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-eqz v2, :cond_11

    .line 305
    .line 306
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 307
    .line 308
    or-int/lit16 v0, v0, 0x1000

    .line 309
    .line 310
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_11
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getWords-IUNYP9k()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    invoke-static {v0, v2}, Landroidx/compose/ui/text/input/KeyboardCapitalization;->equals-impl0(II)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_12

    .line 322
    .line 323
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 324
    .line 325
    or-int/lit16 v0, v0, 0x2000

    .line 326
    .line 327
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_12
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getSentences-IUNYP9k()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    invoke-static {v0, v1}, Landroidx/compose/ui/text/input/KeyboardCapitalization;->equals-impl0(II)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_13

    .line 339
    .line 340
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 341
    .line 342
    or-int/lit16 v0, v0, 0x4000

    .line 343
    .line 344
    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 345
    .line 346
    :cond_13
    :goto_3
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/ImeOptions;->getAutoCorrect()Z

    .line 347
    .line 348
    .line 349
    move-result p2

    .line 350
    if-eqz p2, :cond_14

    .line 351
    .line 352
    iget p2, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 353
    .line 354
    const v0, 0x8000

    .line 355
    .line 356
    .line 357
    or-int/2addr p2, v0

    .line 358
    iput p2, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 359
    .line 360
    :cond_14
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 361
    .line 362
    .line 363
    move-result-wide v0

    .line 364
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 365
    .line 366
    .line 367
    move-result p2

    .line 368
    iput p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 369
    .line 370
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 371
    .line 372
    .line 373
    move-result-wide v0

    .line 374
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 375
    .line 376
    .line 377
    move-result p2

    .line 378
    iput p2, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 379
    .line 380
    invoke-static {p0, p1}, Landroidx/core/view/inputmethod/EditorInfoCompat;->setInitialSurroundingText(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 381
    .line 382
    .line 383
    iget p1, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 384
    .line 385
    const/high16 p2, 0x2000000

    .line 386
    .line 387
    or-int/2addr p1, p2

    .line 388
    iput p1, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 389
    .line 390
    return-void

    .line 391
    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 392
    .line 393
    const-string p1, "Invalid Keyboard Type"

    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw p0

    .line 403
    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 404
    .line 405
    const-string p1, "invalid ImeAction"

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p0
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
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
.end method
