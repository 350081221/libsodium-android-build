.class public final Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/saveable/Saver;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Saver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/saveable/Saver<",
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0014\u0010\n\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R \u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;",
        "Landroidx/compose/runtime/saveable/Saver;",
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "",
        "()V",
        "undoManagerSaver",
        "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;",
        "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
        "restore",
        "value",
        "save",
        "Landroidx/compose/runtime/saveable/SaverScope;",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver\n+ 2 UndoManager.kt\nandroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion\n*L\n1#1,267:1\n125#2:268\n171#2:269\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver\n*L\n105#1:268\n105#1:269\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final undoManagerSaver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager<",
            "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->INSTANCE:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;->Companion:Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->Companion:Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver$special$$inlined$createSaver$1;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver$special$$inlined$createSaver$1;-><init>(Landroidx/compose/runtime/saveable/Saver;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->undoManagerSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    sput v0, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->$stable:I

    .line 26
    .line 27
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public restore(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/TextUndoManager;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<*>"

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 3
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->Companion:Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v1

    .line 4
    invoke-interface {v1, v0}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    sget-object v1, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->undoManagerSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 6
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, Landroidx/compose/runtime/saveable/Saver;->restore(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 8
    new-instance v1, Landroidx/compose/foundation/text2/input/TextUndoManager;

    invoke-direct {v1, v0, p1}, Landroidx/compose/foundation/text2/input/TextUndoManager;-><init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)V

    return-object v1
.end method

.method public bridge synthetic restore(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->restore(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object p1

    return-object p1
.end method

.method public save(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text2/input/TextUndoManager;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroidx/compose/runtime/saveable/SaverScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextUndoManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Landroidx/compose/foundation/text2/input/TextUndoManager;->access$getStagingUndo(Landroidx/compose/foundation/text2/input/TextUndoManager;)Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->Companion:Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v2

    .line 4
    invoke-interface {v2, p1, v1}, Landroidx/compose/runtime/saveable/Saver;->save(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 5
    sget-object v1, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->undoManagerSaver:Landroidx/compose/runtime/saveable/Saver;

    .line 6
    invoke-static {p2}, Landroidx/compose/foundation/text2/input/TextUndoManager;->access$getUndoManager$p(Landroidx/compose/foundation/text2/input/TextUndoManager;)Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Landroidx/compose/runtime/saveable/Saver;->save(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    .line 7
    invoke-static {v0}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic save(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/compose/foundation/text2/input/TextUndoManager;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->save(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text2/input/TextUndoManager;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
