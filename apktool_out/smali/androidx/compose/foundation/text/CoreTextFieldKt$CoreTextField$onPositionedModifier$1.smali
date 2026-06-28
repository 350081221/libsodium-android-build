.class final Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/CoreTextFieldKt;->CoreTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLv3/q;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "it",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)V",
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
.field final synthetic $enabled:Z

.field final synthetic $manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

.field final synthetic $offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

.field final synthetic $state:Landroidx/compose/foundation/text/TextFieldState;

.field final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;

.field final synthetic $windowInfo:Landroidx/compose/ui/platform/WindowInfo;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/TextFieldState;ZLandroidx/compose/ui/platform/WindowInfo;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    iput-boolean p2, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$enabled:Z

    iput-object p3, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$windowInfo:Landroidx/compose/ui/platform/WindowInfo;

    iput-object p4, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    iput-object p5, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iput-object p6, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->invoke(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 4
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/TextFieldState;->setLayoutCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->setInnerTextFieldCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 4
    :goto_0
    iget-boolean p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$enabled:Z

    if-eqz p1, :cond_4

    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/TextFieldState;->getHandleState()Landroidx/compose/foundation/text/HandleState;

    move-result-object p1

    sget-object v0, Landroidx/compose/foundation/text/HandleState;->Selection:Landroidx/compose/foundation/text/HandleState;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    .line 6
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/TextFieldState;->getShowFloatingToolbar()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$windowInfo:Landroidx/compose/ui/platform/WindowInfo;

    invoke-static {p1}, Landroidx/compose/foundation/text/CoreTextFieldKt;->isWindowFocusedBehindFlag(Landroidx/compose/ui/platform/WindowInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->showSelectionToolbar$foundation_release()V

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;->hideSelectionToolbar$foundation_release()V

    .line 9
    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt;->isSelectionHandleInVisibleBound(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z

    move-result v0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/text/TextFieldState;->setShowSelectionHandleStart(Z)V

    .line 12
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    .line 13
    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt;->isSelectionHandleInVisibleBound(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z

    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/text/TextFieldState;->setShowSelectionHandleEnd(Z)V

    .line 15
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/text/TextFieldState;->setShowCursorHandle(Z)V

    goto :goto_2

    .line 16
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/TextFieldState;->getHandleState()Landroidx/compose/foundation/text/HandleState;

    move-result-object p1

    sget-object v0, Landroidx/compose/foundation/text/HandleState;->Cursor:Landroidx/compose/foundation/text/HandleState;

    if-ne p1, v0, :cond_3

    .line 17
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    .line 18
    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$manager:Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;

    invoke-static {v0, v1}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt;->isSelectionHandleInVisibleBound(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Z)Z

    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/text/TextFieldState;->setShowCursorHandle(Z)V

    .line 20
    :cond_3
    :goto_2
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    invoke-static {p1, v0, v1}, Landroidx/compose/foundation/text/CoreTextFieldKt;->access$notifyFocusedRect(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V

    .line 21
    iget-object p1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/TextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$state:Landroidx/compose/foundation/text/TextFieldState;

    iget-object v1, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iget-object v2, p0, Landroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$onPositionedModifier$1;->$offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextFieldState;->getInputSession()Landroidx/compose/ui/text/input/TextInputSession;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 23
    invoke-virtual {v0}, Landroidx/compose/foundation/text/TextFieldState;->getHasFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 24
    sget-object v0, Landroidx/compose/foundation/text/TextFieldDelegate;->Companion:Landroidx/compose/foundation/text/TextFieldDelegate$Companion;

    invoke-virtual {v0, v3, v1, v2, p1}, Landroidx/compose/foundation/text/TextFieldDelegate$Companion;->updateTextLayoutResult$foundation_release(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V

    :cond_4
    return-void
.end method
