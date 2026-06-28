.class public final enum Lcom/umeng/commonsdk/statistics/proto/d$e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/by;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/umeng/commonsdk/statistics/proto/d$e;",
        ">;",
        "Lcom/umeng/analytics/pro/by;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field public static final enum b:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field public static final enum c:Lcom/umeng/commonsdk/statistics/proto/d$e;

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/umeng/commonsdk/statistics/proto/d$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic g:[Lcom/umeng/commonsdk/statistics/proto/d$e;


# instance fields
.field private final e:S

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 2
    .line 3
    const-string v1, "property"

    .line 4
    .line 5
    const-string v2, "PROPERTY"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->a:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 13
    .line 14
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 15
    .line 16
    const-string v2, "version"

    .line 17
    .line 18
    const-string v5, "VERSION"

    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    invoke-direct {v1, v5, v4, v6, v2}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lcom/umeng/commonsdk/statistics/proto/d$e;->b:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 25
    .line 26
    new-instance v2, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 27
    .line 28
    const-string v5, "checksum"

    .line 29
    .line 30
    const-string v7, "CHECKSUM"

    .line 31
    .line 32
    const/4 v8, 0x3

    .line 33
    invoke-direct {v2, v7, v6, v8, v5}, Lcom/umeng/commonsdk/statistics/proto/d$e;-><init>(Ljava/lang/String;ISLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lcom/umeng/commonsdk/statistics/proto/d$e;->c:Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 37
    .line 38
    new-array v5, v8, [Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 39
    .line 40
    aput-object v0, v5, v3

    .line 41
    .line 42
    aput-object v1, v5, v4

    .line 43
    .line 44
    aput-object v2, v5, v6

    .line 45
    .line 46
    sput-object v5, Lcom/umeng/commonsdk/statistics/proto/d$e;->g:[Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 47
    .line 48
    new-instance v0, Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->d:Ljava/util/Map;

    .line 54
    .line 55
    const-class v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/umeng/commonsdk/statistics/proto/d$e;

    .line 76
    .line 77
    sget-object v2, Lcom/umeng/commonsdk/statistics/proto/d$e;->d:Ljava/util/Map;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/proto/d$e;->b()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    return-void
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

.method private constructor <init>(Ljava/lang/String;ISLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(S",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-short p3, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->e:S

    .line 5
    .line 6
    iput-object p4, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->f:Ljava/lang/String;

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

.method public static a(I)Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->c:Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object p0

    .line 2
    :cond_1
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->b:Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object p0

    .line 3
    :cond_2
    sget-object p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->a:Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    .line 4
    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object p0
.end method

.method public static b(I)Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/proto/d$e;->a(I)Lcom/umeng/commonsdk/statistics/proto/d$e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " doesn\'t exist!"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    const-class v0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object p0
.end method

.method public static values()[Lcom/umeng/commonsdk/statistics/proto/d$e;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/statistics/proto/d$e;->g:[Lcom/umeng/commonsdk/statistics/proto/d$e;

    invoke-virtual {v0}, [Lcom/umeng/commonsdk/statistics/proto/d$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/umeng/commonsdk/statistics/proto/d$e;

    return-object v0
.end method


# virtual methods
.method public a()S
    .locals 1

    .line 5
    iget-short v0, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->e:S

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/proto/d$e;->f:Ljava/lang/String;

    return-object v0
.end method
