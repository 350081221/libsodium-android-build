.class public final synthetic Lcom/tendcloud/tenddata/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/telephony/TelephonyManager;->getMeid(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
