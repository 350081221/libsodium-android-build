.class public Lcom/bytedance/mtesttools/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "c"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/bytedance/mtesttools/b/a;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/bytedance/mtesttools/b/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string/jumbo v3, "tools error info start"

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aput-object v3, v2, v4

    .line 11
    .line 12
    const-string v3, "-------------------------- %1$s --------------------------"

    .line 13
    .line 14
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    new-array v2, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p0, v2, v4

    .line 24
    .line 25
    const-string/jumbo p0, "\u56de\u8c03\u65b9\u6cd5\u540d\u79f0 methodName =  %1$s"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x2

    .line 38
    new-array p0, p0, [Ljava/lang/Object;

    .line 39
    .line 40
    iget v2, p1, Lcom/bytedance/mtesttools/b/a;->c:I

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aput-object v2, p0, v4

    .line 47
    .line 48
    iget-object p1, p1, Lcom/bytedance/mtesttools/b/a;->d:Ljava/lang/String;

    .line 49
    .line 50
    aput-object p1, p0, v1

    .line 51
    .line 52
    const-string p1, "error_code = %1$s error_message = %2$s"

    .line 53
    .line 54
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_0
    new-array p0, v1, [Ljava/lang/Object;

    .line 62
    .line 63
    const-string/jumbo p1, "tools error info end"

    .line 64
    .line 65
    .line 66
    aput-object p1, p0, v4

    .line 67
    .line 68
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    return-void
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
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/bytedance/mtesttools/b/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string/jumbo v3, "tools show info start"

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aput-object v3, v2, v4

    .line 11
    .line 12
    const-string v3, "-------------------------- %1$s --------------------------"

    .line 13
    .line 14
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    new-array v2, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p0, v2, v4

    .line 24
    .line 25
    const-string/jumbo p0, "\u56de\u8c03\u65b9\u6cd5\u540d\u79f0 methodName =  %1$s"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x3

    .line 36
    const/4 v2, 0x2

    .line 37
    const/4 v5, 0x4

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    new-array v6, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object p1, v6, v4

    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->getSlotId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    aput-object p1, v6, v1

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->getSdkName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    aput-object p1, v6, v2

    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationAdEcpmInfo;->getEcpm()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    aput-object p1, v6, p0

    .line 61
    .line 62
    const-string/jumbo p1, "\u5c55\u793a\u5e7f\u544a\u4fe1\u606f \uff1a\u5e7f\u544a\u4f4did = %1$s \u4ee3\u7801\u4f4did = %2$s adnName = %3$s ecpm = %4$s "

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    :cond_0
    if-eqz p3, :cond_2

    .line 73
    .line 74
    const-string p1, "customData"

    .line 75
    .line 76
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-array p2, v5, [Ljava/lang/Object;

    .line 81
    .line 82
    const-string v5, "rewardVeridy"

    .line 83
    .line 84
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    aput-object v5, p2, v4

    .line 93
    .line 94
    const-string v5, "rewardAmount"

    .line 95
    .line 96
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    aput-object v5, p2, v1

    .line 105
    .line 106
    const-string v5, "rewardName"

    .line 107
    .line 108
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    aput-object p3, p2, v2

    .line 113
    .line 114
    if-eqz p1, :cond_1

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    goto :goto_0

    .line 121
    :cond_1
    const-string p1, ""

    .line 122
    .line 123
    :goto_0
    aput-object p1, p2, p0

    .line 124
    .line 125
    const-string/jumbo p0, "\u6fc0\u52b1\u56de\u8c03\u4fe1\u606f \uff1arewardVerify() = %1$s getAmount() = %2$s getRewardName() = %3$s \ngetCustomData(): \n%4$s "

    .line 126
    .line 127
    .line 128
    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_2
    new-array p0, v1, [Ljava/lang/Object;

    .line 136
    .line 137
    const-string/jumbo p1, "tools show info end"

    .line 138
    .line 139
    .line 140
    aput-object p1, p0, v4

    .line 141
    .line 142
    invoke-static {v3, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    return-void
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
