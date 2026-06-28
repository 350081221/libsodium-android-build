.class public final Landroidx/compose/foundation/text/TextFieldKeyInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u001f\u0012\u0008\u0008\u0002\u0010$\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010(\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\u0008\u0008\u0002\u00100\u001a\u00020/\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u0010:\u001a\u000209\u0012\u0008\u0008\u0002\u0010=\u001a\u00020<\u0012\u0014\u0008\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u000c\u0012\u0006\u0010B\u001a\u00020A\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u0010\u001a\u00020\u00042\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000c\u00a2\u0006\u0002\u0008\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010$\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010(\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010%\u001a\u0004\u0008)\u0010\'R\u0017\u0010+\u001a\u00020*8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u00100\u001a\u00020/8\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0019\u00105\u001a\u0004\u0018\u0001048\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001a\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008B\u0010C\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006F"
    }
    d2 = {
        "Landroidx/compose/foundation/text/TextFieldKeyInput;",
        "",
        "",
        "Landroidx/compose/ui/text/input/EditCommand;",
        "Lkotlin/r2;",
        "apply",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "event",
        "Landroidx/compose/ui/text/input/CommitTextCommand;",
        "typedCommand-ZmokQxo",
        "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;",
        "typedCommand",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;",
        "Lkotlin/u;",
        "block",
        "commandExecutionContext",
        "",
        "process-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "process",
        "Landroidx/compose/foundation/text/TextFieldState;",
        "state",
        "Landroidx/compose/foundation/text/TextFieldState;",
        "getState",
        "()Landroidx/compose/foundation/text/TextFieldState;",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "selectionManager",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "getSelectionManager",
        "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "value",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "getValue",
        "()Landroidx/compose/ui/text/input/TextFieldValue;",
        "editable",
        "Z",
        "getEditable",
        "()Z",
        "singleLine",
        "getSingleLine",
        "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
        "preparedSelectionState",
        "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
        "getPreparedSelectionState",
        "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
        "Landroidx/compose/ui/text/input/OffsetMapping;",
        "offsetMapping",
        "Landroidx/compose/ui/text/input/OffsetMapping;",
        "getOffsetMapping",
        "()Landroidx/compose/ui/text/input/OffsetMapping;",
        "Landroidx/compose/foundation/text/UndoManager;",
        "undoManager",
        "Landroidx/compose/foundation/text/UndoManager;",
        "getUndoManager",
        "()Landroidx/compose/foundation/text/UndoManager;",
        "Landroidx/compose/foundation/text/DeadKeyCombiner;",
        "keyCombiner",
        "Landroidx/compose/foundation/text/DeadKeyCombiner;",
        "Landroidx/compose/foundation/text/KeyMapping;",
        "keyMapping",
        "Landroidx/compose/foundation/text/KeyMapping;",
        "onValueChange",
        "Lv3/l;",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "imeAction",
        "I",
        "<init>",
        "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;ILkotlin/jvm/internal/w;)V",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final editable:Z

.field private final imeAction:I

.field private final keyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final keyMapping:Landroidx/compose/foundation/text/KeyMapping;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final preparedSelectionState:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final selectionManager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final singleLine:Z

.field private final state:Landroidx/compose/foundation/text/TextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final undoManager:Landroidx/compose/foundation/text/UndoManager;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final value:Landroidx/compose/ui/text/input/TextFieldValue;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/TextFieldState;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "ZZ",
            "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;",
            "Landroidx/compose/ui/text/input/OffsetMapping;",
            "Landroidx/compose/foundation/text/UndoManager;",
            "Landroidx/compose/foundation/text/DeadKeyCombiner;",
            "Landroidx/compose/foundation/text/KeyMapping;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->state:Landroidx/compose/foundation/text/TextFieldState;

    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->selectionManager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    .line 4
    iput-object p3, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    .line 5
    iput-boolean p4, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->editable:Z

    .line 6
    iput-boolean p5, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->singleLine:Z

    .line 7
    iput-object p6, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->preparedSelectionState:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    .line 8
    iput-object p7, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    .line 9
    iput-object p8, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->undoManager:Landroidx/compose/foundation/text/UndoManager;

    .line 10
    iput-object p9, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->keyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    .line 11
    iput-object p10, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    .line 12
    iput-object p11, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->onValueChange:Lv3/l;

    .line 13
    iput p12, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->imeAction:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;IILkotlin/jvm/internal/w;)V
    .locals 23

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 14
    new-instance v1, Landroidx/compose/ui/text/input/TextFieldValue;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/text/input/TextFieldValue;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/w;)V

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v13, v1

    goto :goto_1

    :cond_1
    move/from16 v13, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v14, v1

    goto :goto_2

    :cond_2
    move/from16 v14, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    .line 15
    sget-object v1, Landroidx/compose/ui/text/input/OffsetMapping;->Companion:Landroidx/compose/ui/text/input/OffsetMapping$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/OffsetMapping$Companion;->getIdentity()Landroidx/compose/ui/text/input/OffsetMapping;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_3

    :cond_3
    move-object/from16 v16, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move-object/from16 v17, v1

    goto :goto_4

    :cond_4
    move-object/from16 v17, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    .line 16
    invoke-static {}, Landroidx/compose/foundation/text/KeyMapping_androidKt;->getPlatformDefaultKeyMapping()Landroidx/compose/foundation/text/KeyMapping;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_5

    :cond_5
    move-object/from16 v19, p10

    :goto_5
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    .line 17
    sget-object v0, Landroidx/compose/foundation/text/TextFieldKeyInput$1;->INSTANCE:Landroidx/compose/foundation/text/TextFieldKeyInput$1;

    move-object/from16 v20, v0

    goto :goto_6

    :cond_6
    move-object/from16 v20, p11

    :goto_6
    const/16 v22, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v15, p6

    move-object/from16 v18, p9

    move/from16 v21, p12

    .line 18
    invoke-direct/range {v9 .. v22}, Landroidx/compose/foundation/text/TextFieldKeyInput;-><init>(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;ILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;ILkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Landroidx/compose/foundation/text/TextFieldKeyInput;-><init>(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;I)V

    return-void
.end method

.method public static final synthetic access$apply(Landroidx/compose/foundation/text/TextFieldKeyInput;Landroidx/compose/ui/text/input/EditCommand;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextFieldKeyInput;->apply(Landroidx/compose/ui/text/input/EditCommand;)V

    return-void
.end method

.method public static final synthetic access$apply(Landroidx/compose/foundation/text/TextFieldKeyInput;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextFieldKeyInput;->apply(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getImeAction$p(Landroidx/compose/foundation/text/TextFieldKeyInput;)I
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->imeAction:I

    return p0
.end method

.method public static final synthetic access$getOnValueChange$p(Landroidx/compose/foundation/text/TextFieldKeyInput;)Lv3/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->onValueChange:Lv3/l;

    return-object p0
.end method

.method private final apply(Landroidx/compose/ui/text/input/EditCommand;)V
    .locals 0

    .line 6
    invoke-static {p1}, Lkotlin/collections/u;->k(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextFieldKeyInput;->apply(Ljava/util/List;)V

    return-void
.end method

.method private final apply(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/input/EditCommand;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextFieldState;->getProcessor()Landroidx/compose/ui/text/input/EditProcessor;

    move-result-object v0

    .line 2
    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/u;->V5(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 3
    new-instance v1, Landroidx/compose/ui/text/input/FinishComposingTextCommand;

    invoke-direct {v1}, Landroidx/compose/ui/text/input/FinishComposingTextCommand;-><init>()V

    const/4 v2, 0x0

    invoke-interface {p1, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 4
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/input/EditProcessor;->apply(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->onValueChange:Lv3/l;

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final commandExecutionContext(Lv3/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->state:Landroidx/compose/foundation/text/TextFieldState;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroidx/compose/foundation/text/TextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->preparedSelectionState:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getSelection-d9O1mEE()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-object p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/TextFieldValue;->getAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->onValueChange:Lv3/l;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;->getValue()Landroidx/compose/ui/text/input/TextFieldValue;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
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

.method private final typedCommand-ZmokQxo(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/compose/foundation/text/TextFieldKeyInput_androidKt;->isTypedEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->keyCombiner:Landroidx/compose/foundation/text/DeadKeyCombiner;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/DeadKeyCombiner;->consume-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Landroidx/compose/foundation/text/StringHelpers_jvmKt;->appendCodePointX(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Landroidx/compose/ui/text/input/CommitTextCommand;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, p1, v1}, Landroidx/compose/ui/text/input/CommitTextCommand;-><init>(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    return-object v1
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
.end method


# virtual methods
.method public final getEditable()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->editable:Z

    return v0
.end method

.method public final getOffsetMapping()Landroidx/compose/ui/text/input/OffsetMapping;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    return-object v0
.end method

.method public final getPreparedSelectionState()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->preparedSelectionState:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    return-object v0
.end method

.method public final getSelectionManager()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->selectionManager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    return-object v0
.end method

.method public final getSingleLine()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->singleLine:Z

    return v0
.end method

.method public final getState()Landroidx/compose/foundation/text/TextFieldState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->state:Landroidx/compose/foundation/text/TextFieldState;

    return-object v0
.end method

.method public final getUndoManager()Landroidx/compose/foundation/text/UndoManager;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->undoManager:Landroidx/compose/foundation/text/UndoManager;

    return-object v0
.end method

.method public final getValue()Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->value:Landroidx/compose/ui/text/input/TextFieldValue;

    return-object v0
.end method

.method public final process-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 4
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/TextFieldKeyInput;->typedCommand-ZmokQxo(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->editable:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text/TextFieldKeyInput;->apply(Landroidx/compose/ui/text/input/EditCommand;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->preparedSelectionState:Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;->resetCachedX()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    return v1

    .line 24
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v0, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->keyMapping:Landroidx/compose/foundation/text/KeyMapping;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Landroidx/compose/foundation/text/KeyMapping;->map-ZmokQxo(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/foundation/text/KeyCommand;->getEditsText()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-boolean v0, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->editable:Z

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    new-instance v0, Lkotlin/jvm/internal/k1$a;

    .line 61
    .line 62
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$a;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-boolean v1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 66
    .line 67
    new-instance v1, Landroidx/compose/foundation/text/TextFieldKeyInput$process$2;

    .line 68
    .line 69
    invoke-direct {v1, p1, p0, v0}, Landroidx/compose/foundation/text/TextFieldKeyInput$process$2;-><init>(Landroidx/compose/foundation/text/KeyCommand;Landroidx/compose/foundation/text/TextFieldKeyInput;Lkotlin/jvm/internal/k1$a;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/TextFieldKeyInput;->commandExecutionContext(Lv3/l;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Landroidx/compose/foundation/text/TextFieldKeyInput;->undoManager:Landroidx/compose/foundation/text/UndoManager;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/compose/foundation/text/UndoManager;->forceNextSnapshot()V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-boolean p1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 83
    .line 84
    return p1

    .line 85
    :cond_5
    :goto_1
    return v2
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
