.class public Lcom/lody/virtual/helper/compat/ParcelCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final VAL_BOOLEAN:I = 0x9

.field private static final VAL_BOOLEANARRAY:I = 0x17

.field private static final VAL_BUNDLE:I = 0x3

.field private static final VAL_BYTE:I = 0x14

.field private static final VAL_BYTEARRAY:I = 0xd

.field private static final VAL_CHARSEQUENCE:I = 0xa

.field private static final VAL_CHARSEQUENCEARRAY:I = 0x18

.field private static final VAL_DOUBLE:I = 0x8

.field private static final VAL_DOUBLEARRAY:I = 0x1c

.field private static final VAL_FLOAT:I = 0x7

.field private static final VAL_IBINDER:I = 0xf

.field private static final VAL_INTARRAY:I = 0x12

.field private static final VAL_INTEGER:I = 0x1

.field private static final VAL_LIST:I = 0xb

.field private static final VAL_LONG:I = 0x6

.field private static final VAL_LONGARRAY:I = 0x13

.field private static final VAL_MAP:I = 0x2

.field private static final VAL_NULL:I = -0x1

.field private static final VAL_OBJECTARRAY:I = 0x11

.field private static final VAL_PARCELABLE:I = 0x4

.field private static final VAL_PARCELABLEARRAY:I = 0x10

.field private static final VAL_PERSISTABLEBUNDLE:I = 0x19

.field private static final VAL_SERIALIZABLE:I = 0x15

.field private static final VAL_SHORT:I = 0x5

.field private static final VAL_SIZE:I = 0x1a

.field private static final VAL_SIZEF:I = 0x1b

.field private static final VAL_SPARSEARRAY:I = 0xc

.field private static final VAL_SPARSEBOOLEANARRAY:I = 0x16

.field private static final VAL_STRING:I = 0x0

.field private static final VAL_STRINGARRAY:I = 0xe


# instance fields
.field private final parcel:Landroid/os/Parcel;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

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
    .line 25
    .line 26
    .line 27
.end method

.method private readSparseArrayInternal(Landroid/util/SparseArray;ILjava/lang/ClassLoader;)V
    .locals 2
    .param p1    # Landroid/util/SparseArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    :goto_0
    if-lez p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, p3}, Lcom/lody/virtual/helper/compat/ParcelCompat;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 p2, p2, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
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
.end method


# virtual methods
.method public final readSparseArray(Ljava/lang/ClassLoader;)Landroid/util/SparseArray;
    .locals 2
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Landroid/util/SparseArray<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v1, v0, p1}, Lcom/lody/virtual/helper/compat/ParcelCompat;->readSparseArrayInternal(Landroid/util/SparseArray;ILjava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    return-object v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/lit8 p1, p1, -0x4

    .line 17
    .line 18
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "Parcel "

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, ": Unmarshalling unknown type code "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, " at offset "

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :pswitch_1
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->createDoubleArray()[D

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :pswitch_2
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readSizeF()Landroid/util/SizeF;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :pswitch_3
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readSize()Landroid/util/Size;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_4
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readPersistableBundle(Ljava/lang/ClassLoader;)Landroid/os/PersistableBundle;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_5
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->createBooleanArray()[Z

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :pswitch_6
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readSparseBooleanArray()Landroid/util/SparseBooleanArray;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_7
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :pswitch_8
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :pswitch_9
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->createLongArray()[J

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :pswitch_a
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_b
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 132
    .line 133
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readArray(Ljava/lang/ClassLoader;)[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :pswitch_c
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    :pswitch_d
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_e
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    :pswitch_f
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/compat/ParcelCompat;->readSparseArray(Ljava/lang/ClassLoader;)Landroid/util/SparseArray;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :pswitch_10
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 165
    .line 166
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :pswitch_11
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 172
    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    const/4 v0, 0x1

    .line 178
    if-ne p1, v0, :cond_0

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_0
    const/4 v0, 0x0

    .line 182
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    :pswitch_12
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    .line 190
    .line 191
    .line 192
    move-result-wide v0

    .line 193
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :pswitch_13
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1

    .line 209
    :pswitch_14
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 212
    .line 213
    .line 214
    move-result-wide v0

    .line 215
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1

    .line 220
    :pswitch_15
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 221
    .line 222
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    int-to-short p1, p1

    .line 227
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    return-object p1

    .line 232
    :pswitch_16
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 233
    .line 234
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    return-object p1

    .line 239
    :pswitch_17
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 240
    .line 241
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    return-object p1

    .line 246
    :pswitch_18
    iget-object v0, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 247
    .line 248
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    return-object p1

    .line 253
    :pswitch_19
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    return-object p1

    .line 264
    :pswitch_1a
    iget-object p1, p0, Lcom/lody/virtual/helper/compat/ParcelCompat;->parcel:Landroid/os/Parcel;

    .line 265
    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    return-object p1

    .line 271
    :pswitch_1b
    const/4 p1, 0x0

    .line 272
    return-object p1

    .line 273
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
