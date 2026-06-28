.class public final Landroidx/compose/foundation/text2/input/TextFieldState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;,
        Landroidx/compose/foundation/text2/input/TextFieldState$Saver;,
        Landroidx/compose/foundation/text2/input/TextFieldState$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u0002RSB!\u0008\u0000\u0012\u0006\u0010K\u001a\u00020\u0018\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010N\u001a\u00020.\u00a2\u0006\u0004\u0008O\u0010PB\u001d\u0008\u0016\u0012\u0008\u0008\u0002\u0010K\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010M\u001a\u00020L\u00a2\u0006\u0004\u0008O\u0010QJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0017\u001a\u00020\n2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\u0002\u0008\u0015H\u0086\u0008J\u0008\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0002H\u0001J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0014H\u0001JG\u0010 \u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\u0002\u0008\u0015H\u0080\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ)\u0010#\u001a\u00020\n2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\u0002\u0008\u0015H\u0080\u0008\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0000\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0000\u00a2\u0006\u0004\u0008)\u0010\'J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R(\u00103\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u00083\u00104\u0012\u0004\u00089\u0010:\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R+\u0010A\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00028F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010,R \u0010C\u001a\u00020B8GX\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u0012\u0004\u0008G\u0010:\u001a\u0004\u0008E\u0010FR\u001a\u0010I\u001a\u0008\u0012\u0004\u0012\u00020$0H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010J\u00a8\u0006T"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "previousValue",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "inputTransformation",
        "",
        "notifyImeOfChanges",
        "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;",
        "undoBehavior",
        "Lkotlin/r2;",
        "commitEditAsUser",
        "postValue",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;",
        "changes",
        "recordEditForUndo",
        "oldValue",
        "newValue",
        "notifyIme",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/TextFieldBuffer;",
        "Lkotlin/u;",
        "block",
        "edit",
        "",
        "toString",
        "value",
        "startEdit",
        "commitEdit",
        "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "editAsUser$foundation_release",
        "(Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;Lv3/l;)V",
        "editAsUser",
        "editWithNoSideEffects$foundation_release",
        "(Lv3/l;)V",
        "editWithNoSideEffects",
        "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;",
        "notifyImeListener",
        "addNotifyImeListener$foundation_release",
        "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V",
        "addNotifyImeListener",
        "removeNotifyImeListener$foundation_release",
        "removeNotifyImeListener",
        "resetStateAndNotifyIme$foundation_release",
        "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V",
        "resetStateAndNotifyIme",
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "textUndoManager",
        "Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "getTextUndoManager$foundation_release",
        "()Landroidx/compose/foundation/text2/input/TextUndoManager;",
        "mainBuffer",
        "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "getMainBuffer$foundation_release",
        "()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "setMainBuffer$foundation_release",
        "(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V",
        "getMainBuffer$foundation_release$annotations",
        "()V",
        "<set-?>",
        "text$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getText",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "setText",
        "text",
        "Landroidx/compose/foundation/text2/input/UndoState;",
        "undoState",
        "Landroidx/compose/foundation/text2/input/UndoState;",
        "getUndoState",
        "()Landroidx/compose/foundation/text2/input/UndoState;",
        "getUndoState$annotations",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "notifyImeListeners",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "initialText",
        "Landroidx/compose/ui/text/TextRange;",
        "initialSelectionInChars",
        "initialTextUndoManager",
        "<init>",
        "(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;Lkotlin/jvm/internal/w;)V",
        "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V",
        "NotifyImeListener",
        "Saver",
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
        "SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,569:1\n1208#2:570\n1187#2,2:571\n81#3:573\n107#3,2:574\n460#4,11:576\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n406#1:570\n406#1:571,2\n107#1:573\n107#1:574,2\n412#1:576,11\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final text$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final undoState:Landroidx/compose/foundation/text2/input/UndoState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;J)V
    .locals 6

    .line 13
    new-instance v4, Landroidx/compose/foundation/text2/input/TextUndoManager;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {v4, v0, v0, v1, v0}, Landroidx/compose/foundation/text2/input/TextUndoManager;-><init>(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;ILkotlin/jvm/internal/w;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide p2

    :cond_1
    const/4 p4, 0x0

    .line 12
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    .line 3
    new-instance p4, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, Landroidx/compose/ui/text/TextRangeKt;->coerceIn-8ffj60Q(JII)J

    move-result-wide v2

    const/4 v0, 0x0

    .line 5
    invoke-direct {p4, p1, v2, v3, v0}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V

    iput-object p4, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 6
    invoke-static {p1, p2, p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-FDrldGo(Ljava/lang/String;J)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object p1

    const/4 p2, 0x2

    .line 7
    invoke-static {p1, v0, p2, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->text$delegate:Landroidx/compose/runtime/MutableState;

    .line 8
    new-instance p1, Landroidx/compose/foundation/text2/input/UndoState;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/text2/input/UndoState;-><init>(Landroidx/compose/foundation/text2/input/TextFieldState;)V

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->undoState:Landroidx/compose/foundation/text2/input/UndoState;

    .line 9
    new-instance p1, Landroidx/compose/runtime/collection/MutableVector;

    const/16 p2, 0x10

    new-array p2, p2, [Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;

    invoke-direct {p1, p2, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 10
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;->commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    return-void
.end method

.method public static final synthetic access$notifyIme(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    return-void
.end method

.method public static final synthetic access$setText(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    return-void
.end method

.method private final commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 30
    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    invoke-direct {p0, p2, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 42
    .line 43
    invoke-virtual {p3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;->recordEditForUndo(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v0, v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 76
    .line 77
    .line 78
    if-eqz p3, :cond_2

    .line 79
    .line 80
    invoke-direct {p0, v1, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void

    .line 84
    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    .line 91
    .line 92
    invoke-direct {v3, v0, v2, v1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/ChangeTracker;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p2, v1, v3}, Landroidx/compose/foundation/text2/input/InputTransformation;->transformInput(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {v3, p2}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->toTextFieldCharSequence-OEnZFl4$foundation_release(Landroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-direct {p0, p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 113
    .line 114
    .line 115
    if-eqz p3, :cond_5

    .line 116
    .line 117
    invoke-direct {p0, v1, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->resetStateAndNotifyIme$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getChanges()Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/TextFieldState;->recordEditForUndo(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 133
    .line 134
    .line 135
    return-void
    .line 136
    .line 137
    .line 138
    .line 139
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
.end method

.method public static synthetic editAsUser$foundation_release$default(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;Lv3/l;ILjava/lang/Object;)V
    .locals 4

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    sget-object p3, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p6

    .line 20
    invoke-virtual {p6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 21
    .line 22
    .line 23
    move-result-object p6

    .line 24
    invoke-virtual {p6}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object p6

    .line 31
    invoke-interface {p4, p6}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    if-nez p4, :cond_2

    .line 47
    .line 48
    invoke-interface {p5}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    if-eqz p4, :cond_2

    .line 65
    .line 66
    invoke-interface {p5}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object p6

    .line 74
    invoke-virtual {p6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 75
    .line 76
    .line 77
    move-result-object p6

    .line 78
    invoke-static {p4, p6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p4

    .line 82
    if-eqz p4, :cond_2

    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    invoke-static {p0, p5, p1, p2, p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 86
    .line 87
    .line 88
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
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
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
.end method

.method public static synthetic getMainBuffer$foundation_release$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method public static synthetic getUndoState$annotations()V
    .locals 0
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    return-void
.end method

.method private final notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :cond_0
    aget-object v3, v0, v2

    .line 15
    .line 16
    check-cast v3, Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;

    .line 17
    .line 18
    invoke-interface {v3, p1, p2}, Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;->onChange(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    if-lt v2, v1, :cond_0

    .line 24
    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
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
.end method

.method private final recordEditForUndo(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/text2/input/TextFieldState$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    aget p4, v0, p4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p4, v0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p4, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p4, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p4, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p4, p1, p2, p3, v0}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->recordChanges(Landroidx/compose/foundation/text2/input/TextUndoManager;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p4, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    .line 27
    .line 28
    invoke-static {p4, p1, p2, p3, v0}, Landroidx/compose/foundation/text2/input/TextUndoManagerKt;->recordChanges(Landroidx/compose/foundation/text2/input/TextUndoManager;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->clearHistory()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
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
.end method

.method private final setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->text$delegate:Landroidx/compose/runtime/MutableState;

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
.method public final addNotifyImeListener$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final commitEdit(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V
    .locals 6
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getChanges()Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;->getChangeCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->getSelectionInChars-d9O1mEE()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v4, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 20
    .line 21
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    xor-int/2addr v2, v1

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;->toTextFieldCharSequence-OEnZFl4$foundation_release$default(Landroidx/compose/foundation/text2/input/TextFieldBuffer;Landroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->resetStateAndNotifyIme$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/TextUndoManager;->clearHistory()V

    .line 45
    .line 46
    .line 47
    return-void
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
.end method

.method public final edit(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/TextFieldBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->startEdit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/TextFieldState;->commitEdit(Landroidx/compose/foundation/text2/input/TextFieldBuffer;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final editAsUser$foundation_release(Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;Lv3/l;)V
    .locals 5
    .param p1    # Landroidx/compose/foundation/text2/input/InputTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/InputTransformation;",
            "Z",
            "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p4, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->getChangeCount()I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    if-nez p4, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    if-eqz p4, :cond_0

    .line 54
    .line 55
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {p4, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    if-eqz p4, :cond_0

    .line 72
    .line 73
    return-void

    .line 74
    :cond_0
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/InputTransformation;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 75
    .line 76
    .line 77
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
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
.end method

.method public final editWithNoSideEffects$foundation_release(Lv3/l;)V
    .locals 4
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p1, v1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {p1, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$setText(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$notifyIme(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 55
    .line 56
    .line 57
    return-void
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

.method public final getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    return-object v0
.end method

.method public final getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->text$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

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

.method public final getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->textUndoManager:Landroidx/compose/foundation/text2/input/TextUndoManager;

    return-object v0
.end method

.method public final getUndoState()Landroidx/compose/foundation/text2/input/UndoState;
    .locals 1
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->undoState:Landroidx/compose/foundation/text2/input/UndoState;

    return-object v0
.end method

.method public final removeNotifyImeListener$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyImeListeners:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final resetStateAndNotifyIme$foundation_release(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 10
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x1

    .line 38
    xor-int/2addr v1, v2

    .line 39
    invoke-interface {v0, p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x0

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-direct {v3, v5, v6, v7, v8}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 78
    .line 79
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {v3, v5, v6}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 96
    .line 97
    .line 98
    move v9, v4

    .line 99
    move v4, v2

    .line 100
    move v2, v9

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    move v2, v4

    .line 103
    :goto_0
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    iget-object v5, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 121
    .line 122
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-virtual {v3}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-virtual {v5, v6, v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setComposition(II)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    :goto_1
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    .line 145
    .line 146
    .line 147
    :goto_2
    if-nez v2, :cond_4

    .line 148
    .line 149
    if-nez v4, :cond_5

    .line 150
    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 154
    .line 155
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->commitComposition()V

    .line 156
    .line 157
    .line 158
    :cond_5
    if-eqz v2, :cond_6

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    move-object p1, v0

    .line 162
    :goto_3
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 163
    .line 164
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 165
    .line 166
    .line 167
    move-result-wide v1

    .line 168
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 169
    .line 170
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {p1, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->setText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->notifyIme(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 182
    .line 183
    .line 184
    return-void
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
.end method

.method public final setMainBuffer$foundation_release(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/internal/EditingBuffer;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/TextFieldState;->mainBuffer:Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    return-void
.end method

.method public final startEdit(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Landroidx/compose/foundation/text2/input/TextFieldBuffer;
    .locals 7
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlin/a1;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v6, Landroidx/compose/foundation/text2/input/TextFieldBuffer;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/TextFieldBuffer;-><init>(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/ChangeTracker;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;ILkotlin/jvm/internal/w;)V

    return-object v6
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextFieldState(selectionInChars="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", text=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
