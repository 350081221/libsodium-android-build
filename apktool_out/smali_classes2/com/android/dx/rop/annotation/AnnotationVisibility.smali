.class public final enum Lcom/android/dx/rop/annotation/AnnotationVisibility;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/rop/annotation/AnnotationVisibility;",
        ">;",
        "Lcom/android/dx/util/ToHuman;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

.field public static final enum SYSTEM:Lcom/android/dx/rop/annotation/AnnotationVisibility;


# instance fields
.field private final human:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 2
    .line 3
    const-string v1, "runtime"

    .line 4
    .line 5
    const-string v2, "RUNTIME"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 12
    .line 13
    new-instance v1, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 14
    .line 15
    const-string v2, "build"

    .line 16
    .line 17
    const-string v4, "BUILD"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/android/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 24
    .line 25
    new-instance v2, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 26
    .line 27
    const-string v4, "system"

    .line 28
    .line 29
    const-string v6, "SYSTEM"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lcom/android/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 36
    .line 37
    new-instance v4, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 38
    .line 39
    const-string v6, "embedded"

    .line 40
    .line 41
    const-string v8, "EMBEDDED"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lcom/android/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lcom/android/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 48
    .line 49
    const/4 v6, 0x4

    .line 50
    new-array v6, v6, [Lcom/android/dx/rop/annotation/AnnotationVisibility;

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
    sput-object v6, Lcom/android/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

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
    iput-object p3, p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

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

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    const-class v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;

    return-object p0
.end method

.method public static values()[Lcom/android/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    sget-object v0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/android/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v0}, [Lcom/android/dx/rop/annotation/AnnotationVisibility;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/android/dx/rop/annotation/AnnotationVisibility;

    return-object v0
.end method


# virtual methods
.method public toHuman()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

    return-object v0
.end method
