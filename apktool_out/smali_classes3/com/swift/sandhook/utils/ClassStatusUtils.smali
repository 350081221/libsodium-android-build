.class public Lcom/swift/sandhook/utils/ClassStatusUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static fieldStatusOfClass:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "status"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/swift/sandhook/utils/ClassStatusUtils;->fieldStatusOfClass:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getClassStatus(Ljava/lang/Class;Z)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    sget-object v1, Lcom/swift/sandhook/utils/ClassStatusUtils;->fieldStatusOfClass:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    :catchall_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, Lcom/swift/sandhook/utils/ClassStatusUtils;->toUnsignedLong(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    const/16 v0, 0x1c

    .line 18
    .line 19
    shr-long/2addr p0, v0

    .line 20
    long-to-int v0, p0

    .line 21
    :cond_1
    return v0
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
.end method

.method public static isInitialized(Ljava/lang/Class;)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/swift/sandhook/utils/ClassStatusUtils;->fieldStatusOfClass:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x1c

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-lt v0, v2, :cond_2

    .line 13
    .line 14
    invoke-static {p0, v1}, Lcom/swift/sandhook/utils/ClassStatusUtils;->getClassStatus(Ljava/lang/Class;Z)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/16 v0, 0xe

    .line 19
    .line 20
    if-lt p0, v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v1, v3

    .line 24
    :goto_0
    return v1

    .line 25
    :cond_2
    sget v0, Lcom/swift/sandhook/SandHookConfig;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x1b

    .line 28
    .line 29
    if-ne v0, v2, :cond_4

    .line 30
    .line 31
    invoke-static {p0, v3}, Lcom/swift/sandhook/utils/ClassStatusUtils;->getClassStatus(Ljava/lang/Class;Z)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/16 v0, 0xb

    .line 36
    .line 37
    if-ne p0, v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v1, v3

    .line 41
    :goto_1
    return v1

    .line 42
    :cond_4
    invoke-static {p0, v3}, Lcom/swift/sandhook/utils/ClassStatusUtils;->getClassStatus(Ljava/lang/Class;Z)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    if-ne p0, v0, :cond_5

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_5
    move v1, v3

    .line 52
    :goto_2
    return v1
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
.end method

.method public static isStaticAndNoInited(Ljava/lang/reflect/Member;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Lcom/swift/sandhook/utils/ClassStatusUtils;->isInitialized(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    :cond_1
    return v1
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
.end method

.method public static toUnsignedLong(I)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method
