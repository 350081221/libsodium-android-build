.class public final Landroidx/compose/ui/focus/FocusInvalidationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000c\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0008J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nR&\u0010\r\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000c\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "",
        "T",
        "",
        "node",
        "Lkotlin/r2;",
        "scheduleInvalidation",
        "(Ljava/util/Set;Ljava/lang/Object;)V",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "onRequestApplyChangesListener",
        "Lv3/l;",
        "focusTargetNodes",
        "Ljava/util/Set;",
        "focusEventNodes",
        "focusPropertiesNodes",
        "invalidateNodes",
        "Lv3/a;",
        "<init>",
        "(Lv3/l;)V",
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
.field private focusEventNodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/ui/focus/FocusEventModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private focusPropertiesNodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private focusTargetNodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final invalidateNodes:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final onRequestApplyChangesListener:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lv3/l;

    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Ljava/util/Set;

    .line 12
    .line 13
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Ljava/util/Set;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodes:Ljava/util/Set;

    .line 26
    .line 27
    new-instance p1, Landroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1;-><init>(Landroidx/compose/ui/focus/FocusInvalidationManager;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodes:Lv3/a;

    .line 33
    .line 34
    return-void
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
.end method

.method public static final synthetic access$getFocusEventNodes$p(Landroidx/compose/ui/focus/FocusInvalidationManager;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getFocusPropertiesNodes$p(Landroidx/compose/ui/focus/FocusInvalidationManager;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodes:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getFocusTargetNodes$p(Landroidx/compose/ui/focus/FocusInvalidationManager;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Ljava/util/Set;

    return-object p0
.end method

.method private final scheduleInvalidation(Ljava/util/Set;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 4
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    iget-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    add-int/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodes:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p2

    add-int/2addr p1, p2

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 6
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lv3/l;

    iget-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodes:Lv3/a;

    invoke-interface {p1, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Ljava/util/Set;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Ljava/util/Set;Ljava/lang/Object;)V

    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodes:Ljava/util/Set;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Ljava/util/Set;Ljava/lang/Object;)V

    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Ljava/util/Set;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Ljava/util/Set;Ljava/lang/Object;)V

    return-void
.end method
