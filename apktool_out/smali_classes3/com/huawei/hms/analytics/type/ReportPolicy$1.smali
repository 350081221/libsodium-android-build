.class final synthetic Lcom/huawei/hms/analytics/type/ReportPolicy$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/type/ReportPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic lmn:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/type/ReportPolicy;->values()[Lcom/huawei/hms/analytics/type/ReportPolicy;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/huawei/hms/analytics/type/ReportPolicy$1;->lmn:[I

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_CACHE_THRESHOLD_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/huawei/hms/analytics/type/ReportPolicy$1;->lmn:[I

    sget-object v1, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_SCHEDULED_TIME_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
