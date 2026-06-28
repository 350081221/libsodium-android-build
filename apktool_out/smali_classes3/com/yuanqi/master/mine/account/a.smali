.class public final Lcom/yuanqi/master/mine/account/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010&\u001a\u00020\u00082\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(J\u0006\u0010*\u001a\u00020\u0008J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0008J\u0006\u0010-\u001a\u00020)J\u001c\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0005R+\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0005R\u0011\u0010\u0017\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u000bR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008%\u0010\u000f\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$\u00a8\u00061"
    }
    d2 = {
        "Lcom/yuanqi/master/mine/account/AccountManager;",
        "",
        "()V",
        "isPayMember",
        "",
        "()Z",
        "isVip",
        "<set-?>",
        "",
        "mToken",
        "getMToken",
        "()Ljava/lang/String;",
        "setMToken",
        "(Ljava/lang/String;)V",
        "mToken$delegate",
        "Lcom/yuanqi/master/tools/MVFast;",
        "userInfo",
        "Landroidx/compose/runtime/MutableState;",
        "Lcom/yuanqi/master/network/model/UserInfoData;",
        "getUserInfo",
        "()Landroidx/compose/runtime/MutableState;",
        "userLogin",
        "getUserLogin",
        "userToken",
        "getUserToken",
        "vipLevel",
        "Lcom/yuanqi/master/network/model/MemberType;",
        "getVipLevel",
        "()Lcom/yuanqi/master/network/model/MemberType;",
        "vipTime",
        "getVipTime",
        "",
        "vipTimeNoLogin",
        "getVipTimeNoLogin",
        "()J",
        "setVipTimeNoLogin",
        "(J)V",
        "vipTimeNoLogin$delegate",
        "getUserTitle",
        "action",
        "Lkotlin/Function0;",
        "",
        "getUserTitlePlus",
        "loginIn",
        "token",
        "loginOut",
        "requestUserInfo",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountManager.kt\ncom/yuanqi/master/mine/account/AccountManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/yuanqi/master/mine/account/a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field static final synthetic b:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final d:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final e:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/UserInfoData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v2, Lkotlin/jvm/internal/x0;

    .line 5
    .line 6
    const-string v3, "mToken"

    .line 7
    .line 8
    const-string v4, "getMToken()Ljava/lang/String;"

    .line 9
    .line 10
    const-class v5, Lcom/yuanqi/master/mine/account/a;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    invoke-direct {v2, v5, v3, v4, v6}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    aput-object v2, v1, v6

    .line 21
    .line 22
    new-instance v2, Lkotlin/jvm/internal/x0;

    .line 23
    .line 24
    const-string v3, "vipTimeNoLogin"

    .line 25
    .line 26
    const-string v4, "getVipTimeNoLogin()J"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4, v6}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x1

    .line 36
    aput-object v2, v1, v3

    .line 37
    .line 38
    sput-object v1, Lcom/yuanqi/master/mine/account/a;->b:[Lkotlin/reflect/o;

    .line 39
    .line 40
    new-instance v1, Lcom/yuanqi/master/mine/account/a;

    .line 41
    .line 42
    invoke-direct {v1}, Lcom/yuanqi/master/mine/account/a;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 46
    .line 47
    new-instance v1, Lcom/yuanqi/master/tools/x0;

    .line 48
    .line 49
    const-string v2, "UserLoginKey"

    .line 50
    .line 51
    const-string v3, ""

    .line 52
    .line 53
    invoke-direct {v1, v2, v3}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Lcom/yuanqi/master/mine/account/a;->c:Lcom/yuanqi/master/tools/x0;

    .line 57
    .line 58
    new-instance v1, Lcom/yuanqi/master/tools/x0;

    .line 59
    .line 60
    const-wide/16 v2, 0x0

    .line 61
    .line 62
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "showADVipTimeNoLogin"

    .line 67
    .line 68
    invoke-direct {v1, v3, v2}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sput-object v1, Lcom/yuanqi/master/mine/account/a;->d:Lcom/yuanqi/master/tools/x0;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-static {v1, v1, v0, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 79
    .line 80
    return-void
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

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->c:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/account/a;->b:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final i()J
    .locals 3

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->d:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/account/a;->b:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final o(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->c:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/account/a;->b:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final p(J)V
    .locals 3

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->d:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/account/a;->b:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/UserInfoData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final c()Z
    .locals 2

    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    const-string v1, "UserLoginKey"

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/w0;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final d(Lv3/a;)Ljava/lang/String;
    .locals 6
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    :cond_1
    invoke-static {v2}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    xor-int/2addr v3, v4

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move-object v2, v5

    .line 40
    :goto_0
    if-nez v2, :cond_8

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserPhone()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    move-object v2, v1

    .line 49
    :cond_3
    invoke-static {v2}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    xor-int/2addr v3, v4

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    move-object v2, v5

    .line 58
    :goto_1
    if-nez v2, :cond_8

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserEmail()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_5

    .line 65
    .line 66
    move-object v0, v1

    .line 67
    :cond_5
    invoke-static {v0}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    xor-int/2addr v2, v4

    .line 72
    if-eqz v2, :cond_6

    .line 73
    .line 74
    move-object v5, v0

    .line 75
    :cond_6
    if-nez v5, :cond_7

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_7
    move-object v1, v5

    .line 79
    goto :goto_2

    .line 80
    :cond_8
    move-object v1, v2

    .line 81
    :goto_2
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_9

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_9
    const/4 v4, 0x0

    .line 89
    :goto_3
    if-eqz v4, :cond_a

    .line 90
    .line 91
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_a
    return-object v1
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

.method public final e()Ljava/lang/String;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-object v2, v1

    .line 21
    :cond_1
    invoke-static {v2}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    xor-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object v2, v4

    .line 32
    :goto_0
    if-nez v2, :cond_8

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserPhone()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    :cond_3
    invoke-static {v2}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    xor-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    move-object v2, v4

    .line 51
    :goto_1
    if-nez v2, :cond_8

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserEmail()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    move-object v0, v1

    .line 60
    :cond_5
    invoke-static {v0}, Lkotlin/text/v;->S1(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    xor-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    if-eqz v2, :cond_6

    .line 67
    .line 68
    move-object v4, v0

    .line 69
    :cond_6
    if-nez v4, :cond_7

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_7
    move-object v1, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_8
    move-object v1, v2

    .line 75
    :goto_2
    return-object v1
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

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-direct {p0}, Lcom/yuanqi/master/mine/account/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/yuanqi/master/network/model/MemberType;
    .locals 9
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/yuanqi/master/mine/account/a;->i()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->FREE:Lcom/yuanqi/master/network/model/MemberType;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->NORMAL:Lcom/yuanqi/master/network/model/MemberType;

    .line 23
    .line 24
    :goto_0
    return-object v0

    .line 25
    :cond_1
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/yuanqi/master/network/model/UserInfoData;->isVip()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_1
    const-string v3, "1"

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->NORMAL:Lcom/yuanqi/master/network/model/MemberType;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOpentime()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    move-object v1, v2

    .line 67
    :goto_2
    const/4 v3, 0x1

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    move v1, v4

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    :goto_3
    move v1, v3

    .line 81
    :goto_4
    if-eqz v1, :cond_7

    .line 82
    .line 83
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->UNKNOWN:Lcom/yuanqi/master/network/model/MemberType;

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_7
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 91
    .line 92
    if-eqz v1, :cond_8

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOvertime()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :cond_8
    if-eqz v2, :cond_a

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_9

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_9
    move v1, v4

    .line 108
    goto :goto_6

    .line 109
    :cond_a
    :goto_5
    move v1, v3

    .line 110
    :goto_6
    if-eqz v1, :cond_b

    .line 111
    .line 112
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->UNKNOWN:Lcom/yuanqi/master/network/model/MemberType;

    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_b
    sget-object v1, Lcom/yuanqi/master/tools/d;->a:Lcom/yuanqi/master/tools/d;

    .line 116
    .line 117
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    check-cast v2, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 125
    .line 126
    invoke-virtual {v2}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOvertime()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    cmp-long v2, v5, v7

    .line 146
    .line 147
    if-gez v2, :cond_c

    .line 148
    .line 149
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->NORMAL:Lcom/yuanqi/master/network/model/MemberType;

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_c
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOpentime()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v1, v0}, Lcom/yuanqi/master/tools/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v0

    .line 176
    sub-long/2addr v5, v0

    .line 177
    const v0, 0x5265c00

    .line 178
    .line 179
    .line 180
    int-to-long v0, v0

    .line 181
    div-long/2addr v5, v0

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v1, "vipDays: "

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, ""

    .line 200
    .line 201
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    const-wide/16 v0, 0x0

    .line 205
    .line 206
    cmp-long v0, v0, v5

    .line 207
    .line 208
    const-wide/16 v1, 0x1e

    .line 209
    .line 210
    if-gtz v0, :cond_d

    .line 211
    .line 212
    cmp-long v0, v5, v1

    .line 213
    .line 214
    if-gez v0, :cond_d

    .line 215
    .line 216
    move v0, v3

    .line 217
    goto :goto_7

    .line 218
    :cond_d
    move v0, v4

    .line 219
    :goto_7
    if-eqz v0, :cond_e

    .line 220
    .line 221
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->FREE:Lcom/yuanqi/master/network/model/MemberType;

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_e
    cmp-long v0, v1, v5

    .line 225
    .line 226
    if-gtz v0, :cond_f

    .line 227
    .line 228
    const-wide/16 v0, 0x15a

    .line 229
    .line 230
    cmp-long v0, v5, v0

    .line 231
    .line 232
    if-gez v0, :cond_f

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_f
    move v3, v4

    .line 236
    :goto_8
    if-eqz v3, :cond_10

    .line 237
    .line 238
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->MONTH:Lcom/yuanqi/master/network/model/MemberType;

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_10
    sget-object v0, Lcom/yuanqi/master/network/model/MemberType;->YEAR:Lcom/yuanqi/master/network/model/MemberType;

    .line 242
    .line 243
    :goto_9
    return-object v0
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

.method public final h()Ljava/lang/String;
    .locals 7
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOvertime()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    :goto_1
    const/4 v2, 0x1

    .line 37
    :goto_2
    if-eqz v2, :cond_3

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getVipOvertime()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v0, " "

    .line 54
    .line 55
    filled-new-array {v0}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x6

    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-static/range {v1 .. v6}, Lkotlin/text/v;->R4(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    invoke-direct {p0}, Lcom/yuanqi/master/mine/account/a;->i()J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    cmp-long v0, v2, v4

    .line 83
    .line 84
    if-lez v0, :cond_5

    .line 85
    .line 86
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 87
    .line 88
    const-string v1, "yyyy-MM-dd"

    .line 89
    .line 90
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Ljava/util/Date;

    .line 98
    .line 99
    invoke-direct {p0}, Lcom/yuanqi/master/mine/account/a;->i()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "format(...)"

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_5
    return-object v1
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

.method public final j()Z
    .locals 2

    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->g()Lcom/yuanqi/master/network/model/MemberType;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/master/network/model/MemberType;->YEAR:Lcom/yuanqi/master/network/model/MemberType;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->g()Lcom/yuanqi/master/network/model/MemberType;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/master/network/model/MemberType;->MONTH:Lcom/yuanqi/master/network/model/MemberType;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final k()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->isVip()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    const-string v1, "1"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/master/mine/account/a;->i()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    cmp-long v0, v0, v2

    .line 39
    .line 40
    if-lez v0, :cond_2

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_1
    return v0
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
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/yuanqi/master/mine/account/a;->o(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public final m()V
    .locals 2

    .line 1
    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 2
    .line 3
    const-string v1, "UserLoginKey"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/w0;->f(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "VipEndKey"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/w0;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "showLocation"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/w0;->f(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->e:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method public final n(Lkotlinx/coroutines/s0;Lv3/a;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p2}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/g;->u()Lretrofit2/Call;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lcom/yuanqi/master/mine/account/a$a;

    .line 28
    .line 29
    invoke-direct {v1, p1, p2}, Lcom/yuanqi/master/mine/account/a$a;-><init>(Lkotlinx/coroutines/s0;Lv3/a;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lcom/yuanqi/master/mine/account/a$b;

    .line 33
    .line 34
    invoke-direct {p1, p2}, Lcom/yuanqi/master/mine/account/a$b;-><init>(Lv3/a;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/f1;->a(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 38
    .line 39
    .line 40
    return-void
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
