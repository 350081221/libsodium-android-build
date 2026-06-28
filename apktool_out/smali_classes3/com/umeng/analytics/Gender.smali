.class public enum Lcom/umeng/analytics/Gender;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/umeng/analytics/Gender;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Female:Lcom/umeng/analytics/Gender;

.field public static final enum Male:Lcom/umeng/analytics/Gender;

.field public static final enum Unknown:Lcom/umeng/analytics/Gender;

.field private static final synthetic a:[Lcom/umeng/analytics/Gender;


# instance fields
.field public value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/umeng/analytics/Gender$1;

    .line 2
    .line 3
    const-string v1, "Male"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/umeng/analytics/Gender$1;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/umeng/analytics/Gender;->Male:Lcom/umeng/analytics/Gender;

    .line 11
    .line 12
    new-instance v1, Lcom/umeng/analytics/Gender$2;

    .line 13
    .line 14
    const-string v4, "Female"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, Lcom/umeng/analytics/Gender$2;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/umeng/analytics/Gender;->Female:Lcom/umeng/analytics/Gender;

    .line 21
    .line 22
    new-instance v4, Lcom/umeng/analytics/Gender$3;

    .line 23
    .line 24
    const-string v6, "Unknown"

    .line 25
    .line 26
    invoke-direct {v4, v6, v5, v2}, Lcom/umeng/analytics/Gender$3;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lcom/umeng/analytics/Gender;->Unknown:Lcom/umeng/analytics/Gender;

    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    new-array v6, v6, [Lcom/umeng/analytics/Gender;

    .line 33
    .line 34
    aput-object v0, v6, v2

    .line 35
    .line 36
    aput-object v1, v6, v3

    .line 37
    .line 38
    aput-object v4, v6, v5

    .line 39
    .line 40
    sput-object v6, Lcom/umeng/analytics/Gender;->a:[Lcom/umeng/analytics/Gender;

    .line 41
    .line 42
    return-void
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

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput p3, p0, Lcom/umeng/analytics/Gender;->value:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IILcom/umeng/analytics/Gender$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/umeng/analytics/Gender;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public static getGender(I)Lcom/umeng/analytics/Gender;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/umeng/analytics/Gender;->Unknown:Lcom/umeng/analytics/Gender;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lcom/umeng/analytics/Gender;->Female:Lcom/umeng/analytics/Gender;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    sget-object p0, Lcom/umeng/analytics/Gender;->Male:Lcom/umeng/analytics/Gender;

    .line 14
    .line 15
    :goto_0
    return-object p0
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
.end method

.method public static transGender(Lcom/umeng/analytics/Gender;)Lcom/umeng/commonsdk/statistics/proto/Gender;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/Gender$4;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/Gender;->UNKNOWN:Lcom/umeng/commonsdk/statistics/proto/Gender;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/Gender;->FEMALE:Lcom/umeng/commonsdk/statistics/proto/Gender;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/Gender;->MALE:Lcom/umeng/commonsdk/statistics/proto/Gender;

    .line 22
    .line 23
    return-object p0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/umeng/analytics/Gender;
    .locals 1

    const-class v0, Lcom/umeng/analytics/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/umeng/analytics/Gender;

    return-object p0
.end method

.method public static values()[Lcom/umeng/analytics/Gender;
    .locals 1

    sget-object v0, Lcom/umeng/analytics/Gender;->a:[Lcom/umeng/analytics/Gender;

    invoke-virtual {v0}, [Lcom/umeng/analytics/Gender;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/umeng/analytics/Gender;

    return-object v0
.end method


# virtual methods
.method public value()I
    .locals 1

    iget v0, p0, Lcom/umeng/analytics/Gender;->value:I

    return v0
.end method
