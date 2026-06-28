.class public Lcom/huawei/hms/opendevice/l;
.super Lcom/huawei/hms/common/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/common/internal/TaskApiCall<",
        "Lcom/huawei/hms/aaid/task/PushClient;",
        "Lcom/huawei/hms/aaid/entity/TokenResult;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/huawei/hms/aaid/entity/TokenReq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hms/aaid/entity/TokenReq;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/huawei/hms/utils/JsonUtil;->createJsonString(Lcom/huawei/hms/core/aidl/IMessageEntity;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0, p4}, Lcom/huawei/hms/common/internal/TaskApiCall;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lcom/huawei/hms/opendevice/l;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/huawei/hms/opendevice/l;->b:Lcom/huawei/hms/aaid/entity/TokenReq;

    .line 11
    .line 12
    return-void
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
.end method


# virtual methods
.method public a(Lcom/huawei/hms/aaid/task/PushClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/aaid/task/PushClient;",
            "Lcom/huawei/hms/common/internal/ResponseErrorCode;",
            "Ljava/lang/String;",
            "Lcom/huawei/hmf/tasks/k<",
            "Lcom/huawei/hms/aaid/entity/TokenResult;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    sget-object p3, Lcom/huawei/hms/aaid/HmsInstanceId;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TokenTask failed, ErrorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result p3

    invoke-static {p3}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->fromCode(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    move-result-object p3

    .line 4
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->ERROR_UNKNOWN:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    if-eq p3, v0, :cond_0

    .line 5
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->toApiException()Lcom/huawei/hms/common/ApiException;

    move-result-object p3

    invoke-virtual {p4, p3}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 6
    :cond_0
    new-instance p3, Lcom/huawei/hms/common/ApiException;

    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    move-result v1

    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorReason()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {p3, v0}, Lcom/huawei/hms/common/ApiException;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    invoke-virtual {p4, p3}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    goto/16 :goto_0

    .line 7
    :cond_1
    new-instance v0, Lcom/huawei/hms/aaid/entity/TokenResp;

    invoke-direct {v0}, Lcom/huawei/hms/aaid/entity/TokenResp;-><init>()V

    invoke-static {p3, v0}, Lcom/huawei/hms/utils/JsonUtil;->jsonToEntity(Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    move-result-object p3

    check-cast p3, Lcom/huawei/hms/aaid/entity/TokenResp;

    .line 8
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getRetCode()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->fromCode(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    move-result-object v0

    .line 9
    sget-object v1, Lcom/huawei/hms/aaid/constant/ErrorEnum;->SUCCESS:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    if-eq v0, v1, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->toApiException()Lcom/huawei/hms/common/ApiException;

    move-result-object p3

    invoke-virtual {p4, p3}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    .line 11
    sget-object p3, Lcom/huawei/hms/aaid/HmsInstanceId;->TAG:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TokenTask failed, StatusCode:"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->getExternalCode()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_2
    new-instance v0, Lcom/huawei/hms/aaid/entity/TokenResult;

    invoke-direct {v0}, Lcom/huawei/hms/aaid/entity/TokenResult;-><init>()V

    .line 13
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setToken(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getBelongId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setBelongId(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getRetCode()I

    move-result v1

    invoke-static {v1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->fromCode(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->getExternalCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/aaid/entity/TokenResult;->setRetCode(I)V

    .line 16
    invoke-virtual {p4, v0}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/TokenResp;->getToken()Ljava/lang/String;

    move-result-object p3

    .line 18
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_3

    .line 19
    sget-object p3, Lcom/huawei/hms/aaid/HmsInstanceId;->TAG:Ljava/lang/String;

    const-string p4, "GetTokenTask receive a empty token, please check HmsMessageService.onNewToken receive result."

    invoke-static {p3, p4}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lcom/huawei/hms/common/internal/BaseHmsClient;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Lcom/huawei/hms/common/internal/TaskApiCall;->getUri()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, p2}, Lcom/huawei/hms/opendevice/q;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/common/internal/ResponseErrorCode;)V

    return-void

    .line 21
    :cond_3
    iget-object p4, p0, Lcom/huawei/hms/opendevice/l;->b:Lcom/huawei/hms/aaid/entity/TokenReq;

    invoke-virtual {p4}, Lcom/huawei/hms/aaid/entity/TokenReq;->getSubjectId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p3, p4}, Lcom/huawei/hms/opendevice/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object p4, p0, Lcom/huawei/hms/opendevice/l;->a:Landroid/content/Context;

    invoke-static {p4, p3}, Lcom/huawei/hms/opendevice/n;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hms/common/internal/BaseHmsClient;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Lcom/huawei/hms/common/internal/TaskApiCall;->getUri()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, p2}, Lcom/huawei/hms/opendevice/q;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/common/internal/ResponseErrorCode;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/huawei/hms/opendevice/l;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/opendevice/i;->a(Landroid/content/Context;)Lcom/huawei/hms/opendevice/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hms/opendevice/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    sget-object v0, Lcom/huawei/hms/aaid/HmsInstanceId;->TAG:Ljava/lang/String;

    const-string v1, "receive a token, refresh the local token"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/huawei/hms/opendevice/l;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/opendevice/i;->a(Landroid/content/Context;)Lcom/huawei/hms/opendevice/i;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/huawei/hms/opendevice/i;->b(Ljava/lang/String;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic doExecute(Lcom/huawei/hms/common/internal/AnyClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    check-cast p1, Lcom/huawei/hms/aaid/task/PushClient;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/hms/opendevice/l;->a(Lcom/huawei/hms/aaid/task/PushClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V

    return-void
.end method

.method public getMinApkVersion()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/opendevice/l;->b:Lcom/huawei/hms/aaid/entity/TokenReq;

    invoke-virtual {v0}, Lcom/huawei/hms/aaid/entity/TokenReq;->isMultiSender()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x2fb014c

    return v0

    :cond_0
    const v0, 0x1c9c380

    return v0
.end method
