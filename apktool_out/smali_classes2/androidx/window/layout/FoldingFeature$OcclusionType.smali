.class public final Landroidx/window/layout/FoldingFeature$OcclusionType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/FoldingFeature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OcclusionType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/window/layout/FoldingFeature$OcclusionType;",
        "",
        "description",
        "",
        "(Ljava/lang/String;)V",
        "toString",
        "Companion",
        "window_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final FULL:Landroidx/window/layout/FoldingFeature$OcclusionType;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public static final NONE:Landroidx/window/layout/FoldingFeature$OcclusionType;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field


# instance fields
.field private final description:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/window/layout/FoldingFeature$OcclusionType;->Companion:Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 10
    .line 11
    const-string v1, "NONE"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroidx/window/layout/FoldingFeature$OcclusionType;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Landroidx/window/layout/FoldingFeature$OcclusionType;->NONE:Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 17
    .line 18
    new-instance v0, Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 19
    .line 20
    const-string v1, "FULL"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroidx/window/layout/FoldingFeature$OcclusionType;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Landroidx/window/layout/FoldingFeature$OcclusionType;->FULL:Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 26
    .line 27
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/FoldingFeature$OcclusionType;->description:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/layout/FoldingFeature$OcclusionType;->description:Ljava/lang/String;

    return-object v0
.end method
