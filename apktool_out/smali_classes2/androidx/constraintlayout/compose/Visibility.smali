.class public final Landroidx/constraintlayout/compose/Visibility;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/Visibility$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/Visibility;",
        "",
        "solverValue",
        "",
        "(I)V",
        "getSolverValue$compose_release",
        "()I",
        "Companion",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Landroidx/constraintlayout/compose/Visibility$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Gone:Landroidx/constraintlayout/compose/Visibility;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Invisible:Landroidx/constraintlayout/compose/Visibility;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Visible:Landroidx/constraintlayout/compose/Visibility;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final solverValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/Visibility$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/Visibility$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/Visibility;->Companion:Landroidx/constraintlayout/compose/Visibility$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/compose/Visibility;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/Visibility;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/constraintlayout/compose/Visibility;->Visible:Landroidx/constraintlayout/compose/Visibility;

    .line 16
    .line 17
    new-instance v0, Landroidx/constraintlayout/compose/Visibility;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/Visibility;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Landroidx/constraintlayout/compose/Visibility;->Invisible:Landroidx/constraintlayout/compose/Visibility;

    .line 24
    .line 25
    new-instance v0, Landroidx/constraintlayout/compose/Visibility;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/Visibility;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Landroidx/constraintlayout/compose/Visibility;->Gone:Landroidx/constraintlayout/compose/Visibility;

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
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/constraintlayout/compose/Visibility;->solverValue:I

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
.end method

.method public static final synthetic access$getGone$cp()Landroidx/constraintlayout/compose/Visibility;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/Visibility;->Gone:Landroidx/constraintlayout/compose/Visibility;

    return-object v0
.end method

.method public static final synthetic access$getInvisible$cp()Landroidx/constraintlayout/compose/Visibility;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/Visibility;->Invisible:Landroidx/constraintlayout/compose/Visibility;

    return-object v0
.end method

.method public static final synthetic access$getVisible$cp()Landroidx/constraintlayout/compose/Visibility;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/Visibility;->Visible:Landroidx/constraintlayout/compose/Visibility;

    return-object v0
.end method


# virtual methods
.method public final getSolverValue$compose_release()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/compose/Visibility;->solverValue:I

    return v0
.end method
