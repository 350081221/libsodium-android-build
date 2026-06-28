.class public Lcom/huawei/hms/analytics/HiAnalytics;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final klm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final lmn:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "SG"

    const-string v1, "RU"

    const-string v2, "CN"

    const-string v3, "DE"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/HiAnalytics;->lmn:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/HiAnalytics;->klm:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance(Landroid/app/Activity;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 0

    invoke-static {p0}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 0

    invoke-static {p0}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 3

    if-eqz p1, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalytics;->klm:Ljava/util/List;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "HiAnalyticsSDK"

    const-string p1, "HiAnalytics=> Invalid routePolicy! Initialization failed."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn()Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    move-result-object p0

    return-object p0
.end method
