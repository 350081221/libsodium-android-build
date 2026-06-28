.class Landroidx/core/location/LocationCompat$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/LocationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Api26Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getBearingAccuracyDegrees(Landroid/location/Location;)F
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/j;->a(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method static getSpeedAccuracyMetersPerSecond(Landroid/location/Location;)F
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/e;->a(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method static getVerticalAccuracyMeters(Landroid/location/Location;)F
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/m;->a(Landroid/location/Location;)F

    move-result p0

    return p0
.end method

.method static hasBearingAccuracy(Landroid/location/Location;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/i;->a(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method static hasSpeedAccuracy(Landroid/location/Location;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/k;->a(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method static hasVerticalAccuracy(Landroid/location/Location;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/location/h;->a(Landroid/location/Location;)Z

    move-result p0

    return p0
.end method

.method static removeBearingAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getByte(Ljava/lang/Object;)B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {}, Landroidx/core/location/LocationCompat;->getHasBearingAccuracyMask()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    not-int v1, v1

    .line 14
    and-int/2addr v0, v1

    .line 15
    int-to-byte v0, v0

    .line 16
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Field;->setByte(Ljava/lang/Object;B)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance v0, Ljava/lang/IllegalAccessError;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/IllegalAccessError;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_1
    move-exception p0

    .line 35
    new-instance v0, Ljava/lang/NoSuchFieldError;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/NoSuchFieldError;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    throw v0
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
.end method

.method static removeSpeedAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getByte(Ljava/lang/Object;)B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {}, Landroidx/core/location/LocationCompat;->getHasSpeedAccuracyMask()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    not-int v1, v1

    .line 14
    and-int/2addr v0, v1

    .line 15
    int-to-byte v0, v0

    .line 16
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Field;->setByte(Ljava/lang/Object;B)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance v0, Ljava/lang/IllegalAccessError;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/IllegalAccessError;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_1
    move-exception p0

    .line 35
    new-instance v0, Ljava/lang/NoSuchFieldError;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/NoSuchFieldError;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    throw v0
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
.end method

.method static removeVerticalAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getByte(Ljava/lang/Object;)B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {}, Landroidx/core/location/LocationCompat;->getHasVerticalAccuracyMask()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    not-int v1, v1

    .line 14
    and-int/2addr v0, v1

    .line 15
    int-to-byte v0, v0

    .line 16
    invoke-static {}, Landroidx/core/location/LocationCompat;->getFieldsMaskField()Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Field;->setByte(Ljava/lang/Object;B)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p0

    .line 25
    goto :goto_0

    .line 26
    :catch_1
    move-exception p0

    .line 27
    :goto_0
    new-instance v0, Ljava/lang/IllegalAccessError;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/IllegalAccessError;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    throw v0
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
.end method

.method static setBearingAccuracyDegrees(Landroid/location/Location;F)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/location/l;->a(Landroid/location/Location;F)V

    return-void
.end method

.method static setSpeedAccuracyMetersPerSecond(Landroid/location/Location;F)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/location/f;->a(Landroid/location/Location;F)V

    return-void
.end method

.method static setVerticalAccuracyMeters(Landroid/location/Location;F)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/location/g;->a(Landroid/location/Location;F)V

    return-void
.end method
