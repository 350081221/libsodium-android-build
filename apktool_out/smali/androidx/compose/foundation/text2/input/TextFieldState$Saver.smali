.class public final Landroidx/compose/foundation/text2/input/TextFieldState$Saver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/saveable/Saver;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/TextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Saver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/saveable/Saver<",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldState$Saver;",
        "Landroidx/compose/runtime/saveable/Saver;",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "",
        "()V",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/foundation/text2/input/TextFieldState$Saver;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;

    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;->INSTANCE:Landroidx/compose/foundation/text2/input/TextFieldState$Saver;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public restore(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/TextFieldState;
    .locals 10
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

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 3
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 4
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 6
    invoke-static {v1, v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v6

    .line 7
    sget-object v0, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->INSTANCE:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;

    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->restore(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object v8

    .line 9
    invoke-static {v8}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    const/4 v9, 0x0

    .line 10
    new-instance p1, Landroidx/compose/foundation/text2/input/TextFieldState;

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/TextUndoManager;Lkotlin/jvm/internal/w;)V

    return-object p1
.end method

.method public bridge synthetic restore(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;->restore(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/TextFieldState;

    move-result-object p1

    return-object p1
.end method

.method public save(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text2/input/TextFieldState;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroidx/compose/runtime/saveable/SaverScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 3
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 4
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 5
    sget-object v1, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->INSTANCE:Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;

    .line 6
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/TextFieldState;->getTextUndoManager$foundation_release()Landroidx/compose/foundation/text2/input/TextUndoManager;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;->save(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text2/input/TextUndoManager;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v0, p2

    .line 7
    invoke-static {v0}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic save(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/compose/foundation/text2/input/TextFieldState;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/TextFieldState$Saver;->save(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text2/input/TextFieldState;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
