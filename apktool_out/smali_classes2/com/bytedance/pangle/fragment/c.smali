.class public final Lcom/bytedance/pangle/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field a:Landroid/app/Fragment;


# direct methods
.method public constructor <init>(Landroid/app/Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/fragment/c;->a:Landroid/app/Fragment;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPostSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_pangle"

    .line 2
    .line 3
    const-string v1, "mActive"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/pangle/fragment/c;->a:Landroid/app/Fragment;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eq v2, p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_0
    const-string p1, "android:fragments"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1, v1}, Lcom/bytedance/pangle/util/FieldUtils;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, [Ljava/lang/Object;

    .line 28
    .line 29
    if-nez p2, :cond_2

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    array-length v2, p2

    .line 33
    const/4 v3, 0x0

    .line 34
    move v4, v3

    .line 35
    :goto_0
    if-ge v4, v2, :cond_5

    .line 36
    .line 37
    aget-object v5, p2, v4

    .line 38
    .line 39
    const-string v6, "mTag"

    .line 40
    .line 41
    invoke-static {v5, v6}, Lcom/bytedance/pangle/util/FieldUtils;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_plugin"

    .line 46
    .line 47
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    instance-of v7, v6, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    move-object v7, v6

    .line 59
    check-cast v7, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_6

    .line 66
    .line 67
    check-cast v6, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/4 v5, 0x0

    .line 80
    :cond_6
    :goto_1
    if-eqz v5, :cond_9

    .line 81
    .line 82
    const-string v0, "android.app.FragmentState"

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    array-length v2, p2

    .line 89
    add-int/lit8 v2, v2, -0x1

    .line 90
    .line 91
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, [Ljava/lang/Object;

    .line 96
    .line 97
    array-length v2, p2

    .line 98
    add-int/lit8 v2, v2, -0x1

    .line 99
    .line 100
    new-array v2, v2, [I

    .line 101
    .line 102
    move v4, v3

    .line 103
    :goto_2
    array-length v6, p2

    .line 104
    if-ge v3, v6, :cond_8

    .line 105
    .line 106
    aget-object v6, p2, v3

    .line 107
    .line 108
    if-eq v6, v5, :cond_7

    .line 109
    .line 110
    aput-object v6, v0, v4

    .line 111
    .line 112
    aput v3, v2, v4

    .line 113
    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_8
    invoke-static {p1, v1, v0}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const-string p2, "mAdded"

    .line 123
    .line 124
    invoke-static {p1, p2, v2}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_9
    return-void

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 130
    .line 131
    .line 132
    return-void
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

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_pangle"

    .line 2
    .line 3
    const-string v1, "mActive"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/pangle/fragment/c;->a:Landroid/app/Fragment;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eq v2, p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_0
    const-string p1, "android:fragments"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1, v1}, Lcom/bytedance/pangle/util/FieldUtils;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, [Ljava/lang/Object;

    .line 28
    .line 29
    if-nez p2, :cond_2

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    array-length v2, p2

    .line 33
    const/4 v3, 0x0

    .line 34
    move v4, v3

    .line 35
    :goto_0
    if-ge v4, v2, :cond_5

    .line 36
    .line 37
    aget-object v5, p2, v4

    .line 38
    .line 39
    const-string v6, "mTag"

    .line 40
    .line 41
    invoke-static {v5, v6}, Lcom/bytedance/pangle/util/FieldUtils;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag_plugin"

    .line 46
    .line 47
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    instance-of v7, v6, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    move-object v7, v6

    .line 59
    check-cast v7, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_6

    .line 66
    .line 67
    check-cast v6, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/4 v5, 0x0

    .line 80
    :cond_6
    :goto_1
    if-eqz v5, :cond_9

    .line 81
    .line 82
    const-string v0, "android.app.FragmentState"

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    array-length v2, p2

    .line 89
    add-int/lit8 v2, v2, -0x1

    .line 90
    .line 91
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, [Ljava/lang/Object;

    .line 96
    .line 97
    array-length v2, p2

    .line 98
    add-int/lit8 v2, v2, -0x1

    .line 99
    .line 100
    new-array v2, v2, [I

    .line 101
    .line 102
    move v4, v3

    .line 103
    :goto_2
    array-length v6, p2

    .line 104
    if-ge v3, v6, :cond_8

    .line 105
    .line 106
    aget-object v6, p2, v3

    .line 107
    .line 108
    if-eq v6, v5, :cond_7

    .line 109
    .line 110
    aput-object v6, v0, v4

    .line 111
    .line 112
    aput v3, v2, v4

    .line 113
    .line 114
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_8
    invoke-static {p1, v1, v0}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const-string p2, "mAdded"

    .line 123
    .line 124
    invoke-static {p1, p2, v2}, Lcom/bytedance/pangle/util/FieldUtils;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_9
    return-void

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 130
    .line 131
    .line 132
    return-void
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

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
