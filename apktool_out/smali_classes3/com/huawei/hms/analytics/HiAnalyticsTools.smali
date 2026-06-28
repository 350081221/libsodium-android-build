.class public Lcom/huawei/hms/analytics/HiAnalyticsTools;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableLog()V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/huawei/hms/analytics/HiAnalyticsTools;->enableLog(I)V

    return-void
.end method

.method public static enableLog(I)V
    .locals 1

    const-string v0, "HiAnalyticsSDK"

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->init(ILjava/lang/String;)V

    return-void
.end method
