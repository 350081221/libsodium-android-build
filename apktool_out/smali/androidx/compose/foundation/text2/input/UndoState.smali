.class public final Landroidx/compose/foundation/text2/input/UndoState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\t8F\u00a2\u0006\u000c\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\t8F\u00a2\u0006\u000c\u0012\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/UndoState;",
        "",
        "Lkotlin/r2;",
        "undo",
        "redo",
        "clearHistory",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "state",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "",
        "getCanUndo",
        "()Z",
        "getCanUndo$annotations",
        "()V",
        "canUndo",
        "getCanRedo",
        "getCanRedo$annotations",
        "canRedo",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/TextFieldState;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final state:Landroidx/compose/foundation/text2/input/TextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/TextFieldState;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public static synthetic getCanRedo$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCanUndo$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final clearHistory()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->clearHistory()V

    return-void
.end method

.method public final getCanRedo()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getCanRedo()Z

    move-result v0

    return v0
.end method

.method public final getCanUndo()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getCanUndo()Z

    move-result v0

    return v0
.end method

.method public final redo()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->redo(Landroidx/compose/foundation/text2/input/TextFieldState;)V

    return-void
.end method

.method public final undo()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/UndoState;->state:Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->undo(Landroidx/compose/foundation/text2/input/TextFieldState;)V

    return-void
.end method
