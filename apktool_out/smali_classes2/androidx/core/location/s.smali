.class public final synthetic Landroidx/core/location/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/location/LocationManager;)I
    .locals 0

    invoke-virtual {p0}, Landroid/location/LocationManager;->getGnssYearOfHardware()I

    move-result p0

    return p0
.end method
