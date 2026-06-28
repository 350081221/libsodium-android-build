.class public final Landroidx/compose/foundation/text2/input/internal/AndroidTextFieldKeyEventHandler;
.super Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/AndroidTextFieldKeyEventHandler;",
        "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;",
        "()V",
        "onPreKeyEvent",
        "",
        "event",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "textFieldSelectionState",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
        "focusManager",
        "Landroidx/compose/ui/focus/FocusManager;",
        "keyboardController",
        "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
        "onPreKeyEvent-MyFupTE",
        "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreKeyEvent-MyFupTE(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z
    .locals 2
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/focus/FocusManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/platform/SoftwareKeyboardController;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;->onPreKeyEvent-MyFupTE(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x1

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return p3

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p2, :cond_2

    .line 15
    .line 16
    :cond_1
    :goto_0
    move p3, v0

    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_2
    const/16 v1, 0x201

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Landroid/view/InputDevice;->supportsSource(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    invoke-virtual {p2}, Landroid/view/InputDevice;->isVirtual()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_4

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_4
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    sget-object v1, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {p2, v1}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-nez p2, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    const/16 p2, 0x13

    .line 53
    .line 54
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler_androidKt;->access$isKeyCode-YhN2O0w(Landroid/view/KeyEvent;I)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_6

    .line 59
    .line 60
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getUp-dhqQ-8s()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-interface {p4, p1}, Landroidx/compose/ui/focus/FocusManager;->moveFocus-3ESFkO8(I)Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    goto :goto_1

    .line 71
    :cond_6
    const/16 p2, 0x14

    .line 72
    .line 73
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler_androidKt;->access$isKeyCode-YhN2O0w(Landroid/view/KeyEvent;I)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_7

    .line 78
    .line 79
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getDown-dhqQ-8s()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-interface {p4, p1}, Landroidx/compose/ui/focus/FocusManager;->moveFocus-3ESFkO8(I)Z

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    goto :goto_1

    .line 90
    :cond_7
    const/16 p2, 0x15

    .line 91
    .line 92
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler_androidKt;->access$isKeyCode-YhN2O0w(Landroid/view/KeyEvent;I)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_8

    .line 97
    .line 98
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getLeft-dhqQ-8s()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-interface {p4, p1}, Landroidx/compose/ui/focus/FocusManager;->moveFocus-3ESFkO8(I)Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    goto :goto_1

    .line 109
    :cond_8
    const/16 p2, 0x16

    .line 110
    .line 111
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler_androidKt;->access$isKeyCode-YhN2O0w(Landroid/view/KeyEvent;I)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_9

    .line 116
    .line 117
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    .line 118
    .line 119
    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getRight-dhqQ-8s()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-interface {p4, p1}, Landroidx/compose/ui/focus/FocusManager;->moveFocus-3ESFkO8(I)Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    goto :goto_1

    .line 128
    :cond_9
    const/16 p2, 0x17

    .line 129
    .line 130
    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler_androidKt;->access$isKeyCode-YhN2O0w(Landroid/view/KeyEvent;I)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_1

    .line 135
    .line 136
    invoke-interface {p5}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->show()V

    .line 137
    .line 138
    .line 139
    :goto_1
    return p3
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
