.class public final synthetic Landroidx/compose/foundation/text2/input/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;


# instance fields
.field public final synthetic a:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

.field public final synthetic b:Landroidx/compose/ui/text/input/ImeOptions;

.field public final synthetic c:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

.field public final synthetic d:Lv3/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Lv3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/a;->a:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/a;->b:Landroidx/compose/ui/text/input/ImeOptions;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/a;->c:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/a;->d:Lv3/l;

    return-void
.end method


# virtual methods
.method public final createInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/a;->a:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/a;->b:Landroidx/compose/ui/text/input/ImeOptions;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/a;->c:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    iget-object v3, p0, Landroidx/compose/foundation/text2/input/internal/a;->d:Lv3/l;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->h(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Lv3/l;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method
