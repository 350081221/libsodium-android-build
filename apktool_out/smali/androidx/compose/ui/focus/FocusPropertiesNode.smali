.class final Landroidx/compose/ui/focus/FocusPropertiesNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusPropertiesModifierNode;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0008\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusPropertiesNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/focus/FocusProperties;",
        "focusProperties",
        "Lkotlin/r2;",
        "applyFocusProperties",
        "Landroidx/compose/ui/focus/FocusPropertiesScope;",
        "focusPropertiesScope",
        "Landroidx/compose/ui/focus/FocusPropertiesScope;",
        "getFocusPropertiesScope",
        "()Landroidx/compose/ui/focus/FocusPropertiesScope;",
        "setFocusPropertiesScope",
        "(Landroidx/compose/ui/focus/FocusPropertiesScope;)V",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private focusPropertiesScope:Landroidx/compose/ui/focus/FocusPropertiesScope;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/FocusPropertiesScope;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusPropertiesNode;->focusPropertiesScope:Landroidx/compose/ui/focus/FocusPropertiesScope;

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
.method public applyFocusProperties(Landroidx/compose/ui/focus/FocusProperties;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusProperties;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusPropertiesNode;->focusPropertiesScope:Landroidx/compose/ui/focus/FocusPropertiesScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/focus/FocusPropertiesScope;->apply(Landroidx/compose/ui/focus/FocusProperties;)V

    return-void
.end method

.method public final getFocusPropertiesScope()Landroidx/compose/ui/focus/FocusPropertiesScope;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusPropertiesNode;->focusPropertiesScope:Landroidx/compose/ui/focus/FocusPropertiesScope;

    return-object v0
.end method

.method public final setFocusPropertiesScope(Landroidx/compose/ui/focus/FocusPropertiesScope;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusPropertiesNode;->focusPropertiesScope:Landroidx/compose/ui/focus/FocusPropertiesScope;

    return-void
.end method
