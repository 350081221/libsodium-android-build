.class public final Landroidx/compose/foundation/layout/FlowColumnScopeInstance;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/layout/ColumnScope;
.implements Landroidx/compose/foundation/layout/FlowColumnScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J!\u0010\u0008\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0097\u0001J\u0015\u0010\u0008\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0097\u0001J!\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012H\u0097\u0001\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/FlowColumnScopeInstance;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/foundation/layout/FlowColumnScope;",
        "()V",
        "align",
        "Landroidx/compose/ui/Modifier;",
        "alignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "alignBy",
        "alignmentLineBlock",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Measured;",
        "",
        "alignmentLine",
        "Landroidx/compose/ui/layout/VerticalAlignmentLine;",
        "weight",
        "",
        "fill",
        "",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/foundation/layout/FlowColumnScopeInstance;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/FlowColumnScopeInstance;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

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
.end method


# virtual methods
.method public align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Alignment$Horizontal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/VerticalAlignmentLine;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignBy(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/Measured;",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowColumnScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
