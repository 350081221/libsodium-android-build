.class public final Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;",
        "op",
        "Lkotlin/r2;",
        "undo",
        "redo",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,179:1\n218#2,14:180\n218#2,14:194\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n*L\n117#1:180,14\n128#1:194,14\n*E\n"
    }
.end annotation


# direct methods
.method public static final redo(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V
    .locals 5
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v3, v4

    .line 37
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostSelection-d9O1mEE()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostSelection-d9O1mEE()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v1, v2, p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {p1, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$setText(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$notifyIme(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 95
    .line 96
    .line 97
    return-void
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method public static final undo(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V
    .locals 5
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getChangeTracker()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/ChangeTracker;->clearChanges()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getIndex()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPostText()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/2addr v3, v4

    .line 37
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreText()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->replace(IILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreSelection-d9O1mEE()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;->getPreSelection-d9O1mEE()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v1, v2, p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->setSelection(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getSelection-d9O1mEE()J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text2/input/internal/EditingBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Landroidx/compose/foundation/text2/input/internal/EditingBuffer;->getComposition-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {p1, v1, v2, v3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$setText(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0, v0, p1}, Landroidx/compose/foundation/text2/input/TextFieldState;->access$notifyIme(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    .line 95
    .line 96
    .line 97
    return-void
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method
