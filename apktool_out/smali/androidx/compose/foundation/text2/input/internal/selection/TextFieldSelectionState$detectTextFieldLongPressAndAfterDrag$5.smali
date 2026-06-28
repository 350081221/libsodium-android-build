.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


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
        "Lv3/p<",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "<anonymous parameter 0>",
        "Landroidx/compose/ui/geometry/Offset;",
        "dragAmount",
        "Lkotlin/r2;",
        "invoke-Uv8p0NA",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V",
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
        "SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"
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

.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "Lkotlin/jvm/internal/k1$g;",
            "Lkotlin/jvm/internal/k1$g;",
            "Lkotlin/jvm/internal/k1$f;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/foundation/text/Handle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    iput-object p5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$actingHandle:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    check-cast p2, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V
    .locals 10
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    move p1, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p1, v1

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    .line 26
    .line 27
    iget-wide v2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 28
    .line 29
    invoke-static {v2, v3, p2, p3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide p2

    .line 33
    iput-wide p2, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 34
    .line 35
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    .line 36
    .line 37
    iget-wide p1, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 38
    .line 39
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragTotalDistance:Lkotlin/jvm/internal/k1$g;

    .line 40
    .line 41
    iget-wide v2, p3, Lkotlin/jvm/internal/k1$g;->element:J

    .line 42
    .line 43
    invoke-static {p1, p2, v2, v3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    new-instance p3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5$1;

    .line 48
    .line 49
    invoke-direct {p3, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5$1;-><init>(J)V

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 53
    .line 54
    .line 55
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 56
    .line 57
    iget p3, p3, Lkotlin/jvm/internal/k1$f;->element:I

    .line 58
    .line 59
    if-gez p3, :cond_3

    .line 60
    .line 61
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 62
    .line 63
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {p3, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->isPositionOnText-k-4lQ0M(J)Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-nez p3, :cond_3

    .line 72
    .line 73
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 74
    .line 75
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    .line 80
    .line 81
    iget-wide v1, p3, Lkotlin/jvm/internal/k1$g;->element:J

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v4, 0x2

    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 91
    .line 92
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x2

    .line 98
    const/4 v9, 0x0

    .line 99
    move-wide v5, p1

    .line 100
    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-ne p3, v0, :cond_2

    .line 105
    .line 106
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getNone()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    goto :goto_1

    .line 113
    :cond_2
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_1
    move v4, p3

    .line 120
    move v5, v0

    .line 121
    move-object v7, v1

    .line 122
    goto :goto_5

    .line 123
    :cond_3
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 124
    .line 125
    iget p3, p3, Lkotlin/jvm/internal/k1$f;->element:I

    .line 126
    .line 127
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-ltz v2, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move v0, v1

    .line 139
    :goto_2
    if-eqz v0, :cond_5

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    const/4 p3, 0x0

    .line 143
    :goto_3
    if-eqz p3, :cond_6

    .line 144
    .line 145
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result p3

    .line 149
    goto :goto_4

    .line 150
    :cond_6
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 151
    .line 152
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginPosition:Lkotlin/jvm/internal/k1$g;

    .line 157
    .line 158
    iget-wide v2, v0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 159
    .line 160
    invoke-virtual {p3, v2, v3, v1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k(JZ)I

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    :goto_4
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 165
    .line 166
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0, p1, p2, v1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k(JZ)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 175
    .line 176
    iget v1, v1, Lkotlin/jvm/internal/k1$f;->element:I

    .line 177
    .line 178
    if-gez v1, :cond_7

    .line 179
    .line 180
    if-ne p3, v0, :cond_7

    .line 181
    .line 182
    return-void

    .line 183
    :cond_7
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 184
    .line 185
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    goto :goto_1

    .line 190
    :goto_5
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 191
    .line 192
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 205
    .line 206
    invoke-static {v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    const/4 v6, 0x0

    .line 215
    const/4 v8, 0x0

    .line 216
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$updateSelection-QNhciaU(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J

    .line 217
    .line 218
    .line 219
    move-result-wide v2

    .line 220
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 221
    .line 222
    .line 223
    move-result p3

    .line 224
    if-eqz p3, :cond_8

    .line 225
    .line 226
    invoke-static {v2, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$reverse-5zc-tL8(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    :cond_8
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 231
    .line 232
    iget p3, p3, Lkotlin/jvm/internal/k1$f;->element:I

    .line 233
    .line 234
    const/4 v4, -0x1

    .line 235
    if-ne p3, v4, :cond_9

    .line 236
    .line 237
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 238
    .line 239
    .line 240
    move-result p3

    .line 241
    if-nez p3, :cond_9

    .line 242
    .line 243
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$dragBeginOffsetInText:Lkotlin/jvm/internal/k1$f;

    .line 244
    .line 245
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    iput v4, p3, Lkotlin/jvm/internal/k1$f;->element:I

    .line 250
    .line 251
    :cond_9
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 252
    .line 253
    .line 254
    move-result p3

    .line 255
    if-nez p3, :cond_d

    .line 256
    .line 257
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$actingHandle:Lkotlin/jvm/internal/k1$h;

    .line 258
    .line 259
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-eq v4, v5, :cond_a

    .line 268
    .line 269
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-ne v4, v5, :cond_a

    .line 278
    .line 279
    sget-object v4, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_a
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-ne v4, v5, :cond_b

    .line 291
    .line 292
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    if-eq v4, v5, :cond_b

    .line 301
    .line 302
    sget-object v4, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_b
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    add-int/2addr v4, v5

    .line 314
    int-to-float v4, v4

    .line 315
    const/high16 v5, 0x40000000    # 2.0f

    .line 316
    .line 317
    div-float/2addr v4, v5

    .line 318
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    add-int/2addr v6, v7

    .line 327
    int-to-float v6, v6

    .line 328
    div-float/2addr v6, v5

    .line 329
    cmpl-float v4, v4, v6

    .line 330
    .line 331
    if-lez v4, :cond_c

    .line 332
    .line 333
    sget-object v4, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_c
    sget-object v4, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    .line 337
    .line 338
    :goto_6
    iput-object v4, p3, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 339
    .line 340
    :cond_d
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 341
    .line 342
    .line 343
    move-result p3

    .line 344
    if-nez p3, :cond_e

    .line 345
    .line 346
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 347
    .line 348
    .line 349
    move-result p3

    .line 350
    if-nez p3, :cond_f

    .line 351
    .line 352
    :cond_e
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 353
    .line 354
    invoke-static {p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 355
    .line 356
    .line 357
    move-result-object p3

    .line 358
    invoke-virtual {p3, v2, v3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 359
    .line 360
    .line 361
    :cond_f
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 362
    .line 363
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;->$actingHandle:Lkotlin/jvm/internal/k1$h;

    .line 364
    .line 365
    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Landroidx/compose/foundation/text/Handle;

    .line 368
    .line 369
    invoke-static {p3, v0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;J)V

    .line 370
    .line 371
    .line 372
    return-void
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method
