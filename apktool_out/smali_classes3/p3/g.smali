.class public final enum Lp3/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp3/g;",
        ">;"
    }
.end annotation

.annotation build Lkotlin/g1;
    version = "1.3"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/contracts/InvocationKind;",
        "",
        "(Ljava/lang/String;I)V",
        "AT_MOST_ONCE",
        "AT_LEAST_ONCE",
        "EXACTLY_ONCE",
        "UNKNOWN",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/internal/b;
.end annotation

.annotation build Lp3/f;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/a;

.field private static final synthetic $VALUES:[Lp3/g;

.field public static final enum AT_LEAST_ONCE:Lp3/g;
    .annotation build Lkotlin/internal/b;
    .end annotation
.end field

.field public static final enum AT_MOST_ONCE:Lp3/g;
    .annotation build Lkotlin/internal/b;
    .end annotation
.end field

.field public static final enum EXACTLY_ONCE:Lp3/g;
    .annotation build Lkotlin/internal/b;
    .end annotation
.end field

.field public static final enum UNKNOWN:Lp3/g;
    .annotation build Lkotlin/internal/b;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lp3/g;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lp3/g;

    const/4 v1, 0x0

    sget-object v2, Lp3/g;->AT_MOST_ONCE:Lp3/g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lp3/g;->AT_LEAST_ONCE:Lp3/g;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lp3/g;->EXACTLY_ONCE:Lp3/g;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lp3/g;->UNKNOWN:Lp3/g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lp3/g;

    .line 2
    .line 3
    const-string v1, "AT_MOST_ONCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lp3/g;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lp3/g;->AT_MOST_ONCE:Lp3/g;

    .line 10
    .line 11
    new-instance v0, Lp3/g;

    .line 12
    .line 13
    const-string v1, "AT_LEAST_ONCE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lp3/g;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lp3/g;->AT_LEAST_ONCE:Lp3/g;

    .line 20
    .line 21
    new-instance v0, Lp3/g;

    .line 22
    .line 23
    const-string v1, "EXACTLY_ONCE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lp3/g;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lp3/g;->EXACTLY_ONCE:Lp3/g;

    .line 30
    .line 31
    new-instance v0, Lp3/g;

    .line 32
    .line 33
    const-string v1, "UNKNOWN"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lp3/g;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lp3/g;->UNKNOWN:Lp3/g;

    .line 40
    .line 41
    invoke-static {}, Lp3/g;->$values()[Lp3/g;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lp3/g;->$VALUES:[Lp3/g;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/b;->b([Ljava/lang/Enum;)Lkotlin/enums/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lp3/g;->$ENTRIES:Lkotlin/enums/a;

    .line 52
    .line 53
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/a<",
            "Lp3/g;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lp3/g;->$ENTRIES:Lkotlin/enums/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lp3/g;
    .locals 1

    const-class v0, Lp3/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp3/g;

    return-object p0
.end method

.method public static values()[Lp3/g;
    .locals 1

    sget-object v0, Lp3/g;->$VALUES:[Lp3/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp3/g;

    return-object v0
.end method
