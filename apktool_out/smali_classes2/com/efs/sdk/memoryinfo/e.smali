.class Lcom/efs/sdk/memoryinfo/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/efs/sdk/base/protocol/record/EfsJSONLog;",
            ">;"
        }
    .end annotation
.end field

.field volatile C:Z

.field private final a:Lcom/efs/sdk/base/EfsReporter;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/efs/sdk/memoryinfo/e;->B:Ljava/util/List;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/efs/sdk/memoryinfo/e;->a:Lcom/efs/sdk/base/EfsReporter;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    xor-int/2addr v1, v2

    .line 23
    iput-boolean v1, p0, Lcom/efs/sdk/memoryinfo/e;->C:Z

    .line 24
    .line 25
    iget-boolean v1, p0, Lcom/efs/sdk/memoryinfo/e;->C:Z

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    new-instance v0, Lcom/efs/sdk/memoryinfo/e$1;

    .line 34
    .line 35
    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/memoryinfo/e$1;-><init>(Lcom/efs/sdk/memoryinfo/e;Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo p1, "umid"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1, v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {p1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const-string/jumbo v1, "um_umid_header"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lcom/efs/sdk/base/EfsReporter;->addPublicParams(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    return-void
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
.end method

.method static synthetic a(Lcom/efs/sdk/memoryinfo/e;)Lcom/efs/sdk/base/EfsReporter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/efs/sdk/memoryinfo/e;->a:Lcom/efs/sdk/base/EfsReporter;

    return-object p0
.end method

.method static synthetic a(Lcom/efs/sdk/memoryinfo/e;Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/efs/sdk/memoryinfo/e;->a(Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V

    return-void
.end method

.method static synthetic b(Lcom/efs/sdk/memoryinfo/e;)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/efs/sdk/memoryinfo/e;->C:Z

    return v0
.end method

.method static synthetic c(Lcom/efs/sdk/memoryinfo/e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/efs/sdk/memoryinfo/e;->B:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method final a(Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V
    .locals 1

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/e;->a:Lcom/efs/sdk/base/EfsReporter;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "send"

    .line 4
    invoke-static {v0, p1}, Lcom/efs/sdk/memoryinfo/f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
