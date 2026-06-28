.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;
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
.field final synthetic $requestFocus:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showKeyboard:Lv3/a;
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
.method constructor <init>(Lv3/a;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->$requestFocus:Lv3/a;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->$showKeyboard:Lv3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent-k-4lQ0M(J)V
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2$1;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2$1;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->$requestFocus:Lv3/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getEditable(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isFocused()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->$showKeyboard:Lv3/a;

    .line 28
    .line 29
    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 33
    .line 34
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v1, 0x1

    .line 47
    if-lez v0, :cond_0

    .line 48
    .line 49
    move v0, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    :goto_0
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 55
    .line 56
    invoke-static {v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 67
    .line 68
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v4, 0x0

    .line 73
    const/4 v5, 0x2

    .line 74
    const/4 v6, 0x0

    .line 75
    move-wide v2, p1

    .line 76
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getOffsetForPosition-3MmeM6k$default(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;JZILjava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-ltz p1, :cond_2

    .line 81
    .line 82
    iget-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 83
    .line 84
    invoke-static {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2, p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->placeCursorBeforeCharAt(I)V

    .line 89
    .line 90
    .line 91
    :cond_2
    return-void
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
