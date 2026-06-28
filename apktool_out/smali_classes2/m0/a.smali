.class public final Lm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/a$b;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "DynCon"

.field public static final B:I = 0x2710

.field public static final C:Ljava/lang/String; = "https://h5.m.taobao.com/mlapp/olist.html"

.field public static final D:I = 0xa

.field public static final E:Z = true

.field public static final F:Z = false

.field public static final G:Z = true

.field public static final H:Z = true

.field public static final I:Z = false

.field public static final J:Z = false

.field public static final K:Z = false

.field public static final L:Z = false

.field public static final M:Z = true

.field public static final N:Ljava/lang/String; = ""

.field public static final O:Z = false

.field public static final P:Z = false

.field public static final Q:I = 0x3e8

.field public static final R:Z = true

.field public static final S:Ljava/lang/String; = ""

.field public static final T:Z = false

.field public static final U:Z = false

.field public static final V:I = 0x3e8

.field public static final W:I = 0x4e20

.field public static final X:Z = false

.field public static final Y:Ljava/lang/String; = "alipay_cashier_dynamic_config"

.field public static final Z:Ljava/lang/String; = "timeout"

.field public static final a0:Ljava/lang/String; = "h5_port_degrade"

.field public static final b0:Ljava/lang/String; = "st_sdk_config"

.field public static final c0:Ljava/lang/String; = "tbreturl"

.field public static final d0:Ljava/lang/String; = "launchAppSwitch"

.field public static final e0:Ljava/lang/String; = "configQueryInterval"

.field public static final f0:Ljava/lang/String; = "deg_log_mcgw"

.field public static final g0:Ljava/lang/String; = "deg_start_srv_first"

.field public static final h0:Ljava/lang/String; = "prev_jump_dual"

.field public static final i0:Ljava/lang/String; = "bind_use_imp"

.field public static final j0:Ljava/lang/String; = "retry_bnd_once"

.field public static final k0:Ljava/lang/String; = "skip_trans"

.field public static final l0:Ljava/lang/String; = "start_trans"

.field public static final m0:Ljava/lang/String; = "up_before_pay"

.field public static final n0:Ljava/lang/String; = "lck_k"

.field public static final o0:Ljava/lang/String; = "use_sc_lck_a"

.field public static final p0:Ljava/lang/String; = "utdid_factor"

.field public static final q0:Ljava/lang/String; = "cfg_max_time"

.field public static final r0:Ljava/lang/String; = "get_oa_id"

.field public static final s0:Ljava/lang/String; = "notifyFailApp"

.field public static final t0:Ljava/lang/String; = "startactivity_in_ui_thread"

.field public static final u0:Ljava/lang/String; = "intercept_batch"

.field public static final v0:Ljava/lang/String; = "bind_with_startActivity"

.field public static final w0:Ljava/lang/String; = "enableStartActivityFallback"

.field public static final x0:Ljava/lang/String; = "enableBindExFallback"

.field public static y0:Lm0/a;


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:I

.field public v:Z

.field public w:Lorg/json/JSONObject;

.field public x:Z

.field public y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm0/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2710

    .line 5
    .line 6
    iput v0, p0, Lm0/a;->a:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lm0/a;->b:Z

    .line 10
    .line 11
    const-string v1, "https://h5.m.taobao.com/mlapp/olist.html"

    .line 12
    .line 13
    iput-object v1, p0, Lm0/a;->c:Ljava/lang/String;

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    iput v1, p0, Lm0/a;->d:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Lm0/a;->e:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Lm0/a;->f:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lm0/a;->g:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lm0/a;->h:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lm0/a;->i:Z

    .line 29
    .line 30
    iput-boolean v1, p0, Lm0/a;->j:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lm0/a;->k:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lm0/a;->l:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lm0/a;->m:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Lm0/a;->n:Z

    .line 39
    .line 40
    iput-boolean v1, p0, Lm0/a;->o:Z

    .line 41
    .line 42
    const-string v2, ""

    .line 43
    .line 44
    iput-object v2, p0, Lm0/a;->p:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v2, p0, Lm0/a;->q:Ljava/lang/String;

    .line 47
    .line 48
    iput-boolean v0, p0, Lm0/a;->r:Z

    .line 49
    .line 50
    iput-boolean v0, p0, Lm0/a;->s:Z

    .line 51
    .line 52
    iput-boolean v0, p0, Lm0/a;->t:Z

    .line 53
    .line 54
    const/16 v2, 0x3e8

    .line 55
    .line 56
    iput v2, p0, Lm0/a;->u:I

    .line 57
    .line 58
    iput-boolean v0, p0, Lm0/a;->v:Z

    .line 59
    .line 60
    iput-boolean v1, p0, Lm0/a;->x:Z

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lm0/a;->y:Ljava/util/List;

    .line 64
    .line 65
    const/4 v0, -0x1

    .line 66
    iput v0, p0, Lm0/a;->z:I

    .line 67
    .line 68
    return-void
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
.end method

.method private I()I
    .locals 1

    iget v0, p0, Lm0/a;->u:I

    return v0
.end method

.method public static J()Lm0/a;
    .locals 1

    .line 1
    sget-object v0, Lm0/a;->y0:Lm0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm0/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lm0/a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lm0/a;->y0:Lm0/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lm0/a;->A()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lm0/a;->y0:Lm0/a;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private a()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm0/a;->s()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string/jumbo v2, "timeout"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lm0/a;->F()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const-string v2, "h5_port_degrade"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lm0/a;->y()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "tbreturl"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lm0/a;->n()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const-string v2, "configQueryInterval"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lm0/a;->t()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lm0/a$b;->c(Ljava/util/List;)Lorg/json/JSONArray;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "launchAppSwitch"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lm0/a;->q()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const-string v2, "intercept_batch"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lm0/a;->o()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const-string v2, "deg_log_mcgw"

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lm0/a;->p()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const-string v2, "deg_start_srv_first"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lm0/a;->u()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const-string v2, "prev_jump_dual"

    .line 88
    .line 89
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lm0/a;->l()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const-string v2, "bind_use_imp"

    .line 97
    .line 98
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lm0/a;->v()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const-string v2, "retry_bnd_once"

    .line 106
    .line 107
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lm0/a;->x()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const-string v2, "skip_trans"

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lm0/a;->H()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const-string v2, "start_trans"

    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lm0/a;->z()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const-string/jumbo v2, "up_before_pay"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lm0/a;->w()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const-string/jumbo v2, "use_sc_lck_a"

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lm0/a;->r()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v2, "lck_k"

    .line 153
    .line 154
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lm0/a;->m()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const-string v2, "bind_with_startActivity"

    .line 162
    .line 163
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    invoke-direct {p0}, Lm0/a;->I()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    const-string v2, "cfg_max_time"

    .line 171
    .line 172
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lm0/a;->E()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    const-string v2, "get_oa_id"

    .line 180
    .line 181
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lm0/a;->C()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    const-string v2, "notifyFailApp"

    .line 189
    .line 190
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lm0/a;->D()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    const-string v2, "enableStartActivityFallback"

    .line 198
    .line 199
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lm0/a;->B()Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    const-string v2, "enableBindExFallback"

    .line 207
    .line 208
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Lm0/a;->G()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    const-string v2, "startactivity_in_ui_thread"

    .line 216
    .line 217
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Lm0/a;->b()Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v2, "ap_args"

    .line 225
    .line 226
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    return-object v0
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
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Lm0/a;->f(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic d(Lm0/a;Ly0/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lm0/a;->g(Ly0/a;)V

    return-void
.end method

.method public static synthetic e(Lm0/a;Ly0/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm0/a;->i(Ly0/a;Ljava/lang/String;)V

    return-void
.end method

.method private f(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    const-string/jumbo v0, "timeout"

    .line 2
    .line 3
    .line 4
    const/16 v1, 0x2710

    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lm0/a;->a:I

    .line 11
    .line 12
    const-string v0, "h5_port_degrade"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput-boolean v0, p0, Lm0/a;->b:Z

    .line 20
    .line 21
    const-string v0, "tbreturl"

    .line 22
    .line 23
    const-string v2, "https://h5.m.taobao.com/mlapp/olist.html"

    .line 24
    .line 25
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lm0/a;->c:Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "configQueryInterval"

    .line 36
    .line 37
    const/16 v2, 0xa

    .line 38
    .line 39
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lm0/a;->d:I

    .line 44
    .line 45
    const-string v0, "launchAppSwitch"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lm0/a$b;->a(Lorg/json/JSONArray;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lm0/a;->y:Ljava/util/List;

    .line 56
    .line 57
    const-string v0, "intercept_batch"

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput-boolean v0, p0, Lm0/a;->e:Z

    .line 65
    .line 66
    const-string v0, "deg_log_mcgw"

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput-boolean v0, p0, Lm0/a;->h:Z

    .line 73
    .line 74
    const-string v0, "deg_start_srv_first"

    .line 75
    .line 76
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput-boolean v0, p0, Lm0/a;->i:Z

    .line 81
    .line 82
    const-string v0, "prev_jump_dual"

    .line 83
    .line 84
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput-boolean v0, p0, Lm0/a;->j:Z

    .line 89
    .line 90
    const-string v0, "bind_use_imp"

    .line 91
    .line 92
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iput-boolean v0, p0, Lm0/a;->k:Z

    .line 97
    .line 98
    const-string v0, "retry_bnd_once"

    .line 99
    .line 100
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput-boolean v0, p0, Lm0/a;->l:Z

    .line 105
    .line 106
    const-string v0, "skip_trans"

    .line 107
    .line 108
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iput-boolean v0, p0, Lm0/a;->m:Z

    .line 113
    .line 114
    const-string v0, "start_trans"

    .line 115
    .line 116
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput-boolean v0, p0, Lm0/a;->n:Z

    .line 121
    .line 122
    const-string/jumbo v0, "up_before_pay"

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    iput-boolean v0, p0, Lm0/a;->o:Z

    .line 130
    .line 131
    const-string v0, "lck_k"

    .line 132
    .line 133
    const-string v3, ""

    .line 134
    .line 135
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, Lm0/a;->p:Ljava/lang/String;

    .line 140
    .line 141
    const-string/jumbo v0, "use_sc_lck_a"

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iput-boolean v0, p0, Lm0/a;->t:Z

    .line 149
    .line 150
    const-string v0, "notifyFailApp"

    .line 151
    .line 152
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput-boolean v0, p0, Lm0/a;->v:Z

    .line 157
    .line 158
    const-string v0, "bind_with_startActivity"

    .line 159
    .line 160
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, Lm0/a;->q:Ljava/lang/String;

    .line 165
    .line 166
    const-string v0, "cfg_max_time"

    .line 167
    .line 168
    const/16 v3, 0x3e8

    .line 169
    .line 170
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    iput v0, p0, Lm0/a;->u:I

    .line 175
    .line 176
    const-string v0, "get_oa_id"

    .line 177
    .line 178
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iput-boolean v0, p0, Lm0/a;->x:Z

    .line 183
    .line 184
    const-string v0, "enableStartActivityFallback"

    .line 185
    .line 186
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iput-boolean v0, p0, Lm0/a;->r:Z

    .line 191
    .line 192
    const-string v0, "enableBindExFallback"

    .line 193
    .line 194
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iput-boolean v0, p0, Lm0/a;->s:Z

    .line 199
    .line 200
    const-string v0, "startactivity_in_ui_thread"

    .line 201
    .line 202
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    iput-boolean v0, p0, Lm0/a;->f:Z

    .line 207
    .line 208
    const-string v0, "ap_args"

    .line 209
    .line 210
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iput-object p1, p0, Lm0/a;->w:Lorg/json/JSONObject;

    .line 215
    .line 216
    return-void
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

.method private g(Ly0/a;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lm0/a;->a()Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ly0/b;->e()Ly0/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ly0/b;->c()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const-string v2, "alipay_cashier_dynamic_config"

    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v1, v2, v0}, La1/j;->e(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void
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
.end method

.method private i(Ly0/a;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p2, "st_sdk_config"

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, v0}, La1/a;->c(Ly0/a;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, p2, v0}, La1/a;->e(Ly0/a;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 24
    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-direct {p0, p2}, Lm0/a;->f(Lorg/json/JSONObject;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string p1, "DynCon"

    .line 33
    .line 34
    const-string p2, "empty config"

    .line 35
    .line 36
    invoke-static {p1, p2}, La1/e;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public A()V
    .locals 5

    .line 1
    invoke-static {}, Ly0/b;->e()Ly0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ly0/b;->c()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Ly0/a;->w()Ly0/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "alipay_cashier_dynamic_config"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v1, v0, v2, v3}, La1/j;->b(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Ly0/a;->w()Ly0/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string/jumbo v3, "utdid_factor"

    .line 25
    .line 26
    .line 27
    const-string v4, "-1"

    .line 28
    .line 29
    invoke-static {v2, v0, v3, v4}, La1/j;->b(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lm0/a;->z:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    :catch_0
    invoke-direct {p0, v1}, Lm0/a;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->s:Z

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->v:Z

    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->r:Z

    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->x:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->b:Z

    return v0
.end method

.method public G()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->f:Z

    return v0
.end method

.method public H()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->n:Z

    return v0
.end method

.method public b()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lm0/a;->w:Lorg/json/JSONObject;

    return-object v0
.end method

.method public h(Ly0/a;Landroid/content/Context;ZI)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "oncfg|"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "|"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "biz"

    .line 28
    .line 29
    invoke-static {p1, v1, v0}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lm0/a$a;

    .line 33
    .line 34
    move-object v2, v0

    .line 35
    move-object v3, p0

    .line 36
    move-object v4, p1

    .line 37
    move-object v5, p2

    .line 38
    move v6, p3

    .line 39
    move v7, p4

    .line 40
    invoke-direct/range {v2 .. v7}, Lm0/a$a;-><init>(Lm0/a;Ly0/a;Landroid/content/Context;ZI)V

    .line 41
    .line 42
    .line 43
    if-eqz p3, :cond_0

    .line 44
    .line 45
    invoke-static {}, La1/n;->d0()Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-nez p2, :cond_0

    .line 50
    .line 51
    invoke-direct {p0}, Lm0/a;->I()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    int-to-long p3, p2

    .line 56
    const-string v2, "AlipayDCPBlok"

    .line 57
    .line 58
    invoke-static {p3, p4, v0, v2}, La1/n;->v(JLjava/lang/Runnable;Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-nez p3, :cond_1

    .line 63
    .line 64
    new-instance p3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string p4, ""

    .line 70
    .line 71
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const-string p3, "LogAppFetchConfigTimeout"

    .line 82
    .line 83
    invoke-static {p1, v1, p3, p2}, Li0/a;->i(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    const-string p2, "AlipayDCP"

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_0
    return-void
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
.end method

.method public j(Z)V
    .locals 0

    iput-boolean p1, p0, Lm0/a;->g:Z

    return-void
.end method

.method public k(Landroid/content/Context;I)Z
    .locals 3

    .line 1
    iget v0, p0, Lm0/a;->z:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {}, La1/n;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lm0/a;->z:I

    .line 11
    .line 12
    invoke-static {}, Ly0/a;->w()Ly0/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lm0/a;->z:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string/jumbo v2, "utdid_factor"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p1, v2, v1}, La1/j;->e(Ly0/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget p1, p0, Lm0/a;->z:I

    .line 29
    .line 30
    if-ge p1, p2, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    :goto_0
    return p1
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
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->k:Z

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm0/a;->q:Ljava/lang/String;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lm0/a;->d:I

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->h:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->i:Z

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->e:Z

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm0/a;->p:Ljava/lang/String;

    return-object v0
.end method

.method public s()I
    .locals 3

    .line 1
    iget v0, p0, Lm0/a;->a:I

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    const-string v2, "DynCon"

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x4e20

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v1, "time = "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lm0/a;->a:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, La1/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lm0/a;->a:I

    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    :goto_0
    const-string/jumbo v0, "time(def) = 10000"

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v0}, La1/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v0, 0x2710

    .line 47
    .line 48
    return v0
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
.end method

.method public t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm0/a$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/a;->y:Ljava/util/List;

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->j:Z

    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->l:Z

    return v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->t:Z

    return v0
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->m:Z

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm0/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, Lm0/a;->o:Z

    return v0
.end method
