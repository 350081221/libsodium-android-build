.class public Lcom/huawei/hms/opendevice/k;
.super Lcom/huawei/hms/common/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/common/internal/TaskApiCall<",
        "Lcom/huawei/hms/aaid/task/PushClient;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lcom/huawei/hms/aaid/entity/DeleteTokenReq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hms/aaid/entity/DeleteTokenReq;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/huawei/hms/utils/JsonUtil;->createJsonString(Lcom/huawei/hms/core/aidl/IMessageEntity;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0, p3}, Lcom/huawei/hms/common/internal/TaskApiCall;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/huawei/hms/opendevice/k;->a:Lcom/huawei/hms/aaid/entity/DeleteTokenReq;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public a(Lcom/huawei/hms/aaid/task/PushClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/aaid/task/PushClient;",
            "Lcom/huawei/hms/common/internal/ResponseErrorCode;",
            "Ljava/lang/String;",
            "Lcom/huawei/hmf/tasks/k<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object p1, Lcom/huawei/hms/aaid/HmsInstanceId;->TAG:Ljava/lang/String;

    .line 8
    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "DeleteTokenTask failed, ErrorCode: "

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p1, p3}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->fromCode(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object p3, Lcom/huawei/hms/aaid/constant/ErrorEnum;->ERROR_UNKNOWN:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 42
    .line 43
    if-eq p1, p3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->toApiException()Lcom/huawei/hms/common/ApiException;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p4, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Lcom/huawei/hms/common/ApiException;

    .line 54
    .line 55
    new-instance p3, Lcom/huawei/hms/support/api/client/Status;

    .line 56
    .line 57
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorCode()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-interface {p2}, Lcom/huawei/hms/common/internal/ResponseErrorCode;->getErrorReason()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p3, v0, p2}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p3}, Lcom/huawei/hms/common/ApiException;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance v0, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;

    .line 76
    .line 77
    invoke-direct {v0}, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {p3, v0}, Lcom/huawei/hms/utils/JsonUtil;->jsonToEntity(Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;

    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;->getRetCode()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    invoke-static {p3}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->fromCode(I)Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    sget-object v0, Lcom/huawei/hms/aaid/constant/ErrorEnum;->SUCCESS:Lcom/huawei/hms/aaid/constant/ErrorEnum;

    .line 95
    .line 96
    if-eq p3, v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {p3}, Lcom/huawei/hms/aaid/constant/ErrorEnum;->toApiException()Lcom/huawei/hms/common/ApiException;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p4, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    const/4 p3, 0x0

    .line 107
    invoke-virtual {p4, p3}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/huawei/hms/common/internal/BaseHmsClient;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0}, Lcom/huawei/hms/common/internal/TaskApiCall;->getUri()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-static {p1, p3, p2}, Lcom/huawei/hms/opendevice/q;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/common/internal/ResponseErrorCode;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    return-void
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

.method public bridge synthetic doExecute(Lcom/huawei/hms/common/internal/AnyClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    check-cast p1, Lcom/huawei/hms/aaid/task/PushClient;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/hms/opendevice/k;->a(Lcom/huawei/hms/aaid/task/PushClient;Lcom/huawei/hms/common/internal/ResponseErrorCode;Ljava/lang/String;Lcom/huawei/hmf/tasks/k;)V

    return-void
.end method

.method public getMinApkVersion()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/opendevice/k;->a:Lcom/huawei/hms/aaid/entity/DeleteTokenReq;

    invoke-virtual {v0}, Lcom/huawei/hms/aaid/entity/DeleteTokenReq;->isMultiSender()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x2fb014c

    return v0

    :cond_0
    const v0, 0x1c9c380

    return v0
.end method
