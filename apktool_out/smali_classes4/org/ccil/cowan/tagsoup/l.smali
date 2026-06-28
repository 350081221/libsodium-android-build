.class public Lorg/ccil/cowan/tagsoup/l;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"

# interfaces
.implements Lorg/ccil/cowan/tagsoup/m;
.implements Lorg/xml/sax/XMLReader;
.implements Lorg/xml/sax/ext/LexicalHandler;


# static fields
.field private static F:Z = true

.field private static G:Z = false

.field private static H:Z = false

.field private static I:Z = true

.field private static J:Z = true

.field private static K:Z = false

.field private static L:Z = true

.field private static M:Z = false

.field private static N:Z = true

.field public static final O:Ljava/lang/String; = "http://xml.org/sax/features/namespaces"

.field public static final P:Ljava/lang/String; = "http://xml.org/sax/features/namespace-prefixes"

.field public static final Q:Ljava/lang/String; = "http://xml.org/sax/features/external-general-entities"

.field public static final R:Ljava/lang/String; = "http://xml.org/sax/features/external-parameter-entities"

.field public static final S:Ljava/lang/String; = "http://xml.org/sax/features/is-standalone"

.field public static final T:Ljava/lang/String; = "http://xml.org/sax/features/lexical-handler/parameter-entities"

.field public static final U:Ljava/lang/String; = "http://xml.org/sax/features/resolve-dtd-uris"

.field public static final V:Ljava/lang/String; = "http://xml.org/sax/features/string-interning"

.field public static final W:Ljava/lang/String; = "http://xml.org/sax/features/use-attributes2"

.field public static final X:Ljava/lang/String; = "http://xml.org/sax/features/use-locator2"

.field public static final Y:Ljava/lang/String; = "http://xml.org/sax/features/use-entity-resolver2"

.field public static final Z:Ljava/lang/String; = "http://xml.org/sax/features/validation"

.field public static final a0:Ljava/lang/String; = "http://xml.org/sax/features/unicode-normalization-checking"

.field public static final b0:Ljava/lang/String; = "http://xml.org/sax/features/xmlns-uris"

.field public static final c0:Ljava/lang/String; = "http://xml.org/sax/features/xml-1.1"

.field public static final d0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons"

.field public static final e0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty"

.field public static final f0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/root-bogons"

.field public static final g0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/default-attributes"

.field public static final h0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/translate-colons"

.field public static final i0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/restart-elements"

.field public static final j0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace"

.field public static final k0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements"

.field public static final l0:Ljava/lang/String; = "http://xml.org/sax/properties/lexical-handler"

.field public static final m0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/properties/scanner"

.field public static final n0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/properties/schema"

.field public static final o0:Ljava/lang/String; = "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector"

.field private static p0:[C

.field private static q0:Ljava/lang/String;


# instance fields
.field private A:Lorg/ccil/cowan/tagsoup/d;

.field private B:Lorg/ccil/cowan/tagsoup/d;

.field private C:I

.field private D:Z

.field private E:[C

.field private a:Lorg/xml/sax/ContentHandler;

.field private b:Lorg/xml/sax/ext/LexicalHandler;

.field private c:Lorg/xml/sax/DTDHandler;

.field private d:Lorg/xml/sax/ErrorHandler;

.field private e:Lorg/xml/sax/EntityResolver;

.field private f:Lorg/ccil/cowan/tagsoup/o;

.field private g:Lorg/ccil/cowan/tagsoup/n;

.field private h:Lorg/ccil/cowan/tagsoup/b;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Ljava/util/HashMap;

.field private s:Lorg/ccil/cowan/tagsoup/d;

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Lorg/ccil/cowan/tagsoup/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/ccil/cowan/tagsoup/l;->p0:[C

    .line 8
    .line 9
    const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-\'()+,./:=?;!*#@$_%"

    .line 10
    .line 11
    sput-object v0, Lorg/ccil/cowan/tagsoup/l;->q0:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :array_0
    .array-data 2
        0x3cs
        0x2fs
        0x3es
    .end array-data
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
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 5
    .line 6
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 7
    .line 8
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->c:Lorg/xml/sax/DTDHandler;

    .line 9
    .line 10
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->d:Lorg/xml/sax/ErrorHandler;

    .line 11
    .line 12
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->e:Lorg/xml/sax/EntityResolver;

    .line 13
    .line 14
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->F:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->i:Z

    .line 17
    .line 18
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->G:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->j:Z

    .line 21
    .line 22
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->H:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->k:Z

    .line 25
    .line 26
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->I:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->l:Z

    .line 29
    .line 30
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->J:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 33
    .line 34
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->K:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->n:Z

    .line 37
    .line 38
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->L:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->o:Z

    .line 41
    .line 42
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->M:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->p:Z

    .line 45
    .line 46
    sget-boolean v0, Lorg/ccil/cowan/tagsoup/l;->N:Z

    .line 47
    .line 48
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->q:Z

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 56
    .line 57
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->F:Z

    .line 58
    .line 59
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "http://xml.org/sax/features/namespaces"

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 69
    .line 70
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    const-string v2, "http://xml.org/sax/features/namespace-prefixes"

    .line 73
    .line 74
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 78
    .line 79
    const-string v2, "http://xml.org/sax/features/external-general-entities"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 85
    .line 86
    const-string v2, "http://xml.org/sax/features/external-parameter-entities"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 92
    .line 93
    const-string v2, "http://xml.org/sax/features/is-standalone"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 99
    .line 100
    const-string v2, "http://xml.org/sax/features/lexical-handler/parameter-entities"

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 106
    .line 107
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    const-string v3, "http://xml.org/sax/features/resolve-dtd-uris"

    .line 110
    .line 111
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 115
    .line 116
    const-string v3, "http://xml.org/sax/features/string-interning"

    .line 117
    .line 118
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 122
    .line 123
    const-string v2, "http://xml.org/sax/features/use-attributes2"

    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 129
    .line 130
    const-string v2, "http://xml.org/sax/features/use-locator2"

    .line 131
    .line 132
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 136
    .line 137
    const-string v2, "http://xml.org/sax/features/use-entity-resolver2"

    .line 138
    .line 139
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 143
    .line 144
    const-string v2, "http://xml.org/sax/features/validation"

    .line 145
    .line 146
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 150
    .line 151
    const-string v2, "http://xml.org/sax/features/xmlns-uris"

    .line 152
    .line 153
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 162
    .line 163
    const-string v2, "http://xml.org/sax/features/xml-1.1"

    .line 164
    .line 165
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 169
    .line 170
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->G:Z

    .line 171
    .line 172
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons"

    .line 177
    .line 178
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 182
    .line 183
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->H:Z

    .line 184
    .line 185
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty"

    .line 190
    .line 191
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 195
    .line 196
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->I:Z

    .line 197
    .line 198
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/root-bogons"

    .line 203
    .line 204
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 208
    .line 209
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->J:Z

    .line 210
    .line 211
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/default-attributes"

    .line 216
    .line 217
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 221
    .line 222
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->K:Z

    .line 223
    .line 224
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/translate-colons"

    .line 229
    .line 230
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 234
    .line 235
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->L:Z

    .line 236
    .line 237
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/restart-elements"

    .line 242
    .line 243
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 247
    .line 248
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->M:Z

    .line 249
    .line 250
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace"

    .line 255
    .line 256
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 260
    .line 261
    sget-boolean v1, Lorg/ccil/cowan/tagsoup/l;->N:Z

    .line 262
    .line 263
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/l;->I(Z)Ljava/lang/Boolean;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements"

    .line 268
    .line 269
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    const/4 v0, 0x0

    .line 273
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 274
    .line 275
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 276
    .line 277
    const/4 v1, 0x0

    .line 278
    iput-boolean v1, p0, Lorg/ccil/cowan/tagsoup/l;->u:Z

    .line 279
    .line 280
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->v:Ljava/lang/String;

    .line 281
    .line 282
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;

    .line 283
    .line 284
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->x:Ljava/lang/String;

    .line 285
    .line 286
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 287
    .line 288
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 289
    .line 290
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 291
    .line 292
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->B:Lorg/ccil/cowan/tagsoup/d;

    .line 293
    .line 294
    iput v1, p0, Lorg/ccil/cowan/tagsoup/l;->C:I

    .line 295
    .line 296
    const/4 v0, 0x1

    .line 297
    iput-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->D:Z

    .line 298
    .line 299
    const/16 v0, 0x7d0

    .line 300
    .line 301
    new-array v0, v0, [C

    .line 302
    .line 303
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->E:[C

    .line 304
    .line 305
    return-void
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
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
.end method

.method private A(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ""

    .line 17
    .line 18
    :goto_0
    return-object p1
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private B(Lorg/ccil/cowan/tagsoup/d;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->k()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->d()V

    .line 18
    .line 19
    .line 20
    iget-boolean v4, p0, Lorg/ccil/cowan/tagsoup/l;->i:Z

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    const-string v1, ""

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    :cond_0
    iget-boolean v4, p0, Lorg/ccil/cowan/tagsoup/l;->D:Z

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    iget-object v4, p0, Lorg/ccil/cowan/tagsoup/l;->x:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    iget-object v4, p0, Lorg/ccil/cowan/tagsoup/l;->e:Lorg/xml/sax/EntityResolver;

    .line 40
    .line 41
    iget-object v5, p0, Lorg/ccil/cowan/tagsoup/l;->v:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v4, v5, v6}, Lorg/xml/sax/EntityResolver;->resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    :catch_0
    :cond_1
    invoke-direct {p0, v3, v2}, Lorg/ccil/cowan/tagsoup/l;->u(Ljava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    iget-object v4, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 55
    .line 56
    invoke-interface {v4, v3, v2}, Lorg/xml/sax/ContentHandler;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->b()Lorg/ccil/cowan/tagsoup/a;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Lorg/xml/sax/Attributes;->getLength()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v5, 0x0

    .line 68
    move v6, v5

    .line 69
    :goto_0
    if-ge v6, v4, :cond_4

    .line 70
    .line 71
    invoke-interface {v3, v6}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-interface {v3, v6}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-direct {p0, v8}, Lorg/ccil/cowan/tagsoup/l;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    invoke-direct {p0, v8, v7}, Lorg/ccil/cowan/tagsoup/l;->u(Ljava/lang/String;Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    iget-object v9, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 90
    .line 91
    invoke-interface {v9, v8, v7}, Lorg/xml/sax/ContentHandler;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    iget-object v3, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 98
    .line 99
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->b()Lorg/ccil/cowan/tagsoup/a;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-interface {v3, v2, v1, v0, v4}, Lorg/xml/sax/ContentHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lorg/ccil/cowan/tagsoup/d;->p(Lorg/ccil/cowan/tagsoup/d;)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 112
    .line 113
    iput-boolean v5, p0, Lorg/ccil/cowan/tagsoup/l;->D:Z

    .line 114
    .line 115
    iget-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->q:Z

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->e()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    and-int/lit8 p1, p1, 0x2

    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 128
    .line 129
    invoke-interface {p1}, Lorg/ccil/cowan/tagsoup/n;->startCDATA()V

    .line 130
    .line 131
    .line 132
    :cond_5
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method private C(Lorg/ccil/cowan/tagsoup/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    :goto_1
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/d;->c(Lorg/ccil/cowan/tagsoup/d;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_2
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_2
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->m()Lorg/ccil/cowan/tagsoup/e;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_8

    .line 25
    .line 26
    :goto_3
    if-nez v0, :cond_3

    .line 27
    .line 28
    return-void

    .line 29
    :cond_3
    :goto_4
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 30
    .line 31
    if-eq v1, v0, :cond_5

    .line 32
    .line 33
    if-eqz v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 42
    .line 43
    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_4
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->E()V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_5
    :goto_5
    if-eqz p1, :cond_7

    .line 59
    .line 60
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "<pcdata>"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_6

    .line 75
    .line 76
    invoke-direct {p0, p1}, Lorg/ccil/cowan/tagsoup/l;->B(Lorg/ccil/cowan/tagsoup/d;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->D(Lorg/ccil/cowan/tagsoup/d;)V

    .line 80
    .line 81
    .line 82
    move-object p1, v0

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    const/4 p1, 0x0

    .line 85
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_8
    new-instance v0, Lorg/ccil/cowan/tagsoup/d;

    .line 89
    .line 90
    iget-boolean v2, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/d;-><init>(Lorg/ccil/cowan/tagsoup/e;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/d;->p(Lorg/ccil/cowan/tagsoup/d;)V

    .line 96
    .line 97
    .line 98
    move-object p1, v0

    .line 99
    goto :goto_0
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method private D(Lorg/ccil/cowan/tagsoup/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lorg/ccil/cowan/tagsoup/d;->c(Lorg/ccil/cowan/tagsoup/d;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/d;->c(Lorg/ccil/cowan/tagsoup/d;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lorg/ccil/cowan/tagsoup/l;->B(Lorg/ccil/cowan/tagsoup/d;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
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
.end method

.method private E()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->z()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lorg/ccil/cowan/tagsoup/l;->o:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->e()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    and-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->a()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lorg/ccil/cowan/tagsoup/d;->p(Lorg/ccil/cowan/tagsoup/d;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 27
    .line 28
    :cond_0
    return-void
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
.end method

.method private F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/ccil/cowan/tagsoup/h;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/h;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lorg/ccil/cowan/tagsoup/g;

    .line 17
    .line 18
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/g;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->h:Lorg/ccil/cowan/tagsoup/b;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Lorg/ccil/cowan/tagsoup/k;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lorg/ccil/cowan/tagsoup/k;-><init>(Lorg/ccil/cowan/tagsoup/l;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->h:Lorg/ccil/cowan/tagsoup/b;

    .line 33
    .line 34
    :cond_2
    new-instance v0, Lorg/ccil/cowan/tagsoup/d;

    .line 35
    .line 36
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 37
    .line 38
    const-string v2, "<root>"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lorg/ccil/cowan/tagsoup/o;->d(Ljava/lang/String;)Lorg/ccil/cowan/tagsoup/e;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-boolean v2, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/d;-><init>(Lorg/ccil/cowan/tagsoup/e;Z)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 50
    .line 51
    new-instance v0, Lorg/ccil/cowan/tagsoup/d;

    .line 52
    .line 53
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 54
    .line 55
    const-string v2, "<pcdata>"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lorg/ccil/cowan/tagsoup/o;->d(Ljava/lang/String;)Lorg/ccil/cowan/tagsoup/e;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-boolean v2, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 62
    .line 63
    invoke-direct {v0, v1, v2}, Lorg/ccil/cowan/tagsoup/d;-><init>(Lorg/ccil/cowan/tagsoup/e;Z)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->B:Lorg/ccil/cowan/tagsoup/d;

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 70
    .line 71
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 72
    .line 73
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->A:Lorg/ccil/cowan/tagsoup/d;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    iput v1, p0, Lorg/ccil/cowan/tagsoup/l;->C:I

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    iput-boolean v1, p0, Lorg/ccil/cowan/tagsoup/l;->D:Z

    .line 82
    .line 83
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;

    .line 84
    .line 85
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->v:Ljava/lang/String;

    .line 86
    .line 87
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->x:Ljava/lang/String;

    .line 88
    .line 89
    return-void
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
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
.end method

.method private static G(Ljava/lang/String;)[Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-array p0, v1, [Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    move v3, v1

    .line 25
    move v4, v3

    .line 26
    move v5, v4

    .line 27
    move v6, v5

    .line 28
    move v7, v6

    .line 29
    :goto_0
    if-ge v3, v2, :cond_6

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    const/16 v9, 0x5c

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    const/16 v10, 0x27

    .line 40
    .line 41
    if-ne v8, v10, :cond_1

    .line 42
    .line 43
    if-eq v6, v9, :cond_1

    .line 44
    .line 45
    xor-int/lit8 v7, v7, 0x1

    .line 46
    .line 47
    if-gez v4, :cond_5

    .line 48
    .line 49
    :goto_1
    move v4, v3

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    if-nez v7, :cond_2

    .line 52
    .line 53
    const/16 v10, 0x22

    .line 54
    .line 55
    if-ne v8, v10, :cond_2

    .line 56
    .line 57
    if-eq v6, v9, :cond_2

    .line 58
    .line 59
    xor-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    if-gez v4, :cond_5

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    if-nez v7, :cond_5

    .line 65
    .line 66
    if-nez v5, :cond_5

    .line 67
    .line 68
    invoke-static {v8}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_4

    .line 73
    .line 74
    if-ltz v4, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_3
    const/4 v4, -0x1

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    if-gez v4, :cond_5

    .line 86
    .line 87
    const/16 v6, 0x20

    .line 88
    .line 89
    if-eq v8, v6, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    move v6, v8

    .line 95
    goto :goto_0

    .line 96
    :cond_6
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    new-array p0, v1, [Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, [Ljava/lang/String;

    .line 110
    .line 111
    return-object p0
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method private static H(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    sub-int/2addr v0, v2

    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne v1, v0, :cond_3

    .line 23
    .line 24
    const/16 v0, 0x27

    .line 25
    .line 26
    if-eq v1, v0, :cond_2

    .line 27
    .line 28
    const/16 v0, 0x22

    .line 29
    .line 30
    if-ne v1, v0, :cond_3

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sub-int/2addr v0, v2

    .line 37
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_3
    return-object p0
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
.end method

.method private static I(Z)Ljava/lang/Boolean;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object p0
.end method

.method private q(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v1, Ljava/lang/StringBuffer;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    move v4, v2

    .line 17
    move v5, v3

    .line 18
    :goto_0
    if-ge v4, v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    sget-object v7, Lorg/ccil/cowan/tagsoup/l;->q0:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v7, v6}, Ljava/lang/String;->indexOf(I)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, -0x1

    .line 31
    if-eq v7, v8, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 34
    .line 35
    .line 36
    move v5, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    if-eqz v5, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/16 v5, 0x20

    .line 42
    .line 43
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    move v5, v3

    .line 47
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
.end method

.method private t(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v6, v2

    .line 10
    move v4, v3

    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-ge v4, v0, :cond_7

    .line 13
    .line 14
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    add-int/lit8 v8, v5, 0x1

    .line 19
    .line 20
    aput-char v7, v1, v5

    .line 21
    .line 22
    const/16 v5, 0x26

    .line 23
    .line 24
    if-ne v7, v5, :cond_0

    .line 25
    .line 26
    if-ne v6, v2, :cond_0

    .line 27
    .line 28
    move v5, v8

    .line 29
    move v6, v5

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    if-ne v6, v2, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static {v7}, Ljava/lang/Character;->isLetter(C)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_6

    .line 39
    .line 40
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_6

    .line 45
    .line 46
    const/16 v5, 0x23

    .line 47
    .line 48
    if-ne v7, v5, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x3b

    .line 52
    .line 53
    if-ne v7, v5, :cond_5

    .line 54
    .line 55
    sub-int v5, v8, v6

    .line 56
    .line 57
    add-int/lit8 v5, v5, -0x1

    .line 58
    .line 59
    invoke-direct {p0, v1, v6, v5}, Lorg/ccil/cowan/tagsoup/l;->x([CII)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const v7, 0xffff

    .line 64
    .line 65
    .line 66
    if-le v5, v7, :cond_3

    .line 67
    .line 68
    const/high16 v7, 0x10000

    .line 69
    .line 70
    sub-int/2addr v5, v7

    .line 71
    add-int/lit8 v7, v6, -0x1

    .line 72
    .line 73
    shr-int/lit8 v8, v5, 0xa

    .line 74
    .line 75
    const v9, 0xd800

    .line 76
    .line 77
    .line 78
    add-int/2addr v8, v9

    .line 79
    int-to-char v8, v8

    .line 80
    aput-char v8, v1, v7

    .line 81
    .line 82
    and-int/lit16 v5, v5, 0x3ff

    .line 83
    .line 84
    const v7, 0xdc00

    .line 85
    .line 86
    .line 87
    add-int/2addr v5, v7

    .line 88
    int-to-char v5, v5

    .line 89
    aput-char v5, v1, v6

    .line 90
    .line 91
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    if-eqz v5, :cond_4

    .line 95
    .line 96
    add-int/lit8 v7, v6, -0x1

    .line 97
    .line 98
    int-to-char v5, v5

    .line 99
    aput-char v5, v1, v7

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    move v6, v8

    .line 103
    :goto_1
    move v5, v6

    .line 104
    move v6, v2

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    move v6, v2

    .line 107
    :cond_6
    :goto_2
    move v5, v8

    .line 108
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_7
    new-instance p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p1, v1, v3, v5}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    return-object p1
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method private u(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/o;->g()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1
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
.end method

.method private v(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/net/URL;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuffer;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "user.dir"

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 15
    .line 16
    .line 17
    const-string v1, "/."

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "file"

    .line 27
    .line 28
    const-string v2, ""

    .line 29
    .line 30
    invoke-direct {p1, v1, v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Ljava/net/URL;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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
.end method

.method private w(Lorg/xml/sax/InputSource;)Ljava/io/Reader;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getCharacterStream()Ljava/io/Reader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getByteStream()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getEncoding()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getPublicId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getSystemId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, v3, p1}, Lorg/ccil/cowan/tagsoup/l;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->h:Lorg/ccil/cowan/tagsoup/b;

    .line 32
    .line 33
    invoke-interface {p1, v1}, Lorg/ccil/cowan/tagsoup/b;->a(Ljava/io/InputStream;)Ljava/io/Reader;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :try_start_0
    new-instance v0, Ljava/io/InputStreamReader;

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    new-instance v0, Ljava/io/InputStreamReader;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-object v0
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private x([CII)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ge p3, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    aget-char v2, p1, p2

    .line 7
    .line 8
    const/16 v3, 0x23

    .line 9
    .line 10
    if-ne v2, v3, :cond_3

    .line 11
    .line 12
    if-le p3, v1, :cond_2

    .line 13
    .line 14
    add-int/lit8 v2, p2, 0x1

    .line 15
    .line 16
    aget-char v2, p1, v2

    .line 17
    .line 18
    const/16 v3, 0x78

    .line 19
    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    const/16 v3, 0x58

    .line 23
    .line 24
    if-ne v2, v3, :cond_2

    .line 25
    .line 26
    :cond_1
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x2

    .line 29
    .line 30
    add-int/lit8 p3, p3, -0x2

    .line 31
    .line 32
    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 33
    .line 34
    .line 35
    const/16 p1, 0x10

    .line 36
    .line 37
    invoke-static {v1, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return p1

    .line 42
    :catch_0
    return v0

    .line 43
    :cond_2
    :try_start_1
    new-instance v2, Ljava/lang/String;

    .line 44
    .line 45
    add-int/2addr p2, v1

    .line 46
    sub-int/2addr p3, v1

    .line 47
    invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xa

    .line 51
    .line 52
    invoke-static {v2, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 53
    .line 54
    .line 55
    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    return p1

    .line 57
    :catch_1
    return v0

    .line 58
    :cond_3
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lorg/ccil/cowan/tagsoup/o;->e(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1
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
.end method

.method private y([CII)Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    add-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    move v4, v1

    .line 11
    move v3, v2

    .line 12
    :goto_0
    add-int/lit8 v5, p3, -0x1

    .line 13
    .line 14
    const/16 v6, 0x3a

    .line 15
    .line 16
    const/16 v7, 0x5f

    .line 17
    .line 18
    if-lez p3, :cond_8

    .line 19
    .line 20
    aget-char p3, p1, p2

    .line 21
    .line 22
    invoke-static {p3}, Ljava/lang/Character;->isLetter(C)Z

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    if-nez v8, :cond_6

    .line 27
    .line 28
    if-ne p3, v7, :cond_0

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_0
    invoke-static {p3}, Ljava/lang/Character;->isDigit(C)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_4

    .line 36
    .line 37
    const/16 v8, 0x2d

    .line 38
    .line 39
    if-eq p3, v8, :cond_4

    .line 40
    .line 41
    const/16 v8, 0x2e

    .line 42
    .line 43
    if-ne p3, v8, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    if-ne p3, v6, :cond_7

    .line 47
    .line 48
    if-nez v4, :cond_7

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-boolean v3, p0, Lorg/ccil/cowan/tagsoup/l;->n:Z

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v7, p3

    .line 61
    :goto_1
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 62
    .line 63
    .line 64
    move v3, v2

    .line 65
    move v4, v3

    .line 66
    goto :goto_5

    .line 67
    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_6
    :goto_3
    invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 77
    .line 78
    .line 79
    :goto_4
    move v3, v1

    .line 80
    :cond_7
    :goto_5
    add-int/lit8 p2, p2, 0x1

    .line 81
    .line 82
    move p3, v5

    .line 83
    goto :goto_0

    .line 84
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_9

    .line 89
    .line 90
    sub-int/2addr p1, v2

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-ne p1, v6, :cond_a

    .line 96
    .line 97
    :cond_9
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 98
    .line 99
    .line 100
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1
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
.end method

.method private z()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 11
    .line 12
    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/d;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 17
    .line 18
    invoke-virtual {v2}, Lorg/ccil/cowan/tagsoup/d;->k()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v4, p0, Lorg/ccil/cowan/tagsoup/l;->i:Z

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    move-object v2, v1

    .line 33
    :cond_1
    iget-object v4, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 34
    .line 35
    invoke-interface {v4, v2, v1, v0}, Lorg/xml/sax/ContentHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v3, v2}, Lorg/ccil/cowan/tagsoup/l;->u(Ljava/lang/String;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 45
    .line 46
    invoke-interface {v0, v3}, Lorg/xml/sax/ContentHandler;->endPrefixMapping(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 50
    .line 51
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->b()Lorg/ccil/cowan/tagsoup/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Lorg/xml/sax/Attributes;->getLength()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/lit8 v1, v1, -0x1

    .line 60
    .line 61
    :goto_0
    if-ltz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v0, v1}, Lorg/xml/sax/Attributes;->getURI(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v0, v1}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-direct {p0, v3}, Lorg/ccil/cowan/tagsoup/l;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-direct {p0, v3, v2}, Lorg/ccil/cowan/tagsoup/l;->u(Ljava/lang/String;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    iget-object v2, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 82
    .line 83
    invoke-interface {v2, v3}, Lorg/xml/sax/ContentHandler;->endPrefixMapping(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 90
    .line 91
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
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
.end method


# virtual methods
.method public a([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->y([CII)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 p2, 0x3a

    .line 11
    .line 12
    const/16 p3, 0x5f

    .line 13
    .line 14
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 19
    .line 20
    return-void
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
.end method

.method public b([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->x([CII)I

    move-result p1

    iput p1, p0, Lorg/ccil/cowan/tagsoup/l;->C:I

    return-void
.end method

.method public c([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/xml/sax/ext/LexicalHandler;->startCDATA()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->g([CII)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 10
    .line 11
    invoke-interface {p1}, Lorg/xml/sax/ext/LexicalHandler;->endCDATA()V

    .line 12
    .line 13
    .line 14
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
.end method

.method public comment([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public d([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p3, 0x0

    .line 11
    invoke-virtual {p1, p2, p3, p2}, Lorg/ccil/cowan/tagsoup/d;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
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
.end method

.method public e([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 20
    .line 21
    iget-object p3, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p2, p3, v0, p1}, Lorg/ccil/cowan/tagsoup/d;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
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
.end method

.method public endCDATA()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public endDTD()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public endEntity(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public f([CII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->y([CII)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lorg/ccil/cowan/tagsoup/o;->d(Ljava/lang/String;)Lorg/ccil/cowan/tagsoup/e;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-nez p2, :cond_6

    .line 20
    .line 21
    iget-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->j:Z

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    iget-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->k:Z

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    const/4 v0, -0x1

    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    move p2, p3

    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move p2, v0

    .line 35
    :goto_0
    iget-boolean v1, p0, Lorg/ccil/cowan/tagsoup/l;->l:Z

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    const v0, 0x7fffffff

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 44
    .line 45
    invoke-virtual {v1, p1, p2, v0, p3}, Lorg/ccil/cowan/tagsoup/o;->b(Ljava/lang/String;III)V

    .line 46
    .line 47
    .line 48
    iget-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->l:Z

    .line 49
    .line 50
    if-nez p2, :cond_5

    .line 51
    .line 52
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 53
    .line 54
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/o;->i()Lorg/ccil/cowan/tagsoup/e;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3}, Lorg/ccil/cowan/tagsoup/e;->h()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p2, p1, p3}, Lorg/ccil/cowan/tagsoup/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Lorg/ccil/cowan/tagsoup/o;->d(Ljava/lang/String;)Lorg/ccil/cowan/tagsoup/e;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :cond_6
    new-instance p1, Lorg/ccil/cowan/tagsoup/d;

    .line 72
    .line 73
    iget-boolean p3, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 74
    .line 75
    invoke-direct {p1, p2, p3}, Lorg/ccil/cowan/tagsoup/d;-><init>(Lorg/ccil/cowan/tagsoup/e;Z)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 79
    .line 80
    return-void
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
.end method

.method public g([CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    move v2, v0

    .line 7
    :goto_0
    if-ge v2, p3, :cond_2

    .line 8
    .line 9
    add-int v3, p2, v2

    .line 10
    .line 11
    aget-char v3, p1, v3

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v1, v0

    .line 20
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 26
    .line 27
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->B:Lorg/ccil/cowan/tagsoup/d;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lorg/ccil/cowan/tagsoup/d;->c(Lorg/ccil/cowan/tagsoup/d;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-boolean v0, p0, Lorg/ccil/cowan/tagsoup/l;->p:Z

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 40
    .line 41
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->ignorableWhitespace([CII)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->B:Lorg/ccil/cowan/tagsoup/d;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->C(Lorg/ccil/cowan/tagsoup/d;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 51
    .line 52
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 53
    .line 54
    .line 55
    :cond_4
    :goto_1
    return-void
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
.end method

.method public getContentHandler()Lorg/xml/sax/ContentHandler;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getDTDHandler()Lorg/xml/sax/DTDHandler;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->c:Lorg/xml/sax/DTDHandler;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getEntityResolver()Lorg/xml/sax/EntityResolver;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->e:Lorg/xml/sax/EntityResolver;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getErrorHandler()Lorg/xml/sax/ErrorHandler;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->d:Lorg/xml/sax/ErrorHandler;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getFeature(Ljava/lang/String;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    new-instance v0, Lorg/xml/sax/SAXNotRecognizedException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuffer;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Unknown feature "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 1
    const-string v0, "http://xml.org/sax/properties/lexical-handler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 10
    .line 11
    if-ne p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :cond_1
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/scanner"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_2
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/schema"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->h:Lorg/ccil/cowan/tagsoup/b;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_4
    new-instance v0, Lorg/xml/sax/SAXNotRecognizedException;

    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuffer;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "Unknown property "

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v0, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/ccil/cowan/tagsoup/l;->C:I

    return v0
.end method

.method public i([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->C(Lorg/ccil/cowan/tagsoup/d;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->r([CII)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public j([CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lorg/ccil/cowan/tagsoup/l;->G(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    array-length p2, p1

    .line 11
    const/4 p3, 0x0

    .line 12
    if-lez p2, :cond_4

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    aget-object p2, p1, p2

    .line 16
    .line 17
    const-string v0, "DOCTYPE"

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_4

    .line 24
    .line 25
    iget-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->u:Z

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/4 p2, 0x1

    .line 31
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->u:Z

    .line 32
    .line 33
    array-length v0, p1

    .line 34
    if-le v0, p2, :cond_4

    .line 35
    .line 36
    aget-object p2, p1, p2

    .line 37
    .line 38
    array-length v0, p1

    .line 39
    const/4 v1, 0x2

    .line 40
    const/4 v2, 0x3

    .line 41
    if-le v0, v2, :cond_1

    .line 42
    .line 43
    const-string v0, "SYSTEM"

    .line 44
    .line 45
    aget-object v3, p1, v1

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    aget-object p1, p1, v2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    array-length v0, p1

    .line 57
    if-le v0, v2, :cond_3

    .line 58
    .line 59
    const-string v0, "PUBLIC"

    .line 60
    .line 61
    aget-object v1, p1, v1

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    aget-object p3, p1, v2

    .line 70
    .line 71
    array-length v0, p1

    .line 72
    const/4 v1, 0x4

    .line 73
    if-le v0, v1, :cond_2

    .line 74
    .line 75
    aget-object p1, p1, v1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-string p1, ""

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move-object p1, p3

    .line 82
    goto :goto_0

    .line 83
    :cond_4
    move-object p1, p3

    .line 84
    move-object p2, p1

    .line 85
    :goto_0
    invoke-static {p3}, Lorg/ccil/cowan/tagsoup/l;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-static {p1}, Lorg/ccil/cowan/tagsoup/l;->H(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    invoke-direct {p0, p3}, Lorg/ccil/cowan/tagsoup/l;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 100
    .line 101
    invoke-interface {v0, p2, p3, p1}, Lorg/xml/sax/ext/LexicalHandler;->startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 105
    .line 106
    invoke-interface {v0}, Lorg/xml/sax/ext/LexicalHandler;->endDTD()V

    .line 107
    .line 108
    .line 109
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->x:Ljava/lang/String;

    .line 110
    .line 111
    iput-object p3, p0, Lorg/ccil/cowan/tagsoup/l;->v:Ljava/lang/String;

    .line 112
    .line 113
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 114
    .line 115
    instance-of p3, p2, Lorg/xml/sax/Locator;

    .line 116
    .line 117
    if-eqz p3, :cond_5

    .line 118
    .line 119
    check-cast p2, Lorg/xml/sax/Locator;

    .line 120
    .line 121
    invoke-interface {p2}, Lorg/xml/sax/Locator;->getSystemId()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;

    .line 126
    .line 127
    :try_start_0
    new-instance p2, Ljava/net/URL;

    .line 128
    .line 129
    new-instance p3, Ljava/net/URL;

    .line 130
    .line 131
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p2, p3, p1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->w:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    :catch_0
    :cond_5
    return-void
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
.end method

.method public k([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-boolean p1, p0, Lorg/ccil/cowan/tagsoup/l;->D:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->B:Lorg/ccil/cowan/tagsoup/d;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lorg/ccil/cowan/tagsoup/l;->C(Lorg/ccil/cowan/tagsoup/d;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 11
    .line 12
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->z()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 23
    .line 24
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/o;->g()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p2, ""

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 37
    .line 38
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 39
    .line 40
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/o;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p1, p2}, Lorg/xml/sax/ContentHandler;->endPrefixMapping(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 48
    .line 49
    invoke-interface {p1}, Lorg/xml/sax/ContentHandler;->endDocument()V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method public l([CII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "xml"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    if-lez p3, :cond_2

    .line 20
    .line 21
    add-int/lit8 v0, p3, -0x1

    .line 22
    .line 23
    aget-char v0, p1, v0

    .line 24
    .line 25
    const/16 v1, 0x3f

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    add-int/lit8 p3, p3, -0x1

    .line 30
    .line 31
    :cond_2
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 32
    .line 33
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/ContentHandler;->processingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->y:Ljava/lang/String;

    .line 45
    .line 46
    :cond_3
    :goto_0
    return-void
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
.end method

.method public m([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->s([CII)Z

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
    invoke-virtual {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->r([CII)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public n([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ext/LexicalHandler;->comment([CII)V

    return-void
.end method

.method public o([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->y([CII)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->t:Ljava/lang/String;

    .line 15
    .line 16
    return-void
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
.end method

.method public p([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->C(Lorg/ccil/cowan/tagsoup/d;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->i()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->r([CII)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
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
.end method

.method public parse(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 10
    new-instance v0, Lorg/xml/sax/InputSource;

    invoke-direct {v0, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->parse(Lorg/xml/sax/InputSource;)V

    return-void
.end method

.method public parse(Lorg/xml/sax/InputSource;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->F()V

    .line 2
    invoke-direct {p0, p1}, Lorg/ccil/cowan/tagsoup/l;->w(Lorg/xml/sax/InputSource;)Ljava/io/Reader;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    invoke-interface {v1}, Lorg/xml/sax/ContentHandler;->startDocument()V

    .line 4
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getPublicId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lorg/xml/sax/InputSource;->getSystemId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lorg/ccil/cowan/tagsoup/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    instance-of v1, p1, Lorg/xml/sax/Locator;

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    check-cast p1, Lorg/xml/sax/Locator;

    invoke-interface {v1, p1}, Lorg/xml/sax/ContentHandler;->setDocumentLocator(Lorg/xml/sax/Locator;)V

    .line 7
    :cond_0
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/o;->g()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 8
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/o;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    invoke-virtual {v2}, Lorg/ccil/cowan/tagsoup/o;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Lorg/xml/sax/ContentHandler;->startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    :cond_1
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    invoke-interface {p1, v0, p0}, Lorg/ccil/cowan/tagsoup/n;->a(Ljava/io/Reader;Lorg/ccil/cowan/tagsoup/m;)V

    return-void
.end method

.method public r([CII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->s:Lorg/ccil/cowan/tagsoup/d;

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/ccil/cowan/tagsoup/l;->y([CII)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lorg/ccil/cowan/tagsoup/o;->d(Ljava/lang/String;)Lorg/ccil/cowan/tagsoup/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/e;->h()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 25
    .line 26
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    iget-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    :goto_1
    if-eqz p2, :cond_4

    .line 34
    .line 35
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->e()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    and-int/lit8 v1, v1, 0x4

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    const/4 p3, 0x1

    .line 55
    :cond_3
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    :goto_2
    if-nez p2, :cond_5

    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_a

    .line 68
    .line 69
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->l()Lorg/ccil/cowan/tagsoup/d;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_6

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    if-eqz p3, :cond_7

    .line 81
    .line 82
    invoke-virtual {p2}, Lorg/ccil/cowan/tagsoup/d;->n()V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    :goto_3
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 87
    .line 88
    if-eq p1, p2, :cond_8

    .line 89
    .line 90
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->E()V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_8
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->z()V

    .line 95
    .line 96
    .line 97
    :goto_4
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 98
    .line 99
    invoke-virtual {p1}, Lorg/ccil/cowan/tagsoup/d;->f()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_9

    .line 104
    .line 105
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/l;->z()V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_9
    invoke-direct {p0, v0}, Lorg/ccil/cowan/tagsoup/l;->D(Lorg/ccil/cowan/tagsoup/d;)V

    .line 110
    .line 111
    .line 112
    :cond_a
    :goto_5
    return-void
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
.end method

.method public s([CII)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/ccil/cowan/tagsoup/d;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lorg/ccil/cowan/tagsoup/l;->q:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/l;->z:Lorg/ccil/cowan/tagsoup/d;

    .line 13
    .line 14
    invoke-virtual {v1}, Lorg/ccil/cowan/tagsoup/d;->e()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x2

    .line 19
    and-int/2addr v1, v3

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v4, 0x1

    .line 27
    if-ne p3, v1, :cond_0

    .line 28
    .line 29
    move v1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v2

    .line 32
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    move v5, v2

    .line 35
    :goto_1
    if-ge v5, p3, :cond_2

    .line 36
    .line 37
    add-int v6, p2, v5

    .line 38
    .line 39
    aget-char v6, p1, v6

    .line 40
    .line 41
    invoke-static {v6}, Ljava/lang/Character;->toLowerCase(C)C

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-static {v7}, Ljava/lang/Character;->toLowerCase(C)C

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eq v6, v7, :cond_1

    .line 54
    .line 55
    move v1, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_2
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 63
    .line 64
    sget-object v1, Lorg/ccil/cowan/tagsoup/l;->p0:[C

    .line 65
    .line 66
    invoke-interface {v0, v1, v2, v3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 70
    .line 71
    invoke-interface {v0, p1, p2, p3}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    .line 75
    .line 76
    sget-object p2, Lorg/ccil/cowan/tagsoup/l;->p0:[C

    .line 77
    .line 78
    invoke-interface {p1, p2, v3, v4}, Lorg/xml/sax/ContentHandler;->characters([CII)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 82
    .line 83
    invoke-interface {p1}, Lorg/ccil/cowan/tagsoup/n;->startCDATA()V

    .line 84
    .line 85
    .line 86
    return v4

    .line 87
    :cond_3
    return v2
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
.end method

.method public setContentHandler(Lorg/xml/sax/ContentHandler;)V
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->a:Lorg/xml/sax/ContentHandler;

    return-void
.end method

.method public setDTDHandler(Lorg/xml/sax/DTDHandler;)V
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->c:Lorg/xml/sax/DTDHandler;

    return-void
.end method

.method public setEntityResolver(Lorg/xml/sax/EntityResolver;)V
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->e:Lorg/xml/sax/EntityResolver;

    return-void
.end method

.method public setErrorHandler(Lorg/xml/sax/ErrorHandler;)V
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/l;->d:Lorg/xml/sax/ErrorHandler;

    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/l;->r:Ljava/util/HashMap;

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :goto_0
    const-string v0, "http://xml.org/sax/features/namespaces"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->i:Z

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->j:Z

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->k:Z

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/root-bogons"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->l:Z

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/default-attributes"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->m:Z

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/translate-colons"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->n:Z

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_6
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/restart-elements"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->o:Z

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_7
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace"

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->p:Z

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_8
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements"

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iput-boolean p2, p0, Lorg/ccil/cowan/tagsoup/l;->q:Z

    .line 125
    .line 126
    :cond_9
    :goto_1
    return-void

    .line 127
    :cond_a
    new-instance p2, Lorg/xml/sax/SAXNotRecognizedException;

    .line 128
    .line 129
    new-instance v0, Ljava/lang/StringBuffer;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v1, "Unknown feature "

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {p2, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p2
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
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
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 1
    const-string v0, "http://xml.org/sax/properties/lexical-handler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iput-object p0, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of p1, p2, Lorg/xml/sax/ext/LexicalHandler;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    check-cast p2, Lorg/xml/sax/ext/LexicalHandler;

    .line 19
    .line 20
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->b:Lorg/xml/sax/ext/LexicalHandler;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    .line 24
    .line 25
    const-string p2, "Your lexical handler is not a LexicalHandler"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_2
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/scanner"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    instance-of p1, p2, Lorg/ccil/cowan/tagsoup/n;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    check-cast p2, Lorg/ccil/cowan/tagsoup/n;

    .line 44
    .line 45
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->g:Lorg/ccil/cowan/tagsoup/n;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    .line 49
    .line 50
    const-string p2, "Your scanner is not a Scanner"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_4
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/schema"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_6

    .line 63
    .line 64
    instance-of p1, p2, Lorg/ccil/cowan/tagsoup/o;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    check-cast p2, Lorg/ccil/cowan/tagsoup/o;

    .line 69
    .line 70
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->f:Lorg/ccil/cowan/tagsoup/o;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    .line 74
    .line 75
    const-string p2, "Your schema is not a Schema"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_6
    const-string v0, "http://www.ccil.org/~cowan/tagsoup/properties/auto-detector"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_8

    .line 88
    .line 89
    instance-of p1, p2, Lorg/ccil/cowan/tagsoup/b;

    .line 90
    .line 91
    if-eqz p1, :cond_7

    .line 92
    .line 93
    check-cast p2, Lorg/ccil/cowan/tagsoup/b;

    .line 94
    .line 95
    iput-object p2, p0, Lorg/ccil/cowan/tagsoup/l;->h:Lorg/ccil/cowan/tagsoup/b;

    .line 96
    .line 97
    :goto_0
    return-void

    .line 98
    :cond_7
    new-instance p1, Lorg/xml/sax/SAXNotSupportedException;

    .line 99
    .line 100
    const-string p2, "Your auto-detector is not an AutoDetector"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Lorg/xml/sax/SAXNotSupportedException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_8
    new-instance p2, Lorg/xml/sax/SAXNotRecognizedException;

    .line 107
    .line 108
    new-instance v0, Ljava/lang/StringBuffer;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v1, "Unknown property "

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p2, p1}, Lorg/xml/sax/SAXNotRecognizedException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
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
.end method

.method public startCDATA()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public startEntity(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method
