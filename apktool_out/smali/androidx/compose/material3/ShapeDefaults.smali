.class public final Landroidx/compose/material3/ShapeDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/material3/ShapeDefaults;",
        "",
        "()V",
        "ExtraLarge",
        "Landroidx/compose/foundation/shape/CornerBasedShape;",
        "getExtraLarge",
        "()Landroidx/compose/foundation/shape/CornerBasedShape;",
        "ExtraSmall",
        "getExtraSmall",
        "Large",
        "getLarge",
        "Medium",
        "getMedium",
        "Small",
        "getSmall",
        "material3_release"
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

.field private static final ExtraLarge:Landroidx/compose/foundation/shape/CornerBasedShape;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ExtraSmall:Landroidx/compose/foundation/shape/CornerBasedShape;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final INSTANCE:Landroidx/compose/material3/ShapeDefaults;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Large:Landroidx/compose/foundation/shape/CornerBasedShape;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Medium:Landroidx/compose/foundation/shape/CornerBasedShape;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Small:Landroidx/compose/foundation/shape/CornerBasedShape;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/material3/ShapeDefaults;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/material3/ShapeDefaults;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/material3/ShapeDefaults;->INSTANCE:Landroidx/compose/material3/ShapeDefaults;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material3/tokens/ShapeTokens;->INSTANCE:Landroidx/compose/material3/tokens/ShapeTokens;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ShapeTokens;->getCornerExtraSmall()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Landroidx/compose/material3/ShapeDefaults;->ExtraSmall:Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ShapeTokens;->getCornerSmall()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Landroidx/compose/material3/ShapeDefaults;->Small:Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ShapeTokens;->getCornerMedium()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Landroidx/compose/material3/ShapeDefaults;->Medium:Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ShapeTokens;->getCornerLarge()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Landroidx/compose/material3/ShapeDefaults;->Large:Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ShapeTokens;->getCornerExtraLarge()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Landroidx/compose/material3/ShapeDefaults;->ExtraLarge:Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 39
    .line 40
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getExtraLarge()Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/ShapeDefaults;->ExtraLarge:Landroidx/compose/foundation/shape/CornerBasedShape;

    return-object v0
.end method

.method public final getExtraSmall()Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/ShapeDefaults;->ExtraSmall:Landroidx/compose/foundation/shape/CornerBasedShape;

    return-object v0
.end method

.method public final getLarge()Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/ShapeDefaults;->Large:Landroidx/compose/foundation/shape/CornerBasedShape;

    return-object v0
.end method

.method public final getMedium()Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/ShapeDefaults;->Medium:Landroidx/compose/foundation/shape/CornerBasedShape;

    return-object v0
.end method

.method public final getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/ShapeDefaults;->Small:Landroidx/compose/foundation/shape/CornerBasedShape;

    return-object v0
.end method
