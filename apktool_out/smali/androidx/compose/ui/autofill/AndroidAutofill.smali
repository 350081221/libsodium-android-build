.class public final Landroidx/compose/ui/autofill/AndroidAutofill;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/autofill/Autofill;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/autofill/AndroidAutofill;",
        "Landroidx/compose/ui/autofill/Autofill;",
        "Landroidx/compose/ui/autofill/AutofillNode;",
        "autofillNode",
        "Lkotlin/r2;",
        "requestAutofillForNode",
        "cancelAutofillForNode",
        "Landroid/view/View;",
        "view",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "Landroidx/compose/ui/autofill/AutofillTree;",
        "autofillTree",
        "Landroidx/compose/ui/autofill/AutofillTree;",
        "getAutofillTree",
        "()Landroidx/compose/ui/autofill/AutofillTree;",
        "Landroid/view/autofill/AutofillManager;",
        "autofillManager",
        "Landroid/view/autofill/AutofillManager;",
        "getAutofillManager",
        "()Landroid/view/autofill/AutofillManager;",
        "<init>",
        "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V",
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
.field private final autofillManager:Landroid/view/autofill/AutofillManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final autofillTree:Landroidx/compose/ui/autofill/AutofillTree;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final view:Landroid/view/View;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/autofill/AutofillTree;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->view:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillTree:Landroidx/compose/ui/autofill/AutofillTree;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-class v0, Landroid/view/autofill/AutofillManager;

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Landroid/view/autofill/AutofillManager;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillManager:Landroid/view/autofill/AutofillManager;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-static {p1, p2}, Lb/b;->a(Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p2, "Autofill service could not be located."

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
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


# virtual methods
.method public cancelAutofillForNode(Landroidx/compose/ui/autofill/AutofillNode;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/autofill/AutofillNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillManager:Landroid/view/autofill/AutofillManager;

    iget-object v1, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->view:Landroid/view/View;

    invoke-virtual {p1}, Landroidx/compose/ui/autofill/AutofillNode;->getId()I

    move-result p1

    invoke-static {v0, v1, p1}, Lb/a;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;I)V

    return-void
.end method

.method public final getAutofillManager()Landroid/view/autofill/AutofillManager;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillManager:Landroid/view/autofill/AutofillManager;

    return-object v0
.end method

.method public final getAutofillTree()Landroidx/compose/ui/autofill/AutofillTree;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillTree:Landroidx/compose/ui/autofill/AutofillTree;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->view:Landroid/view/View;

    return-object v0
.end method

.method public requestAutofillForNode(Landroidx/compose/ui/autofill/AutofillNode;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/autofill/AutofillNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/autofill/AutofillNode;->getBoundingBox()Landroidx/compose/ui/geometry/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->autofillManager:Landroid/view/autofill/AutofillManager;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/compose/ui/autofill/AndroidAutofill;->view:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/autofill/AutofillNode;->getId()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v3, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v4}, Lkotlin/math/b;->L0(F)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-static {v5}, Lkotlin/math/b;->L0(F)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v6}, Lkotlin/math/b;->L0(F)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2, p1, v3}, Lb/c;->a(Landroid/view/autofill/AutofillManager;Landroid/view/View;ILandroid/graphics/Rect;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "requestAutofill called before onChildPositioned()"

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
