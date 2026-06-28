.class public Lcom/swift/sandhook/SandHookConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile DEBUG:Z

.field public static volatile SDK_INT:I

.field public static volatile compiler:Z

.field public static volatile curUser:I

.field public static volatile delayHook:Z

.field public static volatile initClassLoader:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/swift/sandhook/SandHookConfig;->getSdkInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    sput-boolean v0, Lcom/swift/sandhook/SandHookConfig;->DEBUG:Z

    .line 9
    .line 10
    sget v1, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    move v1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v0

    .line 20
    :goto_0
    sput-boolean v1, Lcom/swift/sandhook/SandHookConfig;->compiler:Z

    .line 21
    .line 22
    sput v0, Lcom/swift/sandhook/SandHookConfig;->curUser:I

    .line 23
    .line 24
    sput-boolean v3, Lcom/swift/sandhook/SandHookConfig;->delayHook:Z

    .line 25
    .line 26
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSdkInt()I
    .locals 1

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0

    .line 10
    :catchall_0
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    return v0
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
.end method
