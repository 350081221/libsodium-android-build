.class public final Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/SemanticsModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\r\u0010\n\"\u0004\u0008\u000e\u0010\u000cR3\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0002\u0008\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\n\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/SemanticsModifierNode;",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "Lkotlin/r2;",
        "applySemantics",
        "",
        "mergeDescendants",
        "Z",
        "getMergeDescendants",
        "()Z",
        "setMergeDescendants",
        "(Z)V",
        "isClearingSemantics",
        "setClearingSemantics",
        "Lkotlin/Function1;",
        "Lkotlin/u;",
        "properties",
        "Lv3/l;",
        "getProperties",
        "()Lv3/l;",
        "setProperties",
        "(Lv3/l;)V",
        "getShouldClearDescendantSemantics",
        "shouldClearDescendantSemantics",
        "getShouldMergeDescendantSemantics",
        "shouldMergeDescendantSemantics",
        "<init>",
        "(ZZLv3/l;)V",
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
.field private isClearingSemantics:Z

.field private mergeDescendants:Z

.field private properties:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
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

.method public constructor <init>(ZZLv3/l;)V
    .locals 0
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->mergeDescendants:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->isClearingSemantics:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->properties:Lv3/l;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->properties:Lv3/l;

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getMergeDescendants()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->mergeDescendants:Z

    return v0
.end method

.method public final getProperties()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->properties:Lv3/l;

    return-object v0
.end method

.method public getShouldClearDescendantSemantics()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->isClearingSemantics:Z

    return v0
.end method

.method public getShouldMergeDescendantSemantics()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->mergeDescendants:Z

    return v0
.end method

.method public final isClearingSemantics()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->isClearingSemantics:Z

    return v0
.end method

.method public final setClearingSemantics(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->isClearingSemantics:Z

    return-void
.end method

.method public final setMergeDescendants(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->mergeDescendants:Z

    return-void
.end method

.method public final setProperties(Lv3/l;)V
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
            "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;->properties:Lv3/l;

    return-void
.end method
