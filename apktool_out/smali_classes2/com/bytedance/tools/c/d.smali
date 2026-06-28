.class public Lcom/bytedance/tools/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/tools/c/d;
    .locals 10

    .line 1
    new-instance v0, Lcom/bytedance/tools/c/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/tools/c/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    const-string v3, "setting_rit"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const-string v5, "rit=?"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    new-array v6, v2, [Ljava/lang/String;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p1, v6, v2

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const-string v9, "rit ASC"

    .line 23
    .line 24
    move-object v2, p0

    .line 25
    invoke-static/range {v2 .. v9}, Lcom/bytedance/tools/d/d;->b(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v0

    .line 37
    :cond_1
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 38
    .line 39
    .line 40
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    :try_start_2
    const-string p0, "slot"

    .line 44
    .line 45
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p1, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-static {p0}, Lcom/bytedance/tools/d/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string p0, "img_width"

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->c:Ljava/lang/String;

    .line 69
    .line 70
    const-string p0, "img_height"

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->d:Ljava/lang/String;

    .line 77
    .line 78
    const-string p0, "express_width"

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->e:Ljava/lang/String;

    .line 85
    .line 86
    const-string p0, "express_height"

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->f:Ljava/lang/String;

    .line 93
    .line 94
    const-string p0, "ad_count"

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    iput p0, v0, Lcom/bytedance/tools/c/d;->g:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catch_0
    move-exception p0

    .line 104
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 105
    .line 106
    .line 107
    :goto_0
    :try_start_4
    new-instance p0, Lorg/json/JSONObject;

    .line 108
    .line 109
    const-string/jumbo p1, "value"

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-interface {v1, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    new-instance p1, Lorg/json/JSONObject;

    .line 124
    .line 125
    const-string v2, "message"

    .line 126
    .line 127
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, Lcom/bytedance/tools/d/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string p0, "slot_type"

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-static {p0}, Lcom/bytedance/tools/c/d;->d(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->b:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :catch_1
    move-exception p0

    .line 152
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 153
    .line 154
    .line 155
    :goto_1
    :try_start_6
    const-string p0, "config"

    .line 156
    .line 157
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance p1, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-static {p0}, Lcom/bytedance/tools/d/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string p0, "aid"

    .line 175
    .line 176
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->h:Ljava/lang/String;

    .line 181
    .line 182
    const-string p0, "cid"

    .line 183
    .line 184
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->i:Ljava/lang/String;

    .line 189
    .line 190
    const-string p0, "ext"

    .line 191
    .line 192
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->j:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catch_2
    move-exception p0

    .line 200
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_2
    :goto_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :catchall_0
    move-exception p0

    .line 208
    if-eqz v1, :cond_3

    .line 209
    .line 210
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 211
    .line 212
    .line 213
    :cond_3
    throw p0
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public static b(Ljava/lang/String;)Lcom/bytedance/tools/c/d;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/tools/c/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/tools/c/d;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "ritId"

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 18
    .line 19
    const-string p0, "imgWidth"

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->c:Ljava/lang/String;

    .line 26
    .line 27
    const-string p0, "imgHeight"

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->d:Ljava/lang/String;

    .line 34
    .line 35
    const-string p0, "expressWidth"

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->e:Ljava/lang/String;

    .line 42
    .line 43
    const-string p0, "expressHeight"

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->f:Ljava/lang/String;

    .line 50
    .line 51
    const-string p0, "adCount"

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    iput p0, v0, Lcom/bytedance/tools/c/d;->g:I

    .line 58
    .line 59
    const-string p0, "previewAid"

    .line 60
    .line 61
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->h:Ljava/lang/String;

    .line 66
    .line 67
    const-string p0, "previewCid"

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->i:Ljava/lang/String;

    .line 74
    .line 75
    const-string p0, "previewExt"

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iput-object p0, v0, Lcom/bytedance/tools/c/d;->j:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v0
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
.end method

.method private static d(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string/jumbo p0, "\u672a\u77e5"

    return-object p0

    :pswitch_0
    const-string p0, "Draw"

    return-object p0

    :pswitch_1
    const-string/jumbo p0, "\u5168\u5c4f"

    return-object p0

    :pswitch_2
    const-string/jumbo p0, "\u6fc0\u52b1"

    return-object p0

    :pswitch_3
    const-string/jumbo p0, "\u8d34\u7247"

    return-object p0

    :pswitch_4
    const-string/jumbo p0, "\u4fe1\u606f\u6d41"

    return-object p0

    :pswitch_5
    const-string/jumbo p0, "\u5f00\u5c4f"

    return-object p0

    :pswitch_6
    const-string/jumbo p0, "\u63d2\u5c4f"

    return-object p0

    :pswitch_7
    const-string p0, "Banner"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "ritId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "imgWidth"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "imgHeight"

    .line 21
    .line 22
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "expressWidth"

    .line 28
    .line 29
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "expressHeight"

    .line 35
    .line 36
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "adCount"

    .line 42
    .line 43
    iget v2, p0, Lcom/bytedance/tools/c/d;->g:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v1, "previewAid"

    .line 49
    .line 50
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v1, "previewCid"

    .line 56
    .line 57
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->i:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "previewExt"

    .line 63
    .line 64
    iget-object v2, p0, Lcom/bytedance/tools/c/d;->j:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
