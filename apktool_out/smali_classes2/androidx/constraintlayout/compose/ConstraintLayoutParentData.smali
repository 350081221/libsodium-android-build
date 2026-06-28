.class final Landroidx/constraintlayout/compose/ConstraintLayoutParentData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/LayoutIdParentData;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0003\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR(\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\u0008\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;",
        "Landroidx/compose/ui/layout/LayoutIdParentData;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "ref",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "getRef",
        "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/compose/ConstrainScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "constrain",
        "Lv3/l;",
        "getConstrain",
        "()Lv3/l;",
        "layoutId",
        "Ljava/lang/Object;",
        "getLayoutId",
        "()Ljava/lang/Object;",
        "<init>",
        "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)V",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private final constrain:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final layoutId:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
            "Lv3/l<",
            "-",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "ref"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constrain"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->constrain:Lv3/l;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->layoutId:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast p1, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;

    .line 12
    .line 13
    iget-object v1, p1, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->constrain:Lv3/l;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->constrain:Lv3/l;

    .line 28
    .line 29
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    :goto_0
    return p1
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
.end method

.method public final getConstrain()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->constrain:Lv3/l;

    return-object v0
.end method

.method public getLayoutId()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->layoutId:Ljava/lang/Object;

    return-object v0
.end method

.method public final getRef()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->ref:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    invoke-virtual {v0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutParentData;->constrain:Lv3/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
