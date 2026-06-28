.class public final enum Lcom/huawei/hms/analytics/type/ReportPolicy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/huawei/hms/analytics/type/ReportPolicy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/hms/analytics/type/ReportPolicy;

.field public static final enum ON_APP_LAUNCH_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

.field public static final enum ON_CACHE_THRESHOLD_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

.field public static final enum ON_MOVE_BACKGROUND_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

.field public static final enum ON_SCHEDULED_TIME_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;


# instance fields
.field private threshold:J


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/huawei/hms/analytics/type/ReportPolicy;

    const-wide/16 v1, 0x3c

    const-string v3, "ON_SCHEDULED_TIME_POLICY"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/huawei/hms/analytics/type/ReportPolicy;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_SCHEDULED_TIME_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    new-instance v1, Lcom/huawei/hms/analytics/type/ReportPolicy;

    const-string v2, "ON_APP_LAUNCH_POLICY"

    const/4 v3, 0x1

    const-wide/16 v5, -0x1

    invoke-direct {v1, v2, v3, v5, v6}, Lcom/huawei/hms/analytics/type/ReportPolicy;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_APP_LAUNCH_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    new-instance v2, Lcom/huawei/hms/analytics/type/ReportPolicy;

    const-string v7, "ON_MOVE_BACKGROUND_POLICY"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v6}, Lcom/huawei/hms/analytics/type/ReportPolicy;-><init>(Ljava/lang/String;IJ)V

    sput-object v2, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_MOVE_BACKGROUND_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    new-instance v5, Lcom/huawei/hms/analytics/type/ReportPolicy;

    const-wide/16 v6, 0x1e

    const-string v9, "ON_CACHE_THRESHOLD_POLICY"

    const/4 v10, 0x3

    invoke-direct {v5, v9, v10, v6, v7}, Lcom/huawei/hms/analytics/type/ReportPolicy;-><init>(Ljava/lang/String;IJ)V

    sput-object v5, Lcom/huawei/hms/analytics/type/ReportPolicy;->ON_CACHE_THRESHOLD_POLICY:Lcom/huawei/hms/analytics/type/ReportPolicy;

    const/4 v6, 0x4

    new-array v6, v6, [Lcom/huawei/hms/analytics/type/ReportPolicy;

    aput-object v0, v6, v4

    aput-object v1, v6, v3

    aput-object v2, v6, v8

    aput-object v5, v6, v10

    sput-object v6, Lcom/huawei/hms/analytics/type/ReportPolicy;->$VALUES:[Lcom/huawei/hms/analytics/type/ReportPolicy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/huawei/hms/analytics/type/ReportPolicy;->threshold:J

    return-void
.end method

.method private checkThreshold(J)J
    .locals 4

    sget-object v0, Lcom/huawei/hms/analytics/type/ReportPolicy$1;->lmn:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "PolicyToolsKit"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    const-wide/16 v0, 0x708

    cmp-long v3, p1, v0

    if-lez v3, :cond_1

    const-string p1, "The auto-reporting period is too long.Use the default value."

    :goto_0
    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    move-wide p1, v0

    goto :goto_3

    :cond_1
    const-wide/16 v0, 0x3c

    cmp-long v3, p1, v0

    if-gez v3, :cond_4

    const-string p1, "The auto-reporting period is too short. Use the default value."

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3e8

    cmp-long v3, p1, v0

    if-lez v3, :cond_3

    const-string p1, "The number of automatically reported thresholds is too large. Use the maximum  default value."

    :goto_2
    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-wide/16 v0, 0x1e

    cmp-long v3, p1, v0

    if-gez v3, :cond_4

    const-string p1, "The number of automatically reported thresholds is too small. Use the minimum  default value."

    goto :goto_2

    :cond_4
    :goto_3
    return-wide p1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hms/analytics/type/ReportPolicy;
    .locals 1

    const-class v0, Lcom/huawei/hms/analytics/type/ReportPolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/huawei/hms/analytics/type/ReportPolicy;

    return-object p0
.end method

.method public static values()[Lcom/huawei/hms/analytics/type/ReportPolicy;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/type/ReportPolicy;->$VALUES:[Lcom/huawei/hms/analytics/type/ReportPolicy;

    invoke-virtual {v0}, [Lcom/huawei/hms/analytics/type/ReportPolicy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hms/analytics/type/ReportPolicy;

    return-object v0
.end method


# virtual methods
.method public final getThreshold()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hms/analytics/type/ReportPolicy;->threshold:J

    return-wide v0
.end method

.method public final setThreshold(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/type/ReportPolicy;->checkThreshold(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/huawei/hms/analytics/type/ReportPolicy;->threshold:J

    return-void
.end method
