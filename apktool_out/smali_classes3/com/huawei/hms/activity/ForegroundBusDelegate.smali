.class public Lcom/huawei/hms/activity/ForegroundBusDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/activity/IBridgeActivityDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/activity/ForegroundBusDelegate$MyAvailableCallBack;
    }
.end annotation


# static fields
.field private static final EXTRA_DELEGATE_NAME:Ljava/lang/String; = "intent.extra.hms.core.DELEGATE_NAME"

.field private static final EXTRA_DELEGATE_VALUE:Ljava/lang/String; = "com.huawei.hms.core.activity.ForegroundBus"

.field public static final HMS_FOREGROUND_REQ_BODY:Ljava/lang/String; = "HMS_FOREGROUND_REQ_BODY"

.field public static final HMS_FOREGROUND_REQ_HEADER:Ljava/lang/String; = "HMS_FOREGROUND_REQ_HEADER"

.field public static final HMS_FOREGROUND_REQ_INNER:Ljava/lang/String; = "HMS_FOREGROUND_REQ_INNER"

.field public static final HMS_FOREGROUND_RESP_HEADER:Ljava/lang/String; = "HMS_FOREGROUND_RESP_HEADER"

.field public static final INNER_PKG_NAME:Ljava/lang/String; = "INNER_PACKAGE_NAME"

.field private static final REQUEST_CODE_BUS:I = 0x693d1

.field private static final TAG:Ljava/lang/String; = "ForegroundBusDelegate"

.field private static final UI_JUMP_ACTIVITY_NAME:Ljava/lang/String; = "com.huawei.hms.core.activity.UiJumpActivity"


# instance fields
.field private foregroundBody:Ljava/lang/String;

.field private foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

.field private innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

.field private isUseInnerHms:Z

.field private mThisWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 10
    .line 11
    return-void
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

.method static synthetic access$100(Lcom/huawei/hms/activity/ForegroundBusDelegate;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->startApkHubActivity()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/hms/activity/ForegroundBusDelegate;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->errorReturn(ILjava/lang/String;)V

    return-void
.end method

.method private biReportRequestEntryForegroundBus()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getMapFromForegroundRequestHeader(Lcom/huawei/hms/common/internal/RequestHeader;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "direction"

    .line 12
    .line 13
    const-string v2, "req"

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/RequestHeader;->getKitSdkVersion()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->versionCodeToName(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "version"

    .line 33
    .line 34
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "HMS_SDK_BASE_ACTIVITY_STARTED"

    .line 56
    .line 57
    invoke-virtual {v1, v2, v3, v0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private biReportRequestEntryStartCore()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getMapFromForegroundRequestHeader(Lcom/huawei/hms/common/internal/RequestHeader;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "direction"

    .line 12
    .line 13
    const-string v2, "req"

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/RequestHeader;->getKitSdkVersion()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->versionCodeToName(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "version"

    .line 33
    .line 34
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "HMS_SDK_BASE_START_CORE_ACTIVITY"

    .line 56
    .line 57
    invoke-virtual {v1, v2, v3, v0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private biReportRequestReturnForegroundBus()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getMapFromForegroundRequestHeader(Lcom/huawei/hms/common/internal/RequestHeader;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "direction"

    .line 16
    .line 17
    const-string v2, "rsp"

    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/RequestHeader;->getKitSdkVersion()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->versionCodeToName(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "version"

    .line 37
    .line 38
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/ResponseHeader;->getStatusCode()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "statusCode"

    .line 54
    .line 55
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/ResponseHeader;->getErrorCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "result"

    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v3, "HMS_SDK_BASE_ACTIVITY_STARTED"

    .line 92
    .line 93
    invoke-virtual {v1, v2, v3, v0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private biReportRequestReturnStartCore()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getMapFromForegroundRequestHeader(Lcom/huawei/hms/common/internal/RequestHeader;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "direction"

    .line 12
    .line 13
    const-string v2, "rsp"

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/RequestHeader;->getKitSdkVersion()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->versionCodeToName(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "version"

    .line 33
    .line 34
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/ResponseHeader;->getStatusCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "statusCode"

    .line 50
    .line 51
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/huawei/hms/common/internal/ResponseHeader;->getErrorCode()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "result"

    .line 65
    .line 66
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v3, "HMS_SDK_BASE_START_CORE_ACTIVITY"

    .line 88
    .line 89
    invoke-virtual {v1, v2, v3, v0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private checkMinVersion()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ForegroundBusDelegate"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "checkMinVersion failed, activity must not be null."

    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->isUseInnerHms:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->startApkHubActivity()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/huawei/hms/utils/Util;->isAvailableLibExist(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 50
    .line 51
    invoke-virtual {v3}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->getApkVersion()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v0, v2, v3}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    const-string v0, "checkMinVersion failed, and no available lib exists."

    .line 62
    .line 63
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->startApkHubActivity()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    new-instance v0, Lcom/huawei/hms/activity/ForegroundBusDelegate$MyAvailableCallBack;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, p0, v1}, Lcom/huawei/hms/activity/ForegroundBusDelegate$MyAvailableCallBack;-><init>(Lcom/huawei/hms/activity/ForegroundBusDelegate;Lcom/huawei/hms/activity/ForegroundBusDelegate$1;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lcom/huawei/hms/adapter/AvailableAdapter;

    .line 78
    .line 79
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->getApkVersion()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-direct {v1, v2}, Lcom/huawei/hms/adapter/AvailableAdapter;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2}, Lcom/huawei/hms/adapter/AvailableAdapter;->isHuaweiMobileServicesAvailable(Landroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Lcom/huawei/hms/activity/ForegroundBusDelegate$MyAvailableCallBack;->onComplete(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    invoke-virtual {v1, v2}, Lcom/huawei/hms/adapter/AvailableAdapter;->isUserResolvableError(I)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v2, v1, v0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->resolution(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    invoke-virtual {v0, v2}, Lcom/huawei/hms/activity/ForegroundBusDelegate$MyAvailableCallBack;->onComplete(I)V

    .line 117
    .line 118
    .line 119
    :goto_0
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private errorReturn(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "ForegroundBusDelegate"

    .line 2
    .line 3
    invoke-static {v0, p2}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->getResponseCallbackKey()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, v1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getResponseCallback(Ljava/lang/String;)Lcom/huawei/hms/activity/internal/BusResponseCallback;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v3, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->mThisWeakRef:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/app/Activity;

    .line 33
    .line 34
    invoke-interface {v1, v3, p1, p2}, Lcom/huawei/hms/activity/internal/BusResponseCallback;->innerError(Landroid/app/Activity;ILjava/lang/String;)Lcom/huawei/hms/activity/internal/BusResponseResult;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setResult(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hms/activity/internal/BusResponseResult;->getCode()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p1}, Lcom/huawei/hms/activity/internal/BusResponseResult;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setResult(I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->finishBridgeActivity()V

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private finishBridgeActivity()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private getActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->mThisWeakRef:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    return-object v0
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

.method private getResponseCallback(Ljava/lang/String;)Lcom/huawei/hms/activity/internal/BusResponseCallback;
    .locals 1

    invoke-static {}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->getInstance()Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/activity/internal/ForegroundBusResponseMgr;->get(Ljava/lang/String;)Lcom/huawei/hms/activity/internal/BusResponseCallback;

    move-result-object p1

    return-object p1
.end method

.method private static resolution(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string v0, "ForegroundBusDelegate"

    .line 4
    .line 5
    const-string v1, "null activity, could not start resolution intent"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, p0, p2}, Lcom/huawei/hms/adapter/AvailableAdapter;->startResolution(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private startApkHubActivity()V
    .locals 6

    .line 1
    const-string v0, "startApkHubActivity"

    .line 2
    .line 3
    const-string v1, "ForegroundBusDelegate"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "startApkHubActivity but activity is null"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-boolean v2, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->isUseInnerHms:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Lcom/huawei/hms/utils/HMSPackageManager;->getHMSPackageNameForMultiService()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_0
    new-instance v3, Landroid/content/Intent;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->getAction()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v4, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundBody:Ljava/lang/String;

    .line 53
    .line 54
    const-string v5, "HMS_FOREGROUND_REQ_BODY"

    .line 55
    .line 56
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_0
    const-string v4, "IllegalArgumentException when startApkHubActivity intent.setPackage"

    .line 64
    .line 65
    invoke-static {v1, v4}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-static {v0}, Lcom/huawei/hms/utils/UIUtil;->isActivityFullscreen(Landroid/app/Activity;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const-string v5, "intent.extra.isfullscreen"

    .line 73
    .line 74
    invoke-virtual {v3, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    const-string v4, "com.huawei.hms.core.activity.UiJumpActivity"

    .line 78
    .line 79
    invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/huawei/hms/common/internal/RequestHeader;->toJson()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v4, "HMS_FOREGROUND_REQ_HEADER"

    .line 89
    .line 90
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    const-string v2, "intent.extra.hms.core.DELEGATE_NAME"

    .line 94
    .line 95
    const-string v4, "com.huawei.hms.core.activity.ForegroundBus"

    .line 96
    .line 97
    invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    :try_start_1
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->biReportRequestEntryStartCore()V

    .line 101
    .line 102
    .line 103
    const v2, 0x693d1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v3, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :catch_1
    move-exception v0

    .line 111
    const-string v2, "Launch sign in Intent failed. hms is probably being updated\uff1a"

    .line 112
    .line 113
    invoke-static {v1, v2, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    const-string v1, "launch bus intent failed"

    .line 118
    .line 119
    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->errorReturn(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    return-void
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private succeedReturn(ILandroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "ForegroundBusDelegate"

    .line 2
    .line 3
    const-string v1, "succeedReturn"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->finishBridgeActivity()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public getRequestCode()I
    .locals 1

    const v0, 0x693d1

    return v0
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->mThisWeakRef:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "HMS_FOREGROUND_REQ_HEADER"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lcom/huawei/hms/common/internal/RequestHeader;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/huawei/hms/common/internal/RequestHeader;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/huawei/hms/common/internal/RequestHeader;->fromJson(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    const-string p1, "header is invalid"

    .line 33
    .line 34
    invoke-direct {p0, v1, p1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->errorReturn(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string v0, "HMS_FOREGROUND_REQ_BODY"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundBody:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const-string p1, "inner header is invalid"

    .line 51
    .line 52
    invoke-direct {p0, v1, p1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->errorReturn(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const-string v2, "HMS_FOREGROUND_REQ_INNER"

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->fromJson(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->foregroundHeader:Lcom/huawei/hms/common/internal/RequestHeader;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/huawei/hms/common/internal/RequestHeader;->getApiName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const-string p1, "action is invalid"

    .line 78
    .line 79
    invoke-direct {p0, v1, p1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->errorReturn(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->biReportRequestEntryForegroundBus()V

    .line 84
    .line 85
    .line 86
    const-string v0, "INNER_PACKAGE_NAME"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_3

    .line 97
    .line 98
    const-string p1, "ForegroundBusDelegate"

    .line 99
    .line 100
    const-string v0, "isUseInnerHms: true"

    .line 101
    .line 102
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x1

    .line 106
    iput-boolean p1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->isUseInnerHms:Z

    .line 107
    .line 108
    :cond_3
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->checkMinVersion()V

    .line 109
    .line 110
    .line 111
    return-void
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public onBridgeActivityDestroy()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->biReportRequestReturnForegroundBus()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->mThisWeakRef:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
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

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 1
    const v0, 0x693d1

    .line 2
    .line 3
    .line 4
    if-ne p1, v0, :cond_3

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const-string p1, "HMS_FOREGROUND_RESP_HEADER"

    .line 9
    .line 10
    invoke-virtual {p3, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/huawei/hms/common/internal/ResponseHeader;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->responseHeader:Lcom/huawei/hms/common/internal/ResponseHeader;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/huawei/hms/utils/JsonUtil;->jsonToEntity(Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->biReportRequestReturnStartCore()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->innerHeader:Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/huawei/hms/activity/internal/ForegroundInnerHeader;->getResponseCallbackKey()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->getResponseCallback(Ljava/lang/String;)Lcom/huawei/hms/activity/internal/BusResponseCallback;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->succeedReturn(ILandroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/activity/ForegroundBusDelegate;->mThisWeakRef:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/app/Activity;

    .line 56
    .line 57
    invoke-interface {p1, v0, p2, p3}, Lcom/huawei/hms/activity/internal/BusResponseCallback;->succeedReturn(Landroid/app/Activity;ILandroid/content/Intent;)Lcom/huawei/hms/activity/internal/BusResponseResult;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    invoke-direct {p0, p2, p3}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->succeedReturn(ILandroid/content/Intent;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hms/activity/internal/BusResponseResult;->getCode()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p1}, Lcom/huawei/hms/activity/internal/BusResponseResult;->getIntent()Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p2, p1}, Lcom/huawei/hms/activity/ForegroundBusDelegate;->succeedReturn(ILandroid/content/Intent;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    const/4 p1, 0x1

    .line 79
    return p1

    .line 80
    :cond_3
    const/4 p1, 0x0

    .line 81
    return p1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public onBridgeConfigurationChanged()V
    .locals 0

    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 0

    return-void
.end method
