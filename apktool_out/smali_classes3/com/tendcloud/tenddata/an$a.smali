.class public final enum Lcom/tendcloud/tenddata/an$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/an;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tendcloud/tenddata/an$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tendcloud/tenddata/an$a;

.field public static final enum EMPTY:Lcom/tendcloud/tenddata/an$a;

.field public static final enum FORM:Lcom/tendcloud/tenddata/an$a;

.field public static final enum JSON:Lcom/tendcloud/tenddata/an$a;

.field public static final enum UNIVERSAL_STREAM:Lcom/tendcloud/tenddata/an$a;


# instance fields
.field private name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/an$a;

    .line 2
    .line 3
    const-string v1, "application/octet-stream"

    .line 4
    .line 5
    const-string v2, "UNIVERSAL_STREAM"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/tendcloud/tenddata/an$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/tendcloud/tenddata/an$a;->UNIVERSAL_STREAM:Lcom/tendcloud/tenddata/an$a;

    .line 12
    .line 13
    new-instance v1, Lcom/tendcloud/tenddata/an$a;

    .line 14
    .line 15
    const-string v2, "application/json"

    .line 16
    .line 17
    const-string v4, "JSON"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lcom/tendcloud/tenddata/an$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/tendcloud/tenddata/an$a;->JSON:Lcom/tendcloud/tenddata/an$a;

    .line 24
    .line 25
    new-instance v2, Lcom/tendcloud/tenddata/an$a;

    .line 26
    .line 27
    const-string v4, "application/x-www-form-urlencoded"

    .line 28
    .line 29
    const-string v6, "FORM"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lcom/tendcloud/tenddata/an$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lcom/tendcloud/tenddata/an$a;->FORM:Lcom/tendcloud/tenddata/an$a;

    .line 36
    .line 37
    new-instance v4, Lcom/tendcloud/tenddata/an$a;

    .line 38
    .line 39
    const-string v6, ""

    .line 40
    .line 41
    const-string v8, "EMPTY"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lcom/tendcloud/tenddata/an$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lcom/tendcloud/tenddata/an$a;->EMPTY:Lcom/tendcloud/tenddata/an$a;

    .line 48
    .line 49
    const/4 v6, 0x4

    .line 50
    new-array v6, v6, [Lcom/tendcloud/tenddata/an$a;

    .line 51
    .line 52
    aput-object v0, v6, v3

    .line 53
    .line 54
    aput-object v1, v6, v5

    .line 55
    .line 56
    aput-object v2, v6, v7

    .line 57
    .line 58
    aput-object v4, v6, v9

    .line 59
    .line 60
    sput-object v6, Lcom/tendcloud/tenddata/an$a;->$VALUES:[Lcom/tendcloud/tenddata/an$a;

    .line 61
    .line 62
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/tendcloud/tenddata/an$a;->name:Ljava/lang/String;

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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tendcloud/tenddata/an$a;
    .locals 1

    const-class v0, Lcom/tendcloud/tenddata/an$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tendcloud/tenddata/an$a;

    return-object p0
.end method

.method public static values()[Lcom/tendcloud/tenddata/an$a;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/an$a;->$VALUES:[Lcom/tendcloud/tenddata/an$a;

    invoke-virtual {v0}, [Lcom/tendcloud/tenddata/an$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tendcloud/tenddata/an$a;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tendcloud/tenddata/an$a;->name:Ljava/lang/String;

    return-object v0
.end method
