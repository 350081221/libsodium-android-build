.class Lcom/lody/virtual/server/am/TaskRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final activities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/am/ActivityRecord;",
            ">;"
        }
    .end annotation
.end field

.field public affinity:Ljava/lang/String;

.field public taskId:I

.field public taskRoot:Landroid/content/Intent;

.field public userId:I


# direct methods
.method constructor <init>(IILjava/lang/String;Landroid/content/Intent;)V
    .locals 1

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
    iput-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 10
    .line 11
    iput p1, p0, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 12
    .line 13
    iput p2, p0, Lcom/lody/virtual/server/am/TaskRecord;->userId:I

    .line 14
    .line 15
    iput-object p3, p0, Lcom/lody/virtual/server/am/TaskRecord;->affinity:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/lody/virtual/server/am/TaskRecord;->taskRoot:Landroid/content/Intent;

    .line 18
    .line 19
    return-void
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
.method public finish()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    iput-boolean v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
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

.method getAppTaskInfo()Lcom/lody/virtual/remote/AppTaskInfo;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/lody/virtual/server/am/ActivityRecord;->component:Landroid/content/ComponentName;

    .line 22
    .line 23
    new-instance v1, Lcom/lody/virtual/remote/AppTaskInfo;

    .line 24
    .line 25
    iget v2, p0, Lcom/lody/virtual/server/am/TaskRecord;->taskId:I

    .line 26
    .line 27
    iget-object v3, p0, Lcom/lody/virtual/server/am/TaskRecord;->taskRoot:Landroid/content/Intent;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/lody/virtual/remote/AppTaskInfo;-><init>(ILandroid/content/Intent;Landroid/content/ComponentName;Landroid/content/ComponentName;)V

    .line 34
    .line 35
    .line 36
    return-object v1
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

.method getRootActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 20
    .line 21
    iget-boolean v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-boolean v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    monitor-exit v0

    .line 33
    return-object v2

    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    const/4 v0, 0x0

    .line 36
    return-object v0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw v1
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

.method public getTopActivityRecord()Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/lody/virtual/server/am/TaskRecord;->getTopActivityRecord(Z)Lcom/lody/virtual/server/am/ActivityRecord;

    move-result-object v0

    return-object v0
.end method

.method public getTopActivityRecord(Z)Lcom/lody/virtual/server/am/ActivityRecord;
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    monitor-exit v0

    return-object v2

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    .line 6
    iget-object v3, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 7
    iget-boolean v4, v3, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_3

    .line 8
    iget-boolean v4, v3, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 9
    :cond_3
    :goto_2
    monitor-exit v0

    return-object v3

    .line 10
    :cond_4
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isFinishing()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/TaskRecord;->activities:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/lody/virtual/server/am/ActivityRecord;

    .line 21
    .line 22
    iget-boolean v3, v2, Lcom/lody/virtual/server/am/ActivityRecord;->started:Z

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iget-boolean v2, v2, Lcom/lody/virtual/server/am/ActivityRecord;->marked:Z

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_1
    monitor-exit v0

    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw v1
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
