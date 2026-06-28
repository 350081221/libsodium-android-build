.class public final Landroidx/compose/foundation/text2/input/TextUndoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008J\u0006\u0010\u000b\u001a\u00020\u0002R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR/\u0010\u0016\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00088B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0019\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "",
        "Lkotlin/r2;",
        "flush",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "state",
        "undo",
        "redo",
        "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
        "op",
        "record",
        "clearHistory",
        "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;",
        "undoManager",
        "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;",
        "<set-?>",
        "stagingUndo$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getStagingUndo",
        "()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
        "setStagingUndo",
        "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V",
        "stagingUndo",
        "",
        "getCanUndo",
        "()Z",
        "canUndo",
        "getCanRedo",
        "canRedo",
        "initialStagingUndo",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)V",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n81#2:268\n107#2,2:269\n495#3,4:271\n500#3:280\n495#3,4:281\n500#3:290\n129#4,5:275\n129#4,5:285\n1#5:291\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n*L\n47#1:268\n47#1:269,2\n73#1:271,4\n73#1:280\n98#1:281,4\n98#1:290\n73#1:275,5\n98#1:285,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final stagingUndo$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager<",
            "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/foundation/text2/input/TextUndoManager;->Companion:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/text2/input/TextUndoManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;-><init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;ILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
            "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager<",
            "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    const/4 p2, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p2, v0, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->stagingUndo$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;ILkotlin/jvm/internal/w;)V
    .locals 6

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 4
    new-instance p2, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x64

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;-><init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/w;)V

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/TextUndoManager;-><init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)V

    return-void
.end method

.method public static final synthetic access$getStagingUndo(Landroidx/compose/foundation/text2/input/TextUndoManager;)Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUndoManager$p(Landroidx/compose/foundation/text2/input/TextUndoManager;)Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    return-object p0
.end method

.method private final flush()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 19
    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->record(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    :try_start_3
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 35
    .line 36
    .line 37
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 40
    .line 41
    .line 42
    throw v1
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

.method private final getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->stagingUndo$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->stagingUndo$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
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


# virtual methods
.method public final clearHistory()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->clearHistory()V

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
.end method

.method public final getCanRedo()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getCanRedo$foundation_release()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getCanUndo()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->getCanUndo$foundation_release()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final record(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V
    .locals 3
    .param p1    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getStagingUndo()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 19
    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {v2, p1}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->merge(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->flush()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->setStagingUndo(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_3
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 46
    .line 47
    .line 48
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 51
    .line 52
    .line 53
    throw p1
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
.end method

.method public final redo(Landroidx/compose/foundation/text2/input/TextFieldState;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getCanRedo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->redo()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 15
    .line 16
    invoke-static {p1, v0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt;->redo(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final undo(Landroidx/compose/foundation/text2/input/TextFieldState;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->getCanUndo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/TextUndoManager;->flush()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextUndoManager;->undoManager:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->undo()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    .line 18
    .line 19
    invoke-static {p1, v0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt;->undo(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V

    .line 20
    .line 21
    .line 22
    return-void
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
