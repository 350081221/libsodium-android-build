.class public Lcom/umeng/commonsdk/statistics/internal/StatTracer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/statistics/internal/StatTracer$a;
    }
.end annotation


# static fields
.field private static final KEY_CLIENT_REQUEST_FAILED:Ljava/lang/String; = "failed_requests "

.field private static final KEY_CLIENT_REQUEST_LATENCY:Ljava/lang/String; = "last_request_spent_ms"

.field private static final KEY_CLIENT_REQUEST_SUCCESS:Ljava/lang/String; = "successful_request"

.field private static final KEY_CLIENT_REQUEST_TIME:Ljava/lang/String; = "last_request_time"

.field private static final KEY_FIRST_ACTIVATE_TIME:Ljava/lang/String; = "first_activate_time"

.field private static final KEY_LAST_REQ:Ljava/lang/String; = "last_req"

.field private static mContext:Landroid/content/Context;


# instance fields
.field private final MAX_REQUEST_LIMIT:I

.field private firstActivateTime:J

.field private lastRequestTime:J

.field public mFailedRequest:I

.field private mLastRequestLatency:I

.field public mLastSuccessfulRequestTime:J

.field public mSuccessfulRequest:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x36ee80

    .line 3
    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->MAX_REQUEST_LIMIT:I

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    .line 5
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->firstActivateTime:J

    .line 6
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->init()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/internal/StatTracer$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;-><init>()V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/StatTracer;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "inside StatTracer. please check context. context must not be null!"

    .line 15
    .line 16
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer$a;->a:Lcom/umeng/commonsdk/statistics/internal/StatTracer;

    .line 20
    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private init()V
    .locals 6

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "successful_request"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mSuccessfulRequest:I

    .line 15
    .line 16
    const-string v1, "failed_requests "

    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mFailedRequest:I

    .line 23
    .line 24
    const-string v1, "last_request_spent_ms"

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastRequestLatency:I

    .line 31
    .line 32
    const-string v1, "last_request_time"

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iput-wide v4, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastSuccessfulRequestTime:J

    .line 41
    .line 42
    const-string v1, "last_req"

    .line 43
    .line 44
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    .line 49
    .line 50
    return-void
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


# virtual methods
.method public getFirstActivateTime()J
    .locals 7

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "first_activate_time"

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    iput-wide v5, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->firstActivateTime:J

    .line 22
    .line 23
    cmp-long v1, v5, v3

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iput-wide v3, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->firstActivateTime:J

    .line 32
    .line 33
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-wide v3, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->firstActivateTime:J

    .line 38
    .line 39
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->firstActivateTime:J

    .line 47
    .line 48
    return-wide v0
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

.method public getLastReqTime()J
    .locals 2

    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    return-wide v0
.end method

.method public getLastRequestLatency()I
    .locals 2

    iget v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastRequestLatency:I

    const v1, 0x36ee80

    if-le v0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public isFirstRequest()Z
    .locals 4

    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastSuccessfulRequestTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public logFailedRequest()V
    .locals 1

    iget v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mFailedRequest:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mFailedRequest:I

    return-void
.end method

.method public logRequestEnd()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastRequestLatency:I

    return-void
.end method

.method public logRequestStart()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    return-void
.end method

.method public logSuccessfulRequest(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mSuccessfulRequest:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mSuccessfulRequest:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastSuccessfulRequestTime:J

    .line 12
    .line 13
    :cond_0
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
.end method

.method public onRequestEnd()V
    .locals 0

    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->logRequestEnd()V

    return-void
.end method

.method public onRequestFailed()V
    .locals 0

    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->logFailedRequest()V

    return-void
.end method

.method public onRequestStart()V
    .locals 0

    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->logRequestStart()V

    return-void
.end method

.method public onRequestSucceed(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->logSuccessfulRequest(Z)V

    return-void
.end method

.method public saveSate()V
    .locals 4

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "successful_request"

    .line 12
    .line 13
    iget v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mSuccessfulRequest:I

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "failed_requests "

    .line 20
    .line 21
    iget v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mFailedRequest:I

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "last_request_spent_ms"

    .line 28
    .line 29
    iget v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastRequestLatency:I

    .line 30
    .line 31
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "last_req"

    .line 36
    .line 37
    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->lastRequestTime:J

    .line 38
    .line 39
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "last_request_time"

    .line 44
    .line 45
    iget-wide v2, p0, Lcom/umeng/commonsdk/statistics/internal/StatTracer;->mLastSuccessfulRequestTime:J

    .line 46
    .line 47
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 52
    .line 53
    .line 54
    return-void
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
