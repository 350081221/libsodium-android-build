.class public abstract enum Lcom/android/dx/Comparison;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/Comparison;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/Comparison;

.field public static final enum EQ:Lcom/android/dx/Comparison;

.field public static final enum GE:Lcom/android/dx/Comparison;

.field public static final enum GT:Lcom/android/dx/Comparison;

.field public static final enum LE:Lcom/android/dx/Comparison;

.field public static final enum LT:Lcom/android/dx/Comparison;

.field public static final enum NE:Lcom/android/dx/Comparison;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/android/dx/Comparison$1;

    .line 2
    .line 3
    const-string v1, "LT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/android/dx/Comparison$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/android/dx/Comparison;->LT:Lcom/android/dx/Comparison;

    .line 10
    .line 11
    new-instance v1, Lcom/android/dx/Comparison$2;

    .line 12
    .line 13
    const-string v3, "LE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/android/dx/Comparison$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/android/dx/Comparison;->LE:Lcom/android/dx/Comparison;

    .line 20
    .line 21
    new-instance v3, Lcom/android/dx/Comparison$3;

    .line 22
    .line 23
    const-string v5, "EQ"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/android/dx/Comparison$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/android/dx/Comparison;->EQ:Lcom/android/dx/Comparison;

    .line 30
    .line 31
    new-instance v5, Lcom/android/dx/Comparison$4;

    .line 32
    .line 33
    const-string v7, "GE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/android/dx/Comparison$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/android/dx/Comparison;->GE:Lcom/android/dx/Comparison;

    .line 40
    .line 41
    new-instance v7, Lcom/android/dx/Comparison$5;

    .line 42
    .line 43
    const-string v9, "GT"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lcom/android/dx/Comparison$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lcom/android/dx/Comparison;->GT:Lcom/android/dx/Comparison;

    .line 50
    .line 51
    new-instance v9, Lcom/android/dx/Comparison$6;

    .line 52
    .line 53
    const-string v11, "NE"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lcom/android/dx/Comparison$6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lcom/android/dx/Comparison;->NE:Lcom/android/dx/Comparison;

    .line 60
    .line 61
    const/4 v11, 0x6

    .line 62
    new-array v11, v11, [Lcom/android/dx/Comparison;

    .line 63
    .line 64
    aput-object v0, v11, v2

    .line 65
    .line 66
    aput-object v1, v11, v4

    .line 67
    .line 68
    aput-object v3, v11, v6

    .line 69
    .line 70
    aput-object v5, v11, v8

    .line 71
    .line 72
    aput-object v7, v11, v10

    .line 73
    .line 74
    aput-object v9, v11, v12

    .line 75
    .line 76
    sput-object v11, Lcom/android/dx/Comparison;->$VALUES:[Lcom/android/dx/Comparison;

    .line 77
    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/android/dx/Comparison$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Comparison;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/Comparison;
    .locals 1

    const-class v0, Lcom/android/dx/Comparison;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/android/dx/Comparison;

    return-object p0
.end method

.method public static values()[Lcom/android/dx/Comparison;
    .locals 1

    sget-object v0, Lcom/android/dx/Comparison;->$VALUES:[Lcom/android/dx/Comparison;

    invoke-virtual {v0}, [Lcom/android/dx/Comparison;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/android/dx/Comparison;

    return-object v0
.end method


# virtual methods
.method abstract rop(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/code/Rop;
.end method
