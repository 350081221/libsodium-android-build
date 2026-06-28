.class public final Landroid/support/v4/media/MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaDescriptionCompat$Builder;
    }
.end annotation


# static fields
.field public static final BT_FOLDER_TYPE_ALBUMS:J = 0x2L

.field public static final BT_FOLDER_TYPE_ARTISTS:J = 0x3L

.field public static final BT_FOLDER_TYPE_GENRES:J = 0x4L

.field public static final BT_FOLDER_TYPE_MIXED:J = 0x0L

.field public static final BT_FOLDER_TYPE_PLAYLISTS:J = 0x5L

.field public static final BT_FOLDER_TYPE_TITLES:J = 0x1L

.field public static final BT_FOLDER_TYPE_YEARS:J = 0x6L

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            ">;"
        }
    .end annotation
.end field

.field public static final DESCRIPTION_KEY_MEDIA_URI:Ljava/lang/String; = "android.support.v4.media.description.MEDIA_URI"
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end field

.field public static final DESCRIPTION_KEY_NULL_BUNDLE_FLAG:Ljava/lang/String; = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation
.end field

.field public static final EXTRA_BT_FOLDER_TYPE:Ljava/lang/String; = "android.media.extra.BT_FOLDER_TYPE"

.field public static final EXTRA_DOWNLOAD_STATUS:Ljava/lang/String; = "android.media.extra.DOWNLOAD_STATUS"

.field public static final STATUS_DOWNLOADED:J = 0x2L

.field public static final STATUS_DOWNLOADING:J = 0x1L

.field public static final STATUS_NOT_DOWNLOADED:J


# instance fields
.field private final mDescription:Ljava/lang/CharSequence;

.field private mDescriptionObj:Ljava/lang/Object;

.field private final mExtras:Landroid/os/Bundle;

.field private final mIcon:Landroid/graphics/Bitmap;

.field private final mIconUri:Landroid/net/Uri;

.field private final mMediaId:Ljava/lang/String;

.field private final mMediaUri:Landroid/net/Uri;

.field private final mSubtitle:Ljava/lang/CharSequence;

.field private final mTitle:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat$1;

    invoke-direct {v0}, Landroid/support/v4/media/MediaDescriptionCompat$1;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaId:Ljava/lang/String;

    .line 12
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mTitle:Ljava/lang/CharSequence;

    .line 13
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mSubtitle:Ljava/lang/CharSequence;

    .line 14
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescription:Ljava/lang/CharSequence;

    .line 15
    const-class v0, Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    iput-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIcon:Landroid/graphics/Bitmap;

    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iput-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIconUri:Landroid/net/Uri;

    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mExtras:Landroid/os/Bundle;

    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaUri:Landroid/net/Uri;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mTitle:Ljava/lang/CharSequence;

    .line 4
    iput-object p3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mSubtitle:Ljava/lang/CharSequence;

    .line 5
    iput-object p4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescription:Ljava/lang/CharSequence;

    .line 6
    iput-object p5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIcon:Landroid/graphics/Bitmap;

    .line 7
    iput-object p6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIconUri:Landroid/net/Uri;

    .line 8
    iput-object p7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mExtras:Landroid/os/Bundle;

    .line 9
    iput-object p8, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaUri:Landroid/net/Uri;

    return-void
.end method

.method public static fromMediaDescription(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    new-instance v1, Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 5
    .line 6
    invoke-direct {v1}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getMediaId(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaId(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getTitle(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getSubtitle(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getDescription(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getIconBitmap(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getIconUri(Ljava/lang/Object;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setIconUri(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->getExtras(Ljava/lang/Object;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "android.support.v4.media.description.MEDIA_URI"

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    invoke-static {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->ensureClassLoader(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Landroid/net/Uri;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v4, v0

    .line 70
    :goto_0
    if-eqz v4, :cond_2

    .line 71
    .line 72
    const-string v5, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_1

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    const/4 v7, 0x2

    .line 85
    if-ne v6, v7, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v0, v2

    .line 95
    :goto_1
    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setExtras(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 96
    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1, v4}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompatApi23;->getMediaUri(Ljava/lang/Object;)Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$Builder;

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat$Builder;->build()Landroid/support/v4/media/MediaDescriptionCompat;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object p0, v0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescriptionObj:Ljava/lang/Object;

    .line 116
    .line 117
    :cond_4
    return-object v0
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
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDescription()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescription:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public getIconBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIcon:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getIconUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIconUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getMediaDescription()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescriptionObj:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->newInstance()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaId:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setMediaId(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mTitle:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setTitle(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mSubtitle:Ljava/lang/CharSequence;

    .line 20
    .line 21
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setSubtitle(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescription:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setDescription(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIcon:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setIconBitmap(Ljava/lang/Object;Landroid/graphics/Bitmap;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mIconUri:Landroid/net/Uri;

    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setIconUri(Ljava/lang/Object;Landroid/net/Uri;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mExtras:Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->setExtras(Ljava/lang/Object;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaUri:Landroid/net/Uri;

    .line 45
    .line 46
    invoke-static {v0, v1}, Landroid/support/v4/media/MediaDescriptionCompatApi23$Builder;->setMediaUri(Ljava/lang/Object;Landroid/net/Uri;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Landroid/support/v4/media/MediaDescriptionCompatApi21$Builder;->build(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescriptionObj:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_0
    return-object v0
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
.end method

.method public getMediaId()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaId:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mMediaUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mSubtitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mTitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mTitle:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mSubtitle:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->mDescription:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaDescription()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/support/v4/media/MediaDescriptionCompatApi21;->writeToParcel(Ljava/lang/Object;Landroid/os/Parcel;I)V

    return-void
.end method
