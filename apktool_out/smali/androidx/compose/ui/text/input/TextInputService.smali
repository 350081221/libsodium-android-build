.class public Landroidx/compose/ui/text/input/TextInputService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJF\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u0008\u0010\u000e\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0008\u0010\u0010\u001a\u00020\tH\u0007J\u0008\u0010\u0011\u001a\u00020\tH\u0007J\u0008\u0010\u0012\u001a\u00020\tH\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/TextInputService;",
        "",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "value",
        "Landroidx/compose/ui/text/input/ImeOptions;",
        "imeOptions",
        "Lkotlin/Function1;",
        "",
        "Landroidx/compose/ui/text/input/EditCommand;",
        "Lkotlin/r2;",
        "onEditCommand",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "onImeActionPerformed",
        "Landroidx/compose/ui/text/input/TextInputSession;",
        "startInput",
        "session",
        "stopInput",
        "showSoftwareKeyboard",
        "hideSoftwareKeyboard",
        "Landroidx/compose/ui/text/input/PlatformTextInputService;",
        "platformTextInputService",
        "Landroidx/compose/ui/text/input/PlatformTextInputService;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Landroidx/compose/ui/text/AtomicReference;",
        "_currentInputSession",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "getCurrentInputSession$ui_text_release",
        "()Landroidx/compose/ui/text/input/TextInputSession;",
        "currentInputSession",
        "<init>",
        "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V",
        "ui-text_release"
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
.field private final _currentInputSession:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/compose/ui/text/input/TextInputSession;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/input/PlatformTextInputService;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/text/input/PlatformTextInputService;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/compose/ui/text/input/TextInputService;->_currentInputSession:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    return-void
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
.method public final getCurrentInputSession$ui_text_release()Landroidx/compose/ui/text/input/TextInputSession;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->_currentInputSession:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/text/input/TextInputSession;

    return-object v0
.end method

.method public final hideSoftwareKeyboard()V
    .locals 1
    .annotation runtime Lkotlin/k;
        message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "textInputSession.hideSoftwareKeyboard()"
            imports = {}
        .end subannotation
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-interface {v0}, Landroidx/compose/ui/text/input/PlatformTextInputService;->hideSoftwareKeyboard()V

    return-void
.end method

.method public final showSoftwareKeyboard()V
    .locals 1
    .annotation runtime Lkotlin/k;
        message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "textInputSession.showSoftwareKeyboard()"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/input/TextInputService;->getCurrentInputSession$ui_text_release()Landroidx/compose/ui/text/input/TextInputSession;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/text/input/PlatformTextInputService;->showSoftwareKeyboard()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public startInput(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lv3/l;)Landroidx/compose/ui/text/input/TextInputSession;
    .locals 1
    .param p1    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/text/input/ImeOptions;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
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
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Lv3/l<",
            "-",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/input/EditCommand;",
            ">;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/ImeAction;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextInputSession;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/text/input/PlatformTextInputService;->startInput(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lv3/l;)V

    .line 2
    new-instance p1, Landroidx/compose/ui/text/input/TextInputSession;

    iget-object p2, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-direct {p1, p0, p2}, Landroidx/compose/ui/text/input/TextInputSession;-><init>(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V

    .line 3
    iget-object p2, p0, Landroidx/compose/ui/text/input/TextInputService;->_currentInputSession:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final startInput()V
    .locals 1
    .annotation build Landroidx/compose/ui/text/InternalTextApi;
    .end annotation

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-interface {v0}, Landroidx/compose/ui/text/input/PlatformTextInputService;->startInput()V

    return-void
.end method

.method public final stopInput()V
    .locals 1
    .annotation build Landroidx/compose/ui/text/InternalTextApi;
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-interface {v0}, Landroidx/compose/ui/text/input/PlatformTextInputService;->stopInput()V

    return-void
.end method

.method public stopInput(Landroidx/compose/ui/text/input/TextInputSession;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/text/input/TextInputSession;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/input/TextInputService;->_currentInputSession:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/text/input/TextInputService;->platformTextInputService:Landroidx/compose/ui/text/input/PlatformTextInputService;

    invoke-interface {p1}, Landroidx/compose/ui/text/input/PlatformTextInputService;->stopInput()V

    :cond_0
    return-void
.end method
