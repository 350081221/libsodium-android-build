.class public final Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;
.super Landroid/view/ActionMode$Callback2;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x17
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0012\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;",
        "Landroid/view/ActionMode$Callback2;",
        "Landroid/view/ActionMode;",
        "mode",
        "Landroid/view/MenuItem;",
        "item",
        "",
        "onActionItemClicked",
        "Landroid/view/Menu;",
        "menu",
        "onCreateActionMode",
        "onPrepareActionMode",
        "Lkotlin/r2;",
        "onDestroyActionMode",
        "Landroid/view/View;",
        "view",
        "Landroid/graphics/Rect;",
        "outRect",
        "onGetContentRect",
        "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;",
        "callback",
        "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;",
        "<init>",
        "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V",
        "ui_release"
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
.field private final callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode$Callback2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

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
.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/Menu;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 0
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onDestroyActionMode()V

    return-void
.end method

.method public onGetContentRect(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 2
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->getRect()Landroidx/compose/ui/geometry/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    float-to-int p2, p2

    .line 14
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    float-to-int v0, v0

    .line 19
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    float-to-int v1, v1

    .line 24
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    float-to-int p1, p1

    .line 29
    invoke-virtual {p3, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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
.end method

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1
    .param p1    # Landroid/view/ActionMode;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/Menu;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;->callback:Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
