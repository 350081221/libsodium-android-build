.class public Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;,
        Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api34Impl;,
        Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api23Impl;
    }
.end annotation


# static fields
.field private static final KEY_VIEW_TREE_APPEARED:Ljava/lang/String; = "TREAT_AS_VIEW_TREE_APPEARED"

.field private static final KEY_VIEW_TREE_APPEARING:Ljava/lang/String; = "TREAT_AS_VIEW_TREE_APPEARING"


# instance fields
.field private final mView:Landroid/view/View;

.field private final mWrappedObj:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/contentcapture/ContentCaptureSession;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 7
    .line 8
    return-void
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
.end method

.method public static toContentCaptureSessionCompat(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;
    .locals 1
    .param p0    # Landroid/view/contentcapture/ContentCaptureSession;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    new-instance v0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;-><init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public newAutofillId(J)Landroid/view/autofill/AutofillId;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/core/view/ViewCompat;->getAutofillId(Landroid/view/View;)Landroidx/core/view/autofill/AutofillIdCompat;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/core/view/autofill/AutofillIdCompat;->toAutofillId()Landroid/view/autofill/AutofillId;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1, p1, p2}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newAutofillId(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return-object p1
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

.method public newVirtualViewStructure(Landroid/view/autofill/AutofillId;J)Landroidx/core/view/ViewStructureCompat;
    .locals 2
    .param p1    # Landroid/view/autofill/AutofillId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    invoke-static {v0, p1, p2, p3}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newVirtualViewStructure(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Landroidx/core/view/ViewStructureCompat;->toViewStructureCompat(Landroid/view/ViewStructure;)Landroidx/core/view/ViewStructureCompat;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
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
.end method

.method public notifyViewTextChanged(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V
    .locals 2
    .param p1    # Landroid/view/autofill/AutofillId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewTextChanged(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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
.end method

.method public notifyViewsAppeared(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/ViewStructure;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    invoke-static {v0, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api34Impl;->notifyViewsAppeared(Landroid/view/contentcapture/ContentCaptureSession;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/16 v1, 0x1d

    .line 16
    .line 17
    if-lt v0, v1, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newViewStructure(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api23Impl;->getExtras(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "TREAT_AS_VIEW_TREE_APPEARING"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 42
    .line 43
    invoke-static {v1, v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewAppeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ge v0, v1, :cond_1

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Landroid/view/ViewStructure;

    .line 62
    .line 63
    invoke-static {v1, v2}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewAppeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 72
    .line 73
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 74
    .line 75
    invoke-static {p1, v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newViewStructure(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api23Impl;->getExtras(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "TREAT_AS_VIEW_TREE_APPEARED"

    .line 84
    .line 85
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 91
    .line 92
    invoke-static {v0, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewAppeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    :goto_1
    return-void
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

.method public notifyViewsDisappeared([J)V
    .locals 4
    .param p1    # [J
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/core/view/ViewCompat;->getAutofillId(Landroid/view/View;)Landroidx/core/view/autofill/AutofillIdCompat;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/core/view/autofill/AutofillIdCompat;->toAutofillId()Landroid/view/autofill/AutofillId;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewsDisappeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v1, 0x1d

    .line 29
    .line 30
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 37
    .line 38
    invoke-static {v0, v1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newViewStructure(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api23Impl;->getExtras(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "TREAT_AS_VIEW_TREE_APPEARING"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 55
    .line 56
    invoke-static {v1, v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewAppeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 64
    .line 65
    invoke-static {v1}, Landroidx/core/view/ViewCompat;->getAutofillId(Landroid/view/View;)Landroidx/core/view/autofill/AutofillIdCompat;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/core/view/autofill/AutofillIdCompat;->toAutofillId()Landroid/view/autofill/AutofillId;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v0, v1, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewsDisappeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Landroid/view/contentcapture/ContentCaptureSession;

    .line 82
    .line 83
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mView:Landroid/view/View;

    .line 84
    .line 85
    invoke-static {p1, v0}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->newViewStructure(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api23Impl;->getExtras(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "TREAT_AS_VIEW_TREE_APPEARED"

    .line 94
    .line 95
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    .line 101
    .line 102
    invoke-static {v0, p1}, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat$Api29Impl;->notifyViewAppeared(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_0
    return-void
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

.method public toContentCaptureSession()Landroid/view/contentcapture/ContentCaptureSession;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    iget-object v0, p0, Landroidx/core/view/contentcapture/ContentCaptureSessionCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    return-object v0
.end method
