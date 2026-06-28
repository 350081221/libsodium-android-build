.class final Lcom/efs/sdk/memoryinfo/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/memoryinfo/e;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroid/content/Context;

.field final synthetic E:Lcom/efs/sdk/memoryinfo/e;


# direct methods
.method constructor <init>(Lcom/efs/sdk/memoryinfo/e;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    iput-object p2, p0, Lcom/efs/sdk/memoryinfo/e$1;->D:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    const-string/jumbo v0, "umid"

    .line 2
    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "um_umid_header"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 23
    .line 24
    invoke-static {p2}, Lcom/efs/sdk/memoryinfo/e;->a(Lcom/efs/sdk/memoryinfo/e;)Lcom/efs/sdk/base/EfsReporter;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1}, Lcom/efs/sdk/base/EfsReporter;->addPublicParams(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    const-class p1, Lcom/efs/sdk/memoryinfo/e;

    .line 32
    .line 33
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    :try_start_1
    iget-object p2, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 35
    .line 36
    invoke-static {p2}, Lcom/efs/sdk/memoryinfo/e;->b(Lcom/efs/sdk/memoryinfo/e;)Z

    .line 37
    .line 38
    .line 39
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :try_start_2
    iget-object p1, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/efs/sdk/memoryinfo/e;->c(Lcom/efs/sdk/memoryinfo/e;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 63
    .line 64
    invoke-static {v0, p2}, Lcom/efs/sdk/memoryinfo/e;->a(Lcom/efs/sdk/memoryinfo/e;Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string p2, "send cache:"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object p2, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 76
    .line 77
    invoke-static {p2}, Lcom/efs/sdk/memoryinfo/e;->c(Lcom/efs/sdk/memoryinfo/e;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    sget-boolean p2, Lcom/efs/sdk/memoryinfo/a;->DEBUG:Z

    .line 93
    .line 94
    if-eqz p2, :cond_1

    .line 95
    .line 96
    const-string p2, "MemoryCollect"

    .line 97
    .line 98
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_1
    iget-object p1, p0, Lcom/efs/sdk/memoryinfo/e$1;->E:Lcom/efs/sdk/memoryinfo/e;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/efs/sdk/memoryinfo/e;->c(Lcom/efs/sdk/memoryinfo/e;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/efs/sdk/memoryinfo/e$1;->D:Landroid/content/Context;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string/jumbo p2, "umid"

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->unregistImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception p2

    .line 124
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 125
    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    :cond_2
    :goto_1
    return-void

    .line 127
    :catchall_1
    move-exception p1

    .line 128
    const-string/jumbo p2, "umid "

    .line 129
    .line 130
    .line 131
    invoke-static {p2, p1}, Lcom/efs/sdk/memoryinfo/f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    return-void
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
