.class final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->observeTextChanges(Lkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/j;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "it",
        "Lkotlin/r2;",
        "emit",
        "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;",
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

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 2
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->access$setShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V

    .line 3
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;->this$0:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    sget-object p2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 4
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;->emit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
