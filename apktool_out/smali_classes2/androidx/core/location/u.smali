.class public final synthetic Landroidx/core/location/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/location/LocationManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/location/LocationManager;->getGnssHardwareModelName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
