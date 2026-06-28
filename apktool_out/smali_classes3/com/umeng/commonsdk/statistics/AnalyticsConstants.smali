.class public Lcom/umeng/commonsdk/statistics/AnalyticsConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static APPLOG_URL_LIST:[Ljava/lang/String; = null

.field public static final CFG_FIELD_KEY:Ljava/lang/String; = "cfgfd"

.field public static CHECK_DEVICE:Z = true

.field public static final LOG_TAG:Ljava/lang/String; = "MobclickAgent"

.field public static final OS:Ljava/lang/String; = "Android"

.field public static final SDK_TYPE:Ljava/lang/String; = "Android"

.field public static SUB_PROCESS_EVENT:Z = false

.field public static final UM_DEBUG:Z

.field public static final ZERO_RESPONSE_FLAG:Ljava/lang/String; = "iscfg"

.field private static commonDeviceType:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lcom/umeng/commonsdk/statistics/UMServerURL;->DEFAULT_URL:Ljava/lang/String;

    .line 6
    .line 7
    aput-object v2, v0, v1

    .line 8
    .line 9
    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->SECONDARY_URL:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sput-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->APPLOG_URL_LIST:[Ljava/lang/String;

    .line 15
    .line 16
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/ULog;->DEBUG:Z

    .line 17
    .line 18
    sput-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    .line 19
    .line 20
    sput v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->commonDeviceType:I

    .line 21
    .line 22
    return-void
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized getDeviceType()I
    .locals 2

    .line 1
    const-class v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->commonDeviceType:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static setDeviceType(I)V
    .locals 0

    sput p0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->commonDeviceType:I

    return-void
.end method
