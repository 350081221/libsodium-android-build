.class public final synthetic Lp2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/telephony/CellIdentityLte;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/telephony/CellIdentityLte;->getMncString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
