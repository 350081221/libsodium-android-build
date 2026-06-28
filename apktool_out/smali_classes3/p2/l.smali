.class public final synthetic Lp2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/telephony/CellIdentityWcdma;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/telephony/CellIdentityWcdma;->getMncString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
