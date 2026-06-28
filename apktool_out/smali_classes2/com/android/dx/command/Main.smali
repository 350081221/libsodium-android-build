.class public Lcom/android/dx/command/Main;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final USAGE_MESSAGE:Ljava/lang/String; = "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message."


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "--"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    const/4 v3, 0x1

    .line 6
    :try_start_0
    array-length v4, p0

    .line 7
    if-ge v2, v4, :cond_7

    .line 8
    .line 9
    aget-object v4, p0, v2

    .line 10
    .line 11
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-nez v5, :cond_a

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v5
    :try_end_0
    .catch Lcom/android/dx/command/UsageException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    :try_start_1
    const-string v5, "--dex"

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->main([Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v5, "--dump"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lcom/android/dx/command/dump/Main;->main([Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string v5, "--annotool"

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lcom/android/dx/command/annotool/Main;->main([Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const-string v5, "--find-usages"

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lcom/android/dx/command/findusages/Main;->main([Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    const-string v5, "--version"

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    invoke-static {}, Lcom/android/dx/command/Main;->version()V

    .line 98
    .line 99
    .line 100
    :goto_1
    move p0, v1

    .line 101
    move v1, v3

    .line 102
    goto :goto_6

    .line 103
    :cond_5
    const-string v5, "--help"

    .line 104
    .line 105
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4
    :try_end_1
    .catch Lcom/android/dx/command/UsageException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    move p0, v3

    .line 112
    move v1, p0

    .line 113
    goto :goto_6

    .line 114
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    move v0, v3

    .line 119
    goto :goto_2

    .line 120
    :catch_0
    move-exception p0

    .line 121
    move v0, v3

    .line 122
    goto :goto_3

    .line 123
    :catch_1
    move v1, v3

    .line 124
    goto :goto_5

    .line 125
    :cond_7
    move p0, v1

    .line 126
    goto :goto_6

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    move v0, v1

    .line 129
    :goto_2
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 130
    .line 131
    const-string v4, "\nUNEXPECTED TOP-LEVEL ERROR:"

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    instance-of v2, p0, Ljava/lang/NoClassDefFoundError;

    .line 140
    .line 141
    if-nez v2, :cond_8

    .line 142
    .line 143
    instance-of p0, p0, Ljava/lang/NoSuchMethodError;

    .line 144
    .line 145
    if-eqz p0, :cond_9

    .line 146
    .line 147
    :cond_8
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 148
    .line 149
    const-string v2, "Note: You may be using an incompatible virtual machine or class library.\n(This program is known to be incompatible with recent releases of GCJ.)"

    .line 150
    .line 151
    invoke-virtual {p0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_9
    const/4 p0, 0x3

    .line 155
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :catch_2
    move-exception p0

    .line 160
    move v0, v1

    .line 161
    :goto_3
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 162
    .line 163
    const-string v4, "\nUNEXPECTED TOP-LEVEL EXCEPTION:"

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    const/4 p0, 0x2

    .line 172
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 173
    .line 174
    .line 175
    :goto_4
    move p0, v1

    .line 176
    move v1, v0

    .line 177
    goto :goto_6

    .line 178
    :catch_3
    :cond_a
    :goto_5
    move p0, v3

    .line 179
    :goto_6
    if-nez v1, :cond_b

    .line 180
    .line 181
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 182
    .line 183
    const-string v0, "error: no command specified"

    .line 184
    .line 185
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move p0, v3

    .line 189
    :cond_b
    if-eqz p0, :cond_c

    .line 190
    .line 191
    invoke-static {}, Lcom/android/dx/command/Main;->usage()V

    .line 192
    .line 193
    .line 194
    invoke-static {v3}, Ljava/lang/System;->exit(I)V

    .line 195
    .line 196
    .line 197
    :cond_c
    return-void
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

.method private static usage()V
    .locals 2

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string/jumbo v1, "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static version()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "dx version 1.16"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

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
.end method

.method private static without([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v1, v0, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    sub-int/2addr v0, p1

    .line 13
    invoke-static {p0, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    return-object v1
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
