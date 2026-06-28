.class Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/color/ColorResourcesTableCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ColorResource"
.end annotation


# instance fields
.field private final entryId:S

.field private final name:Ljava/lang/String;

.field private final packageId:B

.field private final typeId:B

.field private final value:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->value:I

    .line 7
    .line 8
    const p2, 0xffff

    .line 9
    .line 10
    .line 11
    and-int/2addr p2, p1

    .line 12
    int-to-short p2, p2

    .line 13
    iput-short p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->entryId:S

    .line 14
    .line 15
    shr-int/lit8 p2, p1, 0x10

    .line 16
    .line 17
    and-int/lit16 p2, p2, 0xff

    .line 18
    .line 19
    int-to-byte p2, p2

    .line 20
    iput-byte p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->typeId:B

    .line 21
    .line 22
    shr-int/lit8 p1, p1, 0x18

    .line 23
    .line 24
    and-int/lit16 p1, p1, 0xff

    .line 25
    .line 26
    int-to-byte p1, p1

    .line 27
    iput-byte p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->packageId:B

    .line 28
    .line 29
    return-void
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
    .line 112
    .line 113
    .line 114
.end method

.method static synthetic access$000(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)S
    .locals 0

    iget-short p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->entryId:S

    return p0
.end method

.method static synthetic access$100(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)I
    .locals 0

    iget p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->value:I

    return p0
.end method

.method static synthetic access$200(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)B
    .locals 0

    iget-byte p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->typeId:B

    return p0
.end method

.method static synthetic access$300(Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;)B
    .locals 0

    iget-byte p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ColorResource;->packageId:B

    return p0
.end method
