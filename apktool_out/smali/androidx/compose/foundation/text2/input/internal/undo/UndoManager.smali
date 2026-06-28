.class public final Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0000\u0018\u0000  *\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001 B1\u0012\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;",
        "T",
        "",
        "undoableAction",
        "Lkotlin/r2;",
        "record",
        "(Ljava/lang/Object;)V",
        "undo",
        "()Ljava/lang/Object;",
        "redo",
        "clearHistory",
        "",
        "capacity",
        "I",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "undoStack",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "redoStack",
        "",
        "getCanUndo$foundation_release",
        "()Z",
        "canUndo",
        "getCanRedo$foundation_release",
        "canRedo",
        "getSize",
        "()I",
        "size",
        "",
        "initialUndoStack",
        "initialRedoStack",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;I)V",
        "Companion",
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

.field public static final Companion:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final capacity:I

.field private redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->Companion:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;-><init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;I)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p3, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->capacity:I

    .line 3
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 4
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 5
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 6
    new-instance p1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 7
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 8
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-ltz p3, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getSize()I

    move-result v0

    if-gt v0, p3, :cond_1

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    if-eqz p1, :cond_2

    return-void

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Initial list of undo and redo operations have a size=("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getSize()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") greater than the given capacity=("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Capacity must be a positive integer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 14
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/16 p3, 0x64

    .line 15
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;-><init>(Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public static final synthetic access$getCapacity$p(Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->capacity:I

    return p0
.end method

.method public static final synthetic access$getRedoStack$p(Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object p0
.end method

.method public static final synthetic access$getUndoStack$p(Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object p0
.end method


# virtual methods
.method public final clearHistory()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getCanRedo$foundation_release()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getCanUndo$foundation_release()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getSize()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final record(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getSize()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->capacity:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/u;->J0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final redo()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getCanRedo$foundation_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/collections/u;->L0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "It\'s an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function."

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
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
.end method

.method public final undo()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getCanUndo$foundation_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/collections/u;->L0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redoStack:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "It\'s an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function."

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
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
.end method
