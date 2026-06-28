.class public final Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/TextToolbar;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/BasicSecureTextFieldKt;->DisableCutCopy(Lv3/p;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001JP\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "androidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1",
        "Landroidx/compose/ui/platform/TextToolbar;",
        "Lkotlin/r2;",
        "hide",
        "Landroidx/compose/ui/geometry/Rect;",
        "rect",
        "Lkotlin/Function0;",
        "onCopyRequested",
        "onPasteRequested",
        "onCutRequested",
        "onSelectAllRequested",
        "showMenu",
        "Landroidx/compose/ui/platform/TextToolbarStatus;",
        "getStatus",
        "()Landroidx/compose/ui/platform/TextToolbarStatus;",
        "status",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/ui/platform/TextToolbar;

.field final synthetic $currentToolbar:Landroidx/compose/ui/platform/TextToolbar;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/TextToolbar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;->$currentToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;->$$delegate_0:Landroidx/compose/ui/platform/TextToolbar;

    .line 7
    .line 8
    return-void
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
.method public getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;->$$delegate_0:Landroidx/compose/ui/platform/TextToolbar;

    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;->$$delegate_0:Landroidx/compose/ui/platform/TextToolbar;

    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->hide()V

    return-void
.end method

.method public showMenu(Landroidx/compose/ui/geometry/Rect;Lv3/a;Lv3/a;Lv3/a;Lv3/a;)V
    .locals 6
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1;->$currentToolbar:Landroidx/compose/ui/platform/TextToolbar;

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lv3/a;Lv3/a;Lv3/a;Lv3/a;)V

    return-void
.end method
