.class public Lcom/efs/sdk/pa/config/ConfigManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A_DAY:I = 0x5265c00

.field public static final FLAG_PA_CHECK_IN_STATE:Ljava/lang/String; = "8f2f54c08600aa25915617fa1371441b"

.field public static final FLAG_PA_FORE_CHECK_TIME:Ljava/lang/String; = "03f870871950c148387b251894ed3e88"

.field private static final MAX_ANR_STATS_COUNT:I = 0x32

.field private static final MAX_ANR_TRACE_RATE:I = 0x64

.field private static final MODEL_SP:Ljava/lang/String; = "paconfig"

.field public static final PA_LEVEL:Ljava/lang/String; = "pa_level"

.field private static final STATS_ANR_LOG_COUNT:Ljava/lang/String; = "apm_anr_count"


# instance fields
.field private final APM_PATRACE_SWITCH_RATE_CURRENT:Ljava/lang/String;

.field private final APM_PATRACE_SWITCH_RATE_LAST:Ljava/lang/String;

.field private final DEF_CLOSE_RATE:I

.field private final TAG:Ljava/lang/String;

.field private mCheckIn:Z

.field private mCurrentRate:I

.field private mEfsReporter:Lcom/efs/sdk/pa/config/IEfsReporter;

.field private mLastRate:I

.field private mPackageLevel:Lcom/efs/sdk/pa/config/PackageLevel;

.field private mSharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/pa/config/PackageLevel;Lcom/efs/sdk/pa/config/IEfsReporter;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "WpkPaConfig"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "apm_patrace_switch_rate_last"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->APM_PATRACE_SWITCH_RATE_LAST:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "apm_patrace_switch_rate"

    .line 13
    .line 14
    iput-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->APM_PATRACE_SWITCH_RATE_CURRENT:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->DEF_CLOSE_RATE:I

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCheckIn:Z

    .line 20
    .line 21
    iput-object p2, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mPackageLevel:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mEfsReporter:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 24
    .line 25
    const-string p2, "paconfig"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lcom/efs/sdk/base/newsharedpreferences/SharedPreferencesUtils;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->initRate()V

    .line 34
    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->resetUploadSmoothLogCnt()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->enableAnrTracer()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->isCountEnable()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->enableAnrTracer()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCheckIn:Z

    .line 60
    .line 61
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->resetRate()V

    .line 62
    .line 63
    .line 64
    return-void
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
.end method

.method static synthetic access$000(Lcom/efs/sdk/pa/config/ConfigManager;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/efs/sdk/pa/config/ConfigManager;->putIntValue(Ljava/lang/String;I)V

    return-void
.end method

.method private checkIn(ZLjava/lang/Long;ZI)Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    sub-long/2addr v1, v3

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v1, 0x1

    .line 23
    const-wide/32 v2, 0x5265c00

    .line 24
    .line 25
    .line 26
    const-string v4, "WpkPaConfig"

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    cmp-long p3, v5, v2

    .line 35
    .line 36
    if-gez p3, :cond_0

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    const-string p1, " check in allready"

    .line 41
    .line 42
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide p2

    .line 50
    cmp-long p2, p2, v2

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    if-gez p2, :cond_2

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string/jumbo p1, "un repeat check in 24 hour!"

    .line 59
    .line 60
    .line 61
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_0
    invoke-direct {p0, p4}, Lcom/efs/sdk/pa/config/ConfigManager;->random(I)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    const-string p1, "random check in"

    .line 72
    .line 73
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const-string p1, "random not check in!"

    .line 78
    .line 79
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move v1, p3

    .line 83
    :goto_1
    const-string p1, "8f2f54c08600aa25915617fa1371441b"

    .line 84
    .line 85
    invoke-direct {p0, p1, v1}, Lcom/efs/sdk/pa/config/ConfigManager;->putBooleanValue(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string p1, "03f870871950c148387b251894ed3e88"

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide p2

    .line 94
    invoke-direct {p0, p1, p2, p3}, Lcom/efs/sdk/pa/config/ConfigManager;->putLongValue(Ljava/lang/String;J)V

    .line 95
    .line 96
    .line 97
    move p3, v1

    .line 98
    :goto_2
    return p3
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
.end method

.method private enableAnrTracer()Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "03f870871950c148387b251894ed3e88"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v6, "8f2f54c08600aa25915617fa1371441b"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v8, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 21
    .line 22
    if-nez v8, :cond_2

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0, v6, v7}, Lcom/efs/sdk/pa/config/ConfigManager;->putBooleanValue(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    cmp-long v0, v4, v2

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v1, v2, v3}, Lcom/efs/sdk/pa/config/ConfigManager;->putLongValue(Ljava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return v7

    .line 37
    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    iget v1, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 46
    .line 47
    iget v3, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mLastRate:I

    .line 48
    .line 49
    if-eq v1, v3, :cond_4

    .line 50
    .line 51
    move v7, v2

    .line 52
    :cond_4
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget v2, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 57
    .line 58
    invoke-direct {p0, v7, v1, v0, v2}, Lcom/efs/sdk/pa/config/ConfigManager;->checkIn(ZLjava/lang/Long;ZI)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    return v0
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
.end method

.method private getCurrentConfigRate()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "apm_patrace_switch_rate"

    .line 5
    .line 6
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mEfsReporter:Lcom/efs/sdk/pa/config/IEfsReporter;

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/efs/sdk/pa/config/IEfsReporter;->getReporter()Lcom/efs/sdk/base/EfsReporter;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    filled-new-array {v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lcom/efs/sdk/pa/config/ConfigManager$1;

    .line 21
    .line 22
    invoke-direct {v3, p0}, Lcom/efs/sdk/pa/config/ConfigManager$1;-><init>(Lcom/efs/sdk/pa/config/ConfigManager;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    .line 26
    .line 27
    .line 28
    return v0
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
.end method

.method private initRate()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "apm_patrace_switch_rate_last"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mLastRate:I

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->getCurrentConfigRate()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, -0x1

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mPackageLevel:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 20
    .line 21
    sget-object v1, Lcom/efs/sdk/pa/config/PackageLevel;->TRIAL:Lcom/efs/sdk/pa/config/PackageLevel;

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x64

    .line 26
    .line 27
    iput v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iput v2, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iput v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 34
    .line 35
    return-void
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
.end method

.method private isCountEnable()Z
    .locals 4

    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "apm_anr_count"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x32

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private putBooleanValue(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

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
.end method

.method private putIntValue(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

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
.end method

.method private putLongValue(Ljava/lang/String;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

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
.end method

.method private random(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    const/16 v2, 0x64

    .line 7
    .line 8
    if-ne p1, v2, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    new-instance v3, Ljava/util/Random;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/Random;->nextInt(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-gt v2, p1, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    return v0
    .line 24
.end method

.method private resetRate()V
    .locals 2

    .line 1
    const-string v0, "apm_patrace_switch_rate_last"

    .line 2
    .line 3
    iget v1, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCurrentRate:I

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/efs/sdk/pa/config/ConfigManager;->putIntValue(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method

.method private resetUploadSmoothLogCnt()V
    .locals 3

    .line 1
    const-string v0, "apm_anr_count"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, v2}, Lcom/efs/sdk/pa/config/ConfigManager;->putLongValue(Ljava/lang/String;J)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public enableTracer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mCheckIn:Z

    return v0
.end method

.method public increaseUploadSmoothLogCnt()V
    .locals 6

    iget-object v0, p0, Lcom/efs/sdk/pa/config/ConfigManager;->mSharedPreferences:Landroid/content/SharedPreferences;

    const-wide/16 v1, 0x0

    const-string v3, "apm_anr_count"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    invoke-direct {p0, v3, v0, v1}, Lcom/efs/sdk/pa/config/ConfigManager;->putLongValue(Ljava/lang/String;J)V

    return-void
.end method
