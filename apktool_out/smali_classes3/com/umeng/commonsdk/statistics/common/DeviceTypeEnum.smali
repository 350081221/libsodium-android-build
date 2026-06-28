.class public final enum Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum ANDROIDID:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum DEFAULT:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum IDFA:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum IMEI:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum MAC:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum OAID:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

.field public static final enum SERIALNO:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;


# instance fields
.field private description:Ljava/lang/String;

.field private deviceIdType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 2
    .line 3
    const-string v1, "imei"

    .line 4
    .line 5
    const-string v2, "IMEI"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1, v1}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->IMEI:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 12
    .line 13
    new-instance v1, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 14
    .line 15
    const-string v2, "oaid"

    .line 16
    .line 17
    const-string v4, "OAID"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2, v2}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->OAID:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 24
    .line 25
    new-instance v2, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 26
    .line 27
    const-string v4, "android_id"

    .line 28
    .line 29
    const-string v6, "ANDROIDID"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4, v4}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->ANDROIDID:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 36
    .line 37
    new-instance v4, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 38
    .line 39
    const-string v6, "mac"

    .line 40
    .line 41
    const-string v8, "MAC"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6, v6}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->MAC:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 48
    .line 49
    new-instance v6, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 50
    .line 51
    const-string v8, "serial_no"

    .line 52
    .line 53
    const-string v10, "SERIALNO"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8, v8}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->SERIALNO:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 60
    .line 61
    new-instance v8, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 62
    .line 63
    const-string v10, "idfa"

    .line 64
    .line 65
    const-string v12, "IDFA"

    .line 66
    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-direct {v8, v12, v13, v10, v10}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->IDFA:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 72
    .line 73
    new-instance v10, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 74
    .line 75
    const-string v12, "null"

    .line 76
    .line 77
    const-string v14, "DEFAULT"

    .line 78
    .line 79
    const/4 v15, 0x6

    .line 80
    invoke-direct {v10, v14, v15, v12, v12}, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v10, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->DEFAULT:Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 84
    .line 85
    const/4 v12, 0x7

    .line 86
    new-array v12, v12, [Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 87
    .line 88
    aput-object v0, v12, v3

    .line 89
    .line 90
    aput-object v1, v12, v5

    .line 91
    .line 92
    aput-object v2, v12, v7

    .line 93
    .line 94
    aput-object v4, v12, v9

    .line 95
    .line 96
    aput-object v6, v12, v11

    .line 97
    .line 98
    aput-object v8, v12, v13

    .line 99
    .line 100
    aput-object v10, v12, v15

    .line 101
    .line 102
    sput-object v12, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->$VALUES:[Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    .line 103
    .line 104
    return-void
    .line 105
    .line 106
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->deviceIdType:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->description:Ljava/lang/String;

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

.method public static valueOf(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;
    .locals 1

    const-class v0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    return-object p0
.end method

.method public static values()[Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->$VALUES:[Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    invoke-virtual {v0}, [Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;

    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceIdType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/common/DeviceTypeEnum;->deviceIdType:Ljava/lang/String;

    return-object v0
.end method
