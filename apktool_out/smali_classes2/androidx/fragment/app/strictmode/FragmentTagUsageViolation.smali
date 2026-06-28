.class public final Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;
.super Landroidx/fragment/app/strictmode/Violation;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;",
        "Landroidx/fragment/app/strictmode/Violation;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "parentContainer",
        "Landroid/view/ViewGroup;",
        "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V",
        "getParentContainer",
        "()Landroid/view/ViewGroup;",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final parentContainer:Landroid/view/ViewGroup;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Attempting to use <fragment> tag to add fragment "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " to container "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;->parentContainer:Landroid/view/ViewGroup;

    .line 35
    .line 36
    return-void
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
.method public final getParentContainer()Landroid/view/ViewGroup;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;->parentContainer:Landroid/view/ViewGroup;

    return-object v0
.end method
