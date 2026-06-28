.class public Lcom/lody/virtual/server/pm/installer/SessionInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/lody/virtual/server/pm/installer/SessionInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public active:Z

.field public appIcon:Landroid/graphics/Bitmap;

.field public appLabel:Ljava/lang/CharSequence;

.field public appPackageName:Ljava/lang/String;

.field public installerPackageName:Ljava/lang/String;

.field public mode:I

.field public progress:F

.field public resolvedBaseCodePath:Ljava/lang/String;

.field public sealed:Z

.field public sessionId:I

.field public sizeBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/pm/installer/SessionInfo$1;

    invoke-direct {v0}, Lcom/lody/virtual/server/pm/installer/SessionInfo$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sessionId:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->installerPackageName:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->resolvedBaseCodePath:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->progress:F

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sealed:Z

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->active:Z

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->mode:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sizeBytes:J

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appPackageName:Ljava/lang/String;

    .line 12
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appIcon:Landroid/graphics/Bitmap;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appLabel:Ljava/lang/CharSequence;

    return-void
.end method

.method public static realloc(Landroid/content/pm/PackageInstaller$SessionInfo;)Lcom/lody/virtual/server/pm/installer/SessionInfo;
    .locals 3

    .line 1
    new-instance v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/installer/SessionInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sessionId:Lmirror/RefInt;

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sessionId:I

    .line 13
    .line 14
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->installerPackageName:Lmirror/RefObject;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    iput-object v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->installerPackageName:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->resolvedBaseCodePath:Lmirror/RefObject;

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    iput-object v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->resolvedBaseCodePath:Ljava/lang/String;

    .line 33
    .line 34
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->progress:Lmirror/RefFloat;

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Lmirror/RefFloat;->get(Ljava/lang/Object;)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iput v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->progress:F

    .line 41
    .line 42
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sealed:Lmirror/RefBoolean;

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput-boolean v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sealed:Z

    .line 49
    .line 50
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->active:Lmirror/RefBoolean;

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Lmirror/RefBoolean;->get(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput-boolean v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->active:Z

    .line 57
    .line 58
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->mode:Lmirror/RefInt;

    .line 59
    .line 60
    invoke-virtual {v1, p0}, Lmirror/RefInt;->get(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->mode:I

    .line 65
    .line 66
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sizeBytes:Lmirror/RefLong;

    .line 67
    .line 68
    invoke-virtual {v1, p0}, Lmirror/RefLong;->get(Ljava/lang/Object;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    iput-wide v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sizeBytes:J

    .line 73
    .line 74
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appPackageName:Lmirror/RefObject;

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    iput-object v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appPackageName:Ljava/lang/String;

    .line 83
    .line 84
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appIcon:Lmirror/RefObject;

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/graphics/Bitmap;

    .line 91
    .line 92
    iput-object v1, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appIcon:Landroid/graphics/Bitmap;

    .line 93
    .line 94
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appLabel:Lmirror/RefObject;

    .line 95
    .line 96
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Ljava/lang/CharSequence;

    .line 101
    .line 102
    iput-object p0, v0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appLabel:Ljava/lang/CharSequence;

    .line 103
    .line 104
    return-object v0
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


# virtual methods
.method public alloc()Landroid/content/pm/PackageInstaller$SessionInfo;
    .locals 4

    .line 1
    sget-object v0, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->ctor:Lmirror/RefConstructor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmirror/RefConstructor;->newInstance()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/pm/PackageInstaller$SessionInfo;

    .line 8
    .line 9
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sessionId:Lmirror/RefInt;

    .line 10
    .line 11
    iget v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sessionId:I

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->installerPackageName:Lmirror/RefObject;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->installerPackageName:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->resolvedBaseCodePath:Lmirror/RefObject;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->resolvedBaseCodePath:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->progress:Lmirror/RefFloat;

    .line 31
    .line 32
    iget v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->progress:F

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lmirror/RefFloat;->set(Ljava/lang/Object;F)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sealed:Lmirror/RefBoolean;

    .line 38
    .line 39
    iget-boolean v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sealed:Z

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lmirror/RefBoolean;->set(Ljava/lang/Object;Z)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->active:Lmirror/RefBoolean;

    .line 45
    .line 46
    iget-boolean v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->active:Z

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, Lmirror/RefBoolean;->set(Ljava/lang/Object;Z)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->mode:Lmirror/RefInt;

    .line 52
    .line 53
    iget v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->mode:I

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->sizeBytes:Lmirror/RefLong;

    .line 59
    .line 60
    iget-wide v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sizeBytes:J

    .line 61
    .line 62
    invoke-virtual {v1, v0, v2, v3}, Lmirror/RefLong;->set(Ljava/lang/Object;J)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appPackageName:Lmirror/RefObject;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appPackageName:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appIcon:Lmirror/RefObject;

    .line 73
    .line 74
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appIcon:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    sget-object v1, Lmirror/android/content/pm/PackageInstaller$SessionInfo;->appLabel:Lmirror/RefObject;

    .line 80
    .line 81
    iget-object v2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appLabel:Ljava/lang/CharSequence;

    .line 82
    .line 83
    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-object v0
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

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sessionId:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->installerPackageName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->resolvedBaseCodePath:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->progress:F

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sealed:Z

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->active:Z

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->mode:I

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget-wide v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->sizeBytes:J

    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appPackageName:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appIcon:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lcom/lody/virtual/server/pm/installer/SessionInfo;->appLabel:Ljava/lang/CharSequence;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
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
.end method
