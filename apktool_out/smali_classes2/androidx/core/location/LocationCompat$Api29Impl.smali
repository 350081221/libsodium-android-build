.class Landroidx/core/location/LocationCompat$Api29Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1d
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/LocationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Api29Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static removeBearingAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/location/i;->a(Landroid/location/Location;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Landroidx/core/location/n;->a(Landroid/location/Location;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {p0}, Landroidx/core/location/LocationCompat$Api28Impl;->removeBearingAccuracy(Landroid/location/Location;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Landroidx/core/location/o;->a(Landroid/location/Location;D)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static removeSpeedAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/location/k;->a(Landroid/location/Location;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Landroidx/core/location/n;->a(Landroid/location/Location;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {p0}, Landroidx/core/location/LocationCompat$Api28Impl;->removeSpeedAccuracy(Landroid/location/Location;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Landroidx/core/location/o;->a(Landroid/location/Location;D)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static removeVerticalAccuracy(Landroid/location/Location;)V
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/location/h;->a(Landroid/location/Location;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Landroidx/core/location/n;->a(Landroid/location/Location;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {p0}, Landroidx/core/location/LocationCompat$Api28Impl;->removeVerticalAccuracy(Landroid/location/Location;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0, v1}, Landroidx/core/location/o;->a(Landroid/location/Location;D)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
