.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTextFieldTapGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
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
.field final synthetic this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent-k-4lQ0M(J)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3$1;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3$1;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 15
    .line 16
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->Selection:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 22
    .line 23
    invoke-static {v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x2

    .line 29
    const/4 v7, 0x0

    .line 30
    move-wide/from16 v3, p1

    .line 31
    .line 32
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    iget-object v8, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 37
    .line 38
    invoke-static {v8}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v1, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x4

    .line 54
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ$default(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const/4 v12, 0x0

    .line 59
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    const/4 v14, 0x0

    .line 66
    const/16 v15, 0x20

    .line 67
    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    move v10, v11

    .line 71
    invoke-static/range {v8 .. v16}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateSelection-QNhciaU$default(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZILjava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    iget-object v3, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 76
    .line 77
    invoke-static {v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->selectCharsIn-5zc-tL8(J)V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method
