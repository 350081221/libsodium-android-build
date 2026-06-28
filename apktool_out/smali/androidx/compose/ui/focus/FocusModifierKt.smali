.class public final Landroidx/compose/ui/focus/FocusModifierKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "focusModifier",
        "Landroidx/compose/ui/Modifier;",
        "focusTarget",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final focusModifier(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Replaced by focusTarget"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "focusTarget()"
            imports = {
                "androidx.compose.ui.focus.focusTarget"
            }
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusModifierKt;->focusTarget(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final focusTarget(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;->INSTANCE:Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
