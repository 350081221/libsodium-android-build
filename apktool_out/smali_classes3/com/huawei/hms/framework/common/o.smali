.class public final synthetic Lcom/huawei/hms/framework/common/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/telephony/TelephonyManager;)Landroid/telephony/SignalStrength;
    .locals 0

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSignalStrength()Landroid/telephony/SignalStrength;

    move-result-object p0

    return-object p0
.end method
