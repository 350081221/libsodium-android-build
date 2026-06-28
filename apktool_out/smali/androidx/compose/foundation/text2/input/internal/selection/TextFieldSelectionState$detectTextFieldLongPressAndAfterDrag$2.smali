.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTextFieldLongPressAndAfterDrag(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/geometry/Offset;",
        "dragStartOffset",
        "Lkotlin/r2;",
        "invoke-k-4lQ0M",
        "(J)V",
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
.field final synthetic $actingHandle:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/foundation/text/Handle;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

.field final synthetic $dragBeginPosition:Lkotlin/jvm/internal/k1$g;

.field final synthetic $dragTotalDistance:Lkotlin/jvm/internal/k1$g;

.field final synthetic $requestFocus:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Lv3/a;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/foundation/text/Handle;",
            ">;",
            "Lkotlin/jvm/internal/k1$g;",
            "Lkotlin/jvm/internal/k1$g;",
            "Lkotlin/jvm/internal/k1$f;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$requestFocus:Lv3/a;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$actingHandle:Lkotlin/jvm/internal/k1$h;

    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    iput-object p5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    iput-object p6, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->invoke-k-4lQ0M(J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2$1;

    .line 6
    .line 7
    invoke-direct {v1, v2, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2$1;-><init>(J)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$requestFocus:Lv3/a;

    .line 14
    .line 15
    invoke-interface {v1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 19
    .line 20
    iget-object v4, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$actingHandle:Lkotlin/jvm/internal/k1$h;

    .line 21
    .line 22
    iget-object v4, v4, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Landroidx/compose/foundation/text/Handle;

    .line 25
    .line 26
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;J)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    .line 30
    .line 31
    iput-wide v2, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    .line 34
    .line 35
    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 36
    .line 37
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    iput-wide v4, v1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 42
    .line 43
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 44
    .line 45
    const/4 v4, -0x1

    .line 46
    invoke-static {v1, v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setPreviousRawDragOffset$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;I)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 50
    .line 51
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v2, v3}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->isPositionOnText-k-4lQ0M(J)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v7, 0x1

    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 63
    .line 64
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x2

    .line 70
    const/4 v6, 0x0

    .line 71
    move-wide/from16 v2, p1

    .line 72
    .line 73
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v2, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 78
    .line 79
    invoke-static {v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getHapticFeedBack$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    sget-object v3, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    .line 86
    .line 87
    invoke-virtual {v3}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getTextHandleMove-5zf0vsI()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-interface {v2, v3}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    .line 92
    .line 93
    .line 94
    :cond_0
    iget-object v2, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 95
    .line 96
    invoke-static {v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->placeCursorBeforeCharAt(I)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 104
    .line 105
    invoke-static {v1, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 109
    .line 110
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->Cursor:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 117
    .line 118
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    const/4 v7, 0x0

    .line 134
    :goto_0
    if-eqz v7, :cond_3

    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 138
    .line 139
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const/4 v4, 0x0

    .line 144
    const/4 v5, 0x2

    .line 145
    const/4 v6, 0x0

    .line 146
    move-wide/from16 v2, p1

    .line 147
    .line 148
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    iget-object v7, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 153
    .line 154
    invoke-static {v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    sget-object v1, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    .line 163
    .line 164
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    .line 165
    .line 166
    .line 167
    move-result-wide v12

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x4

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ$default(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const/4 v11, 0x0

    .line 177
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 178
    .line 179
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getCharacterWithWordAccelerate()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    const/4 v13, 0x0

    .line 184
    const/16 v14, 0x20

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    move v9, v10

    .line 188
    invoke-static/range {v7 .. v15}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateSelection-QNhciaU$default(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZILjava/lang/Object;)J

    .line 189
    .line 190
    .line 191
    move-result-wide v1

    .line 192
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 193
    .line 194
    invoke-static {v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 199
    .line 200
    .line 201
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 202
    .line 203
    sget-object v4, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->Selection:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 204
    .line 205
    invoke-virtual {v3, v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 206
    .line 207
    .line 208
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 209
    .line 210
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    iput v1, v3, Lkotlin/jvm/internal/k1$f;->element:I

    .line 215
    .line 216
    :goto_1
    return-void
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
