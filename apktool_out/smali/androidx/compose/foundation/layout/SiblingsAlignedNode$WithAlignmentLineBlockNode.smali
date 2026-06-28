.class public final Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;
.super Landroidx/compose/foundation/layout/SiblingsAlignedNode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/layout/SiblingsAlignedNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WithAlignmentLineBlockNode"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;",
        "Landroidx/compose/foundation/layout/SiblingsAlignedNode;",
        "Landroidx/compose/ui/unit/Density;",
        "",
        "parentData",
        "modifyParentData",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Measured;",
        "",
        "block",
        "Lv3/l;",
        "getBlock",
        "()Lv3/l;",
        "setBlock",
        "(Lv3/l;)V",
        "<init>",
        "foundation-layout_release"
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
.field private block:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/Measured;",
            "Ljava/lang/Integer;",
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
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/Measured;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/SiblingsAlignedNode;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;->block:Lv3/l;

    .line 6
    .line 7
    return-void
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
.method public final getBlock()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/layout/Measured;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;->block:Lv3/l;

    return-object v0
.end method

.method public modifyParentData(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    instance-of p1, p2, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    new-instance p2, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x7

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v0, p2

    .line 19
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/RowColumnParentData;-><init>(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;ILkotlin/jvm/internal/w;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    sget-object p1, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 23
    .line 24
    new-instance v0, Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;->block:Lv3/l;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;-><init>(Lv3/l;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->Relative$foundation_layout_release(Landroidx/compose/foundation/layout/AlignmentLineProvider;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p2, p1}, Landroidx/compose/foundation/layout/RowColumnParentData;->setCrossAxisAlignment(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V

    .line 36
    .line 37
    .line 38
    return-object p2
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
.end method

.method public final setBlock(Lv3/l;)V
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
            "Landroidx/compose/ui/layout/Measured;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;->block:Lv3/l;

    return-void
.end method
