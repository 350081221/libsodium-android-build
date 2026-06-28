.class public Lcom/huawei/hms/base/log/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Lcom/huawei/hms/base/log/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    iput v0, p0, Lcom/huawei/hms/base/log/a;->a:I

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/hms/base/log/e;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/hms/base/log/e;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    .line 13
    .line 14
    return-void
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


# virtual methods
.method public a()Lcom/huawei/hms/base/log/b;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    return-object v0
.end method

.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/base/log/c;
    .locals 3

    .line 14
    new-instance v0, Lcom/huawei/hms/base/log/c;

    iget-object v1, p0, Lcom/huawei/hms/base/log/a;->b:Ljava/lang/String;

    const/16 v2, 0x8

    invoke-direct {v0, v2, v1, p1, p2}, Lcom/huawei/hms/base/log/c;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 15
    invoke-virtual {v0, p3}, Lcom/huawei/hms/base/log/c;->a(Ljava/lang/Object;)Lcom/huawei/hms/base/log/c;

    .line 16
    invoke-virtual {v0, p4}, Lcom/huawei/hms/base/log/c;->a(Ljava/lang/Throwable;)Lcom/huawei/hms/base/log/c;

    return-object v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 7
    invoke-virtual {p0, p1}, Lcom/huawei/hms/base/log/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/huawei/hms/base/log/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/base/log/c;

    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    invoke-interface {v1, v0, p1, p2, p3}, Lcom/huawei/hms/base/log/b;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/huawei/hms/base/log/a;->a:I

    .line 2
    iput-object p3, p0, Lcom/huawei/hms/base/log/a;->b:Ljava/lang/String;

    .line 3
    iget-object p2, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    const-string p3, "HMSCore"

    invoke-interface {p2, p1, p3}, Lcom/huawei/hms/base/log/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/huawei/hms/base/log/b;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 11
    invoke-virtual {p0, v1, p1, p2, v0}, Lcom/huawei/hms/base/log/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/base/log/c;

    move-result-object v0

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-object v2, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    invoke-interface {v2, v0, v1, p1, p2}, Lcom/huawei/hms/base/log/b;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(I)Z
    .locals 1

    .line 6
    iget v0, p0, Lcom/huawei/hms/base/log/a;->a:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/hms/base/log/a;->a(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/hms/base/log/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/base/log/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/huawei/hms/base/log/c;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/huawei/hms/base/log/a;->c:Lcom/huawei/hms/base/log/b;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 p3, 0xa

    .line 45
    .line 46
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {p4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-interface {v1, v0, p1, p2, p3}, Lcom/huawei/hms/base/log/b;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
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
