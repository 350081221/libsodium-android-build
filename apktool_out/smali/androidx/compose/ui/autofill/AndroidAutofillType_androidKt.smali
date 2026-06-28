.class public final Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\"2\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0083\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00028@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "androidAutofillTypes",
        "Ljava/util/HashMap;",
        "Landroidx/compose/ui/autofill/AutofillType;",
        "",
        "Lkotlin/collections/HashMap;",
        "getAndroidAutofillTypes$annotations",
        "()V",
        "androidType",
        "getAndroidType$annotations",
        "(Landroidx/compose/ui/autofill/AutofillType;)V",
        "getAndroidType",
        "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"
    }
.end annotation


# static fields
.field private static final androidAutofillTypes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/compose/ui/autofill/AutofillType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [Lkotlin/u0;

    .line 4
    .line 5
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->EmailAddress:Landroidx/compose/ui/autofill/AutofillType;

    .line 6
    .line 7
    const-string v2, "emailAddress"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v1, v0, v2

    .line 15
    .line 16
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->Username:Landroidx/compose/ui/autofill/AutofillType;

    .line 17
    .line 18
    const-string/jumbo v2, "username"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    aput-object v1, v0, v2

    .line 27
    .line 28
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->Password:Landroidx/compose/ui/autofill/AutofillType;

    .line 29
    .line 30
    const-string v2, "password"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x2

    .line 37
    aput-object v1, v0, v2

    .line 38
    .line 39
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->NewUsername:Landroidx/compose/ui/autofill/AutofillType;

    .line 40
    .line 41
    const-string v2, "newUsername"

    .line 42
    .line 43
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x3

    .line 48
    aput-object v1, v0, v2

    .line 49
    .line 50
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->NewPassword:Landroidx/compose/ui/autofill/AutofillType;

    .line 51
    .line 52
    const-string v2, "newPassword"

    .line 53
    .line 54
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x4

    .line 59
    aput-object v1, v0, v2

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PostalAddress:Landroidx/compose/ui/autofill/AutofillType;

    .line 62
    .line 63
    const-string v2, "postalAddress"

    .line 64
    .line 65
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v2, 0x5

    .line 70
    aput-object v1, v0, v2

    .line 71
    .line 72
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PostalCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 73
    .line 74
    const-string v2, "postalCode"

    .line 75
    .line 76
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v2, 0x6

    .line 81
    aput-object v1, v0, v2

    .line 82
    .line 83
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardNumber:Landroidx/compose/ui/autofill/AutofillType;

    .line 84
    .line 85
    const-string v2, "creditCardNumber"

    .line 86
    .line 87
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const/4 v2, 0x7

    .line 92
    aput-object v1, v0, v2

    .line 93
    .line 94
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardSecurityCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 95
    .line 96
    const-string v2, "creditCardSecurityCode"

    .line 97
    .line 98
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/16 v2, 0x8

    .line 103
    .line 104
    aput-object v1, v0, v2

    .line 105
    .line 106
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationDate:Landroidx/compose/ui/autofill/AutofillType;

    .line 107
    .line 108
    const-string v2, "creditCardExpirationDate"

    .line 109
    .line 110
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const/16 v2, 0x9

    .line 115
    .line 116
    aput-object v1, v0, v2

    .line 117
    .line 118
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationMonth:Landroidx/compose/ui/autofill/AutofillType;

    .line 119
    .line 120
    const-string v2, "creditCardExpirationMonth"

    .line 121
    .line 122
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const/16 v2, 0xa

    .line 127
    .line 128
    aput-object v1, v0, v2

    .line 129
    .line 130
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationYear:Landroidx/compose/ui/autofill/AutofillType;

    .line 131
    .line 132
    const-string v2, "creditCardExpirationYear"

    .line 133
    .line 134
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const/16 v2, 0xb

    .line 139
    .line 140
    aput-object v1, v0, v2

    .line 141
    .line 142
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationDay:Landroidx/compose/ui/autofill/AutofillType;

    .line 143
    .line 144
    const-string v2, "creditCardExpirationDay"

    .line 145
    .line 146
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const/16 v2, 0xc

    .line 151
    .line 152
    aput-object v1, v0, v2

    .line 153
    .line 154
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->AddressCountry:Landroidx/compose/ui/autofill/AutofillType;

    .line 155
    .line 156
    const-string v2, "addressCountry"

    .line 157
    .line 158
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const/16 v2, 0xd

    .line 163
    .line 164
    aput-object v1, v0, v2

    .line 165
    .line 166
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->AddressRegion:Landroidx/compose/ui/autofill/AutofillType;

    .line 167
    .line 168
    const-string v2, "addressRegion"

    .line 169
    .line 170
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const/16 v2, 0xe

    .line 175
    .line 176
    aput-object v1, v0, v2

    .line 177
    .line 178
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->AddressLocality:Landroidx/compose/ui/autofill/AutofillType;

    .line 179
    .line 180
    const-string v2, "addressLocality"

    .line 181
    .line 182
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const/16 v2, 0xf

    .line 187
    .line 188
    aput-object v1, v0, v2

    .line 189
    .line 190
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->AddressStreet:Landroidx/compose/ui/autofill/AutofillType;

    .line 191
    .line 192
    const-string v2, "streetAddress"

    .line 193
    .line 194
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const/16 v2, 0x10

    .line 199
    .line 200
    aput-object v1, v0, v2

    .line 201
    .line 202
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->AddressAuxiliaryDetails:Landroidx/compose/ui/autofill/AutofillType;

    .line 203
    .line 204
    const-string v2, "extendedAddress"

    .line 205
    .line 206
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const/16 v2, 0x11

    .line 211
    .line 212
    aput-object v1, v0, v2

    .line 213
    .line 214
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PostalCodeExtended:Landroidx/compose/ui/autofill/AutofillType;

    .line 215
    .line 216
    const-string v2, "extendedPostalCode"

    .line 217
    .line 218
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const/16 v2, 0x12

    .line 223
    .line 224
    aput-object v1, v0, v2

    .line 225
    .line 226
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonFullName:Landroidx/compose/ui/autofill/AutofillType;

    .line 227
    .line 228
    const-string v2, "personName"

    .line 229
    .line 230
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    const/16 v2, 0x13

    .line 235
    .line 236
    aput-object v1, v0, v2

    .line 237
    .line 238
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonFirstName:Landroidx/compose/ui/autofill/AutofillType;

    .line 239
    .line 240
    const-string v2, "personGivenName"

    .line 241
    .line 242
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    const/16 v2, 0x14

    .line 247
    .line 248
    aput-object v1, v0, v2

    .line 249
    .line 250
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonLastName:Landroidx/compose/ui/autofill/AutofillType;

    .line 251
    .line 252
    const-string v2, "personFamilyName"

    .line 253
    .line 254
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    const/16 v2, 0x15

    .line 259
    .line 260
    aput-object v1, v0, v2

    .line 261
    .line 262
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonMiddleName:Landroidx/compose/ui/autofill/AutofillType;

    .line 263
    .line 264
    const-string v2, "personMiddleName"

    .line 265
    .line 266
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const/16 v2, 0x16

    .line 271
    .line 272
    aput-object v1, v0, v2

    .line 273
    .line 274
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonMiddleInitial:Landroidx/compose/ui/autofill/AutofillType;

    .line 275
    .line 276
    const-string v2, "personMiddleInitial"

    .line 277
    .line 278
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    const/16 v2, 0x17

    .line 283
    .line 284
    aput-object v1, v0, v2

    .line 285
    .line 286
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonNamePrefix:Landroidx/compose/ui/autofill/AutofillType;

    .line 287
    .line 288
    const-string v2, "personNamePrefix"

    .line 289
    .line 290
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    const/16 v2, 0x18

    .line 295
    .line 296
    aput-object v1, v0, v2

    .line 297
    .line 298
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PersonNameSuffix:Landroidx/compose/ui/autofill/AutofillType;

    .line 299
    .line 300
    const-string v2, "personNameSuffix"

    .line 301
    .line 302
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    const/16 v2, 0x19

    .line 307
    .line 308
    aput-object v1, v0, v2

    .line 309
    .line 310
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumber:Landroidx/compose/ui/autofill/AutofillType;

    .line 311
    .line 312
    const-string v2, "phoneNumber"

    .line 313
    .line 314
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    const/16 v2, 0x1a

    .line 319
    .line 320
    aput-object v1, v0, v2

    .line 321
    .line 322
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumberDevice:Landroidx/compose/ui/autofill/AutofillType;

    .line 323
    .line 324
    const-string v2, "phoneNumberDevice"

    .line 325
    .line 326
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    const/16 v2, 0x1b

    .line 331
    .line 332
    aput-object v1, v0, v2

    .line 333
    .line 334
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PhoneCountryCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 335
    .line 336
    const-string v2, "phoneCountryCode"

    .line 337
    .line 338
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    const/16 v2, 0x1c

    .line 343
    .line 344
    aput-object v1, v0, v2

    .line 345
    .line 346
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumberNational:Landroidx/compose/ui/autofill/AutofillType;

    .line 347
    .line 348
    const-string v2, "phoneNational"

    .line 349
    .line 350
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const/16 v2, 0x1d

    .line 355
    .line 356
    aput-object v1, v0, v2

    .line 357
    .line 358
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->Gender:Landroidx/compose/ui/autofill/AutofillType;

    .line 359
    .line 360
    const-string v2, "gender"

    .line 361
    .line 362
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const/16 v2, 0x1e

    .line 367
    .line 368
    aput-object v1, v0, v2

    .line 369
    .line 370
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->BirthDateFull:Landroidx/compose/ui/autofill/AutofillType;

    .line 371
    .line 372
    const-string v2, "birthDateFull"

    .line 373
    .line 374
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    const/16 v2, 0x1f

    .line 379
    .line 380
    aput-object v1, v0, v2

    .line 381
    .line 382
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->BirthDateDay:Landroidx/compose/ui/autofill/AutofillType;

    .line 383
    .line 384
    const-string v2, "birthDateDay"

    .line 385
    .line 386
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    const/16 v2, 0x20

    .line 391
    .line 392
    aput-object v1, v0, v2

    .line 393
    .line 394
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->BirthDateMonth:Landroidx/compose/ui/autofill/AutofillType;

    .line 395
    .line 396
    const-string v2, "birthDateMonth"

    .line 397
    .line 398
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const/16 v2, 0x21

    .line 403
    .line 404
    aput-object v1, v0, v2

    .line 405
    .line 406
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->BirthDateYear:Landroidx/compose/ui/autofill/AutofillType;

    .line 407
    .line 408
    const-string v2, "birthDateYear"

    .line 409
    .line 410
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const/16 v2, 0x22

    .line 415
    .line 416
    aput-object v1, v0, v2

    .line 417
    .line 418
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->SmsOtpCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 419
    .line 420
    const-string v2, "smsOTPCode"

    .line 421
    .line 422
    invoke-static {v1, v2}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    const/16 v2, 0x23

    .line 427
    .line 428
    aput-object v1, v0, v2

    .line 429
    .line 430
    invoke-static {v0}, Lkotlin/collections/x0;->M([Lkotlin/u0;)Ljava/util/HashMap;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    sput-object v0, Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;->androidAutofillTypes:Ljava/util/HashMap;

    .line 435
    .line 436
    return-void
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private static synthetic getAndroidAutofillTypes$annotations()V
    .locals 0
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    return-void
.end method

.method public static final getAndroidType(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;
    .locals 1
    .param p0    # Landroidx/compose/ui/autofill/AutofillType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;->androidAutofillTypes:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Unsupported autofill type"

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic getAndroidType$annotations(Landroidx/compose/ui/autofill/AutofillType;)V
    .locals 0
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    return-void
.end method
